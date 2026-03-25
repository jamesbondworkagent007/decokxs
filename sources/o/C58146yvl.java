package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.WebSocket;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yvl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58146yvl implements WebSocket {
    public WebSocket KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull WebSocket webSocket) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        this.KWHzl = webSocket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        this.KWHzl = null;
    }

    @Override // okhttp3.WebSocket
    public /* synthetic */ long queueSize() {
        return ((java.lang.Number) EZpvd()).longValue();
    }

    @Override // okhttp3.WebSocket
    public /* synthetic */ Request request() {
        return (Request) AEQbTJ();
    }

    public java.lang.Void EZpvd() {
        throw new java.lang.UnsupportedOperationException();
    }

    public java.lang.Void AEQbTJ() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // okhttp3.WebSocket
    public boolean send(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        WebSocket webSocket = this.KWHzl;
        if (webSocket != null) {
            return webSocket.send(str);
        }
        return false;
    }

    @Override // okhttp3.WebSocket
    public boolean send(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "");
        WebSocket webSocket = this.KWHzl;
        if (webSocket != null) {
            return webSocket.send(byteString);
        }
        return false;
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, java.lang.String str) {
        WebSocket webSocket = this.KWHzl;
        if (webSocket != null) {
            return webSocket.close(i, str);
        }
        return false;
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        WebSocket webSocket = this.KWHzl;
        if (webSocket != null) {
            webSocket.cancel();
            Unit unit = Unit.INSTANCE;
        }
    }
}
