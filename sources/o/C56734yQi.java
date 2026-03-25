package o;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56734yQi {
    public static final C56734yQi KWHzl = new C56734yQi();
    public static TaskDescription OLrzqt;

    /* JADX INFO: renamed from: o.yQi$TaskDescription */
    public static final class TaskDescription {
        public final java.lang.reflect.Method KWHzl;
        public final java.lang.reflect.Method OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Method EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Method OLrzqt() {
            return this.OLrzqt;
        }

        public TaskDescription(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
            this.KWHzl = method;
            this.OLrzqt = method2;
        }
    }

    private C56734yQi() {
    }

    public final TaskDescription EZpvd(java.lang.Object obj) {
        java.lang.Class<?> cls = obj.getClass();
        try {
            return new TaskDescription(cls.getMethod("getType", new java.lang.Class[0]), cls.getMethod("getAccessor", new java.lang.Class[0]));
        } catch (java.lang.NoSuchMethodException unused) {
            return new TaskDescription(null, null);
        }
    }

    public final TaskDescription copydefault(java.lang.Object obj) {
        TaskDescription taskDescription = OLrzqt;
        if (taskDescription != null) {
            return taskDescription;
        }
        TaskDescription taskDescriptionEZpvd = EZpvd(obj);
        OLrzqt = taskDescriptionEZpvd;
        return taskDescriptionEZpvd;
    }

    public final java.lang.Class<?> AEQbTJ(@NotNull java.lang.Object obj) throws java.lang.IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(obj, "");
        java.lang.reflect.Method methodEZpvd = copydefault(obj).EZpvd();
        if (methodEZpvd == null) {
            return null;
        }
        java.lang.Object objInvoke = methodEZpvd.invoke(obj, new java.lang.Object[0]);
        Intrinsics.copydefault(objInvoke, "");
        return (java.lang.Class) objInvoke;
    }

    public final java.lang.reflect.Method OLrzqt(@NotNull java.lang.Object obj) throws java.lang.IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(obj, "");
        java.lang.reflect.Method methodOLrzqt = copydefault(obj).OLrzqt();
        if (methodOLrzqt == null) {
            return null;
        }
        java.lang.Object objInvoke = methodOLrzqt.invoke(obj, new java.lang.Object[0]);
        Intrinsics.copydefault(objInvoke, "");
        return (java.lang.reflect.Method) objInvoke;
    }
}
