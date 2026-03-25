package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yYX {
    public static final AbstractC59233zdF KWHzl(@NotNull InterfaceC59317zek interfaceC59317zek) {
        Intrinsics.checkNotNullParameter(interfaceC59317zek, "");
        return new yYW(interfaceC59317zek, null, false, null, 14, null);
    }

    public static final boolean OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return abstractC59233zdF.djBIcL() instanceof yYZ;
    }

    public static /* synthetic */ AbstractC59325zes wrapWithCapturingSubstitution$default(AbstractC59325zes abstractC59325zes, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return AEQbTJ(abstractC59325zes, z);
    }

    public static final AbstractC59325zes AEQbTJ(@NotNull AbstractC59325zes abstractC59325zes, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC59325zes, "");
        if (abstractC59325zes instanceof C59276zdw) {
            C59276zdw c59276zdw = (C59276zdw) abstractC59325zes;
            InterfaceC56691yOt[] interfaceC56691yOtArrOLrzqt = c59276zdw.OLrzqt();
            java.util.List<kotlin.Pair> listAEQbTJ = yDV.AEQbTJ(c59276zdw.KWHzl(), c59276zdw.OLrzqt());
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (kotlin.Pair pair : listAEQbTJ) {
                arrayList.add(EZpvd((InterfaceC59317zek) pair.getFirst(), (InterfaceC56691yOt) pair.getSecond()));
            }
            return new C59276zdw(interfaceC56691yOtArrOLrzqt, (InterfaceC59317zek[]) arrayList.toArray(new InterfaceC59317zek[0]), z);
        }
        return new StateListAnimator(abstractC59325zes, z);
    }

    public static final class StateListAnimator extends C59264zdk {
        public final /* synthetic */ boolean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C59264zdk, o.AbstractC59325zes
        public boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(AbstractC59325zes abstractC59325zes, boolean z) {
            super(abstractC59325zes);
            this.EZpvd = z;
        }

        @Override // o.C59264zdk, o.AbstractC59325zes
        public InterfaceC59317zek copydefault(AbstractC59233zdF abstractC59233zdF) {
            Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
            InterfaceC59317zek interfaceC59317zekCopydefault = super.copydefault(abstractC59233zdF);
            if (interfaceC59317zekCopydefault == null) {
                return null;
            }
            InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().OLrzqt();
            return yYX.EZpvd(interfaceC59317zekCopydefault, interfaceC56663yNsKWHzl instanceof InterfaceC56691yOt ? (InterfaceC56691yOt) interfaceC56663yNsKWHzl : null);
        }
    }

    public static final InterfaceC59317zek EZpvd(InterfaceC59317zek interfaceC59317zek, InterfaceC56691yOt interfaceC56691yOt) {
        if (interfaceC56691yOt == null || interfaceC59317zek.EZpvd() == Variance.INVARIANT) {
            return interfaceC59317zek;
        }
        if (interfaceC56691yOt.values() == interfaceC59317zek.EZpvd()) {
            if (interfaceC59317zek.AEQbTJ()) {
                InterfaceC59187zcM interfaceC59187zcM = LockBasedStorageManager.KWHzl;
                Intrinsics.checkNotNullExpressionValue(interfaceC59187zcM, "");
                return new C59323zeq(new C59234zdG(interfaceC59187zcM, new yYY(interfaceC59317zek)));
            }
            return new C59323zeq(interfaceC59317zek.OLrzqt());
        }
        return new C59323zeq(KWHzl(interfaceC59317zek));
    }

    public static final AbstractC59233zdF EZpvd(InterfaceC59317zek interfaceC59317zek) {
        AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
        return abstractC59233zdFOLrzqt;
    }
}
