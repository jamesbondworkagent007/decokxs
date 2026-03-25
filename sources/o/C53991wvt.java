package o;

import androidx.lifecycle.TradeLiveData;
import kotlin.jvm.internal.Intrinsics;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wvt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C53991wvt implements InterfaceC49572urA {
    public static final int copydefault;
    public final TradeLiveData<xMJ.TaskDescription> AEQbTJ;
    public final C54064wxM EZpvd;
    public final TradeLiveData<xMJ.StateListAnimator> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = TradeLiveData.$stable;
        copydefault = i | i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl()Landroidx/lifecycle/LiveData; */
    @Override // o.InterfaceC49572urA
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public TradeLiveData<xMJ.StateListAnimator> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault()Landroidx/lifecycle/LiveData; */
    @Override // o.InterfaceC49572urA
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public TradeLiveData<xMJ.TaskDescription> copydefault() {
        return this.AEQbTJ;
    }

    public C53991wvt(@NotNull C54064wxM c54064wxM) {
        Intrinsics.checkNotNullParameter(c54064wxM, "");
        this.EZpvd = c54064wxM;
        this.OLrzqt = c54064wxM.OLrzqt();
        this.AEQbTJ = c54064wxM.AEQbTJ();
    }

    @Override // o.InterfaceC49577urF
    public void AhwBna() {
        this.EZpvd.EZpvd();
    }

    @Override // o.InterfaceC49577urF
    public void djBIcL() {
        this.EZpvd.KWHzl();
    }
}
