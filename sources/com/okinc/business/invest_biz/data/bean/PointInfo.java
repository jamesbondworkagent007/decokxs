package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class PointInfo implements Parcelable {
    public static final int $stable = 0;
    public final String logo;
    public final String okPoints;
    public final String pointsName;
    public final String pointsValue;
    public final PointsValueType pointsValueType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PointInfo> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.bean.PointsValueType", PointsValueType.values(), new String[]{"1", "2", "3"}, new Annotation[][]{null, null, null}, null)};

    public static final class Creator implements Parcelable.Creator<PointInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PointInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PointInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), PointsValueType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PointInfo[] newArray(int i) {
            return new PointInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PointInfo() {
        this((String) null, (String) null, (String) null, (String) null, (PointsValueType) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PointInfo copy$default(PointInfo pointInfo, String str, String str2, String str3, String str4, PointsValueType pointsValueType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pointInfo.logo;
        }
        if ((i & 2) != 0) {
            str2 = pointInfo.okPoints;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = pointInfo.pointsName;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = pointInfo.pointsValue;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            pointsValueType = pointInfo.pointsValueType;
        }
        return pointInfo.AEQbTJ(str, str5, str6, str7, pointsValueType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointInfo AEQbTJ(String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull PointsValueType pointsValueType) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(pointsValueType, "");
        return new PointInfo(str, str2, str3, str4, pointsValueType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointsValueType AhwBna() {
        return this.pointsValueType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.pointsName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.pointsValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.okPoints;
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
        if (!(obj instanceof PointInfo)) {
            return false;
        }
        PointInfo pointInfo = (PointInfo) obj;
        return Intrinsics.EZpvd((Object) this.logo, (Object) pointInfo.logo) && Intrinsics.EZpvd((Object) this.okPoints, (Object) pointInfo.okPoints) && Intrinsics.EZpvd((Object) this.pointsName, (Object) pointInfo.pointsName) && Intrinsics.EZpvd((Object) this.pointsValue, (Object) pointInfo.pointsValue) && this.pointsValueType == pointInfo.pointsValueType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.logo;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.okPoints;
        return (((((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.pointsName.hashCode()) * 31) + this.pointsValue.hashCode()) * 31) + this.pointsValueType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PointInfo(logo=" + this.logo + ", okPoints=" + this.okPoints + ", pointsName=" + this.pointsName + ", pointsValue=" + this.pointsValue + ", pointsValueType=" + this.pointsValueType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.logo);
        parcel.writeString(this.okPoints);
        parcel.writeString(this.pointsName);
        parcel.writeString(this.pointsValue);
        parcel.writeString(this.pointsValueType.name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.PointInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PointInfo> serializer() {
            return PointInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PointInfo(int i, String str, String str2, String str3, String str4, PointsValueType pointsValueType, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.logo = null;
        } else {
            this.logo = str;
        }
        if ((i & 2) == 0) {
            this.okPoints = null;
        } else {
            this.okPoints = str2;
        }
        if ((i & 4) == 0) {
            this.pointsName = "";
        } else {
            this.pointsName = str3;
        }
        if ((i & 8) == 0) {
            this.pointsValue = "";
        } else {
            this.pointsValue = str4;
        }
        if ((i & 16) == 0) {
            this.pointsValueType = PointsValueType.TEXT;
        } else {
            this.pointsValueType = pointsValueType;
        }
    }

    public static final /* synthetic */ void AEQbTJ(PointInfo pointInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || pointInfo.logo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, pointInfo.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || pointInfo.okPoints != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, pointInfo.okPoints);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) pointInfo.pointsName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, pointInfo.pointsName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) pointInfo.pointsValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, pointInfo.pointsValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && pointInfo.pointsValueType == PointsValueType.TEXT) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], pointInfo.pointsValueType);
    }

    public PointInfo(String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull PointsValueType pointsValueType) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(pointsValueType, "");
        this.logo = str;
        this.okPoints = str2;
        this.pointsName = str3;
        this.pointsValue = str4;
        this.pointsValueType = pointsValueType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r5v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.PointsValueType:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.bean.PointsValueType:0x0022: SGET  A[WRAPPED] (LINE:579) com.okinc.business.invest_biz.data.bean.PointsValueType.TEXT com.okinc.business.invest_biz.data.bean.PointsValueType) : (r8v0 com.okinc.business.invest_biz.data.bean.PointsValueType))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.PointsValueType):void (m)] (LINE:569) call: com.okinc.business.invest_biz.data.bean.PointInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.PointsValueType):void type: THIS */
    public /* synthetic */ PointInfo(String str, String str2, String str3, String str4, PointsValueType pointsValueType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) == 0 ? str2 : null, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? PointsValueType.TEXT : pointsValueType);
    }
}
