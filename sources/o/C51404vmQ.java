package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.okinc.core.util.SPUtils;
import com.okinc.tradingbot.impl.market_place.helper.MarketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1;
import com.okinc.tradingbot.impl.market_place.helper.MarketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vmQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51404vmQ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final androidx.fragment.app.Fragment AEQbTJ;
    public final Application KWHzl;

    public C51404vmQ(@NotNull androidx.fragment.app.Fragment fragment, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(application, "");
        this.AEQbTJ = fragment;
        this.KWHzl = application;
    }

    /* JADX INFO: renamed from: o.vmQ$Application */
    public static final class Application {
        public final boolean AEQbTJ;
        public final boolean KWHzl;
        public final Function0<Unit> OLrzqt;
        public final Function0<Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vmQ$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, boolean z, boolean z2, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z2 = application.KWHzl;
            }
            if ((i & 4) != 0) {
                function0 = application.OLrzqt;
            }
            if ((i & 8) != 0) {
                function02 = application.copydefault;
            }
            return application.copydefault(z, z2, function0, function02);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(boolean z, boolean z2, Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(function02, "");
            return new Application(z, z2, function0, function02);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
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
            return this.AEQbTJ == application.AEQbTJ && this.KWHzl == application.KWHzl && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.copydefault, application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
            int iHashCode2 = java.lang.Boolean.hashCode(this.KWHzl);
            Function0<Unit> function0 = this.OLrzqt;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (function0 == null ? 0 : function0.hashCode())) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Config(showHistoryIcon=" + this.AEQbTJ + ", shouldShowGlobalToolbar=" + this.KWHzl + ", onHistoryClick=" + this.OLrzqt + ", onMoreClick=" + this.copydefault + ")";
        }

        public Application(boolean z, boolean z2, Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(function02, "");
            this.AEQbTJ = z;
            this.KWHzl = z2;
            this.OLrzqt = function0;
            this.copydefault = function02;
        }
    }

    public final android.content.Context EZpvd() {
        android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return contextRequireContext;
    }

    public final android.widget.LinearLayout KWHzl() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(EZpvd());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        if (this.KWHzl.KWHzl() && this.KWHzl.EZpvd() != null) {
            AppCompatImageView appCompatImageViewKWHzl = KWHzl(C52761wXj.TaskDescription.DcMfJKfNUfqk, C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), new Function0() { // from class: o.vmS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C51404vmQ.AEQbTJ(this.KWHzl);
                }
            });
            appCompatImageViewKWHzl.setTag("history_icon");
            linearLayout.addView(appCompatImageViewKWHzl);
        }
        AppCompatImageView appCompatImageViewKWHzl2 = KWHzl(C52761wXj.TaskDescription.HJWChPOZOJIj, C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), new Function0() { // from class: o.vmP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51404vmQ.EZpvd(this.KWHzl);
            }
        });
        appCompatImageViewKWHzl2.setTag("tabs_dots_icon");
        linearLayout.addView(appCompatImageViewKWHzl2);
        appCompatImageViewKWHzl2.setVisibility((!this.KWHzl.copydefault() || C56071xvr.gEmmrt.ejfBZ()) ? 8 : 0);
        return linearLayout;
    }

    public static final Unit AEQbTJ(C51404vmQ c51404vmQ) {
        c51404vmQ.KWHzl.EZpvd().invoke();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C51404vmQ c51404vmQ) {
        c51404vmQ.KWHzl.AEQbTJ().invoke();
        return Unit.INSTANCE;
    }

    public final AppCompatImageView KWHzl(int i, int i2, Function0<Unit> function0) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(EZpvd());
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatImageView.setPadding(i2, 0, 0, 0);
        appCompatImageView.setImageResource(i);
        appCompatImageView.setImageTintList(ContextCompat.getColorStateList(appCompatImageView.getContext(), C52761wXj.Activity.fdOvFl));
        appCompatImageView.setOnClickListener(new TaskDescription(appCompatImageView, 1000L, function0));
        return appCompatImageView;
    }

    /* JADX INFO: renamed from: o.vmQ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vmQ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final boolean EZpvd() {
            java.lang.String string = SPUtils.getString(C49707utd.Companion.KWHzl(), "");
            Intrinsics.copydefault((java.lang.Object) string);
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) string, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listSplit$default) {
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) obj)) {
                    arrayList.add(obj);
                }
            }
            return !arrayList.contains("BOTS");
        }

        public final Flow<java.lang.Boolean> copydefault() {
            return FlowKt.distinctUntilChanged(FlowKt.onStart(FlowKt.callbackFlow(new MarketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1(null)), new MarketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$2(null)));
        }
    }

    /* JADX INFO: renamed from: o.vmQ$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.invoke();
            }
        }
    }
}
