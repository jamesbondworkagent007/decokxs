package com.okinc.business.invest_biz.data.logic.ws.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestPoolV3 implements Parcelable {
    private boolean isSwaped;
    private Integer lowerTicker;
    private String positionStatus;
    private Integer upperTicker;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestPoolV3> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestPoolV3> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestPoolV3 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestPoolV3(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestPoolV3[] newArray(int i) {
            return new InvestPoolV3[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestPoolV3() {
        this((Integer) null, (Integer) null, (String) null, false, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestPoolV3 copy$default(InvestPoolV3 investPoolV3, Integer num, Integer num2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = investPoolV3.lowerTicker;
        }
        if ((i & 2) != 0) {
            num2 = investPoolV3.upperTicker;
        }
        if ((i & 4) != 0) {
            str = investPoolV3.positionStatus;
        }
        if ((i & 8) != 0) {
            z = investPoolV3.isSwaped;
        }
        return investPoolV3.copy(num, num2, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.lowerTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.upperTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.positionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isSwaped;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPoolV3 copy(Integer num, Integer num2, String str, boolean z) {
        return new InvestPoolV3(num, num2, str, z);
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
        if (!(obj instanceof InvestPoolV3)) {
            return false;
        }
        InvestPoolV3 investPoolV3 = (InvestPoolV3) obj;
        return Intrinsics.EZpvd(this.lowerTicker, investPoolV3.lowerTicker) && Intrinsics.EZpvd(this.upperTicker, investPoolV3.upperTicker) && Intrinsics.EZpvd((Object) this.positionStatus, (Object) investPoolV3.positionStatus) && this.isSwaped == investPoolV3.isSwaped;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLowerTicker() {
        return this.lowerTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPositionStatus() {
        return this.positionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getUpperTicker() {
        return this.upperTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.lowerTicker;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.upperTicker;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        String str = this.positionStatus;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSwaped);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSwaped() {
        return this.isSwaped;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLowerTicker(Integer num) {
        this.lowerTicker = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionStatus(String str) {
        this.positionStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwaped(boolean z) {
        this.isSwaped = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpperTicker(Integer num) {
        this.upperTicker = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestPoolV3(lowerTicker=" + this.lowerTicker + ", upperTicker=" + this.upperTicker + ", positionStatus=" + this.positionStatus + ", isSwaped=" + this.isSwaped + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.lowerTicker;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.upperTicker;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.positionStatus);
        parcel.writeInt(this.isSwaped ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestPoolV3> serializer() {
            return InvestPoolV3$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestPoolV3(int i, Integer num, Integer num2, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.lowerTicker = null;
        } else {
            this.lowerTicker = num;
        }
        if ((i & 2) == 0) {
            this.upperTicker = null;
        } else {
            this.upperTicker = num2;
        }
        if ((i & 4) == 0) {
            this.positionStatus = "";
        } else {
            this.positionStatus = str;
        }
        if ((i & 8) == 0) {
            this.isSwaped = false;
        } else {
            this.isSwaped = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestPoolV3 investPoolV3, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investPoolV3.lowerTicker != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, investPoolV3.lowerTicker);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investPoolV3.upperTicker != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, investPoolV3.upperTicker);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investPoolV3.positionStatus, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investPoolV3.positionStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investPoolV3.isSwaped) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, investPoolV3.isSwaped);
        }
    }

    public InvestPoolV3(Integer num, Integer num2, String str, boolean z) {
        this.lowerTicker = num;
        this.upperTicker = num2;
        this.positionStatus = str;
        this.isSwaped = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.String, boolean):void (m)] (LINE:51) call: com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ InvestPoolV3(Integer num, Integer num2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z);
    }
}
