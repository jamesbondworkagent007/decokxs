package o;

import com.okinc.share.bean.image.ImageFooterConfig;
import java.security.MessageDigest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ulZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49279ulZ extends AbstractC5396Qc {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static final byte[] copydefault;
    public final ImageFooterConfig KWHzl;
    public final android.app.Activity OLrzqt;

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        return this == obj;
    }

    public C49279ulZ(@NotNull android.app.Activity activity, @NotNull ImageFooterConfig imageFooterConfig) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(imageFooterConfig, "");
        this.OLrzqt = activity;
        this.KWHzl = imageFooterConfig;
    }

    /* JADX INFO: renamed from: o.ulZ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ulZ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    static {
        java.nio.charset.Charset charset = NH.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = "com.okinc.share.v2.preview.FootComposerTransformation.1".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        copydefault = bytes;
    }

    @Override // o.NH
    public void AEQbTJ(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "");
        messageDigest.update(copydefault);
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(@NotNull OG og, @NotNull android.graphics.Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(og, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        C49337ume c49337ume = C49337ume.KWHzl;
        android.graphics.Bitmap bitmapCopydefault = c49337ume.copydefault(this.OLrzqt, this.KWHzl);
        if (bitmapCopydefault == null) {
            pUU.copydefault("FooterGenerator", "FootComposerTransformation-> footer is null,return source bitmap");
            return bitmap;
        }
        android.graphics.Bitmap bitmapEZpvd = c49337ume.EZpvd(this.OLrzqt, bitmap, bitmapCopydefault, this.KWHzl.getPosition());
        if (bitmapEZpvd == null) {
            pUU.copydefault("FooterGenerator", "FootComposerTransformation-> composedBitmap is null,return source bitmap");
            return bitmap;
        }
        pUU.KWHzl("FooterGenerator", "FootComposerTransformation->composedBitmap->w:" + bitmapEZpvd.getWidth() + " h:" + bitmapEZpvd.getHeight());
        return bitmapEZpvd;
    }
}
