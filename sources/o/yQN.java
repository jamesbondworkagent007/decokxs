package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yQN implements InterfaceC56839yUf {
    public static final StateListAnimator AYXKKw = new StateListAnimator(null);

    public abstract java.lang.reflect.Type OLrzqt();

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yQN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final yQN EZpvd(@NotNull java.lang.reflect.Type type) {
            yQN c56747yQv;
            Intrinsics.checkNotNullParameter(type, "");
            boolean z = type instanceof java.lang.Class;
            if (z) {
                java.lang.Class cls = (java.lang.Class) type;
                if (cls.isPrimitive()) {
                    return new yQM(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((java.lang.Class) type).isArray())) {
                c56747yQv = new C56747yQv(type);
            } else {
                c56747yQv = type instanceof WildcardType ? new yQS((WildcardType) type) : new yQC(type);
            }
            return c56747yQv;
        }
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof yQN) && Intrinsics.EZpvd(OLrzqt(), ((yQN) obj).OLrzqt());
    }

    public int hashCode() {
        return OLrzqt().hashCode();
    }

    public java.lang.String toString() {
        return getClass().getName() + ": " + OLrzqt();
    }

    @Override // o.yTM
    public yTO copydefault(C56933yXs c56933yXs) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        java.util.Iterator<T> it = AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            C56929yXo c56929yXoAEQbTJ = ((yTO) next).AEQbTJ();
            if (Intrinsics.EZpvd(c56929yXoAEQbTJ != null ? c56929yXoAEQbTJ.AEQbTJ() : null, c56933yXs)) {
                obj = next;
                break;
            }
        }
        return (yTO) obj;
    }
}
