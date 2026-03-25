package o;

import androidx.camera.video.AudioStats;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.TradeLiveData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xNS extends xNW implements xOY {
    public final xDI OLrzqt = new xDI();
    public final C54269xCd KWHzl = new C54269xCd();
    public TradeLiveData<ValuationCurrencyData> EZpvd = new TradeLiveData<>();
    public final java.util.ArrayList<ValuationCurrencyData> AEQbTJ = new java.util.ArrayList<>();
    public android.util.ArrayMap<java.lang.String, ValuationCurrencyData> copydefault = new android.util.ArrayMap<>();

    @Override // o.xNW
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xNW
    public java.lang.String EZpvd() {
        return "CurrencyInfoProvider";
    }

    @Override // o.xNW
    public boolean bE_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xOY
    public java.util.ArrayList<ValuationCurrencyData> bF_() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xOY
    public MutableLiveData<ValuationCurrencyData> bG_() {
        return this.EZpvd;
    }

    @Override // o.xNW
    public void gEmmrt() {
        if (!this.AEQbTJ.isEmpty()) {
            pUU.KWHzl(fJNWhG(), EZpvd() + " first notifyResult true");
            xNW.notifyResult$default(this, true, null, 2, null);
            OLrzqt(false);
            return;
        }
        OLrzqt(true);
    }

    public final void OLrzqt(final boolean z) {
        final xKL<java.util.ArrayList<ValuationCurrencyBean>> fieldNames = getFieldNames();
        fieldNames.AYXKKw();
        pUU.KWHzl(fJNWhG(), EZpvd() + " useCache=" + copydefault());
        if (hDKMBd()) {
            this.KWHzl.KWHzl(copydefault());
        } else {
            this.OLrzqt.copydefault(copydefault());
        }
        fieldNames.KWHzl(new Function1() { // from class: o.xNU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xNS.copydefault(this.copydefault, z, fieldNames, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(fieldNames, 0L, 1, null);
    }

    public static final Unit copydefault(xNS xns, boolean z, xKL xkl, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.String strFJNWhG = xns.fJNWhG();
        java.lang.String strEZpvd = xns.EZpvd();
        boolean z2 = responseData.getCode() == 0;
        java.lang.String msg = responseData.getCode() != 0 ? responseData.getMsg() : "";
        pUU.KWHzl(strFJNWhG, "task " + strEZpvd + " loadHttp getCurrencyValList:" + z2 + ";" + msg + "; 'costTime: " + (java.lang.System.currentTimeMillis() - xns.AuCTel()));
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            xns.AEQbTJ.clear();
            java.util.ArrayList<ValuationCurrencyData> arrayList = xns.AEQbTJ;
            java.util.ArrayList<ValuationCurrencyBean> arrayList2 = (java.util.ArrayList) responseData.getData();
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList<>();
            }
            arrayList.addAll(xns.OLrzqt(arrayList2));
            xns.EZpvd(xns.AEQbTJ);
            if (z) {
                xNW.notifyResult$default(xns, true, null, 2, null);
            }
        } else {
            pUU.KWHzl(xns.fJNWhG(), xns.EZpvd() + " failed, isDowngrade = " + xns.bE_() + ", 降级处理");
            xns.EZpvd(xns.AEQbTJ);
            if (z) {
                xns.AEQbTJ(false, xns.AEQbTJ(xkl.AhwBna().getValue()));
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.util.ArrayList<ValuationCurrencyData> arrayList) {
        java.lang.Object obj;
        java.lang.Object next;
        InterfaceC46553tYp interfaceC46553tYp = (InterfaceC46553tYp) C43251rlk.OLrzqt(InterfaceC46553tYp.class);
        int iQKVWgx = interfaceC46553tYp != null ? interfaceC46553tYp.QKVWgx() : 0;
        java.util.Iterator<T> it = arrayList.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) C33129mqd.gEmmrt(((ValuationCurrencyData) next).getCurrencyId()), (java.lang.Object) C33129mqd.gEmmrt(java.lang.Integer.valueOf(iQKVWgx)))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ValuationCurrencyData valuationCurrencyData = (ValuationCurrencyData) next;
        pUU.EZpvd(fJNWhG(), EZpvd() + " refreshCurrentCurrencyData(),currencyId= " + iQKVWgx);
        if (arrayList.isEmpty() && this.copydefault.isEmpty()) {
            ValuationCurrencyData valuationCurrencyDataEZpvd = ValuationCurrencyData.Companion.EZpvd();
            this.copydefault.put(valuationCurrencyDataEZpvd.getIsoCode(), valuationCurrencyDataEZpvd);
            this.EZpvd.setValue(valuationCurrencyDataEZpvd);
            return;
        }
        for (ValuationCurrencyData valuationCurrencyData2 : arrayList) {
            this.copydefault.put(valuationCurrencyData2.getIsoCode(), valuationCurrencyData2);
        }
        if (valuationCurrencyData != null && this.copydefault.get(valuationCurrencyData.getIsoCode()) == null) {
            this.EZpvd.setValue(C33129mqd.KWHzl((java.util.Collection) arrayList) ? (ValuationCurrencyData) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList) : ValuationCurrencyData.Companion.EZpvd());
            return;
        }
        if (getNewProxyInstance()) {
            if (valuationCurrencyData != null) {
                this.EZpvd.setValue(valuationCurrencyData);
                return;
            }
            return;
        }
        java.util.Iterator<T> it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next2 = it2.next();
            if (C33129mqd.OLrzqt(((ValuationCurrencyData) next2).getCurrencyId(), java.lang.Integer.valueOf(((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QKVWgx()))) {
                obj = next2;
                break;
            }
        }
        ValuationCurrencyData valuationCurrencyData3 = (ValuationCurrencyData) obj;
        if (valuationCurrencyData3 == null) {
            valuationCurrencyData3 = new ValuationCurrencyData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
        }
        this.EZpvd.setValue(valuationCurrencyData3);
    }

    @Override // o.xOY
    public ValuationCurrencyData AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.get(str);
    }

    @Override // o.xNW
    public java.util.List<xKK> djBIcL() {
        return yDY.copydefault(this.OLrzqt, this.KWHzl);
    }

    public final boolean copydefault() {
        C54588xNy c54588xNyAkhnZx = AkhnZx();
        return (c54588xNyAkhnZx instanceof xNF) || (c54588xNyAkhnZx instanceof xNE) || (c54588xNyAkhnZx instanceof xNG);
    }

    private final xKL<java.util.ArrayList<ValuationCurrencyBean>> getFieldNames() {
        return hDKMBd() ? this.KWHzl : this.OLrzqt;
    }

    public final java.util.List<ValuationCurrencyData> OLrzqt(java.util.ArrayList<ValuationCurrencyBean> arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (ValuationCurrencyBean valuationCurrencyBean : arrayList) {
            arrayList2.add(new ValuationCurrencyData(C33129mqd.gEmmrt(java.lang.Integer.valueOf(valuationCurrencyBean.getCurrencyId())), valuationCurrencyBean.getIsoCode(), valuationCurrencyBean.getDisplayName(), C33129mqd.gEmmrt(java.lang.Integer.valueOf(valuationCurrencyBean.isDefault())), valuationCurrencyBean.getSymbol(), C33129mqd.gEmmrt(java.lang.Double.valueOf(valuationCurrencyBean.getUsdToThisRate())), C33129mqd.gEmmrt(java.lang.Integer.valueOf(valuationCurrencyBean.getPrecision())), valuationCurrencyBean.isPremium(), valuationCurrencyBean.getUsdToThisRatePremium() == AudioStats.AUDIO_AMPLITUDE_NONE ? "" : C33129mqd.gEmmrt(java.lang.Double.valueOf(valuationCurrencyBean.getUsdToThisRatePremium()))));
        }
        return arrayList2;
    }
}
