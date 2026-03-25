package o;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nau, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34378nau {
    public final Json EZpvd;
    public final Gson KWHzl;

    public C34378nau(@NotNull Json json, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.EZpvd = json;
        this.KWHzl = gson;
    }
}
