package o;

import androidx.lifecycle.TradeLiveData;
import kotlin.jvm.internal.Intrinsics;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wvv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C53993wvv implements InterfaceC49622ury {
    public static final int AEQbTJ;
    public final TradeLiveData<xMJ.StateListAnimator> EZpvd;
    public final TradeLiveData<xMJ.TaskDescription> KWHzl;
    public final C54063wxL copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = TradeLiveData.$stable;
        AEQbTJ = i | i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Landroidx/lifecycle/LiveData; */
    @Override // o.InterfaceC49622ury
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TradeLiveData<xMJ.TaskDescription> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl()Landroidx/lifecycle/LiveData; */
    @Override // o.InterfaceC49622ury
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public TradeLiveData<xMJ.StateListAnimator> KWHzl() {
        return this.EZpvd;
    }

    public C53993wvv(@NotNull C54063wxL c54063wxL) {
        Intrinsics.checkNotNullParameter(c54063wxL, "");
        this.copydefault = c54063wxL;
        this.EZpvd = c54063wxL.AEQbTJ();
        this.KWHzl = c54063wxL.OLrzqt();
    }

    @Override // o.InterfaceC49577urF
    public void AhwBna() {
        this.copydefault.copydefault();
    }

    @Override // o.InterfaceC49577urF
    public void djBIcL() {
        this.copydefault.KWHzl();
    }
}
