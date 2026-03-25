package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lVt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30367lVt {
    public static final java.lang.String AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Json jsonKWHzl = C43284rmQ.KWHzl();
        jsonKWHzl.getSerializersModule();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return jsonKWHzl.encodeToString(new LinkedHashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)), map);
    }

    public static final java.lang.String OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return map.get("lot_number");
    }

    public static final java.lang.String copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return map.get("captcha_output");
    }

    public static final java.lang.String KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return map.get("pass_token");
    }

    public static final java.lang.String EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return map.get("gen_time");
    }
}
