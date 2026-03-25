package o;

import com.onesignal.WebViewManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yog, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57770yog {
    public java.lang.Double AEQbTJ;
    public WebViewManager.Position EZpvd;
    public java.lang.String KWHzl;
    public int OLrzqt;
    public boolean copydefault;
    public boolean djBIcL;
    public boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewManager.Position EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(WebViewManager.Position position) {
        this.EZpvd = position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.djBIcL;
    }

    public C57770yog(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.gEmmrt = true;
        this.djBIcL = true;
        this.KWHzl = jSONObject.optString("html");
        this.AEQbTJ = java.lang.Double.valueOf(jSONObject.optDouble("display_duration"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("styles");
        this.gEmmrt = !(jSONObjectOptJSONObject == null ? false : jSONObjectOptJSONObject.optBoolean("remove_height_margin", false));
        this.djBIcL = !(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("remove_width_margin", false) : false);
        this.copydefault = !this.gEmmrt;
    }
}
