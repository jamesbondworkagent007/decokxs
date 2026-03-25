package com.okinc.tradeuilib.widget.oktinputlayout.core;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.tradeuilib.widget.oktinputlayout.core.TradeInputBasicsView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC49612uro;
import o.C33052mpF;
import o.C33054mpH;
import o.C49511upt;
import o.C52761wXj;
import o.C55001xbh;
import o.C55051xce;
import o.C55298xhM;
import o.C56444yFp;
import o.C57681ymx;
import o.InterfaceC48003uBj;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TradeInputBasicsView extends LinearLayout {
    public AbstractC49612uro AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public final Function1<String, Unit> AkhnZx;
    public Integer EZpvd;
    public final Function0<Unit> KWHzl;
    public ValueAnimator OLrzqt;
    public String copydefault;
    public KeyListener djBIcL;
    public final Function1<Boolean, Unit> gEmmrt;
    public InnerLayoutVisibleState isConnected;
    public Function1<? super Boolean, Unit> valueOf;
    public InputLayoutState values;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InputLayoutState.values().length];
            try {
                iArr[InputLayoutState.GREY_CLICKABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputLayoutState.NORMAL_UN_CLICKABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputLayoutState.GREY_UN_CLICKABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InputLayoutState.JUST_READ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InputLayoutState.JUST_READ_CLICKABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[InnerLayoutVisibleState.values().length];
            try {
                iArr2[InnerLayoutVisibleState.FOCUSED_OR_FILLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InnerLayoutVisibleState.COVERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InnerLayoutVisibleState.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TradeInputBasicsView(@NotNull Context context) {
        this(context, null, null, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TradeInputBasicsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputLayoutState AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<String, Unit> gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickCallback(Function1<? super Boolean, Unit> function1) {
        this.valueOf = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r4v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r5v0 kotlin.jvm.functions.Function1))
 A[MD:(android.content.Context, android.util.AttributeSet, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>):void (m)] (LINE:69) call: com.okinc.tradeuilib.widget.oktinputlayout.core.TradeInputBasicsView.<init>(android.content.Context, android.util.AttributeSet, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ TradeInputBasicsView(Context context, AttributeSet attributeSet, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function12);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TradeInputBasicsView(@NotNull Context context, AttributeSet attributeSet, Function1<? super String, Unit> function1, Function1<? super Boolean, Unit> function12) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AkhnZx = function1;
        this.gEmmrt = function12;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(context), C49511upt.StateListAnimator.QfsBiF, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC49612uro) viewDataBindingInflate;
        this.EZpvd = 8;
        setOrientation(1);
        this.AEQbTJ.gEmmrt.setActivated(true);
        this.AEQbTJ.copydefault.setShowThousandsSeparator(true);
        this.djBIcL = this.AEQbTJ.copydefault.getKeyListener();
        isConnected();
        copydefault(attributeSet);
        this.AEQbTJ.KWHzl.setTypeface(C55051xce.OLrzqt.valueOf());
        DbNXlk();
        if (this.AYXKKw) {
            this.AEQbTJ.gEmmrt.setLayoutParams(new LinearLayout.LayoutParams(-1, C55298xhM.dp2px$default(48.0f, null, 1, null)));
            C55001xbh c55001xbh = this.AEQbTJ.copydefault;
            c55001xbh.setTextAppearance(C52761wXj.LoaderManager.AxsJAY);
            c55001xbh.setGravity(6);
            TextView textView = this.AEQbTJ.OLrzqt;
            textView.setTextAppearance(C52761wXj.LoaderManager.AxsJAY);
            textView.setGravity(TextAlign.LEFT);
        }
        this.KWHzl = new Function0() { // from class: o.uBA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradeInputBasicsView.copydefault(this.copydefault);
            }
        };
        this.copydefault = "";
        this.values = InputLayoutState.NORMAL;
        this.isConnected = InnerLayoutVisibleState.NORMAL;
    }

    public static final class StateListAnimator implements TextWatcher {
        public final /* synthetic */ C55001xbh copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator(C55001xbh c55001xbh) {
            this.copydefault = c55001xbh;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TradeInputBasicsView.this.copydefault().length() > 0) {
                TradeInputBasicsView.this.OLrzqt(InnerLayoutVisibleState.FOCUSED_OR_FILLED);
            } else if (TradeInputBasicsView.this.isConnected != InnerLayoutVisibleState.COVERED && !TradeInputBasicsView.this.valueOf()) {
                TradeInputBasicsView.this.OLrzqt(InnerLayoutVisibleState.NORMAL);
            }
            Function1<String, Unit> function1GEmmrt = TradeInputBasicsView.this.gEmmrt();
            if (function1GEmmrt != null) {
                function1GEmmrt.invoke(this.copydefault.isConnected());
            }
        }
    }

    public final void copydefault(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C49511upt.Fragment.AuCTel, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(C49511upt.Fragment.uzCIH, C55298xhM.dp2px$default(12.0f, null, 1, null));
            this.EZpvd = Integer.valueOf(dimension);
            this.AEQbTJ.gEmmrt.setPaddingRelative(dimension, C57681ymx.OLrzqt(this, 4.0f), dimension, C57681ymx.OLrzqt(this, 4.0f));
            this.AYXKKw = typedArrayObtainStyledAttributes.getInteger(C49511upt.Fragment.gHZMYf, 0) == 2;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void AuCTel() {
        ConstraintLayout constraintLayout = this.AEQbTJ.gEmmrt;
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), C55298xhM.dpInt$default(8.0f, (Context) null, 1, (Object) null), constraintLayout.getPaddingBottom());
    }

    public final C55001xbh EZpvd() {
        C55001xbh c55001xbh = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
        return c55001xbh;
    }

    public static final Unit copydefault(TradeInputBasicsView tradeInputBasicsView) {
        if (tradeInputBasicsView.AEQbTJ.copydefault.hasFocus()) {
            tradeInputBasicsView.fARcdN();
            tradeInputBasicsView.setStatus(InputLayoutState.NORMAL);
            tradeInputBasicsView.OLrzqt(InnerLayoutVisibleState.FOCUSED_OR_FILLED);
        } else if (tradeInputBasicsView.isConnected != InnerLayoutVisibleState.COVERED && tradeInputBasicsView.copydefault().length() == 0) {
            tradeInputBasicsView.OLrzqt(InnerLayoutVisibleState.NORMAL);
        }
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        final C55001xbh c55001xbh = this.AEQbTJ.copydefault;
        c55001xbh.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.uBE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                TradeInputBasicsView.AEQbTJ(this.AEQbTJ, c55001xbh, view, z);
            }
        });
        Intrinsics.copydefault(c55001xbh);
        c55001xbh.addTextChangedListener(new StateListAnimator(c55001xbh));
    }

    public static final void AEQbTJ(TradeInputBasicsView tradeInputBasicsView, C55001xbh c55001xbh, View view, boolean z) {
        tradeInputBasicsView.AEQbTJ.gEmmrt.setSelected(z);
        final Function0<Unit> function0 = tradeInputBasicsView.KWHzl;
        c55001xbh.postDelayed(new Runnable() { // from class: o.uBz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                TradeInputBasicsView.AEQbTJ(function0);
            }
        }, z ? 50L : 80L);
        Function1<Boolean, Unit> function1 = tradeInputBasicsView.gEmmrt;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public static final void AEQbTJ(Function0 function0) {
        function0.invoke();
    }

    public final String copydefault() {
        return this.AEQbTJ.copydefault.isConnected();
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.KWHzl.setHintAnimationEnabled(false);
        this.AEQbTJ.copydefault.setPlainNumericText(str);
        this.AEQbTJ.KWHzl.setHintAnimationEnabled(true);
    }

    public final String djBIcL() {
        return this.AEQbTJ.AEQbTJ.getText().toString();
    }

    public final void setHint(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.AEQbTJ.setText(str);
        fetchVPNInfo();
    }

    public final void setFloatingHint(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        fetchVPNInfo();
    }

    public final boolean AYXKKw() {
        return !this.AEQbTJ.gEmmrt.isActivated();
    }

    public final void setErrorState(boolean z) {
        TextView textView = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        this.AEQbTJ.gEmmrt.setActivated(!z);
        if (z) {
            return;
        }
        this.AEQbTJ.EZpvd.setText("");
    }

    public final String KWHzl() {
        return this.AEQbTJ.EZpvd.getText().toString();
    }

    public final void setErrorMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.EZpvd.setText(str);
        if (str.length() == 0) {
            TextView textView = this.AEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
        }
    }

    public final String AEQbTJ() {
        return this.AEQbTJ.OLrzqt.getText().toString();
    }

    public final void setCoverText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() != 0 || this.isConnected == InnerLayoutVisibleState.COVERED) {
            OLrzqt(str.length() > 0);
            this.AEQbTJ.OLrzqt.setText(str);
            if (str.length() > 0) {
                OLrzqt(InnerLayoutVisibleState.COVERED);
                values();
            } else {
                if (this.AEQbTJ.copydefault.hasFocus()) {
                    return;
                }
                OLrzqt(InnerLayoutVisibleState.NORMAL);
            }
        }
    }

    public final void setMaxDecimal(int i) {
        C55001xbh c55001xbh = this.AEQbTJ.copydefault;
        c55001xbh.setModel(C55001xbh.ActionBar.copy$default(c55001xbh.DbNXlk(), 0, 0, i, 3, null));
    }

    public final int AhwBna() {
        return this.AEQbTJ.copydefault.DbNXlk().KWHzl();
    }

    public final void setLeftSideView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ.valueOf.removeAllViews();
        this.AEQbTJ.valueOf.addView(view, -2, -1);
    }

    public final void setRightSideView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ.AYXKKw.removeAllViews();
        this.AEQbTJ.AYXKKw.addView(view, -2, -1);
    }

    public static /* synthetic */ void setRightSideView$default(TradeInputBasicsView tradeInputBasicsView, View view, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 17;
        }
        tradeInputBasicsView.setRightSideView(view, i);
    }

    public final void setRightSideView(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ.AYXKKw.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = i;
        this.AEQbTJ.AYXKKw.addView(view, layoutParams);
    }

    public final void setSecondRightSideView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ.AhwBna.removeAllViews();
        this.AEQbTJ.AhwBna.addView(view, -2, -1);
    }

    public final void fIwbmz() {
        final C55001xbh c55001xbh = this.AEQbTJ.copydefault;
        ValueAnimator valueAnimator = this.OLrzqt;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            float textSize = c55001xbh.getTextSize();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            final int iOLrzqt = C33052mpF.OLrzqt(textSize, context);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.2f, 1.0f);
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.uBy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                    TradeInputBasicsView.copydefault(this.EZpvd, c55001xbh, iOLrzqt, valueAnimator2);
                }
            });
            valueAnimatorOfFloat.start();
            this.OLrzqt = valueAnimatorOfFloat;
        }
    }

    public static final void copydefault(TradeInputBasicsView tradeInputBasicsView, C55001xbh c55001xbh, int i, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        if (tradeInputBasicsView.isAttachedToWindow()) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.copydefault(animatedValue, "");
            c55001xbh.setTextSize(1, i * ((Float) animatedValue).floatValue());
        }
    }

    public final void fARcdN() {
        C55001xbh c55001xbh = this.AEQbTJ.copydefault;
        c55001xbh.requestFocus();
        Editable text = c55001xbh.getText();
        c55001xbh.setSelection(text != null ? text.length() : 0);
        Object systemService = c55001xbh.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(c55001xbh, 0);
        }
    }

    public final void values() {
        if (this.AEQbTJ.copydefault.hasFocus()) {
            this.AEQbTJ.copydefault.clearFocus();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C33054mpH.OLrzqt(context, this.AEQbTJ.copydefault);
        }
    }

    public final void setNegativeMode() {
        this.AEQbTJ.copydefault.setNegativeMode(true);
    }

    public final void setPositiveMode() {
        C55001xbh c55001xbh = this.AEQbTJ.copydefault;
        c55001xbh.setNegativeMode(false);
        c55001xbh.setAllowEditNegative(false);
        c55001xbh.setAllowShowNegative(true);
    }

    public final boolean valueOf() {
        return this.AEQbTJ.copydefault.hasFocus();
    }

    public final void setFocus(boolean z) {
        if (z) {
            this.AEQbTJ.copydefault.requestFocus();
        } else {
            this.AEQbTJ.copydefault.clearFocus();
        }
    }

    public final void setStatus(@NotNull InputLayoutState inputLayoutState) {
        Intrinsics.checkNotNullParameter(inputLayoutState, "");
        Objects.toString(inputLayoutState);
        if (inputLayoutState == this.values) {
            return;
        }
        this.AEQbTJ.gEmmrt.isEnabled();
        this.AEQbTJ.gEmmrt.isActivated();
        this.AEQbTJ.gEmmrt.isSelected();
        Objects.toString(inputLayoutState);
        this.AEQbTJ.gEmmrt.setActivated(true);
        this.values = inputLayoutState;
        int i = TaskDescription.EZpvd[inputLayoutState.ordinal()];
        if (i == 1) {
            this.AEQbTJ.gEmmrt.setEnabled(false);
            values();
            return;
        }
        if (i == 2) {
            this.AEQbTJ.copydefault.setEnabled(false);
            values();
            return;
        }
        if (i == 3) {
            this.AEQbTJ.gEmmrt.setEnabled(false);
            this.AEQbTJ.copydefault.setEnabled(false);
            values();
            return;
        }
        if (i == 4) {
            this.AEQbTJ.gEmmrt.setEnabled(true);
            this.AEQbTJ.copydefault.setEnabled(false);
            values();
        } else if (i == 5) {
            this.AEQbTJ.gEmmrt.setEnabled(true);
            this.AEQbTJ.copydefault.setEnabled(true);
            values();
        } else {
            Function1<? super Boolean, Unit> function1 = this.valueOf;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            this.AEQbTJ.gEmmrt.setEnabled(true);
            this.AEQbTJ.copydefault.setEnabled(true);
        }
    }

    private final void OLrzqt(boolean z) {
        this.AhwBna = z;
        setContent("");
        this.AEQbTJ.KWHzl.setExpandedHintEnabled(!z);
    }

    public final void fetchVPNInfo() {
        if (this.AYXKKw) {
            return;
        }
        InnerLayoutVisibleState innerLayoutVisibleState = this.isConnected;
        if (innerLayoutVisibleState == InnerLayoutVisibleState.COVERED || innerLayoutVisibleState == InnerLayoutVisibleState.FOCUSED_OR_FILLED) {
            TextInputLayout textInputLayout = this.AEQbTJ.KWHzl;
            String strOLrzqt = this.copydefault;
            if (StringsKt__StringsKt.fARcdN((CharSequence) strOLrzqt)) {
                strOLrzqt = OLrzqt();
            }
            textInputLayout.setHint(strOLrzqt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(InnerLayoutVisibleState innerLayoutVisibleState) {
        this.isConnected = innerLayoutVisibleState;
        if (this.AYXKKw) {
            KWHzl(innerLayoutVisibleState);
        } else {
            copydefault(innerLayoutVisibleState);
        }
    }

    public final void copydefault(InnerLayoutVisibleState innerLayoutVisibleState) {
        int i = TaskDescription.KWHzl[innerLayoutVisibleState.ordinal()];
        if (i == 1) {
            TextInputLayout textInputLayout = this.AEQbTJ.KWHzl;
            String strOLrzqt = this.copydefault;
            if (StringsKt__StringsKt.fARcdN((CharSequence) strOLrzqt)) {
                strOLrzqt = OLrzqt();
            }
            textInputLayout.setHint(strOLrzqt);
            FrameLayout frameLayout = this.AEQbTJ.valueOf;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(8);
            FrameLayout frameLayout2 = this.AEQbTJ.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            frameLayout2.setVisibility(8);
            TextView textView = this.AEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            TextView textView2 = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.AEQbTJ.KWHzl.setHint("");
            FrameLayout frameLayout3 = this.AEQbTJ.valueOf;
            Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
            frameLayout3.setVisibility(0);
            FrameLayout frameLayout4 = this.AEQbTJ.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
            frameLayout4.setVisibility(0);
            TextView textView3 = this.AEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
            TextView textView4 = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(8);
            return;
        }
        TextInputLayout textInputLayout2 = this.AEQbTJ.KWHzl;
        String strOLrzqt2 = this.copydefault;
        if (StringsKt__StringsKt.fARcdN((CharSequence) strOLrzqt2)) {
            strOLrzqt2 = OLrzqt();
        }
        textInputLayout2.setHint(strOLrzqt2);
        FrameLayout frameLayout5 = this.AEQbTJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(frameLayout5, "");
        frameLayout5.setVisibility(8);
        FrameLayout frameLayout6 = this.AEQbTJ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(frameLayout6, "");
        frameLayout6.setVisibility(8);
        TextView textView5 = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(8);
        TextView textView6 = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(0);
    }

    public final void KWHzl(InnerLayoutVisibleState innerLayoutVisibleState) {
        int i = TaskDescription.KWHzl[innerLayoutVisibleState.ordinal()];
        if (i == 1) {
            FrameLayout frameLayout = this.AEQbTJ.valueOf;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(8);
            TextView textView = this.AEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            TextView textView2 = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            return;
        }
        if (i == 2) {
            FrameLayout frameLayout2 = this.AEQbTJ.valueOf;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            frameLayout2.setVisibility(8);
            TextView textView3 = this.AEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
            TextView textView4 = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(0);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        FrameLayout frameLayout3 = this.AEQbTJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
        frameLayout3.setVisibility(0);
        TextView textView5 = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(0);
        TextView textView6 = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(8);
    }

    public final String OLrzqt() {
        String strDjBIcL = djBIcL();
        FrameLayout frameLayout = this.AEQbTJ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        List listGEmmrt = yDY.gEmmrt(strDjBIcL, AEQbTJ(frameLayout));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listGEmmrt) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, null, 62, null);
        if (strJoinToString$default.length() > 0) {
            strJoinToString$default = "(" + strJoinToString$default + ")";
        }
        FrameLayout frameLayout2 = this.AEQbTJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        return AEQbTJ(frameLayout2) + " " + strJoinToString$default;
    }

    public final String AEQbTJ(ViewGroup viewGroup) {
        StringBuilder sb = new StringBuilder();
        for (KeyEvent.Callback callback : ViewGroupKt.getChildren(viewGroup)) {
            if (callback instanceof InterfaceC48003uBj) {
                sb.append(((InterfaceC48003uBj) callback).KWHzl());
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void DbNXlk() {
        this.AEQbTJ.copydefault.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.uBC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                return TradeInputBasicsView.copydefault(this.copydefault, textView, i, keyEvent);
            }
        });
    }

    public static final boolean copydefault(TradeInputBasicsView tradeInputBasicsView, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        tradeInputBasicsView.values();
        return false;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InnerLayoutVisibleState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ InnerLayoutVisibleState[] $VALUES;
        public static final InnerLayoutVisibleState NORMAL = new InnerLayoutVisibleState("NORMAL", 0);
        public static final InnerLayoutVisibleState FOCUSED_OR_FILLED = new InnerLayoutVisibleState("FOCUSED_OR_FILLED", 1);
        public static final InnerLayoutVisibleState COVERED = new InnerLayoutVisibleState("COVERED", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ InnerLayoutVisibleState[] $values() {
            return new InnerLayoutVisibleState[]{NORMAL, FOCUSED_OR_FILLED, COVERED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<InnerLayoutVisibleState> getEntries() {
            return $ENTRIES;
        }

        private InnerLayoutVisibleState(String str, int i) {
        }

        static {
            InnerLayoutVisibleState[] innerLayoutVisibleStateArr$values = $values();
            $VALUES = innerLayoutVisibleStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(innerLayoutVisibleStateArr$values);
        }

        public static InnerLayoutVisibleState valueOf(String str) {
            return (InnerLayoutVisibleState) Enum.valueOf(InnerLayoutVisibleState.class, str);
        }

        public static InnerLayoutVisibleState[] values() {
            return (InnerLayoutVisibleState[]) $VALUES.clone();
        }
    }
}
