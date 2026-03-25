package com.okinc.tradingbot.impl.market_place;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradecore.main.mvp.home.EventTrade;
import com.okinc.tradecore.main.mvp.mediator.BaseMediator;
import com.okinc.tradingbot.impl.market_place.BotMarketPlacePresenter;
import com.okinc.tradingbot.impl.market_place.home.list.BotMarketPlaceType;
import com.okinc.unify_trade.biz.BotRouteData;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC42536rWm;
import o.C48291uMa;
import o.C51530vok;
import o.C53685wqE;
import o.C56111xwe;
import o.C56392yDr;
import o.C56403yEb;
import o.InterfaceC49427uoO;
import o.InterfaceC49429uoQ;
import o.InterfaceC49435uoW;
import o.InterfaceC49436uoX;
import o.InterfaceC49496upe;
import o.InterfaceC56387yDm;
import o.wMM;
import o.xHS;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotMarketPlacePresenter extends BaseMediator implements InterfaceC49435uoW {
    public final InterfaceC56387yDm AEQbTJ;
    public AbstractC42536rWm AYXKKw;
    public InterfaceC49427uoO EZpvd;
    public wMM KWHzl;
    public InterfaceC49436uoX OLrzqt;
    public Context copydefault;
    public final C56111xwe<BotRouteData> djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public xHS valueOf;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EventTrade.values().length];
            try {
                iArr[EventTrade.GET_TRADE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventTrade.GET_CONTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventTrade.GET_BIZ_CONFIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(AbstractC42536rWm abstractC42536rWm) {
        this.AYXKKw = abstractC42536rWm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public wMM AkhnZx() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<BotRouteData> DbNXlk() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull InterfaceC49427uoO interfaceC49427uoO) {
        Intrinsics.checkNotNullParameter(interfaceC49427uoO, "");
        this.EZpvd = interfaceC49427uoO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull InterfaceC49436uoX interfaceC49436uoX) {
        Intrinsics.checkNotNullParameter(interfaceC49436uoX, "");
        this.OLrzqt = interfaceC49436uoX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull xHS xhs) {
        Intrinsics.checkNotNullParameter(xhs, "");
        this.valueOf = xhs;
    }

    @Override // o.InterfaceC49435uoW
    public void copydefault(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2) {
        InterfaceC49435uoW.TaskDescription.copydefault(this, str, str2, str3, str4, z, z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotMarketPlacePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.vfT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotMarketPlacePresenter.djBIcL();
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vfU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotMarketPlacePresenter.AhwBna();
            }
        });
        this.KWHzl = new wMM();
        this.djBIcL = new C56111xwe<>();
    }

    public final xHS fARcdN() {
        xHS xhs = this.valueOf;
        if (xhs != null) {
            return xhs;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final InterfaceC49429uoQ ejfBZ() {
        return (InterfaceC49429uoQ) this.gEmmrt.getValue();
    }

    public static final InterfaceC49429uoQ djBIcL() {
        return C53685wqE.copydefault.AEQbTJ();
    }

    public static final BizInfoConfig.DefaultBizConfig AhwBna() {
        return BizInfoConfig.DefaultBizConfig.copydefault;
    }

    public final BizInfoConfig.DefaultBizConfig isConnected() {
        return (BizInfoConfig.DefaultBizConfig) this.AEQbTJ.getValue();
    }

    public final InterfaceC49427uoO fetchVPNInfo() {
        InterfaceC49427uoO interfaceC49427uoO = this.EZpvd;
        if (interfaceC49427uoO != null) {
            return interfaceC49427uoO;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public void OLrzqt(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C53685wqE c53685wqE = C53685wqE.copydefault;
        EZpvd(c53685wqE.copydefault().EZpvd(this, view));
        InterfaceC49496upe interfaceC49496upeCopydefault = c53685wqE.copydefault();
        InterfaceC49436uoX interfaceC49436uoX = this.OLrzqt;
        if (interfaceC49436uoX == null) {
            Intrinsics.gEmmrt("");
            interfaceC49436uoX = null;
        }
        copydefault(interfaceC49496upeCopydefault.copydefault(interfaceC49436uoX.AEQbTJ(), this, getApplication(), getSavedStateHandle()));
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator, o.InterfaceC49498upg
    public Object AEQbTJ(@NotNull EventTrade eventTrade, @NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(eventTrade, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        int i = Activity.copydefault[eventTrade.ordinal()];
        if (i == 1) {
            return AuCTel();
        }
        if (i != 2) {
            return i != 3 ? Unit.INSTANCE : isConnected();
        }
        Context context = this.copydefault;
        if (context != null) {
            return context;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public InterfaceC49436uoX AuCTel() {
        InterfaceC49436uoX interfaceC49436uoX = this.OLrzqt;
        if (interfaceC49436uoX != null) {
            return interfaceC49436uoX;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void AEQbTJ() {
        Object objFARcdN = fARcdN();
        Intrinsics.copydefault(objFARcdN, "");
        ((BaseMediator) objFARcdN).AEQbTJ();
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void KWHzl() {
        Bundle bundle;
        Object objFARcdN = fARcdN();
        Intrinsics.copydefault(objFARcdN, "");
        ((BaseMediator) objFARcdN).KWHzl();
        BotRouteData botRouteDataAEQbTJ = ejfBZ().AEQbTJ();
        if (botRouteDataAEQbTJ == null || (bundle = botRouteDataAEQbTJ.getBundle()) == null || !Intrinsics.EZpvd((Object) bundle.getString(OtcExtraKeys.ORDER), (Object) "1") || Intrinsics.EZpvd((Object) bundle.getString("type"), (Object) "all_bot")) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotMarketPlacePresenter$onVisible$1(this, null), 3, null);
        } else {
            this.djBIcL.setValue(ejfBZ().AEQbTJ());
        }
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void copydefault() {
        Object objFARcdN = fARcdN();
        Intrinsics.copydefault(objFARcdN, "");
        ((BaseMediator) objFARcdN).copydefault();
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void OLrzqt() {
        Object objFARcdN = fARcdN();
        Intrinsics.copydefault(objFARcdN, "");
        ((BaseMediator) objFARcdN).OLrzqt();
    }

    public void fIwbmz() {
        fetchVPNInfo().AEQbTJ();
    }

    public void valueOf() {
        fetchVPNInfo().EZpvd();
    }

    public void OLrzqt(String str) {
        InterfaceC49427uoO interfaceC49427uoOFetchVPNInfo = fetchVPNInfo();
        if (str == null) {
            str = "";
        }
        interfaceC49427uoOFetchVPNInfo.KWHzl(str);
    }

    public void AYXKKw() {
        ejfBZ().EZpvd();
    }

    public final List<C51530vok> values() {
        List listGEmmrt;
        if (C48291uMa.Companion.AEQbTJ().AEQbTJ()) {
            listGEmmrt = yDY.gEmmrt(BotMarketPlaceType.FeaturedCRBots, BotMarketPlaceType.CROnGoing, BotMarketPlaceType.SignalsTab);
        } else {
            listGEmmrt = yDY.gEmmrt(BotMarketPlaceType.FEATURED, BotMarketPlaceType.OnGoing, BotMarketPlaceType.SignalsTab);
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        Iterator it = listGEmmrt.iterator();
        while (it.hasNext()) {
            arrayList.add(new C51530vok((BotMarketPlaceType) it.next()));
        }
        return arrayList;
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator, com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
