package o;

import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;

/* JADX INFO: renamed from: o.Qv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5415Qv {
    int EZpvd() throws java.io.IOException;

    android.graphics.Bitmap EZpvd(BitmapFactory.Options options) throws java.io.IOException;

    void KWHzl();

    ImageHeaderParser.ImageType OLrzqt() throws java.io.IOException;

    /* JADX INFO: renamed from: o.Qv$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC5415Qv {
        public final java.nio.ByteBuffer EZpvd;
        public final OF KWHzl;
        public final java.util.List<ImageHeaderParser> OLrzqt;

        @Override // o.InterfaceC5415Qv
        public void KWHzl() {
        }

        public StateListAnimator(java.nio.ByteBuffer byteBuffer, java.util.List<ImageHeaderParser> list, OF of) {
            this.EZpvd = byteBuffer;
            this.OLrzqt = list;
            this.KWHzl = of;
        }

        @Override // o.InterfaceC5415Qv
        public android.graphics.Bitmap EZpvd(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(AEQbTJ(), null, options);
        }

        @Override // o.InterfaceC5415Qv
        public ImageHeaderParser.ImageType OLrzqt() throws java.io.IOException {
            return NK.OLrzqt(this.OLrzqt, C5466Su.OLrzqt(this.EZpvd));
        }

        @Override // o.InterfaceC5415Qv
        public int EZpvd() throws java.io.IOException {
            return NK.copydefault(this.OLrzqt, C5466Su.OLrzqt(this.EZpvd), this.KWHzl);
        }

        public final java.io.InputStream AEQbTJ() {
            return C5466Su.EZpvd(C5466Su.OLrzqt(this.EZpvd));
        }
    }

    /* JADX INFO: renamed from: o.Qv$Application */
    public static final class Application implements InterfaceC5415Qv {
        public final OF KWHzl;
        public final java.util.List<ImageHeaderParser> OLrzqt;
        public final NX copydefault;

        public Application(java.io.InputStream inputStream, java.util.List<ImageHeaderParser> list, OF of) {
            this.KWHzl = (OF) SE.OLrzqt(of);
            this.OLrzqt = (java.util.List) SE.OLrzqt(list);
            this.copydefault = new NX(inputStream, of);
        }

        @Override // o.InterfaceC5415Qv
        public android.graphics.Bitmap EZpvd(BitmapFactory.Options options) throws java.io.IOException {
            return BitmapFactory.decodeStream(this.copydefault.AEQbTJ(), null, options);
        }

        @Override // o.InterfaceC5415Qv
        public ImageHeaderParser.ImageType OLrzqt() throws java.io.IOException {
            return NK.EZpvd(this.OLrzqt, this.copydefault.AEQbTJ(), this.KWHzl);
        }

        @Override // o.InterfaceC5415Qv
        public int EZpvd() throws java.io.IOException {
            return NK.copydefault(this.OLrzqt, this.copydefault.AEQbTJ(), this.KWHzl);
        }

        @Override // o.InterfaceC5415Qv
        public void KWHzl() {
            this.copydefault.copydefault();
        }
    }

    /* JADX INFO: renamed from: o.Qv$TaskDescription */
    public static final class TaskDescription implements InterfaceC5415Qv {
        public final ParcelFileDescriptorRewinder AEQbTJ;
        public final OF OLrzqt;
        public final java.util.List<ImageHeaderParser> copydefault;

        @Override // o.InterfaceC5415Qv
        public void KWHzl() {
        }

        public TaskDescription(android.os.ParcelFileDescriptor parcelFileDescriptor, java.util.List<ImageHeaderParser> list, OF of) {
            this.OLrzqt = (OF) SE.OLrzqt(of);
            this.copydefault = (java.util.List) SE.OLrzqt(list);
            this.AEQbTJ = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // o.InterfaceC5415Qv
        public android.graphics.Bitmap EZpvd(BitmapFactory.Options options) throws java.io.IOException {
            return BitmapFactory.decodeFileDescriptor(this.AEQbTJ.AEQbTJ().getFileDescriptor(), null, options);
        }

        @Override // o.InterfaceC5415Qv
        public ImageHeaderParser.ImageType OLrzqt() throws java.io.IOException {
            return NK.copydefault(this.copydefault, this.AEQbTJ, this.OLrzqt);
        }

        @Override // o.InterfaceC5415Qv
        public int EZpvd() throws java.io.IOException {
            return NK.AEQbTJ(this.copydefault, this.AEQbTJ, this.OLrzqt);
        }
    }
}
