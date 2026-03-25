package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.dexkline.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import com.okinc.dexkline.market.di.DataSerializerModule;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mTT {
    public static final mTT EZpvd = new mTT();

    public static final class Activity extends TypeToken<java.util.List<? extends java.util.List<? extends java.lang.String>>> {
    }

    private mTT() {
    }

    public final CandlesticksBean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.Object objFromJson = new Gson().fromJson(str, new Activity().getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            java.util.List<? extends java.util.List<java.lang.String>> list = (java.util.List) objFromJson;
            if (!list.isEmpty()) {
                return (CandlesticksBean) CollectionsKt___CollectionsKt.firstOrNull(AEQbTJ(list));
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        return null;
    }

    public final java.util.List<CandlesticksBean> OLrzqt(@NotNull java.util.List<? extends java.util.List<java.lang.String>> list) {
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

    public final java.util.List<oUO> EZpvd(@NotNull java.util.List<CandlesticksBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final CandlesticksBean candlesticksBean : list) {
            arrayList.add(new oUO(mTL.KWHzl.KWHzl(), "SPOT", C33129mqd.valueOf(candlesticksBean.getTs()), C33129mqd.AEQbTJ(candlesticksBean.getO()), C33129mqd.AEQbTJ(candlesticksBean.getH()), C33129mqd.AEQbTJ(candlesticksBean.getL()), C33129mqd.AEQbTJ(candlesticksBean.getC()), C33129mqd.AEQbTJ(candlesticksBean.getVol()), C33129mqd.AEQbTJ(candlesticksBean.getVol()), C33129mqd.AEQbTJ(candlesticksBean.getVol()), C56392yDr.copydefault(new Function0() { // from class: o.mTQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return mTT.OLrzqt(candlesticksBean);
                }
            })));
        }
        return arrayList;
    }

    public static final java.lang.String OLrzqt(CandlesticksBean candlesticksBean) {
        return pTB.formatICUCompact$default(new BigDecimal(candlesticksBean.getVolUsd()), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2), null, null, 12, null);
    }

    public final java.util.List<CandlesticksBean> AEQbTJ(java.util.List<? extends java.util.List<java.lang.String>> list) {
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

    public final java.util.List<MarketTxWsInfoItemBean> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json jsonEZpvd = DataSerializerModule.copydefault.EZpvd();
            jsonEZpvd.getSerializersModule();
            return (java.util.List) jsonEZpvd.decodeFromString(new ArrayListSerializer(MarketTxWsInfoItemBean.Companion.serializer()), str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
