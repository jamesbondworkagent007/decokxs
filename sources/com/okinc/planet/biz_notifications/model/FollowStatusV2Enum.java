package com.okinc.planet.biz_notifications.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class FollowStatusV2Enum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FollowStatusV2Enum[] $VALUES;
    public static final Activity Companion;
    private final String status;
    public static final FollowStatusV2Enum NOT_FOLLOW_EACH_OTHER = new FollowStatusV2Enum("NOT_FOLLOW_EACH_OTHER", 0, "0");
    public static final FollowStatusV2Enum FOLLOWING_EACH_OTHER = new FollowStatusV2Enum("FOLLOWING_EACH_OTHER", 1, "1");
    public static final FollowStatusV2Enum OTHER_PARTY_FOLLOW_ME = new FollowStatusV2Enum("OTHER_PARTY_FOLLOW_ME", 2, "2");
    public static final FollowStatusV2Enum I_FOLLOWING_OTHER_PARTY = new FollowStatusV2Enum("I_FOLLOWING_OTHER_PARTY", 3, "3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FollowStatusV2Enum[] $values() {
        return new FollowStatusV2Enum[]{NOT_FOLLOW_EACH_OTHER, FOLLOWING_EACH_OTHER, OTHER_PARTY_FOLLOW_ME, I_FOLLOWING_OTHER_PARTY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FollowStatusV2Enum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    private FollowStatusV2Enum(String str, int i, String str2) {
        this.status = str2;
    }

    static {
        FollowStatusV2Enum[] followStatusV2EnumArr$values = $values();
        $VALUES = followStatusV2EnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(followStatusV2EnumArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {

        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[FollowStatusV2Enum.values().length];
                try {
                    iArr[FollowStatusV2Enum.NOT_FOLLOW_EACH_OTHER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FollowStatusV2Enum.FOLLOWING_EACH_OTHER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FollowStatusV2Enum.OTHER_PARTY_FOLLOW_ME.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FollowStatusV2Enum.I_FOLLOWING_OTHER_PARTY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_notifications.model.FollowStatusV2Enum.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final FollowStatusV2Enum AEQbTJ(String str) {
            for (FollowStatusV2Enum followStatusV2Enum : FollowStatusV2Enum.values()) {
                if (followStatusV2Enum.getStatus().equals(str)) {
                    return followStatusV2Enum;
                }
            }
            return null;
        }

        public final boolean OLrzqt(String str) {
            return EZpvd(AEQbTJ(str));
        }

        public final boolean EZpvd(FollowStatusV2Enum followStatusV2Enum) {
            return followStatusV2Enum == FollowStatusV2Enum.FOLLOWING_EACH_OTHER || followStatusV2Enum == FollowStatusV2Enum.I_FOLLOWING_OTHER_PARTY;
        }

        public final boolean copydefault(FollowStatusV2Enum followStatusV2Enum) {
            return followStatusV2Enum == FollowStatusV2Enum.FOLLOWING_EACH_OTHER || followStatusV2Enum == FollowStatusV2Enum.OTHER_PARTY_FOLLOW_ME;
        }

        public final FollowStatusV2Enum copydefault(String str) {
            return AEQbTJ(AEQbTJ(str));
        }

        public final FollowStatusV2Enum AEQbTJ(FollowStatusV2Enum followStatusV2Enum) {
            int i = followStatusV2Enum == null ? -1 : ActionBar.AEQbTJ[followStatusV2Enum.ordinal()];
            if (i == 1) {
                return FollowStatusV2Enum.I_FOLLOWING_OTHER_PARTY;
            }
            if (i == 2) {
                return FollowStatusV2Enum.OTHER_PARTY_FOLLOW_ME;
            }
            if (i == 3) {
                return FollowStatusV2Enum.FOLLOWING_EACH_OTHER;
            }
            if (i == 4) {
                return FollowStatusV2Enum.NOT_FOLLOW_EACH_OTHER;
            }
            return FollowStatusV2Enum.NOT_FOLLOW_EACH_OTHER;
        }
    }

    public static FollowStatusV2Enum valueOf(String str) {
        return (FollowStatusV2Enum) Enum.valueOf(FollowStatusV2Enum.class, str);
    }

    public static FollowStatusV2Enum[] values() {
        return (FollowStatusV2Enum[]) $VALUES.clone();
    }
}
