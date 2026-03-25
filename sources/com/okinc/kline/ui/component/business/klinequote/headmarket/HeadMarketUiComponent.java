package com.okinc.kline.ui.component.business.klinequote.headmarket;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.news.data.vo.KlineFlashItem;
import com.okinc.kline.ui.component.business.klinequote.KlineQuoteDataComponent;
import com.okinc.kline.ui.component.business.klinequote.headmarket.HeadMarketUiComponent;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC54531xLw;
import o.C32866mlf;
import o.C36246oUr;
import o.C39043pkp;
import o.C39105ply;
import o.C39782pyo;
import o.C39810pzP;
import o.C55608xnE;
import o.InterfaceC39046pks;
import o.InterfaceC39563puh;
import o.InterfaceC54581xNr;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.oML;
import o.pWO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class HeadMarketUiComponent implements InterfaceC39046pks {
    public final C39043pkp<oML> AEQbTJ;
    public final KlineQuoteDataComponent KWHzl;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineQuoteDataComponent EZpvd() {
        return this.KWHzl;
    }

    public HeadMarketUiComponent(@NotNull C39043pkp<oML> c39043pkp, @NotNull KlineQuoteDataComponent klineQuoteDataComponent) {
        Intrinsics.checkNotNullParameter(c39043pkp, "");
        Intrinsics.checkNotNullParameter(klineQuoteDataComponent, "");
        this.AEQbTJ = c39043pkp;
        this.KWHzl = klineQuoteDataComponent;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        KWHzl(lifecycleOwner);
    }

    public final void KWHzl(@NotNull final LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.KWHzl.ejfBZ().fetchVPNInfo().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.pnY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HeadMarketUiComponent.AEQbTJ(this.OLrzqt, lifecycleOwner, (java.lang.Boolean) obj);
            }
        }));
        this.KWHzl.values().iZzfmt().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.pof
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HeadMarketUiComponent.EZpvd(this.EZpvd, (C39105ply) obj);
            }
        }));
        this.KWHzl.values().AYXKKw().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.pob
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HeadMarketUiComponent.copydefault(this.KWHzl, (MarketCoinInfo) obj);
            }
        }));
        this.KWHzl.values().fFgQHt().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.pod
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HeadMarketUiComponent.copydefault(this.KWHzl, (MarketTopInfo) obj);
            }
        }));
        this.KWHzl.values().dNCPSb().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.poc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HeadMarketUiComponent.copydefault(this.OLrzqt, (C39105ply) obj);
            }
        }));
        this.KWHzl.values().iwGUEr().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.pog
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HeadMarketUiComponent.AEQbTJ(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        this.KWHzl.AubY().OLrzqt().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.poj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HeadMarketUiComponent.EZpvd(this.KWHzl, (kotlin.Pair) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(HeadMarketUiComponent headMarketUiComponent, LifecycleOwner lifecycleOwner, Boolean bool) {
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH;
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH2 = headMarketUiComponent.KWHzl.uzCIH();
        if (stateListAnimatorUzCIH2 != null && stateListAnimatorUzCIH2.KWHzl() && (stateListAnimatorUzCIH = headMarketUiComponent.KWHzl.uzCIH()) != null) {
            stateListAnimatorUzCIH.AEQbTJ(lifecycleOwner);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(HeadMarketUiComponent headMarketUiComponent, C39105ply c39105ply) {
        if (c39105ply == null) {
            return Unit.INSTANCE;
        }
        headMarketUiComponent.OLrzqt(c39105ply);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(HeadMarketUiComponent headMarketUiComponent, MarketCoinInfo marketCoinInfo) {
        C39810pzP c39810pzP;
        oML oml = (oML) headMarketUiComponent.AEQbTJ.KWHzl();
        if (oml != null && (c39810pzP = oml.hDKMBd) != null) {
            Intrinsics.copydefault(marketCoinInfo);
            c39810pzP.setEstimateTime(marketCoinInfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pzP.setData$default(o.pzP, com.okinc.kline.ui.view.model.MarketTopInfo, boolean, int, java.lang.Object):void */
    public static final Unit copydefault(HeadMarketUiComponent headMarketUiComponent, MarketTopInfo marketTopInfo) {
        C39810pzP c39810pzP;
        oML oml = (oML) headMarketUiComponent.AEQbTJ.KWHzl();
        if (oml != null && (c39810pzP = oml.hDKMBd) != null) {
            Intrinsics.copydefault(marketTopInfo);
            C39810pzP.setData$default(c39810pzP, marketTopInfo, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(HeadMarketUiComponent headMarketUiComponent, C39105ply c39105ply) {
        if (c39105ply == null) {
            return Unit.INSTANCE;
        }
        headMarketUiComponent.OLrzqt(c39105ply);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(HeadMarketUiComponent headMarketUiComponent, Boolean bool) {
        headMarketUiComponent.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(HeadMarketUiComponent headMarketUiComponent, Pair pair) {
        C39810pzP c39810pzP;
        C39810pzP c39810pzP2;
        oML oml = (oML) headMarketUiComponent.AEQbTJ.KWHzl();
        if (oml != null && (c39810pzP2 = oml.hDKMBd) != null) {
            c39810pzP2.setFlashNewsData((List) pair.getSecond());
        }
        if (((List) pair.getSecond()).isEmpty()) {
            oML oml2 = (oML) headMarketUiComponent.AEQbTJ.KWHzl();
            if (oml2 != null && (c39810pzP = oml2.hDKMBd) != null) {
                c39810pzP.copydefault();
            }
            headMarketUiComponent.copydefault();
        } else {
            headMarketUiComponent.EZpvd(((Boolean) pair.getFirst()).booleanValue());
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        final C39782pyo c39782pyo;
        oML oml = (oML) this.AEQbTJ.KWHzl();
        if (oml == null || (c39782pyo = oml.fJNWhG) == null) {
            return;
        }
        c39782pyo.post(new Runnable() { // from class: o.poh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                HeadMarketUiComponent.copydefault(c39782pyo);
            }
        });
    }

    public static final void copydefault(C39782pyo c39782pyo) {
        C36246oUr.copydefault().fetchVPNInfo(c39782pyo.getMeasuredHeight());
    }

    private final void EZpvd(boolean z) {
        final String instrumentId;
        C39810pzP c39810pzP;
        C39810pzP c39810pzP2;
        String instrumentType;
        if (this.KWHzl.OLrzqt().isAdded() && SPUtils.getBoolean("kline_flash_news_on", true)) {
            MarketCoinInfo marketCoinInfoHDKMBd = this.KWHzl.hDKMBd();
            final String str = "";
            if (marketCoinInfoHDKMBd == null || (instrumentId = marketCoinInfoHDKMBd.getInstrumentId()) == null) {
                instrumentId = "";
            }
            MarketCoinInfo marketCoinInfoHDKMBd2 = this.KWHzl.hDKMBd();
            if (marketCoinInfoHDKMBd2 != null && (instrumentType = marketCoinInfoHDKMBd2.getInstrumentType()) != null) {
                str = instrumentType;
            }
            oML oml = (oML) this.AEQbTJ.KWHzl();
            if (oml != null && (c39810pzP2 = oml.hDKMBd) != null) {
                c39810pzP2.KWHzl(instrumentId, str, z, new Function1() { // from class: o.pok
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return HeadMarketUiComponent.copydefault(str, instrumentId, this, (KlineFlashItem) obj);
                    }
                });
            }
            oML oml2 = (oML) this.AEQbTJ.KWHzl();
            if (oml2 == null || (c39810pzP = oml2.hDKMBd) == null) {
                return;
            }
            c39810pzP.postDelayed(new Runnable() { // from class: o.poe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    HeadMarketUiComponent.EZpvd(this.copydefault);
                }
            }, 300L);
        }
    }

    public static final Unit copydefault(String str, String str2, HeadMarketUiComponent headMarketUiComponent, final KlineFlashItem klineFlashItem) {
        final String tradeSymbol;
        String instrumentId;
        String instrumentType;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        String str3 = "";
        Intrinsics.checkNotNullParameter(klineFlashItem, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str2)) == null || (tradeSymbol = bizInstrumentValueOf.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        FragmentManager childFragmentManager = headMarketUiComponent.KWHzl.OLrzqt().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        MarketCoinInfo marketCoinInfoHDKMBd = headMarketUiComponent.KWHzl.hDKMBd();
        if (marketCoinInfoHDKMBd == null || (instrumentId = marketCoinInfoHDKMBd.getInstrumentId()) == null) {
            instrumentId = "";
        }
        MarketCoinInfo marketCoinInfoHDKMBd2 = headMarketUiComponent.KWHzl.hDKMBd();
        if (marketCoinInfoHDKMBd2 != null && (instrumentType = marketCoinInfoHDKMBd2.getInstrumentType()) != null) {
            str3 = instrumentType;
        }
        headMarketUiComponent.KWHzl(childFragmentManager, instrumentId, str3);
        C32866mlf.onEvent$default("KLine_Top_News_Click", (TrackChannel[]) null, new Function1() { // from class: o.poi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HeadMarketUiComponent.KWHzl(tradeSymbol, klineFlashItem, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(String str, KlineFlashItem klineFlashItem, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token", str, false, 4, null);
        String flashId = klineFlashItem.getFlashId();
        EventParamsList.put$default(eventParamsList, "feed_item_id", flashId == null ? "" : flashId, false, 4, null);
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "");
        EventParamsList.put$default(eventParamsList, "user_language", language, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(HeadMarketUiComponent headMarketUiComponent) {
        headMarketUiComponent.copydefault();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        oML oml;
        C39810pzP c39810pzP;
        C39810pzP c39810pzP2;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onPause(lifecycleOwner);
        oML oml2 = (oML) this.AEQbTJ.KWHzl();
        if (oml2 != null && (c39810pzP2 = oml2.hDKMBd) != null) {
            c39810pzP2.AEQbTJ();
        }
        if (C55608xnE.OLrzqt() || (oml = (oML) this.AEQbTJ.KWHzl()) == null || (c39810pzP = oml.hDKMBd) == null) {
            return;
        }
        c39810pzP.EZpvd();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        oML oml;
        C39810pzP c39810pzP;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onResume(lifecycleOwner);
        if (SPUtils.getBoolean("kline_flash_news_on", true) || (oml = (oML) this.AEQbTJ.KWHzl()) == null || (c39810pzP = oml.hDKMBd) == null) {
            return;
        }
        c39810pzP.copydefault();
    }

    public final void OLrzqt(C39105ply c39105ply) {
        C39810pzP c39810pzP;
        oML oml = (oML) this.AEQbTJ.KWHzl();
        if (oml == null || (c39810pzP = oml.hDKMBd) == null) {
            return;
        }
        String strKWHzl = c39105ply.KWHzl();
        String strAEQbTJ = c39105ply.AEQbTJ();
        String strOLrzqt = c39105ply.OLrzqt();
        BizInstrument bizInstrumentAYXKKw = this.KWHzl.AYXKKw();
        c39810pzP.setPriceTypeAndInstType(strKWHzl, strAEQbTJ, strOLrzqt, (8 & 8) != 0 ? false : false, (8 & 16) != 0 ? false : bizInstrumentAYXKKw != null && bizInstrumentAYXKKw.isPreMarketPair());
    }

    public final void KWHzl(FragmentManager fragmentManager, String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.KWHzl), null, null, new HeadMarketUiComponent$showFlashNewDialog$1(str2, str, this, fragmentManager, null), 3, null);
    }
}
