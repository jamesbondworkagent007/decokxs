package o;

import android.media.Image;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.myJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33533myJ implements ImageAnalysis.Analyzer {
    public boolean AEQbTJ;
    public final C33526myC KWHzl;
    public final Function1<java.lang.String, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C33533myJ(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
        this.KWHzl = new C33526myC();
        this.AEQbTJ = true;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(@NotNull ImageProxy imageProxy) {
        int iHeight;
        int iHeight2;
        java.lang.Object obj;
        java.lang.String rawValue;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(imageProxy, "");
        Image image = imageProxy.getImage();
        if (!this.AEQbTJ || image == null) {
            imageProxy.close();
            return;
        }
        InputImage inputImageFromMediaImage = InputImage.fromMediaImage(image, imageProxy.getImageInfo().getRotationDegrees());
        Intrinsics.checkNotNullExpressionValue(inputImageFromMediaImage, "");
        java.util.List<Barcode> listCopydefault = this.KWHzl.copydefault(inputImageFromMediaImage);
        if (listCopydefault != null && !listCopydefault.isEmpty()) {
            pUU.OLrzqt("QRCode", "Detect " + listCopydefault.size() + " barcodes");
            this.AEQbTJ = false;
            Function1<java.lang.String, Unit> function1 = this.OLrzqt;
            java.util.Iterator<T> it = listCopydefault.iterator();
            if (it.hasNext()) {
                java.lang.Object next = it.next();
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
                obj = next;
            } else {
                obj = null;
            }
            Barcode barcode3 = (Barcode) obj;
            if (barcode3 != null && (rawValue = barcode3.getRawValue()) != null) {
                str = rawValue;
            }
            function1.invoke(str);
        }
        imageProxy.close();
    }
}
