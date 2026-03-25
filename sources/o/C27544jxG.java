package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27544jxG {
    public static final java.lang.String OLrzqt(@NotNull OKServerException oKServerException) {
        Intrinsics.checkNotNullParameter(oKServerException, "");
        return oKServerException.getMessage();
    }

    public static final java.lang.String copydefault(@NotNull OKServerException oKServerException) {
        JsonElement jsonElement;
        Intrinsics.checkNotNullParameter(oKServerException, "");
        JsonObject response = oKServerException.getResponse();
        if (response == null || (jsonElement = response.get(EopTrackEvent.KEY_ERROR_MESSAGE)) == null) {
            return null;
        }
        return jsonElement.getAsString();
    }
}
