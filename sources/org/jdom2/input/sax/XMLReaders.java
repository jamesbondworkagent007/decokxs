package org.jdom2.input.sax;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.SchemaFactory;
import org.jdom2.JDOMException;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes24.dex */
public enum XMLReaders {
    NONVALIDATING(0),
    DTDVALIDATING(1),
    XSDVALIDATING(2);

    private final Exception failcause;
    private final SAXParserFactory jaxpfactory;
    private final boolean validates;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isValidating() {
        return this.validates;
    }

    XMLReaders(int i) {
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        boolean z = true;
        sAXParserFactoryNewInstance.setNamespaceAware(true);
        Exception exc = null;
        if (i != 0) {
            if (i == 1) {
                sAXParserFactoryNewInstance.setValidating(true);
            } else if (i == 2) {
                sAXParserFactoryNewInstance.setValidating(false);
                try {
                    sAXParserFactoryNewInstance.setSchema(SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema").newSchema());
                } catch (IllegalArgumentException | UnsupportedOperationException | SAXException e) {
                    z = false;
                    exc = e;
                    sAXParserFactoryNewInstance = null;
                }
            }
            this.jaxpfactory = sAXParserFactoryNewInstance;
            this.validates = z;
            this.failcause = exc;
        }
        sAXParserFactoryNewInstance.setValidating(false);
        z = false;
        this.jaxpfactory = sAXParserFactoryNewInstance;
        this.validates = z;
        this.failcause = exc;
    }

    public XMLReader createXMLReader() throws JDOMException {
        SAXParserFactory sAXParserFactory = this.jaxpfactory;
        if (sAXParserFactory == null) {
            throw new JDOMException("It was not possible to configure a suitable XMLReader to support " + this, this.failcause);
        }
        try {
            return sAXParserFactory.newSAXParser().getXMLReader();
        } catch (ParserConfigurationException e) {
            throw new JDOMException("Unable to create a new XMLReader instance", e);
        } catch (SAXException e2) {
            throw new JDOMException("Unable to create a new XMLReader instance", e2);
        }
    }
}
