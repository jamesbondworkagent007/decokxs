package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputNumberAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Rule;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rQk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42372rQk extends android.widget.FrameLayout {
    public ViewStatus AEQbTJ;
    public final AbstractC41931rAb KWHzl;

    /* JADX INFO: renamed from: o.rQk$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42372rQk(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42372rQk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.AEQbTJ = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:52) call: o.rQk.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42372rQk(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42372rQk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.OTwTPd, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC41931rAb) viewDataBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.lang.Boolean required;
        SubInput subInput;
        SubInput input;
        PairInputValue fieldValue;
        PairInputValue fieldValue2;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final PairInputNumberAppModel pairInputNumberAppModel = uIComponentAppModel instanceof PairInputNumberAppModel ? (PairInputNumberAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.aKErDB().iterator();
            while (it.hasNext()) {
                final rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (pairInputNumberAppModel != null ? pairInputNumberAppModel.getId() : null))) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) ((pairInputNumberAppModel == null || (fieldValue2 = pairInputNumberAppModel.getFieldValue()) == null) ? null : fieldValue2.getInputValue()))) {
                        PairInputValue fieldValue3 = pairInputNumberAppModel != null ? pairInputNumberAppModel.getFieldValue() : null;
                        rax.setValue(fieldValue3);
                        boolean zBooleanValue = false;
                        if (pairInputNumberAppModel != null && Intrinsics.EZpvd(pairInputNumberAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                            setVisibility(8);
                            rax.EZpvd(false);
                            rax.setValue(null);
                        } else {
                            setVisibility(0);
                            if (pairInputNumberAppModel != null && (required = pairInputNumberAppModel.getRequired()) != null) {
                                zBooleanValue = required.booleanValue();
                            }
                            rax.EZpvd(zBooleanValue);
                        }
                        rgl.gasjUx().observe(lifecycleOwner, new ActionBar(new Function1() { // from class: o.rQh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42372rQk.copydefault(pairInputNumberAppModel, this, rax, (C42156rIk) obj);
                            }
                        }));
                        C41959rBc.EZpvd(rax, lifecycleOwner, new Function1() { // from class: o.rQi
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42372rQk.copydefault(pairInputNumberAppModel, rax, (PairInputValue) obj);
                            }
                        }, new Function1() { // from class: o.rQl
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42372rQk.OLrzqt((java.lang.String) obj);
                            }
                        }, new Function1() { // from class: o.rQn
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42372rQk.EZpvd((java.lang.String) obj);
                            }
                        }, new Function0() { // from class: o.rQp
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C42372rQk.copydefault();
                            }
                        });
                        if (pairInputNumberAppModel != null && (input = pairInputNumberAppModel.getInput()) != null) {
                            C55008xbo c55008xbo = this.KWHzl.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
                            c55008xbo.setOnFocusChangeListener(new StateListAnimator(this, rax, rgl, c55008xbo));
                            this.KWHzl.EZpvd.OLrzqt(new Application(pairInputNumberAppModel, input, rax));
                        }
                        if (pairInputNumberAppModel != null && (subInput = pairInputNumberAppModel.getSubInput()) != null) {
                            C55008xbo c55008xbo2 = this.KWHzl.copydefault;
                            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
                            c55008xbo2.setOnFocusChangeListener(new StateListAnimator(this, rax, rgl, c55008xbo2));
                            this.KWHzl.copydefault.OLrzqt(new TaskDescription(pairInputNumberAppModel, subInput, rax));
                        }
                    } else {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((pairInputNumberAppModel == null || (fieldValue = pairInputNumberAppModel.getFieldValue()) == null) ? null : fieldValue.getInputValue()))) {
                        }
                    }
                }
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            return;
        }
        boolean z = abstractC42074rFj instanceof rIM;
    }

    public static final Unit copydefault(PairInputNumberAppModel pairInputNumberAppModel, C42372rQk c42372rQk, rAX rax, C42156rIk c42156rIk) {
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), pairInputNumberAppModel != null ? pairInputNumberAppModel.getId() : null) && c42372rQk.getVisibility() == 8) {
                c42372rQk.setVisibility(0);
                rax.EZpvd((pairInputNumberAppModel == null || (required = pairInputNumberAppModel.getRequired()) == null) ? false : required.booleanValue());
                rax.setValue(null);
                if (pairInputNumberAppModel != null) {
                    pairInputNumberAppModel.setFieldValue(null);
                }
                if (pairInputNumberAppModel != null) {
                    pairInputNumberAppModel.setHidden(java.lang.Boolean.FALSE);
                }
                C55001xbh c55001xbhAkhnZx = c42372rQk.KWHzl.EZpvd.AkhnZx();
                if (c55001xbhAkhnZx != null) {
                    c55001xbhAkhnZx.setLocalizedNumericText("");
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), pairInputNumberAppModel != null ? pairInputNumberAppModel.getId() : null) && c42372rQk.getVisibility() == 0) {
                c42372rQk.setVisibility(8);
                rax.EZpvd(false);
                rax.setValue(null);
                if (pairInputNumberAppModel != null) {
                    pairInputNumberAppModel.setFieldValue(null);
                }
                if (pairInputNumberAppModel != null) {
                    pairInputNumberAppModel.setHidden(java.lang.Boolean.TRUE);
                }
                C55001xbh c55001xbhAkhnZx2 = c42372rQk.KWHzl.EZpvd.AkhnZx();
                if (c55001xbhAkhnZx2 != null) {
                    c55001xbhAkhnZx2.setLocalizedNumericText("");
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(PairInputNumberAppModel pairInputNumberAppModel, rAX rax, PairInputValue pairInputValue) {
        if (pairInputNumberAppModel != null) {
            pairInputNumberAppModel.setFieldValue((PairInputValue) rax.getValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rQk$Application */
    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ rAX<PairInputValue> AEQbTJ;
        public final /* synthetic */ SubInput EZpvd;
        public final /* synthetic */ PairInputNumberAppModel copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(PairInputNumberAppModel pairInputNumberAppModel, SubInput subInput, rAX<PairInputValue> rax) {
            this.copydefault = pairInputNumberAppModel;
            this.EZpvd = subInput;
            this.AEQbTJ = rax;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strValueOf;
            java.lang.String downToMax$default;
            java.lang.String strMulS$default;
            BigDecimal bigDecimalAEQbTJ;
            C55001xbh c55001xbhAkhnZx = C42372rQk.this.KWHzl.EZpvd.AkhnZx();
            java.lang.String strIsConnected = c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null;
            if (C42372rQk.this.KWHzl.EZpvd.hasFocus()) {
                PairInputValue pairInputValue = new PairInputValue((java.lang.String) null, (java.lang.String) null, 3, (DefaultConstructorMarker) null);
                pairInputValue.setInputValue(strIsConnected);
                if (this.copydefault.getSubInput() != null) {
                    C55001xbh c55001xbhAkhnZx2 = C42372rQk.this.KWHzl.copydefault.AkhnZx();
                    if (c55001xbhAkhnZx2 != null) {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) editable)) {
                            java.lang.String inputValue = pairInputValue.getInputValue();
                            if (inputValue == null || (strMulS$default = C33129mqd.mulS$default(inputValue, this.copydefault.getRatio(), null, null, null, 14, null)) == null || (bigDecimalAEQbTJ = pTB.AEQbTJ(strMulS$default)) == null) {
                                downToMax$default = null;
                            } else {
                                java.lang.Integer precision = this.EZpvd.getPrecision();
                                downToMax$default = pTB.formatDownToMax$default(bigDecimalAEQbTJ, precision != null ? precision.intValue() : 0, null, 2, null);
                            }
                            strValueOf = java.lang.String.valueOf(downToMax$default);
                        } else {
                            strValueOf = "";
                        }
                        c55001xbhAkhnZx2.setLocalizedNumericText(strValueOf);
                    }
                    C55001xbh c55001xbhAkhnZx3 = C42372rQk.this.KWHzl.copydefault.AkhnZx();
                    pairInputValue.setSubInputValue(c55001xbhAkhnZx3 != null ? c55001xbhAkhnZx3.isConnected() : null);
                }
                this.AEQbTJ.setValue(pairInputValue);
            }
            C41966rBj c41966rBjKWHzl = rAY.AEQbTJ.KWHzl(strIsConnected, this.copydefault.getInput().getRules());
            if (c41966rBjKWHzl.OLrzqt() || !C33129mqd.OLrzqt((java.lang.CharSequence) c41966rBjKWHzl.EZpvd()) || !C33129mqd.OLrzqt((java.lang.CharSequence) editable)) {
                C42372rQk c42372rQk = C42372rQk.this;
                C55008xbo c55008xbo = c42372rQk.KWHzl.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
                c42372rQk.OLrzqt(c55008xbo, this.copydefault.getInput().getHint());
                return;
            }
            C42372rQk c42372rQk2 = C42372rQk.this;
            C55008xbo c55008xbo2 = c42372rQk2.KWHzl.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            c42372rQk2.EZpvd(c55008xbo2, c41966rBjKWHzl.EZpvd());
        }
    }

    /* JADX INFO: renamed from: o.rQk$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        public final /* synthetic */ PairInputNumberAppModel EZpvd;
        public final /* synthetic */ rAX<PairInputValue> KWHzl;
        public final /* synthetic */ SubInput OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription(PairInputNumberAppModel pairInputNumberAppModel, SubInput subInput, rAX<PairInputValue> rax) {
            this.EZpvd = pairInputNumberAppModel;
            this.OLrzqt = subInput;
            this.KWHzl = rax;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strValueOf;
            java.lang.String downToMax$default;
            java.lang.String strDivS$default;
            BigDecimal bigDecimalAEQbTJ;
            C55001xbh c55001xbhAkhnZx = C42372rQk.this.KWHzl.copydefault.AkhnZx();
            java.lang.String strIsConnected = c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null;
            if (C42372rQk.this.KWHzl.copydefault.hasFocus()) {
                PairInputValue pairInputValue = new PairInputValue((java.lang.String) null, (java.lang.String) null, 3, (DefaultConstructorMarker) null);
                pairInputValue.setSubInputValue(strIsConnected);
                if (this.EZpvd.getInput() != null) {
                    C55001xbh c55001xbhAkhnZx2 = C42372rQk.this.KWHzl.EZpvd.AkhnZx();
                    if (c55001xbhAkhnZx2 != null) {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) editable)) {
                            java.lang.String subInputValue = pairInputValue.getSubInputValue();
                            if (subInputValue == null || (strDivS$default = C33129mqd.divS$default(subInputValue, this.EZpvd.getRatio(), null, null, null, 14, null)) == null || (bigDecimalAEQbTJ = pTB.AEQbTJ(strDivS$default)) == null) {
                                downToMax$default = null;
                            } else {
                                java.lang.Integer precision = this.OLrzqt.getPrecision();
                                downToMax$default = pTB.formatDownToMax$default(bigDecimalAEQbTJ, precision != null ? precision.intValue() : 0, null, 2, null);
                            }
                            strValueOf = java.lang.String.valueOf(downToMax$default);
                        } else {
                            strValueOf = "";
                        }
                        c55001xbhAkhnZx2.setLocalizedNumericText(strValueOf);
                    }
                    C55001xbh c55001xbhAkhnZx3 = C42372rQk.this.KWHzl.EZpvd.AkhnZx();
                    pairInputValue.setInputValue(c55001xbhAkhnZx3 != null ? c55001xbhAkhnZx3.isConnected() : null);
                }
                this.KWHzl.setValue(pairInputValue);
            }
            rAY ray = rAY.AEQbTJ;
            SubInput subInput = this.EZpvd.getSubInput();
            C41966rBj c41966rBjKWHzl = ray.KWHzl(strIsConnected, subInput != null ? subInput.getRules() : null);
            if (!c41966rBjKWHzl.OLrzqt() && C33129mqd.OLrzqt((java.lang.CharSequence) c41966rBjKWHzl.EZpvd()) && C33129mqd.OLrzqt((java.lang.CharSequence) editable)) {
                C42372rQk c42372rQk = C42372rQk.this;
                C55008xbo c55008xbo = c42372rQk.KWHzl.copydefault;
                Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
                c42372rQk.EZpvd(c55008xbo, c41966rBjKWHzl.EZpvd());
                return;
            }
            Rule warningRule = this.EZpvd.getSubInput().getWarningRule();
            C41966rBj c41966rBjKWHzl2 = ray.KWHzl(strIsConnected, warningRule != null ? C56402yEa.EZpvd(warningRule) : null);
            if (c41966rBjKWHzl2.OLrzqt() || !C33129mqd.OLrzqt((java.lang.CharSequence) c41966rBjKWHzl2.EZpvd()) || !C33129mqd.OLrzqt((java.lang.CharSequence) editable)) {
                C42372rQk c42372rQk2 = C42372rQk.this;
                C55008xbo c55008xbo2 = c42372rQk2.KWHzl.copydefault;
                Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
                c42372rQk2.OLrzqt(c55008xbo2, this.EZpvd.getSubInput().getHint());
                return;
            }
            C42372rQk c42372rQk3 = C42372rQk.this;
            C55008xbo c55008xbo3 = c42372rQk3.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55008xbo3, "");
            c42372rQk3.EZpvd(c55008xbo3, c41966rBjKWHzl2.EZpvd());
        }
    }

    public final void EZpvd(C55008xbo c55008xbo, java.lang.String str) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C42518rVv c42518rVv = new C42518rVv(context, null, 0, 6, null);
        if (str == null) {
            str = "";
        }
        c42518rVv.setData(str, C33070mpX.copydefault(C52761wXj.Activity.gsvlRV), 12.0f, C52761wXj.LoaderManager.OLrzqt);
        c55008xbo.setSupportingView(c42518rVv);
    }

    public final void OLrzqt(C55008xbo c55008xbo, java.lang.String str) {
        if (str != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C42518rVv c42518rVv = new C42518rVv(context, null, 0, 6, null);
            c42518rVv.setData(str, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 12.0f, C52761wXj.LoaderManager.OLrzqt);
            c55008xbo.setSupportingView(c42518rVv);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull UIComponentAppModel uIComponentAppModel) {
        java.lang.String subInputValue;
        C55009xbp c55009xbpFIwbmz;
        C54957xaq c54957xaqAEQbTJ;
        C55009xbp c55009xbpFIwbmz2;
        C54957xaq c54957xaqAEQbTJ2;
        java.lang.String inputValue;
        C55009xbp c55009xbpFIwbmz3;
        C54957xaq c54957xaqAEQbTJ3;
        C55009xbp c55009xbpFIwbmz4;
        C54957xaq c54957xaqAEQbTJ4;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.AEQbTJ, uIComponentAppModel.getBottomMargin()));
        PairInputNumberAppModel pairInputNumberAppModel = uIComponentAppModel instanceof PairInputNumberAppModel ? (PairInputNumberAppModel) uIComponentAppModel : null;
        if (pairInputNumberAppModel != null) {
            PairInputNumberAppModel pairInputNumberAppModel2 = (PairInputNumberAppModel) uIComponentAppModel;
            SubInput input = pairInputNumberAppModel2.getInput();
            if (input != null) {
                this.KWHzl.EZpvd.setVisibility(0);
                java.lang.String label = input.getLabel();
                if (label != null) {
                    this.KWHzl.EZpvd.setLabelText(label);
                    C55009xbp c55009xbpFIwbmz5 = this.KWHzl.EZpvd.fIwbmz();
                    if (c55009xbpFIwbmz5 != null && (c54957xaqAEQbTJ4 = c55009xbpFIwbmz5.AEQbTJ()) != null) {
                        c54957xaqAEQbTJ4.AhwBna.setTextSize(12.0f);
                    }
                }
                java.lang.String placeholder = input.getPlaceholder();
                if (placeholder != null) {
                    this.KWHzl.EZpvd.setHintText(placeholder);
                }
                C55008xbo c55008xbo = this.KWHzl.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
                OLrzqt(c55008xbo, input.getHint());
                java.lang.String suffix = input.getSuffix();
                if (suffix != null && (c55009xbpFIwbmz4 = this.KWHzl.EZpvd.fIwbmz()) != null) {
                    android.content.Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    C42518rVv c42518rVv = new C42518rVv(context3, null, 0, 6, null);
                    c42518rVv.setData(suffix, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 18.0f, C52761wXj.LoaderManager.OLrzqt);
                    c55009xbpFIwbmz4.EZpvd(c42518rVv);
                }
                java.lang.String prefix = input.getPrefix();
                if (prefix != null && (c55009xbpFIwbmz3 = this.KWHzl.EZpvd.fIwbmz()) != null && (c54957xaqAEQbTJ3 = c55009xbpFIwbmz3.AEQbTJ()) != null) {
                    android.widget.TextView textView = c54957xaqAEQbTJ3.OLrzqt;
                    Intrinsics.copydefault(textView);
                    textView.setVisibility(0);
                    textView.setText(prefix);
                    textView.setTextSize(18.0f);
                    textView.setTextAppearance(C52761wXj.LoaderManager.OLrzqt);
                    textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                }
                C55001xbh c55001xbhAkhnZx = this.KWHzl.EZpvd.AkhnZx();
                if (c55001xbhAkhnZx != null) {
                    c55001xbhAkhnZx.setInputType(2);
                    java.lang.Integer precision = input.getPrecision();
                    c55001xbhAkhnZx.setMaxDecimalValue(precision != null ? precision.intValue() : 0);
                    c55001xbhAkhnZx.setShowThousandsSeparator(true);
                    c55001xbhAkhnZx.setKeyListener(c55001xbhAkhnZx.AYXKKw());
                    c55001xbhAkhnZx.setSingleLine(true);
                    PairInputValue fieldValue = pairInputNumberAppModel.getFieldValue();
                    if (fieldValue == null || (inputValue = fieldValue.getInputValue()) == null) {
                        inputValue = "";
                    }
                    c55001xbhAkhnZx.setLocalizedNumericText(inputValue);
                } else {
                    c55001xbhAkhnZx = null;
                }
                if (c55001xbhAkhnZx == null) {
                    this.KWHzl.EZpvd.setVisibility(8);
                    Unit unit = Unit.INSTANCE;
                }
            }
            SubInput subInput = pairInputNumberAppModel2.getSubInput();
            if (subInput != null) {
                this.KWHzl.copydefault.setVisibility(0);
                java.lang.String label2 = subInput.getLabel();
                if (label2 != null) {
                    this.KWHzl.copydefault.setLabelText(label2);
                    C55009xbp c55009xbpFIwbmz6 = this.KWHzl.EZpvd.fIwbmz();
                    if (c55009xbpFIwbmz6 != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz6.AEQbTJ()) != null) {
                        c54957xaqAEQbTJ2.AhwBna.setTextSize(12.0f);
                    }
                }
                java.lang.String placeholder2 = subInput.getPlaceholder();
                if (placeholder2 != null) {
                    this.KWHzl.copydefault.setHintText(placeholder2);
                }
                C55008xbo c55008xbo2 = this.KWHzl.copydefault;
                Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
                OLrzqt(c55008xbo2, subInput.getHint());
                java.lang.String suffix2 = subInput.getSuffix();
                if (suffix2 != null && (c55009xbpFIwbmz2 = this.KWHzl.copydefault.fIwbmz()) != null) {
                    android.content.Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    C42518rVv c42518rVv2 = new C42518rVv(context4, null, 0, 6, null);
                    c42518rVv2.setData(suffix2, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 18.0f, C52761wXj.LoaderManager.OLrzqt);
                    c55009xbpFIwbmz2.EZpvd(c42518rVv2);
                }
                java.lang.String prefix2 = subInput.getPrefix();
                if (prefix2 != null && (c55009xbpFIwbmz = this.KWHzl.copydefault.fIwbmz()) != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz.AEQbTJ()) != null) {
                    android.widget.TextView textView2 = c54957xaqAEQbTJ.OLrzqt;
                    Intrinsics.copydefault(textView2);
                    textView2.setVisibility(0);
                    textView2.setText(prefix2);
                    textView2.setTextSize(18.0f);
                    textView2.setTextAppearance(C52761wXj.LoaderManager.OLrzqt);
                    textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                }
                C55001xbh c55001xbhAkhnZx2 = this.KWHzl.copydefault.AkhnZx();
                if (c55001xbhAkhnZx2 != null) {
                    c55001xbhAkhnZx2.setInputType(2);
                    java.lang.Integer precision2 = subInput.getPrecision();
                    c55001xbhAkhnZx2.setMaxDecimalValue(precision2 != null ? precision2.intValue() : 0);
                    c55001xbhAkhnZx2.setShowThousandsSeparator(true);
                    c55001xbhAkhnZx2.setKeyListener(c55001xbhAkhnZx2.AYXKKw());
                    c55001xbhAkhnZx2.setSingleLine(true);
                    PairInputValue fieldValue2 = pairInputNumberAppModel.getFieldValue();
                    if (fieldValue2 != null && (subInputValue = fieldValue2.getSubInputValue()) != null) {
                        str = subInputValue;
                    }
                    c55001xbhAkhnZx2.setLocalizedNumericText(str);
                } else {
                    c55001xbhAkhnZx2 = null;
                }
                if (c55001xbhAkhnZx2 != null) {
                    return;
                }
            }
            this.KWHzl.copydefault.setVisibility(8);
            Unit unit2 = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.rQk$StateListAnimator */
    public final class StateListAnimator implements View.OnFocusChangeListener {
        public final /* synthetic */ C42372rQk EZpvd;
        public final rAX<PairInputValue> KWHzl;
        public final android.view.View OLrzqt;
        public final rGL copydefault;

        public StateListAnimator(@NotNull C42372rQk c42372rQk, @NotNull rAX<PairInputValue> rax, @NotNull rGL rgl, android.view.View view) {
            Intrinsics.checkNotNullParameter(rax, "");
            Intrinsics.checkNotNullParameter(rgl, "");
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = c42372rQk;
            this.KWHzl = rax;
            this.copydefault = rgl;
            this.OLrzqt = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View view, boolean z) {
            if (view != null) {
                C42372rQk c42372rQk = this.EZpvd;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                if (!z) {
                    this.OLrzqt.setBackgroundResource(C43662rtX.Activity.getFieldNames);
                    this.copydefault.AwvSrB().setValue(0);
                    this.KWHzl.OLrzqt(true);
                } else {
                    this.OLrzqt.setBackgroundResource(C43662rtX.Activity.fIwbmz);
                    this.copydefault.OLrzqt(c42372rQk.getContext().getResources().getDimensionPixelSize(C43662rtX.StateListAnimator.copydefault));
                    this.copydefault.AwvSrB().setValue(java.lang.Integer.valueOf(iArr[1] + view.getMeasuredHeight()));
                }
            }
        }
    }
}
