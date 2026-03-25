package o;

import com.amplitude.core.utilities.http.HttpStatus;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5273Lj implements InterfaceC5268Le {
    public final java.lang.String AEQbTJ;
    public final HttpStatus OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HttpStatus AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    public C5273Lj(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.OLrzqt = HttpStatus.PAYLOAD_TOO_LARGE;
        this.AEQbTJ = KX.copydefault(jSONObject, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "");
    }
}
