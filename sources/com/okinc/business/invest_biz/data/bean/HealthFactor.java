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
public final class HealthFactor implements Parcelable {
    public static final int $stable = 0;
    private final HealthRateLevel level;
    private final String rate;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HealthFactor> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, HealthRateLevel.Companion.serializer()};

    public static final class Creator implements Parcelable.Creator<HealthFactor> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthFactor createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HealthFactor(parcel.readString(), HealthRateLevel.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthFactor[] newArray(int i) {
            return new HealthFactor[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HealthFactor() {
        this((String) null, (HealthRateLevel) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HealthFactor copy$default(HealthFactor healthFactor, String str, HealthRateLevel healthRateLevel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthFactor.rate;
        }
        if ((i & 2) != 0) {
            healthRateLevel = healthFactor.level;
        }
        return healthFactor.copy(str, healthRateLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthRateLevel component2() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthFactor copy(String str, @NotNull HealthRateLevel healthRateLevel) {
        Intrinsics.checkNotNullParameter(healthRateLevel, "");
        return new HealthFactor(str, healthRateLevel);
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
        if (!(obj instanceof HealthFactor)) {
            return false;
        }
        HealthFactor healthFactor = (HealthFactor) obj;
        return Intrinsics.EZpvd((Object) this.rate, (Object) healthFactor.rate) && this.level == healthFactor.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthRateLevel getLevel() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.rate;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.level.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HealthFactor(rate=" + this.rate + ", level=" + this.level + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.rate);
        parcel.writeString(this.level.name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.HealthFactor.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HealthFactor> serializer() {
            return HealthFactor$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HealthFactor(int i, String str, HealthRateLevel healthRateLevel, SerializationConstructorMarker serializationConstructorMarker) {
        this.rate = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.level = HealthRateLevel.Unknown;
        } else {
            this.level = healthRateLevel;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(HealthFactor healthFactor, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || healthFactor.rate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, healthFactor.rate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && healthFactor.level == HealthRateLevel.Unknown) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], healthFactor.level);
    }

    public HealthFactor(String str, @NotNull HealthRateLevel healthRateLevel) {
        Intrinsics.checkNotNullParameter(healthRateLevel, "");
        this.rate = str;
        this.level = healthRateLevel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.contants.HealthRateLevel:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.contants.HealthRateLevel:0x0009: SGET  A[WRAPPED] (LINE:418) com.okinc.business.invest_biz.data.contants.HealthRateLevel.Unknown com.okinc.business.invest_biz.data.contants.HealthRateLevel) : (r2v0 com.okinc.business.invest_biz.data.contants.HealthRateLevel))
 A[MD:(java.lang.String, com.okinc.business.invest_biz.data.contants.HealthRateLevel):void (m)] (LINE:416) call: com.okinc.business.invest_biz.data.bean.HealthFactor.<init>(java.lang.String, com.okinc.business.invest_biz.data.contants.HealthRateLevel):void type: THIS */
    public /* synthetic */ HealthFactor(String str, HealthRateLevel healthRateLevel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? HealthRateLevel.Unknown : healthRateLevel);
    }
}
