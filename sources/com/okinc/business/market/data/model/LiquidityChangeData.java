package com.okinc.business.market.data.model;

import com.okinc.business.market.data.constant.LiquidityChangeType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class LiquidityChangeData {
    public final String amount;
    public final String chainId;
    public final List<TokenChangeData> changedTokenInfo;
    public final String dexName;
    public final String id;
    public final String poolLogoUrl;
    public final String poolName;
    public final String timestamp;
    public final String tokenSymbol;
    public final String txHashUrl;
    public final LiquidityChangeType type;
    public final String value;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, LiquidityChangeType.Companion.serializer(), null, null, null, null, null, new ArrayListSerializer(TokenChangeData$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiquidityChangeData() {
        this((String) null, (String) null, (String) null, (LiquidityChangeType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenChangeData> AEQbTJ() {
        return this.changedTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.poolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.txHashUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityChangeType DbNXlk() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityChangeData EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull LiquidityChangeType liquidityChangeType, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<TokenChangeData> list, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(liquidityChangeType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new LiquidityChangeData(str, str2, str3, liquidityChangeType, str4, str5, str6, str7, str8, list, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.dexName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.poolLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiquidityChangeData)) {
            return false;
        }
        LiquidityChangeData liquidityChangeData = (LiquidityChangeData) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) liquidityChangeData.id) && Intrinsics.EZpvd((Object) this.chainId, (Object) liquidityChangeData.chainId) && Intrinsics.EZpvd((Object) this.dexName, (Object) liquidityChangeData.dexName) && this.type == liquidityChangeData.type && Intrinsics.EZpvd((Object) this.poolName, (Object) liquidityChangeData.poolName) && Intrinsics.EZpvd((Object) this.poolLogoUrl, (Object) liquidityChangeData.poolLogoUrl) && Intrinsics.EZpvd((Object) this.txHashUrl, (Object) liquidityChangeData.txHashUrl) && Intrinsics.EZpvd((Object) this.value, (Object) liquidityChangeData.value) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) liquidityChangeData.walletAddress) && Intrinsics.EZpvd(this.changedTokenInfo, liquidityChangeData.changedTokenInfo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) liquidityChangeData.tokenSymbol) && Intrinsics.EZpvd((Object) this.amount, (Object) liquidityChangeData.amount) && Intrinsics.EZpvd((Object) this.timestamp, (Object) liquidityChangeData.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.id.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.dexName.hashCode()) * 31) + this.type.hashCode()) * 31) + this.poolName.hashCode()) * 31) + this.poolLogoUrl.hashCode()) * 31) + this.txHashUrl.hashCode()) * 31) + this.value.hashCode()) * 31) + this.walletAddress.hashCode()) * 31) + this.changedTokenInfo.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.timestamp.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidityChangeData(id=" + this.id + ", chainId=" + this.chainId + ", dexName=" + this.dexName + ", type=" + this.type + ", poolName=" + this.poolName + ", poolLogoUrl=" + this.poolLogoUrl + ", txHashUrl=" + this.txHashUrl + ", value=" + this.value + ", walletAddress=" + this.walletAddress + ", changedTokenInfo=" + this.changedTokenInfo + ", tokenSymbol=" + this.tokenSymbol + ", amount=" + this.amount + ", timestamp=" + this.timestamp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.tokenSymbol;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.LiquidityChangeData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiquidityChangeData> serializer() {
            return LiquidityChangeData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiquidityChangeData(int i, String str, String str2, String str3, LiquidityChangeType liquidityChangeType, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.dexName = "";
        } else {
            this.dexName = str3;
        }
        this.type = (i & 8) == 0 ? LiquidityChangeType.All : liquidityChangeType;
        if ((i & 16) == 0) {
            this.poolName = "";
        } else {
            this.poolName = str4;
        }
        if ((i & 32) == 0) {
            this.poolLogoUrl = "";
        } else {
            this.poolLogoUrl = str5;
        }
        if ((i & 64) == 0) {
            this.txHashUrl = "";
        } else {
            this.txHashUrl = str6;
        }
        if ((i & 128) == 0) {
            this.value = "";
        } else {
            this.value = str7;
        }
        if ((i & 256) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str8;
        }
        this.changedTokenInfo = (i & 512) == 0 ? yDY.AhwBna() : list;
        if ((i & 1024) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str9;
        }
        if ((i & 2048) == 0) {
            this.amount = "";
        } else {
            this.amount = str10;
        }
        if ((i & 4096) == 0) {
            this.timestamp = "";
        } else {
            this.timestamp = str11;
        }
    }

    public static final /* synthetic */ void OLrzqt(LiquidityChangeData liquidityChangeData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) liquidityChangeData.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, liquidityChangeData.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) liquidityChangeData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, liquidityChangeData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) liquidityChangeData.dexName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, liquidityChangeData.dexName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || liquidityChangeData.type != LiquidityChangeType.All) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], liquidityChangeData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) liquidityChangeData.poolName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, liquidityChangeData.poolName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) liquidityChangeData.poolLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, liquidityChangeData.poolLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) liquidityChangeData.txHashUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, liquidityChangeData.txHashUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) liquidityChangeData.value, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, liquidityChangeData.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) liquidityChangeData.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, liquidityChangeData.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(liquidityChangeData.changedTokenInfo, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], liquidityChangeData.changedTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) liquidityChangeData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, liquidityChangeData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) liquidityChangeData.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, liquidityChangeData.amount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) liquidityChangeData.timestamp, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, liquidityChangeData.timestamp);
    }

    public LiquidityChangeData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull LiquidityChangeType liquidityChangeType, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<TokenChangeData> list, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(liquidityChangeType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.id = str;
        this.chainId = str2;
        this.dexName = str3;
        this.type = liquidityChangeType;
        this.poolName = str4;
        this.poolLogoUrl = str5;
        this.txHashUrl = str6;
        this.value = str7;
        this.walletAddress = str8;
        this.changedTokenInfo = list;
        this.tokenSymbol = str9;
        this.amount = str10;
        this.timestamp = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0089: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:com.okinc.business.market.data.constant.LiquidityChangeType:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: SGET  A[WRAPPED] (LINE:16) com.okinc.business.market.data.constant.LiquidityChangeType.All com.okinc.business.market.data.constant.LiquidityChangeType) : (r18v0 com.okinc.business.market.data.constant.LiquidityChangeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004c: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0050: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:28)) : (r24v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.constant.LiquidityChangeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.TokenChangeData>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.market.data.model.LiquidityChangeData.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.constant.LiquidityChangeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LiquidityChangeData(String str, String str2, String str3, LiquidityChangeType liquidityChangeType, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? LiquidityChangeType.All : liquidityChangeType, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? yDY.AhwBna() : list, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) == 0 ? str11 : "");
    }
}
