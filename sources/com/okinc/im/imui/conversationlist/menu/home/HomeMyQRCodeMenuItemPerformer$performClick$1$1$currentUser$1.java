package com.okinc.im.imui.conversationlist.menu.home;

import com.okinc.okimcore.model.remote.UserInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.InterfaceC44177sGd;

/* JADX INFO: loaded from: classes23.dex */
public final class HomeMyQRCodeMenuItemPerformer$performClick$1$1$currentUser$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserInfo>, Object> {
    final /* synthetic */ InterfaceC35180nqU $okimService;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeMyQRCodeMenuItemPerformer$performClick$1$1$currentUser$1(InterfaceC35180nqU interfaceC35180nqU, Continuation<? super HomeMyQRCodeMenuItemPerformer$performClick$1$1$currentUser$1> continuation) {
        super(2, continuation);
        this.$okimService = interfaceC35180nqU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeMyQRCodeMenuItemPerformer$performClick$1$1$currentUser$1(this.$okimService, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserInfo> continuation) {
        return ((HomeMyQRCodeMenuItemPerformer$performClick$1$1$currentUser$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44177sGd interfaceC44177sGdAEQbTJ = this.$okimService.AEQbTJ().AEQbTJ();
            this.label = 1;
            obj = InterfaceC44177sGd.Application.getCurrentUser$default(interfaceC44177sGdAEQbTJ, false, this, 1, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
