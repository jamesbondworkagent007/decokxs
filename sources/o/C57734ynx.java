package o;

import com.onesignal.OSUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ynx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57734ynx {
    public static final C57734ynx copydefault = new C57734ynx();

    private C57734ynx() {
    }

    public final C57735yny EZpvd(@NotNull android.content.Context context, @NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(jSONObject, "");
        C57742yoE c57742yoE = new C57742yoE(context, jSONObject);
        return new C57735yny(context, AEQbTJ(c57742yoE.AEQbTJ()), copydefault(c57742yoE.KWHzl(), jSONObject));
    }

    public final boolean copydefault(boolean z, JSONObject jSONObject) {
        return z | (C57780yoq.KWHzl(jSONObject) != null);
    }

    public final android.content.Intent AEQbTJ(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        return OSUtils.OLrzqt(uri);
    }
}
