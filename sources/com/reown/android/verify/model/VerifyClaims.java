package com.reown.android.verify.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class VerifyClaims {
    public final long expiration;
    public final String id;
    public final Boolean isScam;
    public final boolean isVerified;
    public final String origin;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerifyClaims copy$default(VerifyClaims verifyClaims, String str, String str2, Boolean bool, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyClaims.origin;
        }
        if ((i & 2) != 0) {
            str2 = verifyClaims.id;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            bool = verifyClaims.isScam;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            j = verifyClaims.expiration;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            z = verifyClaims.isVerified;
        }
        return verifyClaims.copy(str, str3, bool2, j2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isScam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isVerified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifyClaims copy(@Json(name = "origin") @NotNull String str, @Json(name = "id") @NotNull String str2, @Json(name = "isScam") Boolean bool, @Json(name = "exp") long j, @Json(name = "isVerified") boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new VerifyClaims(str, str2, bool, j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyClaims)) {
            return false;
        }
        VerifyClaims verifyClaims = (VerifyClaims) obj;
        return Intrinsics.EZpvd((Object) this.origin, (Object) verifyClaims.origin) && Intrinsics.EZpvd((Object) this.id, (Object) verifyClaims.id) && Intrinsics.EZpvd(this.isScam, verifyClaims.isScam) && this.expiration == verifyClaims.expiration && this.isVerified == verifyClaims.isVerified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.origin.hashCode();
        int iHashCode2 = this.id.hashCode();
        Boolean bool = this.isScam;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + Long.hashCode(this.expiration)) * 31) + Boolean.hashCode(this.isVerified);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isScam() {
        return this.isScam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVerified() {
        return this.isVerified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifyClaims(origin=" + this.origin + ", id=" + this.id + ", isScam=" + this.isScam + ", expiration=" + this.expiration + ", isVerified=" + this.isVerified + ")";
    }

    public VerifyClaims(@Json(name = "origin") @NotNull String str, @Json(name = "id") @NotNull String str2, @Json(name = "isScam") Boolean bool, @Json(name = "exp") long j, @Json(name = "isVerified") boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.origin = str;
        this.id = str2;
        this.isScam = bool;
        this.expiration = j;
        this.isVerified = z;
    }
}
