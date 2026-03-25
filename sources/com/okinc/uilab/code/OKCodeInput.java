package com.okinc.uilab.code;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.autofill.AndroidAutofill$$ExternalSyntheticApiModelOutline1;
import androidx.compose.ui.autofill.AndroidAutofill$$ExternalSyntheticApiModelOutline2;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import com.okinc.uilab.code.OKCodeInput;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C34706nhR;
import o.C52761wXj;
import o.C52820wZo;
import o.C55296xhK;
import o.C56391yDq;
import o.C56444yFp;
import o.C56548yJl;
import o.C59409zgW;
import o.C59454zhO;
import o.C59467zhb;
import o.InterfaceC56445yFq;
import o.InterfaceC56538yJb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class OKCodeInput extends FrameLayout {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final LinearLayout AEQbTJ;
    public final Handler AYXKKw;
    public String KWHzl;
    public AutofillType OLrzqt;
    public final Handler copydefault;
    public Function1<? super String, Unit> djBIcL;
    public Function1<? super String, Unit> gEmmrt;
    public TextWatcher valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKCodeInput(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKCodeInput(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCodeChangedListener(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.gEmmrt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCodeCompleteListener(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:33) call: com.okinc.uilab.code.OKCodeInput.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ OKCodeInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCodeInput(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = new Function1() { // from class: o.wZB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKCodeInput.AEQbTJ((java.lang.String) obj);
            }
        };
        this.gEmmrt = new Function1() { // from class: o.wZz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKCodeInput.copydefault((java.lang.String) obj);
            }
        };
        this.AYXKKw = new Handler(Looper.getMainLooper());
        this.copydefault = new Handler(Looper.getMainLooper());
        this.valueOf = new ActionBar();
        this.KWHzl = "";
        LinearLayout linearLayoutKWHzl = KWHzl(context);
        this.AEQbTJ = linearLayoutKWHzl;
        addView(linearLayoutKWHzl);
        setInitState();
    }

    public static final Unit AEQbTJ(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws IOException {
            String string = charSequence != null ? charSequence.toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() > 1) {
                OKCodeInput.this.OLrzqt(string);
            } else {
                OKCodeInput.onCodeChanged$default(OKCodeInput.this, null, 1, null);
            }
        }
    }

    public static final CharSequence KWHzl(C52820wZo c52820wZo) {
        Intrinsics.checkNotNullParameter(c52820wZo, "");
        Editable text = c52820wZo.getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final String EZpvd() {
        return StringsKt__StringsKt.hDKMBd((CharSequence) CollectionsKt___CollectionsKt.joinToString$default(AYXKKw(), "", null, null, 0, null, new Function1() { // from class: o.wZF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKCodeInput.KWHzl((C52820wZo) obj);
            }
        }, 30, null)).toString();
    }

    public final void setCode(@NotNull String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        OLrzqt(str);
    }

    public static final class TaskDescription implements Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        @Override // java.lang.Runnable
        public final void run() throws IOException {
            OKCodeInput.this.setCode("");
            OKCodeInput.this.copydefault();
        }
    }

    public final boolean AEQbTJ() {
        return EZpvd().length() >= 6;
    }

    public final void setInitState() {
        View childAt = this.AEQbTJ.getChildAt(0);
        childAt.setEnabled(true);
        childAt.setContentDescription("authCodeView");
        childAt.requestFocus();
    }

    public final void setAutofillType(@NotNull AutofillType autofillType) {
        Intrinsics.checkNotNullParameter(autofillType, "");
        this.OLrzqt = autofillType;
        Iterator<C52820wZo> it = AYXKKw().iterator();
        while (it.hasNext()) {
            it.next().setAutofillType(autofillType);
        }
    }

    public final void OLrzqt(boolean z) {
        Iterator<C52820wZo> it = AYXKKw().iterator();
        while (it.hasNext()) {
            it.next().setBackgroundResource(C52761wXj.TaskDescription.AEQbTJ);
        }
        if (z) {
            this.copydefault.postDelayed(new TaskDescription(), 2000L);
        }
    }

    public final void copydefault() {
        Object next;
        Context context = getContext();
        if (context == null) {
            return;
        }
        Iterator<T> it = AYXKKw().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((C52820wZo) next).hasFocus()) {
                    break;
                }
            }
        }
        C52820wZo c52820wZo = (C52820wZo) next;
        if (c52820wZo == null) {
            return;
        }
        c52820wZo.requestFocus();
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(c52820wZo, 1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        for (C52820wZo c52820wZo : CollectionsKt___CollectionsKt.AYXKKw((List) AYXKKw(), 1)) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.OLrzqt);
            ViewGroup.LayoutParams layoutParams = c52820wZo.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C55296xhK.AEQbTJ(marginLayoutParams, 0, 0, (getMeasuredWidth() - (dimensionPixelSize * 6)) / 5, 0);
            c52820wZo.setLayoutParams(marginLayoutParams);
        }
    }

    public final void AhwBna(String str) {
        List<C52820wZo> listAYXKKw = AYXKKw();
        for (C52820wZo c52820wZo : listAYXKKw) {
            c52820wZo.setContentDescription("");
            c52820wZo.setBackgroundResource(C52761wXj.TaskDescription.KWHzl);
            setTextWithoutNotifyListener(c52820wZo, "");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            setTextWithoutNotifyListener(listAYXKKw.get(i), String.valueOf(str.charAt(i)));
        }
        int iAEQbTJ = C56548yJl.AEQbTJ(str.length(), (InterfaceC56538yJb<Integer>) C56548yJl.AhwBna(0, 6));
        C52820wZo c52820wZo2 = listAYXKKw.get(iAEQbTJ);
        c52820wZo2.setEnabled(true);
        c52820wZo2.requestFocus();
        try {
            Result.Application application = Result.Companion;
            c52820wZo2.setSelection(c52820wZo2.length());
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        c52820wZo2.setContentDescription("authCodeView");
        c52820wZo2.setBackgroundResource(C52761wXj.TaskDescription.copydefault);
        int i2 = 0;
        for (C52820wZo c52820wZo3 : listAYXKKw) {
            if (i2 != iAEQbTJ) {
                c52820wZo3.setEnabled(false);
            }
            i2++;
        }
    }

    public final void setTextWithoutNotifyListener(EditText editText, String str) {
        editText.removeTextChangedListener(this.valueOf);
        editText.setText(str);
        editText.addTextChangedListener(this.valueOf);
    }

    public final LinearLayout KWHzl(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(8388611);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        for (int i = 0; i < 6; i++) {
            C52820wZo c52820wZo = new C52820wZo(context);
            c52820wZo.setFilters(new Activity[]{new Activity(new Function0() { // from class: o.wZG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(OKCodeInput.AEQbTJ(this.copydefault));
                }
            })});
            c52820wZo.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            c52820wZo.setEnabled(false);
            c52820wZo.setOnPasteListener(new Function1() { // from class: o.wZD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKCodeInput.OLrzqt(this.KWHzl, (java.lang.String) obj);
                }
            });
            c52820wZo.setOnBackListener(new Function0() { // from class: o.wZE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OKCodeInput.gEmmrt(this.OLrzqt);
                }
            });
            c52820wZo.setTextAppearance(C52761wXj.LoaderManager.QVsKAR);
            c52820wZo.setTextColor(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
            c52820wZo.addTextChangedListener(this.valueOf);
            linearLayout.addView(c52820wZo);
        }
        return linearLayout;
    }

    public static final boolean AEQbTJ(OKCodeInput oKCodeInput) {
        return oKCodeInput.AEQbTJ();
    }

    public static final Unit OLrzqt(OKCodeInput oKCodeInput, String str) throws IOException {
        oKCodeInput.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(OKCodeInput oKCodeInput) throws IOException {
        oKCodeInput.OLrzqt(C59454zhO.DbNXlk(oKCodeInput.EZpvd(), 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onCodeChanged$default(OKCodeInput oKCodeInput, String str, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        oKCodeInput.OLrzqt(str);
    }

    public final void OLrzqt(String str) throws IOException {
        if (str == null) {
            str = EZpvd();
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String strAkhnZx = C59454zhO.AkhnZx(sb.toString(), 6);
        this.gEmmrt.invoke(strAkhnZx);
        AhwBna(strAkhnZx);
        if (AEQbTJ()) {
            this.djBIcL.invoke(strAkhnZx);
        }
    }

    private final List<C52820wZo> AYXKKw() {
        return C59467zhb.zuBGHE(C59409zgW.KWHzl(ViewGroupKt.getChildren(this.AEQbTJ), C52820wZo.class));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.AYXKKw.postDelayed(new Runnable() { // from class: o.wZC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                OKCodeInput.valueOf(this.KWHzl);
            }
        }, 5000L);
    }

    public static final void valueOf(OKCodeInput oKCodeInput) {
        oKCodeInput.KWHzl();
    }

    public final void KWHzl() {
        Object next;
        if (Build.VERSION.SDK_INT < 26 || this.OLrzqt == null) {
            return;
        }
        Object systemService = getContext().getSystemService((Class<Object>) AndroidAutofill$$ExternalSyntheticApiModelOutline1.m());
        Intrinsics.checkNotNullExpressionValue(systemService, "");
        AutofillManager autofillManagerM = AndroidAutofill$$ExternalSyntheticApiModelOutline2.m(systemService);
        if (!autofillManagerM.isEnabled() || C34706nhR.copydefault.KWHzl()) {
            return;
        }
        Iterator<T> it = AYXKKw().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((C52820wZo) next).hasFocus()) {
                    break;
                }
            }
        }
        C52820wZo c52820wZo = (C52820wZo) next;
        if (c52820wZo == null) {
            return;
        }
        autofillManagerM.requestAutofill(c52820wZo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.AYXKKw.removeCallbacksAndMessages(null);
        this.copydefault.removeCallbacksAndMessages(null);
    }

    public final void OLrzqt() {
        Object next;
        Iterator<T> it = AYXKKw().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((C52820wZo) next).hasFocus()) {
                    break;
                }
            }
        }
        C52820wZo c52820wZo = (C52820wZo) next;
        if (c52820wZo == null && (c52820wZo = (C52820wZo) CollectionsKt___CollectionsKt.firstOrNull(AYXKKw())) == null) {
            return;
        }
        c52820wZo.requestFocus();
    }

    public static final class Activity implements InputFilter {
        public final Function0<Boolean> EZpvd;

        public Activity(@NotNull Function0<Boolean> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.EZpvd = function0;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (this.EZpvd.invoke().booleanValue()) {
                return "";
            }
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class AutofillType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AutofillType[] $VALUES;
        public static final AutofillType SMS = new AutofillType("SMS", 0);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AutofillType[] $values() {
            return new AutofillType[]{SMS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AutofillType> getEntries() {
            return $ENTRIES;
        }

        private AutofillType(String str, int i) {
        }

        static {
            AutofillType[] autofillTypeArr$values = $values();
            $VALUES = autofillTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(autofillTypeArr$values);
        }

        public static AutofillType valueOf(String str) {
            return (AutofillType) Enum.valueOf(AutofillType.class, str);
        }

        public static AutofillType[] values() {
            return (AutofillType[]) $VALUES.clone();
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilab.code.OKCodeInput.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
