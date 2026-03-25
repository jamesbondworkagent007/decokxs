package com.okinc.planet.biz_notifications.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class LikesSubType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LikesSubType[] $VALUES;
    public static final ActionBar Companion;
    private final int subType;
    public static final LikesSubType Comments = new LikesSubType("Comments", 0, 1);
    public static final LikesSubType Post = new LikesSubType("Post", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LikesSubType[] $values() {
        return new LikesSubType[]{Comments, Post};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LikesSubType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubType() {
        return this.subType;
    }

    private LikesSubType(String str, int i, int i2) {
        this.subType = i2;
    }

    static {
        LikesSubType[] likesSubTypeArr$values = $values();
        $VALUES = likesSubTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(likesSubTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_notifications.model.LikesSubType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final LikesSubType EZpvd(int i) {
            for (LikesSubType likesSubType : LikesSubType.values()) {
                if (likesSubType.getSubType() == i) {
                    return likesSubType;
                }
            }
            return null;
        }
    }

    public static LikesSubType valueOf(String str) {
        return (LikesSubType) Enum.valueOf(LikesSubType.class, str);
    }

    public static LikesSubType[] values() {
        return (LikesSubType[]) $VALUES.clone();
    }
}
