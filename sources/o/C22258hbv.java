package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.hbv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22258hbv extends AbstractC31189lpN<C20074gZy, hCV> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final Function1<C20074gZy, Unit> AEQbTJ;
    public final Function1<C20074gZy, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.gZy, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.gZy, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C22258hbv(@NotNull Function1<? super C20074gZy, Unit> function1, Function1<? super C20074gZy, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
        this.copydefault = function12;
    }

    /* JADX INFO: renamed from: o.hbv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hbv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.lang.String KWHzl(int i) {
            return "web3_dex_history_swap_bridge_" + i;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public hCV KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCV hcvEZpvd = hCV.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hcvEZpvd, "");
        return hcvEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/lpN$Activity;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0137  */
    @Override // o.AbstractC31189lpN, o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull AbstractC31189lpN<C20074gZy, hCV>.Activity activity, @NotNull C20074gZy c20074gZy) {
        java.lang.String str;
        java.lang.String localizedNumberWithSymbol$default;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c20074gZy, "");
        hCV hcv = (hCV) activity.KWHzl();
        hcv.getRoot().setContentDescription(Companion.KWHzl(activity.getLayoutPosition()));
        if (c20074gZy.gEmmrt().length() > 0) {
            hcv.valueOf.setText(c20074gZy.gEmmrt());
            AppCompatTextView appCompatTextView = hcv.valueOf;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            android.view.View view = hcv.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(Intrinsics.EZpvd(getAdapter().getItems().get(0), c20074gZy) ^ true ? 0 : 8);
        } else {
            AppCompatTextView appCompatTextView2 = hcv.valueOf;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(8);
            android.view.View view2 = hcv.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(8);
        }
        hcv.DbNXlk.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.swzYdv));
        hcv.djBIcL.setText(c20074gZy.OLrzqt());
        if (c20074gZy.AhwBna() == OrderSubStatus.Failed) {
            hcv.gEmmrt.setFailedState();
            AppCompatTextView appCompatTextView3 = hcv.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            appCompatTextView3.setVisibility(8);
            AppCompatTextView appCompatTextView4 = hcv.values;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
            appCompatTextView4.setVisibility(8);
        } else {
            hcv.gEmmrt.setSuccessState();
            AppCompatTextView appCompatTextView5 = hcv.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "");
            appCompatTextView5.setVisibility(0);
            AppCompatTextView appCompatTextView6 = hcv.values;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "");
            appCompatTextView6.setVisibility(0);
        }
        hcv.AYXKKw.setText(C23271hvA.copydefault.KWHzl(C23313hvq.mulCheckS$default(c20074gZy.copydefault(), -1, null, null, null, 14, null), c20074gZy.AEQbTJ(), "12"));
        AppCompatTextView appCompatTextView7 = hcv.values;
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = hcv.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        appCompatTextView7.setTextColor(C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null));
        AppCompatTextView appCompatTextView8 = hcv.values;
        java.lang.String strFetchVPNInfo = c20074gZy.fetchVPNInfo();
        java.lang.String str2 = (strFetchVPNInfo.length() <= 0 || !C23313hvq.AhwBna(strFetchVPNInfo, -1)) ? null : strFetchVPNInfo;
        if (str2 == null || (localizedNumberWithSymbol$default = C23322hvz.toLocalizedNumberWithSymbol$default(str2, c20074gZy.values(), false, null, false, false, 22, null)) == null) {
            str = "--";
        } else {
            str = Marker.ANY_NON_NULL_MARKER + localizedNumberWithSymbol$default;
            if (str == null) {
            }
        }
        appCompatTextView8.setText(str);
        hcv.AkhnZx.EZpvd(c20074gZy.KWHzl());
        hcv.AkhnZx.KWHzl(c20074gZy.isConnected());
        ConstraintLayout root = hcv.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, c20074gZy));
        C24251iaM c24251iaM = hcv.AkhnZx;
        c24251iaM.setOnClickListener(new Application(c24251iaM, 1000L, this, c20074gZy));
    }

    /* JADX INFO: renamed from: o.hbv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C22258hbv EZpvd;
        public final /* synthetic */ C20074gZy KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C22258hbv c22258hbv, C20074gZy c20074gZy) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c22258hbv;
            this.KWHzl = c20074gZy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ.invoke(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.hbv$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C22258hbv EZpvd;
        public final /* synthetic */ C20074gZy KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C22258hbv c22258hbv, C20074gZy c20074gZy) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c22258hbv;
            this.KWHzl = c20074gZy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.copydefault;
                if (function1 != null) {
                    function1.invoke(this.KWHzl);
                }
            }
        }
    }
}
