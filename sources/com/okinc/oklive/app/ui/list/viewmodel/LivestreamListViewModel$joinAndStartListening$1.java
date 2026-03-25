package com.okinc.oklive.app.ui.list.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.InterfaceC44197sGx;
import o.pUU;
import o.sUN;

/* JADX INFO: loaded from: classes19.dex */
public final class LivestreamListViewModel$joinAndStartListening$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    int label;
    final /* synthetic */ sUN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListViewModel$joinAndStartListening$1(String str, sUN sun, LifecycleOwner lifecycleOwner, Continuation<? super LivestreamListViewModel$joinAndStartListening$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = sun;
        this.$lifecycleOwner = lifecycleOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamListViewModel$joinAndStartListening$1(this.$channelId, this.this$0, this.$lifecycleOwner, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamListViewModel$joinAndStartListening$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null) {
                final String str = this.$channelId;
                final sUN sun = this.this$0;
                final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
                InterfaceC44197sGx interfaceC44197sGx = new InterfaceC44197sGx() { // from class: com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$joinAndStartListening$1.1
                    @Override // o.InterfaceC44197sGx
                    public void copydefault() {
                        sun.ejfBZ = true;
                        sun.hDKMBd = null;
                        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(sun), Dispatchers.getMain(), null, new LivestreamListViewModel$joinAndStartListening$1$1$onSuccess$1(sun, str, lifecycleOwner, null), 2, null);
                    }

                    @Override // o.InterfaceC44197sGx
                    public void AEQbTJ() {
                        pUU.copydefault("LivestreamListViewModel", "Failed to join channel: " + str);
                        sun.ejfBZ = false;
                    }
                };
                this.label = 1;
                if (interfaceC35180nqU.KWHzl(str, interfaceC44197sGx, this) == objCopydefault) {
                    return objCopydefault;
                }
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
