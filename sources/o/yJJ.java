package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import kotlin.reflect.full.KCallables$callSuspend$1;
import kotlin.reflect.full.KCallables$callSuspendBy$1;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class yJJ {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> java.lang.Object copydefault(@NotNull InterfaceC56549yJm<? extends R> interfaceC56549yJm, @NotNull java.lang.Object[] objArr, @NotNull Continuation<? super R> continuation) throws java.lang.Throwable {
        KCallables$callSuspend$1 kCallables$callSuspend$1;
        if (continuation instanceof KCallables$callSuspend$1) {
            kCallables$callSuspend$1 = (KCallables$callSuspend$1) continuation;
            int i = kCallables$callSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kCallables$callSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                kCallables$callSuspend$1 = new KCallables$callSuspend$1(continuation);
            }
        }
        java.lang.Object objCall = kCallables$callSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kCallables$callSuspend$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCall);
            if (!interfaceC56549yJm.isSuspend()) {
                return interfaceC56549yJm.call(java.util.Arrays.copyOf(objArr, objArr.length));
            }
            if (!(interfaceC56549yJm instanceof InterfaceC56555yJs)) {
                throw new java.lang.IllegalArgumentException("Cannot callSuspend on a property " + interfaceC56549yJm + ": suspend properties are not supported yet");
            }
            kCallables$callSuspend$1.L$0 = interfaceC56549yJm;
            kCallables$callSuspend$1.L$1 = objArr;
            kCallables$callSuspend$1.label = 1;
            C56533yIx c56533yIx = new C56533yIx(2);
            c56533yIx.EZpvd(objArr);
            c56533yIx.copydefault(kCallables$callSuspend$1);
            objCall = interfaceC56549yJm.call(c56533yIx.copydefault(new java.lang.Object[c56533yIx.KWHzl()]));
            if (objCall == C56442yFn.copydefault()) {
                C56447yFs.copydefault(kCallables$callSuspend$1);
            }
            if (objCall == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC56549yJm = (InterfaceC56549yJm) kCallables$callSuspend$1.L$0;
            C56391yDq.AEQbTJ(objCall);
        }
        InterfaceC56555yJs interfaceC56555yJs = (InterfaceC56555yJs) interfaceC56549yJm;
        return (!Intrinsics.EZpvd(interfaceC56555yJs.getReturnType().getClassifier(), C56524yIo.AEQbTJ(Unit.class)) || interfaceC56555yJs.getReturnType().isMarkedNullable()) ? objCall : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> java.lang.Object AEQbTJ(@NotNull InterfaceC56549yJm<? extends R> interfaceC56549yJm, @NotNull java.util.Map<KParameter, ? extends java.lang.Object> map, @NotNull Continuation<? super R> continuation) throws java.lang.Throwable {
        KCallables$callSuspendBy$1 kCallables$callSuspendBy$1;
        if (continuation instanceof KCallables$callSuspendBy$1) {
            kCallables$callSuspendBy$1 = (KCallables$callSuspendBy$1) continuation;
            int i = kCallables$callSuspendBy$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kCallables$callSuspendBy$1.label = i - Integer.MIN_VALUE;
            } else {
                kCallables$callSuspendBy$1 = new KCallables$callSuspendBy$1(continuation);
            }
        }
        java.lang.Object objEZpvd = kCallables$callSuspendBy$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kCallables$callSuspendBy$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (!interfaceC56549yJm.isSuspend()) {
                return interfaceC56549yJm.callBy(map);
            }
            if (!(interfaceC56549yJm instanceof InterfaceC56555yJs)) {
                throw new java.lang.IllegalArgumentException("Cannot callSuspendBy on a property " + interfaceC56549yJm + ": suspend properties are not supported yet");
            }
            AbstractC56573yKj<?> abstractC56573yKjAEQbTJ = yLX.AEQbTJ(interfaceC56549yJm);
            if (abstractC56573yKjAEQbTJ == null) {
                throw new KotlinReflectionInternalError("This callable does not support a default call: " + interfaceC56549yJm);
            }
            kCallables$callSuspendBy$1.L$0 = interfaceC56549yJm;
            kCallables$callSuspendBy$1.L$1 = map;
            kCallables$callSuspendBy$1.L$2 = abstractC56573yKjAEQbTJ;
            kCallables$callSuspendBy$1.label = 1;
            objEZpvd = abstractC56573yKjAEQbTJ.EZpvd(map, kCallables$callSuspendBy$1);
            if (objEZpvd == C56442yFn.copydefault()) {
                C56447yFs.copydefault(kCallables$callSuspendBy$1);
            }
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC56549yJm = (InterfaceC56549yJm) kCallables$callSuspendBy$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        InterfaceC56555yJs interfaceC56555yJs = (InterfaceC56555yJs) interfaceC56549yJm;
        return (!Intrinsics.EZpvd(interfaceC56555yJs.getReturnType().getClassifier(), C56524yIo.AEQbTJ(Unit.class)) || interfaceC56555yJs.getReturnType().isMarkedNullable()) ? objEZpvd : Unit.INSTANCE;
    }
}
