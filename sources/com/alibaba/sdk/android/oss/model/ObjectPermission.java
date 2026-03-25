package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes21.dex */
public enum ObjectPermission {
    Private("private"),
    PublicRead("public-read"),
    PublicReadWrite("public-read-write"),
    Default("default"),
    Unknown("");

    private String permissionString;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.permissionString;
    }

    ObjectPermission(String str) {
        this.permissionString = str;
    }

    public static ObjectPermission parsePermission(String str) {
        ObjectPermission[] objectPermissionArr = {Private, PublicRead, PublicReadWrite, Default};
        for (int i = 0; i < 4; i++) {
            ObjectPermission objectPermission = objectPermissionArr[i];
            if (objectPermission.permissionString.equals(str)) {
                return objectPermission;
            }
        }
        return Unknown;
    }
}
