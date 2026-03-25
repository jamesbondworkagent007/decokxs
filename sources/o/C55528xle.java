package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_find.data.Candles;
import com.okinc.unify_find.data.CandlesRequest;
import com.okinc.unify_find.data.GapData;
import com.okinc.unify_find.module.FuturesSpotGapModule$checkInstrument$1;
import com.okinc.unify_find.net.BizFindApiService;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xle, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55528xle {
    public static /* synthetic */ AbstractC58185ywX getGapViewData$default(C55528xle c55528xle, CandlesRequest candlesRequest, CandlesRequest candlesRequest2, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c55528xle.OLrzqt(candlesRequest, candlesRequest2, str, z);
    }

    public final AbstractC58185ywX<GapData> OLrzqt(@NotNull CandlesRequest candlesRequest, @NotNull CandlesRequest candlesRequest2, @NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(candlesRequest, "");
        Intrinsics.checkNotNullParameter(candlesRequest2, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        final xMW xmwKWHzl = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.KWHzl() : null;
        java.util.HashMap<java.lang.String, java.lang.String> mapAEQbTJ = AEQbTJ(candlesRequest);
        java.util.HashMap<java.lang.String, java.lang.String> mapAEQbTJ2 = AEQbTJ(candlesRequest2);
        AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> marketCandles = ((BizFindApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizFindApiService.class), null, 1, null)).getMarketCandles(mapAEQbTJ);
        AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> spotIndexCandles = ((BizFindApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizFindApiService.class), null, 1, null)).getSpotIndexCandles(mapAEQbTJ2);
        final Function2 function2 = new Function2() { // from class: o.xlf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55528xle.OLrzqt(z, xmwKWHzl, str, (ResponseData) obj, (ResponseData) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(marketCandles, spotIndexCandles, new InterfaceC58223yxI() { // from class: o.xlj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C55528xle.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return C33024moe.KWHzl(abstractC58185ywXKWHzl);
    }

    public static final GapData copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (GapData) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: o.xle$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(((java.util.List) t).get(0))), java.lang.Long.valueOf(C33129mqd.valueOf(((java.util.List) t2).get(0))));
        }
    }

    /* JADX INFO: renamed from: o.xle$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(((java.util.List) t).get(0))), java.lang.Long.valueOf(C33129mqd.valueOf(((java.util.List) t2).get(0))));
        }
    }

    public final java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ(CandlesRequest candlesRequest) {
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        java.lang.String strKWHzl = c33489mxS.KWHzl(CandlesRequest.Companion.serializer(), candlesRequest);
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        return new java.util.HashMap<>((java.util.Map) c33489mxS.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(c56529yIt), BuiltinSerializersKt.serializer(c56529yIt)), strKWHzl));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e1 -> B:37:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(InterfaceC54581xNr interfaceC54581xNr, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        FuturesSpotGapModule$checkInstrument$1 futuresSpotGapModule$checkInstrument$1;
        java.util.Iterator it;
        InterfaceC54581xNr interfaceC54581xNr2;
        java.util.Collection collection;
        if (continuation instanceof FuturesSpotGapModule$checkInstrument$1) {
            futuresSpotGapModule$checkInstrument$1 = (FuturesSpotGapModule$checkInstrument$1) continuation;
            int i = futuresSpotGapModule$checkInstrument$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                futuresSpotGapModule$checkInstrument$1.label = i - Integer.MIN_VALUE;
            } else {
                futuresSpotGapModule$checkInstrument$1 = new FuturesSpotGapModule$checkInstrument$1(this, continuation);
            }
        }
        java.lang.Object obj = futuresSpotGapModule$checkInstrument$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = futuresSpotGapModule$checkInstrument$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayListCopydefault = yDY.copydefault("SPOT", "FUTURES", "SWAP");
            java.util.ArrayList<AbstractC54531xLw> arrayListAuCTel = interfaceC54581xNr.AuCTel();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayListAuCTel) {
                if (!AbstractC54531xLw.isInitFun$default((AbstractC54531xLw) obj2, false, 1, null)) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : arrayList2) {
                if (arrayListCopydefault.contains(((AbstractC54531xLw) obj3).AYXKKw())) {
                    arrayList3.add(obj3);
                }
            }
            if (arrayList3.isEmpty()) {
                return C56443yFo.KWHzl(true);
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
            it = arrayList3.iterator();
            interfaceC54581xNr2 = interfaceC54581xNr;
            collection = arrayList4;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (java.util.Collection) futuresSpotGapModule$checkInstrument$1.L$3;
            it = (java.util.Iterator) futuresSpotGapModule$checkInstrument$1.L$2;
            java.util.Collection collection2 = (java.util.Collection) futuresSpotGapModule$checkInstrument$1.L$1;
            InterfaceC54581xNr interfaceC54581xNr3 = (InterfaceC54581xNr) futuresSpotGapModule$checkInstrument$1.L$0;
            C56391yDq.AEQbTJ(obj);
            collection.add((AbstractC54531xLw) obj);
            collection = collection2;
            interfaceC54581xNr2 = interfaceC54581xNr3;
            if (it.hasNext()) {
                java.lang.String strAYXKKw = ((AbstractC54531xLw) it.next()).AYXKKw();
                futuresSpotGapModule$checkInstrument$1.L$0 = interfaceC54581xNr2;
                futuresSpotGapModule$checkInstrument$1.L$1 = collection;
                futuresSpotGapModule$checkInstrument$1.L$2 = it;
                futuresSpotGapModule$checkInstrument$1.L$3 = collection;
                futuresSpotGapModule$checkInstrument$1.label = 1;
                java.lang.Object objEZpvd = interfaceC54581xNr2.EZpvd(strAYXKKw, futuresSpotGapModule$checkInstrument$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC54581xNr3 = interfaceC54581xNr2;
                obj = objEZpvd;
                collection2 = collection;
                collection.add((AbstractC54531xLw) obj);
                collection = collection2;
                interfaceC54581xNr2 = interfaceC54581xNr3;
                if (it.hasNext()) {
                    java.util.Iterator it2 = ((java.util.List) collection).iterator();
                    while (it2.hasNext()) {
                        if (((AbstractC54531xLw) it2.next()) == null) {
                            C55326xho.toast$default(C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                            return C56443yFo.KWHzl(false);
                        }
                    }
                    return C56443yFo.KWHzl(true);
                }
            }
        }
    }

    public static final GapData OLrzqt(boolean z, xMW xmw, java.lang.String str, ResponseData responseData, ResponseData responseData2) throws java.lang.Exception {
        java.lang.String strMulS$default;
        java.lang.String strMulS$default2;
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(responseData2, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && responseData2.getCode() == 0 && responseData2.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData()) && C33129mqd.KWHzl((java.util.Collection) responseData2.getData())) {
            java.lang.Object data = responseData2.getData();
            Intrinsics.copydefault(data);
            java.util.List<java.util.List> listEZpvd = CollectionsKt___CollectionsKt.EZpvd((java.lang.Iterable) data, new Activity());
            java.util.ArrayList<Candles> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (java.util.List list : listEZpvd) {
                Candles candles = new Candles((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 127, (DefaultConstructorMarker) null);
                if (list.size() >= 5) {
                    candles.setTs((java.lang.String) list.get(0));
                    candles.setO((java.lang.String) list.get(1));
                    candles.setH((java.lang.String) list.get(2));
                    candles.setL((java.lang.String) list.get(3));
                    candles.setC((java.lang.String) list.get(4));
                }
                arrayList.add(candles);
            }
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            java.util.List<java.util.List> listEZpvd2 = CollectionsKt___CollectionsKt.EZpvd((java.lang.Iterable) data2, new TaskDescription());
            java.util.ArrayList<Candles> arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd2, 10));
            for (java.util.List list2 : listEZpvd2) {
                Candles candles2 = new Candles((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 127, (DefaultConstructorMarker) null);
                if (list2.size() >= 5) {
                    candles2.setTs((java.lang.String) list2.get(0));
                    candles2.setO((java.lang.String) list2.get(1));
                    candles2.setH((java.lang.String) list2.get(2));
                    candles2.setL((java.lang.String) list2.get(3));
                    candles2.setC((java.lang.String) list2.get(4));
                }
                arrayList2.add(candles2);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            if (arrayList2.size() != arrayList5.size()) {
                if (arrayList2.size() > arrayList.size()) {
                    java.util.List listSubList = arrayList2.subList(arrayList2.size() - arrayList.size(), arrayList2.size());
                    for (Candles candles3 : arrayList) {
                        arrayList3.add(candles3.getTs());
                        if (z) {
                            if (xmw == null || (strMulS$default = xmw.AhwBna(candles3.getC())) == null) {
                                strMulS$default = C33129mqd.mulS$default(candles3.getC(), str, null, null, null, 14, null);
                            }
                            arrayList5.add(strMulS$default);
                        } else {
                            arrayList5.add(C33129mqd.mulS$default(candles3.getC(), str, null, null, null, 14, null));
                        }
                    }
                    java.util.Iterator it = listSubList.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(C33129mqd.mulS$default(((Candles) it.next()).getC(), str, null, null, null, 14, null));
                    }
                } else {
                    for (Candles candles4 : arrayList.subList(arrayList.size() - arrayList2.size(), arrayList.size())) {
                        if (z) {
                            if (xmw == null || (strMulS$default2 = xmw.AhwBna(candles4.getC())) == null) {
                                strMulS$default2 = C33129mqd.mulS$default(candles4.getC(), str, null, null, null, 14, null);
                            }
                            arrayList5.add(strMulS$default2);
                        } else {
                            arrayList5.add(C33129mqd.mulS$default(candles4.getC(), str, null, null, null, 14, null));
                        }
                    }
                    for (Candles candles5 : arrayList2) {
                        arrayList3.add(candles5.getTs());
                        arrayList4.add(C33129mqd.mulS$default(candles5.getC(), str, null, null, null, 14, null));
                    }
                }
            }
            return new GapData(arrayList3, arrayList4, arrayList5);
        }
        throw new java.lang.Exception(C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj));
    }
}
