package o;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.camera.video.AudioStats;
import androidx.core.view.ViewCompat;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import com.okinc.barcode.ScanType;
import com.okinc.base.utils.commmon.ThreadUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6993aZp {
    public static final C6993aZp KWHzl = new C6993aZp();
    public static final int OLrzqt = ViewCompat.MEASURED_STATE_MASK;
    public static final int EZpvd = -1;
    public static final int AEQbTJ = 300;
    public static final java.lang.String copydefault = com.google.android.exoplayer2.C.UTF8_NAME;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return AEQbTJ;
    }

    private C6993aZp() {
    }

    public final android.graphics.Bitmap KWHzl(@NotNull BitMatrix bitMatrix, int i) {
        Intrinsics.checkNotNullParameter(bitMatrix, "");
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        int[] iArr = new int[width * height];
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                if (bitMatrix.get(i3, i2)) {
                    iArr[(i2 * width) + i3] = i;
                } else {
                    iArr[(i2 * width) + i3] = EZpvd;
                }
            }
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }

    public final android.graphics.Bitmap OLrzqt(@NotNull BitMatrix bitMatrix, int i, int i2, @NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(bitMatrix, "");
        Intrinsics.checkNotNullParameter(config, "");
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        int[] iArr = new int[width * height];
        for (int i3 = 0; i3 < height; i3++) {
            for (int i4 = 0; i4 < width; i4++) {
                if (bitMatrix.get(i4, i3)) {
                    iArr[(i3 * width) + i4] = i;
                } else {
                    iArr[(i3 * width) + i4] = i2;
                }
            }
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(width, height, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }

    public final BitMatrix AEQbTJ(BitMatrix bitMatrix) {
        int[] enclosingRectangle = bitMatrix.getEnclosingRectangle();
        int i = enclosingRectangle[2] + 1;
        int i2 = enclosingRectangle[3] + 1;
        BitMatrix bitMatrix2 = new BitMatrix(i, i2);
        bitMatrix2.clear();
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (bitMatrix.get(enclosingRectangle[0] + i3, enclosingRectangle[1] + i4)) {
                    bitMatrix2.set(i3, i4);
                }
            }
        }
        return bitMatrix2;
    }

    public static /* synthetic */ android.graphics.Bitmap convert$default(C6993aZp c6993aZp, java.lang.String str, ErrorCorrectionLevel errorCorrectionLevel, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            i = OLrzqt;
        }
        return c6993aZp.KWHzl(str, errorCorrectionLevel, z, i);
    }

    public final android.graphics.Bitmap KWHzl(@NotNull java.lang.String str, @NotNull ErrorCorrectionLevel errorCorrectionLevel, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(errorCorrectionLevel, "");
        int i2 = AEQbTJ;
        return EZpvd(str, i2, i2, z, i, errorCorrectionLevel);
    }

    public static /* synthetic */ android.graphics.Bitmap convert$default(C6993aZp c6993aZp, java.lang.String str, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = OLrzqt;
        }
        return c6993aZp.copydefault(str, z, i);
    }

    public final android.graphics.Bitmap copydefault(@NotNull java.lang.String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        int i2 = AEQbTJ;
        return convert$default(this, str, i2, i2, z, i, null, 32, null);
    }

    public static /* synthetic */ android.graphics.Bitmap convert$default(C6993aZp c6993aZp, java.lang.String str, int i, int i2, boolean z, int i3, ErrorCorrectionLevel errorCorrectionLevel, int i4, java.lang.Object obj) {
        if ((i4 & 32) != 0) {
            errorCorrectionLevel = ErrorCorrectionLevel.L;
        }
        return c6993aZp.EZpvd(str, i, i2, z, i3, errorCorrectionLevel);
    }

    public final android.graphics.Bitmap EZpvd(java.lang.String str, int i, int i2, boolean z, int i3, ErrorCorrectionLevel errorCorrectionLevel) {
        try {
            java.util.HashMap map = new java.util.HashMap();
            map.put(EncodeHintType.ERROR_CORRECTION, errorCorrectionLevel);
            map.put(EncodeHintType.CHARACTER_SET, copydefault);
            map.put(EncodeHintType.MARGIN, 1);
            BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, i, i2, map);
            if (z) {
                Intrinsics.copydefault(bitMatrixEncode);
                bitMatrixEncode = AEQbTJ(bitMatrixEncode);
            }
            Intrinsics.copydefault(bitMatrixEncode);
            return KWHzl(bitMatrixEncode, i3);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final android.graphics.Bitmap KWHzl(@NotNull java.lang.String str, int i, int i2, @NotNull Bitmap.Config config, boolean z, int i3, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(config, "");
        try {
            java.util.HashMap map = new java.util.HashMap();
            map.put(EncodeHintType.CHARACTER_SET, copydefault);
            map.put(EncodeHintType.MARGIN, 1);
            BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, i, i2, map);
            if (z) {
                Intrinsics.copydefault(bitMatrixEncode);
                bitMatrixEncode = AEQbTJ(bitMatrixEncode);
            }
            Intrinsics.copydefault(bitMatrixEncode);
            return OLrzqt(bitMatrixEncode, i3, i4, config);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.lang.String AEQbTJ(android.graphics.Bitmap bitmap) {
        java.lang.Object next;
        int iHeight;
        int iHeight2;
        pUU.KWHzl("QRCode", "Recognize bitmap, use mlkit");
        java.util.List<Barcode> listAEQbTJ = new C33526myC().AEQbTJ(bitmap);
        if (!C33129mqd.KWHzl((java.util.Collection) listAEQbTJ)) {
            return null;
        }
        pUU.OLrzqt("QRCode", "Detect " + (listAEQbTJ != null ? java.lang.Integer.valueOf(listAEQbTJ.size()) : null) + " barcodes");
        if (listAEQbTJ == null) {
            return null;
        }
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Barcode barcode = (Barcode) next;
                android.graphics.Rect boundingBox = barcode.getBoundingBox();
                if (boundingBox != null) {
                    int iWidth = boundingBox.width();
                    android.graphics.Rect boundingBox2 = barcode.getBoundingBox();
                    iHeight = iWidth * (boundingBox2 != null ? boundingBox2.height() : 0);
                } else {
                    iHeight = 0;
                }
                do {
                    java.lang.Object next2 = it.next();
                    Barcode barcode2 = (Barcode) next2;
                    android.graphics.Rect boundingBox3 = barcode2.getBoundingBox();
                    if (boundingBox3 != null) {
                        int iWidth2 = boundingBox3.width();
                        android.graphics.Rect boundingBox4 = barcode2.getBoundingBox();
                        iHeight2 = iWidth2 * (boundingBox4 != null ? boundingBox4.height() : 0);
                    } else {
                        iHeight2 = 0;
                    }
                    if (iHeight < iHeight2) {
                        next = next2;
                        iHeight = iHeight2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Barcode barcode3 = (Barcode) next;
        if (barcode3 != null) {
            return barcode3.getRawValue();
        }
        return null;
    }

    public final android.util.Pair<java.lang.Integer, java.lang.Integer> EZpvd() {
        android.content.res.Resources resources = C43246rlf.OLrzqt.valueOf().getResources();
        Intrinsics.copydefault(resources);
        return new android.util.Pair<>(java.lang.Integer.valueOf(C55302xhQ.EZpvd(resources)), java.lang.Integer.valueOf(C55302xhQ.AEQbTJ(resources)));
    }

    public final void copydefault(@NotNull final android.graphics.Bitmap bitmap, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ThreadUtils.OLrzqt().submit(new java.lang.Runnable() { // from class: o.aZt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C6993aZp.OLrzqt(bitmap, function1);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.String] */
    public static final void OLrzqt(android.graphics.Bitmap bitmap, final Function1 function1) {
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            C6993aZp c6993aZp = KWHzl;
            ?? AEQbTJ2 = c6993aZp.AEQbTJ(bitmap);
            objectRef.element = AEQbTJ2;
            if (AEQbTJ2 == 0) {
                android.util.Pair<java.lang.Integer, java.lang.Integer> pairEZpvd = c6993aZp.EZpvd();
                float fValueOf = C56548yJl.valueOf(((java.lang.Integer) pairEZpvd.first).intValue() / bitmap.getWidth(), ((java.lang.Integer) pairEZpvd.second).intValue() / bitmap.getHeight());
                android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fValueOf), (int) (bitmap.getHeight() * fValueOf), false);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "");
                objectRef.element = c6993aZp.AEQbTJ(bitmapCreateScaledBitmap);
            }
            ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.aZu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C6993aZp.EZpvd(function1, objectRef);
                }
            });
        } catch (java.lang.Exception unused) {
            C6696aUH.EZpvd(ScanType.IMAGE_ASYNC);
            ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.aZx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C6993aZp.copydefault(function1);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(Function1 function1, Ref.ObjectRef objectRef) {
        java.lang.String str = (java.lang.String) objectRef.element;
        if (str != null) {
            C6696aUH.OLrzqt(ScanType.IMAGE_ASYNC);
        } else {
            C6696aUH.EZpvd(ScanType.IMAGE_ASYNC);
            str = null;
        }
        function1.invoke(str);
    }

    public static final void copydefault(Function1 function1) {
        function1.invoke(null);
    }

    public final android.graphics.Bitmap KWHzl(@NotNull java.lang.String str, @NotNull C6994aZq c6994aZq) throws java.lang.Exception {
        int i;
        android.graphics.Canvas canvas;
        byte b;
        android.graphics.Paint paint;
        int i2;
        float f;
        double d;
        double d2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte b2;
        android.graphics.Canvas canvas2;
        int i7;
        android.graphics.Paint paint2;
        double d3;
        int i8;
        float f2;
        int i9;
        float f3;
        ByteMatrix byteMatrix;
        float fRandom;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c6994aZq, "");
        int iDbNXlk = c6994aZq.DbNXlk();
        int iAYXKKw = c6994aZq.AYXKKw();
        android.graphics.Bitmap bitmapGEmmrt = c6994aZq.gEmmrt();
        int iValueOf = c6994aZq.valueOf();
        int iAhwBna = c6994aZq.AhwBna();
        int iFetchVPNInfo = c6994aZq.fetchVPNInfo();
        int iAEQbTJ = c6994aZq.AEQbTJ();
        int iValues = c6994aZq.values();
        int iEZpvd = c6994aZq.EZpvd();
        int iOLrzqt = c6994aZq.OLrzqt();
        float fIsConnected = c6994aZq.isConnected();
        float fCopydefault = c6994aZq.copydefault();
        Bitmap.Config configKWHzl = c6994aZq.KWHzl();
        float fAkhnZx = c6994aZq.AkhnZx();
        double d4 = iValues;
        ByteMatrix matrix = Encoder.encode(str, c6994aZq.djBIcL(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EncodeHintType.CHARACTER_SET, "utf-8"), C56390yDp.OLrzqt(EncodeHintType.MARGIN, 0))).getMatrix();
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int iCopydefault = C56548yJl.copydefault(width, iDbNXlk);
        int iCopydefault2 = C56548yJl.copydefault(height, iAYXKKw);
        double d5 = iCopydefault;
        double d6 = width;
        ByteMatrix byteMatrix2 = matrix;
        double d7 = iCopydefault2;
        double d8 = height;
        double dKWHzl = C56548yJl.KWHzl(d4, C56548yJl.gEmmrt(d5 / (d6 + 2.0d), d7 / (d8 + 2.0d))) * 2.0d;
        double dGEmmrt = C56548yJl.gEmmrt((d5 - dKWHzl) / d6, (d7 - dKWHzl) / d8);
        double d9 = (d5 - (d6 * dGEmmrt)) / 2.0d;
        double d10 = (d7 - (d8 * dGEmmrt)) / 2.0d;
        double d11 = 2;
        float f4 = (float) ((1.0d * dGEmmrt) / d11);
        double d12 = ((double) fAkhnZx) * 0.25d;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setColor(iFetchVPNInfo);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        int i10 = iCopydefault;
        int i11 = iCopydefault2;
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i10, i11, configKWHzl);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        bitmapCreateBitmap.eraseColor(iAEQbTJ);
        android.graphics.Canvas canvas3 = new android.graphics.Canvas(bitmapCreateBitmap);
        int i12 = height;
        int i13 = width;
        BitMatrix bitMatrix = new BitMatrix(i13, i12);
        double d13 = d9;
        if (iEZpvd == 2) {
            canvas = canvas3;
            i = iEZpvd;
            b = 1;
            f = fCopydefault;
            paint = paint3;
            i2 = iOLrzqt;
            OLrzqt(i10, i11, i13, i12, f4, paint, canvas, iFetchVPNInfo, bitMatrix, fIsConnected);
        } else {
            i = iEZpvd;
            canvas = canvas3;
            b = 1;
            paint = paint3;
            i2 = iOLrzqt;
            f = fCopydefault;
        }
        double d14 = dGEmmrt / ((double) 4);
        int i14 = 0;
        while (i14 < i12) {
            int i15 = 0;
            while (i15 < i13) {
                ByteMatrix byteMatrix3 = byteMatrix2;
                if (byteMatrix3.get(i15, i14) != b) {
                    d = dGEmmrt;
                    d2 = d10;
                    i3 = i10;
                    i4 = i12;
                    i5 = i11;
                    i6 = i14;
                    b2 = b;
                    canvas2 = canvas;
                    i7 = i15;
                    paint2 = paint;
                    d3 = d13;
                    i8 = i2;
                    f2 = f;
                    i9 = i13;
                    f3 = f4;
                    byteMatrix = byteMatrix3;
                } else if ((((i15 >= 7 || i14 >= 7) && i15 < i13 - 7) || i14 >= 7) && (i15 >= 7 || i14 < i12 - 7)) {
                    android.graphics.Canvas canvas4 = canvas;
                    int i16 = i15;
                    double d15 = d13;
                    i9 = i13;
                    byteMatrix = byteMatrix3;
                    i8 = i2;
                    if (i8 == 0) {
                        f2 = f;
                        d = dGEmmrt;
                        d2 = d10;
                        i3 = i10;
                        i4 = i12;
                        f3 = f4;
                        i5 = i11;
                        i6 = i14;
                        d3 = d15;
                        paint2 = paint;
                        i7 = i16;
                        b2 = 1;
                        canvas2 = canvas4;
                        double d16 = (((double) (1.0f - f2)) * d) / d11;
                        double d17 = d2 + (((double) i6) * d) + d16;
                        double d18 = d3 + (((double) i7) * d) + d16;
                        double d19 = ((double) f2) * d;
                        canvas2.drawRect((float) d18, (float) d17, (float) (d18 + d19), (float) (d17 + d19), paint2);
                    } else if (i8 == 1) {
                        f2 = f;
                        d = dGEmmrt;
                        d2 = d10;
                        i3 = i10;
                        i4 = i12;
                        float f5 = f4;
                        i5 = i11;
                        i6 = i14;
                        d3 = d15;
                        paint2 = paint;
                        canvas2 = canvas4;
                        double d20 = i6;
                        double d21 = f5;
                        i7 = i16;
                        double d22 = i7;
                        if (d12 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                            fRandom = f5 * f2;
                            f3 = f5;
                            b2 = 1;
                        } else {
                            f3 = f5;
                            b2 = 1;
                            fRandom = ((int) ((((double) 1) + ((java.lang.Math.random() - 0.5d) * d12 * d11)) * d21)) * f2;
                        }
                        canvas2.drawCircle((float) (d3 + (d22 * d) + d21), (float) (d2 + (d20 * d) + d21), fRandom, paint2);
                    } else {
                        f2 = f;
                        i4 = i12;
                        double d23 = (((double) (1.0f - f2)) * dGEmmrt) / d11;
                        double d24 = (((double) i14) * dGEmmrt) + d10 + d23;
                        d2 = d10;
                        i5 = i11;
                        int i17 = i14;
                        double d25 = 6.283185307179586d / ((double) i8);
                        android.graphics.Path path = new android.graphics.Path();
                        double d26 = d25 / d11;
                        double d27 = d26 - 1.5707963267948966d;
                        double d28 = f4;
                        double d29 = (((double) i16) * dGEmmrt) + d15 + d23 + d28;
                        i3 = i10;
                        path.moveTo((float) d29, (float) d24);
                        double d30 = d24 + d28;
                        d3 = d15;
                        path.lineTo((float) ((java.lang.Math.cos(d27) * d14) + d29), (float) (d30 + (java.lang.Math.sin(d27) * d14)));
                        int i18 = 1;
                        while (i18 < i8) {
                            double d31 = ((double) i18) * d25;
                            double d32 = d31 - 1.5707963267948966d;
                            double d33 = dGEmmrt;
                            double d34 = f2;
                            path.lineTo((float) (d29 + (java.lang.Math.cos(d32) * d28 * d34)), (float) (d30 + (java.lang.Math.sin(d32) * d28 * d34)));
                            double d35 = (d31 + d26) - 1.5707963267948966d;
                            path.lineTo((float) ((java.lang.Math.cos(d35) * d14) + d29), (float) ((java.lang.Math.sin(d35) * d14) + d30));
                            i18++;
                            f4 = f4;
                            dGEmmrt = d33;
                        }
                        d = dGEmmrt;
                        f3 = f4;
                        path.close();
                        canvas2 = canvas4;
                        paint2 = paint;
                        canvas2.drawPath(path, paint2);
                        i6 = i17;
                        i7 = i16;
                        b2 = 1;
                    }
                } else {
                    android.graphics.Canvas canvas5 = canvas;
                    double d36 = d13;
                    i9 = i13;
                    byteMatrix = byteMatrix3;
                    int i19 = i15;
                    KWHzl(i, (float) d10, (float) d36, (float) dGEmmrt, paint, canvas5, i19, i14, f);
                    f2 = f;
                    d = dGEmmrt;
                    d2 = d10;
                    i3 = i10;
                    i4 = i12;
                    f3 = f4;
                    i5 = i11;
                    i6 = i14;
                    d3 = d36;
                    paint2 = paint;
                    i8 = i2;
                    i7 = i19;
                    b2 = 1;
                    canvas2 = canvas5;
                }
                int i20 = i7 + 1;
                f4 = f3;
                paint = paint2;
                canvas = canvas2;
                i14 = i6;
                i2 = i8;
                b = b2;
                f = f2;
                i12 = i4;
                i11 = i5;
                i13 = i9;
                byteMatrix2 = byteMatrix;
                i10 = i3;
                d13 = d3;
                dGEmmrt = d;
                i15 = i20;
                d10 = d2;
            }
            i14++;
            f = f;
            d10 = d10;
            d13 = d13;
            dGEmmrt = dGEmmrt;
        }
        int i21 = i10;
        int i22 = i11;
        android.graphics.Canvas canvas6 = canvas;
        if (bitmapGEmmrt == null) {
            return bitmapCreateBitmap;
        }
        KWHzl.copydefault(canvas6, bitmapGEmmrt, i21, i22, iValueOf, iAhwBna);
        return bitmapCreateBitmap;
    }

    public final void copydefault(android.graphics.Canvas canvas, android.graphics.Bitmap bitmap, int i, int i2, int i3, int i4) {
        try {
            int iSave = canvas.save();
            float f = i;
            float f2 = i2;
            float f3 = 2;
            canvas.scale(i3 / f, i4 / f2, f / f3, f2 / f3);
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, new RectF(0.0f, 0.0f, f, f2), (android.graphics.Paint) null);
            canvas.restoreToCount(iSave);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public final android.graphics.Bitmap KWHzl(java.lang.String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, float f2, @NotNull Bitmap.Config config, float f3, @NotNull ErrorCorrectionLevel errorCorrectionLevel) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(config, "");
        Intrinsics.checkNotNullParameter(errorCorrectionLevel, "");
        return KWHzl(str != null ? str : "", new C6994aZq(i, i2, null, 0, 0, i3, i4, i5, i6, i7, f, f2, config, f3, errorCorrectionLevel, 28, null));
    }

    public final void OLrzqt(int i, int i2, int i3, int i4, float f, android.graphics.Paint paint, android.graphics.Canvas canvas, int i5, BitMatrix bitMatrix, float f2) {
        float f3 = 2;
        float f4 = f * f3;
        float f5 = i3 * f4;
        float f6 = i4 * f4;
        float f7 = (i - f5) / f3;
        float f8 = (i2 - f6) / f3;
        float f9 = 7 * f;
        float f10 = 3 * f * f2;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(i5);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(f4 * f2);
        float f11 = f7 + f9;
        float f12 = f8 + f9;
        canvas.drawCircle(f11, f12, f10, paint);
        float f13 = (f5 + f7) - f9;
        canvas.drawCircle(f13, f12, f10, paint);
        float f14 = (f6 + f8) - f9;
        canvas.drawCircle(f11, f14, f10, paint);
        float f15 = 6 * f;
        canvas.drawCircle(f11, f12, f15, paint2);
        canvas.drawCircle(f13, f12, f15, paint2);
        canvas.drawCircle(f11, f14, f15, paint2);
        bitMatrix.setRegion(0, 0, 7, 7);
        bitMatrix.setRegion(i3 - 7, 0, 7, 7);
        bitMatrix.setRegion(0, i4 - 7, 7, 7);
    }

    public final void KWHzl(int i, float f, float f2, float f3, android.graphics.Paint paint, android.graphics.Canvas canvas, int i2, int i3, float f4) {
        int i4 = i;
        if (i4 == 0) {
            float f5 = ((1.0f - f4) * f3) / 2;
            float f6 = f + (i3 * f3) + f5;
            float f7 = f2 + (i2 * f3) + f5;
            float f8 = f3 * f4;
            canvas.drawRect(f7, f6, f7 + f8, f6 + f8, paint);
            return;
        }
        if (i4 == 1) {
            double d = 2;
            float f9 = (float) ((((double) f3) * 1.0d) / d);
            canvas.drawCircle(f2 + (i2 * f3) + f9, f + (i3 * f3) + f9, (float) ((((double) (f3 * f4)) * 1.0d) / d), paint);
            return;
        }
        if (i4 == 3 || i4 == 4 || i4 == 5 || i4 == 6) {
            float f10 = f + (i3 * f3);
            double d2 = 6.283185307179586d / ((double) i4);
            android.graphics.Path path = new android.graphics.Path();
            double d3 = d2 / ((double) 2);
            double d4 = d3 - 1.5707963267948966d;
            float f11 = f3 / 2;
            float f12 = f2 + (i2 * f3) + f11;
            path.moveTo(f12, f10);
            double d5 = f12;
            double d6 = f3 / 4;
            double d7 = f10 + f11;
            path.lineTo((float) (d5 + (java.lang.Math.cos(d4) * d6)), (float) ((java.lang.Math.sin(d4) * d6) + d7));
            int i5 = 1;
            while (i5 < i4) {
                double d8 = d6;
                double d9 = ((double) i5) * d2;
                double d10 = d9 - 1.5707963267948966d;
                double d11 = f11;
                path.lineTo((float) (d5 + (java.lang.Math.cos(d10) * d11)), (float) (d7 + (java.lang.Math.sin(d10) * d11)));
                double d12 = (d9 + d3) - 1.5707963267948966d;
                path.lineTo((float) ((java.lang.Math.cos(d12) * d8) + d5), (float) ((java.lang.Math.sin(d12) * d8) + d7));
                i4 = i;
                i5++;
                d6 = d8;
                d2 = d2;
            }
            path.close();
            canvas.drawPath(path, paint);
        }
    }
}
