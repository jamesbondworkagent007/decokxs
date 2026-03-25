package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wPY extends android.widget.FrameLayout {
    public final AbstractC48336uNs KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wPY(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wPY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.wPY.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wPY(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wPY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC48336uNs abstractC48336uNsAEQbTJ = AbstractC48336uNs.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC48336uNsAEQbTJ, "");
        this.KWHzl = abstractC48336uNsAEQbTJ;
    }

    public static final class Activity implements Function0<Unit> {
        public final /* synthetic */ wPY AEQbTJ;
        public final /* synthetic */ TacticsListButtonItem EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(TacticsListButtonItem tacticsListButtonItem, wPY wpy) {
            this.EZpvd = tacticsListButtonItem;
            this.AEQbTJ = wpy;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd.AEQbTJ(), (java.lang.Object) "strategy_button_start")) {
                C52794wYp c52794wYp = this.AEQbTJ.KWHzl.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                c52794wYp.setVisibility(0);
                this.AEQbTJ.KWHzl.KWHzl.setText(this.AEQbTJ.OLrzqt("strategy_button_starting"));
                C52794wYp.startLoading$default(this.AEQbTJ.KWHzl.KWHzl, 0L, 1, null);
                android.widget.LinearLayout linearLayout = this.AEQbTJ.KWHzl.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                C55328xhq.showWithLoading$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C55688xof.Application.openOptionsMenu), null, 0, null, 0, 0, 62, null);
            }
        }
    }

    public static final Unit copydefault(Function2 function2, TacticsListButtonItem tacticsListButtonItem, TacticsData tacticsData, C52705wVh c52705wVh) {
        Intrinsics.checkNotNullParameter(c52705wVh, "");
        if (function2 != null) {
            function2.invoke(tacticsListButtonItem.AEQbTJ(), tacticsData);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.wPY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(wPY wpy, java.util.List list, TacticsData tacticsData, yHO yho, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            yho = null;
        }
        if ((i & 8) != 0) {
            function2 = null;
        }
        wpy.setData(list, tacticsData, yho, function2);
    }

    public static final void setData$setData(C52705wVh c52705wVh, wPY wpy, TacticsData tacticsData, yHO<? super java.lang.String, ? super TacticsData, ? super Function0<Unit>, Unit> yho, Function2<? super java.lang.String, ? super TacticsData, Unit> function2, TacticsListButtonItem tacticsListButtonItem) {
        java.lang.String strAEQbTJ = tacticsListButtonItem != null ? tacticsListButtonItem.AEQbTJ() : null;
        c52705wVh.setText(wpy.OLrzqt(strAEQbTJ));
        c52705wVh.setContentDescription(strAEQbTJ);
        c52705wVh.setOKDSType(260);
        android.content.Context context = c52705wVh.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C49659usi.setButtonDrawable$default(c52705wVh, context, java.lang.Integer.valueOf(wpy.AEQbTJ(strAEQbTJ)), null, 16, 4, null);
        wpy.EZpvd(c52705wVh, tacticsListButtonItem, tacticsData, yho, function2);
    }

    public final void setData(@NotNull java.util.List<TacticsListButtonItem> list, @NotNull TacticsData tacticsData, yHO<? super java.lang.String, ? super TacticsData, ? super Function0<Unit>, Unit> yho, Function2<? super java.lang.String, ? super TacticsData, Unit> function2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(tacticsData, "");
        AbstractC48336uNs abstractC48336uNs = this.KWHzl;
        for (C52705wVh c52705wVh : yDY.gEmmrt(abstractC48336uNs.EZpvd, abstractC48336uNs.AEQbTJ, abstractC48336uNs.copydefault)) {
            Intrinsics.copydefault(c52705wVh);
            KWHzl(c52705wVh);
        }
        if (list.isEmpty()) {
            android.widget.LinearLayout linearLayout = abstractC48336uNs.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            C52794wYp c52794wYp = abstractC48336uNs.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
            setVisibility(8);
            return;
        }
        setVisibility(0);
        LinearLayout.LayoutParams layoutParams = null;
        if (list.size() == 1) {
            java.util.List<java.lang.String> listOLrzqt = TacticsUiConst.TaskDescription.AEQbTJ.OLrzqt();
            TacticsListButtonItem tacticsListButtonItem = (TacticsListButtonItem) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listOLrzqt), tacticsListButtonItem != null ? tacticsListButtonItem.AEQbTJ() : null)) {
                C52794wYp c52794wYp2 = abstractC48336uNs.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                c52794wYp2.setVisibility(0);
                C52794wYp c52794wYp3 = abstractC48336uNs.KWHzl;
                TacticsListButtonItem tacticsListButtonItem2 = (TacticsListButtonItem) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
                c52794wYp3.setText(OLrzqt(tacticsListButtonItem2 != null ? tacticsListButtonItem2.AEQbTJ() : null));
                C52794wYp.startLoading$default(abstractC48336uNs.KWHzl, 0L, 1, null);
                android.widget.LinearLayout linearLayout2 = abstractC48336uNs.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                linearLayout2.setVisibility(8);
                return;
            }
        }
        abstractC48336uNs.KWHzl.fIwbmz();
        C52794wYp c52794wYp4 = abstractC48336uNs.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52794wYp4, "");
        c52794wYp4.setVisibility(8);
        android.widget.LinearLayout linearLayout3 = abstractC48336uNs.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        linearLayout3.setVisibility(0);
        int size = list.size();
        if (size == 1) {
            C52705wVh c52705wVh2 = abstractC48336uNs.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52705wVh2, "");
            c52705wVh2.setVisibility(8);
            C52705wVh c52705wVh3 = abstractC48336uNs.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52705wVh3, "");
            c52705wVh3.setVisibility(8);
            C52705wVh c52705wVh4 = abstractC48336uNs.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52705wVh4, "");
            c52705wVh4.setVisibility(0);
            C52705wVh c52705wVh5 = abstractC48336uNs.copydefault;
            ViewGroup.LayoutParams layoutParams2 = c52705wVh5.getLayoutParams();
            LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams3 != null) {
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams = layoutParams3;
            }
            c52705wVh5.setLayoutParams(layoutParams);
            Intrinsics.copydefault(c52705wVh5);
            setData$setData(c52705wVh5, this, tacticsData, yho, function2, (TacticsListButtonItem) CollectionsKt___CollectionsKt.AkhnZx(list, 0));
            return;
        }
        if (size == 2) {
            C52705wVh c52705wVh6 = abstractC48336uNs.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52705wVh6, "");
            c52705wVh6.setVisibility(0);
            C52705wVh c52705wVh7 = abstractC48336uNs.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52705wVh7, "");
            c52705wVh7.setVisibility(8);
            C52705wVh c52705wVh8 = abstractC48336uNs.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52705wVh8, "");
            c52705wVh8.setVisibility(0);
            C52705wVh c52705wVh9 = abstractC48336uNs.copydefault;
            ViewGroup.LayoutParams layoutParams4 = c52705wVh9.getLayoutParams();
            LinearLayout.LayoutParams layoutParams5 = layoutParams4 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams4 : null;
            if (layoutParams5 != null) {
                layoutParams5.setMarginStart(C55298xhM.dp2px$default(8.0f, null, 1, null));
            } else {
                layoutParams5 = null;
            }
            c52705wVh9.setLayoutParams(layoutParams5);
            Intrinsics.copydefault(c52705wVh9);
            setData$setData(c52705wVh9, this, tacticsData, yho, function2, (TacticsListButtonItem) CollectionsKt___CollectionsKt.AkhnZx(list, 0));
            C52705wVh c52705wVh10 = abstractC48336uNs.EZpvd;
            ViewGroup.LayoutParams layoutParams6 = c52705wVh10.getLayoutParams();
            LinearLayout.LayoutParams layoutParams7 = layoutParams6 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams6 : null;
            if (layoutParams7 != null) {
                layoutParams7.setMarginEnd(0);
                layoutParams7.setMarginStart(0);
                layoutParams = layoutParams7;
            }
            c52705wVh10.setLayoutParams(layoutParams);
            Intrinsics.copydefault(c52705wVh10);
            setData$setData(c52705wVh10, this, tacticsData, yho, function2, (TacticsListButtonItem) CollectionsKt___CollectionsKt.AkhnZx(list, 1));
            return;
        }
        C52705wVh c52705wVh11 = abstractC48336uNs.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c52705wVh11, "");
        c52705wVh11.setVisibility(0);
        C52705wVh c52705wVh12 = abstractC48336uNs.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52705wVh12, "");
        c52705wVh12.setVisibility(0);
        C52705wVh c52705wVh13 = abstractC48336uNs.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52705wVh13, "");
        c52705wVh13.setVisibility(0);
        C52705wVh c52705wVh14 = abstractC48336uNs.copydefault;
        ViewGroup.LayoutParams layoutParams8 = c52705wVh14.getLayoutParams();
        LinearLayout.LayoutParams layoutParams9 = layoutParams8 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams8 : null;
        if (layoutParams9 != null) {
            layoutParams9.setMarginStart(C55298xhM.dp2px$default(8.0f, null, 1, null));
        } else {
            layoutParams9 = null;
        }
        c52705wVh14.setLayoutParams(layoutParams9);
        Intrinsics.copydefault(c52705wVh14);
        setData$setData(c52705wVh14, this, tacticsData, yho, function2, (TacticsListButtonItem) CollectionsKt___CollectionsKt.AkhnZx(list, 0));
        C52705wVh c52705wVh15 = abstractC48336uNs.AEQbTJ;
        ViewGroup.LayoutParams layoutParams10 = c52705wVh15.getLayoutParams();
        LinearLayout.LayoutParams layoutParams11 = layoutParams10 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams10 : null;
        if (layoutParams11 != null) {
            layoutParams11.setMarginEnd(0);
            layoutParams11.setMarginStart(C55298xhM.dp2px$default(8.0f, null, 1, null));
        } else {
            layoutParams11 = null;
        }
        c52705wVh15.setLayoutParams(layoutParams11);
        Intrinsics.copydefault(c52705wVh15);
        setData$setData(c52705wVh15, this, tacticsData, yho, function2, (TacticsListButtonItem) CollectionsKt___CollectionsKt.AkhnZx(list, 1));
        C52705wVh c52705wVh16 = abstractC48336uNs.EZpvd;
        ViewGroup.LayoutParams layoutParams12 = c52705wVh16.getLayoutParams();
        LinearLayout.LayoutParams layoutParams13 = layoutParams12 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams12 : null;
        if (layoutParams13 != null) {
            layoutParams13.setMarginEnd(0);
            layoutParams13.setMarginStart(0);
            layoutParams = layoutParams13;
        }
        c52705wVh16.setLayoutParams(layoutParams);
        Intrinsics.copydefault(c52705wVh16);
        setData$setData(c52705wVh16, this, tacticsData, yho, function2, (TacticsListButtonItem) CollectionsKt___CollectionsKt.AkhnZx(list, 2));
    }

    public final void KWHzl(@NotNull C52705wVh c52705wVh) {
        Intrinsics.checkNotNullParameter(c52705wVh, "");
        c52705wVh.setPressed(false);
        c52705wVh.setSelected(false);
        c52705wVh.setActivated(false);
        c52705wVh.clearFocus();
        android.graphics.drawable.Drawable background = c52705wVh.getBackground();
        if (background != null) {
            background.setState(new int[0]);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ wPY AYXKKw;
        public final /* synthetic */ TacticsData EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ yHO OLrzqt;
        public final /* synthetic */ TacticsListButtonItem copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, yHO yho, TacticsListButtonItem tacticsListButtonItem, TacticsData tacticsData, wPY wpy) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = yho;
            this.copydefault = tacticsListButtonItem;
            this.EZpvd = tacticsData;
            this.AYXKKw = wpy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                yHO yho = this.OLrzqt;
                if (yho != null) {
                    yho.invoke(this.copydefault.AEQbTJ(), this.EZpvd, new Activity(this.copydefault, this.AYXKKw));
                }
            }
        }
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "CreateAiBotFromBacktest") ? C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0) : C56033xvF.OLrzqt(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int AEQbTJ(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -900037503:
                    if (str.equals("strategy_button_details")) {
                        return C52761wXj.TaskDescription.HJWChPfrwjPh;
                    }
                    break;
                case -222301146:
                    if (str.equals("CreateAiBotFromBacktest")) {
                        return C52761wXj.TaskDescription.sEAkxl;
                    }
                    break;
                case 78862271:
                    if (str.equals("SHARE")) {
                        return C52761wXj.TaskDescription.fsSxsn;
                    }
                    break;
                case 270317091:
                    if (str.equals("strategy_button_stop")) {
                        return C48033uCm.ActionBar.isConnected;
                    }
                    break;
                case 322024080:
                    if (str.equals("strategy_button_recreate")) {
                        return C52761wXj.TaskDescription.zKcAg;
                    }
                    break;
                case 334196078:
                    str.equals("MORE_FUNC");
                    break;
                case 700833347:
                    if (str.equals("strategy_cancel_reserve")) {
                        return C52761wXj.TaskDescription.Ufzxmz;
                    }
                    break;
                case 1677034225:
                    if (str.equals("strategy_reserve_stop")) {
                        return C52761wXj.TaskDescription.akftKQ;
                    }
                    break;
                case 1899963035:
                    if (str.equals("strategy_button_modify")) {
                        return C52761wXj.TaskDescription.DQzvGNdrmXxu;
                    }
                    break;
            }
        }
        return C52761wXj.TaskDescription.onAvailable;
    }

    public final void EZpvd(C52705wVh c52705wVh, final TacticsListButtonItem tacticsListButtonItem, final TacticsData tacticsData, yHO<? super java.lang.String, ? super TacticsData, ? super Function0<Unit>, Unit> yho, final Function2<? super java.lang.String, ? super TacticsData, Unit> function2) {
        if (tacticsListButtonItem == null) {
            return;
        }
        c52705wVh.setOnClickListener(new ActionBar(c52705wVh, 1000L, yho, tacticsListButtonItem, tacticsData, this));
        c52705wVh.setEnabled(tacticsListButtonItem.EZpvd());
        c52705wVh.OLrzqt(new Function1() { // from class: o.wPZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wPY.copydefault(function2, tacticsListButtonItem, tacticsData, (C52705wVh) obj);
            }
        });
        if (TacticsUiConst.TaskDescription.AEQbTJ.OLrzqt().contains(tacticsListButtonItem.AEQbTJ())) {
            C52794wYp.startLoading$default(c52705wVh, 0L, 1, null);
        }
    }
}
