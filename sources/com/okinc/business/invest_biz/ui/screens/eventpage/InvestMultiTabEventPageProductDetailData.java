package com.okinc.business.invest_biz.ui.screens.eventpage;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestPlatformLogo;
import com.okinc.business.invest_biz.data.bean.InvestPlatformLogo$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestTag;
import com.okinc.business.invest_biz.data.bean.InvestTag$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestMultiTabEventPageProductDetailData implements Parcelable {
    private final int aggregateId;
    private final String baseRate;
    private final boolean hasBonus;
    private final InvestPlatformLogo investLogo;
    private final List<InvestTag> investTagList;
    private final String investmentClassify;
    private final long investmentId;
    private final String investmentName;
    private final String networkLogo;
    private final String networkName;
    private final String nightNetworkLogo;
    private final String platformLogo;
    private final String platformName;
    private final String rate;
    private final int rateType;
    private final String rateTypeDesc;
    private final String subInfoName;
    private final int type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestMultiTabEventPageProductDetailData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InvestTag$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<InvestMultiTabEventPageProductDetailData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestMultiTabEventPageProductDetailData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i2 = 0;
            boolean z = parcel.readInt() != 0;
            InvestPlatformLogo investPlatformLogoCreateFromParcel = InvestPlatformLogo.CREATOR.createFromParcel(parcel);
            long j = parcel.readLong();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i3 = parcel.readInt();
            String string9 = parcel.readString();
            int i4 = parcel.readInt();
            String string10 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i5);
            while (i2 != i5) {
                arrayList.add(InvestTag.CREATOR.createFromParcel(parcel));
                i2++;
                i5 = i5;
            }
            return new InvestMultiTabEventPageProductDetailData(i, string, string2, z, investPlatformLogoCreateFromParcel, j, string3, string4, string5, string6, string7, string8, i3, string9, i4, string10, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestMultiTabEventPageProductDetailData[] newArray(int i) {
            return new InvestMultiTabEventPageProductDetailData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestMultiTabEventPageProductDetailData() {
        this(0, (String) null, (String) null, false, (InvestPlatformLogo) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (List) null, (String) null, 262143, (DefaultConstructorMarker) null);
    }

    @SerialName("aggregateId")
    public static /* synthetic */ void getAggregateId$annotations() {
    }

    @SerialName("baseRate")
    public static /* synthetic */ void getBaseRate$annotations() {
    }

    @SerialName("hasBonus")
    public static /* synthetic */ void getHasBonus$annotations() {
    }

    @SerialName("investLogo")
    public static /* synthetic */ void getInvestLogo$annotations() {
    }

    @SerialName("investTagList")
    public static /* synthetic */ void getInvestTagList$annotations() {
    }

    @SerialName("investmentClassify")
    public static /* synthetic */ void getInvestmentClassify$annotations() {
    }

    @SerialName("investmentId")
    public static /* synthetic */ void getInvestmentId$annotations() {
    }

    @SerialName("investmentName")
    public static /* synthetic */ void getInvestmentName$annotations() {
    }

    @SerialName("networkLogo")
    public static /* synthetic */ void getNetworkLogo$annotations() {
    }

    @SerialName("networkName")
    public static /* synthetic */ void getNetworkName$annotations() {
    }

    @SerialName("nightNetworkLogo")
    public static /* synthetic */ void getNightNetworkLogo$annotations() {
    }

    @SerialName("platformLogo")
    public static /* synthetic */ void getPlatformLogo$annotations() {
    }

    @SerialName("platformName")
    public static /* synthetic */ void getPlatformName$annotations() {
    }

    @SerialName("rate")
    public static /* synthetic */ void getRate$annotations() {
    }

    @SerialName("rateType")
    public static /* synthetic */ void getRateType$annotations() {
    }

    @SerialName("rateTypeDesc")
    public static /* synthetic */ void getRateTypeDesc$annotations() {
    }

    @SerialName("subInfoName")
    public static /* synthetic */ void getSubInfoName$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.aggregateId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.rateTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.subInfoName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTag> component17() {
        return this.investTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.investmentClassify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.hasBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPlatformLogo component5() {
        return this.investLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.nightNetworkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestMultiTabEventPageProductDetailData copy(int i, @NotNull String str, @NotNull String str2, boolean z, @NotNull InvestPlatformLogo investPlatformLogo, long j, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i2, @NotNull String str9, int i3, @NotNull String str10, @NotNull List<InvestTag> list, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(investPlatformLogo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new InvestMultiTabEventPageProductDetailData(i, str, str2, z, investPlatformLogo, j, str3, str4, str5, str6, str7, str8, i2, str9, i3, str10, list, str11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestMultiTabEventPageProductDetailData)) {
            return false;
        }
        InvestMultiTabEventPageProductDetailData investMultiTabEventPageProductDetailData = (InvestMultiTabEventPageProductDetailData) obj;
        return this.aggregateId == investMultiTabEventPageProductDetailData.aggregateId && Intrinsics.EZpvd((Object) this.rate, (Object) investMultiTabEventPageProductDetailData.rate) && Intrinsics.EZpvd((Object) this.baseRate, (Object) investMultiTabEventPageProductDetailData.baseRate) && this.hasBonus == investMultiTabEventPageProductDetailData.hasBonus && Intrinsics.EZpvd(this.investLogo, investMultiTabEventPageProductDetailData.investLogo) && this.investmentId == investMultiTabEventPageProductDetailData.investmentId && Intrinsics.EZpvd((Object) this.investmentName, (Object) investMultiTabEventPageProductDetailData.investmentName) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) investMultiTabEventPageProductDetailData.networkLogo) && Intrinsics.EZpvd((Object) this.nightNetworkLogo, (Object) investMultiTabEventPageProductDetailData.nightNetworkLogo) && Intrinsics.EZpvd((Object) this.networkName, (Object) investMultiTabEventPageProductDetailData.networkName) && Intrinsics.EZpvd((Object) this.platformLogo, (Object) investMultiTabEventPageProductDetailData.platformLogo) && Intrinsics.EZpvd((Object) this.platformName, (Object) investMultiTabEventPageProductDetailData.platformName) && this.rateType == investMultiTabEventPageProductDetailData.rateType && Intrinsics.EZpvd((Object) this.rateTypeDesc, (Object) investMultiTabEventPageProductDetailData.rateTypeDesc) && this.type == investMultiTabEventPageProductDetailData.type && Intrinsics.EZpvd((Object) this.subInfoName, (Object) investMultiTabEventPageProductDetailData.subInfoName) && Intrinsics.EZpvd(this.investTagList, investMultiTabEventPageProductDetailData.investTagList) && Intrinsics.EZpvd((Object) this.investmentClassify, (Object) investMultiTabEventPageProductDetailData.investmentClassify);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAggregateId() {
        return this.aggregateId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseRate() {
        return this.baseRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasBonus() {
        return this.hasBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPlatformLogo getInvestLogo() {
        return this.investLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTag> getInvestTagList() {
        return this.investTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentClassify() {
        return this.investmentClassify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentName() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkLogo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNightNetworkLogo() {
        return this.nightNetworkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformLogo() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateTypeDesc() {
        return this.rateTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubInfoName() {
        return this.subInfoName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((Integer.hashCode(this.aggregateId) * 31) + this.rate.hashCode()) * 31) + this.baseRate.hashCode()) * 31) + Boolean.hashCode(this.hasBonus)) * 31) + this.investLogo.hashCode()) * 31) + Long.hashCode(this.investmentId)) * 31) + this.investmentName.hashCode()) * 31) + this.networkLogo.hashCode()) * 31) + this.nightNetworkLogo.hashCode()) * 31) + this.networkName.hashCode()) * 31) + this.platformLogo.hashCode()) * 31) + this.platformName.hashCode()) * 31) + Integer.hashCode(this.rateType)) * 31) + this.rateTypeDesc.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + this.subInfoName.hashCode()) * 31) + this.investTagList.hashCode()) * 31) + this.investmentClassify.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestMultiTabEventPageProductDetailData(aggregateId=" + this.aggregateId + ", rate=" + this.rate + ", baseRate=" + this.baseRate + ", hasBonus=" + this.hasBonus + ", investLogo=" + this.investLogo + ", investmentId=" + this.investmentId + ", investmentName=" + this.investmentName + ", networkLogo=" + this.networkLogo + ", nightNetworkLogo=" + this.nightNetworkLogo + ", networkName=" + this.networkName + ", platformLogo=" + this.platformLogo + ", platformName=" + this.platformName + ", rateType=" + this.rateType + ", rateTypeDesc=" + this.rateTypeDesc + ", type=" + this.type + ", subInfoName=" + this.subInfoName + ", investTagList=" + this.investTagList + ", investmentClassify=" + this.investmentClassify + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.aggregateId);
        parcel.writeString(this.rate);
        parcel.writeString(this.baseRate);
        parcel.writeInt(this.hasBonus ? 1 : 0);
        this.investLogo.writeToParcel(parcel, i);
        parcel.writeLong(this.investmentId);
        parcel.writeString(this.investmentName);
        parcel.writeString(this.networkLogo);
        parcel.writeString(this.nightNetworkLogo);
        parcel.writeString(this.networkName);
        parcel.writeString(this.platformLogo);
        parcel.writeString(this.platformName);
        parcel.writeInt(this.rateType);
        parcel.writeString(this.rateTypeDesc);
        parcel.writeInt(this.type);
        parcel.writeString(this.subInfoName);
        List<InvestTag> list = this.investTagList;
        parcel.writeInt(list.size());
        Iterator<InvestTag> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.investmentClassify);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageProductDetailData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestMultiTabEventPageProductDetailData> serializer() {
            return InvestMultiTabEventPageProductDetailData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestMultiTabEventPageProductDetailData(int i, int i2, String str, String str2, boolean z, InvestPlatformLogo investPlatformLogo, long j, String str3, String str4, String str5, String str6, String str7, String str8, int i3, String str9, int i4, String str10, List list, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.aggregateId = 0;
        } else {
            this.aggregateId = i2;
        }
        if ((i & 2) == 0) {
            this.rate = "";
        } else {
            this.rate = str;
        }
        if ((i & 4) == 0) {
            this.baseRate = "";
        } else {
            this.baseRate = str2;
        }
        if ((i & 8) == 0) {
            this.hasBonus = false;
        } else {
            this.hasBonus = z;
        }
        this.investLogo = (i & 16) == 0 ? new InvestPlatformLogo((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null) : investPlatformLogo;
        this.investmentId = (i & 32) == 0 ? 0L : j;
        if ((i & 64) == 0) {
            this.investmentName = "";
        } else {
            this.investmentName = str3;
        }
        if ((i & 128) == 0) {
            this.networkLogo = "";
        } else {
            this.networkLogo = str4;
        }
        if ((i & 256) == 0) {
            this.nightNetworkLogo = "";
        } else {
            this.nightNetworkLogo = str5;
        }
        if ((i & 512) == 0) {
            this.networkName = "";
        } else {
            this.networkName = str6;
        }
        if ((i & 1024) == 0) {
            this.platformLogo = "";
        } else {
            this.platformLogo = str7;
        }
        if ((i & 2048) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str8;
        }
        if ((i & 4096) == 0) {
            this.rateType = 0;
        } else {
            this.rateType = i3;
        }
        if ((i & 8192) == 0) {
            this.rateTypeDesc = "";
        } else {
            this.rateTypeDesc = str9;
        }
        if ((i & 16384) == 0) {
            this.type = 0;
        } else {
            this.type = i4;
        }
        if ((32768 & i) == 0) {
            this.subInfoName = "";
        } else {
            this.subInfoName = str10;
        }
        this.investTagList = (65536 & i) == 0 ? yDY.AhwBna() : list;
        if ((i & 131072) == 0) {
            this.investmentClassify = "";
        } else {
            this.investmentClassify = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestMultiTabEventPageProductDetailData investMultiTabEventPageProductDetailData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investMultiTabEventPageProductDetailData.aggregateId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, investMultiTabEventPageProductDetailData.aggregateId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investMultiTabEventPageProductDetailData.rate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investMultiTabEventPageProductDetailData.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investMultiTabEventPageProductDetailData.baseRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investMultiTabEventPageProductDetailData.baseRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investMultiTabEventPageProductDetailData.hasBonus) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, investMultiTabEventPageProductDetailData.hasBonus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(investMultiTabEventPageProductDetailData.investLogo, new InvestPlatformLogo((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, InvestPlatformLogo$$serializer.INSTANCE, investMultiTabEventPageProductDetailData.investLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investMultiTabEventPageProductDetailData.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, investMultiTabEventPageProductDetailData.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investMultiTabEventPageProductDetailData.investmentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investMultiTabEventPageProductDetailData.investmentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investMultiTabEventPageProductDetailData.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investMultiTabEventPageProductDetailData.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investMultiTabEventPageProductDetailData.nightNetworkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investMultiTabEventPageProductDetailData.nightNetworkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investMultiTabEventPageProductDetailData.networkName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investMultiTabEventPageProductDetailData.networkName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investMultiTabEventPageProductDetailData.platformLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investMultiTabEventPageProductDetailData.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investMultiTabEventPageProductDetailData.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investMultiTabEventPageProductDetailData.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investMultiTabEventPageProductDetailData.rateType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, investMultiTabEventPageProductDetailData.rateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) investMultiTabEventPageProductDetailData.rateTypeDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, investMultiTabEventPageProductDetailData.rateTypeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investMultiTabEventPageProductDetailData.type != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, investMultiTabEventPageProductDetailData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) investMultiTabEventPageProductDetailData.subInfoName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, investMultiTabEventPageProductDetailData.subInfoName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(investMultiTabEventPageProductDetailData.investTagList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], investMultiTabEventPageProductDetailData.investTagList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && Intrinsics.EZpvd((Object) investMultiTabEventPageProductDetailData.investmentClassify, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 17, investMultiTabEventPageProductDetailData.investmentClassify);
    }

    public InvestMultiTabEventPageProductDetailData(int i, @NotNull String str, @NotNull String str2, boolean z, @NotNull InvestPlatformLogo investPlatformLogo, long j, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i2, @NotNull String str9, int i3, @NotNull String str10, @NotNull List<InvestTag> list, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(investPlatformLogo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.aggregateId = i;
        this.rate = str;
        this.baseRate = str2;
        this.hasBonus = z;
        this.investLogo = investPlatformLogo;
        this.investmentId = j;
        this.investmentName = str3;
        this.networkLogo = str4;
        this.nightNetworkLogo = str5;
        this.networkName = str6;
        this.platformLogo = str7;
        this.platformName = str8;
        this.rateType = i2;
        this.rateTypeDesc = str9;
        this.type = i3;
        this.subInfoName = str10;
        this.investTagList = list;
        this.investmentClassify = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00d8: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestPlatformLogo:?: TERNARY null = ((wrap:int:0x0024: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:57) call: com.okinc.business.invest_biz.data.bean.InvestPlatformLogo.<init>(java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r25v0 com.okinc.business.invest_biz.data.bean.InvestPlatformLogo))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0038: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r26v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0061: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0069: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0071: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r34v0 int))
  (wrap:java.lang.String:0x0084: TERNARY null = ((wrap:int:0x007b: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0086: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0091: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x009c: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a0: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:81)) : (r38v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, boolean, com.okinc.business.invest_biz.data.bean.InvestPlatformLogo, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestTag>, java.lang.String):void (m)] (LINE:47) call: com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageProductDetailData.<init>(int, java.lang.String, java.lang.String, boolean, com.okinc.business.invest_biz.data.bean.InvestPlatformLogo, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ InvestMultiTabEventPageProductDetailData(int i, String str, String str2, boolean z, InvestPlatformLogo investPlatformLogo, long j, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, int i3, String str10, List list, String str11, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? new InvestPlatformLogo((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null) : investPlatformLogo, (i4 & 32) != 0 ? 0L : j, (i4 & 64) != 0 ? "" : str3, (i4 & 128) != 0 ? "" : str4, (i4 & 256) != 0 ? "" : str5, (i4 & 512) != 0 ? "" : str6, (i4 & 1024) != 0 ? "" : str7, (i4 & 2048) != 0 ? "" : str8, (i4 & 4096) != 0 ? 0 : i2, (i4 & 8192) != 0 ? "" : str9, (i4 & 16384) != 0 ? 0 : i3, (i4 & 32768) != 0 ? "" : str10, (i4 & 65536) != 0 ? yDY.AhwBna() : list, (i4 & 131072) != 0 ? "" : str11);
    }
}
