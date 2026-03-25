package o;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC4025Ax;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4250Ba extends ProxySelector {
    public final AD copydefault;

    @Override // java.net.ProxySelector
    public void connectFailed(java.net.URI uri, SocketAddress socketAddress, java.io.IOException iOException) {
    }

    public C4250Ba(@NotNull AD ad) {
        Intrinsics.checkNotNullParameter(ad, "");
        this.copydefault = ad;
    }

    @Override // java.net.ProxySelector
    public java.util.List<java.net.Proxy> select(java.net.URI uri) {
        if (uri != null) {
            AbstractC4025Ax abstractC4025AxOLrzqt = this.copydefault.OLrzqt(AZ.OLrzqt(uri));
            if (abstractC4025AxOLrzqt instanceof AbstractC4025Ax.Application) {
                AbstractC4025Ax.Application application = (AbstractC4025Ax.Application) abstractC4025AxOLrzqt;
                return C56402yEa.EZpvd(new java.net.Proxy(Proxy.Type.HTTP, new InetSocketAddress(application.KWHzl().OLrzqt().toString(), application.KWHzl().KWHzl())));
            }
            return yDY.AhwBna();
        }
        return yDY.AhwBna();
    }
}
