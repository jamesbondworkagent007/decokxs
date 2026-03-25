package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dex.trade.order.domain.model.HistoryOrderType;
import com.okinc.business.dexlogic.bean.AddressCheckVo;
import com.okinc.business.dexlogic.bean.AddressType;
import com.okinc.business.dexlogic.bean.BlackListTypes;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.LiquidityListItem;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.bean.QuotePriceReq;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.SelfSwapStatus;
import com.okinc.business.dexlogic.bean.SimpleConfigBeanItem;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.dexlogic.bean.SwapBridgeDAppInfo;
import com.okinc.business.dexlogic.bean.TokenCheckInfo;
import com.okinc.business.dexlogic.error.NetError;
import com.okinc.business.dexlogic.net.DexSourceResp;
import com.okinc.business.dexui.main.market.MarketParams;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hjq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C22677hjq extends C22384heO implements InterfaceC22598hiQ, InterfaceC22672hjl {
    public final java.lang.String AuCTel;
    public final MutableLiveData<java.lang.Boolean> DbNXlk;
    public java.util.ArrayList<SimpleConfigBeanItem> ejfBZ;
    public final MutableLiveData<TradeParam> fARcdN;
    public final C22644hjJ fIwbmz;
    public final C23237huT fJNWhG;
    public DexMultiTokenInfoBean fetchVPNInfo;
    public DexMultiTokenInfoBean isConnected;
    public final MutableStateFlow<MarketParams> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22672hjl
    public void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null) {
            return;
        }
        this.isConnected = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22672hjl
    public java.util.ArrayList<SimpleConfigBeanItem> AhwBna() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22672hjl
    public void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null) {
            return;
        }
        this.fetchVPNInfo = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22672hjl
    public DexMultiTokenInfoBean KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22598hiQ
    public MutableLiveData<java.lang.Boolean> djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22672hjl
    public DexMultiTokenInfoBean fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22598hiQ
    public InterfaceC22646hjL gEmmrt() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22598hiQ
    public MutableLiveData<TradeParam> valueOf() {
        return this.fARcdN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22677hjq(@NotNull java.lang.String str, @NotNull C23237huT c23237huT, @NotNull C23230huM c23230huM) {
        super(c23237huT, c23230huM);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c23237huT, "");
        Intrinsics.checkNotNullParameter(c23230huM, "");
        this.AuCTel = str;
        this.fJNWhG = c23237huT;
        this.fIwbmz = new C22644hjJ(str);
        this.ejfBZ = new java.util.ArrayList<>();
        this.fARcdN = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        this.values = StateFlowKt.MutableStateFlow(null);
    }

    public static final InterfaceC60096zvd QfsBiF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.InterfaceC22598hiQ
    public AbstractC58185ywX<DexMultiTokenInfoBean> copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final InterfaceC23194htd interfaceC23194htd, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC23194htd, "");
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = interfaceC23194htd.OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hjB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22677hjq.EZpvd(interfaceC23194htd, str2, num, this, str, (InterfaceC9738bbJ) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.hjz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22677hjq.QfsBiF(function1, obj);
            }
        }).copydefault(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return C33527myD.copydefault(abstractC58185ywXCopydefault);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC60096zvd EZpvd(InterfaceC23194htd interfaceC23194htd, java.lang.String str, java.lang.Integer num, C22677hjq c22677hjq, java.lang.String str2, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        if (!interfaceC23194htd.EZpvd(str, interfaceC9738bbJ)) {
            return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.Exception(""));
        }
        java.lang.String strAhwBna = interfaceC23194htd.AhwBna();
        if (num != null) {
            strEZpvd = interfaceC9738bbJ.copydefault(C33129mqd.valueOf(str), num.intValue());
            if (strEZpvd == null) {
                strEZpvd = interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(str));
            }
        }
        AbstractC58185ywX<ResponseData<DexMultiTokenInfoBean>> abstractC58185ywXAEQbTJ = c22677hjq.fJNWhG.AEQbTJ(str, interfaceC9738bbJ.DbNXlk(), str2, strAhwBna, strEZpvd);
        final Function1 function1 = new Function1() { // from class: o.hjC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22677hjq.DbNXlk((ResponseData) obj);
            }
        };
        InterfaceC58229yxO<? super ResponseData<DexMultiTokenInfoBean>, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO = new InterfaceC58229yxO() { // from class: o.hjA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22677hjq.DTwDnp(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hjF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22677hjq.gEmmrt((java.lang.Throwable) obj);
            }
        };
        return abstractC58185ywXAEQbTJ.copydefault(interfaceC58229yxO, new InterfaceC58229yxO() { // from class: o.hjG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22677hjq.QUSxYX(function12, obj);
            }
        }, new Callable() { // from class: o.hjH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C22677hjq.DbNXlk();
            }
        });
    }

    public static final InterfaceC60096zvd DTwDnp(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd QUSxYX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd gEmmrt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new NetError(th));
    }

    public static final InterfaceC60096zvd DbNXlk() {
        return AbstractC58185ywX.KWHzl();
    }

    @Override // o.InterfaceC22598hiQ
    public AbstractC58185ywX<DexSourceResp<QuotePriceRes>> AEQbTJ(@NotNull QuotePriceReq quotePriceReq, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(quotePriceReq, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final C22651hjQ c22651hjQ = new C22651hjQ(this.fJNWhG, quotePriceReq, this.AuCTel, 0L, true, 8, null);
        AbstractC58185ywX<DexSourceResp<QuotePriceRes>> abstractC58185ywXCopydefault = c22651hjQ.OLrzqt(function1).copydefault(new InterfaceC58222yxH() { // from class: o.hjy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22677hjq.KWHzl(c22651hjQ);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void KWHzl(C22651hjQ c22651hjQ) {
        c22651hjQ.EZpvd();
    }

    @Override // o.InterfaceC22598hiQ
    public AbstractC58185ywX<QuotePriceRes> KWHzl(@NotNull QuotePriceReq quotePriceReq) {
        Intrinsics.checkNotNullParameter(quotePriceReq, "");
        return C23223huF.EZpvd(this.fJNWhG.copydefault(this.AuCTel, quotePriceReq));
    }

    @Override // o.InterfaceC22598hiQ
    public AbstractC58185ywX<ResponseData<OrderDetailBean>> OLrzqt(@NotNull java.lang.String str, @NotNull HistoryOrderType historyOrderType) {
        AbstractC58185ywX<ResponseData<OrderDetailBean>> abstractC58185ywXCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(historyOrderType, "");
        if (historyOrderType == HistoryOrderType.Bridge) {
            abstractC58185ywXCopydefault = this.fJNWhG.OLrzqt(str);
        } else {
            abstractC58185ywXCopydefault = this.fJNWhG.copydefault(str);
        }
        final Function1 function1 = new Function1() { // from class: o.hjr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22677hjq.AkhnZx((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault2 = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.hjp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22677hjq.QVAiDq(function1, obj);
            }
        }).copydefault(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault2, "");
        return C33527myD.copydefault(abstractC58185ywXCopydefault2);
    }

    public static final InterfaceC60096zvd QVAiDq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OcIXYQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.InterfaceC22598hiQ
    public AbstractC58185ywX<java.util.List<DexMultiTokenInfoBean>> EZpvd(@NotNull DexMultiTokenDetailReq dexMultiTokenDetailReq) {
        Intrinsics.checkNotNullParameter(dexMultiTokenDetailReq, "");
        AbstractC58185ywX<ResponseData<java.util.List<DexMultiTokenInfoBean>>> abstractC58185ywXAEQbTJ = this.fJNWhG.AEQbTJ(dexMultiTokenDetailReq);
        final Function1 function1 = new Function1() { // from class: o.hjM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22677hjq.isConnected((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.hjs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22677hjq.OcIXYQ(function1, obj);
            }
        }).copydefault(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return C33527myD.copydefault(abstractC58185ywXCopydefault);
    }

    /* JADX DEBUG: Type inference failed for r8v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.dexlogic.bean.TokenCheckInfo> */
    @Override // o.InterfaceC22598hiQ
    public AbstractC58185ywX<TokenCheckInfo> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        AbstractC58185ywX<ResponseData<TokenCheckInfo>> abstractC58185ywXKWHzl = this.fJNWhG.KWHzl(str.length() == 0 ? str2 : str, str3, str4, str6, str5);
        final Function1 function1 = new Function1() { // from class: o.hjx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22677hjq.fJNWhG((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hjt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22677hjq.QbewEr(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final TokenCheckInfo QbewEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (TokenCheckInfo) function1.invoke(obj);
    }

    public static final AddressType QKVWgx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AddressType) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.dexlogic.bean.AddressType> */
    @Override // o.InterfaceC22598hiQ
    public AbstractC58185ywX<AddressType> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58185ywX<ResponseData<AddressCheckVo>> abstractC58185ywXKWHzl = this.fJNWhG.KWHzl(str, str2);
        final Function1 function1 = new Function1() { // from class: o.hjo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22677hjq.fetchVPNInfo((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22677hjq.QKVWgx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final AddressType fetchVPNInfo(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        AddressCheckVo addressCheckVo = (AddressCheckVo) responseData.getData();
        if (responseData.getCode() == 0 && addressCheckVo != null) {
            return AddressType.Companion.KWHzl(java.lang.Integer.valueOf(addressCheckVo.getWalletAddressStatus()));
        }
        throw new java.lang.Exception(responseData.getDetailMsg());
    }

    public static final SelfSwapStatus RJOkX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SelfSwapStatus) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.dexlogic.bean.SelfSwapStatus> */
    @Override // o.InterfaceC22598hiQ
    public AbstractC58185ywX<SelfSwapStatus> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<SelfSwapStatus>> abstractC58185ywXEZpvd = this.fJNWhG.EZpvd(str);
        final Function1 function1 = new Function1() { // from class: o.hjE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22677hjq.fARcdN((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hjD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22677hjq.RJOkX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    @Override // o.InterfaceC22598hiQ
    public AbstractC58185ywX<java.util.List<LiquidityListItem>> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23223huF.EZpvd(this.fJNWhG.KWHzl(str));
    }

    @Override // o.InterfaceC22598hiQ
    public AbstractC58185ywX<BlackListTypes> OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23223huF.EZpvd(this.fJNWhG.copydefault(str, str2));
    }

    @Override // o.InterfaceC22598hiQ
    public StateFlow<MarketParams> AYXKKw() {
        return FlowKt.asStateFlow(this.values);
    }

    @Override // o.InterfaceC22598hiQ
    public void AEQbTJ(MarketParams marketParams) {
        this.values.tryEmit(marketParams);
    }

    @Override // o.C22384heO, o.InterfaceC22387heR
    public java.util.ArrayList<DefiChainInfo> OLrzqt() {
        return EZpvd();
    }

    @Override // o.C22384heO, o.InterfaceC22387heR
    public AbstractC58185ywX<java.util.List<DefiChainInfo>> OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(str, z);
    }

    @Override // o.C22384heO, o.InterfaceC22387heR
    public AbstractC58185ywX<java.util.List<DefiChainInfo>> EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return C22380heK.OLrzqt.copydefault(this.AuCTel).AkhnZx().EZpvd(str, z);
    }

    @Override // o.C22384heO, o.InterfaceC22387heR
    public boolean AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return C22380heK.OLrzqt.copydefault(this.AuCTel).AkhnZx().AEQbTJ(str, true);
    }

    @Override // o.C22384heO, o.InterfaceC22387heR
    public java.util.ArrayList<DefiChainInfo> EZpvd() {
        return C22380heK.OLrzqt.copydefault(this.AuCTel).AkhnZx().EZpvd();
    }

    @Override // o.C22384heO, o.InterfaceC22387heR
    public DefiChainInfo KWHzl(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = OLrzqt().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((DefiChainInfo) next).getChainId())) {
                break;
            }
        }
        return (DefiChainInfo) next;
    }

    @Override // o.C22384heO, o.InterfaceC22387heR
    public java.util.ArrayList<SlippageConfigVo> AEQbTJ() {
        return C22380heK.OLrzqt.copydefault(this.AuCTel).AkhnZx().AEQbTJ();
    }

    @Override // o.C22384heO, o.InterfaceC22387heR
    public AbstractC58185ywX<java.util.List<SlippageConfigVo>> copydefault() {
        return C22380heK.OLrzqt.copydefault(this.AuCTel).AkhnZx().copydefault();
    }

    @Override // o.C22384heO, o.InterfaceC22387heR
    public java.lang.String copydefault(boolean z) {
        return C22380heK.OLrzqt.copydefault(this.AuCTel).AkhnZx().copydefault(z);
    }

    /* JADX DEBUG: Type inference failed for r7v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.dexlogic.bean.TokenCheckInfo> */
    @Override // o.InterfaceC22672hjl
    public AbstractC58185ywX<TokenCheckInfo> EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        AbstractC58185ywX<ResponseData<TokenCheckInfo>> abstractC58185ywXDjBIcL = this.fJNWhG.djBIcL(str, str2, str3, str4, str5);
        final Function1 function1 = new Function1() { // from class: o.hjw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22677hjq.AuCTel((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hjv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22677hjq.aKErDB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final TokenCheckInfo aKErDB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (TokenCheckInfo) function1.invoke(obj);
    }

    @Override // o.InterfaceC22672hjl
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DefiChainInfo defiChainInfoKWHzl = KWHzl(str);
        if (defiChainInfoKWHzl != null) {
            return defiChainInfoKWHzl.swapNotSupportedForDAppRedirect();
        }
        return false;
    }

    @Override // o.InterfaceC22672hjl
    public AbstractC58185ywX<ResponseData<java.util.List<SwapBridgeDAppInfo>>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return this.fJNWhG.OLrzqt(str, str2, str3, str4);
    }

    @Override // o.InterfaceC22598hiQ
    public boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DefiChainInfo defiChainInfoKWHzl = KWHzl(str);
        if (defiChainInfoKWHzl != null) {
            return defiChainInfoKWHzl.swapUnsupportedNetworkForDAppRedirect();
        }
        return false;
    }

    @Override // o.InterfaceC22672hjl
    public int isConnected() {
        return C23317hvu.DbNXlk();
    }

    @Override // o.InterfaceC22672hjl
    public void KWHzl(int i) {
        C23317hvu.copydefault(i);
    }

    public static final InterfaceC60096zvd DbNXlk(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return AbstractC58185ywX.KWHzl(data);
        }
        return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new NetError(responseData.getMsg()));
    }

    public static final InterfaceC60096zvd AkhnZx(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            return AbstractC58185ywX.KWHzl(responseData);
        }
        return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.Exception(responseData.getMsg()));
    }

    public static final InterfaceC60096zvd isConnected(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return AbstractC58185ywX.KWHzl(data);
        }
        return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.Exception(responseData.getMsg()));
    }

    public static final TokenCheckInfo fJNWhG(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return (TokenCheckInfo) responseData.getData();
        }
        throw new java.lang.Exception(responseData.getMsg());
    }

    public static final SelfSwapStatus fARcdN(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return (SelfSwapStatus) responseData.getData();
        }
        return new SelfSwapStatus((java.lang.String) null, 1, (DefaultConstructorMarker) null);
    }

    public static final TokenCheckInfo AuCTel(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return (TokenCheckInfo) responseData.getData();
        }
        throw new java.lang.Exception(responseData.getMsg());
    }
}
