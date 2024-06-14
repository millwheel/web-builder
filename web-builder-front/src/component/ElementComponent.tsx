const ElementComponent = ({ element }) => {
    const renderElementValue = (value) => {
        if (value && typeof value === 'object') {
            const h1 = value.h1 ? value.h1.h1 || value.h1.value || value.h1 : null;
            const h2 = value.h2 ? value.h2 || value.h2 : null;
            const h3 = value.h3 ? value.h3 || value.h3 : null;
            const shortTexts = value.shortTexts && Array.isArray(value.shortTexts)
                ? value.shortTexts.map((text, index) => (
                    <span key={index}>{text.shortText || text.value}<br/></span>
                ))
                : null;
            const longText = value.longText ? value.longText : null;
            const image = value.imageUrl ? value.imageUrl : null;

            return (
                <div>
                    {h1 && <h1>{h1}</h1>}
                    {h2 && <h2>{h2}</h2>}
                    {h3 && <h3>{h3}</h3>}
                    {shortTexts && <span>{shortTexts}</span>}
                    {longText && <span>{longText}</span>}
                    {image && <img src={image} alt={image.name} />}
                </div>
            );
        }
        return <span>{value}</span>;
    };

    return (
        <div className={`element ${element.elementType.toLowerCase()}`}>
            {renderElementValue(element.value)}
        </div>
    );
};

export default ElementComponent;
