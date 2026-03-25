package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58057yuB {
    public static final AbstractC58057yuB AEQbTJ;
    public static final TaskDescription Companion;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yuB.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC58057yuB(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault(@NotNull java.lang.reflect.Method method) {
        Intrinsics.checkNotNullParameter(method, "");
        return false;
    }

    private AbstractC58057yuB() {
    }

    public java.lang.Object AEQbTJ(@NotNull java.lang.reflect.Method method, @NotNull java.lang.Class<?> cls, @NotNull java.lang.Object obj, @NotNull java.lang.Object[]... objArr) {
        Intrinsics.checkNotNullParameter(method, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: o.yuB$Activity */
    public static final class Activity extends AbstractC58057yuB {
        public Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.yuB$ActionBar */
    public static final class ActionBar extends AbstractC58057yuB {
        public ActionBar() {
            super(null);
        }

        @Override // o.AbstractC58057yuB
        public boolean copydefault(@NotNull java.lang.reflect.Method method) {
            Intrinsics.checkNotNullParameter(method, "");
            return method.isDefault();
        }

        @Override // o.AbstractC58057yuB
        public java.lang.Object AEQbTJ(@NotNull java.lang.reflect.Method method, @NotNull java.lang.Class<?> cls, @NotNull java.lang.Object obj, @NotNull java.lang.Object[]... objArr) throws java.lang.Throwable {
            Intrinsics.checkNotNullParameter(method, "");
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(objArr, "");
            java.lang.reflect.Constructor declaredConstructor = C58058yuC.copydefault().getDeclaredConstructor(java.lang.Class.class, java.lang.Integer.TYPE);
            declaredConstructor.setAccessible(true);
            java.lang.Object objInvokeWithArguments = C58060yuE.dL_(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
            Intrinsics.checkNotNullExpressionValue(objInvokeWithArguments, "");
            return objInvokeWithArguments;
        }
    }

    /* JADX INFO: renamed from: o.yuB$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yuB.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AbstractC58057yuB AEQbTJ() {
            return AbstractC58057yuB.AEQbTJ;
        }

        public final AbstractC58057yuB EZpvd() {
            try {
                java.lang.Class.forName("java.util.Optional");
                return new ActionBar();
            } catch (java.lang.ClassNotFoundException unused) {
                return new Activity();
            }
        }
    }

    static {
        TaskDescription taskDescription = new TaskDescription(null);
        Companion = taskDescription;
        AEQbTJ = taskDescription.EZpvd();
    }
}
