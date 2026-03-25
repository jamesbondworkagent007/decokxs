package com.okinc.business.market.features.tag.ui;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29713kyo;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29685kyM;

/* JADX INFO: loaded from: classes7.dex */
public final class TagExplanationViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ boolean $fromTokenDetail;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ TagExplanationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagExplanationViewModel$loadData$1(TagExplanationViewModel tagExplanationViewModel, String str, String str2, boolean z, Continuation<? super TagExplanationViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = tagExplanationViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$fromTokenDetail = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TagExplanationViewModel$loadData$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$fromTokenDetail, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TagExplanationViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29713kyo c29713kyo = this.this$0.AEQbTJ;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            boolean z = this.$fromTokenDetail;
            this.label = 1;
            objKWHzl = c29713kyo.KWHzl(str, str2, z, this);
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
        TagExplanationViewModel tagExplanationViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            tagExplanationViewModel.KWHzl.setValue((InterfaceC29685kyM.ActionBar) objKWHzl);
        }
        TagExplanationViewModel tagExplanationViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            tagExplanationViewModel2.KWHzl.setValue(InterfaceC29685kyM.Application.AEQbTJ);
        }
        return Unit.INSTANCE;
    }
}
