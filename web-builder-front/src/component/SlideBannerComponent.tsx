// @ts-ignore
import React, { useState, useEffect } from 'react';
import './SlideBanner.css';

interface SlideBannerComponentProps {
    elements: Array<{
        id: number;
        elementType: string;
        sort: number;
        name: string;
        value: {
            imageUrl: string;
            h1?: { h1: string };
            h2?: { h2: string };
            h3?: { h3: string };
            shortTexts?: Array<{ shortText: string }>;
        };
    }>;
}

const SlideBannerComponent: React.FC<SlideBannerComponentProps> = ({ elements }) => {
    const [currentIndex, setCurrentIndex] = useState(0);

    useEffect(() => {
        const interval = setInterval(() => {
            setCurrentIndex((prevIndex) => (prevIndex + 1) % elements.length);
        }, 5000); // 5초마다 이미지 변경

        return () => clearInterval(interval); // 컴포넌트 언마운트 시 interval 정리
    }, [elements.length]);

    return (
        <div className="slide-banner">
            {elements.map((element, index) => (
                <div
                    key={element.id}
                    className={`slide ${index === currentIndex ? 'active' : ''}`}
                >
                    <img src={element.value.imageUrl} alt={element.name} />
                    {element.value.h1 && <h1>{element.value.h1.h1}</h1>}
                    {element.value.h2 && <h2>{element.value.h2.h2}</h2>}
                    {element.value.h3 && <h3>{element.value.h3.h3}</h3>}
                    {element.value.shortTexts && element.value.shortTexts.map((text, i) => (
                        <p key={i}>{text.shortText}</p>
                    ))}
                </div>
            ))}
        </div>
    );
};

export default SlideBannerComponent;