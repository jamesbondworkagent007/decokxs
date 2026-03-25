package o;

import com.okinc.kline.features.contractinfo.ui.model.ContractInfoItemType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oPY {
    public final ContractInfoItemType AEQbTJ;
    public final ActionBar EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ oPY copy$default(oPY opy, ContractInfoItemType contractInfoItemType, java.lang.String str, java.lang.String str2, ActionBar actionBar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            contractInfoItemType = opy.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = opy.KWHzl;
        }
        if ((i & 4) != 0) {
            str2 = opy.copydefault;
        }
        if ((i & 8) != 0) {
            actionBar = opy.EZpvd;
        }
        return opy.AEQbTJ(contractInfoItemType, str, str2, actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oPY AEQbTJ(@NotNull ContractInfoItemType contractInfoItemType, @NotNull java.lang.String str, @NotNull java.lang.String str2, ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(contractInfoItemType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new oPY(contractInfoItemType, str, str2, actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractInfoItemType copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oPY)) {
            return false;
        }
        oPY opy = (oPY) obj;
        return this.AEQbTJ == opy.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) opy.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) opy.copydefault) && Intrinsics.EZpvd(this.EZpvd, opy.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        ActionBar actionBar = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (actionBar == null ? 0 : actionBar.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ContractInfoItemVo(id=" + this.AEQbTJ + ", title=" + this.KWHzl + ", value=" + this.copydefault + ", clickAction=" + this.EZpvd + ")";
    }

    public oPY(@NotNull ContractInfoItemType contractInfoItemType, @NotNull java.lang.String str, @NotNull java.lang.String str2, ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(contractInfoItemType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = contractInfoItemType;
        this.KWHzl = str;
        this.copydefault = str2;
        this.EZpvd = actionBar;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.kline.features.contractinfo.ui.model.ContractInfoItemType)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:o.oPY$ActionBar:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.oPY$ActionBar) : (r4v0 o.oPY$ActionBar))
 A[MD:(com.okinc.kline.features.contractinfo.ui.model.ContractInfoItemType, java.lang.String, java.lang.String, o.oPY$ActionBar):void (m)] (LINE:66) call: o.oPY.<init>(com.okinc.kline.features.contractinfo.ui.model.ContractInfoItemType, java.lang.String, java.lang.String, o.oPY$ActionBar):void type: THIS */
    public /* synthetic */ oPY(ContractInfoItemType contractInfoItemType, java.lang.String str, java.lang.String str2, ActionBar actionBar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contractInfoItemType, str, str2, (i & 8) != 0 ? null : actionBar);
    }

    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oPY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.oPY$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0903ActionBar extends ActionBar {
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0903ActionBar copy$default(C0903ActionBar c0903ActionBar, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = c0903ActionBar.EZpvd;
                }
                return c0903ActionBar.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0903ActionBar AEQbTJ(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0903ActionBar(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0903ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((C0903ActionBar) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ShowMessage(message=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0903ActionBar(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }

        private ActionBar() {
        }

        public static final class Activity extends ActionBar {
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.OLrzqt;
                }
                return activity.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity copydefault(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((Activity) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OpenWebView(url=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        public static final class Application extends ActionBar {
            public final java.lang.String EZpvd;
            public final java.lang.String KWHzl;
            public final ContractInfoItemType copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, ContractInfoItemType contractInfoItemType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    contractInfoItemType = application.copydefault;
                }
                if ((i & 2) != 0) {
                    str = application.KWHzl;
                }
                if ((i & 4) != 0) {
                    str2 = application.EZpvd;
                }
                return application.AEQbTJ(contractInfoItemType, str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(@NotNull ContractInfoItemType contractInfoItemType, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
                Intrinsics.checkNotNullParameter(contractInfoItemType, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new Application(contractInfoItemType, str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ContractInfoItemType OLrzqt() {
                return this.copydefault;
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
                return this.copydefault == application.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.copydefault.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ShowCustomViewDialog(type=" + this.copydefault + ", instId=" + this.KWHzl + ", instType=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull ContractInfoItemType contractInfoItemType, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(contractInfoItemType, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.copydefault = contractInfoItemType;
                this.KWHzl = str;
                this.EZpvd = str2;
            }
        }
    }
}
