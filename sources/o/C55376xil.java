package o;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xil, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55376xil extends AppCompatTextView {
    public int AhwBna;
    public int AkhnZx;
    public int AuCTel;
    public int DbNXlk;
    public int fARcdN;
    public int fIwbmz;
    public boolean fJNWhG;
    public int fetchVPNInfo;
    public int isConnected;
    public int valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55376xil(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55376xil(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawableBottomHeight(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawableBottomWidth(int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawableLeftHeight(int i) {
        this.AkhnZx = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawableLeftWidth(int i) {
        this.values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawableRightHeight(int i) {
        this.DbNXlk = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawableRightWidth(int i) {
        this.isConnected = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawableTopHeight(int i) {
        this.fetchVPNInfo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawableTopWidth(int i) {
        this.fIwbmz = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMHeight(int i) {
        this.fARcdN = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMWidth(int i) {
        this.AuCTel = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.xil.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55376xil(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55376xil(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.fJNWhG = true;
        OLrzqt(context, attributeSet, i);
    }

    public final void OLrzqt(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.m);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.values = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.UvfnWv, 0);
        this.fIwbmz = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.ZAwExL, 0);
        this.isConnected = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.FdcJU, 0);
        this.AhwBna = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.fOrBHg, 0);
        this.AkhnZx = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.UkuJRw, 0);
        this.fetchVPNInfo = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.WFXFk, 0);
        this.DbNXlk = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.OfWYUE, 0);
        this.valueOf = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.UnZVfqExternalSyntheticApiModelOutline0, 0);
        this.fJNWhG = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.shErWi, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.AuCTel = i;
        this.fARcdN = i2;
        android.graphics.drawable.Drawable[] compoundDrawables = getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "");
        android.graphics.drawable.Drawable drawable = compoundDrawables[0];
        android.graphics.drawable.Drawable drawable2 = compoundDrawables[1];
        android.graphics.drawable.Drawable drawable3 = compoundDrawables[2];
        android.graphics.drawable.Drawable drawable4 = compoundDrawables[3];
        if (drawable != null) {
            setDrawable(drawable, 0, this.values, this.AkhnZx);
        }
        if (drawable2 != null) {
            setDrawable(drawable2, 1, this.fIwbmz, this.fetchVPNInfo);
        }
        if (drawable3 != null) {
            setDrawable(drawable3, 2, this.isConnected, this.DbNXlk);
        }
        if (drawable4 != null) {
            setDrawable(drawable4, 3, this.AhwBna, this.valueOf);
        }
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setDrawable(@NotNull android.graphics.drawable.Drawable drawable, int i, int i2, int i3) {
        int lineHeight;
        Intrinsics.checkNotNullParameter(drawable, "");
        if (i2 == 0) {
            i2 = drawable.getIntrinsicWidth();
        }
        if (i3 == 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        int i4 = 0;
        if (i == 0) {
            lineHeight = this.fJNWhG ? 0 : (((-getLineCount()) * getLineHeight()) / 2) + (getLineHeight() / 2);
            i3 += lineHeight;
        } else if (i == 1) {
            int i5 = this.fJNWhG ? 0 : ((-this.AuCTel) / 2) + (i2 / 2);
            i2 += i5;
            i4 = i5;
            lineHeight = 0;
        } else if (i != 2) {
            lineHeight = 0;
            i2 = 0;
            i3 = 0;
        }
        drawable.setBounds(i4, lineHeight, i2, i3);
    }
}
