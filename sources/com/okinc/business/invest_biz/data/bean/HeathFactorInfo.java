package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.contants.HealthRateLevel;
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
public final class HeathFactorInfo implements Parcelable {
    public static final int $stable = 0;
    private final HealthRateLevel healthLevel;
    private final String newHealthFactor;
    private final String oldHealthFactor;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HeathFactorInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, HealthRateLevel.Companion.serializer()};

    public static final class Creator implements Parcelable.Creator<HeathFactorInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HeathFactorInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HeathFactorInfo(parcel.readString(), parcel.readString(), HealthRateLevel.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HeathFactorInfo[] newArray(int i) {
            return new HeathFactorInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HeathFactorInfo() {
        this((String) null, (String) null, (HealthRateLevel) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HeathFactorInfo copy$default(HeathFactorInfo heathFactorInfo, String str, String str2, HealthRateLevel healthRateLevel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = heathFactorInfo.oldHealthFactor;
        }
        if ((i & 2) != 0) {
            str2 = heathFactorInfo.newHealthFactor;
        }
        if ((i & 4) != 0) {
            healthRateLevel = heathFactorInfo.healthLevel;
        }
        return heathFactorInfo.copy(str, str2, healthRateLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.oldHealthFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.newHealthFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthRateLevel component3() {
        return this.healthLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeathFactorInfo copy(String str, String str2, @NotNull HealthRateLevel healthRateLevel) {
        Intrinsics.checkNotNullParameter(healthRateLevel, "");
        return new HeathFactorInfo(str, str2, healthRateLevel);
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
        if (!(obj instanceof HeathFactorInfo)) {
            return false;
        }
        HeathFactorInfo heathFactorInfo = (HeathFactorInfo) obj;
        return Intrinsics.EZpvd((Object) this.oldHealthFactor, (Object) heathFactorInfo.oldHealthFactor) && Intrinsics.EZpvd((Object) this.newHealthFactor, (Object) heathFactorInfo.newHealthFactor) && this.healthLevel == heathFactorInfo.healthLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthRateLevel getHealthLevel() {
        return this.healthLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewHealthFactor() {
        return this.newHealthFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOldHealthFactor() {
        return this.oldHealthFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.oldHealthFactor;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.newHealthFactor;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.healthLevel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HeathFactorInfo(oldHealthFactor=" + this.oldHealthFactor + ", newHealthFactor=" + this.newHealthFactor + ", healthLevel=" + this.healthLevel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.oldHealthFactor);
        parcel.writeString(this.newHealthFactor);
        parcel.writeString(this.healthLevel.name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.HeathFactorInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HeathFactorInfo> serializer() {
            return HeathFactorInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HeathFactorInfo(int i, String str, String str2, HealthRateLevel healthRateLevel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.oldHealthFactor = null;
        } else {
            this.oldHealthFactor = str;
        }
        if ((i & 2) == 0) {
            this.newHealthFactor = null;
        } else {
            this.newHealthFactor = str2;
        }
        if ((i & 4) == 0) {
            this.healthLevel = HealthRateLevel.Unknown;
        } else {
            this.healthLevel = healthRateLevel;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(HeathFactorInfo heathFactorInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || heathFactorInfo.oldHealthFactor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, heathFactorInfo.oldHealthFactor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || heathFactorInfo.newHealthFactor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, heathFactorInfo.newHealthFactor);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && heathFactorInfo.healthLevel == HealthRateLevel.Unknown) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], heathFactorInfo.healthLevel);
    }

    public HeathFactorInfo(String str, String str2, @NotNull HealthRateLevel healthRateLevel) {
        Intrinsics.checkNotNullParameter(healthRateLevel, "");
        this.oldHealthFactor = str;
        this.newHealthFactor = str2;
        this.healthLevel = healthRateLevel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.contants.HealthRateLevel:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.contants.HealthRateLevel:0x000f: SGET  A[WRAPPED] (LINE:410) com.okinc.business.invest_biz.data.contants.HealthRateLevel.Unknown com.okinc.business.invest_biz.data.contants.HealthRateLevel) : (r4v0 com.okinc.business.invest_biz.data.contants.HealthRateLevel))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.contants.HealthRateLevel):void (m)] (LINE:407) call: com.okinc.business.invest_biz.data.bean.HeathFactorInfo.<init>(java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.contants.HealthRateLevel):void type: THIS */
    public /* synthetic */ HeathFactorInfo(String str, String str2, HealthRateLevel healthRateLevel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? HealthRateLevel.Unknown : healthRateLevel);
    }
}
