package com.okinc.tradingbot.impl.market_place;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradecore.main.mvp.home.EventTrade;
import com.okinc.tradecore.main.mvp.mediator.BaseMediator;
import com.okinc.tradingbot.impl.market_place.MarketPlacePresenter;
import com.okinc.tradingbot.impl.market_place.home.list.BotSquareType;
import com.okinc.uilab.util.SpanUtils;
import com.okinc.unify_trade.biz.BotRouteData;
import com.okinc.unify_trade.biz.MpCategory;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC42536rWm;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C51488vnv;
import o.C51529voj;
import o.C53685wqE;
import o.C55251xgS;
import o.C55276xgr;
import o.C55296xhK;
import o.C55298xhM;
import o.C55688xof;
import o.C55886xsR;
import o.C56071xvr;
import o.C56111xwe;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56424yEw;
import o.InterfaceC49317umK;
import o.InterfaceC49427uoO;
import o.InterfaceC49429uoQ;
import o.InterfaceC49435uoW;
import o.InterfaceC49436uoX;
import o.InterfaceC49496upe;
import o.InterfaceC55881xsM;
import o.InterfaceC56387yDm;
import o.wMM;
import o.xHS;
import o.xKK;
import o.xLY;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class MarketPlacePresenter extends BaseMediator implements InterfaceC49435uoW {
    public InterfaceC49427uoO AEQbTJ;
    public AbstractC42536rWm AYXKKw;
    public final C56111xwe<BotRouteData> AhwBna;
    public wMM EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public InterfaceC49436uoX copydefault;
    public final InterfaceC56387yDm djBIcL;
    public xHS fetchVPNInfo;
    public Context gEmmrt;
    public final C56111xwe<String> isConnected;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;
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
            int[] iArr2 = new int[BotSquareType.values().length];
            try {
                iArr2[BotSquareType.NMP_BOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BotSquareType.SIGNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull InterfaceC49427uoO interfaceC49427uoO) {
        Intrinsics.checkNotNullParameter(interfaceC49427uoO, "");
        this.AEQbTJ = interfaceC49427uoO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<BotRouteData> AkhnZx() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(AbstractC42536rWm abstractC42536rWm) {
        this.AYXKKw = abstractC42536rWm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull InterfaceC49436uoX interfaceC49436uoX) {
        Intrinsics.checkNotNullParameter(interfaceC49436uoX, "");
        this.copydefault = interfaceC49436uoX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull xHS xhs) {
        Intrinsics.checkNotNullParameter(xhs, "");
        this.fetchVPNInfo = xhs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<String> fJNWhG() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public wMM fetchVPNInfo() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49435uoW
    public void copydefault(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2) {
        InterfaceC49435uoW.TaskDescription.copydefault(this, str, str2, str3, str4, z, z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketPlacePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.vgw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketPlacePresenter.AuCTelauCTel();
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vgz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketPlacePresenter.getFieldNames();
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.vgy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketPlacePresenter.gEmmrt();
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vgA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketPlacePresenter.KWHzl(this.OLrzqt);
            }
        });
        this.EZpvd = new wMM();
        this.AhwBna = new C56111xwe<>();
        this.isConnected = new C56111xwe<>();
    }

    public final xHS fIwbmz() {
        xHS xhs = this.fetchVPNInfo;
        if (xhs != null) {
            return xhs;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final InterfaceC49429uoQ AubY() {
        return (InterfaceC49429uoQ) this.valueOf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC49429uoQ AuCTelauCTel() {
        return C53685wqE.copydefault.AEQbTJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BizInfoConfig.DefaultBizConfig getFieldNames() {
        return BizInfoConfig.DefaultBizConfig.copydefault;
    }

    private final BizInfoConfig.DefaultBizConfig getNewProxyInstance() {
        return (BizInfoConfig.DefaultBizConfig) this.OLrzqt.getValue();
    }

    public static final InterfaceC49317umK gEmmrt() {
        return (InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class);
    }

    public final InterfaceC49317umK ejfBZ() {
        return (InterfaceC49317umK) this.djBIcL.getValue();
    }

    public static final xLY KWHzl(MarketPlacePresenter marketPlacePresenter) {
        return new xLY(marketPlacePresenter.getNewProxyInstance());
    }

    public final xLY values() {
        return (xLY) this.KWHzl.getValue();
    }

    public final InterfaceC49427uoO isConnected() {
        InterfaceC49427uoO interfaceC49427uoO = this.AEQbTJ;
        if (interfaceC49427uoO != null) {
            return interfaceC49427uoO;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public void AEQbTJ(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C53685wqE c53685wqE = C53685wqE.copydefault;
        AEQbTJ(c53685wqE.copydefault().EZpvd(this, view));
        InterfaceC49496upe interfaceC49496upeCopydefault = c53685wqE.copydefault();
        InterfaceC49436uoX interfaceC49436uoX = this.copydefault;
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
        int i = ActionBar.copydefault[eventTrade.ordinal()];
        if (i == 1) {
            return uzCIH();
        }
        if (i != 2) {
            return i != 3 ? Unit.INSTANCE : getNewProxyInstance();
        }
        Context context = this.gEmmrt;
        if (context != null) {
            return context;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public InterfaceC49436uoX uzCIH() {
        InterfaceC49436uoX interfaceC49436uoX = this.copydefault;
        if (interfaceC49436uoX != null) {
            return interfaceC49436uoX;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void AEQbTJ() {
        Object objFIwbmz = fIwbmz();
        Intrinsics.copydefault(objFIwbmz, "");
        ((BaseMediator) objFIwbmz).AEQbTJ();
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void KWHzl() {
        Bundle bundle;
        String string;
        Bundle bundle2;
        Object objFIwbmz = fIwbmz();
        String str = "";
        Intrinsics.copydefault(objFIwbmz, "");
        ((BaseMediator) objFIwbmz).KWHzl();
        BotRouteData botRouteDataAEQbTJ = AubY().AEQbTJ();
        if (botRouteDataAEQbTJ == null || (bundle2 = botRouteDataAEQbTJ.getBundle()) == null || !Intrinsics.EZpvd((Object) bundle2.getString(OtcExtraKeys.ORDER), (Object) "1") || Intrinsics.EZpvd((Object) bundle2.getString("type"), (Object) "all_bot")) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketPlacePresenter$onVisible$1(this, null), 3, null);
        } else {
            C56111xwe<BotRouteData> c56111xwe = this.AhwBna;
            BotRouteData botRouteDataAEQbTJ2 = AubY().AEQbTJ();
            Intrinsics.copydefault(botRouteDataAEQbTJ2);
            c56111xwe.setValue(botRouteDataAEQbTJ2);
        }
        C56111xwe<String> c56111xwe2 = this.isConnected;
        BotRouteData botRouteDataAEQbTJ3 = AubY().AEQbTJ();
        if (botRouteDataAEQbTJ3 != null && (bundle = botRouteDataAEQbTJ3.getBundle()) != null && (string = bundle.getString("squareType")) != null) {
            str = string;
        }
        c56111xwe2.setValue(str);
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void copydefault() {
        Object objFIwbmz = fIwbmz();
        Intrinsics.copydefault(objFIwbmz, "");
        ((BaseMediator) objFIwbmz).copydefault();
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void OLrzqt() {
        Object objFIwbmz = fIwbmz();
        Intrinsics.copydefault(objFIwbmz, "");
        ((BaseMediator) objFIwbmz).OLrzqt();
    }

    public void iwGUEr() {
        isConnected().AEQbTJ();
    }

    public void valueOf() {
        isConnected().EZpvd();
    }

    public void KWHzl(String str) {
        InterfaceC49427uoO interfaceC49427uoOIsConnected = isConnected();
        if (str == null) {
            str = "";
        }
        interfaceC49427uoOIsConnected.KWHzl(str);
    }

    public void AhwBna() {
        AubY().EZpvd();
    }

    public final List<C51529voj> fARcdN() {
        ArrayList arrayList = new ArrayList();
        for (BotSquareType botSquareType : AuCTel()) {
            if (botSquareType == BotSquareType.NMP_BOT) {
                arrayList.add(new C51529voj(botSquareType, hDKMBd()));
            } else {
                arrayList.add(new C51529voj(botSquareType, null, 2, 0 == true ? 1 : 0));
            }
        }
        return arrayList;
    }

    public final List<BotSquareType> AuCTel() {
        ArrayList arrayList = new ArrayList();
        for (BotSquareType botSquareType : BotSquareType.values()) {
            int i = ActionBar.EZpvd[botSquareType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (!C56071xvr.gEmmrt.ejfBZ()) {
                        arrayList.add(botSquareType);
                    }
                } else {
                    arrayList.add(botSquareType);
                }
            } else if (ejfBZ().OLrzqt()) {
                arrayList.add(botSquareType);
            }
        }
        return arrayList;
    }

    public final Map<String, String> hDKMBd() {
        Bundle bundle;
        BotRouteData botRouteDataAEQbTJ = AubY().AEQbTJ();
        String string = (botRouteDataAEQbTJ == null || (bundle = botRouteDataAEQbTJ.getBundle()) == null) ? null : bundle.getString(AppsFlyerProperties.CHANNEL);
        Pair[] pairArr = new Pair[2];
        if (string == null) {
            string = ExtJson.BRC20TYPE_TRADE;
        }
        pairArr[0] = C56390yDp.OLrzqt(AppsFlyerProperties.CHANNEL, string);
        pairArr[1] = C56390yDp.OLrzqt("page", "bot_mp");
        return C56424yEw.AYXKKw(pairArr);
    }

    public final List<C51488vnv> DbNXlk() {
        List<MpCategory> listKWHzl;
        ArrayList arrayList = new ArrayList();
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault != null && (listKWHzl = interfaceC55881xsMCopydefault.KWHzl()) != null) {
            Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                arrayList.add(new C51488vnv((MpCategory) it.next()));
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [201=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -2119287345:
                return !str.equals("slicing") ? "" : C33070mpX.AYXKKw(C55688xof.Application.r8lambdaKrBLxNpMJdSxVU3Lsj65hn0UyA);
            case -234325942:
                return !str.equals("bearish") ? "" : C33070mpX.AYXKKw(C55688xof.Application.bindRcKey);
            case 96673:
                return !str.equals("all") ? "" : C33070mpX.AYXKKw(C55688xof.Application.fARcdN);
            case 218164539:
                return !str.equals("sideways") ? "" : C33070mpX.AYXKKw(C55688xof.Application.generateRandomNumber);
            case 233720459:
                return !str.equals("bullish") ? "" : C33070mpX.AYXKKw(C55688xof.Application.registerKey);
            default:
                return "";
        }
    }

    public final int OLrzqt(@NotNull MpCategory mpCategory) {
        Intrinsics.checkNotNullParameter(mpCategory, "");
        boolean zKWHzl = C33129mqd.KWHzl((Collection) mpCategory.getDefaultContent());
        return (zKWHzl ? 1 : 0) + mpCategory.getExtra().size();
    }

    public final List<C55276xgr> EZpvd(int i) {
        List<BotSquareType> listAuCTel = AuCTel();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAuCTel, 10));
        int i2 = 0;
        for (Object obj : listAuCTel) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            BotSquareType botSquareType = (BotSquareType) obj;
            BotSquareType botSquareType2 = BotSquareType.SIGNAL;
            arrayList.add(new C55276xgr(botSquareType == botSquareType2 ? OLrzqt(C33070mpX.AYXKKw(botSquareType2.getTitle())) : C33070mpX.AYXKKw(botSquareType.getTitle()), botSquareType, null, i2 == i, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
            i2++;
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    public final CharSequence OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str + " ");
        FrameLayout frameLayout = new FrameLayout(uzCIH().AEQbTJ().getContext());
        Context context = uzCIH().AEQbTJ().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
        c55251xgS.setOKDSStyle(7);
        c55251xgS.setOKDSSize(-5);
        c55251xgS.setText(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultLauncherKt));
        frameLayout.addView(c55251xgS);
        frameLayout.setPaddingRelative(C55298xhM.dp2px$default(4.0f, null, 1, null), C55298xhM.dp2px$default(3.0f, null, 1, null), 0, 0);
        Drawable drawableViewToDrawable$default = C55296xhK.viewToDrawable$default(frameLayout, 0, 0, 3, null);
        Intrinsics.copydefault(drawableViewToDrawable$default);
        spannableStringBuilderValueOf.setSpan(new SpanUtils.Activity(drawableViewToDrawable$default, 2), spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 17);
        Intrinsics.copydefault(spannableStringBuilderValueOf);
        return spannableStringBuilderValueOf;
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator, com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
