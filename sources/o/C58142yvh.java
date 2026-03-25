package o;

import kotlin.jvm.internal.Intrinsics;
import o.C58141yvg;
import o.InterfaceC58092yuk;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yvh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58142yvh {
    public static final InterfaceC58092yuk.Application EZpvd(@NotNull OkHttpClient okHttpClient, @NotNull InterfaceC58147yvm interfaceC58147yvm) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(interfaceC58147yvm, "");
        return new C58141yvg.ActionBar(new C58140yvf(okHttpClient, interfaceC58147yvm));
    }

    public static final InterfaceC58092yuk.Application OLrzqt(@NotNull OkHttpClient okHttpClient, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(okHttpClient, new C58148yvn(str));
    }
}
