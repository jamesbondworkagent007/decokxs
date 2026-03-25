package com.okinc.cruilib.view.detailinfo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31851mGg;
import o.C52761wXj;
import o.C55296xhK;
import o.C55298xhM;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class DetailRow extends ConstraintLayout {
    public boolean EZpvd;
    public final C31851mGg KWHzl;
    public DetailDescriptionType copydefault;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DetailDescriptionType.values().length];
            try {
                iArr[DetailDescriptionType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DetailDescriptionType.CHIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[DetailWidthType.values().length];
            try {
                iArr2[DetailWidthType.WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DetailWidthType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DetailRow(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DetailRow(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.LoaderManager.iRxXKY int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:43) call: com.okinc.cruilib.view.detailinfo.DetailRow.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ DetailRow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.LoaderManager.iRxXKY : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRow(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C31851mGg c31851mGgEZpvd = C31851mGg.EZpvd(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c31851mGgEZpvd, "");
        this.KWHzl = c31851mGgEZpvd;
        this.copydefault = DetailDescriptionType.TEXT;
    }

    public static /* synthetic */ void initialize$default(DetailRow detailRow, DetailDescriptionType detailDescriptionType, DetailWidthType detailWidthType, int i, Object obj) {
        if ((i & 2) != 0) {
            detailWidthType = DetailWidthType.FULL;
        }
        detailRow.AEQbTJ(detailDescriptionType, detailWidthType);
    }

    public final void AEQbTJ(@NotNull DetailDescriptionType detailDescriptionType, @NotNull DetailWidthType detailWidthType) {
        Intrinsics.checkNotNullParameter(detailDescriptionType, "");
        Intrinsics.checkNotNullParameter(detailWidthType, "");
        try {
            this.copydefault = detailDescriptionType;
            C31851mGg c31851mGg = this.KWHzl;
            int i = TaskDescription.AEQbTJ[detailDescriptionType.ordinal()];
            if (i == 1) {
                c31851mGg.OLrzqt.setVisibility(0);
                c31851mGg.AEQbTJ.setVisibility(8);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c31851mGg.AEQbTJ.setOKDSSize(-4);
                c31851mGg.AEQbTJ.setOKDSStyle(15);
                c31851mGg.AEQbTJ.setTextColor(getContext().getColor(C52761wXj.Activity.v));
                c31851mGg.AEQbTJ.setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(C52761wXj.Activity.fDu)));
                c31851mGg.OLrzqt.setVisibility(8);
                c31851mGg.AEQbTJ.setVisibility(0);
            }
            int i2 = TaskDescription.KWHzl[detailWidthType.ordinal()];
            if (i2 == 1) {
                ConstraintLayout root = c31851mGg.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
                    root.setLayoutParams(layoutParams2);
                    TextView textView = c31851mGg.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                    if (layoutParams3 != null) {
                        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                        ((ViewGroup.MarginLayoutParams) layoutParams4).width = -2;
                        textView.setLayoutParams(layoutParams4);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ConstraintLayout root2 = c31851mGg.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "");
                ViewGroup.LayoutParams layoutParams5 = root2.getLayoutParams();
                if (layoutParams5 != null) {
                    ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                    ((ViewGroup.MarginLayoutParams) layoutParams6).width = -1;
                    root2.setLayoutParams(layoutParams6);
                    TextView textView2 = c31851mGg.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    ViewGroup.LayoutParams layoutParams7 = textView2.getLayoutParams();
                    if (layoutParams7 != null) {
                        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
                        ((ViewGroup.MarginLayoutParams) layoutParams8).width = 0;
                        textView2.setLayoutParams(layoutParams8);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            this.EZpvd = true;
        } catch (Exception e) {
            pUU.KWHzl(e);
            this.EZpvd = false;
        }
    }

    public final void setTitle(Spannable spannable) {
        if (this.EZpvd) {
            try {
                this.KWHzl.AYXKKw.setText(spannable);
            } catch (Exception e) {
                pUU.KWHzl(e);
            }
        }
    }

    public final void setDescription(Spannable spannable) {
        if (this.EZpvd) {
            try {
                this.KWHzl.OLrzqt.setText(spannable);
                this.KWHzl.AEQbTJ.setText(spannable);
            } catch (Exception e) {
                pUU.KWHzl(e);
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ Function0 OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, Function0 function0) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, Function0 function0) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.invoke();
            }
        }
    }

    public final void setSubtext(Spannable spannable) {
        if (this.EZpvd) {
            try {
                this.KWHzl.KWHzl.setText(spannable);
            } catch (Exception e) {
                pUU.KWHzl(e);
            }
        }
    }

    public final void setSubtextVisibility(boolean z) {
        if (this.EZpvd) {
            try {
                TextView textView = this.KWHzl.KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(z ? 0 : 8);
            } catch (Exception e) {
                pUU.KWHzl(e);
            }
        }
    }

    public final void setTitleClickListener(Function0<Unit> function0) {
        if (this.EZpvd && function0 != null) {
            try {
                TextView textView = this.KWHzl.AYXKKw;
                textView.setOnClickListener(new Application(textView, 1000L, function0));
            } catch (Exception e) {
                pUU.KWHzl(e);
            }
        }
    }

    public final void setDescriptionClickListener(Function0<Unit> function0) {
        if (this.EZpvd && function0 != null) {
            try {
                TextView textView = this.KWHzl.OLrzqt;
                textView.setOnClickListener(new Activity(textView, 1000L, function0));
            } catch (Exception e) {
                pUU.KWHzl(e);
            }
        }
    }

    public final void setSubtextClickListener(Function0<Unit> function0) {
        if (this.EZpvd && function0 != null) {
            try {
                TextView textView = this.KWHzl.KWHzl;
                textView.setOnClickListener(new StateListAnimator(textView, 1000L, function0));
            } catch (Exception e) {
                pUU.KWHzl(e);
            }
        }
    }

    public static /* synthetic */ void setColor$default(DetailRow detailRow, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        detailRow.setColor(num, num2, num3, num4);
    }

    public final void setColor(@ColorInt Integer num, @ColorInt Integer num2, @ColorInt Integer num3, @ColorInt Integer num4) {
        if (this.EZpvd) {
            try {
                C31851mGg c31851mGg = this.KWHzl;
                if (num != null) {
                    c31851mGg.AYXKKw.setTextColor(num.intValue());
                }
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    c31851mGg.OLrzqt.setTextColor(iIntValue);
                    c31851mGg.AEQbTJ.setTextColor(iIntValue);
                }
                if (num3 != null) {
                    c31851mGg.KWHzl.setTextColor(num3.intValue());
                }
                if (num4 != null) {
                    c31851mGg.AEQbTJ.setBackgroundTintList(ColorStateList.valueOf(num4.intValue()));
                }
            } catch (Exception e) {
                pUU.KWHzl(e);
            }
        }
    }

    public static /* synthetic */ void setStyle$default(DetailRow detailRow, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        detailRow.setStyle(num, num2, num3);
    }

    public final void setStyle(@StyleRes Integer num, @StyleRes Integer num2, @StyleRes Integer num3) {
        if (this.EZpvd) {
            try {
                C31851mGg c31851mGg = this.KWHzl;
                if (num != null) {
                    c31851mGg.AYXKKw.setTextAppearance(num.intValue());
                }
                if (num2 != null) {
                    c31851mGg.OLrzqt.setTextAppearance(num2.intValue());
                }
                if (num3 != null) {
                    c31851mGg.KWHzl.setTextAppearance(num3.intValue());
                }
            } catch (Exception e) {
                pUU.KWHzl(e);
            }
        }
    }

    public final void setChipType(Integer num) {
        if (this.EZpvd && num != null) {
            try {
                this.KWHzl.AEQbTJ.setTagType(num.intValue());
            } catch (Exception e) {
                pUU.KWHzl(e);
            }
        }
    }

    public final void setTopMargin(int i) {
        if (!this.EZpvd || i < 0) {
            return;
        }
        try {
            TextView textView = this.KWHzl.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                marginLayoutParams.topMargin = C55298xhM.OLrzqt(i, context);
                textView.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        } catch (Exception e) {
            pUU.KWHzl(e);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DetailDescriptionType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DetailDescriptionType[] $VALUES;
        public static final DetailDescriptionType TEXT = new DetailDescriptionType("TEXT", 0);
        public static final DetailDescriptionType CHIP = new DetailDescriptionType("CHIP", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DetailDescriptionType[] $values() {
            return new DetailDescriptionType[]{TEXT, CHIP};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DetailDescriptionType> getEntries() {
            return $ENTRIES;
        }

        private DetailDescriptionType(String str, int i) {
        }

        static {
            DetailDescriptionType[] detailDescriptionTypeArr$values = $values();
            $VALUES = detailDescriptionTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(detailDescriptionTypeArr$values);
        }

        public static DetailDescriptionType valueOf(String str) {
            return (DetailDescriptionType) Enum.valueOf(DetailDescriptionType.class, str);
        }

        public static DetailDescriptionType[] values() {
            return (DetailDescriptionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DetailWidthType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DetailWidthType[] $VALUES;
        public static final DetailWidthType WRAP = new DetailWidthType("WRAP", 0);
        public static final DetailWidthType FULL = new DetailWidthType("FULL", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DetailWidthType[] $values() {
            return new DetailWidthType[]{WRAP, FULL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DetailWidthType> getEntries() {
            return $ENTRIES;
        }

        private DetailWidthType(String str, int i) {
        }

        static {
            DetailWidthType[] detailWidthTypeArr$values = $values();
            $VALUES = detailWidthTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(detailWidthTypeArr$values);
        }

        public static DetailWidthType valueOf(String str) {
            return (DetailWidthType) Enum.valueOf(DetailWidthType.class, str);
        }

        public static DetailWidthType[] values() {
            return (DetailWidthType[]) $VALUES.clone();
        }
    }

    public final void setTitle(String str) {
        SpannableString spannableStringValueOf;
        if (str != null) {
            spannableStringValueOf = SpannableString.valueOf(str);
            Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        } else {
            spannableStringValueOf = null;
        }
        setTitle(spannableStringValueOf);
    }

    public final void setDescription(String str) {
        SpannableString spannableStringValueOf;
        if (str != null) {
            spannableStringValueOf = SpannableString.valueOf(str);
            Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        } else {
            spannableStringValueOf = null;
        }
        setDescription(spannableStringValueOf);
    }

    public final void setSubtext(String str) {
        SpannableString spannableStringValueOf;
        if (str != null) {
            spannableStringValueOf = SpannableString.valueOf(str);
            Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        } else {
            spannableStringValueOf = null;
        }
        setSubtext(spannableStringValueOf);
    }
}
