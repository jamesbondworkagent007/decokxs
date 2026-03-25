package com.okinc.business.defi.di;

import com.okinc.business.defi.di.InvestSerializerModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import o.yCR;

/* JADX INFO: loaded from: classes4.dex */
public final class InvestSerializerModule {
    public static final InvestSerializerModule EZpvd = new InvestSerializerModule();

    private InvestSerializerModule() {
    }

    @yCR
    public final Json AEQbTJ() {
        return JsonKt.Json$default(null, new Function1() { // from class: o.dKl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestSerializerModule.EZpvd((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(false);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setUseArrayPolymorphism(true);
        jsonBuilder.setCoerceInputValues(true);
        return Unit.INSTANCE;
    }
}
