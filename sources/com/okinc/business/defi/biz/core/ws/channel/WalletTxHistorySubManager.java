package com.okinc.business.defi.biz.core.ws.channel;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C11205cFp;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletTxHistorySubManager extends xZF<SubResponse> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xZF
    public boolean OLrzqt(@NotNull List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return false;
    }

    public WalletTxHistorySubManager() {
        super("wallet-transaction", true, false, 0L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
    }

    @Override // o.xZF
    public void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        super.OLrzqt(str);
    }

    @Override // o.xZF
    public void AEQbTJ(@NotNull xZF.TaskDescription<SubResponse> taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        super.AEQbTJ(taskDescription);
    }

    @Serializable
    public static final class SubResponse extends xZF.ActionBar {
        private final String address;
        private final long coinId;
        private boolean isShowCancel;
        private boolean isShowPending;
        private boolean isShowSpeedUp;
        private final String msgHash;
        private final String network;
        private final String orderId;
        private final String pendingToastInfo;
        private final String txId;
        private final int txStatus;
        private final Long txTime;
        private int txType;
        private final String txhash;
        private final String uOpHash;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponse() {
            this((String) null, (String) null, (Long) null, (String) null, 0L, 0, 0, false, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component10() {
            return this.isShowCancel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.pendingToastInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.orderId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component13() {
            return this.txhash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component14() {
            return this.uOpHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component15() {
            return this.msgHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.network;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component3() {
            return this.txTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.txId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component5() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component6() {
            return this.txStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component7() {
            return this.txType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component8() {
            return this.isShowPending;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component9() {
            return this.isShowSpeedUp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(String str, String str2, Long l, @NotNull String str3, long j, int i, int i2, boolean z, boolean z2, boolean z3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8) {
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new SubResponse(str, str2, l, str3, j, i, i2, z, z2, z3, str4, str5, str6, str7, str8);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubResponse)) {
                return false;
            }
            SubResponse subResponse = (SubResponse) obj;
            return Intrinsics.EZpvd((Object) this.address, (Object) subResponse.address) && Intrinsics.EZpvd((Object) this.network, (Object) subResponse.network) && Intrinsics.EZpvd(this.txTime, subResponse.txTime) && Intrinsics.EZpvd((Object) this.txId, (Object) subResponse.txId) && this.coinId == subResponse.coinId && this.txStatus == subResponse.txStatus && this.txType == subResponse.txType && this.isShowPending == subResponse.isShowPending && this.isShowSpeedUp == subResponse.isShowSpeedUp && this.isShowCancel == subResponse.isShowCancel && Intrinsics.EZpvd((Object) this.pendingToastInfo, (Object) subResponse.pendingToastInfo) && Intrinsics.EZpvd((Object) this.orderId, (Object) subResponse.orderId) && Intrinsics.EZpvd((Object) this.txhash, (Object) subResponse.txhash) && Intrinsics.EZpvd((Object) this.uOpHash, (Object) subResponse.uOpHash) && Intrinsics.EZpvd((Object) this.msgHash, (Object) subResponse.msgHash);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getCoinId() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.xZF.ActionBar
        public String getMAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            return this.txId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMsgHash() {
            return this.msgHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNetwork() {
            return this.network;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOrderId() {
            return this.orderId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPendingToastInfo() {
            return this.pendingToastInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTxId() {
            return this.txId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTxStatus() {
            return this.txStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getTxTime() {
            return this.txTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTxType() {
            return this.txType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTxhash() {
            return this.txhash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUOpHash() {
            return this.uOpHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.address;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.network;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            Long l = this.txTime;
            int iHashCode3 = l == null ? 0 : l.hashCode();
            int iHashCode4 = this.txId.hashCode();
            int iHashCode5 = Long.hashCode(this.coinId);
            int iHashCode6 = Integer.hashCode(this.txStatus);
            int iHashCode7 = Integer.hashCode(this.txType);
            int iHashCode8 = Boolean.hashCode(this.isShowPending);
            int iHashCode9 = Boolean.hashCode(this.isShowSpeedUp);
            int iHashCode10 = Boolean.hashCode(this.isShowCancel);
            int iHashCode11 = this.pendingToastInfo.hashCode();
            int iHashCode12 = this.orderId.hashCode();
            int iHashCode13 = this.txhash.hashCode();
            int iHashCode14 = this.uOpHash.hashCode();
            String str3 = this.msgHash;
            return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str3 == null ? 0 : str3.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isShowCancel() {
            return this.isShowCancel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isShowPending() {
            return this.isShowPending;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isShowSpeedUp() {
            return this.isShowSpeedUp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isTxTypeAuthorization() {
            int i = this.txType;
            return i == 4 || i == 6;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isTxTypeEIP7702Authorization() {
            int i = this.txType;
            return i == 81 || i == 82;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setShowCancel(boolean z) {
            this.isShowCancel = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setShowPending(boolean z) {
            this.isShowPending = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setShowSpeedUp(boolean z) {
            this.isShowSpeedUp = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTxType(int i) {
            this.txType = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(address=" + this.address + ", network=" + this.network + ", txTime=" + this.txTime + ", txId=" + this.txId + ", coinId=" + this.coinId + ", txStatus=" + this.txStatus + ", txType=" + this.txType + ", isShowPending=" + this.isShowPending + ", isShowSpeedUp=" + this.isShowSpeedUp + ", isShowCancel=" + this.isShowCancel + ", pendingToastInfo=" + this.pendingToastInfo + ", orderId=" + this.orderId + ", txhash=" + this.txhash + ", uOpHash=" + this.uOpHash + ", msgHash=" + this.msgHash + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponse> serializer() {
                return WalletTxHistorySubManager$SubResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponse(int i, String str, String str2, Long l, String str3, long j, int i2, int i3, boolean z, boolean z2, boolean z3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.address = null;
            } else {
                this.address = str;
            }
            if ((i & 2) == 0) {
                this.network = null;
            } else {
                this.network = str2;
            }
            if ((i & 4) == 0) {
                this.txTime = null;
            } else {
                this.txTime = l;
            }
            if ((i & 8) == 0) {
                this.txId = "";
            } else {
                this.txId = str3;
            }
            this.coinId = (i & 16) == 0 ? 0L : j;
            if ((i & 32) == 0) {
                this.txStatus = 0;
            } else {
                this.txStatus = i2;
            }
            if ((i & 64) == 0) {
                this.txType = 0;
            } else {
                this.txType = i3;
            }
            if ((i & 128) == 0) {
                this.isShowPending = false;
            } else {
                this.isShowPending = z;
            }
            if ((i & 256) == 0) {
                this.isShowSpeedUp = false;
            } else {
                this.isShowSpeedUp = z2;
            }
            if ((i & 512) == 0) {
                this.isShowCancel = false;
            } else {
                this.isShowCancel = z3;
            }
            if ((i & 1024) == 0) {
                this.pendingToastInfo = "";
            } else {
                this.pendingToastInfo = str4;
            }
            if ((i & 2048) == 0) {
                this.orderId = "";
            } else {
                this.orderId = str5;
            }
            if ((i & 4096) == 0) {
                this.txhash = "";
            } else {
                this.txhash = str6;
            }
            if ((i & 8192) == 0) {
                this.uOpHash = "";
            } else {
                this.uOpHash = str7;
            }
            if ((i & 16384) == 0) {
                this.msgHash = null;
            } else {
                this.msgHash = str8;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subResponse.address != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subResponse.address);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subResponse.network != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subResponse.network);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subResponse.txTime != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, subResponse.txTime);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) subResponse.txId, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 3, subResponse.txId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || subResponse.coinId != 0) {
                compositeEncoder.encodeLongElement(serialDescriptor, 4, subResponse.coinId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || subResponse.txStatus != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 5, subResponse.txStatus);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || subResponse.txType != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 6, subResponse.txType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || subResponse.isShowPending) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 7, subResponse.isShowPending);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || subResponse.isShowSpeedUp) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 8, subResponse.isShowSpeedUp);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || subResponse.isShowCancel) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 9, subResponse.isShowCancel);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) subResponse.pendingToastInfo, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 10, subResponse.pendingToastInfo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) subResponse.orderId, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 11, subResponse.orderId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) subResponse.txhash, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 12, subResponse.txhash);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) subResponse.uOpHash, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 13, subResponse.uOpHash);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && subResponse.msgHash == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, subResponse.msgHash);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a0: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0012: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r21v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0036: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004e: ARITH (r33v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r27v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006f: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r33v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, long, int, int, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:42) call: com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager.SubResponse.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, long, int, int, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ SubResponse(String str, String str2, Long l, String str3, long j, int i, int i2, boolean z, boolean z2, boolean z3, String str4, String str5, String str6, String str7, String str8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : l, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? 0L : j, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? false : z2, (i3 & 512) == 0 ? z3 : false, (i3 & 1024) != 0 ? "" : str4, (i3 & 2048) != 0 ? "" : str5, (i3 & 4096) != 0 ? "" : str6, (i3 & 8192) != 0 ? "" : str7, (i3 & 16384) != 0 ? null : str8);
        }

        public SubResponse(String str, String str2, Long l, @NotNull String str3, long j, int i, int i2, boolean z, boolean z2, boolean z3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8) {
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.address = str;
            this.network = str2;
            this.txTime = l;
            this.txId = str3;
            this.coinId = j;
            this.txStatus = i;
            this.txType = i2;
            this.isShowPending = z;
            this.isShowSpeedUp = z2;
            this.isShowCancel = z3;
            this.pendingToastInfo = str4;
            this.orderId = str5;
            this.txhash = str6;
            this.uOpHash = str7;
            this.msgHash = str8;
        }
    }
}
