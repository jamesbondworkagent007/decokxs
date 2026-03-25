package o;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.okinc.find_ui.widgetprovider.p2p.data.P2PPairsPriceInfo;
import com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide;
import com.okinc.find_ui.widgetprovider.p2p.utils.P2PWidgetItemUtilsKt$updateP2PItemWidget$1;
import com.okinc.unify_find.net.BizFindApiService;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35126npT {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(int i, @NotNull java.lang.String str, @NotNull BizFindApiService bizFindApiService, @NotNull android.content.Context context, @NotNull android.widget.RemoteViews remoteViews, @NotNull C35193nqh c35193nqh, boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        P2PWidgetItemUtilsKt$updateP2PItemWidget$1 p2PWidgetItemUtilsKt$updateP2PItemWidget$1;
        Triple<java.lang.String, java.lang.String, java.lang.String> tripleKWHzl;
        int i2;
        java.lang.Object obj;
        C35193nqh c35193nqh2;
        android.widget.RemoteViews remoteViews2;
        boolean z2;
        android.content.Context context2;
        P2PPairsPriceInfo p2PPairsPriceInfo;
        java.lang.String third;
        android.graphics.Bitmap bitmap;
        java.lang.String cryptoIconUrl;
        java.lang.Object objOLrzqt;
        int i3;
        boolean z3;
        android.content.Context context3;
        C35193nqh c35193nqh3;
        P2PPairsPriceInfo p2PPairsPriceInfo2;
        android.widget.RemoteViews remoteViews3;
        Triple<java.lang.String, java.lang.String, java.lang.String> triple;
        java.lang.String str2;
        boolean z4;
        android.graphics.Bitmap bitmap2;
        boolean zOLrzqt;
        java.lang.String strAYXKKw;
        int iTradeFallTagFill$default;
        java.lang.String price;
        if (continuation instanceof P2PWidgetItemUtilsKt$updateP2PItemWidget$1) {
            p2PWidgetItemUtilsKt$updateP2PItemWidget$1 = (P2PWidgetItemUtilsKt$updateP2PItemWidget$1) continuation;
            int i4 = p2PWidgetItemUtilsKt$updateP2PItemWidget$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                p2PWidgetItemUtilsKt$updateP2PItemWidget$1.label = i4 - Integer.MIN_VALUE;
            } else {
                p2PWidgetItemUtilsKt$updateP2PItemWidget$1 = new P2PWidgetItemUtilsKt$updateP2PItemWidget$1(continuation);
            }
        }
        java.lang.Object obj2 = p2PWidgetItemUtilsKt$updateP2PItemWidget$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = p2PWidgetItemUtilsKt$updateP2PItemWidget$1.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(obj2);
            tripleKWHzl = C35127npU.KWHzl(str);
            if (tripleKWHzl == null) {
                return Unit.INSTANCE;
            }
            p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$0 = context;
            p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$1 = remoteViews;
            p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$2 = c35193nqh;
            p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$3 = tripleKWHzl;
            p2PWidgetItemUtilsKt$updateP2PItemWidget$1.I$0 = i;
            p2PWidgetItemUtilsKt$updateP2PItemWidget$1.Z$0 = z;
            p2PWidgetItemUtilsKt$updateP2PItemWidget$1.label = 1;
            java.lang.Object objCopydefault2 = C35127npU.copydefault(bizFindApiService, i, context, p2PWidgetItemUtilsKt$updateP2PItemWidget$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            i2 = i;
            obj = objCopydefault2;
            c35193nqh2 = c35193nqh;
            remoteViews2 = remoteViews;
            z2 = z;
            context2 = context;
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = p2PWidgetItemUtilsKt$updateP2PItemWidget$1.Z$0;
                i3 = p2PWidgetItemUtilsKt$updateP2PItemWidget$1.I$0;
                str2 = (java.lang.String) p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$5;
                p2PPairsPriceInfo2 = (P2PPairsPriceInfo) p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$4;
                triple = (Triple) p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$3;
                c35193nqh3 = (C35193nqh) p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$2;
                remoteViews3 = (android.widget.RemoteViews) p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$1;
                context3 = (android.content.Context) p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj2);
                    bitmap2 = (android.graphics.Bitmap) obj2;
                    z4 = z3;
                    i2 = i3;
                    third = str2;
                    tripleKWHzl = triple;
                    remoteViews2 = remoteViews3;
                    p2PPairsPriceInfo = p2PPairsPriceInfo2;
                    c35193nqh2 = c35193nqh3;
                    context2 = context3;
                } catch (java.lang.Throwable th) {
                    th = th;
                    z2 = z3;
                    i2 = i3;
                    third = str2;
                    tripleKWHzl = triple;
                    remoteViews2 = remoteViews3;
                    p2PPairsPriceInfo = p2PPairsPriceInfo2;
                    c35193nqh2 = c35193nqh3;
                    context2 = context3;
                    pUU.AEQbTJ("AppWidget", "get image error", th);
                    z4 = z2;
                    bitmap2 = null;
                }
                android.graphics.Bitmap bitmap3 = bitmap2;
                z2 = z4;
                bitmap = bitmap3;
                zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) (p2PPairsPriceInfo != null ? p2PPairsPriceInfo.getPrice() : null));
                if (z2 && !zOLrzqt) {
                    return Unit.INSTANCE;
                }
                int iTradeFallDefault$default = 0;
                if (zOLrzqt) {
                    remoteViews2.setViewVisibility(qZH.StateListAnimator.BVXAa, 0);
                    remoteViews2.setViewVisibility(qZH.StateListAnimator.iqeXgQ, 8);
                    java.lang.Integer numKWHzl = c35193nqh2.KWHzl();
                    if (numKWHzl != null) {
                        numKWHzl.intValue();
                        remoteViews2.setTextViewText(c35193nqh2.KWHzl().intValue(), tripleKWHzl.getFirst());
                    }
                    java.lang.Integer numCopydefault = c35193nqh2.copydefault();
                    if (numCopydefault != null) {
                        remoteViews2.setTextViewText(numCopydefault.intValue(), "/" + ((java.lang.Object) tripleKWHzl.getSecond()));
                    }
                    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                    android.net.Uri uri = android.net.Uri.parse("okex://p2p/trading?type=" + third + "&crypto=" + ((java.lang.Object) tripleKWHzl.getFirst()) + "&fiat=" + ((java.lang.Object) tripleKWHzl.getSecond()) + "&fromPage=p2pWidget");
                    java.lang.String str3 = "";
                    Intrinsics.checkNotNullExpressionValue(uri, "");
                    intent.setData(uri);
                    remoteViews2.setOnClickPendingIntent(c35193nqh2.OLrzqt(), android.app.PendingIntent.getActivity(context2, i2, intent, 67108864));
                    P2PTradeSide p2PTradeSide = P2PTradeSide.BUY;
                    if (Intrinsics.EZpvd((java.lang.Object) third, (java.lang.Object) p2PTradeSide.getValue())) {
                        strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.QHmsKR);
                    } else {
                        strAYXKKw = Intrinsics.EZpvd((java.lang.Object) third, (java.lang.Object) P2PTradeSide.SELL.getValue()) ? C33070mpX.AYXKKw(qZH.PendingIntent.QkdxfA) : "";
                    }
                    remoteViews2.setTextViewText(c35193nqh2.AEQbTJ(), p2PPairsPriceInfo != null ? p2PPairsPriceInfo.getPrice() : null);
                    remoteViews2.setTextViewText(c35193nqh2.djBIcL(), strAYXKKw);
                    if (p2PPairsPriceInfo != null && (price = p2PPairsPriceInfo.getPrice()) != null) {
                        str3 = price;
                    }
                    remoteViews2.setTextViewTextSize(c35193nqh2.AEQbTJ(), 2, KWHzl(context2, i2, str3, strAYXKKw));
                    C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                    int iAYXKKw = c33512mxp.AYXKKw();
                    c33512mxp.isConnected();
                    android.content.Context contextKWHzl = C55374xij.KWHzl(context2, C33492mxV.KWHzl() ? 32 : 16, c33512mxp.isConnected() == 0 ? iAYXKKw == 0 ? C52761wXj.LoaderManager.iRxXKY : C52761wXj.LoaderManager.DXXBbs : iAYXKKw == 0 ? C52761wXj.LoaderManager.flVtFt : C52761wXj.LoaderManager.ODWQjV);
                    if (Intrinsics.EZpvd((java.lang.Object) third, (java.lang.Object) p2PTradeSide.getValue())) {
                        iTradeFallTagFill$default = C33512mxp.tradeRiseTagFill$default(c33512mxp, contextKWHzl, 0.0f, 2, null);
                    } else {
                        iTradeFallTagFill$default = Intrinsics.EZpvd((java.lang.Object) third, (java.lang.Object) P2PTradeSide.SELL.getValue()) ? C33512mxp.tradeFallTagFill$default(c33512mxp, contextKWHzl, 0.0f, 2, null) : 0;
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) third, (java.lang.Object) p2PTradeSide.getValue())) {
                        iTradeFallDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, contextKWHzl, 0.0f, 2, null);
                    } else if (Intrinsics.EZpvd((java.lang.Object) third, (java.lang.Object) P2PTradeSide.SELL.getValue())) {
                        iTradeFallDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp, contextKWHzl, 0.0f, 2, null);
                    }
                    remoteViews2.setImageViewBitmap(c35193nqh2.AhwBna(), AEQbTJ(iTradeFallTagFill$default, 6.0f, AEQbTJ(strAYXKKw, 12.0f, context2) + 8.0f, 20.0f));
                    remoteViews2.setTextColor(c35193nqh2.djBIcL(), iTradeFallDefault$default);
                    if (bitmap != null) {
                        remoteViews2.setImageViewBitmap(c35193nqh2.EZpvd(), bitmap);
                    }
                } else {
                    remoteViews2.setViewVisibility(qZH.StateListAnimator.BVXAa, 8);
                    remoteViews2.setViewVisibility(qZH.StateListAnimator.iqeXgQ, 0);
                }
                return Unit.INSTANCE;
            }
            boolean z5 = p2PWidgetItemUtilsKt$updateP2PItemWidget$1.Z$0;
            i2 = p2PWidgetItemUtilsKt$updateP2PItemWidget$1.I$0;
            tripleKWHzl = (Triple) p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$3;
            c35193nqh2 = (C35193nqh) p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$2;
            remoteViews2 = (android.widget.RemoteViews) p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$1;
            context2 = (android.content.Context) p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            z2 = z5;
            obj = obj2;
        }
        p2PPairsPriceInfo = (P2PPairsPriceInfo) obj;
        third = tripleKWHzl.getThird();
        if (p2PPairsPriceInfo != null && (cryptoIconUrl = p2PPairsPriceInfo.getCryptoIconUrl()) != null) {
            try {
                p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$0 = context2;
                p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$1 = remoteViews2;
                p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$2 = c35193nqh2;
                p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$3 = tripleKWHzl;
                p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$4 = p2PPairsPriceInfo;
                p2PWidgetItemUtilsKt$updateP2PItemWidget$1.L$5 = third;
                p2PWidgetItemUtilsKt$updateP2PItemWidget$1.I$0 = i2;
                p2PWidgetItemUtilsKt$updateP2PItemWidget$1.Z$0 = z2;
                p2PWidgetItemUtilsKt$updateP2PItemWidget$1.label = 2;
                objOLrzqt = C35129npW.OLrzqt(context2, cryptoIconUrl, p2PWidgetItemUtilsKt$updateP2PItemWidget$1);
            } catch (java.lang.Throwable th2) {
                th = th2;
                pUU.AEQbTJ("AppWidget", "get image error", th);
                z4 = z2;
                bitmap2 = null;
            }
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            i3 = i2;
            z3 = z2;
            context3 = context2;
            obj2 = objOLrzqt;
            c35193nqh3 = c35193nqh2;
            p2PPairsPriceInfo2 = p2PPairsPriceInfo;
            remoteViews3 = remoteViews2;
            triple = tripleKWHzl;
            str2 = third;
            bitmap2 = (android.graphics.Bitmap) obj2;
            z4 = z3;
            i2 = i3;
            third = str2;
            tripleKWHzl = triple;
            remoteViews2 = remoteViews3;
            p2PPairsPriceInfo = p2PPairsPriceInfo2;
            c35193nqh2 = c35193nqh3;
            context2 = context3;
            android.graphics.Bitmap bitmap32 = bitmap2;
            z2 = z4;
            bitmap = bitmap32;
            zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) (p2PPairsPriceInfo != null ? p2PPairsPriceInfo.getPrice() : null));
            if (z2) {
            }
            int iTradeFallDefault$default2 = 0;
            if (zOLrzqt) {
            }
            return Unit.INSTANCE;
        }
        bitmap = null;
        zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) (p2PPairsPriceInfo != null ? p2PPairsPriceInfo.getPrice() : null));
        if (z2) {
        }
        int iTradeFallDefault$default22 = 0;
        if (zOLrzqt) {
        }
        return Unit.INSTANCE;
    }

    public static final android.graphics.Bitmap AEQbTJ(int i, float f, float f2, float f3) {
        int iDp2px$default = C55298xhM.dp2px$default(f2, null, 1, null);
        int iDp2px$default2 = C55298xhM.dp2px$default(f3, null, 1, null);
        int iDp2px$default3 = C55298xhM.dp2px$default(f, null, 1, null);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iDp2px$default, iDp2px$default2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(i);
        paint.setAntiAlias(true);
        float f4 = iDp2px$default3;
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, iDp2px$default, iDp2px$default2), f4, f4, paint);
        return bitmapCreateBitmap;
    }

    public static final float AEQbTJ(java.lang.String str, float f, android.content.Context context) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(android.util.TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics()));
        paint.setFakeBoldText(true);
        return paint.measureText(str) / context.getResources().getDisplayMetrics().density;
    }

    public static final float KWHzl(android.content.Context context, int i, java.lang.String str, java.lang.String str2) {
        try {
            float f = android.appwidget.AppWidgetManager.getInstance(context).getAppWidgetInfo(i).minWidth / context.getResources().getDisplayMetrics().density;
            float fAEQbTJ = (f - AEQbTJ(str2, context)) - 32.0f;
            java.lang.Float fValueOf = null;
            float f2 = 10.0f;
            float f3 = 24.0f;
            while (f2 <= f3) {
                float f4 = (f2 + f3) / 2.0f;
                if (AEQbTJ(str, f4, context) <= fAEQbTJ) {
                    fValueOf = java.lang.Float.valueOf(f4);
                    f2 = f4 + 1.0f;
                } else {
                    f3 = f4 - 1.0f;
                }
            }
            float fKWHzl = C56548yJl.KWHzl(fValueOf != null ? fValueOf.floatValue() : 10.0f, 10.0f, 24.0f);
            pUU.KWHzl("P2PCryptoWidgetProvider", "Calculate text size is " + fKWHzl + " (availableWidthDp=" + fAEQbTJ + ", widgetWidthDp=" + f + ")");
            return fKWHzl;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("P2PCryptoWidgetProvider", "Failed to calculate text size", e);
            if (str.length() > 14) {
                return 8.0f;
            }
            if (str.length() > 12) {
                return 10.0f;
            }
            if (str.length() > 10) {
                return 12.0f;
            }
            return str.length() > 8 ? 14.0f : 16.0f;
        }
    }

    public static final float AEQbTJ(java.lang.String str, android.content.Context context) {
        return AEQbTJ(str, 12.0f, context) + 8.0f + 4.0f;
    }
}
