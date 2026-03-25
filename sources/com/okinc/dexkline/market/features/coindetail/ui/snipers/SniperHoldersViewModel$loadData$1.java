package com.okinc.dexkline.market.features.coindetail.ui.snipers;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32316mXm;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC32329mXz;
import o.mWD;

/* JADX INFO: loaded from: classes8.dex */
public final class SniperHoldersViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ SniperHoldersViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SniperHoldersViewModel$loadData$1(SniperHoldersViewModel sniperHoldersViewModel, String str, String str2, Continuation<? super SniperHoldersViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = sniperHoldersViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SniperHoldersViewModel$loadData$1(this.this$0, this.$chainId, this.$tokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SniperHoldersViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            mWD mwd = this.this$0.copydefault;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            this.label = 1;
            obj = mwd.EZpvd(str, str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C32316mXm c32316mXm = (C32316mXm) obj;
        this.this$0.EZpvd(this.$chainId, this.$tokenContractAddress);
        if (c32316mXm == null) {
            this.this$0.EZpvd.setValue(InterfaceC32329mXz.Application.copydefault);
            return Unit.INSTANCE;
        }
        this.this$0.EZpvd.setValue(this.this$0.copydefault(c32316mXm));
        return Unit.INSTANCE;
    }
}
