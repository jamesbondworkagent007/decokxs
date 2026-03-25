package com.okinc.business.defi.dapp.webview.okxconnect;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class RequestWalletsParams {
    public static final int $stable = 8;
    private final List<Namespace> optionalNamespaces;
    private final List<Namespace> requiredNamespaces;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Namespace> getOptionalNamespaces() {
        return this.optionalNamespaces;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Namespace> getRequiredNamespaces() {
        return this.requiredNamespaces;
    }

    public RequestWalletsParams(@NotNull List<Namespace> list, @NotNull List<Namespace> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.requiredNamespaces = list;
        this.optionalNamespaces = list2;
    }
}
