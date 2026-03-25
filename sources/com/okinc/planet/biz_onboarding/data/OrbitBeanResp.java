package com.okinc.planet.biz_onboarding.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OrbitBeanResp implements Parcelable {
    private final String balance;
    private Integer hasVisitedOrbitGuide;
    private Integer hasVisitedOrbitPopup;
    private final Boolean needBalanceVerification;
    private Integer orbitLevel;
    private final Integer orbitUpgradeType;
    private final Integer orbiterPlusDaysLeft;
    private Integer orbiterPlusExpireStatus;
    private final Long orbiterPlusExpireTime;
    private final Integer profileModified;
    private final String targetBalance;
    private final int vipLevel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrbitBeanResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OrbitBeanResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrbitBeanResp createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OrbitBeanResp(numValueOf, numValueOf2, numValueOf3, numValueOf4, string, string2, boolValueOf, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrbitBeanResp[] newArray(int i) {
            return new OrbitBeanResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrbitBeanResp() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (Boolean) null, (Long) null, (Integer) null, (Integer) null, 0, (Integer) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.hasVisitedOrbitGuide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.orbiterPlusDaysLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.profileModified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.orbitLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.hasVisitedOrbitPopup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.orbitUpgradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.targetBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.needBalanceVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.orbiterPlusExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.orbiterPlusExpireStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrbitBeanResp copy(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Boolean bool, Long l, Integer num5, Integer num6, int i, Integer num7) {
        return new OrbitBeanResp(num, num2, num3, num4, str, str2, bool, l, num5, num6, i, num7);
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
        if (!(obj instanceof OrbitBeanResp)) {
            return false;
        }
        OrbitBeanResp orbitBeanResp = (OrbitBeanResp) obj;
        return Intrinsics.EZpvd(this.hasVisitedOrbitGuide, orbitBeanResp.hasVisitedOrbitGuide) && Intrinsics.EZpvd(this.orbitLevel, orbitBeanResp.orbitLevel) && Intrinsics.EZpvd(this.hasVisitedOrbitPopup, orbitBeanResp.hasVisitedOrbitPopup) && Intrinsics.EZpvd(this.orbitUpgradeType, orbitBeanResp.orbitUpgradeType) && Intrinsics.EZpvd((Object) this.balance, (Object) orbitBeanResp.balance) && Intrinsics.EZpvd((Object) this.targetBalance, (Object) orbitBeanResp.targetBalance) && Intrinsics.EZpvd(this.needBalanceVerification, orbitBeanResp.needBalanceVerification) && Intrinsics.EZpvd(this.orbiterPlusExpireTime, orbitBeanResp.orbiterPlusExpireTime) && Intrinsics.EZpvd(this.orbiterPlusExpireStatus, orbitBeanResp.orbiterPlusExpireStatus) && Intrinsics.EZpvd(this.orbiterPlusDaysLeft, orbitBeanResp.orbiterPlusDaysLeft) && this.vipLevel == orbitBeanResp.vipLevel && Intrinsics.EZpvd(this.profileModified, orbitBeanResp.profileModified);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHasVisitedOrbitGuide() {
        return this.hasVisitedOrbitGuide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHasVisitedOrbitPopup() {
        return this.hasVisitedOrbitPopup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedBalanceVerification() {
        return this.needBalanceVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrbitLevel() {
        return this.orbitLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrbitUpgradeType() {
        return this.orbitUpgradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrbiterPlusDaysLeft() {
        return this.orbiterPlusDaysLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrbiterPlusExpireStatus() {
        return this.orbiterPlusExpireStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getOrbiterPlusExpireTime() {
        return this.orbiterPlusExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProfileModified() {
        return this.profileModified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetBalance() {
        return this.targetBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVipLevel() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.hasVisitedOrbitGuide;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.orbitLevel;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.hasVisitedOrbitPopup;
        int iHashCode3 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.orbitUpgradeType;
        int iHashCode4 = num4 == null ? 0 : num4.hashCode();
        String str = this.balance;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.targetBalance;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.needBalanceVerification;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        Long l = this.orbiterPlusExpireTime;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        Integer num5 = this.orbiterPlusExpireStatus;
        int iHashCode9 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.orbiterPlusDaysLeft;
        int iHashCode10 = num6 == null ? 0 : num6.hashCode();
        int iHashCode11 = Integer.hashCode(this.vipLevel);
        Integer num7 = this.profileModified;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (num7 != null ? num7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasVisitedOrbitGuide(Integer num) {
        this.hasVisitedOrbitGuide = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasVisitedOrbitPopup(Integer num) {
        this.hasVisitedOrbitPopup = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrbitLevel(Integer num) {
        this.orbitLevel = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrbiterPlusExpireStatus(Integer num) {
        this.orbiterPlusExpireStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrbitBeanResp(hasVisitedOrbitGuide=" + this.hasVisitedOrbitGuide + ", orbitLevel=" + this.orbitLevel + ", hasVisitedOrbitPopup=" + this.hasVisitedOrbitPopup + ", orbitUpgradeType=" + this.orbitUpgradeType + ", balance=" + this.balance + ", targetBalance=" + this.targetBalance + ", needBalanceVerification=" + this.needBalanceVerification + ", orbiterPlusExpireTime=" + this.orbiterPlusExpireTime + ", orbiterPlusExpireStatus=" + this.orbiterPlusExpireStatus + ", orbiterPlusDaysLeft=" + this.orbiterPlusDaysLeft + ", vipLevel=" + this.vipLevel + ", profileModified=" + this.profileModified + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.hasVisitedOrbitGuide;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.orbitLevel;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.hasVisitedOrbitPopup;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.orbitUpgradeType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.balance);
        parcel.writeString(this.targetBalance);
        Boolean bool = this.needBalanceVerification;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l = this.orbiterPlusExpireTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num5 = this.orbiterPlusExpireStatus;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.orbiterPlusDaysLeft;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeInt(this.vipLevel);
        Integer num7 = this.profileModified;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_onboarding.data.OrbitBeanResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrbitBeanResp> serializer() {
            return OrbitBeanResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrbitBeanResp(int i, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Boolean bool, Long l, Integer num5, Integer num6, int i2, Integer num7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.hasVisitedOrbitGuide = null;
        } else {
            this.hasVisitedOrbitGuide = num;
        }
        if ((i & 2) == 0) {
            this.orbitLevel = null;
        } else {
            this.orbitLevel = num2;
        }
        if ((i & 4) == 0) {
            this.hasVisitedOrbitPopup = null;
        } else {
            this.hasVisitedOrbitPopup = num3;
        }
        if ((i & 8) == 0) {
            this.orbitUpgradeType = null;
        } else {
            this.orbitUpgradeType = num4;
        }
        if ((i & 16) == 0) {
            this.balance = "";
        } else {
            this.balance = str;
        }
        if ((i & 32) == 0) {
            this.targetBalance = "";
        } else {
            this.targetBalance = str2;
        }
        if ((i & 64) == 0) {
            this.needBalanceVerification = Boolean.FALSE;
        } else {
            this.needBalanceVerification = bool;
        }
        if ((i & 128) == 0) {
            this.orbiterPlusExpireTime = null;
        } else {
            this.orbiterPlusExpireTime = l;
        }
        if ((i & 256) == 0) {
            this.orbiterPlusExpireStatus = null;
        } else {
            this.orbiterPlusExpireStatus = num5;
        }
        if ((i & 512) == 0) {
            this.orbiterPlusDaysLeft = null;
        } else {
            this.orbiterPlusDaysLeft = num6;
        }
        if ((i & 1024) == 0) {
            this.vipLevel = 0;
        } else {
            this.vipLevel = i2;
        }
        if ((i & 2048) == 0) {
            this.profileModified = 1;
        } else {
            this.profileModified = num7;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(OrbitBeanResp orbitBeanResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || orbitBeanResp.hasVisitedOrbitGuide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, orbitBeanResp.hasVisitedOrbitGuide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || orbitBeanResp.orbitLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, orbitBeanResp.orbitLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || orbitBeanResp.hasVisitedOrbitPopup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, orbitBeanResp.hasVisitedOrbitPopup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || orbitBeanResp.orbitUpgradeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, orbitBeanResp.orbitUpgradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) orbitBeanResp.balance, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, orbitBeanResp.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) orbitBeanResp.targetBalance, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, orbitBeanResp.targetBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(orbitBeanResp.needBalanceVerification, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, orbitBeanResp.needBalanceVerification);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || orbitBeanResp.orbiterPlusExpireTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, orbitBeanResp.orbiterPlusExpireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || orbitBeanResp.orbiterPlusExpireStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, orbitBeanResp.orbiterPlusExpireStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || orbitBeanResp.orbiterPlusDaysLeft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, orbitBeanResp.orbiterPlusDaysLeft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || orbitBeanResp.vipLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, orbitBeanResp.vipLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || (num = orbitBeanResp.profileModified) == null || num.intValue() != 1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, orbitBeanResp.profileModified);
        }
    }

    public OrbitBeanResp(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Boolean bool, Long l, Integer num5, Integer num6, int i, Integer num7) {
        this.hasVisitedOrbitGuide = num;
        this.orbitLevel = num2;
        this.hasVisitedOrbitPopup = num3;
        this.orbitUpgradeType = num4;
        this.balance = str;
        this.targetBalance = str2;
        this.needBalanceVerification = bool;
        this.orbiterPlusExpireTime = l;
        this.orbiterPlusExpireStatus = num5;
        this.orbiterPlusDaysLeft = num6;
        this.vipLevel = i;
        this.profileModified = num7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007c: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r25v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0031: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0035: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x003a: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r20v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0042: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r21v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004a: ARITH (r25v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0051: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0059: ARITH (r25v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r24v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long, java.lang.Integer, java.lang.Integer, int, java.lang.Integer):void (m)] (LINE:11) call: com.okinc.planet.biz_onboarding.data.OrbitBeanResp.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long, java.lang.Integer, java.lang.Integer, int, java.lang.Integer):void type: THIS */
    public /* synthetic */ OrbitBeanResp(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Boolean bool, Long l, Integer num5, Integer num6, int i, Integer num7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : num2, (i2 & 4) != 0 ? null : num3, (i2 & 8) != 0 ? null : num4, (i2 & 16) != 0 ? "" : str, (i2 & 32) == 0 ? str2 : "", (i2 & 64) != 0 ? Boolean.FALSE : bool, (i2 & 128) != 0 ? null : l, (i2 & 256) != 0 ? null : num5, (i2 & 512) == 0 ? num6 : null, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? 1 : num7);
    }
}
