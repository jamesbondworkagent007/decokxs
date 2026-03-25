package com.okinc.tradingbot.impl.market_place.home.list.presenter;

import android.app.Application;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.market_place.home.list.presenter.HomeStrategyFilterPresenter;
import com.okinc.unify_trade.biz.HomeStrategyDropDownInfo;
import com.okinc.unify_trade.biz.HomeStrategyFilterCoin;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C33070mpX;
import o.C33129mqd;
import o.C48033uCm;
import o.C51519voZ;
import o.C51610vqK;
import o.C54507xKz;
import o.C54589xNz;
import o.C54799xVt;
import o.C55688xof;
import o.C56210xyX;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class HomeStrategyFilterPresenter extends AbsPresenter {
    public final InterfaceC56387yDm AEQbTJ;
    public String AhwBna;
    public String EZpvd;
    public Map<String, List<String>> KWHzl;
    public HomeStrategyFilterCoin OLrzqt;
    public HomeStrategyDropDownInfo copydefault;
    public final C56210xyX djBIcL;
    public final TradeLiveData<HomeStrategyDropDownInfo> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeStrategyDropDownInfo EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull HomeStrategyFilterCoin homeStrategyFilterCoin) {
        Intrinsics.checkNotNullParameter(homeStrategyFilterCoin, "");
        this.OLrzqt = homeStrategyFilterCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, List<String>> djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeStrategyFilterCoin gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<HomeStrategyDropDownInfo> valueOf() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeStrategyFilterPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        HomeStrategyFilterCoin homeStrategyFilterCoinAYXKKw;
        String str;
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = new C56210xyX();
        this.valueOf = new TradeLiveData<>();
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.voo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HomeStrategyFilterPresenter.AEQbTJ();
            }
        });
        HomeStrategyDropDownInfo homeStrategyDropDownInfo = (HomeStrategyDropDownInfo) SPUtils.getObject(C51519voZ.Companion.KWHzl(), HomeStrategyDropDownInfo.class);
        this.copydefault = homeStrategyDropDownInfo;
        Map<String, List<String>> linkedHashMap = (homeStrategyDropDownInfo == null || (linkedHashMap = homeStrategyDropDownInfo.getCoinCaches()) == null) ? new LinkedHashMap<>() : linkedHashMap;
        this.KWHzl = linkedHashMap;
        String str2 = (String) savedStateHandle.get("algoOrdType");
        List<String> orDefault = linkedHashMap.getOrDefault(str2 == null ? "" : str2, yDY.AhwBna());
        String str3 = (orDefault == null || (str = (String) CollectionsKt___CollectionsKt.AkhnZx(orDefault, 0)) == null) ? "" : str;
        if (C33129mqd.OLrzqt((CharSequence) str3)) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            homeStrategyFilterCoinAYXKKw = new HomeStrategyFilterCoin(str3, str3, true, interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(str3) : null, null, str3, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 464, null);
        } else {
            homeStrategyFilterCoinAYXKKw = AYXKKw();
        }
        this.OLrzqt = homeStrategyFilterCoinAYXKKw;
    }

    public final HomeStrategyFilterCoin AYXKKw() {
        return (HomeStrategyFilterCoin) this.AEQbTJ.getValue();
    }

    public static final HomeStrategyFilterCoin AEQbTJ() {
        return new HomeStrategyFilterCoin("", C33070mpX.AYXKKw(C55688xof.Application.QezThh), true, null, Integer.valueOf(C48033uCm.ActionBar.AkhnZx), null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 488, null);
    }

    public final boolean AhwBna() {
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) "contract_grid") || Intrinsics.EZpvd((Object) this.EZpvd, (Object) "contract_dca");
    }

    public final void OLrzqt() {
        C56210xyX c56210xyX = this.djBIcL;
        String str = this.EZpvd;
        if (str == null) {
            str = "";
        }
        c56210xyX.EZpvd(str);
        c56210xyX.djBIcL();
        c56210xyX.OLrzqt(this.valueOf, new C54507xKz());
        xKK.Activity.execute$default(c56210xyX, 0L, 1, null);
    }

    public final void isConnected() {
        this.OLrzqt = AYXKKw();
    }

    public final HomeStrategyDropDownInfo copydefault(@NotNull String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        final String str8 = C54589xNz.EZpvd.EZpvd() ? "demo" : "live";
        C32866mlf.onEvent$default("TradingBot_BotMarketplace_SelectRunningTime_Click", (TrackChannel[]) null, new Function1() { // from class: o.vos
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HomeStrategyFilterPresenter.valueOf(str2, str8, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        C32866mlf.onEvent$default("TradingBot_BotMarketplace_SelectMaxDrawdown_Click", (TrackChannel[]) null, new Function1() { // from class: o.vot
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HomeStrategyFilterPresenter.KWHzl(str3, str8, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        C32866mlf.onEvent$default("TradingBot_BotMarketplace_SelectLeverage_Click", (TrackChannel[]) null, new Function1() { // from class: o.vou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HomeStrategyFilterPresenter.gEmmrt(str5, str8, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        C32866mlf.onEvent$default("TradingBot_BotMarketplace_SelectPnL_Click", (TrackChannel[]) null, new Function1() { // from class: o.voq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HomeStrategyFilterPresenter.djBIcL(str4, str8, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        Map<String, List<String>> map = this.KWHzl;
        if (map != null) {
            String str9 = this.EZpvd;
            map.put(str9 != null ? str9 : "", C56402yEa.EZpvd(str));
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo = new HomeStrategyDropDownInfo(C56402yEa.EZpvd(str), C56402yEa.EZpvd(str2), C56402yEa.EZpvd(str3), C56402yEa.EZpvd(str4), C56402yEa.EZpvd(str5), this.KWHzl, C56402yEa.EZpvd(str6), C56402yEa.EZpvd(str7), false, 256, null);
        SPUtils.put(C51519voZ.Companion.KWHzl(), homeStrategyDropDownInfo);
        return homeStrategyDropDownInfo;
    }

    public static final Unit valueOf(String str, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str.length() == 0) {
            str = "all";
        }
        EventParamsList.put$default(eventParamsList, "selection", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(String str, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str.length() == 0) {
            str = "all";
        }
        EventParamsList.put$default(eventParamsList, "selection", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(String str, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str.length() == 0) {
            str = "all";
        }
        EventParamsList.put$default(eventParamsList, "selection", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(String str, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str.length() == 0) {
            str = "all";
        }
        EventParamsList.put$default(eventParamsList, "selection", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str2, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.djBIcL);
    }

    public final List<C51610vqK> OLrzqt(List<String> list, List<String> list2, @NotNull Function1<? super String, String> function1) {
        List<C51610vqK> listFJNWhG;
        Intrinsics.checkNotNullParameter(function1, "");
        boolean z = true;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (String str : list) {
                arrayList.add(new C51610vqK(str, function1.invoke(str), list2 != null && list2.contains(str)));
            }
            listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList);
        } else {
            listFJNWhG = null;
        }
        if (listFJNWhG != null) {
            String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.QYNZmZ);
            if (list2 != null && !list2.isEmpty() && ((CharSequence) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).length() != 0) {
                z = false;
            }
            listFJNWhG.add(0, new C51610vqK("", strAYXKKw, z));
        }
        return listFJNWhG;
    }

    public final List<HomeStrategyFilterCoin> EZpvd(List<String> list, List<String> list2) {
        ArrayList<String> arrayList;
        ArrayList arrayList2;
        List<HomeStrategyFilterCoin> listFJNWhG = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                String str = (String) obj;
                InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
                if (interfaceC54581xNrCopydefault == null || interfaceC54581xNrCopydefault.fetchVPNInfo(str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                String str2 = (String) obj2;
                InterfaceC54581xNr interfaceC54581xNrCopydefault2 = C54589xNz.EZpvd.copydefault();
                if (interfaceC54581xNrCopydefault2 == null || interfaceC54581xNrCopydefault2.fetchVPNInfo(str2)) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList != null) {
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (String str3 : arrayList) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                String strValueOf = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(str3) : null;
                boolean z = arrayList2 != null && arrayList2.contains(str3);
                TradeCoinInfo tradeCoinInfoOLrzqt = C54799xVt.AEQbTJ.OLrzqt(str3);
                arrayList3.add(new HomeStrategyFilterCoin(str3, str3, z, strValueOf, null, str3, AudioStats.AUDIO_AMPLITUDE_NONE, tradeCoinInfoOLrzqt != null ? tradeCoinInfoOLrzqt.getName() : null, AudioStats.AUDIO_AMPLITUDE_NONE, 336, null));
            }
            listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList3);
        }
        if (listFJNWhG != null) {
            listFJNWhG.add(0, new HomeStrategyFilterCoin("", C33070mpX.AYXKKw(C55688xof.Application.QezThh), arrayList2 == null || arrayList2.isEmpty() || ((CharSequence) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList2)).length() == 0, null, Integer.valueOf(C48033uCm.ActionBar.AkhnZx), null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 488, null));
        }
        return listFJNWhG;
    }
}
