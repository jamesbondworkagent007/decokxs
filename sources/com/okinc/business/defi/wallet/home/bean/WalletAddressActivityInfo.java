package com.okinc.business.defi.wallet.home.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class WalletAddressActivityInfo {
    public final Long chainId;
    public final Boolean hasNext;
    public final List<WalletAddressActivityDetails> rows;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(WalletAddressActivityDetails$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.home.bean.WalletAddressActivityInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletAddressActivityInfo copy$default(WalletAddressActivityInfo walletAddressActivityInfo, Long l, String str, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = walletAddressActivityInfo.chainId;
        }
        if ((i & 2) != 0) {
            str = walletAddressActivityInfo.walletAddress;
        }
        if ((i & 4) != 0) {
            bool = walletAddressActivityInfo.hasNext;
        }
        if ((i & 8) != 0) {
            list = walletAddressActivityInfo.rows;
        }
        return walletAddressActivityInfo.copydefault(l, str, bool, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletAddressActivityDetails> AEQbTJ() {
        return this.rows;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean EZpvd() {
        return this.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAddressActivityInfo copydefault(Long l, String str, Boolean bool, List<WalletAddressActivityDetails> list) {
        return new WalletAddressActivityInfo(l, str, bool, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletAddressActivityInfo)) {
            return false;
        }
        WalletAddressActivityInfo walletAddressActivityInfo = (WalletAddressActivityInfo) obj;
        return Intrinsics.EZpvd(this.chainId, walletAddressActivityInfo.chainId) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) walletAddressActivityInfo.walletAddress) && Intrinsics.EZpvd(this.hasNext, walletAddressActivityInfo.hasNext) && Intrinsics.EZpvd(this.rows, walletAddressActivityInfo.rows);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.walletAddress;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Boolean bool = this.hasNext;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        List<WalletAddressActivityDetails> list = this.rows;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletAddressActivityInfo(chainId=" + this.chainId + ", walletAddress=" + this.walletAddress + ", hasNext=" + this.hasNext + ", rows=" + this.rows + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.bean.WalletAddressActivityInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletAddressActivityInfo> serializer() {
            return WalletAddressActivityInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletAddressActivityInfo(int i, Long l, String str, Boolean bool, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, WalletAddressActivityInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = l;
        this.walletAddress = str;
        this.hasNext = bool;
        this.rows = list;
    }

    public static final /* synthetic */ void EZpvd(WalletAddressActivityInfo walletAddressActivityInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, walletAddressActivityInfo.chainId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletAddressActivityInfo.walletAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, walletAddressActivityInfo.hasNext);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], walletAddressActivityInfo.rows);
    }

    public WalletAddressActivityInfo(Long l, String str, Boolean bool, List<WalletAddressActivityDetails> list) {
        this.chainId = l;
        this.walletAddress = str;
        this.hasNext = bool;
        this.rows = list;
    }
}
