package com.ibm.icu.util;

import java.util.HashMap;
import java.util.Map;
import o.C7027acA;
import o.InterfaceC7054acb;

/* JADX INFO: loaded from: classes22.dex */
@Deprecated
public class GenderInfo {
    public static GenderInfo AEQbTJ = new GenderInfo(ListGenderStyle.NEUTRAL);
    public static ActionBar KWHzl = new ActionBar(null);
    public final ListGenderStyle EZpvd;

    @Deprecated
    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    @Deprecated
    public enum ListGenderStyle {
        NEUTRAL,
        MIXED_NEUTRAL,
        MALE_TAINTS;

        private static Map<String, ListGenderStyle> fromNameMap;

        static {
            ListGenderStyle listGenderStyle = NEUTRAL;
            ListGenderStyle listGenderStyle2 = MIXED_NEUTRAL;
            ListGenderStyle listGenderStyle3 = MALE_TAINTS;
            HashMap map = new HashMap(3);
            fromNameMap = map;
            map.put("neutral", listGenderStyle);
            fromNameMap.put("maleTaints", listGenderStyle3);
            fromNameMap.put("mixedNeutral", listGenderStyle2);
        }

        @Deprecated
        public static ListGenderStyle fromName(String str) {
            ListGenderStyle listGenderStyle = fromNameMap.get(str);
            if (listGenderStyle != null) {
                return listGenderStyle;
            }
            throw new IllegalArgumentException("Unknown gender style name: " + str);
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.util.GenderInfo$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[ListGenderStyle.values().length];
            OLrzqt = iArr;
            try {
                iArr[ListGenderStyle.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[ListGenderStyle.MIXED_NEUTRAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[ListGenderStyle.MALE_TAINTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Gender.values().length];
            EZpvd = iArr2;
            try {
                iArr2[Gender.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EZpvd[Gender.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EZpvd[Gender.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Deprecated
    public GenderInfo(ListGenderStyle listGenderStyle) {
        this.EZpvd = listGenderStyle;
    }

    public static class ActionBar {
        public final InterfaceC7054acb<ULocale, GenderInfo> AEQbTJ;

        private ActionBar() {
            this.AEQbTJ = new C7027acA();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:223) call: com.ibm.icu.util.GenderInfo.ActionBar.<init>():void type: THIS */
        public /* synthetic */ ActionBar(AnonymousClass4 anonymousClass4) {
            this();
        }
    }
}
