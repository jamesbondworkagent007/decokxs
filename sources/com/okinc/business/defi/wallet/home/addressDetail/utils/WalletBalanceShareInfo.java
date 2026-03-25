package com.okinc.business.defi.wallet.home.addressDetail.utils;

import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class WalletBalanceShareInfo {
    private final String chainLogo;
    private final String changeRate;
    private final String changeValue;
    private final String currentBalance;
    private final List<KLineData> kLineData;
    private final Integer riseState;
    private final Integer time;
    private final String walletAddress;
    private final String walletName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(KLineData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.changeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.changeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.riseState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currentBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.walletName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KLineData> component9() {
        return this.kLineData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletBalanceShareInfo copy(Integer num, String str, String str2, Integer num2, String str3, String str4, String str5, String str6, List<KLineData> list) {
        return new WalletBalanceShareInfo(num, str, str2, num2, str3, str4, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletBalanceShareInfo)) {
            return false;
        }
        WalletBalanceShareInfo walletBalanceShareInfo = (WalletBalanceShareInfo) obj;
        return Intrinsics.EZpvd(this.time, walletBalanceShareInfo.time) && Intrinsics.EZpvd((Object) this.changeValue, (Object) walletBalanceShareInfo.changeValue) && Intrinsics.EZpvd((Object) this.changeRate, (Object) walletBalanceShareInfo.changeRate) && Intrinsics.EZpvd(this.riseState, walletBalanceShareInfo.riseState) && Intrinsics.EZpvd((Object) this.currentBalance, (Object) walletBalanceShareInfo.currentBalance) && Intrinsics.EZpvd((Object) this.walletName, (Object) walletBalanceShareInfo.walletName) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) walletBalanceShareInfo.walletAddress) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) walletBalanceShareInfo.chainLogo) && Intrinsics.EZpvd(this.kLineData, walletBalanceShareInfo.kLineData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
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
    public final String getCurrentBalance() {
        return this.currentBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KLineData> getKLineData() {
        return this.kLineData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRiseState() {
        return this.riseState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletName() {
        return this.walletName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.time;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.changeValue;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.changeRate;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.riseState;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.currentBalance;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.walletName;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.walletAddress;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.chainLogo;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        List<KLineData> list = this.kLineData;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletBalanceShareInfo(time=" + this.time + ", changeValue=" + this.changeValue + ", changeRate=" + this.changeRate + ", riseState=" + this.riseState + ", currentBalance=" + this.currentBalance + ", walletName=" + this.walletName + ", walletAddress=" + this.walletAddress + ", chainLogo=" + this.chainLogo + ", kLineData=" + this.kLineData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.addressDetail.utils.WalletBalanceShareInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletBalanceShareInfo> serializer() {
            return WalletBalanceShareInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletBalanceShareInfo(int i, Integer num, String str, String str2, Integer num2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, WalletBalanceShareInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.time = num;
        this.changeValue = str;
        this.changeRate = str2;
        this.riseState = num2;
        this.currentBalance = str3;
        this.walletName = str4;
        this.walletAddress = str5;
        this.chainLogo = str6;
        this.kLineData = list;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletBalanceShareInfo walletBalanceShareInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, intSerializer, walletBalanceShareInfo.time);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, walletBalanceShareInfo.changeValue);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, walletBalanceShareInfo.changeRate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, intSerializer, walletBalanceShareInfo.riseState);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, walletBalanceShareInfo.currentBalance);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, walletBalanceShareInfo.walletName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, walletBalanceShareInfo.walletAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, walletBalanceShareInfo.chainLogo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], walletBalanceShareInfo.kLineData);
    }

    public WalletBalanceShareInfo(Integer num, String str, String str2, Integer num2, String str3, String str4, String str5, String str6, List<KLineData> list) {
        this.time = num;
        this.changeValue = str;
        this.changeRate = str2;
        this.riseState = num2;
        this.currentBalance = str3;
        this.walletName = str4;
        this.walletAddress = str5;
        this.chainLogo = str6;
        this.kLineData = list;
    }
}
