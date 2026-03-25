package o;

import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.immomo.mls.fun.constants.TextAlign;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class oIW extends C55008xbo {
    public final int EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public boolean OLrzqt;
    public java.lang.Integer copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oIW(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oIW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.spnCvw int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.oIW.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ oIW(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.spnCvw : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oIW(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.zuWLRA);
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.oIU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oIW.copydefault(context, this);
            }
        });
        android.view.View viewFindViewById = findViewById(C52761wXj.FragmentManager.fjfviF);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
                viewFindViewById.setLayoutParams(layoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(C52761wXj.FragmentManager.AxsJAY);
        if (relativeLayout != null) {
            android.widget.TextView textViewEZpvd = EZpvd();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.AxsJAYaxsJAY));
            layoutParams2.addRule(12);
            Unit unit = Unit.INSTANCE;
            relativeLayout.addView(textViewEZpvd, layoutParams2);
        }
        C55001xbh c55001xbhCopydefault = copydefault();
        if (c55001xbhCopydefault != null) {
            c55001xbhCopydefault.setGravity(8388659);
            c55001xbhCopydefault.setSingleLine(false);
            c55001xbhCopydefault.setAutoScale(false);
            c55001xbhCopydefault.addTextChangedListener(new ActionBar());
        }
        KWHzl();
    }

    private final android.widget.TextView EZpvd() {
        return (android.widget.TextView) this.KWHzl.getValue();
    }

    public static final android.widget.TextView copydefault(android.content.Context context, oIW oiw) {
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setId(android.view.View.generateViewId());
        textView.setTextAppearance(C52761wXj.LoaderManager.QOLQEE);
        textView.setTextColor(ContextCompat.getColor(context, C52761wXj.Activity.QwvEab));
        textView.setGravity(TextAlign.RIGHT);
        textView.setVisibility(oiw.OLrzqt ? 0 : 8);
        return textView;
    }

    public final C55001xbh copydefault() {
        return AkhnZx();
    }

    public final void setShowCount(boolean z) {
        this.OLrzqt = z;
        EZpvd().setVisibility(z ? 0 : 8);
        OLrzqt();
    }

    public final void setMaxLength(java.lang.Integer num) {
        android.text.InputFilter[] inputFilterArr;
        this.copydefault = num;
        C55001xbh c55001xbhCopydefault = copydefault();
        if (c55001xbhCopydefault != null) {
            if (num != null) {
                android.text.InputFilter[] filters = c55001xbhCopydefault.getFilters();
                Intrinsics.checkNotNullExpressionValue(filters, "");
                inputFilterArr = (android.text.InputFilter[]) yDT.EZpvd((InputFilter.LengthFilter[]) filters, new InputFilter.LengthFilter(num.intValue()));
            } else {
                android.text.InputFilter[] filters2 = c55001xbhCopydefault.getFilters();
                Intrinsics.checkNotNullExpressionValue(filters2, "");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (android.text.InputFilter inputFilter : filters2) {
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        arrayList.add(inputFilter);
                    }
                }
                inputFilterArr = (android.text.InputFilter[]) arrayList.toArray(new android.text.InputFilter[0]);
            }
            c55001xbhCopydefault.setFilters(inputFilterArr);
            OLrzqt();
        }
    }

    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            oIW.this.OLrzqt();
        }
    }

    public final void OLrzqt() {
        java.lang.String strValueOf;
        C55001xbh c55001xbhCopydefault = copydefault();
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(c55001xbhCopydefault != null ? c55001xbhCopydefault.getText() : null);
        int iCodePointCount = strGEmmrt.codePointCount(0, strGEmmrt.length());
        android.widget.TextView textViewEZpvd = EZpvd();
        java.lang.Integer num = this.copydefault;
        if (num != null) {
            strValueOf = iCodePointCount + "/" + num;
        } else {
            strValueOf = java.lang.String.valueOf(iCodePointCount);
        }
        textViewEZpvd.setText(strValueOf);
    }

    public final void KWHzl() {
        C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz != null) {
            ViewGroup.LayoutParams layoutParams = c55009xbpFIwbmz.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
                c55009xbpFIwbmz.setLayoutParams(layoutParams);
                int i = this.EZpvd;
                c55009xbpFIwbmz.setPadding(i, i, i, EZpvd().getVisibility() == 0 ? 0 : this.EZpvd);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C55001xbh c55001xbhCopydefault = copydefault();
        if (c55001xbhCopydefault != null) {
            c55001xbhCopydefault.setPadding(c55001xbhCopydefault.getPaddingLeft(), c55001xbhCopydefault.getPaddingTop(), c55001xbhCopydefault.getPaddingRight(), EZpvd().getVisibility() == 0 ? EZpvd().getHeight() : 0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            KWHzl();
        }
    }

    @Override // o.C55008xbo
    public void setSizeType(int i) {
        super.setSizeType(i);
        C55001xbh c55001xbhCopydefault = copydefault();
        if (c55001xbhCopydefault != null) {
            TextViewCompat.setTextAppearance(c55001xbhCopydefault, C52761wXj.LoaderManager.valueOf);
            TextViewCompat.setLineHeight(c55001xbhCopydefault, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.accept));
        }
        KWHzl();
    }
}
