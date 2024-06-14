// @ts-ignore
import ContentComponent from './ContentComponent.tsx';
import {Section} from "./types";

interface SectionComponentProps {
    section: Section;
}

const SectionComponent: React.FC<SectionComponentProps> = ({ section }) => {
    return (
        <div className={`section ${section.sectionType.toLowerCase()}`}>
            {section.contents.map(content => (
                <ContentComponent key={content.id} content={content} />
            ))}
        </div>
    );
};

export default SectionComponent;