package com.okinc.business.defi.wallet.home.addressDetail.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class WalletPnlShareInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String buyTxs;
    private final String changeRate;
    private final String changeValue;
    private final Boolean isMyWallet;
    private final String sellTxs;
    private final String time;
    private final String tokenLogo;
    private final String twitterAvatar;
    private final String walletAddress;
    private final String winRate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.twitterAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.changeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.changeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.winRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.buyTxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sellTxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isMyWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletPnlShareInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9) {
        return new WalletPnlShareInfo(str, str2, str3, str4, str5, str6, str7, str8, bool, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletPnlShareInfo)) {
            return false;
        }
        WalletPnlShareInfo walletPnlShareInfo = (WalletPnlShareInfo) obj;
        return Intrinsics.EZpvd((Object) this.time, (Object) walletPnlShareInfo.time) && Intrinsics.EZpvd((Object) this.changeRate, (Object) walletPnlShareInfo.changeRate) && Intrinsics.EZpvd((Object) this.changeValue, (Object) walletPnlShareInfo.changeValue) && Intrinsics.EZpvd((Object) this.winRate, (Object) walletPnlShareInfo.winRate) && Intrinsics.EZpvd((Object) this.buyTxs, (Object) walletPnlShareInfo.buyTxs) && Intrinsics.EZpvd((Object) this.sellTxs, (Object) walletPnlShareInfo.sellTxs) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) walletPnlShareInfo.tokenLogo) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) walletPnlShareInfo.walletAddress) && Intrinsics.EZpvd(this.isMyWallet, walletPnlShareInfo.isMyWallet) && Intrinsics.EZpvd((Object) this.twitterAvatar, (Object) walletPnlShareInfo.twitterAvatar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyTxs() {
        return this.buyTxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeRate() {
        return this.changeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeValue() {
        return this.changeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellTxs() {
        return this.sellTxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTwitterAvatar() {
        return this.twitterAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWinRate() {
        return this.winRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.time;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.changeRate;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.changeValue;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.winRate;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.buyTxs;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.sellTxs;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tokenLogo;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.walletAddress;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        Boolean bool = this.isMyWallet;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str9 = this.twitterAvatar;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isMyWallet() {
        return this.isMyWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletPnlShareInfo(time=" + this.time + ", changeRate=" + this.changeRate + ", changeValue=" + this.changeValue + ", winRate=" + this.winRate + ", buyTxs=" + this.buyTxs + ", sellTxs=" + this.sellTxs + ", tokenLogo=" + this.tokenLogo + ", walletAddress=" + this.walletAddress + ", isMyWallet=" + this.isMyWallet + ", twitterAvatar=" + this.twitterAvatar + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.addressDetail.utils.WalletPnlShareInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletPnlShareInfo> serializer() {
            return WalletPnlShareInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletPnlShareInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1023, WalletPnlShareInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.time = str;
        this.changeRate = str2;
        this.changeValue = str3;
        this.winRate = str4;
        this.buyTxs = str5;
        this.sellTxs = str6;
        this.tokenLogo = str7;
        this.walletAddress = str8;
        this.isMyWallet = bool;
        this.twitterAvatar = str9;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletPnlShareInfo walletPnlShareInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, walletPnlShareInfo.time);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, walletPnlShareInfo.changeRate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, walletPnlShareInfo.changeValue);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, walletPnlShareInfo.winRate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, walletPnlShareInfo.buyTxs);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, walletPnlShareInfo.sellTxs);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, walletPnlShareInfo.tokenLogo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, walletPnlShareInfo.walletAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, walletPnlShareInfo.isMyWallet);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, walletPnlShareInfo.twitterAvatar);
    }

    public WalletPnlShareInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9) {
        this.time = str;
        this.changeRate = str2;
        this.changeValue = str3;
        this.winRate = str4;
        this.buyTxs = str5;
        this.sellTxs = str6;
        this.tokenLogo = str7;
        this.walletAddress = str8;
        this.isMyWallet = bool;
        this.twitterAvatar = str9;
    }
}
