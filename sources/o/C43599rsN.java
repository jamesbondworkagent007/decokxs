package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.nft.ui.kline.bean.CandlesticksBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rsN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43599rsN {
    public static final C43599rsN copydefault = new C43599rsN();

    /* JADX INFO: renamed from: o.rsN$TaskDescription */
    public static final class TaskDescription extends TypeToken<java.util.List<? extends java.util.List<? extends java.lang.String>>> {
    }

    private C43599rsN() {
    }

    public final CandlesticksBean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.Object objFromJson = new Gson().fromJson(str, new TaskDescription().getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            java.util.List<? extends java.util.List<java.lang.String>> list = (java.util.List) objFromJson;
            if (!list.isEmpty()) {
                return (CandlesticksBean) CollectionsKt___CollectionsKt.firstOrNull(EZpvd(list));
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        return null;
    }

    public final java.util.List<CandlesticksBean> AEQbTJ(@NotNull java.util.List<? extends java.util.List<java.lang.String>> list) {
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

    public final java.util.List<C35965oKg> copydefault(@NotNull java.util.List<CandlesticksBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final CandlesticksBean candlesticksBean : list) {
            arrayList.add(new C35965oKg("SPOT", C43603rsR.AEQbTJ.EZpvd(), C33129mqd.valueOf(candlesticksBean.getTs()), C33129mqd.AEQbTJ(candlesticksBean.getO()), C33129mqd.AEQbTJ(candlesticksBean.getH()), C33129mqd.AEQbTJ(candlesticksBean.getL()), C33129mqd.AEQbTJ(candlesticksBean.getC()), C33129mqd.AEQbTJ(candlesticksBean.getVol()), C33129mqd.AEQbTJ(candlesticksBean.getVol()), C33129mqd.AEQbTJ(candlesticksBean.getVol()), C56392yDr.copydefault(new Function0() { // from class: o.rsO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43599rsN.copydefault(candlesticksBean);
                }
            })));
        }
        return arrayList;
    }

    public static final java.lang.String copydefault(CandlesticksBean candlesticksBean) {
        return pTB.formatICUCompact$default(new BigDecimal(candlesticksBean.getVolUsd()), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2), null, null, 12, null);
    }

    public final java.util.List<CandlesticksBean> EZpvd(java.util.List<? extends java.util.List<java.lang.String>> list) {
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
}
