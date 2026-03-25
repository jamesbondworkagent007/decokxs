package com.okinc.account.api.model.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.preference.data.model.meta.PromotionDisplayType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public abstract class LoginLandingType implements Parcelable {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.LoginLandingType.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LoginLandingType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LoginLandingType() {
    }

    public static final class SecuritySetting extends LoginLandingType implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SecuritySetting> CREATOR = new Creator();
        private final String routePage;

        public static final class Creator implements Parcelable.Creator<SecuritySetting> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SecuritySetting createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SecuritySetting(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SecuritySetting[] newArray(int i) {
                return new SecuritySetting[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SecuritySetting copy$default(SecuritySetting securitySetting, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = securitySetting.routePage;
            }
            return securitySetting.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.routePage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SecuritySetting copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SecuritySetting(str);
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
            return (obj instanceof SecuritySetting) && Intrinsics.EZpvd((Object) this.routePage, (Object) ((SecuritySetting) obj).routePage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRoutePage() {
            return this.routePage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.routePage.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SecuritySetting(routePage=" + this.routePage + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.routePage);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecuritySetting(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.routePage = str;
        }
    }

    public static final class MpcWallet extends LoginLandingType implements Parcelable {
        public static final int $stable = 0;
        public static final MpcWallet INSTANCE = new MpcWallet();
        public static final Parcelable.Creator<MpcWallet> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<MpcWallet> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MpcWallet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return MpcWallet.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MpcWallet[] newArray(int i) {
                return new MpcWallet[i];
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

        private MpcWallet() {
            super(null);
        }
    }

    public static final class SecurityVerifyNeeded extends LoginLandingType implements Parcelable {
        public static final int $stable = 0;
        public static final SecurityVerifyNeeded INSTANCE = new SecurityVerifyNeeded();
        public static final Parcelable.Creator<SecurityVerifyNeeded> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<SecurityVerifyNeeded> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SecurityVerifyNeeded createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return SecurityVerifyNeeded.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SecurityVerifyNeeded[] newArray(int i) {
                return new SecurityVerifyNeeded[i];
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

        private SecurityVerifyNeeded() {
            super(null);
        }
    }

    public static final class Fido2PromotionNeeded extends LoginLandingType implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Fido2PromotionNeeded> CREATOR = new Creator();
        private final String passkeyEasyRegToken;

        public static final class Creator implements Parcelable.Creator<Fido2PromotionNeeded> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fido2PromotionNeeded createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Fido2PromotionNeeded(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fido2PromotionNeeded[] newArray(int i) {
                return new Fido2PromotionNeeded[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fido2PromotionNeeded copy$default(Fido2PromotionNeeded fido2PromotionNeeded, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fido2PromotionNeeded.passkeyEasyRegToken;
            }
            return fido2PromotionNeeded.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.passkeyEasyRegToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fido2PromotionNeeded copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Fido2PromotionNeeded(str);
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
            return (obj instanceof Fido2PromotionNeeded) && Intrinsics.EZpvd((Object) this.passkeyEasyRegToken, (Object) ((Fido2PromotionNeeded) obj).passkeyEasyRegToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPasskeyEasyRegToken() {
            return this.passkeyEasyRegToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.passkeyEasyRegToken.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Fido2PromotionNeeded(passkeyEasyRegToken=" + this.passkeyEasyRegToken + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.passkeyEasyRegToken);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fido2PromotionNeeded(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.passkeyEasyRegToken = str;
        }
    }

    public static final class ShowSecurityPromotion extends LoginLandingType implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ShowSecurityPromotion> CREATOR = new Creator();
        private final PromotionDisplayType displayType;

        public static final class Creator implements Parcelable.Creator<ShowSecurityPromotion> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowSecurityPromotion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ShowSecurityPromotion(PromotionDisplayType.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowSecurityPromotion[] newArray(int i) {
                return new ShowSecurityPromotion[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ShowSecurityPromotion copy$default(ShowSecurityPromotion showSecurityPromotion, PromotionDisplayType promotionDisplayType, int i, Object obj) {
            if ((i & 1) != 0) {
                promotionDisplayType = showSecurityPromotion.displayType;
            }
            return showSecurityPromotion.copy(promotionDisplayType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PromotionDisplayType component1() {
            return this.displayType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ShowSecurityPromotion copy(@NotNull PromotionDisplayType promotionDisplayType) {
            Intrinsics.checkNotNullParameter(promotionDisplayType, "");
            return new ShowSecurityPromotion(promotionDisplayType);
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
            return (obj instanceof ShowSecurityPromotion) && this.displayType == ((ShowSecurityPromotion) obj).displayType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PromotionDisplayType getDisplayType() {
            return this.displayType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.displayType.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ShowSecurityPromotion(displayType=" + this.displayType + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.displayType.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSecurityPromotion(@NotNull PromotionDisplayType promotionDisplayType) {
            super(null);
            Intrinsics.checkNotNullParameter(promotionDisplayType, "");
            this.displayType = promotionDisplayType;
        }
    }

    public static final class DeviceScan extends LoginLandingType implements Parcelable {
        public static final int $stable = 0;
        public static final DeviceScan INSTANCE = new DeviceScan();
        public static final Parcelable.Creator<DeviceScan> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<DeviceScan> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeviceScan createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return DeviceScan.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeviceScan[] newArray(int i) {
                return new DeviceScan[i];
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

        private DeviceScan() {
            super(null);
        }
    }

    public static final class None extends LoginLandingType implements Parcelable {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();
        public static final Parcelable.Creator<None> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<None> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return None.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i) {
                return new None[i];
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

        private None() {
            super(null);
        }
    }
}
