package com.okinc.planet.biz_onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.account.api.model.usercenter.EditProfileScenario;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OrbitEditProfileScenario implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_onboarding.OrbitEditProfileScenario.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OrbitEditProfileScenario(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract EditProfileScenario AEQbTJ();

    public abstract String KWHzl();

    public abstract String OLrzqt();

    public abstract String copydefault();

    private OrbitEditProfileScenario() {
    }

    public static final class OrbitOnboarding extends OrbitEditProfileScenario {
        public static final OrbitOnboarding AEQbTJ = new OrbitOnboarding();
        public static final Parcelable.Creator<OrbitOnboarding> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<OrbitOnboarding> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrbitOnboarding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return OrbitOnboarding.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrbitOnboarding[] newArray(int i) {
                return new OrbitOnboarding[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private OrbitOnboarding() {
            super(null);
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public EditProfileScenario AEQbTJ() {
            return EditProfileScenario.OrbitOnboarding.INSTANCE;
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public String copydefault() {
            return C33070mpX.AYXKKw(C47501trL.Fragment.AhwBna);
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public String KWHzl() {
            return C33070mpX.AYXKKw(C47501trL.Fragment.copydefault);
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public String OLrzqt() {
            return C33070mpX.AYXKKw(C47501trL.Fragment.values);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class OrbitSetting extends OrbitEditProfileScenario {
        public static final Parcelable.Creator<OrbitSetting> CREATOR = new Creator();
        public final boolean copydefault;

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Creator implements Parcelable.Creator<OrbitSetting> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrbitSetting createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new OrbitSetting(parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrbitSetting[] newArray(int i) {
                return new OrbitSetting[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OrbitSetting copy$default(OrbitSetting orbitSetting, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = orbitSetting.copydefault;
            }
            return orbitSetting.KWHzl(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OrbitSetting KWHzl(boolean z) {
            return new OrbitSetting(z);
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public String KWHzl() {
            return null;
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
            return (obj instanceof OrbitSetting) && this.copydefault == ((OrbitSetting) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OrbitSetting(showBio=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.copydefault ? 1 : 0);
        }

        public OrbitSetting(boolean z) {
            super(null);
            this.copydefault = z;
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public EditProfileScenario AEQbTJ() {
            return new EditProfileScenario.OrbitSetting(this.copydefault);
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public String copydefault() {
            return C33070mpX.AYXKKw(C47501trL.Fragment.AYXKKw);
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public String OLrzqt() {
            return C33070mpX.AYXKKw(C47501trL.Fragment.djBIcL);
        }
    }

    public static final class EnrollOrbiter extends OrbitEditProfileScenario {
        public static final EnrollOrbiter AEQbTJ = new EnrollOrbiter();
        public static final Parcelable.Creator<EnrollOrbiter> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<EnrollOrbiter> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EnrollOrbiter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return EnrollOrbiter.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EnrollOrbiter[] newArray(int i) {
                return new EnrollOrbiter[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private EnrollOrbiter() {
            super(null);
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public EditProfileScenario AEQbTJ() {
            return EditProfileScenario.EnrollOrbiter.INSTANCE;
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public String copydefault() {
            return C33070mpX.AYXKKw(C47501trL.Fragment.gEmmrt);
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public String KWHzl() {
            return C33070mpX.AYXKKw(C47501trL.Fragment.KWHzl);
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public String OLrzqt() {
            return C33070mpX.AYXKKw(C47501trL.Fragment.EZpvd);
        }
    }

    public static final class CompleteOrbiterProfile extends OrbitEditProfileScenario {
        public static final CompleteOrbiterProfile KWHzl = new CompleteOrbiterProfile();
        public static final Parcelable.Creator<CompleteOrbiterProfile> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<CompleteOrbiterProfile> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CompleteOrbiterProfile createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return CompleteOrbiterProfile.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CompleteOrbiterProfile[] newArray(int i) {
                return new CompleteOrbiterProfile[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private CompleteOrbiterProfile() {
            super(null);
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public EditProfileScenario AEQbTJ() {
            return EditProfileScenario.CompleteOrbiterProfile.INSTANCE;
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public String copydefault() {
            return C33070mpX.AYXKKw(C47501trL.Fragment.gEmmrt);
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public String KWHzl() {
            return C33070mpX.AYXKKw(C47501trL.Fragment.AEQbTJ);
        }

        @Override // com.okinc.planet.biz_onboarding.OrbitEditProfileScenario
        public String OLrzqt() {
            return C33070mpX.AYXKKw(C47501trL.Fragment.fIwbmz);
        }
    }
}
