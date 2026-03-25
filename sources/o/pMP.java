package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pMP implements ARC {
    public static final int EZpvd = C43239rlY.KWHzl;
    public final C43239rlY KWHzl;
    public final pMM OLrzqt;

    public pMP(@NotNull C43239rlY c43239rlY, @NotNull pMM pmm) {
        Intrinsics.checkNotNullParameter(c43239rlY, "");
        Intrinsics.checkNotNullParameter(pmm, "");
        this.KWHzl = c43239rlY;
        this.OLrzqt = pmm;
    }

    @Override // o.ARC
    public InterfaceC2599ARy OLrzqt(@NotNull java.lang.String str) {
        InterfaceC43236rlV value;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC56387yDm<InterfaceC43236rlV> interfaceC56387yDm = this.KWHzl.OLrzqt().get(str);
        if (interfaceC56387yDm == null || (value = interfaceC56387yDm.getValue()) == null) {
            return null;
        }
        return new pMN(value, this.OLrzqt);
    }

    public static final class Activity implements InterfaceC43232rlR {
        public final java.lang.String AEQbTJ;
        public final /* synthetic */ InterfaceC43232rlR OLrzqt;
        public final DeeplinkMode copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43232rlR
        public java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43232rlR
        public DeeplinkMode copydefault() {
            return this.copydefault;
        }

        public Activity(java.lang.String str, InterfaceC43232rlR interfaceC43232rlR) {
            this.OLrzqt = interfaceC43232rlR;
            this.AEQbTJ = str;
            this.copydefault = interfaceC43232rlR.copydefault();
        }

        @Override // o.InterfaceC43232rlR
        public boolean EZpvd() {
            return this.OLrzqt.EZpvd();
        }

        @Override // o.InterfaceC43232rlR
        public java.util.List<java.lang.String> djBIcL() {
            return this.OLrzqt.djBIcL();
        }

        @Override // o.InterfaceC43232rlR
        public boolean KWHzl() {
            return this.OLrzqt.KWHzl();
        }

        @Override // o.InterfaceC43232rlR
        public boolean OLrzqt() {
            return this.OLrzqt.OLrzqt();
        }
    }

    @Override // o.ARC
    public ARK OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC43232rlR interfaceC43232rlR = this.KWHzl.KWHzl().get(str2);
        if (interfaceC43232rlR == null) {
            return null;
        }
        return new pMR(new Activity(str, interfaceC43232rlR));
    }
}
