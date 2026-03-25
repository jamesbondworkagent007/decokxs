package com.okinc.dexkline.market.data.model.position_pnl;

import com.okinc.dexkline.dexlogic.txs.TxType;
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
public final class PnLTransactionData {
    public static final int $stable = 0;
    public final String amount;
    public final long blockHeight;
    public final long blockTime;
    public final int chainId;
    public final boolean flag;
    public final String globalIndex;
    public final long id;
    public final String price;
    public final String singleRealizedProfit;
    public final String turnover;
    public final String txHash;
    public final String txHashUrl;
    public final TxType type;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, TxType.Companion.serializer(), null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PnLTransactionData() {
        this(0L, 0, (String) null, (String) null, 0L, 0L, (TxType) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.txHashUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.turnover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.globalIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.blockTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLTransactionData copydefault(long j, int i, @NotNull String str, @NotNull String str2, long j2, long j3, @NotNull TxType txType, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new PnLTransactionData(j, i, str, str2, j2, j3, txType, str3, str4, str5, str6, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.flag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnLTransactionData)) {
            return false;
        }
        PnLTransactionData pnLTransactionData = (PnLTransactionData) obj;
        return this.id == pnLTransactionData.id && this.chainId == pnLTransactionData.chainId && Intrinsics.EZpvd((Object) this.txHash, (Object) pnLTransactionData.txHash) && Intrinsics.EZpvd((Object) this.txHashUrl, (Object) pnLTransactionData.txHashUrl) && this.blockHeight == pnLTransactionData.blockHeight && this.blockTime == pnLTransactionData.blockTime && this.type == pnLTransactionData.type && Intrinsics.EZpvd((Object) this.amount, (Object) pnLTransactionData.amount) && Intrinsics.EZpvd((Object) this.price, (Object) pnLTransactionData.price) && Intrinsics.EZpvd((Object) this.turnover, (Object) pnLTransactionData.turnover) && Intrinsics.EZpvd((Object) this.singleRealizedProfit, (Object) pnLTransactionData.singleRealizedProfit) && Intrinsics.EZpvd((Object) this.globalIndex, (Object) pnLTransactionData.globalIndex) && this.flag == pnLTransactionData.flag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.chainId)) * 31) + this.txHash.hashCode()) * 31) + this.txHashUrl.hashCode()) * 31) + Long.hashCode(this.blockHeight)) * 31) + Long.hashCode(this.blockTime)) * 31) + this.type.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.price.hashCode()) * 31) + this.turnover.hashCode()) * 31) + this.singleRealizedProfit.hashCode()) * 31) + this.globalIndex.hashCode()) * 31) + Boolean.hashCode(this.flag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PnLTransactionData(id=" + this.id + ", chainId=" + this.chainId + ", txHash=" + this.txHash + ", txHashUrl=" + this.txHashUrl + ", blockHeight=" + this.blockHeight + ", blockTime=" + this.blockTime + ", type=" + this.type + ", amount=" + this.amount + ", price=" + this.price + ", turnover=" + this.turnover + ", singleRealizedProfit=" + this.singleRealizedProfit + ", globalIndex=" + this.globalIndex + ", flag=" + this.flag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxType valueOf() {
        return this.type;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PnLTransactionData> serializer() {
            return PnLTransactionData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PnLTransactionData(int i, long j, int i2, String str, String str2, long j2, long j3, TxType txType, String str3, String str4, String str5, String str6, String str7, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = 0L;
        } else {
            this.id = j;
        }
        if ((i & 2) == 0) {
            this.chainId = 0;
        } else {
            this.chainId = i2;
        }
        if ((i & 4) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str;
        }
        if ((i & 8) == 0) {
            this.txHashUrl = "";
        } else {
            this.txHashUrl = str2;
        }
        if ((i & 16) == 0) {
            this.blockHeight = 0L;
        } else {
            this.blockHeight = j2;
        }
        if ((i & 32) == 0) {
            this.blockTime = 0L;
        } else {
            this.blockTime = j3;
        }
        this.type = (i & 64) == 0 ? TxType.ALL : txType;
        if ((i & 128) == 0) {
            this.amount = "";
        } else {
            this.amount = str3;
        }
        if ((i & 256) == 0) {
            this.price = "";
        } else {
            this.price = str4;
        }
        if ((i & 512) == 0) {
            this.turnover = "";
        } else {
            this.turnover = str5;
        }
        if ((i & 1024) == 0) {
            this.singleRealizedProfit = "";
        } else {
            this.singleRealizedProfit = str6;
        }
        if ((i & 2048) == 0) {
            this.globalIndex = "";
        } else {
            this.globalIndex = str7;
        }
        if ((i & 4096) == 0) {
            this.flag = false;
        } else {
            this.flag = z;
        }
    }

    public static final /* synthetic */ void EZpvd(PnLTransactionData pnLTransactionData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || pnLTransactionData.id != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, pnLTransactionData.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || pnLTransactionData.chainId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, pnLTransactionData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) pnLTransactionData.txHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, pnLTransactionData.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) pnLTransactionData.txHashUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, pnLTransactionData.txHashUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || pnLTransactionData.blockHeight != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, pnLTransactionData.blockHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || pnLTransactionData.blockTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, pnLTransactionData.blockTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || pnLTransactionData.type != TxType.ALL) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], pnLTransactionData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) pnLTransactionData.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, pnLTransactionData.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) pnLTransactionData.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, pnLTransactionData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) pnLTransactionData.turnover, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, pnLTransactionData.turnover);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) pnLTransactionData.singleRealizedProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, pnLTransactionData.singleRealizedProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) pnLTransactionData.globalIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, pnLTransactionData.globalIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || pnLTransactionData.flag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, pnLTransactionData.flag);
        }
    }

    public PnLTransactionData(long j, int i, @NotNull String str, @NotNull String str2, long j2, long j3, @NotNull TxType txType, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.id = j;
        this.chainId = i;
        this.txHash = str;
        this.txHashUrl = str2;
        this.blockHeight = j2;
        this.blockTime = j3;
        this.type = txType;
        this.amount = str3;
        this.price = str4;
        this.turnover = str5;
        this.singleRealizedProfit = str6;
        this.globalIndex = str7;
        this.flag = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008d: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0026: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r22v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002e: ARITH (r33v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r24v0 long) : (0 long))
  (wrap:com.okinc.dexkline.dexlogic.txs.TxType:?: TERNARY null = ((wrap:int:0x0035: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: SGET  A[WRAPPED] (LINE:23) com.okinc.dexkline.dexlogic.txs.TxType.ALL com.okinc.dexkline.dexlogic.txs.TxType) : (r26v0 com.okinc.dexkline.dexlogic.txs.TxType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0069: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
 A[MD:(long, int, java.lang.String, java.lang.String, long, long, com.okinc.dexkline.dexlogic.txs.TxType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:9) call: com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionData.<init>(long, int, java.lang.String, java.lang.String, long, long, com.okinc.dexkline.dexlogic.txs.TxType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ PnLTransactionData(long j, int i, String str, String str2, long j2, long j3, TxType txType, String str3, String str4, String str5, String str6, String str7, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 0L : j2, (i2 & 32) == 0 ? j3 : 0L, (i2 & 64) != 0 ? TxType.ALL : txType, (i2 & 128) != 0 ? "" : str3, (i2 & 256) != 0 ? "" : str4, (i2 & 512) != 0 ? "" : str5, (i2 & 1024) != 0 ? "" : str6, (i2 & 2048) != 0 ? "" : str7, (i2 & 4096) != 0 ? false : z);
    }
}
