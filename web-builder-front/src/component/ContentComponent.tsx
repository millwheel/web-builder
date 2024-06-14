// @ts-ignore
import ElementComponent from './ElementComponent.tsx';

const ContentComponent = ({ content }) => {
    return (
        <div className={`content ${content.contentType.toLowerCase()}`}>
            {content.elements.map(element => (
                <ElementComponent key={element.id} element={element} />
            ))}
        </div>
    );
};

export default ContentComponent;