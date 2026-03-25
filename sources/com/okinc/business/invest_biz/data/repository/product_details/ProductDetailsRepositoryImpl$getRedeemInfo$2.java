package com.okinc.business.invest_biz.data.repository.product_details;

import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemInitialReq;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC58185ywX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.InterfaceC9738bbJ;
import o.iBL;
import o.iEP;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsRepositoryImpl$getRedeemInfo$2 extends SuspendLambda implements Function1<Continuation<? super InvestRedeemInitialInfo>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ long $investmentId;
    final /* synthetic */ InvestmentKind $investmentKind;
    final /* synthetic */ boolean $payWithSingleToken;
    Object L$0;
    int label;
    final /* synthetic */ iEP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsRepositoryImpl$getRedeemInfo$2(iEP iep, long j, long j2, boolean z, InvestmentKind investmentKind, Continuation<? super ProductDetailsRepositoryImpl$getRedeemInfo$2> continuation) {
        super(1, continuation);
        this.this$0 = iep;
        this.$chainId = j;
        this.$investmentId = j2;
        this.$payWithSingleToken = z;
        this.$investmentKind = investmentKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ProductDetailsRepositoryImpl$getRedeemInfo$2(this.this$0, this.$chainId, this.$investmentId, this.$payWithSingleToken, this.$investmentKind, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InvestRedeemInitialInfo> continuation) {
        return ((ProductDetailsRepositoryImpl$getRedeemInfo$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestRedeemInitialReq investRedeemInitialReq;
        Object objEZpvd;
        Object objAwaitFirst;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = this.this$0.AEQbTJ.OLrzqt();
            Intrinsics.copydefault(interfaceC9738bbJOLrzqt);
            String strEZpvd = interfaceC9738bbJOLrzqt.EZpvd(this.$chainId);
            investRedeemInitialReq = new InvestRedeemInitialReq(this.$investmentId, strEZpvd, "", this.$payWithSingleToken, this.$investmentKind.getValue(), (Integer) null, this.$chainId == 0 ? interfaceC9738bbJOLrzqt.EZpvd(strEZpvd) : null, (String) null, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, (DefaultConstructorMarker) null);
            iEP iep = this.this$0;
            this.L$0 = investRedeemInitialReq;
            this.label = 1;
            objEZpvd = iep.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAwaitFirst = obj;
                Intrinsics.checkNotNullExpressionValue(objAwaitFirst, "");
                Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objAwaitFirst, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default);
                return objUnwrapResponseData$default;
            }
            investRedeemInitialReq = (InvestRedeemInitialReq) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        }
        AbstractC58185ywX<ResponseData<InvestRedeemInitialInfo>> abstractC58185ywXOLrzqt = ((InterfaceC25472ixP) objEZpvd).OLrzqt(investRedeemInitialReq);
        this.L$0 = null;
        this.label = 2;
        objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXOLrzqt, this);
        if (objAwaitFirst == objCopydefault) {
            return objCopydefault;
        }
        Intrinsics.checkNotNullExpressionValue(objAwaitFirst, "");
        Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objAwaitFirst, null, 1, null);
        Intrinsics.copydefault(objUnwrapResponseData$default2);
        return objUnwrapResponseData$default2;
    }
}
