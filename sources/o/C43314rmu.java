package o;

import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rmu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43314rmu {
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rmt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43314rmu.copydefault();
        }
    });

    public static final InvocationHandler AEQbTJ() {
        return (InvocationHandler) EZpvd.getValue();
    }

    public static final InvocationHandler copydefault() {
        return new InvocationHandler() { // from class: o.rmr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.reflect.InvocationHandler
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                return C43314rmu.KWHzl(obj, method, objArr);
            }
        };
    }

    public static final java.lang.Object KWHzl(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        method.getDeclaringClass().getSimpleName();
        method.getName();
        Objects.toString(objArr);
        java.lang.Class<?> returnType = method.getReturnType();
        if (Intrinsics.EZpvd(returnType, java.lang.Integer.TYPE)) {
            return -1;
        }
        if (Intrinsics.EZpvd(returnType, java.lang.Long.TYPE)) {
            return -1L;
        }
        if (Intrinsics.EZpvd(returnType, java.lang.Float.TYPE)) {
            return java.lang.Float.valueOf(-1.0f);
        }
        if (Intrinsics.EZpvd(returnType, java.lang.Double.TYPE)) {
            return java.lang.Double.valueOf(-1.0d);
        }
        if (Intrinsics.EZpvd(returnType, java.lang.String.class)) {
            return "";
        }
        if (Intrinsics.EZpvd(returnType, java.lang.Boolean.TYPE)) {
            return java.lang.Boolean.FALSE;
        }
        if (Intrinsics.EZpvd(returnType, java.lang.Character.TYPE)) {
            return 'a';
        }
        if (Intrinsics.EZpvd(returnType, Unit.class)) {
            return Unit.INSTANCE;
        }
        try {
            return returnType.newInstance();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static final <T extends InterfaceC43216rlB> T OLrzqt(@NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        java.lang.Object objNewProxyInstance = java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, AEQbTJ());
        Intrinsics.copydefault(objNewProxyInstance, "");
        return (T) objNewProxyInstance;
    }
}
