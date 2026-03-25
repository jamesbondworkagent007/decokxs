package com.okinc.crcore.coreapi.net.responsebean.dex;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TokenThirdPartInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String bubbleMapsUrl;
    private final String mapWebSiteColorLogo;
    private final String mapWebSiteGreyLogo;
    private final String mapWebSiteName;
    private final String mapWebSiteUrl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenThirdPartInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenThirdPartInfo copy$default(TokenThirdPartInfo tokenThirdPartInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenThirdPartInfo.bubbleMapsUrl;
        }
        if ((i & 2) != 0) {
            str2 = tokenThirdPartInfo.mapWebSiteColorLogo;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = tokenThirdPartInfo.mapWebSiteGreyLogo;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = tokenThirdPartInfo.mapWebSiteName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = tokenThirdPartInfo.mapWebSiteUrl;
        }
        return tokenThirdPartInfo.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bubbleMapsUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mapWebSiteColorLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mapWebSiteGreyLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.mapWebSiteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mapWebSiteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenThirdPartInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TokenThirdPartInfo(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenThirdPartInfo)) {
            return false;
        }
        TokenThirdPartInfo tokenThirdPartInfo = (TokenThirdPartInfo) obj;
        return Intrinsics.EZpvd((Object) this.bubbleMapsUrl, (Object) tokenThirdPartInfo.bubbleMapsUrl) && Intrinsics.EZpvd((Object) this.mapWebSiteColorLogo, (Object) tokenThirdPartInfo.mapWebSiteColorLogo) && Intrinsics.EZpvd((Object) this.mapWebSiteGreyLogo, (Object) tokenThirdPartInfo.mapWebSiteGreyLogo) && Intrinsics.EZpvd((Object) this.mapWebSiteName, (Object) tokenThirdPartInfo.mapWebSiteName) && Intrinsics.EZpvd((Object) this.mapWebSiteUrl, (Object) tokenThirdPartInfo.mapWebSiteUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBubbleMapsUrl() {
        return this.bubbleMapsUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMapWebSiteColorLogo() {
        return this.mapWebSiteColorLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMapWebSiteGreyLogo() {
        return this.mapWebSiteGreyLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMapWebSiteName() {
        return this.mapWebSiteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMapWebSiteUrl() {
        return this.mapWebSiteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.bubbleMapsUrl.hashCode() * 31) + this.mapWebSiteColorLogo.hashCode()) * 31) + this.mapWebSiteGreyLogo.hashCode()) * 31) + this.mapWebSiteName.hashCode()) * 31) + this.mapWebSiteUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenThirdPartInfo(bubbleMapsUrl=" + this.bubbleMapsUrl + ", mapWebSiteColorLogo=" + this.mapWebSiteColorLogo + ", mapWebSiteGreyLogo=" + this.mapWebSiteGreyLogo + ", mapWebSiteName=" + this.mapWebSiteName + ", mapWebSiteUrl=" + this.mapWebSiteUrl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.TokenThirdPartInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenThirdPartInfo> serializer() {
            return TokenThirdPartInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenThirdPartInfo(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bubbleMapsUrl = "";
        } else {
            this.bubbleMapsUrl = str;
        }
        if ((i & 2) == 0) {
            this.mapWebSiteColorLogo = "";
        } else {
            this.mapWebSiteColorLogo = str2;
        }
        if ((i & 4) == 0) {
            this.mapWebSiteGreyLogo = "";
        } else {
            this.mapWebSiteGreyLogo = str3;
        }
        if ((i & 8) == 0) {
            this.mapWebSiteName = "";
        } else {
            this.mapWebSiteName = str4;
        }
        if ((i & 16) == 0) {
            this.mapWebSiteUrl = "";
        } else {
            this.mapWebSiteUrl = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TokenThirdPartInfo tokenThirdPartInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tokenThirdPartInfo.bubbleMapsUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenThirdPartInfo.bubbleMapsUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenThirdPartInfo.mapWebSiteColorLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenThirdPartInfo.mapWebSiteColorLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tokenThirdPartInfo.mapWebSiteGreyLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenThirdPartInfo.mapWebSiteGreyLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tokenThirdPartInfo.mapWebSiteName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenThirdPartInfo.mapWebSiteName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) tokenThirdPartInfo.mapWebSiteUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenThirdPartInfo.mapWebSiteUrl);
    }

    public TokenThirdPartInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.bubbleMapsUrl = str;
        this.mapWebSiteColorLogo = str2;
        this.mapWebSiteGreyLogo = str3;
        this.mapWebSiteName = str4;
        this.mapWebSiteUrl = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:129) call: com.okinc.crcore.coreapi.net.responsebean.dex.TokenThirdPartInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenThirdPartInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
