package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.room.inhouseim.ConversationIcon;
import com.okinc.okimcore.model.room.inhouseim.ConversationIcon$$serializer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import o.C56391yDq;
import o.C56403yEb;
import o.C59443zhD;
import o.sJU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKContractAddressMessage extends OKCustomMessage implements sJU<OKContractAddressMessage> {
    private String chainId;
    private String chainLogo;
    private Double change1h;
    private String contractAddress;
    private Integer ctaType;
    private Double currentPrice;
    private List<ConversationIcon> icons;
    private Boolean isDexListed;
    private String marketCap;
    private String notificationDeepLink;
    private List<PriceChartPoint> priceChart;
    private String tokenLogo;
    private String tokenName;
    private String tokenPageDeepLink;
    private String tokenSymbol;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ConversationIcon$$serializer.INSTANCE), null, null, null, null, null, null, new ArrayListSerializer(OKContractAddressMessage$PriceChartPoint$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getChange1h() {
        return this.change1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCtaType() {
        return this.ctaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConversationIcon> getIcons() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotificationDeepLink() {
        return this.notificationDeepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriceChartPoint> getPriceChart() {
        return this.priceChart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPageDeepLink() {
        return this.tokenPageDeepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDexListed() {
        return this.isDexListed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(String str) {
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogo(String str) {
        this.chainLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChange1h(Double d) {
        this.change1h = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtaType(Integer num) {
        this.ctaType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentPrice(Double d) {
        this.currentPrice = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexListed(Boolean bool) {
        this.isDexListed = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcons(List<ConversationIcon> list) {
        this.icons = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketCap(String str) {
        this.marketCap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotificationDeepLink(String str) {
        this.notificationDeepLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChart(List<PriceChartPoint> list) {
        this.priceChart = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenLogo(String str) {
        this.tokenLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenName(String str) {
        this.tokenName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenPageDeepLink(String str) {
        this.tokenPageDeepLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenSymbol(String str) {
        this.tokenSymbol = str;
    }

    public /* synthetic */ OKContractAddressMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List list, Boolean bool, String str17, String str18, Double d, Double d2, Integer num, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        OKContractAddressMessage oKContractAddressMessage;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, jsonObject, str8, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            oKContractAddressMessage = this;
            oKContractAddressMessage.tokenName = null;
        } else {
            oKContractAddressMessage = this;
            oKContractAddressMessage.tokenName = str10;
        }
        if ((i & 131072) == 0) {
            oKContractAddressMessage.tokenSymbol = null;
        } else {
            oKContractAddressMessage.tokenSymbol = str11;
        }
        if ((i & 262144) == 0) {
            oKContractAddressMessage.tokenLogo = null;
        } else {
            oKContractAddressMessage.tokenLogo = str12;
        }
        if ((i & 524288) == 0) {
            oKContractAddressMessage.chainLogo = null;
        } else {
            oKContractAddressMessage.chainLogo = str13;
        }
        if ((i & 1048576) == 0) {
            oKContractAddressMessage.notificationDeepLink = null;
        } else {
            oKContractAddressMessage.notificationDeepLink = str14;
        }
        if ((i & 2097152) == 0) {
            oKContractAddressMessage.tokenPageDeepLink = null;
        } else {
            oKContractAddressMessage.tokenPageDeepLink = str15;
        }
        if ((i & 4194304) == 0) {
            oKContractAddressMessage.chainId = null;
        } else {
            oKContractAddressMessage.chainId = str16;
        }
        if ((i & 8388608) == 0) {
            oKContractAddressMessage.icons = null;
        } else {
            oKContractAddressMessage.icons = list;
        }
        if ((i & 16777216) == 0) {
            oKContractAddressMessage.isDexListed = null;
        } else {
            oKContractAddressMessage.isDexListed = bool;
        }
        if ((i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
            oKContractAddressMessage.contractAddress = null;
        } else {
            oKContractAddressMessage.contractAddress = str17;
        }
        if ((i & 67108864) == 0) {
            oKContractAddressMessage.marketCap = null;
        } else {
            oKContractAddressMessage.marketCap = str18;
        }
        if ((i & 134217728) == 0) {
            oKContractAddressMessage.currentPrice = null;
        } else {
            oKContractAddressMessage.currentPrice = d;
        }
        if ((i & 268435456) == 0) {
            oKContractAddressMessage.change1h = null;
        } else {
            oKContractAddressMessage.change1h = d2;
        }
        if ((i & 536870912) == 0) {
            oKContractAddressMessage.ctaType = null;
        } else {
            oKContractAddressMessage.ctaType = num;
        }
        oKContractAddressMessage.priceChart = (i & 1073741824) != 0 ? list2 : null;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKContractAddressMessage oKContractAddressMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) oKContractAddressMessage, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || oKContractAddressMessage.tokenName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, oKContractAddressMessage.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || oKContractAddressMessage.tokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, oKContractAddressMessage.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || oKContractAddressMessage.tokenLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, oKContractAddressMessage.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || oKContractAddressMessage.chainLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, oKContractAddressMessage.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || oKContractAddressMessage.notificationDeepLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, oKContractAddressMessage.notificationDeepLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || oKContractAddressMessage.tokenPageDeepLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, oKContractAddressMessage.tokenPageDeepLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || oKContractAddressMessage.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, oKContractAddressMessage.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || oKContractAddressMessage.icons != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, kSerializerArr[23], oKContractAddressMessage.icons);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || oKContractAddressMessage.isDexListed != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, BooleanSerializer.INSTANCE, oKContractAddressMessage.isDexListed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || oKContractAddressMessage.contractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, oKContractAddressMessage.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || oKContractAddressMessage.marketCap != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, oKContractAddressMessage.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || oKContractAddressMessage.currentPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, DoubleSerializer.INSTANCE, oKContractAddressMessage.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || oKContractAddressMessage.change1h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, DoubleSerializer.INSTANCE, oKContractAddressMessage.change1h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || oKContractAddressMessage.ctaType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, IntSerializer.INSTANCE, oKContractAddressMessage.ctaType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) && oKContractAddressMessage.priceChart == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, kSerializerArr[30], oKContractAddressMessage.priceChart);
    }

    @Serializable
    public static final class PriceChartPoint implements Parcelable {
        public static final int $stable = 0;
        public static final CREATOR CREATOR = new CREATOR(null);
        public final String price;
        public final long time;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PriceChartPoint copy$default(PriceChartPoint priceChartPoint, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = priceChartPoint.time;
            }
            if ((i & 2) != 0) {
                str = priceChartPoint.price;
            }
            return priceChartPoint.EZpvd(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PriceChartPoint EZpvd(long j, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new PriceChartPoint(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.time;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PriceChartPoint)) {
                return false;
            }
            PriceChartPoint priceChartPoint = (PriceChartPoint) obj;
            return this.time == priceChartPoint.time && Intrinsics.EZpvd((Object) this.price, (Object) priceChartPoint.price);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Long.hashCode(this.time) * 31) + this.price.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PriceChartPoint(time=" + this.time + ", price=" + this.price + ")";
        }

        public /* synthetic */ PriceChartPoint(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, OKContractAddressMessage$PriceChartPoint$$serializer.INSTANCE.getDescriptor());
            }
            this.time = j;
            this.price = str;
        }

        public static final /* synthetic */ void OLrzqt(PriceChartPoint priceChartPoint, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, priceChartPoint.time);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, priceChartPoint.price);
        }

        public PriceChartPoint(long j, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.time = j;
            this.price = str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PriceChartPoint(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            this(j, string != null ? string : "");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeLong(this.time);
            parcel.writeString(this.price);
        }

        @NamedCompanion
        public static final class CREATOR implements Parcelable.Creator<PriceChartPoint> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKContractAddressMessage.PriceChartPoint.CREATOR.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private CREATOR() {
            }

            public final KSerializer<PriceChartPoint> serializer() {
                return OKContractAddressMessage$PriceChartPoint$$serializer.INSTANCE;
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PriceChartPoint createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PriceChartPoint(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PriceChartPoint[] newArray(int i) {
                return new PriceChartPoint[i];
            }
        }
    }

    public OKContractAddressMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKContractAddressMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.tokenName = parcel.readString();
        this.tokenSymbol = parcel.readString();
        this.tokenLogo = parcel.readString();
        this.chainLogo = parcel.readString();
        this.notificationDeepLink = parcel.readString();
        this.tokenPageDeepLink = parcel.readString();
        this.chainId = parcel.readString();
        this.icons = parcel.createTypedArrayList(ConversationIcon.CREATE);
        this.isDexListed = Boolean.valueOf(parcel.readInt() == 1);
        this.contractAddress = parcel.readString();
        this.marketCap = parcel.readString();
        double d = parcel.readDouble();
        this.currentPrice = d == -1.0d ? null : Double.valueOf(d);
        double d2 = parcel.readDouble();
        this.change1h = d2 != -1.0d ? Double.valueOf(d2) : null;
        this.priceChart = parcel.createTypedArrayList(PriceChartPoint.CREATOR);
        this.ctaType = Integer.valueOf(parcel.readInt());
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.chainLogo);
        parcel.writeString(this.notificationDeepLink);
        parcel.writeString(this.tokenPageDeepLink);
        parcel.writeString(this.chainId);
        parcel.writeTypedList(this.icons);
        parcel.writeInt(Intrinsics.EZpvd(this.isDexListed, Boolean.TRUE) ? 1 : 0);
        parcel.writeString(this.contractAddress);
        parcel.writeString(this.marketCap);
        Double d = this.currentPrice;
        parcel.writeDouble(d != null ? d.doubleValue() : -1.0d);
        Double d2 = this.change1h;
        parcel.writeDouble(d2 != null ? d2.doubleValue() : -1.0d);
        parcel.writeTypedList(this.priceChart);
        Integer num = this.ctaType;
        parcel.writeInt(num != null ? num.intValue() : 0);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKMessageContent> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKContractAddressMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKContractAddressMessage> serializer() {
            return OKContractAddressMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKMessageContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKContractAddressMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKMessageContent[] newArray(int i) {
            return new OKMessageContent[i];
        }

        public final OKContractAddressMessage obtain(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, Boolean bool, String str8, String str9, Double d, Double d2, List<PriceChartPoint> list2, Integer num) {
            ArrayList arrayList;
            OKContractAddressMessage oKContractAddressMessage = new OKContractAddressMessage();
            oKContractAddressMessage.setTokenName(str);
            oKContractAddressMessage.setTokenSymbol(str2);
            oKContractAddressMessage.setTokenLogo(str3);
            oKContractAddressMessage.setChainLogo(str4);
            oKContractAddressMessage.setNotificationDeepLink(str5);
            oKContractAddressMessage.setTokenPageDeepLink(str6);
            oKContractAddressMessage.setChainId(str7);
            if (list != null) {
                arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (String str10 : list) {
                    arrayList.add(new ConversationIcon(str10, str10));
                }
            } else {
                arrayList = null;
            }
            oKContractAddressMessage.setIcons(arrayList);
            oKContractAddressMessage.setDexListed(bool);
            oKContractAddressMessage.setContractAddress(str8);
            oKContractAddressMessage.setMarketCap(str9);
            oKContractAddressMessage.setCurrentPrice(d);
            oKContractAddressMessage.setChange1h(d2);
            oKContractAddressMessage.setPriceChart(list2);
            oKContractAddressMessage.setCtaType(num);
            return oKContractAddressMessage;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OKContractAddressMessage m6871decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKContractAddressMessage();
    }

    @Override // o.sJU
    public String encodeToInHouseCustomContent() {
        String utf8ContentString;
        String content = getContent();
        return (content == null || (utf8ContentString = toUtf8ContentString(content)) == null) ? "" : utf8ContentString;
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromInHouseCustomContent(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.sJU
    public OKContractAddressMessage decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
        ArrayList arrayList;
        JsonElement jsonElement;
        JsonArray asJsonArray;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        String asString;
        JsonElement jsonElement4;
        String asString2;
        JsonElement jsonElement5;
        JsonElement jsonElement6;
        JsonElement jsonElement7;
        JsonElement jsonElement8;
        JsonArray asJsonArray2;
        ConversationIcon conversationIcon;
        String asString3;
        JsonElement jsonElement9;
        JsonElement jsonElement10;
        JsonElement jsonElement11;
        JsonElement jsonElement12;
        JsonElement jsonElement13;
        JsonElement jsonElement14;
        JsonElement jsonElement15;
        if (str == null || (utf8ContentString = toUtf8ContentString(str)) == null) {
            utf8ContentString = "";
        }
        setContent(utf8ContentString);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(JsonParser.parseString(utf8ContentString).getAsJsonObject());
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        ArrayList arrayList2 = null;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) objM7377constructorimpl;
        this.tokenName = (jsonObject == null || (jsonElement15 = jsonObject.get("tokenName")) == null) ? null : jsonElement15.getAsString();
        this.tokenSymbol = (jsonObject == null || (jsonElement14 = jsonObject.get("tokenSymbol")) == null) ? null : jsonElement14.getAsString();
        this.tokenLogo = (jsonObject == null || (jsonElement13 = jsonObject.get("tokenLogo")) == null) ? null : jsonElement13.getAsString();
        this.chainLogo = (jsonObject == null || (jsonElement12 = jsonObject.get("chainLogo")) == null) ? null : jsonElement12.getAsString();
        this.notificationDeepLink = (jsonObject == null || (jsonElement11 = jsonObject.get("notificationDeepLink")) == null) ? null : jsonElement11.getAsString();
        this.tokenPageDeepLink = (jsonObject == null || (jsonElement10 = jsonObject.get("tokenPageDeepLink")) == null) ? null : jsonElement10.getAsString();
        this.chainId = (jsonObject == null || (jsonElement9 = jsonObject.get("chainId")) == null) ? null : jsonElement9.getAsString();
        if (jsonObject == null || (jsonElement8 = jsonObject.get("icons")) == null || (asJsonArray2 = jsonElement8.getAsJsonArray()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (JsonElement jsonElement16 : asJsonArray2) {
                if (jsonElement16.isJsonObject()) {
                    com.google.gson.JsonObject asJsonObject = jsonElement16.getAsJsonObject();
                    JsonElement jsonElement17 = asJsonObject.get("light");
                    String asString4 = jsonElement17 != null ? jsonElement17.getAsString() : null;
                    JsonElement jsonElement18 = asJsonObject.get("dark");
                    conversationIcon = new ConversationIcon(asString4, jsonElement18 != null ? jsonElement18.getAsString() : null);
                } else {
                    conversationIcon = (!jsonElement16.isJsonPrimitive() || (asString3 = jsonElement16.getAsString()) == null) ? null : new ConversationIcon(asString3, asString3);
                }
                if (conversationIcon != null) {
                    arrayList.add(conversationIcon);
                }
            }
        }
        this.icons = arrayList;
        this.isDexListed = (jsonObject == null || (jsonElement7 = jsonObject.get("isDexListed")) == null) ? null : Boolean.valueOf(jsonElement7.getAsBoolean());
        this.contractAddress = (jsonObject == null || (jsonElement6 = jsonObject.get("contractAddress")) == null) ? null : jsonElement6.getAsString();
        this.marketCap = (jsonObject == null || (jsonElement5 = jsonObject.get("marketCap")) == null) ? null : jsonElement5.getAsString();
        this.currentPrice = (jsonObject == null || (jsonElement4 = jsonObject.get("currentPrice")) == null || (asString2 = jsonElement4.getAsString()) == null) ? null : C59443zhD.AuCTel(asString2);
        this.change1h = (jsonObject == null || (jsonElement3 = jsonObject.get("change1h")) == null || (asString = jsonElement3.getAsString()) == null) ? null : C59443zhD.AuCTel(asString);
        this.ctaType = (jsonObject == null || (jsonElement2 = jsonObject.get("ctaType")) == null) ? null : Integer.valueOf(jsonElement2.getAsInt());
        if (jsonObject != null && (jsonElement = jsonObject.get("priceChart")) != null && (asJsonArray = jsonElement.getAsJsonArray()) != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                com.google.gson.JsonObject asJsonObject2 = it.next().getAsJsonObject();
                JsonElement jsonElement19 = asJsonObject2.get(CrashHianalyticsData.TIME);
                Long lValueOf = jsonElement19 != null ? Long.valueOf(jsonElement19.getAsLong()) : null;
                JsonElement jsonElement20 = asJsonObject2.get(FirebaseAnalytics.Param.PRICE);
                String asString5 = jsonElement20 != null ? jsonElement20.getAsString() : null;
                PriceChartPoint priceChartPoint = (lValueOf == null || asString5 == null) ? null : new PriceChartPoint(lValueOf.longValue(), asString5);
                if (priceChartPoint != null) {
                    arrayList3.add(priceChartPoint);
                }
            }
            arrayList2 = arrayList3;
        }
        this.priceChart = arrayList2;
        return this;
    }

    private final String toUtf8ContentString(String str) {
        Object objM7377constructorimpl;
        if (str == null) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "");
            objM7377constructorimpl = Result.m7377constructorimpl(new String(bytes, charset));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }
}
