package o;

import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wYE extends AppCompatTextView {
    public int AEQbTJ;
    public int EZpvd;
    public final C55280xgv KWHzl;
    public int OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYE(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.wYE.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wYE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wYE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = -3;
        C55280xgv c55280xgv = new C55280xgv();
        c55280xgv.copydefault(true);
        c55280xgv.valueOf(C33070mpX.OLrzqt(C52761wXj.Activity.GcnicV, context));
        this.KWHzl = c55280xgv;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.sWlOSi, 0, 0);
        try {
            setType(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.DDNONI, 0));
            setSize(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.UnZVfq, -3));
            setPadding(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.DkIxYv, 0));
            setTextWeight(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.OYuSWK, 0));
            typedArrayObtainStyledAttributes.recycle();
            KWHzl();
            setCompoundDrawablePadding(C55298xhM.OLrzqt(4, context));
            setMaxLines(2);
            setEllipsize(TextUtils.TruncateAt.END);
            setTextAlignment(4);
            EZpvd();
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setType(int i) {
        this.OLrzqt = i;
        KWHzl();
    }

    public final void setSize(int i) {
        this.AEQbTJ = i;
        KWHzl();
    }

    public final void setPadding(int i) {
        this.copydefault = i;
        KWHzl();
    }

    public final void setTextWeight(int i) {
        this.EZpvd = i;
        KWHzl();
    }

    public final C33579mzC EZpvd(int i, android.content.Context context, int i2) {
        C33579mzC c33579mzC = new C33579mzC(C33070mpX.EZpvd(i, context), C55298xhM.OLrzqt(i2, context));
        c33579mzC.setTint(AEQbTJ());
        return c33579mzC;
    }

    private final int AEQbTJ() {
        if (isEnabled()) {
            int i = C52761wXj.Activity.svhCHd;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33070mpX.OLrzqt(i, context);
        }
        int i2 = C52761wXj.Activity.hfdhUn;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33070mpX.OLrzqt(i2, context2);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        copydefault();
    }

    public final void copydefault() {
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "");
        for (android.graphics.drawable.Drawable drawable : compoundDrawablesRelative) {
            if (drawable != null) {
                drawable.setTint(AEQbTJ());
            }
        }
    }

    private final void KWHzl() {
        int iOLrzqt;
        C33579mzC c33579mzCEZpvd;
        int i;
        int i2 = this.OLrzqt;
        if (i2 == 0) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iOLrzqt = C55298xhM.OLrzqt(16, context);
            int i3 = this.AEQbTJ;
            if (i3 == -5) {
                int i4 = C52761wXj.TaskDescription.HrMTQN;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c33579mzCEZpvd = EZpvd(i4, context2, 12);
            } else if (i3 == -4) {
                int i5 = C52761wXj.TaskDescription.onStatusChanged;
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                c33579mzCEZpvd = EZpvd(i5, context3, 16);
            } else if (i3 == -3) {
                int i6 = C52761wXj.TaskDescription.onProviderDisabled;
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                c33579mzCEZpvd = EZpvd(i6, context4, 20);
            } else {
                throw new java.lang.IllegalArgumentException("Invalid size: " + i3);
            }
        } else if (i2 == 1) {
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            iOLrzqt = C55298xhM.OLrzqt(8, context5);
            int i7 = this.AEQbTJ;
            if (i7 == -5) {
                int i8 = C52761wXj.TaskDescription.heceqZ;
                android.content.Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                c33579mzCEZpvd = EZpvd(i8, context6, 12);
            } else if (i7 == -4) {
                int i9 = C52761wXj.TaskDescription.DGOPHZDGOPHZ;
                android.content.Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                c33579mzCEZpvd = EZpvd(i9, context7, 16);
            } else if (i7 == -3) {
                int i10 = C52761wXj.TaskDescription.DGUQLI;
                android.content.Context context8 = getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                c33579mzCEZpvd = EZpvd(i10, context8, 20);
            } else {
                throw new java.lang.IllegalArgumentException("Invalid size: " + i7);
            }
        } else {
            throw new java.lang.IllegalArgumentException("Invalid type: " + i2);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, c33579mzCEZpvd, (android.graphics.drawable.Drawable) null);
        android.content.Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        int iOLrzqt2 = C55298xhM.OLrzqt(8, context9);
        int i11 = this.copydefault;
        if (i11 == 0) {
            android.content.Context context10 = getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "");
            setPaddingRelative(C55298xhM.OLrzqt(16, context10), iOLrzqt2, iOLrzqt, iOLrzqt2);
            C55280xgv c55280xgv = this.KWHzl;
            android.content.Context context11 = getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "");
            c55280xgv.EZpvd(C55298xhM.AEQbTJ(999, context11)).OLrzqt(this);
        } else if (i11 == 1) {
            setPaddingRelative(0, 0, 0, 0);
            C55280xgv c55280xgv2 = this.KWHzl;
            android.content.Context context12 = getContext();
            Intrinsics.checkNotNullExpressionValue(context12, "");
            c55280xgv2.EZpvd(C55298xhM.AEQbTJ(4, context12)).OLrzqt(this);
        } else {
            throw new java.lang.IllegalArgumentException("Invalid padding: " + i11);
        }
        int i12 = this.EZpvd;
        if (i12 == 0) {
            int i13 = this.AEQbTJ;
            if (i13 == -5) {
                i = C52761wXj.LoaderManager.DTwDnp;
            } else if (i13 == -4) {
                i = C52761wXj.LoaderManager.gHZMYf;
            } else {
                if (i13 != -3) {
                    throw new java.lang.IllegalArgumentException("Invalid size: " + i13);
                }
                i = C52761wXj.LoaderManager.AwvSrB;
            }
        } else {
            if (i12 != 1) {
                throw new java.lang.IllegalArgumentException("Invalid text weight: " + i12);
            }
            int i14 = this.AEQbTJ;
            if (i14 == -5) {
                i = C52761wXj.LoaderManager.ORxRYg;
            } else if (i14 == -4) {
                i = C52761wXj.LoaderManager.sSMYrx;
            } else {
                if (i14 != -3) {
                    throw new java.lang.IllegalArgumentException("Invalid size: " + i14);
                }
                i = C52761wXj.LoaderManager.zLjUOn;
            }
        }
        setTextAppearance(i);
        EZpvd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        EZpvd();
    }

    public final void EZpvd() {
        int iOLrzqt;
        if (isEnabled()) {
            int i = C52761wXj.Activity.svhCHd;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iOLrzqt = C33070mpX.OLrzqt(i, context);
        } else {
            int i2 = C52761wXj.Activity.hfdhUn;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iOLrzqt = C33070mpX.OLrzqt(i2, context2);
        }
        setTextColor(iOLrzqt);
    }
}
