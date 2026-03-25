package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wxI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C54060wxI extends AbstractC49590urS {
    public final boolean AkhnZx;
    public final C53964wvS fetchVPNInfo;

    public C54060wxI(@NotNull C53964wvS c53964wvS, boolean z) {
        Intrinsics.checkNotNullParameter(c53964wvS, "");
        this.AkhnZx = z;
        this.fetchVPNInfo = c53964wvS;
    }

    public void AYXKKw() {
        if (this.AkhnZx) {
            this.fetchVPNInfo.KWHzl().observeForever(EZpvd());
            this.fetchVPNInfo.copydefault().observeForever(copydefault());
            this.fetchVPNInfo.AEQbTJ().observeForever(djBIcL());
        } else {
            this.fetchVPNInfo.djBIcL().observeForever(EZpvd());
            this.fetchVPNInfo.AYXKKw().observeForever(copydefault());
            this.fetchVPNInfo.valueOf().observeForever(djBIcL());
        }
    }

    public void valueOf() {
        if (this.AkhnZx) {
            this.fetchVPNInfo.KWHzl().removeObserver(EZpvd());
            this.fetchVPNInfo.copydefault().removeObserver(copydefault());
            this.fetchVPNInfo.AEQbTJ().removeObserver(djBIcL());
        } else {
            this.fetchVPNInfo.djBIcL().removeObserver(EZpvd());
            this.fetchVPNInfo.AYXKKw().removeObserver(copydefault());
            this.fetchVPNInfo.valueOf().removeObserver(djBIcL());
        }
    }
}
