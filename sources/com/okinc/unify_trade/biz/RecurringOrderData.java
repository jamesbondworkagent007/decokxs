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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class RecurringOrderData implements Parcelable {
    private String amt;
    private List<Integer> availableAccountList;
    private String investCcy;
    private String period;
    private String recurringDay;
    private String recurringHour;
    private List<CoinRatioParam> recurringList;
    private String recurringTime;
    private Integer recurringTimeType;
    private String sourceAlgoId;
    private String stgyName;
    private String tdMode;
    private String timeZone;
    private String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringOrderData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(CoinRatioParam$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<RecurringOrderData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringOrderData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList3.add(CoinRatioParam.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList4.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList2 = arrayList4;
            }
            return new RecurringOrderData(arrayList, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, arrayList2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringOrderData[] newArray(int i) {
            return new RecurringOrderData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringOrderData() {
        this((List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Integer) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinRatioParam> component1() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component13() {
        return this.availableAccountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.recurringTimeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.recurringDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.recurringTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.recurringHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.timeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringOrderData copy(List<CoinRatioParam> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<Integer> list2, Integer num) {
        return new RecurringOrderData(list, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list2, num);
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
        if (!(obj instanceof RecurringOrderData)) {
            return false;
        }
        RecurringOrderData recurringOrderData = (RecurringOrderData) obj;
        return Intrinsics.EZpvd(this.recurringList, recurringOrderData.recurringList) && Intrinsics.EZpvd((Object) this.stgyName, (Object) recurringOrderData.stgyName) && Intrinsics.EZpvd((Object) this.period, (Object) recurringOrderData.period) && Intrinsics.EZpvd((Object) this.recurringDay, (Object) recurringOrderData.recurringDay) && Intrinsics.EZpvd((Object) this.recurringTime, (Object) recurringOrderData.recurringTime) && Intrinsics.EZpvd((Object) this.recurringHour, (Object) recurringOrderData.recurringHour) && Intrinsics.EZpvd((Object) this.timeZone, (Object) recurringOrderData.timeZone) && Intrinsics.EZpvd((Object) this.amt, (Object) recurringOrderData.amt) && Intrinsics.EZpvd((Object) this.investCcy, (Object) recurringOrderData.investCcy) && Intrinsics.EZpvd((Object) this.tdMode, (Object) recurringOrderData.tdMode) && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) recurringOrderData.sourceAlgoId) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) recurringOrderData.tradeQuoteCcy) && Intrinsics.EZpvd(this.availableAccountList, recurringOrderData.availableAccountList) && Intrinsics.EZpvd(this.recurringTimeType, recurringOrderData.recurringTimeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getAvailableAccountList() {
        return this.availableAccountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestCcy() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringDay() {
        return this.recurringDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringHour() {
        return this.recurringHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinRatioParam> getRecurringList() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringTime() {
        return this.recurringTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRecurringTimeType() {
        return this.recurringTimeType;
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
    public final String getTimeZone() {
        return this.timeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<CoinRatioParam> list = this.recurringList;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.stgyName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.period;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.recurringDay;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.recurringTime;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.recurringHour;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.timeZone;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.amt;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.investCcy;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tdMode;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.sourceAlgoId;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.tradeQuoteCcy;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        List<Integer> list2 = this.availableAccountList;
        int iHashCode13 = list2 == null ? 0 : list2.hashCode();
        Integer num = this.recurringTimeType;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmt(String str) {
        this.amt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailableAccountList(List<Integer> list) {
        this.availableAccountList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestCcy(String str) {
        this.investCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPeriod(String str) {
        this.period = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringDay(String str) {
        this.recurringDay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringHour(String str) {
        this.recurringHour = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringList(List<CoinRatioParam> list) {
        this.recurringList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringTime(String str) {
        this.recurringTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringTimeType(Integer num) {
        this.recurringTimeType = num;
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
    public final void setTimeZone(String str) {
        this.timeZone = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringOrderData(recurringList=" + this.recurringList + ", stgyName=" + this.stgyName + ", period=" + this.period + ", recurringDay=" + this.recurringDay + ", recurringTime=" + this.recurringTime + ", recurringHour=" + this.recurringHour + ", timeZone=" + this.timeZone + ", amt=" + this.amt + ", investCcy=" + this.investCcy + ", tdMode=" + this.tdMode + ", sourceAlgoId=" + this.sourceAlgoId + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", availableAccountList=" + this.availableAccountList + ", recurringTimeType=" + this.recurringTimeType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<CoinRatioParam> list = this.recurringList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<CoinRatioParam> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.stgyName);
        parcel.writeString(this.period);
        parcel.writeString(this.recurringDay);
        parcel.writeString(this.recurringTime);
        parcel.writeString(this.recurringHour);
        parcel.writeString(this.timeZone);
        parcel.writeString(this.amt);
        parcel.writeString(this.investCcy);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.sourceAlgoId);
        parcel.writeString(this.tradeQuoteCcy);
        List<Integer> list2 = this.availableAccountList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Integer> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(it2.next().intValue());
            }
        }
        Integer num = this.recurringTimeType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RecurringOrderData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringOrderData> serializer() {
            return RecurringOrderData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringOrderData(int i, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list2, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.recurringList = null;
        } else {
            this.recurringList = list;
        }
        if ((i & 2) == 0) {
            this.stgyName = null;
        } else {
            this.stgyName = str;
        }
        if ((i & 4) == 0) {
            this.period = null;
        } else {
            this.period = str2;
        }
        if ((i & 8) == 0) {
            this.recurringDay = null;
        } else {
            this.recurringDay = str3;
        }
        if ((i & 16) == 0) {
            this.recurringTime = null;
        } else {
            this.recurringTime = str4;
        }
        if ((i & 32) == 0) {
            this.recurringHour = null;
        } else {
            this.recurringHour = str5;
        }
        if ((i & 64) == 0) {
            this.timeZone = null;
        } else {
            this.timeZone = str6;
        }
        if ((i & 128) == 0) {
            this.amt = null;
        } else {
            this.amt = str7;
        }
        if ((i & 256) == 0) {
            this.investCcy = null;
        } else {
            this.investCcy = str8;
        }
        if ((i & 512) == 0) {
            this.tdMode = null;
        } else {
            this.tdMode = str9;
        }
        if ((i & 1024) == 0) {
            this.sourceAlgoId = null;
        } else {
            this.sourceAlgoId = str10;
        }
        if ((i & 2048) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str11;
        }
        if ((i & 4096) == 0) {
            this.availableAccountList = null;
        } else {
            this.availableAccountList = list2;
        }
        if ((i & 8192) == 0) {
            this.recurringTimeType = null;
        } else {
            this.recurringTimeType = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RecurringOrderData recurringOrderData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || recurringOrderData.recurringList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], recurringOrderData.recurringList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || recurringOrderData.stgyName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, recurringOrderData.stgyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || recurringOrderData.period != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, recurringOrderData.period);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || recurringOrderData.recurringDay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, recurringOrderData.recurringDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || recurringOrderData.recurringTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, recurringOrderData.recurringTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || recurringOrderData.recurringHour != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, recurringOrderData.recurringHour);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || recurringOrderData.timeZone != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, recurringOrderData.timeZone);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || recurringOrderData.amt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, recurringOrderData.amt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || recurringOrderData.investCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, recurringOrderData.investCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || recurringOrderData.tdMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, recurringOrderData.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || recurringOrderData.sourceAlgoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, recurringOrderData.sourceAlgoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || recurringOrderData.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, recurringOrderData.tradeQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || recurringOrderData.availableAccountList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], recurringOrderData.availableAccountList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && recurringOrderData.recurringTimeType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, recurringOrderData.recurringTimeType);
    }

    public RecurringOrderData(List<CoinRatioParam> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<Integer> list2, Integer num) {
        this.recurringList = list;
        this.stgyName = str;
        this.period = str2;
        this.recurringDay = str3;
        this.recurringTime = str4;
        this.recurringHour = str5;
        this.timeZone = str6;
        this.amt = str7;
        this.investCcy = str8;
        this.tdMode = str9;
        this.sourceAlgoId = str10;
        this.tradeQuoteCcy = str11;
        this.availableAccountList = list2;
        this.recurringTimeType = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0090: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0063: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r28v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006b: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.CoinRatioParam>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, java.lang.Integer):void (m)] (LINE:11) call: com.okinc.unify_trade.biz.RecurringOrderData.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Integer):void type: THIS */
    public /* synthetic */ RecurringOrderData(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : list2, (i & 8192) == 0 ? num : null);
    }

    public final boolean isBuyNow() {
        Integer num = this.recurringTimeType;
        return num != null && num.intValue() == 2;
    }
}
