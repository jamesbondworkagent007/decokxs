package o;

import com.okinc.business.defi.biz.constant.WalletType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ezS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17259ezS {
    public final java.lang.String AEQbTJ;
    public final WalletType EZpvd;
    public final java.lang.String KWHzl;
    public final AbstractC12784ctX copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 com.okinc.business.defi.biz.constant.WalletType), (r3v0 o.ctX), (r4v0 java.lang.String) A[MD:(java.lang.String, com.okinc.business.defi.biz.constant.WalletType, o.ctX, java.lang.String):void (m)] call: o.ezS.<init>(java.lang.String, com.okinc.business.defi.biz.constant.WalletType, o.ctX, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC17259ezS(java.lang.String str, WalletType walletType, AbstractC12784ctX abstractC12784ctX, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, walletType, abstractC12784ctX, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletType EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12784ctX OLrzqt() {
        return this.copydefault;
    }

    public AbstractC17259ezS(java.lang.String str, WalletType walletType, AbstractC12784ctX abstractC12784ctX, java.lang.String str2) {
        this.KWHzl = str;
        this.EZpvd = walletType;
        this.copydefault = abstractC12784ctX;
        this.AEQbTJ = str2;
    }

    /* JADX INFO: renamed from: o.ezS$Application */
    public static final class Application extends AbstractC17259ezS {
        public final java.lang.String AYXKKw;
        public final AbstractC12782ctV AhwBna;
        public final AbstractC12782ctV OLrzqt;
        public final WalletType djBIcL;
        public final boolean gEmmrt;
        public final AbstractC12784ctX valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, WalletType walletType, AbstractC12782ctV abstractC12782ctV, AbstractC12784ctX abstractC12784ctX, AbstractC12782ctV abstractC12782ctV2, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                walletType = application.djBIcL;
            }
            if ((i & 2) != 0) {
                abstractC12782ctV = application.AhwBna;
            }
            AbstractC12782ctV abstractC12782ctV3 = abstractC12782ctV;
            if ((i & 4) != 0) {
                abstractC12784ctX = application.valueOf;
            }
            AbstractC12784ctX abstractC12784ctX2 = abstractC12784ctX;
            if ((i & 8) != 0) {
                abstractC12782ctV2 = application.OLrzqt;
            }
            AbstractC12782ctV abstractC12782ctV4 = abstractC12782ctV2;
            if ((i & 16) != 0) {
                z = application.gEmmrt;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                str = application.AYXKKw;
            }
            return application.copydefault(walletType, abstractC12782ctV3, abstractC12784ctX2, abstractC12782ctV4, z2, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC12782ctV AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC12782ctV copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull WalletType walletType, @NotNull AbstractC12782ctV abstractC12782ctV, AbstractC12784ctX abstractC12784ctX, AbstractC12782ctV abstractC12782ctV2, boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(walletType, "");
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(walletType, abstractC12782ctV, abstractC12784ctX, abstractC12782ctV2, z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.djBIcL == application.djBIcL && Intrinsics.EZpvd(this.AhwBna, application.AhwBna) && Intrinsics.EZpvd(this.valueOf, application.valueOf) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && this.gEmmrt == application.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) application.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.djBIcL.hashCode();
            int iHashCode2 = this.AhwBna.hashCode();
            AbstractC12784ctX abstractC12784ctX = this.valueOf;
            int iHashCode3 = abstractC12784ctX == null ? 0 : abstractC12784ctX.hashCode();
            AbstractC12782ctV abstractC12782ctV = this.OLrzqt;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (abstractC12782ctV != null ? abstractC12782ctV.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + this.AYXKKw.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NotRootWalletDeleteData(walletType=" + this.djBIcL + ", wallet=" + this.AhwBna + ", root=" + this.valueOf + ", aaWallet=" + this.OLrzqt + ", hasOthers=" + this.gEmmrt + ", password=" + this.AYXKKw + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull WalletType walletType, @NotNull AbstractC12782ctV abstractC12782ctV, AbstractC12784ctX abstractC12784ctX, AbstractC12782ctV abstractC12782ctV2, boolean z, @NotNull java.lang.String str) {
            super(abstractC12782ctV.DbNXlk(), walletType, abstractC12784ctX, abstractC12782ctV.AkhnZx(), null);
            Intrinsics.checkNotNullParameter(walletType, "");
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.djBIcL = walletType;
            this.AhwBna = abstractC12782ctV;
            this.valueOf = abstractC12784ctX;
            this.OLrzqt = abstractC12782ctV2;
            this.gEmmrt = z;
            this.AYXKKw = str;
        }
    }

    /* JADX INFO: renamed from: o.ezS$StateListAnimator */
    public static final class StateListAnimator extends AbstractC17259ezS {
        public final AbstractC12784ctX AYXKKw;
        public final java.lang.String OLrzqt;
        public final WalletType gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, WalletType walletType, AbstractC12784ctX abstractC12784ctX, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                walletType = stateListAnimator.gEmmrt;
            }
            if ((i & 2) != 0) {
                abstractC12784ctX = stateListAnimator.AYXKKw;
            }
            if ((i & 4) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.EZpvd(walletType, abstractC12784ctX, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull WalletType walletType, @NotNull AbstractC12784ctX abstractC12784ctX, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(walletType, "");
            Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(walletType, abstractC12784ctX, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC12784ctX copydefault() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.gEmmrt == stateListAnimator.gEmmrt && Intrinsics.EZpvd(this.AYXKKw, stateListAnimator.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.gEmmrt.hashCode() * 31) + this.AYXKKw.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RootWalletDeleteResult(walletType=" + this.gEmmrt + ", root=" + this.AYXKKw + ", password=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull WalletType walletType, @NotNull AbstractC12784ctX abstractC12784ctX, @NotNull java.lang.String str) {
            super(abstractC12784ctX.EZpvd(), walletType, abstractC12784ctX, abstractC12784ctX.AuCTel(), null);
            Intrinsics.checkNotNullParameter(walletType, "");
            Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.gEmmrt = walletType;
            this.AYXKKw = abstractC12784ctX;
            this.OLrzqt = str;
        }
    }
}
