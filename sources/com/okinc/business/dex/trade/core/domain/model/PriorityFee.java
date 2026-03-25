package com.okinc.business.dex.trade.core.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class PriorityFee implements Parcelable {
    public static final int $stable = 0;
    private final FeeInfo base;
    private final FeeInfo fastPriority;
    private final Boolean isDefault;
    private final FeeInfo marketPriority;
    private final String name;
    private final FeeInfo turboPriority;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PriorityFee> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PriorityFee> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriorityFee createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf = null;
            FeeInfo feeInfoCreateFromParcel = parcel.readInt() == 0 ? null : FeeInfo.CREATOR.createFromParcel(parcel);
            FeeInfo feeInfoCreateFromParcel2 = parcel.readInt() == 0 ? null : FeeInfo.CREATOR.createFromParcel(parcel);
            FeeInfo feeInfoCreateFromParcel3 = parcel.readInt() == 0 ? null : FeeInfo.CREATOR.createFromParcel(parcel);
            FeeInfo feeInfoCreateFromParcel4 = parcel.readInt() == 0 ? null : FeeInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PriorityFee(feeInfoCreateFromParcel, feeInfoCreateFromParcel2, feeInfoCreateFromParcel3, feeInfoCreateFromParcel4, boolValueOf, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriorityFee[] newArray(int i) {
            return new PriorityFee[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PriorityFee() {
        this((FeeInfo) null, (FeeInfo) null, (FeeInfo) null, (FeeInfo) null, (Boolean) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PriorityFee copy$default(PriorityFee priorityFee, FeeInfo feeInfo, FeeInfo feeInfo2, FeeInfo feeInfo3, FeeInfo feeInfo4, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            feeInfo = priorityFee.base;
        }
        if ((i & 2) != 0) {
            feeInfo2 = priorityFee.fastPriority;
        }
        FeeInfo feeInfo5 = feeInfo2;
        if ((i & 4) != 0) {
            feeInfo3 = priorityFee.marketPriority;
        }
        FeeInfo feeInfo6 = feeInfo3;
        if ((i & 8) != 0) {
            feeInfo4 = priorityFee.turboPriority;
        }
        FeeInfo feeInfo7 = feeInfo4;
        if ((i & 16) != 0) {
            bool = priorityFee.isDefault;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            str = priorityFee.name;
        }
        return priorityFee.copy(feeInfo, feeInfo5, feeInfo6, feeInfo7, bool2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeInfo component1() {
        return this.base;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeInfo component2() {
        return this.fastPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeInfo component3() {
        return this.marketPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeInfo component4() {
        return this.turboPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriorityFee copy(FeeInfo feeInfo, FeeInfo feeInfo2, FeeInfo feeInfo3, FeeInfo feeInfo4, Boolean bool, String str) {
        return new PriorityFee(feeInfo, feeInfo2, feeInfo3, feeInfo4, bool, str);
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
        if (!(obj instanceof PriorityFee)) {
            return false;
        }
        PriorityFee priorityFee = (PriorityFee) obj;
        return Intrinsics.EZpvd(this.base, priorityFee.base) && Intrinsics.EZpvd(this.fastPriority, priorityFee.fastPriority) && Intrinsics.EZpvd(this.marketPriority, priorityFee.marketPriority) && Intrinsics.EZpvd(this.turboPriority, priorityFee.turboPriority) && Intrinsics.EZpvd(this.isDefault, priorityFee.isDefault) && Intrinsics.EZpvd((Object) this.name, (Object) priorityFee.name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeInfo getBase() {
        return this.base;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeInfo getFastPriority() {
        return this.fastPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeInfo getMarketPriority() {
        return this.marketPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeInfo getTurboPriority() {
        return this.turboPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        FeeInfo feeInfo = this.base;
        int iHashCode = feeInfo == null ? 0 : feeInfo.hashCode();
        FeeInfo feeInfo2 = this.fastPriority;
        int iHashCode2 = feeInfo2 == null ? 0 : feeInfo2.hashCode();
        FeeInfo feeInfo3 = this.marketPriority;
        int iHashCode3 = feeInfo3 == null ? 0 : feeInfo3.hashCode();
        FeeInfo feeInfo4 = this.turboPriority;
        int iHashCode4 = feeInfo4 == null ? 0 : feeInfo4.hashCode();
        Boolean bool = this.isDefault;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        String str = this.name;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDefault() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriorityFee(base=" + this.base + ", fastPriority=" + this.fastPriority + ", marketPriority=" + this.marketPriority + ", turboPriority=" + this.turboPriority + ", isDefault=" + this.isDefault + ", name=" + this.name + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        FeeInfo feeInfo = this.base;
        if (feeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feeInfo.writeToParcel(parcel, i);
        }
        FeeInfo feeInfo2 = this.fastPriority;
        if (feeInfo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feeInfo2.writeToParcel(parcel, i);
        }
        FeeInfo feeInfo3 = this.marketPriority;
        if (feeInfo3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feeInfo3.writeToParcel(parcel, i);
        }
        FeeInfo feeInfo4 = this.turboPriority;
        if (feeInfo4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feeInfo4.writeToParcel(parcel, i);
        }
        Boolean bool = this.isDefault;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.name);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.PriorityFee.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriorityFee> serializer() {
            return PriorityFee$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriorityFee(int i, FeeInfo feeInfo, FeeInfo feeInfo2, FeeInfo feeInfo3, FeeInfo feeInfo4, Boolean bool, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.base = null;
        } else {
            this.base = feeInfo;
        }
        if ((i & 2) == 0) {
            this.fastPriority = null;
        } else {
            this.fastPriority = feeInfo2;
        }
        if ((i & 4) == 0) {
            this.marketPriority = null;
        } else {
            this.marketPriority = feeInfo3;
        }
        if ((i & 8) == 0) {
            this.turboPriority = null;
        } else {
            this.turboPriority = feeInfo4;
        }
        if ((i & 16) == 0) {
            this.isDefault = null;
        } else {
            this.isDefault = bool;
        }
        if ((i & 32) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PriorityFee priorityFee, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || priorityFee.base != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, FeeInfo$$serializer.INSTANCE, priorityFee.base);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || priorityFee.fastPriority != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, FeeInfo$$serializer.INSTANCE, priorityFee.fastPriority);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || priorityFee.marketPriority != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, FeeInfo$$serializer.INSTANCE, priorityFee.marketPriority);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || priorityFee.turboPriority != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, FeeInfo$$serializer.INSTANCE, priorityFee.turboPriority);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || priorityFee.isDefault != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, priorityFee.isDefault);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && priorityFee.name == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, priorityFee.name);
    }

    public PriorityFee(FeeInfo feeInfo, FeeInfo feeInfo2, FeeInfo feeInfo3, FeeInfo feeInfo4, Boolean bool, String str) {
        this.base = feeInfo;
        this.fastPriority = feeInfo2;
        this.marketPriority = feeInfo3;
        this.turboPriority = feeInfo4;
        this.isDefault = bool;
        this.name = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.core.domain.model.FeeInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.FeeInfo) : (r6v0 com.okinc.business.dex.trade.core.domain.model.FeeInfo))
  (wrap:com.okinc.business.dex.trade.core.domain.model.FeeInfo:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.FeeInfo) : (r7v0 com.okinc.business.dex.trade.core.domain.model.FeeInfo))
  (wrap:com.okinc.business.dex.trade.core.domain.model.FeeInfo:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.FeeInfo) : (r8v0 com.okinc.business.dex.trade.core.domain.model.FeeInfo))
  (wrap:com.okinc.business.dex.trade.core.domain.model.FeeInfo:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.FeeInfo) : (r9v0 com.okinc.business.dex.trade.core.domain.model.FeeInfo))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(com.okinc.business.dex.trade.core.domain.model.FeeInfo, com.okinc.business.dex.trade.core.domain.model.FeeInfo, com.okinc.business.dex.trade.core.domain.model.FeeInfo, com.okinc.business.dex.trade.core.domain.model.FeeInfo, java.lang.Boolean, java.lang.String):void (m)] (LINE:306) call: com.okinc.business.dex.trade.core.domain.model.PriorityFee.<init>(com.okinc.business.dex.trade.core.domain.model.FeeInfo, com.okinc.business.dex.trade.core.domain.model.FeeInfo, com.okinc.business.dex.trade.core.domain.model.FeeInfo, com.okinc.business.dex.trade.core.domain.model.FeeInfo, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ PriorityFee(FeeInfo feeInfo, FeeInfo feeInfo2, FeeInfo feeInfo3, FeeInfo feeInfo4, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : feeInfo, (i & 2) != 0 ? null : feeInfo2, (i & 4) != 0 ? null : feeInfo3, (i & 8) != 0 ? null : feeInfo4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str);
    }

    public final MevInfoBean toMevInfoBean() {
        FeeInfo feeInfo = this.base;
        String fee = feeInfo != null ? feeInfo.getFee() : null;
        String str = fee == null ? "" : fee;
        FeeInfo feeInfo2 = this.base;
        String feeUsd = feeInfo2 != null ? feeInfo2.getFeeUsd() : null;
        String str2 = feeUsd == null ? "" : feeUsd;
        FeeInfo feeInfo3 = this.fastPriority;
        String fee2 = feeInfo3 != null ? feeInfo3.getFee() : null;
        String str3 = fee2 == null ? "" : fee2;
        FeeInfo feeInfo4 = this.fastPriority;
        String feeUsd2 = feeInfo4 != null ? feeInfo4.getFeeUsd() : null;
        String str4 = feeUsd2 == null ? "" : feeUsd2;
        FeeInfo feeInfo5 = this.fastPriority;
        String feeUsd3 = feeInfo5 != null ? feeInfo5.getFeeUsd() : null;
        String str5 = feeUsd3 == null ? "" : feeUsd3;
        FeeInfo feeInfo6 = this.fastPriority;
        String fee3 = feeInfo6 != null ? feeInfo6.getFee() : null;
        String str6 = fee3 == null ? "" : fee3;
        Boolean bool = this.isDefault;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        FeeInfo feeInfo7 = this.marketPriority;
        String fee4 = feeInfo7 != null ? feeInfo7.getFee() : null;
        String str7 = fee4 == null ? "" : fee4;
        FeeInfo feeInfo8 = this.marketPriority;
        String feeUsd4 = feeInfo8 != null ? feeInfo8.getFeeUsd() : null;
        String str8 = feeUsd4 == null ? "" : feeUsd4;
        FeeInfo feeInfo9 = this.marketPriority;
        String feeUsd5 = feeInfo9 != null ? feeInfo9.getFeeUsd() : null;
        String str9 = feeUsd5 == null ? "" : feeUsd5;
        FeeInfo feeInfo10 = this.marketPriority;
        String fee5 = feeInfo10 != null ? feeInfo10.getFee() : null;
        String str10 = fee5 == null ? "" : fee5;
        String str11 = this.name;
        String str12 = str11 == null ? "" : str11;
        FeeInfo feeInfo11 = this.turboPriority;
        String fee6 = feeInfo11 != null ? feeInfo11.getFee() : null;
        String str13 = fee6 == null ? "" : fee6;
        FeeInfo feeInfo12 = this.turboPriority;
        String feeUsd6 = feeInfo12 != null ? feeInfo12.getFeeUsd() : null;
        String str14 = feeUsd6 == null ? "" : feeUsd6;
        FeeInfo feeInfo13 = this.turboPriority;
        String feeUsd7 = feeInfo13 != null ? feeInfo13.getFeeUsd() : null;
        String str15 = feeUsd7 == null ? "" : feeUsd7;
        FeeInfo feeInfo14 = this.turboPriority;
        String fee7 = feeInfo14 != null ? feeInfo14.getFee() : null;
        String str16 = fee7 == null ? "" : fee7;
        FeeInfo feeInfo15 = this.marketPriority;
        String fee8 = feeInfo15 != null ? feeInfo15.getFee() : null;
        String str17 = fee8 == null ? "" : fee8;
        FeeInfo feeInfo16 = this.fastPriority;
        String fee9 = feeInfo16 != null ? feeInfo16.getFee() : null;
        String str18 = fee9 == null ? "" : fee9;
        FeeInfo feeInfo17 = this.turboPriority;
        String fee10 = feeInfo17 != null ? feeInfo17.getFee() : null;
        String str19 = fee10 == null ? "" : fee10;
        FeeInfo feeInfo18 = this.base;
        String fee11 = feeInfo18 != null ? feeInfo18.getFee() : null;
        return new MevInfoBean(str, str2, str3, str4, str5, str6, zBooleanValue, str7, str8, str9, str10, str12, str13, str14, str15, str16, str17, str18, str19, fee11 == null ? "" : fee11);
    }

    public final NonMevPriorityFeeInfo toNonMevInfo() {
        FeeInfo feeInfo = this.base;
        String fee = feeInfo != null ? feeInfo.getFee() : null;
        String str = fee == null ? "" : fee;
        FeeInfo feeInfo2 = this.base;
        String feeUsd = feeInfo2 != null ? feeInfo2.getFeeUsd() : null;
        String str2 = feeUsd == null ? "" : feeUsd;
        FeeInfo feeInfo3 = this.fastPriority;
        String fee2 = feeInfo3 != null ? feeInfo3.getFee() : null;
        String str3 = fee2 == null ? "" : fee2;
        FeeInfo feeInfo4 = this.fastPriority;
        String feeUsd2 = feeInfo4 != null ? feeInfo4.getFeeUsd() : null;
        String str4 = feeUsd2 == null ? "" : feeUsd2;
        FeeInfo feeInfo5 = this.fastPriority;
        String feeUsd3 = feeInfo5 != null ? feeInfo5.getFeeUsd() : null;
        String str5 = feeUsd3 == null ? "" : feeUsd3;
        FeeInfo feeInfo6 = this.fastPriority;
        String fee3 = feeInfo6 != null ? feeInfo6.getFee() : null;
        String str6 = fee3 == null ? "" : fee3;
        FeeInfo feeInfo7 = this.marketPriority;
        String fee4 = feeInfo7 != null ? feeInfo7.getFee() : null;
        String str7 = fee4 == null ? "" : fee4;
        FeeInfo feeInfo8 = this.marketPriority;
        String feeUsd4 = feeInfo8 != null ? feeInfo8.getFeeUsd() : null;
        String str8 = feeUsd4 == null ? "" : feeUsd4;
        FeeInfo feeInfo9 = this.marketPriority;
        String feeUsd5 = feeInfo9 != null ? feeInfo9.getFeeUsd() : null;
        String str9 = feeUsd5 == null ? "" : feeUsd5;
        FeeInfo feeInfo10 = this.marketPriority;
        String fee5 = feeInfo10 != null ? feeInfo10.getFee() : null;
        String str10 = fee5 == null ? "" : fee5;
        FeeInfo feeInfo11 = this.turboPriority;
        String fee6 = feeInfo11 != null ? feeInfo11.getFee() : null;
        String str11 = fee6 == null ? "" : fee6;
        FeeInfo feeInfo12 = this.turboPriority;
        String feeUsd6 = feeInfo12 != null ? feeInfo12.getFeeUsd() : null;
        String str12 = feeUsd6 == null ? "" : feeUsd6;
        FeeInfo feeInfo13 = this.turboPriority;
        String feeUsd7 = feeInfo13 != null ? feeInfo13.getFeeUsd() : null;
        String str13 = feeUsd7 == null ? "" : feeUsd7;
        FeeInfo feeInfo14 = this.turboPriority;
        String fee7 = feeInfo14 != null ? feeInfo14.getFee() : null;
        String str14 = fee7 == null ? "" : fee7;
        FeeInfo feeInfo15 = this.marketPriority;
        String fee8 = feeInfo15 != null ? feeInfo15.getFee() : null;
        String str15 = fee8 == null ? "" : fee8;
        FeeInfo feeInfo16 = this.fastPriority;
        String fee9 = feeInfo16 != null ? feeInfo16.getFee() : null;
        String str16 = fee9 == null ? "" : fee9;
        FeeInfo feeInfo17 = this.turboPriority;
        String fee10 = feeInfo17 != null ? feeInfo17.getFee() : null;
        String str17 = fee10 == null ? "" : fee10;
        FeeInfo feeInfo18 = this.base;
        String fee11 = feeInfo18 != null ? feeInfo18.getFee() : null;
        return new NonMevPriorityFeeInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, fee11 == null ? "" : fee11);
    }
}
