package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC30503lcQ;
import o.C28227kTp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28149kQs;
import o.InterfaceC30595leC;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedAutoSellDelegate$restoreCheckboxState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fromTokenChainId;
    final /* synthetic */ Function1<InterfaceC30595leC, Unit> $onOrderError;
    Object L$0;
    int label;
    final /* synthetic */ C28227kTp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.leC, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedAutoSellDelegate$restoreCheckboxState$1(C28227kTp c28227kTp, String str, Function1<? super InterfaceC30595leC, Unit> function1, Continuation<? super AdvancedAutoSellDelegate$restoreCheckboxState$1> continuation) {
        super(2, continuation);
        this.this$0 = c28227kTp;
        this.$fromTokenChainId = str;
        this.$onOrderError = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedAutoSellDelegate$restoreCheckboxState$1(this.this$0, this.$fromTokenChainId, this.$onOrderError, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedAutoSellDelegate$restoreCheckboxState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Object value;
        AbstractC30503lcQ application;
        Object value2;
        Function1<InterfaceC30595leC, Unit> function1;
        Function1<InterfaceC30595leC, Unit> function12;
        Function1<String, Boolean> function1AEQbTJ;
        Function1<InterfaceC30595leC, Unit> function13;
        Function2<AbstractC30503lcQ, Continuation<? super InterfaceC30595leC>, Object> function2OLrzqt;
        Function1<InterfaceC30595leC, Unit> function14;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        InterfaceC30595leC interfaceC30595leC = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28149kQs interfaceC28149kQs = this.this$0.gEmmrt;
            this.label = 1;
            obj = interfaceC28149kQs.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        function12 = (Function1) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        interfaceC30595leC = (InterfaceC30595leC) obj;
                        function1 = function12;
                        function1.invoke(interfaceC30595leC);
                        return Unit.INSTANCE;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function14 = (Function1) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        interfaceC30595leC = (InterfaceC30595leC) obj;
                        function13 = function14;
                        function13.invoke(interfaceC30595leC);
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                    function13 = this.$onOrderError;
                    function2OLrzqt = this.this$0.OLrzqt();
                    if (function2OLrzqt != null) {
                        AbstractC30503lcQ.Activity activity = AbstractC30503lcQ.Activity.AEQbTJ;
                        this.L$0 = function13;
                        this.label = 5;
                        Object objInvoke = function2OLrzqt.invoke(activity, this);
                        if (objInvoke == objCopydefault) {
                            return objCopydefault;
                        }
                        function14 = function13;
                        obj = objInvoke;
                        interfaceC30595leC = (InterfaceC30595leC) obj;
                        function13 = function14;
                    }
                    function13.invoke(interfaceC30595leC);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                list = (List) obj;
                if (!(!list.isEmpty())) {
                    if (this.this$0.AkhnZx.AYXKKw() && (function1AEQbTJ = this.this$0.AEQbTJ()) != null && function1AEQbTJ.invoke(this.$fromTokenChainId).booleanValue()) {
                        application = new AbstractC30503lcQ.StateListAnimator(list);
                    } else {
                        application = new AbstractC30503lcQ.Application(list);
                    }
                    MutableStateFlow mutableStateFlow = this.this$0.copydefault;
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value2, application));
                    function1 = this.$onOrderError;
                    Function2<AbstractC30503lcQ, Continuation<? super InterfaceC30595leC>, Object> function2OLrzqt2 = this.this$0.OLrzqt();
                    if (function2OLrzqt2 != null) {
                        this.L$0 = function1;
                        this.label = 3;
                        Object objInvoke2 = function2OLrzqt2.invoke(application, this);
                        if (objInvoke2 == objCopydefault) {
                            return objCopydefault;
                        }
                        function12 = function1;
                        obj = objInvoke2;
                        interfaceC30595leC = (InterfaceC30595leC) obj;
                        function1 = function12;
                    }
                    function1.invoke(interfaceC30595leC);
                    return Unit.INSTANCE;
                }
                MutableStateFlow mutableStateFlow2 = this.this$0.copydefault;
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, AbstractC30503lcQ.Activity.AEQbTJ));
                InterfaceC28149kQs interfaceC28149kQs2 = this.this$0.gEmmrt;
                this.label = 4;
                if (interfaceC28149kQs2.KWHzl(false, this) == objCopydefault) {
                    return objCopydefault;
                }
                function13 = this.$onOrderError;
                function2OLrzqt = this.this$0.OLrzqt();
                if (function2OLrzqt != null) {
                }
                function13.invoke(interfaceC30595leC);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            InterfaceC28149kQs interfaceC28149kQs3 = this.this$0.gEmmrt;
            this.label = 2;
            obj = interfaceC28149kQs3.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            list = (List) obj;
            if (!(!list.isEmpty())) {
            }
        }
        return Unit.INSTANCE;
    }
}
