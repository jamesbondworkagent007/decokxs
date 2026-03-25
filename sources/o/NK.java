package o;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class NK {

    public interface ActionBar {
        int copydefault(ImageHeaderParser imageHeaderParser) throws java.io.IOException;
    }

    public interface TaskDescription {
        ImageHeaderParser.ImageType OLrzqt(ImageHeaderParser imageHeaderParser) throws java.io.IOException;
    }

    private NK() {
    }

    public static ImageHeaderParser.ImageType EZpvd(@androidx.annotation.NonNull java.util.List<ImageHeaderParser> list, @androidx.annotation.Nullable final java.io.InputStream inputStream, @androidx.annotation.NonNull OF of) throws java.io.IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, of);
        }
        inputStream.mark(5242880);
        return KWHzl(list, new TaskDescription() { // from class: o.NK.1
            @Override // o.NK.TaskDescription
            public ImageHeaderParser.ImageType OLrzqt(ImageHeaderParser imageHeaderParser) throws java.io.IOException {
                try {
                    return imageHeaderParser.KWHzl(inputStream);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType OLrzqt(@androidx.annotation.NonNull java.util.List<ImageHeaderParser> list, @androidx.annotation.Nullable final java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return KWHzl(list, new TaskDescription() { // from class: o.NK.3
            @Override // o.NK.TaskDescription
            public ImageHeaderParser.ImageType OLrzqt(ImageHeaderParser imageHeaderParser) throws java.io.IOException {
                try {
                    return imageHeaderParser.copydefault(byteBuffer);
                } finally {
                    C5466Su.OLrzqt(byteBuffer);
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType copydefault(@androidx.annotation.NonNull java.util.List<ImageHeaderParser> list, @androidx.annotation.NonNull final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @androidx.annotation.NonNull final OF of) throws java.io.IOException {
        return KWHzl(list, new TaskDescription() { // from class: o.NK.5
            @Override // o.NK.TaskDescription
            public ImageHeaderParser.ImageType OLrzqt(ImageHeaderParser imageHeaderParser) throws java.lang.Throwable {
                RecyclableBufferedInputStream recyclableBufferedInputStream;
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new java.io.FileInputStream(parcelFileDescriptorRewinder.AEQbTJ().getFileDescriptor()), of);
                } catch (java.lang.Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = null;
                }
                try {
                    ImageHeaderParser.ImageType imageTypeKWHzl = imageHeaderParser.KWHzl(recyclableBufferedInputStream);
                    recyclableBufferedInputStream.KWHzl();
                    parcelFileDescriptorRewinder.AEQbTJ();
                    return imageTypeKWHzl;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.KWHzl();
                    }
                    parcelFileDescriptorRewinder.AEQbTJ();
                    throw th;
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType KWHzl(@androidx.annotation.NonNull java.util.List<ImageHeaderParser> list, TaskDescription taskDescription) throws java.io.IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeOLrzqt = taskDescription.OLrzqt(list.get(i));
            if (imageTypeOLrzqt != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeOLrzqt;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int copydefault(@androidx.annotation.NonNull java.util.List<ImageHeaderParser> list, @androidx.annotation.Nullable final java.nio.ByteBuffer byteBuffer, @androidx.annotation.NonNull final OF of) throws java.io.IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return AEQbTJ(list, new ActionBar() { // from class: o.NK.2
            @Override // o.NK.ActionBar
            public int copydefault(ImageHeaderParser imageHeaderParser) throws java.io.IOException {
                try {
                    return imageHeaderParser.EZpvd(byteBuffer, of);
                } finally {
                    C5466Su.OLrzqt(byteBuffer);
                }
            }
        });
    }

    public static int copydefault(@androidx.annotation.NonNull java.util.List<ImageHeaderParser> list, @androidx.annotation.Nullable final java.io.InputStream inputStream, @androidx.annotation.NonNull final OF of) throws java.io.IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, of);
        }
        inputStream.mark(5242880);
        return AEQbTJ(list, new ActionBar() { // from class: o.NK.4
            @Override // o.NK.ActionBar
            public int copydefault(ImageHeaderParser imageHeaderParser) throws java.io.IOException {
                try {
                    return imageHeaderParser.EZpvd(inputStream, of);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static int AEQbTJ(@androidx.annotation.NonNull java.util.List<ImageHeaderParser> list, @androidx.annotation.NonNull final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @androidx.annotation.NonNull final OF of) throws java.io.IOException {
        return AEQbTJ(list, new ActionBar() { // from class: o.NK.7
            @Override // o.NK.ActionBar
            public int copydefault(ImageHeaderParser imageHeaderParser) throws java.lang.Throwable {
                RecyclableBufferedInputStream recyclableBufferedInputStream;
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new java.io.FileInputStream(parcelFileDescriptorRewinder.AEQbTJ().getFileDescriptor()), of);
                } catch (java.lang.Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = null;
                }
                try {
                    int iEZpvd = imageHeaderParser.EZpvd(recyclableBufferedInputStream, of);
                    recyclableBufferedInputStream.KWHzl();
                    parcelFileDescriptorRewinder.AEQbTJ();
                    return iEZpvd;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.KWHzl();
                    }
                    parcelFileDescriptorRewinder.AEQbTJ();
                    throw th;
                }
            }
        });
    }

    public static int AEQbTJ(@androidx.annotation.NonNull java.util.List<ImageHeaderParser> list, ActionBar actionBar) throws java.io.IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iCopydefault = actionBar.copydefault(list.get(i));
            if (iCopydefault != -1) {
                return iCopydefault;
            }
        }
        return -1;
    }
}
