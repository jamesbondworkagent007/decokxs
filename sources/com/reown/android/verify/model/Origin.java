package com.reown.android.verify.model;

import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class Origin {
    public final String attestationId;
    public final Boolean isScam;
    public final String origin;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Origin copy$default(Origin origin, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = origin.attestationId;
        }
        if ((i & 2) != 0) {
            str2 = origin.origin;
        }
        if ((i & 4) != 0) {
            bool = origin.isScam;
        }
        return origin.copy(str, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.attestationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isScam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Origin copy(@NotNull String str, @NotNull String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Origin(str, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Origin)) {
            return false;
        }
        Origin origin = (Origin) obj;
        return Intrinsics.EZpvd((Object) this.attestationId, (Object) origin.attestationId) && Intrinsics.EZpvd((Object) this.origin, (Object) origin.origin) && Intrinsics.EZpvd(this.isScam, origin.isScam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAttestationId() {
        return this.attestationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.attestationId.hashCode();
        int iHashCode2 = this.origin.hashCode();
        Boolean bool = this.isScam;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isScam() {
        return this.isScam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Origin(attestationId=" + this.attestationId + ", origin=" + this.origin + ", isScam=" + this.isScam + ")";
    }

    public Origin(@NotNull String str, @NotNull String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.attestationId = str;
        this.origin = str2;
        this.isScam = bool;
    }
}
