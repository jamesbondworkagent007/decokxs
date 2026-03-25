package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45305snL {
    public static final C45305snL EZpvd = new C45305snL();

    private C45305snL() {
    }

    public JsonObject OLrzqt(@NotNull android.os.Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        java.lang.String string = parcel.readString();
        if (string != null) {
            return JsonElementKt.getJsonObject(Json.Default.parseToJsonElement(string));
        }
        return null;
    }

    public void KWHzl(JsonObject jsonObject, @NotNull android.os.Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(jsonObject != null ? jsonObject.toString() : null);
    }
}
