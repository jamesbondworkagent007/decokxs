package o;

/* JADX INFO: renamed from: o.Sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5455Sj {
    public <Z> AbstractC5461Sp<android.widget.ImageView, Z> EZpvd(@androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull java.lang.Class<Z> cls) {
        if (android.graphics.Bitmap.class.equals(cls)) {
            return new C5451Sf(imageView);
        }
        if (android.graphics.drawable.Drawable.class.isAssignableFrom(cls)) {
            return new C5452Sg(imageView);
        }
        throw new java.lang.IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
