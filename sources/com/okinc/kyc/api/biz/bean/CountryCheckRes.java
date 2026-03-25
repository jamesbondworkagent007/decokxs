package com.okinc.kyc.api.biz.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CountryCheckRes implements Parcelable {
    public static final int $stable = 0;
    private final ForBidden cefi;
    private final ForBidden financialProduct;
    private final ForBidden jumpstart;
    private final ForBidden loan;
    private final ForBidden onChainDeFi;
    private final ForBidden onChainPosStaking;
    private final ForBidden register;
    private final ForBidden simpleEarn;
    private final ForBidden structuredEarn;
    private final ForBidden web3;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CountryCheckRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CountryCheckRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CountryCheckRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CountryCheckRes(parcel.readInt() == 0 ? null : ForBidden.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ForBidden.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ForBidden.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ForBidden.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ForBidden.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ForBidden.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ForBidden.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ForBidden.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ForBidden.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ForBidden.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CountryCheckRes[] newArray(int i) {
            return new CountryCheckRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CountryCheckRes() {
        this((ForBidden) null, (ForBidden) null, (ForBidden) null, (ForBidden) null, (ForBidden) null, (ForBidden) null, (ForBidden) null, (ForBidden) null, (ForBidden) null, (ForBidden) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden component1() {
        return this.cefi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden component10() {
        return this.jumpstart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden component2() {
        return this.web3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden component3() {
        return this.register;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden component4() {
        return this.financialProduct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden component5() {
        return this.simpleEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden component6() {
        return this.structuredEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden component7() {
        return this.onChainPosStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden component8() {
        return this.onChainDeFi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden component9() {
        return this.loan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CountryCheckRes copy(ForBidden forBidden, ForBidden forBidden2, ForBidden forBidden3, ForBidden forBidden4, ForBidden forBidden5, ForBidden forBidden6, ForBidden forBidden7, ForBidden forBidden8, ForBidden forBidden9, ForBidden forBidden10) {
        return new CountryCheckRes(forBidden, forBidden2, forBidden3, forBidden4, forBidden5, forBidden6, forBidden7, forBidden8, forBidden9, forBidden10);
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
        if (!(obj instanceof CountryCheckRes)) {
            return false;
        }
        CountryCheckRes countryCheckRes = (CountryCheckRes) obj;
        return Intrinsics.EZpvd(this.cefi, countryCheckRes.cefi) && Intrinsics.EZpvd(this.web3, countryCheckRes.web3) && Intrinsics.EZpvd(this.register, countryCheckRes.register) && Intrinsics.EZpvd(this.financialProduct, countryCheckRes.financialProduct) && Intrinsics.EZpvd(this.simpleEarn, countryCheckRes.simpleEarn) && Intrinsics.EZpvd(this.structuredEarn, countryCheckRes.structuredEarn) && Intrinsics.EZpvd(this.onChainPosStaking, countryCheckRes.onChainPosStaking) && Intrinsics.EZpvd(this.onChainDeFi, countryCheckRes.onChainDeFi) && Intrinsics.EZpvd(this.loan, countryCheckRes.loan) && Intrinsics.EZpvd(this.jumpstart, countryCheckRes.jumpstart);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden getCefi() {
        return this.cefi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden getFinancialProduct() {
        return this.financialProduct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden getJumpstart() {
        return this.jumpstart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden getLoan() {
        return this.loan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden getOnChainDeFi() {
        return this.onChainDeFi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden getOnChainPosStaking() {
        return this.onChainPosStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden getRegister() {
        return this.register;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden getSimpleEarn() {
        return this.simpleEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden getStructuredEarn() {
        return this.structuredEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden getWeb3() {
        return this.web3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ForBidden forBidden = this.cefi;
        int iHashCode = forBidden == null ? 0 : forBidden.hashCode();
        ForBidden forBidden2 = this.web3;
        int iHashCode2 = forBidden2 == null ? 0 : forBidden2.hashCode();
        ForBidden forBidden3 = this.register;
        int iHashCode3 = forBidden3 == null ? 0 : forBidden3.hashCode();
        ForBidden forBidden4 = this.financialProduct;
        int iHashCode4 = forBidden4 == null ? 0 : forBidden4.hashCode();
        ForBidden forBidden5 = this.simpleEarn;
        int iHashCode5 = forBidden5 == null ? 0 : forBidden5.hashCode();
        ForBidden forBidden6 = this.structuredEarn;
        int iHashCode6 = forBidden6 == null ? 0 : forBidden6.hashCode();
        ForBidden forBidden7 = this.onChainPosStaking;
        int iHashCode7 = forBidden7 == null ? 0 : forBidden7.hashCode();
        ForBidden forBidden8 = this.onChainDeFi;
        int iHashCode8 = forBidden8 == null ? 0 : forBidden8.hashCode();
        ForBidden forBidden9 = this.loan;
        int iHashCode9 = forBidden9 == null ? 0 : forBidden9.hashCode();
        ForBidden forBidden10 = this.jumpstart;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (forBidden10 != null ? forBidden10.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CountryCheckRes(cefi=" + this.cefi + ", web3=" + this.web3 + ", register=" + this.register + ", financialProduct=" + this.financialProduct + ", simpleEarn=" + this.simpleEarn + ", structuredEarn=" + this.structuredEarn + ", onChainPosStaking=" + this.onChainPosStaking + ", onChainDeFi=" + this.onChainDeFi + ", loan=" + this.loan + ", jumpstart=" + this.jumpstart + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ForBidden forBidden = this.cefi;
        if (forBidden == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            forBidden.writeToParcel(parcel, i);
        }
        ForBidden forBidden2 = this.web3;
        if (forBidden2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            forBidden2.writeToParcel(parcel, i);
        }
        ForBidden forBidden3 = this.register;
        if (forBidden3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            forBidden3.writeToParcel(parcel, i);
        }
        ForBidden forBidden4 = this.financialProduct;
        if (forBidden4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            forBidden4.writeToParcel(parcel, i);
        }
        ForBidden forBidden5 = this.simpleEarn;
        if (forBidden5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            forBidden5.writeToParcel(parcel, i);
        }
        ForBidden forBidden6 = this.structuredEarn;
        if (forBidden6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            forBidden6.writeToParcel(parcel, i);
        }
        ForBidden forBidden7 = this.onChainPosStaking;
        if (forBidden7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            forBidden7.writeToParcel(parcel, i);
        }
        ForBidden forBidden8 = this.onChainDeFi;
        if (forBidden8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            forBidden8.writeToParcel(parcel, i);
        }
        ForBidden forBidden9 = this.loan;
        if (forBidden9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            forBidden9.writeToParcel(parcel, i);
        }
        ForBidden forBidden10 = this.jumpstart;
        if (forBidden10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            forBidden10.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kyc.api.biz.bean.CountryCheckRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CountryCheckRes> serializer() {
            return CountryCheckRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CountryCheckRes(int i, ForBidden forBidden, ForBidden forBidden2, ForBidden forBidden3, ForBidden forBidden4, ForBidden forBidden5, ForBidden forBidden6, ForBidden forBidden7, ForBidden forBidden8, ForBidden forBidden9, ForBidden forBidden10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cefi = null;
        } else {
            this.cefi = forBidden;
        }
        if ((i & 2) == 0) {
            this.web3 = null;
        } else {
            this.web3 = forBidden2;
        }
        if ((i & 4) == 0) {
            this.register = null;
        } else {
            this.register = forBidden3;
        }
        if ((i & 8) == 0) {
            this.financialProduct = null;
        } else {
            this.financialProduct = forBidden4;
        }
        if ((i & 16) == 0) {
            this.simpleEarn = null;
        } else {
            this.simpleEarn = forBidden5;
        }
        if ((i & 32) == 0) {
            this.structuredEarn = null;
        } else {
            this.structuredEarn = forBidden6;
        }
        if ((i & 64) == 0) {
            this.onChainPosStaking = null;
        } else {
            this.onChainPosStaking = forBidden7;
        }
        if ((i & 128) == 0) {
            this.onChainDeFi = null;
        } else {
            this.onChainDeFi = forBidden8;
        }
        if ((i & 256) == 0) {
            this.loan = null;
        } else {
            this.loan = forBidden9;
        }
        if ((i & 512) == 0) {
            this.jumpstart = null;
        } else {
            this.jumpstart = forBidden10;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(CountryCheckRes countryCheckRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || countryCheckRes.cefi != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ForBidden$$serializer.INSTANCE, countryCheckRes.cefi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || countryCheckRes.web3 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ForBidden$$serializer.INSTANCE, countryCheckRes.web3);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || countryCheckRes.register != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, ForBidden$$serializer.INSTANCE, countryCheckRes.register);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || countryCheckRes.financialProduct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ForBidden$$serializer.INSTANCE, countryCheckRes.financialProduct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || countryCheckRes.simpleEarn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, ForBidden$$serializer.INSTANCE, countryCheckRes.simpleEarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || countryCheckRes.structuredEarn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, ForBidden$$serializer.INSTANCE, countryCheckRes.structuredEarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || countryCheckRes.onChainPosStaking != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, ForBidden$$serializer.INSTANCE, countryCheckRes.onChainPosStaking);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || countryCheckRes.onChainDeFi != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, ForBidden$$serializer.INSTANCE, countryCheckRes.onChainDeFi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || countryCheckRes.loan != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, ForBidden$$serializer.INSTANCE, countryCheckRes.loan);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && countryCheckRes.jumpstart == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, ForBidden$$serializer.INSTANCE, countryCheckRes.jumpstart);
    }

    public CountryCheckRes(ForBidden forBidden, ForBidden forBidden2, ForBidden forBidden3, ForBidden forBidden4, ForBidden forBidden5, ForBidden forBidden6, ForBidden forBidden7, ForBidden forBidden8, ForBidden forBidden9, ForBidden forBidden10) {
        this.cefi = forBidden;
        this.web3 = forBidden2;
        this.register = forBidden3;
        this.financialProduct = forBidden4;
        this.simpleEarn = forBidden5;
        this.structuredEarn = forBidden6;
        this.onChainPosStaking = forBidden7;
        this.onChainDeFi = forBidden8;
        this.loan = forBidden9;
        this.jumpstart = forBidden10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:com.okinc.kyc.api.biz.bean.ForBidden:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kyc.api.biz.bean.ForBidden) : (r12v0 com.okinc.kyc.api.biz.bean.ForBidden))
  (wrap:com.okinc.kyc.api.biz.bean.ForBidden:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kyc.api.biz.bean.ForBidden) : (r13v0 com.okinc.kyc.api.biz.bean.ForBidden))
  (wrap:com.okinc.kyc.api.biz.bean.ForBidden:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kyc.api.biz.bean.ForBidden) : (r14v0 com.okinc.kyc.api.biz.bean.ForBidden))
  (wrap:com.okinc.kyc.api.biz.bean.ForBidden:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kyc.api.biz.bean.ForBidden) : (r15v0 com.okinc.kyc.api.biz.bean.ForBidden))
  (wrap:com.okinc.kyc.api.biz.bean.ForBidden:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kyc.api.biz.bean.ForBidden) : (r16v0 com.okinc.kyc.api.biz.bean.ForBidden))
  (wrap:com.okinc.kyc.api.biz.bean.ForBidden:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kyc.api.biz.bean.ForBidden) : (r17v0 com.okinc.kyc.api.biz.bean.ForBidden))
  (wrap:com.okinc.kyc.api.biz.bean.ForBidden:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kyc.api.biz.bean.ForBidden) : (r18v0 com.okinc.kyc.api.biz.bean.ForBidden))
  (wrap:com.okinc.kyc.api.biz.bean.ForBidden:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kyc.api.biz.bean.ForBidden) : (r19v0 com.okinc.kyc.api.biz.bean.ForBidden))
  (wrap:com.okinc.kyc.api.biz.bean.ForBidden:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kyc.api.biz.bean.ForBidden) : (r20v0 com.okinc.kyc.api.biz.bean.ForBidden))
  (wrap:com.okinc.kyc.api.biz.bean.ForBidden:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 com.okinc.kyc.api.biz.bean.ForBidden) : (null com.okinc.kyc.api.biz.bean.ForBidden))
 A[MD:(com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden):void (m)] (LINE:14) call: com.okinc.kyc.api.biz.bean.CountryCheckRes.<init>(com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden, com.okinc.kyc.api.biz.bean.ForBidden):void type: THIS */
    public /* synthetic */ CountryCheckRes(ForBidden forBidden, ForBidden forBidden2, ForBidden forBidden3, ForBidden forBidden4, ForBidden forBidden5, ForBidden forBidden6, ForBidden forBidden7, ForBidden forBidden8, ForBidden forBidden9, ForBidden forBidden10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : forBidden, (i & 2) != 0 ? null : forBidden2, (i & 4) != 0 ? null : forBidden3, (i & 8) != 0 ? null : forBidden4, (i & 16) != 0 ? null : forBidden5, (i & 32) != 0 ? null : forBidden6, (i & 64) != 0 ? null : forBidden7, (i & 128) != 0 ? null : forBidden8, (i & 256) != 0 ? null : forBidden9, (i & 512) == 0 ? forBidden10 : null);
    }
}
