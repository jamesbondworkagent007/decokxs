package o;

import com.okinc.share.api.RedirectBehavior;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.api.screenshot.ScreenshotListenerHolder;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.TriggerSource;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.screenshot.Falcon;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C33440mwW;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ujh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49181ujh {
    public static android.content.Context copydefault;
    public static final C49181ujh EZpvd = new C49181ujh();
    public static final android.os.Handler KWHzl = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ujl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49181ujh.KWHzl();
        }
    });
    public static final int AEQbTJ = 8;

    private C49181ujh() {
    }

    public static final InterfaceC48893ueK KWHzl() {
        return (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
    }

    public final InterfaceC48893ueK copydefault() {
        return (InterfaceC48893ueK) OLrzqt.getValue();
    }

    public final void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (copydefault == null) {
            copydefault = context;
            C33440mwW.copydefault.EZpvd(new TaskDescription());
        }
    }

    /* JADX INFO: renamed from: o.ujh$TaskDescription */
    public static final class TaskDescription implements C33440mwW.TaskDescription {
        @Override // o.C33440mwW.TaskDescription
        public void onScreenShot(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            C49181ujh c49181ujh = C49181ujh.EZpvd;
            boolean zUeEOUB = c49181ujh.copydefault().UeEOUB();
            pUU.EZpvd("ShareScreenshotMonitor", "onScreenShot->isScreenshotShareEnable:" + zUeEOUB);
            if (zUeEOUB) {
                c49181ujh.EZpvd(activity);
            }
        }
    }

    public final void KWHzl(android.app.Activity activity) {
        java.lang.String name;
        if (activity instanceof AbstractActivityC33041mov) {
            name = ((AbstractActivityC33041mov) activity).getQPLSourceName();
        } else {
            name = activity.getClass().getName();
        }
        C48992ugD c48992ugD = C48992ugD.KWHzl;
        Intrinsics.copydefault((java.lang.Object) name);
        c48992ugD.copydefault(name);
        pUU.EZpvd("ShareScreenshotMonitor", "onScreenShot->pageName:" + name);
    }

    public final void EZpvd(android.app.Activity activity) {
        pUU.valueOf("ShareScreenshotMonitor", "handleOnScreenshot->activity:" + activity);
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        AbstractActivityC33041mov abstractActivityC33041mov = activityAEQbTJ instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityAEQbTJ : null;
        if (abstractActivityC33041mov == null) {
            return;
        }
        boolean zAKErDB = copydefault().aKErDB();
        if (!abstractActivityC33041mov.canScreenshot() || zAKErDB) {
            return;
        }
        InterfaceC48966ufe interfaceC48966ufe = abstractActivityC33041mov instanceof InterfaceC48966ufe ? (InterfaceC48966ufe) abstractActivityC33041mov : null;
        if (interfaceC48966ufe != null) {
            final android.graphics.Bitmap bitmapBuildBitmapWithActivity$default = buildBitmapWithActivity$default(this, abstractActivityC33041mov, false, 2, null);
            pUU.EZpvd("ShareScreenshotMonitor", "Activity handleOnScreenshot->" + abstractActivityC33041mov.getClass().getSimpleName() + " is a IShareScreenshotHandler");
            interfaceC48966ufe.KWHzl(new C48972ufk(bitmapBuildBitmapWithActivity$default, "screenshot"), new Function1() { // from class: o.ujs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49181ujh.copydefault(bitmapBuildBitmapWithActivity$default, (MultiShareConfig) obj);
                }
            });
            return;
        }
        ScreenshotListenerHolder screenshotListenerHolder = ScreenshotListenerHolder.KWHzl;
        if (screenshotListenerHolder.AEQbTJ() != null) {
            final android.graphics.Bitmap bitmapBuildBitmapWithActivity$default2 = buildBitmapWithActivity$default(this, abstractActivityC33041mov, false, 2, null);
            pUU.EZpvd("ShareScreenshotMonitor", "Fragment handleOnScreenshot->hasActivatedListener");
            screenshotListenerHolder.EZpvd(new C48972ufk(bitmapBuildBitmapWithActivity$default2, "screenshot"), new Function1() { // from class: o.ujp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49181ujh.KWHzl(bitmapBuildBitmapWithActivity$default2, (MultiShareConfig) obj);
                }
            });
            return;
        }
        pUU.EZpvd("ShareScreenshotMonitor", "handleOnScreenshot->" + abstractActivityC33041mov.getClass().getSimpleName() + " is not IShareScreenshotHandler,perform default share ");
        AEQbTJ(abstractActivityC33041mov, (android.graphics.Bitmap) null);
    }

    public static final Unit copydefault(android.graphics.Bitmap bitmap, MultiShareConfig multiShareConfig) {
        EZpvd.EZpvd(multiShareConfig, bitmap);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(android.graphics.Bitmap bitmap, MultiShareConfig multiShareConfig) {
        EZpvd.EZpvd(multiShareConfig, bitmap);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final MultiShareConfig multiShareConfig, final android.graphics.Bitmap bitmap) {
        if (multiShareConfig != null) {
            pUU.EZpvd("ShareScreenshotMonitor", "handleOnScreenshot->biz customized share config");
            KWHzl.post(new java.lang.Runnable() { // from class: o.ujv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C49181ujh.KWHzl(multiShareConfig, bitmap);
                }
            });
        } else {
            pUU.EZpvd("ShareScreenshotMonitor", "handleOnScreenshot->biz ignored screenshot share");
        }
    }

    public static final void KWHzl(MultiShareConfig multiShareConfig, android.graphics.Bitmap bitmap) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        AbstractActivityC33041mov abstractActivityC33041mov = activityAEQbTJ instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityAEQbTJ : null;
        if (abstractActivityC33041mov != null) {
            if (C33129mqd.KWHzl((java.util.Collection) multiShareConfig.getConfigList())) {
                EZpvd.copydefault().OLrzqt(abstractActivityC33041mov, multiShareConfig);
                pUU.EZpvd("ShareScreenshotMonitor", "handleOnScreenshot->custom sharing with host:" + abstractActivityC33041mov.getClass().getSimpleName());
                return;
            }
            EZpvd.AEQbTJ(abstractActivityC33041mov, bitmap);
            pUU.EZpvd("ShareScreenshotMonitor", "handleOnScreenshot->default sharing with host:" + abstractActivityC33041mov.getClass().getSimpleName());
        }
    }

    public final void AEQbTJ(final AbstractActivityC33041mov abstractActivityC33041mov, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = buildBitmapWithActivity$default(this, abstractActivityC33041mov, false, 2, null);
        }
        if (bitmap == null) {
            pUU.copydefault("ShareScreenshotMonitor", "performDefaultShare->buildBitmap failed");
            return;
        }
        KWHzl(abstractActivityC33041mov);
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just(bitmap);
        final Function1 function1 = new Function1() { // from class: o.ujj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49181ujh.copydefault(abstractActivityC33041mov, (android.graphics.Bitmap) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.ujo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C49181ujh.copydefault(function1, obj);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        AbstractC58247yxg abstractC58247yxgCopydefault = C58156yvv.copydefault(abstractC58247yxgObserveOn, abstractActivityC33041mov);
        final Function1 function12 = new Function1() { // from class: o.ujn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49181ujh.KWHzl(abstractActivityC33041mov, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ujm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49181ujh.AYXKKw(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.ujt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49181ujh.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58247yxgCopydefault.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ujq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49181ujh.OLrzqt(function13, obj);
            }
        });
    }

    public static final kotlin.Pair copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(AbstractActivityC33041mov abstractActivityC33041mov, android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        return new kotlin.Pair(bitmap, EZpvd.OLrzqt(abstractActivityC33041mov, bitmap));
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, kotlin.Pair pair) {
        ImageSource.StateListAnimator stateListAnimator = ImageSource.Companion;
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(ShareConfig.Companion, ImageShareParams.Companion.OLrzqt(abstractActivityC33041mov, (android.graphics.Bitmap) pair.getSecond(), stateListAnimator.EZpvd(abstractActivityC33041mov, (android.graphics.Bitmap) first), new Function1() { // from class: o.ujr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49181ujh.copydefault((ImageShareParams) obj);
            }
        }), null, 2, null);
        ISharePreviewConfig previewConfig = shareConfigCreate$default.getPreviewConfig();
        if (previewConfig instanceof ImageDefaultPreviewConfig) {
            ((ImageDefaultPreviewConfig) previewConfig).setPreviewTitle(C32979mnm.EZpvd.OLrzqt().getResources().getString(C48931uew.Activity.fARcdN));
        }
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault(abstractActivityC33041mov, shareConfigCreate$default);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("screenshot");
        imageShareParams.setTriggerSource(TriggerSource.SCREEN_SHOT);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        pUU.copydefault("ShareScreenshotMonitor", "error:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ android.graphics.Bitmap buildBitmapWithActivity$default(C49181ujh c49181ujh, android.app.Activity activity, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c49181ujh.EZpvd(activity, z);
    }

    public final android.graphics.Bitmap EZpvd(android.app.Activity activity, boolean z) {
        android.graphics.Bitmap bitmapCreateBitmap;
        try {
            android.graphics.Bitmap bitmapAEQbTJ = AEQbTJ(activity);
            if (bitmapAEQbTJ == null) {
                return null;
            }
            int iGEmmrt = C33570myu.gEmmrt(activity);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            if (bitmapAEQbTJ.getWidth() > 1080) {
                float width = 1080.0f / bitmapAEQbTJ.getWidth();
                matrix.setScale(width, width);
            }
            if (z) {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapAEQbTJ, 0, iGEmmrt, bitmapAEQbTJ.getWidth(), bitmapAEQbTJ.getHeight() - iGEmmrt, matrix, true);
            } else {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapAEQbTJ, 0, 0, bitmapAEQbTJ.getWidth(), bitmapAEQbTJ.getHeight(), matrix, true);
            }
            return bitmapCreateBitmap;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        } catch (java.lang.OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final android.graphics.Bitmap AEQbTJ(android.app.Activity activity) {
        android.view.View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "");
        try {
            android.graphics.Bitmap bitmapOLrzqt = Falcon.OLrzqt(activity);
            pUU.KWHzl("ShareScreenshotMonitor", "buildActivityScreenshot->Falcon:" + bitmapOLrzqt);
            return bitmapOLrzqt;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.copydefault("ShareScreenshotMonitor", "buildActivityScreenshot takeScreenshotBitmap->error:" + e.getMessage());
            return C33570myu.copydefault(decorView, true);
        } catch (java.lang.OutOfMemoryError e2) {
            e2.printStackTrace();
            pUU.copydefault("ShareScreenshotMonitor", "buildActivityScreenshot takeScreenshotBitmap->OutOfMemoryError:" + e2.getMessage());
            return C33570myu.copydefault(decorView, true);
        }
    }

    public final android.graphics.Bitmap OLrzqt(android.app.Activity activity, android.graphics.Bitmap bitmap) throws java.lang.InterruptedException {
        pUU.KWHzl("ShareScreenshotMonitor", "buildShareBitmap start->sourceImage.w:" + (bitmap != null ? java.lang.Integer.valueOf(bitmap.getWidth()) : null) + "  sourceImage.h:" + (bitmap != null ? java.lang.Integer.valueOf(bitmap.getHeight()) : null));
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float height = ((float) bitmap.getHeight()) / ((float) bitmap.getWidth());
        int iMin = java.lang.Math.min(java.lang.Math.min(bitmap.getWidth(), displayMetrics.widthPixels), 1080);
        int i = (int) (height * ((float) iMin));
        android.view.View viewInflate = android.view.LayoutInflater.from(activity).inflate(C48931uew.Application.AwvSrB, (android.view.ViewGroup) null);
        Intrinsics.copydefault(viewInflate, "");
        C49352umt c49352umt = (C49352umt) viewInflate;
        C33487mxQ.EZpvd(c49352umt, displayMetrics.widthPixels, displayMetrics.heightPixels);
        if (!((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz()) {
            C48891ueI c48891ueI = new C48891ueI("screenshot", null, false, RedirectBehavior.DIRECT_GOTO_BIZ_PAGE, null, 16, null);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            c49352umt.KWHzl(null, null, c48891ueI, new Function1() { // from class: o.ujk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49181ujh.EZpvd(countDownLatch, (C48887ueE) obj);
                }
            });
            countDownLatch.await(1L, java.util.concurrent.TimeUnit.SECONDS);
        }
        android.graphics.Bitmap bitmapCopydefault = C33570myu.copydefault((android.view.View) c49352umt, true);
        if (bitmapCopydefault == null) {
            return bitmap;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, iMin, i);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        new android.graphics.Canvas(bitmapCreateBitmap).drawBitmap(bitmapCopydefault, (android.graphics.Rect) null, new android.graphics.Rect(0, bitmapCreateBitmap.getHeight() - ((int) (bitmapCopydefault.getHeight() * (bitmapCreateBitmap.getWidth() / bitmapCopydefault.getWidth()))), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), (android.graphics.Paint) null);
        pUU.KWHzl("ShareScreenshotMonitor", "buildShareBitmap->bmp->w:" + java.lang.Integer.valueOf(bitmapCreateBitmap.getWidth()) + "  h:" + java.lang.Integer.valueOf(bitmapCreateBitmap.getHeight()));
        return bitmapCreateBitmap;
    }

    public static final Unit EZpvd(CountDownLatch countDownLatch, C48887ueE c48887ueE) {
        countDownLatch.countDown();
        return Unit.INSTANCE;
    }
}
