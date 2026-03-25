package o;

import com.okinc.lifecycle.impl.deeplink.core.AnalyticsLinkType;
import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.modular.deeplinkv2.LinkSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pMG implements pMH {
    public final pMX EZpvd;
    public final InterfaceC38081pLn OLrzqt;

    @yCM
    public pMG(@NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull pMX pmx) {
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(pmx, "");
        this.OLrzqt = interfaceC38081pLn;
        this.EZpvd = pmx;
    }

    @Override // o.pMH
    public boolean EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.AEQbTJ(str, LinkSource.IN_APP, AnalyticsLinkType.PROCESS_EXTERNAL_LINK);
        if (this.EZpvd.EZpvd(str)) {
            this.OLrzqt.OLrzqt(LinkState.LINK_OPENED_EXTERNALLY);
            return true;
        }
        this.OLrzqt.OLrzqt(LinkState.NO_SUPPORTED_HANDLER);
        return false;
    }
}
