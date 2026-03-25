package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jNR;
import o.jNT;

/* JADX INFO: loaded from: classes7.dex */
public final class DevTokenTabViewModel$fetchData$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends jNR>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ int $page;
    final /* synthetic */ int $pageSize;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ DevTokenTabViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevTokenTabViewModel$fetchData$1$result$1(DevTokenTabViewModel devTokenTabViewModel, String str, String str2, int i, int i2, Continuation<? super DevTokenTabViewModel$fetchData$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = devTokenTabViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$page = i;
        this.$pageSize = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DevTokenTabViewModel$fetchData$1$result$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$page, this.$pageSize, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends jNR>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<jNR>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<jNR>> continuation) {
        return ((DevTokenTabViewModel$fetchData$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jNT jnt = this.this$0.copydefault;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            int i2 = this.$page;
            int i3 = this.$pageSize;
            this.label = 1;
            objAEQbTJ = jnt.AEQbTJ(str, str2, i2, i3, this);
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
        return Result.m7376boximpl(objAEQbTJ);
    }
}
