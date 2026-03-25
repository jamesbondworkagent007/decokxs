package o;

import android.view.View;
import android.view.ViewGroup;
import com.okinc.core.widget.SortTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C42962rgM;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C42951rgB extends android.widget.LinearLayout {
    public SortTextView.SortType AEQbTJ;
    public float AYXKKw;
    public final SortTextView AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String DbNXlk;
    public Function2<? super java.lang.Integer, ? super SortTextView.SortType, Unit> EZpvd;
    public boolean KWHzl;
    public java.lang.Boolean[] OLrzqt;
    public boolean copydefault;
    public SortTextView djBIcL;
    public yHT<? super java.lang.Integer, ? super SortTextView.SortType, ? super java.lang.Integer, ? super java.lang.Integer, Unit> ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final SortTextView[] fIwbmz;
    public final SortTextView fetchVPNInfo;
    public final SortTextView gEmmrt;
    public final java.lang.String isConnected;
    public final SortTextView valueOf;
    public final java.lang.String values;

    /* JADX INFO: renamed from: o.rgB$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SortTextView.SortType.values().length];
            try {
                iArr[SortTextView.SortType.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SortTextView.SortType.UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SortTextView.SortType.DOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42951rgB(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42951rgB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortTextView OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisableVolumeSorter$OKMarket_market_impl(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReversSortByName$OKMarket_market_impl(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolumeSortChange(@NotNull yHT<? super java.lang.Integer, ? super SortTextView.SortType, ? super java.lang.Integer, ? super java.lang.Integer, Unit> yht) {
        Intrinsics.checkNotNullParameter(yht, "");
        this.ejfBZ = yht;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.rgB.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42951rgB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42951rgB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.rgx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42951rgB.djBIcL(this.OLrzqt);
            }
        });
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qZH.Fragment.fARcdN, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setMiddleMarginEnd(typedArrayObtainStyledAttributes.getDimension(qZH.Fragment.iwGUEr, 0.0f));
        typedArrayObtainStyledAttributes.recycle();
        android.view.LayoutInflater.from(context).inflate(qZH.ActionBar.FQMcgEfQMcgE, this);
        if (!isInEditMode()) {
            setVisibility(8);
        }
        this.AEQbTJ = SortTextView.SortType.NONE;
        this.values = C33070mpX.AYXKKw(qZH.PendingIntent.zLjUOn);
        this.AkhnZx = C33070mpX.AYXKKw(qZH.PendingIntent.zLjUOn);
        this.isConnected = C33070mpX.AYXKKw(qZH.PendingIntent.gdmIOq);
        this.DbNXlk = C33070mpX.AYXKKw(qZH.PendingIntent.ihnvzI);
        SortTextView sortTextView = (SortTextView) findViewById(qZH.StateListAnimator.uLLnq);
        this.valueOf = sortTextView;
        SortTextView sortTextView2 = (SortTextView) findViewById(qZH.StateListAnimator.OAUGar);
        this.gEmmrt = sortTextView2;
        SortTextView sortTextView3 = (SortTextView) findViewById(qZH.StateListAnimator.QYNZmZ);
        this.AhwBna = sortTextView3;
        SortTextView sortTextView4 = (SortTextView) findViewById(qZH.StateListAnimator.OeawrH);
        this.fetchVPNInfo = sortTextView4;
        this.fIwbmz = new SortTextView[]{sortTextView, sortTextView3, sortTextView4, sortTextView2};
    }

    private final C42962rgM AhwBna() {
        return (C42962rgM) this.fARcdN.getValue();
    }

    public static final C42962rgM djBIcL(C42951rgB c42951rgB) {
        return c42951rgB.EZpvd();
    }

    public final void setMiddleMarginEnd(float f) {
        if (f == this.AYXKKw) {
            return;
        }
        this.AYXKKw = f;
        djBIcL();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ() {
        this.valueOf.setText(this.values);
        this.gEmmrt.setText(this.AkhnZx);
        this.AhwBna.setText(this.isConnected);
        this.fetchVPNInfo.setText(this.DbNXlk);
        java.lang.Boolean[] boolArr = this.OLrzqt;
        if (boolArr != null && boolArr.length > 3) {
            this.gEmmrt.setVisibility(0);
        }
        SortTextView[] sortTextViewArr = this.fIwbmz;
        int length = sortTextViewArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            SortTextView sortTextView = sortTextViewArr[i];
            java.lang.Boolean[] boolArr2 = this.OLrzqt;
            if (boolArr2 != null) {
                Intrinsics.copydefault(boolArr2);
                if (boolArr2.length > i2) {
                    java.lang.Boolean[] boolArr3 = this.OLrzqt;
                    Intrinsics.copydefault(boolArr3);
                    if (boolArr3[i2].booleanValue()) {
                        sortTextView.setSortType(sortTextView == this.djBIcL ? this.AEQbTJ : SortTextView.SortType.NONE, false);
                        Intrinsics.copydefault(sortTextView);
                        setListener(i2, sortTextView);
                    } else {
                        sortTextView.setDisableSort();
                        sortTextView.setOnClickListener(null);
                    }
                }
            }
            i++;
            i2++;
        }
        djBIcL();
        if (this.copydefault) {
            SortTextView sortTextView2 = this.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(sortTextView2, "");
            ViewGroup.LayoutParams layoutParams = sortTextView2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                marginLayoutParams.setMarginStart((int) C55298xhM.AEQbTJ(8, context));
                sortTextView2.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void djBIcL() {
        SortTextView sortTextView;
        if (this.AYXKKw <= 0.0f || (sortTextView = this.AhwBna) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = sortTextView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd((int) this.AYXKKw);
            this.AhwBna.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setListener(final int i, SortTextView sortTextView) {
        if (Intrinsics.EZpvd(sortTextView, this.gEmmrt) && !this.copydefault) {
            sortTextView.setOnClickListener(new View.OnClickListener() { // from class: o.rgz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.EZpvd.valueOf();
                }
            });
        } else {
            sortTextView.setOnClickListener(new View.OnClickListener() { // from class: o.rgE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C42951rgB.setListener$lambda$8(this.OLrzqt, i, view);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void setListener$lambda$8(C42951rgB c42951rgB, int i, android.view.View view) {
        SortTextView.SortType sortTypeAEQbTJ;
        if (c42951rgB.djBIcL == view) {
            if (c42951rgB.KWHzl && i == 0) {
                sortTypeAEQbTJ = c42951rgB.EZpvd(c42951rgB.AEQbTJ);
            } else {
                sortTypeAEQbTJ = c42951rgB.AEQbTJ(c42951rgB.AEQbTJ);
            }
        } else {
            SortTextView[] sortTextViewArr = c42951rgB.fIwbmz;
            int length = sortTextViewArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                SortTextView sortTextView = sortTextViewArr[i2];
                if (!Intrinsics.EZpvd(sortTextView, view)) {
                    java.lang.Boolean[] boolArr = c42951rgB.OLrzqt;
                    if (boolArr != null) {
                        Intrinsics.copydefault(boolArr);
                        if (boolArr.length > i3) {
                            java.lang.Boolean[] boolArr2 = c42951rgB.OLrzqt;
                            Intrinsics.copydefault(boolArr2);
                            if (boolArr2[i3].booleanValue()) {
                                sortTextView.setSortType(SortTextView.SortType.NONE, false);
                            } else {
                                sortTextView.setDisableSort();
                            }
                        }
                    }
                }
                i2++;
                i3++;
            }
            if (c42951rgB.KWHzl && i == 0) {
                sortTypeAEQbTJ = SortTextView.SortType.DOWN;
            } else {
                sortTypeAEQbTJ = SortTextView.SortType.UP;
            }
        }
        Intrinsics.copydefault(view, "");
        SortTextView sortTextView2 = (SortTextView) view;
        sortTextView2.setSortType(sortTypeAEQbTJ, true);
        Function2<? super java.lang.Integer, ? super SortTextView.SortType, Unit> function2 = c42951rgB.EZpvd;
        if (function2 != null) {
            function2.invoke(java.lang.Integer.valueOf(i), sortTypeAEQbTJ);
        }
        c42951rgB.AEQbTJ = sortTypeAEQbTJ;
        c42951rgB.djBIcL = sortTextView2;
    }

    public java.lang.String KWHzl() {
        return " / " + C33070mpX.AYXKKw(qZH.PendingIntent.AuCTelauCTel);
    }

    public java.lang.String copydefault() {
        return " / " + C33070mpX.AYXKKw(qZH.PendingIntent.AubY);
    }

    /* JADX INFO: renamed from: o.rgB$StateListAnimator */
    public static final class StateListAnimator implements C42962rgM.StateListAnimator {
        public StateListAnimator() {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
        @Override // o.C42962rgM.StateListAnimator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void copydefault(int i, int i2) {
            C42951rgB c42951rgB = C42951rgB.this;
            c42951rgB.djBIcL = c42951rgB.OLrzqt();
            if (i == 1) {
                C42951rgB.this.OLrzqt().setText(C42951rgB.this.KWHzl());
            } else {
                C42951rgB.this.OLrzqt().setText(C42951rgB.this.copydefault());
            }
            if (i2 == 0) {
                C42951rgB c42951rgB2 = C42951rgB.this;
                SortTextView.SortType sortType = SortTextView.SortType.NONE;
                c42951rgB2.AEQbTJ = sortType;
                C42951rgB.this.OLrzqt().setSortType(sortType, true);
            } else if (i2 == 2) {
                C42951rgB c42951rgB3 = C42951rgB.this;
                SortTextView.SortType sortType2 = SortTextView.SortType.DOWN;
                c42951rgB3.AEQbTJ = sortType2;
                C42951rgB.this.OLrzqt().setSortType(sortType2, true);
            } else {
                C42951rgB c42951rgB4 = C42951rgB.this;
                SortTextView.SortType sortType3 = SortTextView.SortType.UP;
                c42951rgB4.AEQbTJ = sortType3;
                C42951rgB.this.OLrzqt().setSortType(sortType3, true);
            }
            yHT yht = C42951rgB.this.ejfBZ;
            if (yht != null) {
                yht.invoke(3, C42951rgB.this.AEQbTJ, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
            }
            SortTextView[] sortTextViewArr = C42951rgB.this.fIwbmz;
            C42951rgB c42951rgB5 = C42951rgB.this;
            int length = sortTextViewArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                SortTextView sortTextView = sortTextViewArr[i3];
                if (!Intrinsics.EZpvd(sortTextView, c42951rgB5.OLrzqt())) {
                    if (c42951rgB5.OLrzqt != null) {
                        java.lang.Boolean[] boolArr = c42951rgB5.OLrzqt;
                        Intrinsics.copydefault(boolArr);
                        if (boolArr.length > i4) {
                            java.lang.Boolean[] boolArr2 = c42951rgB5.OLrzqt;
                            Intrinsics.copydefault(boolArr2);
                            if (boolArr2[i4].booleanValue()) {
                                sortTextView.setSortType(SortTextView.SortType.NONE, false);
                            } else {
                                sortTextView.setDisableSort();
                            }
                        }
                    }
                }
                i3++;
                i4++;
            }
        }
    }

    public C42962rgM EZpvd() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C42962rgM c42962rgM = new C42962rgM(context);
        c42962rgM.EZpvd(new StateListAnimator());
        return c42962rgM;
    }

    public final void valueOf() {
        AhwBna().showAsDropDown(this.gEmmrt);
    }

    public final void setCallback(@NotNull java.lang.Boolean[] boolArr, java.lang.String[] strArr, @NotNull Function2<? super java.lang.Integer, ? super SortTextView.SortType, Unit> function2) {
        Intrinsics.checkNotNullParameter(boolArr, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = boolArr;
        this.EZpvd = function2;
        setVisibility(0);
        AEQbTJ();
        if (strArr != null) {
            setTexts(strArr);
        }
        postDelayed(new java.lang.Runnable() { // from class: o.rgG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C42951rgB.AhwBna(this.OLrzqt);
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AhwBna(C42951rgB c42951rgB) {
        C42975rgZ c42975rgZ = C42975rgZ.KWHzl;
        SortTextView sortTextView = c42951rgB.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(sortTextView, "");
        SortTextView sortTextView2 = c42951rgB.AhwBna;
        Intrinsics.checkNotNullExpressionValue(sortTextView2, "");
        c42975rgZ.OLrzqt(sortTextView, sortTextView2);
        c42951rgB.requestLayout();
    }

    public final void setTexts(@NotNull java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        if (strArr.length >= 3) {
            this.valueOf.setText(strArr[0]);
            this.AhwBna.setText(strArr[1]);
            this.fetchVPNInfo.setText(strArr[2]);
        }
        if (strArr.length >= 4) {
            this.gEmmrt.setText(strArr[3]);
        }
    }

    public final SortTextView.SortType AEQbTJ(SortTextView.SortType sortType) {
        int i = ActionBar.KWHzl[sortType.ordinal()];
        if (i == 1) {
            return SortTextView.SortType.UP;
        }
        if (i == 2) {
            return SortTextView.SortType.DOWN;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return SortTextView.SortType.NONE;
    }

    public final SortTextView.SortType EZpvd(SortTextView.SortType sortType) {
        int i = ActionBar.KWHzl[sortType.ordinal()];
        if (i == 1) {
            return SortTextView.SortType.DOWN;
        }
        if (i == 2) {
            return SortTextView.SortType.NONE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return SortTextView.SortType.UP;
    }

    public final void setDefaultSortType() {
        this.AEQbTJ = SortTextView.SortType.UP;
    }

    public final void setRightDefaultSortType() {
        this.fetchVPNInfo.setSortType(SortTextView.SortType.NONE, false);
    }

    public final void setRightViewClick() {
        SortTextView sortTextView = this.fetchVPNInfo;
        if (sortTextView != null) {
            sortTextView.performClick();
        }
    }

    public final void setMidDefault() {
        this.AhwBna.setSortType(SortTextView.SortType.NONE, false);
    }
}
