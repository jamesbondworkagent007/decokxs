package com.okinc.network.okg.dns.model;

import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class DOHProcessParam {
    public static final int $stable = 8;
    private HttpUrl dohUrl;
    private HttpUrl holderUrl;
    private SubdomainStrategy originSubdomainStrategy;
    private HttpUrl requestUrl;
    private boolean requestUrlIsCORHost;
    private String subdomainSite = "OKX_GLOBAL";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HttpUrl getDohUrl() {
        return this.dohUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HttpUrl getHolderUrl() {
        return this.holderUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubdomainStrategy getOriginSubdomainStrategy() {
        return this.originSubdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HttpUrl getRequestUrl() {
        return this.requestUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRequestUrlIsCORHost() {
        return this.requestUrlIsCORHost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubdomainSite() {
        return this.subdomainSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDohUrl(HttpUrl httpUrl) {
        this.dohUrl = httpUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHolderUrl(HttpUrl httpUrl) {
        this.holderUrl = httpUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginSubdomainStrategy(SubdomainStrategy subdomainStrategy) {
        this.originSubdomainStrategy = subdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestUrl(HttpUrl httpUrl) {
        this.requestUrl = httpUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestUrlIsCORHost(boolean z) {
        this.requestUrlIsCORHost = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubdomainSite(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subdomainSite = str;
    }

    public String toString() {
        return "DOHProcessParam(originCORStrategy=" + this.originSubdomainStrategy + ", holderUrl=" + this.holderUrl + ", requestUrl=" + this.requestUrl + ", requestUrlIsCORHost=" + this.requestUrlIsCORHost + ", dohUrl=" + this.dohUrl + ")";
    }

    public final String toSimpleString() {
        HttpUrl httpUrl = this.holderUrl;
        String strHost = httpUrl != null ? httpUrl.host() : null;
        HttpUrl httpUrl2 = this.requestUrl;
        String strHost2 = httpUrl2 != null ? httpUrl2.host() : null;
        HttpUrl httpUrl3 = this.dohUrl;
        String strHost3 = httpUrl3 != null ? httpUrl3.host() : null;
        return "DOHProcessParam(originCORStrategy=" + this.originSubdomainStrategy + ", holderHost=" + strHost + ", requestHost=" + strHost2 + ", dohHost=" + strHost3 + ", requestUrlIsCORHost=" + this.requestUrlIsCORHost + ")";
    }
}
