package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes14.dex */
public enum CannedAccessControlList {
    Private("private"),
    PublicRead("public-read"),
    PublicReadWrite("public-read-write"),
    Default("default");

    private String ACLString;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.ACLString;
    }

    CannedAccessControlList(String str) {
        this.ACLString = str;
    }

    public static CannedAccessControlList parseACL(String str) {
        for (CannedAccessControlList cannedAccessControlList : values()) {
            if (cannedAccessControlList.toString().equals(str)) {
                return cannedAccessControlList;
            }
        }
        return null;
    }
}
