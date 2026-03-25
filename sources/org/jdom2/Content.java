package org.jdom2;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import o.C59905zpy;
import o.InterfaceC59869zpF;

/* JADX INFO: loaded from: classes24.dex */
public abstract class Content extends C59905zpy implements Serializable, InterfaceC59869zpF {
    private static final long serialVersionUID = 200;
    protected final CType ctype;
    protected transient Parent parent = null;

    public enum CType {
        Comment,
        Element,
        ProcessingInstruction,
        EntityRef,
        Text,
        CDATA,
        DocType
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CType getCType() {
        return this.ctype;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Parent getParent() {
        return this.parent;
    }

    public abstract String getValue();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Content setParent(Parent parent) {
        this.parent = parent;
        return this;
    }

    public Content(CType cType) {
        this.ctype = cType;
    }

    public Content detach() {
        Parent parent = this.parent;
        if (parent != null) {
            parent.removeContent(this);
        }
        return this;
    }

    public final Element getParentElement() {
        Parent parent = getParent();
        if (!(parent instanceof Element)) {
            parent = null;
        }
        return (Element) parent;
    }

    public Document getDocument() {
        Parent parent = this.parent;
        if (parent == null) {
            return null;
        }
        return parent.getDocument();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lo/zpy; */
    @Override // o.C59905zpy
    public Content clone() {
        Content content = (Content) super.clone();
        content.parent = null;
        return content;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // o.InterfaceC59869zpF
    public List<Namespace> getNamespacesInScope() {
        Element parentElement = getParentElement();
        if (parentElement == null) {
            return Collections.singletonList(Namespace.XML_NAMESPACE);
        }
        return parentElement.getNamespacesInScope();
    }

    public List<Namespace> getNamespacesIntroduced() {
        return Collections.emptyList();
    }

    public List<Namespace> getNamespacesInherited() {
        return getNamespacesInScope();
    }
}
