package com.okinc.business.dex.trade.copytrading.edit.data.model;

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
public final class CreateOrderResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int chainId;
    private final long createTime;
    private final long expireTime;
    private final long modifyTime;
    private final String orderId;
    private final int status;
    private final String strategyId;
    private final int strategyMode;
    private final String strategyName;
    private final String trackedWalletAddress;
    private final int useStatus;
    private final String userWalletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateOrderResult() {
        this(0, 0L, 0L, 0L, (String) null, 0, (String) null, 0, (String) null, (String) null, 0, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.trackedWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.useStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.modifyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.strategyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateOrderResult copy(int i, long j, long j2, long j3, @NotNull String str, int i2, @NotNull String str2, int i3, @NotNull String str3, @NotNull String str4, int i4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new CreateOrderResult(i, j, j2, j3, str, i2, str2, i3, str3, str4, i4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderResult)) {
            return false;
        }
        CreateOrderResult createOrderResult = (CreateOrderResult) obj;
        return this.chainId == createOrderResult.chainId && this.createTime == createOrderResult.createTime && this.expireTime == createOrderResult.expireTime && this.modifyTime == createOrderResult.modifyTime && Intrinsics.EZpvd((Object) this.orderId, (Object) createOrderResult.orderId) && this.status == createOrderResult.status && Intrinsics.EZpvd((Object) this.strategyId, (Object) createOrderResult.strategyId) && this.strategyMode == createOrderResult.strategyMode && Intrinsics.EZpvd((Object) this.strategyName, (Object) createOrderResult.strategyName) && Intrinsics.EZpvd((Object) this.trackedWalletAddress, (Object) createOrderResult.trackedWalletAddress) && this.useStatus == createOrderResult.useStatus && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) createOrderResult.userWalletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getModifyTime() {
        return this.modifyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrategyMode() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyName() {
        return this.strategyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackedWalletAddress() {
        return this.trackedWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUseStatus() {
        return this.useStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.chainId) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.expireTime)) * 31) + Long.hashCode(this.modifyTime)) * 31) + this.orderId.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + this.strategyId.hashCode()) * 31) + Integer.hashCode(this.strategyMode)) * 31) + this.strategyName.hashCode()) * 31) + this.trackedWalletAddress.hashCode()) * 31) + Integer.hashCode(this.useStatus)) * 31) + this.userWalletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateOrderResult(chainId=" + this.chainId + ", createTime=" + this.createTime + ", expireTime=" + this.expireTime + ", modifyTime=" + this.modifyTime + ", orderId=" + this.orderId + ", status=" + this.status + ", strategyId=" + this.strategyId + ", strategyMode=" + this.strategyMode + ", strategyName=" + this.strategyName + ", trackedWalletAddress=" + this.trackedWalletAddress + ", useStatus=" + this.useStatus + ", userWalletAddress=" + this.userWalletAddress + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.data.model.CreateOrderResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateOrderResult> serializer() {
            return CreateOrderResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateOrderResult(int i, int i2, long j, long j2, long j3, String str, int i3, String str2, int i4, String str3, String str4, int i5, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = 0;
        } else {
            this.chainId = i2;
        }
        if ((i & 2) == 0) {
            this.createTime = 0L;
        } else {
            this.createTime = j;
        }
        if ((i & 4) == 0) {
            this.expireTime = 0L;
        } else {
            this.expireTime = j2;
        }
        this.modifyTime = (i & 8) != 0 ? j3 : 0L;
        if ((i & 16) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str;
        }
        if ((i & 32) == 0) {
            this.status = 0;
        } else {
            this.status = i3;
        }
        if ((i & 64) == 0) {
            this.strategyId = "";
        } else {
            this.strategyId = str2;
        }
        if ((i & 128) == 0) {
            this.strategyMode = 0;
        } else {
            this.strategyMode = i4;
        }
        if ((i & 256) == 0) {
            this.strategyName = "";
        } else {
            this.strategyName = str3;
        }
        if ((i & 512) == 0) {
            this.trackedWalletAddress = "";
        } else {
            this.trackedWalletAddress = str4;
        }
        if ((i & 1024) == 0) {
            this.useStatus = 0;
        } else {
            this.useStatus = i5;
        }
        if ((i & 2048) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CreateOrderResult createOrderResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || createOrderResult.chainId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, createOrderResult.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || createOrderResult.createTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, createOrderResult.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || createOrderResult.expireTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, createOrderResult.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || createOrderResult.modifyTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, createOrderResult.modifyTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) createOrderResult.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, createOrderResult.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || createOrderResult.status != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, createOrderResult.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) createOrderResult.strategyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, createOrderResult.strategyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || createOrderResult.strategyMode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, createOrderResult.strategyMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) createOrderResult.strategyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, createOrderResult.strategyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) createOrderResult.trackedWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, createOrderResult.trackedWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || createOrderResult.useStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, createOrderResult.useStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) createOrderResult.userWalletAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, createOrderResult.userWalletAddress);
    }

    public CreateOrderResult(int i, long j, long j2, long j3, @NotNull String str, int i2, @NotNull String str2, int i3, @NotNull String str3, @NotNull String str4, int i4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainId = i;
        this.createTime = j;
        this.expireTime = j2;
        this.modifyTime = j3;
        this.orderId = str;
        this.status = i2;
        this.strategyId = str2;
        this.strategyMode = i3;
        this.strategyName = str3;
        this.trackedWalletAddress = str4;
        this.useStatus = i4;
        this.userWalletAddress = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007e: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r18v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r20v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r22v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003d: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0055: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
 A[MD:(int, long, long, long, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:128) call: com.okinc.business.dex.trade.copytrading.edit.data.model.CreateOrderResult.<init>(int, long, long, long, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ CreateOrderResult(int i, long j, long j2, long j3, String str, int i2, String str2, int i3, String str3, String str4, int i4, String str5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0L : j, (i5 & 4) != 0 ? 0L : j2, (i5 & 8) == 0 ? j3 : 0L, (i5 & 16) != 0 ? "" : str, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? "" : str2, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? "" : str3, (i5 & 512) != 0 ? "" : str4, (i5 & 1024) != 0 ? 0 : i4, (i5 & 2048) == 0 ? str5 : "");
    }
}
