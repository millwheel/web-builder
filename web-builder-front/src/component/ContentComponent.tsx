// @ts-ignore
import ElementComponent from './ElementComponent.tsx';
// @ts-ignore
import SlideBannerComponent from "./SlideBannerComponent.tsx";

const ContentComponent = ({ content }) => {
    if (content.contentType === 'SLIDE_BANNER') {
        return <SlideBannerComponent elements={content.elements} />;
    }

    return (
        <div className={`content ${content.contentType.toLowerCase()}`}>
            {content.elements.map(element => (
                <ElementComponent key={element.id} element={element} />
            ))}
        </div>
    );
};

export default ContentComponent;