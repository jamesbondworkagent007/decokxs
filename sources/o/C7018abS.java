package o;

import com.ibm.icu.text.UnicodeSet;

/* JADX INFO: renamed from: o.abS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7018abS {
    public static final UnicodeSet[] OLrzqt = new UnicodeSet[40];

    public static UnicodeSet AEQbTJ(int i) {
        UnicodeSet[] unicodeSetArr = OLrzqt;
        if (unicodeSetArr[i] == null) {
            UnicodeSet unicodeSet = new UnicodeSet();
            switch (i) {
                case 1:
                    C7038acL.AhwBna.copydefault(unicodeSet);
                    break;
                case 2:
                    C7038acL.AhwBna.KWHzl(unicodeSet);
                    break;
                case 3:
                default:
                    throw new java.lang.IllegalStateException("getInclusions(unknown src " + i + ")");
                case 4:
                    C7034acH.OLrzqt.KWHzl(unicodeSet);
                    break;
                case 5:
                    C7030acD.KWHzl.OLrzqt(unicodeSet);
                    break;
                case 6:
                    C7038acL c7038acL = C7038acL.AhwBna;
                    c7038acL.copydefault(unicodeSet);
                    c7038acL.KWHzl(unicodeSet);
                    break;
                case 7:
                    C7067aco.AEQbTJ().AhwBna.copydefault(unicodeSet);
                    C7034acH.OLrzqt.KWHzl(unicodeSet);
                    break;
                case 8:
                    C7067aco.AEQbTJ().AhwBna.copydefault(unicodeSet);
                    break;
                case 9:
                    C7067aco.OLrzqt().AhwBna.copydefault(unicodeSet);
                    break;
                case 10:
                    C7067aco.copydefault().AhwBna.copydefault(unicodeSet);
                    break;
                case 11:
                    C7067aco.AEQbTJ().AhwBna.AEQbTJ(unicodeSet);
                    break;
                case 12:
                case 13:
                case 14:
                    C7038acL.AEQbTJ(i, unicodeSet);
                    break;
            }
            unicodeSetArr[i] = unicodeSet.KWHzl();
        }
        return unicodeSetArr[i];
    }

    public static UnicodeSet EZpvd(int i) {
        int i2 = i - 4081;
        UnicodeSet unicodeSet = OLrzqt[i2];
        if (unicodeSet != null) {
            return unicodeSet;
        }
        UnicodeSet unicodeSetAEQbTJ = AEQbTJ(C7038acL.AhwBna.AkhnZx(i));
        UnicodeSet unicodeSet2 = new UnicodeSet(0, 0);
        int iDjBIcL = unicodeSetAEQbTJ.djBIcL();
        int i3 = 0;
        for (int i4 = 0; i4 < iDjBIcL; i4++) {
            int iDjBIcL2 = unicodeSetAEQbTJ.djBIcL(i4);
            for (int iAYXKKw = unicodeSetAEQbTJ.AYXKKw(i4); iAYXKKw <= iDjBIcL2; iAYXKKw++) {
                int iCopydefault = C7223afl.copydefault(iAYXKKw, i);
                if (iCopydefault != i3) {
                    unicodeSet2.KWHzl(iAYXKKw);
                    i3 = iCopydefault;
                }
            }
        }
        UnicodeSet[] unicodeSetArr = OLrzqt;
        UnicodeSet unicodeSetKWHzl = unicodeSet2.KWHzl();
        unicodeSetArr[i2] = unicodeSetKWHzl;
        return unicodeSetKWHzl;
    }

    public static UnicodeSet OLrzqt(int i) {
        synchronized (C7018abS.class) {
            if (4096 <= i && i < 4121) {
                return EZpvd(i);
            }
            return AEQbTJ(C7038acL.AhwBna.AkhnZx(i));
        }
    }
}
