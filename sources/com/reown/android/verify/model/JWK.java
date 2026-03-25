package com.reown.android.verify.model;

import com.ibm.icu.text.DateFormat;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class JWK {
    public final String crv;
    public final boolean ext;
    public final List<String> keyOps;
    public final String kty;
    public final String x;
    public final String y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.reown.android.verify.model.JWK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JWK copy$default(JWK jwk, String str, boolean z, List list, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jwk.crv;
        }
        if ((i & 2) != 0) {
            z = jwk.ext;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            list = jwk.keyOps;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = jwk.kty;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = jwk.x;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = jwk.y;
        }
        return jwk.copy(str, z2, list2, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.crv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.keyOps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.kty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JWK copy(@Json(name = "crv") @NotNull String str, @Json(name = "ext") boolean z, @Json(name = "key_ops") @NotNull List<String> list, @Json(name = "kty") @NotNull String str2, @Json(name = "x") @NotNull String str3, @Json(name = DateFormat.YEAR) @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new JWK(str, z, list, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JWK)) {
            return false;
        }
        JWK jwk = (JWK) obj;
        return Intrinsics.EZpvd((Object) this.crv, (Object) jwk.crv) && this.ext == jwk.ext && Intrinsics.EZpvd(this.keyOps, jwk.keyOps) && Intrinsics.EZpvd((Object) this.kty, (Object) jwk.kty) && Intrinsics.EZpvd((Object) this.x, (Object) jwk.x) && Intrinsics.EZpvd((Object) this.y, (Object) jwk.y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrv() {
        return this.crv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getExt() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getKeyOps() {
        return this.keyOps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKty() {
        return this.kty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getX() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getY() {
        return this.y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.crv.hashCode() * 31) + Boolean.hashCode(this.ext)) * 31) + this.keyOps.hashCode()) * 31) + this.kty.hashCode()) * 31) + this.x.hashCode()) * 31) + this.y.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JWK(crv=" + this.crv + ", ext=" + this.ext + ", keyOps=" + this.keyOps + ", kty=" + this.kty + ", x=" + this.x + ", y=" + this.y + ")";
    }

    public JWK(@Json(name = "crv") @NotNull String str, @Json(name = "ext") boolean z, @Json(name = "key_ops") @NotNull List<String> list, @Json(name = "kty") @NotNull String str2, @Json(name = "x") @NotNull String str3, @Json(name = DateFormat.YEAR) @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.crv = str;
        this.ext = z;
        this.keyOps = list;
        this.kty = str2;
        this.x = str3;
        this.y = str4;
    }
}
