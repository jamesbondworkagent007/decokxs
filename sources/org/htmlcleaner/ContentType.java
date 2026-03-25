package org.htmlcleaner;

/* JADX INFO: loaded from: classes13.dex */
public enum ContentType {
    all("all"),
    none("none"),
    text("text");

    private final String dbCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDbCode() {
        return this.dbCode;
    }

    ContentType(String str) {
        this.dbCode = str;
    }

    public static ContentType toValue(Object obj) {
        if (obj instanceof ContentType) {
            return (ContentType) obj;
        }
        if (obj != null) {
            String strTrim = obj.toString().trim();
            for (ContentType contentType : values()) {
                if (contentType.getDbCode().equalsIgnoreCase(strTrim) || contentType.name().equalsIgnoreCase(strTrim)) {
                    return contentType;
                }
            }
        }
        return null;
    }
}
