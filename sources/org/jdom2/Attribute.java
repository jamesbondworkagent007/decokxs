package org.jdom2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amplifyframework.core.model.ModelIdentifier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C59868zpE;
import o.C59905zpy;
import o.InterfaceC59869zpF;

/* JADX INFO: loaded from: classes24.dex */
public class Attribute extends C59905zpy implements InterfaceC59869zpF, Serializable, Cloneable {
    private static final long serialVersionUID = 200;
    protected String name;
    protected Namespace namespace;
    protected transient Element parent;
    protected boolean specified;
    protected AttributeType type;
    protected String value;
    public static final AttributeType UNDECLARED_TYPE = AttributeType.UNDECLARED;
    public static final AttributeType CDATA_TYPE = AttributeType.CDATA;
    public static final AttributeType ID_TYPE = AttributeType.ID;
    public static final AttributeType IDREF_TYPE = AttributeType.IDREF;
    public static final AttributeType IDREFS_TYPE = AttributeType.IDREFS;
    public static final AttributeType ENTITY_TYPE = AttributeType.ENTITY;
    public static final AttributeType ENTITIES_TYPE = AttributeType.ENTITIES;
    public static final AttributeType NMTOKEN_TYPE = AttributeType.NMTOKEN;
    public static final AttributeType NMTOKENS_TYPE = AttributeType.NMTOKENS;
    public static final AttributeType NOTATION_TYPE = AttributeType.NOTATION;
    public static final AttributeType ENUMERATED_TYPE = AttributeType.ENUMERATION;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AttributeType getAttributeType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Namespace getNamespace() {
        return this.namespace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Element getParent() {
        return this.parent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isSpecified() {
        return this.specified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Attribute setParent(Element element) {
        this.parent = element;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSpecified(boolean z) {
        this.specified = z;
    }

    public Attribute() {
        this.type = AttributeType.UNDECLARED;
        this.specified = true;
    }

    public Attribute(String str, String str2, Namespace namespace) {
        this(str, str2, AttributeType.UNDECLARED, namespace);
    }

    @Deprecated
    public Attribute(String str, String str2, int i, Namespace namespace) {
        this(str, str2, AttributeType.byIndex(i), namespace);
    }

    public Attribute(String str, String str2, AttributeType attributeType, Namespace namespace) {
        this.type = AttributeType.UNDECLARED;
        this.specified = true;
        setName(str);
        setValue(str2);
        setAttributeType(attributeType);
        setNamespace(namespace);
    }

    public Attribute(String str, String str2) {
        this(str, str2, AttributeType.UNDECLARED, Namespace.NO_NAMESPACE);
    }

    public Attribute(String str, String str2, AttributeType attributeType) {
        this(str, str2, attributeType, Namespace.NO_NAMESPACE);
    }

    @Deprecated
    public Attribute(String str, String str2, int i) {
        this(str, str2, i, Namespace.NO_NAMESPACE);
    }

    public Document getDocument() {
        Element element = this.parent;
        if (element == null) {
            return null;
        }
        return element.getDocument();
    }

    public Attribute setName(String str) {
        if (str == null) {
            throw new NullPointerException("Can not set a null name for an Attribute.");
        }
        String strAEQbTJ = C59868zpE.AEQbTJ(str);
        if (strAEQbTJ != null) {
            throw new IllegalNameException(str, "attribute", strAEQbTJ);
        }
        this.name = str;
        this.specified = true;
        return this;
    }

    public String getQualifiedName() {
        String prefix = this.namespace.getPrefix();
        if ("".equals(prefix)) {
            return getName();
        }
        return prefix + AbstractJsonLexerKt.COLON + getName();
    }

    public String getNamespacePrefix() {
        return this.namespace.getPrefix();
    }

    public String getNamespaceURI() {
        return this.namespace.getURI();
    }

    public Attribute setNamespace(Namespace namespace) {
        if (namespace == null) {
            namespace = Namespace.NO_NAMESPACE;
        }
        if (namespace != Namespace.NO_NAMESPACE && "".equals(namespace.getPrefix())) {
            throw new IllegalNameException("", "attribute namespace", "An attribute namespace without a prefix can only be the NO_NAMESPACE namespace");
        }
        this.namespace = namespace;
        this.specified = true;
        return this;
    }

    public Attribute setValue(String str) {
        if (str == null) {
            throw new NullPointerException("Can not set a null value for an Attribute");
        }
        String strEZpvd = C59868zpE.EZpvd(str);
        if (strEZpvd != null) {
            throw new IllegalDataException(str, "attribute", strEZpvd);
        }
        this.value = str;
        this.specified = true;
        return this;
    }

    public Attribute setAttributeType(AttributeType attributeType) {
        if (attributeType == null) {
            attributeType = AttributeType.UNDECLARED;
        }
        this.type = attributeType;
        this.specified = true;
        return this;
    }

    @Deprecated
    public Attribute setAttributeType(int i) {
        setAttributeType(AttributeType.byIndex(i));
        return this;
    }

    public String toString() {
        return "[Attribute: " + getQualifiedName() + "=\"" + this.value + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + "]";
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lo/zpy; */
    @Override // o.C59905zpy
    public Attribute clone() {
        Attribute attribute = (Attribute) super.clone();
        attribute.parent = null;
        return attribute;
    }

    public Attribute detach() {
        Element element = this.parent;
        if (element != null) {
            element.removeAttribute(this);
        }
        return this;
    }

    public int getIntValue() throws DataConversionException {
        try {
            return Integer.parseInt(this.value.trim());
        } catch (NumberFormatException unused) {
            throw new DataConversionException(this.name, "int");
        }
    }

    public long getLongValue() throws DataConversionException {
        try {
            return Long.parseLong(this.value.trim());
        } catch (NumberFormatException unused) {
            throw new DataConversionException(this.name, "long");
        }
    }

    public float getFloatValue() throws DataConversionException {
        try {
            return Float.valueOf(this.value.trim()).floatValue();
        } catch (NumberFormatException unused) {
            throw new DataConversionException(this.name, TypedValues.Custom.S_FLOAT);
        }
    }

    public double getDoubleValue() throws DataConversionException {
        try {
            return Double.valueOf(this.value.trim()).doubleValue();
        } catch (NumberFormatException unused) {
            String strTrim = this.value.trim();
            if ("INF".equals(strTrim)) {
                return Double.POSITIVE_INFINITY;
            }
            if ("-INF".equals(strTrim)) {
                return Double.NEGATIVE_INFINITY;
            }
            throw new DataConversionException(this.name, "double");
        }
    }

    public boolean getBooleanValue() throws DataConversionException {
        String strTrim = this.value.trim();
        if (strTrim.equalsIgnoreCase("true") || strTrim.equalsIgnoreCase(DebugKt.DEBUG_PROPERTY_VALUE_ON) || strTrim.equalsIgnoreCase("1") || strTrim.equalsIgnoreCase("yes")) {
            return true;
        }
        if (strTrim.equalsIgnoreCase("false") || strTrim.equalsIgnoreCase(DebugKt.DEBUG_PROPERTY_VALUE_OFF) || strTrim.equalsIgnoreCase("0") || strTrim.equalsIgnoreCase("no")) {
            return false;
        }
        throw new DataConversionException(this.name, TypedValues.Custom.S_BOOLEAN);
    }

    @Override // o.InterfaceC59869zpF
    public List<Namespace> getNamespacesInScope() {
        if (getParent() == null) {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(getNamespace());
            arrayList.add(Namespace.XML_NAMESPACE);
            return Collections.unmodifiableList(arrayList);
        }
        return orderFirst(getNamespace(), getParent().getNamespacesInScope());
    }

    public List<Namespace> getNamespacesIntroduced() {
        if (getParent() == null) {
            return Collections.singletonList(getNamespace());
        }
        return Collections.emptyList();
    }

    public List<Namespace> getNamespacesInherited() {
        if (getParent() == null) {
            return Collections.singletonList(Namespace.XML_NAMESPACE);
        }
        return orderFirst(getNamespace(), getParent().getNamespacesInScope());
    }

    private static final List<Namespace> orderFirst(Namespace namespace, List<Namespace> list) {
        if (list.get(0) == namespace) {
            return list;
        }
        TreeMap treeMap = new TreeMap();
        for (Namespace namespace2 : list) {
            if (namespace2 != namespace) {
                treeMap.put(namespace2.getPrefix(), namespace2);
            }
        }
        ArrayList arrayList = new ArrayList(treeMap.size() + 1);
        arrayList.add(namespace);
        arrayList.addAll(treeMap.values());
        return Collections.unmodifiableList(arrayList);
    }
}
