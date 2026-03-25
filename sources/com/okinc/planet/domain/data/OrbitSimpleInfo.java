package com.okinc.planet.domain.data;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OrbitSimpleInfo implements Parcelable {
    public static final int $stable = 0;
    private final String avatar;
    private final String joinTime;
    private final Integer orbitLevel;
    private final String petname;
    private final String userType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OrbitSimpleInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OrbitSimpleInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrbitSimpleInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrbitSimpleInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrbitSimpleInfo[] newArray(int i) {
            return new OrbitSimpleInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrbitSimpleInfo() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrbitSimpleInfo copy$default(OrbitSimpleInfo orbitSimpleInfo, Integer num, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = orbitSimpleInfo.orbitLevel;
        }
        if ((i & 2) != 0) {
            str = orbitSimpleInfo.userType;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = orbitSimpleInfo.avatar;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = orbitSimpleInfo.petname;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = orbitSimpleInfo.joinTime;
        }
        return orbitSimpleInfo.copy(num, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.orbitLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.petname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.joinTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrbitSimpleInfo copy(Integer num, String str, String str2, String str3, String str4) {
        return new OrbitSimpleInfo(num, str, str2, str3, str4);
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
        if (!(obj instanceof OrbitSimpleInfo)) {
            return false;
        }
        OrbitSimpleInfo orbitSimpleInfo = (OrbitSimpleInfo) obj;
        return Intrinsics.EZpvd(this.orbitLevel, orbitSimpleInfo.orbitLevel) && Intrinsics.EZpvd((Object) this.userType, (Object) orbitSimpleInfo.userType) && Intrinsics.EZpvd((Object) this.avatar, (Object) orbitSimpleInfo.avatar) && Intrinsics.EZpvd((Object) this.petname, (Object) orbitSimpleInfo.petname) && Intrinsics.EZpvd((Object) this.joinTime, (Object) orbitSimpleInfo.joinTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJoinTime() {
        return this.joinTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrbitLevel() {
        return this.orbitLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPetname() {
        return this.petname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserType() {
        return this.userType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.orbitLevel;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.userType;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.avatar;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.petname;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.joinTime;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrbitSimpleInfo(orbitLevel=" + this.orbitLevel + ", userType=" + this.userType + ", avatar=" + this.avatar + ", petname=" + this.petname + ", joinTime=" + this.joinTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.orbitLevel;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.userType);
        parcel.writeString(this.avatar);
        parcel.writeString(this.petname);
        parcel.writeString(this.joinTime);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.data.OrbitSimpleInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrbitSimpleInfo> serializer() {
            return OrbitSimpleInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrbitSimpleInfo(int i, Integer num, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        this.orbitLevel = (i & 1) == 0 ? -1 : num;
        if ((i & 2) == 0) {
            this.userType = "";
        } else {
            this.userType = str;
        }
        if ((i & 4) == 0) {
            this.avatar = "";
        } else {
            this.avatar = str2;
        }
        if ((i & 8) == 0) {
            this.petname = "";
        } else {
            this.petname = str3;
        }
        if ((i & 16) == 0) {
            this.joinTime = "";
        } else {
            this.joinTime = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(OrbitSimpleInfo orbitSimpleInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = orbitSimpleInfo.orbitLevel) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, orbitSimpleInfo.orbitLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) orbitSimpleInfo.userType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, orbitSimpleInfo.userType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orbitSimpleInfo.avatar, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, orbitSimpleInfo.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) orbitSimpleInfo.petname, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, orbitSimpleInfo.petname);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) orbitSimpleInfo.joinTime, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, orbitSimpleInfo.joinTime);
    }

    public OrbitSimpleInfo(Integer num, String str, String str2, String str3, String str4) {
        this.orbitLevel = num;
        this.userType = str;
        this.avatar = str2;
        this.petname = str3;
        this.joinTime = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.planet.domain.data.OrbitSimpleInfo.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OrbitSimpleInfo(Integer num, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "");
    }
}
