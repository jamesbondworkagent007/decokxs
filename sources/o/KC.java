package o;

import com.amplitude.core.platform.plugins.AmplitudeDestination$enqueue$1$1;
import com.amplitude.core.platform.plugins.AmplitudeDestination$flush$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KC extends AbstractC5252Ko {
    public C5261Kx AEQbTJ;
    public C5255Kr AYXKKw;

    @Override // o.InterfaceC5256Ks
    public C5242Ke KWHzl(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        AEQbTJ(c5242Ke);
        return c5242Ke;
    }

    @Override // o.InterfaceC5256Ks
    public C5249Kl OLrzqt(@NotNull C5249Kl c5249Kl) {
        Intrinsics.checkNotNullParameter(c5249Kl, "");
        AEQbTJ(c5249Kl);
        return c5249Kl;
    }

    @Override // o.InterfaceC5256Ks
    public C5248Kk AEQbTJ(@NotNull C5248Kk c5248Kk) {
        Intrinsics.checkNotNullParameter(c5248Kk, "");
        AEQbTJ((C5242Ke) c5248Kk);
        return c5248Kk;
    }

    @Override // o.InterfaceC5256Ks
    public C5251Kn copydefault(@NotNull C5251Kn c5251Kn) {
        Intrinsics.checkNotNullParameter(c5251Kn, "");
        AEQbTJ(c5251Kn);
        return c5251Kn;
    }

    @Override // o.InterfaceC5256Ks
    public void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(OLrzqt().AYXKKw(), OLrzqt().fJNWhG(), null, new AmplitudeDestination$flush$1(this, null), 2, null);
    }

    public final void AEQbTJ(C5242Ke c5242Ke) {
        if (c5242Ke != null) {
            if (c5242Ke.djBIcL()) {
                BuildersKt__Builders_commonKt.launch$default(OLrzqt().AYXKKw(), OLrzqt().fJNWhG(), null, new AmplitudeDestination$enqueue$1$1(this, c5242Ke, null), 2, null);
                return;
            }
            OLrzqt().DbNXlk().KWHzl("Event is invalid for missing information like userId and deviceId. Dropping event: " + c5242Ke.copydefault());
        }
    }

    public final void OLrzqt(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        C5255Kr c5255Kr = this.AYXKKw;
        if (c5255Kr == null) {
            Intrinsics.gEmmrt("");
            c5255Kr = null;
        }
        c5255Kr.EZpvd(c5242Ke);
    }

    @Override // o.AbstractC5252Ko, com.amplitude.core.platform.Plugin
    public void KWHzl(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        super.KWHzl(jz);
        C5255Kr c5255Kr = new C5255Kr(jz);
        this.AYXKKw = c5255Kr;
        c5255Kr.AkhnZx();
        this.AEQbTJ = new C5261Kx(jz.fetchVPNInfo(), jz, jz.DbNXlk(), jz.djBIcL(), this);
        AEQbTJ(new KF());
    }
}
