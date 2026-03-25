package org.jdom2.filter;

import org.jdom2.Element;
import org.jdom2.Namespace;

/* JADX INFO: loaded from: classes24.dex */
public class ElementFilter extends AbstractFilter<Element> {
    private static final long serialVersionUID = 200;
    private String name;
    private Namespace namespace;

    public ElementFilter() {
    }

    public ElementFilter(String str) {
        this.name = str;
    }

    public ElementFilter(Namespace namespace) {
        this.namespace = namespace;
    }

    public ElementFilter(String str, Namespace namespace) {
        this.name = str;
        this.namespace = namespace;
    }

    /* JADX DEBUG: Method merged with bridge method: filter(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // org.jdom2.filter.Filter
    public Element filter(Object obj) {
        if (!(obj instanceof Element)) {
            return null;
        }
        Element element = (Element) obj;
        String str = this.name;
        if (str == null) {
            Namespace namespace = this.namespace;
            if (namespace == null || namespace.equals(element.getNamespace())) {
                return element;
            }
            return null;
        }
        if (!str.equals(element.getName())) {
            return null;
        }
        Namespace namespace2 = this.namespace;
        if (namespace2 == null || namespace2.equals(element.getNamespace())) {
            return element;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElementFilter)) {
            return false;
        }
        ElementFilter elementFilter = (ElementFilter) obj;
        String str = this.name;
        if (str == null ? elementFilter.name != null : !str.equals(elementFilter.name)) {
            return false;
        }
        Namespace namespace = this.namespace;
        Namespace namespace2 = elementFilter.namespace;
        return namespace == null ? namespace2 == null : namespace.equals(namespace2);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = str != null ? str.hashCode() : 0;
        Namespace namespace = this.namespace;
        return (iHashCode * 29) + (namespace != null ? namespace.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ElementFilter: Name ");
        String str = this.name;
        if (str == null) {
            str = "*any*";
        }
        sb.append(str);
        sb.append(" with Namespace ");
        sb.append(this.namespace);
        sb.append("]");
        return sb.toString();
    }
}
