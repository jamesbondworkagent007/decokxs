package com.okinc.planet.biz_onboarding.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class OrbitOnboardingRestRequst implements Parcelable {
    public static final int $stable = 0;
    private final Integer hasVisitedOrbitGuide;
    private final Integer hasVisitedOrbitPopup;
    private final Integer orbitLevel;
    private final Integer orbitUpgradeType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OrbitOnboardingRestRequst> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OrbitOnboardingRestRequst> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrbitOnboardingRestRequst createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrbitOnboardingRestRequst(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrbitOnboardingRestRequst[] newArray(int i) {
            return new OrbitOnboardingRestRequst[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrbitOnboardingRestRequst copy$default(OrbitOnboardingRestRequst orbitOnboardingRestRequst, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = orbitOnboardingRestRequst.hasVisitedOrbitGuide;
        }
        if ((i & 2) != 0) {
            num2 = orbitOnboardingRestRequst.hasVisitedOrbitPopup;
        }
        if ((i & 4) != 0) {
            num3 = orbitOnboardingRestRequst.orbitLevel;
        }
        if ((i & 8) != 0) {
            num4 = orbitOnboardingRestRequst.orbitUpgradeType;
        }
        return orbitOnboardingRestRequst.copy(num, num2, num3, num4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.hasVisitedOrbitGuide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.hasVisitedOrbitPopup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.orbitLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.orbitUpgradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrbitOnboardingRestRequst copy(Integer num, Integer num2, Integer num3, Integer num4) {
        return new OrbitOnboardingRestRequst(num, num2, num3, num4);
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
        if (!(obj instanceof OrbitOnboardingRestRequst)) {
            return false;
        }
        OrbitOnboardingRestRequst orbitOnboardingRestRequst = (OrbitOnboardingRestRequst) obj;
        return Intrinsics.EZpvd(this.hasVisitedOrbitGuide, orbitOnboardingRestRequst.hasVisitedOrbitGuide) && Intrinsics.EZpvd(this.hasVisitedOrbitPopup, orbitOnboardingRestRequst.hasVisitedOrbitPopup) && Intrinsics.EZpvd(this.orbitLevel, orbitOnboardingRestRequst.orbitLevel) && Intrinsics.EZpvd(this.orbitUpgradeType, orbitOnboardingRestRequst.orbitUpgradeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHasVisitedOrbitGuide() {
        return this.hasVisitedOrbitGuide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHasVisitedOrbitPopup() {
        return this.hasVisitedOrbitPopup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrbitLevel() {
        return this.orbitLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrbitUpgradeType() {
        return this.orbitUpgradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.hasVisitedOrbitGuide;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.hasVisitedOrbitPopup;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.orbitLevel;
        int iHashCode3 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.orbitUpgradeType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num4 != null ? num4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrbitOnboardingRestRequst(hasVisitedOrbitGuide=" + this.hasVisitedOrbitGuide + ", hasVisitedOrbitPopup=" + this.hasVisitedOrbitPopup + ", orbitLevel=" + this.orbitLevel + ", orbitUpgradeType=" + this.orbitUpgradeType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.hasVisitedOrbitGuide;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.hasVisitedOrbitPopup;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.orbitLevel;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.orbitUpgradeType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_onboarding.data.OrbitOnboardingRestRequst.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrbitOnboardingRestRequst> serializer() {
            return OrbitOnboardingRestRequst$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrbitOnboardingRestRequst(int i, Integer num, Integer num2, Integer num3, Integer num4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, OrbitOnboardingRestRequst$$serializer.INSTANCE.getDescriptor());
        }
        this.hasVisitedOrbitGuide = num;
        this.hasVisitedOrbitPopup = num2;
        this.orbitLevel = num3;
        this.orbitUpgradeType = num4;
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(OrbitOnboardingRestRequst orbitOnboardingRestRequst, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, intSerializer, orbitOnboardingRestRequst.hasVisitedOrbitGuide);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, intSerializer, orbitOnboardingRestRequst.hasVisitedOrbitPopup);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, intSerializer, orbitOnboardingRestRequst.orbitLevel);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, intSerializer, orbitOnboardingRestRequst.orbitUpgradeType);
    }

    public OrbitOnboardingRestRequst(Integer num, Integer num2, Integer num3, Integer num4) {
        this.hasVisitedOrbitGuide = num;
        this.hasVisitedOrbitPopup = num2;
        this.orbitLevel = num3;
        this.orbitUpgradeType = num4;
    }
}
