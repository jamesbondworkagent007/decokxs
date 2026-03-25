package com.ibm.icu.lang;

import o.C7038acL;
import o.C7223afl;

/* JADX INFO: loaded from: classes3.dex */
public final class UScript {
    public static final ScriptUsage[] copydefault = ScriptUsage.values();

    public enum ScriptUsage {
        NOT_ENCODED,
        UNKNOWN,
        EXCLUDED,
        LIMITED_USE,
        ASPIRATIONAL,
        RECOMMENDED
    }

    public static final int EZpvd(String str) {
        int iAEQbTJ = C7223afl.AEQbTJ(4106, str);
        if (iAEQbTJ == -1) {
            return -1;
        }
        return iAEQbTJ;
    }

    public static final int OLrzqt(int i) {
        if ((i >= 0) & (i <= 1114111)) {
            C7038acL c7038acL = C7038acL.AhwBna;
            int iKWHzl = c7038acL.KWHzl(i, 0) & 15728895;
            int iDjBIcL = C7038acL.djBIcL(iKWHzl);
            if (iKWHzl < 4194304) {
                return iDjBIcL;
            }
            if (iKWHzl < 8388608) {
                return 0;
            }
            if (iKWHzl < 12582912) {
                return 1;
            }
            return c7038acL.fJNWhG[iDjBIcL];
        }
        throw new IllegalArgumentException(Integer.toString(i));
    }

    public static final boolean KWHzl(int i, int i2) {
        char c;
        C7038acL c7038acL = C7038acL.AhwBna;
        int iKWHzl = c7038acL.KWHzl(i, 0) & 15728895;
        int iDjBIcL = C7038acL.djBIcL(iKWHzl);
        if (iKWHzl < 4194304) {
            return i2 == iDjBIcL;
        }
        char[] cArr = c7038acL.fJNWhG;
        int i3 = iDjBIcL;
        if (iKWHzl >= 12582912) {
            i3 = cArr[iDjBIcL + 1];
        }
        int i4 = i3;
        if (i2 > 32767) {
            return false;
        }
        while (true) {
            c = cArr[i4];
            if (i2 <= c) {
                break;
            }
            i4++;
        }
        return i2 == (32767 & c);
    }

    public static final String KWHzl(int i) {
        return C7223afl.EZpvd(4106, i, 0);
    }

    public static final class StateListAnimator {
        public static final int[] KWHzl = {10485824, 10486536, 27264552, 77595953, 10488213, 44052741, 73405380, 71304162, 77595695, 71369748, 10488069, 10490528, 10490067, 4260656, 77595561, 10488469, 10488341, 44063575, 10529792, 27264464, 44052555, 10488981, 44052651, 44046208, 44043941, 77594700, 10489109, 4200486, 44044288, 4200079, 4260608, 10488597, 4200096, 10489221, 23070480, 10488725, 10488853, 27264908, 44043799, 10489664, 6296768, 39887496, 4200195, 4200227, 4200259, 4200291, 2107406, 21039104, 6297856, 4259840, 4260992, 4260944, 39852368, 4260736, 0, 4200960, 71314432, 21039616, 6334464, 39852416, 6303024, 4260768, 6298373, 6298560, 0, 4263941, 6334976, 0, 0, 0, 0, 4272467, 0, 44063575, 44063575, 4287260, 88149153, 0, 6334852, 6334730, 0, 0, 6298624, 4261447, 23070784, 0, 21039488, 23070666, 21040128, 4260715, 4237376, 21039360, 6385408, 0, 0, 0, 0, 0, 0, 6333769, 0, 4268032, 0, 2162128, 4260512, 44052555, 39852576, 4260480, 21039392, 6298714, 4237616, 6334594, 4315216, 6298499, 0, 6335424, 21039168, 21039872, 6361347, 10529792, 4264067, 21039832, 21039968, 21040015, 0, 21039936, 20973568, 39889536, 0, 0, 6334112, 6333648, 0, 21039712, 4287206, 4308000, 4261120, 4264725, 0, 0, 21096450, 21039520, 21039765, 21039254, 21039219, 4264638, 71375028, 0, 0, 4287055, 37859780, 4264323, 4264144, 4265600, 37847593, 0, 4277248, 4264456, 4265092, 4261175, 4264274, 37820183, 21039348, 4265486, 4264591, 4266688, 4265358, 90302729, 4267022, 4267122, 6362130, 73467061, 44063575, 10490130, 0, 4267280, 4266588, 4266507, 4265995, 6364529, 4267749, 71396928, 23137554, 21040962, 21040921, 21041137, 6414600, 4266446, 6415073, 21041087, 4266252, 37850213, 21040776};

        private StateListAnimator() {
        }

        public static final int EZpvd(int i) {
            if (i < 0) {
                return 0;
            }
            int[] iArr = KWHzl;
            if (i < iArr.length) {
                return iArr[i];
            }
            return 0;
        }
    }

    public static final boolean AEQbTJ(int i) {
        return (StateListAnimator.EZpvd(i) & 16777216) != 0;
    }

    private UScript() {
    }
}
