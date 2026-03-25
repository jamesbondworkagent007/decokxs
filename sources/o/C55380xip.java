package o;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.xip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55380xip extends CardView implements InterfaceC55066xct {
    public int AEQbTJ;
    public float AYXKKw;
    public final MaterialTextView AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public int KWHzl;
    public float OLrzqt;
    public float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55380xip(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55380xip(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.xip.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55380xip(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55380xip(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C55298xhM.OLrzqt(10.0f, context);
        this.AYXKKw = 12.0f;
        this.KWHzl = C33517mxu.KWHzl.OLrzqt(context, C52761wXj.ActionBar.wlaJM);
        this.AEQbTJ = ContextCompat.getColor(context, C52761wXj.Activity.dvKsVJ);
        this.OLrzqt = C55298xhM.OLrzqt(20.0f, context);
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.xit
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55380xip.KWHzl(this.KWHzl);
            }
        });
        InterfaceC52764wXm.Application.loadFromAttributes$default(EZpvd(), attributeSet, i, 0, 4, null);
        if (attributeSet != null) {
            KWHzl(attributeSet);
        }
        MaterialTextView materialTextView = new MaterialTextView(context);
        materialTextView.setGravity(17);
        materialTextView.setTextColor(this.KWHzl);
        materialTextView.setTextSize(0, this.AYXKKw);
        materialTextView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        materialTextView.setEllipsize(TextUtils.TruncateAt.END);
        materialTextView.setMaxLines(1);
        this.AhwBna = materialTextView;
        AEQbTJ();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.OuxcSI);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.setMarginStart(dimensionPixelOffset);
        layoutParams.setMarginEnd(dimensionPixelOffset);
        layoutParams.gravity = 17;
        Unit unit = Unit.INSTANCE;
        addView(materialTextView, layoutParams);
    }

    private final C55065xcs EZpvd() {
        return (C55065xcs) this.EZpvd.getValue();
    }

    public static final C55065xcs KWHzl(C55380xip c55380xip) {
        return new C55065xcs(c55380xip, 0, 2, null);
    }

    public final void KWHzl(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.aUsmxb);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.copydefault = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.igXuih, this.copydefault);
            int i = C52761wXj.PictureInPictureParams.htlTjW;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.AYXKKw = typedArrayObtainStyledAttributes.getDimension(i, C55298xhM.OLrzqt(12.0f, context));
            this.KWHzl = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.fdOvFl, this.KWHzl);
            this.AEQbTJ = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.USBtdM, this.AEQbTJ);
            this.OLrzqt = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.fERRXa, this.OLrzqt);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void AEQbTJ() {
        setRadius(this.copydefault);
        setCardBackgroundColor(this.AEQbTJ);
        setElevation(0.0f);
        KWHzl();
    }

    public final void KWHzl() {
        float fOLrzqt;
        if (OLrzqt() == -4) {
            this.AhwBna.setTextAppearance(C52761wXj.LoaderManager.QOLQEE);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            fOLrzqt = C55298xhM.OLrzqt(20.0f, context);
        } else {
            this.AhwBna.setTextAppearance(C52761wXj.LoaderManager.QUSxYX);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            fOLrzqt = C55298xhM.OLrzqt(16.0f, context2);
        }
        setTextColor(this.KWHzl);
        setBadgeSize(fOLrzqt);
        setCornerRadius(fOLrzqt / 2.0f);
    }

    public final void setBadgeText(java.lang.String str) {
        this.AhwBna.setText(str);
        setVisibility((str == null || str.length() == 0) ? 8 : 0);
    }

    public static /* synthetic */ void setBadgeNumber$default(C55380xip c55380xip, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 99;
        }
        c55380xip.setBadgeNumber(i, i2);
    }

    public final void setBadgeNumber(int i, int i2) {
        if (i <= 0) {
            setVisibility(8);
            return;
        }
        if (i > i2) {
            setBadgeText(i2 + Marker.ANY_NON_NULL_MARKER);
            return;
        }
        setBadgeText(java.lang.String.valueOf(i));
    }

    public final void setCornerRadius(float f) {
        this.copydefault = f;
        setRadius(f);
    }

    public final void setTextSize(float f) {
        this.AYXKKw = f;
        this.AhwBna.setTextSize(2, f);
    }

    public final void setTextColor(int i) {
        this.KWHzl = i;
        this.AhwBna.setTextColor(i);
    }

    public final void setBadgeBackgroundColor(int i) {
        this.AEQbTJ = i;
        setCardBackgroundColor(i);
    }

    public final void setBadgeSize(float f) {
        this.OLrzqt = f;
        int i = (int) f;
        if (getLayoutParams() == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, i));
        } else {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = i;
                setLayoutParams(layoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        setMinimumWidth(i);
        setMinimumHeight(i);
    }

    public final void setOKDSBadgeSize(int i) {
        setOKDSSize(i);
    }

    public int OLrzqt() {
        return EZpvd().copydefault();
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        EZpvd().setOKDSSize(i);
        KWHzl();
    }
}
