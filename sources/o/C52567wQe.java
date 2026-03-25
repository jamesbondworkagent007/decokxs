package o;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.util.SPUtils;
import com.okinc.core.widget.tipswindow.AnchorPopupWindow;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wQe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52567wQe extends android.widget.FrameLayout {
    public ViewTreeObserver.OnGlobalLayoutListener AEQbTJ;
    public final uRX EZpvd;
    public java.util.List<TacticsListButtonItem> OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52567wQe(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52567wQe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:45) call: o.wQe.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52567wQe(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52567wQe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        uRX urxKWHzl = uRX.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(urxKWHzl, "");
        this.EZpvd = urxKWHzl;
        this.copydefault = SPUtils.getBoolean("isShowTipForOrderOnKline", false);
        this.OLrzqt = new java.util.ArrayList();
    }

    public final boolean KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        for (java.lang.Object parent = view.getParent(); parent instanceof android.view.View; parent = ((android.view.View) parent).getParent()) {
            try {
                if (parent instanceof RecyclerView) {
                    return ((RecyclerView) parent).getScrollState() == 0;
                }
            } catch (java.lang.Exception e) {
                pUU.valueOf("BOT", "BotOperatorButtonView " + e.getMessage());
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.wQe */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C52567wQe c52567wQe, java.util.List list, TacticsData tacticsData, yHO yho, yHO yho2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            yho = null;
        }
        if ((i & 8) != 0) {
            yho2 = null;
        }
        c52567wQe.setData(list, tacticsData, yho, yho2);
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.content.Context, android.util.AttributeSet, java.lang.Object, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r12v4 */
    public final void setData(@NotNull java.util.List<TacticsListButtonItem> list, @NotNull final TacticsData tacticsData, yHO<? super java.lang.String, ? super TacticsData, ? super Function0<Unit>, Unit> yho, final yHO<? super java.lang.String, ? super TacticsData, ? super java.lang.String, Unit> yho2) {
        java.lang.Object obj;
        long j;
        android.view.View view;
        final TacticsListButtonItem tacticsListButtonItem;
        long j2;
        int i;
        java.util.List<TacticsListButtonItem> listHDKMBd = list;
        Intrinsics.checkNotNullParameter(listHDKMBd, "");
        Intrinsics.checkNotNullParameter(tacticsData, "");
        ?? r12 = 0;
        mAE mae = (!copydefault(tacticsData.getOrderType()) || this.copydefault) ? null : new mAE(getContext(), C33070mpX.AYXKKw(C48033uCm.Fragment.RbVjfb));
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            listHDKMBd = C56405yEd.hDKMBd(list);
        }
        java.util.List<TacticsListButtonItem> list2 = listHDKMBd;
        uRX urx = this.EZpvd;
        if (list2.isEmpty()) {
            android.widget.LinearLayout linearLayout = urx.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            C52794wYp c52794wYp = urx.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
            setVisibility(8);
            return;
        }
        int i2 = 0;
        setVisibility(0);
        int i3 = 1;
        if (list2.size() == 1 && TacticsUiConst.TaskDescription.AEQbTJ.OLrzqt().contains(list2.get(0).AEQbTJ())) {
            C52794wYp c52794wYp2 = urx.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(0);
            urx.EZpvd.setText(C56033xvF.OLrzqt(list2.get(0).AEQbTJ()));
            C52794wYp.startLoading$default(urx.EZpvd, 0L, 1, null);
            android.widget.LinearLayout linearLayout2 = urx.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(8);
            return;
        }
        urx.EZpvd.fIwbmz();
        C52794wYp c52794wYp3 = urx.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
        c52794wYp3.setVisibility(8);
        android.widget.LinearLayout linearLayout3 = urx.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        linearLayout3.setVisibility(0);
        if (!KWHzl(list2)) {
            urx.AEQbTJ.removeAllViews();
            for (TacticsListButtonItem tacticsListButtonItem2 : list2) {
                if (Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem2.AEQbTJ(), (java.lang.Object) "strategy_button_more")) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    appCompatImageView.setBackground(C33070mpX.KWHzl(C48033uCm.ActionBar.OLrzqt));
                    appCompatImageView.setImageResource(C52761wXj.TaskDescription.HJWChPOZOJIj);
                    appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
                    int iDpInt$default = C55298xhM.dpInt$default(36, (android.content.Context) r12, i3, (java.lang.Object) r12);
                    appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(iDpInt$default, iDpInt$default));
                    view = appCompatImageView;
                } else {
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    C52705wVh c52705wVh = new C52705wVh(context2, r12, 2, r12);
                    c52705wVh.setOKDSType(260);
                    c52705wVh.setOKDSSize(36);
                    c52705wVh.setPaddingRelative(C55298xhM.dp2px$default(16.0f, r12, i3, r12), i2, C55298xhM.dp2px$default(16.0f, r12, i3, r12), i2);
                    c52705wVh.setText(C56033xvF.OLrzqt(tacticsListButtonItem2.AEQbTJ()));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, -2);
                    layoutParams.weight = 1.0f;
                    c52705wVh.setLayoutParams(layoutParams);
                    c52705wVh.setContentDescription(tacticsListButtonItem2.AEQbTJ());
                    view = c52705wVh;
                }
                android.view.View view2 = view;
                int i4 = i2;
                view2.setOnClickListener(new Application(view, 1000L, yho, tacticsListButtonItem2, tacticsData, urx, mae));
                urx.AEQbTJ.addView(view2);
                C52705wVh c52705wVh2 = view2 instanceof C52705wVh ? (C52705wVh) view2 : null;
                if (c52705wVh2 != null) {
                    c52705wVh2.setEnabled(tacticsListButtonItem2.EZpvd());
                    tacticsListButtonItem = tacticsListButtonItem2;
                    c52705wVh2.OLrzqt(new Function1() { // from class: o.wQc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return C52567wQe.KWHzl(yho2, tacticsListButtonItem, tacticsData, (C52705wVh) obj2);
                        }
                    });
                    if (TacticsUiConst.TaskDescription.AEQbTJ.OLrzqt().contains(tacticsListButtonItem.AEQbTJ())) {
                        j2 = 0;
                        i = 1;
                        C52794wYp.startLoading$default((C52794wYp) view2, 0L, 1, null);
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_more") && copydefault(tacticsData.getOrderType())) {
                        android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                        TaskDescription taskDescription = new TaskDescription(view2, tacticsData, mae);
                        this.AEQbTJ = taskDescription;
                        viewTreeObserver.addOnGlobalLayoutListener(taskDescription);
                    }
                    i3 = i;
                    i2 = i4;
                    r12 = 0;
                } else {
                    tacticsListButtonItem = tacticsListButtonItem2;
                }
                j2 = 0;
                i = 1;
                if (!Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_more")) {
                }
                i3 = i;
                i2 = i4;
                r12 = 0;
            }
        } else {
            int i5 = 1;
            long j3 = 0;
            int i6 = 0;
            for (java.lang.Object obj2 : list2) {
                if (i6 < 0) {
                    yDY.AYXKKw();
                }
                final TacticsListButtonItem tacticsListButtonItem3 = (TacticsListButtonItem) obj2;
                android.view.View childAt = urx.AEQbTJ.getChildAt(i6);
                C52705wVh c52705wVh3 = childAt instanceof C52705wVh ? (C52705wVh) childAt : null;
                if (c52705wVh3 != null) {
                    c52705wVh3.setText(C56033xvF.OLrzqt(tacticsListButtonItem3.AEQbTJ()));
                    c52705wVh3.setEnabled(tacticsListButtonItem3.EZpvd());
                    c52705wVh3.OLrzqt(new Function1() { // from class: o.wQf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return C52567wQe.copydefault(yho2, tacticsListButtonItem3, tacticsData, (C52705wVh) obj3);
                        }
                    });
                    boolean zContains = TacticsUiConst.TaskDescription.AEQbTJ.OLrzqt().contains(tacticsListButtonItem3.AEQbTJ());
                    if (!zContains || ((C52705wVh) childAt).fJNWhG()) {
                        obj = null;
                        if (!zContains) {
                            C52705wVh c52705wVh4 = (C52705wVh) childAt;
                            if (c52705wVh4.fJNWhG()) {
                                c52705wVh4.fIwbmz();
                            }
                        }
                    } else {
                        obj = null;
                        C52794wYp.startLoading$default((C52794wYp) childAt, j3, i5, null);
                    }
                } else {
                    obj = null;
                }
                if (childAt != null) {
                    j = j3;
                    childAt.setOnClickListener(new ActionBar(childAt, 1000L, yho, tacticsListButtonItem3, tacticsData, urx));
                } else {
                    j = j3;
                }
                i6++;
                j3 = j;
                i5 = 1;
            }
        }
        this.OLrzqt = list2;
    }

    /* JADX INFO: renamed from: o.wQe$StateListAnimator */
    public static final class StateListAnimator implements Function0<Unit> {
        public final /* synthetic */ mAE EZpvd;
        public final /* synthetic */ uRX KWHzl;
        public final /* synthetic */ TacticsListButtonItem OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(TacticsListButtonItem tacticsListButtonItem, uRX urx, mAE mae) {
            this.OLrzqt = tacticsListButtonItem;
            this.KWHzl = urx;
            this.EZpvd = mae;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            mAE mae;
            if (Intrinsics.EZpvd((java.lang.Object) this.OLrzqt.AEQbTJ(), (java.lang.Object) "strategy_button_start")) {
                C52794wYp c52794wYp = this.KWHzl.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                c52794wYp.setVisibility(0);
                this.KWHzl.EZpvd.setText(C56033xvF.OLrzqt("strategy_button_starting"));
                C52794wYp.startLoading$default(this.KWHzl.EZpvd, 0L, 1, null);
                android.widget.LinearLayout linearLayout = this.KWHzl.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                C55328xhq.showWithLoading$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C55688xof.Application.openOptionsMenu), null, 0, null, 0, 0, 62, null);
            }
            if (!Intrinsics.EZpvd((java.lang.Object) this.OLrzqt.AEQbTJ(), (java.lang.Object) "strategy_button_more") || (mae = this.EZpvd) == null) {
                return;
            }
            mae.dismiss();
        }
    }

    public static final Unit KWHzl(yHO yho, TacticsListButtonItem tacticsListButtonItem, TacticsData tacticsData, C52705wVh c52705wVh) {
        Intrinsics.checkNotNullParameter(c52705wVh, "");
        if (yho != null) {
            yho.invoke(tacticsListButtonItem.AEQbTJ(), tacticsData, tacticsListButtonItem.OLrzqt());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wQe$TaskDescription */
    public static final class TaskDescription implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ TacticsData EZpvd;
        public final /* synthetic */ mAE KWHzl;

        public TaskDescription(java.lang.Object obj, TacticsData tacticsData, mAE mae) {
            this.AEQbTJ = obj;
            this.EZpvd = tacticsData;
            this.KWHzl = mae;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (C52567wQe.this.copydefault) {
                ((android.view.View) this.AEQbTJ).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (C52567wQe.this.KWHzl((android.view.View) this.AEQbTJ)) {
                C52567wQe.this.copydefault = SPUtils.getBoolean("isShowTipForOrderOnKline", false);
                if (!C52567wQe.this.AEQbTJ((android.view.View) this.AEQbTJ, this.EZpvd.getOrderType()) || C52567wQe.this.copydefault) {
                    return;
                }
                C52567wQe.this.copydefault = true;
                SPUtils.put("isShowTipForOrderOnKline", java.lang.Boolean.TRUE);
                mAE mae = this.KWHzl;
                if (mae != null) {
                    mae.setOutsideTouchable(false);
                }
                mAE mae2 = this.KWHzl;
                if (mae2 != null) {
                    mae2.AEQbTJ((android.view.View) this.AEQbTJ, AnchorPopupWindow.Style.Gray, AnchorPopupWindow.HorizontalPosition.ALIGN_RIGHT, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wQe$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ uRX AEQbTJ;
        public final /* synthetic */ yHO EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ TacticsListButtonItem OLrzqt;
        public final /* synthetic */ TacticsData copydefault;
        public final /* synthetic */ long valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, yHO yho, TacticsListButtonItem tacticsListButtonItem, TacticsData tacticsData, uRX urx) {
            this.KWHzl = view;
            this.valueOf = j;
            this.EZpvd = yho;
            this.OLrzqt = tacticsListButtonItem;
            this.copydefault = tacticsData;
            this.AEQbTJ = urx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.valueOf || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                yHO yho = this.EZpvd;
                if (yho != null) {
                    yho.invoke(this.OLrzqt.AEQbTJ(), this.copydefault, new Activity(this.OLrzqt, this.AEQbTJ));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wQe$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ TacticsListButtonItem AEQbTJ;
        public final /* synthetic */ yHO EZpvd;
        public final /* synthetic */ TacticsData KWHzl;
        public final /* synthetic */ uRX OLrzqt;
        public final /* synthetic */ android.view.View copydefault;
        public final /* synthetic */ mAE djBIcL;
        public final /* synthetic */ long valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, yHO yho, TacticsListButtonItem tacticsListButtonItem, TacticsData tacticsData, uRX urx, mAE mae) {
            this.copydefault = view;
            this.valueOf = j;
            this.EZpvd = yho;
            this.AEQbTJ = tacticsListButtonItem;
            this.KWHzl = tacticsData;
            this.OLrzqt = urx;
            this.djBIcL = mae;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.valueOf || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                yHO yho = this.EZpvd;
                if (yho != null) {
                    yho.invoke(this.AEQbTJ.AEQbTJ(), this.KWHzl, new StateListAnimator(this.AEQbTJ, this.OLrzqt, this.djBIcL));
                }
            }
        }
    }

    public static final Unit copydefault(yHO yho, TacticsListButtonItem tacticsListButtonItem, TacticsData tacticsData, C52705wVh c52705wVh) {
        Intrinsics.checkNotNullParameter(c52705wVh, "");
        if (yho != null) {
            yho.invoke(tacticsListButtonItem.AEQbTJ(), tacticsData, tacticsListButtonItem.OLrzqt());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wQe$Activity */
    public static final class Activity implements Function0<Unit> {
        public final /* synthetic */ TacticsListButtonItem KWHzl;
        public final /* synthetic */ uRX copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(TacticsListButtonItem tacticsListButtonItem, uRX urx) {
            this.KWHzl = tacticsListButtonItem;
            this.copydefault = urx;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            if (Intrinsics.EZpvd((java.lang.Object) this.KWHzl.AEQbTJ(), (java.lang.Object) "strategy_button_start")) {
                C52794wYp c52794wYp = this.copydefault.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                c52794wYp.setVisibility(0);
                C52794wYp.startLoading$default(this.copydefault.EZpvd, 0L, 1, null);
                android.widget.LinearLayout linearLayout = this.copydefault.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                C55328xhq.showWithLoading$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C55688xof.Application.openOptionsMenu), null, 0, null, 0, 0, 62, null);
            }
        }
    }

    public final boolean AEQbTJ(@NotNull android.view.View view, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return false;
        }
        try {
            boolean zIntersects = android.graphics.Rect.intersects(new android.graphics.Rect(0, 0, android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels, android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels), rect);
            boolean localVisibleRect = view.getLocalVisibleRect(new android.graphics.Rect());
            if (zIntersects && localVisibleRect && view.getVisibility() == 0) {
                int i = (view.getAlpha() > 0.0f ? 1 : (view.getAlpha() == 0.0f ? 0 : -1));
            }
            if (!zIntersects || !localVisibleRect || view.getVisibility() != 0) {
                return false;
            }
            if (view.getAlpha() <= 0.0f) {
                return false;
            }
        } catch (java.lang.Exception unused) {
        }
        return true;
    }

    public final boolean KWHzl(java.util.List<TacticsListButtonItem> list) {
        boolean z;
        boolean z2;
        if (list.size() != this.OLrzqt.size()) {
            return false;
        }
        if (list.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((TacticsListButtonItem) it.next()).AEQbTJ(), (java.lang.Object) "strategy_button_more")) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        java.util.List<TacticsListButtonItem> list2 = this.OLrzqt;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            z2 = false;
        } else {
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((TacticsListButtonItem) it2.next()).AEQbTJ(), (java.lang.Object) "strategy_button_more")) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        return z && z2;
    }

    public final boolean copydefault(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "grid") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_grid") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_dca") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "spot_dca");
    }

    public final boolean copydefault() {
        java.util.List<TacticsListButtonItem> list = this.OLrzqt;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((TacticsListButtonItem) it.next()).AEQbTJ(), (java.lang.Object) "strategy_button_stop")) {
                    return true;
                }
            }
        }
        return false;
    }
}
