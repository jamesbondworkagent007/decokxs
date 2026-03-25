package com.reown.android.internal.common.model;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class Participant {
    public final AppMetaData metadata;
    public final String publicKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Participant copy$default(Participant participant, String str, AppMetaData appMetaData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = participant.publicKey;
        }
        if ((i & 2) != 0) {
            appMetaData = participant.metadata;
        }
        return participant.copy(str, appMetaData);
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
    public final Participant copy(@Json(name = "publicKey") @NotNull String str, @Json(name = TtmlNode.TAG_METADATA) @NotNull AppMetaData appMetaData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        return new Participant(str, appMetaData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Participant)) {
            return false;
        }
        Participant participant = (Participant) obj;
        return Intrinsics.EZpvd((Object) this.publicKey, (Object) participant.publicKey) && Intrinsics.EZpvd(this.metadata, participant.metadata);
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
        return "Participant(publicKey=" + this.publicKey + ", metadata=" + this.metadata + ")";
    }

    public Participant(@Json(name = "publicKey") @NotNull String str, @Json(name = TtmlNode.TAG_METADATA) @NotNull AppMetaData appMetaData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        this.publicKey = str;
        this.metadata = appMetaData;
    }
}
