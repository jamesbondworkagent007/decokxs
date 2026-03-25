package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gMa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19699gMa {
    public final C19703gMe AEQbTJ;
    public final kVV EZpvd;
    public final C19700gMb KWHzl;

    @yCM
    public C19699gMa(@NotNull C19703gMe c19703gMe, @NotNull C19700gMb c19700gMb, @NotNull kVV kvv) {
        Intrinsics.checkNotNullParameter(c19703gMe, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(kvv, "");
        this.AEQbTJ = c19703gMe;
        this.KWHzl = c19700gMb;
        this.EZpvd = kvv;
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.EZpvd.EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) str)) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        java.lang.Boolean boolValueOf = defiChainInfo != null ? java.lang.Boolean.valueOf(defiChainInfo.getSupportSmartAccount()) : null;
        gLQ glqAEQbTJ = this.AEQbTJ.AEQbTJ(str, boolValueOf != null ? boolValueOf.booleanValue() : false, false);
        boolean zAEQbTJ = glqAEQbTJ != null ? glqAEQbTJ.AEQbTJ() : false;
        boolean zDjBIcL = this.KWHzl.djBIcL();
        pUU.KWHzl("TeeEnableUseCase", "quick market, chainId=" + str + ", supportSmartAccount=" + boolValueOf + "  canUseSmartAccount= " + zAEQbTJ + "  teeActiveAndABTestEnabled= " + zDjBIcL);
        return zDjBIcL && zAEQbTJ;
    }
}
