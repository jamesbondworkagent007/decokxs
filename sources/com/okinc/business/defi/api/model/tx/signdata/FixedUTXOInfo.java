package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FixedUTXOInfo {
    private String coinAmount;
    private Long coinId;
    private String from;
    private String inscriptionId;
    private boolean isUTXODup;
    private String nftId;
    private String nftLogoUrl;
    private String nftPrice;
    private Integer protocolId;
    private String signData;
    private String ticker;
    private String tickerId;
    private String tokenId;
    private String txHash;
    private String utxoHash;
    private String utxoIndex;
    private Integer vOut;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FixedUTXOInfo() {
        this((Long) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInscriptionId() {
        return this.inscriptionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftId() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftLogoUrl() {
        return this.nftLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftPrice() {
        return this.nftPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignData() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTicker() {
        return this.ticker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTickerId() {
        return this.tickerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUtxoHash() {
        return this.utxoHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUtxoIndex() {
        return this.utxoIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVOut() {
        return this.vOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUTXODup() {
        return this.isUTXODup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInscriptionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.inscriptionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nftId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftLogoUrl(String str) {
        this.nftLogoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nftPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolId(Integer num) {
        this.protocolId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTicker(String str) {
        this.ticker = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTickerId(String str) {
        this.tickerId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenId(String str) {
        this.tokenId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(String str) {
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUTXODup(boolean z) {
        this.isUTXODup = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtxoHash(String str) {
        this.utxoHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtxoIndex(String str) {
        this.utxoIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVOut(Integer num) {
        this.vOut = num;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FixedUTXOInfo> serializer() {
            return FixedUTXOInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FixedUTXOInfo(int i, Long l, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, Integer num2, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
        if ((i & 2) == 0) {
            this.nftId = "";
        } else {
            this.nftId = str;
        }
        if ((i & 4) == 0) {
            this.txHash = null;
        } else {
            this.txHash = str2;
        }
        if ((i & 8) == 0) {
            this.vOut = null;
        } else {
            this.vOut = num;
        }
        if ((i & 16) == 0) {
            this.inscriptionId = "";
        } else {
            this.inscriptionId = str3;
        }
        if ((i & 32) == 0) {
            this.coinAmount = "";
        } else {
            this.coinAmount = str4;
        }
        if ((i & 64) == 0) {
            this.nftPrice = "";
        } else {
            this.nftPrice = str5;
        }
        if ((i & 128) == 0) {
            this.signData = "";
        } else {
            this.signData = str6;
        }
        if ((i & 256) == 0) {
            this.from = "";
        } else {
            this.from = str7;
        }
        this.isUTXODup = (i & 512) == 0 ? false : z;
        if ((i & 1024) == 0) {
            this.utxoHash = "";
        } else {
            this.utxoHash = str8;
        }
        if ((i & 2048) == 0) {
            this.utxoIndex = "";
        } else {
            this.utxoIndex = str9;
        }
        if ((i & 4096) == 0) {
            this.protocolId = null;
        } else {
            this.protocolId = num2;
        }
        if ((i & 8192) == 0) {
            this.nftLogoUrl = null;
        } else {
            this.nftLogoUrl = str10;
        }
        if ((i & 16384) == 0) {
            this.tokenId = null;
        } else {
            this.tokenId = str11;
        }
        if ((32768 & i) == 0) {
            this.tickerId = null;
        } else {
            this.tickerId = str12;
        }
        if ((i & 65536) == 0) {
            this.ticker = null;
        } else {
            this.ticker = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(FixedUTXOInfo fixedUTXOInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || fixedUTXOInfo.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, fixedUTXOInfo.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fixedUTXOInfo.nftId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fixedUTXOInfo.nftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || fixedUTXOInfo.txHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, fixedUTXOInfo.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || fixedUTXOInfo.vOut != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, fixedUTXOInfo.vOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) fixedUTXOInfo.inscriptionId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, fixedUTXOInfo.inscriptionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) fixedUTXOInfo.coinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, fixedUTXOInfo.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) fixedUTXOInfo.nftPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, fixedUTXOInfo.nftPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) fixedUTXOInfo.signData, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, fixedUTXOInfo.signData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) fixedUTXOInfo.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, fixedUTXOInfo.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || fixedUTXOInfo.isUTXODup) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, fixedUTXOInfo.isUTXODup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) fixedUTXOInfo.utxoHash, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, fixedUTXOInfo.utxoHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) fixedUTXOInfo.utxoIndex, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, fixedUTXOInfo.utxoIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || fixedUTXOInfo.protocolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, fixedUTXOInfo.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || fixedUTXOInfo.nftLogoUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, fixedUTXOInfo.nftLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || fixedUTXOInfo.tokenId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, fixedUTXOInfo.tokenId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || fixedUTXOInfo.tickerId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, fixedUTXOInfo.tickerId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && fixedUTXOInfo.ticker == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, fixedUTXOInfo.ticker);
    }

    public FixedUTXOInfo(Long l, @NotNull String str, String str2, Integer num, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, String str8, String str9, Integer num2, String str10, String str11, String str12, String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.coinId = l;
        this.nftId = str;
        this.txHash = str2;
        this.vOut = num;
        this.inscriptionId = str3;
        this.coinAmount = str4;
        this.nftPrice = str5;
        this.signData = str6;
        this.from = str7;
        this.isUTXODup = z;
        this.utxoHash = str8;
        this.utxoIndex = str9;
        this.protocolId = num2;
        this.nftLogoUrl = str10;
        this.tokenId = str11;
        this.tickerId = str12;
        this.ticker = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b5: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0063: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r31v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007e: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:98) call: com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FixedUTXOInfo(Long l, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, Integer num2, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? "" : str8, (i & 2048) == 0 ? str9 : "", (i & 4096) != 0 ? null : num2, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : str12, (i & 65536) != 0 ? null : str13);
    }
}
