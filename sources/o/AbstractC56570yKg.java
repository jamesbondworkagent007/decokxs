package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC56919yXe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yKg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56570yKg {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yKg.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC56570yKg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String OLrzqt();

    private AbstractC56570yKg() {
    }

    /* JADX INFO: renamed from: o.yKg$StateListAnimator */
    public static final class StateListAnimator extends AbstractC56570yKg {
        public final java.lang.String AEQbTJ;
        public final AbstractC56919yXe.TaskDescription EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC56570yKg
        public java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull AbstractC56919yXe.TaskDescription taskDescription) {
            super(null);
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.EZpvd = taskDescription;
            this.AEQbTJ = taskDescription.copydefault();
        }

        public final java.lang.String AEQbTJ() {
            return this.EZpvd.KWHzl();
        }

        public final java.lang.String KWHzl() {
            return this.EZpvd.AEQbTJ();
        }
    }

    /* JADX INFO: renamed from: o.yKg$ActionBar */
    public static final class ActionBar extends AbstractC56570yKg {
        public final java.lang.String AEQbTJ;
        public final AbstractC56919yXe.TaskDescription copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC56570yKg
        public java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AbstractC56919yXe.TaskDescription taskDescription) {
            super(null);
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.copydefault = taskDescription;
            this.AEQbTJ = taskDescription.copydefault();
        }

        public final java.lang.String copydefault() {
            return this.copydefault.AEQbTJ();
        }
    }

    /* JADX INFO: renamed from: o.yKg$Application */
    public static final class Application extends AbstractC56570yKg {
        public final java.lang.reflect.Method AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Method EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.reflect.Method method) {
            super(null);
            Intrinsics.checkNotNullParameter(method, "");
            this.AEQbTJ = method;
        }

        @Override // o.AbstractC56570yKg
        public java.lang.String OLrzqt() {
            return yLW.AEQbTJ(this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.yKg$TaskDescription */
    public static final class TaskDescription extends AbstractC56570yKg {
        public final java.lang.reflect.Constructor<?> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Constructor<?> EZpvd() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.reflect.Constructor<?> constructor) {
            super(null);
            Intrinsics.checkNotNullParameter(constructor, "");
            this.EZpvd = constructor;
        }

        public static final java.lang.CharSequence AEQbTJ(java.lang.Class cls) {
            Intrinsics.copydefault(cls);
            return C56743yQr.KWHzl((java.lang.Class<?>) cls);
        }

        @Override // o.AbstractC56570yKg
        public java.lang.String OLrzqt() {
            java.lang.Class<?>[] parameterTypes = this.EZpvd.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
            return yDV.joinToString$default(parameterTypes, "", "<init>(", ")V", 0, (java.lang.CharSequence) null, C56569yKf.KWHzl, 24, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.yKg$Activity */
    public static final class Activity extends AbstractC56570yKg {
        public final java.lang.Class<?> KWHzl;
        public final java.util.List<java.lang.reflect.Method> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.reflect.Method> copydefault() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.Class<?> cls) {
            super(null);
            Intrinsics.checkNotNullParameter(cls, "");
            this.KWHzl = cls;
            java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "");
            this.OLrzqt = yDV.KWHzl(declaredMethods, new Application());
        }

        public static final java.lang.CharSequence OLrzqt(java.lang.reflect.Method method) {
            java.lang.Class<?> returnType = method.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "");
            return C56743yQr.KWHzl(returnType);
        }

        @Override // o.AbstractC56570yKg
        public java.lang.String OLrzqt() {
            return CollectionsKt___CollectionsKt.joinToString$default(this.OLrzqt, "", "<init>(", ")V", 0, null, C56571yKh.AEQbTJ, 24, null);
        }

        /* JADX INFO: renamed from: o.yKg$Activity$Application */
        public static final class Application<T> implements java.util.Comparator {
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return yET.KWHzl(((java.lang.reflect.Method) t).getName(), ((java.lang.reflect.Method) t2).getName());
            }
        }
    }
}
