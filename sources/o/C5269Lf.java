package o;

import com.amplitude.core.utilities.http.HttpStatus;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5269Lf implements InterfaceC5268Le {
    public final HttpStatus EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HttpStatus KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    public C5269Lf(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.EZpvd = HttpStatus.FAILED;
        this.copydefault = KX.copydefault(jSONObject, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "");
    }
}
