package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56722yPx implements InterfaceC56658yNn {
    public static final StateListAnimator fARcdN = new StateListAnimator(null);

    public abstract InterfaceC59098zad AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG);

    public abstract InterfaceC59098zad KWHzl(@NotNull AbstractC59325zes abstractC59325zes, @NotNull AbstractC59287zeG abstractC59287zeG);

    /* JADX INFO: renamed from: bS_ */
    public /* synthetic */ InterfaceC56663yNs bT_() {
        return bT_();
    }

    @Override // o.InterfaceC56665yNu
    /* JADX INFO: renamed from: bT_ */
    public /* synthetic */ InterfaceC56665yNu fJNWhG() {
        return bT_();
    }

    /* JADX INFO: renamed from: o.yPx$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yPx.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final InterfaceC59098zad copydefault(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull AbstractC59287zeG abstractC59287zeG) {
            InterfaceC59098zad interfaceC59098zadAEQbTJ;
            Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
            Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
            AbstractC56722yPx abstractC56722yPx = interfaceC56658yNn instanceof AbstractC56722yPx ? (AbstractC56722yPx) interfaceC56658yNn : null;
            if (abstractC56722yPx != null && (interfaceC59098zadAEQbTJ = abstractC56722yPx.AEQbTJ(abstractC59287zeG)) != null) {
                return interfaceC59098zadAEQbTJ;
            }
            InterfaceC59098zad interfaceC59098zadORxRYg = interfaceC56658yNn.ORxRYg();
            Intrinsics.checkNotNullExpressionValue(interfaceC59098zadORxRYg, "");
            return interfaceC59098zadORxRYg;
        }

        public final InterfaceC59098zad AEQbTJ(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull AbstractC59325zes abstractC59325zes, @NotNull AbstractC59287zeG abstractC59287zeG) {
            InterfaceC59098zad interfaceC59098zadKWHzl;
            Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
            Intrinsics.checkNotNullParameter(abstractC59325zes, "");
            Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
            AbstractC56722yPx abstractC56722yPx = interfaceC56658yNn instanceof AbstractC56722yPx ? (AbstractC56722yPx) interfaceC56658yNn : null;
            if (abstractC56722yPx != null && (interfaceC59098zadKWHzl = abstractC56722yPx.KWHzl(abstractC59325zes, abstractC59287zeG)) != null) {
                return interfaceC59098zadKWHzl;
            }
            InterfaceC59098zad interfaceC59098zadCopydefault = interfaceC56658yNn.copydefault(abstractC59325zes);
            Intrinsics.checkNotNullExpressionValue(interfaceC59098zadCopydefault, "");
            return interfaceC59098zadCopydefault;
        }
    }
}
