package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewGroupKt;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ldf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30571ldf extends LinearLayoutCompat {
    public Function1<? super java.lang.Boolean, Unit> EZpvd;
    public Function1<? super java.lang.Boolean, Unit> KWHzl;
    public Function0<Unit> OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnEnableAddStrategyButtonListener(Function1<? super java.lang.Boolean, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnEnableConfirmButtonListener(Function1<? super java.lang.Boolean, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnRemoveClickListener(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX INFO: renamed from: o.ldf$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ldf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30571ldf(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30571ldf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30571ldf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(1);
    }

    private final Sequence<AbstractC30580ldo> copydefault() {
        Sequence<AbstractC30580ldo> sequenceDbNXlk = C59467zhb.DbNXlk(ViewGroupKt.getChildren(this), Activity.OLrzqt);
        Intrinsics.copydefault(sequenceDbNXlk, "");
        return sequenceDbNXlk;
    }

    public final java.util.List<AdvancedAutoSellStrategy> EZpvd() {
        return C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(copydefault(), new Function1() { // from class: o.ldh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C30571ldf.OLrzqt((AbstractC30580ldo) obj));
            }
        }), new Function1() { // from class: o.ldi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30571ldf.AYXKKw((AbstractC30580ldo) obj);
            }
        }));
    }

    public static final boolean OLrzqt(AbstractC30580ldo abstractC30580ldo) {
        Intrinsics.checkNotNullParameter(abstractC30580ldo, "");
        if (!abstractC30580ldo.OLrzqt().AYXKKw()) {
            C55001xbh c55001xbhKWHzl = abstractC30580ldo.KWHzl();
            android.text.Editable text = c55001xbhKWHzl != null ? c55001xbhKWHzl.getText() : null;
            if (text != null && text.length() != 0) {
                C55001xbh c55001xbhEZpvd = abstractC30580ldo.EZpvd();
                android.text.Editable text2 = c55001xbhEZpvd != null ? c55001xbhEZpvd.getText() : null;
                if (text2 == null || text2.length() == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static final AdvancedAutoSellStrategy AYXKKw(AbstractC30580ldo abstractC30580ldo) {
        Intrinsics.checkNotNullParameter(abstractC30580ldo, "");
        return abstractC30580ldo.OLrzqt();
    }

    public static final AdvancedAutoSellStrategy AEQbTJ(AbstractC30580ldo abstractC30580ldo) {
        Intrinsics.checkNotNullParameter(abstractC30580ldo, "");
        return abstractC30580ldo.OLrzqt();
    }

    public final java.util.List<AdvancedAutoSellStrategy> AEQbTJ() {
        return C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(copydefault(), new Function1() { // from class: o.ldg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30571ldf.AEQbTJ((AbstractC30580ldo) obj);
            }
        }));
    }

    public final void EZpvd(@NotNull AdvancedAutoSellStrategy advancedAutoSellStrategy) {
        AbstractC30580ldo c30584lds;
        C55001xbh c55001xbhEZpvd;
        C55001xbh c55001xbhKWHzl;
        Intrinsics.checkNotNullParameter(advancedAutoSellStrategy, "");
        if (advancedAutoSellStrategy instanceof AdvancedAutoSellStrategy.TakeProfit) {
            if (((AdvancedAutoSellStrategy.TakeProfit) advancedAutoSellStrategy).AYXKKw()) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c30584lds = new C30585ldt(context);
            } else {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c30584lds = new C30583ldr(context2);
            }
        } else {
            if (!(advancedAutoSellStrategy instanceof AdvancedAutoSellStrategy.StopLoss)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((AdvancedAutoSellStrategy.StopLoss) advancedAutoSellStrategy).AYXKKw()) {
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                c30584lds = new C30581ldp(context3);
            } else {
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                c30584lds = new C30584lds(context4);
            }
        }
        c30584lds.setOnRemoveClickListener(this.OLrzqt);
        if (advancedAutoSellStrategy.AYXKKw()) {
            c30584lds.djBIcL().setText(advancedAutoSellStrategy.valueOf());
            if (c30584lds instanceof C30585ldt) {
                ((C30585ldt) c30584lds).setRemoteStrategy(advancedAutoSellStrategy);
            } else if (c30584lds instanceof C30581ldp) {
                ((C30581ldp) c30584lds).setRemoteStrategy(advancedAutoSellStrategy);
            }
        } else {
            c30584lds.setOnErrorShownStateChangedListener(new Function0() { // from class: o.ldj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C30571ldf.KWHzl(this.AEQbTJ);
                }
            });
            C55001xbh c55001xbhKWHzl2 = c30584lds.KWHzl();
            if (c55001xbhKWHzl2 != null) {
                c55001xbhKWHzl2.addTextChangedListener(new StateListAnimator());
            }
            C55001xbh c55001xbhEZpvd2 = c30584lds.EZpvd();
            if (c55001xbhEZpvd2 != null) {
                c55001xbhEZpvd2.addTextChangedListener(new Application());
            }
            if (advancedAutoSellStrategy.copydefault().length() > 0 && (c55001xbhKWHzl = c30584lds.KWHzl()) != null) {
                c55001xbhKWHzl.setPlainNumericText(advancedAutoSellStrategy.copydefault());
            }
            if (advancedAutoSellStrategy.gEmmrt().length() > 0 && (c55001xbhEZpvd = c30584lds.EZpvd()) != null) {
                c55001xbhEZpvd.setPlainNumericText(advancedAutoSellStrategy.gEmmrt());
            }
        }
        addView(c30584lds);
    }

    public static final Unit KWHzl(C30571ldf c30571ldf) {
        c30571ldf.KWHzl();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ldf$Application */
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
            C30571ldf.this.KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.ldf$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C30571ldf.this.KWHzl();
        }
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
        OLrzqt();
        djBIcL();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        OLrzqt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl() {
        boolean z;
        Function1<? super java.lang.Boolean, Unit> function1 = this.EZpvd;
        if (function1 != null) {
            for (AbstractC30580ldo abstractC30580ldo : copydefault()) {
                C55001xbh c55001xbhKWHzl = abstractC30580ldo.KWHzl();
                android.text.Editable text = c55001xbhKWHzl != null ? c55001xbhKWHzl.getText() : null;
                if (text == null || text.length() == 0) {
                    C55001xbh c55001xbhEZpvd = abstractC30580ldo.EZpvd();
                    android.text.Editable text2 = c55001xbhEZpvd != null ? c55001xbhEZpvd.getText() : null;
                    if (text2 == null || text2.length() == 0) {
                    }
                }
                C55001xbh c55001xbhKWHzl2 = abstractC30580ldo.KWHzl();
                java.lang.String strIsConnected = c55001xbhKWHzl2 != null ? c55001xbhKWHzl2.isConnected() : null;
                BigDecimal bigDecimal = BigDecimal.ZERO;
                if (C23313hvq.AhwBna(strIsConnected, bigDecimal)) {
                    C55001xbh c55001xbhEZpvd2 = abstractC30580ldo.EZpvd();
                    if (C23313hvq.AhwBna(c55001xbhEZpvd2 != null ? c55001xbhEZpvd2.isConnected() : null, bigDecimal)) {
                    }
                }
                z = false;
            }
            z = true;
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
    }

    private final void djBIcL() {
        C55001xbh c55001xbhEZpvd;
        java.util.List listZuBGHE = C59467zhb.zuBGHE(copydefault());
        int i = 0;
        for (java.lang.Object obj : listZuBGHE) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            AbstractC30580ldo abstractC30580ldo = (AbstractC30580ldo) obj;
            C55001xbh c55001xbhKWHzl = abstractC30580ldo.KWHzl();
            if (c55001xbhKWHzl != null && (c55001xbhEZpvd = abstractC30580ldo.EZpvd()) != null) {
                c55001xbhKWHzl.setNextFocusForwardId(c55001xbhEZpvd.getId());
                c55001xbhKWHzl.setNextFocusRightId(c55001xbhEZpvd.getId());
                c55001xbhKWHzl.setNextFocusDownId(c55001xbhEZpvd.getId());
                c55001xbhKWHzl.setImeOptions(5);
                c55001xbhEZpvd.setNextFocusLeftId(c55001xbhKWHzl.getId());
                c55001xbhEZpvd.setNextFocusUpId(c55001xbhKWHzl.getId());
                AbstractC30580ldo abstractC30580ldo2 = (AbstractC30580ldo) CollectionsKt___CollectionsKt.AkhnZx(listZuBGHE, i2);
                if (abstractC30580ldo2 != null) {
                    C55001xbh c55001xbhKWHzl2 = abstractC30580ldo2.KWHzl();
                    if (c55001xbhKWHzl2 != null) {
                        c55001xbhEZpvd.setNextFocusForwardId(c55001xbhKWHzl2.getId());
                        c55001xbhEZpvd.setNextFocusRightId(c55001xbhKWHzl2.getId());
                        c55001xbhEZpvd.setNextFocusDownId(c55001xbhKWHzl2.getId());
                        c55001xbhKWHzl2.setNextFocusUpId(c55001xbhEZpvd.getId());
                        c55001xbhKWHzl2.setNextFocusLeftId(c55001xbhEZpvd.getId());
                    }
                    c55001xbhEZpvd.setImeOptions(5);
                } else {
                    c55001xbhEZpvd.setImeOptions(6);
                }
            }
            i = i2;
        }
    }

    private final void OLrzqt() {
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
        Function1<? super java.lang.Boolean, Unit> function1 = this.KWHzl;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(getChildCount() < 5));
        }
        KWHzl();
    }

    /* JADX INFO: renamed from: o.ldf$Activity */
    public static final class Activity implements Function1<java.lang.Object, java.lang.Boolean> {
        public static final Activity OLrzqt = new Activity();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(obj instanceof AbstractC30580ldo);
        }
    }
}
