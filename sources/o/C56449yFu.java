package o;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yFu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56449yFu {

    /* JADX INFO: renamed from: o.yFu$Application */
    public static final class Application {
        public static final java.lang.reflect.Method AEQbTJ;
        public static final java.lang.reflect.Method OLrzqt;
        public static final Application copydefault = new Application();

        private Application() {
        }

        static {
            java.lang.reflect.Method method;
            java.lang.reflect.Method method2;
            java.lang.reflect.Method[] methods = java.lang.Throwable.class.getMethods();
            Intrinsics.copydefault(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (Intrinsics.EZpvd((java.lang.Object) method2.getName(), (java.lang.Object) "addSuppressed")) {
                    java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
                    if (Intrinsics.EZpvd(yDV.AxsJAY(parameterTypes), java.lang.Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            OLrzqt = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                java.lang.reflect.Method method3 = methods[i];
                if (Intrinsics.EZpvd((java.lang.Object) method3.getName(), (java.lang.Object) "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            AEQbTJ = method;
        }
    }

    public void EZpvd(@NotNull java.lang.Throwable th, @NotNull java.lang.Throwable th2) throws java.lang.IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th2, "");
        java.lang.reflect.Method method = Application.OLrzqt;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public java.util.List<java.lang.Throwable> copydefault(@NotNull java.lang.Throwable th) {
        java.lang.Object objInvoke;
        java.util.List<java.lang.Throwable> listFIwbmz;
        Intrinsics.checkNotNullParameter(th, "");
        java.lang.reflect.Method method = Application.AEQbTJ;
        return (method == null || (objInvoke = method.invoke(th, new java.lang.Object[0])) == null || (listFIwbmz = yDT.fIwbmz((java.lang.Throwable[]) objInvoke)) == null) ? yDY.AhwBna() : listFIwbmz;
    }

    public kotlin.random.Random OLrzqt() {
        return new yIR();
    }
}
