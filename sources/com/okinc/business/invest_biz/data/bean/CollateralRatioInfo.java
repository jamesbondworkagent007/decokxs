package com.okinc.business.invest_biz.data.bean;

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
public final class CollateralRatioInfo implements Parcelable {
    public static final int $stable = 0;
    private final String collateralRatio;
    private final Integer collateralRatioLevel;
    private final Integer realCollateralLevel;
    private final String realCollateralRatio;
    private final String safeCollateralRatio;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CollateralRatioInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CollateralRatioInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollateralRatioInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CollateralRatioInfo(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollateralRatioInfo[] newArray(int i) {
            return new CollateralRatioInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CollateralRatioInfo() {
        this((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CollateralRatioInfo copy$default(CollateralRatioInfo collateralRatioInfo, String str, Integer num, String str2, Integer num2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = collateralRatioInfo.collateralRatio;
        }
        if ((i & 2) != 0) {
            num = collateralRatioInfo.collateralRatioLevel;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            str2 = collateralRatioInfo.realCollateralRatio;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            num2 = collateralRatioInfo.realCollateralLevel;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            str3 = collateralRatioInfo.safeCollateralRatio;
        }
        return collateralRatioInfo.copy(str, num3, str4, num4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.collateralRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.collateralRatioLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.realCollateralRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.realCollateralLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.safeCollateralRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollateralRatioInfo copy(String str, Integer num, String str2, Integer num2, String str3) {
        return new CollateralRatioInfo(str, num, str2, num2, str3);
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
        if (!(obj instanceof CollateralRatioInfo)) {
            return false;
        }
        CollateralRatioInfo collateralRatioInfo = (CollateralRatioInfo) obj;
        return Intrinsics.EZpvd((Object) this.collateralRatio, (Object) collateralRatioInfo.collateralRatio) && Intrinsics.EZpvd(this.collateralRatioLevel, collateralRatioInfo.collateralRatioLevel) && Intrinsics.EZpvd((Object) this.realCollateralRatio, (Object) collateralRatioInfo.realCollateralRatio) && Intrinsics.EZpvd(this.realCollateralLevel, collateralRatioInfo.realCollateralLevel) && Intrinsics.EZpvd((Object) this.safeCollateralRatio, (Object) collateralRatioInfo.safeCollateralRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollateralRatio() {
        return this.collateralRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCollateralRatioLevel() {
        return this.collateralRatioLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRealCollateralLevel() {
        return this.realCollateralLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealCollateralRatio() {
        return this.realCollateralRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafeCollateralRatio() {
        return this.safeCollateralRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.collateralRatio;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.collateralRatioLevel;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.realCollateralRatio;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.realCollateralLevel;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.safeCollateralRatio;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CollateralRatioInfo(collateralRatio=" + this.collateralRatio + ", collateralRatioLevel=" + this.collateralRatioLevel + ", realCollateralRatio=" + this.realCollateralRatio + ", realCollateralLevel=" + this.realCollateralLevel + ", safeCollateralRatio=" + this.safeCollateralRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.collateralRatio);
        Integer num = this.collateralRatioLevel;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.realCollateralRatio);
        Integer num2 = this.realCollateralLevel;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.safeCollateralRatio);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.CollateralRatioInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CollateralRatioInfo> serializer() {
            return CollateralRatioInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CollateralRatioInfo(int i, String str, Integer num, String str2, Integer num2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.collateralRatio = null;
        } else {
            this.collateralRatio = str;
        }
        if ((i & 2) == 0) {
            this.collateralRatioLevel = null;
        } else {
            this.collateralRatioLevel = num;
        }
        if ((i & 4) == 0) {
            this.realCollateralRatio = null;
        } else {
            this.realCollateralRatio = str2;
        }
        if ((i & 8) == 0) {
            this.realCollateralLevel = null;
        } else {
            this.realCollateralLevel = num2;
        }
        if ((i & 16) == 0) {
            this.safeCollateralRatio = null;
        } else {
            this.safeCollateralRatio = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(CollateralRatioInfo collateralRatioInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || collateralRatioInfo.collateralRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, collateralRatioInfo.collateralRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || collateralRatioInfo.collateralRatioLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, collateralRatioInfo.collateralRatioLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || collateralRatioInfo.realCollateralRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, collateralRatioInfo.realCollateralRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || collateralRatioInfo.realCollateralLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, collateralRatioInfo.realCollateralLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && collateralRatioInfo.safeCollateralRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, collateralRatioInfo.safeCollateralRatio);
    }

    public CollateralRatioInfo(String str, Integer num, String str2, Integer num2, String str3) {
        this.collateralRatio = str;
        this.collateralRatioLevel = num;
        this.realCollateralRatio = str2;
        this.realCollateralLevel = num2;
        this.safeCollateralRatio = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:379) call: com.okinc.business.invest_biz.data.bean.CollateralRatioInfo.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ CollateralRatioInfo(String str, Integer num, String str2, Integer num2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3);
    }

    public final boolean isHigh() {
        Integer num = this.collateralRatioLevel;
        return num != null && num.intValue() == 0;
    }

    public final boolean isLow() {
        Integer num = this.collateralRatioLevel;
        return num == null || num.intValue() != 0;
    }
}
