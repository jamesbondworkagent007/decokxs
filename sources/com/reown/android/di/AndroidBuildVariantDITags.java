package com.reown.android.di;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class AndroidBuildVariantDITags {
    public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    public static final /* synthetic */ AndroidBuildVariantDITags[] $VALUES;
    public static final AndroidBuildVariantDITags DB_PASSPHRASE = new AndroidBuildVariantDITags("DB_PASSPHRASE", 0);
    public static final AndroidBuildVariantDITags ANDROID_CORE_DATABASE = new AndroidBuildVariantDITags("ANDROID_CORE_DATABASE", 1);
    public static final AndroidBuildVariantDITags ANDROID_CORE_DATABASE_DRIVER = new AndroidBuildVariantDITags("ANDROID_CORE_DATABASE_DRIVER", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ AndroidBuildVariantDITags[] $values() {
        return new AndroidBuildVariantDITags[]{DB_PASSPHRASE, ANDROID_CORE_DATABASE, ANDROID_CORE_DATABASE_DRIVER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AndroidBuildVariantDITags> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AndroidBuildVariantDITags valueOf(String str) {
        return (AndroidBuildVariantDITags) Enum.valueOf(AndroidBuildVariantDITags.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AndroidBuildVariantDITags[] values() {
        return (AndroidBuildVariantDITags[]) $VALUES.clone();
    }

    public AndroidBuildVariantDITags(String str, int i) {
    }

    static {
        AndroidBuildVariantDITags[] androidBuildVariantDITagsArr$values = $values();
        $VALUES = androidBuildVariantDITagsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(androidBuildVariantDITagsArr$values);
    }
}
