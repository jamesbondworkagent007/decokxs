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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SimpleModeRepayDetailResp implements Parcelable {
    private final String coinUsdValue;
    private final String debtAmt;
    private final String debtCcy;
    private final String debtCcyAvailSz;
    private final String hourRates;
    private final String interestRate;
    private final String rateType;
    private final List<SimpleModeRepayInfo> repayData;
    private final Boolean sufficientRepayment;
    private final String yearRates;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimpleModeRepayDetailResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(SimpleModeRepayInfo$$serializer.INSTANCE), null, null, null, null};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SimpleModeRepayDetailResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleModeRepayDetailResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SimpleModeRepayInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new SimpleModeRepayDetailResp(string, string2, string3, string4, string5, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleModeRepayDetailResp[] newArray(int i) {
            return new SimpleModeRepayDetailResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleModeRepayDetailResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Boolean) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.debtAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.interestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.debtCcyAvailSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.coinUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimpleModeRepayInfo> component6() {
        return this.repayData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.sufficientRepayment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.hourRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleModeRepayDetailResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, List<SimpleModeRepayInfo> list, Boolean bool, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new SimpleModeRepayDetailResp(str, str2, str3, str4, str5, list, bool, str6, str7, str8);
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
        if (!(obj instanceof SimpleModeRepayDetailResp)) {
            return false;
        }
        SimpleModeRepayDetailResp simpleModeRepayDetailResp = (SimpleModeRepayDetailResp) obj;
        return Intrinsics.EZpvd((Object) this.debtAmt, (Object) simpleModeRepayDetailResp.debtAmt) && Intrinsics.EZpvd((Object) this.debtCcy, (Object) simpleModeRepayDetailResp.debtCcy) && Intrinsics.EZpvd((Object) this.interestRate, (Object) simpleModeRepayDetailResp.interestRate) && Intrinsics.EZpvd((Object) this.debtCcyAvailSz, (Object) simpleModeRepayDetailResp.debtCcyAvailSz) && Intrinsics.EZpvd((Object) this.coinUsdValue, (Object) simpleModeRepayDetailResp.coinUsdValue) && Intrinsics.EZpvd(this.repayData, simpleModeRepayDetailResp.repayData) && Intrinsics.EZpvd(this.sufficientRepayment, simpleModeRepayDetailResp.sufficientRepayment) && Intrinsics.EZpvd((Object) this.hourRates, (Object) simpleModeRepayDetailResp.hourRates) && Intrinsics.EZpvd((Object) this.yearRates, (Object) simpleModeRepayDetailResp.yearRates) && Intrinsics.EZpvd((Object) this.rateType, (Object) simpleModeRepayDetailResp.rateType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinUsdValue() {
        return this.coinUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDebtAmt() {
        return this.debtAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDebtCcy() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDebtCcyAvailSz() {
        return this.debtCcyAvailSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHourRates() {
        return this.hourRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterestRate() {
        return this.interestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimpleModeRepayInfo> getRepayData() {
        return this.repayData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSufficientRepayment() {
        return this.sufficientRepayment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYearRates() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.debtAmt.hashCode();
        int iHashCode2 = this.debtCcy.hashCode();
        int iHashCode3 = this.interestRate.hashCode();
        int iHashCode4 = this.debtCcyAvailSz.hashCode();
        int iHashCode5 = this.coinUsdValue.hashCode();
        List<SimpleModeRepayInfo> list = this.repayData;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        Boolean bool = this.sufficientRepayment;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.hourRates.hashCode()) * 31) + this.yearRates.hashCode()) * 31) + this.rateType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleModeRepayDetailResp(debtAmt=" + this.debtAmt + ", debtCcy=" + this.debtCcy + ", interestRate=" + this.interestRate + ", debtCcyAvailSz=" + this.debtCcyAvailSz + ", coinUsdValue=" + this.coinUsdValue + ", repayData=" + this.repayData + ", sufficientRepayment=" + this.sufficientRepayment + ", hourRates=" + this.hourRates + ", yearRates=" + this.yearRates + ", rateType=" + this.rateType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.debtAmt);
        parcel.writeString(this.debtCcy);
        parcel.writeString(this.interestRate);
        parcel.writeString(this.debtCcyAvailSz);
        parcel.writeString(this.coinUsdValue);
        List<SimpleModeRepayInfo> list = this.repayData;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SimpleModeRepayInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.sufficientRepayment;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.hourRates);
        parcel.writeString(this.yearRates);
        parcel.writeString(this.rateType);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SimpleModeRepayDetailResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimpleModeRepayDetailResp> serializer() {
            return SimpleModeRepayDetailResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleModeRepayDetailResp(int i, String str, String str2, String str3, String str4, String str5, List list, Boolean bool, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.debtAmt = "";
        } else {
            this.debtAmt = str;
        }
        if ((i & 2) == 0) {
            this.debtCcy = "";
        } else {
            this.debtCcy = str2;
        }
        if ((i & 4) == 0) {
            this.interestRate = "";
        } else {
            this.interestRate = str3;
        }
        if ((i & 8) == 0) {
            this.debtCcyAvailSz = "";
        } else {
            this.debtCcyAvailSz = str4;
        }
        if ((i & 16) == 0) {
            this.coinUsdValue = "";
        } else {
            this.coinUsdValue = str5;
        }
        if ((i & 32) == 0) {
            this.repayData = null;
        } else {
            this.repayData = list;
        }
        if ((i & 64) == 0) {
            this.sufficientRepayment = Boolean.FALSE;
        } else {
            this.sufficientRepayment = bool;
        }
        if ((i & 128) == 0) {
            this.hourRates = "";
        } else {
            this.hourRates = str6;
        }
        if ((i & 256) == 0) {
            this.yearRates = "";
        } else {
            this.yearRates = str7;
        }
        if ((i & 512) == 0) {
            this.rateType = "";
        } else {
            this.rateType = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SimpleModeRepayDetailResp simpleModeRepayDetailResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) simpleModeRepayDetailResp.debtAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, simpleModeRepayDetailResp.debtAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) simpleModeRepayDetailResp.debtCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, simpleModeRepayDetailResp.debtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) simpleModeRepayDetailResp.interestRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, simpleModeRepayDetailResp.interestRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) simpleModeRepayDetailResp.debtCcyAvailSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, simpleModeRepayDetailResp.debtCcyAvailSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) simpleModeRepayDetailResp.coinUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, simpleModeRepayDetailResp.coinUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || simpleModeRepayDetailResp.repayData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], simpleModeRepayDetailResp.repayData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(simpleModeRepayDetailResp.sufficientRepayment, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, simpleModeRepayDetailResp.sufficientRepayment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) simpleModeRepayDetailResp.hourRates, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, simpleModeRepayDetailResp.hourRates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) simpleModeRepayDetailResp.yearRates, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, simpleModeRepayDetailResp.yearRates);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) simpleModeRepayDetailResp.rateType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, simpleModeRepayDetailResp.rateType);
    }

    public SimpleModeRepayDetailResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, List<SimpleModeRepayInfo> list, Boolean bool, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.debtAmt = str;
        this.debtCcy = str2;
        this.interestRate = str3;
        this.debtCcyAvailSz = str4;
        this.coinUsdValue = str5;
        this.repayData = list;
        this.sufficientRepayment = bool;
        this.hourRates = str6;
        this.yearRates = str7;
        this.rateType = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0062: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.SimpleModeRepayInfo>, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5033) call: com.okinc.unify_trade.biz.SimpleModeRepayDetailResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SimpleModeRepayDetailResp(String str, String str2, String str3, String str4, String str5, List list, Boolean bool, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : list, (i & 64) != 0 ? Boolean.FALSE : bool, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) == 0 ? str8 : "");
    }

    public final String getRateByType() {
        String str = this.rateType;
        return Intrinsics.EZpvd((Object) str, (Object) "hour") ? this.hourRates : Intrinsics.EZpvd((Object) str, (Object) "year") ? this.yearRates : this.interestRate;
    }
}
