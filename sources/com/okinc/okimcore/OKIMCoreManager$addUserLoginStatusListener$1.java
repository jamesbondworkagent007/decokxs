package com.okinc.okimcore;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC47263tmj;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.sDO;

/* JADX INFO: loaded from: classes10.dex */
public final class OKIMCoreManager$addUserLoginStatusListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ sDO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMCoreManager$addUserLoginStatusListener$1(sDO sdo, Continuation<? super OKIMCoreManager$addUserLoginStatusListener$1> continuation) {
        super(2, continuation);
        this.this$0 = sdo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKIMCoreManager$addUserLoginStatusListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMCoreManager$addUserLoginStatusListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sDO sdo = this.this$0;
            this.label = 1;
            if (sdo.copydefault(this) == objCopydefault) {
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
            C56391yDq.AEQbTJ(obj);
        }
        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.AuCTel.fIwbmz());
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0);
        this.label = 2;
        if (flowDistinctUntilChanged.collect(anonymousClass4, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.OKIMCoreManager$addUserLoginStatusListener$1$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements FlowCollector {
        public final /* synthetic */ sDO AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(sDO sdo) {
            this.AEQbTJ = sdo;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) throws Throwable {
            OKIMCoreManager$addUserLoginStatusListener$1$1$emit$1 oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1;
            AnonymousClass4<T> anonymousClass4;
            AnonymousClass4<T> anonymousClass42;
            if (continuation instanceof OKIMCoreManager$addUserLoginStatusListener$1$1$emit$1) {
                oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1 = (OKIMCoreManager$addUserLoginStatusListener$1$1$emit$1) continuation;
                int i = oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1 = new OKIMCoreManager$addUserLoginStatusListener$1$1$emit$1(this, continuation);
                }
            }
            Object obj = oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (abstractC47263tmj instanceof AbstractC47263tmj.ActionBar) {
                    C44124sEe.imLogLogin$default("Receive login event", null, 2, null);
                    sDO sdo = this.AEQbTJ;
                    oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1.label = 1;
                    if (sdo.copydefault(oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                if (abstractC47263tmj instanceof AbstractC47263tmj.Activity) {
                    C44124sEe.imLogLogin$default("Receive logout event", null, 2, null);
                    sDO sdo2 = this.AEQbTJ;
                    oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1.L$0 = this;
                    oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1.label = 2;
                    if (sdo2.copydefault(oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    anonymousClass42 = this;
                    anonymousClass42.AEQbTJ.AEQbTJ().OLrzqt();
                } else if (abstractC47263tmj instanceof AbstractC47263tmj.StateListAnimator) {
                    C44124sEe.imLogLogin$default("Receive login event switch", null, 2, null);
                    sDO sdo3 = this.AEQbTJ;
                    oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1.L$0 = this;
                    oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1.label = 3;
                    if (sdo3.copydefault(oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    anonymousClass4 = this;
                    anonymousClass4.AEQbTJ.AEQbTJ().OLrzqt();
                }
            } else {
                if (i2 == 1) {
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                if (i2 == 2) {
                    anonymousClass42 = (AnonymousClass4) oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    anonymousClass42.AEQbTJ.AEQbTJ().OLrzqt();
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    anonymousClass4 = (AnonymousClass4) oKIMCoreManager$addUserLoginStatusListener$1$1$emit$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    anonymousClass4.AEQbTJ.AEQbTJ().OLrzqt();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
