package com.okinc.dexkline.market.features.position;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o.C32261mVl;
import o.C34468nce;
import o.C34471nch;
import o.C34473ncj;
import o.C34476ncm;
import o.C34477ncn;
import o.InterfaceC32260mVk;
import o.InterfaceC34469ncf;
import o.InterfaceC34472nci;
import o.InterfaceC34475ncl;
import o.yCL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class PositionModule {
    public static final PositionModule copydefault = new PositionModule();

    private PositionModule() {
    }

    public final C34476ncm KWHzl(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "");
        return new C34476ncm(json, new Gson());
    }

    public final InterfaceC34475ncl OLrzqt(@NotNull InterfaceC32260mVk interfaceC32260mVk, @yCL(AEQbTJ = "kline_public_client") @NotNull C32261mVl c32261mVl, @NotNull C34476ncm c34476ncm) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        Intrinsics.checkNotNullParameter(c32261mVl, "");
        Intrinsics.checkNotNullParameter(c34476ncm, "");
        return new C34473ncj(interfaceC32260mVk, c32261mVl, c34476ncm);
    }

    public final C34477ncn OLrzqt(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "");
        return new C34477ncn(json, new Gson());
    }

    public final InterfaceC34472nci OLrzqt(@NotNull InterfaceC32260mVk interfaceC32260mVk) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        return new C34468nce(interfaceC32260mVk);
    }

    public final InterfaceC34469ncf KWHzl(@NotNull InterfaceC32260mVk interfaceC32260mVk) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        return new C34471nch(interfaceC32260mVk);
    }
}
