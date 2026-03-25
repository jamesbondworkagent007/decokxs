package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.jvm.internal.Intrinsics;
import o.gTA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gSu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19881gSu {
    public final kKG EZpvd;

    @yCM
    public C19881gSu(@NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(kkg, "");
        this.EZpvd = kkg;
    }

    public final gTA copydefault(DefiChainInfo defiChainInfo, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return gTA.StateListAnimator.OLrzqt;
        }
        if (defiChainInfo == null) {
            return new gTA.ActionBar(str);
        }
        if (C59449zhJ.gEmmrt(this.EZpvd.copydefault(defiChainInfo.getChainId()), str, true)) {
            return gTA.Application.copydefault;
        }
        if (!this.EZpvd.AEQbTJ(str, C33129mqd.valueOf(defiChainInfo.getChainId()))) {
            return new gTA.Activity(defiChainInfo.getChainName());
        }
        return new gTA.ActionBar(str);
    }
}
