package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SignalBotSummaryBean implements Parcelable {
    public static final int $stable = 0;
    private final String accumulatedProfitSharing;
    private final String accumulatedSignalIncome;
    private final String accumulatedSubscriptionIncome;
    private final String ccy;
    private final String estimatedProfitSharing;
    private final String estimatedSubscriptionIncome;
    private final String freeFollowerCount;
    private final String freeSignalCount;
    private final String profitSharingFollowerCount;
    private final String profitSharingSignalCount;
    private final String subscriptionFollowerCount;
    private final String subscriptionSignalCount;
    private final String totalFollowerCount;
    private final String totalSignalCount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SignalBotSummaryBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SignalBotSummaryBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotSummaryBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalBotSummaryBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotSummaryBean[] newArray(int i) {
            return new SignalBotSummaryBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalBotSummaryBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accumulatedSignalIncome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.totalSignalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.subscriptionFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.subscriptionSignalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.totalFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.accumulatedSubscriptionIncome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accumulatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.estimatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.estimatedSubscriptionIncome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.freeFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.freeSignalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.profitSharingFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.profitSharingSignalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotSummaryBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        return new SignalBotSummaryBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
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
        if (!(obj instanceof SignalBotSummaryBean)) {
            return false;
        }
        SignalBotSummaryBean signalBotSummaryBean = (SignalBotSummaryBean) obj;
        return Intrinsics.EZpvd((Object) this.accumulatedSignalIncome, (Object) signalBotSummaryBean.accumulatedSignalIncome) && Intrinsics.EZpvd((Object) this.accumulatedProfitSharing, (Object) signalBotSummaryBean.accumulatedProfitSharing) && Intrinsics.EZpvd((Object) this.ccy, (Object) signalBotSummaryBean.ccy) && Intrinsics.EZpvd((Object) this.estimatedProfitSharing, (Object) signalBotSummaryBean.estimatedProfitSharing) && Intrinsics.EZpvd((Object) this.estimatedSubscriptionIncome, (Object) signalBotSummaryBean.estimatedSubscriptionIncome) && Intrinsics.EZpvd((Object) this.freeFollowerCount, (Object) signalBotSummaryBean.freeFollowerCount) && Intrinsics.EZpvd((Object) this.freeSignalCount, (Object) signalBotSummaryBean.freeSignalCount) && Intrinsics.EZpvd((Object) this.profitSharingFollowerCount, (Object) signalBotSummaryBean.profitSharingFollowerCount) && Intrinsics.EZpvd((Object) this.profitSharingSignalCount, (Object) signalBotSummaryBean.profitSharingSignalCount) && Intrinsics.EZpvd((Object) this.totalSignalCount, (Object) signalBotSummaryBean.totalSignalCount) && Intrinsics.EZpvd((Object) this.subscriptionFollowerCount, (Object) signalBotSummaryBean.subscriptionFollowerCount) && Intrinsics.EZpvd((Object) this.subscriptionSignalCount, (Object) signalBotSummaryBean.subscriptionSignalCount) && Intrinsics.EZpvd((Object) this.totalFollowerCount, (Object) signalBotSummaryBean.totalFollowerCount) && Intrinsics.EZpvd((Object) this.accumulatedSubscriptionIncome, (Object) signalBotSummaryBean.accumulatedSubscriptionIncome);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccumulatedProfitSharing() {
        return this.accumulatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccumulatedSignalIncome() {
        return this.accumulatedSignalIncome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccumulatedSubscriptionIncome() {
        return this.accumulatedSubscriptionIncome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedProfitSharing() {
        return this.estimatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedSubscriptionIncome() {
        return this.estimatedSubscriptionIncome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreeFollowerCount() {
        return this.freeFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreeSignalCount() {
        return this.freeSignalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingFollowerCount() {
        return this.profitSharingFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingSignalCount() {
        return this.profitSharingSignalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionFollowerCount() {
        return this.subscriptionFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionSignalCount() {
        return this.subscriptionSignalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFollowerCount() {
        return this.totalFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalSignalCount() {
        return this.totalSignalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accumulatedSignalIncome;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.accumulatedProfitSharing;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ccy;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.estimatedProfitSharing;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.estimatedSubscriptionIncome;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.freeFollowerCount;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.freeSignalCount;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.profitSharingFollowerCount;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.profitSharingSignalCount;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.totalSignalCount;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.subscriptionFollowerCount;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.subscriptionSignalCount;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.totalFollowerCount;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.accumulatedSubscriptionIncome;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str14 != null ? str14.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalBotSummaryBean(accumulatedSignalIncome=" + this.accumulatedSignalIncome + ", accumulatedProfitSharing=" + this.accumulatedProfitSharing + ", ccy=" + this.ccy + ", estimatedProfitSharing=" + this.estimatedProfitSharing + ", estimatedSubscriptionIncome=" + this.estimatedSubscriptionIncome + ", freeFollowerCount=" + this.freeFollowerCount + ", freeSignalCount=" + this.freeSignalCount + ", profitSharingFollowerCount=" + this.profitSharingFollowerCount + ", profitSharingSignalCount=" + this.profitSharingSignalCount + ", totalSignalCount=" + this.totalSignalCount + ", subscriptionFollowerCount=" + this.subscriptionFollowerCount + ", subscriptionSignalCount=" + this.subscriptionSignalCount + ", totalFollowerCount=" + this.totalFollowerCount + ", accumulatedSubscriptionIncome=" + this.accumulatedSubscriptionIncome + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accumulatedSignalIncome);
        parcel.writeString(this.accumulatedProfitSharing);
        parcel.writeString(this.ccy);
        parcel.writeString(this.estimatedProfitSharing);
        parcel.writeString(this.estimatedSubscriptionIncome);
        parcel.writeString(this.freeFollowerCount);
        parcel.writeString(this.freeSignalCount);
        parcel.writeString(this.profitSharingFollowerCount);
        parcel.writeString(this.profitSharingSignalCount);
        parcel.writeString(this.totalSignalCount);
        parcel.writeString(this.subscriptionFollowerCount);
        parcel.writeString(this.subscriptionSignalCount);
        parcel.writeString(this.totalFollowerCount);
        parcel.writeString(this.accumulatedSubscriptionIncome);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SignalBotSummaryBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalBotSummaryBean> serializer() {
            return SignalBotSummaryBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalBotSummaryBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accumulatedSignalIncome = null;
        } else {
            this.accumulatedSignalIncome = str;
        }
        if ((i & 2) == 0) {
            this.accumulatedProfitSharing = null;
        } else {
            this.accumulatedProfitSharing = str2;
        }
        if ((i & 4) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str3;
        }
        if ((i & 8) == 0) {
            this.estimatedProfitSharing = null;
        } else {
            this.estimatedProfitSharing = str4;
        }
        if ((i & 16) == 0) {
            this.estimatedSubscriptionIncome = null;
        } else {
            this.estimatedSubscriptionIncome = str5;
        }
        if ((i & 32) == 0) {
            this.freeFollowerCount = null;
        } else {
            this.freeFollowerCount = str6;
        }
        if ((i & 64) == 0) {
            this.freeSignalCount = null;
        } else {
            this.freeSignalCount = str7;
        }
        if ((i & 128) == 0) {
            this.profitSharingFollowerCount = null;
        } else {
            this.profitSharingFollowerCount = str8;
        }
        if ((i & 256) == 0) {
            this.profitSharingSignalCount = null;
        } else {
            this.profitSharingSignalCount = str9;
        }
        if ((i & 512) == 0) {
            this.totalSignalCount = null;
        } else {
            this.totalSignalCount = str10;
        }
        if ((i & 1024) == 0) {
            this.subscriptionFollowerCount = null;
        } else {
            this.subscriptionFollowerCount = str11;
        }
        if ((i & 2048) == 0) {
            this.subscriptionSignalCount = null;
        } else {
            this.subscriptionSignalCount = str12;
        }
        if ((i & 4096) == 0) {
            this.totalFollowerCount = null;
        } else {
            this.totalFollowerCount = str13;
        }
        if ((i & 8192) == 0) {
            this.accumulatedSubscriptionIncome = null;
        } else {
            this.accumulatedSubscriptionIncome = str14;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignalBotSummaryBean signalBotSummaryBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signalBotSummaryBean.accumulatedSignalIncome != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signalBotSummaryBean.accumulatedSignalIncome);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalBotSummaryBean.accumulatedProfitSharing != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signalBotSummaryBean.accumulatedProfitSharing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || signalBotSummaryBean.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signalBotSummaryBean.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signalBotSummaryBean.estimatedProfitSharing != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, signalBotSummaryBean.estimatedProfitSharing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || signalBotSummaryBean.estimatedSubscriptionIncome != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, signalBotSummaryBean.estimatedSubscriptionIncome);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || signalBotSummaryBean.freeFollowerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, signalBotSummaryBean.freeFollowerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || signalBotSummaryBean.freeSignalCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, signalBotSummaryBean.freeSignalCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || signalBotSummaryBean.profitSharingFollowerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, signalBotSummaryBean.profitSharingFollowerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || signalBotSummaryBean.profitSharingSignalCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, signalBotSummaryBean.profitSharingSignalCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || signalBotSummaryBean.totalSignalCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, signalBotSummaryBean.totalSignalCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || signalBotSummaryBean.subscriptionFollowerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, signalBotSummaryBean.subscriptionFollowerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || signalBotSummaryBean.subscriptionSignalCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, signalBotSummaryBean.subscriptionSignalCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || signalBotSummaryBean.totalFollowerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, signalBotSummaryBean.totalFollowerCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && signalBotSummaryBean.accumulatedSubscriptionIncome == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, signalBotSummaryBean.accumulatedSubscriptionIncome);
    }

    public SignalBotSummaryBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.accumulatedSignalIncome = str;
        this.accumulatedProfitSharing = str2;
        this.ccy = str3;
        this.estimatedProfitSharing = str4;
        this.estimatedSubscriptionIncome = str5;
        this.freeFollowerCount = str6;
        this.freeSignalCount = str7;
        this.profitSharingFollowerCount = str8;
        this.profitSharingSignalCount = str9;
        this.totalSignalCount = str10;
        this.subscriptionFollowerCount = str11;
        this.subscriptionSignalCount = str12;
        this.totalFollowerCount = str13;
        this.accumulatedSubscriptionIncome = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0090: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
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
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4045) call: com.okinc.unify_trade.biz.SignalBotSummaryBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignalBotSummaryBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) == 0 ? str14 : null);
    }
}
