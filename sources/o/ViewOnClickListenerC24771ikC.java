package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ikC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnClickListenerC24771ikC extends android.widget.LinearLayout implements View.OnClickListener {
    public C21512hCc AEQbTJ;
    public java.lang.String AYXKKw;
    public Function0<Unit> EZpvd;
    public VerticalEditTextGroupData KWHzl;
    public boolean OLrzqt;
    public Function0<Unit> copydefault;
    public Function0<Unit> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCheckData(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickValueDifferenceCallBack(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.djBIcL = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableEdit(boolean z) {
        this.OLrzqt = !z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputFocusCallBack(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
    }

    public ViewOnClickListenerC24771ikC(android.content.Context context) {
        super(context);
        this.KWHzl = new VerticalEditTextGroupData(null, null, null, null, 0, false, false, false, null, null, false, 0, null, false, null, 32767, null);
        EZpvd(context, (android.util.AttributeSet) null);
    }

    public ViewOnClickListenerC24771ikC(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.KWHzl = new VerticalEditTextGroupData(null, null, null, null, 0, false, false, false, null, null, false, 0, null, false, null, 32767, null);
        EZpvd(context, attributeSet);
    }

    public ViewOnClickListenerC24771ikC(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.KWHzl = new VerticalEditTextGroupData(null, null, null, null, 0, false, false, false, null, null, false, 0, null, false, null, 32767, null);
        EZpvd(context, attributeSet);
    }

    public final void EZpvd(android.content.Context context, android.util.AttributeSet attributeSet) {
        setOrientation(1);
        if (context == null) {
            return;
        }
        C21512hCc c21512hCcOLrzqt = C21512hCc.OLrzqt(android.view.LayoutInflater.from(context), this);
        this.AEQbTJ = c21512hCcOLrzqt;
        if (c21512hCcOLrzqt != null) {
            C24806ikl c24806ikl = c21512hCcOLrzqt.AEQbTJ;
            RoundingMode roundingMode = RoundingMode.DOWN;
            c24806ikl.setHint(pTB.toLocalizationStringWithPrecision$default("0.0", 1, 0, roundingMode, null, 8, null));
            c21512hCcOLrzqt.OLrzqt.setHint(pTB.toLocalizationStringWithPrecision$default("0.0", 1, 0, roundingMode, null, 8, null));
            c21512hCcOLrzqt.AEQbTJ.setVisibility(8);
            c21512hCcOLrzqt.OLrzqt.setVisibility(0);
        }
        KWHzl(this.KWHzl);
        EZpvd();
    }

    public final void EZpvd() {
        final C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc != null) {
            c21512hCc.AEQbTJ.setIsolateTextChangedListener(new Function2() { // from class: o.ikD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return ViewOnClickListenerC24771ikC.AEQbTJ(this.OLrzqt, c21512hCc, (C55001xbh) obj, (java.lang.String) obj2);
                }
            });
            c21512hCc.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.ikF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ViewOnClickListenerC24771ikC.KWHzl(this.copydefault, view);
                }
            });
            c21512hCc.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.ikE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ViewOnClickListenerC24771ikC.OLrzqt(this.EZpvd, view);
                }
            });
            c21512hCc.AEQbTJ.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.ikK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    ViewOnClickListenerC24771ikC.OLrzqt(this.KWHzl, view, z);
                }
            });
            c21512hCc.AEQbTJ.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.ikL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                    return ViewOnClickListenerC24771ikC.EZpvd(this.OLrzqt, textView, i, keyEvent);
                }
            });
        }
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC, C21512hCc c21512hCc, C55001xbh c55001xbh, java.lang.String str) {
        C24796ikb c24796ikb;
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        viewOnClickListenerC24771ikC.AYXKKw = C23311hvo.OLrzqt(str);
        C21512hCc c21512hCc2 = viewOnClickListenerC24771ikC.AEQbTJ;
        if (c21512hCc2 != null && (textView = c21512hCc2.KWHzl) != null) {
            textView.setEnabled(C33129mqd.OLrzqt((java.lang.CharSequence) str));
        }
        viewOnClickListenerC24771ikC.KWHzl.setContent(java.lang.String.valueOf(c21512hCc.AEQbTJ.getText()));
        C21512hCc c21512hCc3 = viewOnClickListenerC24771ikC.AEQbTJ;
        if (c21512hCc3 != null && (c24796ikb = c21512hCc3.OLrzqt) != null) {
            c24796ikb.setText(java.lang.String.valueOf(c21512hCc.AEQbTJ.getText()));
        }
        C24806ikl c24806ikl = c21512hCc.AEQbTJ;
        android.text.Editable text = c24806ikl.getText();
        c24806ikl.setTextSize(C25352ivB.OLrzqt(text != null ? text.length() : 0));
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC, android.view.View view) {
        C24806ikl c24806ikl;
        C24796ikb c24796ikb;
        C21512hCc c21512hCc = viewOnClickListenerC24771ikC.AEQbTJ;
        if (c21512hCc != null && (c24796ikb = c21512hCc.OLrzqt) != null) {
            c24796ikb.setVisibility(8);
        }
        C21512hCc c21512hCc2 = viewOnClickListenerC24771ikC.AEQbTJ;
        if (c21512hCc2 != null && (c24806ikl = c21512hCc2.AEQbTJ) != null) {
            c24806ikl.setVisibility(0);
        }
        viewOnClickListenerC24771ikC.AhwBna();
    }

    public static final void OLrzqt(ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC, android.view.View view) {
        C24806ikl c24806ikl;
        C24796ikb c24796ikb;
        if (viewOnClickListenerC24771ikC.OLrzqt) {
            Function0<Unit> function0 = viewOnClickListenerC24771ikC.copydefault;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        C21512hCc c21512hCc = viewOnClickListenerC24771ikC.AEQbTJ;
        if (c21512hCc != null && (c24796ikb = c21512hCc.OLrzqt) != null) {
            c24796ikb.setVisibility(8);
        }
        C21512hCc c21512hCc2 = viewOnClickListenerC24771ikC.AEQbTJ;
        if (c21512hCc2 != null && (c24806ikl = c21512hCc2.AEQbTJ) != null) {
            c24806ikl.setVisibility(0);
        }
        viewOnClickListenerC24771ikC.valueOf();
        viewOnClickListenerC24771ikC.AhwBna();
    }

    public static final void OLrzqt(ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC, android.view.View view, boolean z) {
        C24806ikl c24806ikl;
        if (z) {
            Function0<Unit> function0 = viewOnClickListenerC24771ikC.EZpvd;
            if (function0 != null) {
                function0.invoke();
            }
            C21512hCc c21512hCc = viewOnClickListenerC24771ikC.AEQbTJ;
            if (c21512hCc == null || (c24806ikl = c21512hCc.AEQbTJ) == null) {
                return;
            }
            c24806ikl.setSelection(c24806ikl.length());
        }
    }

    public static final boolean EZpvd(ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        java.lang.Object objEZpvd = C6832aWn.EZpvd("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = objEZpvd instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) objEZpvd : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(textView.getWindowToken(), 0);
        }
        viewOnClickListenerC24771ikC.OLrzqt();
        return true;
    }

    public final void valueOf() {
        C24796ikb c24796ikb;
        C24806ikl c24806ikl;
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc == null || (c24796ikb = c21512hCc.OLrzqt) == null || c21512hCc == null || (c24806ikl = c21512hCc.AEQbTJ) == null) {
            return;
        }
        c24806ikl.setTextSize(0, c24796ikb.getTextSize());
    }

    public final void KWHzl(VerticalEditTextGroupData verticalEditTextGroupData) {
        java.lang.CharSequence text;
        int i;
        int iCopydefault;
        C55320xhi c55320xhiKWHzl;
        int iKWHzl;
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc != null) {
            if (verticalEditTextGroupData.getInputCanEdit() != null) {
                setEnableEdit(verticalEditTextGroupData.getInputCanEdit().booleanValue());
                if (verticalEditTextGroupData.getInputCanEdit().booleanValue()) {
                    iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
                } else {
                    iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe);
                }
                c21512hCc.AEQbTJ.setTextColor(iKWHzl);
                c21512hCc.OLrzqt.setTextColor(iKWHzl);
            }
            java.lang.String strConsumeData = verticalEditTextGroupData.getLabel().consumeData();
            if (strConsumeData != null) {
                c21512hCc.KWHzl.setText(strConsumeData);
            }
            java.lang.String strConsumeData2 = verticalEditTextGroupData.getSecondLabel().consumeData();
            if (strConsumeData2 != null) {
                c21512hCc.EZpvd.setTextValue(pTF.KWHzl.AEQbTJ(strConsumeData2));
                C55258xgZ c55258xgZ = c21512hCc.EZpvd;
                if (strConsumeData2.length() == 0) {
                    ViewGroup.LayoutParams layoutParams = c21512hCc.KWHzl.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.setMarginEnd(C55298xhM.dpInt$default(0.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                    }
                    c21512hCc.KWHzl.setLayoutParams(layoutParams2);
                    i = 8;
                } else {
                    c21512hCc.EZpvd.setHelperLabelType(1);
                    c21512hCc.EZpvd.setOnClickListener(this);
                    ViewGroup.LayoutParams layoutParams3 = c21512hCc.KWHzl.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.setMarginEnd(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                    }
                    c21512hCc.KWHzl.setLayoutParams(layoutParams4);
                    i = 0;
                }
                c55258xgZ.setVisibility(i);
                if (verticalEditTextGroupData.isLimit()) {
                    java.lang.String secondDataLabel = verticalEditTextGroupData.getSecondDataLabel();
                    if (secondDataLabel.length() > 0) {
                        if (C23313hvq.OLrzqt(secondDataLabel, "0.001")) {
                            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                            android.content.Context context = getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            iCopydefault = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
                        } else if (C23313hvq.EZpvd(secondDataLabel, "-0.1") && C23313hvq.valueOf(secondDataLabel, "0.001")) {
                            int i2 = C52761wXj.Activity.QwvEab;
                            android.content.Context context2 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "");
                            iCopydefault = C25382ivf.copydefault(i2, context2);
                        } else if (C23313hvq.KWHzl(secondDataLabel, "-0.1")) {
                            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                            android.content.Context context3 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "");
                            iCopydefault = C33512mxp.tradeFallDefault$default(c33512mxp2, context3, 0.0f, 2, null);
                        } else {
                            int i3 = C52761wXj.Activity.QwvEab;
                            android.content.Context context4 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "");
                            iCopydefault = C25382ivf.copydefault(i3, context4);
                        }
                        c21512hCc.EZpvd.setTextColor(iCopydefault);
                        C55312xha c55312xhaValueOf = c21512hCc.EZpvd.valueOf();
                        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
                            c55320xhiKWHzl.setUnderlineColor(iCopydefault);
                        }
                    }
                }
            }
            if (verticalEditTextGroupData.getResetFoucs()) {
                OLrzqt();
            }
            if (verticalEditTextGroupData.getSetInput()) {
                setTradeInputContent(verticalEditTextGroupData.getContent(), verticalEditTextGroupData.getResetFoucs(), verticalEditTextGroupData.isForBidden());
                verticalEditTextGroupData.setSetInput(false);
                verticalEditTextGroupData.setResetFoucs(false);
                verticalEditTextGroupData.setForBidden(false);
            }
            if (verticalEditTextGroupData.getStatus() == 0 || (text = c21512hCc.KWHzl.getText()) == null || text.length() == 0) {
                c21512hCc.gEmmrt.setVisibility(8);
            } else {
                c21512hCc.gEmmrt.setVisibility(0);
            }
            if (Intrinsics.EZpvd((java.lang.Object) verticalEditTextGroupData.getOriginPrice().getData(), (java.lang.Object) "0")) {
                android.widget.TextView textView = c21512hCc.KWHzl;
                int i4 = C52761wXj.Activity.HJWChPQdUnVm;
                android.content.Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                textView.setTextColor(C25382ivf.copydefault(i4, context5));
            } else {
                android.widget.TextView textView2 = c21512hCc.KWHzl;
                int i5 = C32113mPz.ActionBar.iwGUEr;
                android.content.Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                textView2.setTextColor(C25382ivf.copydefault(i5, context6));
            }
            c21512hCc.gEmmrt.setPaddingRelative(0, verticalEditTextGroupData.getVgLabelPaddingTop(), 0, 0);
        }
    }

    public final void setContentData(@NotNull VerticalEditTextGroupData verticalEditTextGroupData) {
        Intrinsics.checkNotNullParameter(verticalEditTextGroupData, "");
        this.KWHzl = verticalEditTextGroupData;
        KWHzl(verticalEditTextGroupData);
    }

    public final VerticalEditTextGroupData KWHzl() {
        VerticalEditTextGroupData verticalEditTextGroupData = this.KWHzl;
        verticalEditTextGroupData.setCheckData(this.AYXKKw);
        return verticalEditTextGroupData;
    }

    public final void setInputConfig(@NotNull Function1<? super C24806ikl, Unit> function1) {
        C24806ikl c24806ikl;
        Intrinsics.checkNotNullParameter(function1, "");
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc == null || (c24806ikl = c21512hCc.AEQbTJ) == null) {
            return;
        }
        function1.invoke(c24806ikl);
    }

    public final void OLrzqt(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24806ikl c24806ikl;
        Intrinsics.checkNotNullParameter(function2, "");
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc == null || (c24806ikl = c21512hCc.AEQbTJ) == null) {
            return;
        }
        c24806ikl.KWHzl(function2);
    }

    public final void KWHzl(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24806ikl c24806ikl;
        Intrinsics.checkNotNullParameter(function2, "");
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc == null || (c24806ikl = c21512hCc.AEQbTJ) == null) {
            return;
        }
        c24806ikl.AEQbTJ(function2);
    }

    public final void EZpvd(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24806ikl c24806ikl;
        Intrinsics.checkNotNullParameter(function2, "");
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc == null || (c24806ikl = c21512hCc.AEQbTJ) == null) {
            return;
        }
        c24806ikl.copydefault(function2);
    }

    public final void AEQbTJ(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24806ikl c24806ikl;
        Intrinsics.checkNotNullParameter(function2, "");
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc == null || (c24806ikl = c21512hCc.AEQbTJ) == null) {
            return;
        }
        c24806ikl.OLrzqt(function2);
    }

    public final void copydefault(@NotNull View.OnFocusChangeListener onFocusChangeListener) {
        C24806ikl c24806ikl;
        Intrinsics.checkNotNullParameter(onFocusChangeListener, "");
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc == null || (c24806ikl = c21512hCc.AEQbTJ) == null) {
            return;
        }
        c24806ikl.setOnFocusChangeListener(onFocusChangeListener);
    }

    public final void gEmmrt() {
        C24806ikl c24806ikl;
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc == null || (c24806ikl = c21512hCc.AEQbTJ) == null) {
            return;
        }
        c24806ikl.KWHzl();
    }

    public static /* synthetic */ void setTradeInputContent$default(ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        viewOnClickListenerC24771ikC.setTradeInputContent(str, z, z2);
    }

    public final void setTradeInputContent(java.lang.String str, boolean z, boolean z2) {
        C24796ikb c24796ikb;
        C24806ikl c24806ikl;
        C24806ikl c24806ikl2;
        C24796ikb c24796ikb2;
        C24796ikb c24796ikb3;
        C24806ikl c24806ikl3;
        C24806ikl c24806ikl4;
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc != null && (c24806ikl4 = c21512hCc.AEQbTJ) != null) {
            c24806ikl4.setForbiddenTextChangedListener(z2);
        }
        if (this.OLrzqt) {
            C21512hCc c21512hCc2 = this.AEQbTJ;
            if (c21512hCc2 != null && (c24796ikb = c21512hCc2.OLrzqt) != null) {
                c24796ikb.setText(str);
            }
        } else {
            C21512hCc c21512hCc3 = this.AEQbTJ;
            if (c21512hCc3 != null && (c24806ikl3 = c21512hCc3.AEQbTJ) != null) {
                c24806ikl3.setTradeInputContent(str);
            }
            C21512hCc c21512hCc4 = this.AEQbTJ;
            if (c21512hCc4 != null && (c24796ikb3 = c21512hCc4.OLrzqt) != null) {
                c24796ikb3.setText(str);
            }
            if (str != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "<", false, 2, (java.lang.Object) null)) {
                C21512hCc c21512hCc5 = this.AEQbTJ;
                if (c21512hCc5 != null && (c24796ikb2 = c21512hCc5.OLrzqt) != null) {
                    c24796ikb2.setVisibility(0);
                }
                C21512hCc c21512hCc6 = this.AEQbTJ;
                if (c21512hCc6 != null && (c24806ikl2 = c21512hCc6.AEQbTJ) != null) {
                    c24806ikl2.setVisibility(8);
                }
            }
        }
        C21512hCc c21512hCc7 = this.AEQbTJ;
        if (c21512hCc7 == null || (c24806ikl = c21512hCc7.AEQbTJ) == null) {
            return;
        }
        c24806ikl.setForbiddenTextChangedListener(false);
    }

    public final void setInputHintContent(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc != null) {
            java.lang.String showData$default = C23271hvA.getShowData$default(C23271hvA.copydefault, str, false, RoundingMode.UP, false, false, 26, null);
            if (z && C23313hvq.OLrzqt(str, 0)) {
                java.lang.String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.getPackageName, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", showData$default)));
                c21512hCc.OLrzqt.setHint(strKWHzl);
                c21512hCc.AEQbTJ.setHint(strKWHzl);
            } else {
                C24796ikb c24796ikb = c21512hCc.OLrzqt;
                RoundingMode roundingMode = RoundingMode.DOWN;
                c24796ikb.setHint(pTB.toLocalizationStringWithPrecision$default("0.0", 1, 0, roundingMode, null, 8, null));
                c21512hCc.AEQbTJ.setHint(pTB.toLocalizationStringWithPrecision$default("0.0", 1, 0, roundingMode, null, 8, null));
            }
        }
    }

    public static /* synthetic */ void setEnableEdit$default(ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        viewOnClickListenerC24771ikC.setEnableEdit(z);
    }

    public final void OLrzqt() {
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc != null) {
            c21512hCc.AEQbTJ.clearFocus();
            C24806ikl c24806ikl = c21512hCc.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C33054mpH.OLrzqt(context, c24806ikl);
            c21512hCc.AEQbTJ.setVisibility(8);
            c21512hCc.OLrzqt.setVisibility(0);
            pUU.KWHzl("WidgetVerticalEditTextGroup", "clearEditFocus()");
        }
    }

    public final void AhwBna() {
        final C24806ikl c24806ikl;
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc == null || (c24806ikl = c21512hCc.AEQbTJ) == null) {
            return;
        }
        c24806ikl.requestFocus();
        c24806ikl.post(new java.lang.Runnable() { // from class: o.ikG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC24771ikC.copydefault(this.EZpvd, c24806ikl);
            }
        });
        pUU.KWHzl("WidgetVerticalEditTextGroup", "requestSelfFocus()");
    }

    public static final void copydefault(ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC, C24806ikl c24806ikl) {
        java.lang.Object systemService = viewOnClickListenerC24771ikC.getContext().getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(c24806ikl, 1);
    }

    public final void setLabelSecondColor(int i) {
        C55258xgZ c55258xgZ;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        C55258xgZ c55258xgZ2;
        if (this.KWHzl.isLimit()) {
            return;
        }
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc != null && (c55258xgZ2 = c21512hCc.EZpvd) != null) {
            c55258xgZ2.setTextColor(i);
        }
        C21512hCc c21512hCc2 = this.AEQbTJ;
        if (c21512hCc2 == null || (c55258xgZ = c21512hCc2.EZpvd) == null || (c55312xhaValueOf = c55258xgZ.valueOf()) == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setUnderlineColor(i);
    }

    public final void copydefault() {
        C55258xgZ c55258xgZ;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        C55258xgZ c55258xgZ2;
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc != null && (c55258xgZ2 = c21512hCc.EZpvd) != null) {
            int i = C32113mPz.ActionBar.QVAiDq;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c55258xgZ2.setTextColor(C25382ivf.copydefault(i, context));
        }
        C21512hCc c21512hCc2 = this.AEQbTJ;
        if (c21512hCc2 == null || (c55258xgZ = c21512hCc2.EZpvd) == null || (c55312xhaValueOf = c55258xgZ.valueOf()) == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        int i2 = C32113mPz.ActionBar.QVAiDq;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c55320xhiKWHzl.setUnderlineColor(C25382ivf.copydefault(i2, context2));
    }

    public final void setAccessibilityIds(java.lang.String str, java.lang.String str2) {
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc != null) {
            c21512hCc.OLrzqt.setContentDescription(str);
            c21512hCc.AEQbTJ.setContentDescription(str2);
        }
    }

    public final C24806ikl AEQbTJ() {
        C21512hCc c21512hCc = this.AEQbTJ;
        if (c21512hCc != null) {
            return c21512hCc.AEQbTJ;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        Function0<Unit> function0 = this.djBIcL;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
