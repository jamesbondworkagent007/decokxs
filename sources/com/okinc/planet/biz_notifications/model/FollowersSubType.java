package com.okinc.planet.biz_notifications.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class FollowersSubType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FollowersSubType[] $VALUES;
    public static final StateListAnimator Companion;
    public static final FollowersSubType Subscribe = new FollowersSubType("Subscribe", 0, 1);
    private final int subType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FollowersSubType[] $values() {
        return new FollowersSubType[]{Subscribe};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FollowersSubType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubType() {
        return this.subType;
    }

    private FollowersSubType(String str, int i, int i2) {
        this.subType = i2;
    }

    static {
        FollowersSubType[] followersSubTypeArr$values = $values();
        $VALUES = followersSubTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(followersSubTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_notifications.model.FollowersSubType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final FollowersSubType KWHzl(int i) {
            for (FollowersSubType followersSubType : FollowersSubType.values()) {
                if (followersSubType.getSubType() == i) {
                    return followersSubType;
                }
            }
            return null;
        }
    }

    public static FollowersSubType valueOf(String str) {
        return (FollowersSubType) Enum.valueOf(FollowersSubType.class, str);
    }

    public static FollowersSubType[] values() {
        return (FollowersSubType[]) $VALUES.clone();
    }
}
