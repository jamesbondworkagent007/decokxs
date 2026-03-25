package org.jdom2.filter;

import org.jdom2.Attribute;
import org.jdom2.Namespace;

/* JADX INFO: loaded from: classes24.dex */
public class AttributeFilter extends AbstractFilter<Attribute> {
    private static final long serialVersionUID = 200;
    private final String name;
    private final Namespace namespace;

    public AttributeFilter() {
        this(null, null);
    }

    public AttributeFilter(String str) {
        this(str, null);
    }

    public AttributeFilter(Namespace namespace) {
        this(null, namespace);
    }

    public AttributeFilter(String str, Namespace namespace) {
        this.name = str;
        this.namespace = namespace;
    }

    /* JADX DEBUG: Method merged with bridge method: filter(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // org.jdom2.filter.Filter
    public Attribute filter(Object obj) {
        if (!(obj instanceof Attribute)) {
            return null;
        }
        Attribute attribute = (Attribute) obj;
        String str = this.name;
        if (str == null) {
            Namespace namespace = this.namespace;
            if (namespace == null || namespace.equals(attribute.getNamespace())) {
                return attribute;
            }
            return null;
        }
        if (!str.equals(attribute.getName())) {
            return null;
        }
        Namespace namespace2 = this.namespace;
        if (namespace2 == null || namespace2.equals(attribute.getNamespace())) {
            return attribute;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributeFilter)) {
            return false;
        }
        AttributeFilter attributeFilter = (AttributeFilter) obj;
        String str = this.name;
        if (str == null ? attributeFilter.name != null : !str.equals(attributeFilter.name)) {
            return false;
        }
        Namespace namespace = this.namespace;
        Namespace namespace2 = attributeFilter.namespace;
        return namespace == null ? namespace2 == null : namespace.equals(namespace2);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = str != null ? str.hashCode() : 0;
        Namespace namespace = this.namespace;
        return (iHashCode * 29) + (namespace != null ? namespace.hashCode() : 0);
    }
}
