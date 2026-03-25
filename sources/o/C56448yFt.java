package o;

import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yFt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56448yFt {
    public static TaskDescription OLrzqt;
    public static final C56448yFt copydefault = new C56448yFt();
    public static final TaskDescription AEQbTJ = new TaskDescription(null, null, null);

    /* JADX INFO: renamed from: o.yFt$TaskDescription */
    public static final class TaskDescription {
        public final java.lang.reflect.Method AEQbTJ;
        public final java.lang.reflect.Method KWHzl;
        public final java.lang.reflect.Method OLrzqt;

        public TaskDescription(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3) {
            this.AEQbTJ = method;
            this.OLrzqt = method2;
            this.KWHzl = method3;
        }
    }

    private C56448yFt() {
    }

    public final java.lang.String OLrzqt(@NotNull BaseContinuationImpl baseContinuationImpl) {
        java.lang.reflect.Method method;
        java.lang.Object objInvoke;
        java.lang.reflect.Method method2;
        java.lang.Object objInvoke2;
        Intrinsics.checkNotNullParameter(baseContinuationImpl, "");
        TaskDescription taskDescriptionCopydefault = OLrzqt;
        if (taskDescriptionCopydefault == null) {
            taskDescriptionCopydefault = copydefault(baseContinuationImpl);
        }
        if (taskDescriptionCopydefault == AEQbTJ || (method = taskDescriptionCopydefault.AEQbTJ) == null || (objInvoke = method.invoke(baseContinuationImpl.getClass(), new java.lang.Object[0])) == null || (method2 = taskDescriptionCopydefault.OLrzqt) == null || (objInvoke2 = method2.invoke(objInvoke, new java.lang.Object[0])) == null) {
            return null;
        }
        java.lang.reflect.Method method3 = taskDescriptionCopydefault.KWHzl;
        java.lang.Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new java.lang.Object[0]) : null;
        if (objInvoke3 instanceof java.lang.String) {
            return (java.lang.String) objInvoke3;
        }
        return null;
    }

    public final TaskDescription copydefault(BaseContinuationImpl baseContinuationImpl) {
        try {
            TaskDescription taskDescription = new TaskDescription(java.lang.Class.class.getDeclaredMethod("getModule", new java.lang.Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new java.lang.Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new java.lang.Class[0]));
            OLrzqt = taskDescription;
            return taskDescription;
        } catch (java.lang.Exception unused) {
            TaskDescription taskDescription2 = AEQbTJ;
            OLrzqt = taskDescription2;
            return taskDescription2;
        }
    }
}
