package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yTE extends C59271zdr {

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    @Override // o.C59271zdr
    public InterfaceC59317zek OLrzqt(@NotNull InterfaceC56691yOt interfaceC56691yOt, @NotNull C59274zdu c59274zdu, @NotNull C59320zen c59320zen, @NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        Intrinsics.checkNotNullParameter(c59274zdu, "");
        Intrinsics.checkNotNullParameter(c59320zen, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        if (!(c59274zdu instanceof C56829yTw)) {
            return super.OLrzqt(interfaceC56691yOt, c59274zdu, c59320zen, abstractC59233zdF);
        }
        C56829yTw c56829yTwKWHzl = (C56829yTw) c59274zdu;
        if (!c56829yTwKWHzl.djBIcL()) {
            c56829yTwKWHzl = c56829yTwKWHzl.KWHzl(JavaTypeFlexibility.INFLEXIBLE);
        }
        int i = Activity.OLrzqt[c56829yTwKWHzl.KWHzl().ordinal()];
        if (i == 1) {
            return new C59323zeq(Variance.INVARIANT, abstractC59233zdF);
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!interfaceC56691yOt.values().getAllowsOutPosition()) {
            return new C59323zeq(Variance.INVARIANT, yZE.AEQbTJ(interfaceC56691yOt).getFieldNames());
        }
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdF.djBIcL().copydefault(), "");
        if (!r6.isEmpty()) {
            return new C59323zeq(Variance.OUT_VARIANCE, abstractC59233zdF);
        }
        InterfaceC59317zek interfaceC59317zekEZpvd = C59322zep.EZpvd(interfaceC56691yOt, c56829yTwKWHzl);
        Intrinsics.copydefault(interfaceC59317zekEZpvd);
        return interfaceC59317zekEZpvd;
    }
}
