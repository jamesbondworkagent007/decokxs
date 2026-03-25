package o;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nPH extends AbstractC5396Qc {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final byte[] copydefault;

    @Override // o.NH
    public int hashCode() {
        return 94629920;
    }

    public nPH() {
        java.nio.charset.Charset charset = NH.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = "com.okinc.im.imui.glide.transform.FitWidthTopCrop".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        this.copydefault = bytes;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nPH.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(@NotNull OG og, @NotNull android.graphics.Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(og, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return bitmap;
        }
        int height = (int) (bitmap.getHeight() * (i / bitmap.getWidth()));
        if ((bitmap.getHeight() > bitmap.getWidth()) && height > i2) {
            return EZpvd(og, bitmap, i, i2);
        }
        android.graphics.Bitmap bitmapEZpvd = QB.EZpvd(og, bitmap, i, i2);
        Intrinsics.checkNotNullExpressionValue(bitmapEZpvd, "");
        return bitmapEZpvd;
    }

    public final android.graphics.Bitmap EZpvd(OG og, android.graphics.Bitmap bitmap, int i, int i2) {
        float width = i / bitmap.getWidth();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(width, width);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(i, i2, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCopydefault, "");
        new android.graphics.Canvas(bitmapCopydefault).drawBitmap(bitmap, matrix, new android.graphics.Paint(6));
        return bitmapCopydefault;
    }

    @Override // o.NH
    public void AEQbTJ(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "");
        messageDigest.update(this.copydefault);
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        return obj instanceof nPH;
    }
}
