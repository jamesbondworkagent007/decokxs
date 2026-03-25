package o;

import com.okinc.components.track.bean.EventParamsList;
import com.okinc.lifecycle.impl.deeplink.core.AnalyticsLinkType;
import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.modular.deeplinkv2.LinkSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pLn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC38081pLn {
    void AEQbTJ(@NotNull java.lang.String str, @NotNull LinkSource linkSource, @NotNull AnalyticsLinkType analyticsLinkType);

    boolean AEQbTJ();

    boolean EZpvd();

    EventParamsList KWHzl();

    void OLrzqt();

    void OLrzqt(@NotNull LinkState linkState);

    void OLrzqt(@NotNull java.lang.String str);

    boolean OLrzqt(@NotNull LinkSource linkSource);

    boolean copydefault();
}
