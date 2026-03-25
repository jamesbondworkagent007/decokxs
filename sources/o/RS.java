package o;

import com.bumptech.glide.load.ImageHeaderParser;

/* JADX INFO: loaded from: classes2.dex */
public final class RS {
    public final java.util.List<ImageHeaderParser> AEQbTJ = new java.util.ArrayList();

    public java.util.List<ImageHeaderParser> EZpvd() {
        java.util.List<ImageHeaderParser> list;
        synchronized (this) {
            list = this.AEQbTJ;
        }
        return list;
    }

    public void KWHzl(@androidx.annotation.NonNull ImageHeaderParser imageHeaderParser) {
        synchronized (this) {
            this.AEQbTJ.add(imageHeaderParser);
        }
    }
}
