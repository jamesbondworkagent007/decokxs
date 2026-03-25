package o;

import android.graphics.Bitmap;
import com.okinc.share.bean.image.ImageFooterConfig;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import o.InterfaceC48895ueM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ume, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49337ume {
    public static final C49337ume KWHzl = new C49337ume();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault(int i) {
        return i != 1 ? i != 2 ? i != 3 ? C48931uew.Application.uzCIH : C48931uew.Application.zsXlph : C48931uew.Application.iwGUEr : C48931uew.Application.getNewProxyInstance;
    }

    private C49337ume() {
    }

    public final int OLrzqt(android.content.Context context) {
        return java.lang.Math.min(C55298xhM.OLrzqt(360, context), C33570myu.djBIcL(context));
    }

    public final android.graphics.Bitmap copydefault(@NotNull android.app.Activity activity, @NotNull ImageFooterConfig imageFooterConfig) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(imageFooterConfig, "");
        try {
            android.view.View viewInflate = android.view.LayoutInflater.from(activity).inflate(copydefault(imageFooterConfig.getTheme()), (android.view.ViewGroup) null);
            final C49352umt c49352umt = (C49352umt) viewInflate.findViewById(C48931uew.StateListAnimator.AwvSrB);
            java.lang.String shareFrom = imageFooterConfig.getShareFrom();
            if (shareFrom != null) {
                c49352umt.setFrom(shareFrom);
            }
            java.lang.String title = imageFooterConfig.getTitle();
            if (title != null) {
                c49352umt.setTitle(title);
            }
            java.lang.String subtitle = imageFooterConfig.getSubtitle();
            if (subtitle != null) {
                c49352umt.setSubTitle(subtitle);
            }
            if (!imageFooterConfig.getEnableLogo()) {
                c49352umt.setIcon(null);
            }
            if (imageFooterConfig.getQrcode() != null) {
                c49352umt.setQRCode(imageFooterConfig.getQrcode());
            } else {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                InterfaceC48895ueM.Application.setSrcFrom$default(c49352umt, null, new Function0() { // from class: o.umi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C49337ume.OLrzqt(countDownLatch, c49352umt);
                    }
                }, 1, null);
                countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            C33487mxQ.EZpvd(viewInflate, OLrzqt(activity), C55298xhM.OLrzqt(200, (android.content.Context) activity));
            android.graphics.Bitmap bitmapAEQbTJ = C33570myu.AEQbTJ(viewInflate, true);
            pUU.KWHzl("FooterGenerator", "createFooterBitmap->w:" + (bitmapAEQbTJ != null ? java.lang.Integer.valueOf(bitmapAEQbTJ.getWidth()) : null) + "  h:" + (bitmapAEQbTJ != null ? java.lang.Integer.valueOf(bitmapAEQbTJ.getHeight()) : null));
            return bitmapAEQbTJ;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.copydefault("FooterGenerator", "createFooterBitmap->occur error:" + e.getMessage() + "}");
            return null;
        }
    }

    public static final Unit OLrzqt(CountDownLatch countDownLatch, C49352umt c49352umt) {
        countDownLatch.countDown();
        pUU.KWHzl("FooterGenerator", "await->setSrcFrom-> from:" + c49352umt.AEQbTJ() + "  qrcode:" + c49352umt.OLrzqt());
        return Unit.INSTANCE;
    }

    public final android.graphics.Bitmap EZpvd(@NotNull android.app.Activity activity, @NotNull android.graphics.Bitmap bitmap, @NotNull android.graphics.Bitmap bitmap2, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        Intrinsics.checkNotNullParameter(bitmap2, "");
        if (i == 1) {
            return KWHzl(activity, bitmap, bitmap2);
        }
        return OLrzqt(activity, bitmap, bitmap2);
    }

    public final android.graphics.Bitmap KWHzl(android.app.Activity activity, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        try {
            int iOLrzqt = OLrzqt(activity);
            float f = iOLrzqt;
            int height = (int) ((bitmap.getHeight() / bitmap.getWidth()) * f);
            int height2 = ((int) (bitmap2.getHeight() * (f / bitmap2.getWidth()))) + height;
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iOLrzqt, height2, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, new android.graphics.Rect(0, 0, iOLrzqt, height), (android.graphics.Paint) null);
            canvas.drawBitmap(bitmap2, (android.graphics.Rect) null, new android.graphics.Rect(0, height, iOLrzqt, height2), (android.graphics.Paint) null);
            pUU.KWHzl("FooterGenerator", "compositeAppendBitmap->bmp->w:" + bitmapCreateBitmap.getWidth() + "  h:" + bitmapCreateBitmap.getHeight());
            return bitmapCreateBitmap;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.copydefault("FooterGenerator", "compositeAppendBitmap->occur Exception:" + e.getMessage());
            return null;
        } catch (java.lang.OutOfMemoryError e2) {
            e2.printStackTrace();
            pUU.copydefault("FooterGenerator", "compositeAppendBitmap->occur OutOfMemoryError:" + e2.getMessage());
            return null;
        }
    }

    public final android.graphics.Bitmap OLrzqt(android.app.Activity activity, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        try {
            int iOLrzqt = OLrzqt(activity);
            int height = (int) ((bitmap.getHeight() / bitmap.getWidth()) * iOLrzqt);
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iOLrzqt, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, new android.graphics.Rect(0, 0, iOLrzqt, height), (android.graphics.Paint) null);
            canvas.drawBitmap(bitmap2, (android.graphics.Rect) null, new android.graphics.Rect(0, bitmapCreateBitmap.getHeight() - ((int) (bitmap2.getHeight() * (bitmapCreateBitmap.getWidth() / bitmap2.getWidth()))), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), (android.graphics.Paint) null);
            pUU.KWHzl("FooterGenerator", "compositeOverlayBitmap->bmp->w:" + java.lang.Integer.valueOf(bitmapCreateBitmap.getWidth()) + "  h:" + java.lang.Integer.valueOf(bitmapCreateBitmap.getHeight()));
            return bitmapCreateBitmap;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.copydefault("FooterGenerator", "compositeOverlayBitmap->occur Exception:" + e.getMessage());
            return null;
        } catch (java.lang.OutOfMemoryError e2) {
            e2.printStackTrace();
            pUU.copydefault("FooterGenerator", "compositeOverlayBitmap->occur OutOfMemoryError:" + e2.getMessage());
            return null;
        }
    }
}
