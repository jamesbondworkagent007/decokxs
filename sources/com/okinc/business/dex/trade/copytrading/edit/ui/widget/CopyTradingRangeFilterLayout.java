package com.okinc.business.dex.trade.copytrading.edit.ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import o.AbstractC56415yEn;
import o.C23274hvD;
import o.C23313hvq;
import o.C23526hzr;
import o.C52761wXj;
import o.C55001xbh;
import o.C55008xbo;
import o.C55009xbp;
import o.C55296xhK;
import o.C55298xhM;
import o.C56403yEb;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class CopyTradingRangeFilterLayout extends ConstraintLayout {
    public final C23526hzr AEQbTJ;
    public Function1<? super CopyTradingRangeFilterLayout, Unit> EZpvd;
    public RangeFilterUnit KWHzl;
    public RangeFilterUnit OLrzqt;
    public boolean copydefault;
    public final Application djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CopyTradingRangeFilterLayout(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RangeFilterUnit AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RangeFilterUnit OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnInputChangeListener(Function1<? super CopyTradingRangeFilterLayout, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:28) call: com.okinc.business.dex.trade.copytrading.edit.ui.widget.CopyTradingRangeFilterLayout.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ CopyTradingRangeFilterLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingRangeFilterLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C23526hzr c23526hzrEZpvd = C23526hzr.EZpvd(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c23526hzrEZpvd, "");
        this.AEQbTJ = c23526hzrEZpvd;
        this.djBIcL = new Application();
        TextView textView = c23526hzrEZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        int[] iArr = C23274hvD.LoaderManager.values;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.copydefault = typedArrayObtainStyledAttributes.getBoolean(C23274hvD.LoaderManager.AuCTel, false);
        C55008xbo c55008xbo = c23526hzrEZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        setUnitIconVisible(c55008xbo, this.copydefault);
        C55008xbo c55008xbo2 = c23526hzrEZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        setUnitIconVisible(c55008xbo2, this.copydefault);
        typedArrayObtainStyledAttributes.recycle();
        C55001xbh c55001xbhAkhnZx = c23526hzrEZpvd.copydefault.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            KWHzl(c55001xbhAkhnZx);
        }
        C55001xbh c55001xbhAkhnZx2 = c23526hzrEZpvd.KWHzl.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            KWHzl(c55001xbhAkhnZx2);
        }
    }

    public static final class Application implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Function1 function1 = CopyTradingRangeFilterLayout.this.EZpvd;
            if (function1 != null) {
                function1.invoke(CopyTradingRangeFilterLayout.this);
            }
        }
    }

    public final InputStatus EZpvd() {
        Editable text;
        C55001xbh c55001xbhAkhnZx = this.AEQbTJ.copydefault.AkhnZx();
        if (c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null || text.length() != 0) {
            String strKWHzl = KWHzl();
            RangeFilterUnit rangeFilterUnit = this.KWHzl;
            String strMulCheckS$default = C23313hvq.mulCheckS$default(strKWHzl, Long.valueOf(rangeFilterUnit != null ? rangeFilterUnit.getScale() : 1L), null, null, null, 14, null);
            String strCopydefault = copydefault();
            RangeFilterUnit rangeFilterUnit2 = this.OLrzqt;
            if (!C23313hvq.OLrzqt(strMulCheckS$default, C23313hvq.mulCheckS$default(strCopydefault, Long.valueOf(rangeFilterUnit2 != null ? rangeFilterUnit2.getScale() : 1L), null, null, null, 14, null))) {
                return InputStatus.MinGteMax;
            }
        }
        return InputStatus.Normal;
    }

    public final void setMinUnit(RangeFilterUnit rangeFilterUnit) {
        String text;
        this.OLrzqt = rangeFilterUnit;
        C55008xbo c55008xbo = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        TextView textViewKWHzl = KWHzl(c55008xbo);
        if (rangeFilterUnit != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            text = rangeFilterUnit.getText(context);
        } else {
            text = null;
        }
        textViewKWHzl.setText(text);
        Function1<? super CopyTradingRangeFilterLayout, Unit> function1 = this.EZpvd;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    public final void setMaxUnit(RangeFilterUnit rangeFilterUnit) {
        String text;
        this.KWHzl = rangeFilterUnit;
        C55008xbo c55008xbo = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        TextView textViewKWHzl = KWHzl(c55008xbo);
        if (rangeFilterUnit != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            text = rangeFilterUnit.getText(context);
        } else {
            text = null;
        }
        textViewKWHzl.setText(text);
        Function1<? super CopyTradingRangeFilterLayout, Unit> function1 = this.EZpvd;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    public final String copydefault() {
        C55001xbh c55001xbhAkhnZx = this.AEQbTJ.KWHzl.AkhnZx();
        String strIsConnected = c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null;
        return strIsConnected == null ? "" : strIsConnected;
    }

    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55001xbh c55001xbhAkhnZx = this.AEQbTJ.KWHzl.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setPlainNumericText(str);
        }
    }

    public final String KWHzl() {
        C55001xbh c55001xbhAkhnZx = this.AEQbTJ.copydefault.AkhnZx();
        String strIsConnected = c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null;
        return strIsConnected == null ? "" : strIsConnected;
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55001xbh c55001xbhAkhnZx = this.AEQbTJ.copydefault.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setPlainNumericText(str);
        }
    }

    public final void setTitle(String str) {
        this.AEQbTJ.OLrzqt.setText(str);
    }

    private final void AEQbTJ(CharSequence charSequence) {
        this.AEQbTJ.AEQbTJ.setText(charSequence);
        TextView textView = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setOnMinUnitClickListener(View.OnClickListener onClickListener) {
        C55008xbo c55008xbo = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        setUnitClickListener(c55008xbo, onClickListener);
    }

    public final void setOnMaxUnitClickListener(View.OnClickListener onClickListener) {
        C55008xbo c55008xbo = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        setUnitClickListener(c55008xbo, onClickListener);
    }

    private final TextView KWHzl(C55008xbo c55008xbo) {
        LinearLayout linearLayoutAuCTel = c55008xbo.AuCTel();
        View childAt = linearLayoutAuCTel != null ? linearLayoutAuCTel.getChildAt(1) : null;
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView != null) {
            return textView;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(c55008xbo.getContext());
        ColorStateList colorStateList = ContextCompat.getColorStateList(appCompatTextView.getContext(), C52761wXj.Activity.fdOvFl);
        appCompatTextView.setTextColor(colorStateList);
        TextViewCompat.setTextAppearance(appCompatTextView, C52761wXj.LoaderManager.KWHzl);
        appCompatTextView.setGravity(16);
        appCompatTextView.setCompoundDrawablePadding(appCompatTextView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.dxcTrN));
        TextViewCompat.setCompoundDrawableTintList(appCompatTextView, colorStateList);
        C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.EZpvd(appCompatTextView);
        }
        if (linearLayoutAuCTel != null) {
            linearLayoutAuCTel.setMinimumWidth(0);
        }
        return appCompatTextView;
    }

    public final void setUnitIconVisible(C55008xbo c55008xbo, boolean z) {
        Drawable drawable;
        if (!z || (drawable = ContextCompat.getDrawable(c55008xbo.getContext(), C52761wXj.TaskDescription.OJuSTm)) == null) {
            drawable = null;
        } else {
            Context context = c55008xbo.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(12, context);
            Context context2 = c55008xbo.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(12, context2));
        }
        TextViewCompat.setCompoundDrawablesRelative(KWHzl(c55008xbo), null, null, drawable, null);
    }

    public final void setUnitClickListener(C55008xbo c55008xbo, View.OnClickListener onClickListener) {
        if (this.copydefault && onClickListener != null) {
            C55296xhK.singleClick$default(KWHzl(c55008xbo), onClickListener, 0L, 2, (Object) null);
        } else {
            KWHzl(c55008xbo).setOnClickListener(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AEQbTJ(C55008xbo c55008xbo) {
        int i;
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            i = !c55001xbhAkhnZx.isFocused() ? 0 : 1;
        }
        c55008xbo.setState(i);
    }

    public final void KWHzl(C55001xbh c55001xbh) {
        c55001xbh.setInputType(2);
        c55001xbh.setShowThousandsSeparator(true);
        c55001xbh.EZpvd(0);
        IntRange intRange = new IntRange(0, 9);
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((AbstractC56415yEn) it).nextInt()));
        }
        c55001xbh.setLegalCharacters(CollectionsKt___CollectionsKt.OqFWZa(arrayList));
        c55001xbh.addTextChangedListener(this.djBIcL);
    }

    public final void setMinErrorText(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() == 0) {
            C55008xbo c55008xbo = this.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            AEQbTJ(c55008xbo);
            this.AEQbTJ.KWHzl.values();
            return;
        }
        this.AEQbTJ.KWHzl.setErrorText(charSequence);
        this.AEQbTJ.KWHzl.setState(2);
    }

    public final void setMaxErrorText(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() == 0) {
            this.AEQbTJ.copydefault.values();
            C55008xbo c55008xbo = this.AEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            AEQbTJ(c55008xbo);
            return;
        }
        this.AEQbTJ.copydefault.setErrorText(charSequence);
        this.AEQbTJ.copydefault.setState(2);
    }

    public final void setErrorText(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        AEQbTJ(charSequence);
        this.AEQbTJ.KWHzl.values();
        this.AEQbTJ.copydefault.values();
        if (charSequence.length() == 0) {
            C55008xbo c55008xbo = this.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            AEQbTJ(c55008xbo);
            C55008xbo c55008xbo2 = this.AEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            AEQbTJ(c55008xbo2);
            return;
        }
        this.AEQbTJ.KWHzl.setErrorShowing(true);
        this.AEQbTJ.copydefault.setErrorShowing(true);
        this.AEQbTJ.KWHzl.setState(2);
        this.AEQbTJ.copydefault.setState(2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InputStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ InputStatus[] $VALUES;
        public static final InputStatus Normal = new InputStatus("Normal", 0);
        public static final InputStatus MinIsZero = new InputStatus("MinIsZero", 1);
        public static final InputStatus MaxIsZero = new InputStatus("MaxIsZero", 2);
        public static final InputStatus MinAndMaxIsZero = new InputStatus("MinAndMaxIsZero", 3);
        public static final InputStatus MinGteMax = new InputStatus("MinGteMax", 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ InputStatus[] $values() {
            return new InputStatus[]{Normal, MinIsZero, MaxIsZero, MinAndMaxIsZero, MinGteMax};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<InputStatus> getEntries() {
            return $ENTRIES;
        }

        private InputStatus(String str, int i) {
        }

        static {
            InputStatus[] inputStatusArr$values = $values();
            $VALUES = inputStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(inputStatusArr$values);
        }

        public static InputStatus valueOf(String str) {
            return (InputStatus) Enum.valueOf(InputStatus.class, str);
        }

        public static InputStatus[] values() {
            return (InputStatus[]) $VALUES.clone();
        }
    }
}
