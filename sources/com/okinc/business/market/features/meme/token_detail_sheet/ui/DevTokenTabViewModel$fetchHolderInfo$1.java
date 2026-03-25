package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import com.okinc.business.market.features.meme.holder_info.domain.model.HolderInfoData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C28727kgI;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28796khY;

/* JADX INFO: loaded from: classes7.dex */
public final class DevTokenTabViewModel$fetchHolderInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $holderAddress;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ DevTokenTabViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevTokenTabViewModel$fetchHolderInfo$1(DevTokenTabViewModel devTokenTabViewModel, String str, String str2, String str3, Continuation<? super DevTokenTabViewModel$fetchHolderInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = devTokenTabViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$holderAddress = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DevTokenTabViewModel$fetchHolderInfo$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$holderAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DevTokenTabViewModel$fetchHolderInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt.setValue(InterfaceC28796khY.Activity.OLrzqt);
            C28727kgI c28727kgI = this.this$0.AYXKKw;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            String str3 = this.$holderAddress;
            this.label = 1;
            obj = c28727kgI.AEQbTJ(str, str2, str3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        DevTokenTabViewModel devTokenTabViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            devTokenTabViewModel.OLrzqt.setValue(new InterfaceC28796khY.TaskDescription((HolderInfoData) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()));
        }
        DevTokenTabViewModel devTokenTabViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
            MutableStateFlow mutableStateFlow = devTokenTabViewModel2.OLrzqt;
            String message = oKServerException.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            mutableStateFlow.setValue(new InterfaceC28796khY.StateListAnimator(message));
        }
        return Unit.INSTANCE;
    }
}
