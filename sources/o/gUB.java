package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewGroupKt;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class gUB extends LinearLayoutCompat {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public Function2<? super java.lang.Boolean, ? super java.lang.Integer, Unit> AEQbTJ;
    public Function1<? super java.lang.Integer, Unit> KWHzl;
    public Function0<Unit> OLrzqt;
    public Function1<? super java.lang.Boolean, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnEnableAddStrategyButtonListener(Function2<? super java.lang.Boolean, ? super java.lang.Integer, Unit> function2) {
        this.AEQbTJ = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnErrorMessageVisibilityChangedListener(Function1<? super java.lang.Integer, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gUB.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gUB(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gUB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gUB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(1);
    }

    private final Sequence<gUD> copydefault() {
        Sequence<gUD> sequenceDbNXlk = C59467zhb.DbNXlk(ViewGroupKt.getChildren(this), StateListAnimator.EZpvd);
        Intrinsics.copydefault(sequenceDbNXlk, "");
        return sequenceDbNXlk;
    }

    public final java.util.List<CopyTradingAutoSellStrategy> EZpvd() {
        return C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(copydefault(), new Function1() { // from class: o.gUA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(gUB.OLrzqt((gUD) obj));
            }
        }), new Function1() { // from class: o.gUG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gUB.EZpvd((gUD) obj);
            }
        }));
    }

    public static final boolean OLrzqt(gUD gud) {
        Intrinsics.checkNotNullParameter(gud, "");
        C55001xbh c55001xbhEZpvd = gud.EZpvd();
        android.text.Editable text = c55001xbhEZpvd != null ? c55001xbhEZpvd.getText() : null;
        if (text != null && text.length() != 0) {
            C55001xbh c55001xbhOLrzqt = gud.OLrzqt();
            android.text.Editable text2 = c55001xbhOLrzqt != null ? c55001xbhOLrzqt.getText() : null;
            if (text2 != null && text2.length() != 0) {
                return true;
            }
        }
        return false;
    }

    public static final CopyTradingAutoSellStrategy EZpvd(gUD gud) {
        Intrinsics.checkNotNullParameter(gud, "");
        return gud.AEQbTJ();
    }

    public final void AEQbTJ(@NotNull CopyTradingAutoSellStrategy copyTradingAutoSellStrategy) {
        gUD guj;
        C55001xbh c55001xbhOLrzqt;
        C55001xbh c55001xbhEZpvd;
        Intrinsics.checkNotNullParameter(copyTradingAutoSellStrategy, "");
        if (copyTradingAutoSellStrategy instanceof CopyTradingAutoSellStrategy.TakeProfit) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            guj = new gUK(context);
        } else {
            if (!(copyTradingAutoSellStrategy instanceof CopyTradingAutoSellStrategy.StopLoss)) {
                throw new NoWhenBranchMatchedException();
            }
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            guj = new gUJ(context2);
        }
        guj.setOnRemoveClickListener(this.OLrzqt);
        guj.setOnErrorShownStateChangedListener(new Function0() { // from class: o.gUy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gUB.KWHzl(this.KWHzl);
            }
        });
        C55001xbh c55001xbhEZpvd2 = guj.EZpvd();
        if (c55001xbhEZpvd2 != null) {
            c55001xbhEZpvd2.addTextChangedListener(new Application());
        }
        C55001xbh c55001xbhOLrzqt2 = guj.OLrzqt();
        if (c55001xbhOLrzqt2 != null) {
            c55001xbhOLrzqt2.addTextChangedListener(new ActionBar());
        }
        if (copyTradingAutoSellStrategy.OLrzqt().length() > 0 && (c55001xbhEZpvd = guj.EZpvd()) != null) {
            c55001xbhEZpvd.setPlainNumericText(copyTradingAutoSellStrategy.OLrzqt());
        }
        if (copyTradingAutoSellStrategy.KWHzl().length() > 0 && (c55001xbhOLrzqt = guj.OLrzqt()) != null) {
            c55001xbhOLrzqt.setPlainNumericText(copyTradingAutoSellStrategy.KWHzl());
        }
        addView(guj);
    }

    public static final Unit KWHzl(gUB gub) {
        gub.setErrorMessageVisibility();
        gub.setConfirmButtonEnabled();
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        removeAllViews();
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
        LinearLayoutCompat.LayoutParams layoutParamsGenerateDefaultLayoutParams = super.generateDefaultLayoutParams();
        ((LinearLayout.LayoutParams) layoutParamsGenerateDefaultLayoutParams).topMargin = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ODWQjV);
        Intrinsics.checkNotNullExpressionValue(layoutParamsGenerateDefaultLayoutParams, "");
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        KWHzl();
        AEQbTJ();
    }

    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            gUB.this.setConfirmButtonEnabled();
        }
    }

    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            gUB.this.setConfirmButtonEnabled();
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        KWHzl();
    }

    public final void setErrorMessageVisibility() {
        java.lang.Integer numValueOf;
        java.util.Iterator<gUD> it = copydefault().iterator();
        while (true) {
            if (!it.hasNext()) {
                numValueOf = null;
                break;
            }
            if (it.next().AhwBna()) {
                java.util.Iterator<gUD> it2 = copydefault().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().copydefault()) {
                            numValueOf = java.lang.Integer.valueOf(C23274hvD.Fragment.MediaSessionCompatQueueItem);
                            break;
                        }
                    } else {
                        numValueOf = java.lang.Integer.valueOf(C23274hvD.Fragment.fromQueueItem);
                        break;
                    }
                }
            }
        }
        Function1<? super java.lang.Integer, Unit> function1 = this.KWHzl;
        if (function1 != null) {
            function1.invoke(numValueOf);
        }
    }

    public final void setConfirmButtonEnabled() {
        boolean z;
        Function1<? super java.lang.Boolean, Unit> function1 = this.copydefault;
        if (function1 != null) {
            for (gUD gud : copydefault()) {
                C55001xbh c55001xbhEZpvd = gud.EZpvd();
                android.text.Editable text = c55001xbhEZpvd != null ? c55001xbhEZpvd.getText() : null;
                if (text == null || text.length() == 0) {
                    C55001xbh c55001xbhOLrzqt = gud.OLrzqt();
                    android.text.Editable text2 = c55001xbhOLrzqt != null ? c55001xbhOLrzqt.getText() : null;
                    if (text2 == null || text2.length() == 0) {
                    }
                }
                C55001xbh c55001xbhEZpvd2 = gud.EZpvd();
                java.lang.String strIsConnected = c55001xbhEZpvd2 != null ? c55001xbhEZpvd2.isConnected() : null;
                BigDecimal bigDecimal = BigDecimal.ZERO;
                if (C23313hvq.AhwBna(strIsConnected, bigDecimal)) {
                    C55001xbh c55001xbhOLrzqt2 = gud.OLrzqt();
                    if (C23313hvq.AhwBna(c55001xbhOLrzqt2 != null ? c55001xbhOLrzqt2.isConnected() : null, bigDecimal)) {
                    }
                }
                z = false;
            }
            z = true;
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
    }

    public final void AEQbTJ() {
        C55001xbh c55001xbhOLrzqt;
        java.util.List listZuBGHE = C59467zhb.zuBGHE(copydefault());
        int i = 0;
        for (java.lang.Object obj : listZuBGHE) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            gUD gud = (gUD) obj;
            C55001xbh c55001xbhEZpvd = gud.EZpvd();
            if (c55001xbhEZpvd != null && (c55001xbhOLrzqt = gud.OLrzqt()) != null) {
                c55001xbhEZpvd.setNextFocusForwardId(c55001xbhOLrzqt.getId());
                c55001xbhEZpvd.setNextFocusRightId(c55001xbhOLrzqt.getId());
                c55001xbhEZpvd.setNextFocusDownId(c55001xbhOLrzqt.getId());
                c55001xbhEZpvd.setImeOptions(5);
                c55001xbhOLrzqt.setNextFocusLeftId(c55001xbhEZpvd.getId());
                c55001xbhOLrzqt.setNextFocusUpId(c55001xbhEZpvd.getId());
                gUD gud2 = (gUD) CollectionsKt___CollectionsKt.AkhnZx(listZuBGHE, i2);
                if (gud2 != null) {
                    C55001xbh c55001xbhEZpvd2 = gud2.EZpvd();
                    if (c55001xbhEZpvd2 != null) {
                        c55001xbhOLrzqt.setNextFocusForwardId(c55001xbhEZpvd2.getId());
                        c55001xbhOLrzqt.setNextFocusRightId(c55001xbhEZpvd2.getId());
                        c55001xbhOLrzqt.setNextFocusDownId(c55001xbhEZpvd2.getId());
                        c55001xbhEZpvd2.setNextFocusUpId(c55001xbhOLrzqt.getId());
                        c55001xbhEZpvd2.setNextFocusLeftId(c55001xbhOLrzqt.getId());
                    }
                    c55001xbhOLrzqt.setImeOptions(5);
                } else {
                    c55001xbhOLrzqt.setImeOptions(6);
                }
            }
            i = i2;
        }
    }

    public final void KWHzl() {
        setVisibility(getChildCount() != 0 ? 0 : 8);
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = 0;
                childAt.setLayoutParams(marginLayoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        Function2<? super java.lang.Boolean, ? super java.lang.Integer, Unit> function2 = this.AEQbTJ;
        if (function2 != null) {
            function2.invoke(java.lang.Boolean.valueOf(getChildCount() < 5), 5);
        }
        setErrorMessageVisibility();
        setConfirmButtonEnabled();
    }

    public static final class StateListAnimator implements Function1<java.lang.Object, java.lang.Boolean> {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(obj instanceof gUD);
        }
    }
}
