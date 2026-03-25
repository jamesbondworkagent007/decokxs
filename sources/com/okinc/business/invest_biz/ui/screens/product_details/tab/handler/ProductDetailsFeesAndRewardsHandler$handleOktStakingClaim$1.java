package com.okinc.business.invest_biz.ui.screens.product_details.tab.handler;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.handler.ProductDetailsFeesAndRewardsHandler$handleOktStakingClaim$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C26566jej;
import o.C27569jxf;
import o.C52761wXj;
import o.C55328xhq;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC25524iyO;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsFeesAndRewardsHandler$handleOktStakingClaim$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InvestAction $action;
    final /* synthetic */ ProductDetailsByChain $chainDetails;
    final /* synthetic */ boolean $isCollectFees;
    final /* synthetic */ Continuation<Unit> $onComplete;
    final /* synthetic */ Function0<Unit> $onCompleted;
    final /* synthetic */ Function0<Unit> $onRefresh;
    final /* synthetic */ String $tokenSymbol;
    int label;
    final /* synthetic */ C26566jej this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.coroutines.Continuation<? super kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductDetailsFeesAndRewardsHandler$handleOktStakingClaim$1(C26566jej c26566jej, ProductDetailsByChain productDetailsByChain, InvestAction investAction, Continuation<? super Unit> continuation, boolean z, Function0<Unit> function0, Function0<Unit> function02, String str, Continuation<? super ProductDetailsFeesAndRewardsHandler$handleOktStakingClaim$1> continuation2) {
        super(2, continuation2);
        this.this$0 = c26566jej;
        this.$chainDetails = productDetailsByChain;
        this.$action = investAction;
        this.$onComplete = continuation;
        this.$isCollectFees = z;
        this.$onRefresh = function0;
        this.$onCompleted = function02;
        this.$tokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProductDetailsFeesAndRewardsHandler$handleOktStakingClaim$1(this.this$0, this.$chainDetails, this.$action, this.$onComplete, this.$isCollectFees, this.$onRefresh, this.$onCompleted, this.$tokenSymbol, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProductDetailsFeesAndRewardsHandler$handleOktStakingClaim$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25524iyO interfaceC25524iyO = this.this$0.gEmmrt;
            long jOLrzqt = this.$chainDetails.AEQbTJ().OLrzqt();
            this.label = 1;
            Object objOLrzqt = interfaceC25524iyO.OLrzqt(jOLrzqt, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objOLrzqt;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        final C26566jej c26566jej = this.this$0;
        final InvestAction investAction = this.$action;
        final Continuation<Unit> continuation = this.$onComplete;
        final ProductDetailsByChain productDetailsByChain = this.$chainDetails;
        final boolean z = this.$isCollectFees;
        final Function0<Unit> function0 = this.$onRefresh;
        final Function0<Unit> function02 = this.$onCompleted;
        String str = this.$tokenSymbol;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            InvestStOktDrawDetailResponse investStOktDrawDetailResponse = (InvestStOktDrawDetailResponse) objM7386unboximpl;
            if (!investStOktDrawDetailResponse.getStOktDrawDetailList().isEmpty() || investStOktDrawDetailResponse.getRewardElementInfo() == null) {
                Context contextDjBIcL = c26566jej.djBIcL();
                if (contextDjBIcL != null) {
                    C27569jxf.OLrzqt.EZpvd(contextDjBIcL, investStOktDrawDetailResponse, str, new Function1() { // from class: o.jer
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return ProductDetailsFeesAndRewardsHandler$handleOktStakingClaim$1.invokeSuspend$lambda$1$lambda$0(c26566jej, investAction, continuation, productDetailsByChain, z, function0, function02, (InvestUserRewardElementInfo) obj2);
                        }
                    });
                }
            } else {
                C26566jej.showClaimBottomSheet$default(c26566jej, investAction, C56402yEa.EZpvd(investStOktDrawDetailResponse.getRewardElementInfo()), null, continuation, productDetailsByChain, z, null, function0, function02, 68, null);
            }
        }
        C26566jej c26566jej2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
            Context contextDjBIcL2 = c26566jej2.djBIcL();
            if (contextDjBIcL2 != null) {
                C55328xhq.show$default(C55328xhq.OLrzqt, thM7380exceptionOrNullimpl.getMessage(), ContextCompat.getDrawable(contextDjBIcL2, C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(C26566jej c26566jej, InvestAction investAction, Continuation continuation, ProductDetailsByChain productDetailsByChain, boolean z, Function0 function0, Function0 function02, InvestUserRewardElementInfo investUserRewardElementInfo) {
        C26566jej.showClaimBottomSheet$default(c26566jej, investAction, C56402yEa.EZpvd(investUserRewardElementInfo), null, continuation, productDetailsByChain, z, null, function0, function02, 68, null);
        return Unit.INSTANCE;
    }
}
