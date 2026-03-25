package com.okinc.okmarket.home.data.po;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class CountingBannerPo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName("canTrade")
    private final boolean canTrade;

    @SerializedName("displayId")
    private final String displayId;

    @SerializedName(RemoteMessageConst.Notification.ICON)
    private final String icon;

    @SerializedName("instId")
    private final String instId;

    @SerializedName("instType")
    private final String instType;

    @SerializedName("noticeUrlCn")
    private final String noticeUrlCn;

    @SerializedName("noticeUrlEn")
    private final String noticeUrlEn;

    @SerializedName("onlineTs")
    private final String onlineTs;

    @SerializedName("openMethod")
    private final String openMethod;

    @SerializedName("tradeReady")
    private final String tradeReady;

    @SerializedName("type")
    private final String type;

    @SerializedName("waitOnlineTime")
    private final String waitOnlineTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.canTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.waitOnlineTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.noticeUrlCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.noticeUrlEn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tradeReady;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.openMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CountingBannerPo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new CountingBannerPo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountingBannerPo)) {
            return false;
        }
        CountingBannerPo countingBannerPo = (CountingBannerPo) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) countingBannerPo.instId) && Intrinsics.EZpvd((Object) this.icon, (Object) countingBannerPo.icon) && Intrinsics.EZpvd((Object) this.onlineTs, (Object) countingBannerPo.onlineTs) && Intrinsics.EZpvd((Object) this.waitOnlineTime, (Object) countingBannerPo.waitOnlineTime) && Intrinsics.EZpvd((Object) this.noticeUrlCn, (Object) countingBannerPo.noticeUrlCn) && Intrinsics.EZpvd((Object) this.noticeUrlEn, (Object) countingBannerPo.noticeUrlEn) && Intrinsics.EZpvd((Object) this.type, (Object) countingBannerPo.type) && Intrinsics.EZpvd((Object) this.tradeReady, (Object) countingBannerPo.tradeReady) && Intrinsics.EZpvd((Object) this.openMethod, (Object) countingBannerPo.openMethod) && Intrinsics.EZpvd((Object) this.displayId, (Object) countingBannerPo.displayId) && Intrinsics.EZpvd((Object) this.instType, (Object) countingBannerPo.instType) && this.canTrade == countingBannerPo.canTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanTrade() {
        return this.canTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNoticeUrlCn() {
        return this.noticeUrlCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNoticeUrlEn() {
        return this.noticeUrlEn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOnlineTs() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenMethod() {
        return this.openMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeReady() {
        return this.tradeReady;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWaitOnlineTime() {
        return this.waitOnlineTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.instId.hashCode() * 31) + this.icon.hashCode()) * 31) + this.onlineTs.hashCode()) * 31) + this.waitOnlineTime.hashCode()) * 31) + this.noticeUrlCn.hashCode()) * 31) + this.noticeUrlEn.hashCode()) * 31) + this.type.hashCode()) * 31) + this.tradeReady.hashCode()) * 31) + this.openMethod.hashCode()) * 31) + this.displayId.hashCode()) * 31) + this.instType.hashCode()) * 31) + Boolean.hashCode(this.canTrade);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CountingBannerPo(instId=" + this.instId + ", icon=" + this.icon + ", onlineTs=" + this.onlineTs + ", waitOnlineTime=" + this.waitOnlineTime + ", noticeUrlCn=" + this.noticeUrlCn + ", noticeUrlEn=" + this.noticeUrlEn + ", type=" + this.type + ", tradeReady=" + this.tradeReady + ", openMethod=" + this.openMethod + ", displayId=" + this.displayId + ", instType=" + this.instType + ", canTrade=" + this.canTrade + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okmarket.home.data.po.CountingBannerPo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CountingBannerPo> serializer() {
            return CountingBannerPo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CountingBannerPo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4095, CountingBannerPo$$serializer.INSTANCE.getDescriptor());
        }
        this.instId = str;
        this.icon = str2;
        this.onlineTs = str3;
        this.waitOnlineTime = str4;
        this.noticeUrlCn = str5;
        this.noticeUrlEn = str6;
        this.type = str7;
        this.tradeReady = str8;
        this.openMethod = str9;
        this.displayId = str10;
        this.instType = str11;
        this.canTrade = z;
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(CountingBannerPo countingBannerPo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, countingBannerPo.instId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, countingBannerPo.icon);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, countingBannerPo.onlineTs);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, countingBannerPo.waitOnlineTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, countingBannerPo.noticeUrlCn);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, countingBannerPo.noticeUrlEn);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, countingBannerPo.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, countingBannerPo.tradeReady);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, countingBannerPo.openMethod);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, countingBannerPo.displayId);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, countingBannerPo.instType);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 11, countingBannerPo.canTrade);
    }

    public CountingBannerPo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.instId = str;
        this.icon = str2;
        this.onlineTs = str3;
        this.waitOnlineTime = str4;
        this.noticeUrlCn = str5;
        this.noticeUrlEn = str6;
        this.type = str7;
        this.tradeReady = str8;
        this.openMethod = str9;
        this.displayId = str10;
        this.instType = str11;
        this.canTrade = z;
    }
}
