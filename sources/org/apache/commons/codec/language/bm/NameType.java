package org.apache.commons.codec.language.bm;

/* JADX INFO: loaded from: classes24.dex */
public enum NameType {
    ASHKENAZI("ash"),
    GENERIC("gen"),
    SEPHARDIC("sep");

    private final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    NameType(String str) {
        this.name = str;
    }
}
