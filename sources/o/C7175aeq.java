package o;

import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.impl.number.Modifier;
import com.ibm.icu.impl.number.PatternStringUtils;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.Currency;
import o.C7105adZ;

/* JADX INFO: renamed from: o.aeq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7175aeq implements Modifier, C7105adZ.TaskDescription, InterfaceC7171aem {
    public java.lang.StringBuilder AEQbTJ;
    public InterfaceC7102adW AYXKKw;
    public NumberFormatter.SignDisplay AhwBna;
    public NumberFormatter.UnitWidth DbNXlk;
    public final boolean EZpvd;
    public Currency KWHzl;
    public NumberFormat.Field OLrzqt;
    public InterfaceC7171aem copydefault;
    public boolean djBIcL;
    public DecimalFormatSymbols fetchVPNInfo;
    public StandardPlural gEmmrt;
    public Modifier.Signum isConnected;
    public PluralRules valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(NumberFormatter.SignDisplay signDisplay, boolean z) {
        this.AhwBna = signDisplay;
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(InterfaceC7102adW interfaceC7102adW, NumberFormat.Field field) {
        this.AYXKKw = interfaceC7102adW;
        this.OLrzqt = field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC7171aem OLrzqt(InterfaceC7171aem interfaceC7171aem) {
        this.copydefault = interfaceC7171aem;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(Modifier.Signum signum, StandardPlural standardPlural) {
        this.isConnected = signum;
        this.gEmmrt = standardPlural;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(DecimalFormatSymbols decimalFormatSymbols, Currency currency, NumberFormatter.UnitWidth unitWidth, PluralRules pluralRules) {
        this.fetchVPNInfo = decimalFormatSymbols;
        this.KWHzl = currency;
        this.DbNXlk = unitWidth;
        this.valueOf = pluralRules;
    }

    public C7175aeq(boolean z) {
        this.EZpvd = z;
    }

    public boolean copydefault() {
        return this.AYXKKw.copydefault(-7);
    }

    public TaskDescription KWHzl() {
        C7020abU c7020abU = new C7020abU();
        C7020abU c7020abU2 = new C7020abU();
        if (copydefault()) {
            C7103adX c7103adX = new C7103adX();
            for (StandardPlural standardPlural : StandardPlural.VALUES) {
                Modifier.Signum signum = Modifier.Signum.POS;
                OLrzqt(signum, standardPlural);
                c7103adX.AEQbTJ(signum, standardPlural, AEQbTJ(c7020abU, c7020abU2));
                Modifier.Signum signum2 = Modifier.Signum.POS_ZERO;
                OLrzqt(signum2, standardPlural);
                c7103adX.AEQbTJ(signum2, standardPlural, AEQbTJ(c7020abU, c7020abU2));
                Modifier.Signum signum3 = Modifier.Signum.NEG_ZERO;
                OLrzqt(signum3, standardPlural);
                c7103adX.AEQbTJ(signum3, standardPlural, AEQbTJ(c7020abU, c7020abU2));
                Modifier.Signum signum4 = Modifier.Signum.NEG;
                OLrzqt(signum4, standardPlural);
                c7103adX.AEQbTJ(signum4, standardPlural, AEQbTJ(c7020abU, c7020abU2));
            }
            c7103adX.AEQbTJ();
            return new TaskDescription(c7103adX, this.valueOf);
        }
        OLrzqt(Modifier.Signum.POS, null);
        C7161aec c7161aecAEQbTJ = AEQbTJ(c7020abU, c7020abU2);
        OLrzqt(Modifier.Signum.POS_ZERO, null);
        C7161aec c7161aecAEQbTJ2 = AEQbTJ(c7020abU, c7020abU2);
        OLrzqt(Modifier.Signum.NEG_ZERO, null);
        C7161aec c7161aecAEQbTJ3 = AEQbTJ(c7020abU, c7020abU2);
        OLrzqt(Modifier.Signum.NEG, null);
        return new TaskDescription(new C7103adX(c7161aecAEQbTJ, c7161aecAEQbTJ2, c7161aecAEQbTJ3, AEQbTJ(c7020abU, c7020abU2)), null);
    }

    public final C7161aec AEQbTJ(C7020abU c7020abU, C7020abU c7020abU2) {
        copydefault(c7020abU.EZpvd(), 0);
        EZpvd(c7020abU2.EZpvd(), 0);
        if (this.AYXKKw.KWHzl()) {
            return new C7159aea(c7020abU, c7020abU2, !this.AYXKKw.EZpvd(), this.EZpvd, this.fetchVPNInfo);
        }
        return new C7161aec(c7020abU, c7020abU2, !this.AYXKKw.EZpvd(), this.EZpvd);
    }

    /* JADX INFO: renamed from: o.aeq$TaskDescription */
    public static class TaskDescription implements InterfaceC7171aem {
        public final C7103adX AEQbTJ;
        public final PluralRules EZpvd;
        public InterfaceC7171aem KWHzl = null;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription KWHzl(InterfaceC7171aem interfaceC7171aem) {
            this.KWHzl = interfaceC7171aem;
            return this;
        }

        public TaskDescription(C7103adX c7103adX, PluralRules pluralRules) {
            this.AEQbTJ = c7103adX;
            this.EZpvd = pluralRules;
        }

        @Override // o.InterfaceC7171aem
        public C7169aek EZpvd(InterfaceC7163aee interfaceC7163aee) {
            C7169aek c7169aekEZpvd = this.KWHzl.EZpvd(interfaceC7163aee);
            AbstractC7236afy abstractC7236afy = c7169aekEZpvd.AkhnZx;
            if (abstractC7236afy != null) {
                abstractC7236afy.AEQbTJ(interfaceC7163aee);
            }
            if (c7169aekEZpvd.djBIcL != null) {
                return c7169aekEZpvd;
            }
            AEQbTJ(c7169aekEZpvd, interfaceC7163aee);
            return c7169aekEZpvd;
        }

        public void AEQbTJ(C7169aek c7169aek, InterfaceC7163aee interfaceC7163aee) {
            PluralRules pluralRules = this.EZpvd;
            if (pluralRules == null) {
                c7169aek.djBIcL = this.AEQbTJ.KWHzl(interfaceC7163aee.AYXKKw());
            } else {
                c7169aek.djBIcL = this.AEQbTJ.EZpvd(interfaceC7163aee.AYXKKw(), C7180aev.EZpvd(c7169aek.AkhnZx, pluralRules, interfaceC7163aee));
            }
        }
    }

    @Override // o.InterfaceC7171aem
    public C7169aek EZpvd(InterfaceC7163aee interfaceC7163aee) {
        C7169aek c7169aekEZpvd = this.copydefault.EZpvd(interfaceC7163aee);
        AbstractC7236afy abstractC7236afy = c7169aekEZpvd.AkhnZx;
        if (abstractC7236afy != null) {
            abstractC7236afy.AEQbTJ(interfaceC7163aee);
        }
        if (c7169aekEZpvd.djBIcL != null) {
            return c7169aekEZpvd;
        }
        if (copydefault()) {
            OLrzqt(interfaceC7163aee.AYXKKw(), C7180aev.EZpvd(c7169aekEZpvd.AkhnZx, this.valueOf, interfaceC7163aee));
        } else {
            OLrzqt(interfaceC7163aee.AYXKKw(), null);
        }
        c7169aekEZpvd.djBIcL = this;
        return c7169aekEZpvd;
    }

    @Override // com.ibm.icu.impl.number.Modifier
    public int AEQbTJ(C7020abU c7020abU, int i, int i2) {
        int iCopydefault = copydefault(c7020abU, i);
        int i3 = i2 + iCopydefault;
        int iEZpvd = EZpvd(c7020abU, i3);
        int iCopydefault2 = !this.AYXKKw.EZpvd() ? c7020abU.copydefault(i + iCopydefault, i3, "", 0, 0, null) : 0;
        C7159aea.AEQbTJ(c7020abU, i, iCopydefault, i3 + iCopydefault2, iEZpvd, this.fetchVPNInfo);
        return iCopydefault + iCopydefault2 + iEZpvd;
    }

    @Override // com.ibm.icu.impl.number.Modifier
    public int OLrzqt() {
        AEQbTJ(true);
        return C7105adZ.OLrzqt(this.AEQbTJ, true, this);
    }

    @Override // com.ibm.icu.impl.number.Modifier
    public int AEQbTJ() {
        AEQbTJ(true);
        int iOLrzqt = C7105adZ.OLrzqt(this.AEQbTJ, false, this);
        AEQbTJ(false);
        return iOLrzqt + C7105adZ.OLrzqt(this.AEQbTJ, false, this);
    }

    public final int copydefault(C7020abU c7020abU, int i) {
        AEQbTJ(true);
        return C7105adZ.KWHzl(this.AEQbTJ, c7020abU, i, this, this.OLrzqt);
    }

    public final int EZpvd(C7020abU c7020abU, int i) {
        AEQbTJ(false);
        return C7105adZ.KWHzl(this.AEQbTJ, c7020abU, i, this, this.OLrzqt);
    }

    public final void AEQbTJ(boolean z) {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = new java.lang.StringBuilder();
        }
        PatternStringUtils.copydefault(this.AYXKKw, z, PatternStringUtils.copydefault(this.AhwBna, this.isConnected), this.gEmmrt, this.djBIcL, this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.aeq$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[NumberFormatter.UnitWidth.values().length];
            KWHzl = iArr;
            try {
                iArr[NumberFormatter.UnitWidth.SHORT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                KWHzl[NumberFormatter.UnitWidth.NARROW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                KWHzl[NumberFormatter.UnitWidth.FORMAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                KWHzl[NumberFormatter.UnitWidth.VARIANT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // o.C7105adZ.TaskDescription
    public java.lang.CharSequence copydefault(int i) {
        int i2 = 3;
        switch (i) {
            case -9:
                return this.KWHzl.getName(this.fetchVPNInfo.getULocale(), 3, (boolean[]) null);
            case -8:
                return "�";
            case -7:
                return this.KWHzl.getName(this.fetchVPNInfo.getULocale(), 2, this.gEmmrt.getKeyword(), (boolean[]) null);
            case -6:
                return this.KWHzl.getCurrencyCode();
            case -5:
                NumberFormatter.UnitWidth unitWidth = this.DbNXlk;
                if (unitWidth == NumberFormatter.UnitWidth.ISO_CODE) {
                    return this.KWHzl.getCurrencyCode();
                }
                if (unitWidth == NumberFormatter.UnitWidth.HIDDEN) {
                    return "";
                }
                int i3 = AnonymousClass3.KWHzl[unitWidth.ordinal()];
                if (i3 == 1) {
                    i2 = 0;
                } else if (i3 != 2) {
                    if (i3 == 3) {
                        i2 = 4;
                    } else {
                        if (i3 != 4) {
                            throw new java.lang.AssertionError();
                        }
                        i2 = 5;
                    }
                }
                return this.KWHzl.getName(this.fetchVPNInfo.getULocale(), i2, (boolean[]) null);
            case -4:
                return this.fetchVPNInfo.getPerMillString();
            case -3:
                return this.fetchVPNInfo.getPercentString();
            case -2:
                return this.fetchVPNInfo.getPlusSignString();
            case -1:
                return this.fetchVPNInfo.getMinusSignString();
            default:
                throw new java.lang.AssertionError();
        }
    }
}
