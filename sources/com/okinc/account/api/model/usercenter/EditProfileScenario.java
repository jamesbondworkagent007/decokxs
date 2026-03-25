package com.okinc.account.api.model.usercenter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EditProfileScenario implements Parcelable {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.usercenter.EditProfileScenario.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ EditProfileScenario(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getApiValue();

    private EditProfileScenario() {
    }

    public static final class UserCenter extends EditProfileScenario {
        public static final int $stable = 0;
        public static final UserCenter INSTANCE = new UserCenter();
        private static final String apiValue = "userCenter";
        public static final Parcelable.Creator<UserCenter> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<UserCenter> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserCenter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return UserCenter.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserCenter[] newArray(int i) {
                return new UserCenter[i];
            }
        }

        public static /* synthetic */ void getApiValue$annotations() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.account.api.model.usercenter.EditProfileScenario
        public String getApiValue() {
            return apiValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private UserCenter() {
            super(null);
        }
    }

    public static final class OrbitOnboarding extends EditProfileScenario {
        public static final int $stable = 0;
        public static final OrbitOnboarding INSTANCE = new OrbitOnboarding();
        private static final String apiValue = "orbitOnboarding";
        public static final Parcelable.Creator<OrbitOnboarding> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<OrbitOnboarding> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrbitOnboarding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return OrbitOnboarding.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrbitOnboarding[] newArray(int i) {
                return new OrbitOnboarding[i];
            }
        }

        public static /* synthetic */ void getApiValue$annotations() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.account.api.model.usercenter.EditProfileScenario
        public String getApiValue() {
            return apiValue;
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
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class OrbitSetting extends EditProfileScenario {
        public static final int $stable = 0;
        public static final Parcelable.Creator<OrbitSetting> CREATOR = new Creator();
        private final String apiValue;
        private final boolean showBio;

        /* JADX INFO: loaded from: classes17.dex */
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
                z = orbitSetting.showBio;
            }
            return orbitSetting.copy(z);
        }

        public static /* synthetic */ void getApiValue$annotations() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.showBio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OrbitSetting copy(boolean z) {
            return new OrbitSetting(z);
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
            return (obj instanceof OrbitSetting) && this.showBio == ((OrbitSetting) obj).showBio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.account.api.model.usercenter.EditProfileScenario
        public String getApiValue() {
            return this.apiValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getShowBio() {
            return this.showBio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Boolean.hashCode(this.showBio);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OrbitSetting(showBio=" + this.showBio + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.showBio ? 1 : 0);
        }

        public OrbitSetting(boolean z) {
            super(null);
            this.showBio = z;
            this.apiValue = "orbitSetting";
        }
    }

    public static final class EnrollOrbiter extends EditProfileScenario {
        public static final int $stable = 0;
        public static final EnrollOrbiter INSTANCE = new EnrollOrbiter();
        private static final String apiValue = "enrollOrbiter";
        public static final Parcelable.Creator<EnrollOrbiter> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<EnrollOrbiter> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EnrollOrbiter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return EnrollOrbiter.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EnrollOrbiter[] newArray(int i) {
                return new EnrollOrbiter[i];
            }
        }

        public static /* synthetic */ void getApiValue$annotations() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.account.api.model.usercenter.EditProfileScenario
        public String getApiValue() {
            return apiValue;
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
    }

    public static final class CompleteOrbiterProfile extends EditProfileScenario {
        public static final int $stable = 0;
        public static final CompleteOrbiterProfile INSTANCE = new CompleteOrbiterProfile();
        private static final String apiValue = "completeOrbiterProfile";
        public static final Parcelable.Creator<CompleteOrbiterProfile> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<CompleteOrbiterProfile> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CompleteOrbiterProfile createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return CompleteOrbiterProfile.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CompleteOrbiterProfile[] newArray(int i) {
                return new CompleteOrbiterProfile[i];
            }
        }

        public static /* synthetic */ void getApiValue$annotations() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.account.api.model.usercenter.EditProfileScenario
        public String getApiValue() {
            return apiValue;
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
    }
}
