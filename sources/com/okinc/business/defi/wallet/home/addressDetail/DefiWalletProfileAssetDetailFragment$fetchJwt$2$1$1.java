package com.okinc.business.defi.wallet.home.addressDetail;

import android.os.Bundle;
import com.okinc.business.defi.jwt.ui.JwtViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.eVR;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletProfileAssetDetailFragment$fetchJwt$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ long $chainId;
    final /* synthetic */ Function0<Unit> $functionCall;
    int label;
    final /* synthetic */ eVR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletProfileAssetDetailFragment$fetchJwt$2$1$1(eVR evr, Bundle bundle, long j, Function0<Unit> function0, Continuation<? super DefiWalletProfileAssetDetailFragment$fetchJwt$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = evr;
        this.$bundle = bundle;
        this.$chainId = j;
        this.$functionCall = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletProfileAssetDetailFragment$fetchJwt$2$1$1(this.this$0, this.$bundle, this.$chainId, this.$functionCall, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletProfileAssetDetailFragment$fetchJwt$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            JwtViewModel jwtViewModelValues = this.this$0.values();
            Bundle bundle = this.$bundle;
            long j = this.$chainId;
            this.label = 1;
            objAEQbTJ = jwtViewModelValues.AEQbTJ(bundle, j, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        Function0<Unit> function0 = this.$functionCall;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
