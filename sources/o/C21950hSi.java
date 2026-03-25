package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import com.okinc.business.market.di.DataSerializerModule;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hSi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21950hSi {
    public static final C21950hSi OLrzqt = new C21950hSi();

    /* JADX INFO: renamed from: o.hSi$Application */
    public static final class Application extends TypeToken<java.util.List<? extends java.util.List<? extends java.lang.String>>> {
    }

    private C21950hSi() {
    }

    public final CandlesticksBean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.Object objFromJson = new Gson().fromJson(str, new Application().getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            java.util.List<? extends java.util.List<java.lang.String>> list = (java.util.List) objFromJson;
            if (!list.isEmpty()) {
                return (CandlesticksBean) CollectionsKt___CollectionsKt.firstOrNull(OLrzqt(list));
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        return null;
    }

    public final java.util.List<CandlesticksBean> KWHzl(@NotNull java.util.List<? extends java.util.List<java.lang.String>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            CandlesticksBean candlesticksBean = new CandlesticksBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 255, (DefaultConstructorMarker) null);
            int i2 = 0;
            for (java.lang.Object obj2 : (java.util.List) obj) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str = (java.lang.String) obj2;
                switch (i2) {
                    case 0:
                        candlesticksBean.setTs(str);
                        break;
                    case 1:
                        candlesticksBean.setO(str);
                        break;
                    case 2:
                        candlesticksBean.setH(str);
                        break;
                    case 3:
                        candlesticksBean.setL(str);
                        break;
                    case 4:
                        candlesticksBean.setC(str);
                        break;
                    case 5:
                        candlesticksBean.setVol(str);
                        break;
                    case 6:
                        candlesticksBean.setVolUsd(str);
                        break;
                    case 7:
                        candlesticksBean.setConfirm(str);
                        break;
                }
                i2++;
            }
            arrayList.add(candlesticksBean);
            i++;
        }
        return arrayList;
    }

    public final java.util.List<oUO> AEQbTJ(@NotNull java.util.List<CandlesticksBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final CandlesticksBean candlesticksBean : list) {
            arrayList.add(new oUO(hRZ.OLrzqt.AEQbTJ(), "SPOT", C33129mqd.valueOf(candlesticksBean.getTs()), C33129mqd.AEQbTJ(candlesticksBean.getO()), C33129mqd.AEQbTJ(candlesticksBean.getH()), C33129mqd.AEQbTJ(candlesticksBean.getL()), C33129mqd.AEQbTJ(candlesticksBean.getC()), C33129mqd.AEQbTJ(candlesticksBean.getVol()), C33129mqd.AEQbTJ(candlesticksBean.getVol()), C33129mqd.AEQbTJ(candlesticksBean.getVol()), C56392yDr.copydefault(new Function0() { // from class: o.hSe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21950hSi.copydefault(candlesticksBean);
                }
            })));
        }
        return arrayList;
    }

    public static final java.lang.String copydefault(CandlesticksBean candlesticksBean) {
        return pTB.formatICUCompact$default(new BigDecimal(candlesticksBean.getVolUsd()), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2), null, null, 12, null);
    }

    public final java.util.List<CandlesticksBean> OLrzqt(java.util.List<? extends java.util.List<java.lang.String>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!list.isEmpty()) {
            for (java.util.List<java.lang.String> list2 : list) {
                CandlesticksBean candlesticksBean = new CandlesticksBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 255, (DefaultConstructorMarker) null);
                int i = 0;
                for (java.lang.Object obj : list2) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.String str = (java.lang.String) obj;
                    switch (i) {
                        case 0:
                            candlesticksBean.setTs(str);
                            break;
                        case 1:
                            candlesticksBean.setO(str);
                            break;
                        case 2:
                            candlesticksBean.setH(str);
                            break;
                        case 3:
                            candlesticksBean.setL(str);
                            break;
                        case 4:
                            candlesticksBean.setC(str);
                            break;
                        case 5:
                            candlesticksBean.setVol(str);
                            break;
                        case 6:
                            candlesticksBean.setVolUsd(str);
                            break;
                        case 7:
                            candlesticksBean.setConfirm(str);
                            break;
                    }
                    i++;
                }
                if (C33129mqd.KWHzl((java.util.Collection) arrayList) && Intrinsics.EZpvd((java.lang.Object) ((CandlesticksBean) arrayList.get(arrayList.size() - 1)).getTs(), (java.lang.Object) candlesticksBean.getTs())) {
                    arrayList.set(arrayList.size() - 1, candlesticksBean);
                } else {
                    arrayList.add(candlesticksBean);
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<MarketTxWsInfoItemBean> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json jsonKWHzl = DataSerializerModule.EZpvd.KWHzl();
            jsonKWHzl.getSerializersModule();
            return (java.util.List) jsonKWHzl.decodeFromString(new ArrayListSerializer(MarketTxWsInfoItemBean.Companion.serializer()), str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
