package o;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.security.MessageDigest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31220lps extends AbstractC5396Qc {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public static final byte[] copydefault;
    public final float KWHzl;
    public final int OLrzqt;
    public final android.content.Context djBIcL;

    public C31220lps(@NotNull android.content.Context context, float f, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = context;
        this.KWHzl = f;
        this.OLrzqt = i;
    }

    /* JADX INFO: renamed from: o.lps$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lps.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    static {
        byte[] bytes = "com.okinc.business.trade.widget.CircleWithBorderTransformation".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        copydefault = bytes;
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(@NotNull OG og, @NotNull android.graphics.Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(og, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        int iMin = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight());
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iMin) / 2, (bitmap.getHeight() - iMin) / 2, iMin, iMin);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(iMin, iMin, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCopydefault, "");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        float f = iMin / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        paint.setXfermode(null);
        if (this.KWHzl > 0.0f) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.KWHzl * this.djBIcL.getResources().getDisplayMetrics().density);
            paint.setColor(this.OLrzqt);
            canvas.drawCircle(f, f, f - (paint.getStrokeWidth() / 2), paint);
        }
        return bitmapCopydefault;
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C31220lps) {
            C31220lps c31220lps = (C31220lps) obj;
            if (c31220lps.KWHzl == this.KWHzl && c31220lps.OLrzqt == this.OLrzqt) {
                return true;
            }
        }
        return false;
    }

    @Override // o.NH
    public int hashCode() {
        return (java.lang.Float.hashCode(this.KWHzl) - 172419466) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    @Override // o.NH
    public void AEQbTJ(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "");
        messageDigest.update(copydefault);
        float f = this.KWHzl;
        java.nio.charset.Charset charset = Charsets.UTF_8;
        byte[] bytes = java.lang.String.valueOf(f).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        messageDigest.update(bytes);
        byte[] bytes2 = java.lang.String.valueOf(this.OLrzqt).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        messageDigest.update(bytes2);
    }
}
