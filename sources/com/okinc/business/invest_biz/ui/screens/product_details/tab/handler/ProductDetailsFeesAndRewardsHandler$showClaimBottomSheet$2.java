package com.okinc.business.invest_biz.ui.screens.product_details.tab.handler;

import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25477ixU;
import o.C26534jeD;
import o.C26566jej;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25524iyO;
import o.InterfaceC26557jea;
import o.InterfaceC54855xXv;
import o.InterfaceC9738bbJ;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsFeesAndRewardsHandler$showClaimBottomSheet$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InvestAction $action;
    final /* synthetic */ C25477ixU $batchClaimParam;
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ ProductDetailsByChain $chainDetails;
    final /* synthetic */ List<InvestUserRewardElementInfo> $claimingTokens;
    final /* synthetic */ boolean $isCollectFees;
    final /* synthetic */ Continuation<Unit> $onComplete;
    final /* synthetic */ Function0<Unit> $onCompleted;
    final /* synthetic */ Function0<Unit> $onRefresh;
    Object L$0;
    int label;
    final /* synthetic */ C26566jej this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.coroutines.Continuation<? super kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductDetailsFeesAndRewardsHandler$showClaimBottomSheet$2(C26566jej c26566jej, ProductDetailsByChain productDetailsByChain, Continuation<? super Unit> continuation, InvestAction investAction, List<InvestUserRewardElementInfo> list, C25477ixU c25477ixU, Function0<Unit> function0, boolean z, Function0<Unit> function02, Function0<Unit> function03, Continuation<? super ProductDetailsFeesAndRewardsHandler$showClaimBottomSheet$2> continuation2) {
        super(2, continuation2);
        this.this$0 = c26566jej;
        this.$chainDetails = productDetailsByChain;
        this.$onComplete = continuation;
        this.$action = investAction;
        this.$claimingTokens = list;
        this.$batchClaimParam = c25477ixU;
        this.$callback = function0;
        this.$isCollectFees = z;
        this.$onCompleted = function02;
        this.$onRefresh = function03;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProductDetailsFeesAndRewardsHandler$showClaimBottomSheet$2(this.this$0, this.$chainDetails, this.$onComplete, this.$action, this.$claimingTokens, this.$batchClaimParam, this.$callback, this.$isCollectFees, this.$onCompleted, this.$onRefresh, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProductDetailsFeesAndRewardsHandler$showClaimBottomSheet$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25524iyO interfaceC25524iyO = this.this$0.gEmmrt;
            ProductDetailsByChain productDetailsByChain = this.$chainDetails;
            this.label = 1;
            objKWHzl = interfaceC25524iyO.KWHzl(productDetailsByChain, true, (Continuation<? super Result<? extends InterfaceC26557jea>>) this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj2;
                Continuation<Unit> continuation = this.$onComplete;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.KWHzl(thM7380exceptionOrNullimpl);
                    Result.Application application = Result.Companion;
                    continuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        Continuation<Unit> continuation2 = this.$onComplete;
        C26566jej c26566jej = this.this$0;
        InvestAction investAction = this.$action;
        List<InvestUserRewardElementInfo> list = this.$claimingTokens;
        C25477ixU c25477ixU = this.$batchClaimParam;
        Function0<Unit> function0 = this.$callback;
        ProductDetailsByChain productDetailsByChain2 = this.$chainDetails;
        boolean z = this.$isCollectFees;
        Function0<Unit> function02 = this.$onCompleted;
        Function0<Unit> function03 = this.$onRefresh;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            InterfaceC26557jea interfaceC26557jea = (InterfaceC26557jea) objKWHzl;
            Result.Application application2 = Result.Companion;
            continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            if (interfaceC26557jea instanceof InterfaceC26557jea.StateListAnimator) {
                this.L$0 = objKWHzl;
                this.label = 2;
                if (c26566jej.OLrzqt(investAction, list, c25477ixU, function0, productDetailsByChain2, z, function02, this) == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objKWHzl;
                objKWHzl = obj2;
            } else {
                C26534jeD c26534jeD = c26566jej.OLrzqt;
                if (c26534jeD != null) {
                    c26534jeD.copydefault(interfaceC26557jea, new TaskDescription(function03));
                }
            }
        }
        Continuation<Unit> continuation3 = this.$onComplete;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements InterfaceC54855xXv {
        public final /* synthetic */ Function0<Unit> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault() {
        }

        public TaskDescription(Function0<Unit> function0) {
            this.EZpvd = function0;
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ);
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, j);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            Function0<Unit> function0 = this.EZpvd;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }
}
