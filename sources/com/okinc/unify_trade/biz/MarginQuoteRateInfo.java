package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class MarginQuoteRateInfo implements Parcelable {
    public static final int $stable = 0;
    private final String baseDiscountRate;
    private final String baseRate;
    private final String instId;
    private final String nextDeductionTime;
    private final String nextInterestTime;
    private final String quoteDiscountRate;
    private final String quoteRate;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MarginQuoteRateInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<MarginQuoteRateInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginQuoteRateInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MarginQuoteRateInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginQuoteRateInfo[] newArray(int i) {
            return new MarginQuoteRateInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarginQuoteRateInfo copy$default(MarginQuoteRateInfo marginQuoteRateInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginQuoteRateInfo.instId;
        }
        if ((i & 2) != 0) {
            str2 = marginQuoteRateInfo.baseRate;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = marginQuoteRateInfo.baseDiscountRate;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = marginQuoteRateInfo.quoteRate;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = marginQuoteRateInfo.quoteDiscountRate;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = marginQuoteRateInfo.nextInterestTime;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = marginQuoteRateInfo.nextDeductionTime;
        }
        return marginQuoteRateInfo.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseDiscountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.quoteDiscountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nextInterestTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.nextDeductionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarginQuoteRateInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new MarginQuoteRateInfo(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof MarginQuoteRateInfo)) {
            return false;
        }
        MarginQuoteRateInfo marginQuoteRateInfo = (MarginQuoteRateInfo) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) marginQuoteRateInfo.instId) && Intrinsics.EZpvd((Object) this.baseRate, (Object) marginQuoteRateInfo.baseRate) && Intrinsics.EZpvd((Object) this.baseDiscountRate, (Object) marginQuoteRateInfo.baseDiscountRate) && Intrinsics.EZpvd((Object) this.quoteRate, (Object) marginQuoteRateInfo.quoteRate) && Intrinsics.EZpvd((Object) this.quoteDiscountRate, (Object) marginQuoteRateInfo.quoteDiscountRate) && Intrinsics.EZpvd((Object) this.nextInterestTime, (Object) marginQuoteRateInfo.nextInterestTime) && Intrinsics.EZpvd((Object) this.nextDeductionTime, (Object) marginQuoteRateInfo.nextDeductionTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseDiscountRate() {
        return this.baseDiscountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseRate() {
        return this.baseRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextDeductionTime() {
        return this.nextDeductionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextInterestTime() {
        return this.nextInterestTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteDiscountRate() {
        return this.quoteDiscountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteRate() {
        return this.quoteRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.baseRate;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.baseDiscountRate;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.quoteRate;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.quoteDiscountRate;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.nextInterestTime;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.nextDeductionTime;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarginQuoteRateInfo(instId=" + this.instId + ", baseRate=" + this.baseRate + ", baseDiscountRate=" + this.baseDiscountRate + ", quoteRate=" + this.quoteRate + ", quoteDiscountRate=" + this.quoteDiscountRate + ", nextInterestTime=" + this.nextInterestTime + ", nextDeductionTime=" + this.nextDeductionTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.baseRate);
        parcel.writeString(this.baseDiscountRate);
        parcel.writeString(this.quoteRate);
        parcel.writeString(this.quoteDiscountRate);
        parcel.writeString(this.nextInterestTime);
        parcel.writeString(this.nextDeductionTime);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MarginQuoteRateInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarginQuoteRateInfo> serializer() {
            return MarginQuoteRateInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarginQuoteRateInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, MarginQuoteRateInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.instId = str;
        this.baseRate = str2;
        this.baseDiscountRate = str3;
        this.quoteRate = str4;
        this.quoteDiscountRate = str5;
        this.nextInterestTime = str6;
        this.nextDeductionTime = str7;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MarginQuoteRateInfo marginQuoteRateInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, marginQuoteRateInfo.instId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, marginQuoteRateInfo.baseRate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, marginQuoteRateInfo.baseDiscountRate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, marginQuoteRateInfo.quoteRate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, marginQuoteRateInfo.quoteDiscountRate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, marginQuoteRateInfo.nextInterestTime);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, marginQuoteRateInfo.nextDeductionTime);
    }

    public MarginQuoteRateInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.instId = str;
        this.baseRate = str2;
        this.baseDiscountRate = str3;
        this.quoteRate = str4;
        this.quoteDiscountRate = str5;
        this.nextInterestTime = str6;
        this.nextDeductionTime = str7;
    }
}
