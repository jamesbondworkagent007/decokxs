package o;

import com.amplitude.core.utilities.http.HttpStatus;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5272Li {
    public static final C5272Li OLrzqt = new C5272Li();

    private C5272Li() {
    }

    public final InterfaceC5268Le EZpvd(int i, java.lang.String str) {
        if (i == HttpStatus.SUCCESS.getCode()) {
            return new C5271Lh();
        }
        if (i == HttpStatus.BAD_REQUEST.getCode()) {
            return new C5267Ld(new JSONObject(str));
        }
        if (i == HttpStatus.PAYLOAD_TOO_LARGE.getCode()) {
            return new C5273Lj(new JSONObject(str));
        }
        if (i == HttpStatus.TOO_MANY_REQUESTS.getCode()) {
            return new C5275Ll(new JSONObject(str));
        }
        if (i == HttpStatus.TIMEOUT.getCode()) {
            return new C5270Lg();
        }
        return new C5269Lf(EZpvd(str));
    }

    public final JSONObject EZpvd(java.lang.String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (str == null || str.length() == 0) {
            return jSONObject;
        }
        try {
            return new JSONObject(str);
        } catch (java.lang.Exception unused) {
            jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
            return jSONObject;
        }
    }
}
