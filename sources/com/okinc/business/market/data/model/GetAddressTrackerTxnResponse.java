package com.okinc.business.market.data.model;

import com.okinc.business.market.data.constant.AddressTrackerUserAction;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class GetAddressTrackerTxnResponse {
    public static final KSerializer<Object>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String addressAlias;
    public final long blockHeight;
    public final String chainLogoUrl;
    public final long logIndex;
    public final String marketCap;
    public final String pnL;
    public final String price;
    public final String tokenAddress;
    public final String tokenChainId;
    public final String tokenLogoUrl;
    public final String tokenNum;
    public final String tokenSymbol;
    public final long tradeTime;
    public final String turnover;
    public final String txHash;
    public final AddressTrackerUserAction userAction;
    public final AddressTrackerUserAction userActionForDisplay;
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetAddressTrackerTxnResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AddressTrackerUserAction) null, (String) null, (String) null, 0L, 0L, 0L, (String) null, (String) null, (String) null, (String) null, (AddressTrackerUserAction) null, (String) null, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetAddressTrackerTxnResponse AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull AddressTrackerUserAction addressTrackerUserAction, @NotNull String str7, @NotNull String str8, long j, long j2, long j3, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull AddressTrackerUserAction addressTrackerUserAction2, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(addressTrackerUserAction, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(addressTrackerUserAction2, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new GetAddressTrackerTxnResponse(str, str2, str3, str4, str5, str6, addressTrackerUserAction, str7, str8, j, j2, j3, str9, str10, str11, str12, addressTrackerUserAction2, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAddressTrackerTxnResponse)) {
            return false;
        }
        GetAddressTrackerTxnResponse getAddressTrackerTxnResponse = (GetAddressTrackerTxnResponse) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) getAddressTrackerTxnResponse.walletAddress) && Intrinsics.EZpvd((Object) this.addressAlias, (Object) getAddressTrackerTxnResponse.addressAlias) && Intrinsics.EZpvd((Object) this.tokenChainId, (Object) getAddressTrackerTxnResponse.tokenChainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) getAddressTrackerTxnResponse.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) getAddressTrackerTxnResponse.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) getAddressTrackerTxnResponse.tokenLogoUrl) && this.userAction == getAddressTrackerTxnResponse.userAction && Intrinsics.EZpvd((Object) this.turnover, (Object) getAddressTrackerTxnResponse.turnover) && Intrinsics.EZpvd((Object) this.price, (Object) getAddressTrackerTxnResponse.price) && this.tradeTime == getAddressTrackerTxnResponse.tradeTime && this.blockHeight == getAddressTrackerTxnResponse.blockHeight && this.logIndex == getAddressTrackerTxnResponse.logIndex && Intrinsics.EZpvd((Object) this.txHash, (Object) getAddressTrackerTxnResponse.txHash) && Intrinsics.EZpvd((Object) this.marketCap, (Object) getAddressTrackerTxnResponse.marketCap) && Intrinsics.EZpvd((Object) this.pnL, (Object) getAddressTrackerTxnResponse.pnL) && Intrinsics.EZpvd((Object) this.tokenNum, (Object) getAddressTrackerTxnResponse.tokenNum) && this.userActionForDisplay == getAddressTrackerTxnResponse.userActionForDisplay && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) getAddressTrackerTxnResponse.chainLogoUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.walletAddress.hashCode() * 31) + this.addressAlias.hashCode()) * 31) + this.tokenChainId.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.userAction.hashCode()) * 31) + this.turnover.hashCode()) * 31) + this.price.hashCode()) * 31) + Long.hashCode(this.tradeTime)) * 31) + Long.hashCode(this.blockHeight)) * 31) + Long.hashCode(this.logIndex)) * 31) + this.txHash.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.pnL.hashCode()) * 31) + this.tokenNum.hashCode()) * 31) + this.userActionForDisplay.hashCode()) * 31) + this.chainLogoUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetAddressTrackerTxnResponse(walletAddress=" + this.walletAddress + ", addressAlias=" + this.addressAlias + ", tokenChainId=" + this.tokenChainId + ", tokenAddress=" + this.tokenAddress + ", tokenSymbol=" + this.tokenSymbol + ", tokenLogoUrl=" + this.tokenLogoUrl + ", userAction=" + this.userAction + ", turnover=" + this.turnover + ", price=" + this.price + ", tradeTime=" + this.tradeTime + ", blockHeight=" + this.blockHeight + ", logIndex=" + this.logIndex + ", txHash=" + this.txHash + ", marketCap=" + this.marketCap + ", pnL=" + this.pnL + ", tokenNum=" + this.tokenNum + ", userActionForDisplay=" + this.userActionForDisplay + ", chainLogoUrl=" + this.chainLogoUrl + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.GetAddressTrackerTxnResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetAddressTrackerTxnResponse> serializer() {
            return GetAddressTrackerTxnResponse$$serializer.INSTANCE;
        }
    }

    static {
        AddressTrackerUserAction.Companion companion = AddressTrackerUserAction.Companion;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, companion.serializer(), null, null, null, null, null, null, null, null, null, companion.serializer(), null};
    }

    public /* synthetic */ GetAddressTrackerTxnResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, AddressTrackerUserAction addressTrackerUserAction, String str7, String str8, long j, long j2, long j3, String str9, String str10, String str11, String str12, AddressTrackerUserAction addressTrackerUserAction2, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str;
        }
        if ((i & 2) == 0) {
            this.addressAlias = "";
        } else {
            this.addressAlias = str2;
        }
        if ((i & 4) == 0) {
            this.tokenChainId = "";
        } else {
            this.tokenChainId = str3;
        }
        if ((i & 8) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str4;
        }
        if ((i & 16) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str5;
        }
        if ((i & 32) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str6;
        }
        this.userAction = (i & 64) == 0 ? AddressTrackerUserAction.UNKNOWN : addressTrackerUserAction;
        if ((i & 128) == 0) {
            this.turnover = "";
        } else {
            this.turnover = str7;
        }
        if ((i & 256) == 0) {
            this.price = "";
        } else {
            this.price = str8;
        }
        if ((i & 512) == 0) {
            this.tradeTime = 0L;
        } else {
            this.tradeTime = j;
        }
        if ((i & 1024) == 0) {
            this.blockHeight = 0L;
        } else {
            this.blockHeight = j2;
        }
        this.logIndex = (i & 2048) != 0 ? j3 : 0L;
        if ((i & 4096) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str9;
        }
        if ((i & 8192) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str10;
        }
        if ((i & 16384) == 0) {
            this.pnL = "";
        } else {
            this.pnL = str11;
        }
        if ((32768 & i) == 0) {
            this.tokenNum = "";
        } else {
            this.tokenNum = str12;
        }
        this.userActionForDisplay = (65536 & i) == 0 ? AddressTrackerUserAction.UNKNOWN : addressTrackerUserAction2;
        if ((i & 131072) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str13;
        }
    }

    public static final /* synthetic */ void AEQbTJ(GetAddressTrackerTxnResponse getAddressTrackerTxnResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) getAddressTrackerTxnResponse.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, getAddressTrackerTxnResponse.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) getAddressTrackerTxnResponse.addressAlias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, getAddressTrackerTxnResponse.addressAlias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) getAddressTrackerTxnResponse.tokenChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, getAddressTrackerTxnResponse.tokenChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) getAddressTrackerTxnResponse.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, getAddressTrackerTxnResponse.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) getAddressTrackerTxnResponse.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, getAddressTrackerTxnResponse.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) getAddressTrackerTxnResponse.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, getAddressTrackerTxnResponse.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || getAddressTrackerTxnResponse.userAction != AddressTrackerUserAction.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], getAddressTrackerTxnResponse.userAction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) getAddressTrackerTxnResponse.turnover, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, getAddressTrackerTxnResponse.turnover);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) getAddressTrackerTxnResponse.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, getAddressTrackerTxnResponse.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || getAddressTrackerTxnResponse.tradeTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 9, getAddressTrackerTxnResponse.tradeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || getAddressTrackerTxnResponse.blockHeight != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 10, getAddressTrackerTxnResponse.blockHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || getAddressTrackerTxnResponse.logIndex != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 11, getAddressTrackerTxnResponse.logIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) getAddressTrackerTxnResponse.txHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, getAddressTrackerTxnResponse.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) getAddressTrackerTxnResponse.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, getAddressTrackerTxnResponse.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) getAddressTrackerTxnResponse.pnL, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, getAddressTrackerTxnResponse.pnL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) getAddressTrackerTxnResponse.tokenNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, getAddressTrackerTxnResponse.tokenNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || getAddressTrackerTxnResponse.userActionForDisplay != AddressTrackerUserAction.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], getAddressTrackerTxnResponse.userActionForDisplay);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && Intrinsics.EZpvd((Object) getAddressTrackerTxnResponse.chainLogoUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 17, getAddressTrackerTxnResponse.chainLogoUrl);
    }

    public GetAddressTrackerTxnResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull AddressTrackerUserAction addressTrackerUserAction, @NotNull String str7, @NotNull String str8, long j, long j2, long j3, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull AddressTrackerUserAction addressTrackerUserAction2, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(addressTrackerUserAction, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(addressTrackerUserAction2, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.walletAddress = str;
        this.addressAlias = str2;
        this.tokenChainId = str3;
        this.tokenAddress = str4;
        this.tokenSymbol = str5;
        this.tokenLogoUrl = str6;
        this.userAction = addressTrackerUserAction;
        this.turnover = str7;
        this.price = str8;
        this.tradeTime = j;
        this.blockHeight = j2;
        this.logIndex = j3;
        this.txHash = str9;
        this.marketCap = str10;
        this.pnL = str11;
        this.tokenNum = str12;
        this.userActionForDisplay = addressTrackerUserAction2;
        this.chainLogoUrl = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00cd: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:com.okinc.business.market.data.constant.AddressTrackerUserAction:?: TERNARY null = ((wrap:int:0x0034: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0038: SGET  A[WRAPPED] (LINE:22) com.okinc.business.market.data.constant.AddressTrackerUserAction.UNKNOWN com.okinc.business.market.data.constant.AddressTrackerUserAction) : (r29v0 com.okinc.business.market.data.constant.AddressTrackerUserAction))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x004d: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r32v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0057: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r34v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0060: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r36v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:0x007a: TERNARY null = ((wrap:int:0x0071: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007c: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:com.okinc.business.market.data.constant.AddressTrackerUserAction:?: TERNARY null = ((wrap:int:0x0093: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0097: SGET  A[WRAPPED] (LINE:42) com.okinc.business.market.data.constant.AddressTrackerUserAction.UNKNOWN com.okinc.business.market.data.constant.AddressTrackerUserAction) : (r42v0 com.okinc.business.market.data.constant.AddressTrackerUserAction))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.constant.AddressTrackerUserAction, java.lang.String, java.lang.String, long, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.constant.AddressTrackerUserAction, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.market.data.model.GetAddressTrackerTxnResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.constant.AddressTrackerUserAction, java.lang.String, java.lang.String, long, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.constant.AddressTrackerUserAction, java.lang.String):void type: THIS */
    public /* synthetic */ GetAddressTrackerTxnResponse(String str, String str2, String str3, String str4, String str5, String str6, AddressTrackerUserAction addressTrackerUserAction, String str7, String str8, long j, long j2, long j3, String str9, String str10, String str11, String str12, AddressTrackerUserAction addressTrackerUserAction2, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? AddressTrackerUserAction.UNKNOWN : addressTrackerUserAction, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? 0L : j, (i & 1024) != 0 ? 0L : j2, (i & 2048) == 0 ? j3 : 0L, (i & 4096) != 0 ? "" : str9, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? AddressTrackerUserAction.UNKNOWN : addressTrackerUserAction2, (i & 131072) != 0 ? "" : str13);
    }
}
