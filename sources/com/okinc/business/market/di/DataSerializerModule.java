package com.okinc.business.market.di;

import com.google.gson.Gson;
import com.okinc.business.market.di.DataSerializerModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import o.yCR;

/* JADX INFO: loaded from: classes6.dex */
public final class DataSerializerModule {
    public static final DataSerializerModule EZpvd = new DataSerializerModule();

    private DataSerializerModule() {
    }

    @yCR
    public final Json KWHzl() {
        return JsonKt.Json$default(null, new Function1() { // from class: o.jzf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DataSerializerModule.copydefault((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setUseArrayPolymorphism(true);
        jsonBuilder.setCoerceInputValues(true);
        return Unit.INSTANCE;
    }

    @yCR
    public final Gson OLrzqt() {
        return new Gson();
    }
}
