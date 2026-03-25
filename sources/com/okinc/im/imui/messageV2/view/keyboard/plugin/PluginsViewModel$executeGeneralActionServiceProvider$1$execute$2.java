package com.okinc.im.imui.messageV2.view.keyboard.plugin;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.config.serviceprovider.GeneralAction;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C36588odm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class PluginsViewModel$executeGeneralActionServiceProvider$1$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<GeneralAction> $generalAction;
    int label;
    final /* synthetic */ PluginsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.im.config.serviceprovider.GeneralAction> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PluginsViewModel$executeGeneralActionServiceProvider$1$execute$2(PluginsViewModel pluginsViewModel, List<? extends GeneralAction> list, Continuation<? super PluginsViewModel$executeGeneralActionServiceProvider$1$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = pluginsViewModel;
        this.$generalAction = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PluginsViewModel$executeGeneralActionServiceProvider$1$execute$2(this.this$0, this.$generalAction, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PluginsViewModel$executeGeneralActionServiceProvider$1$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableLiveData mutableLiveData = this.this$0.AEQbTJ;
            C32989mnw c32989mnw = new C32989mnw(this.$generalAction);
            this.label = 1;
            if (C36588odm.KWHzl(mutableLiveData, c32989mnw, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
