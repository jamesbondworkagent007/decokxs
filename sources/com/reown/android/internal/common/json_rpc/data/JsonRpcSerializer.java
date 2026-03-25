package com.reown.android.internal.common.json_rpc.data;

import androidx.exifinterface.media.ExifInterface;
import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.model.type.ClientParams;
import com.reown.android.internal.common.model.type.JsonRpcClientSync;
import com.reown.android.internal.common.model.type.SerializableJsonRpc;
import com.reown.utils.JsonAdapterEntry;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56524yIo;
import o.C56552yJp;
import o.InterfaceC56551yJo;
import o.yHE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class JsonRpcSerializer {
    public final Map<String, InterfaceC56551yJo<?>> deserializerEntries;
    public final Set<JsonAdapterEntry<?>> jsonAdapterEntries;
    public final Moshi.Builder moshiBuilder;
    public final Set<InterfaceC56551yJo<?>> serializerEntries;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, InterfaceC56551yJo<?>> getDeserializerEntries() {
        return this.deserializerEntries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<JsonAdapterEntry<?>> getJsonAdapterEntries() {
        return this.jsonAdapterEntries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Moshi.Builder getMoshiBuilder() {
        return this.moshiBuilder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<InterfaceC56551yJo<?>> getSerializerEntries() {
        return this.serializerEntries;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Set<? extends o.yJo<?>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends o.yJo<?>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Set<? extends com.reown.utils.JsonAdapterEntry<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonRpcSerializer(@NotNull Set<? extends InterfaceC56551yJo<?>> set, @NotNull Map<String, ? extends InterfaceC56551yJo<?>> map, @NotNull Set<? extends JsonAdapterEntry<?>> set2, @NotNull Moshi.Builder builder) {
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(set2, "");
        Intrinsics.checkNotNullParameter(builder, "");
        this.serializerEntries = set;
        this.deserializerEntries = map;
        this.jsonAdapterEntries = set2;
        this.moshiBuilder = builder;
    }

    public final Moshi getMoshi() {
        Moshi moshiBuild = this.moshiBuilder.add(new JsonAdapter.Factory() { // from class: com.reown.android.internal.common.json_rpc.data.JsonRpcSerializer$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.squareup.moshi.JsonAdapter.Factory
            public final JsonAdapter create(Type type, Set set, Moshi moshi) {
                return JsonRpcSerializer._get_moshi_$lambda$1(this.f$0, type, set, moshi);
            }
        }).build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "");
        return moshiBuild;
    }

    public static final JsonAdapter _get_moshi_$lambda$1(JsonRpcSerializer jsonRpcSerializer, Type type, Set set, Moshi moshi) {
        Object next;
        Function1 adapter;
        Intrinsics.checkNotNullParameter(jsonRpcSerializer, "");
        Iterator<T> it = jsonRpcSerializer.jsonAdapterEntries.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd(((JsonAdapterEntry) next).getType(), type)) {
                break;
            }
        }
        JsonAdapterEntry jsonAdapterEntry = (JsonAdapterEntry) next;
        if (jsonAdapterEntry == null || (adapter = jsonAdapterEntry.getAdapter()) == null) {
            return null;
        }
        Intrinsics.copydefault(moshi);
        return (JsonAdapter) adapter.invoke(moshi);
    }

    public final ClientParams deserialize(@NotNull String str, @NotNull String str2) {
        Object objTryDeserialize;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC56551yJo<?> interfaceC56551yJo = this.deserializerEntries.get(str);
        if (interfaceC56551yJo != null && (objTryDeserialize = tryDeserialize(str2, interfaceC56551yJo)) != null && Intrinsics.EZpvd(C56524yIo.AEQbTJ(objTryDeserialize.getClass()), interfaceC56551yJo) && (objTryDeserialize instanceof JsonRpcClientSync)) {
            return ((JsonRpcClientSync) objTryDeserialize).getParams();
        }
        return null;
    }

    public final String serialize(@NotNull SerializableJsonRpc serializableJsonRpc) {
        boolean z;
        Intrinsics.checkNotNullParameter(serializableJsonRpc, "");
        if (!(serializableJsonRpc instanceof JsonRpcResponse.JsonRpcResult)) {
            if (serializableJsonRpc instanceof JsonRpcResponse.JsonRpcError) {
                String json = getMoshi().adapter(JsonRpcResponse.JsonRpcError.class).toJson(serializableJsonRpc);
                Intrinsics.checkNotNullExpressionValue(json, "");
                return json;
            }
            Set<InterfaceC56551yJo<?>> set = this.serializerEntries;
            InterfaceC56551yJo<?> interfaceC56551yJo = null;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                interfaceC56551yJo = null;
                for (InterfaceC56551yJo<?> interfaceC56551yJo2 : set) {
                    if (C56552yJp.AEQbTJ(interfaceC56551yJo2, serializableJsonRpc) != null) {
                        z = true;
                        break;
                    }
                }
            } else {
                interfaceC56551yJo2 = null;
            }
            z = false;
            if (!z) {
                return null;
            }
            if (interfaceC56551yJo2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC56551yJo = interfaceC56551yJo2;
            }
            return trySerialize(serializableJsonRpc, interfaceC56551yJo);
        }
        String json2 = getMoshi().adapter(JsonRpcResponse.JsonRpcResult.class).toJson(serializableJsonRpc);
        Intrinsics.checkNotNullExpressionValue(json2, "");
        return json2;
    }

    public final /* synthetic */ <T> T tryDeserialize(String str) {
        T t;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            Moshi moshi = getMoshi();
            Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
            t = (T) Result.m7377constructorimpl(moshi.adapter((Class) Object.class).fromJson(str));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            t = (T) Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(t)) {
            return null;
        }
        return t;
    }

    public final Object tryDeserialize(@NotNull String str, @NotNull InterfaceC56551yJo<?> interfaceC56551yJo) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(getMoshi().adapter(yHE.OLrzqt(interfaceC56551yJo)).fromJson(str));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }

    public final /* synthetic */ <T> String trySerialize(T t) {
        Moshi moshi = getMoshi();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        String json = moshi.adapter((Class) Object.class).toJson(t);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public final String trySerialize(@NotNull Object obj, @NotNull InterfaceC56551yJo<?> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        String json = getMoshi().adapter((Type) yHE.OLrzqt(interfaceC56551yJo)).toJson(obj);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }
}
