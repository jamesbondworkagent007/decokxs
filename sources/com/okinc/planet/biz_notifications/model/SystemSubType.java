package com.okinc.planet.biz_notifications.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class SystemSubType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SystemSubType[] $VALUES;
    public static final StateListAnimator Companion;
    private final int subType;
    public static final SystemSubType Post_Review_Failed = new SystemSubType("Post_Review_Failed", 0, 1);
    public static final SystemSubType Comments_Review_Failed = new SystemSubType("Comments_Review_Failed", 1, 2);
    public static final SystemSubType Post_Removed = new SystemSubType("Post_Removed", 2, 3);
    public static final SystemSubType Comments_Removed = new SystemSubType("Comments_Removed", 3, 4);
    public static final SystemSubType Content_Sync_Success = new SystemSubType("Content_Sync_Success", 4, 5);
    public static final SystemSubType Content_Sync_Failed = new SystemSubType("Content_Sync_Failed", 5, 6);
    public static final SystemSubType Twitter_Sync_Failed = new SystemSubType("Twitter_Sync_Failed", 6, 7);
    public static final SystemSubType BIO_REVIEW_FAILS = new SystemSubType("BIO_REVIEW_FAILS", 7, 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SystemSubType[] $values() {
        return new SystemSubType[]{Post_Review_Failed, Comments_Review_Failed, Post_Removed, Comments_Removed, Content_Sync_Success, Content_Sync_Failed, Twitter_Sync_Failed, BIO_REVIEW_FAILS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SystemSubType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubType() {
        return this.subType;
    }

    private SystemSubType(String str, int i, int i2) {
        this.subType = i2;
    }

    static {
        SystemSubType[] systemSubTypeArr$values = $values();
        $VALUES = systemSubTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(systemSubTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_notifications.model.SystemSubType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final SystemSubType OLrzqt(int i) {
            for (SystemSubType systemSubType : SystemSubType.values()) {
                if (systemSubType.getSubType() == i) {
                    return systemSubType;
                }
            }
            return null;
        }
    }

    public static SystemSubType valueOf(String str) {
        return (SystemSubType) Enum.valueOf(SystemSubType.class, str);
    }

    public static SystemSubType[] values() {
        return (SystemSubType[]) $VALUES.clone();
    }
}
