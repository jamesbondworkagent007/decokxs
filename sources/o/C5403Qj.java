package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Queue;
import o.InterfaceC5415Qv;

/* JADX INFO: renamed from: o.Qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5403Qj {
    public static final NJ<java.lang.Boolean> EZpvd;
    public static final NJ<java.lang.Boolean> OLrzqt;
    public static final Application copydefault;
    public static final java.util.Set<ImageHeaderParser.ImageType> djBIcL;
    public static final Queue<BitmapFactory.Options> gEmmrt;
    public static final java.util.Set<java.lang.String> valueOf;
    public final OG AYXKKw;
    public final C5414Qu AkhnZx = C5414Qu.EZpvd();
    public final android.util.DisplayMetrics DbNXlk;
    public final OF fetchVPNInfo;
    public final java.util.List<ImageHeaderParser> values;
    public static final NJ<DecodeFormat> AEQbTJ = NJ.OLrzqt("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);
    public static final NJ<PreferredColorSpace> AhwBna = NJ.OLrzqt("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    @java.lang.Deprecated
    public static final NJ<DownsampleStrategy> KWHzl = DownsampleStrategy.valueOf;

    /* JADX INFO: renamed from: o.Qj$Application */
    public interface Application {
        void EZpvd();

        void KWHzl(OG og, android.graphics.Bitmap bitmap) throws java.io.IOException;
    }

    public static int EZpvd(double d) {
        return (int) (d + 0.5d);
    }

    public static boolean copydefault(int i) {
        return i == 90 || i == 270;
    }

    public final boolean AEQbTJ(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public boolean AEQbTJ(java.io.InputStream inputStream) {
        return true;
    }

    public boolean copydefault(java.nio.ByteBuffer byteBuffer) {
        return true;
    }

    static {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        EZpvd = NJ.OLrzqt("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        OLrzqt = NJ.OLrzqt("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        valueOf = Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        copydefault = new Application() { // from class: o.Qj.1
            @Override // o.C5403Qj.Application
            public void EZpvd() {
            }

            @Override // o.C5403Qj.Application
            public void KWHzl(OG og, android.graphics.Bitmap bitmap) {
            }
        };
        djBIcL = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        gEmmrt = SI.copydefault(0);
    }

    public C5403Qj(java.util.List<ImageHeaderParser> list, android.util.DisplayMetrics displayMetrics, OG og, OF of) {
        this.values = list;
        this.DbNXlk = (android.util.DisplayMetrics) SE.OLrzqt(displayMetrics);
        this.AYXKKw = (OG) SE.OLrzqt(og);
        this.fetchVPNInfo = (OF) SE.OLrzqt(of);
    }

    public boolean KWHzl(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.KWHzl();
    }

    public OC<android.graphics.Bitmap> EZpvd(java.nio.ByteBuffer byteBuffer, int i, int i2, NM nm) throws java.io.IOException {
        return AEQbTJ(new InterfaceC5415Qv.StateListAnimator(byteBuffer, this.values, this.fetchVPNInfo), i, i2, nm, copydefault);
    }

    public OC<android.graphics.Bitmap> AEQbTJ(java.io.InputStream inputStream, int i, int i2, NM nm, Application application) throws java.io.IOException {
        return AEQbTJ(new InterfaceC5415Qv.Application(inputStream, this.values, this.fetchVPNInfo), i, i2, nm, application);
    }

    public OC<android.graphics.Bitmap> OLrzqt(android.os.ParcelFileDescriptor parcelFileDescriptor, int i, int i2, NM nm) throws java.io.IOException {
        return AEQbTJ(new InterfaceC5415Qv.TaskDescription(parcelFileDescriptor, this.values, this.fetchVPNInfo), i, i2, nm, copydefault);
    }

    public final OC<android.graphics.Bitmap> AEQbTJ(InterfaceC5415Qv interfaceC5415Qv, int i, int i2, NM nm, Application application) throws java.io.IOException {
        byte[] bArr = (byte[]) this.fetchVPNInfo.EZpvd(65536, byte[].class);
        BitmapFactory.Options optionsOLrzqt = OLrzqt();
        optionsOLrzqt.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) nm.OLrzqt(AEQbTJ);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) nm.OLrzqt(AhwBna);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) nm.OLrzqt(DownsampleStrategy.valueOf);
        boolean zBooleanValue = ((java.lang.Boolean) nm.OLrzqt(EZpvd)).booleanValue();
        NJ<java.lang.Boolean> nj = OLrzqt;
        try {
            return C5398Qe.copydefault(EZpvd(interfaceC5415Qv, optionsOLrzqt, downsampleStrategy, decodeFormat, preferredColorSpace, nm.OLrzqt(nj) != null && ((java.lang.Boolean) nm.OLrzqt(nj)).booleanValue(), i, i2, zBooleanValue, application), this.AYXKKw);
        } finally {
            OLrzqt(optionsOLrzqt);
            this.fetchVPNInfo.EZpvd(bArr);
        }
    }

    public final android.graphics.Bitmap EZpvd(InterfaceC5415Qv interfaceC5415Qv, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i, int i2, boolean z2, Application application) throws java.io.IOException {
        int i3;
        int iRound;
        int iRound2;
        int i4;
        long jCopydefault = SF.copydefault();
        int[] iArrEZpvd = EZpvd(interfaceC5415Qv, options, application, this.AYXKKw);
        int i5 = iArrEZpvd[0];
        int i6 = iArrEZpvd[1];
        java.lang.String str = options.outMimeType;
        boolean z3 = (i5 == -1 || i6 == -1) ? false : z;
        int iEZpvd = interfaceC5415Qv.EZpvd();
        int iAEQbTJ = QB.AEQbTJ(iEZpvd);
        boolean zCopydefault = QB.copydefault(iEZpvd);
        if (i == Integer.MIN_VALUE) {
            i3 = i2;
            iRound = copydefault(iAEQbTJ) ? i6 : i5;
        } else {
            i3 = i2;
            iRound = i;
        }
        if (i3 == Integer.MIN_VALUE) {
            iRound2 = copydefault(iAEQbTJ) ? i5 : i6;
        } else {
            iRound2 = i3;
        }
        ImageHeaderParser.ImageType imageTypeOLrzqt = interfaceC5415Qv.OLrzqt();
        EZpvd(imageTypeOLrzqt, interfaceC5415Qv, application, this.AYXKKw, downsampleStrategy, iAEQbTJ, i5, i6, iRound, iRound2, options);
        KWHzl(interfaceC5415Qv, decodeFormat, z3, zCopydefault, options, iRound, iRound2);
        int i7 = Build.VERSION.SDK_INT;
        if (AEQbTJ(imageTypeOLrzqt)) {
            if (i5 < 0 || i6 < 0 || !z2) {
                float f = EZpvd(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                float f2 = options.inSampleSize;
                int iCeil = (int) java.lang.Math.ceil(i5 / f2);
                int iCeil2 = (int) java.lang.Math.ceil(i6 / f2);
                iRound = java.lang.Math.round(iCeil * f);
                iRound2 = java.lang.Math.round(iCeil2 * f);
                if (android.util.Log.isLoggable("Downsampler", 2)) {
                    int i8 = options.inTargetDensity;
                    int i9 = options.inDensity;
                }
            }
            int i10 = iRound;
            int i11 = iRound2;
            if (i10 > 0 && i11 > 0) {
                AEQbTJ(options, this.AYXKKw, i10, i11);
            }
        }
        if (preferredColorSpace != null) {
            if (i7 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i7 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        android.graphics.Bitmap bitmapKWHzl = KWHzl(interfaceC5415Qv, options, application, this.AYXKKw);
        application.KWHzl(this.AYXKKw, bitmapKWHzl);
        if (android.util.Log.isLoggable("Downsampler", 2)) {
            i4 = iEZpvd;
            copydefault(i5, i6, str, options, bitmapKWHzl, i, i2, jCopydefault);
        } else {
            i4 = iEZpvd;
        }
        if (bitmapKWHzl == null) {
            return null;
        }
        bitmapKWHzl.setDensity(this.DbNXlk.densityDpi);
        android.graphics.Bitmap bitmapEZpvd = QB.EZpvd(this.AYXKKw, bitmapKWHzl, i4);
        if (bitmapKWHzl.equals(bitmapEZpvd)) {
            return bitmapEZpvd;
        }
        this.AYXKKw.copydefault(bitmapKWHzl);
        return bitmapEZpvd;
    }

    public static void EZpvd(ImageHeaderParser.ImageType imageType, InterfaceC5415Qv interfaceC5415Qv, Application application, OG og, DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws java.io.IOException {
        int i6;
        int i7;
        int iMin;
        int iFloor;
        int iFloor2;
        if (i2 <= 0 || i3 <= 0) {
            if (android.util.Log.isLoggable("Downsampler", 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (copydefault(i)) {
            i7 = i2;
            i6 = i3;
        } else {
            i6 = i2;
            i7 = i3;
        }
        float fCopydefault = downsampleStrategy.copydefault(i6, i7, i4, i5);
        if (fCopydefault <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Cannot scale with factor: " + fCopydefault + " from: " + downsampleStrategy + ", source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "]");
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingOLrzqt = downsampleStrategy.OLrzqt(i6, i7, i4, i5);
        if (sampleSizeRoundingOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("Cannot round with null rounding");
        }
        float f = i6;
        float f2 = i7;
        int iEZpvd = i6 / EZpvd(fCopydefault * f);
        int iEZpvd2 = i7 / EZpvd(fCopydefault * f2);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        if (sampleSizeRoundingOLrzqt == sampleSizeRounding) {
            iMin = java.lang.Math.max(iEZpvd, iEZpvd2);
        } else {
            iMin = java.lang.Math.min(iEZpvd, iEZpvd2);
        }
        int iMax = java.lang.Math.max(1, java.lang.Integer.highestOneBit(iMin));
        if (sampleSizeRoundingOLrzqt == sampleSizeRounding && iMax < 1.0f / fCopydefault) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = java.lang.Math.min(iMax, 8);
            iFloor = (int) java.lang.Math.ceil(f / fMin);
            iFloor2 = (int) java.lang.Math.ceil(f2 / fMin);
            int i8 = iMax / 8;
            if (i8 > 0) {
                iFloor /= i8;
                iFloor2 /= i8;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f3 = iMax;
            iFloor = (int) java.lang.Math.floor(f / f3);
            iFloor2 = (int) java.lang.Math.floor(f2 / f3);
        } else if (imageType.isWebp()) {
            float f4 = iMax;
            iFloor = java.lang.Math.round(f / f4);
            iFloor2 = java.lang.Math.round(f2 / f4);
        } else if (i6 % iMax != 0 || i7 % iMax != 0) {
            int[] iArrEZpvd = EZpvd(interfaceC5415Qv, options, application, og);
            iFloor = iArrEZpvd[0];
            iFloor2 = iArrEZpvd[1];
        } else {
            iFloor = i6 / iMax;
            iFloor2 = i7 / iMax;
        }
        double dCopydefault = downsampleStrategy.copydefault(iFloor, iFloor2, i4, i5);
        options.inTargetDensity = KWHzl(dCopydefault);
        options.inDensity = OLrzqt(dCopydefault);
        if (EZpvd(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (android.util.Log.isLoggable("Downsampler", 2)) {
            int i9 = options.inTargetDensity;
            int i10 = options.inDensity;
        }
    }

    public static int KWHzl(double d) {
        int iOLrzqt = OLrzqt(d);
        int iEZpvd = EZpvd(((double) iOLrzqt) * d);
        return EZpvd((d / ((double) (iEZpvd / iOLrzqt))) * ((double) iEZpvd));
    }

    public static int OLrzqt(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) java.lang.Math.round(d * 2.147483647E9d);
    }

    public final void KWHzl(InterfaceC5415Qv interfaceC5415Qv, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (this.AkhnZx.copydefault(i, i2, options, z, z2)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
        } catch (java.io.IOException unused) {
            if (android.util.Log.isLoggable("Downsampler", 3)) {
                Objects.toString(decodeFormat);
            }
        }
        Bitmap.Config config = interfaceC5415Qv.OLrzqt().hasAlpha() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    public static int[] EZpvd(InterfaceC5415Qv interfaceC5415Qv, BitmapFactory.Options options, Application application, OG og) throws java.io.IOException {
        options.inJustDecodeBounds = true;
        KWHzl(interfaceC5415Qv, options, application, og);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.graphics.Bitmap KWHzl(InterfaceC5415Qv interfaceC5415Qv, BitmapFactory.Options options, Application application, OG og) throws java.io.IOException {
        android.graphics.Bitmap bitmapKWHzl;
        if (!options.inJustDecodeBounds) {
            application.EZpvd();
            interfaceC5415Qv.KWHzl();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        java.lang.String str = options.outMimeType;
        QB.KWHzl().lock();
        try {
            try {
                bitmapKWHzl = interfaceC5415Qv.EZpvd(options);
            } catch (java.lang.IllegalArgumentException e) {
                java.io.IOException iOExceptionEZpvd = EZpvd(e, i, i2, str, options);
                android.graphics.Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        og.copydefault(bitmap);
                        options.inBitmap = null;
                        bitmapKWHzl = KWHzl(interfaceC5415Qv, options, application, og);
                    } catch (java.io.IOException unused) {
                        throw iOExceptionEZpvd;
                    }
                } else {
                    throw iOExceptionEZpvd;
                }
            }
            return bitmapKWHzl;
        } finally {
            QB.KWHzl().unlock();
        }
    }

    public static boolean EZpvd(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        return i2 > 0 && (i = options.inDensity) > 0 && i2 != i;
    }

    public static void copydefault(int i, int i2, java.lang.String str, BitmapFactory.Options options, android.graphics.Bitmap bitmap, int i3, int i4, long j) {
        AEQbTJ(bitmap);
        AEQbTJ(options);
        int i5 = options.inSampleSize;
        int i6 = options.inDensity;
        int i7 = options.inTargetDensity;
        java.lang.Thread.currentThread().getName();
        SF.OLrzqt(j);
    }

    public static java.lang.String AEQbTJ(BitmapFactory.Options options) {
        return AEQbTJ(options.inBitmap);
    }

    public static java.lang.String AEQbTJ(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static java.io.IOException EZpvd(java.lang.IllegalArgumentException illegalArgumentException, int i, int i2, java.lang.String str, BitmapFactory.Options options) {
        return new java.io.IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + AEQbTJ(options), illegalArgumentException);
    }

    public static void AEQbTJ(BitmapFactory.Options options, OG og, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = og.KWHzl(i, i2, config);
    }

    public static BitmapFactory.Options OLrzqt() {
        BitmapFactory.Options optionsPoll;
        synchronized (C5403Qj.class) {
            Queue<BitmapFactory.Options> queue = gEmmrt;
            synchronized (queue) {
                optionsPoll = queue.poll();
            }
            if (optionsPoll == null) {
                optionsPoll = new BitmapFactory.Options();
                copydefault(optionsPoll);
            }
        }
        return optionsPoll;
    }

    public static void OLrzqt(BitmapFactory.Options options) {
        copydefault(options);
        Queue<BitmapFactory.Options> queue = gEmmrt;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void copydefault(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }
}
