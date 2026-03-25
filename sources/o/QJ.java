package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;

/* JADX INFO: loaded from: classes2.dex */
public final class QJ {
    public final java.util.List<ImageHeaderParser> EZpvd;
    public final OF KWHzl;

    public static NL<java.io.InputStream, android.graphics.drawable.Drawable> EZpvd(java.util.List<ImageHeaderParser> list, OF of) {
        return new ActionBar(new QJ(list, of));
    }

    public static NL<java.nio.ByteBuffer, android.graphics.drawable.Drawable> OLrzqt(java.util.List<ImageHeaderParser> list, OF of) {
        return new StateListAnimator(new QJ(list, of));
    }

    public QJ(java.util.List<ImageHeaderParser> list, OF of) {
        this.EZpvd = list;
        this.KWHzl = of;
    }

    public boolean copydefault(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        return EZpvd(NK.OLrzqt(this.EZpvd, byteBuffer));
    }

    public boolean OLrzqt(java.io.InputStream inputStream) throws java.io.IOException {
        return EZpvd(NK.EZpvd(this.EZpvd, inputStream, this.KWHzl));
    }

    public final boolean EZpvd(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    public OC<android.graphics.drawable.Drawable> ct_(@androidx.annotation.NonNull ImageDecoder.Source source, int i, int i2, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        android.graphics.drawable.Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new DefaultOnHeaderDecodedListener(i, i2, nm));
        if (!QH.EZpvd(drawableDecodeDrawable)) {
            throw new java.io.IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
        }
        return new TaskDescription(QI.cu_(drawableDecodeDrawable));
    }

    public static final class TaskDescription implements OC<android.graphics.drawable.Drawable> {
        public final AnimatedImageDrawable OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.OC
        public java.lang.Class<android.graphics.drawable.Drawable> copydefault() {
            return android.graphics.drawable.Drawable.class;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
        @Override // o.OC
        /* JADX INFO: renamed from: cv_, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable AEQbTJ() {
            return this.OLrzqt;
        }

        public TaskDescription(AnimatedImageDrawable animatedImageDrawable) {
            this.OLrzqt = animatedImageDrawable;
        }

        @Override // o.OC
        public int EZpvd() {
            return this.OLrzqt.getIntrinsicWidth() * this.OLrzqt.getIntrinsicHeight() * SI.copydefault(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // o.OC
        public void djBIcL() {
            this.OLrzqt.stop();
            this.OLrzqt.clearAnimationCallbacks();
        }
    }

    public static final class ActionBar implements NL<java.io.InputStream, android.graphics.drawable.Drawable> {
        public final QJ OLrzqt;

        public ActionBar(QJ qj) {
            this.OLrzqt = qj;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
        @Override // o.NL
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(@androidx.annotation.NonNull java.io.InputStream inputStream, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
            return this.OLrzqt.OLrzqt(inputStream);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
        @Override // o.NL
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public OC<android.graphics.drawable.Drawable> copydefault(@androidx.annotation.NonNull java.io.InputStream inputStream, int i, int i2, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
            return this.OLrzqt.ct_(ImageDecoder.createSource(C5466Su.EZpvd(inputStream)), i, i2, nm);
        }
    }

    public static final class StateListAnimator implements NL<java.nio.ByteBuffer, android.graphics.drawable.Drawable> {
        public final QJ AEQbTJ;

        public StateListAnimator(QJ qj) {
            this.AEQbTJ = qj;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
        @Override // o.NL
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
            return this.AEQbTJ.copydefault(byteBuffer);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
        @Override // o.NL
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public OC<android.graphics.drawable.Drawable> copydefault(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer, int i, int i2, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
            return this.AEQbTJ.ct_(ImageDecoder.createSource(byteBuffer), i, i2, nm);
        }
    }
}
