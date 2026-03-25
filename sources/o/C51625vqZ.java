package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.unify_trade.biz.BotUserSummaryData;
import com.okinc.unify_trade.biz.StrategyUserSummaryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC51686vrh;
import o.ActivityC51906vvp;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vqZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51625vqZ extends android.widget.FrameLayout {
    public StrategyUserSummaryData KWHzl;
    public AbstractC50833vbc copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51625vqZ(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:35) call: o.vqZ.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C51625vqZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51625vqZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.dpErvT, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC50833vbc) viewDataBindingInflate;
        wPQ.OLrzqt(this);
        KWHzl();
    }

    public final void KWHzl(@NotNull BotUserSummaryData botUserSummaryData) {
        Intrinsics.checkNotNullParameter(botUserSummaryData, "");
        this.KWHzl = botUserSummaryData.getOrigin();
        EZpvd();
        AbstractC50833vbc abstractC50833vbc = this.copydefault;
        android.widget.TextView textView = abstractC50833vbc.values;
        java.lang.String title = botUserSummaryData.getTitle();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) title)) {
            title = C33070mpX.AYXKKw(C55688xof.Application.OeawrHOeawrH);
        }
        textView.setText(title);
        android.widget.TextView textView2 = abstractC50833vbc.djBIcL;
        java.lang.String totalAsset = botUserSummaryData.getTotalAsset();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalAsset)) {
            totalAsset = "0";
        }
        textView2.setText(totalAsset);
        abstractC50833vbc.AYXKKw.setText(botUserSummaryData.getTotalProfit());
        abstractC50833vbc.AYXKKw.setTextColor(botUserSummaryData.getTotalProfitColor());
    }

    public final void KWHzl() {
        C52705wVh c52705wVh = this.copydefault.copydefault;
        c52705wVh.setOnClickListener(new StateListAnimator(c52705wVh, 1000L, this));
        this.copydefault.copydefault.OLrzqt(new Function1() { // from class: o.vqW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51625vqZ.copydefault(this.AEQbTJ, (C52705wVh) obj);
            }
        });
        android.view.View view = this.copydefault.gEmmrt;
        view.setOnClickListener(new ActionBar(view, 1000L, this));
    }

    public static final Unit copydefault(C51625vqZ c51625vqZ, C52705wVh c52705wVh) {
        Intrinsics.checkNotNullParameter(c52705wVh, "");
        c51625vqZ.OLrzqt();
        c51625vqZ.OLrzqt("lead_trader");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd() {
        InterfaceC55881xsM interfaceC55881xsMCopydefault;
        boolean z;
        xOR xorCopydefault;
        C55886xsR c55886xsR = C55886xsR.OLrzqt;
        InterfaceC55881xsM interfaceC55881xsMCopydefault2 = c55886xsR.copydefault();
        int i = 0;
        boolean z2 = (interfaceC55881xsMCopydefault2 != null && interfaceC55881xsMCopydefault2.EZpvd()) || ((interfaceC55881xsMCopydefault = c55886xsR.copydefault()) != null && interfaceC55881xsMCopydefault.OLrzqt());
        if (C55697xoo.OLrzqt.isConnected()) {
            StrategyUserSummaryData strategyUserSummaryData = this.KWHzl;
            if (C33129mqd.valueOf(strategyUserSummaryData != null ? strategyUserSummaryData.getStgyCount() : null, 0)) {
                z = true;
            }
        } else {
            z = false;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        boolean z3 = (interfaceC54581xNrOLrzqt == null || (xorCopydefault = interfaceC54581xNrOLrzqt.copydefault()) == null || xorCopydefault.AhwBna()) ? false : true;
        copydefault(z2);
        C52705wVh c52705wVh = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52705wVh, "");
        c52705wVh.setVisibility(z2 ? 0 : 8);
        android.widget.TextView textView = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((!z || z2) ? 8 : 0);
        android.widget.LinearLayout linearLayout = this.copydefault.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (z) {
            i = 8;
        } else if (z2) {
            StrategyUserSummaryData strategyUserSummaryData2 = this.KWHzl;
            if (!C33129mqd.AhwBna(strategyUserSummaryData2 != null ? strategyUserSummaryData2.getTdyTotalProfit() : null, 0)) {
            }
        }
        linearLayout.setVisibility(i);
        this.copydefault.copydefault.setEnabled(!z3);
        this.copydefault.AEQbTJ.setTextColor(C33070mpX.copydefault(z3 ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.fdOvFl));
        this.copydefault.KWHzl.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(z3 ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.fdOvFl)));
    }

    public final void copydefault(boolean z) {
        ConstraintSet constraintSet = new ConstraintSet();
        if (z) {
            this.copydefault.EZpvd.setReferencedIds(new int[]{C48033uCm.Application.addOnMenuVisibilityListener, C48033uCm.Application.isAvailable});
            constraintSet.clone(getContext(), C48033uCm.Activity.hfeTOA);
        } else {
            this.copydefault.EZpvd.setReferencedIds(new int[]{C48033uCm.Application.Rstyle, C48033uCm.Application.addOnMenuVisibilityListener});
            constraintSet.clone(getContext(), C48033uCm.Activity.dpErvT);
        }
        android.view.View root = this.copydefault.getRoot();
        Intrinsics.copydefault(root, "");
        constraintSet.applyTo((ConstraintLayout) root);
    }

    public final void OLrzqt() {
        if (copydefault()) {
            return;
        }
        ActivityC51906vvp.TaskDescription taskDescription = ActivityC51906vvp.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ActivityC51906vvp.TaskDescription.startActivity$default(taskDescription, context, 0, 2, null);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (copydefault()) {
            return;
        }
        ActivityC51686vrh.TaskDescription taskDescription = ActivityC51686vrh.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        taskDescription.EZpvd(context, (24 & 2) != 0 ? "" : str, (24 & 4) != 0 ? "" : str2, (24 & 8) != 0 ? "" : null, (24 & 16) != 0 ? "" : null);
    }

    public final boolean copydefault() {
        xOR xorCopydefault;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (xorCopydefault = interfaceC54581xNrOLrzqt.copydefault()) == null || xorCopydefault.AhwBna()) {
            return false;
        }
        C55326xho.toastWithFailedIcon$default(C48033uCm.Fragment.fJk, 0, 1, (java.lang.Object) null);
        return true;
    }

    public final void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("TradingBot_Top_AssetButton_Click", (TrackChannel[]) null, new Function1() { // from class: o.vqV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51625vqZ.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vqZ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C51625vqZ AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51625vqZ c51625vqZ) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c51625vqZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String stgyCount;
            java.lang.String totalAsset;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C51625vqZ c51625vqZ = this.AEQbTJ;
                StrategyUserSummaryData strategyUserSummaryData = c51625vqZ.KWHzl;
                java.lang.String str = "";
                if (strategyUserSummaryData == null || (stgyCount = strategyUserSummaryData.getStgyCount()) == null) {
                    stgyCount = "";
                }
                StrategyUserSummaryData strategyUserSummaryData2 = this.AEQbTJ.KWHzl;
                if (strategyUserSummaryData2 != null && (totalAsset = strategyUserSummaryData2.getTotalAsset()) != null) {
                    str = totalAsset;
                }
                c51625vqZ.AEQbTJ(stgyCount, str);
                C51625vqZ c51625vqZ2 = this.AEQbTJ;
                StrategyUserSummaryData strategyUserSummaryData3 = c51625vqZ2.KWHzl;
                c51625vqZ2.OLrzqt(C33129mqd.AEQbTJ(strategyUserSummaryData3 != null ? strategyUserSummaryData3.getStgyCount() : null, 0) ? "today_pnl" : "history");
            }
        }
    }

    /* JADX INFO: renamed from: o.vqZ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C51625vqZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51625vqZ c51625vqZ) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c51625vqZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.OLrzqt();
                this.copydefault.OLrzqt("lead_trader");
            }
        }
    }
}
