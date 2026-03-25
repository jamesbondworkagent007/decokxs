package o;

import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.subscribe.OfflinePlan;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC49419uoG;
import o.AbstractC49464uoz;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wvu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C53992wvu implements InterfaceC49575urD {
    public final TradeLiveData<AbstractC49464uoz.Activity> AEQbTJ;
    public final TradeLiveData<AbstractC49419uoG.ActionBar> EZpvd;
    public final TradeLiveData<xMJ.TaskDescription> KWHzl;
    public final TradeLiveData<xMJ.StateListAnimator> OLrzqt;
    public final C54060wxI copydefault;
    public final TradeLiveData<OfflinePlan> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd()Landroidx/lifecycle/LiveData; */
    @Override // o.InterfaceC49575urD
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public TradeLiveData<AbstractC49419uoG.ActionBar> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl()Landroidx/lifecycle/LiveData; */
    @Override // o.InterfaceC49575urD
    /* JADX INFO: renamed from: fetchVPNInfo, reason: merged with bridge method [inline-methods] */
    public TradeLiveData<OfflinePlan> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Landroidx/lifecycle/LiveData; */
    @Override // o.InterfaceC49575urD
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public TradeLiveData<AbstractC49464uoz.Activity> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault()Landroidx/lifecycle/LiveData; */
    @Override // o.InterfaceC49575urD
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public TradeLiveData<xMJ.TaskDescription> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/lifecycle/LiveData; */
    @Override // o.InterfaceC49575urD
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public TradeLiveData<xMJ.StateListAnimator> OLrzqt() {
        return this.OLrzqt;
    }

    public C53992wvu(@NotNull C54060wxI c54060wxI) {
        Intrinsics.checkNotNullParameter(c54060wxI, "");
        this.copydefault = c54060wxI;
        this.OLrzqt = c54060wxI.gEmmrt();
        this.KWHzl = c54060wxI.AEQbTJ();
        this.EZpvd = c54060wxI.OLrzqt();
        this.AEQbTJ = c54060wxI.KWHzl();
        this.valueOf = c54060wxI.AhwBna();
    }

    @Override // o.InterfaceC49577urF
    public void AhwBna() {
        this.copydefault.AYXKKw();
    }

    @Override // o.InterfaceC49577urF
    public void djBIcL() {
        this.copydefault.valueOf();
    }
}
