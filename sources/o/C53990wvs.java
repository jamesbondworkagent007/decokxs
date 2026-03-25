package o;

import androidx.lifecycle.TradeLiveData;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC49464uoz;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wvs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C53990wvs implements InterfaceC49623urz {
    public final TradeLiveData<xMJ.StateListAnimator> AEQbTJ;
    public final C54059wxH EZpvd;
    public final TradeLiveData<AbstractC49464uoz.Activity> OLrzqt;
    public final TradeLiveData<xMJ.TaskDescription> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault()Landroidx/lifecycle/LiveData; */
    @Override // o.InterfaceC49623urz
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public TradeLiveData<xMJ.StateListAnimator> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Landroidx/lifecycle/LiveData; */
    @Override // o.InterfaceC49623urz
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TradeLiveData<xMJ.TaskDescription> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/lifecycle/LiveData; */
    @Override // o.InterfaceC49623urz
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public TradeLiveData<AbstractC49464uoz.Activity> OLrzqt() {
        return this.OLrzqt;
    }

    public C53990wvs(@NotNull C54059wxH c54059wxH) {
        Intrinsics.checkNotNullParameter(c54059wxH, "");
        this.EZpvd = c54059wxH;
        this.AEQbTJ = c54059wxH.OLrzqt();
        this.copydefault = c54059wxH.KWHzl();
        this.OLrzqt = c54059wxH.EZpvd();
    }

    @Override // o.InterfaceC49577urF
    public void AhwBna() {
        this.EZpvd.AEQbTJ();
    }

    @Override // o.InterfaceC49577urF
    public void djBIcL() {
        this.EZpvd.AhwBna();
    }
}
