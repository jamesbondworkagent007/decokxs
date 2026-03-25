package com.okinc.base.uploadlog;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadLogTriggerMethodEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UploadLogTriggerMethodEnum[] $VALUES;
    private final String desc;
    public static final UploadLogTriggerMethodEnum PUSH = new UploadLogTriggerMethodEnum("PUSH", 0, "push");
    public static final UploadLogTriggerMethodEnum ACTIVE_UPLOAD = new UploadLogTriggerMethodEnum("ACTIVE_UPLOAD", 1, "activeUpload");
    public static final UploadLogTriggerMethodEnum E2E_MONITOR_UPLOAD = new UploadLogTriggerMethodEnum("E2E_MONITOR_UPLOAD", 2, "e2eMonitorUpload");
    public static final UploadLogTriggerMethodEnum APP_LIFECYCLE = new UploadLogTriggerMethodEnum("APP_LIFECYCLE", 3, "appLifecycle");
    public static final UploadLogTriggerMethodEnum APK_UPLOAD = new UploadLogTriggerMethodEnum("APK_UPLOAD", 4, "apkUpload");
    public static final UploadLogTriggerMethodEnum APP_CRASH = new UploadLogTriggerMethodEnum("APP_CRASH", 5, "appCrash");
    public static final UploadLogTriggerMethodEnum APP_ANR = new UploadLogTriggerMethodEnum("APP_ANR", 6, "appAnr");
    public static final UploadLogTriggerMethodEnum ALPHA_FEEDBACK = new UploadLogTriggerMethodEnum("ALPHA_FEEDBACK", 7, "alphaFeedback");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UploadLogTriggerMethodEnum[] $values() {
        return new UploadLogTriggerMethodEnum[]{PUSH, ACTIVE_UPLOAD, E2E_MONITOR_UPLOAD, APP_LIFECYCLE, APK_UPLOAD, APP_CRASH, APP_ANR, ALPHA_FEEDBACK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UploadLogTriggerMethodEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
    }

    private UploadLogTriggerMethodEnum(String str, int i, String str2) {
        this.desc = str2;
    }

    static {
        UploadLogTriggerMethodEnum[] uploadLogTriggerMethodEnumArr$values = $values();
        $VALUES = uploadLogTriggerMethodEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(uploadLogTriggerMethodEnumArr$values);
    }

    public static UploadLogTriggerMethodEnum valueOf(String str) {
        return (UploadLogTriggerMethodEnum) Enum.valueOf(UploadLogTriggerMethodEnum.class, str);
    }

    public static UploadLogTriggerMethodEnum[] values() {
        return (UploadLogTriggerMethodEnum[]) $VALUES.clone();
    }
}
