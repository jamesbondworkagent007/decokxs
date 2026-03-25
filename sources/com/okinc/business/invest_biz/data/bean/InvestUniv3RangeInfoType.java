package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUniv3RangeInfoType implements Parcelable {
    public static final int $stable = 0;
    private final boolean isDefault;
    private final String offset;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestUniv3RangeInfoType> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUniv3RangeInfoType> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3RangeInfoType createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestUniv3RangeInfoType(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3RangeInfoType[] newArray(int i) {
            return new InvestUniv3RangeInfoType[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUniv3RangeInfoType() {
        this(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestUniv3RangeInfoType copy$default(InvestUniv3RangeInfoType investUniv3RangeInfoType, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = investUniv3RangeInfoType.isDefault;
        }
        if ((i & 2) != 0) {
            str = investUniv3RangeInfoType.offset;
        }
        if ((i & 4) != 0) {
            str2 = investUniv3RangeInfoType.type;
        }
        return investUniv3RangeInfoType.copy(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.offset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3RangeInfoType copy(boolean z, @NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InvestUniv3RangeInfoType(z, str, str2);
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
        if (!(obj instanceof InvestUniv3RangeInfoType)) {
            return false;
        }
        InvestUniv3RangeInfoType investUniv3RangeInfoType = (InvestUniv3RangeInfoType) obj;
        return this.isDefault == investUniv3RangeInfoType.isDefault && Intrinsics.EZpvd((Object) this.offset, (Object) investUniv3RangeInfoType.offset) && Intrinsics.EZpvd((Object) this.type, (Object) investUniv3RangeInfoType.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOffset() {
        return this.offset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isDefault);
        int iHashCode2 = this.offset.hashCode();
        String str = this.type;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDefault() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3RangeInfoType(isDefault=" + this.isDefault + ", offset=" + this.offset + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isDefault ? 1 : 0);
        parcel.writeString(this.offset);
        parcel.writeString(this.type);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUniv3RangeInfoType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3RangeInfoType> serializer() {
            return InvestUniv3RangeInfoType$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUniv3RangeInfoType(int i, boolean z, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.isDefault = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.offset = "";
        } else {
            this.offset = str;
        }
        if ((i & 4) == 0) {
            this.type = "";
        } else {
            this.type = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3RangeInfoType investUniv3RangeInfoType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUniv3RangeInfoType.isDefault) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, investUniv3RangeInfoType.isDefault);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investUniv3RangeInfoType.offset, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investUniv3RangeInfoType.offset);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) investUniv3RangeInfoType.type, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investUniv3RangeInfoType.type);
    }

    public InvestUniv3RangeInfoType(boolean z, @NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isDefault = z;
        this.offset = str;
        this.type = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String):void (m)] (LINE:146) call: com.okinc.business.invest_biz.data.bean.InvestUniv3RangeInfoType.<init>(boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestUniv3RangeInfoType(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
