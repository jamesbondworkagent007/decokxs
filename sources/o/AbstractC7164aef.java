package o;

import androidx.camera.video.AudioStats;
import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.impl.number.Modifier;
import com.ibm.icu.text.PluralRules;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.FieldPosition;

/* JADX INFO: renamed from: o.aef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7164aef implements InterfaceC7163aee {
    public static final double[] OLrzqt = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d};
    public static final byte[] copydefault = {9, 2, 2, 3, 3, 7, 2, 0, 3, 6, 8, 5, 4, 7, 7, 5, 8, 0, 8};
    public byte AEQbTJ;
    public boolean AYXKKw;
    public double AhwBna;
    public int djBIcL;
    public int valueOf;
    public int values;
    public int gEmmrt = 0;
    public int fetchVPNInfo = 0;
    public int EZpvd = 0;

    @java.lang.Deprecated
    public boolean KWHzl = false;

    public static int AEQbTJ(int i, int i2) {
        int i3 = i - i2;
        if (i2 < 0 && i3 < i) {
            return Integer.MAX_VALUE;
        }
        if (i2 <= 0 || i3 <= i) {
            return i3;
        }
        return Integer.MIN_VALUE;
    }

    public abstract void AYXKKw(int i);

    public abstract void AhwBna(int i);

    public abstract void AkhnZx(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AuCTel() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7163aee
    public int EZpvd() {
        int i = this.values + this.djBIcL;
        int i2 = this.gEmmrt;
        if (i2 > i) {
            i = i2;
        }
        return i - 1;
    }

    public abstract void EZpvd(int i, byte b);

    public abstract void EZpvd(InterfaceC7163aee interfaceC7163aee);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7163aee
    public int KWHzl() {
        int i = this.values;
        int i2 = this.fetchVPNInfo;
        return i2 < i ? i2 : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7163aee
    public void KWHzl(int i) {
        this.EZpvd += i;
    }

    public abstract void KWHzl(java.math.BigInteger bigInteger);

    public abstract void OLrzqt(long j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7163aee
    public void copydefault(int i) {
        this.fetchVPNInfo = -i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7163aee
    public boolean copydefault() {
        return (this.AEQbTJ & 1) != 0;
    }

    public abstract void ejfBZ();

    public abstract void fetchVPNInfo();

    public abstract byte gEmmrt(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7163aee
    public void gEmmrt() {
        this.AEQbTJ = (byte) (this.AEQbTJ ^ 1);
    }

    public abstract BigDecimal isConnected();

    public abstract void isConnected(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7163aee, com.ibm.icu.text.PluralRules.TaskDescription
    public boolean isInfinite() {
        return (this.AEQbTJ & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7163aee, com.ibm.icu.text.PluralRules.TaskDescription
    public boolean isNaN() {
        return (this.AEQbTJ & 4) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7163aee
    public void valueOf(int i) {
        int i2 = this.gEmmrt;
        if (i < i2) {
            i = i2;
        }
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7163aee
    public boolean valueOf() {
        return this.djBIcL == 0;
    }

    public void OLrzqt(InterfaceC7163aee interfaceC7163aee) {
        EZpvd(interfaceC7163aee);
        AbstractC7164aef abstractC7164aef = (AbstractC7164aef) interfaceC7163aee;
        this.gEmmrt = abstractC7164aef.gEmmrt;
        this.fetchVPNInfo = abstractC7164aef.fetchVPNInfo;
        this.values = abstractC7164aef.values;
        this.djBIcL = abstractC7164aef.djBIcL;
        this.AEQbTJ = abstractC7164aef.AEQbTJ;
        this.AhwBna = abstractC7164aef.AhwBna;
        this.valueOf = abstractC7164aef.valueOf;
        this.AYXKKw = abstractC7164aef.AYXKKw;
        this.EZpvd = abstractC7164aef.EZpvd;
    }

    public AbstractC7164aef values() {
        this.gEmmrt = 0;
        this.fetchVPNInfo = 0;
        this.AEQbTJ = (byte) 0;
        ejfBZ();
        return this;
    }

    @Override // o.InterfaceC7163aee
    public void OLrzqt(int i) {
        if (this.djBIcL == 0) {
            return;
        }
        if (i <= this.values) {
            ejfBZ();
            return;
        }
        int iAEQbTJ = AEQbTJ();
        if (i <= iAEQbTJ) {
            AhwBna((iAEQbTJ - i) + 1);
            fetchVPNInfo();
        }
    }

    @Override // o.InterfaceC7163aee
    public void copydefault(BigDecimal bigDecimal, MathContext mathContext) {
        BigDecimal bigDecimalRound = AhwBna().divide(bigDecimal, 0, mathContext.getRoundingMode()).multiply(bigDecimal).round(mathContext);
        if (bigDecimalRound.signum() == 0) {
            ejfBZ();
        } else {
            AEQbTJ(bigDecimalRound);
        }
    }

    @Override // o.InterfaceC7163aee
    public void copydefault(BigDecimal bigDecimal) {
        if (valueOf()) {
            return;
        }
        AEQbTJ(AhwBna().multiply(bigDecimal));
    }

    @Override // o.InterfaceC7163aee
    public int AEQbTJ() throws java.lang.ArithmeticException {
        if (this.djBIcL != 0) {
            return (this.values + r0) - 1;
        }
        throw new java.lang.ArithmeticException("Magnitude is not well-defined for zero");
    }

    @Override // o.InterfaceC7163aee
    public void AEQbTJ(int i) {
        if (this.djBIcL != 0) {
            this.values = C7045acS.EZpvd(this.values, i);
            this.valueOf = C7045acS.EZpvd(this.valueOf, i);
            C7045acS.EZpvd(this.values, this.djBIcL);
        }
    }

    @Override // o.InterfaceC7163aee
    public StandardPlural OLrzqt(PluralRules pluralRules) {
        if (pluralRules == null) {
            return StandardPlural.OTHER;
        }
        return StandardPlural.orOtherFromString(pluralRules.select(this));
    }

    /* JADX INFO: renamed from: o.aef$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[PluralRules.Operand.values().length];
            EZpvd = iArr;
            try {
                iArr[PluralRules.Operand.i.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                EZpvd[PluralRules.Operand.f.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                EZpvd[PluralRules.Operand.t.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                EZpvd[PluralRules.Operand.v.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                EZpvd[PluralRules.Operand.w.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                EZpvd[PluralRules.Operand.e.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.ibm.icu.text.PluralRules.TaskDescription
    public double getPluralOperand(PluralRules.Operand operand) {
        switch (AnonymousClass2.EZpvd[operand.ordinal()]) {
            case 1:
                boolean zCopydefault = copydefault();
                long jEZpvd = EZpvd(true);
                if (zCopydefault) {
                    jEZpvd = -jEZpvd;
                }
                return jEZpvd;
            case 2:
                return AEQbTJ(true);
            case 3:
                return AEQbTJ(false);
            case 4:
                return fARcdN();
            case 5:
                return fJNWhG();
            case 6:
                return AuCTel();
            default:
                return java.lang.Math.abs(fIwbmz());
        }
    }

    @Override // o.InterfaceC7163aee
    public void KWHzl(FieldPosition fieldPosition) {
        if (fieldPosition instanceof C7241agC) {
            ((C7241agC) fieldPosition).copydefault((int) getPluralOperand(PluralRules.Operand.v), (long) getPluralOperand(PluralRules.Operand.f));
        }
    }

    @Override // o.InterfaceC7163aee
    public byte EZpvd(int i) {
        return gEmmrt(i - this.values);
    }

    public final int fARcdN() {
        return java.lang.Math.max(0, (-KWHzl()) - this.EZpvd);
    }

    public final int fJNWhG() {
        return java.lang.Math.max((-this.values) - this.EZpvd, 0);
    }

    @Override // o.InterfaceC7163aee
    public Modifier.Signum AYXKKw() {
        boolean z = valueOf() && !isInfinite();
        boolean zCopydefault = copydefault();
        if (z && zCopydefault) {
            return Modifier.Signum.NEG_ZERO;
        }
        if (z) {
            return Modifier.Signum.POS_ZERO;
        }
        if (zCopydefault) {
            return Modifier.Signum.NEG;
        }
        return Modifier.Signum.POS;
    }

    public void values(int i) {
        ejfBZ();
        this.AEQbTJ = (byte) 0;
        if (i < 0) {
            this.AEQbTJ = (byte) 1;
            i = -i;
        }
        if (i != 0) {
            djBIcL(i);
            fetchVPNInfo();
        }
    }

    public final void djBIcL(int i) {
        if (i == Integer.MIN_VALUE) {
            OLrzqt(-i);
        } else {
            AYXKKw(i);
        }
    }

    public void copydefault(long j) {
        ejfBZ();
        this.AEQbTJ = (byte) 0;
        if (j < 0) {
            this.AEQbTJ = (byte) 1;
            j = -j;
        }
        if (j != 0) {
            AEQbTJ(j);
            fetchVPNInfo();
        }
    }

    public final void AEQbTJ(long j) {
        if (j == Long.MIN_VALUE) {
            KWHzl(java.math.BigInteger.valueOf(j).negate());
        } else if (j <= 2147483647L) {
            AYXKKw((int) j);
        } else {
            OLrzqt(j);
        }
    }

    public void OLrzqt(java.math.BigInteger bigInteger) {
        ejfBZ();
        this.AEQbTJ = (byte) 0;
        if (bigInteger.signum() == -1) {
            this.AEQbTJ = (byte) (this.AEQbTJ | 1);
            bigInteger = bigInteger.negate();
        }
        if (bigInteger.signum() != 0) {
            copydefault(bigInteger);
            fetchVPNInfo();
        }
    }

    public final void copydefault(java.math.BigInteger bigInteger) {
        if (bigInteger.bitLength() < 32) {
            AYXKKw(bigInteger.intValue());
        } else if (bigInteger.bitLength() < 64) {
            OLrzqt(bigInteger.longValue());
        } else {
            KWHzl(bigInteger);
        }
    }

    public void KWHzl(double d) {
        ejfBZ();
        this.AEQbTJ = (byte) 0;
        if (java.lang.Double.doubleToRawLongBits(d) < 0) {
            this.AEQbTJ = (byte) (this.AEQbTJ | 1);
            d = -d;
        }
        if (java.lang.Double.isNaN(d)) {
            this.AEQbTJ = (byte) (this.AEQbTJ | 4);
            return;
        }
        if (java.lang.Double.isInfinite(d)) {
            this.AEQbTJ = (byte) (this.AEQbTJ | 2);
        } else if (d != AudioStats.AUDIO_AMPLITUDE_NONE) {
            OLrzqt(d);
            fetchVPNInfo();
        }
    }

    public final void OLrzqt(double d) {
        double d2;
        this.AYXKKw = true;
        this.AhwBna = d;
        this.valueOf = 0;
        int iDoubleToLongBits = ((int) ((java.lang.Double.doubleToLongBits(d) & 9218868437227405312L) >> 52)) - 1023;
        if (iDoubleToLongBits <= 52) {
            long j = (long) d;
            if (j == d) {
                AEQbTJ(j);
                return;
            }
        }
        if (iDoubleToLongBits == -1023 || iDoubleToLongBits == 1024) {
            DbNXlk();
            return;
        }
        int i = (int) (((double) (52 - iDoubleToLongBits)) / 3.321928094887362d);
        if (i >= 0) {
            int i2 = i;
            while (i2 >= 22) {
                d *= 1.0E22d;
                i2 -= 22;
            }
            d2 = d * OLrzqt[i2];
        } else {
            int i3 = i;
            while (i3 <= -22) {
                d /= 1.0E22d;
                i3 += 22;
            }
            d2 = d / OLrzqt[-i3];
        }
        long jRound = java.lang.Math.round(d2);
        if (jRound != 0) {
            AEQbTJ(jRound);
            this.values -= i;
        }
    }

    public final void DbNXlk() {
        double d = this.AhwBna;
        int i = this.valueOf;
        ejfBZ();
        java.lang.String string = java.lang.Double.toString(d);
        if (string.indexOf(69) != -1) {
            int iIndexOf = string.indexOf(69);
            AEQbTJ(java.lang.Long.parseLong(string.charAt(0) + string.substring(2, iIndexOf)));
            this.values = this.values + (java.lang.Integer.parseInt(string.substring(iIndexOf + 1)) - (iIndexOf - 1)) + 1;
        } else if (string.charAt(0) == '0') {
            AEQbTJ(java.lang.Long.parseLong(string.substring(2)));
            this.values += 2 - string.length();
        } else if (string.charAt(string.length() - 1) == '0') {
            AEQbTJ(java.lang.Long.parseLong(string.substring(0, string.length() - 2)));
        } else {
            int iIndexOf2 = string.indexOf(46);
            AEQbTJ(java.lang.Long.parseLong(string.substring(0, iIndexOf2) + string.substring(iIndexOf2 + 1)));
            this.values = this.values + (iIndexOf2 - string.length()) + 1;
        }
        this.values += i;
        fetchVPNInfo();
        this.KWHzl = true;
    }

    @Override // o.InterfaceC7163aee
    public void AEQbTJ(BigDecimal bigDecimal) {
        ejfBZ();
        this.AEQbTJ = (byte) 0;
        if (bigDecimal.signum() == -1) {
            this.AEQbTJ = (byte) (this.AEQbTJ | 1);
            bigDecimal = bigDecimal.negate();
        }
        if (bigDecimal.signum() != 0) {
            EZpvd(bigDecimal);
            fetchVPNInfo();
        }
    }

    public final void EZpvd(BigDecimal bigDecimal) {
        int iScale = bigDecimal.scale();
        copydefault(bigDecimal.scaleByPowerOfTen(iScale).toBigInteger());
        this.values -= iScale;
    }

    public long EZpvd(boolean z) {
        int iMin = ((this.EZpvd + this.values) + this.djBIcL) - 1;
        if (z) {
            iMin = java.lang.Math.min(iMin, 17);
        }
        long jGEmmrt = 0;
        while (iMin >= 0) {
            jGEmmrt = (jGEmmrt * 10) + ((long) gEmmrt((iMin - this.values) - this.EZpvd));
            iMin--;
        }
        return copydefault() ? -jGEmmrt : jGEmmrt;
    }

    public long AEQbTJ(boolean z) {
        int iMin = this.values;
        if (z) {
            iMin = java.lang.Math.min(iMin, this.fetchVPNInfo);
        }
        long jGEmmrt = 0;
        for (int i = (-1) - this.EZpvd; i >= iMin && jGEmmrt <= 1.0E17d; i--) {
            jGEmmrt = (jGEmmrt * 10) + ((long) gEmmrt(i - this.values));
        }
        if (!z) {
            while (jGEmmrt > 0 && jGEmmrt % 10 == 0) {
                jGEmmrt /= 10;
            }
        }
        return jGEmmrt;
    }

    public boolean AkhnZx() {
        if (isInfinite() || isNaN()) {
            return false;
        }
        if (valueOf()) {
            return true;
        }
        if (this.EZpvd + this.values < 0) {
            return false;
        }
        int iAEQbTJ = AEQbTJ();
        if (iAEQbTJ < 18) {
            return true;
        }
        if (iAEQbTJ > 18) {
            return false;
        }
        for (int i = 0; i < this.djBIcL; i++) {
            byte bEZpvd = EZpvd(18 - i);
            byte b = copydefault[i];
            if (bEZpvd < b) {
                return true;
            }
            if (bEZpvd > b) {
                return false;
            }
        }
        return copydefault();
    }

    public double fIwbmz() {
        if (isNaN()) {
            return Double.NaN;
        }
        if (isInfinite()) {
            return copydefault() ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        EZpvd(sb);
        return java.lang.Double.valueOf(sb.toString()).doubleValue();
    }

    @Override // o.InterfaceC7163aee
    public BigDecimal AhwBna() {
        if (this.AYXKKw) {
            DbNXlk();
        }
        return isConnected();
    }

    public void uzCIH() {
        int i = this.values;
        if (i < 0) {
            isConnected(-i);
            this.values = 0;
            fetchVPNInfo();
        }
    }

    @Override // o.InterfaceC7163aee
    public void AEQbTJ(int i, MathContext mathContext) {
        OLrzqt(i, mathContext, true);
    }

    @Override // o.InterfaceC7163aee
    public void OLrzqt(int i, MathContext mathContext) {
        OLrzqt(i, mathContext, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x011f A[EDGE_INSN: B:109:0x011f->B:110:0x0120 BREAK  A[LOOP:1: B:34:0x005e->B:38:0x0068]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(int i, MathContext mathContext, boolean z) {
        int i2;
        int i3;
        int iAEQbTJ = AEQbTJ(i, this.values);
        int precision = mathContext.getPrecision();
        if (precision > 0 && (i3 = this.djBIcL - precision) > iAEQbTJ) {
            iAEQbTJ = i3;
        }
        byte bGEmmrt = gEmmrt(iAEQbTJ);
        if ((iAEQbTJ > 0 || this.AYXKKw || !(!z || bGEmmrt == 0 || bGEmmrt == 5)) && this.djBIcL != 0) {
            byte bGEmmrt2 = gEmmrt(AEQbTJ(iAEQbTJ, 1));
            if (this.AYXKKw) {
                int iAEQbTJ2 = AEQbTJ(iAEQbTJ, 2);
                int iMax = java.lang.Math.max(0, this.djBIcL - 14);
                if (bGEmmrt2 != 0 || (z && bGEmmrt != 0 && bGEmmrt != 5)) {
                    if (bGEmmrt2 != 4 || (z && bGEmmrt != 2 && bGEmmrt != 7)) {
                        if (bGEmmrt2 == 5 && (!z || bGEmmrt == 2 || bGEmmrt == 7)) {
                            while (iAEQbTJ2 >= iMax) {
                                if (gEmmrt(iAEQbTJ2) == 0) {
                                    iAEQbTJ2--;
                                }
                            }
                            i2 = 2;
                        } else if (bGEmmrt2 != 9 || (z && bGEmmrt != 4 && bGEmmrt != 9)) {
                            if (!z || bGEmmrt == 2 || bGEmmrt == 7 ? bGEmmrt2 < 5 : !(bGEmmrt >= 2 && (bGEmmrt < 5 || bGEmmrt >= 7))) {
                                i2 = 1;
                                break;
                            }
                        } else {
                            while (iAEQbTJ2 >= iMax) {
                                if (gEmmrt(iAEQbTJ2) == 9) {
                                    iAEQbTJ2--;
                                }
                            }
                            i2 = -2;
                        }
                        i2 = 3;
                        break;
                    } else {
                        while (iAEQbTJ2 >= iMax) {
                            if (gEmmrt(iAEQbTJ2) != 9) {
                                i2 = 1;
                                break;
                            }
                            iAEQbTJ2--;
                        }
                        i2 = 2;
                    }
                    boolean zKWHzl = C7180aev.KWHzl(mathContext.getRoundingMode().ordinal());
                    if (AEQbTJ(iAEQbTJ, 1) >= this.djBIcL - 14 || ((zKWHzl && i2 == 2) || (!zKWHzl && i2 < 0))) {
                        DbNXlk();
                        OLrzqt(i, mathContext, z);
                        return;
                    }
                    this.AYXKKw = false;
                    this.AhwBna = AudioStats.AUDIO_AMPLITUDE_NONE;
                    this.valueOf = 0;
                    if (iAEQbTJ <= 0 && (!z || bGEmmrt == 0 || bGEmmrt == 5)) {
                        return;
                    }
                    if (i2 == -1) {
                        i2 = 1;
                    }
                    if (i2 != -2) {
                        i2 = 3;
                        break;
                    }
                } else {
                    while (iAEQbTJ2 >= iMax) {
                        if (gEmmrt(iAEQbTJ2) != 0) {
                            i2 = 1;
                            break;
                        }
                        iAEQbTJ2--;
                    }
                    i2 = -1;
                    boolean zKWHzl2 = C7180aev.KWHzl(mathContext.getRoundingMode().ordinal());
                    if (AEQbTJ(iAEQbTJ, 1) >= this.djBIcL - 14) {
                    }
                    DbNXlk();
                    OLrzqt(i, mathContext, z);
                    return;
                }
            } else if (!z || bGEmmrt == 2 || bGEmmrt == 7) {
                if (bGEmmrt2 < 5) {
                    i2 = 1;
                } else {
                    if (bGEmmrt2 > 5) {
                        i2 = 3;
                        break;
                    }
                    for (int iAEQbTJ3 = AEQbTJ(iAEQbTJ, 2); iAEQbTJ3 >= 0; iAEQbTJ3--) {
                        if (gEmmrt(iAEQbTJ3) != 0) {
                            i2 = 3;
                            break;
                        }
                    }
                    i2 = 2;
                }
            } else if (bGEmmrt >= 2 && (bGEmmrt < 5 || bGEmmrt >= 7)) {
            }
            boolean zKWHzl3 = C7180aev.KWHzl(!z ? bGEmmrt % 2 != 0 : bGEmmrt >= 2 && bGEmmrt <= 7 && ((bGEmmrt != 2 || i2 == 3) && !(bGEmmrt == 7 && i2 == 3)), copydefault(), i2, mathContext.getRoundingMode().ordinal(), this);
            if (iAEQbTJ >= this.djBIcL) {
                ejfBZ();
                this.values = i;
            } else {
                isConnected(iAEQbTJ);
            }
            if (z) {
                if (bGEmmrt < 5 && zKWHzl3) {
                    EZpvd(0, (byte) 0);
                    fetchVPNInfo();
                    return;
                } else if (bGEmmrt >= 5 && !zKWHzl3) {
                    EZpvd(0, (byte) 9);
                    bGEmmrt = 9;
                } else {
                    EZpvd(0, (byte) 5);
                    return;
                }
            }
            if (!zKWHzl3) {
                if (bGEmmrt == 9) {
                    int i4 = 0;
                    while (gEmmrt(i4) == 9) {
                        i4++;
                    }
                    isConnected(i4);
                }
                EZpvd(0, (byte) (gEmmrt(0) + 1));
                this.djBIcL++;
            }
            fetchVPNInfo();
        }
    }

    @Override // o.InterfaceC7163aee
    public void djBIcL() {
        if (this.AYXKKw) {
            DbNXlk();
        }
    }

    @java.lang.Deprecated
    public void EZpvd(byte b, int i, boolean z) {
        if (b == 0) {
            if (!z || this.djBIcL == 0) {
                return;
            }
            this.values += i + 1;
            return;
        }
        int i2 = this.values;
        if (i2 > 0) {
            i += i2;
            if (z) {
                this.values = 0;
            }
        }
        int i3 = i + 1;
        AkhnZx(i3);
        EZpvd(0, b);
        if (z) {
            this.values += i3;
        }
    }

    public void EZpvd(java.lang.StringBuilder sb) {
        if (copydefault()) {
            sb.append('-');
        }
        int i = this.djBIcL;
        if (i == 0) {
            sb.append("0E+0");
            return;
        }
        int i2 = i - 1;
        sb.append((char) (gEmmrt(i2) + 48));
        int i3 = i - 2;
        if (i3 >= 0) {
            sb.append('.');
            while (i3 >= 0) {
                sb.append((char) (gEmmrt(i3) + 48));
                i3--;
            }
        }
        sb.append('E');
        int i4 = i2 + this.values + this.EZpvd;
        if (i4 == Integer.MIN_VALUE) {
            sb.append("-2147483648");
            return;
        }
        if (i4 < 0) {
            i4 *= -1;
            sb.append('-');
        } else {
            sb.append('+');
        }
        if (i4 == 0) {
            sb.append('0');
        }
        int length = sb.length();
        while (i4 > 0) {
            sb.insert(length, (char) ((i4 % 10) + 48));
            i4 /= 10;
        }
    }

    public boolean equals(java.lang.Object obj) {
        int i;
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AbstractC7164aef)) {
            return false;
        }
        AbstractC7164aef abstractC7164aef = (AbstractC7164aef) obj;
        if (this.values != abstractC7164aef.values || (i = this.djBIcL) != abstractC7164aef.djBIcL || this.AEQbTJ != abstractC7164aef.AEQbTJ || this.gEmmrt != abstractC7164aef.gEmmrt || this.fetchVPNInfo != abstractC7164aef.fetchVPNInfo || (z = this.AYXKKw) != abstractC7164aef.AYXKKw) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        if (z) {
            return this.AhwBna == abstractC7164aef.AhwBna && this.valueOf == abstractC7164aef.valueOf;
        }
        for (int iEZpvd = EZpvd(); iEZpvd >= KWHzl(); iEZpvd--) {
            if (EZpvd(iEZpvd) != abstractC7164aef.EZpvd(iEZpvd)) {
                return false;
            }
        }
        return true;
    }
}
