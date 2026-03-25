package com.okinc.tradingbot.impl.dto;

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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class ArbFundingFeeVo implements Parcelable {
    public static final int $stable = 0;
    public final String apy;
    public final String arbPnl;
    public final long arbTime;
    public final String billId;
    public final String displayMsg;
    public final String fundingFeeRatio;
    public final boolean isPredicted;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ArbFundingFeeVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ArbFundingFeeVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbFundingFeeVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ArbFundingFeeVo(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbFundingFeeVo[] newArray(int i) {
            return new ArbFundingFeeVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArbFundingFeeVo() {
        this((String) null, 0L, (String) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.displayMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.isPredicted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.arbTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbFundingFeeVo EZpvd(String str, long j, String str2, String str3, String str4, String str5, boolean z) {
        return new ArbFundingFeeVo(str, j, str2, str3, str4, str5, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.fundingFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.arbPnl;
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
        if (!(obj instanceof ArbFundingFeeVo)) {
            return false;
        }
        ArbFundingFeeVo arbFundingFeeVo = (ArbFundingFeeVo) obj;
        return Intrinsics.EZpvd((Object) this.billId, (Object) arbFundingFeeVo.billId) && this.arbTime == arbFundingFeeVo.arbTime && Intrinsics.EZpvd((Object) this.apy, (Object) arbFundingFeeVo.apy) && Intrinsics.EZpvd((Object) this.fundingFeeRatio, (Object) arbFundingFeeVo.fundingFeeRatio) && Intrinsics.EZpvd((Object) this.arbPnl, (Object) arbFundingFeeVo.arbPnl) && Intrinsics.EZpvd((Object) this.displayMsg, (Object) arbFundingFeeVo.displayMsg) && this.isPredicted == arbFundingFeeVo.isPredicted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.billId;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Long.hashCode(this.arbTime);
        String str2 = this.apy;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fundingFeeRatio;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.arbPnl;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.displayMsg;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPredicted);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbFundingFeeVo(billId=" + this.billId + ", arbTime=" + this.arbTime + ", apy=" + this.apy + ", fundingFeeRatio=" + this.fundingFeeRatio + ", arbPnl=" + this.arbPnl + ", displayMsg=" + this.displayMsg + ", isPredicted=" + this.isPredicted + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.billId);
        parcel.writeLong(this.arbTime);
        parcel.writeString(this.apy);
        parcel.writeString(this.fundingFeeRatio);
        parcel.writeString(this.arbPnl);
        parcel.writeString(this.displayMsg);
        parcel.writeInt(this.isPredicted ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.ArbFundingFeeVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbFundingFeeVo> serializer() {
            return ArbFundingFeeVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArbFundingFeeVo(int i, String str, long j, String str2, String str3, String str4, String str5, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.billId = null;
        } else {
            this.billId = str;
        }
        if ((i & 2) == 0) {
            this.arbTime = 0L;
        } else {
            this.arbTime = j;
        }
        if ((i & 4) == 0) {
            this.apy = null;
        } else {
            this.apy = str2;
        }
        if ((i & 8) == 0) {
            this.fundingFeeRatio = null;
        } else {
            this.fundingFeeRatio = str3;
        }
        if ((i & 16) == 0) {
            this.arbPnl = null;
        } else {
            this.arbPnl = str4;
        }
        if ((i & 32) == 0) {
            this.displayMsg = null;
        } else {
            this.displayMsg = str5;
        }
        if ((i & 64) == 0) {
            this.isPredicted = false;
        } else {
            this.isPredicted = z;
        }
    }

    public static final /* synthetic */ void copydefault(ArbFundingFeeVo arbFundingFeeVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbFundingFeeVo.billId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, arbFundingFeeVo.billId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || arbFundingFeeVo.arbTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, arbFundingFeeVo.arbTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || arbFundingFeeVo.apy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, arbFundingFeeVo.apy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || arbFundingFeeVo.fundingFeeRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, arbFundingFeeVo.fundingFeeRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || arbFundingFeeVo.arbPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, arbFundingFeeVo.arbPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || arbFundingFeeVo.displayMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, arbFundingFeeVo.displayMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || arbFundingFeeVo.isPredicted) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, arbFundingFeeVo.isPredicted);
        }
    }

    public ArbFundingFeeVo(String str, long j, String str2, String str3, String str4, String str5, boolean z) {
        this.billId = str;
        this.arbTime = j;
        this.apy = str2;
        this.fundingFeeRatio = str3;
        this.arbPnl = str4;
        this.displayMsg = str5;
        this.isPredicted = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r17v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:9) call: com.okinc.tradingbot.impl.dto.ArbFundingFeeVo.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ ArbFundingFeeVo(String str, long j, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? str5 : null, (i & 64) != 0 ? false : z);
    }
}
