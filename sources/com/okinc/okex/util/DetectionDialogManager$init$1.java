package com.okinc.okex.util;

import com.okinc.okex.util.DetectionDialogManager$init$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44093sDb;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC32484meU;
import o.InterfaceC44099sDh;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class DetectionDialogManager$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DetectionDialogManager$init$1(Continuation<? super DetectionDialogManager$init$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetectionDialogManager$init$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DetectionDialogManager$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("DetectionDialogManager", " init");
            InterfaceC44099sDh interfaceC44099sDhAhwBna = InterfaceC32484meU.Companion.KWHzl().AhwBna();
            if (interfaceC44099sDhAhwBna != null) {
                Function0<Unit> function0 = new Function0() { // from class: o.sDd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return DetectionDialogManager$init$1.invokeSuspend$lambda$0();
                    }
                };
                this.label = 1;
                if (interfaceC44099sDhAhwBna.EZpvd(function0, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0() {
        InterfaceC44099sDh interfaceC44099sDhAhwBna = InterfaceC32484meU.Companion.KWHzl().AhwBna();
        boolean zOLrzqt = interfaceC44099sDhAhwBna != null ? interfaceC44099sDhAhwBna.OLrzqt() : false;
        if (zOLrzqt) {
            C44093sDb.EZpvd.EZpvd(1);
        } else {
            C44093sDb.EZpvd.EZpvd(0);
        }
        pUU.KWHzl("DetectionDialogManager", "DetectionDialogManager compliance callback  limit：" + zOLrzqt);
        C44093sDb.EZpvd.KWHzl();
        return Unit.INSTANCE;
    }
}
