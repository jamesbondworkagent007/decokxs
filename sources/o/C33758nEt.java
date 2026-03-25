package o;

import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nEt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33758nEt {
    public static final C33758nEt copydefault = new C33758nEt();

    private C33758nEt() {
    }

    /* JADX INFO: renamed from: o.nEt$Application */
    public static final class Application {
        public final java.lang.String KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = application.KWHzl;
            }
            return application.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(str, str2);
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CtaModel(label=" + this.copydefault + ", eventValue=" + this.KWHzl + ")";
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.KWHzl = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:13) call: o.nEt.Application.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    public final Application EZpvd(java.lang.Integer num) {
        Application application;
        int value = IMMessageShareModel.CTAType.NoCTA.getValue();
        if (num != null && num.intValue() == value) {
            return new Application("", "");
        }
        int value2 = IMMessageShareModel.CTAType.TradeNow.getValue();
        if (num != null && num.intValue() == value2) {
            application = new Application(C33070mpX.AYXKKw(C35399nuc.LoaderManager.sanitizeSessionIdIgnoreCase), "trade_now");
        } else {
            int value3 = IMMessageShareModel.CTAType.ViewMore.getValue();
            if (num != null && num.intValue() == value3) {
                application = new Application(C33070mpX.AYXKKw(C35399nuc.LoaderManager.uzCIH), "view_more");
            } else {
                int value4 = IMMessageShareModel.CTAType.CopyNow.getValue();
                if (num != null && num.intValue() == value4) {
                    application = new Application(C33070mpX.AYXKKw(C35399nuc.LoaderManager.validateSHA256), "copy_now");
                } else {
                    int value5 = IMMessageShareModel.CTAType.FollowNow.getValue();
                    if (num != null && num.intValue() == value5) {
                        application = new Application(C33070mpX.AYXKKw(C35399nuc.LoaderManager.zUtmHU), "follow_now");
                    } else {
                        int value6 = IMMessageShareModel.CTAType.WatchNow.getValue();
                        if (num != null && num.intValue() == value6) {
                            application = new Application(C33070mpX.AYXKKw(C35399nuc.LoaderManager.mayLaunchUrl), "watch_now");
                        } else {
                            int value7 = IMMessageShareModel.CTAType.JoinNow.getValue();
                            if (num != null && num.intValue() == value7) {
                                application = new Application(C33070mpX.AYXKKw(C35399nuc.LoaderManager.onTransact), "join_now");
                            } else {
                                int value8 = IMMessageShareModel.CTAType.ClaimNow.getValue();
                                if (num != null && num.intValue() == value8) {
                                    application = new Application(C33070mpX.AYXKKw(C35399nuc.LoaderManager.getInterfaceDescriptor), "claim_now");
                                } else {
                                    int value9 = IMMessageShareModel.CTAType.ShareNow.getValue();
                                    if (num != null && num.intValue() == value9) {
                                        application = new Application(C33070mpX.AYXKKw(C35399nuc.LoaderManager.setDefaultImpl), "share_now");
                                    } else {
                                        application = new Application(C33070mpX.AYXKKw(C35399nuc.LoaderManager.uzCIH), "view_more");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return application;
    }

    public final boolean copydefault() {
        return !((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).djSkpj();
    }

    public final boolean OLrzqt() {
        return ((InterfaceC49494upc) C43251rlk.copydefault(InterfaceC49494upc.class)).EZpvd();
    }
}
