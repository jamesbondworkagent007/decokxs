package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wYF extends android.widget.LinearLayout implements InterfaceC55066xct {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public java.lang.CharSequence AYXKKw;
    public int AhwBna;
    public C52794wYp DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public int copydefault;
    public C52794wYp djBIcL;
    public java.lang.CharSequence fetchVPNInfo;
    public C52794wYp gEmmrt;
    public java.lang.CharSequence isConnected;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYF(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52794wYp AEQbTJ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52794wYp OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52794wYp copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelButton(C52794wYp c52794wYp) {
        this.gEmmrt = c52794wYp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrimaryButton(C52794wYp c52794wYp) {
        this.djBIcL = c52794wYp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondaryButton(C52794wYp c52794wYp) {
        this.DbNXlk = c52794wYp;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:36) call: o.wYF.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ wYF(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xhQ.getString$default(android.content.res.TypedArray, android.content.Context, int, int, int, java.lang.Object):java.lang.CharSequence */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wYF(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = 52;
        this.AhwBna = 5;
        this.valueOf = C55298xhM.OLrzqt(16, context);
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wYH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wYF.KWHzl(context);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wYJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wYF.AhwBna(context);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.wYL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wYF.copydefault(context);
            }
        });
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(C52761wXj.ActionBar.DLWbHP, typedValue, true);
        this.valueOf = (int) typedValue.getDimension(getResources().getDisplayMetrics());
        setBaselineAligned(false);
        setGravity(1);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.zzQwtT);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.copydefault = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.iCPUKe, 52);
        this.AhwBna = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.DKtBnz, 5);
        this.isConnected = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.iKEqwx, 0, 4, null);
        this.fetchVPNInfo = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.DLGVGj, 0, 4, null);
        this.AYXKKw = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.gtdfxv, 0, 4, null);
        typedArrayObtainStyledAttributes.recycle();
        KWHzl();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wYF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final C52794wYp djBIcL() {
        return (C52794wYp) this.AEQbTJ.getValue();
    }

    public static final C52794wYp KWHzl(android.content.Context context) {
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setOKDSType(257);
        c52794wYp.setContentDescription("primaryButton");
        return c52794wYp;
    }

    private final C52794wYp AYXKKw() {
        return (C52794wYp) this.KWHzl.getValue();
    }

    public static final C52794wYp AhwBna(android.content.Context context) {
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setOKDSType(258);
        c52794wYp.setContentDescription("secondaryButton");
        return c52794wYp;
    }

    private final C52794wYp valueOf() {
        return (C52794wYp) this.EZpvd.getValue();
    }

    public static final C52794wYp copydefault(android.content.Context context) {
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setOKDSType(260);
        c52794wYp.setContentDescription("cancelButton");
        return c52794wYp;
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.copydefault = i;
        EZpvd();
    }

    public final void setType(int i) {
        this.AhwBna = i;
        KWHzl();
    }

    public final void setPrimaryText(java.lang.CharSequence charSequence) {
        this.isConnected = charSequence;
        C52794wYp c52794wYp = this.djBIcL;
        if (c52794wYp != null) {
            c52794wYp.setText(charSequence);
        }
    }

    public final void setSecondaryText(java.lang.CharSequence charSequence) {
        this.fetchVPNInfo = charSequence;
        C52794wYp c52794wYp = this.DbNXlk;
        if (c52794wYp != null) {
            c52794wYp.setText(charSequence);
        }
    }

    public final void setCancelText(java.lang.CharSequence charSequence) {
        this.AYXKKw = charSequence;
        C52794wYp c52794wYp = this.gEmmrt;
        if (c52794wYp != null) {
            c52794wYp.setText(charSequence);
        }
    }

    public final void KWHzl() {
        C52794wYp c52794wYp;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        removeAllViews();
        if (this.AhwBna == 17) {
            setPaddingRelative(0, 0, 0, 0);
        } else {
            int i = this.valueOf;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(16, context);
            int i2 = this.valueOf;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            setPaddingRelative(i, iOLrzqt, i2, C55298xhM.OLrzqt(16, context2));
        }
        setOrientation((this.AhwBna & 1) == 0 ? 0 : 1);
        int i3 = this.AhwBna;
        if (i3 == 17) {
            this.gEmmrt = valueOf();
            android.view.View view = new android.view.View(getContext());
            view.setBackgroundColor(ContextCompat.getColor(view.getContext(), C52761wXj.Activity.hwkNQP));
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, C55298xhM.KWHzl(0.5f, context3));
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            layoutParams4.topMargin = C55298xhM.OLrzqt(12, context4);
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            layoutParams4.bottomMargin = C55298xhM.OLrzqt(12, context5);
            Unit unit = Unit.INSTANCE;
            addView(view, layoutParams4);
            addView(this.gEmmrt);
        } else if ((i3 & 2) == 0) {
            C52794wYp c52794wYpDjBIcL = djBIcL();
            this.djBIcL = c52794wYpDjBIcL;
            addView(c52794wYpDjBIcL);
        } else if ((i3 & 1) == 0) {
            C52794wYp c52794wYpAYXKKw = AYXKKw();
            this.DbNXlk = c52794wYpAYXKKw;
            addView(c52794wYpAYXKKw);
            C52794wYp c52794wYpDjBIcL2 = djBIcL();
            this.djBIcL = c52794wYpDjBIcL2;
            addView(c52794wYpDjBIcL2);
        } else {
            C52794wYp c52794wYpDjBIcL3 = djBIcL();
            this.djBIcL = c52794wYpDjBIcL3;
            addView(c52794wYpDjBIcL3);
            C52794wYp c52794wYpAYXKKw2 = AYXKKw();
            this.DbNXlk = c52794wYpAYXKKw2;
            addView(c52794wYpAYXKKw2);
        }
        if ((this.AhwBna & 4) == 0) {
            C52794wYp c52794wYp2 = this.djBIcL;
            if (c52794wYp2 != null) {
                OLrzqt(c52794wYp2);
            }
            C52794wYp c52794wYp3 = this.DbNXlk;
            if (c52794wYp3 != null) {
                c52794wYp3.setOKDSType(49);
            }
            C52794wYp c52794wYp4 = this.DbNXlk;
            if (c52794wYp4 != null) {
                OLrzqt(c52794wYp4);
            }
        } else {
            C52794wYp c52794wYp5 = this.djBIcL;
            if (c52794wYp5 != null) {
                KWHzl(c52794wYp5);
            }
            C52794wYp c52794wYp6 = this.DbNXlk;
            if (c52794wYp6 != null) {
                c52794wYp6.setOKDSType(258);
            }
            C52794wYp c52794wYp7 = this.DbNXlk;
            if (c52794wYp7 != null) {
                KWHzl(c52794wYp7);
            }
            if ((this.AhwBna & 16) != 0 && (c52794wYp = this.djBIcL) != null) {
                c52794wYp.setOKDSType(258);
            }
        }
        C52794wYp c52794wYp8 = this.DbNXlk;
        if (c52794wYp8 != null) {
            c52794wYp8.setMaxWidth(Integer.MAX_VALUE);
        }
        int i4 = this.AhwBna;
        if ((i4 & 1) == 0) {
            if ((i4 & 8) == 0) {
                C52794wYp c52794wYp9 = this.djBIcL;
                if (c52794wYp9 != null && (layoutParams3 = c52794wYp9.getLayoutParams()) != null && (layoutParams3 instanceof LinearLayout.LayoutParams)) {
                    layoutParams3.width = 0;
                    ((LinearLayout.LayoutParams) layoutParams3).weight = 1.0f;
                }
                C52794wYp c52794wYp10 = this.DbNXlk;
                if (c52794wYp10 != null) {
                    ViewGroup.LayoutParams layoutParams5 = c52794wYp10.getLayoutParams();
                    if (layoutParams5 != null && (layoutParams5 instanceof LinearLayout.LayoutParams)) {
                        layoutParams5.width = -2;
                        ((LinearLayout.LayoutParams) layoutParams5).weight = 0.0f;
                    }
                    c52794wYp10.setMaxWidth(gEmmrt());
                }
            } else {
                C52794wYp c52794wYp11 = this.DbNXlk;
                if (c52794wYp11 != null && (layoutParams2 = c52794wYp11.getLayoutParams()) != null && (layoutParams2 instanceof LinearLayout.LayoutParams)) {
                    layoutParams2.width = 0;
                    ((LinearLayout.LayoutParams) layoutParams2).weight = 1.0f;
                }
                C52794wYp c52794wYp12 = this.djBIcL;
                if (c52794wYp12 != null && (layoutParams = c52794wYp12.getLayoutParams()) != null && (layoutParams instanceof LinearLayout.LayoutParams)) {
                    layoutParams.width = 0;
                    ((LinearLayout.LayoutParams) layoutParams).weight = 1.0f;
                }
            }
        }
        EZpvd();
        C52794wYp c52794wYp13 = this.djBIcL;
        if (c52794wYp13 != null) {
            c52794wYp13.setText(this.isConnected);
        }
        C52794wYp c52794wYp14 = this.DbNXlk;
        if (c52794wYp14 != null) {
            c52794wYp14.setText(this.fetchVPNInfo);
        }
        C52794wYp c52794wYp15 = this.gEmmrt;
        if (c52794wYp15 != null) {
            c52794wYp15.setText(this.AYXKKw);
        }
    }

    public final void EZpvd() {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2 = this.djBIcL;
        if (c52794wYp2 != null) {
            c52794wYp2.setOKDSSize(this.copydefault);
        }
        C52794wYp c52794wYp3 = this.DbNXlk;
        if (c52794wYp3 != null) {
            c52794wYp3.setOKDSSize(this.copydefault);
        }
        C52794wYp c52794wYp4 = this.gEmmrt;
        if (c52794wYp4 != null) {
            c52794wYp4.setOKDSSize(this.copydefault);
        }
        C52794wYp c52794wYp5 = this.gEmmrt;
        if (c52794wYp5 != null) {
            c52794wYp5.setTypeface(C55051xce.OLrzqt.OLrzqt());
        }
        C52794wYp c52794wYp6 = this.gEmmrt;
        if (c52794wYp6 != null) {
            c52794wYp6.setButtonCornerRadius(0.0f);
        }
        C52794wYp c52794wYp7 = this.djBIcL;
        if (c52794wYp7 != null) {
            setMargin$default(this, c52794wYp7, 0, 0, 0, 0, 15, null);
        }
        C52794wYp c52794wYp8 = this.DbNXlk;
        if (c52794wYp8 != null) {
            setMargin$default(this, c52794wYp8, 0, 0, 0, 0, 15, null);
        }
        int i = this.AhwBna;
        if (i == 3) {
            C52794wYp c52794wYp9 = this.DbNXlk;
            if (c52794wYp9 != null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                setMargin$default(this, c52794wYp9, 0, C55298xhM.OLrzqt(6, context), 0, 0, 13, null);
            }
        } else if (i == 14 || i == 6) {
            C52794wYp c52794wYp10 = this.djBIcL;
            if (c52794wYp10 != null) {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                setMargin$default(this, c52794wYp10, C55298xhM.OLrzqt(12, context2), 0, 0, 0, 14, null);
            }
        } else if (i == 7 && (c52794wYp = this.DbNXlk) != null) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            setMargin$default(this, c52794wYp, 0, C55298xhM.OLrzqt(12, context3), 0, 0, 13, null);
        }
        requestLayout();
    }

    public final void OLrzqt(C52794wYp c52794wYp) {
        android.content.Context context = c52794wYp.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c52794wYp.setMinWidth(C55298xhM.OLrzqt(200, context));
        ViewGroup.LayoutParams layoutParams = c52794wYp.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
        }
    }

    public final void KWHzl(C52794wYp c52794wYp) {
        c52794wYp.setMinWidth(0);
        ViewGroup.LayoutParams layoutParams = c52794wYp.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
    }

    public static /* synthetic */ void setMargin$default(wYF wyf, C52794wYp c52794wYp, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        wyf.setMargin(c52794wYp, (i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    public final void setMargin(C52794wYp c52794wYp, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = c52794wYp.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof LinearLayout.LayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        MarginLayoutParamsCompat.setMarginStart(marginLayoutParams, i);
        MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, i3);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = i2;
        layoutParams2.bottomMargin = i4;
    }

    private final int gEmmrt() {
        android.content.res.Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        int iEZpvd = C55302xhQ.EZpvd(resources);
        int i = this.valueOf;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return ((iEZpvd - (i * 2)) - C55298xhM.OLrzqt(12, context)) >> 1;
    }
}
