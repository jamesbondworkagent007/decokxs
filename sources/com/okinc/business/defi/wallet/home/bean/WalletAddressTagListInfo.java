package com.okinc.business.defi.wallet.home.bean;

import com.okinc.business.defi.wallet.mine.search.data.model.CompactTagData;
import com.okinc.business.defi.wallet.mine.search.data.model.CompactTagData$$serializer;
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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class WalletAddressTagListInfo {
    public final String aliasAddress;
    public final List<CompactTagData> tagList;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.home.bean.WalletAddressTagListInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletAddressTagListInfo copy$default(WalletAddressTagListInfo walletAddressTagListInfo, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletAddressTagListInfo.walletAddress;
        }
        if ((i & 2) != 0) {
            str2 = walletAddressTagListInfo.aliasAddress;
        }
        if ((i & 4) != 0) {
            list = walletAddressTagListInfo.tagList;
        }
        return walletAddressTagListInfo.OLrzqt(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAddressTagListInfo OLrzqt(@NotNull String str, String str2, @NotNull List<CompactTagData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new WalletAddressTagListInfo(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> OLrzqt() {
        return this.tagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletAddressTagListInfo)) {
            return false;
        }
        WalletAddressTagListInfo walletAddressTagListInfo = (WalletAddressTagListInfo) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) walletAddressTagListInfo.walletAddress) && Intrinsics.EZpvd((Object) this.aliasAddress, (Object) walletAddressTagListInfo.aliasAddress) && Intrinsics.EZpvd(this.tagList, walletAddressTagListInfo.tagList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.walletAddress.hashCode();
        String str = this.aliasAddress;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.tagList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletAddressTagListInfo(walletAddress=" + this.walletAddress + ", aliasAddress=" + this.aliasAddress + ", tagList=" + this.tagList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.bean.WalletAddressTagListInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletAddressTagListInfo> serializer() {
            return WalletAddressTagListInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletAddressTagListInfo(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WalletAddressTagListInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
        if ((i & 2) == 0) {
            this.aliasAddress = "";
        } else {
            this.aliasAddress = str2;
        }
        if ((i & 4) == 0) {
            this.tagList = yDY.AhwBna();
        } else {
            this.tagList = list;
        }
    }

    public static final /* synthetic */ void EZpvd(WalletAddressTagListInfo walletAddressTagListInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, walletAddressTagListInfo.walletAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) walletAddressTagListInfo.aliasAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletAddressTagListInfo.aliasAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(walletAddressTagListInfo.tagList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], walletAddressTagListInfo.tagList);
    }

    public WalletAddressTagListInfo(@NotNull String str, String str2, @NotNull List<CompactTagData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.walletAddress = str;
        this.aliasAddress = str2;
        this.tagList = list;
    }
}
