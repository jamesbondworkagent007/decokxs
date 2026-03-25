package o;

import kotlin.jvm.internal.Intrinsics;
import o.C58141yvg;
import okhttp3.OkHttpClient;
import okhttp3.WebSocketListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yvf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58140yvf implements C58141yvg.Activity {
    public final InterfaceC58147yvm KWHzl;
    public final OkHttpClient OLrzqt;

    public C58140yvf(@NotNull OkHttpClient okHttpClient, @NotNull InterfaceC58147yvm interfaceC58147yvm) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(interfaceC58147yvm, "");
        this.OLrzqt = okHttpClient;
        this.KWHzl = interfaceC58147yvm;
    }

    @Override // o.C58141yvg.Activity
    public void AEQbTJ(@NotNull WebSocketListener webSocketListener) {
        Intrinsics.checkNotNullParameter(webSocketListener, "");
        this.OLrzqt.newWebSocket(this.KWHzl.KWHzl(), webSocketListener);
    }
}
