package o;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.JsonObject;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dex.tee.domain.model.PlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.Preset;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DefiPlatformInfo;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.TokenCheckInfo;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.track.ReferralSwapMode;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam;
import com.okinc.business.dexlogic.main.swap.trade.viewmodel.single.SingleDexSwapTradeContentViewModel$chainIdForSwapConfig$2;
import com.okinc.business.dexlogic.main.swap.trade.viewmodel.single.SingleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceSlippageCache;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.FeeConfig;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC22414hes;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hsv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23159hsv extends AbstractC23101hrq {
    public final C23314hvr<DexMultiTokenInfoBean> OFhtUX;
    public final C22814hmU OJuSTm;
    public final StateFlow<java.lang.String> OxVOHk;
    public final kUP QCjLjM;
    public final C58216yxB QSLkRj;
    public final C22806hmM QVsKAR;
    public final C22816hmW QwvEab;
    public final C22815hmV USBtdM;
    public final C22812hmS UlJrfe;
    public AbstractC22818hmY aUsmxb;
    public final C22873hna dUDNAs;
    public final InterfaceC56387yDm fERRXa;
    public final C22866hnT fjfviF;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C22806hmM DGOPHZDGOPHZ() {
        return this.QVsKAR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<DexMultiTokenInfoBean> KDccX() {
        return this.OFhtUX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC23101hrq
    public C22873hna QUSxYX() {
        return this.dUDNAs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC23101hrq
    public C22812hmS QVAiDq() {
        return this.UlJrfe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC23101hrq
    public C22815hmV QbewEr() {
        return this.USBtdM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC23101hrq
    public C22814hmU QfsBiF() {
        return this.OJuSTm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC23101hrq
    public C22816hmW RJOkX() {
        return this.QwvEab;
    }

    @Override // o.AbstractC23101hrq
    public boolean UlJrfe() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.hrq.fHqPtx()V */
    public final StateFlow<java.lang.String> fHqPtx() {
        return this.OxVOHk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC23101hrq
    public AbstractC22885hnm finit() {
        return this.fjfviF;
    }

    /* JADX INFO: renamed from: o.hsv$StateListAnimator */
    public static final class StateListAnimator implements Flow<java.lang.String> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.hsv$StateListAnimator$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SingleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1 singleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1;
                DexMultiTokenInfoBean data;
                if (continuation instanceof SingleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1) {
                    singleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1 = (SingleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = singleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        singleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        singleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1 = new SingleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = singleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = singleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    ConsumeData consumeData = (ConsumeData) obj;
                    java.lang.String chainId = (consumeData == null || (data = ((TradeInputGroup) consumeData.getData()).getFromData().getData().getCoinData().getData()) == null) ? null : data.getChainId();
                    singleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(chainId, singleDexSwapTradeContentViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.String> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C23159hsv(android.app.Application application, java.lang.String str, TradeParam tradeParam, C25416iwM c25416iwM, C25412iwI c25412iwI, C28390kZq c28390kZq, C23212htv c23212htv, kUP kup, kKG kkg, InterfaceC22299hcj interfaceC22299hcj, InterfaceC19755gOc interfaceC19755gOc, kTW ktw, int i, DefaultConstructorMarker defaultConstructorMarker) {
        C25416iwM newProxyInstance;
        C28390kZq c28390kZqFIwbmz;
        C23212htv c23212htvHDKMBd;
        kUP kupAubY;
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
            kupAubY = ((InterfaceC23132hsU) C58114yvF.OLrzqt(application, InterfaceC23132hsU.class)).AubY();
        } else {
            kupAubY = kup;
        }
        if ((i & 256) != 0) {
            C58114yvF c58114yvF5 = C58114yvF.EZpvd;
            kkgWlaJM = ((InterfaceC23132hsU) C58114yvF.OLrzqt(application, InterfaceC23132hsU.class)).wlaJM();
        } else {
            kkgWlaJM = kkg;
        }
        if ((i & 512) != 0) {
            C58114yvF c58114yvF6 = C58114yvF.EZpvd;
            interfaceC22299hcjIwGUEr = ((InterfaceC23079hrU) C58114yvF.OLrzqt(application, InterfaceC23079hrU.class)).iwGUEr();
        } else {
            interfaceC22299hcjIwGUEr = interfaceC22299hcj;
        }
        if ((i & 1024) != 0) {
            C58114yvF c58114yvF7 = C58114yvF.EZpvd;
            interfaceC19755gOcFJNWhG = ((InterfaceC23079hrU) C58114yvF.OLrzqt(application, InterfaceC23079hrU.class)).fJNWhG();
        } else {
            interfaceC19755gOcFJNWhG = interfaceC19755gOc;
        }
        if ((i & 2048) != 0) {
            C58114yvF c58114yvF8 = C58114yvF.EZpvd;
            fieldNames = ((InterfaceC23079hrU) C58114yvF.OLrzqt(application, InterfaceC23079hrU.class)).getFieldNames();
        } else {
            fieldNames = ktw;
        }
        this(application, str, tradeParam2, newProxyInstance, c25412iwI2, c28390kZqFIwbmz, c23212htvHDKMBd, kupAubY, kkgWlaJM, interfaceC22299hcjIwGUEr, interfaceC19755gOcFJNWhG, fieldNames);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23159hsv(@NotNull android.app.Application application, @NotNull java.lang.String str, TradeParam tradeParam, @NotNull C25416iwM c25416iwM, @NotNull C25412iwI c25412iwI, @NotNull C28390kZq c28390kZq, @NotNull final C23212htv c23212htv, @NotNull kUP kup, @NotNull kKG kkg, @NotNull InterfaceC22299hcj interfaceC22299hcj, @NotNull InterfaceC19755gOc interfaceC19755gOc, @NotNull kTW ktw) {
        super(application, str, tradeParam, c25416iwM, c25412iwI, kkg, c28390kZq, c23212htv, interfaceC22299hcj, interfaceC19755gOc, ktw);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c25416iwM, "");
        Intrinsics.checkNotNullParameter(c25412iwI, "");
        Intrinsics.checkNotNullParameter(c28390kZq, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(kup, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(interfaceC22299hcj, "");
        Intrinsics.checkNotNullParameter(interfaceC19755gOc, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        this.QCjLjM = kup;
        this.fjfviF = new C22866hnT(str, this);
        this.dUDNAs = new C22873hna(str, this);
        this.OJuSTm = new C22814hmU(this, null, 2, 0 == true ? 1 : 0);
        this.UlJrfe = new C22812hmS(this);
        this.QwvEab = new C22816hmW(this);
        this.QVsKAR = new C22806hmM(this);
        this.USBtdM = new C22815hmV(this);
        this.QSLkRj = new C58216yxB();
        this.OFhtUX = new C23314hvr<>();
        this.OxVOHk = FlowKt.stateIn(FlowKt.onEach(FlowKt.distinctUntilChanged(new StateListAnimator(FlowLiveDataConversions.asFlow(dmfpNf()))), new SingleDexSwapTradeContentViewModel$chainIdForSwapConfig$2(this, str, interfaceC22299hcj, interfaceC19755gOc, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), null);
        USBtdM();
        this.fERRXa = C56392yDr.copydefault(new Function0() { // from class: o.hsx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23159hsv.KWHzl(c23212htv, this);
            }
        });
    }

    public void EZpvd(@NotNull CurrentChain currentChain) {
        Intrinsics.checkNotNullParameter(currentChain, "");
        EZpvd(currentChain.getData());
        if (C22372heC.EZpvd(ffGIBT())) {
            AYXKKw(currentChain.getData().getChainId());
        }
        copydefault(false);
        AEQbTJ(currentChain.getData());
    }

    public void EZpvd(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        C22380heK.OLrzqt.copydefault(ffGIBT()).fARcdN().OLrzqt(ffGIBT());
        if (C22372heC.EZpvd(ffGIBT()) && hBpjJd() != null) {
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
    public void KWHzl(@NotNull TradeState tradeState) {
        Intrinsics.checkNotNullParameter(tradeState, "");
        if (tradeState.isTerminalButGasdropRecieve() && tradeState.needRefreshApproveState()) {
            C22380heK.OLrzqt.copydefault(ffGIBT()).DbNXlk().OLrzqt();
            dNCPSb().KWHzl();
        }
    }

    @Override // o.AbstractC23101hrq
    public AbstractC22818hmY dNCPSb() {
        if (this.aUsmxb == null) {
            this.aUsmxb = new C22881hni(this);
        }
        AbstractC22818hmY abstractC22818hmY = this.aUsmxb;
        Intrinsics.copydefault(abstractC22818hmY);
        return abstractC22818hmY;
    }

    @Override // o.AbstractC23101hrq
    public DexMultiTokenInfoBean fIwbmz() {
        return C22380heK.OLrzqt.copydefault(ffGIBT()).fJNWhG().AEQbTJ();
    }

    @Override // o.AbstractC23101hrq
    public DexMultiTokenInfoBean AuCTel() {
        return C22380heK.OLrzqt.copydefault(ffGIBT()).fJNWhG().valueOf();
    }

    @Override // o.AbstractC23101hrq
    public InterfaceC22598hiQ getFieldNames() {
        return C22380heK.OLrzqt.copydefault(ffGIBT()).djBIcL();
    }

    @Override // o.AbstractC23101hrq
    public InterfaceC22824hme zLjUOn() {
        return C22380heK.OLrzqt.copydefault(ffGIBT()).fJNWhG();
    }

    @Override // o.AbstractC23101hrq
    public AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return gwTjWJ().copydefault(map, jsonObject, str, str2);
    }

    public final void KWHzl(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC58185ywX<java.util.List<DefiChainInfo>> abstractC58185ywXEZpvd = C22380heK.OLrzqt.copydefault(ffGIBT()).AkhnZx().EZpvd("3", true);
        final Function1 function1 = new Function1() { // from class: o.hsy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23159hsv.KWHzl(function0, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<DefiChainInfo>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hsA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23159hsv.zuBGHE(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hsD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23159hsv.KWHzl(function0, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hsE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23159hsv.AxsJAY(function12, obj);
            }
        });
    }

    public static final void AxsJAY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function0 function0, java.lang.Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function0 function0, java.util.List list) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void zuBGHE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void AEQbTJ(@NotNull AdvanceSlippageCache advanceSlippageCache) {
        Intrinsics.checkNotNullParameter(advanceSlippageCache, "");
        DCUTEI().copydefault(advanceSlippageCache);
    }

    public final LiveData<java.lang.Boolean> DBxZfM() {
        return DCUTEI().KWHzl();
    }

    public final AbstractC22407hel KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9) {
        QuotePriceRes quotePriceRes;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        QuotePriceRes quotePriceResAxsJAYsNCnLh = AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh == null) {
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            quotePriceRes = new QuotePriceRes((java.util.List) (0 == true ? 1 : 0), (java.util.List) (0 == true ? 1 : 0), str10, new CommonDexInfo((java.lang.String) null, (java.lang.String) null, str10, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str11, (java.lang.String) null, (java.lang.String) null, str12, str13, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, fIwbmz(), fIwbmz(), (DefiPlatformInfo) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, -393217, 15, (DefaultConstructorMarker) null), false, false, false, str11, (TraceData) (0 == true ? 1 : 0), (SwapPriorityFeeInfo) (0 == true ? 1 : 0), str12, str13, 4087, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            quotePriceRes = quotePriceResAxsJAYsNCnLh;
        }
        java.lang.String strQCjLjM = QCjLjM();
        java.lang.String slippage = RlQdEF().getSlippage();
        java.lang.String str14 = slippage == null ? "" : slippage;
        SlippageMode slippageModeCopydefault = DCUTEI().copydefault();
        InterfaceC9738bbJ interfaceC9738bbJQSLkRj = QSLkRj();
        return C25289its.KWHzl(new AbstractC22414hes.Activity(str2, str, quotePriceRes, strQCjLjM, str14, slippageModeCopydefault, interfaceC9738bbJQSLkRj != null ? interfaceC9738bbJQSLkRj.RJOkX() : false, str3, str4, str5, str6, str7, str8, str9));
    }

    public final PlaceOrderParams hCLrkq() {
        java.lang.String strOLrzqt = DCUTEI().OLrzqt();
        QuotePriceRes quotePrice = RlQdEF().getQuotePrice();
        java.lang.String strEstimateGasFee = quotePrice != null ? quotePrice.estimateGasFee() : null;
        java.lang.String str = strEstimateGasFee == null ? "" : strEstimateGasFee;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(DCUTEI().copydefault().getType()));
        java.lang.String strOLrzqt2 = DCUTEI().OLrzqt(RlQdEF().getSlippage());
        java.lang.String str2 = strOLrzqt2 == null ? "" : strOLrzqt2;
        QuotePriceRes quotePrice2 = RlQdEF().getQuotePrice();
        java.lang.String refCode = quotePrice2 != null ? quotePrice2.getRefCode() : null;
        if (refCode == null) {
            refCode = "";
        }
        QuotePriceRes quotePrice3 = RlQdEF().getQuotePrice();
        java.lang.String refAddress = quotePrice3 != null ? quotePrice3.getRefAddress() : null;
        return new PlaceOrderParams(strOLrzqt, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, str, (java.lang.String) null, strGEmmrt, str2, (Preset) null, new ReferralParam(refCode, refAddress != null ? refAddress : ""), 1214, (DefaultConstructorMarker) null);
    }

    private final C22907hoH DGgnkA() {
        return (C22907hoH) this.fERRXa.getValue();
    }

    public static final C22907hoH KWHzl(C23212htv c23212htv, final C23159hsv c23159hsv) {
        return new C22907hoH(c23212htv, new C22339hdW(new Function0() { // from class: o.hsG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23159hsv.UrRBLY();
            }
        }, new Function0() { // from class: o.hsH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23159hsv.djBIcL(this.EZpvd);
            }
        }, new Function0() { // from class: o.hsI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23159hsv.AYXKKw(this.KWHzl);
            }
        }, new Function0() { // from class: o.hsO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23159hsv.valueOf(this.OLrzqt);
            }
        }));
    }

    public static final java.lang.String UrRBLY() {
        return ReferralSwapMode.SWAP_MARKET.getMode();
    }

    public static final java.lang.String djBIcL(C23159hsv c23159hsv) {
        return c23159hsv.hDKMBd();
    }

    public static final java.lang.String AYXKKw(C23159hsv c23159hsv) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = c23159hsv.QUSxYX().copydefault();
        java.lang.String tokenSymbol = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = c23159hsv.QUSxYX().valueOf();
        java.lang.String tokenSymbol2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getTokenSymbol() : null;
        return tokenSymbol + "-" + (tokenSymbol2 != null ? tokenSymbol2 : "");
    }

    public static final ServiceFeeInfo valueOf(C23159hsv c23159hsv) {
        QuotePriceRes quotePriceResAxsJAYsNCnLh = c23159hsv.AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null) {
            return quotePriceResAxsJAYsNCnLh.getServiceFeeInfo();
        }
        return null;
    }

    public final void copydefault(@NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        DGgnkA().OLrzqt(function2);
    }

    public static final boolean OLrzqt(C23159hsv c23159hsv) {
        ServiceFeeInfo serviceFeeInfoDsrFlB = c23159hsv.DsrFlB();
        if (serviceFeeInfoDsrFlB != null) {
            return serviceFeeInfoDsrFlB.isCharge();
        }
        return true;
    }

    public final boolean DaRZkR() {
        return DGgnkA().OLrzqt(new Function0() { // from class: o.hsF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C23159hsv.OLrzqt(this.EZpvd));
            }
        });
    }

    public final ServiceFeeInfo DsrFlB() {
        QuotePriceRes quotePriceResAxsJAYsNCnLh = AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null) {
            return quotePriceResAxsJAYsNCnLh.getServiceFeeInfo();
        }
        return null;
    }

    public final java.lang.String DNMMPQ() {
        QuotePriceRes quotePriceResAxsJAYsNCnLh = AxsJAYsNCnLh();
        java.lang.String strAutoSlippage = quotePriceResAxsJAYsNCnLh != null ? quotePriceResAxsJAYsNCnLh.autoSlippage() : null;
        if (strAutoSlippage == null) {
            strAutoSlippage = "";
        }
        java.lang.String strOLrzqt = DCUTEI().OLrzqt(strAutoSlippage);
        return strOLrzqt == null ? "" : strOLrzqt;
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C22907hoH.showReferralCodeApplyPanel$default(DGgnkA(), context, null, null, 6, null);
    }

    public final java.util.Map<java.lang.String, java.lang.String> DGUQLI() {
        return C22907hoH.getReferralParamMap$default(DGgnkA(), null, 1, null);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        java.lang.Object next;
        DexMultiTokenInfoBean toDexMultiTokenInfoVO;
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strEZpvd = C23311hvo.EZpvd(str, str2, z);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = zLjUOn().AEQbTJ();
        if (Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getUniqueId() : null), (java.lang.Object) strEZpvd)) {
            return;
        }
        java.util.Iterator<T> it = this.QCjLjM.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        if (defiChainInfo == null || (dexDefaultFromToTokenShowVO = defiChainInfo.getDexDefaultFromToTokenShowVO()) == null) {
            toDexMultiTokenInfoVO = null;
        } else {
            DexMultiTokenInfoBean toDexMultiTokenInfoVO2 = dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO();
            if (Intrinsics.EZpvd((java.lang.Object) (toDexMultiTokenInfoVO2 != null ? toDexMultiTokenInfoVO2.getUniqueId() : null), (java.lang.Object) strEZpvd)) {
                toDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO();
            } else {
                toDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO();
            }
        }
        InterfaceC22598hiQ fieldNames = getFieldNames();
        java.lang.String chainId = toDexMultiTokenInfoVO != null ? toDexMultiTokenInfoVO.getChainId() : null;
        java.lang.String str3 = chainId == null ? "" : chainId;
        java.lang.String tokenContractAddress = toDexMultiTokenInfoVO != null ? toDexMultiTokenInfoVO.getTokenContractAddress() : null;
        C22380heK c22380heK = C22380heK.OLrzqt;
        AbstractC58185ywX<TokenCheckInfo> abstractC58185ywXCopydefault = fieldNames.copydefault(str, str3, str2, tokenContractAddress, c22380heK.copydefault(ffGIBT()).fARcdN().AhwBna(), c22380heK.copydefault(ffGIBT()).fARcdN().copydefault());
        final Function1 function1 = new Function1() { // from class: o.hsz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23159hsv.EZpvd(this.EZpvd, (TokenCheckInfo) obj);
            }
        };
        InterfaceC58227yxM<? super TokenCheckInfo> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hsC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23159hsv.sSMYrx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hsB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23159hsv.copydefault(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hsJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23159hsv.AwvSrB(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, this.QSLkRj);
    }

    public static final void sSMYrx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C23159hsv c23159hsv, TokenCheckInfo tokenCheckInfo) {
        if (tokenCheckInfo.isError()) {
            if (tokenCheckInfo.isChainTokenInvalid()) {
                c23159hsv.RdAHlO().setValue(C33070mpX.AYXKKw(C23274hvD.Fragment.DCUTEIddSDPG));
            }
            return Unit.INSTANCE;
        }
        DexMultiTokenInfoBean fromTokenInfo = tokenCheckInfo.getFromTokenInfo();
        if (fromTokenInfo != null) {
            c23159hsv.OFhtUX.setValue(fromTokenInfo);
        }
        return Unit.INSTANCE;
    }

    public static final void AwvSrB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C23159hsv c23159hsv, java.lang.Throwable th) {
        c23159hsv.RdAHlO().setValue(th.getMessage());
        return Unit.INSTANCE;
    }

    public final java.lang.String heceqZ() {
        DexPresetResultVO dexPresetResultVO;
        DeFiPlatformForSwap selectedDeFiPlatform;
        DexAutoSlippageInfoParam autoSlippageInfo;
        FeeConfig feeConfig;
        DeFiPlatformForSwap selectedDeFiPlatform2;
        DexAutoSlippageInfoParam autoSlippageInfo2;
        java.util.ArrayList<PresetUserConfigBean> dexPresetResultVOList;
        PresetUserConfigBean presetUserConfigBean;
        Result<DexPresetResultVO> resultOLrzqt = OLrzqt(hDKMBd());
        java.lang.String recommendSlippageRangeMax = null;
        if (resultOLrzqt != null) {
            java.lang.Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            dexPresetResultVO = (DexPresetResultVO) objM7386unboximpl;
        } else {
            dexPresetResultVO = null;
        }
        BuySellPreset buyPreset = (dexPresetResultVO == null || (dexPresetResultVOList = dexPresetResultVO.getDexPresetResultVOList()) == null || (presetUserConfigBean = (PresetUserConfigBean) CollectionsKt___CollectionsKt.firstOrNull(dexPresetResultVOList)) == null) ? null : presetUserConfigBean.getBuyPreset();
        QuotePriceRes quotePriceResAxsJAYsNCnLh = AxsJAYsNCnLh();
        java.lang.String referenceSlippage = (quotePriceResAxsJAYsNCnLh == null || (selectedDeFiPlatform2 = quotePriceResAxsJAYsNCnLh.getSelectedDeFiPlatform()) == null || (autoSlippageInfo2 = selectedDeFiPlatform2.getAutoSlippageInfo()) == null) ? null : autoSlippageInfo2.getReferenceSlippage();
        if (referenceSlippage == null) {
            referenceSlippage = "";
        }
        if (referenceSlippage.length() == 0) {
            if (buyPreset != null && (feeConfig = buyPreset.getFeeConfig()) != null) {
                recommendSlippageRangeMax = feeConfig.getMax();
            }
            return recommendSlippageRangeMax == null ? "" : recommendSlippageRangeMax;
        }
        QuotePriceRes quotePriceResAxsJAYsNCnLh2 = AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh2 != null && (selectedDeFiPlatform = quotePriceResAxsJAYsNCnLh2.getSelectedDeFiPlatform()) != null && (autoSlippageInfo = selectedDeFiPlatform.getAutoSlippageInfo()) != null) {
            recommendSlippageRangeMax = autoSlippageInfo.getRecommendSlippageRangeMax();
        }
        java.lang.String str = recommendSlippageRangeMax != null ? recommendSlippageRangeMax : "";
        return C23313hvq.OLrzqt(referenceSlippage, str) ? referenceSlippage : str;
    }

    public final boolean OTwTPd() {
        return C23313hvq.EZpvd(DbNXlk(), AkhnZx());
    }

    @Override // o.AbstractC23101hrq, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.QSLkRj.dispose();
    }
}
