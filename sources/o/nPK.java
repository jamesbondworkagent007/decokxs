package o;

import android.graphics.Bitmap;
import com.okinc.im.imui.glide.model.AspectOrientation;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nPK extends AbstractC5396Qc {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final byte[] KWHzl;
    public final C34059nPx copydefault;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AspectOrientation.values().length];
            try {
                iArr[AspectOrientation.SQUARE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AspectOrientation.PORTRAIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AspectOrientation.LANDSCAPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public nPK(@NotNull C34059nPx c34059nPx) {
        Intrinsics.checkNotNullParameter(c34059nPx, "");
        this.copydefault = c34059nPx;
        java.nio.charset.Charset charset = NH.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = "com.okinc.im.imui.glide.transform.MaxAspectRatioCropTransformation.v2".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        this.KWHzl = bytes;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nPK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(@NotNull OG og, @NotNull android.graphics.Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(og, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        nPB npbEZpvd = nPJ.OLrzqt.EZpvd(this.copydefault, bitmap.getWidth(), bitmap.getHeight());
        return (bitmap.getWidth() == npbEZpvd.OLrzqt() && bitmap.getHeight() == npbEZpvd.copydefault()) ? bitmap : AEQbTJ(og, bitmap, npbEZpvd.OLrzqt(), npbEZpvd.copydefault(), npbEZpvd.EZpvd());
    }

    public final android.graphics.Bitmap AEQbTJ(OG og, android.graphics.Bitmap bitmap, int i, int i2, AspectOrientation aspectOrientation) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(i, i2, copydefault(bitmap));
        Intrinsics.checkNotNullExpressionValue(bitmapCopydefault, "");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
        android.graphics.Paint paint = new android.graphics.Paint(6);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int i3 = ActionBar.EZpvd[aspectOrientation.ordinal()];
        if (i3 == 1 || i3 == 2) {
            float width = bitmap.getWidth() > 0 ? i / bitmap.getWidth() : 1.0f;
            matrix.setScale(width, width);
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            float width2 = bitmap.getWidth();
            float height = bitmap.getHeight();
            float f3 = i2;
            float f4 = i;
            float f5 = 0.0f;
            if (width2 * f3 > f4 * height) {
                f2 = f3 / height;
                f = 0.0f;
                f5 = (f4 - (width2 * f2)) * 0.5f;
            } else {
                float f6 = f4 / width2;
                f = (f3 - (height * f6)) * 0.5f;
                f2 = f6;
            }
            matrix.setScale(f2, f2);
            matrix.postTranslate(yII.EZpvd(f5), yII.EZpvd(f));
        }
        canvas.drawBitmap(bitmap, matrix, paint);
        return bitmapCopydefault;
    }

    public final Bitmap.Config copydefault(android.graphics.Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    @Override // o.NH
    public void AEQbTJ(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "");
        messageDigest.update(this.KWHzl);
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(44).order(ByteOrder.nativeOrder());
        byteBufferOrder.putInt(this.copydefault.fetchVPNInfo());
        byteBufferOrder.putInt(this.copydefault.AYXKKw());
        byteBufferOrder.putInt(this.copydefault.gEmmrt());
        byteBufferOrder.putInt(this.copydefault.valueOf());
        byteBufferOrder.putInt(this.copydefault.KWHzl());
        byteBufferOrder.putInt(this.copydefault.copydefault());
        byteBufferOrder.putInt(this.copydefault.OLrzqt());
        byteBufferOrder.putInt(this.copydefault.AEQbTJ());
        byteBufferOrder.putFloat(this.copydefault.djBIcL());
        byteBufferOrder.putFloat(this.copydefault.EZpvd());
        java.lang.Float fAhwBna = this.copydefault.AhwBna();
        byteBufferOrder.putFloat(fAhwBna != null ? fAhwBna.floatValue() : -1.0f);
        messageDigest.update(byteBufferOrder.array());
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nPK) {
            return Intrinsics.EZpvd(this.copydefault, ((nPK) obj).copydefault);
        }
        return false;
    }

    @Override // o.NH
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + 1711629330;
    }
}
