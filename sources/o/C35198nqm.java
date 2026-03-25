package o;

import androidx.camera.video.AudioStats;
import com.okinc.find_ui.widgetprovider.data.CoinCandle;
import com.okinc.find_ui.widgetprovider.util.WidgetItemUtilsKt$updateItemDataWidget$1;
import com.okinc.find_ui.widgetprovider.util.WidgetItemUtilsKt$updateItemWidget$1;
import com.okinc.unify_find.net.BizFindApiService;
import java.math.RoundingMode;
import java.util.Collections;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.nqm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35198nqm {
    /* JADX WARN: Removed duplicated region for block: B:130:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(int i, @NotNull java.lang.String str, @NotNull BizFindApiService bizFindApiService, @NotNull android.content.Context context, @NotNull C35191nqf c35191nqf, @NotNull android.widget.RemoteViews remoteViews, @NotNull C35194nqi c35194nqi, boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WidgetItemUtilsKt$updateItemWidget$1 widgetItemUtilsKt$updateItemWidget$1;
        android.content.Context context2;
        android.widget.RemoteViews remoteViews2;
        int i2;
        BizFindApiService bizFindApiService2;
        C35194nqi c35194nqi2;
        C35191nqf c35191nqf2;
        boolean z2;
        Triple<java.lang.String, java.lang.String, java.lang.String> triple;
        CoinCandle coinCandle;
        android.content.Context context3;
        C35194nqi c35194nqi3;
        boolean z3;
        int i3;
        boolean zOLrzqt;
        java.lang.Integer numAhwBna;
        java.lang.String strCopydefault;
        android.graphics.Bitmap bitmap;
        java.lang.Object objM7377constructorimpl;
        java.lang.Integer numValueOf;
        if (continuation instanceof WidgetItemUtilsKt$updateItemWidget$1) {
            widgetItemUtilsKt$updateItemWidget$1 = (WidgetItemUtilsKt$updateItemWidget$1) continuation;
            int i4 = widgetItemUtilsKt$updateItemWidget$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                widgetItemUtilsKt$updateItemWidget$1.label = i4 - Integer.MIN_VALUE;
            } else {
                widgetItemUtilsKt$updateItemWidget$1 = new WidgetItemUtilsKt$updateItemWidget$1(continuation);
            }
        }
        java.lang.Object obj = widgetItemUtilsKt$updateItemWidget$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = widgetItemUtilsKt$updateItemWidget$1.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(obj);
            Triple<java.lang.String, java.lang.String, java.lang.String> tripleAEQbTJ = C35130npX.AEQbTJ(str);
            java.lang.String str2 = ((java.lang.Object) tripleAEQbTJ.getFirst()) + "-" + ((java.lang.Object) tripleAEQbTJ.getSecond());
            widgetItemUtilsKt$updateItemWidget$1.L$0 = bizFindApiService;
            context2 = context;
            widgetItemUtilsKt$updateItemWidget$1.L$1 = context2;
            widgetItemUtilsKt$updateItemWidget$1.L$2 = c35191nqf;
            remoteViews2 = remoteViews;
            widgetItemUtilsKt$updateItemWidget$1.L$3 = remoteViews2;
            widgetItemUtilsKt$updateItemWidget$1.L$4 = c35194nqi;
            widgetItemUtilsKt$updateItemWidget$1.L$5 = tripleAEQbTJ;
            i2 = i;
            widgetItemUtilsKt$updateItemWidget$1.I$0 = i2;
            widgetItemUtilsKt$updateItemWidget$1.Z$0 = z;
            widgetItemUtilsKt$updateItemWidget$1.label = 1;
            java.lang.Object objCopydefault2 = C35129npW.copydefault(str2, bizFindApiService, c35191nqf, widgetItemUtilsKt$updateItemWidget$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            bizFindApiService2 = bizFindApiService;
            c35194nqi2 = c35194nqi;
            c35191nqf2 = c35191nqf;
            z2 = z;
            triple = tripleAEQbTJ;
            obj = objCopydefault2;
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = widgetItemUtilsKt$updateItemWidget$1.Z$0;
                i3 = widgetItemUtilsKt$updateItemWidget$1.I$0;
                coinCandle = (CoinCandle) widgetItemUtilsKt$updateItemWidget$1.L$5;
                triple = (Triple) widgetItemUtilsKt$updateItemWidget$1.L$4;
                c35194nqi3 = (C35194nqi) widgetItemUtilsKt$updateItemWidget$1.L$3;
                remoteViews2 = (android.widget.RemoteViews) widgetItemUtilsKt$updateItemWidget$1.L$2;
                c35191nqf2 = (C35191nqf) widgetItemUtilsKt$updateItemWidget$1.L$1;
                context3 = (android.content.Context) widgetItemUtilsKt$updateItemWidget$1.L$0;
                C56391yDq.AEQbTJ(obj);
                android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) obj;
                zOLrzqt = C35130npX.OLrzqt(triple);
                numAhwBna = c35194nqi3.AhwBna();
                if (numAhwBna != null) {
                    numAhwBna.intValue();
                    remoteViews2.setTextViewText(c35194nqi3.AhwBna().intValue(), triple.getFirst());
                }
                if (!zOLrzqt && (numValueOf = c35194nqi3.valueOf()) != null) {
                    remoteViews2.setTextViewText(numValueOf.intValue(), "/" + ((java.lang.Object) triple.getSecond()));
                }
                remoteViews2.setViewVisibility(c35194nqi3.AEQbTJ(), 0);
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                intent.addFlags(335544320);
                if (!zOLrzqt) {
                    android.net.Uri uri = android.net.Uri.parse("okex://trade_kline?id=" + ((java.lang.Object) triple.getFirst()) + "-" + ((java.lang.Object) triple.getSecond()) + "&type=SPOT&refreshWidget=1");
                    Intrinsics.checkNotNullExpressionValue(uri, "");
                    intent.setData(uri);
                } else {
                    android.net.Uri uri2 = android.net.Uri.parse("okex://trade_kline?id=" + ((java.lang.Object) triple.getThird()) + "&type=SPOT&refreshWidget=1");
                    Intrinsics.checkNotNullExpressionValue(uri2, "");
                    intent.setData(uri2);
                }
                remoteViews2.setOnClickPendingIntent(c35194nqi3.AEQbTJ(), android.app.PendingIntent.getActivity(context3, i3, intent, 67108864));
                if (coinCandle == null) {
                    InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
                    if (interfaceC43033rhe != null) {
                        java.lang.String open24h = coinCandle.getOpen24h();
                        if (open24h == null) {
                            open24h = "";
                        }
                        java.lang.String sodUtc0 = coinCandle.getSodUtc0();
                        if (sodUtc0 == null) {
                            sodUtc0 = "";
                        }
                        java.lang.String sodUtc8 = coinCandle.getSodUtc8();
                        if (sodUtc8 == null) {
                            sodUtc8 = "";
                        }
                        strCopydefault = interfaceC43033rhe.copydefault(open24h, sodUtc0, sodUtc8);
                    } else {
                        strCopydefault = null;
                    }
                    java.lang.String str3 = strCopydefault;
                    double dDivD$default = C33129mqd.divD$default(C33129mqd.subS$default(coinCandle.getLast(), str3, null, null, null, 14, null), str3, C56443yFo.AEQbTJ(4), null, RoundingMode.HALF_UP, 4, null);
                    boolean z4 = dDivD$default >= AudioStats.AUDIO_AMPLITUDE_NONE;
                    java.lang.String str4 = z4 ? "↑" : "↓";
                    java.lang.String plainString = C33129mqd.EZpvd(coinCandle.getLast()).toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString, "");
                    java.lang.String localized$default = pTB.formatLocalized$default(plainString, null, 1, null);
                    if (!z3) {
                        str4 = "";
                    }
                    java.lang.String str5 = localized$default + str4;
                    pUU.KWHzl("CryptoWidgetProvider", "updateItemWidget last price : " + coinCandle.getLast() + " ");
                    java.lang.String str6 = z4 ? Marker.ANY_NON_NULL_MARKER : "";
                    if (!z3) {
                        if (str5.length() > 14) {
                            pUU.KWHzl("CryptoWidgetProvider", "textSize " + coinCandle.getInstId() + ": 8 ");
                            remoteViews2.setTextViewTextSize(c35194nqi3.copydefault(), 2, 8.0f);
                        } else if (str5.length() > 12) {
                            pUU.KWHzl("CryptoWidgetProvider", "textSize " + coinCandle.getInstId() + ": 10 ");
                            remoteViews2.setTextViewTextSize(c35194nqi3.copydefault(), 2, 10.0f);
                        } else {
                            pUU.KWHzl("CryptoWidgetProvider", "textSize " + coinCandle.getInstId() + ": 12 ");
                            remoteViews2.setTextViewTextSize(c35194nqi3.copydefault(), 2, 12.0f);
                        }
                        bitmap = bitmap2;
                    } else {
                        bitmap = bitmap2;
                        if (str5.length() > 14) {
                            pUU.KWHzl("CryptoWidgetProvider", "textSize " + coinCandle.getInstId() + ": 16 ");
                            remoteViews2.setTextViewTextSize(c35194nqi3.copydefault(), 2, 10.0f);
                        } else if (str5.length() > 12) {
                            pUU.KWHzl("CryptoWidgetProvider", "textSize " + coinCandle.getInstId() + ": 16 ");
                            remoteViews2.setTextViewTextSize(c35194nqi3.copydefault(), 2, 13.0f);
                        } else if (str5.length() > 10) {
                            pUU.KWHzl("CryptoWidgetProvider", "textSize " + coinCandle.getInstId() + ": 18 ");
                            remoteViews2.setTextViewTextSize(c35194nqi3.copydefault(), 2, 16.0f);
                        } else {
                            pUU.KWHzl("CryptoWidgetProvider", "textSize " + coinCandle.getInstId() + ": 20f ");
                            remoteViews2.setTextViewTextSize(c35194nqi3.copydefault(), 2, 20.0f);
                        }
                    }
                    remoteViews2.setTextViewText(c35194nqi3.copydefault(), str5);
                    remoteViews2.setTextViewText(c35194nqi3.OLrzqt(), str6 + pTB.formatPercent$default(C33129mqd.EZpvd(C56443yFo.AEQbTJ(dDivD$default)), 0, null, 3, null));
                    int iCopydefault = C33070mpX.copydefault(c35191nqf2.copydefault() == 0 ? C52761wXj.Activity.HJWChPRAkuRW : C52761wXj.Activity.fhUrPt);
                    int iCopydefault2 = C33070mpX.copydefault(c35191nqf2.copydefault() != 0 ? C52761wXj.Activity.HJWChPRAkuRW : C52761wXj.Activity.fhUrPt);
                    remoteViews2.setTextColor(c35194nqi3.OLrzqt(), z4 ? iCopydefault : iCopydefault2);
                    if (z3) {
                        int iCopydefault3 = c35194nqi3.copydefault();
                        if (!z4) {
                            iCopydefault = iCopydefault2;
                        }
                        remoteViews2.setTextColor(iCopydefault3, iCopydefault);
                    }
                    java.lang.Integer numEZpvd = c35194nqi3.EZpvd();
                    if (numEZpvd != null) {
                        int iIntValue = numEZpvd.intValue();
                        java.util.ArrayList arrayListCopydefault = copydefault(coinCandle.getCandles());
                        if (arrayListCopydefault != null) {
                            try {
                                Result.Application application = Result.Companion;
                                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListCopydefault, 10));
                                java.util.Iterator it = arrayListCopydefault.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(C56443yFo.OLrzqt(java.lang.Float.parseFloat((java.lang.String) it.next())));
                                }
                                objM7377constructorimpl = Result.m7377constructorimpl(C35129npW.AEQbTJ(arrayList, c35191nqf2, z4, strCopydefault != null ? C56443yFo.OLrzqt(java.lang.Float.parseFloat(strCopydefault)) : null));
                            } catch (java.lang.Throwable th) {
                                Result.Application application2 = Result.Companion;
                                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            }
                            android.graphics.Bitmap bitmap3 = (android.graphics.Bitmap) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                            if (bitmap3 != null) {
                                remoteViews2.setImageViewBitmap(iIntValue, bitmap3);
                            }
                        }
                    }
                    if (bitmap != null) {
                        remoteViews2.setImageViewBitmap(c35194nqi3.KWHzl(), bitmap);
                        return Unit.INSTANCE;
                    }
                    throw new java.lang.IllegalStateException("get crypto image  failed");
                }
                throw new java.lang.IllegalStateException("get coinCandle failed");
            }
            boolean z5 = widgetItemUtilsKt$updateItemWidget$1.Z$0;
            int i6 = widgetItemUtilsKt$updateItemWidget$1.I$0;
            triple = (Triple) widgetItemUtilsKt$updateItemWidget$1.L$5;
            C35194nqi c35194nqi4 = (C35194nqi) widgetItemUtilsKt$updateItemWidget$1.L$4;
            remoteViews2 = (android.widget.RemoteViews) widgetItemUtilsKt$updateItemWidget$1.L$3;
            c35191nqf2 = (C35191nqf) widgetItemUtilsKt$updateItemWidget$1.L$2;
            android.content.Context context4 = (android.content.Context) widgetItemUtilsKt$updateItemWidget$1.L$1;
            bizFindApiService2 = (BizFindApiService) widgetItemUtilsKt$updateItemWidget$1.L$0;
            C56391yDq.AEQbTJ(obj);
            z2 = z5;
            c35194nqi2 = c35194nqi4;
            context2 = context4;
            i2 = i6;
        }
        CoinCandle coinCandle2 = (CoinCandle) obj;
        java.lang.String first = triple.getFirst();
        widgetItemUtilsKt$updateItemWidget$1.L$0 = context2;
        widgetItemUtilsKt$updateItemWidget$1.L$1 = c35191nqf2;
        widgetItemUtilsKt$updateItemWidget$1.L$2 = remoteViews2;
        widgetItemUtilsKt$updateItemWidget$1.L$3 = c35194nqi2;
        widgetItemUtilsKt$updateItemWidget$1.L$4 = triple;
        widgetItemUtilsKt$updateItemWidget$1.L$5 = coinCandle2;
        widgetItemUtilsKt$updateItemWidget$1.I$0 = i2;
        widgetItemUtilsKt$updateItemWidget$1.Z$0 = z2;
        widgetItemUtilsKt$updateItemWidget$1.label = 2;
        java.lang.Object objEZpvd = C35129npW.EZpvd(first, bizFindApiService2, context2, c35191nqf2, widgetItemUtilsKt$updateItemWidget$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        coinCandle = coinCandle2;
        obj = objEZpvd;
        context3 = context2;
        c35194nqi3 = c35194nqi2;
        z3 = z2;
        i3 = i2;
        android.graphics.Bitmap bitmap22 = (android.graphics.Bitmap) obj;
        zOLrzqt = C35130npX.OLrzqt(triple);
        numAhwBna = c35194nqi3.AhwBna();
        if (numAhwBna != null) {
        }
        if (!zOLrzqt) {
            remoteViews2.setTextViewText(numValueOf.intValue(), "/" + ((java.lang.Object) triple.getSecond()));
        }
        remoteViews2.setViewVisibility(c35194nqi3.AEQbTJ(), 0);
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
        intent2.addFlags(335544320);
        if (!zOLrzqt) {
        }
        remoteViews2.setOnClickPendingIntent(c35194nqi3.AEQbTJ(), android.app.PendingIntent.getActivity(context3, i3, intent2, 67108864));
        if (coinCandle == null) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull BizFindApiService bizFindApiService, @NotNull android.content.Context context, @NotNull C35191nqf c35191nqf, boolean z, @NotNull Continuation<? super C35201nqp> continuation) throws java.lang.Throwable {
        WidgetItemUtilsKt$updateItemDataWidget$1 widgetItemUtilsKt$updateItemDataWidget$1;
        android.content.Context context2;
        boolean z2;
        C35191nqf c35191nqf2;
        BizFindApiService bizFindApiService2;
        Triple<java.lang.String, java.lang.String, java.lang.String> triple;
        CoinCandle coinCandle;
        C35191nqf c35191nqf3;
        boolean z3;
        java.lang.String second;
        java.lang.String strCopydefault;
        java.lang.Object objM7377constructorimpl;
        java.lang.String displayId;
        if (continuation instanceof WidgetItemUtilsKt$updateItemDataWidget$1) {
            widgetItemUtilsKt$updateItemDataWidget$1 = (WidgetItemUtilsKt$updateItemDataWidget$1) continuation;
            int i = widgetItemUtilsKt$updateItemDataWidget$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                widgetItemUtilsKt$updateItemDataWidget$1.label = i - Integer.MIN_VALUE;
            } else {
                widgetItemUtilsKt$updateItemDataWidget$1 = new WidgetItemUtilsKt$updateItemDataWidget$1(continuation);
            }
        }
        java.lang.Object objEZpvd = widgetItemUtilsKt$updateItemDataWidget$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = widgetItemUtilsKt$updateItemDataWidget$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            Triple<java.lang.String, java.lang.String, java.lang.String> tripleAEQbTJ = C35130npX.AEQbTJ(str);
            java.lang.String str2 = ((java.lang.Object) tripleAEQbTJ.getFirst()) + "-" + ((java.lang.Object) tripleAEQbTJ.getSecond());
            C35191nqf c35191nqf4 = new C35191nqf();
            widgetItemUtilsKt$updateItemDataWidget$1.L$0 = bizFindApiService;
            context2 = context;
            widgetItemUtilsKt$updateItemDataWidget$1.L$1 = context2;
            widgetItemUtilsKt$updateItemDataWidget$1.L$2 = c35191nqf;
            widgetItemUtilsKt$updateItemDataWidget$1.L$3 = tripleAEQbTJ;
            z2 = z;
            widgetItemUtilsKt$updateItemDataWidget$1.Z$0 = z2;
            widgetItemUtilsKt$updateItemDataWidget$1.label = 1;
            java.lang.Object objCopydefault2 = C35129npW.copydefault(str2, bizFindApiService, c35191nqf4, widgetItemUtilsKt$updateItemDataWidget$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            c35191nqf2 = c35191nqf;
            bizFindApiService2 = bizFindApiService;
            triple = tripleAEQbTJ;
            objEZpvd = objCopydefault2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = widgetItemUtilsKt$updateItemDataWidget$1.Z$0;
                coinCandle = (CoinCandle) widgetItemUtilsKt$updateItemDataWidget$1.L$2;
                triple = (Triple) widgetItemUtilsKt$updateItemDataWidget$1.L$1;
                c35191nqf3 = (C35191nqf) widgetItemUtilsKt$updateItemDataWidget$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) objEZpvd;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (coinCandle == null ? coinCandle.getDisplayId() : null))) {
                    second = triple.getSecond();
                } else {
                    if (coinCandle == null || (displayId = coinCandle.getDisplayId()) == null) {
                        displayId = "";
                    }
                    second = C35130npX.AEQbTJ(displayId).getSecond();
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = "";
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef3.element = "";
                Ref.DoubleRef doubleRef = new Ref.DoubleRef();
                Ref.IntRef intRef = new Ref.IntRef();
                if (coinCandle == null) {
                    InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
                    if (interfaceC43033rhe != null) {
                        java.lang.String open24h = coinCandle.getOpen24h();
                        if (open24h == null) {
                            open24h = "";
                        }
                        java.lang.String sodUtc0 = coinCandle.getSodUtc0();
                        java.lang.String str3 = sodUtc0 == null ? "" : sodUtc0;
                        java.lang.String sodUtc8 = coinCandle.getSodUtc8();
                        strCopydefault = interfaceC43033rhe.copydefault(open24h, str3, sodUtc8 == null ? "" : sodUtc8);
                    } else {
                        strCopydefault = null;
                    }
                    java.lang.String str4 = strCopydefault;
                    double dDivD$default = C33129mqd.divD$default(C33129mqd.subS$default(coinCandle.getLast(), str4, null, null, null, 14, null), str4, C56443yFo.AEQbTJ(4), null, RoundingMode.HALF_UP, 4, null);
                    doubleRef.element = dDivD$default;
                    boolean z4 = dDivD$default >= AudioStats.AUDIO_AMPLITUDE_NONE;
                    java.lang.String str5 = z4 ? "↑" : "↓";
                    java.lang.String plainString = C33129mqd.EZpvd(coinCandle.getLast()).toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString, "");
                    java.lang.String str6 = str5;
                    objectRef2.element = pTB.formatLocalized$default(plainString, null, 1, null) + (z3 ? str6 : "");
                    pUU.KWHzl("CryptoWidgetProvider", "updateItemWidget last price : " + coinCandle.getLast() + " ");
                    objectRef3.element = z4 ? Marker.ANY_NON_NULL_MARKER : "";
                    int iCopydefault = C33070mpX.copydefault(c35191nqf3.copydefault() == 0 ? C52761wXj.Activity.HJWChPRAkuRW : C52761wXj.Activity.fhUrPt);
                    int iCopydefault2 = C33070mpX.copydefault(c35191nqf3.copydefault() != 0 ? C52761wXj.Activity.HJWChPRAkuRW : C52761wXj.Activity.fhUrPt);
                    if (!z4) {
                        iCopydefault = iCopydefault2;
                    }
                    intRef.element = iCopydefault;
                    java.util.ArrayList arrayListCopydefault = copydefault(coinCandle.getCandles());
                    if (arrayListCopydefault != null) {
                        try {
                            Result.Application application = Result.Companion;
                            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListCopydefault, 10));
                            java.util.Iterator it = arrayListCopydefault.iterator();
                            while (it.hasNext()) {
                                arrayList.add(C56443yFo.OLrzqt(java.lang.Float.parseFloat((java.lang.String) it.next())));
                            }
                            objM7377constructorimpl = Result.m7377constructorimpl(C35129npW.AEQbTJ(arrayList, c35191nqf3, z4, strCopydefault != null ? C56443yFo.OLrzqt(java.lang.Float.parseFloat(strCopydefault)) : null));
                        } catch (java.lang.Throwable th) {
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        java.lang.Object obj = objM7377constructorimpl;
                        boolean zM7383isFailureimpl = Result.m7383isFailureimpl(obj);
                        T t = obj;
                        if (zM7383isFailureimpl) {
                            t = 0;
                        }
                        objectRef.element = t;
                    }
                    android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) objectRef.element;
                    if (bitmap2 == null) {
                        return null;
                    }
                    return new C35201nqp(bitmap, (java.lang.String) objectRef2.element, objectRef3.element + pTB.formatPercent$default(C33129mqd.EZpvd(C56443yFo.AEQbTJ(doubleRef.element)), 0, null, 3, null), triple.getFirst(), "/" + second, bitmap2, intRef.element, triple.getThird());
                }
                throw new java.lang.IllegalStateException("get coinCandle failed");
            }
            boolean z5 = widgetItemUtilsKt$updateItemDataWidget$1.Z$0;
            triple = (Triple) widgetItemUtilsKt$updateItemDataWidget$1.L$3;
            c35191nqf2 = (C35191nqf) widgetItemUtilsKt$updateItemDataWidget$1.L$2;
            context2 = (android.content.Context) widgetItemUtilsKt$updateItemDataWidget$1.L$1;
            bizFindApiService2 = (BizFindApiService) widgetItemUtilsKt$updateItemDataWidget$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            z2 = z5;
        }
        CoinCandle coinCandle2 = (CoinCandle) objEZpvd;
        java.lang.String first = triple.getFirst();
        C35191nqf c35191nqf5 = new C35191nqf();
        widgetItemUtilsKt$updateItemDataWidget$1.L$0 = c35191nqf2;
        widgetItemUtilsKt$updateItemDataWidget$1.L$1 = triple;
        widgetItemUtilsKt$updateItemDataWidget$1.L$2 = coinCandle2;
        widgetItemUtilsKt$updateItemDataWidget$1.L$3 = null;
        widgetItemUtilsKt$updateItemDataWidget$1.Z$0 = z2;
        widgetItemUtilsKt$updateItemDataWidget$1.label = 2;
        objEZpvd = C35129npW.EZpvd(first, bizFindApiService2, context2, c35191nqf5, widgetItemUtilsKt$updateItemDataWidget$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        coinCandle = coinCandle2;
        c35191nqf3 = c35191nqf2;
        z3 = z2;
        android.graphics.Bitmap bitmap3 = (android.graphics.Bitmap) objEZpvd;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (coinCandle == null ? coinCandle.getDisplayId() : null))) {
        }
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
        objectRef22.element = "";
        Ref.ObjectRef objectRef32 = new Ref.ObjectRef();
        objectRef32.element = "";
        Ref.DoubleRef doubleRef2 = new Ref.DoubleRef();
        Ref.IntRef intRef2 = new Ref.IntRef();
        if (coinCandle == null) {
        }
    }

    public static /* synthetic */ java.lang.Object updateItemDataWidget$default(java.lang.String str, BizFindApiService bizFindApiService, android.content.Context context, C35191nqf c35191nqf, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return EZpvd(str, bizFindApiService, context, c35191nqf, z, continuation);
    }

    public static final <T> java.util.ArrayList<T> copydefault(java.util.List<? extends T> list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList<T> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(list);
        Collections.reverse(arrayList);
        return arrayList;
    }
}
