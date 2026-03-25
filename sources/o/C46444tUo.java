package o;

import android.graphics.Paint;
import java.security.MessageDigest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tUo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46444tUo extends AbstractC5396Qc {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final float EZpvd;
    public final int KWHzl;
    public final android.graphics.Paint OLrzqt;
    public final float gEmmrt;

    public C46444tUo(float f, @androidx.annotation.ColorInt int i) {
        this.EZpvd = f;
        this.KWHzl = i;
        float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(f, null, 1, null);
        this.gEmmrt = fDp2pxFloat$default;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fDp2pxFloat$default);
        this.OLrzqt = paint;
    }

    /* JADX INFO: renamed from: o.tUo$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tUo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(@NotNull OG og, @NotNull android.graphics.Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(og, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        android.graphics.Bitmap bitmapCopydefault = QB.copydefault(og, bitmap, i, i2);
        float fMin = java.lang.Math.min(i, i2) / 2.0f;
        new android.graphics.Canvas(bitmapCopydefault).drawCircle(fMin, fMin, fMin - (this.gEmmrt / 2), this.OLrzqt);
        Intrinsics.copydefault(bitmapCopydefault);
        return bitmapCopydefault;
    }

    @Override // o.NH
    public void AEQbTJ(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "");
        java.lang.String str = "OKPlanet.PlanetCircleWithBorder" + this.EZpvd + this.KWHzl;
        java.nio.charset.Charset charset = NH.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        messageDigest.update(bytes);
    }
}
