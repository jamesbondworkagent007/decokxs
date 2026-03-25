package com.okinc.okmarket.home;

import com.okinc.okmarket.home.data.po.BannerListItem;
import com.okinc.okmarket.home.data.po.BannerListItem$$serializer;
import com.okinc.okmarket.home.data.po.CountingBannerPo;
import com.okinc.okmarket.home.data.po.CountingBannerPo$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class NewCoinInfo {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<BannerListItem> bannerList;
    private List<String> coinName;
    private List<String> futuresName;
    private int futuresNum;
    private int newCoin;
    private CountingBannerPo waitOnline;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @SerialName("bannnerList")
    public static /* synthetic */ void getBannerList$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BannerListItem> getBannerList() {
        return this.bannerList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getFuturesName() {
        return this.futuresName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFuturesNum() {
        return this.futuresNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNewCoin() {
        return this.newCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CountingBannerPo getWaitOnline() {
        return this.waitOnline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinName(List<String> list) {
        this.coinName = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFuturesName(List<String> list) {
        this.futuresName = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFuturesNum(int i) {
        this.futuresNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewCoin(int i) {
        this.newCoin = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWaitOnline(CountingBannerPo countingBannerPo) {
        this.waitOnline = countingBannerPo;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okmarket.home.NewCoinInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewCoinInfo> serializer() {
            return NewCoinInfo$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(BannerListItem$$serializer.INSTANCE)};
    }

    public NewCoinInfo() {
    }

    public /* synthetic */ NewCoinInfo(int i, int i2, List list, int i3, List list2, CountingBannerPo countingBannerPo, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.newCoin = 0;
        } else {
            this.newCoin = i2;
        }
        if ((i & 2) == 0) {
            this.coinName = null;
        } else {
            this.coinName = list;
        }
        if ((i & 4) == 0) {
            this.futuresNum = 0;
        } else {
            this.futuresNum = i3;
        }
        if ((i & 8) == 0) {
            this.futuresName = null;
        } else {
            this.futuresName = list2;
        }
        if ((i & 16) == 0) {
            this.waitOnline = null;
        } else {
            this.waitOnline = countingBannerPo;
        }
        if ((i & 32) == 0) {
            this.bannerList = null;
        } else {
            this.bannerList = list3;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(NewCoinInfo newCoinInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || newCoinInfo.newCoin != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, newCoinInfo.newCoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || newCoinInfo.coinName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], newCoinInfo.coinName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || newCoinInfo.futuresNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, newCoinInfo.futuresNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || newCoinInfo.futuresName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], newCoinInfo.futuresName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || newCoinInfo.waitOnline != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, CountingBannerPo$$serializer.INSTANCE, newCoinInfo.waitOnline);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && newCoinInfo.bannerList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], newCoinInfo.bannerList);
    }
}
