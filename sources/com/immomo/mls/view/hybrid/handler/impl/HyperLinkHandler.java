package com.immomo.mls.view.hybrid.handler.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.gson.annotations.SerializedName;
import com.just.agentweb.DefaultWebClient;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C59449zhJ;
import o.C7961ath;
import o.InterfaceC7973att;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class HyperLinkHandler implements InterfaceC7973att {
    public static final int $stable = 0;

    @SerializedName("url")
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HyperLinkHandler copy$default(HyperLinkHandler hyperLinkHandler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hyperLinkHandler.url;
        }
        return hyperLinkHandler.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1$MLN_mlnservics() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HyperLinkHandler copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new HyperLinkHandler(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HyperLinkHandler) && Intrinsics.EZpvd((Object) this.url, (Object) ((HyperLinkHandler) obj).url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl$MLN_mlnservics() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.url.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HyperLinkHandler(url=" + this.url + ")";
    }

    public HyperLinkHandler(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    @Override // o.InterfaceC7973att
    public void execute(@NotNull C7961ath c7961ath, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(c7961ath, "");
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("HybridWebView", "HyperLinkHandler: [url: " + this.url + "]");
        if (C59449zhJ.startsWith$default(this.url, DefaultWebClient.HTTP_SCHEME, false, 2, null) || C59449zhJ.startsWith$default(this.url, DefaultWebClient.HTTPS_SCHEME, false, 2, null)) {
            openBrowser(context, this.url);
            return;
        }
        pUU.valueOf("HybridWebView", "unsupported url: " + this.url);
    }

    private final void openBrowser(Context context, String str) {
        Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("HybridWebView", "open browser by " + str + " failed", thM7380exceptionOrNullimpl);
        }
    }
}
