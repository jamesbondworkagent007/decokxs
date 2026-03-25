package o;

import com.google.gson.JsonObject;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import com.okinc.business.dexui.main.swap.trade.input.widget.CrossValueDifferenceData;
import com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceSlippageCache;
import com.okinc.network.okg.response.ResponseData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22405hej;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hsq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23154hsq extends AbstractC23101hrq {
    public final C22806hmM OFhtUX;
    public final C22812hmS OJuSTm;
    public final C22815hmV OxVOHk;
    public final C22814hmU QCjLjM;
    public final C22873hna QSLkRj;
    public final C22816hmW QVsKAR;
    public final C22847hnA QwvEab;
    public AbstractC22818hmY UlJrfe;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC23101hrq
    public C22873hna QUSxYX() {
        return this.QSLkRj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC23101hrq
    public C22812hmS QVAiDq() {
        return this.OJuSTm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC23101hrq
    public C22815hmV QbewEr() {
        return this.OxVOHk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC23101hrq
    public C22814hmU QfsBiF() {
        return this.QCjLjM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC23101hrq
    public C22816hmW RJOkX() {
        return this.QVsKAR;
    }

    @Override // o.AbstractC23101hrq
    public boolean UlJrfe() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.hrq.fHqPtx()V */
    public C22806hmM fHqPtx() {
        return this.OFhtUX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC23101hrq
    public AbstractC22885hnm finit() {
        return this.QwvEab;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C23154hsq(android.app.Application application, java.lang.String str, TradeParam tradeParam, C25416iwM c25416iwM, C25412iwI c25412iwI, C28390kZq c28390kZq, C23212htv c23212htv, kKG kkg, InterfaceC22299hcj interfaceC22299hcj, InterfaceC19755gOc interfaceC19755gOc, kTW ktw, int i, DefaultConstructorMarker defaultConstructorMarker) {
        C25416iwM newProxyInstance;
        C28390kZq c28390kZqFIwbmz;
        C23212htv c23212htvHDKMBd;
        kKG kkgWlaJM;
        InterfaceC22299hcj interfaceC22299hcjIwGUEr;
        InterfaceC19755gOc interfaceC19755gOcFJNWhG;
        kTW fieldNames;
        TradeParam tradeParam2 = (i & 4) != 0 ? null : tradeParam;
        if ((i & 8) != 0) {
            C58114yvF c58114yvF = C58114yvF.EZpvd;
            newProxyInstance = ((InterfaceC23079hrU) C58114yvF.OLrzqt(application, InterfaceC23079hrU.class)).getNewProxyInstance();
        } else {
            newProxyInstance = c25416iwM;
        }
        C25412iwI c25412iwI2 = (i & 16) != 0 ? new C25412iwI() : c25412iwI;
        if ((i & 32) != 0) {
            C58114yvF c58114yvF2 = C58114yvF.EZpvd;
            c28390kZqFIwbmz = ((InterfaceC23079hrU) C58114yvF.OLrzqt(application, InterfaceC23079hrU.class)).fIwbmz();
        } else {
            c28390kZqFIwbmz = c28390kZq;
        }
        if ((i & 64) != 0) {
            C58114yvF c58114yvF3 = C58114yvF.EZpvd;
            c23212htvHDKMBd = ((InterfaceC23132hsU) C58114yvF.OLrzqt(application, InterfaceC23132hsU.class)).hDKMBd();
        } else {
            c23212htvHDKMBd = c23212htv;
        }
        if ((i & 128) != 0) {
            C58114yvF c58114yvF4 = C58114yvF.EZpvd;
            kkgWlaJM = ((InterfaceC23132hsU) C58114yvF.OLrzqt(application, InterfaceC23132hsU.class)).wlaJM();
        } else {
            kkgWlaJM = kkg;
        }
        if ((i & 256) != 0) {
            C58114yvF c58114yvF5 = C58114yvF.EZpvd;
            interfaceC22299hcjIwGUEr = ((InterfaceC23079hrU) C58114yvF.OLrzqt(application, InterfaceC23079hrU.class)).iwGUEr();
        } else {
            interfaceC22299hcjIwGUEr = interfaceC22299hcj;
        }
        if ((i & 512) != 0) {
            C58114yvF c58114yvF6 = C58114yvF.EZpvd;
            interfaceC19755gOcFJNWhG = ((InterfaceC23079hrU) C58114yvF.OLrzqt(application, InterfaceC23079hrU.class)).fJNWhG();
        } else {
            interfaceC19755gOcFJNWhG = interfaceC19755gOc;
        }
        if ((i & 1024) != 0) {
            C58114yvF c58114yvF7 = C58114yvF.EZpvd;
            fieldNames = ((InterfaceC23079hrU) C58114yvF.OLrzqt(application, InterfaceC23079hrU.class)).getFieldNames();
        } else {
            fieldNames = ktw;
        }
        this(application, str, tradeParam2, newProxyInstance, c25412iwI2, c28390kZqFIwbmz, c23212htvHDKMBd, kkgWlaJM, interfaceC22299hcjIwGUEr, interfaceC19755gOcFJNWhG, fieldNames);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23154hsq(@NotNull android.app.Application application, @NotNull java.lang.String str, TradeParam tradeParam, @NotNull C25416iwM c25416iwM, @NotNull C25412iwI c25412iwI, @NotNull C28390kZq c28390kZq, @NotNull C23212htv c23212htv, @NotNull kKG kkg, @NotNull InterfaceC22299hcj interfaceC22299hcj, @NotNull InterfaceC19755gOc interfaceC19755gOc, @NotNull kTW ktw) {
        super(application, str, tradeParam, c25416iwM, c25412iwI, kkg, c28390kZq, c23212htv, interfaceC22299hcj, interfaceC19755gOc, ktw);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c25416iwM, "");
        Intrinsics.checkNotNullParameter(c25412iwI, "");
        Intrinsics.checkNotNullParameter(c28390kZq, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(interfaceC22299hcj, "");
        Intrinsics.checkNotNullParameter(interfaceC19755gOc, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        this.QwvEab = new C22847hnA(str, this);
        this.QSLkRj = new C22873hna(str, this);
        this.QCjLjM = new C22814hmU(this, null, 2, 0 == true ? 1 : 0);
        this.OJuSTm = new C22812hmS(this);
        this.QVsKAR = new C22816hmW(this);
        this.OFhtUX = new C22806hmM(this);
        this.OxVOHk = new C22815hmV(this);
        USBtdM();
    }

    public void KWHzl(@NotNull CurrentChain currentChain) {
        Intrinsics.checkNotNullParameter(currentChain, "");
        KWHzl(currentChain.getData());
        if (C22372heC.EZpvd(ffGIBT())) {
            AYXKKw(currentChain.getData().getChainId());
        }
        copydefault(false);
        AEQbTJ(currentChain.getData());
    }

    @Override // o.AbstractC23101hrq
    public void KWHzl(@NotNull TradeState tradeState) {
        ApproveStatus approveStatus;
        Intrinsics.checkNotNullParameter(tradeState, "");
        if (tradeState.isApproveType()) {
            if (tradeState.successTx()) {
                approveStatus = ApproveStatus.APPROVED;
            } else if (tradeState.pendingTx()) {
                approveStatus = ApproveStatus.APPROVING;
            } else if (tradeState.isFail()) {
                approveStatus = ApproveStatus.APPROVE_FAIL;
            } else if (tradeState.cancelApproveFail()) {
                approveStatus = ApproveStatus.APPROVED;
            } else if (tradeState.cancelApproveSuccess()) {
                approveStatus = ApproveStatus.UN_APPROVE;
            } else if (!tradeState.cancelingApprove()) {
                return;
            } else {
                approveStatus = ApproveStatus.CANCEL_APPROVING;
            }
            QuotePriceRes quotePriceResAxsJAYsNCnLh = AxsJAYsNCnLh();
            if (quotePriceResAxsJAYsNCnLh != null) {
                java.lang.String defiPlatformId = tradeState.getDefiPlatformId();
                if (defiPlatformId == null) {
                    defiPlatformId = "";
                }
                java.lang.String approveAmount = tradeState.getApproveAmount();
                java.lang.String str = approveAmount != null ? approveAmount : "";
                java.lang.Boolean needCancelApproveToken = tradeState.getNeedCancelApproveToken();
                quotePriceResAxsJAYsNCnLh.updateBridgeApproveInfo(defiPlatformId, str, needCancelApproveToken != null ? needCancelApproveToken.booleanValue() : false, approveStatus);
            }
            dNCPSb().KWHzl();
        }
    }

    public void KWHzl(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        C22380heK.OLrzqt.copydefault(ffGIBT()).fARcdN().OLrzqt(ffGIBT());
        if (C22372heC.EZpvd(ffGIBT())) {
            AbstractC22885hnm.tokenCheck$default(finit(), hBpjJd(), defiChainInfo, false, true, 4, null);
            return;
        }
        if (AuCTel() != null && fIwbmz() != null && giSNqX()) {
            valueOf(false);
            AbstractC22885hnm.tokenCheck$default(finit(), hBpjJd(), defiChainInfo, true, false, 8, null);
            return;
        }
        AbstractC22885hnm.initTradeInput$default(finit(), defiChainInfo, false, 2, null);
        if (giSNqX()) {
            valueOf(false);
            DCJXGO().setValue(java.lang.Boolean.TRUE);
        }
        valueOf(false);
    }

    @Override // o.AbstractC23101hrq
    public AbstractC22818hmY dNCPSb() {
        if (this.UlJrfe == null) {
            this.UlJrfe = new C22809hmP(this);
        }
        AbstractC22818hmY abstractC22818hmY = this.UlJrfe;
        Intrinsics.copydefault(abstractC22818hmY);
        return abstractC22818hmY;
    }

    @Override // o.AbstractC23101hrq
    public DexMultiTokenInfoBean fIwbmz() {
        return C23317hvu.EZpvd();
    }

    @Override // o.AbstractC23101hrq
    public DexMultiTokenInfoBean AuCTel() {
        return C23317hvu.AuCTel();
    }

    @Override // o.AbstractC23101hrq
    public InterfaceC22598hiQ getFieldNames() {
        return C22380heK.OLrzqt.copydefault(ffGIBT()).copydefault();
    }

    @Override // o.AbstractC23101hrq
    public InterfaceC22824hme zLjUOn() {
        return C22380heK.OLrzqt.copydefault(ffGIBT()).OLrzqt(false);
    }

    public final CrossValueDifferenceData DWgRXt() {
        DexMultiTokenInfoBean crossToToken;
        QuotePriceRes quotePriceResAxsJAYsNCnLh = AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null) {
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            java.lang.String strBridgeFeeUsd = quotePriceResAxsJAYsNCnLh.bridgeFeeUsd();
            RoundingMode roundingMode = RoundingMode.DOWN;
            java.lang.String showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(c23272hvB, strBridgeFeeUsd, false, false, roundingMode, false, 22, null);
            C23271hvA c23271hvA = C23271hvA.copydefault;
            java.lang.String showData$default = C23271hvA.getShowData$default(c23271hvA, quotePriceResAxsJAYsNCnLh.crossChainFee(), false, roundingMode, false, false, 26, null);
            java.lang.String showDataWithPrefix$default2 = C23272hvB.getShowDataWithPrefix$default(c23272hvB, quotePriceResAxsJAYsNCnLh.toSwapFeeUsd(), false, false, roundingMode, false, 22, null);
            java.lang.String showDataWithSymbol$default = C23271hvA.getShowDataWithSymbol$default(c23271hvA, quotePriceResAxsJAYsNCnLh.toSwapFee(), quotePriceResAxsJAYsNCnLh.getCommonDexInfo().getToNativeTokenSymbol(), false, roundingMode, false, false, 20, null);
            DexMultiTokenInfoBean toToken = quotePriceResAxsJAYsNCnLh.getCommonDexInfo().getToToken();
            java.lang.String tokenSymbol = null;
            java.lang.String chainName = toToken != null ? toToken.getChainName() : null;
            java.lang.String str = chainName == null ? "" : chainName;
            DexQuoteBridgeVO dexQuoteBridgeVOBridge = quotePriceResAxsJAYsNCnLh.bridge();
            java.lang.String bridgeName = dexQuoteBridgeVOBridge != null ? dexQuoteBridgeVOBridge.getBridgeName() : null;
            java.lang.String str2 = bridgeName == null ? "" : bridgeName;
            boolean zIsIntentBridge = quotePriceResAxsJAYsNCnLh.isIntentBridge();
            boolean zIsOpenServiceFee = quotePriceResAxsJAYsNCnLh.getCommonDexInfo().isOpenServiceFee();
            DexQuoteBridgeVO dexQuoteBridgeVOBridge2 = quotePriceResAxsJAYsNCnLh.bridge();
            if (dexQuoteBridgeVOBridge2 != null && (crossToToken = dexQuoteBridgeVOBridge2.getCrossToToken()) != null) {
                tokenSymbol = crossToToken.getTokenSymbol();
            }
            return new CrossValueDifferenceData(zIsIntentBridge, zIsOpenServiceFee, showDataWithPrefix$default, showData$default, showDataWithPrefix$default2, showDataWithSymbol$default, str, str2, tokenSymbol == null ? "" : tokenSymbol, "");
        }
        return new CrossValueDifferenceData(false, false, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // o.AbstractC23101hrq
    public AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return gwTjWJ().OLrzqt(map, jsonObject, str, str2);
    }

    public final void copydefault(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC58185ywX<java.util.List<DefiChainInfo>> abstractC58185ywXOLrzqt = C22380heK.OLrzqt.copydefault(ffGIBT()).AkhnZx().OLrzqt("3", true);
        final Function1 function1 = new Function1() { // from class: o.hsu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23154hsq.OLrzqt(function0, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<DefiChainInfo>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hst
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23154hsq.zLjUOn(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hsr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23154hsq.EZpvd(function0, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hss
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23154hsq.wlaJM(function12, obj);
            }
        });
    }

    public static final Unit EZpvd(Function0 function0, java.lang.Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function0 function0, java.util.List list) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl(@NotNull AdvanceSlippageCache advanceSlippageCache) {
        Intrinsics.checkNotNullParameter(advanceSlippageCache, "");
        DCUTEI().copydefault(advanceSlippageCache);
    }

    public final AbstractC22410heo valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        QuotePriceRes quotePriceResAxsJAYsNCnLh = AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh == null) {
            return null;
        }
        java.lang.String strFfGIBT = ffGIBT();
        java.lang.String strQCjLjM = QCjLjM();
        java.lang.String slippage = RlQdEF().getSlippage();
        return C25289its.AEQbTJ(new AbstractC22405hej.StateListAnimator(str, strFfGIBT, quotePriceResAxsJAYsNCnLh, strQCjLjM, slippage == null ? "" : slippage, DCUTEI().copydefault()));
    }
}
