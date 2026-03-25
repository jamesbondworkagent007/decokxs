package com.okinc.oklive.app.data.model.remote;

import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class PullUrl {
    public static final int $stable = 0;

    @SerializedName(MTCoreConstants.Protocol.KEY_PROTOCOL)
    private final String protocol;

    @SerializedName("quality")
    private final String quality;

    @SerializedName("url")
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PullUrl copy$default(PullUrl pullUrl, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pullUrl.quality;
        }
        if ((i & 2) != 0) {
            str2 = pullUrl.url;
        }
        if ((i & 4) != 0) {
            str3 = pullUrl.protocol;
        }
        return pullUrl.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quality;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.protocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PullUrl copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PullUrl(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullUrl)) {
            return false;
        }
        PullUrl pullUrl = (PullUrl) obj;
        return Intrinsics.EZpvd((Object) this.quality, (Object) pullUrl.quality) && Intrinsics.EZpvd((Object) this.url, (Object) pullUrl.url) && Intrinsics.EZpvd((Object) this.protocol, (Object) pullUrl.protocol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocol() {
        return this.protocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuality() {
        return this.quality;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.quality.hashCode() * 31) + this.url.hashCode()) * 31) + this.protocol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PullUrl(quality=" + this.quality + ", url=" + this.url + ", protocol=" + this.protocol + ")";
    }

    public PullUrl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.quality = str;
        this.url = str2;
        this.protocol = str3;
    }
}
