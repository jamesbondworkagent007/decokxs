package o;

import com.okinc.core.util.SPUtils;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.WatchListBean;
import com.okinc.unify_trade.biz.subscribe.BizKLineData;
import com.okinc.unify_trade.biz.subscribe.BizTradeData;
import com.okinc.unify_trade.biz.subscribe.SettingWatchList;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickerInstReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56131xwy implements InterfaceC55702xot {
    public static final int AEQbTJ = 0;
    public final xIN copydefault = new xIN();

    @Override // o.InterfaceC55702xot
    public InterfaceC58217yxC KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull InterfaceC55701xos<Unit> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.copydefault.AEQbTJ(str, str2, str3, str4, str5, interfaceC55701xos);
    }

    public InterfaceC58217yxC EZpvd(@NotNull java.util.List<SettingWatchList> list, @NotNull InterfaceC55701xos<Unit> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        if (C55697xoo.OLrzqt.isConnected()) {
            return this.copydefault.EZpvd(list, interfaceC55701xos);
        }
        interfaceC55701xos.EZpvd(EZpvd(list), null, null);
        return new C58216yxB();
    }

    public final boolean EZpvd(java.util.List<SettingWatchList> list) {
        java.util.ArrayList<WatchListBean> arrayList = new java.util.ArrayList<>();
        for (SettingWatchList settingWatchList : list) {
            java.lang.String alias = settingWatchList.getAlias();
            java.lang.String str = alias == null ? "" : alias;
            java.lang.String expTime = settingWatchList.getExpTime();
            java.lang.String str2 = expTime == null ? "" : expTime;
            java.lang.String instType = settingWatchList.getInstType();
            java.lang.String instId = settingWatchList.getInstId();
            java.lang.String chainId = settingWatchList.getChainId();
            java.lang.String str3 = chainId == null ? "" : chainId;
            java.lang.String tokenContractAddress = settingWatchList.getTokenContractAddress();
            arrayList.add(new WatchListBean(str, str2, instId, instType, str3, tokenContractAddress == null ? "" : tokenContractAddress, "", ""));
        }
        return KWHzl(arrayList);
    }

    public final boolean KWHzl(java.util.ArrayList<WatchListBean> arrayList) {
        if (arrayList.size() <= 50) {
            SPUtils.put(xPX.AEQbTJ.KWHzl(), arrayList);
            return true;
        }
        C33134mqi.copydefault(C55688xof.Application.setToolbarNavigationClickListener);
        return false;
    }

    public InterfaceC58217yxC OLrzqt(@NotNull InterfaceC55701xos<java.util.List<WatchListData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        if (C55697xoo.OLrzqt.isConnected()) {
            return this.copydefault.copydefault(interfaceC55701xos);
        }
        interfaceC55701xos.EZpvd(true, xUV.EZpvd.EZpvd(), null);
        return new C58216yxB();
    }

    @Override // o.InterfaceC55702xot
    public InterfaceC58217yxC copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.copydefault.OLrzqt(str, str2, interfaceC55701xos);
    }

    @Override // o.InterfaceC55702xot
    public InterfaceC58217yxC copydefault(@NotNull TickerInstReq tickerInstReq, @NotNull InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(tickerInstReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.copydefault.AEQbTJ(tickerInstReq, interfaceC55701xos);
    }

    @Override // o.InterfaceC55702xot
    public InterfaceC58217yxC copydefault(@NotNull TickerCupReq tickerCupReq, @NotNull InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(tickerCupReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.copydefault.EZpvd(tickerCupReq, interfaceC55701xos);
    }

    public InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, @NotNull InterfaceC55701xos<TickersData> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.copydefault.copydefault(str, interfaceC55701xos);
    }

    @Override // o.InterfaceC55702xot
    public InterfaceC58217yxC EZpvd(java.lang.String str, java.lang.String str2, @NotNull InterfaceC55701xos<java.util.List<IndexTickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.copydefault.copydefault(str, str2, interfaceC55701xos);
    }

    @Override // o.InterfaceC55702xot
    public InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull InterfaceC55701xos<java.util.List<BizKLineData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.copydefault.copydefault(str, str2, str3, str4, interfaceC55701xos);
    }

    @Override // o.InterfaceC55702xot
    public InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull InterfaceC55701xos<java.util.List<BizKLineData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.copydefault.AEQbTJ(str, str2, str3, str4, interfaceC55701xos);
    }

    @Override // o.InterfaceC55702xot
    public InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull InterfaceC55701xos<java.util.List<BizKLineData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.copydefault.AEQbTJ(str, str2, interfaceC55701xos);
    }

    public InterfaceC58217yxC copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        if (!C33129mqd.KWHzl((java.util.Collection) list)) {
            return null;
        }
        return this.copydefault.KWHzl(CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null), interfaceC55701xos);
    }

    public final java.util.ArrayList<WatchListBean> AEQbTJ() {
        java.util.ArrayList<WatchListBean> arrayList = SPUtils.getArrayList(xPX.AEQbTJ.KWHzl(), WatchListBean.class);
        return arrayList == null ? new java.util.ArrayList<>() : arrayList;
    }

    public InterfaceC58217yxC KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC55701xos<java.util.List<BizTradeData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.copydefault.KWHzl(str, str2, interfaceC55701xos);
    }

    @Override // o.InterfaceC55702xot
    public InterfaceC58217yxC copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull InterfaceC55701xos<java.util.List<BizKLineData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.copydefault.KWHzl(str, str2, str3, str4, interfaceC55701xos);
    }

    @Override // o.InterfaceC55702xot
    public InterfaceC58217yxC EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull InterfaceC55701xos<java.util.List<IndexTickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.copydefault.EZpvd(str, str2, str3, str4, interfaceC55701xos);
    }

    @Override // o.InterfaceC55702xot
    public InterfaceC58217yxC KWHzl(@NotNull InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.copydefault.AEQbTJ(interfaceC55701xos);
    }
}
