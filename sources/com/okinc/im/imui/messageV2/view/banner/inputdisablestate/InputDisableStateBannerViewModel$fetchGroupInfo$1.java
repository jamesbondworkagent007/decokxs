package com.okinc.im.imui.messageV2.view.banner.inputdisablestate;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oDA;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class InputDisableStateBannerViewModel$fetchGroupInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InputDisableStateBannerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputDisableStateBannerViewModel$fetchGroupInfo$1(InputDisableStateBannerViewModel inputDisableStateBannerViewModel, Continuation<? super InputDisableStateBannerViewModel$fetchGroupInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = inputDisableStateBannerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InputDisableStateBannerViewModel$fetchGroupInfo$1 inputDisableStateBannerViewModel$fetchGroupInfo$1 = new InputDisableStateBannerViewModel$fetchGroupInfo$1(this.this$0, continuation);
        inputDisableStateBannerViewModel$fetchGroupInfo$1.L$0 = obj;
        return inputDisableStateBannerViewModel$fetchGroupInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InputDisableStateBannerViewModel$fetchGroupInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v12, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.this$0.KWHzl.getValue();
            if (str != null) {
                InputDisableStateBannerViewModel inputDisableStateBannerViewModel = this.this$0;
                Result.Application application2 = Result.Companion;
                pUU.KWHzl("InputDisableBannerViewModel", "fetchGroupInfo");
                oDA oda = inputDisableStateBannerViewModel.AEQbTJ;
                this.label = 1;
                obj = oda.copydefault(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objM7377constructorimpl = Result.m7377constructorimpl((GroupInfo) obj);
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl("InputDisableBannerViewModel", "Failed to fetch group info:", thM7380exceptionOrNullimpl);
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            pUU.KWHzl("InputDisableBannerViewModel", "Successfully fetched group info");
        }
        return Unit.INSTANCE;
    }
}
