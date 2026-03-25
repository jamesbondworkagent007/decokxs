package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class MobileDTO {

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final String f92native;
    public final String universal;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MobileDTO copy$default(MobileDTO mobileDTO, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobileDTO.f92native;
        }
        if ((i & 2) != 0) {
            str2 = mobileDTO.universal;
        }
        return mobileDTO.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.f92native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.universal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MobileDTO copy(@Json(name = "native") String str, @Json(name = "universal") String str2) {
        return new MobileDTO(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileDTO)) {
            return false;
        }
        MobileDTO mobileDTO = (MobileDTO) obj;
        return Intrinsics.EZpvd((Object) this.f92native, (Object) mobileDTO.f92native) && Intrinsics.EZpvd((Object) this.universal, (Object) mobileDTO.universal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNative() {
        return this.f92native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniversal() {
        return this.universal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.f92native;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.universal;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MobileDTO(native=" + this.f92native + ", universal=" + this.universal + ")";
    }

    public MobileDTO(@Json(name = "native") String str, @Json(name = "universal") String str2) {
        this.f92native = str;
        this.universal = str2;
    }
}
