package o;

import com.okinc.market.quotation.ui.model.OptionsDirection;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.search.features.navigation.options.model.NavSearchOptionsQuotePageVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40231qOe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qOm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40239qOm implements InterfaceC40231qOe {
    public final ActionBar.Application AEQbTJ;
    public final ActionBar.C0923ActionBar EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C40239qOm() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40239qOm copy$default(C40239qOm c40239qOm, ActionBar.C0923ActionBar c0923ActionBar, ActionBar.Application application, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c0923ActionBar = c40239qOm.EZpvd;
        }
        if ((i & 2) != 0) {
            application = c40239qOm.AEQbTJ;
        }
        return c40239qOm.KWHzl(c0923ActionBar, application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar.Application EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40239qOm KWHzl(ActionBar.C0923ActionBar c0923ActionBar, ActionBar.Application application) {
        return new C40239qOm(c0923ActionBar, application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar.C0923ActionBar OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40239qOm)) {
            return false;
        }
        C40239qOm c40239qOm = (C40239qOm) obj;
        return Intrinsics.EZpvd(this.EZpvd, c40239qOm.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c40239qOm.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ActionBar.C0923ActionBar c0923ActionBar = this.EZpvd;
        int iHashCode = c0923ActionBar == null ? 0 : c0923ActionBar.hashCode();
        ActionBar.Application application = this.AEQbTJ;
        return (iHashCode * 31) + (application != null ? application.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavSearchDerivativesSectionVo(futuresTabVo=" + this.EZpvd + ", optionsTabVo=" + this.AEQbTJ + ")";
    }

    public C40239qOm(ActionBar.C0923ActionBar c0923ActionBar, ActionBar.Application application) {
        this.EZpvd = c0923ActionBar;
        this.AEQbTJ = application;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.qOm$ActionBar$ActionBar:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.qOm$ActionBar$ActionBar) : (r2v0 o.qOm$ActionBar$ActionBar))
  (wrap:o.qOm$ActionBar$Application:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.qOm$ActionBar$Application) : (r3v0 o.qOm$ActionBar$Application))
 A[MD:(o.qOm$ActionBar$ActionBar, o.qOm$ActionBar$Application):void (m)] (LINE:59) call: o.qOm.<init>(o.qOm$ActionBar$ActionBar, o.qOm$ActionBar$Application):void type: THIS */
    public /* synthetic */ C40239qOm(ActionBar.C0923ActionBar c0923ActionBar, ActionBar.Application application, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c0923ActionBar, (i & 2) != 0 ? null : application);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC40231qOe.StateListAnimator.copydefault(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        if (interfaceC40516qYt instanceof C40239qOm) {
            ActionBar.C0923ActionBar c0923ActionBar = this.EZpvd;
            java.lang.Boolean boolValueOf = c0923ActionBar != null ? java.lang.Boolean.valueOf(c0923ActionBar.KWHzl()) : null;
            C40239qOm c40239qOm = (C40239qOm) interfaceC40516qYt;
            ActionBar.C0923ActionBar c0923ActionBar2 = c40239qOm.EZpvd;
            if (Intrinsics.EZpvd(boolValueOf, c0923ActionBar2 != null ? java.lang.Boolean.valueOf(c0923ActionBar2.KWHzl()) : null)) {
                ActionBar.Application application = this.AEQbTJ;
                java.lang.Boolean boolValueOf2 = application != null ? java.lang.Boolean.valueOf(application.KWHzl()) : null;
                ActionBar.Application application2 = c40239qOm.AEQbTJ;
                if (Intrinsics.EZpvd(boolValueOf2, application2 != null ? java.lang.Boolean.valueOf(application2.KWHzl()) : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o.qOm$ActionBar */
    public static abstract class ActionBar {
        public final boolean OLrzqt;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 boolean) A[MD:(boolean):void (m)] call: o.qOm.ActionBar.<init>(boolean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean KWHzl() {
            return this.OLrzqt;
        }

        public ActionBar(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX INFO: renamed from: o.qOm$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0923ActionBar extends ActionBar {
            public final boolean AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0923ActionBar copy$default(C0923ActionBar c0923ActionBar, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = c0923ActionBar.AEQbTJ;
                }
                return c0923ActionBar.KWHzl(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0923ActionBar KWHzl(boolean z) {
                return new C0923ActionBar(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C40239qOm.ActionBar
            public boolean KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0923ActionBar) && this.AEQbTJ == ((C0923ActionBar) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FuturesTabVo(isActive=" + this.AEQbTJ + ")";
            }

            public C0923ActionBar(boolean z) {
                super(z, null);
                this.AEQbTJ = z;
            }
        }

        /* JADX INFO: renamed from: o.qOm$ActionBar$Application */
        public static final class Application extends ActionBar {
            public final boolean AEQbTJ;
            public final java.lang.String AhwBna;
            public final int EZpvd;
            public final OptionsDirection KWHzl;
            public final java.util.List<NavSearchOptionsQuotePageVo> copydefault;
            public final kotlin.Pair<SortBy, SortOrder> djBIcL;
            public final int valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.qOm$ActionBar$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, boolean z, java.util.List list, int i, int i2, java.lang.String str, OptionsDirection optionsDirection, kotlin.Pair pair, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    z = application.AEQbTJ;
                }
                if ((i3 & 2) != 0) {
                    list = application.copydefault;
                }
                java.util.List list2 = list;
                if ((i3 & 4) != 0) {
                    i = application.valueOf;
                }
                int i4 = i;
                if ((i3 & 8) != 0) {
                    i2 = application.EZpvd;
                }
                int i5 = i2;
                if ((i3 & 16) != 0) {
                    str = application.AhwBna;
                }
                java.lang.String str2 = str;
                if ((i3 & 32) != 0) {
                    optionsDirection = application.KWHzl;
                }
                OptionsDirection optionsDirection2 = optionsDirection;
                if ((i3 & 64) != 0) {
                    pair = application.djBIcL;
                }
                return application.EZpvd(z, list2, i4, i5, str2, optionsDirection2, pair);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int AEQbTJ() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final kotlin.Pair<SortBy, SortOrder> AYXKKw() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AhwBna() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OptionsDirection EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application EZpvd(boolean z, @NotNull java.util.List<NavSearchOptionsQuotePageVo> list, int i, int i2, java.lang.String str, @NotNull OptionsDirection optionsDirection, @NotNull kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(optionsDirection, "");
                Intrinsics.checkNotNullParameter(pair, "");
                return new Application(z, list, i, i2, str, optionsDirection, pair);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C40239qOm.ActionBar
            public boolean KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<NavSearchOptionsQuotePageVo> copydefault() {
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
                return this.AEQbTJ == application.AEQbTJ && Intrinsics.EZpvd(this.copydefault, application.copydefault) && this.valueOf == application.valueOf && this.EZpvd == application.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) application.AhwBna) && this.KWHzl == application.KWHzl && Intrinsics.EZpvd(this.djBIcL, application.djBIcL);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
                int iHashCode2 = this.copydefault.hashCode();
                int iHashCode3 = java.lang.Integer.hashCode(this.valueOf);
                int iHashCode4 = java.lang.Integer.hashCode(this.EZpvd);
                java.lang.String str = this.AhwBna;
                return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.KWHzl.hashCode()) * 31) + this.djBIcL.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OptionsTabVo(isActive=" + this.AEQbTJ + ", quotePageVoList=" + this.copydefault + ", selectedPageIndex=" + this.valueOf + ", selectedDatePeriodIndex=" + this.EZpvd + ", strikePrice=" + this.AhwBna + ", direction=" + this.KWHzl + ", sorter=" + this.djBIcL + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.Pair<? extends com.okinc.market.quotation.ui.model.SortBy, ? extends com.okinc.market.quotation.ui.model.SortOrder> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Application(boolean z, @NotNull java.util.List<NavSearchOptionsQuotePageVo> list, int i, int i2, java.lang.String str, @NotNull OptionsDirection optionsDirection, @NotNull kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
                super(z, null);
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(optionsDirection, "");
                Intrinsics.checkNotNullParameter(pair, "");
                this.AEQbTJ = z;
                this.copydefault = list;
                this.valueOf = i;
                this.EZpvd = i2;
                this.AhwBna = str;
                this.KWHzl = optionsDirection;
                this.djBIcL = pair;
            }
        }
    }
}
