package com.okinc.business.defi.biz.walletconnect;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletWatchAssetOption {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final Integer decimals;
    private final String image;
    private final String symbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletWatchAssetOption copy$default(WalletWatchAssetOption walletWatchAssetOption, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletWatchAssetOption.address;
        }
        if ((i & 2) != 0) {
            str2 = walletWatchAssetOption.symbol;
        }
        if ((i & 4) != 0) {
            num = walletWatchAssetOption.decimals;
        }
        if ((i & 8) != 0) {
            str3 = walletWatchAssetOption.image;
        }
        return walletWatchAssetOption.copy(str, str2, num, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletWatchAssetOption copy(String str, String str2, Integer num, String str3) {
        return new WalletWatchAssetOption(str, str2, num, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletWatchAssetOption)) {
            return false;
        }
        WalletWatchAssetOption walletWatchAssetOption = (WalletWatchAssetOption) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) walletWatchAssetOption.address) && Intrinsics.EZpvd((Object) this.symbol, (Object) walletWatchAssetOption.symbol) && Intrinsics.EZpvd(this.decimals, walletWatchAssetOption.decimals) && Intrinsics.EZpvd((Object) this.image, (Object) walletWatchAssetOption.image);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDecimals() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.symbol;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.decimals;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str3 = this.image;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletWatchAssetOption(address=" + this.address + ", symbol=" + this.symbol + ", decimals=" + this.decimals + ", image=" + this.image + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.walletconnect.WalletWatchAssetOption.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletWatchAssetOption> serializer() {
            return WalletWatchAssetOption$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletWatchAssetOption(int i, String str, String str2, Integer num, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, WalletWatchAssetOption$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        this.symbol = str2;
        this.decimals = num;
        this.image = str3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletWatchAssetOption walletWatchAssetOption, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, walletWatchAssetOption.address);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, walletWatchAssetOption.symbol);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, walletWatchAssetOption.decimals);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, walletWatchAssetOption.image);
    }

    public WalletWatchAssetOption(String str, String str2, Integer num, String str3) {
        this.address = str;
        this.symbol = str2;
        this.decimals = num;
        this.image = str3;
    }
}
