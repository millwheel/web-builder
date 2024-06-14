export interface Page {
    id: number;
    name: string;
    subUrl: string;
    pageStyle: string;
    sections: Section[];
}

export interface Section {
    id: number;
    sectionType: string;
    contents: Content[];
}

export interface Content {
    id: number;
    contentType: string;
    name: string;
    sort: number;
    elementCount: number;
    elements: Element[];
}

export interface Element {
    id: number;
    elementType: string;
    sort: number;
    name: string;
    value: any;
}