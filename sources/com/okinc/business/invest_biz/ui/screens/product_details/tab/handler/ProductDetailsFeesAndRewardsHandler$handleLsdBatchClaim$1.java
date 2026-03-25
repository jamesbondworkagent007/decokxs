package com.okinc.business.invest_biz.ui.screens.product_details.tab.handler;

import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserUnClaimTokenInfo;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.handler.ProductDetailsFeesAndRewardsHandler$handleLsdBatchClaim$1;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C25477ixU;
import o.C26566jej;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25524iyO;
import o.iTK;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsFeesAndRewardsHandler$handleLsdBatchClaim$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InvestAction $action;
    final /* synthetic */ ProductDetailsByChain $chainDetails;
    final /* synthetic */ boolean $isCollectFees;
    final /* synthetic */ Continuation<Unit> $onComplete;
    final /* synthetic */ Function0<Unit> $onCompleted;
    final /* synthetic */ Function0<Unit> $onRefresh;
    final /* synthetic */ InvestUserRewardElementInfo $tokenInfo;
    int label;
    final /* synthetic */ C26566jej this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.coroutines.Continuation<? super kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductDetailsFeesAndRewardsHandler$handleLsdBatchClaim$1(C26566jej c26566jej, ProductDetailsByChain productDetailsByChain, InvestAction investAction, InvestUserRewardElementInfo investUserRewardElementInfo, Continuation<? super Unit> continuation, boolean z, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super ProductDetailsFeesAndRewardsHandler$handleLsdBatchClaim$1> continuation2) {
        super(2, continuation2);
        this.this$0 = c26566jej;
        this.$chainDetails = productDetailsByChain;
        this.$action = investAction;
        this.$tokenInfo = investUserRewardElementInfo;
        this.$onComplete = continuation;
        this.$isCollectFees = z;
        this.$onRefresh = function0;
        this.$onCompleted = function02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProductDetailsFeesAndRewardsHandler$handleLsdBatchClaim$1(this.this$0, this.$chainDetails, this.$action, this.$tokenInfo, this.$onComplete, this.$isCollectFees, this.$onRefresh, this.$onCompleted, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProductDetailsFeesAndRewardsHandler$handleLsdBatchClaim$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, androidx.fragment.app.DialogFragment, o.iTK] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        String callDataExtJson;
        Integer callDataRewardType;
        String claimIndex;
        Integer callDataRewardType2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25524iyO interfaceC25524iyO = this.this$0.gEmmrt;
            long jOLrzqt = this.$chainDetails.OLrzqt();
            long jOLrzqt2 = this.$chainDetails.AEQbTJ().OLrzqt();
            this.label = 1;
            objKWHzl = interfaceC25524iyO.KWHzl(jOLrzqt, jOLrzqt2, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        final ProductDetailsByChain productDetailsByChain = this.$chainDetails;
        final C26566jej c26566jej = this.this$0;
        final InvestAction investAction = this.$action;
        final InvestUserRewardElementInfo investUserRewardElementInfo = this.$tokenInfo;
        final Continuation<Unit> continuation = this.$onComplete;
        final boolean z = this.$isCollectFees;
        final Function0<Unit> function0 = this.$onRefresh;
        final Function0<Unit> function02 = this.$onCompleted;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            InvestUserClaimInfoResponse investUserClaimInfoResponse = (InvestUserClaimInfoResponse) objKWHzl;
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            iTK.Application application = new iTK.Application() { // from class: o.jen
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.iTK.Application
                public final void EZpvd(C25477ixU c25477ixU) {
                    ProductDetailsFeesAndRewardsHandler$handleLsdBatchClaim$1.invokeSuspend$lambda$5$lambda$1(c26566jej, investAction, investUserRewardElementInfo, continuation, productDetailsByChain, z, function0, function02, objectRef, c25477ixU);
                }
            };
            List<InvestUserUnClaimTokenInfo> rewardTokenInfos = investUserClaimInfoResponse.getRewardTokenInfos();
            if (rewardTokenInfos != null && !rewardTokenInfos.isEmpty()) {
                InvestUserUnClaimTokenInfo investUserUnClaimTokenInfo = (InvestUserUnClaimTokenInfo) CollectionsKt___CollectionsKt.zuBGHE(rewardTokenInfos);
                List listEZpvd = null;
                if (!Intrinsics.EZpvd(investUserClaimInfoResponse.getCanClaimAll(), C56443yFo.KWHzl(true))) {
                    if ((investUserUnClaimTokenInfo != null ? investUserUnClaimTokenInfo.getCallDataRewardType() : null) == null || ((callDataRewardType2 = investUserUnClaimTokenInfo.getCallDataRewardType()) != null && callDataRewardType2.intValue() == 3)) {
                        ?? Copydefault = iTK.Companion.copydefault(investUserClaimInfoResponse, productDetailsByChain.OLrzqt(), 2, productDetailsByChain.AEQbTJ().OLrzqt(), application);
                        Copydefault.show(c26566jej.KWHzl.getParentFragmentManager(), "InvestBatchClaimDialog");
                        objectRef.element = Copydefault;
                    }
                } else {
                    List listEZpvd2 = (investUserUnClaimTokenInfo == null || (claimIndex = investUserUnClaimTokenInfo.getClaimIndex()) == null) ? null : C56402yEa.EZpvd(claimIndex);
                    Integer numAEQbTJ = C56443yFo.AEQbTJ((investUserUnClaimTokenInfo == null || (callDataRewardType = investUserUnClaimTokenInfo.getCallDataRewardType()) == null || callDataRewardType.intValue() != 2) ? 0 : 1);
                    if (investUserUnClaimTokenInfo != null && (callDataExtJson = investUserUnClaimTokenInfo.getCallDataExtJson()) != null) {
                        listEZpvd = C56402yEa.EZpvd(callDataExtJson);
                    }
                    application.EZpvd(new C25477ixU(listEZpvd2, numAEQbTJ, listEZpvd, null, 8, null));
                }
            }
        }
        Continuation<Unit> continuation2 = this.$onComplete;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
            Result.Application application2 = Result.Companion;
            continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$5$lambda$1(C26566jej c26566jej, InvestAction investAction, InvestUserRewardElementInfo investUserRewardElementInfo, Continuation continuation, ProductDetailsByChain productDetailsByChain, boolean z, Function0 function0, Function0 function02, final Ref.ObjectRef objectRef, C25477ixU c25477ixU) {
        c26566jej.EZpvd(investAction, C56402yEa.EZpvd(investUserRewardElementInfo), c25477ixU, continuation, productDetailsByChain, z, new Function0() { // from class: o.jel
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ProductDetailsFeesAndRewardsHandler$handleLsdBatchClaim$1.invokeSuspend$lambda$5$lambda$1$lambda$0(objectRef);
            }
        }, function0, function02);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invokeSuspend$lambda$5$lambda$1$lambda$0(Ref.ObjectRef objectRef) {
        iTK itk = (iTK) objectRef.element;
        if (itk != null) {
            itk.dismiss();
        }
        return Unit.INSTANCE;
    }
}
