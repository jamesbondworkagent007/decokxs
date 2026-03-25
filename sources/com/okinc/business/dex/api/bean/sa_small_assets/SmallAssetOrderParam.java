package com.okinc.business.dex.api.bean.sa_small_assets;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SmallAssetOrderParam {
    private final String accountId;
    private final String chainId;
    private final String quoteId;
    private final Map<String, QuoteDetail> quotes;
    private final String signedIntent;
    private final String slippage;
    private final String slippageType;
    private final String targetTokenAddress;
    private final String teeId;
    private final String unsignedIntent;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, QuoteDetail$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmallAssetOrderParam() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.signedIntent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, QuoteDetail> component11() {
        return this.quotes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.targetTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.unsignedIntent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmallAssetOrderParam copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull Map<String, QuoteDetail> map) {
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
        Intrinsics.checkNotNullParameter(map, "");
        return new SmallAssetOrderParam(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallAssetOrderParam)) {
            return false;
        }
        SmallAssetOrderParam smallAssetOrderParam = (SmallAssetOrderParam) obj;
        return Intrinsics.EZpvd((Object) this.quoteId, (Object) smallAssetOrderParam.quoteId) && Intrinsics.EZpvd((Object) this.slippage, (Object) smallAssetOrderParam.slippage) && Intrinsics.EZpvd((Object) this.slippageType, (Object) smallAssetOrderParam.slippageType) && Intrinsics.EZpvd((Object) this.chainId, (Object) smallAssetOrderParam.chainId) && Intrinsics.EZpvd((Object) this.targetTokenAddress, (Object) smallAssetOrderParam.targetTokenAddress) && Intrinsics.EZpvd((Object) this.accountId, (Object) smallAssetOrderParam.accountId) && Intrinsics.EZpvd((Object) this.teeId, (Object) smallAssetOrderParam.teeId) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) smallAssetOrderParam.userWalletAddress) && Intrinsics.EZpvd((Object) this.unsignedIntent, (Object) smallAssetOrderParam.unsignedIntent) && Intrinsics.EZpvd((Object) this.signedIntent, (Object) smallAssetOrderParam.signedIntent) && Intrinsics.EZpvd(this.quotes, smallAssetOrderParam.quotes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, QuoteDetail> getQuotes() {
        return this.quotes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignedIntent() {
        return this.signedIntent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetTokenAddress() {
        return this.targetTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedIntent() {
        return this.unsignedIntent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.quoteId.hashCode() * 31) + this.slippage.hashCode()) * 31) + this.slippageType.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.targetTokenAddress.hashCode()) * 31) + this.accountId.hashCode()) * 31) + this.teeId.hashCode()) * 31) + this.userWalletAddress.hashCode()) * 31) + this.unsignedIntent.hashCode()) * 31) + this.signedIntent.hashCode()) * 31) + this.quotes.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmallAssetOrderParam(quoteId=" + this.quoteId + ", slippage=" + this.slippage + ", slippageType=" + this.slippageType + ", chainId=" + this.chainId + ", targetTokenAddress=" + this.targetTokenAddress + ", accountId=" + this.accountId + ", teeId=" + this.teeId + ", userWalletAddress=" + this.userWalletAddress + ", unsignedIntent=" + this.unsignedIntent + ", signedIntent=" + this.signedIntent + ", quotes=" + this.quotes + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetOrderParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmallAssetOrderParam> serializer() {
            return SmallAssetOrderParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmallAssetOrderParam(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.quoteId = "";
        } else {
            this.quoteId = str;
        }
        if ((i & 2) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str2;
        }
        if ((i & 4) == 0) {
            this.slippageType = "";
        } else {
            this.slippageType = str3;
        }
        if ((i & 8) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str4;
        }
        if ((i & 16) == 0) {
            this.targetTokenAddress = "";
        } else {
            this.targetTokenAddress = str5;
        }
        if ((i & 32) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str6;
        }
        if ((i & 64) == 0) {
            this.teeId = "";
        } else {
            this.teeId = str7;
        }
        if ((i & 128) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str8;
        }
        if ((i & 256) == 0) {
            this.unsignedIntent = "";
        } else {
            this.unsignedIntent = str9;
        }
        if ((i & 512) == 0) {
            this.signedIntent = "";
        } else {
            this.signedIntent = str10;
        }
        if ((i & 1024) == 0) {
            this.quotes = C56424yEw.KWHzl();
        } else {
            this.quotes = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(SmallAssetOrderParam smallAssetOrderParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) smallAssetOrderParam.quoteId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, smallAssetOrderParam.quoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) smallAssetOrderParam.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, smallAssetOrderParam.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) smallAssetOrderParam.slippageType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, smallAssetOrderParam.slippageType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) smallAssetOrderParam.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, smallAssetOrderParam.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) smallAssetOrderParam.targetTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, smallAssetOrderParam.targetTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) smallAssetOrderParam.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, smallAssetOrderParam.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) smallAssetOrderParam.teeId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, smallAssetOrderParam.teeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) smallAssetOrderParam.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, smallAssetOrderParam.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) smallAssetOrderParam.unsignedIntent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, smallAssetOrderParam.unsignedIntent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) smallAssetOrderParam.signedIntent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, smallAssetOrderParam.signedIntent);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd(smallAssetOrderParam.quotes, C56424yEw.KWHzl())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], smallAssetOrderParam.quotes);
    }

    public SmallAssetOrderParam(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull Map<String, QuoteDetail> map) {
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
        Intrinsics.checkNotNullParameter(map, "");
        this.quoteId = str;
        this.slippage = str2;
        this.slippageType = str3;
        this.chainId = str4;
        this.targetTokenAddress = str5;
        this.accountId = str6;
        this.teeId = str7;
        this.userWalletAddress = str8;
        this.unsignedIntent = str9;
        this.signedIntent = str10;
        this.quotes = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0054: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:19)) : (r23v0 java.util.Map))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, com.okinc.business.dex.api.bean.sa_small_assets.QuoteDetail>):void (m)] (LINE:8) call: com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetOrderParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ SmallAssetOrderParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "", (i & 1024) != 0 ? C56424yEw.KWHzl() : map);
    }
}
