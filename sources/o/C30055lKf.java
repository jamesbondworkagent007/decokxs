package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lKf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30055lKf implements InterfaceC35277nsL {
    @Override // o.InterfaceC35277nsL
    public boolean copydefault(@NotNull C35239nra c35239nra) {
        Intrinsics.checkNotNullParameter(c35239nra, "");
        OKMessage oKMessageCopydefault = c35239nra.copydefault();
        Json.Default r0 = Json.Default;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        jsonObjectBuilder.put("domain", JsonElementKt.JsonPrimitive("okx-assistant"));
        jsonObjectBuilder.put("source", JsonElementKt.JsonPrimitive("user"));
        JsonObject jsonObjectBuild = jsonObjectBuilder.build();
        r0.getSerializersModule();
        oKMessageCopydefault.setExtra(r0.encodeToString(JsonObject.Companion.serializer(), jsonObjectBuild));
        return false;
    }
}
