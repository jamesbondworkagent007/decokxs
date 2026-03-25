package com.reown.sign.common.model.vo.clientsync.common;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class PayloadParams {
    public final String aud;
    public final List<String> chains;
    public final String domain;
    public final String exp;
    public final String iat;
    public final String nbf;
    public final String nonce;
    public final String requestId;
    public final List<String> resources;
    public final String statement;
    public final String type;
    public final String version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.statement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component12() {
        return this.resources;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.aud;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.iat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.nbf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.exp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayloadParams copy(@Json(name = "type") @NotNull String str, @Json(name = "chains") @NotNull List<String> list, @Json(name = "domain") @NotNull String str2, @Json(name = "aud") @NotNull String str3, @Json(name = "nonce") @NotNull String str4, @Json(name = "version") @NotNull String str5, @Json(name = "iat") @NotNull String str6, @Json(name = "nbf") String str7, @Json(name = "exp") String str8, @Json(name = "statement") String str9, @Json(name = "requestId") String str10, @Json(name = "resources") List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new PayloadParams(str, list, str2, str3, str4, str5, str6, str7, str8, str9, str10, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayloadParams)) {
            return false;
        }
        PayloadParams payloadParams = (PayloadParams) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) payloadParams.type) && Intrinsics.EZpvd(this.chains, payloadParams.chains) && Intrinsics.EZpvd((Object) this.domain, (Object) payloadParams.domain) && Intrinsics.EZpvd((Object) this.aud, (Object) payloadParams.aud) && Intrinsics.EZpvd((Object) this.nonce, (Object) payloadParams.nonce) && Intrinsics.EZpvd((Object) this.version, (Object) payloadParams.version) && Intrinsics.EZpvd((Object) this.iat, (Object) payloadParams.iat) && Intrinsics.EZpvd((Object) this.nbf, (Object) payloadParams.nbf) && Intrinsics.EZpvd((Object) this.exp, (Object) payloadParams.exp) && Intrinsics.EZpvd((Object) this.statement, (Object) payloadParams.statement) && Intrinsics.EZpvd((Object) this.requestId, (Object) payloadParams.requestId) && Intrinsics.EZpvd(this.resources, payloadParams.resources);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAud() {
        return this.aud;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getChains() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExp() {
        return this.exp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIat() {
        return this.iat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNbf() {
        return this.nbf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getResources() {
        return this.resources;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatement() {
        return this.statement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        int iHashCode2 = this.chains.hashCode();
        int iHashCode3 = this.domain.hashCode();
        int iHashCode4 = this.aud.hashCode();
        int iHashCode5 = this.nonce.hashCode();
        int iHashCode6 = this.version.hashCode();
        int iHashCode7 = this.iat.hashCode();
        String str = this.nbf;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.exp;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.statement;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.requestId;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        List<String> list = this.resources;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PayloadParams(type=" + this.type + ", chains=" + this.chains + ", domain=" + this.domain + ", aud=" + this.aud + ", nonce=" + this.nonce + ", version=" + this.version + ", iat=" + this.iat + ", nbf=" + this.nbf + ", exp=" + this.exp + ", statement=" + this.statement + ", requestId=" + this.requestId + ", resources=" + this.resources + ")";
    }

    public PayloadParams(@Json(name = "type") @NotNull String str, @Json(name = "chains") @NotNull List<String> list, @Json(name = "domain") @NotNull String str2, @Json(name = "aud") @NotNull String str3, @Json(name = "nonce") @NotNull String str4, @Json(name = "version") @NotNull String str5, @Json(name = "iat") @NotNull String str6, @Json(name = "nbf") String str7, @Json(name = "exp") String str8, @Json(name = "statement") String str9, @Json(name = "requestId") String str10, @Json(name = "resources") List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.type = str;
        this.chains = list;
        this.domain = str2;
        this.aud = str3;
        this.nonce = str4;
        this.version = str5;
        this.iat = str6;
        this.nbf = str7;
        this.exp = str8;
        this.statement = str9;
        this.requestId = str10;
        this.resources = list2;
    }
}
