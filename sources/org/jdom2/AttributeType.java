package org.jdom2;

/* JADX INFO: loaded from: classes24.dex */
public enum AttributeType {
    UNDECLARED,
    CDATA,
    ID,
    IDREF,
    IDREFS,
    ENTITY,
    ENTITIES,
    NMTOKEN,
    NMTOKENS,
    NOTATION,
    ENUMERATION;

    @Deprecated
    public static final AttributeType byIndex(int i) {
        if (i < 0) {
            throw new IllegalDataException("No such AttributeType " + i);
        }
        if (i >= values().length) {
            StringBuilder sb = new StringBuilder();
            sb.append("No such AttributeType ");
            sb.append(i);
            sb.append(", max is ");
            sb.append(values().length - 1);
            throw new IllegalDataException(sb.toString());
        }
        return values()[i];
    }

    public static final AttributeType getAttributeType(String str) {
        if (str == null) {
            return UNDECLARED;
        }
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return (str.length() <= 0 || str.trim().charAt(0) != '(') ? UNDECLARED : ENUMERATION;
        }
    }
}
