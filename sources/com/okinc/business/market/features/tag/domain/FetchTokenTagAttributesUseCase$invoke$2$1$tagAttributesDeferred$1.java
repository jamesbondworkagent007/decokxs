package com.okinc.business.market.features.tag.domain;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29710kyl;
import o.C29713kyo;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class FetchTokenTagAttributesUseCase$invoke$2$1$tagAttributesDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends TagAttribute>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ C29713kyo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchTokenTagAttributesUseCase$invoke$2$1$tagAttributesDeferred$1(C29713kyo c29713kyo, String str, String str2, Continuation<? super FetchTokenTagAttributesUseCase$invoke$2$1$tagAttributesDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = c29713kyo;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchTokenTagAttributesUseCase$invoke$2$1$tagAttributesDeferred$1(this.this$0, this.$chainId, this.$tokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends TagAttribute>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<TagAttribute>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<TagAttribute>> continuation) {
        return ((FetchTokenTagAttributesUseCase$invoke$2$1$tagAttributesDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29710kyl c29710kyl = this.this$0.copydefault;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            this.label = 1;
            objCopydefault = c29710kyl.copydefault(str, str2, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        return objCopydefault;
    }
}
