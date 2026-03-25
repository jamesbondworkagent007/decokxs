package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57778yoo {
    public java.lang.String AEQbTJ;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    public C57778yoo(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.OLrzqt = jSONObject.optString("pageId", null);
        this.AEQbTJ = jSONObject.optString("pageIndex", null);
    }
}
