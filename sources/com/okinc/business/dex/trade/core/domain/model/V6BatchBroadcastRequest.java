package com.okinc.business.dex.trade.core.domain.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class V6BatchBroadcastRequest {
    private final V6BroadcastAccountInfo accountInfo;
    private final String chainId;
    private final String fromAmount;
    private final String fromTokenAddress;
    private final List<String> mevSuppliers;
    private final Boolean simulate;
    private final List<V6BatchTxItem> transactions;
    private final String userWalletAddress;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(V6BatchTxItem$$serializer.INSTANCE), new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<V6BatchTxItem> component4() {
        return this.transactions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.mevSuppliers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.simulate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6BroadcastAccountInfo component9() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6BatchBroadcastRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<V6BatchTxItem> list, List<String> list2, String str4, String str5, Boolean bool, @NotNull V6BroadcastAccountInfo v6BroadcastAccountInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(v6BroadcastAccountInfo, "");
        return new V6BatchBroadcastRequest(str, str2, str3, list, list2, str4, str5, bool, v6BroadcastAccountInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6BatchBroadcastRequest)) {
            return false;
        }
        V6BatchBroadcastRequest v6BatchBroadcastRequest = (V6BatchBroadcastRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) v6BatchBroadcastRequest.walletId) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) v6BatchBroadcastRequest.userWalletAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) v6BatchBroadcastRequest.chainId) && Intrinsics.EZpvd(this.transactions, v6BatchBroadcastRequest.transactions) && Intrinsics.EZpvd(this.mevSuppliers, v6BatchBroadcastRequest.mevSuppliers) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) v6BatchBroadcastRequest.fromTokenAddress) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) v6BatchBroadcastRequest.fromAmount) && Intrinsics.EZpvd(this.simulate, v6BatchBroadcastRequest.simulate) && Intrinsics.EZpvd(this.accountInfo, v6BatchBroadcastRequest.accountInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6BroadcastAccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getMevSuppliers() {
        return this.mevSuppliers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSimulate() {
        return this.simulate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<V6BatchTxItem> getTransactions() {
        return this.transactions;
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
        int iHashCode = this.walletId.hashCode();
        int iHashCode2 = this.userWalletAddress.hashCode();
        int iHashCode3 = this.chainId.hashCode();
        int iHashCode4 = this.transactions.hashCode();
        List<String> list = this.mevSuppliers;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str = this.fromTokenAddress;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.fromAmount;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.simulate;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.accountInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V6BatchBroadcastRequest(walletId=" + this.walletId + ", userWalletAddress=" + this.userWalletAddress + ", chainId=" + this.chainId + ", transactions=" + this.transactions + ", mevSuppliers=" + this.mevSuppliers + ", fromTokenAddress=" + this.fromTokenAddress + ", fromAmount=" + this.fromAmount + ", simulate=" + this.simulate + ", accountInfo=" + this.accountInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.V6BatchBroadcastRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<V6BatchBroadcastRequest> serializer() {
            return V6BatchBroadcastRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ V6BatchBroadcastRequest(int i, String str, String str2, String str3, List list, List list2, String str4, String str5, Boolean bool, V6BroadcastAccountInfo v6BroadcastAccountInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (271 != (i & 271)) {
            PluginExceptionsKt.throwMissingFieldException(i, 271, V6BatchBroadcastRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.walletId = str;
        this.userWalletAddress = str2;
        this.chainId = str3;
        this.transactions = list;
        if ((i & 16) == 0) {
            this.mevSuppliers = null;
        } else {
            this.mevSuppliers = list2;
        }
        if ((i & 32) == 0) {
            this.fromTokenAddress = null;
        } else {
            this.fromTokenAddress = str4;
        }
        if ((i & 64) == 0) {
            this.fromAmount = null;
        } else {
            this.fromAmount = str5;
        }
        if ((i & 128) == 0) {
            this.simulate = null;
        } else {
            this.simulate = bool;
        }
        this.accountInfo = v6BroadcastAccountInfo;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(V6BatchBroadcastRequest v6BatchBroadcastRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, v6BatchBroadcastRequest.walletId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, v6BatchBroadcastRequest.userWalletAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, v6BatchBroadcastRequest.chainId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], v6BatchBroadcastRequest.transactions);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || v6BatchBroadcastRequest.mevSuppliers != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], v6BatchBroadcastRequest.mevSuppliers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || v6BatchBroadcastRequest.fromTokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, v6BatchBroadcastRequest.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || v6BatchBroadcastRequest.fromAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, v6BatchBroadcastRequest.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || v6BatchBroadcastRequest.simulate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, v6BatchBroadcastRequest.simulate);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, V6BroadcastAccountInfo$$serializer.INSTANCE, v6BatchBroadcastRequest.accountInfo);
    }

    public V6BatchBroadcastRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<V6BatchTxItem> list, List<String> list2, String str4, String str5, Boolean bool, @NotNull V6BroadcastAccountInfo v6BroadcastAccountInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(v6BroadcastAccountInfo, "");
        this.walletId = str;
        this.userWalletAddress = str2;
        this.chainId = str3;
        this.transactions = list;
        this.mevSuppliers = list2;
        this.fromTokenAddress = str4;
        this.fromAmount = str5;
        this.simulate = bool;
        this.accountInfo = v6BroadcastAccountInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (r22v0 com.okinc.business.dex.trade.core.domain.model.V6BroadcastAccountInfo)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.dex.trade.core.domain.model.V6BatchTxItem>, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.business.dex.trade.core.domain.model.V6BroadcastAccountInfo):void (m)] (LINE:13) call: com.okinc.business.dex.trade.core.domain.model.V6BatchBroadcastRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.business.dex.trade.core.domain.model.V6BroadcastAccountInfo):void type: THIS */
    public /* synthetic */ V6BatchBroadcastRequest(String str, String str2, String str3, List list, List list2, String str4, String str5, Boolean bool, V6BroadcastAccountInfo v6BroadcastAccountInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : bool, v6BroadcastAccountInfo);
    }
}
