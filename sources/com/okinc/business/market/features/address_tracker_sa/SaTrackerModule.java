package com.okinc.business.market.features.address_tracker_sa;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o.C25673jCc;
import o.C27640jyx;
import o.InterfaceC27595jyE;
import o.jBV;
import o.jBW;
import o.jBZ;
import o.jEA;
import o.jEC;
import o.yCL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SaTrackerModule {
    public static final SaTrackerModule copydefault = new SaTrackerModule();

    private SaTrackerModule() {
    }

    public final jBZ EZpvd(@NotNull InterfaceC27595jyE interfaceC27595jyE, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull Json json, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        return new C25673jCc(interfaceC27595jyE, c27640jyx, json, gson);
    }

    public final jBW AEQbTJ() {
        return new jBV();
    }

    public final jEA KWHzl(@NotNull InterfaceC27595jyE interfaceC27595jyE, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx2, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx3, @NotNull Json json, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c27640jyx2, "");
        Intrinsics.checkNotNullParameter(c27640jyx3, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        return new jEC(interfaceC27595jyE, c27640jyx, c27640jyx2, c27640jyx3, json, gson);
    }
}
