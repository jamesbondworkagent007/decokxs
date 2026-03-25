package com.okinc.business.web3pay.lib.features.contacts;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C31242lqN;
import o.C31314lrg;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31309lrb;

/* JADX INFO: loaded from: classes23.dex */
public final class ContactsManager$getCachedContacts$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends C31314lrg>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31242lqN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsManager$getCachedContacts$1(C31242lqN c31242lqN, Continuation<? super ContactsManager$getCachedContacts$1> continuation) {
        super(2, continuation);
        this.this$0 = c31242lqN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactsManager$getCachedContacts$1 contactsManager$getCachedContacts$1 = new ContactsManager$getCachedContacts$1(this.this$0, continuation);
        contactsManager$getCachedContacts$1.L$0 = obj;
        return contactsManager$getCachedContacts$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends C31314lrg>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<C31314lrg>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<C31314lrg>> flowCollector, Continuation<? super Unit> continuation) {
        return ((ContactsManager$getCachedContacts$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            InterfaceC31309lrb interfaceC31309lrb = this.this$0.copydefault;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = interfaceC31309lrb.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
