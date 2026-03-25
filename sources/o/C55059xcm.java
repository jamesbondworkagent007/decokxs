package o;

import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55059xcm extends C55055xci {
    public final OKRegularCell gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55059xcm(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55059xcm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.xcm.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55059xcm(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55059xcm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        OKRegularCell oKRegularCell = new OKRegularCell(context, null, 0, 6, null);
        this.gEmmrt = oKRegularCell;
        addView(oKRegularCell, 0, new FrameLayout.LayoutParams(-1, -2));
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.DcMfJKsuEgdN);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.CharSequence string$default = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.getAdvertisingId, 0, 4, null);
        if (string$default != null) {
            oKRegularCell.setTitle(string$default);
        }
        android.widget.TextView textViewEZpvd = oKRegularCell.EZpvd();
        android.content.res.ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.bindToGooglePlayService);
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, C52761wXj.Activity.GzAsTt));
            Intrinsics.checkNotNullExpressionValue(colorStateList, "");
        }
        textViewEZpvd.setTextColor(colorStateList);
        setItemSpace(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final android.widget.TextView copydefault() {
        return this.gEmmrt.EZpvd();
    }
}
