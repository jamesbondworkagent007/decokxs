package org.jdom2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.C59870zpG;
import o.C59904zpx;
import o.C59905zpy;
import o.C59906zpz;
import o.InterfaceC59880zpQ;
import org.jdom2.filter.Filter;

/* JADX INFO: loaded from: classes24.dex */
public class Document extends C59905zpy implements Parent {
    private static final long serialVersionUID = 200;
    protected String baseURI;
    transient C59906zpz content;
    private transient HashMap<String, Object> propertyMap;

    public final boolean equals(Object obj) {
        return obj == this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseURI() {
        return this.baseURI;
    }

    @Override // org.jdom2.Parent
    public Document getDocument() {
        return this;
    }

    @Override // org.jdom2.Parent
    public Parent getParent() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseURI(String str) {
        this.baseURI = str;
    }

    @Override // org.jdom2.Parent
    public /* bridge */ /* synthetic */ Parent addContent(int i, Collection collection) {
        return addContent(i, (Collection<? extends Content>) collection);
    }

    @Override // org.jdom2.Parent
    public /* bridge */ /* synthetic */ Parent addContent(Collection collection) {
        return addContent((Collection<? extends Content>) collection);
    }

    public Document() {
        this.content = new C59906zpz(this);
        this.baseURI = null;
        this.propertyMap = null;
    }

    public Document(Element element, DocType docType, String str) {
        this.content = new C59906zpz(this);
        this.baseURI = null;
        this.propertyMap = null;
        if (element != null) {
            setRootElement(element);
        }
        if (docType != null) {
            setDocType(docType);
        }
        if (str != null) {
            setBaseURI(str);
        }
    }

    public Document(Element element, DocType docType) {
        this(element, docType, null);
    }

    public Document(Element element) {
        this(element, null, null);
    }

    public Document(List<? extends Content> list) {
        this.content = new C59906zpz(this);
        this.baseURI = null;
        this.propertyMap = null;
        setContent(list);
    }

    @Override // org.jdom2.Parent
    public int getContentSize() {
        return this.content.size();
    }

    @Override // org.jdom2.Parent
    public int indexOf(Content content) {
        return this.content.indexOf(content);
    }

    public boolean hasRootElement() {
        return this.content.AYXKKw() >= 0;
    }

    public Element getRootElement() {
        int iAYXKKw = this.content.AYXKKw();
        if (iAYXKKw < 0) {
            throw new IllegalStateException("Root element not set");
        }
        return (Element) this.content.get(iAYXKKw);
    }

    public Document setRootElement(Element element) {
        int iAYXKKw = this.content.AYXKKw();
        if (iAYXKKw < 0) {
            this.content.add(element);
        } else {
            this.content.set(iAYXKKw, element);
        }
        return this;
    }

    public Element detachRootElement() {
        int iAYXKKw = this.content.AYXKKw();
        if (iAYXKKw < 0) {
            return null;
        }
        return (Element) removeContent(iAYXKKw);
    }

    public DocType getDocType() {
        int iCopydefault = this.content.copydefault();
        if (iCopydefault < 0) {
            return null;
        }
        return (DocType) this.content.get(iCopydefault);
    }

    public Document setDocType(DocType docType) {
        if (docType == null) {
            int iCopydefault = this.content.copydefault();
            if (iCopydefault >= 0) {
                this.content.remove(iCopydefault);
            }
            return this;
        }
        if (docType.getParent() != null) {
            throw new IllegalAddException(docType, "The DocType already is attached to a document");
        }
        int iCopydefault2 = this.content.copydefault();
        if (iCopydefault2 < 0) {
            this.content.add(0, docType);
        } else {
            this.content.set(iCopydefault2, docType);
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: addContent(Lorg/jdom2/Content;)Lorg/jdom2/Parent; */
    @Override // org.jdom2.Parent
    public Document addContent(Content content) {
        this.content.add(content);
        return this;
    }

    @Override // org.jdom2.Parent
    public Document addContent(Collection<? extends Content> collection) {
        this.content.addAll(collection);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: addContent(ILorg/jdom2/Content;)Lorg/jdom2/Parent; */
    @Override // org.jdom2.Parent
    public Document addContent(int i, Content content) {
        this.content.add(i, content);
        return this;
    }

    @Override // org.jdom2.Parent
    public Document addContent(int i, Collection<? extends Content> collection) {
        this.content.addAll(i, collection);
        return this;
    }

    @Override // org.jdom2.Parent
    public List<Content> cloneContent() {
        int contentSize = getContentSize();
        ArrayList arrayList = new ArrayList(contentSize);
        for (int i = 0; i < contentSize; i++) {
            arrayList.add(getContent(i).clone());
        }
        return arrayList;
    }

    @Override // org.jdom2.Parent
    public Content getContent(int i) {
        return this.content.get(i);
    }

    @Override // org.jdom2.Parent
    public List<Content> getContent() {
        if (hasRootElement()) {
            return this.content;
        }
        throw new IllegalStateException("Root element not set");
    }

    @Override // org.jdom2.Parent
    public <F extends Content> List<F> getContent(Filter<F> filter) {
        if (!hasRootElement()) {
            throw new IllegalStateException("Root element not set");
        }
        return this.content.KWHzl(filter);
    }

    @Override // org.jdom2.Parent
    public List<Content> removeContent() {
        ArrayList arrayList = new ArrayList(this.content);
        this.content.clear();
        return arrayList;
    }

    @Override // org.jdom2.Parent
    public <F extends Content> List<F> removeContent(Filter<F> filter) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.content.KWHzl(filter).iterator();
        while (it.hasNext()) {
            arrayList.add((Content) it.next());
            it.remove();
        }
        return arrayList;
    }

    public Document setContent(Collection<? extends Content> collection) {
        this.content.EZpvd(collection);
        return this;
    }

    public Document setContent(int i, Content content) {
        this.content.set(i, content);
        return this;
    }

    public Document setContent(int i, Collection<? extends Content> collection) {
        this.content.remove(i);
        this.content.addAll(i, collection);
        return this;
    }

    @Override // org.jdom2.Parent
    public boolean removeContent(Content content) {
        return this.content.remove(content);
    }

    @Override // org.jdom2.Parent
    public Content removeContent(int i) {
        return this.content.remove(i);
    }

    public Document setContent(Content content) {
        this.content.clear();
        this.content.add(content);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Document: ");
        DocType docType = getDocType();
        if (docType != null) {
            sb.append(docType.toString());
            sb.append(", ");
        } else {
            sb.append(" No DOCTYPE declaration, ");
        }
        Element rootElement = hasRootElement() ? getRootElement() : null;
        if (rootElement != null) {
            sb.append("Root is ");
            sb.append(rootElement.toString());
        } else {
            sb.append(" No root element");
        }
        sb.append("]");
        return sb.toString();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lo/zpy; */
    @Override // o.C59905zpy
    public Document clone() {
        Document document = (Document) super.clone();
        document.content = new C59906zpz(document);
        for (int i = 0; i < this.content.size(); i++) {
            Content contentAEQbTJ = this.content.get(i);
            if (contentAEQbTJ instanceof Element) {
                document.content.add(((Element) contentAEQbTJ).clone());
            } else if (contentAEQbTJ instanceof Comment) {
                document.content.add(((Comment) contentAEQbTJ).clone());
            } else if (contentAEQbTJ instanceof ProcessingInstruction) {
                document.content.add(((ProcessingInstruction) contentAEQbTJ).clone());
            } else if (contentAEQbTJ instanceof DocType) {
                document.content.add(((DocType) contentAEQbTJ).clone());
            }
        }
        return document;
    }

    @Override // org.jdom2.Parent
    public InterfaceC59880zpQ<Content> getDescendants() {
        return new C59904zpx(this);
    }

    @Override // org.jdom2.Parent
    public <F extends Content> InterfaceC59880zpQ<F> getDescendants(Filter<F> filter) {
        return new C59870zpG(new C59904zpx(this), filter);
    }

    public void setProperty(String str, Object obj) {
        if (this.propertyMap == null) {
            this.propertyMap = new HashMap<>();
        }
        this.propertyMap.put(str, obj);
    }

    public Object getProperty(String str) {
        HashMap<String, Object> map = this.propertyMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // org.jdom2.Parent
    public void canContainContent(Content content, int i, boolean z) {
        if (content instanceof Element) {
            int iAYXKKw = this.content.AYXKKw();
            if (z && iAYXKKw == i) {
                return;
            }
            if (iAYXKKw >= 0) {
                throw new IllegalAddException("Cannot add a second root element, only one is allowed");
            }
            if (this.content.copydefault() >= i) {
                throw new IllegalAddException("A root element cannot be added before the DocType");
            }
        }
        if (content instanceof DocType) {
            int iCopydefault = this.content.copydefault();
            if (z && iCopydefault == i) {
                return;
            }
            if (iCopydefault >= 0) {
                throw new IllegalAddException("Cannot add a second doctype, only one is allowed");
            }
            int iAYXKKw2 = this.content.AYXKKw();
            if (iAYXKKw2 != -1 && iAYXKKw2 < i) {
                throw new IllegalAddException("A DocType cannot be added after the root element");
            }
        }
        if (content instanceof CDATA) {
            throw new IllegalAddException("A CDATA is not allowed at the document root");
        }
        if (content instanceof Text) {
            throw new IllegalAddException("A Text is not allowed at the document root");
        }
        if (content instanceof EntityRef) {
            throw new IllegalAddException("An EntityRef is not allowed at the document root");
        }
    }

    @Override // o.InterfaceC59869zpF
    public List<Namespace> getNamespacesInScope() {
        return Collections.unmodifiableList(Arrays.asList(Namespace.NO_NAMESPACE, Namespace.XML_NAMESPACE));
    }

    public List<Namespace> getNamespacesIntroduced() {
        return Collections.unmodifiableList(Arrays.asList(Namespace.NO_NAMESPACE, Namespace.XML_NAMESPACE));
    }

    public List<Namespace> getNamespacesInherited() {
        return Collections.emptyList();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int size = this.content.size();
        objectOutputStream.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutputStream.writeObject(getContent(i));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.content = new C59906zpz(this);
        int i = objectInputStream.readInt();
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                addContent((Content) objectInputStream.readObject());
            }
        }
    }
}
