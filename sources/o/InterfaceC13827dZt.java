package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dZt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13827dZt<T> {
    T copydefault();

    /* JADX INFO: renamed from: o.dZt$ActionBar */
    public static final class ActionBar<T> implements InterfaceC13827dZt<T> {
        public final T OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC13827dZt
        public T copydefault() {
            return this.OLrzqt;
        }

        public ActionBar(@NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
            this.OLrzqt = t;
        }
    }

    /* JADX INFO: renamed from: o.dZt$StateListAnimator */
    public static final class StateListAnimator<T> implements InterfaceC13827dZt<T> {
        public final T copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Illegal instructions before constructor call */
        public StateListAnimator() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            this(defaultConstructorMarker, 1, defaultConstructorMarker);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC13827dZt
        public T copydefault() {
            return this.copydefault;
        }

        public StateListAnimator(T t) {
            this.copydefault = t;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r1v0 java.lang.Object))
 A[MD:(T):void (m)] (LINE:16) call: o.dZt.StateListAnimator.<init>(java.lang.Object):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj);
        }
    }

    /* JADX INFO: renamed from: o.dZt$Application */
    public static final class Application<T> implements InterfaceC13827dZt<T> {
        public final T KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Illegal instructions before constructor call */
        public Application() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            this(defaultConstructorMarker, 1, defaultConstructorMarker);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC13827dZt
        public T copydefault() {
            return this.KWHzl;
        }

        public Application(T t) {
            this.KWHzl = t;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r1v0 java.lang.Object))
 A[MD:(T):void (m)] (LINE:17) call: o.dZt.Application.<init>(java.lang.Object):void type: THIS */
        public /* synthetic */ Application(java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj);
        }
    }
}
