package o;

import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.okinc.find_ui.widgetprovider.data.CoinCandle;
import com.okinc.find_ui.widgetprovider.util.BitmapUtilsKt$fetchCoinCandle$1;
import com.okinc.find_ui.widgetprovider.util.BitmapUtilsKt$fetchCoinImage$1;
import com.okinc.market.common.biz_spot.AnnounceDetail;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_find.net.BizFindApiService;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35129npW {

    /* JADX INFO: renamed from: o.npW$ActionBar */
    public static final class ActionBar extends AbstractC5449Sd<android.graphics.Bitmap> {
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ CancellableContinuation<android.graphics.Bitmap> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super android.graphics.Bitmap> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(CancellableContinuation<? super android.graphics.Bitmap> cancellableContinuation, java.lang.String str) {
            super(64, 64);
            this.copydefault = cancellableContinuation;
            this.KWHzl = str;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.Bitmap bitmap, InterfaceC5460So<? super android.graphics.Bitmap> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            if (this.copydefault.isActive()) {
                CancellableContinuation<android.graphics.Bitmap> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(bitmap));
            }
        }

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
            if (this.copydefault.isActive()) {
                CancellableContinuation<android.graphics.Bitmap> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("load clear " + this.KWHzl))));
            }
        }

        @Override // o.AbstractC5449Sd, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            super.AEQbTJ(drawable);
            if (this.copydefault.isActive()) {
                CancellableContinuation<android.graphics.Bitmap> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("load failed " + this.KWHzl))));
            }
        }
    }

    /* JADX INFO: renamed from: o.npW$StateListAnimator */
    public static final class StateListAnimator implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ android.content.Context EZpvd;
        public final /* synthetic */ ActionBar OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.content.Context context, ActionBar actionBar) {
            this.EZpvd = context;
            this.OLrzqt = actionBar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            copydefault(th);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.Throwable th) {
            Glide.AEQbTJ(this.EZpvd).EZpvd((InterfaceC5462Sq<?>) this.OLrzqt);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull BizFindApiService bizFindApiService, @NotNull C35191nqf c35191nqf, @NotNull Continuation<? super CoinCandle> continuation) throws java.lang.Throwable {
        BitmapUtilsKt$fetchCoinCandle$1 bitmapUtilsKt$fetchCoinCandle$1;
        CoinCandle coinCandle;
        if (continuation instanceof BitmapUtilsKt$fetchCoinCandle$1) {
            bitmapUtilsKt$fetchCoinCandle$1 = (BitmapUtilsKt$fetchCoinCandle$1) continuation;
            int i = bitmapUtilsKt$fetchCoinCandle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bitmapUtilsKt$fetchCoinCandle$1.label = i - Integer.MIN_VALUE;
            } else {
                bitmapUtilsKt$fetchCoinCandle$1 = new BitmapUtilsKt$fetchCoinCandle$1(continuation);
            }
        }
        java.lang.Object appWidgetTickerInfos = bitmapUtilsKt$fetchCoinCandle$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bitmapUtilsKt$fetchCoinCandle$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(appWidgetTickerInfos);
            CoinCandle coinCandle2 = c35191nqf.AEQbTJ().get(str);
            if (coinCandle2 != null) {
                return coinCandle2;
            }
            bitmapUtilsKt$fetchCoinCandle$1.L$0 = str;
            bitmapUtilsKt$fetchCoinCandle$1.L$1 = c35191nqf;
            bitmapUtilsKt$fetchCoinCandle$1.label = 1;
            appWidgetTickerInfos = bizFindApiService.getAppWidgetTickerInfos(str, bitmapUtilsKt$fetchCoinCandle$1);
            if (appWidgetTickerInfos == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c35191nqf = (C35191nqf) bitmapUtilsKt$fetchCoinCandle$1.L$1;
            str = (java.lang.String) bitmapUtilsKt$fetchCoinCandle$1.L$0;
            C56391yDq.AEQbTJ(appWidgetTickerInfos);
        }
        java.util.List list = (java.util.List) ((ResponseData) appWidgetTickerInfos).getData();
        if (list == null || (coinCandle = (CoinCandle) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        c35191nqf.AEQbTJ().put(str, coinCandle);
        return coinCandle;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[Catch: all -> 0x0093, TRY_ENTER, TryCatch #0 {all -> 0x0093, blocks: (B:12:0x0029, B:32:0x008f, B:29:0x0080), top: B:37:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull BizFindApiService bizFindApiService, @NotNull android.content.Context context, @NotNull C35191nqf c35191nqf, @NotNull Continuation<? super android.graphics.Bitmap> continuation) throws java.lang.Throwable {
        BitmapUtilsKt$fetchCoinImage$1 bitmapUtilsKt$fetchCoinImage$1;
        java.lang.String icon;
        if (continuation instanceof BitmapUtilsKt$fetchCoinImage$1) {
            bitmapUtilsKt$fetchCoinImage$1 = (BitmapUtilsKt$fetchCoinImage$1) continuation;
            int i = bitmapUtilsKt$fetchCoinImage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bitmapUtilsKt$fetchCoinImage$1.label = i - Integer.MIN_VALUE;
            } else {
                bitmapUtilsKt$fetchCoinImage$1 = new BitmapUtilsKt$fetchCoinImage$1(continuation);
            }
        }
        java.lang.Object announceDetail = bitmapUtilsKt$fetchCoinImage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bitmapUtilsKt$fetchCoinImage$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(announceDetail);
                icon = c35191nqf.KWHzl().get(str);
                if (icon == null) {
                    bitmapUtilsKt$fetchCoinImage$1.L$0 = str;
                    bitmapUtilsKt$fetchCoinImage$1.L$1 = context;
                    bitmapUtilsKt$fetchCoinImage$1.L$2 = c35191nqf;
                    bitmapUtilsKt$fetchCoinImage$1.label = 1;
                    announceDetail = bizFindApiService.getAnnounceDetail(str, bitmapUtilsKt$fetchCoinImage$1);
                    if (announceDetail == objCopydefault) {
                        return objCopydefault;
                    }
                }
                if (icon != null) {
                    return null;
                }
                bitmapUtilsKt$fetchCoinImage$1.L$0 = null;
                bitmapUtilsKt$fetchCoinImage$1.L$1 = null;
                bitmapUtilsKt$fetchCoinImage$1.L$2 = null;
                bitmapUtilsKt$fetchCoinImage$1.label = 2;
                announceDetail = OLrzqt(context, icon, bitmapUtilsKt$fetchCoinImage$1);
                if (announceDetail == objCopydefault) {
                    return objCopydefault;
                }
                return (android.graphics.Bitmap) announceDetail;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(announceDetail);
                return (android.graphics.Bitmap) announceDetail;
            }
            c35191nqf = (C35191nqf) bitmapUtilsKt$fetchCoinImage$1.L$2;
            context = (android.content.Context) bitmapUtilsKt$fetchCoinImage$1.L$1;
            str = (java.lang.String) bitmapUtilsKt$fetchCoinImage$1.L$0;
            C56391yDq.AEQbTJ(announceDetail);
            AnnounceDetail announceDetail2 = (AnnounceDetail) ((ResponseData) announceDetail).getData();
            if (announceDetail2 == null || (icon = announceDetail2.getIcon()) == null) {
                icon = null;
            } else {
                c35191nqf.KWHzl().put(str, icon);
            }
            if (icon != null) {
            }
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("AppWidget", "get image error", th);
            return null;
        }
    }

    public static final java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Continuation<? super android.graphics.Bitmap> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ActionBar actionBar = new ActionBar(cancellableContinuationImpl, str);
        Glide.AEQbTJ(context).EZpvd().copydefault(str).OLrzqt(actionBar);
        cancellableContinuationImpl.invokeOnCancellation(new StateListAnimator(context, actionBar));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    public static final android.graphics.Bitmap AEQbTJ(@NotNull java.util.List<java.lang.Float> list, @NotNull C35191nqf c35191nqf, boolean z, java.lang.Float f) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c35191nqf, "");
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(216, 72, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        (z ? c35191nqf.EZpvd() : c35191nqf.OLrzqt()).OLrzqt(list, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), new android.graphics.Canvas(bitmapCreateBitmap), f);
        return bitmapCreateBitmap;
    }
}
