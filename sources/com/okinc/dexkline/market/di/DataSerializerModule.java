package com.okinc.dexkline.market.di;

import com.okinc.dexkline.market.di.DataSerializerModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import o.yCR;

/* JADX INFO: loaded from: classes8.dex */
public final class DataSerializerModule {
    public static final DataSerializerModule copydefault = new DataSerializerModule();

    private DataSerializerModule() {
    }

    @yCR
    public final Json EZpvd() {
        return JsonKt.Json$default(null, new Function1() { // from class: o.mVA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DataSerializerModule.KWHzl((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setUseArrayPolymorphism(true);
        jsonBuilder.setCoerceInputValues(true);
        return Unit.INSTANCE;
    }
}
