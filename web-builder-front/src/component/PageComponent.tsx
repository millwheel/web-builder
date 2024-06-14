// @ts-ignore
import React, { useState } from 'react';
import axios from 'axios';
// @ts-ignore
import SectionComponent from './SectionComponent.tsx';
import { Page } from './types';

const PageComponent: React.FC = () => {
    const [pageContent, setPageContent] = useState<Page | null>(null);
    const [loading, setLoading] = useState(false);
    const [showContent, setShowContent] = useState(false);

    const fetchPage = (url: string) => {
        setLoading(true);
        axios.get<Page>(url)
            .then(response => {
                setPageContent(response.data);
                setShowContent(true);
            })
            .catch(error => {
                console.error('There was an error fetching the page!', error);
                setPageContent(null);
                setShowContent(false);
            })
            .finally(() => {
                setLoading(false);
            });
    };

    const handleConsoleClick = () => {
        fetchPage('http://localhost:8080/console/pages');
    };

    const handlePublishedClick = () => {
        fetchPage('http://localhost:8080/published/pages');
    };

    const handleBackClick = () => {
        setPageContent(null);
        setShowContent(false);
    };

    return (
        <div>
            {showContent ? (
                <div>
                    <div className="section-layout">
                        {loading ? (
                            <p>Loading...</p>
                        ) : (
                            pageContent && pageContent.sections.map(section => (
                                <SectionComponent key={section.id} section={section}/>
                            ))
                        )}
                    </div>
                    <div className={"buttons-container"}>
                        <button id={"back-button"} onClick={handleBackClick}>Back</button>
                    </div>
                </div>
            ) : (
                <div className="home">
                    <h1 id={"home-title"}>Reports</h1>
                    {/*<div className={"buttons-container"}>*/}
                    {/*    <button onClick={handleConsoleClick}>Console</button>*/}
                    {/*</div>*/}
                    <div className={"buttons-container"}>
                        <button onClick={handlePublishedClick}>Published</button>
                    </div>
                </div>
            )}
        </div>
    );
};

export default PageComponent;