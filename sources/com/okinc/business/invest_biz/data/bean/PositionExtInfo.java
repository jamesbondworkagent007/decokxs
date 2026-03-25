package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class PositionExtInfo implements Parcelable {
    public static final int $stable = 0;
    private final String key;
    private final String typeEnum;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PositionExtInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PositionExtInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionExtInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PositionExtInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionExtInfo[] newArray(int i) {
            return new PositionExtInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PositionExtInfo() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PositionExtInfo copy$default(PositionExtInfo positionExtInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionExtInfo.key;
        }
        if ((i & 2) != 0) {
            str2 = positionExtInfo.value;
        }
        if ((i & 4) != 0) {
            str3 = positionExtInfo.typeEnum;
        }
        return positionExtInfo.copy(str, str2, str3);
    }

    @SerialName(JwtUtilsKt.DID_METHOD_KEY)
    public static /* synthetic */ void getKey$annotations() {
    }

    @SerialName("typeEnum")
    public static /* synthetic */ void getTypeEnum$annotations() {
    }

    @SerialName("value")
    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.typeEnum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionExtInfo copy(String str, String str2, String str3) {
        return new PositionExtInfo(str, str2, str3);
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
        if (!(obj instanceof PositionExtInfo)) {
            return false;
        }
        PositionExtInfo positionExtInfo = (PositionExtInfo) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) positionExtInfo.key) && Intrinsics.EZpvd((Object) this.value, (Object) positionExtInfo.value) && Intrinsics.EZpvd((Object) this.typeEnum, (Object) positionExtInfo.typeEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeEnum() {
        return this.typeEnum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.key;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.value;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.typeEnum;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PositionExtInfo(key=" + this.key + ", value=" + this.value + ", typeEnum=" + this.typeEnum + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.value);
        parcel.writeString(this.typeEnum);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.PositionExtInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PositionExtInfo> serializer() {
            return PositionExtInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PositionExtInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.key = null;
        } else {
            this.key = str;
        }
        if ((i & 2) == 0) {
            this.value = null;
        } else {
            this.value = str2;
        }
        if ((i & 4) == 0) {
            this.typeEnum = null;
        } else {
            this.typeEnum = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(PositionExtInfo positionExtInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || positionExtInfo.key != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, positionExtInfo.key);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || positionExtInfo.value != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, positionExtInfo.value);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && positionExtInfo.typeEnum == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, positionExtInfo.typeEnum);
    }

    public PositionExtInfo(String str, String str2, String str3) {
        this.key = str;
        this.value = str2;
        this.typeEnum = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:395) call: com.okinc.business.invest_biz.data.bean.PositionExtInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PositionExtInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
