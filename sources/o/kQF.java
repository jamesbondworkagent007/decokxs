package o;

import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.dexlogic.bean.ApproveDataParam;
import com.okinc.business.dexlogic.bean.ApproveResultInfo;
import com.okinc.business.dexlogic.bean.ApproveUnsignedData;
import com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MultiApproveInfoParam;
import com.okinc.business.dexlogic.bean.SwapApproveInfoReq;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedApprovalUseCase$special$$inlined$filter$1$2$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedApprovalUseCase$special$$inlined$map$1$2$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedApprovalUseCase$submitForApproval$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedApprovalUseCase$validateApprovalInfo$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedApprovalUseCase$verifyApproval$2;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC43419rot;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kQF {
    public final StateFlow<AdvancedApproveState> AEQbTJ;
    public final C28165kRh AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public final kQV EZpvd;
    public final Flow<TradeState> KWHzl;
    public final InterfaceC28146kQp OLrzqt;
    public final MutableStateFlow<AdvancedApproveState> copydefault;
    public final C30794lhq djBIcL;
    public final C28196kSl gEmmrt;
    public final kWB valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AdvancedApproveState> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<TradeState> OLrzqt() {
        return this.KWHzl;
    }

    public static final class ActionBar implements Flow<TradeState> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.kQF$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                AdvancedApprovalUseCase$special$$inlined$filter$1$2$1 advancedApprovalUseCase$special$$inlined$filter$1$2$1;
                if (continuation instanceof AdvancedApprovalUseCase$special$$inlined$filter$1$2$1) {
                    advancedApprovalUseCase$special$$inlined$filter$1$2$1 = (AdvancedApprovalUseCase$special$$inlined$filter$1$2$1) continuation;
                    int i = advancedApprovalUseCase$special$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        advancedApprovalUseCase$special$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        advancedApprovalUseCase$special$$inlined$filter$1$2$1 = new AdvancedApprovalUseCase$special$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = advancedApprovalUseCase$special$$inlined$filter$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = advancedApprovalUseCase$special$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    if (((TradeState) obj).needRefreshApproveState()) {
                        advancedApprovalUseCase$special$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, advancedApprovalUseCase$special$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
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

        public ActionBar(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super TradeState> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator implements Flow<TradeState> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ kQF copydefault;

        /* JADX INFO: renamed from: o.kQF$StateListAnimator$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ kQF AEQbTJ;
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, kQF kqf) {
                this.KWHzl = flowCollector;
                this.AEQbTJ = kqf;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                AdvancedApprovalUseCase$special$$inlined$map$1$2$1 advancedApprovalUseCase$special$$inlined$map$1$2$1;
                if (continuation instanceof AdvancedApprovalUseCase$special$$inlined$map$1$2$1) {
                    advancedApprovalUseCase$special$$inlined$map$1$2$1 = (AdvancedApprovalUseCase$special$$inlined$map$1$2$1) continuation;
                    int i = advancedApprovalUseCase$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        advancedApprovalUseCase$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        advancedApprovalUseCase$special$$inlined$map$1$2$1 = new AdvancedApprovalUseCase$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = advancedApprovalUseCase$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = advancedApprovalUseCase$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    this.AEQbTJ.OLrzqt.AEQbTJ();
                    advancedApprovalUseCase$special$$inlined$map$1$2$1.label = 1;
                    if (this.KWHzl.emit((TradeState) obj, advancedApprovalUseCase$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow, kQF kqf) {
            this.AEQbTJ = flow;
            this.copydefault = kqf;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super TradeState> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public kQF(@NotNull InterfaceC28146kQp interfaceC28146kQp, @NotNull C28196kSl c28196kSl, @NotNull C28165kRh c28165kRh, @NotNull kQV kqv, @NotNull kWB kwb, @NotNull C30794lhq c30794lhq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28146kQp, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(c28165kRh, "");
        Intrinsics.checkNotNullParameter(kqv, "");
        Intrinsics.checkNotNullParameter(kwb, "");
        Intrinsics.checkNotNullParameter(c30794lhq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC28146kQp;
        this.gEmmrt = c28196kSl;
        this.AYXKKw = c28165kRh;
        this.EZpvd = kqv;
        this.valueOf = kwb;
        this.djBIcL = c30794lhq;
        this.AhwBna = coroutineDispatcher;
        MutableStateFlow<AdvancedApproveState> MutableStateFlow = StateFlowKt.MutableStateFlow(AdvancedApproveState.APPROVED);
        this.copydefault = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        this.KWHzl = new StateListAnimator(new ActionBar(FlowKt.filterNotNull(kwb.EZpvd())), this);
    }

    public final java.lang.Object AEQbTJ(java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.AhwBna, new AdvancedApprovalUseCase$validateApprovalInfo$2(dexMultiTokenInfoBean, this, str, str2, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, @NotNull AdvancedApproveState advancedApproveState, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, java.lang.String str, @NotNull java.lang.String str2, @NotNull Function1<? super android.os.Bundle, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AdvancedApprovalUseCase$submitForApproval$1 advancedApprovalUseCase$submitForApproval$1;
        java.lang.Object objKWHzl;
        kQF kqf;
        java.lang.String str3;
        AbstractActivityC33041mov abstractActivityC33041mov2;
        Function1<? super android.os.Bundle, Unit> function12;
        java.lang.String str4;
        java.lang.String str5;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        DexMultiTokenInfoBean dexMultiTokenInfoBean3;
        java.lang.String str6;
        Function1<? super android.os.Bundle, Unit> function13;
        java.lang.String str7;
        kQF kqf2;
        java.lang.String str8;
        AbstractActivityC33041mov abstractActivityC33041mov3;
        AbstractC43419rot abstractC43419rot;
        if (continuation instanceof AdvancedApprovalUseCase$submitForApproval$1) {
            advancedApprovalUseCase$submitForApproval$1 = (AdvancedApprovalUseCase$submitForApproval$1) continuation;
            int i = advancedApprovalUseCase$submitForApproval$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedApprovalUseCase$submitForApproval$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedApprovalUseCase$submitForApproval$1 = new AdvancedApprovalUseCase$submitForApproval$1(this, continuation);
            }
        }
        AdvancedApprovalUseCase$submitForApproval$1 advancedApprovalUseCase$submitForApproval$12 = advancedApprovalUseCase$submitForApproval$1;
        java.lang.Object obj = advancedApprovalUseCase$submitForApproval$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedApprovalUseCase$submitForApproval$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String str9 = advancedApproveState == AdvancedApproveState.CANCEL_APPROVE ? "1" : "0";
            C28196kSl c28196kSl = this.gEmmrt;
            java.lang.String chainId = dexMultiTokenInfoBean.getChainId();
            advancedApprovalUseCase$submitForApproval$12.L$0 = this;
            advancedApprovalUseCase$submitForApproval$12.L$1 = abstractActivityC33041mov;
            advancedApprovalUseCase$submitForApproval$12.L$2 = dexMultiTokenInfoBean;
            advancedApprovalUseCase$submitForApproval$12.L$3 = str;
            advancedApprovalUseCase$submitForApproval$12.L$4 = str2;
            advancedApprovalUseCase$submitForApproval$12.L$5 = function1;
            advancedApprovalUseCase$submitForApproval$12.L$6 = str9;
            advancedApprovalUseCase$submitForApproval$12.label = 1;
            objKWHzl = c28196kSl.KWHzl(chainId, advancedApprovalUseCase$submitForApproval$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            kqf = this;
            str3 = str9;
            abstractActivityC33041mov2 = abstractActivityC33041mov;
            function12 = function1;
            str4 = str;
            str5 = str2;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str10 = (java.lang.String) advancedApprovalUseCase$submitForApproval$12.L$6;
                java.lang.String str11 = (java.lang.String) advancedApprovalUseCase$submitForApproval$12.L$5;
                Function1<? super android.os.Bundle, Unit> function14 = (Function1) advancedApprovalUseCase$submitForApproval$12.L$4;
                java.lang.String str12 = (java.lang.String) advancedApprovalUseCase$submitForApproval$12.L$3;
                dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) advancedApprovalUseCase$submitForApproval$12.L$2;
                AbstractActivityC33041mov abstractActivityC33041mov4 = (AbstractActivityC33041mov) advancedApprovalUseCase$submitForApproval$12.L$1;
                kQF kqf3 = (kQF) advancedApprovalUseCase$submitForApproval$12.L$0;
                C56391yDq.AEQbTJ(obj);
                function13 = function14;
                str8 = str10;
                kqf2 = kqf3;
                str7 = str11;
                abstractActivityC33041mov3 = abstractActivityC33041mov4;
                str6 = str12;
                abstractC43419rot = (AbstractC43419rot) obj;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    kqf2.KWHzl(abstractActivityC33041mov3, (ApproveUnsignedData) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl(), str8, dexMultiTokenInfoBean3, str6, str7, function13);
                }
                return Unit.INSTANCE;
            }
            java.lang.String str13 = (java.lang.String) advancedApprovalUseCase$submitForApproval$12.L$6;
            Function1<? super android.os.Bundle, Unit> function15 = (Function1) advancedApprovalUseCase$submitForApproval$12.L$5;
            java.lang.String str14 = (java.lang.String) advancedApprovalUseCase$submitForApproval$12.L$4;
            java.lang.String str15 = (java.lang.String) advancedApprovalUseCase$submitForApproval$12.L$3;
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) advancedApprovalUseCase$submitForApproval$12.L$2;
            AbstractActivityC33041mov abstractActivityC33041mov5 = (AbstractActivityC33041mov) advancedApprovalUseCase$submitForApproval$12.L$1;
            kQF kqf4 = (kQF) advancedApprovalUseCase$submitForApproval$12.L$0;
            C56391yDq.AEQbTJ(obj);
            str3 = str13;
            function12 = function15;
            str4 = str15;
            kqf = kqf4;
            objKWHzl = obj;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean4;
            abstractActivityC33041mov2 = abstractActivityC33041mov5;
            str5 = str14;
        }
        java.lang.String str16 = (java.lang.String) objKWHzl;
        InterfaceC28146kQp interfaceC28146kQp = kqf.OLrzqt;
        java.lang.String chainId2 = dexMultiTokenInfoBean2.getChainId();
        java.lang.String tokenContractAddress = dexMultiTokenInfoBean2.getTokenContractAddress();
        advancedApprovalUseCase$submitForApproval$12.L$0 = kqf;
        advancedApprovalUseCase$submitForApproval$12.L$1 = abstractActivityC33041mov2;
        advancedApprovalUseCase$submitForApproval$12.L$2 = dexMultiTokenInfoBean2;
        advancedApprovalUseCase$submitForApproval$12.L$3 = str4;
        advancedApprovalUseCase$submitForApproval$12.L$4 = function12;
        advancedApprovalUseCase$submitForApproval$12.L$5 = str3;
        advancedApprovalUseCase$submitForApproval$12.L$6 = str16;
        advancedApprovalUseCase$submitForApproval$12.label = 2;
        java.lang.Object objCopydefault2 = interfaceC28146kQp.copydefault(chainId2, str16, tokenContractAddress, "", str3, str5, advancedApprovalUseCase$submitForApproval$12);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean2;
        str6 = str4;
        function13 = function12;
        str7 = str3;
        kqf2 = kqf;
        str8 = str16;
        abstractActivityC33041mov3 = abstractActivityC33041mov2;
        obj = objCopydefault2;
        abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.AhwBna, new AdvancedApprovalUseCase$verifyApproval$2(dexMultiTokenInfoBean, this, str2, str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final void KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, ApproveUnsignedData approveUnsignedData, java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, java.lang.String str2, java.lang.String str3, final Function1<? super android.os.Bundle, Unit> function1) {
        if (abstractActivityC33041mov == null) {
            return;
        }
        DappInteractionArgs dappInteractionArgsEZpvd = EZpvd(approveUnsignedData, dexMultiTokenInfoBean, str2);
        ((InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class)).AEQbTJ(abstractActivityC33041mov, dappInteractionArgsEZpvd, new Function1() { // from class: o.kQI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kQF.copydefault(function1, (android.os.Bundle) obj);
            }
        }, copydefault(str, dappInteractionArgsEZpvd.getOrderId(), dexMultiTokenInfoBean, str3));
    }

    public static final Unit copydefault(Function1 function1, android.os.Bundle bundle) {
        function1.invoke(bundle);
        return Unit.INSTANCE;
    }

    public final Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<java.lang.String>>> copydefault(@NotNull final java.lang.String str, final java.lang.String str2, @NotNull final DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new Function1() { // from class: o.kQG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kQF.KWHzl(this.AEQbTJ, str, str2, dexMultiTokenInfoBean, str3, (NewCallbackBean) obj);
            }
        };
    }

    public static final AbstractC58185ywX KWHzl(kQF kqf, java.lang.String str, java.lang.String str2, DexMultiTokenInfoBean dexMultiTokenInfoBean, java.lang.String str3, NewCallbackBean newCallbackBean) throws OKServerException {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        kotlin.Pair<JsonObject, java.lang.String> pairEZpvd = kqf.djBIcL.EZpvd(newCallbackBean.getBody());
        JsonObject jsonObjectComponent1 = pairEZpvd.component1();
        java.lang.String strComponent2 = pairEZpvd.component2();
        if (jsonObjectComponent1 == null || strComponent2.length() == 0) {
            throw new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null);
        }
        return kqf.EZpvd(newCallbackBean, str, str2, dexMultiTokenInfoBean, C56390yDp.OLrzqt(jsonObjectComponent1, strComponent2), str3);
    }

    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(@NotNull NewCallbackBean newCallbackBean, @NotNull java.lang.String str, java.lang.String str2, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull kotlin.Pair<JsonObject, java.lang.String> pair, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX<ResponseData<ApproveResultInfo>> abstractC58185ywXCopydefault = this.OLrzqt.copydefault(newCallbackBean.getHeaderMap(), new SwapApproveInfoReq(new ApproveDataParam(dexMultiTokenInfoBean.getChainId(), str, dexMultiTokenInfoBean.getTokenContractAddress(), (java.lang.String) null, (java.lang.String) null, 24, (DefaultConstructorMarker) null), new MultiApproveInfoParam(str2 == null ? "" : str2, dexMultiTokenInfoBean.getChainId(), pair.getSecond(), pair.getFirst(), str3)));
        final Function1 function1 = new Function1() { // from class: o.kQH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kQF.OLrzqt((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.kQJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return kQF.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        ResponseData responseData2 = new ResponseData(0, null, null, null, null, null, 63, null);
        int code = responseData.getCode();
        ApproveResultInfo approveResultInfo = (ApproveResultInfo) responseData.getData();
        return ResponseData.copy$default(responseData2, code, responseData.getMsg(), null, null, approveResultInfo != null ? approveResultInfo.getSaveApproveTxResult() : null, null, 44, null);
    }

    public final AdvancedApproveState EZpvd(@NotNull java.lang.String str, DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        java.lang.String status = deFiPlatformTokenApprovalInfo != null ? deFiPlatformTokenApprovalInfo.getStatus() : null;
        if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) ApproveStatus.UN_APPROVE.getType()) || Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) ApproveStatus.APPROVE_FAIL.getType())) {
            return AdvancedApproveState.NEED_APPROVE;
        }
        if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) ApproveStatus.CANCEL_APPROVING.getType())) {
            if (deFiPlatformTokenApprovalInfo.isApprovedAndNeedCancelApprove(str, dexMultiTokenInfoBean.getDecimals())) {
                return AdvancedApproveState.CANCEL_APPROVING;
            }
            return AdvancedApproveState.NEED_APPROVE;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) ApproveStatus.APPROVED.getType())) {
            return Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) ApproveStatus.APPROVING.getType()) ? AdvancedApproveState.APPROVING : AdvancedApproveState.NEED_APPROVE;
        }
        if (deFiPlatformTokenApprovalInfo.isApprovedAndNeedCancelApprove(str, dexMultiTokenInfoBean.getDecimals())) {
            return AdvancedApproveState.CANCEL_APPROVE;
        }
        if (C23313hvq.valueOf(deFiPlatformTokenApprovalInfo.getAmount(), 0)) {
            return AdvancedApproveState.NEED_APPROVE;
        }
        if (Intrinsics.EZpvd((java.lang.Object) deFiPlatformTokenApprovalInfo.getAmount(), (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
            return AdvancedApproveState.APPROVED;
        }
        if (C23313hvq.OLrzqt(str, copydefault(deFiPlatformTokenApprovalInfo.getAmount(), dexMultiTokenInfoBean.getDecimals()))) {
            return AdvancedApproveState.NEED_APPROVE;
        }
        return AdvancedApproveState.APPROVED;
    }

    public final DappInteractionArgs EZpvd(@NotNull ApproveUnsignedData approveUnsignedData, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, java.lang.String str) {
        Intrinsics.checkNotNullParameter(approveUnsignedData, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        DefiChainInfo defiChainInfoEZpvd = this.AYXKKw.EZpvd(dexMultiTokenInfoBean.getChainId());
        return new DappInteractionArgs(this.gEmmrt.copydefault(), null, dexMultiTokenInfoBean.getChainId(), new PlatformItem(0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16383, (DefaultConstructorMarker) null), ApproveUnsignedData.getSignDataJson$default(approveUnsignedData, defiChainInfoEZpvd != null ? defiChainInfoEZpvd.isEvm() : true, null, 2, null), null, "dex", 3, null, null, approveUnsignedData.getDexContractAddress(), str, false, true, approveUnsignedData.getId(), true, null, null, null, null, null, null, null, null, DappInteractionArgs.Companion.ShowStyle.NORMAL, null, 1, null, null, null, null, null, -83950846, null);
    }

    public final void copydefault() {
        this.valueOf.KWHzl();
    }

    public final void AEQbTJ() {
        this.valueOf.copydefault();
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return ((InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class)).EZpvd(str, C33129mqd.AhwBna(str2));
    }
}
