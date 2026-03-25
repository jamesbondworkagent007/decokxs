package com.okinc.business.defi.biz.database.wallet.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.net.bean.AAStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletViewForWalletManagement {
    public static final int $stable = 8;
    private final String EOSOwnerKey;
    private final String EOSPubKey;
    private final Integer EOSShouldBeDeleted;
    private final Integer EOSState;
    private final Integer aaWalletStatus;
    private final int addressIndex;
    private int autoRenew;
    private final int backup;
    private boolean canUseSa2;
    private final String ccyAmounts;
    private final String chainAddrTypes;
    private final String chainAddressPublicKeys;
    private final String chainAddrs;
    private final String chainAddsDerivePaths;
    private final String chainAddsEoaAddresses;
    private final String chainAddsProxyAddresses;
    private final long chainId;
    private final String chainIds;
    private final String chainSegWitAddTypes;
    private final String chainSegWitAddressDerivePaths;
    private final String chainSegWitAddressPublicKeys;
    private final String chainSegWitAddresses;
    private final String chainSegWitChainIds;
    private String closedCoinIds;
    private final int cloudBackup;
    private final String coinIds;
    private final long createAt;
    private final String createVersion;
    private final String data;
    private final String defiAsset;
    private final String defiBeans;
    private final Integer eoaWalletType;
    private final String eosAccountName;
    private final String eosActiveKey;
    private final int fromCreate;
    private Boolean hasShowTeeExpiredAlert;
    private final int iHuaweiBackup;
    private final String id;
    private final Integer identifierType;
    private final int isSegWit;
    private Boolean isTeeActive;
    private Boolean isTeeCreated;
    private Boolean isTeeVerify;
    private final String language;
    private final int main;
    private int model;
    private final int modifiedName;
    private final String name;
    private final String nftAsset;
    private final String nftBeans;
    private final int orderValue;
    private final String repairExtJson;
    private final String repairReserved;
    private final Integer repairStatus;
    private final Long repairTimestamp;
    private final String rootWalletId;
    private final int syncStatus;
    private long teeCreateAt;
    private Long teeExpiredTimestamp;
    private String teeId;
    private long teeUpdateAt;
    private final String tokenAsset;
    private final String tokenAssetFilterSmall;
    private final String totalAssetUpdateTime;
    private final int type;
    private int upgradeStatus;
    private final String voucherTokens;
    private final String xpriv;
    private final String xpub;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletViewForWalletManagement() {
        this(null, 0, null, 0L, null, null, 0, 0, 0, 0, 0, null, null, 0, 0, 0L, 0, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, 0, null, false, 0, 0, -1, -1, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletViewForWalletManagement copy$default(WalletViewForWalletManagement walletViewForWalletManagement, String str, int i, String str2, long j, String str3, String str4, int i2, int i3, int i4, int i5, int i6, String str5, String str6, int i7, int i8, long j2, int i9, int i10, String str7, int i11, Integer num, Integer num2, String str8, String str9, String str10, String str11, String str12, Integer num3, Integer num4, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, Integer num5, Integer num6, String str35, String str36, Long l, Boolean bool, Boolean bool2, Long l2, Boolean bool3, Boolean bool4, String str37, long j3, long j4, int i12, String str38, boolean z, int i13, int i14, int i15, int i16, int i17, Object obj) {
        String str39 = (i15 & 1) != 0 ? walletViewForWalletManagement.id : str;
        int i18 = (i15 & 2) != 0 ? walletViewForWalletManagement.type : i;
        String str40 = (i15 & 4) != 0 ? walletViewForWalletManagement.data : str2;
        long j5 = (i15 & 8) != 0 ? walletViewForWalletManagement.chainId : j;
        String str41 = (i15 & 16) != 0 ? walletViewForWalletManagement.language : str3;
        String str42 = (i15 & 32) != 0 ? walletViewForWalletManagement.name : str4;
        int i19 = (i15 & 64) != 0 ? walletViewForWalletManagement.modifiedName : i2;
        int i20 = (i15 & 128) != 0 ? walletViewForWalletManagement.backup : i3;
        int i21 = (i15 & 256) != 0 ? walletViewForWalletManagement.cloudBackup : i4;
        int i22 = (i15 & 512) != 0 ? walletViewForWalletManagement.iHuaweiBackup : i5;
        int i23 = (i15 & 1024) != 0 ? walletViewForWalletManagement.main : i6;
        return walletViewForWalletManagement.copy(str39, i18, str40, j5, str41, str42, i19, i20, i21, i22, i23, (i15 & 2048) != 0 ? walletViewForWalletManagement.xpub : str5, (i15 & 4096) != 0 ? walletViewForWalletManagement.xpriv : str6, (i15 & 8192) != 0 ? walletViewForWalletManagement.isSegWit : i7, (i15 & 16384) != 0 ? walletViewForWalletManagement.fromCreate : i8, (i15 & 32768) != 0 ? walletViewForWalletManagement.createAt : j2, (i15 & 65536) != 0 ? walletViewForWalletManagement.orderValue : i9, (i15 & 131072) != 0 ? walletViewForWalletManagement.addressIndex : i10, (i15 & 262144) != 0 ? walletViewForWalletManagement.rootWalletId : str7, (i15 & 524288) != 0 ? walletViewForWalletManagement.syncStatus : i11, (i15 & 1048576) != 0 ? walletViewForWalletManagement.eoaWalletType : num, (i15 & 2097152) != 0 ? walletViewForWalletManagement.aaWalletStatus : num2, (i15 & 4194304) != 0 ? walletViewForWalletManagement.createVersion : str8, (i15 & 8388608) != 0 ? walletViewForWalletManagement.eosAccountName : str9, (i15 & 16777216) != 0 ? walletViewForWalletManagement.eosActiveKey : str10, (i15 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? walletViewForWalletManagement.EOSOwnerKey : str11, (i15 & 67108864) != 0 ? walletViewForWalletManagement.EOSPubKey : str12, (i15 & 134217728) != 0 ? walletViewForWalletManagement.EOSShouldBeDeleted : num3, (i15 & 268435456) != 0 ? walletViewForWalletManagement.EOSState : num4, (i15 & 536870912) != 0 ? walletViewForWalletManagement.chainIds : str13, (i15 & 1073741824) != 0 ? walletViewForWalletManagement.chainAddrs : str14, (i15 & Integer.MIN_VALUE) != 0 ? walletViewForWalletManagement.chainAddrTypes : str15, (i16 & 1) != 0 ? walletViewForWalletManagement.chainAddressPublicKeys : str16, (i16 & 2) != 0 ? walletViewForWalletManagement.chainAddsDerivePaths : str17, (i16 & 4) != 0 ? walletViewForWalletManagement.chainAddsProxyAddresses : str18, (i16 & 8) != 0 ? walletViewForWalletManagement.chainAddsEoaAddresses : str19, (i16 & 16) != 0 ? walletViewForWalletManagement.coinIds : str20, (i16 & 32) != 0 ? walletViewForWalletManagement.ccyAmounts : str21, (i16 & 64) != 0 ? walletViewForWalletManagement.voucherTokens : str22, (i16 & 128) != 0 ? walletViewForWalletManagement.defiBeans : str23, (i16 & 256) != 0 ? walletViewForWalletManagement.nftBeans : str24, (i16 & 512) != 0 ? walletViewForWalletManagement.tokenAsset : str25, (i16 & 1024) != 0 ? walletViewForWalletManagement.tokenAssetFilterSmall : str26, (i16 & 2048) != 0 ? walletViewForWalletManagement.nftAsset : str27, (i16 & 4096) != 0 ? walletViewForWalletManagement.defiAsset : str28, (i16 & 8192) != 0 ? walletViewForWalletManagement.totalAssetUpdateTime : str29, (i16 & 16384) != 0 ? walletViewForWalletManagement.chainSegWitChainIds : str30, (i16 & 32768) != 0 ? walletViewForWalletManagement.chainSegWitAddresses : str31, (i16 & 65536) != 0 ? walletViewForWalletManagement.chainSegWitAddTypes : str32, (i16 & 131072) != 0 ? walletViewForWalletManagement.chainSegWitAddressPublicKeys : str33, (i16 & 262144) != 0 ? walletViewForWalletManagement.chainSegWitAddressDerivePaths : str34, (i16 & 524288) != 0 ? walletViewForWalletManagement.identifierType : num5, (i16 & 1048576) != 0 ? walletViewForWalletManagement.repairStatus : num6, (i16 & 2097152) != 0 ? walletViewForWalletManagement.repairReserved : str35, (i16 & 4194304) != 0 ? walletViewForWalletManagement.repairExtJson : str36, (i16 & 8388608) != 0 ? walletViewForWalletManagement.repairTimestamp : l, (i16 & 16777216) != 0 ? walletViewForWalletManagement.isTeeCreated : bool, (i16 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? walletViewForWalletManagement.isTeeActive : bool2, (i16 & 67108864) != 0 ? walletViewForWalletManagement.teeExpiredTimestamp : l2, (i16 & 134217728) != 0 ? walletViewForWalletManagement.isTeeVerify : bool3, (i16 & 268435456) != 0 ? walletViewForWalletManagement.hasShowTeeExpiredAlert : bool4, (i16 & 536870912) != 0 ? walletViewForWalletManagement.teeId : str37, (i16 & 1073741824) != 0 ? walletViewForWalletManagement.teeCreateAt : j3, (i16 & Integer.MIN_VALUE) != 0 ? walletViewForWalletManagement.teeUpdateAt : j4, (i17 & 1) != 0 ? walletViewForWalletManagement.model : i12, (i17 & 2) != 0 ? walletViewForWalletManagement.closedCoinIds : str38, (i17 & 4) != 0 ? walletViewForWalletManagement.canUseSa2 : z, (i17 & 8) != 0 ? walletViewForWalletManagement.autoRenew : i13, (i17 & 16) != 0 ? walletViewForWalletManagement.upgradeStatus : i14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.iHuaweiBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.main;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.xpub;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.xpriv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.isSegWit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.fromCreate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component16() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component20() {
        return this.syncStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component21() {
        return this.eoaWalletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component22() {
        return this.aaWalletStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.createVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.eosAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.eosActiveKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.EOSOwnerKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.EOSPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component28() {
        return this.EOSShouldBeDeleted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component29() {
        return this.EOSState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.chainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.chainAddrs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.chainAddrTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.chainAddressPublicKeys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.chainAddsDerivePaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.chainAddsProxyAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.chainAddsEoaAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.coinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.ccyAmounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.voucherTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.defiBeans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.nftBeans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.tokenAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.tokenAssetFilterSmall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.nftAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.defiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.totalAssetUpdateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.chainSegWitChainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.chainSegWitAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.chainSegWitAddTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.chainSegWitAddressPublicKeys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.chainSegWitAddressDerivePaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component52() {
        return this.identifierType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component53() {
        return this.repairStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.repairReserved;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.repairExtJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component56() {
        return this.repairTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component57() {
        return this.isTeeCreated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component58() {
        return this.isTeeActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component59() {
        return this.teeExpiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component60() {
        return this.isTeeVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component61() {
        return this.hasShowTeeExpiredAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component63() {
        return this.teeCreateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component64() {
        return this.teeUpdateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component65() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.closedCoinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component67() {
        return this.canUseSa2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component68() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component69() {
        return this.upgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.modifiedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.backup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.cloudBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletViewForWalletManagement copy(@NotNull String str, int i, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, int i2, int i3, int i4, int i5, int i6, @NotNull String str5, @NotNull String str6, int i7, int i8, long j2, int i9, int i10, @NotNull String str7, int i11, Integer num, Integer num2, @NotNull String str8, String str9, String str10, String str11, String str12, Integer num3, Integer num4, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, Integer num5, Integer num6, String str35, String str36, Long l, Boolean bool, Boolean bool2, Long l2, Boolean bool3, Boolean bool4, String str37, long j3, long j4, int i12, String str38, boolean z, int i13, int i14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new WalletViewForWalletManagement(str, i, str2, j, str3, str4, i2, i3, i4, i5, i6, str5, str6, i7, i8, j2, i9, i10, str7, i11, num, num2, str8, str9, str10, str11, str12, num3, num4, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, num5, num6, str35, str36, l, bool, bool2, l2, bool3, bool4, str37, j3, j4, i12, str38, z, i13, i14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletViewForWalletManagement)) {
            return false;
        }
        WalletViewForWalletManagement walletViewForWalletManagement = (WalletViewForWalletManagement) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) walletViewForWalletManagement.id) && this.type == walletViewForWalletManagement.type && Intrinsics.EZpvd((Object) this.data, (Object) walletViewForWalletManagement.data) && this.chainId == walletViewForWalletManagement.chainId && Intrinsics.EZpvd((Object) this.language, (Object) walletViewForWalletManagement.language) && Intrinsics.EZpvd((Object) this.name, (Object) walletViewForWalletManagement.name) && this.modifiedName == walletViewForWalletManagement.modifiedName && this.backup == walletViewForWalletManagement.backup && this.cloudBackup == walletViewForWalletManagement.cloudBackup && this.iHuaweiBackup == walletViewForWalletManagement.iHuaweiBackup && this.main == walletViewForWalletManagement.main && Intrinsics.EZpvd((Object) this.xpub, (Object) walletViewForWalletManagement.xpub) && Intrinsics.EZpvd((Object) this.xpriv, (Object) walletViewForWalletManagement.xpriv) && this.isSegWit == walletViewForWalletManagement.isSegWit && this.fromCreate == walletViewForWalletManagement.fromCreate && this.createAt == walletViewForWalletManagement.createAt && this.orderValue == walletViewForWalletManagement.orderValue && this.addressIndex == walletViewForWalletManagement.addressIndex && Intrinsics.EZpvd((Object) this.rootWalletId, (Object) walletViewForWalletManagement.rootWalletId) && this.syncStatus == walletViewForWalletManagement.syncStatus && Intrinsics.EZpvd(this.eoaWalletType, walletViewForWalletManagement.eoaWalletType) && Intrinsics.EZpvd(this.aaWalletStatus, walletViewForWalletManagement.aaWalletStatus) && Intrinsics.EZpvd((Object) this.createVersion, (Object) walletViewForWalletManagement.createVersion) && Intrinsics.EZpvd((Object) this.eosAccountName, (Object) walletViewForWalletManagement.eosAccountName) && Intrinsics.EZpvd((Object) this.eosActiveKey, (Object) walletViewForWalletManagement.eosActiveKey) && Intrinsics.EZpvd((Object) this.EOSOwnerKey, (Object) walletViewForWalletManagement.EOSOwnerKey) && Intrinsics.EZpvd((Object) this.EOSPubKey, (Object) walletViewForWalletManagement.EOSPubKey) && Intrinsics.EZpvd(this.EOSShouldBeDeleted, walletViewForWalletManagement.EOSShouldBeDeleted) && Intrinsics.EZpvd(this.EOSState, walletViewForWalletManagement.EOSState) && Intrinsics.EZpvd((Object) this.chainIds, (Object) walletViewForWalletManagement.chainIds) && Intrinsics.EZpvd((Object) this.chainAddrs, (Object) walletViewForWalletManagement.chainAddrs) && Intrinsics.EZpvd((Object) this.chainAddrTypes, (Object) walletViewForWalletManagement.chainAddrTypes) && Intrinsics.EZpvd((Object) this.chainAddressPublicKeys, (Object) walletViewForWalletManagement.chainAddressPublicKeys) && Intrinsics.EZpvd((Object) this.chainAddsDerivePaths, (Object) walletViewForWalletManagement.chainAddsDerivePaths) && Intrinsics.EZpvd((Object) this.chainAddsProxyAddresses, (Object) walletViewForWalletManagement.chainAddsProxyAddresses) && Intrinsics.EZpvd((Object) this.chainAddsEoaAddresses, (Object) walletViewForWalletManagement.chainAddsEoaAddresses) && Intrinsics.EZpvd((Object) this.coinIds, (Object) walletViewForWalletManagement.coinIds) && Intrinsics.EZpvd((Object) this.ccyAmounts, (Object) walletViewForWalletManagement.ccyAmounts) && Intrinsics.EZpvd((Object) this.voucherTokens, (Object) walletViewForWalletManagement.voucherTokens) && Intrinsics.EZpvd((Object) this.defiBeans, (Object) walletViewForWalletManagement.defiBeans) && Intrinsics.EZpvd((Object) this.nftBeans, (Object) walletViewForWalletManagement.nftBeans) && Intrinsics.EZpvd((Object) this.tokenAsset, (Object) walletViewForWalletManagement.tokenAsset) && Intrinsics.EZpvd((Object) this.tokenAssetFilterSmall, (Object) walletViewForWalletManagement.tokenAssetFilterSmall) && Intrinsics.EZpvd((Object) this.nftAsset, (Object) walletViewForWalletManagement.nftAsset) && Intrinsics.EZpvd((Object) this.defiAsset, (Object) walletViewForWalletManagement.defiAsset) && Intrinsics.EZpvd((Object) this.totalAssetUpdateTime, (Object) walletViewForWalletManagement.totalAssetUpdateTime) && Intrinsics.EZpvd((Object) this.chainSegWitChainIds, (Object) walletViewForWalletManagement.chainSegWitChainIds) && Intrinsics.EZpvd((Object) this.chainSegWitAddresses, (Object) walletViewForWalletManagement.chainSegWitAddresses) && Intrinsics.EZpvd((Object) this.chainSegWitAddTypes, (Object) walletViewForWalletManagement.chainSegWitAddTypes) && Intrinsics.EZpvd((Object) this.chainSegWitAddressPublicKeys, (Object) walletViewForWalletManagement.chainSegWitAddressPublicKeys) && Intrinsics.EZpvd((Object) this.chainSegWitAddressDerivePaths, (Object) walletViewForWalletManagement.chainSegWitAddressDerivePaths) && Intrinsics.EZpvd(this.identifierType, walletViewForWalletManagement.identifierType) && Intrinsics.EZpvd(this.repairStatus, walletViewForWalletManagement.repairStatus) && Intrinsics.EZpvd((Object) this.repairReserved, (Object) walletViewForWalletManagement.repairReserved) && Intrinsics.EZpvd((Object) this.repairExtJson, (Object) walletViewForWalletManagement.repairExtJson) && Intrinsics.EZpvd(this.repairTimestamp, walletViewForWalletManagement.repairTimestamp) && Intrinsics.EZpvd(this.isTeeCreated, walletViewForWalletManagement.isTeeCreated) && Intrinsics.EZpvd(this.isTeeActive, walletViewForWalletManagement.isTeeActive) && Intrinsics.EZpvd(this.teeExpiredTimestamp, walletViewForWalletManagement.teeExpiredTimestamp) && Intrinsics.EZpvd(this.isTeeVerify, walletViewForWalletManagement.isTeeVerify) && Intrinsics.EZpvd(this.hasShowTeeExpiredAlert, walletViewForWalletManagement.hasShowTeeExpiredAlert) && Intrinsics.EZpvd((Object) this.teeId, (Object) walletViewForWalletManagement.teeId) && this.teeCreateAt == walletViewForWalletManagement.teeCreateAt && this.teeUpdateAt == walletViewForWalletManagement.teeUpdateAt && this.model == walletViewForWalletManagement.model && Intrinsics.EZpvd((Object) this.closedCoinIds, (Object) walletViewForWalletManagement.closedCoinIds) && this.canUseSa2 == walletViewForWalletManagement.canUseSa2 && this.autoRenew == walletViewForWalletManagement.autoRenew && this.upgradeStatus == walletViewForWalletManagement.upgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAaWalletStatus() {
        return this.aaWalletStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressIndex() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAutoRenew() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBackup() {
        return this.backup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanUseSa2() {
        return this.canUseSa2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyAmounts() {
        return this.ccyAmounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainAddrTypes() {
        return this.chainAddrTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainAddressPublicKeys() {
        return this.chainAddressPublicKeys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainAddrs() {
        return this.chainAddrs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainAddsDerivePaths() {
        return this.chainAddsDerivePaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainAddsEoaAddresses() {
        return this.chainAddsEoaAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainAddsProxyAddresses() {
        return this.chainAddsProxyAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIds() {
        return this.chainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSegWitAddTypes() {
        return this.chainSegWitAddTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSegWitAddressDerivePaths() {
        return this.chainSegWitAddressDerivePaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSegWitAddressPublicKeys() {
        return this.chainSegWitAddressPublicKeys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSegWitAddresses() {
        return this.chainSegWitAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSegWitChainIds() {
        return this.chainSegWitChainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClosedCoinIds() {
        return this.closedCoinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCloudBackup() {
        return this.cloudBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinIds() {
        return this.coinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateAt() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateVersion() {
        return this.createVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefiAsset() {
        return this.defiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefiBeans() {
        return this.defiBeans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEOSOwnerKey() {
        return this.EOSOwnerKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEOSPubKey() {
        return this.EOSPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEOSShouldBeDeleted() {
        return this.EOSShouldBeDeleted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEOSState() {
        return this.EOSState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEoaWalletType() {
        return this.eoaWalletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEosAccountName() {
        return this.eosAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEosActiveKey() {
        return this.eosActiveKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFromCreate() {
        return this.fromCreate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasShowTeeExpiredAlert() {
        return this.hasShowTeeExpiredAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIHuaweiBackup() {
        return this.iHuaweiBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getIdentifierType() {
        return this.identifierType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMain() {
        return this.main;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getModel() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getModifiedName() {
        return this.modifiedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftAsset() {
        return this.nftAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftBeans() {
        return this.nftBeans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderValue() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepairExtJson() {
        return this.repairExtJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepairReserved() {
        return this.repairReserved;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRepairStatus() {
        return this.repairStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getRepairTimestamp() {
        return this.repairTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRootWalletId() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTeeCreateAt() {
        return this.teeCreateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTeeExpiredTimestamp() {
        return this.teeExpiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTeeUpdateAt() {
        return this.teeUpdateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAsset() {
        return this.tokenAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAssetFilterSmall() {
        return this.tokenAssetFilterSmall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAssetUpdateTime() {
        return this.totalAssetUpdateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUpgradeStatus() {
        return this.upgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherTokens() {
        return this.voucherTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXpriv() {
        return this.xpriv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXpub() {
        return this.xpub;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int i;
        int iHashCode;
        int iHashCode2 = this.id.hashCode();
        int iHashCode3 = Integer.hashCode(this.type);
        int iHashCode4 = this.data.hashCode();
        int iHashCode5 = Long.hashCode(this.chainId);
        int iHashCode6 = this.language.hashCode();
        int iHashCode7 = this.name.hashCode();
        int iHashCode8 = Integer.hashCode(this.modifiedName);
        int iHashCode9 = Integer.hashCode(this.backup);
        int iHashCode10 = Integer.hashCode(this.cloudBackup);
        int iHashCode11 = Integer.hashCode(this.iHuaweiBackup);
        int iHashCode12 = Integer.hashCode(this.main);
        int iHashCode13 = this.xpub.hashCode();
        int iHashCode14 = this.xpriv.hashCode();
        int iHashCode15 = Integer.hashCode(this.isSegWit);
        int iHashCode16 = Integer.hashCode(this.fromCreate);
        int iHashCode17 = Long.hashCode(this.createAt);
        int iHashCode18 = Integer.hashCode(this.orderValue);
        int iHashCode19 = Integer.hashCode(this.addressIndex);
        int iHashCode20 = this.rootWalletId.hashCode();
        int iHashCode21 = Integer.hashCode(this.syncStatus);
        Integer num = this.eoaWalletType;
        int iHashCode22 = num == null ? 0 : num.hashCode();
        Integer num2 = this.aaWalletStatus;
        int iHashCode23 = num2 == null ? 0 : num2.hashCode();
        int iHashCode24 = this.createVersion.hashCode();
        String str = this.eosAccountName;
        int iHashCode25 = str == null ? 0 : str.hashCode();
        String str2 = this.eosActiveKey;
        int iHashCode26 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.EOSOwnerKey;
        int iHashCode27 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.EOSPubKey;
        int iHashCode28 = str4 == null ? 0 : str4.hashCode();
        Integer num3 = this.EOSShouldBeDeleted;
        int iHashCode29 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.EOSState;
        int iHashCode30 = num4 == null ? 0 : num4.hashCode();
        String str5 = this.chainIds;
        int iHashCode31 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.chainAddrs;
        int iHashCode32 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.chainAddrTypes;
        int iHashCode33 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.chainAddressPublicKeys;
        int iHashCode34 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.chainAddsDerivePaths;
        int iHashCode35 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.chainAddsProxyAddresses;
        int iHashCode36 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.chainAddsEoaAddresses;
        int iHashCode37 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.coinIds;
        int iHashCode38 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.ccyAmounts;
        int iHashCode39 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.voucherTokens;
        int iHashCode40 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.defiBeans;
        int iHashCode41 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.nftBeans;
        int iHashCode42 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.tokenAsset;
        int iHashCode43 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.tokenAssetFilterSmall;
        int iHashCode44 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.nftAsset;
        int iHashCode45 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.defiAsset;
        int iHashCode46 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.totalAssetUpdateTime;
        int iHashCode47 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.chainSegWitChainIds;
        int iHashCode48 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.chainSegWitAddresses;
        int iHashCode49 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.chainSegWitAddTypes;
        int iHashCode50 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.chainSegWitAddressPublicKeys;
        int iHashCode51 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.chainSegWitAddressDerivePaths;
        int iHashCode52 = str26 == null ? 0 : str26.hashCode();
        Integer num5 = this.identifierType;
        int iHashCode53 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.repairStatus;
        int iHashCode54 = num6 == null ? 0 : num6.hashCode();
        String str27 = this.repairReserved;
        int iHashCode55 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.repairExtJson;
        int iHashCode56 = str28 == null ? 0 : str28.hashCode();
        Long l = this.repairTimestamp;
        int iHashCode57 = l == null ? 0 : l.hashCode();
        Boolean bool = this.isTeeCreated;
        int iHashCode58 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isTeeActive;
        int iHashCode59 = bool2 == null ? 0 : bool2.hashCode();
        Long l2 = this.teeExpiredTimestamp;
        int iHashCode60 = l2 == null ? 0 : l2.hashCode();
        Boolean bool3 = this.isTeeVerify;
        int iHashCode61 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.hasShowTeeExpiredAlert;
        int iHashCode62 = bool4 == null ? 0 : bool4.hashCode();
        String str29 = this.teeId;
        if (str29 == null) {
            i = iHashCode17;
            iHashCode = 0;
        } else {
            i = iHashCode17;
            iHashCode = str29.hashCode();
        }
        int iHashCode63 = Long.hashCode(this.teeCreateAt);
        int iHashCode64 = Long.hashCode(this.teeUpdateAt);
        int iHashCode65 = Integer.hashCode(this.model);
        String str30 = this.closedCoinIds;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + i) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + (str30 != null ? str30.hashCode() : 0)) * 31) + Boolean.hashCode(this.canUseSa2)) * 31) + Integer.hashCode(this.autoRenew)) * 31) + Integer.hashCode(this.upgradeStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isSegWit() {
        return this.isSegWit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTeeActive() {
        return this.isTeeActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTeeCreated() {
        return this.isTeeCreated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTeeVerify() {
        return this.isTeeVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoRenew(int i) {
        this.autoRenew = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanUseSa2(boolean z) {
        this.canUseSa2 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClosedCoinIds(String str) {
        this.closedCoinIds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasShowTeeExpiredAlert(Boolean bool) {
        this.hasShowTeeExpiredAlert = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModel(int i) {
        this.model = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTeeActive(Boolean bool) {
        this.isTeeActive = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTeeCreateAt(long j) {
        this.teeCreateAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTeeCreated(Boolean bool) {
        this.isTeeCreated = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTeeExpiredTimestamp(Long l) {
        this.teeExpiredTimestamp = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTeeId(String str) {
        this.teeId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTeeUpdateAt(long j) {
        this.teeUpdateAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTeeVerify(Boolean bool) {
        this.isTeeVerify = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpgradeStatus(int i) {
        this.upgradeStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletViewForWalletManagement(id=" + this.id + ", type=" + this.type + ", data=" + this.data + ", chainId=" + this.chainId + ", language=" + this.language + ", name=" + this.name + ", modifiedName=" + this.modifiedName + ", backup=" + this.backup + ", cloudBackup=" + this.cloudBackup + ", iHuaweiBackup=" + this.iHuaweiBackup + ", main=" + this.main + ", xpub=" + this.xpub + ", xpriv=" + this.xpriv + ", isSegWit=" + this.isSegWit + ", fromCreate=" + this.fromCreate + ", createAt=" + this.createAt + ", orderValue=" + this.orderValue + ", addressIndex=" + this.addressIndex + ", rootWalletId=" + this.rootWalletId + ", syncStatus=" + this.syncStatus + ", eoaWalletType=" + this.eoaWalletType + ", aaWalletStatus=" + this.aaWalletStatus + ", createVersion=" + this.createVersion + ", eosAccountName=" + this.eosAccountName + ", eosActiveKey=" + this.eosActiveKey + ", EOSOwnerKey=" + this.EOSOwnerKey + ", EOSPubKey=" + this.EOSPubKey + ", EOSShouldBeDeleted=" + this.EOSShouldBeDeleted + ", EOSState=" + this.EOSState + ", chainIds=" + this.chainIds + ", chainAddrs=" + this.chainAddrs + ", chainAddrTypes=" + this.chainAddrTypes + ", chainAddressPublicKeys=" + this.chainAddressPublicKeys + ", chainAddsDerivePaths=" + this.chainAddsDerivePaths + ", chainAddsProxyAddresses=" + this.chainAddsProxyAddresses + ", chainAddsEoaAddresses=" + this.chainAddsEoaAddresses + ", coinIds=" + this.coinIds + ", ccyAmounts=" + this.ccyAmounts + ", voucherTokens=" + this.voucherTokens + ", defiBeans=" + this.defiBeans + ", nftBeans=" + this.nftBeans + ", tokenAsset=" + this.tokenAsset + ", tokenAssetFilterSmall=" + this.tokenAssetFilterSmall + ", nftAsset=" + this.nftAsset + ", defiAsset=" + this.defiAsset + ", totalAssetUpdateTime=" + this.totalAssetUpdateTime + ", chainSegWitChainIds=" + this.chainSegWitChainIds + ", chainSegWitAddresses=" + this.chainSegWitAddresses + ", chainSegWitAddTypes=" + this.chainSegWitAddTypes + ", chainSegWitAddressPublicKeys=" + this.chainSegWitAddressPublicKeys + ", chainSegWitAddressDerivePaths=" + this.chainSegWitAddressDerivePaths + ", identifierType=" + this.identifierType + ", repairStatus=" + this.repairStatus + ", repairReserved=" + this.repairReserved + ", repairExtJson=" + this.repairExtJson + ", repairTimestamp=" + this.repairTimestamp + ", isTeeCreated=" + this.isTeeCreated + ", isTeeActive=" + this.isTeeActive + ", teeExpiredTimestamp=" + this.teeExpiredTimestamp + ", isTeeVerify=" + this.isTeeVerify + ", hasShowTeeExpiredAlert=" + this.hasShowTeeExpiredAlert + ", teeId=" + this.teeId + ", teeCreateAt=" + this.teeCreateAt + ", teeUpdateAt=" + this.teeUpdateAt + ", model=" + this.model + ", closedCoinIds=" + this.closedCoinIds + ", canUseSa2=" + this.canUseSa2 + ", autoRenew=" + this.autoRenew + ", upgradeStatus=" + this.upgradeStatus + ")";
    }

    public WalletViewForWalletManagement(@NotNull String str, int i, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, int i2, int i3, int i4, int i5, int i6, @NotNull String str5, @NotNull String str6, int i7, int i8, long j2, int i9, int i10, @NotNull String str7, int i11, Integer num, Integer num2, @NotNull String str8, String str9, String str10, String str11, String str12, Integer num3, Integer num4, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, Integer num5, Integer num6, String str35, String str36, Long l, Boolean bool, Boolean bool2, Long l2, Boolean bool3, Boolean bool4, String str37, long j3, long j4, int i12, String str38, boolean z, int i13, int i14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.id = str;
        this.type = i;
        this.data = str2;
        this.chainId = j;
        this.language = str3;
        this.name = str4;
        this.modifiedName = i2;
        this.backup = i3;
        this.cloudBackup = i4;
        this.iHuaweiBackup = i5;
        this.main = i6;
        this.xpub = str5;
        this.xpriv = str6;
        this.isSegWit = i7;
        this.fromCreate = i8;
        this.createAt = j2;
        this.orderValue = i9;
        this.addressIndex = i10;
        this.rootWalletId = str7;
        this.syncStatus = i11;
        this.eoaWalletType = num;
        this.aaWalletStatus = num2;
        this.createVersion = str8;
        this.eosAccountName = str9;
        this.eosActiveKey = str10;
        this.EOSOwnerKey = str11;
        this.EOSPubKey = str12;
        this.EOSShouldBeDeleted = num3;
        this.EOSState = num4;
        this.chainIds = str13;
        this.chainAddrs = str14;
        this.chainAddrTypes = str15;
        this.chainAddressPublicKeys = str16;
        this.chainAddsDerivePaths = str17;
        this.chainAddsProxyAddresses = str18;
        this.chainAddsEoaAddresses = str19;
        this.coinIds = str20;
        this.ccyAmounts = str21;
        this.voucherTokens = str22;
        this.defiBeans = str23;
        this.nftBeans = str24;
        this.tokenAsset = str25;
        this.tokenAssetFilterSmall = str26;
        this.nftAsset = str27;
        this.defiAsset = str28;
        this.totalAssetUpdateTime = str29;
        this.chainSegWitChainIds = str30;
        this.chainSegWitAddresses = str31;
        this.chainSegWitAddTypes = str32;
        this.chainSegWitAddressPublicKeys = str33;
        this.chainSegWitAddressDerivePaths = str34;
        this.identifierType = num5;
        this.repairStatus = num6;
        this.repairReserved = str35;
        this.repairExtJson = str36;
        this.repairTimestamp = l;
        this.isTeeCreated = bool;
        this.isTeeActive = bool2;
        this.teeExpiredTimestamp = l2;
        this.isTeeVerify = bool3;
        this.hasShowTeeExpiredAlert = bool4;
        this.teeId = str37;
        this.teeCreateAt = j3;
        this.teeUpdateAt = j4;
        this.model = i12;
        this.closedCoinIds = str38;
        this.canUseSa2 = z;
        this.autoRenew = i13;
        this.upgradeStatus = i14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r145v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r70v3 */
    /* JADX WARN: Type inference failed for: r70v4 */
    /* JADX WARN: Type inference failed for: r70v5 */
    public /* synthetic */ WalletViewForWalletManagement(String str, int i, String str2, long j, String str3, String str4, int i2, int i3, int i4, int i5, int i6, String str5, String str6, int i7, int i8, long j2, int i9, int i10, String str7, int i11, Integer num, Integer num2, String str8, String str9, String str10, String str11, String str12, Integer num3, Integer num4, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, Integer num5, Integer num6, String str35, String str36, Long l, Boolean bool, Boolean bool2, Long l2, Boolean bool3, Boolean bool4, String str37, long j3, long j4, int i12, String str38, boolean z, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        String str39;
        int i18;
        Integer num7;
        long j5;
        Long l3;
        String str40 = (i15 & 1) != 0 ? "" : str;
        int i19 = (i15 & 2) != 0 ? 0 : i;
        String str41 = (i15 & 4) != 0 ? "" : str2;
        long j6 = (i15 & 8) != 0 ? 0L : j;
        String str42 = (i15 & 16) != 0 ? "" : str3;
        String str43 = (i15 & 32) != 0 ? "" : str4;
        int i20 = (i15 & 64) != 0 ? 0 : i2;
        int i21 = (i15 & 128) != 0 ? 0 : i3;
        int i22 = (i15 & 256) != 0 ? 0 : i4;
        int i23 = (i15 & 512) != 0 ? 0 : i5;
        int i24 = (i15 & 1024) != 0 ? 0 : i6;
        String str44 = (i15 & 2048) != 0 ? "" : str5;
        str39 = "";
        String str45 = (i15 & 4096) != 0 ? str39 : str6;
        int i25 = (i15 & 8192) != 0 ? 0 : i7;
        int i26 = (i15 & 16384) != 0 ? 0 : i8;
        long j7 = (i15 & 32768) != 0 ? 0L : j2;
        int i27 = (i15 & 65536) != 0 ? 0 : i9;
        int i28 = (i15 & 131072) != 0 ? 0 : i10;
        String str46 = (i15 & 262144) != 0 ? str39 : str7;
        int i29 = (i15 & 524288) != 0 ? 0 : i11;
        Integer numValueOf = (i15 & 1048576) != 0 ? Integer.valueOf(WalletType.AAWallet.ordinal()) : num;
        Integer numValueOf2 = (i15 & 2097152) != 0 ? Integer.valueOf(AAStatus.Normal.ordinal()) : num2;
        String str47 = (i15 & 4194304) != 0 ? str39 : str8;
        String str48 = (i15 & 8388608) != 0 ? null : str9;
        String str49 = (i15 & 16777216) != 0 ? null : str10;
        String str50 = (i15 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str11;
        String str51 = (i15 & 67108864) != 0 ? null : str12;
        Integer num8 = (i15 & 134217728) != 0 ? null : num3;
        Integer num9 = (i15 & 268435456) != 0 ? null : num4;
        String str52 = (i15 & 536870912) != 0 ? null : str13;
        String str53 = (i15 & 1073741824) != 0 ? null : str14;
        String str54 = (i15 & Integer.MIN_VALUE) != 0 ? null : str15;
        String str55 = (i16 & 1) != 0 ? null : str16;
        String str56 = (i16 & 2) != 0 ? null : str17;
        String str57 = (i16 & 4) != 0 ? null : str18;
        String str58 = (i16 & 8) != 0 ? null : str19;
        String str59 = (i16 & 16) != 0 ? null : str20;
        String str60 = (i16 & 32) != 0 ? null : str21;
        String str61 = (i16 & 64) != 0 ? null : str22;
        String str62 = str54;
        String str63 = (i16 & 128) != 0 ? null : str23;
        String str64 = (i16 & 256) != 0 ? null : str24;
        String str65 = (i16 & 512) != 0 ? null : str25;
        String str66 = (i16 & 1024) != 0 ? null : str26;
        String str67 = (i16 & 2048) != 0 ? null : str27;
        String str68 = (i16 & 4096) != 0 ? null : str28;
        String str69 = (i16 & 8192) != 0 ? null : str29;
        String str70 = (i16 & 16384) != 0 ? null : str30;
        String str71 = (i16 & 32768) != 0 ? null : str31;
        String str72 = (i16 & 65536) != 0 ? null : str32;
        String str73 = (i16 & 131072) != 0 ? null : str33;
        String str74 = (i16 & 262144) != 0 ? null : str34;
        if ((i16 & 524288) != 0) {
            i18 = 0;
            num7 = 0;
        } else {
            i18 = 0;
            num7 = num5;
        }
        Integer numValueOf3 = (i16 & 1048576) != 0 ? Integer.valueOf(i18) : num6;
        String str75 = (i16 & 2097152) != 0 ? null : str35;
        String str76 = (i16 & 4194304) != 0 ? null : str36;
        Long l4 = (i16 & 8388608) != 0 ? 0L : l;
        Boolean bool5 = (i16 & 16777216) != 0 ? Boolean.FALSE : bool;
        Boolean bool6 = (i16 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? Boolean.FALSE : bool2;
        if ((i16 & 67108864) != 0) {
            j5 = 0;
            l3 = 0L;
        } else {
            j5 = 0;
            l3 = l2;
        }
        this(str40, i19, str41, j6, str42, str43, i20, i21, i22, i23, i24, str44, str45, i25, i26, j7, i27, i28, str46, i29, numValueOf, numValueOf2, str47, str48, str49, str50, str51, num8, num9, str52, str53, str62, str55, str56, str57, str58, str59, str60, str61, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, str73, str74, num7, numValueOf3, str75, str76, l4, bool5, bool6, l3, (i16 & 134217728) != 0 ? Boolean.FALSE : bool3, (i16 & 268435456) != 0 ? Boolean.FALSE : bool4, (i16 & 536870912) == 0 ? str37 : "", (i16 & 1073741824) != 0 ? j5 : j3, (i16 & Integer.MIN_VALUE) == 0 ? j4 : j5, (i17 & 1) != 0 ? i18 : i12, (i17 & 2) == 0 ? str38 : null, (i17 & 4) != 0 ? i18 : z, (i17 & 8) != 0 ? i18 : i13, (i17 & 16) == 0 ? i14 : i18);
    }
}
