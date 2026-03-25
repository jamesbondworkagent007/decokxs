package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ySq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56796ySq implements InterfaceC56802ySw {
    public final InterfaceC56665yNu AEQbTJ;
    public final java.util.Map<InterfaceC56843yUj, java.lang.Integer> EZpvd;
    public final int KWHzl;
    public final InterfaceC59179zcE<InterfaceC56843yUj, C56830yTx> OLrzqt;
    public final C56794ySo copydefault;

    public C56796ySq(@NotNull C56794ySo c56794ySo, @NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull InterfaceC56847yUn interfaceC56847yUn, int i) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(interfaceC56847yUn, "");
        this.copydefault = c56794ySo;
        this.AEQbTJ = interfaceC56665yNu;
        this.KWHzl = i;
        this.EZpvd = C59433zgu.copydefault(interfaceC56847yUn.getNewProxyInstance());
        this.OLrzqt = c56794ySo.EZpvd().OLrzqt(new C56801ySv(this));
    }

    public static final C56830yTx OLrzqt(C56796ySq c56796ySq, InterfaceC56843yUj interfaceC56843yUj) {
        Intrinsics.checkNotNullParameter(interfaceC56843yUj, "");
        java.lang.Integer num = c56796ySq.EZpvd.get(interfaceC56843yUj);
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        return new C56830yTx(C56784ySe.OLrzqt(C56784ySe.EZpvd(c56796ySq.copydefault, c56796ySq), c56796ySq.AEQbTJ.copydefault()), interfaceC56843yUj, c56796ySq.KWHzl + iIntValue, c56796ySq.AEQbTJ);
    }

    @Override // o.InterfaceC56802ySw
    public InterfaceC56691yOt OLrzqt(@NotNull InterfaceC56843yUj interfaceC56843yUj) {
        Intrinsics.checkNotNullParameter(interfaceC56843yUj, "");
        C56830yTx c56830yTxInvoke = this.OLrzqt.invoke(interfaceC56843yUj);
        return c56830yTxInvoke != null ? c56830yTxInvoke : this.copydefault.AhwBna().OLrzqt(interfaceC56843yUj);
    }
}
