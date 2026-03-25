package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.invest_biz.ui.widget.LeftRightInputData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27302jsd extends ConstraintLayout {
    public View.OnClickListener AEQbTJ;
    public AbstractC23852iLs EZpvd;
    public LeftRightInputData KWHzl;
    public Function2<? super C27302jsd, ? super java.lang.Boolean, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeftRightInputData copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.AEQbTJ = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnFocusChangeCallback(@NotNull Function2<? super C27302jsd, ? super java.lang.Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27302jsd(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new LeftRightInputData(null, null, null, null, false, null, 63, null);
        AEQbTJ(context, (android.util.AttributeSet) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27302jsd(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.KWHzl = new LeftRightInputData(null, null, null, null, false, null, 63, null);
        AEQbTJ(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27302jsd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new LeftRightInputData(null, null, null, null, false, null, 63, null);
        AEQbTJ(context, attributeSet);
    }

    public final void AEQbTJ(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (context == null) {
            return;
        }
        AbstractC23852iLs abstractC23852iLs = (AbstractC23852iLs) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C25493ixk.Activity.zzQwtT, this, true);
        this.EZpvd = abstractC23852iLs;
        if (abstractC23852iLs != null) {
            TextViewCompat.setAutoSizeTextTypeWithDefaults(abstractC23852iLs.copydefault, 1);
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(abstractC23852iLs.copydefault, 8, 14, 1, 2);
        }
        OLrzqt(this.KWHzl);
        EZpvd();
    }

    private final void EZpvd() {
        C27343jtR c27343jtR;
        C27343jtR c27343jtR2;
        AbstractC23852iLs abstractC23852iLs = this.EZpvd;
        if (abstractC23852iLs != null) {
            abstractC23852iLs.EZpvd.EZpvd(new Function2() { // from class: o.jsh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C27302jsd.copydefault(this.EZpvd, (C55001xbh) obj, (java.lang.String) obj2);
                }
            });
        }
        super.setOnClickListener(new View.OnClickListener() { // from class: o.jse
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27302jsd.OLrzqt(this.copydefault, view);
            }
        });
        AbstractC23852iLs abstractC23852iLs2 = this.EZpvd;
        if (abstractC23852iLs2 != null && (c27343jtR2 = abstractC23852iLs2.EZpvd) != null) {
            c27343jtR2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.jsg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C27302jsd.AEQbTJ(this.EZpvd, view, z);
                }
            });
        }
        AbstractC23852iLs abstractC23852iLs3 = this.EZpvd;
        if (abstractC23852iLs3 == null || (c27343jtR = abstractC23852iLs3.EZpvd) == null) {
            return;
        }
        c27343jtR.setOnClickListener(new View.OnClickListener() { // from class: o.jsf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27302jsd.KWHzl(this.EZpvd, view);
            }
        });
    }

    public static final Unit copydefault(C27302jsd c27302jsd, C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        c27302jsd.KWHzl.setContent(str);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C27302jsd c27302jsd, android.view.View view) {
        c27302jsd.OLrzqt();
        View.OnClickListener onClickListener = c27302jsd.AEQbTJ;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static final void AEQbTJ(C27302jsd c27302jsd, android.view.View view, boolean z) {
        Function2<? super C27302jsd, ? super java.lang.Boolean, Unit> function2 = c27302jsd.OLrzqt;
        if (function2 != null) {
            function2.invoke(c27302jsd, java.lang.Boolean.valueOf(z));
        }
    }

    public static final void KWHzl(C27302jsd c27302jsd, android.view.View view) {
        c27302jsd.OLrzqt();
        View.OnClickListener onClickListener = c27302jsd.AEQbTJ;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public final void OLrzqt() {
        C27343jtR c27343jtR;
        AbstractC23852iLs abstractC23852iLs = this.EZpvd;
        if (abstractC23852iLs == null || (c27343jtR = abstractC23852iLs.EZpvd) == null) {
            return;
        }
        c27343jtR.requestFocus();
        android.text.Editable text = c27343jtR.getText();
        c27343jtR.setSelection(text != null ? text.length() : 0);
        java.lang.Object systemService = getContext().getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(c27343jtR, 0);
    }

    public final void OLrzqt(LeftRightInputData leftRightInputData) {
        AbstractC23852iLs abstractC23852iLs = this.EZpvd;
        if (abstractC23852iLs != null) {
            java.lang.String strConsumeData = leftRightInputData.getLable().consumeData();
            if (strConsumeData != null) {
                abstractC23852iLs.AEQbTJ.setText(strConsumeData);
            }
            java.lang.String strConsumeData2 = leftRightInputData.getHint().consumeData();
            if (strConsumeData2 != null) {
                abstractC23852iLs.EZpvd.setHint(strConsumeData2);
            }
            java.lang.String strConsumeData3 = leftRightInputData.getCustomHint().consumeData();
            if (strConsumeData3 != null) {
                abstractC23852iLs.copydefault.setText(strConsumeData3);
            }
            if (leftRightInputData.getSetInput()) {
                if (C33129mqd.valueOf(leftRightInputData.getContent(), 0)) {
                    setTradeInputContent("");
                } else {
                    setTradeInputContent(leftRightInputData.getContent());
                }
                leftRightInputData.setSetInput(false);
            }
        }
    }

    public final void setContentData(@NotNull LeftRightInputData leftRightInputData) {
        Intrinsics.checkNotNullParameter(leftRightInputData, "");
        this.KWHzl = leftRightInputData;
        OLrzqt(leftRightInputData);
    }

    public final void setInputFilters(@NotNull android.text.InputFilter[] inputFilterArr) {
        C27343jtR c27343jtR;
        Intrinsics.checkNotNullParameter(inputFilterArr, "");
        AbstractC23852iLs abstractC23852iLs = this.EZpvd;
        if (abstractC23852iLs == null || (c27343jtR = abstractC23852iLs.EZpvd) == null) {
            return;
        }
        c27343jtR.setFilters(inputFilterArr);
    }

    public final void setDelayTime(long j) {
        C27343jtR c27343jtR;
        AbstractC23852iLs abstractC23852iLs = this.EZpvd;
        if (abstractC23852iLs == null || (c27343jtR = abstractC23852iLs.EZpvd) == null) {
            return;
        }
        c27343jtR.setDelayTime(j);
    }

    public final void setTradeInputSkipCallback(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit>... function2Arr) {
        C27343jtR c27343jtR;
        Intrinsics.checkNotNullParameter(function2Arr, "");
        AbstractC23852iLs abstractC23852iLs = this.EZpvd;
        if (abstractC23852iLs == null || (c27343jtR = abstractC23852iLs.EZpvd) == null) {
            return;
        }
        c27343jtR.setTradeInputSkipCallback((Function2[]) java.util.Arrays.copyOf(function2Arr, function2Arr.length));
    }

    public final void EZpvd(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C27343jtR c27343jtR;
        Intrinsics.checkNotNullParameter(function2, "");
        AbstractC23852iLs abstractC23852iLs = this.EZpvd;
        if (abstractC23852iLs == null || (c27343jtR = abstractC23852iLs.EZpvd) == null) {
            return;
        }
        c27343jtR.EZpvd(function2);
    }

    public final void copydefault(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C27343jtR c27343jtR;
        Intrinsics.checkNotNullParameter(function2, "");
        AbstractC23852iLs abstractC23852iLs = this.EZpvd;
        if (abstractC23852iLs == null || (c27343jtR = abstractC23852iLs.EZpvd) == null) {
            return;
        }
        c27343jtR.KWHzl(function2);
    }

    public final void setTradeInputContent(java.lang.String str) {
        C27343jtR c27343jtR;
        AbstractC23852iLs abstractC23852iLs = this.EZpvd;
        if (abstractC23852iLs == null || (c27343jtR = abstractC23852iLs.EZpvd) == null) {
            return;
        }
        c27343jtR.setTradeInputContent(str);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (!z) {
            OLrzqt(0);
        } else {
            OLrzqt(8);
        }
    }

    public final void setHintColor(int i) {
        android.widget.TextView textView;
        AbstractC23852iLs abstractC23852iLs = this.EZpvd;
        if (abstractC23852iLs == null || (textView = abstractC23852iLs.copydefault) == null) {
            return;
        }
        textView.setTextColor(i);
    }

    public final void OLrzqt(int i) {
        android.widget.TextView textView;
        AbstractC23852iLs abstractC23852iLs = this.EZpvd;
        if (abstractC23852iLs == null || (textView = abstractC23852iLs.copydefault) == null) {
            return;
        }
        textView.setVisibility(i);
    }

    public final void KWHzl() {
        C27343jtR c27343jtR;
        AbstractC23852iLs abstractC23852iLs = this.EZpvd;
        if (abstractC23852iLs == null || (c27343jtR = abstractC23852iLs.EZpvd) == null) {
            return;
        }
        c27343jtR.clearFocus();
        C33570myu.AEQbTJ(c27343jtR.getContext(), (android.view.View) c27343jtR);
    }
}
