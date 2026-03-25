package com.okinc.business.invest_biz.data.bean.response;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class HealthRate implements Parcelable {
    public static final int $stable = 0;
    public final HealthRateLevel level;
    public final String rate;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HealthRate> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {HealthRateLevel.Companion.serializer(), null};

    public static final class Creator implements Parcelable.Creator<HealthRate> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthRate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HealthRate(HealthRateLevel.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthRate[] newArray(int i) {
            return new HealthRate[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HealthRate() {
        this((HealthRateLevel) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HealthRate copy$default(HealthRate healthRate, HealthRateLevel healthRateLevel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            healthRateLevel = healthRate.level;
        }
        if ((i & 2) != 0) {
            str = healthRate.rate;
        }
        return healthRate.copydefault(healthRateLevel, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthRate copydefault(@NotNull HealthRateLevel healthRateLevel, @NotNull String str) {
        Intrinsics.checkNotNullParameter(healthRateLevel, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new HealthRate(healthRateLevel, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthRateLevel copydefault() {
        return this.level;
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
        if (!(obj instanceof HealthRate)) {
            return false;
        }
        HealthRate healthRate = (HealthRate) obj;
        return this.level == healthRate.level && Intrinsics.EZpvd((Object) this.rate, (Object) healthRate.rate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.level.hashCode() * 31) + this.rate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HealthRate(level=" + this.level + ", rate=" + this.rate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.level.name());
        parcel.writeString(this.rate);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.HealthRate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HealthRate> serializer() {
            return HealthRate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HealthRate(int i, HealthRateLevel healthRateLevel, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.level = (i & 1) == 0 ? HealthRateLevel.Unknown : healthRateLevel;
        if ((i & 2) == 0) {
            this.rate = "";
        } else {
            this.rate = str;
        }
    }

    public static final /* synthetic */ void copydefault(HealthRate healthRate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || healthRate.level != HealthRateLevel.Unknown) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], healthRate.level);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) healthRate.rate, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, healthRate.rate);
    }

    public HealthRate(@NotNull HealthRateLevel healthRateLevel, @NotNull String str) {
        Intrinsics.checkNotNullParameter(healthRateLevel, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.level = healthRateLevel;
        this.rate = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.contants.HealthRateLevel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.contants.HealthRateLevel:0x0004: SGET  A[WRAPPED] (LINE:213) com.okinc.business.invest_biz.data.contants.HealthRateLevel.Unknown com.okinc.business.invest_biz.data.contants.HealthRateLevel) : (r1v0 com.okinc.business.invest_biz.data.contants.HealthRateLevel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(com.okinc.business.invest_biz.data.contants.HealthRateLevel, java.lang.String):void (m)] (LINE:211) call: com.okinc.business.invest_biz.data.bean.response.HealthRate.<init>(com.okinc.business.invest_biz.data.contants.HealthRateLevel, java.lang.String):void type: THIS */
    public /* synthetic */ HealthRate(HealthRateLevel healthRateLevel, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HealthRateLevel.Unknown : healthRateLevel, (i & 2) != 0 ? "" : str);
    }
}
