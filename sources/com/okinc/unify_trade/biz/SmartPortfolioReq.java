package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SmartPortfolioReq implements Parcelable {
    private String balType;
    private List<CoinAssetParam> capitalList;
    private String deltaRatio;
    private String initCapital;
    private String interval;
    private String investType;
    private List<CoinRatioParam> portfolioList;
    private String quoteCcy;
    private String quoteSz;
    private String recommendId;
    private String sourceAlgoId;
    private String stgyName;
    private String tdMode;
    private String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SmartPortfolioReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(CoinAssetParam$$serializer.INSTANCE), new ArrayListSerializer(CoinRatioParam$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<SmartPortfolioReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartPortfolioReq createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(CoinAssetParam.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(CoinRatioParam.CREATOR.createFromParcel(parcel));
                }
            }
            return new SmartPortfolioReq(string, arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartPortfolioReq[] newArray(int i) {
            return new SmartPortfolioReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartPortfolioReq() {
        this((String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinAssetParam> component2() {
        return this.capitalList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinRatioParam> component3() {
        return this.portfolioList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.balType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.deltaRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.recommendId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.initCapital;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartPortfolioReq copy(String str, List<CoinAssetParam> list, List<CoinRatioParam> list2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return new SmartPortfolioReq(str, list, list2, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
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
        if (!(obj instanceof SmartPortfolioReq)) {
            return false;
        }
        SmartPortfolioReq smartPortfolioReq = (SmartPortfolioReq) obj;
        return Intrinsics.EZpvd((Object) this.stgyName, (Object) smartPortfolioReq.stgyName) && Intrinsics.EZpvd(this.capitalList, smartPortfolioReq.capitalList) && Intrinsics.EZpvd(this.portfolioList, smartPortfolioReq.portfolioList) && Intrinsics.EZpvd((Object) this.balType, (Object) smartPortfolioReq.balType) && Intrinsics.EZpvd((Object) this.interval, (Object) smartPortfolioReq.interval) && Intrinsics.EZpvd((Object) this.deltaRatio, (Object) smartPortfolioReq.deltaRatio) && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) smartPortfolioReq.sourceAlgoId) && Intrinsics.EZpvd((Object) this.recommendId, (Object) smartPortfolioReq.recommendId) && Intrinsics.EZpvd((Object) this.initCapital, (Object) smartPortfolioReq.initCapital) && Intrinsics.EZpvd((Object) this.investType, (Object) smartPortfolioReq.investType) && Intrinsics.EZpvd((Object) this.quoteCcy, (Object) smartPortfolioReq.quoteCcy) && Intrinsics.EZpvd((Object) this.tdMode, (Object) smartPortfolioReq.tdMode) && Intrinsics.EZpvd((Object) this.quoteSz, (Object) smartPortfolioReq.quoteSz) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) smartPortfolioReq.tradeQuoteCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalType() {
        return this.balType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinAssetParam> getCapitalList() {
        return this.capitalList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeltaRatio() {
        return this.deltaRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitCapital() {
        return this.initCapital;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterval() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinRatioParam> getPortfolioList() {
        return this.portfolioList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCcy() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSz() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendId() {
        return this.recommendId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceAlgoId() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyName() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.stgyName;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<CoinAssetParam> list = this.capitalList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<CoinRatioParam> list2 = this.portfolioList;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        String str2 = this.balType;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.interval;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.deltaRatio;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.sourceAlgoId;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.recommendId;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.initCapital;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.investType;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.quoteCcy;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.tdMode;
        int iHashCode12 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.quoteSz;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.tradeQuoteCcy;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str12 != null ? str12.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalType(String str) {
        this.balType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCapitalList(List<CoinAssetParam> list) {
        this.capitalList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaRatio(String str) {
        this.deltaRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitCapital(String str) {
        this.initCapital = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterval(String str) {
        this.interval = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestType(String str) {
        this.investType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPortfolioList(List<CoinRatioParam> list) {
        this.portfolioList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCcy(String str) {
        this.quoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSz(String str) {
        this.quoteSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendId(String str) {
        this.recommendId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceAlgoId(String str) {
        this.sourceAlgoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyName(String str) {
        this.stgyName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(String str) {
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartPortfolioReq(stgyName=" + this.stgyName + ", capitalList=" + this.capitalList + ", portfolioList=" + this.portfolioList + ", balType=" + this.balType + ", interval=" + this.interval + ", deltaRatio=" + this.deltaRatio + ", sourceAlgoId=" + this.sourceAlgoId + ", recommendId=" + this.recommendId + ", initCapital=" + this.initCapital + ", investType=" + this.investType + ", quoteCcy=" + this.quoteCcy + ", tdMode=" + this.tdMode + ", quoteSz=" + this.quoteSz + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.stgyName);
        List<CoinAssetParam> list = this.capitalList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<CoinAssetParam> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<CoinRatioParam> list2 = this.portfolioList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<CoinRatioParam> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.balType);
        parcel.writeString(this.interval);
        parcel.writeString(this.deltaRatio);
        parcel.writeString(this.sourceAlgoId);
        parcel.writeString(this.recommendId);
        parcel.writeString(this.initCapital);
        parcel.writeString(this.investType);
        parcel.writeString(this.quoteCcy);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.quoteSz);
        parcel.writeString(this.tradeQuoteCcy);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SmartPortfolioReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartPortfolioReq> serializer() {
            return SmartPortfolioReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartPortfolioReq(int i, String str, List list, List list2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.stgyName = null;
        } else {
            this.stgyName = str;
        }
        if ((i & 2) == 0) {
            this.capitalList = null;
        } else {
            this.capitalList = list;
        }
        if ((i & 4) == 0) {
            this.portfolioList = null;
        } else {
            this.portfolioList = list2;
        }
        if ((i & 8) == 0) {
            this.balType = null;
        } else {
            this.balType = str2;
        }
        if ((i & 16) == 0) {
            this.interval = null;
        } else {
            this.interval = str3;
        }
        if ((i & 32) == 0) {
            this.deltaRatio = null;
        } else {
            this.deltaRatio = str4;
        }
        if ((i & 64) == 0) {
            this.sourceAlgoId = null;
        } else {
            this.sourceAlgoId = str5;
        }
        if ((i & 128) == 0) {
            this.recommendId = null;
        } else {
            this.recommendId = str6;
        }
        if ((i & 256) == 0) {
            this.initCapital = null;
        } else {
            this.initCapital = str7;
        }
        if ((i & 512) == 0) {
            this.investType = null;
        } else {
            this.investType = str8;
        }
        if ((i & 1024) == 0) {
            this.quoteCcy = null;
        } else {
            this.quoteCcy = str9;
        }
        if ((i & 2048) == 0) {
            this.tdMode = null;
        } else {
            this.tdMode = str10;
        }
        if ((i & 4096) == 0) {
            this.quoteSz = null;
        } else {
            this.quoteSz = str11;
        }
        if ((i & 8192) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SmartPortfolioReq smartPortfolioReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || smartPortfolioReq.stgyName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, smartPortfolioReq.stgyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || smartPortfolioReq.capitalList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], smartPortfolioReq.capitalList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || smartPortfolioReq.portfolioList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], smartPortfolioReq.portfolioList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || smartPortfolioReq.balType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, smartPortfolioReq.balType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || smartPortfolioReq.interval != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, smartPortfolioReq.interval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || smartPortfolioReq.deltaRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, smartPortfolioReq.deltaRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || smartPortfolioReq.sourceAlgoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, smartPortfolioReq.sourceAlgoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || smartPortfolioReq.recommendId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, smartPortfolioReq.recommendId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || smartPortfolioReq.initCapital != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, smartPortfolioReq.initCapital);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || smartPortfolioReq.investType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, smartPortfolioReq.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || smartPortfolioReq.quoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, smartPortfolioReq.quoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || smartPortfolioReq.tdMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, smartPortfolioReq.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || smartPortfolioReq.quoteSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, smartPortfolioReq.quoteSz);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && smartPortfolioReq.tradeQuoteCcy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, smartPortfolioReq.tradeQuoteCcy);
    }

    public SmartPortfolioReq(String str, List<CoinAssetParam> list, List<CoinRatioParam> list2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.stgyName = str;
        this.capitalList = list;
        this.portfolioList = list2;
        this.balType = str2;
        this.interval = str3;
        this.deltaRatio = str4;
        this.sourceAlgoId = str5;
        this.recommendId = str6;
        this.initCapital = str7;
        this.investType = str8;
        this.quoteCcy = str9;
        this.tdMode = str10;
        this.quoteSz = str11;
        this.tradeQuoteCcy = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0090: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0013: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.biz.CoinAssetParam>, java.util.List<com.okinc.unify_trade.biz.CoinRatioParam>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:126) call: com.okinc.unify_trade.biz.SmartPortfolioReq.<init>(java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SmartPortfolioReq(String str, List list, List list2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) == 0 ? str12 : null);
    }
}
