package org.htmlcleaner;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes13.dex */
public enum BelongsTo {
    HEAD_AND_BODY("all"),
    HEAD(TtmlNode.TAG_HEAD),
    BODY("body");

    private final String dbCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDbCode() {
        return this.dbCode;
    }

    BelongsTo(String str) {
        this.dbCode = str;
    }

    public static BelongsTo toValue(Object obj) {
        if (obj instanceof BelongsTo) {
            return (BelongsTo) obj;
        }
        if (obj != null) {
            String strTrim = obj.toString().trim();
            for (BelongsTo belongsTo : values()) {
                if (belongsTo.getDbCode().equalsIgnoreCase(strTrim) || belongsTo.name().equalsIgnoreCase(strTrim)) {
                    return belongsTo;
                }
            }
        }
        return null;
    }
}
