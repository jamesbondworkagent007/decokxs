package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38012pIz {
    public pIB AEQbTJ;
    public boolean AYXKKw;
    public boolean EZpvd;
    public boolean copydefault;
    public boolean djBIcL;
    public pIE fetchVPNInfo;
    public boolean gEmmrt;
    public InterfaceC38050pKj valueOf;
    public int AhwBna = 3;
    public int KWHzl = 3;
    public java.lang.Class<?> values = pIX.class;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pIx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C38012pIz.KWHzl();
        }
    });

    /* JADX INFO: renamed from: o.pIz$Activity */
    public static final class Activity implements InterfaceC38050pKj {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC38050pKj
        public void AEQbTJ(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC38050pKj
        public void EZpvd(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC38050pKj
        public void KWHzl(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC38050pKj
        public void OLrzqt(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
        }

        @Override // o.InterfaceC38050pKj
        public void OLrzqt(boolean z) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC38050pKj
        public void copydefault(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(str2, "");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38012pIz AEQbTJ(int i) {
        this.KWHzl = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38012pIz EZpvd(@NotNull pIE pie) {
        Intrinsics.checkNotNullParameter(pie, "");
        this.fetchVPNInfo = pie;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38012pIz EZpvd(boolean z) {
        this.copydefault = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38012pIz KWHzl(@NotNull InterfaceC38050pKj interfaceC38050pKj) {
        Intrinsics.checkNotNullParameter(interfaceC38050pKj, "");
        this.valueOf = interfaceC38050pKj;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38012pIz KWHzl(boolean z) {
        this.EZpvd = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38012pIz OLrzqt(boolean z) {
        this.AYXKKw = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38012pIz copydefault(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        this.values = cls;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38012pIz copydefault(@NotNull pIB pib) {
        Intrinsics.checkNotNullParameter(pib, "");
        this.AEQbTJ = pib;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38012pIz copydefault(boolean z) {
        this.gEmmrt = z;
        return this;
    }

    public final Activity EZpvd() {
        return (Activity) this.OLrzqt.getValue();
    }

    public static final Activity KWHzl() {
        return new Activity();
    }

    public final C38002pIp copydefault() {
        InterfaceC38050pKj interfaceC38050pKjEZpvd = this.valueOf;
        if (interfaceC38050pKjEZpvd == null) {
            interfaceC38050pKjEZpvd = EZpvd();
        }
        boolean z = this.copydefault;
        boolean z2 = this.EZpvd;
        int i = this.KWHzl;
        int i2 = this.AhwBna;
        java.lang.Class<?> cls = this.values;
        pIB pib = this.AEQbTJ;
        C38002pIp c38002pIp = new C38002pIp(z, z2, this.gEmmrt, this.djBIcL, i2, this.AYXKKw, i, cls, interfaceC38050pKjEZpvd, this.fetchVPNInfo, pib);
        pIC.EZpvd.EZpvd(c38002pIp);
        return c38002pIp;
    }
}
