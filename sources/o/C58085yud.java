package o;

import androidx.work.WorkRequest;
import java.lang.reflect.InvocationHandler;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58096yuo;
import o.AbstractC58107yuz;
import o.C58061yuF;
import o.C58089yuh;
import o.C58093yul;
import o.InterfaceC58026ytX;
import o.InterfaceC58091yuj;
import o.InterfaceC58092yuk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58085yud {
    public final AbstractC58057yuB EZpvd;
    public final C58089yuh.Application copydefault;

    public C58085yud(@NotNull AbstractC58057yuB abstractC58057yuB, @NotNull C58089yuh.Application application) {
        Intrinsics.checkNotNullParameter(abstractC58057yuB, "");
        Intrinsics.checkNotNullParameter(application, "");
        this.EZpvd = abstractC58057yuB;
        this.copydefault = application;
    }

    public final <T> T copydefault(@NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return (T) OLrzqt(cls);
    }

    public final <T> T OLrzqt(java.lang.Class<T> cls) {
        C58089yuh c58089yuhOLrzqt = this.copydefault.OLrzqt(cls);
        c58089yuhOLrzqt.KWHzl();
        return cls.cast(java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, KWHzl(cls, c58089yuhOLrzqt)));
    }

    public final InvocationHandler KWHzl(final java.lang.Class<?> cls, final C58089yuh c58089yuh) {
        return new InvocationHandler() { // from class: o.yue
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.reflect.InvocationHandler
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                return C58085yud.OLrzqt(this.AEQbTJ, cls, c58089yuh, obj, method, objArr);
            }
        };
    }

    public static final java.lang.Object OLrzqt(C58085yud c58085yud, java.lang.Class cls, C58089yuh c58089yuh, java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        Intrinsics.checkNotNullParameter(c58085yud, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(c58089yuh, "");
        if (objArr == null) {
            objArr = new java.lang.Object[0];
        }
        java.lang.Object[] objArr2 = objArr;
        AbstractC58057yuB abstractC58057yuB = c58085yud.EZpvd;
        Intrinsics.checkNotNullExpressionValue(method, "");
        if (abstractC58057yuB.copydefault(method)) {
            AbstractC58057yuB abstractC58057yuB2 = c58085yud.EZpvd;
            Intrinsics.checkNotNullExpressionValue(obj, "");
            return abstractC58057yuB2.AEQbTJ(method, cls, obj, objArr2);
        }
        if (!c58085yud.KWHzl(method)) {
            return c58089yuh.EZpvd(method, objArr2);
        }
        Intrinsics.checkNotNullExpressionValue(obj, "");
        return c58085yud.copydefault(method, c58089yuh, cls, obj, objArr2);
    }

    public final boolean KWHzl(java.lang.reflect.Method method) {
        return Intrinsics.EZpvd(method.getDeclaringClass(), java.lang.Object.class);
    }

    public final java.lang.Object copydefault(java.lang.reflect.Method method, C58089yuh c58089yuh, java.lang.Class<?> cls, java.lang.Object obj, java.lang.Object[] objArr) {
        if (EZpvd(method)) {
            return java.lang.Boolean.valueOf(obj == objArr[0]);
        }
        if (AEQbTJ(method)) {
            return "Scarlet service implementation for " + cls.getName();
        }
        if (copydefault(method)) {
            return java.lang.Integer.valueOf(c58089yuh.hashCode());
        }
        throw new java.lang.IllegalStateException("Cannot execute " + method);
    }

    public final boolean copydefault(java.lang.reflect.Method method) {
        if (Intrinsics.EZpvd((java.lang.Object) method.getName(), (java.lang.Object) "hashCode")) {
            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
            if (parameterTypes.length == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean AEQbTJ(java.lang.reflect.Method method) {
        if (Intrinsics.EZpvd((java.lang.Object) method.getName(), (java.lang.Object) "toString")) {
            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
            if (parameterTypes.length == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean EZpvd(java.lang.reflect.Method method) {
        return Intrinsics.EZpvd((java.lang.Object) method.getName(), (java.lang.Object) "equals") && java.util.Arrays.equals(new java.lang.Class[]{java.lang.Object.class}, method.getParameterTypes());
    }

    /* JADX INFO: renamed from: o.yud$Activity */
    public static final class Activity {
        public static final AbstractC58253yxm copydefault;
        public InterfaceC58092yuk.Application DbNXlk;
        private static final TaskDescription Companion = new TaskDescription(null);
        public static final C58066yuK OLrzqt = new C58066yuK(null, 1, null);
        public static final long EZpvd = 1000;
        public static final long AEQbTJ = WorkRequest.MIN_BACKOFF_MILLIS;
        public static final C58078yuW KWHzl = new C58078yuW(1000, WorkRequest.MIN_BACKOFF_MILLIS);
        public InterfaceC58028ytZ gEmmrt = OLrzqt;
        public InterfaceC58080yuY djBIcL = KWHzl;
        public final java.util.List<InterfaceC58026ytX.TaskDescription> AhwBna = new java.util.ArrayList();
        public final java.util.List<InterfaceC58091yuj.TaskDescription> AYXKKw = new java.util.ArrayList();
        public final AbstractC58057yuB valueOf = AbstractC58057yuB.Companion.AEQbTJ();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull InterfaceC58028ytZ interfaceC58028ytZ) {
            Intrinsics.checkNotNullParameter(interfaceC58028ytZ, "");
            this.gEmmrt = interfaceC58028ytZ;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull InterfaceC58080yuY interfaceC58080yuY) {
            Intrinsics.checkNotNullParameter(interfaceC58080yuY, "");
            this.djBIcL = interfaceC58080yuY;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull InterfaceC58092yuk.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            this.DbNXlk = application;
            return this;
        }

        public final Activity AEQbTJ(@NotNull InterfaceC58026ytX.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.AhwBna.add(taskDescription);
            return this;
        }

        public final Activity KWHzl(@NotNull InterfaceC58091yuj.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.AYXKKw.add(taskDescription);
            return this;
        }

        public final C58085yud copydefault() {
            return new C58085yud(this.valueOf, KWHzl());
        }

        public final C58089yuh.Application KWHzl() {
            return new C58089yuh.Application(OLrzqt(), EZpvd());
        }

        public final C58093yul.Activity OLrzqt() {
            InterfaceC58028ytZ interfaceC58028ytZ = this.gEmmrt;
            InterfaceC58092yuk.Application application = this.DbNXlk;
            if (application != null) {
                return new C58093yul.Activity(interfaceC58028ytZ, application, this.djBIcL, copydefault);
            }
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }

        public final C58061yuF.StateListAnimator EZpvd() {
            C58056yuA c58056yuAAEQbTJ = AEQbTJ();
            C58059yuD c58059yuDAYXKKw = AYXKKw();
            AbstractC58096yuo.TaskDescription taskDescription = new AbstractC58096yuo.TaskDescription(c58056yuAAEQbTJ);
            return new C58061yuF.StateListAnimator(this.valueOf, new AbstractC58107yuz.Application.ActionBar(c58056yuAAEQbTJ), new AbstractC58107yuz.StateListAnimator.ActionBar(copydefault, taskDescription, c58059yuDAYXKKw));
        }

        public final C58056yuA AEQbTJ() {
            java.util.List<InterfaceC58026ytX.TaskDescription> list = this.AhwBna;
            list.add(new C58075yuT());
            return new C58056yuA(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list));
        }

        public final C58059yuD AYXKKw() {
            java.util.List<InterfaceC58091yuj.TaskDescription> list = this.AYXKKw;
            list.add(new C58136yvb());
            return new C58059yuD(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list));
        }

        /* JADX INFO: renamed from: o.yud$Activity$TaskDescription */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yud.Activity.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }
        }

        static {
            AbstractC58253yxm abstractC58253yxmKWHzl = yBP.KWHzl();
            Intrinsics.checkNotNullExpressionValue(abstractC58253yxmKWHzl, "");
            copydefault = abstractC58253yxmKWHzl;
        }
    }
}
