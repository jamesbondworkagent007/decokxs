package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.TradeLiveData;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.WatchListBean;
import com.okinc.unify_trade.biz.subscribe.SettingWatchList;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56090xwJ implements InterfaceC55707xoy {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xwH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C56090xwJ.EZpvd();
        }
    });
    public final boolean AEQbTJ = C55697xoo.OLrzqt.isConnected();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xwI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C56090xwJ.AEQbTJ();
        }
    });

    public final xIN AhwBna() {
        return (xIN) this.copydefault.getValue();
    }

    public static final xIN EZpvd() {
        return new xIN();
    }

    public final TradeLiveData<java.util.List<WatchListBean>> djBIcL() {
        return (TradeLiveData) this.KWHzl.getValue();
    }

    public static final TradeLiveData AEQbTJ() {
        return new TradeLiveData();
    }

    @Override // o.InterfaceC55707xoy
    public LiveData<java.lang.Boolean> copydefault(@NotNull WatchListBean watchListBean) {
        Intrinsics.checkNotNullParameter(watchListBean, "");
        return AEQbTJ("0", watchListBean);
    }

    @Override // o.InterfaceC55707xoy
    public LiveData<java.lang.Boolean> EZpvd(@NotNull WatchListBean watchListBean) {
        Intrinsics.checkNotNullParameter(watchListBean, "");
        return AEQbTJ("1", watchListBean);
    }

    public final LiveData<java.lang.Boolean> AEQbTJ(java.lang.String str, WatchListBean watchListBean) {
        TradeLiveData tradeLiveData = new TradeLiveData();
        AEQbTJ(new SettingWatchList(str, watchListBean.getInstId(), watchListBean.getInstType(), watchListBean.getAlias(), watchListBean.getExpTime(), "", ""), new Application());
        return tradeLiveData;
    }

    /* JADX INFO: renamed from: o.xwJ$Application */
    public static final class Application implements InterfaceC55701xos<Unit> {
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, Unit unit, java.lang.Exception exc) {
            C56090xwJ.this.OLrzqt();
        }
    }

    public InterfaceC58217yxC AEQbTJ(@NotNull SettingWatchList settingWatchList, @NotNull InterfaceC55701xos<Unit> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(settingWatchList, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        if (this.AEQbTJ) {
            return AhwBna().AEQbTJ(settingWatchList.getOperator(), settingWatchList.getInstId(), settingWatchList.getInstType(), settingWatchList.getAlias(), settingWatchList.getExpTime(), interfaceC55701xos);
        }
        interfaceC55701xos.EZpvd(AEQbTJ(settingWatchList), Unit.INSTANCE, null);
        return new C58216yxB();
    }

    public final boolean AEQbTJ(java.util.ArrayList<WatchListBean> arrayList) {
        if (arrayList.size() <= 50) {
            SPUtils.put(xPX.AEQbTJ.KWHzl(), arrayList);
            return true;
        }
        C33134mqi.copydefault(C55688xof.Application.setToolbarNavigationClickListener);
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean AEQbTJ(SettingWatchList settingWatchList) {
        java.util.ArrayList<WatchListBean> arrayListAEQbTJ = xUV.EZpvd.AEQbTJ();
        java.lang.String alias = settingWatchList.getAlias();
        java.lang.String str = alias == null ? "" : alias;
        java.lang.String expTime = settingWatchList.getExpTime();
        java.lang.String str2 = expTime == null ? "" : expTime;
        java.lang.String instId = settingWatchList.getInstId();
        java.lang.String instType = settingWatchList.getInstType();
        java.lang.String chainId = settingWatchList.getChainId();
        java.lang.String str3 = chainId == null ? "" : chainId;
        java.lang.String tokenContractAddress = settingWatchList.getTokenContractAddress();
        WatchListBean watchListBean = new WatchListBean(str, str2, instId, instType, str3, tokenContractAddress == null ? "" : tokenContractAddress, "", "");
        java.lang.String operator = settingWatchList.getOperator();
        switch (operator.hashCode()) {
            case 48:
                if (operator.equals("0")) {
                    if (arrayListAEQbTJ.contains(watchListBean)) {
                        return false;
                    }
                    arrayListAEQbTJ.add(watchListBean);
                }
                break;
            case 49:
                if (operator.equals("1")) {
                    if (!arrayListAEQbTJ.contains(watchListBean)) {
                        return false;
                    }
                    arrayListAEQbTJ.remove(watchListBean);
                }
                break;
            case 50:
                if (operator.equals("2")) {
                    arrayListAEQbTJ.remove(watchListBean);
                    arrayListAEQbTJ.add(0, watchListBean);
                }
                break;
        }
        AEQbTJ(arrayListAEQbTJ);
        return true;
    }

    /* JADX INFO: renamed from: o.xwJ$TaskDescription */
    public static final class TaskDescription implements InterfaceC55701xos<java.util.List<? extends WatchListData>> {
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<WatchListData> list, java.lang.Exception exc) {
            if (!z || list == null) {
                C56090xwJ.this.djBIcL().setValue(xUV.EZpvd.AEQbTJ());
                return;
            }
            TradeLiveData tradeLiveDataDjBIcL = C56090xwJ.this.djBIcL();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(WatchListBean.Companion.AEQbTJ((WatchListData) it.next()));
            }
            tradeLiveDataDjBIcL.postValue(arrayList);
        }
    }

    @Override // o.InterfaceC55707xoy
    public LiveData<java.util.List<WatchListBean>> OLrzqt() {
        if (this.AEQbTJ) {
            AhwBna().copydefault(new TaskDescription());
        } else {
            djBIcL().setValue(xUV.EZpvd.AEQbTJ());
        }
        return djBIcL();
    }

    @Override // o.InterfaceC55707xoy
    public boolean OLrzqt(@NotNull WatchListBean watchListBean) {
        Intrinsics.checkNotNullParameter(watchListBean, "");
        java.util.List<WatchListBean> value = djBIcL().getValue();
        if (value != null) {
            return value.contains(watchListBean);
        }
        return false;
    }
}
