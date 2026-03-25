package com.okinc.business.defi.biz.walletconnect;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXAuthPayloadParams {
    public static final int $stable = 8;
    private final String aud;
    private final List<String> chains;
    private final String domain;
    private final String exp;
    private final String iat;
    private final String nbf;
    private final String nonce;
    private final String requestId;
    private final List<String> resources;
    private final String statement;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component11() {
        return this.resources;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.aud;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.iat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.nbf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.exp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.statement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKXAuthPayloadParams copy(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, String str6, String str7, String str8, String str9, List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new OKXAuthPayloadParams(list, str, str2, str3, str4, str5, str6, str7, str8, str9, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKXAuthPayloadParams)) {
            return false;
        }
        OKXAuthPayloadParams oKXAuthPayloadParams = (OKXAuthPayloadParams) obj;
        return Intrinsics.EZpvd(this.chains, oKXAuthPayloadParams.chains) && Intrinsics.EZpvd((Object) this.domain, (Object) oKXAuthPayloadParams.domain) && Intrinsics.EZpvd((Object) this.nonce, (Object) oKXAuthPayloadParams.nonce) && Intrinsics.EZpvd((Object) this.aud, (Object) oKXAuthPayloadParams.aud) && Intrinsics.EZpvd((Object) this.type, (Object) oKXAuthPayloadParams.type) && Intrinsics.EZpvd((Object) this.iat, (Object) oKXAuthPayloadParams.iat) && Intrinsics.EZpvd((Object) this.nbf, (Object) oKXAuthPayloadParams.nbf) && Intrinsics.EZpvd((Object) this.exp, (Object) oKXAuthPayloadParams.exp) && Intrinsics.EZpvd((Object) this.statement, (Object) oKXAuthPayloadParams.statement) && Intrinsics.EZpvd((Object) this.requestId, (Object) oKXAuthPayloadParams.requestId) && Intrinsics.EZpvd(this.resources, oKXAuthPayloadParams.resources);
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
    public int hashCode() {
        int iHashCode = this.chains.hashCode();
        int iHashCode2 = this.domain.hashCode();
        int iHashCode3 = this.nonce.hashCode();
        int iHashCode4 = this.aud.hashCode();
        String str = this.type;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.iat.hashCode();
        String str2 = this.nbf;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.exp;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.statement;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.requestId;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        List<String> list = this.resources;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKXAuthPayloadParams(chains=" + this.chains + ", domain=" + this.domain + ", nonce=" + this.nonce + ", aud=" + this.aud + ", type=" + this.type + ", iat=" + this.iat + ", nbf=" + this.nbf + ", exp=" + this.exp + ", statement=" + this.statement + ", requestId=" + this.requestId + ", resources=" + this.resources + ")";
    }

    public OKXAuthPayloadParams(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, String str6, String str7, String str8, String str9, List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chains = list;
        this.domain = str;
        this.nonce = str2;
        this.aud = str3;
        this.type = str4;
        this.iat = str5;
        this.nbf = str6;
        this.exp = str7;
        this.statement = str8;
        this.requestId = str9;
        this.resources = list2;
    }
}
