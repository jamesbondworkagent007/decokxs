package com.reown.android.internal.common.signing.cacao;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ibm.icu.text.DateFormat;
import com.reown.android.cacao.SignatureInterface;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class Cacao {
    public final Header header;
    public final Payload payload;
    public final Signature signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Cacao copy$default(Cacao cacao, Header header, Payload payload, Signature signature, int i, Object obj) {
        if ((i & 1) != 0) {
            header = cacao.header;
        }
        if ((i & 2) != 0) {
            payload = cacao.payload;
        }
        if ((i & 4) != 0) {
            signature = cacao.signature;
        }
        return cacao.copy(header, payload, signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Header component1() {
        return this.header;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Payload component2() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Signature component3() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cacao copy(@Json(name = "h") @NotNull Header header, @Json(name = TtmlNode.TAG_P) @NotNull Payload payload, @Json(name = DateFormat.SECOND) @NotNull Signature signature) {
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(payload, "");
        Intrinsics.checkNotNullParameter(signature, "");
        return new Cacao(header, payload, signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cacao)) {
            return false;
        }
        Cacao cacao = (Cacao) obj;
        return Intrinsics.EZpvd(this.header, cacao.header) && Intrinsics.EZpvd(this.payload, cacao.payload) && Intrinsics.EZpvd(this.signature, cacao.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Header getHeader() {
        return this.header;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Payload getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Signature getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.header.hashCode() * 31) + this.payload.hashCode()) * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Cacao(header=" + this.header + ", payload=" + this.payload + ", signature=" + this.signature + ")";
    }

    public Cacao(@Json(name = "h") @NotNull Header header, @Json(name = TtmlNode.TAG_P) @NotNull Payload payload, @Json(name = DateFormat.SECOND) @NotNull Signature signature) {
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(payload, "");
        Intrinsics.checkNotNullParameter(signature, "");
        this.header = header;
        this.payload = payload;
        this.signature = signature;
    }

    @JsonClass(generateAdapter = true)
    public static final class Signature implements SignatureInterface {
        private final String m;
        private final String s;
        private final String t;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Signature copy$default(Signature signature, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signature.t;
            }
            if ((i & 2) != 0) {
                str2 = signature.s;
            }
            if ((i & 4) != 0) {
                str3 = signature.m;
            }
            return signature.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.t;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.s;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.m;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Signature copy(@Json(name = "t") @NotNull String str, @Json(name = DateFormat.SECOND) @NotNull String str2, @Json(name = DateFormat.MINUTE) String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Signature(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Signature)) {
                return false;
            }
            Signature signature = (Signature) obj;
            return Intrinsics.EZpvd((Object) this.t, (Object) signature.t) && Intrinsics.EZpvd((Object) this.s, (Object) signature.s) && Intrinsics.EZpvd((Object) this.m, (Object) signature.m);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.cacao.SignatureInterface
        public String getM() {
            return this.m;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.cacao.SignatureInterface
        public String getS() {
            return this.s;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.cacao.SignatureInterface
        public String getT() {
            return this.t;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.t.hashCode();
            int iHashCode2 = this.s.hashCode();
            String str = this.m;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Signature(t=" + this.t + ", s=" + this.s + ", m=" + this.m + ")";
        }

        public Signature(@Json(name = "t") @NotNull String str, @Json(name = DateFormat.SECOND) @NotNull String str2, @Json(name = DateFormat.MINUTE) String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.t = str;
            this.s = str2;
            this.m = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:21) call: com.reown.android.internal.common.signing.cacao.Cacao.Signature.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Signature(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class Header {
        public final String t;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Header copy$default(Header header, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = header.t;
            }
            return header.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.t;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Header copy(@Json(name = "t") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Header(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Header) && Intrinsics.EZpvd((Object) this.t, (Object) ((Header) obj).t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getT() {
            return this.t;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.t.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Header(t=" + this.t + ")";
        }

        public Header(@Json(name = "t") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.t = str;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class Payload {
        public static final String ATT_KEY = "att";
        public static final String CURRENT_VERSION = "1";
        public static final Companion Companion = new Companion(null);
        public static final String ISO_8601_PATTERN = "yyyy-MM-dd'T'HH:mm:ssZZZZZ";
        public static final String RECAPS_PREFIX = "urn:recap:";
        public final String aud;
        public final String domain;
        public final String exp;
        public final String iat;
        public final String iss;
        public final String nbf;
        public final String nonce;
        public final String requestId;
        public final List<String> resources;
        public final String statement;
        public final String version;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.iss;
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
            return this.aud;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.version;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.nonce;
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
        public final Payload copy(@Json(name = "iss") @NotNull String str, @Json(name = "domain") @NotNull String str2, @Json(name = "aud") @NotNull String str3, @Json(name = "version") @NotNull String str4, @Json(name = "nonce") @NotNull String str5, @Json(name = "iat") @NotNull String str6, @Json(name = "nbf") String str7, @Json(name = "exp") String str8, @Json(name = "statement") String str9, @Json(name = "requestId") String str10, @Json(name = "resources") List<String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new Payload(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return Intrinsics.EZpvd((Object) this.iss, (Object) payload.iss) && Intrinsics.EZpvd((Object) this.domain, (Object) payload.domain) && Intrinsics.EZpvd((Object) this.aud, (Object) payload.aud) && Intrinsics.EZpvd((Object) this.version, (Object) payload.version) && Intrinsics.EZpvd((Object) this.nonce, (Object) payload.nonce) && Intrinsics.EZpvd((Object) this.iat, (Object) payload.iat) && Intrinsics.EZpvd((Object) this.nbf, (Object) payload.nbf) && Intrinsics.EZpvd((Object) this.exp, (Object) payload.exp) && Intrinsics.EZpvd((Object) this.statement, (Object) payload.statement) && Intrinsics.EZpvd((Object) this.requestId, (Object) payload.requestId) && Intrinsics.EZpvd(this.resources, payload.resources);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAud() {
            return this.aud;
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
        public final String getIss() {
            return this.iss;
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
        public final String getVersion() {
            return this.version;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.iss.hashCode();
            int iHashCode2 = this.domain.hashCode();
            int iHashCode3 = this.aud.hashCode();
            int iHashCode4 = this.version.hashCode();
            int iHashCode5 = this.nonce.hashCode();
            int iHashCode6 = this.iat.hashCode();
            String str = this.nbf;
            int iHashCode7 = str == null ? 0 : str.hashCode();
            String str2 = this.exp;
            int iHashCode8 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.statement;
            int iHashCode9 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.requestId;
            int iHashCode10 = str4 == null ? 0 : str4.hashCode();
            List<String> list = this.resources;
            return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Payload(iss=" + this.iss + ", domain=" + this.domain + ", aud=" + this.aud + ", version=" + this.version + ", nonce=" + this.nonce + ", iat=" + this.iat + ", nbf=" + this.nbf + ", exp=" + this.exp + ", statement=" + this.statement + ", requestId=" + this.requestId + ", resources=" + this.resources + ")";
        }

        public Payload(@Json(name = "iss") @NotNull String str, @Json(name = "domain") @NotNull String str2, @Json(name = "aud") @NotNull String str3, @Json(name = "version") @NotNull String str4, @Json(name = "nonce") @NotNull String str5, @Json(name = "iat") @NotNull String str6, @Json(name = "nbf") String str7, @Json(name = "exp") String str8, @Json(name = "statement") String str9, @Json(name = "requestId") String str10, @Json(name = "resources") List<String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.iss = str;
            this.domain = str2;
            this.aud = str3;
            this.version = str4;
            this.nonce = str5;
            this.iat = str6;
            this.nbf = str7;
            this.exp = str8;
            this.statement = str9;
            this.requestId = str10;
            this.resources = list;
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.reown.android.internal.common.signing.cacao.CacaoKt.access$getActionsString(java.util.List):java.lang.String */
        public final String getActionsString() throws Exception {
            return CacaoKt.getActionsString(this.resources);
        }

        public final List<String> getMethods() throws Exception {
            return UtilsKt.getMethods(this.resources);
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.internal.common.signing.cacao.Cacao.Payload.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }
    }
}
