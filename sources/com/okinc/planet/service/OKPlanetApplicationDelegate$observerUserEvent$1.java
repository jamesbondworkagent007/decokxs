package com.okinc.planet.service;

import com.okinc.planet.service.OKPlanetApplicationDelegate$observerUserEvent$1;
import com.okinc.planet_api.model.WSMessageData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC47263tmj;
import o.AbstractC57556yke;
import o.C43251rlk;
import o.C46418tTp;
import o.C54401xHa;
import o.C56391yDq;
import o.C56442yFn;
import o.C57567ykp;
import o.InterfaceC47278tmy;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class OKPlanetApplicationDelegate$observerUserEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C46418tTp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKPlanetApplicationDelegate$observerUserEvent$1(C46418tTp c46418tTp, Continuation<? super OKPlanetApplicationDelegate$observerUserEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = c46418tTp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKPlanetApplicationDelegate$observerUserEvent$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKPlanetApplicationDelegate$observerUserEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<AbstractC47263tmj> flowFIwbmz = ((InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class)).fIwbmz();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFIwbmz, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.planet.service.OKPlanetApplicationDelegate$observerUserEvent$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC47263tmj, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C46418tTp this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C46418tTp c46418tTp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c46418tTp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC47263tmj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00e3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC57556yke abstractC57556ykeAYXKKw;
            AbstractC57556yke abstractC57556ykeAYXKKw2;
            AbstractC57556yke abstractC57556ykeAYXKKw3;
            AbstractC57556yke abstractC57556ykeAYXKKw4;
            AbstractC57556yke abstractC57556ykeAYXKKw5;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC47263tmj abstractC47263tmj = (AbstractC47263tmj) this.L$0;
                pUU.EZpvd("qjf", "OKPlanetApplicationDelegate-Collected user event: " + abstractC47263tmj);
                if (abstractC47263tmj instanceof AbstractC47263tmj.Activity) {
                    C46418tTp c46418tTp = this.this$0;
                    this.label = 1;
                    if (c46418tTp.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC57556ykeAYXKKw = C46418tTp.Companion.AYXKKw();
                    if (abstractC57556ykeAYXKKw != null) {
                    }
                } else if (abstractC47263tmj instanceof AbstractC47263tmj.StateListAnimator) {
                    C46418tTp c46418tTp2 = this.this$0;
                    this.label = 2;
                    if (c46418tTp2.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC57556ykeAYXKKw2 = C46418tTp.Companion.AYXKKw();
                    if (abstractC57556ykeAYXKKw2 != null) {
                    }
                    this.label = 3;
                    if (DelayKt.delay(500L, this) == objCopydefault) {
                    }
                    C57567ykp v5Connection$default = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, true, false, false, false, null, 61, null);
                    C46418tTp.Application application = C46418tTp.Companion;
                    final C46418tTp c46418tTp3 = this.this$0;
                    application.OLrzqt(c46418tTp3.KWHzl(v5Connection$default, (Function1<? super WSMessageData, Unit>) new Function1() { // from class: o.tTB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return OKPlanetApplicationDelegate$observerUserEvent$1.AnonymousClass1.invokeSuspend$lambda$0(c46418tTp3, (WSMessageData) obj2);
                        }
                    }));
                    abstractC57556ykeAYXKKw3 = application.AYXKKw();
                    if (abstractC57556ykeAYXKKw3 != null) {
                    }
                } else if (abstractC47263tmj instanceof AbstractC47263tmj.ActionBar) {
                    C46418tTp c46418tTp4 = this.this$0;
                    this.label = 4;
                    if (c46418tTp4.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    this.this$0.gHZMYf();
                    abstractC57556ykeAYXKKw4 = C46418tTp.Companion.AYXKKw();
                    if (abstractC57556ykeAYXKKw4 != null) {
                    }
                    this.label = 5;
                    if (DelayKt.delay(500L, this) == objCopydefault) {
                    }
                    C57567ykp v5Connection$default2 = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, true, false, false, false, null, 61, null);
                    C46418tTp.Application application2 = C46418tTp.Companion;
                    final C46418tTp c46418tTp5 = this.this$0;
                    application2.OLrzqt(c46418tTp5.KWHzl(v5Connection$default2, (Function1<? super WSMessageData, Unit>) new Function1() { // from class: o.tTD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return OKPlanetApplicationDelegate$observerUserEvent$1.AnonymousClass1.invokeSuspend$lambda$1(c46418tTp5, (WSMessageData) obj2);
                        }
                    }));
                    abstractC57556ykeAYXKKw5 = application2.AYXKKw();
                    if (abstractC57556ykeAYXKKw5 != null) {
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                abstractC57556ykeAYXKKw = C46418tTp.Companion.AYXKKw();
                if (abstractC57556ykeAYXKKw != null) {
                    abstractC57556ykeAYXKKw.djBIcL();
                }
            } else if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                abstractC57556ykeAYXKKw2 = C46418tTp.Companion.AYXKKw();
                if (abstractC57556ykeAYXKKw2 != null) {
                    abstractC57556ykeAYXKKw2.djBIcL();
                }
                this.label = 3;
                if (DelayKt.delay(500L, this) == objCopydefault) {
                    return objCopydefault;
                }
                C57567ykp v5Connection$default3 = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, true, false, false, false, null, 61, null);
                C46418tTp.Application application3 = C46418tTp.Companion;
                final C46418tTp c46418tTp32 = this.this$0;
                application3.OLrzqt(c46418tTp32.KWHzl(v5Connection$default3, (Function1<? super WSMessageData, Unit>) new Function1() { // from class: o.tTB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return OKPlanetApplicationDelegate$observerUserEvent$1.AnonymousClass1.invokeSuspend$lambda$0(c46418tTp32, (WSMessageData) obj2);
                    }
                }));
                abstractC57556ykeAYXKKw3 = application3.AYXKKw();
                if (abstractC57556ykeAYXKKw3 != null) {
                }
            } else if (i == 3) {
                C56391yDq.AEQbTJ(obj);
                C57567ykp v5Connection$default32 = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, true, false, false, false, null, 61, null);
                C46418tTp.Application application32 = C46418tTp.Companion;
                final C46418tTp c46418tTp322 = this.this$0;
                application32.OLrzqt(c46418tTp322.KWHzl(v5Connection$default32, (Function1<? super WSMessageData, Unit>) new Function1() { // from class: o.tTB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return OKPlanetApplicationDelegate$observerUserEvent$1.AnonymousClass1.invokeSuspend$lambda$0(c46418tTp322, (WSMessageData) obj2);
                    }
                }));
                abstractC57556ykeAYXKKw3 = application32.AYXKKw();
                if (abstractC57556ykeAYXKKw3 != null) {
                    abstractC57556ykeAYXKKw3.AhwBna();
                }
            } else if (i == 4) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.gHZMYf();
                abstractC57556ykeAYXKKw4 = C46418tTp.Companion.AYXKKw();
                if (abstractC57556ykeAYXKKw4 != null) {
                    abstractC57556ykeAYXKKw4.djBIcL();
                }
                this.label = 5;
                if (DelayKt.delay(500L, this) == objCopydefault) {
                    return objCopydefault;
                }
                C57567ykp v5Connection$default22 = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, true, false, false, false, null, 61, null);
                C46418tTp.Application application22 = C46418tTp.Companion;
                final C46418tTp c46418tTp52 = this.this$0;
                application22.OLrzqt(c46418tTp52.KWHzl(v5Connection$default22, (Function1<? super WSMessageData, Unit>) new Function1() { // from class: o.tTD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return OKPlanetApplicationDelegate$observerUserEvent$1.AnonymousClass1.invokeSuspend$lambda$1(c46418tTp52, (WSMessageData) obj2);
                    }
                }));
                abstractC57556ykeAYXKKw5 = application22.AYXKKw();
                if (abstractC57556ykeAYXKKw5 != null) {
                }
            } else {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                C57567ykp v5Connection$default222 = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, true, false, false, false, null, 61, null);
                C46418tTp.Application application222 = C46418tTp.Companion;
                final C46418tTp c46418tTp522 = this.this$0;
                application222.OLrzqt(c46418tTp522.KWHzl(v5Connection$default222, (Function1<? super WSMessageData, Unit>) new Function1() { // from class: o.tTD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return OKPlanetApplicationDelegate$observerUserEvent$1.AnonymousClass1.invokeSuspend$lambda$1(c46418tTp522, (WSMessageData) obj2);
                    }
                }));
                abstractC57556ykeAYXKKw5 = application222.AYXKKw();
                if (abstractC57556ykeAYXKKw5 != null) {
                    abstractC57556ykeAYXKKw5.AhwBna();
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(C46418tTp c46418tTp, WSMessageData wSMessageData) {
            pUU.KWHzl("qjf", "OKPlanetApplicationDelegate-wsMsgData = " + wSMessageData);
            c46418tTp.EZpvd(wSMessageData);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C46418tTp c46418tTp, WSMessageData wSMessageData) {
            pUU.KWHzl("qjf", "OKPlanetApplicationDelegate-wsMsgData = " + wSMessageData);
            c46418tTp.EZpvd(wSMessageData);
            return Unit.INSTANCE;
        }
    }
}
