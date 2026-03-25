package o;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.myC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33526myC {
    public BarcodeScanner EZpvd;

    public C33526myC() {
        BarcodeScanner client;
        C35959oKa.copydefault.OLrzqt();
        BarcodeScannerOptions.Builder barcodeFormats = new BarcodeScannerOptions.Builder().setBarcodeFormats(256, 8);
        Intrinsics.checkNotNullExpressionValue(barcodeFormats, "");
        try {
            client = BarcodeScanning.getClient(barcodeFormats.build());
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("QRCode", "barcodeScanner init crashes", th);
            client = null;
        }
        this.EZpvd = client;
    }

    public final java.util.List<Barcode> AEQbTJ(@NotNull android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        InputImage inputImageFromBitmap = InputImage.fromBitmap(bitmap, 0);
        Intrinsics.checkNotNullExpressionValue(inputImageFromBitmap, "");
        return copydefault(inputImageFromBitmap);
    }

    public final java.util.List<Barcode> copydefault(@NotNull InputImage inputImage) {
        Intrinsics.checkNotNullParameter(inputImage, "");
        try {
            BarcodeScanner barcodeScanner = this.EZpvd;
            Task<java.util.List<Barcode>> taskProcess = barcodeScanner != null ? barcodeScanner.process(inputImage) : null;
            if (taskProcess != null) {
                return (java.util.List) Tasks.await(taskProcess);
            }
            return null;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("QRCode", "Barcode decode error", th);
            return null;
        }
    }
}
