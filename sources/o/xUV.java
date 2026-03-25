package o;

import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.WatchListBean;
import com.okinc.unify_trade.biz.subscribe.SettingWatchList;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xUV {
    public static final xUV EZpvd = new xUV();
    public static final int KWHzl = 8;

    private xUV() {
    }

    public final SettingWatchList KWHzl(@NotNull java.lang.String str, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(str, "");
        if (bizInstrument instanceof SpotInstrument) {
            SpotInstrument spotInstrument = (SpotInstrument) bizInstrument;
            return new SettingWatchList(str, spotInstrument.getInstId(), spotInstrument.getInstType(), null, null, null, null);
        }
        if (bizInstrument instanceof SwapInstrument) {
            SwapInstrument swapInstrument = (SwapInstrument) bizInstrument;
            return new SettingWatchList(str, swapInstrument.getInstId(), swapInstrument.getInstType(), null, null, null, null);
        }
        if (bizInstrument instanceof FutureInstrument) {
            FutureInstrument futureInstrument = (FutureInstrument) bizInstrument;
            return new SettingWatchList(str, futureInstrument.getInstFly(), futureInstrument.getInstType(), futureInstrument.getAlias(), futureInstrument.getExpTime(), null, null);
        }
        if (!(bizInstrument instanceof OptionInstrument)) {
            return null;
        }
        OptionInstrument optionInstrument = (OptionInstrument) bizInstrument;
        return new SettingWatchList(str, optionInstrument.getInstId(), optionInstrument.getInstType(), null, optionInstrument.getExpTime(), null, null);
    }

    public final java.util.ArrayList<WatchListBean> AEQbTJ() {
        java.util.ArrayList<WatchListBean> arrayList = SPUtils.getArrayList(xPX.AEQbTJ.KWHzl(), WatchListBean.class);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList<WatchListBean> arrayList2 = new java.util.ArrayList<>();
        boolean z = false;
        for (WatchListBean watchListBean : arrayList) {
            if (Intrinsics.EZpvd((java.lang.Object) watchListBean.getInstType(), (java.lang.Object) "MARGIN")) {
                java.lang.String instId = watchListBean.getInstId();
                watchListBean = new WatchListBean(watchListBean.getAlias(), watchListBean.getExpTime(), instId, "SPOT", watchListBean.getChainId(), watchListBean.getTokenContractAddress(), watchListBean.getTokenSymbol(), watchListBean.getTokenName());
                z = true;
            }
            if (!arrayList2.contains(watchListBean)) {
                arrayList2.add(watchListBean);
            }
        }
        if (z && C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
            SPUtils.put(xPX.AEQbTJ.KWHzl(), arrayList2);
        }
        return arrayList2;
    }

    public final java.util.ArrayList<WatchListData> EZpvd() {
        java.util.ArrayList<WatchListData> arrayList = new java.util.ArrayList<>();
        for (WatchListBean watchListBean : AEQbTJ()) {
            java.lang.String instType = watchListBean.getInstType();
            arrayList.add(new WatchListData(watchListBean.getAlias(), watchListBean.getExpTime(), watchListBean.getInstId(), instType, watchListBean.getChainId(), watchListBean.getTokenContractAddress(), watchListBean.getTokenSymbol(), watchListBean.getTokenName()));
        }
        return arrayList;
    }

    public final java.lang.String KWHzl(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return bizInstrument instanceof FutureInstrument ? ((FutureInstrument) bizInstrument).getInstFamily() : bizInstrument.getInstId();
    }

    public final java.lang.String OLrzqt(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return bizInstrument.getInstType();
    }

    public final java.lang.String copydefault(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        if (bizInstrument instanceof FutureInstrument) {
            return ((FutureInstrument) bizInstrument).getAlias();
        }
        return null;
    }

    public final java.lang.String AEQbTJ(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        if (bizInstrument instanceof OptionInstrument) {
            return ((OptionInstrument) bizInstrument).getExpTime();
        }
        return null;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return SPUtils.getString(str, null);
    }

    public final void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put(str, str2);
    }

    public final java.lang.String OLrzqt() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || !interfaceC54581xNrOLrzqt.zuBGHE()) ? "SPOT" : "SWAP";
    }

    public final java.lang.String KWHzl() {
        java.lang.String strEZpvd = EZpvd("current_instrument_type");
        return strEZpvd == null ? OLrzqt() : strEZpvd;
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55697xoo c55697xoo = C55697xoo.OLrzqt;
        if (c55697xoo.isConnected()) {
            return SPUtils.getBoolean(str + "-" + c55697xoo.gEmmrt(), false);
        }
        return SPUtils.getBoolean(str, false);
    }
}
