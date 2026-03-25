package com.okinc.business.defi.wallet.mine.viewmodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C13062cyk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletBatchCreateAccountAnimationModel$async2Server$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArrayList<AbstractC12782ctV> $asyncList;
    final /* synthetic */ DefiWalletBatchCreateAccountAnimationModel $this_runCatching;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletBatchCreateAccountAnimationModel$async2Server$2$1(ArrayList<AbstractC12782ctV> arrayList, DefiWalletBatchCreateAccountAnimationModel defiWalletBatchCreateAccountAnimationModel, Continuation<? super DefiWalletBatchCreateAccountAnimationModel$async2Server$2$1> continuation) {
        super(2, continuation);
        this.$asyncList = arrayList;
        this.$this_runCatching = defiWalletBatchCreateAccountAnimationModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletBatchCreateAccountAnimationModel$async2Server$2$1(this.$asyncList, this.$this_runCatching, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletBatchCreateAccountAnimationModel$async2Server$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList<AbstractC12782ctV> arrayList = this.$asyncList;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AbstractC12782ctV) it.next()).DbNXlk());
            }
            C13062cyk instance$default = C13062cyk.Application.getInstance$default(C13062cyk.Companion, null, 1, null);
            C13062cyk.LoaderManager.Application application = new C13062cyk.LoaderManager.Application(arrayList2);
            this.label = 1;
            obj = instance$default.KWHzl((List<String>) arrayList2, false, (C13062cyk.LoaderManager) application, (Continuation<? super C13062cyk.ActionBar<String>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C13062cyk.ActionBar actionBar = (C13062cyk.ActionBar) obj;
        DefiWalletBatchCreateAccountAnimationModel defiWalletBatchCreateAccountAnimationModel = this.$this_runCatching;
        defiWalletBatchCreateAccountAnimationModel.OLrzqt(defiWalletBatchCreateAccountAnimationModel.values() + actionBar.EZpvd().size());
        DefiWalletBatchCreateAccountAnimationModel defiWalletBatchCreateAccountAnimationModel2 = this.$this_runCatching;
        defiWalletBatchCreateAccountAnimationModel2.AEQbTJ(defiWalletBatchCreateAccountAnimationModel2.AYXKKw() + actionBar.KWHzl().size());
        this.$this_runCatching.AEQbTJ.decrementAndGet();
        pUU.copydefault(this.$this_runCatching.ejfBZ, "async2Server callback createdCount = " + this.$this_runCatching.gEmmrt() + " inputCreateCount = " + this.$this_runCatching.AkhnZx() + " ");
        this.$this_runCatching.fIwbmz();
        return Unit.INSTANCE;
    }
}
