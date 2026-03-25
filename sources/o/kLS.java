package o;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.security.MessageDigest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kLS extends AbstractC5396Qc {
    public final boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public kLS() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:11) call: o.kLS.<init>(boolean):void type: THIS */
    public /* synthetic */ kLS(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public kLS(boolean z) {
        this.KWHzl = z;
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(@NotNull OG og, @NotNull android.graphics.Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(og, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        android.graphics.Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        int i3 = this.KWHzl ? 255 : 0;
        int width = bitmapCopy.getWidth();
        for (int i4 = 0; i4 < width; i4++) {
            int height = bitmapCopy.getHeight();
            for (int i5 = 0; i5 < height; i5++) {
                Intrinsics.copydefault(bitmapCopy);
                int iAlpha = Color.alpha(bitmapCopy.getPixel(i4, i5));
                if (iAlpha != 0) {
                    bitmapCopy.setPixel(i4, i5, Color.argb(iAlpha, i3, i3, i3));
                }
            }
        }
        Intrinsics.copydefault(bitmapCopy);
        return bitmapCopy;
    }

    @Override // o.NH
    public void AEQbTJ(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "");
        byte[] bytes = "black_white_preserve_alpha_transformation".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        messageDigest.update(bytes);
    }
}
