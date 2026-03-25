package o;

import com.ibm.icu.impl.number.Modifier;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.text.NumberFormat;
import o.AbstractC7236afy;

/* JADX INFO: renamed from: o.afw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7234afw extends C7230afs {
    public int AEQbTJ;
    public int AhwBna;
    public NumberFormatter.SignDisplay OLrzqt;
    public boolean valueOf;

    public C7234afw(int i, boolean z, int i2, NumberFormatter.SignDisplay signDisplay) {
        this.AEQbTJ = i;
        this.valueOf = z;
        this.AhwBna = i2;
        this.OLrzqt = signDisplay;
    }

    public C7234afw AEQbTJ(int i) {
        if (i >= 1 && i <= 999) {
            C7234afw c7234afwDjBIcL = djBIcL();
            c7234afwDjBIcL.AhwBna = i;
            return c7234afwDjBIcL;
        }
        throw new java.lang.IllegalArgumentException("Integer digits must be between 1 and 999 (inclusive)");
    }

    public C7234afw AEQbTJ(NumberFormatter.SignDisplay signDisplay) {
        C7234afw c7234afwDjBIcL = djBIcL();
        c7234afwDjBIcL.OLrzqt = signDisplay;
        return c7234afwDjBIcL;
    }

    public C7234afw djBIcL() {
        return new C7234afw(this.AEQbTJ, this.valueOf, this.AhwBna, this.OLrzqt);
    }

    public InterfaceC7171aem KWHzl(DecimalFormatSymbols decimalFormatSymbols, boolean z, InterfaceC7171aem interfaceC7171aem) {
        return new Activity(decimalFormatSymbols, z, interfaceC7171aem);
    }

    /* JADX INFO: renamed from: o.afw$Activity */
    public static class Activity implements InterfaceC7171aem, InterfaceC7177aes, Modifier {
        public final TaskDescription[] AEQbTJ;
        public final DecimalFormatSymbols EZpvd;
        public final InterfaceC7171aem KWHzl;
        public int OLrzqt;
        public final C7234afw copydefault;

        @Override // com.ibm.icu.impl.number.Modifier
        public int AEQbTJ() {
            return 999;
        }

        @Override // com.ibm.icu.impl.number.Modifier
        public int OLrzqt() {
            return 0;
        }

        public Activity(C7234afw c7234afw, DecimalFormatSymbols decimalFormatSymbols, boolean z, InterfaceC7171aem interfaceC7171aem) {
            this.copydefault = c7234afw;
            this.EZpvd = decimalFormatSymbols;
            this.KWHzl = interfaceC7171aem;
            if (!z) {
                this.AEQbTJ = null;
                return;
            }
            this.AEQbTJ = new TaskDescription[25];
            for (int i = -12; i <= 12; i++) {
                this.AEQbTJ[i + 12] = new TaskDescription(i, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        @Override // o.InterfaceC7171aem
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C7169aek EZpvd(InterfaceC7163aee interfaceC7163aee) {
            int i;
            C7169aek c7169aekEZpvd = this.KWHzl.EZpvd(interfaceC7163aee);
            if (interfaceC7163aee.isInfinite() || interfaceC7163aee.isNaN()) {
                c7169aekEZpvd.AhwBna = C7162aed.KWHzl;
                return c7169aekEZpvd;
            }
            if (interfaceC7163aee.valueOf()) {
                C7234afw c7234afw = this.copydefault;
                if (c7234afw.valueOf) {
                    AbstractC7236afy abstractC7236afy = c7169aekEZpvd.AkhnZx;
                    if (abstractC7236afy instanceof AbstractC7236afy.LoaderManager) {
                        ((AbstractC7236afy.LoaderManager) abstractC7236afy).AEQbTJ(interfaceC7163aee, c7234afw.AEQbTJ);
                    } else {
                        c7169aekEZpvd.AkhnZx.AEQbTJ(interfaceC7163aee);
                    }
                    i = 0;
                }
            } else {
                i = -c7169aekEZpvd.AkhnZx.EZpvd(interfaceC7163aee, this);
            }
            TaskDescription[] taskDescriptionArr = this.AEQbTJ;
            if (taskDescriptionArr != null && i >= -12 && i <= 12) {
                c7169aekEZpvd.AhwBna = taskDescriptionArr[i + 12];
            } else if (taskDescriptionArr != null) {
                c7169aekEZpvd.AhwBna = new TaskDescription(i, this);
            } else {
                this.OLrzqt = i;
                c7169aekEZpvd.AhwBna = this;
            }
            interfaceC7163aee.KWHzl(i);
            c7169aekEZpvd.AkhnZx = null;
            return c7169aekEZpvd;
        }

        @Override // o.InterfaceC7177aes
        public int OLrzqt(int i) {
            C7234afw c7234afw = this.copydefault;
            int i2 = c7234afw.AEQbTJ;
            if (!c7234afw.valueOf) {
                i2 = i2 <= 1 ? 1 : (((i % i2) + i2) % i2) + 1;
            }
            return (i2 - i) - 1;
        }

        @Override // com.ibm.icu.impl.number.Modifier
        public int AEQbTJ(C7020abU c7020abU, int i, int i2) {
            return KWHzl(this.OLrzqt, c7020abU, i2);
        }

        public final int KWHzl(int i, C7020abU c7020abU, int i2) {
            int iCopydefault;
            int iAbs;
            int i3;
            int iCopydefault2 = c7020abU.copydefault(i2, this.EZpvd.getExponentSeparator(), NumberFormat.Field.EXPONENT_SYMBOL) + i2;
            if (i < 0 && this.copydefault.OLrzqt != NumberFormatter.SignDisplay.NEVER) {
                iCopydefault = c7020abU.copydefault(iCopydefault2, this.EZpvd.getMinusSignString(), NumberFormat.Field.EXPONENT_SIGN);
            } else {
                if (i >= 0 && this.copydefault.OLrzqt == NumberFormatter.SignDisplay.ALWAYS) {
                    iCopydefault = c7020abU.copydefault(iCopydefault2, this.EZpvd.getPlusSignString(), NumberFormat.Field.EXPONENT_SIGN);
                }
                iAbs = java.lang.Math.abs(i);
                i3 = 0;
                while (true) {
                    if (i3 < this.copydefault.AhwBna && iAbs <= 0) {
                        return iCopydefault2 - i2;
                    }
                    iCopydefault2 += c7020abU.copydefault(iCopydefault2 - i3, this.EZpvd.getDigitStringsLocal()[iAbs % 10], NumberFormat.Field.EXPONENT);
                    i3++;
                    iAbs /= 10;
                }
            }
            iCopydefault2 += iCopydefault;
            iAbs = java.lang.Math.abs(i);
            i3 = 0;
            while (true) {
                if (i3 < this.copydefault.AhwBna) {
                }
                iCopydefault2 += c7020abU.copydefault(iCopydefault2 - i3, this.EZpvd.getDigitStringsLocal()[iAbs % 10], NumberFormat.Field.EXPONENT);
                i3++;
                iAbs /= 10;
            }
        }
    }

    /* JADX INFO: renamed from: o.afw$TaskDescription */
    public static class TaskDescription implements Modifier {
        public final Activity EZpvd;
        public final int KWHzl;

        @Override // com.ibm.icu.impl.number.Modifier
        public int AEQbTJ() {
            return 999;
        }

        @Override // com.ibm.icu.impl.number.Modifier
        public int OLrzqt() {
            return 0;
        }

        public TaskDescription(int i, Activity activity) {
            this.KWHzl = i;
            this.EZpvd = activity;
        }

        @Override // com.ibm.icu.impl.number.Modifier
        public int AEQbTJ(C7020abU c7020abU, int i, int i2) {
            return this.EZpvd.KWHzl(this.KWHzl, c7020abU, i2);
        }
    }
}
