package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC56628yMk;
import o.InterfaceC56627yMj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yMi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56626yMi implements InterfaceC56627yMj<java.lang.reflect.Method> {
    public final java.lang.reflect.Type AEQbTJ;
    public final java.util.List<java.lang.reflect.Type> KWHzl;
    public final java.lang.reflect.Method copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.reflect.Method), (r2v0 java.util.List) A[MD:(java.lang.reflect.Method, java.util.List<? extends java.lang.reflect.Type>):void (m)] call: o.yMi.<init>(java.lang.reflect.Method, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC56626yMi(java.lang.reflect.Method method, java.util.List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56627yMj
    public final java.util.List<java.lang.reflect.Type> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/reflect/Member; */
    @Override // o.InterfaceC56627yMj
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public final java.lang.reflect.Method OLrzqt() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56627yMj
    public final java.lang.reflect.Type copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.lang.reflect.Type> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC56626yMi(java.lang.reflect.Method method, java.util.List<? extends java.lang.reflect.Type> list) {
        this.copydefault = method;
        this.KWHzl = list;
        java.lang.Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "");
        this.AEQbTJ = returnType;
    }

    @Override // o.InterfaceC56627yMj
    public boolean EZpvd() {
        return InterfaceC56627yMj.Application.AEQbTJ(this);
    }

    public void copydefault(@NotNull java.lang.Object[] objArr) {
        InterfaceC56627yMj.Application.AEQbTJ(this, objArr);
    }

    public final java.lang.Object copydefault(java.lang.Object obj, @NotNull java.lang.Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return this.copydefault.invoke(obj, java.util.Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: o.yMi$Activity */
    public static final class Activity extends AbstractC56626yMi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.reflect.Method method) {
            super(method, C56402yEa.EZpvd(method.getDeclaringClass()), null);
            Intrinsics.checkNotNullParameter(method, "");
        }

        @Override // o.InterfaceC56627yMj
        public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            copydefault(objArr);
            java.lang.Object obj = objArr[0];
            AbstractC56628yMk.ActionBar actionBar = AbstractC56628yMk.EZpvd;
            return copydefault(obj, objArr.length <= 1 ? new java.lang.Object[0] : yDT.copydefault(objArr, 1, objArr.length));
        }
    }

    /* JADX INFO: renamed from: o.yMi$StateListAnimator */
    public static final class StateListAnimator extends AbstractC56626yMi implements InterfaceC56624yMg {
        public final java.lang.Object OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.reflect.Method method, java.lang.Object obj) {
            super(method, yDY.AhwBna(), null);
            Intrinsics.checkNotNullParameter(method, "");
            this.OLrzqt = obj;
        }

        @Override // o.InterfaceC56627yMj
        public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            copydefault(objArr);
            return copydefault(this.OLrzqt, objArr);
        }
    }
}
