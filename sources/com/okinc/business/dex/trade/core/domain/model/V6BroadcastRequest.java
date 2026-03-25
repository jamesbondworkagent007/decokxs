package com.okinc.business.dex.trade.core.domain.model;

import com.okinc.business.dex.trade.core.domain.model.common.V6CallData;
import com.okinc.business.dex.trade.core.domain.model.common.V6CallData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class V6BroadcastRequest {
    private final V6BroadcastAccountInfo accountInfo;
    private final V6CallData callDataOut;
    private final List<String> mevSuppliers;
    private final String nonce;
    private final String orderId;
    private final List<SignedInfo> signedInfoList;
    private final boolean simulate;
    private final UnsignedData unsignedData;
    private final String userWalletAddress;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, new ArrayListSerializer(SignedInfo$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.simulate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6BroadcastAccountInfo component10() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.mevSuppliers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6CallData component6() {
        return this.callDataOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignedInfo> component8() {
        return this.signedInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnsignedData component9() {
        return this.unsignedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6BroadcastRequest copy(boolean z, String str, @NotNull String str2, @NotNull String str3, List<String> list, V6CallData v6CallData, @NotNull String str4, @NotNull List<SignedInfo> list2, UnsignedData unsignedData, @NotNull V6BroadcastAccountInfo v6BroadcastAccountInfo) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(v6BroadcastAccountInfo, "");
        return new V6BroadcastRequest(z, str, str2, str3, list, v6CallData, str4, list2, unsignedData, v6BroadcastAccountInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6BroadcastRequest)) {
            return false;
        }
        V6BroadcastRequest v6BroadcastRequest = (V6BroadcastRequest) obj;
        return this.simulate == v6BroadcastRequest.simulate && Intrinsics.EZpvd((Object) this.nonce, (Object) v6BroadcastRequest.nonce) && Intrinsics.EZpvd((Object) this.orderId, (Object) v6BroadcastRequest.orderId) && Intrinsics.EZpvd((Object) this.walletId, (Object) v6BroadcastRequest.walletId) && Intrinsics.EZpvd(this.mevSuppliers, v6BroadcastRequest.mevSuppliers) && Intrinsics.EZpvd(this.callDataOut, v6BroadcastRequest.callDataOut) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) v6BroadcastRequest.userWalletAddress) && Intrinsics.EZpvd(this.signedInfoList, v6BroadcastRequest.signedInfoList) && Intrinsics.EZpvd(this.unsignedData, v6BroadcastRequest.unsignedData) && Intrinsics.EZpvd(this.accountInfo, v6BroadcastRequest.accountInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6BroadcastAccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6CallData getCallDataOut() {
        return this.callDataOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getMevSuppliers() {
        return this.mevSuppliers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignedInfo> getSignedInfoList() {
        return this.signedInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSimulate() {
        return this.simulate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnsignedData getUnsignedData() {
        return this.unsignedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.simulate);
        String str = this.nonce;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.orderId.hashCode();
        int iHashCode4 = this.walletId.hashCode();
        List<String> list = this.mevSuppliers;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        V6CallData v6CallData = this.callDataOut;
        int iHashCode6 = v6CallData == null ? 0 : v6CallData.hashCode();
        int iHashCode7 = this.userWalletAddress.hashCode();
        int iHashCode8 = this.signedInfoList.hashCode();
        UnsignedData unsignedData = this.unsignedData;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (unsignedData != null ? unsignedData.hashCode() : 0)) * 31) + this.accountInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V6BroadcastRequest(simulate=" + this.simulate + ", nonce=" + this.nonce + ", orderId=" + this.orderId + ", walletId=" + this.walletId + ", mevSuppliers=" + this.mevSuppliers + ", callDataOut=" + this.callDataOut + ", userWalletAddress=" + this.userWalletAddress + ", signedInfoList=" + this.signedInfoList + ", unsignedData=" + this.unsignedData + ", accountInfo=" + this.accountInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.V6BroadcastRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<V6BroadcastRequest> serializer() {
            return V6BroadcastRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ V6BroadcastRequest(int i, boolean z, String str, String str2, String str3, List list, V6CallData v6CallData, String str4, List list2, UnsignedData unsignedData, V6BroadcastAccountInfo v6BroadcastAccountInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (717 != (i & 717)) {
            PluginExceptionsKt.throwMissingFieldException(i, 717, V6BroadcastRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.simulate = z;
        if ((i & 2) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str;
        }
        this.orderId = str2;
        this.walletId = str3;
        if ((i & 16) == 0) {
            this.mevSuppliers = null;
        } else {
            this.mevSuppliers = list;
        }
        if ((i & 32) == 0) {
            this.callDataOut = null;
        } else {
            this.callDataOut = v6CallData;
        }
        this.userWalletAddress = str4;
        this.signedInfoList = list2;
        if ((i & 256) == 0) {
            this.unsignedData = null;
        } else {
            this.unsignedData = unsignedData;
        }
        this.accountInfo = v6BroadcastAccountInfo;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(V6BroadcastRequest v6BroadcastRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, v6BroadcastRequest.simulate);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || v6BroadcastRequest.nonce != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, v6BroadcastRequest.nonce);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, v6BroadcastRequest.orderId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, v6BroadcastRequest.walletId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || v6BroadcastRequest.mevSuppliers != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], v6BroadcastRequest.mevSuppliers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || v6BroadcastRequest.callDataOut != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, V6CallData$$serializer.INSTANCE, v6BroadcastRequest.callDataOut);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, v6BroadcastRequest.userWalletAddress);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], v6BroadcastRequest.signedInfoList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || v6BroadcastRequest.unsignedData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, UnsignedData$$serializer.INSTANCE, v6BroadcastRequest.unsignedData);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, V6BroadcastAccountInfo$$serializer.INSTANCE, v6BroadcastRequest.accountInfo);
    }

    public V6BroadcastRequest(boolean z, String str, @NotNull String str2, @NotNull String str3, List<String> list, V6CallData v6CallData, @NotNull String str4, @NotNull List<SignedInfo> list2, UnsignedData unsignedData, @NotNull V6BroadcastAccountInfo v6BroadcastAccountInfo) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(v6BroadcastAccountInfo, "");
        this.simulate = z;
        this.nonce = str;
        this.orderId = str2;
        this.walletId = str3;
        this.mevSuppliers = list;
        this.callDataOut = v6CallData;
        this.userWalletAddress = str4;
        this.signedInfoList = list2;
        this.unsignedData = unsignedData;
        this.accountInfo = v6BroadcastAccountInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (r15v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r19v0 java.util.List))
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.V6CallData:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.V6CallData) : (r20v0 com.okinc.business.dex.trade.core.domain.model.common.V6CallData))
  (r21v0 java.lang.String)
  (r22v0 java.util.List)
  (wrap:com.okinc.business.dex.trade.core.domain.model.UnsignedData:?: TERNARY null = ((wrap:int:0x001b: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.UnsignedData) : (r23v0 com.okinc.business.dex.trade.core.domain.model.UnsignedData))
  (r24v0 com.okinc.business.dex.trade.core.domain.model.V6BroadcastAccountInfo)
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, com.okinc.business.dex.trade.core.domain.model.common.V6CallData, java.lang.String, java.util.List<com.okinc.business.dex.trade.core.domain.model.SignedInfo>, com.okinc.business.dex.trade.core.domain.model.UnsignedData, com.okinc.business.dex.trade.core.domain.model.V6BroadcastAccountInfo):void (m)] (LINE:17) call: com.okinc.business.dex.trade.core.domain.model.V6BroadcastRequest.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dex.trade.core.domain.model.common.V6CallData, java.lang.String, java.util.List, com.okinc.business.dex.trade.core.domain.model.UnsignedData, com.okinc.business.dex.trade.core.domain.model.V6BroadcastAccountInfo):void type: THIS */
    public /* synthetic */ V6BroadcastRequest(boolean z, String str, String str2, String str3, List list, V6CallData v6CallData, String str4, List list2, UnsignedData unsignedData, V6BroadcastAccountInfo v6BroadcastAccountInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, str2, str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : v6CallData, str4, list2, (i & 256) != 0 ? null : unsignedData, v6BroadcastAccountInfo);
    }
}
