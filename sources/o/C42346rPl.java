package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputVerificationCodeAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rPl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42346rPl extends android.widget.FrameLayout {
    public ViewStatus AYXKKw;
    public java.lang.String AhwBna;
    public int EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public final AbstractC43954ryy copydefault;
    public int djBIcL;
    public android.text.TextWatcher valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.rPl$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.rPl$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[com.okinc.ok_kyc_core.presentation.views.Size.values().length];
            try {
                iArr[com.okinc.ok_kyc_core.presentation.views.Size.SM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.okinc.ok_kyc_core.presentation.views.Size.LG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42346rPl(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42346rPl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.AYXKKw = viewStatus;
    }

    /* JADX INFO: renamed from: o.rPl$FragmentManager */
    public static final class FragmentManager implements java.lang.Runnable {
        public final /* synthetic */ C42357rPw EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(C42357rPw c42357rPw) {
            this.EZpvd = c42357rPw;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C42346rPl.this.setTextBypassFilters(this.EZpvd, "*");
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:44) call: o.rPl.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42346rPl(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42346rPl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = ViewStatus.Form;
        this.djBIcL = 4;
        this.EZpvd = C43662rtX.StateListAnimator.AEQbTJ;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.dmfpNf, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC43954ryy) viewDataBindingInflate;
        this.AhwBna = "";
        this.KWHzl = "";
    }

    public static final java.lang.CharSequence AEQbTJ(C42357rPw c42357rPw) {
        Intrinsics.checkNotNullParameter(c42357rPw, "");
        return c42357rPw.OLrzqt();
    }

    private final java.lang.String AEQbTJ() {
        return CollectionsKt___CollectionsKt.joinToString$default(copydefault(), "", null, null, 0, null, new Function1() { // from class: o.rPu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42346rPl.AEQbTJ((C42357rPw) obj);
            }
        }, 30, null);
    }

    private final java.lang.String OLrzqt() {
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) CollectionsKt___CollectionsKt.joinToString$default(copydefault(), "", null, null, 0, null, new Function1() { // from class: o.rPk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42346rPl.copydefault((C42357rPw) obj);
            }
        }, 30, null)).toString();
    }

    public static final java.lang.CharSequence copydefault(C42357rPw c42357rPw) {
        Intrinsics.checkNotNullParameter(c42357rPw, "");
        android.text.Editable text = c42357rPw.getText();
        java.lang.String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    private final boolean EZpvd() {
        return OLrzqt().length() >= this.djBIcL;
    }

    /* JADX INFO: renamed from: o.rPl$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rPl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void setInitState() {
        android.view.View childAt = this.copydefault.EZpvd.getChildAt(0);
        childAt.setEnabled(true);
        childAt.requestFocus();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        for (C42357rPw c42357rPw : CollectionsKt___CollectionsKt.AYXKKw((java.util.List) copydefault(), 1)) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(this.EZpvd);
            ViewGroup.LayoutParams layoutParams = c42357rPw.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int measuredWidth = getMeasuredWidth();
            int i3 = this.djBIcL;
            C55296xhK.AEQbTJ(marginLayoutParams, 0, 0, (measuredWidth - (dimensionPixelSize * i3)) / (i3 - 1), 0);
            c42357rPw.setLayoutParams(marginLayoutParams);
        }
    }

    public void KWHzl(@NotNull final UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.util.List<rAX<java.lang.String>> listDNCPSb;
        java.lang.Boolean required;
        int i;
        java.lang.Integer numOfDigits;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final InputVerificationCodeAppModel inputVerificationCodeAppModel = uIComponentAppModel instanceof InputVerificationCodeAppModel ? (InputVerificationCodeAppModel) uIComponentAppModel : null;
        rGL rgl = abstractC42074rFj instanceof rGL ? (rGL) abstractC42074rFj : null;
        if (rgl == null || (listDNCPSb = rgl.dNCPSb()) == null) {
            return;
        }
        java.util.Iterator<T> it = listDNCPSb.iterator();
        while (it.hasNext()) {
            final rAX rax = (rAX) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (inputVerificationCodeAppModel != null ? inputVerificationCodeAppModel.getId() : null))) {
                java.lang.String value = inputVerificationCodeAppModel != null ? inputVerificationCodeAppModel.getValue() : null;
                boolean zBooleanValue = false;
                if (!java.lang.Boolean.valueOf(!(value == null || value.length() == 0)).booleanValue()) {
                    value = null;
                }
                rax.setValue(value);
                if (inputVerificationCodeAppModel != null && Intrinsics.EZpvd(inputVerificationCodeAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                    setVisibility(8);
                    rax.EZpvd(false);
                } else {
                    setVisibility(0);
                    if (inputVerificationCodeAppModel != null && (required = inputVerificationCodeAppModel.getRequired()) != null) {
                        zBooleanValue = required.booleanValue();
                    }
                    rax.EZpvd(zBooleanValue);
                }
                this.djBIcL = (inputVerificationCodeAppModel == null || (numOfDigits = inputVerificationCodeAppModel.getNumOfDigits()) == null) ? this.djBIcL : numOfDigits.intValue();
                int i2 = StateListAnimator.copydefault[com.okinc.ok_kyc_core.presentation.views.Size.Companion.EZpvd(inputVerificationCodeAppModel != null ? inputVerificationCodeAppModel.getSize() : null).ordinal()];
                if (i2 == 1) {
                    i = C43662rtX.StateListAnimator.EZpvd;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C43662rtX.StateListAnimator.AEQbTJ;
                }
                this.EZpvd = i;
                this.valueOf = OLrzqt(new Function0() { // from class: o.rPq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C42346rPl.AEQbTJ(this.copydefault, rax);
                    }
                });
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                EZpvd(context, new Function0() { // from class: o.rPo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C42346rPl.EZpvd(this.OLrzqt, rax);
                    }
                });
                setInitState();
                rgl.gasjUx().observe(lifecycleOwner, new ActionBar(new Function1() { // from class: o.rPn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42346rPl.KWHzl(inputVerificationCodeAppModel, this, rax, (C42156rIk) obj);
                    }
                }));
                C41959rBc.observeKYCFormField$default(rax, lifecycleOwner, new Function1() { // from class: o.rPr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42346rPl.AEQbTJ(uIComponentAppModel, (java.lang.String) obj);
                    }
                }, null, new Function1() { // from class: o.rPp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42346rPl.copydefault(rax, (java.lang.String) obj);
                    }
                }, null, 40, null);
            }
        }
    }

    public static final Unit AEQbTJ(C42346rPl c42346rPl, rAX rax) throws java.io.IOException {
        java.lang.String strAEQbTJ = c42346rPl.AEQbTJ();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = strAEQbTJ.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strAEQbTJ.charAt(i);
            if (java.lang.Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        java.lang.String strAkhnZx = C59454zhO.AkhnZx(sb.toString(), c42346rPl.djBIcL);
        if (c42346rPl.EZpvd()) {
            rax.setValue(strAkhnZx);
            java.lang.Object systemService = c42346rPl.getContext().getSystemService("input_method");
            Intrinsics.copydefault(systemService, "");
            ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(c42346rPl.getWindowToken(), 0);
        } else {
            rax.setValue(null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C42346rPl c42346rPl, rAX rax) throws java.io.IOException {
        java.lang.String strAEQbTJ = c42346rPl.AEQbTJ();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = strAEQbTJ.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strAEQbTJ.charAt(i);
            if (java.lang.Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        java.lang.String strAkhnZx = C59454zhO.AkhnZx(sb.toString(), c42346rPl.djBIcL);
        if (c42346rPl.EZpvd()) {
            rax.setValue(strAkhnZx);
            java.lang.Object systemService = c42346rPl.getContext().getSystemService("input_method");
            Intrinsics.copydefault(systemService, "");
            ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(c42346rPl.getWindowToken(), 0);
        } else {
            rax.setValue(null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InputVerificationCodeAppModel inputVerificationCodeAppModel, C42346rPl c42346rPl, rAX rax, C42156rIk c42156rIk) {
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), inputVerificationCodeAppModel != null ? inputVerificationCodeAppModel.getId() : null) && c42346rPl.getVisibility() != 0) {
                c42346rPl.setVisibility(0);
                rax.EZpvd((inputVerificationCodeAppModel == null || (required = inputVerificationCodeAppModel.getRequired()) == null) ? false : required.booleanValue());
                if (inputVerificationCodeAppModel != null) {
                    inputVerificationCodeAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), inputVerificationCodeAppModel != null ? inputVerificationCodeAppModel.getId() : null) && c42346rPl.getVisibility() == 0) {
                c42346rPl.setVisibility(8);
                rax.EZpvd(false);
                if (inputVerificationCodeAppModel != null) {
                    inputVerificationCodeAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(UIComponentAppModel uIComponentAppModel, java.lang.String str) {
        if (str != null) {
            uIComponentAppModel.setValue(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(rAX rax, java.lang.String str) {
        java.lang.CharSequence charSequence;
        if (str != null && ((charSequence = (java.lang.CharSequence) rax.getValue()) == null || charSequence.length() == 0)) {
            pUU.KWHzl("InputVerificationCodeItemView", "Error message: " + str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rPl$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ Function0<Unit> copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(Function0<Unit> function0) {
            this.copydefault = function0;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) throws java.io.IOException {
            java.lang.String string = charSequence != null ? charSequence.toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() > 1) {
                for (int i4 = 0; i4 < string.length(); i4++) {
                    if (java.lang.Character.isDigit(string.charAt(i4))) {
                    }
                }
                C42346rPl.this.AEQbTJ(string);
                return;
            }
            C42346rPl.onCodeChanged$default(C42346rPl.this, null, 1, null);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            this.copydefault.invoke();
        }
    }

    public final android.text.TextWatcher OLrzqt(Function0<Unit> function0) {
        return new Activity(function0);
    }

    public void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.AYXKKw, uIComponentAppModel.getBottomMargin()));
        InputVerificationCodeAppModel inputVerificationCodeAppModel = uIComponentAppModel instanceof InputVerificationCodeAppModel ? (InputVerificationCodeAppModel) uIComponentAppModel : null;
        if (inputVerificationCodeAppModel != null) {
            this.OLrzqt = inputVerificationCodeAppModel.getId();
        }
    }

    private final java.util.List<C42357rPw> copydefault() {
        android.widget.LinearLayout linearLayout = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return C59467zhb.zuBGHE(C59409zgW.KWHzl(ViewGroupKt.getChildren(linearLayout), C42357rPw.class));
    }

    public static /* synthetic */ void onCodeChanged$default(C42346rPl c42346rPl, java.lang.String str, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        c42346rPl.AEQbTJ(str);
    }

    public final void AEQbTJ(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            str = OLrzqt();
        }
        EZpvd(C59454zhO.AkhnZx(str, this.djBIcL));
    }

    public final void EZpvd(java.lang.String str) throws java.io.IOException {
        java.util.List<C42357rPw> listCopydefault = copydefault();
        for (C42357rPw c42357rPw : listCopydefault) {
            c42357rPw.setContentDescription("");
            c42357rPw.setBackground(c42357rPw.EZpvd());
            setTextWithoutNotifyListener(c42357rPw, "");
            java.lang.Object tag = c42357rPw.getTag();
            java.lang.Runnable runnable = tag instanceof java.lang.Runnable ? (java.lang.Runnable) tag : null;
            if (runnable != null) {
                c42357rPw.removeCallbacks(runnable);
            }
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            C42357rPw c42357rPw2 = listCopydefault.get(i);
            setTextWithoutNotifyListener(c42357rPw2, i == StringsKt__StringsKt.fIwbmz((java.lang.CharSequence) str) ? java.lang.String.valueOf(cCharAt) : "*");
            java.lang.String strValueOf = java.lang.String.valueOf(cCharAt);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length2 = strValueOf.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char cCharAt2 = strValueOf.charAt(i2);
                if (java.lang.Character.isDigit(cCharAt2)) {
                    sb.append(cCharAt2);
                }
            }
            java.lang.String string = sb.toString();
            if (true ^ StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
                setCurrentCode(c42357rPw2, string);
                if (i == StringsKt__StringsKt.fIwbmz((java.lang.CharSequence) str)) {
                    java.lang.Runnable fragmentManager = new FragmentManager(c42357rPw2);
                    c42357rPw2.setTag(fragmentManager);
                    c42357rPw2.postDelayed(fragmentManager, 1000L);
                }
            }
            i++;
        }
        int iAEQbTJ = C56548yJl.AEQbTJ(str.length(), (InterfaceC56538yJb<java.lang.Integer>) C56548yJl.AhwBna(0, this.djBIcL));
        C42357rPw c42357rPw3 = listCopydefault.get(iAEQbTJ);
        c42357rPw3.setEnabled(true);
        c42357rPw3.requestFocus();
        try {
            Result.Application application = Result.Companion;
            c42357rPw3.setSelection(c42357rPw3.length());
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        c42357rPw3.setBackground(c42357rPw3.AEQbTJ());
        int i3 = 0;
        for (C42357rPw c42357rPw4 : listCopydefault) {
            if (i3 != iAEQbTJ) {
                c42357rPw4.setEnabled(false);
            }
            i3++;
        }
    }

    public final void setTextWithoutNotifyListener(android.widget.EditText editText, java.lang.String str) {
        android.text.TextWatcher textWatcher = this.valueOf;
        android.text.TextWatcher textWatcher2 = null;
        if (textWatcher == null) {
            Intrinsics.gEmmrt("");
            textWatcher = null;
        }
        editText.removeTextChangedListener(textWatcher);
        editText.setText(str);
        android.text.TextWatcher textWatcher3 = this.valueOf;
        if (textWatcher3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            textWatcher2 = textWatcher3;
        }
        editText.addTextChangedListener(textWatcher2);
    }

    public final void setTextBypassFilters(android.widget.EditText editText, java.lang.String str) {
        android.text.InputFilter[] filters = editText.getFilters();
        try {
            editText.setFilters(new android.text.InputFilter[0]);
            setTextWithoutNotifyListener(editText, str);
            if (editText.isFocused()) {
                editText.setSelection(editText.getText().length());
            }
        } finally {
            editText.setFilters(filters);
        }
    }

    public final void setCurrentCode(C42357rPw c42357rPw, java.lang.String str) {
        c42357rPw.setCurrentCode(str);
    }

    public final void EZpvd(android.content.Context context, final Function0<Unit> function0) {
        this.copydefault.EZpvd.removeAllViews();
        int i = this.djBIcL;
        for (int i2 = 0; i2 < i; i2++) {
            C42357rPw c42357rPw = new C42357rPw(context, this.EZpvd);
            c42357rPw.setFilters(new TaskDescription[]{new TaskDescription(new Function0() { // from class: o.rPm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(C42346rPl.KWHzl(this.AEQbTJ));
                }
            })});
            c42357rPw.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            c42357rPw.setEnabled(false);
            c42357rPw.setOnPasteListener(new Function1() { // from class: o.rPj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42346rPl.AEQbTJ(this.OLrzqt, function0, (java.lang.String) obj);
                }
            });
            c42357rPw.setOnBackListener(new Function0() { // from class: o.rPi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C42346rPl.EZpvd(this.EZpvd, function0);
                }
            });
            c42357rPw.setTextAppearance(C52761wXj.LoaderManager.zblBkD);
            c42357rPw.setTextColor(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
            android.text.TextWatcher textWatcher = this.valueOf;
            if (textWatcher == null) {
                Intrinsics.gEmmrt("");
                textWatcher = null;
            }
            c42357rPw.addTextChangedListener(textWatcher);
            this.copydefault.EZpvd.addView(c42357rPw);
        }
    }

    public static final boolean KWHzl(C42346rPl c42346rPl) {
        return c42346rPl.EZpvd();
    }

    public static final Unit EZpvd(C42346rPl c42346rPl, Function0 function0) throws java.io.IOException {
        c42346rPl.AEQbTJ(C59454zhO.DbNXlk(c42346rPl.OLrzqt(), 1));
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rPl$TaskDescription */
    public static final class TaskDescription implements android.text.InputFilter {
        public final Function0<java.lang.Boolean> OLrzqt;

        public TaskDescription(@NotNull Function0<java.lang.Boolean> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.OLrzqt = function0;
        }

        @Override // android.text.InputFilter
        public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
            if (this.OLrzqt.invoke().booleanValue()) {
                return "";
            }
            return null;
        }
    }

    public static final Unit AEQbTJ(C42346rPl c42346rPl, Function0 function0, java.lang.String str) throws java.io.IOException {
        if (str == null) {
            str = "";
            break;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!java.lang.Character.isDigit(str.charAt(i))) {
                str = "";
                break;
            }
        }
        c42346rPl.AEQbTJ(str);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
