package com.okinc.business.invest_biz.ui.screens.univ3;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeInputToken;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeReceiveReq;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C56391yDq;
import o.C56402yEa;
import o.C56441yFm;
import o.C56442yFn;
import o.C56443yFo;
import o.C56447yFs;

/* JADX INFO: loaded from: classes18.dex */
public final class InvestUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InvestUniv3SubscribeReceiveInfo>, Object> {
    final /* synthetic */ String $inputAmountFirst;
    final /* synthetic */ String $inputAmountSecond;
    final /* synthetic */ InvestTokenWithAmount $inputTokenFirst;
    final /* synthetic */ InvestTokenWithAmount $inputTokenSecond;
    final /* synthetic */ boolean $isSingle;
    final /* synthetic */ boolean $showAprLoading;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;
    final /* synthetic */ InvestUniv3SubscribeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2(boolean z, String str, InvestTokenWithAmount investTokenWithAmount, String str2, InvestTokenWithAmount investTokenWithAmount2, InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, boolean z2, Continuation<? super InvestUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2> continuation) {
        super(2, continuation);
        this.$isSingle = z;
        this.$inputAmountFirst = str;
        this.$inputTokenFirst = investTokenWithAmount;
        this.$inputAmountSecond = str2;
        this.$inputTokenSecond = investTokenWithAmount2;
        this.this$0 = investUniv3SubscribeViewModel;
        this.$showAprLoading = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2(this.$isSingle, this.$inputAmountFirst, this.$inputTokenFirst, this.$inputAmountSecond, this.$inputTokenSecond, this.this$0, this.$showAprLoading, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InvestUniv3SubscribeReceiveInfo> continuation) {
        return ((InvestUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2 investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$isSingle && invokeSuspend$invalidInput(this.$inputAmountFirst, this.$inputTokenFirst)) {
                return null;
            }
            if (!this.$isSingle && (invokeSuspend$invalidInput(this.$inputAmountFirst, this.$inputTokenFirst) || invokeSuspend$invalidInput(this.$inputAmountSecond, this.$inputTokenSecond))) {
                return null;
            }
            int iKWHzl = (this.this$0.getPostValueLengthLimit() ? this.this$0.AxsJAY() : this.this$0.AxsJAYaxsJAY()).KWHzl();
            int iKWHzl2 = (this.this$0.getPostValueLengthLimit() ? this.this$0.AxsJAYaxsJAY() : this.this$0.AxsJAY()).KWHzl();
            String str = this.this$0.hBpjJd;
            String str2 = this.$inputAmountFirst;
            String tokenAddress = this.$inputTokenFirst.getTokenAddress();
            long j = this.this$0.gHZMYf;
            Boolean boolKWHzl = C56443yFo.KWHzl(this.$isSingle);
            String tokenId = this.$inputTokenFirst.getTokenId();
            String tokenPrecision = this.$inputTokenFirst.getTokenPrecision();
            String strAccept = this.this$0.accept();
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            String str3 = this.$inputAmountFirst;
            InvestTokenWithAmount investTokenWithAmount = this.$inputTokenFirst;
            boolean z = this.$isSingle;
            String str4 = this.$inputAmountSecond;
            InvestTokenWithAmount investTokenWithAmount2 = this.$inputTokenSecond;
            List listOLrzqt = C56402yEa.OLrzqt();
            listOLrzqt.add(invokeSuspend$traToken(str3, investTokenWithAmount));
            if (!z) {
                Intrinsics.copydefault(investTokenWithAmount2);
                listOLrzqt.add(invokeSuspend$traToken(str4, investTokenWithAmount2));
            }
            Unit unit = Unit.INSTANCE;
            InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq = new InvestUniv3SubscribeReceiveReq(str, str2, tokenAddress, j, boolKWHzl, iKWHzl, iKWHzl2, tokenId, tokenPrecision, strAccept, (String) null, boolKWHzl2, C56402yEa.fARcdN(listOLrzqt), 1024, (DefaultConstructorMarker) null);
            investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2 = this;
            if (investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.$showAprLoading) {
                investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.this$0.aKErDB().setValue(C56443yFo.KWHzl(true));
            }
            Ref.IntRef intRef = new Ref.IntRef();
            InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel = investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.this$0;
            boolean z2 = investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.$isSingle;
            String str5 = investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.$inputAmountFirst;
            InvestTokenWithAmount investTokenWithAmount3 = investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.$inputTokenFirst;
            InvestTokenWithAmount investTokenWithAmount4 = investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.$inputTokenSecond;
            String str6 = investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.$inputAmountSecond;
            investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.L$0 = investUniv3SubscribeReceiveReq;
            investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.L$1 = intRef;
            investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.L$2 = investUniv3SubscribeViewModel;
            investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.L$3 = str5;
            investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.L$4 = investTokenWithAmount3;
            investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.L$5 = investTokenWithAmount4;
            investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.L$6 = str6;
            investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.Z$0 = z2;
            investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
            cancellableContinuationImpl.initCancellability();
            investUniv3SubscribeViewModel.iRxXKY.getReceiveInfo(investUniv3SubscribeReceiveReq, new ActionBar(investUniv3SubscribeViewModel), new TaskDescription(intRef, investUniv3SubscribeViewModel, cancellableContinuationImpl, z2, str5, investTokenWithAmount3, investTokenWithAmount4, str6));
            Object result = cancellableContinuationImpl.getResult();
            if (result == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
            if (result == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2 = this;
        }
        return investUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2.this$0.isConnected();
    }

    private static final boolean invokeSuspend$invalidInput(String str, InvestTokenWithAmount investTokenWithAmount) {
        return str == null || str.length() == 0 || C33129mqd.OLrzqt((Object) str, (Object) 0) || investTokenWithAmount == null;
    }

    private static final InvestUniv3SubscribeInputToken invokeSuspend$traToken(String str, InvestTokenWithAmount investTokenWithAmount) {
        return new InvestUniv3SubscribeInputToken(str, investTokenWithAmount.getTokenAddress(), investTokenWithAmount.getTokenPrecision());
    }

    public static final class TaskDescription implements Function2<ResponseState, Pair<? extends InvestGasPriceConfig, ? extends InvestUniv3SubscribeReceiveInfo>, Unit> {
        public final /* synthetic */ String AEQbTJ;
        public final /* synthetic */ boolean AYXKKw;
        public final /* synthetic */ Ref.IntRef AhwBna;
        public final /* synthetic */ InvestTokenWithAmount EZpvd;
        public final /* synthetic */ String KWHzl;
        public final /* synthetic */ InvestTokenWithAmount OLrzqt;
        public final /* synthetic */ CancellableContinuation<Unit> copydefault;
        public final /* synthetic */ InvestUniv3SubscribeViewModel valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Ref.IntRef intRef, InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, CancellableContinuation<? super Unit> cancellableContinuation, boolean z, String str, InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, String str2) {
            this.AhwBna = intRef;
            this.valueOf = investUniv3SubscribeViewModel;
            this.copydefault = cancellableContinuation;
            this.AYXKKw = z;
            this.KWHzl = str;
            this.OLrzqt = investTokenWithAmount;
            this.EZpvd = investTokenWithAmount2;
            this.AEQbTJ = str2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(ResponseState responseState, Pair<? extends InvestGasPriceConfig, ? extends InvestUniv3SubscribeReceiveInfo> pair) {
            EZpvd(responseState, pair);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: com.okinc.business.invest_biz.data.models.InvestTokenWithAmount */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void EZpvd(ResponseState responseState, Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo> pair) {
            InvestUniv3SubscribeReceiveInfo second;
            Object next;
            String str;
            InvestTokenWithAmount investTokenWithAmount;
            InvestTokenWithAmount investTokenWithAmountCopy;
            Object next2;
            InvestTokenWithAmount investTokenWithAmountCopy2;
            Intrinsics.checkNotNullParameter(responseState, "");
            if (pair != null && (second = pair.getSecond()) != null) {
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel = this.valueOf;
                boolean z = this.AYXKKw;
                String str2 = this.KWHzl;
                InvestTokenWithAmount investTokenWithAmount2 = this.OLrzqt;
                InvestTokenWithAmount investTokenWithAmount3 = this.EZpvd;
                String str3 = this.AEQbTJ;
                investUniv3SubscribeViewModel.OLrzqt(second);
                if (z) {
                    investUniv3SubscribeViewModel.OLrzqt(responseState);
                    investUniv3SubscribeViewModel.AEQbTJ(pair);
                    investUniv3SubscribeViewModel.KWHzl(second);
                } else {
                    investUniv3SubscribeViewModel.AEQbTJ(responseState);
                    investUniv3SubscribeViewModel.copydefault(pair);
                    investUniv3SubscribeViewModel.EZpvd(second);
                }
                Object objCopy = null;
                if (z) {
                    Iterator<T> it = second.getInvestWithTokenList().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next3 = it.next();
                        if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next3).getTokenAddress(), (Object) investTokenWithAmount2.getTokenAddress())) {
                            objCopy = next3;
                            break;
                        }
                    }
                    InvestTokenWithAmount investTokenWithAmount4 = (InvestTokenWithAmount) objCopy;
                    if (investTokenWithAmount4 != null) {
                        investTokenWithAmountCopy2 = investTokenWithAmount4.copy((268435455 & 1) != 0 ? investTokenWithAmount4.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount4.coinAmount : str2, (268435455 & 4) != 0 ? investTokenWithAmount4.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount4.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount4.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount4.network : null, (268435455 & 64) != 0 ? investTokenWithAmount4.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount4.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount4.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount4.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount4.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount4.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount4.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount4.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount4.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount4.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount4.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount4.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount4.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount4.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount4.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount4.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount4.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount4.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount4.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount4.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount4.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount4.tokenPrice : null);
                    } else {
                        investTokenWithAmountCopy2 = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : str2, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null);
                    }
                    investUniv3SubscribeViewModel.OLrzqt(investTokenWithAmountCopy2);
                } else {
                    Iterator<T> it2 = second.getInvestWithTokenList().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next).getTokenAddress(), (Object) investTokenWithAmount2.getTokenAddress())) {
                                break;
                            }
                        }
                    }
                    InvestTokenWithAmount investTokenWithAmount5 = (InvestTokenWithAmount) next;
                    if (investTokenWithAmount5 != null) {
                        str = str3;
                        investTokenWithAmount = investTokenWithAmount3;
                        investTokenWithAmountCopy = investTokenWithAmount5.copy((268435455 & 1) != 0 ? investTokenWithAmount5.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount5.coinAmount : str2, (268435455 & 4) != 0 ? investTokenWithAmount5.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount5.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount5.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount5.network : null, (268435455 & 64) != 0 ? investTokenWithAmount5.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount5.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount5.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount5.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount5.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount5.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount5.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount5.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount5.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount5.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount5.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount5.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount5.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount5.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount5.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount5.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount5.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount5.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount5.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount5.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount5.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount5.tokenPrice : null);
                    } else {
                        str = str3;
                        investTokenWithAmount = investTokenWithAmount3;
                        investTokenWithAmountCopy = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : str2, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null);
                    }
                    investUniv3SubscribeViewModel.OLrzqt(investTokenWithAmountCopy);
                    Iterator<T> it3 = second.getInvestWithTokenList().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it3.next();
                            if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next2).getTokenAddress(), (Object) (investTokenWithAmount != null ? investTokenWithAmount.getTokenAddress() : null))) {
                                break;
                            }
                        }
                    }
                    InvestTokenWithAmount investTokenWithAmount6 = (InvestTokenWithAmount) next2;
                    if (investTokenWithAmount6 != null && investTokenWithAmount != null) {
                        objCopy = investTokenWithAmount6.copy((268435455 & 1) != 0 ? investTokenWithAmount6.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount6.coinAmount : str, (268435455 & 4) != 0 ? investTokenWithAmount6.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount6.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount6.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount6.network : null, (268435455 & 64) != 0 ? investTokenWithAmount6.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount6.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount6.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount6.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount6.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount6.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount6.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount6.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount6.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount6.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount6.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount6.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount6.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount6.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount6.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount6.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount6.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount6.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount6.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount6.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount6.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount6.tokenPrice : null);
                    } else if (investTokenWithAmount != null) {
                        InvestTokenWithAmount investTokenWithAmount7 = investTokenWithAmount;
                        objCopy = investTokenWithAmount7.copy((268435455 & 1) != 0 ? investTokenWithAmount7.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount7.coinAmount : str, (268435455 & 4) != 0 ? investTokenWithAmount7.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount7.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount7.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount7.network : null, (268435455 & 64) != 0 ? investTokenWithAmount7.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount7.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount7.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount7.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount7.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount7.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount7.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount7.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount7.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount7.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount7.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount7.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount7.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount7.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount7.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount7.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount7.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount7.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount7.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount7.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount7.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount7.tokenPrice : null);
                    }
                    investUniv3SubscribeViewModel.KWHzl((InvestTokenWithAmount) objCopy);
                }
            }
            this.AhwBna.element = this.valueOf.OLrzqt(responseState, (Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>) pair, (Continuation<? super Unit>) this.copydefault);
        }
    }

    public static final class ActionBar implements Function1<InvestGasPriceConfig, String> {
        public final /* synthetic */ InvestUniv3SubscribeViewModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel) {
            this.copydefault = investUniv3SubscribeViewModel;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final String invoke(InvestGasPriceConfig investGasPriceConfig) {
            Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
            return (String) this.copydefault.OLrzqt(investGasPriceConfig).getFirst();
        }
    }
}
