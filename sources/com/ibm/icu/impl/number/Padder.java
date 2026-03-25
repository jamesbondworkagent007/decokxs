package com.ibm.icu.impl.number;

import o.C7020abU;

/* JADX INFO: loaded from: classes3.dex */
public class Padder {
    public static final Padder copydefault = new Padder(null, -1, null);
    public int AEQbTJ;
    public PadPosition KWHzl;
    public String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.AEQbTJ > 0;
    }

    public enum PadPosition {
        BEFORE_PREFIX,
        AFTER_PREFIX,
        BEFORE_SUFFIX,
        AFTER_SUFFIX;

        public static PadPosition fromOld(int i) {
            if (i == 0) {
                return BEFORE_PREFIX;
            }
            if (i == 1) {
                return AFTER_PREFIX;
            }
            if (i == 2) {
                return BEFORE_SUFFIX;
            }
            if (i == 3) {
                return AFTER_SUFFIX;
            }
            throw new IllegalArgumentException("Don't know how to map " + i);
        }

        public int toOld() {
            int i = AnonymousClass5.EZpvd[ordinal()];
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i != 3) {
                return i != 4 ? -1 : 3;
            }
            return 2;
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.impl.number.Padder$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[PadPosition.values().length];
            EZpvd = iArr;
            try {
                iArr[PadPosition.BEFORE_PREFIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EZpvd[PadPosition.AFTER_PREFIX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EZpvd[PadPosition.BEFORE_SUFFIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EZpvd[PadPosition.AFTER_SUFFIX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Padder(String str, int i, PadPosition padPosition) {
        this.OLrzqt = str == null ? " " : str;
        this.AEQbTJ = i;
        this.KWHzl = padPosition == null ? PadPosition.BEFORE_PREFIX : padPosition;
    }

    public static Padder AEQbTJ(DecimalFormatProperties decimalFormatProperties) {
        return new Padder(decimalFormatProperties.getPadString(), decimalFormatProperties.getFormatWidth(), decimalFormatProperties.getPadPosition());
    }

    public int OLrzqt(Modifier modifier, Modifier modifier2, C7020abU c7020abU, int i, int i2) {
        int iCopydefault;
        int iCopydefault2;
        int iAEQbTJ = (this.AEQbTJ - (modifier.AEQbTJ() + modifier2.AEQbTJ())) - c7020abU.AEQbTJ();
        if (iAEQbTJ <= 0) {
            int iAEQbTJ2 = modifier.AEQbTJ(c7020abU, i, i2);
            return iAEQbTJ2 + modifier2.AEQbTJ(c7020abU, i, i2 + iAEQbTJ2);
        }
        PadPosition padPosition = this.KWHzl;
        if (padPosition == PadPosition.AFTER_PREFIX) {
            iCopydefault = copydefault(this.OLrzqt, iAEQbTJ, c7020abU, i);
        } else {
            iCopydefault = padPosition == PadPosition.BEFORE_SUFFIX ? copydefault(this.OLrzqt, iAEQbTJ, c7020abU, i2) : 0;
        }
        int iAEQbTJ3 = iCopydefault + modifier.AEQbTJ(c7020abU, i, i2 + iCopydefault);
        int iAEQbTJ4 = iAEQbTJ3 + modifier2.AEQbTJ(c7020abU, i, i2 + iAEQbTJ3);
        PadPosition padPosition2 = this.KWHzl;
        if (padPosition2 == PadPosition.BEFORE_PREFIX) {
            iCopydefault2 = copydefault(this.OLrzqt, iAEQbTJ, c7020abU, i);
        } else {
            if (padPosition2 != PadPosition.AFTER_SUFFIX) {
                return iAEQbTJ4;
            }
            iCopydefault2 = copydefault(this.OLrzqt, iAEQbTJ, c7020abU, i2 + iAEQbTJ4);
        }
        return iAEQbTJ4 + iCopydefault2;
    }

    public static int copydefault(String str, int i, C7020abU c7020abU, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            c7020abU.copydefault(i2, str, (Object) null);
        }
        return str.length() * i;
    }
}
