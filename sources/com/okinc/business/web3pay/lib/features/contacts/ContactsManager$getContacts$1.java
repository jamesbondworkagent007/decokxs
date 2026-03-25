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
import o.InterfaceC31312lre;

/* JADX INFO: loaded from: classes23.dex */
public final class ContactsManager$getContacts$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends C31314lrg>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C31242lqN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsManager$getContacts$1(C31242lqN c31242lqN, Continuation<? super ContactsManager$getContacts$1> continuation) {
        super(2, continuation);
        this.this$0 = c31242lqN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactsManager$getContacts$1 contactsManager$getContacts$1 = new ContactsManager$getContacts$1(this.this$0, continuation);
        contactsManager$getContacts$1.L$0 = obj;
        return contactsManager$getContacts$1;
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
        return ((ContactsManager$getContacts$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        InterfaceC31309lrb interfaceC31309lrb;
        FlowCollector flowCollector3;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                InterfaceC31309lrb interfaceC31309lrb2 = this.this$0.copydefault;
                this.L$0 = flowCollector4;
                this.label = 1;
                Object objCopydefault2 = interfaceC31309lrb2.copydefault(this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                flowCollector = flowCollector4;
                obj = objCopydefault2;
                if (((Boolean) obj).booleanValue()) {
                    InterfaceC31309lrb interfaceC31309lrb3 = this.this$0.copydefault;
                    this.L$0 = flowCollector;
                    this.L$1 = flowCollector;
                    this.label = 2;
                    obj = interfaceC31309lrb3.EZpvd(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    flowCollector2 = flowCollector;
                    this.L$0 = flowCollector2;
                    this.L$1 = null;
                    this.label = 3;
                    if (flowCollector.emit(obj, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    interfaceC31309lrb = this.this$0.copydefault;
                    InterfaceC31312lre interfaceC31312lre = this.this$0.AEQbTJ;
                    this.L$0 = flowCollector2;
                    this.L$1 = interfaceC31309lrb;
                    this.label = 4;
                    obj = interfaceC31312lre.KWHzl(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    this.L$0 = flowCollector2;
                    this.L$1 = null;
                    this.label = 5;
                    if (interfaceC31309lrb.AEQbTJ((List) obj, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    flowCollector3 = flowCollector2;
                    InterfaceC31309lrb interfaceC31309lrb4 = this.this$0.copydefault;
                    this.L$0 = flowCollector3;
                    this.label = 6;
                    obj = interfaceC31309lrb4.EZpvd(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    this.L$0 = null;
                    this.label = 7;
                    if (flowCollector3.emit(obj, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                flowCollector2 = flowCollector;
                interfaceC31309lrb = this.this$0.copydefault;
                InterfaceC31312lre interfaceC31312lre2 = this.this$0.AEQbTJ;
                this.L$0 = flowCollector2;
                this.L$1 = interfaceC31309lrb;
                this.label = 4;
                obj = interfaceC31312lre2.KWHzl(this);
                if (obj == objCopydefault) {
                }
                this.L$0 = flowCollector2;
                this.L$1 = null;
                this.label = 5;
                if (interfaceC31309lrb.AEQbTJ((List) obj, this) != objCopydefault) {
                }
                break;
            case 1:
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (((Boolean) obj).booleanValue()) {
                }
                flowCollector2 = flowCollector;
                interfaceC31309lrb = this.this$0.copydefault;
                InterfaceC31312lre interfaceC31312lre22 = this.this$0.AEQbTJ;
                this.L$0 = flowCollector2;
                this.L$1 = interfaceC31309lrb;
                this.label = 4;
                obj = interfaceC31312lre22.KWHzl(this);
                if (obj == objCopydefault) {
                }
                this.L$0 = flowCollector2;
                this.L$1 = null;
                this.label = 5;
                if (interfaceC31309lrb.AEQbTJ((List) obj, this) != objCopydefault) {
                }
                break;
            case 2:
                flowCollector = (FlowCollector) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.L$0 = flowCollector2;
                this.L$1 = null;
                this.label = 3;
                if (flowCollector.emit(obj, this) == objCopydefault) {
                }
                interfaceC31309lrb = this.this$0.copydefault;
                InterfaceC31312lre interfaceC31312lre222 = this.this$0.AEQbTJ;
                this.L$0 = flowCollector2;
                this.L$1 = interfaceC31309lrb;
                this.label = 4;
                obj = interfaceC31312lre222.KWHzl(this);
                if (obj == objCopydefault) {
                }
                this.L$0 = flowCollector2;
                this.L$1 = null;
                this.label = 5;
                if (interfaceC31309lrb.AEQbTJ((List) obj, this) != objCopydefault) {
                }
                break;
            case 3:
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                flowCollector2 = flowCollector;
                interfaceC31309lrb = this.this$0.copydefault;
                InterfaceC31312lre interfaceC31312lre2222 = this.this$0.AEQbTJ;
                this.L$0 = flowCollector2;
                this.L$1 = interfaceC31309lrb;
                this.label = 4;
                obj = interfaceC31312lre2222.KWHzl(this);
                if (obj == objCopydefault) {
                }
                this.L$0 = flowCollector2;
                this.L$1 = null;
                this.label = 5;
                if (interfaceC31309lrb.AEQbTJ((List) obj, this) != objCopydefault) {
                }
                break;
            case 4:
                interfaceC31309lrb = (InterfaceC31309lrb) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.L$0 = flowCollector2;
                this.L$1 = null;
                this.label = 5;
                if (interfaceC31309lrb.AEQbTJ((List) obj, this) != objCopydefault) {
                }
                break;
            case 5:
                flowCollector3 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                InterfaceC31309lrb interfaceC31309lrb42 = this.this$0.copydefault;
                this.L$0 = flowCollector3;
                this.label = 6;
                obj = interfaceC31309lrb42.EZpvd(this);
                if (obj == objCopydefault) {
                }
                this.L$0 = null;
                this.label = 7;
                if (flowCollector3.emit(obj, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                flowCollector3 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.L$0 = null;
                this.label = 7;
                if (flowCollector3.emit(obj, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
