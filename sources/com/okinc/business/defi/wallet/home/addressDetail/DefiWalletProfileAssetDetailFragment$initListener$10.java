package com.okinc.business.defi.wallet.home.addressDetail;

import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$10;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.AbstractC16600emw;
import o.C14706dqX;
import o.C56391yDq;
import o.C56442yFn;
import o.eVR;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletProfileAssetDetailFragment$initListener$10 extends SuspendLambda implements Function2<Result<? extends WalletPnlAnalysisResponse>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ eVR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletProfileAssetDetailFragment$initListener$10(eVR evr, Continuation<? super DefiWalletProfileAssetDetailFragment$initListener$10> continuation) {
        super(2, continuation);
        this.this$0 = evr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefiWalletProfileAssetDetailFragment$initListener$10 defiWalletProfileAssetDetailFragment$initListener$10 = new DefiWalletProfileAssetDetailFragment$initListener$10(this.this$0, continuation);
        defiWalletProfileAssetDetailFragment$initListener$10.L$0 = obj;
        return defiWalletProfileAssetDetailFragment$initListener$10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Result<? extends WalletPnlAnalysisResponse> result, Continuation<? super Unit> continuation) {
        return invoke(result.m7386unboximpl(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((DefiWalletProfileAssetDetailFragment$initListener$10) create(Result.m7376boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C14706dqX c14706dqX;
        C14706dqX c14706dqX2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final Object objM7386unboximpl = ((Result) this.L$0).m7386unboximpl();
            AbstractC16600emw abstractC16600emw = this.this$0.fetchVPNInfo;
            if (abstractC16600emw != null && (c14706dqX2 = abstractC16600emw.uzCIH) != null) {
                c14706dqX2.setData((WalletPnlAnalysisResponse) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl), Result.m7384isSuccessimpl(objM7386unboximpl) ? 3 : 2, false);
            }
            AbstractC16600emw abstractC16600emw2 = this.this$0.fetchVPNInfo;
            if (abstractC16600emw2 != null && (c14706dqX = abstractC16600emw2.uzCIH) != null) {
                final eVR evr = this.this$0;
                c14706dqX.setOnChartShareClickListener(new Function0() { // from class: o.eWp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return DefiWalletProfileAssetDetailFragment$initListener$10.invokeSuspend$lambda$0(evr, objM7386unboximpl);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(eVR evr, Object obj) {
        if (Result.m7383isFailureimpl(obj)) {
            obj = null;
        }
        evr.copydefault((WalletPnlAnalysisResponse) obj);
        return Unit.INSTANCE;
    }
}
