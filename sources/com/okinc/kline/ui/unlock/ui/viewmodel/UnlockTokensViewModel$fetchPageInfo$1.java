package com.okinc.kline.ui.unlock.ui.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C39705pxQ;
import o.C39708pxT;
import o.C39713pxY;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes8.dex */
public final class UnlockTokensViewModel$fetchPageInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UnlockTokensViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockTokensViewModel$fetchPageInfo$1(UnlockTokensViewModel unlockTokensViewModel, Continuation<? super UnlockTokensViewModel$fetchPageInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = unlockTokensViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnlockTokensViewModel$fetchPageInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnlockTokensViewModel$fetchPageInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        UnlockTokensViewModel unlockTokensViewModel;
        AnonymousClass3 anonymousClass3;
        InterfaceC49371unL.TaskDescription taskDescription;
        UnlockTokensViewModel unlockTokensViewModel2;
        AnonymousClass4 anonymousClass4;
        InterfaceC49371unL.TaskDescription taskDescription2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            UnlockTokensViewModel unlockTokensViewModel3 = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchPageInfo$1.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C39713pxY) obj2).KWHzl();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C39713pxY) obj2).copydefault((InterfaceC49371unL<C39705pxQ>) obj3);
                }
            };
            InterfaceC49371unL.TaskDescription taskDescription3 = new InterfaceC49371unL.TaskDescription(null, 1, null);
            this.label = 1;
            if (unlockTokensViewModel3.KWHzl(anonymousClass1, taskDescription3, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                    unlockTokensViewModel2 = this.this$0;
                    anonymousClass4 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchPageInfo$1.4
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj2) {
                            return ((C39713pxY) obj2).AEQbTJ();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj2, Object obj3) {
                            ((C39713pxY) obj2).EZpvd((InterfaceC49371unL) obj3);
                        }
                    };
                    taskDescription2 = new InterfaceC49371unL.TaskDescription(null, 1, null);
                    this.label = 4;
                    if (unlockTokensViewModel2.KWHzl(anonymousClass4, taskDescription2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                unlockTokensViewModel = this.this$0;
                anonymousClass3 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchPageInfo$1.3
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((C39713pxY) obj2).EZpvd();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((C39713pxY) obj2).KWHzl((InterfaceC49371unL) obj3);
                    }
                };
                taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                this.label = 3;
                if (unlockTokensViewModel.KWHzl(anonymousClass3, taskDescription, this) == objCopydefault) {
                    return objCopydefault;
                }
                unlockTokensViewModel2 = this.this$0;
                anonymousClass4 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchPageInfo$1.4
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((C39713pxY) obj2).AEQbTJ();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((C39713pxY) obj2).EZpvd((InterfaceC49371unL) obj3);
                    }
                };
                taskDescription2 = new InterfaceC49371unL.TaskDescription(null, 1, null);
                this.label = 4;
                if (unlockTokensViewModel2.KWHzl(anonymousClass4, taskDescription2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        UnlockTokensViewModel unlockTokensViewModel4 = this.this$0;
        AnonymousClass2 anonymousClass2 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchPageInfo$1.2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj2) {
                return ((C39713pxY) obj2).AYXKKw();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj2, Object obj3) {
                ((C39713pxY) obj2).OLrzqt((InterfaceC49371unL<? extends List<C39708pxT>>) obj3);
            }
        };
        InterfaceC49371unL.TaskDescription taskDescription4 = new InterfaceC49371unL.TaskDescription(null, 1, null);
        this.label = 2;
        if (unlockTokensViewModel4.KWHzl(anonymousClass2, taskDescription4, this) == objCopydefault) {
            return objCopydefault;
        }
        unlockTokensViewModel = this.this$0;
        anonymousClass3 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchPageInfo$1.3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj2) {
                return ((C39713pxY) obj2).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj2, Object obj3) {
                ((C39713pxY) obj2).KWHzl((InterfaceC49371unL) obj3);
            }
        };
        taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
        this.label = 3;
        if (unlockTokensViewModel.KWHzl(anonymousClass3, taskDescription, this) == objCopydefault) {
        }
        unlockTokensViewModel2 = this.this$0;
        anonymousClass4 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchPageInfo$1.4
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj2) {
                return ((C39713pxY) obj2).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj2, Object obj3) {
                ((C39713pxY) obj2).EZpvd((InterfaceC49371unL) obj3);
            }
        };
        taskDescription2 = new InterfaceC49371unL.TaskDescription(null, 1, null);
        this.label = 4;
        if (unlockTokensViewModel2.KWHzl(anonymousClass4, taskDescription2, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
