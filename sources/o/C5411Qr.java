package o;

import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;

/* JADX INFO: renamed from: o.Qr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5411Qr implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType KWHzl(@androidx.annotation.NonNull java.io.InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType copydefault(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int EZpvd(@androidx.annotation.NonNull java.io.InputStream inputStream, @androidx.annotation.NonNull OF of) throws java.io.IOException {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int EZpvd(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer, @androidx.annotation.NonNull OF of) throws java.io.IOException {
        return EZpvd(C5466Su.EZpvd(byteBuffer), of);
    }
}
