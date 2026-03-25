package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.swap.setting.widget.NetWorkFeeShowType;
import com.okinc.business.dexui.main.swap.widget.SettingItemData;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22408hem;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ipC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25035ipC extends android.widget.LinearLayout {
    public QuotePriceRes AEQbTJ;
    public hGO EZpvd;
    public android.view.animation.Animation KWHzl;
    public boolean OLrzqt;
    public android.view.animation.Animation copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.EZpvd = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25035ipC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        gEmmrt();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25035ipC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25035ipC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25035ipC(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void gEmmrt() {
        if (getContext() == null) {
            return;
        }
        this.EZpvd = hGO.EZpvd(android.view.LayoutInflater.from(getContext()), this);
        AEQbTJ();
    }

    public final void AEQbTJ() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            ViewOnClickListenerC25336ium.setSettingItemData$default(hgo.DbNXlk, new SettingItemData(C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.alsFma)), C22332hdP.EZpvd(""), SettingItemData.SettingType.SLIPPAGE, null, null, null, null, null, C22332hdP.EZpvd(java.lang.Boolean.TRUE), null, false, null, 3832, null), false, 2, null);
            C25330iug c25330iug = hgo.AkhnZx;
            java.lang.String string = getContext().getString(C23274hvD.Fragment.dYepVG);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c25330iug.setPresetName(string);
            hgo.KWHzl.setOnExpandStateChangeListener(new Function1() { // from class: o.ipP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25035ipC.OLrzqt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(C25035ipC c25035ipC, boolean z) {
        c25035ipC.AEQbTJ(z);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(boolean z) {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            C24454ieD c24454ieD = hgo.values;
            Intrinsics.checkNotNullExpressionValue(c24454ieD, "");
            c24454ieD.setVisibility(z ? 0 : 8);
            C25332iui c25332iui = hgo.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(c25332iui, "");
            c25332iui.setVisibility((z && this.OLrzqt) ? 0 : 8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r20v1, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final QuotePriceRes quotePriceRes, @NotNull final AbstractC23101hrq abstractC23101hrq, boolean z, @NotNull C25049ipQ c25049ipQ, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull FragmentActivity fragmentActivity, Function1<? super java.lang.Boolean, Unit> function1, @NotNull final Function1<? super AbstractC22408hem, Unit> function12) {
        ?? r1;
        ViewOnClickListenerC25336ium viewOnClickListenerC25336ium;
        ViewOnClickListenerC25336ium viewOnClickListenerC25336ium2;
        ViewOnClickListenerC25336ium viewOnClickListenerC25336ium3;
        ViewOnClickListenerC25336ium viewOnClickListenerC25336ium4;
        ViewOnClickListenerC25336ium viewOnClickListenerC25336ium5;
        C25332iui c25332iui;
        C25330iug c25330iug;
        C24467ieQ c24467ieQ;
        C24454ieD c24454ieD;
        C24461ieK c24461ieK;
        C24453ieC c24453ieC;
        C24461ieK c24461ieK2;
        boolean z2;
        int i;
        C24453ieC c24453ieC2;
        C24454ieD c24454ieD2;
        ViewOnClickListenerC25336ium viewOnClickListenerC25336ium6;
        ViewOnClickListenerC25336ium viewOnClickListenerC25336ium7;
        C24467ieQ c24467ieQ2;
        C25332iui c25332iui2;
        final ServiceFeeInfo serviceFeeInfo;
        C24453ieC c24453ieC3;
        C24453ieC c24453ieC4;
        C24461ieK c24461ieK3;
        NetWorkFeeShowType networkFeeShowType;
        CommonDexInfo commonDexInfo;
        C24467ieQ c24467ieQEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(c25049ipQ, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function12, "");
        final hGO hgo = this.EZpvd;
        if (hgo != null) {
            ViewOnClickListenerC25336ium viewOnClickListenerC25336ium8 = hgo.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(viewOnClickListenerC25336ium8, "");
            viewOnClickListenerC25336ium8.setVisibility(abstractC23101hrq.Dmq() ^ true ? 0 : 8);
            ViewOnClickListenerC25336ium viewOnClickListenerC25336ium9 = hgo.AEQbTJ;
            AbstractC22802hmI abstractC22802hmIOLrzqt = abstractC23101hrq.RJOkX().OLrzqt();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            viewOnClickListenerC25336ium9.setupEstTime(abstractC22802hmIOLrzqt.EZpvd(context).EZpvd());
            if (!quotePriceRes.isSingle() && (c24467ieQEZpvd = EZpvd()) != null) {
                c24467ieQEZpvd.EZpvd(quotePriceRes, abstractC23101hrq.ffGIBT(), function12);
            }
            if (abstractC23101hrq.Dmq()) {
                ViewOnClickListenerC24460ieJ viewOnClickListenerC24460ieJ = hgo.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(viewOnClickListenerC24460ieJ, "");
                viewOnClickListenerC24460ieJ.setVisibility(8);
            } else {
                ViewOnClickListenerC24460ieJ viewOnClickListenerC24460ieJ2 = hgo.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(viewOnClickListenerC24460ieJ2, "");
                viewOnClickListenerC24460ieJ2.setVisibility(0);
                ViewOnClickListenerC24460ieJ viewOnClickListenerC24460ieJ3 = hgo.gEmmrt;
                AbstractC22802hmI abstractC22802hmIOLrzqt2 = abstractC23101hrq.RJOkX().OLrzqt();
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                java.lang.String strCopydefault = abstractC22802hmIOLrzqt2.EZpvd(context2).copydefault();
                boolean zAkhnZx = abstractC23101hrq.QUSxYX().AkhnZx();
                QuotePriceRes quotePrice = abstractC23101hrq.RlQdEF().getQuotePrice();
                if (quotePrice == null || (networkFeeShowType = quotePrice.getNetworkFeeShowType()) == null) {
                    networkFeeShowType = NetWorkFeeShowType.NOT_FREE;
                }
                viewOnClickListenerC24460ieJ3.OLrzqt(strCopydefault, !zAkhnZx, strCopydefault, networkFeeShowType);
                if (abstractC23101hrq.fdOvFl()) {
                    if (abstractC23101hrq.RlQdEF().getBtcFreeGasLiveData().getValue() == null) {
                        abstractC23101hrq.RlQdEF().setInitFee(false);
                    }
                    if (abstractC23101hrq.RlQdEF().getBtcFreeGasLiveData().getValue() != null) {
                        fARcdN();
                    }
                } else {
                    fARcdN();
                }
                Intrinsics.copydefault(viewOnClickListenerC24460ieJ3);
            }
            if (!abstractC23101hrq.Dmq()) {
                C25052ipT c25052ipT = hgo.isConnected;
                Intrinsics.checkNotNullExpressionValue(c25052ipT, "");
                C25081ipw.OLrzqt(quotePriceRes, str, abstractC23101hrq, c25052ipT, new Function1() { // from class: o.ipK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C25035ipC.EZpvd(hgo, abstractC23101hrq, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            }
            QuotePriceRes quotePrice2 = abstractC23101hrq.RlQdEF().getQuotePrice();
            if (quotePrice2 != null && quotePrice2.isPMM()) {
                hgo.DbNXlk.setVisibility(8);
                C25330iug c25330iug2 = hgo.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(c25330iug2, "");
                c25330iug2.setVisibility(8);
            } else {
                if (!abstractC23101hrq.Dmq()) {
                    hgo.DbNXlk.setVisibility(0);
                }
                QuotePriceRes quotePriceRes2 = this.AEQbTJ;
                hgo.DbNXlk.setMevProtect(abstractC23101hrq.QfsBiF().gEmmrt(), abstractC23101hrq.QfsBiF().djBIcL(), (quotePriceRes2 == null || (commonDexInfo = quotePriceRes2.getCommonDexInfo()) == null) ? false : commonDexInfo.autoOpenMev());
                C25330iug c25330iug3 = hgo.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(c25330iug3, "");
                c25330iug3.setVisibility(0);
            }
            r1 = 1;
            C25049ipQ.checkError$default(c25049ipQ, abstractC23101hrq, str, fragmentManager, fragmentActivity, false, function1, 16, null);
            KWHzl(true);
        } else {
            r1 = 1;
        }
        if (abstractC23101hrq.Dmq()) {
            hGO hgo2 = this.EZpvd;
            if (hgo2 != null && (c24461ieK3 = hgo2.djBIcL) != null) {
                c24461ieK3.setVisibility(8);
            }
            hGO hgo3 = this.EZpvd;
            if (hgo3 == null || (c24453ieC4 = hgo3.KWHzl) == null) {
                z2 = false;
            } else {
                z2 = false;
                c24453ieC4.setVisibility(0);
            }
            hGO hgo4 = this.EZpvd;
            if (hgo4 != null && (c24453ieC3 = hgo4.KWHzl) != null) {
                C23081hrW c23081hrWWlaJM = abstractC23101hrq.wlaJM();
                ConsumeData<TradeInputGroup> value = abstractC23101hrq.dmfpNf().getValue();
                Intrinsics.copydefault(value);
                C23077hrS labelData$default = C23081hrW.getLabelData$default(c23081hrWWlaJM, value.getData(), quotePriceRes, null, 4, null);
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                c24453ieC3.OLrzqt(C25287itq.copydefault(labelData$default, context3));
            }
            java.lang.String strDarRvM = abstractC23101hrq.DarRvM();
            java.util.Iterator<T> it = quotePriceRes.getDefiPlatformInfoList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DeFiPlatformForSwap) next).getDefiPlatformId(), (java.lang.Object) strDarRvM)) {
                    toSwapServiceFeeUsd = next;
                    break;
                }
            }
            DeFiPlatformForSwap deFiPlatformForSwap = (DeFiPlatformForSwap) toSwapServiceFeeUsd;
            hGO hgo5 = this.EZpvd;
            if (hgo5 == null || (c25332iui2 = hgo5.fetchVPNInfo) == null) {
                i = 8;
            } else if (deFiPlatformForSwap == null || (serviceFeeInfo = deFiPlatformForSwap.getServiceFeeInfo()) == null) {
                i = 8;
                this.OLrzqt = z2;
            } else {
                this.OLrzqt = serviceFeeInfo.isDisplay();
                if (abstractC23101hrq instanceof C23159hsv) {
                    boolean zDaRZkR = ((C23159hsv) abstractC23101hrq).DaRZkR();
                    if (zDaRZkR) {
                        function12.invoke(new AbstractC22408hem.Application(r1));
                    }
                    c25332iui2.setIsShowReferralView(zDaRZkR, new Function0() { // from class: o.ipH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C25035ipC.copydefault(abstractC23101hrq, this, function12);
                        }
                    });
                }
                i = 8;
                c25332iui2.setupServiceFee(C25404iwA.AEQbTJ(serviceFeeInfo), new Function0() { // from class: o.ipJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C25035ipC.AEQbTJ(serviceFeeInfo, this, str, abstractC23101hrq, function12);
                    }
                });
            }
            hGO hgo6 = this.EZpvd;
            if (hgo6 != null && (c24467ieQ2 = hgo6.OLrzqt) != null) {
                c24467ieQ2.setVisibility(i);
            }
            hGO hgo7 = this.EZpvd;
            if (hgo7 != null && (viewOnClickListenerC25336ium7 = hgo7.EZpvd) != null) {
                viewOnClickListenerC25336ium7.setVisibility(i);
            }
            hGO hgo8 = this.EZpvd;
            if (hgo8 != null && (viewOnClickListenerC25336ium6 = hgo8.copydefault) != null) {
                viewOnClickListenerC25336ium6.setVisibility(i);
            }
            hGO hgo9 = this.EZpvd;
            if (hgo9 != null && (c24454ieD2 = hgo9.values) != null) {
                c24454ieD2.setupDeFiPlatformSettingsView(str, strDarRvM, abstractC23101hrq.DAIeex(), quotePriceRes, abstractC23101hrq, z, function12);
            }
            hGO hgo10 = this.EZpvd;
            AEQbTJ((hgo10 == null || (c24453ieC2 = hgo10.KWHzl) == null) ? z2 : c24453ieC2.EZpvd());
            return;
        }
        hGO hgo11 = this.EZpvd;
        if (hgo11 != null && (c24461ieK2 = hgo11.djBIcL) != null) {
            c24461ieK2.setVisibility(0);
        }
        hGO hgo12 = this.EZpvd;
        if (hgo12 != null && (c24453ieC = hgo12.KWHzl) != null) {
            c24453ieC.setVisibility(8);
        }
        hGO hgo13 = this.EZpvd;
        if (hgo13 != null && (c24461ieK = hgo13.djBIcL) != null) {
            C23081hrW c23081hrWWlaJM2 = abstractC23101hrq.wlaJM();
            ConsumeData<TradeInputGroup> value2 = abstractC23101hrq.dmfpNf().getValue();
            Intrinsics.copydefault(value2);
            C23077hrS labelData$default2 = C23081hrW.getLabelData$default(c23081hrWWlaJM2, value2.getData(), quotePriceRes, null, 4, null);
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            c24461ieK.copydefault(quotePriceRes, C25287itq.copydefault(labelData$default2, context4));
        }
        hGO hgo14 = this.EZpvd;
        if (hgo14 != null && (c24454ieD = hgo14.values) != null) {
            c24454ieD.setVisibility(8);
        }
        hGO hgo15 = this.EZpvd;
        if (hgo15 != null && (c24467ieQ = hgo15.OLrzqt) != null) {
            c24467ieQ.setVisibility(0);
        }
        hGO hgo16 = this.EZpvd;
        if (hgo16 != null && (c25330iug = hgo16.AkhnZx) != null) {
            c25330iug.setVisibility(8);
        }
        hGO hgo17 = this.EZpvd;
        if (hgo17 != null && (c25332iui = hgo17.fetchVPNInfo) != null) {
            c25332iui.setVisibility(8);
        }
        hGO hgo18 = this.EZpvd;
        if (hgo18 != null && (viewOnClickListenerC25336ium5 = hgo18.EZpvd) != null) {
            viewOnClickListenerC25336ium5.setVisibility(quotePriceRes.getCommonDexInfo().isOpenServiceFee() ? 0 : 8);
        }
        PathSelectionRouterItem selectRouterItem$default = QuotePriceRes.getSelectRouterItem$default(quotePriceRes, null, r1, null);
        java.lang.String minimumReceived = selectRouterItem$default != null ? selectRouterItem$default.getMinimumReceived() : null;
        if (minimumReceived == null || minimumReceived.length() == 0) {
            hGO hgo19 = this.EZpvd;
            if (hgo19 != null && (viewOnClickListenerC25336ium = hgo19.AYXKKw) != null) {
                viewOnClickListenerC25336ium.setVisibility(8);
            }
        } else {
            hGO hgo20 = this.EZpvd;
            if (hgo20 != null && (viewOnClickListenerC25336ium4 = hgo20.AYXKKw) != null) {
                viewOnClickListenerC25336ium4.setVisibility(0);
            }
            hGO hgo21 = this.EZpvd;
            if (hgo21 != null && (viewOnClickListenerC25336ium3 = hgo21.AYXKKw) != null) {
                viewOnClickListenerC25336ium3.setupMinimumReceived(minimumReceived, quotePriceRes.getCommonDexInfo().getToToken());
            }
        }
        PathSelectionRouterItem selectRouterItem$default2 = QuotePriceRes.getSelectRouterItem$default(quotePriceRes, null, r1, null);
        toSwapServiceFeeUsd = selectRouterItem$default2 != null ? selectRouterItem$default2.getToSwapServiceFeeUsd() : null;
        if (toSwapServiceFeeUsd == null) {
            toSwapServiceFeeUsd = "";
        }
        java.lang.String localizedCurrencyNumberWithPrefix$default = C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(toSwapServiceFeeUsd, false, RoundingMode.UP, false, false, 13, null);
        hGO hgo22 = this.EZpvd;
        if (hgo22 == null || (viewOnClickListenerC25336ium2 = hgo22.EZpvd) == null) {
            return;
        }
        viewOnClickListenerC25336ium2.setupServiceFee(localizedCurrencyNumberWithPrefix$default, new Function0() { // from class: o.ipL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25035ipC.OLrzqt(quotePriceRes, this);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ieS.setSlippagePanel$default(o.ieS, boolean, o.hrq, int, java.lang.Object):void */
    public static final Unit EZpvd(hGO hgo, AbstractC23101hrq abstractC23101hrq, boolean z) {
        if (z) {
            hgo.DbNXlk.setSlippagePanel(false, abstractC23101hrq);
        } else {
            C24469ieS.setSlippagePanel$default(hgo.DbNXlk, false, abstractC23101hrq, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC23101hrq abstractC23101hrq, C25035ipC c25035ipC, Function1 function1) {
        android.content.Context context = c25035ipC.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ((C23159hsv) abstractC23101hrq).KWHzl(context);
        function1.invoke(new AbstractC22408hem.Application(false));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ServiceFeeInfo serviceFeeInfo, C25035ipC c25035ipC, java.lang.String str, AbstractC23101hrq abstractC23101hrq, Function1 function1) {
        android.content.Context context = c25035ipC.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25404iwA.copydefault(serviceFeeInfo, context);
        java.lang.String strCopydefault = C25295ity.copydefault(C22372heC.EZpvd(str));
        java.lang.String value = DexTrackEventParameter.ButtonName.SERVICE_EXPLAIN.getValue();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFIwbmz = abstractC23101hrq.fIwbmz();
        java.lang.String chainName = dexMultiTokenInfoBeanFIwbmz != null ? dexMultiTokenInfoBeanFIwbmz.getChainName() : null;
        C25295ity.KWHzl("swap", "advanced", strCopydefault, value, chainName != null ? chainName : "");
        function1.invoke(new AbstractC22408hem.TaskDescription(TrackButtonName.SERVICE_FEE_EXPLAIN.getButtonName(), ButtonType.EXPLAIN.getType()));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final QuotePriceRes quotePriceRes, final C25035ipC c25035ipC) {
        java.lang.String strCopydefault;
        DexMultiTokenInfoBean crossToToken;
        PathSelectionRouterItem selectRouterItem$default = QuotePriceRes.getSelectRouterItem$default(quotePriceRes, null, 1, null);
        if (C23313hvq.copydefault(selectRouterItem$default != null ? selectRouterItem$default.getToSwapServiceFeeUsd() : null, 0)) {
            strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.getRemoteControlClient, C56424yEw.gEmmrt(C56390yDp.OLrzqt("value", C23272hvB.KWHzl.OLrzqt().getSymbol()), C56390yDp.OLrzqt("article", C33070mpX.AYXKKw(C23274hvD.Fragment.removeOnActiveChangeListener))));
        } else {
            PathSelectionRouterItem selectRouterItem$default2 = QuotePriceRes.getSelectRouterItem$default(quotePriceRes, null, 1, null);
            java.lang.String toSwapServiceFee = selectRouterItem$default2 != null ? selectRouterItem$default2.getToSwapServiceFee() : null;
            java.lang.String str = toSwapServiceFee == null ? "" : toSwapServiceFee;
            RoundingMode roundingMode = RoundingMode.UP;
            java.lang.String localizedNumber$default = C23322hvz.toLocalizedNumber$default(str, false, roundingMode, false, false, 13, (java.lang.Object) null);
            PathSelectionRouterItem selectRouterItem$default3 = QuotePriceRes.getSelectRouterItem$default(quotePriceRes, null, 1, null);
            java.lang.String toSwapServiceFeeUsd = selectRouterItem$default3 != null ? selectRouterItem$default3.getToSwapServiceFeeUsd() : null;
            if (toSwapServiceFeeUsd == null) {
                toSwapServiceFeeUsd = "";
            }
            java.lang.String localizedCurrencyNumberWithPrefix$default = C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(toSwapServiceFeeUsd, false, roundingMode, false, false, 13, null);
            int i = C23274hvD.Fragment.getCallingPackage;
            kotlin.Pair[] pairArr = new kotlin.Pair[5];
            pairArr[0] = C56390yDp.OLrzqt("value", localizedCurrencyNumberWithPrefix$default);
            pairArr[1] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, localizedNumber$default);
            DexQuoteBridgeVO dexQuoteBridgeVOBridge = quotePriceRes.bridge();
            java.lang.String tokenSymbol = (dexQuoteBridgeVOBridge == null || (crossToToken = dexQuoteBridgeVOBridge.getCrossToToken()) == null) ? null : crossToToken.getTokenSymbol();
            if (tokenSymbol == null) {
                tokenSymbol = "";
            }
            pairArr[2] = C56390yDp.OLrzqt("symbol", tokenSymbol);
            DexMultiTokenInfoBean toToken = quotePriceRes.getCommonDexInfo().getToToken();
            java.lang.String chainName = toToken != null ? toToken.getChainName() : null;
            if (chainName == null) {
                chainName = "";
            }
            pairArr[3] = C56390yDp.OLrzqt("toChain", chainName);
            pairArr[4] = C56390yDp.OLrzqt("article", C33070mpX.AYXKKw(C23274hvD.Fragment.removeOnActiveChangeListener));
            strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        }
        android.text.Spannable spannableAEQbTJ = C24324ibg.Companion.KWHzl(strCopydefault).OLrzqt("article", C33070mpX.AYXKKw(C23274hvD.Fragment.removeOnActiveChangeListener), (60 & 4) != 0 ? C55051xce.OLrzqt.valueOf() : null, (60 & 8) != 0 ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : 0, (60 & 16) != 0 ? 0 : 0, (60 & 32) != 0, new Function0() { // from class: o.ipO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25035ipC.copydefault(this.KWHzl, quotePriceRes);
            }
        }).AEQbTJ();
        android.content.Context context = c25035ipC.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.onViewAttachedToWindow));
        viewOnClickListenerC54939xaY.EZpvd(spannableAEQbTJ);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.OcIXYQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C25035ipC c25035ipC, QuotePriceRes quotePriceRes) {
        android.content.Context context = c25035ipC.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.OLrzqt(context, quotePriceRes.getCommonDexInfo().getServiceFeeRfqUrl());
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            hgo.isConnected.setVisibility(8);
        }
        KWHzl(false);
    }

    public static final Unit copydefault(boolean z) {
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull AbstractC23101hrq abstractC23101hrq, @NotNull QuotePriceRes quotePriceRes) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            C25052ipT c25052ipT = hgo.isConnected;
            Intrinsics.checkNotNullExpressionValue(c25052ipT, "");
            C25081ipw.OLrzqt(quotePriceRes, str, abstractC23101hrq, c25052ipT, new Function1() { // from class: o.ipI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25035ipC.copydefault(((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ieQ.initMultiChainRoute$default(o.ieQ, com.okinc.business.dexlogic.bean.QuotePriceRes, java.lang.String, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public final void KWHzl(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        C24467ieQ c24467ieQEZpvd = EZpvd();
        if (c24467ieQEZpvd != null) {
            C24467ieQ.initMultiChainRoute$default(c24467ieQEZpvd, quotePriceRes, str, null, 4, null);
        }
    }

    public static final Unit copydefault(C25035ipC c25035ipC) {
        c25035ipC.OLrzqt(0);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C25035ipC c25035ipC) {
        c25035ipC.OLrzqt(8);
        return Unit.INSTANCE;
    }

    private final void OLrzqt(int i) {
        android.widget.LinearLayout linearLayout;
        hGO hgo = this.EZpvd;
        if (hgo != null && (linearLayout = hgo.ejfBZ) != null) {
            QuotePriceRes quotePriceRes = this.AEQbTJ;
            int i2 = 8;
            if ((quotePriceRes == null || !quotePriceRes.isRiskToken()) && !C23313hvq.copydefault(java.lang.Integer.valueOf(i), 8)) {
                i2 = 0;
            }
            linearLayout.setVisibility(i2);
        }
        setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.view.animation.Animation animation = this.KWHzl;
        if (animation != null) {
            animation.cancel();
        }
        android.view.animation.Animation animation2 = this.copydefault;
        if (animation2 != null) {
            animation2.cancel();
        }
    }

    public final void OLrzqt(long j) {
        ViewOnClickListenerC25336ium viewOnClickListenerC25336ium;
        C25332iui c25332iui;
        ViewOnClickListenerC25336ium viewOnClickListenerC25336ium2;
        AppCompatTextView appCompatTextViewKWHzl;
        android.widget.TextView textViewOLrzqt;
        ViewOnClickListenerC24460ieJ viewOnClickListenerC24460ieJDjBIcL = djBIcL();
        if (viewOnClickListenerC24460ieJDjBIcL != null && (textViewOLrzqt = viewOnClickListenerC24460ieJDjBIcL.OLrzqt()) != null) {
            textViewOLrzqt.setVisibility(8);
        }
        C24467ieQ c24467ieQEZpvd = EZpvd();
        if (c24467ieQEZpvd != null && (appCompatTextViewKWHzl = c24467ieQEZpvd.KWHzl()) != null) {
            appCompatTextViewKWHzl.setVisibility(8);
        }
        C24461ieK c24461ieKValueOf = valueOf();
        if (c24461ieKValueOf != null) {
            c24461ieKValueOf.copydefault(j);
        }
        C24453ieC c24453ieCCopydefault = copydefault();
        if (c24453ieCCopydefault != null) {
            c24453ieCCopydefault.copydefault(j);
        }
        ViewOnClickListenerC24460ieJ viewOnClickListenerC24460ieJDjBIcL2 = djBIcL();
        if (viewOnClickListenerC24460ieJDjBIcL2 != null) {
            viewOnClickListenerC24460ieJDjBIcL2.copydefault(j);
        }
        ViewOnClickListenerC25336ium viewOnClickListenerC25336iumOLrzqt = OLrzqt();
        if (viewOnClickListenerC25336iumOLrzqt != null) {
            viewOnClickListenerC25336iumOLrzqt.copydefault(j);
        }
        C24469ieS c24469ieSAkhnZx = AkhnZx();
        if (c24469ieSAkhnZx != null) {
            c24469ieSAkhnZx.copydefault(j);
        }
        C24467ieQ c24467ieQEZpvd2 = EZpvd();
        if (c24467ieQEZpvd2 != null) {
            c24467ieQEZpvd2.copydefault(j);
        }
        C24454ieD c24454ieDFJNWhG = fJNWhG();
        if (c24454ieDFJNWhG != null) {
            c24454ieDFJNWhG.copydefault(j);
        }
        ViewOnClickListenerC25336ium viewOnClickListenerC25336iumAYXKKw = AYXKKw();
        if (viewOnClickListenerC25336iumAYXKKw != null) {
            viewOnClickListenerC25336iumAYXKKw.copydefault(j);
        }
        hGO hgo = this.EZpvd;
        if (hgo != null && (viewOnClickListenerC25336ium2 = hgo.copydefault) != null) {
            viewOnClickListenerC25336ium2.copydefault(j);
        }
        C25330iug c25330iugValues = values();
        if (c25330iugValues != null) {
            c25330iugValues.copydefault(j);
        }
        hGO hgo2 = this.EZpvd;
        if (hgo2 != null && (c25332iui = hgo2.fetchVPNInfo) != null) {
            c25332iui.copydefault(j);
        }
        hGO hgo3 = this.EZpvd;
        if (hgo3 == null || (viewOnClickListenerC25336ium = hgo3.EZpvd) == null) {
            return;
        }
        viewOnClickListenerC25336ium.copydefault(j);
    }

    public final void isConnected() {
        ViewOnClickListenerC25336ium viewOnClickListenerC25336ium;
        C25332iui c25332iui;
        ViewOnClickListenerC25336ium viewOnClickListenerC25336ium2;
        C24461ieK c24461ieKValueOf = valueOf();
        if (c24461ieKValueOf != null) {
            c24461ieKValueOf.gEmmrt();
        }
        C24453ieC c24453ieCCopydefault = copydefault();
        if (c24453ieCCopydefault != null) {
            c24453ieCCopydefault.gEmmrt();
        }
        ViewOnClickListenerC24460ieJ viewOnClickListenerC24460ieJDjBIcL = djBIcL();
        if (viewOnClickListenerC24460ieJDjBIcL != null) {
            viewOnClickListenerC24460ieJDjBIcL.gEmmrt();
        }
        C24469ieS c24469ieSAkhnZx = AkhnZx();
        if (c24469ieSAkhnZx != null) {
            c24469ieSAkhnZx.gEmmrt();
        }
        C24467ieQ c24467ieQEZpvd = EZpvd();
        if (c24467ieQEZpvd != null) {
            c24467ieQEZpvd.gEmmrt();
        }
        ViewOnClickListenerC25336ium viewOnClickListenerC25336iumOLrzqt = OLrzqt();
        if (viewOnClickListenerC25336iumOLrzqt != null) {
            viewOnClickListenerC25336iumOLrzqt.gEmmrt();
        }
        C24454ieD c24454ieDFJNWhG = fJNWhG();
        if (c24454ieDFJNWhG != null) {
            c24454ieDFJNWhG.gEmmrt();
        }
        ViewOnClickListenerC25336ium viewOnClickListenerC25336iumAYXKKw = AYXKKw();
        if (viewOnClickListenerC25336iumAYXKKw != null) {
            viewOnClickListenerC25336iumAYXKKw.gEmmrt();
        }
        hGO hgo = this.EZpvd;
        if (hgo != null && (viewOnClickListenerC25336ium2 = hgo.copydefault) != null) {
            viewOnClickListenerC25336ium2.gEmmrt();
        }
        C25330iug c25330iugValues = values();
        if (c25330iugValues != null) {
            c25330iugValues.gEmmrt();
        }
        hGO hgo2 = this.EZpvd;
        if (hgo2 != null && (c25332iui = hgo2.fetchVPNInfo) != null) {
            c25332iui.gEmmrt();
        }
        hGO hgo3 = this.EZpvd;
        if (hgo3 == null || (viewOnClickListenerC25336ium = hgo3.EZpvd) == null) {
            return;
        }
        viewOnClickListenerC25336ium.gEmmrt();
    }

    public final void fARcdN() {
        ViewOnClickListenerC24460ieJ viewOnClickListenerC24460ieJDjBIcL = djBIcL();
        if (viewOnClickListenerC24460ieJDjBIcL != null) {
            viewOnClickListenerC24460ieJDjBIcL.gEmmrt();
        }
    }

    public final C24461ieK valueOf() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            return hgo.djBIcL;
        }
        return null;
    }

    public final C24453ieC copydefault() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            return hgo.KWHzl;
        }
        return null;
    }

    public final ViewOnClickListenerC24460ieJ djBIcL() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            return hgo.gEmmrt;
        }
        return null;
    }

    public final ViewOnClickListenerC25336ium OLrzqt() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            return hgo.AEQbTJ;
        }
        return null;
    }

    public final C24469ieS AkhnZx() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            return hgo.DbNXlk;
        }
        return null;
    }

    public final C24467ieQ EZpvd() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            return hgo.OLrzqt;
        }
        return null;
    }

    public final C25052ipT fetchVPNInfo() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            return hgo.isConnected;
        }
        return null;
    }

    public final android.widget.LinearLayout fIwbmz() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            return hgo.ejfBZ;
        }
        return null;
    }

    public final android.widget.LinearLayout AhwBna() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            return hgo.valueOf;
        }
        return null;
    }

    public final C24454ieD fJNWhG() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            return hgo.values;
        }
        return null;
    }

    public final ViewOnClickListenerC25336ium AYXKKw() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            return hgo.AYXKKw;
        }
        return null;
    }

    public final C25330iug values() {
        hGO hgo = this.EZpvd;
        if (hgo != null) {
            return hgo.AkhnZx;
        }
        return null;
    }

    public final void KWHzl(boolean z) {
        if (z) {
            if (getVisibility() == 8) {
                android.view.animation.Animation animation = this.copydefault;
                if (animation != null && !animation.hasEnded()) {
                    android.view.animation.Animation animation2 = this.copydefault;
                    if (animation2 != null) {
                        animation2.cancel();
                    }
                    this.copydefault = null;
                }
                android.view.animation.Animation animation3 = this.copydefault;
                if ((animation3 == null || !animation3.hasEnded()) && this.copydefault != null) {
                    return;
                }
                this.copydefault = C25352ivB.expand$default(this, 0L, new Function0() { // from class: o.ipE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C25035ipC.copydefault(this.copydefault);
                    }
                }, 2, null);
                return;
            }
            return;
        }
        if (getVisibility() == 0) {
            android.view.animation.Animation animation4 = this.KWHzl;
            if (animation4 != null && !animation4.hasEnded()) {
                android.view.animation.Animation animation5 = this.KWHzl;
                if (animation5 != null) {
                    animation5.cancel();
                }
                this.KWHzl = null;
            }
            android.view.animation.Animation animation6 = this.KWHzl;
            if ((animation6 == null || !animation6.hasEnded()) && this.KWHzl != null) {
                return;
            }
            this.KWHzl = C25352ivB.collapse$default(this, 0L, new Function0() { // from class: o.ipD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C25035ipC.AEQbTJ(this.copydefault);
                }
            }, 2, null);
        }
    }
}
