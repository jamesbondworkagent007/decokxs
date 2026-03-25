package com.reown.android.internal.common.model;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class SessionProposer {
    public final AppMetaData metadata;
    public final String publicKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SessionProposer copy$default(SessionProposer sessionProposer, String str, AppMetaData appMetaData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionProposer.publicKey;
        }
        if ((i & 2) != 0) {
            appMetaData = sessionProposer.metadata;
        }
        return sessionProposer.copy(str, appMetaData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppMetaData component2() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SessionProposer copy(@Json(name = "publicKey") @NotNull String str, @Json(name = TtmlNode.TAG_METADATA) @NotNull AppMetaData appMetaData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        return new SessionProposer(str, appMetaData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionProposer)) {
            return false;
        }
        SessionProposer sessionProposer = (SessionProposer) obj;
        return Intrinsics.EZpvd((Object) this.publicKey, (Object) sessionProposer.publicKey) && Intrinsics.EZpvd(this.metadata, sessionProposer.metadata);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppMetaData getMetadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.publicKey.hashCode() * 31) + this.metadata.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SessionProposer(publicKey=" + this.publicKey + ", metadata=" + this.metadata + ")";
    }

    public SessionProposer(@Json(name = "publicKey") @NotNull String str, @Json(name = TtmlNode.TAG_METADATA) @NotNull AppMetaData appMetaData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        this.publicKey = str;
        this.metadata = appMetaData;
    }
}
