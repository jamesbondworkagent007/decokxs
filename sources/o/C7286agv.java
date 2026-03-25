package o;

import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.ULocale;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.locks.Lock;
import o.C7069acq;
import o.C7113adh;

/* JADX INFO: renamed from: o.agv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7286agv extends AbstractC7206afU {
    public boolean AEQbTJ;
    public Lock AYXKKw;
    public C7048acV AhwBna;
    public Application OLrzqt;
    public C7108adc djBIcL;
    public C7113adh.ActionBar<C7110ade> gEmmrt;
    public ULocale valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC7206afU
    public boolean copydefault() {
        return this.AYXKKw != null;
    }

    public C7286agv(java.lang.String str) throws java.lang.Exception {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Collation rules can not be null");
        }
        this.valueOf = ULocale.ROOT;
        copydefault(str);
    }

    public final void copydefault(java.lang.String str) throws java.lang.Exception {
        C7108adc c7108adcOLrzqt = C7109add.OLrzqt();
        try {
            java.lang.Class<?> clsLoadClass = C7016abQ.EZpvd(C7286agv.class).loadClass("com.ibm.icu.impl.coll.CollationBuilder");
            C7108adc c7108adc = (C7108adc) clsLoadClass.getMethod("parseAndBuild", java.lang.String.class).invoke(clsLoadClass.getConstructor(C7108adc.class).newInstance(c7108adcOLrzqt), str);
            c7108adc.copydefault = null;
            EZpvd(c7108adc);
        } catch (InvocationTargetException e) {
            throw ((java.lang.Exception) e.getTargetException());
        }
    }

    @Override // o.AbstractC7206afU
    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return copydefault() ? this : AhwBna();
    }

    public final void isConnected() {
        synchronized (this.djBIcL) {
            C7108adc c7108adc = this.djBIcL;
            if (c7108adc.EZpvd == null) {
                c7108adc.EZpvd = C7204afS.copydefault(c7108adc.KWHzl);
            }
        }
    }

    public C7204afS KWHzl(java.lang.String str) {
        isConnected();
        return new C7204afS(str, this);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: o.adh$ActionBar<T extends o.adh>, o.adh$ActionBar<o.ade> */
    public C7286agv AhwBna() {
        try {
            C7286agv c7286agv = (C7286agv) super.clone();
            c7286agv.gEmmrt = this.gEmmrt.clone();
            c7286agv.OLrzqt = null;
            c7286agv.AYXKKw = null;
            return c7286agv;
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    public final void KWHzl() {
        if (copydefault()) {
            throw new java.lang.UnsupportedOperationException("Attempt to modify frozen RuleBasedCollator");
        }
    }

    public final C7110ade AYXKKw() {
        return (C7110ade) this.gEmmrt.KWHzl();
    }

    public final C7110ade gEmmrt() {
        return (C7110ade) this.djBIcL.AhwBna.OLrzqt();
    }

    public void valueOf(boolean z) {
        KWHzl();
        if (z == fIwbmz()) {
            return;
        }
        C7110ade c7110adeAYXKKw = AYXKKw();
        c7110adeAYXKKw.AhwBna(z ? 768 : 0);
        AEQbTJ(c7110adeAYXKKw);
    }

    public void OLrzqt(boolean z) {
        KWHzl();
        if (z == AuCTel()) {
            return;
        }
        C7110ade c7110adeAYXKKw = AYXKKw();
        c7110adeAYXKKw.AhwBna(z ? 512 : 0);
        AEQbTJ(c7110adeAYXKKw);
    }

    public void EZpvd(boolean z) {
        KWHzl();
        if (z == fARcdN()) {
            return;
        }
        C7110ade c7110adeAYXKKw = AYXKKw();
        c7110adeAYXKKw.KWHzl(2048, z);
        AEQbTJ(c7110adeAYXKKw);
    }

    public void AEQbTJ(boolean z) {
        KWHzl();
        if (z == fetchVPNInfo()) {
            return;
        }
        C7110ade c7110adeAYXKKw = AYXKKw();
        c7110adeAYXKKw.KWHzl(z);
        AEQbTJ(c7110adeAYXKKw);
    }

    public void KWHzl(boolean z) {
        KWHzl();
        if (z == DbNXlk()) {
            return;
        }
        C7110ade c7110adeAYXKKw = AYXKKw();
        c7110adeAYXKKw.KWHzl(1024, z);
        AEQbTJ(c7110adeAYXKKw);
    }

    @Override // o.AbstractC7206afU
    public void KWHzl(int i) {
        boolean z;
        KWHzl();
        if (i == 16) {
            z = false;
        } else {
            if (i != 17) {
                throw new java.lang.IllegalArgumentException("Wrong decomposition mode.");
            }
            z = true;
        }
        if (z == ((C7110ade) this.gEmmrt.OLrzqt()).KWHzl(1)) {
            return;
        }
        C7110ade c7110adeAYXKKw = AYXKKw();
        c7110adeAYXKKw.KWHzl(1, z);
        AEQbTJ(c7110adeAYXKKw);
    }

    @Override // o.AbstractC7206afU
    public void EZpvd(int i) {
        KWHzl();
        if (i == EZpvd()) {
            return;
        }
        C7110ade c7110adeAYXKKw = AYXKKw();
        c7110adeAYXKKw.valueOf(i);
        AEQbTJ(c7110adeAYXKKw);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(I)Lo/afU; */
    @Override // o.AbstractC7206afU
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C7286agv copydefault(int i) {
        int i2;
        if (i == -1) {
            i2 = -1;
        } else {
            if (4096 > i || i > 4099) {
                throw new java.lang.IllegalArgumentException("illegal max variable group " + i);
            }
            i2 = i - 4096;
        }
        if (i2 == ((C7110ade) this.gEmmrt.OLrzqt()).gEmmrt()) {
            return this;
        }
        C7110ade c7110adeGEmmrt = gEmmrt();
        if (this.gEmmrt.OLrzqt() == c7110adeGEmmrt && i2 < 0) {
            return this;
        }
        C7110ade c7110adeAYXKKw = AYXKKw();
        if (i == -1) {
            i = c7110adeGEmmrt.gEmmrt() + 4096;
        }
        long jAYXKKw = this.AhwBna.AYXKKw(i);
        c7110adeAYXKKw.AEQbTJ(i2, c7110adeGEmmrt.OLrzqt);
        c7110adeAYXKKw.AYXKKw = jAYXKKw;
        AEQbTJ(c7110adeAYXKKw);
        return this;
    }

    public void copydefault(boolean z) {
        KWHzl();
        if (z == djBIcL()) {
            return;
        }
        C7110ade c7110adeAYXKKw = AYXKKw();
        c7110adeAYXKKw.KWHzl(2, z);
        AEQbTJ(c7110adeAYXKKw);
    }

    @Override // o.AbstractC7206afU
    public void OLrzqt(int... iArr) {
        KWHzl();
        int length = iArr != null ? iArr.length : 0;
        if (length == 1 && iArr[0] == 103) {
            length = 0;
        }
        if (length == 0) {
            if (((C7110ade) this.gEmmrt.OLrzqt()).valueOf.length == 0) {
                return;
            }
        } else if (java.util.Arrays.equals(iArr, ((C7110ade) this.gEmmrt.OLrzqt()).valueOf)) {
            return;
        }
        C7110ade c7110adeGEmmrt = gEmmrt();
        if (length == 1 && iArr[0] == -1) {
            if (this.gEmmrt.OLrzqt() != c7110adeGEmmrt) {
                C7110ade c7110adeAYXKKw = AYXKKw();
                c7110adeAYXKKw.copydefault(c7110adeGEmmrt);
                AEQbTJ(c7110adeAYXKKw);
                return;
            }
            return;
        }
        C7110ade c7110adeAYXKKw2 = AYXKKw();
        if (length == 0) {
            c7110adeAYXKKw2.djBIcL();
        } else {
            c7110adeAYXKKw2.OLrzqt(this.AhwBna, (int[]) iArr.clone());
        }
        AEQbTJ(c7110adeAYXKKw2);
    }

    public final void AEQbTJ(C7110ade c7110ade) {
        c7110ade.AEQbTJ = C7049acW.AEQbTJ(this.AhwBna, c7110ade, c7110ade.KWHzl);
    }

    public java.lang.String values() {
        return this.djBIcL.AEQbTJ();
    }

    @Override // o.AbstractC7206afU
    public UnicodeSet AEQbTJ() {
        UnicodeSet unicodeSet = new UnicodeSet();
        if (this.AhwBna.OLrzqt != null) {
            new C7116adk(unicodeSet).EZpvd(this.AhwBna);
        }
        return unicodeSet;
    }

    @java.lang.Deprecated
    public long[] EZpvd(java.lang.CharSequence charSequence) throws java.lang.Throwable {
        Application applicationValueOf;
        AbstractC7052acZ abstractC7052acZ;
        try {
            applicationValueOf = valueOf();
        } catch (java.lang.Throwable th) {
            th = th;
            applicationValueOf = null;
        }
        try {
            boolean zValueOf = ((C7110ade) this.gEmmrt.OLrzqt()).valueOf();
            if (((C7110ade) this.gEmmrt.OLrzqt()).copydefault()) {
                applicationValueOf.AEQbTJ.KWHzl(zValueOf, charSequence, 0);
                abstractC7052acZ = applicationValueOf.AEQbTJ;
            } else {
                applicationValueOf.OLrzqt.KWHzl(zValueOf, charSequence, 0);
                abstractC7052acZ = applicationValueOf.OLrzqt;
            }
            int iAEQbTJ = abstractC7052acZ.AEQbTJ() - 1;
            long[] jArr = new long[iAEQbTJ];
            java.lang.System.arraycopy(abstractC7052acZ.EZpvd(), 0, jArr, 0, iAEQbTJ);
            KWHzl(applicationValueOf);
            return jArr;
        } catch (java.lang.Throwable th2) {
            th = th2;
            KWHzl(applicationValueOf);
            throw th;
        }
    }

    @Override // o.AbstractC7206afU
    public int EZpvd() {
        return ((C7110ade) this.gEmmrt.OLrzqt()).AYXKKw();
    }

    public boolean fIwbmz() {
        return ((C7110ade) this.gEmmrt.OLrzqt()).AEQbTJ() == 768;
    }

    public boolean AuCTel() {
        return ((C7110ade) this.gEmmrt.OLrzqt()).AEQbTJ() == 512;
    }

    public boolean fetchVPNInfo() {
        return ((C7110ade) this.gEmmrt.OLrzqt()).EZpvd();
    }

    public boolean DbNXlk() {
        return (((C7110ade) this.gEmmrt.OLrzqt()).OLrzqt & 1024) != 0;
    }

    public boolean fARcdN() {
        return (((C7110ade) this.gEmmrt.OLrzqt()).OLrzqt & 2048) != 0;
    }

    public int AkhnZx() {
        return (int) ((C7110ade) this.gEmmrt.OLrzqt()).AYXKKw;
    }

    public boolean djBIcL() {
        return (((C7110ade) this.gEmmrt.OLrzqt()).OLrzqt & 2) != 0;
    }

    @Override // o.AbstractC7206afU, java.util.Comparator
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C7286agv c7286agv = (C7286agv) obj;
        if (!((C7110ade) this.gEmmrt.OLrzqt()).equals(c7286agv.gEmmrt.OLrzqt())) {
            return false;
        }
        C7048acV c7048acV = this.AhwBna;
        C7048acV c7048acV2 = c7286agv.AhwBna;
        if (c7048acV == c7048acV2) {
            return true;
        }
        boolean z = c7048acV.OLrzqt == null;
        boolean z2 = c7048acV2.OLrzqt == null;
        if (z != z2) {
            return false;
        }
        java.lang.String strAEQbTJ = this.djBIcL.AEQbTJ();
        java.lang.String strAEQbTJ2 = c7286agv.djBIcL.AEQbTJ();
        return ((z || strAEQbTJ.length() != 0) && ((z2 || strAEQbTJ2.length() != 0) && strAEQbTJ.equals(strAEQbTJ2))) || AEQbTJ().equals(c7286agv.AEQbTJ());
    }

    @Override // o.AbstractC7206afU
    public int hashCode() {
        int i;
        int iHashCode = ((C7110ade) this.gEmmrt.OLrzqt()).hashCode();
        if (this.AhwBna.OLrzqt == null) {
            return iHashCode;
        }
        C7243agE c7243agE = new C7243agE(AEQbTJ());
        while (c7243agE.EZpvd() && (i = c7243agE.OLrzqt) != C7243agE.EZpvd) {
            iHashCode ^= this.AhwBna.copydefault(i);
        }
        return iHashCode;
    }

    @Override // o.AbstractC7206afU
    public int copydefault(java.lang.String str, java.lang.String str2) {
        return AEQbTJ(str, str2);
    }

    /* JADX INFO: renamed from: o.agv$TaskDescription */
    public static abstract class TaskDescription {
        public java.lang.String EZpvd;
        public int OLrzqt;

        public abstract int EZpvd();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl() {
            this.OLrzqt = -1;
        }

        public final int copydefault() {
            int i = this.OLrzqt;
            if (i >= 0) {
                if (i != this.EZpvd.length()) {
                    int iCodePointAt = java.lang.Character.codePointAt(this.EZpvd, this.OLrzqt);
                    this.OLrzqt += java.lang.Character.charCount(iCodePointAt);
                    return iCodePointAt;
                }
                this.OLrzqt = -1;
            }
            return EZpvd();
        }

        public final int OLrzqt(C7069acq c7069acq, int i) {
            if (this.OLrzqt >= 0) {
                return i;
            }
            java.lang.String strFetchVPNInfo = c7069acq.fetchVPNInfo(i);
            this.EZpvd = strFetchVPNInfo;
            if (strFetchVPNInfo == null) {
                return i;
            }
            int iCodePointAt = java.lang.Character.codePointAt(strFetchVPNInfo, 0);
            this.OLrzqt = java.lang.Character.charCount(iCodePointAt);
            return iCodePointAt;
        }
    }

    /* JADX INFO: renamed from: o.agv$StateListAnimator */
    public static class StateListAnimator extends TaskDescription {
        public int KWHzl;
        public java.lang.CharSequence copydefault;

        public void KWHzl(java.lang.CharSequence charSequence, int i) {
            KWHzl();
            this.copydefault = charSequence;
            this.KWHzl = i;
        }

        @Override // o.C7286agv.TaskDescription
        public int EZpvd() {
            if (this.KWHzl == this.copydefault.length()) {
                return -1;
            }
            int iCodePointAt = java.lang.Character.codePointAt(this.copydefault, this.KWHzl);
            this.KWHzl += java.lang.Character.charCount(iCodePointAt);
            return iCodePointAt;
        }
    }

    /* JADX INFO: renamed from: o.agv$Activity */
    public static final class Activity extends StateListAnimator {
        public java.lang.StringBuilder AEQbTJ;

        public void KWHzl(C7069acq c7069acq, java.lang.CharSequence charSequence, int i) {
            KWHzl();
            int iEZpvd = c7069acq.EZpvd(charSequence, i, charSequence.length(), null);
            if (iEZpvd == charSequence.length()) {
                this.copydefault = charSequence;
                this.KWHzl = i;
                return;
            }
            java.lang.StringBuilder sb = this.AEQbTJ;
            if (sb == null) {
                this.AEQbTJ = new java.lang.StringBuilder();
            } else {
                sb.setLength(0);
            }
            this.AEQbTJ.append(charSequence, i, iEZpvd);
            c7069acq.EZpvd(charSequence, iEZpvd, charSequence.length(), new C7069acq.StateListAnimator(c7069acq, this.AEQbTJ, charSequence.length() - i));
            this.copydefault = this.AEQbTJ;
            this.KWHzl = 0;
        }
    }

    public static final int KWHzl(C7069acq c7069acq, TaskDescription taskDescription, TaskDescription taskDescription2) {
        int iOLrzqt;
        while (true) {
            int iCopydefault = taskDescription.copydefault();
            int iCopydefault2 = taskDescription2.copydefault();
            if (iCopydefault != iCopydefault2) {
                int iOLrzqt2 = -2;
                if (iCopydefault < 0) {
                    iOLrzqt = -2;
                } else {
                    iOLrzqt = iCopydefault == 65534 ? -1 : taskDescription.OLrzqt(c7069acq, iCopydefault);
                }
                if (iCopydefault2 >= 0) {
                    iOLrzqt2 = iCopydefault2 == 65534 ? -1 : taskDescription2.OLrzqt(c7069acq, iCopydefault2);
                }
                if (iOLrzqt < iOLrzqt2) {
                    return -1;
                }
                if (iOLrzqt > iOLrzqt2) {
                    return 1;
                }
            } else if (iCopydefault < 0) {
                return 0;
            }
        }
    }

    @Override // o.AbstractC7206afU
    @java.lang.Deprecated
    public int AEQbTJ(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) throws java.lang.Throwable {
        int iAEQbTJ;
        if (charSequence == charSequence2) {
            return 0;
        }
        int i = 0;
        while (true) {
            if (i == charSequence.length()) {
                if (i == charSequence2.length()) {
                    return 0;
                }
            } else {
                if (i == charSequence2.length() || charSequence.charAt(i) != charSequence2.charAt(i)) {
                    break;
                }
                i++;
            }
        }
        C7110ade c7110ade = (C7110ade) this.gEmmrt.OLrzqt();
        boolean zValueOf = c7110ade.valueOf();
        if (i > 0 && ((i != charSequence.length() && this.AhwBna.copydefault(charSequence.charAt(i), zValueOf)) || (i != charSequence2.length() && this.AhwBna.copydefault(charSequence2.charAt(i), zValueOf)))) {
            do {
                i--;
                if (i <= 0) {
                    break;
                }
            } while (this.AhwBna.copydefault(charSequence.charAt(i), zValueOf));
        }
        int i2 = c7110ade.AEQbTJ;
        int iCopydefault = (i2 < 0 || (i != charSequence.length() && charSequence.charAt(i) > 383) || (i != charSequence2.length() && charSequence2.charAt(i) > 383)) ? -2 : C7049acW.copydefault(this.AhwBna.AhwBna, c7110ade.KWHzl, i2, charSequence, charSequence2, i);
        Application application = null;
        if (iCopydefault == -2) {
            try {
                Application applicationValueOf = valueOf();
                try {
                    if (c7110ade.copydefault()) {
                        applicationValueOf.AEQbTJ.KWHzl(zValueOf, charSequence, i);
                        applicationValueOf.djBIcL.KWHzl(zValueOf, charSequence2, i);
                        iAEQbTJ = C7044acR.AEQbTJ(applicationValueOf.AEQbTJ, applicationValueOf.djBIcL, c7110ade);
                    } else {
                        applicationValueOf.OLrzqt.KWHzl(zValueOf, charSequence, i);
                        applicationValueOf.EZpvd.KWHzl(zValueOf, charSequence2, i);
                        iAEQbTJ = C7044acR.AEQbTJ(applicationValueOf.OLrzqt, applicationValueOf.EZpvd, c7110ade);
                    }
                    iCopydefault = iAEQbTJ;
                    KWHzl(applicationValueOf);
                } catch (java.lang.Throwable th) {
                    th = th;
                    application = applicationValueOf;
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
        if (iCopydefault != 0 || c7110ade.AYXKKw() < 15) {
            return iCopydefault;
        }
        try {
            Application applicationValueOf2 = valueOf();
            C7069acq c7069acq = this.AhwBna.AYXKKw;
            if (c7110ade.copydefault()) {
                applicationValueOf2.copydefault.KWHzl(charSequence, i);
                applicationValueOf2.gEmmrt.KWHzl(charSequence2, i);
                int iKWHzl = KWHzl(c7069acq, applicationValueOf2.copydefault, applicationValueOf2.gEmmrt);
                KWHzl(applicationValueOf2);
                return iKWHzl;
            }
            applicationValueOf2.KWHzl.KWHzl(c7069acq, charSequence, i);
            applicationValueOf2.AYXKKw.KWHzl(c7069acq, charSequence2, i);
            int iKWHzl2 = KWHzl(c7069acq, applicationValueOf2.KWHzl, applicationValueOf2.AYXKKw);
            KWHzl(applicationValueOf2);
            return iKWHzl2;
        } finally {
            KWHzl((Application) null);
        }
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.adh$ActionBar<T extends o.adh>, o.adh$ActionBar<o.ade> */
    public C7286agv(C7108adc c7108adc, ULocale uLocale) {
        this.AhwBna = c7108adc.KWHzl;
        this.gEmmrt = c7108adc.AhwBna.clone();
        this.djBIcL = c7108adc;
        this.valueOf = uLocale;
        this.AEQbTJ = false;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.adh$ActionBar<T extends o.adh>, o.adh$ActionBar<o.ade> */
    public final void EZpvd(C7108adc c7108adc) {
        this.AhwBna = c7108adc.KWHzl;
        this.gEmmrt = c7108adc.AhwBna.clone();
        this.djBIcL = c7108adc;
        this.valueOf = c7108adc.copydefault;
        this.AEQbTJ = false;
    }

    /* JADX INFO: renamed from: o.agv$Application */
    public static final class Application {
        public C7112adg AEQbTJ;
        public Activity AYXKKw;
        public C7107adb EZpvd;
        public Activity KWHzl;
        public C7107adb OLrzqt;
        public StateListAnimator copydefault;
        public C7112adg djBIcL;
        public StateListAnimator gEmmrt;

        public Application(C7048acV c7048acV) {
            this.AEQbTJ = new C7112adg(c7048acV);
            this.djBIcL = new C7112adg(c7048acV);
            this.OLrzqt = new C7107adb(c7048acV);
            this.EZpvd = new C7107adb(c7048acV);
            this.copydefault = new StateListAnimator();
            this.gEmmrt = new StateListAnimator();
            this.KWHzl = new Activity();
            this.AYXKKw = new Activity();
        }
    }

    public final Application valueOf() {
        if (copydefault()) {
            this.AYXKKw.lock();
        } else if (this.OLrzqt == null) {
            this.OLrzqt = new Application(this.AhwBna);
        }
        return this.OLrzqt;
    }

    public final void KWHzl(Application application) {
        if (copydefault()) {
            this.AYXKKw.unlock();
        }
    }
}
