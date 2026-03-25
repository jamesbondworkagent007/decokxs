package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xYL {
    public final xYN EZpvd = xYN.Companion.EZpvd();

    public final AbstractC58185ywX<JsonObject> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.EZpvd.AEQbTJ(str, Json.Default.parseToJsonElement(str2));
    }
}
