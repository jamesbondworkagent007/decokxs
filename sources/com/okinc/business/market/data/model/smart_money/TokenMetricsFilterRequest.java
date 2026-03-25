package com.okinc.business.market.data.model.smart_money;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TokenMetricsFilterRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String tokenAgeMax;
    public final String tokenAgeMin;
    public final String tokenBuyTxsMax;
    public final String tokenBuyTxsMin;
    public final String tokenHoldersMax;
    public final String tokenHoldersMin;
    public final String tokenMcapMax;
    public final String tokenMcapMin;
    public final String tokenSellTxsMax;
    public final String tokenSellTxsMin;
    public final String tokenTxsMax;
    public final String tokenTxsMin;
    public final String tokenVolumeMax;
    public final String tokenVolumeMin;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenMetricsFilterRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenMetricsFilterRequest copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new TokenMetricsFilterRequest(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenMetricsFilterRequest)) {
            return false;
        }
        TokenMetricsFilterRequest tokenMetricsFilterRequest = (TokenMetricsFilterRequest) obj;
        return Intrinsics.EZpvd((Object) this.tokenMcapMin, (Object) tokenMetricsFilterRequest.tokenMcapMin) && Intrinsics.EZpvd((Object) this.tokenMcapMax, (Object) tokenMetricsFilterRequest.tokenMcapMax) && Intrinsics.EZpvd((Object) this.tokenVolumeMin, (Object) tokenMetricsFilterRequest.tokenVolumeMin) && Intrinsics.EZpvd((Object) this.tokenVolumeMax, (Object) tokenMetricsFilterRequest.tokenVolumeMax) && Intrinsics.EZpvd((Object) this.tokenHoldersMin, (Object) tokenMetricsFilterRequest.tokenHoldersMin) && Intrinsics.EZpvd((Object) this.tokenHoldersMax, (Object) tokenMetricsFilterRequest.tokenHoldersMax) && Intrinsics.EZpvd((Object) this.tokenAgeMin, (Object) tokenMetricsFilterRequest.tokenAgeMin) && Intrinsics.EZpvd((Object) this.tokenAgeMax, (Object) tokenMetricsFilterRequest.tokenAgeMax) && Intrinsics.EZpvd((Object) this.tokenTxsMin, (Object) tokenMetricsFilterRequest.tokenTxsMin) && Intrinsics.EZpvd((Object) this.tokenTxsMax, (Object) tokenMetricsFilterRequest.tokenTxsMax) && Intrinsics.EZpvd((Object) this.tokenBuyTxsMin, (Object) tokenMetricsFilterRequest.tokenBuyTxsMin) && Intrinsics.EZpvd((Object) this.tokenBuyTxsMax, (Object) tokenMetricsFilterRequest.tokenBuyTxsMax) && Intrinsics.EZpvd((Object) this.tokenSellTxsMin, (Object) tokenMetricsFilterRequest.tokenSellTxsMin) && Intrinsics.EZpvd((Object) this.tokenSellTxsMax, (Object) tokenMetricsFilterRequest.tokenSellTxsMax);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.tokenMcapMin.hashCode() * 31) + this.tokenMcapMax.hashCode()) * 31) + this.tokenVolumeMin.hashCode()) * 31) + this.tokenVolumeMax.hashCode()) * 31) + this.tokenHoldersMin.hashCode()) * 31) + this.tokenHoldersMax.hashCode()) * 31) + this.tokenAgeMin.hashCode()) * 31) + this.tokenAgeMax.hashCode()) * 31) + this.tokenTxsMin.hashCode()) * 31) + this.tokenTxsMax.hashCode()) * 31) + this.tokenBuyTxsMin.hashCode()) * 31) + this.tokenBuyTxsMax.hashCode()) * 31) + this.tokenSellTxsMin.hashCode()) * 31) + this.tokenSellTxsMax.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenMetricsFilterRequest(tokenMcapMin=" + this.tokenMcapMin + ", tokenMcapMax=" + this.tokenMcapMax + ", tokenVolumeMin=" + this.tokenVolumeMin + ", tokenVolumeMax=" + this.tokenVolumeMax + ", tokenHoldersMin=" + this.tokenHoldersMin + ", tokenHoldersMax=" + this.tokenHoldersMax + ", tokenAgeMin=" + this.tokenAgeMin + ", tokenAgeMax=" + this.tokenAgeMax + ", tokenTxsMin=" + this.tokenTxsMin + ", tokenTxsMax=" + this.tokenTxsMax + ", tokenBuyTxsMin=" + this.tokenBuyTxsMin + ", tokenBuyTxsMax=" + this.tokenBuyTxsMax + ", tokenSellTxsMin=" + this.tokenSellTxsMin + ", tokenSellTxsMax=" + this.tokenSellTxsMax + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.TokenMetricsFilterRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenMetricsFilterRequest> serializer() {
            return TokenMetricsFilterRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenMetricsFilterRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenMcapMin = "";
        } else {
            this.tokenMcapMin = str;
        }
        if ((i & 2) == 0) {
            this.tokenMcapMax = "";
        } else {
            this.tokenMcapMax = str2;
        }
        if ((i & 4) == 0) {
            this.tokenVolumeMin = "";
        } else {
            this.tokenVolumeMin = str3;
        }
        if ((i & 8) == 0) {
            this.tokenVolumeMax = "";
        } else {
            this.tokenVolumeMax = str4;
        }
        if ((i & 16) == 0) {
            this.tokenHoldersMin = "";
        } else {
            this.tokenHoldersMin = str5;
        }
        if ((i & 32) == 0) {
            this.tokenHoldersMax = "";
        } else {
            this.tokenHoldersMax = str6;
        }
        if ((i & 64) == 0) {
            this.tokenAgeMin = "";
        } else {
            this.tokenAgeMin = str7;
        }
        if ((i & 128) == 0) {
            this.tokenAgeMax = "";
        } else {
            this.tokenAgeMax = str8;
        }
        if ((i & 256) == 0) {
            this.tokenTxsMin = "";
        } else {
            this.tokenTxsMin = str9;
        }
        if ((i & 512) == 0) {
            this.tokenTxsMax = "";
        } else {
            this.tokenTxsMax = str10;
        }
        if ((i & 1024) == 0) {
            this.tokenBuyTxsMin = "";
        } else {
            this.tokenBuyTxsMin = str11;
        }
        if ((i & 2048) == 0) {
            this.tokenBuyTxsMax = "";
        } else {
            this.tokenBuyTxsMax = str12;
        }
        if ((i & 4096) == 0) {
            this.tokenSellTxsMin = "";
        } else {
            this.tokenSellTxsMin = str13;
        }
        if ((i & 8192) == 0) {
            this.tokenSellTxsMax = "";
        } else {
            this.tokenSellTxsMax = str14;
        }
    }

    public static final /* synthetic */ void EZpvd(TokenMetricsFilterRequest tokenMetricsFilterRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenMcapMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenMetricsFilterRequest.tokenMcapMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenMcapMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenMetricsFilterRequest.tokenMcapMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenVolumeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenMetricsFilterRequest.tokenVolumeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenVolumeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenMetricsFilterRequest.tokenVolumeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenHoldersMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenMetricsFilterRequest.tokenHoldersMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenHoldersMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tokenMetricsFilterRequest.tokenHoldersMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenAgeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tokenMetricsFilterRequest.tokenAgeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenAgeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tokenMetricsFilterRequest.tokenAgeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenTxsMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tokenMetricsFilterRequest.tokenTxsMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenTxsMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tokenMetricsFilterRequest.tokenTxsMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenBuyTxsMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tokenMetricsFilterRequest.tokenBuyTxsMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenBuyTxsMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tokenMetricsFilterRequest.tokenBuyTxsMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenSellTxsMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tokenMetricsFilterRequest.tokenSellTxsMin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) tokenMetricsFilterRequest.tokenSellTxsMax, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, tokenMetricsFilterRequest.tokenSellTxsMax);
    }

    public TokenMetricsFilterRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.tokenMcapMin = str;
        this.tokenMcapMax = str2;
        this.tokenVolumeMin = str3;
        this.tokenVolumeMax = str4;
        this.tokenHoldersMin = str5;
        this.tokenHoldersMax = str6;
        this.tokenAgeMin = str7;
        this.tokenAgeMax = str8;
        this.tokenTxsMin = str9;
        this.tokenTxsMax = str10;
        this.tokenBuyTxsMin = str11;
        this.tokenBuyTxsMax = str12;
        this.tokenSellTxsMin = str13;
        this.tokenSellTxsMax = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.data.model.smart_money.TokenMetricsFilterRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenMetricsFilterRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) == 0 ? str14 : "");
    }
}
