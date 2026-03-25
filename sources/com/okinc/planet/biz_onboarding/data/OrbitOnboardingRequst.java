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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class OrbitOnboardingRequst implements Parcelable {
    public static final int $stable = 0;
    private final Integer hasVisitedOrbitGuide;
    private final Integer hasVisitedOrbitPopup;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OrbitOnboardingRequst> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<OrbitOnboardingRequst> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrbitOnboardingRequst createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrbitOnboardingRequst(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrbitOnboardingRequst[] newArray(int i) {
            return new OrbitOnboardingRequst[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrbitOnboardingRequst copy$default(OrbitOnboardingRequst orbitOnboardingRequst, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = orbitOnboardingRequst.hasVisitedOrbitGuide;
        }
        if ((i & 2) != 0) {
            num2 = orbitOnboardingRequst.hasVisitedOrbitPopup;
        }
        return orbitOnboardingRequst.copy(num, num2);
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
    public final OrbitOnboardingRequst copy(Integer num, Integer num2) {
        return new OrbitOnboardingRequst(num, num2);
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
        if (!(obj instanceof OrbitOnboardingRequst)) {
            return false;
        }
        OrbitOnboardingRequst orbitOnboardingRequst = (OrbitOnboardingRequst) obj;
        return Intrinsics.EZpvd(this.hasVisitedOrbitGuide, orbitOnboardingRequst.hasVisitedOrbitGuide) && Intrinsics.EZpvd(this.hasVisitedOrbitPopup, orbitOnboardingRequst.hasVisitedOrbitPopup);
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
    public int hashCode() {
        Integer num = this.hasVisitedOrbitGuide;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.hasVisitedOrbitPopup;
        return (iHashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrbitOnboardingRequst(hasVisitedOrbitGuide=" + this.hasVisitedOrbitGuide + ", hasVisitedOrbitPopup=" + this.hasVisitedOrbitPopup + ")";
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
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_onboarding.data.OrbitOnboardingRequst.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrbitOnboardingRequst> serializer() {
            return OrbitOnboardingRequst$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrbitOnboardingRequst(int i, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, OrbitOnboardingRequst$$serializer.INSTANCE.getDescriptor());
        }
        this.hasVisitedOrbitGuide = num;
        this.hasVisitedOrbitPopup = num2;
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(OrbitOnboardingRequst orbitOnboardingRequst, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, intSerializer, orbitOnboardingRequst.hasVisitedOrbitGuide);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, intSerializer, orbitOnboardingRequst.hasVisitedOrbitPopup);
    }

    public OrbitOnboardingRequst(Integer num, Integer num2) {
        this.hasVisitedOrbitGuide = num;
        this.hasVisitedOrbitPopup = num2;
    }
}
