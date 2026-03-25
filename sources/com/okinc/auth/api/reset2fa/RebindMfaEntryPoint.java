package com.okinc.auth.api.reset2fa;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RebindMfaEntryPoint implements Parcelable {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.reset2fa.RebindMfaEntryPoint.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RebindMfaEntryPoint(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RebindMfaEntryPoint() {
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class PreLogin extends RebindMfaEntryPoint {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PreLogin> CREATOR = new Creator();
        private final String maskedEmail;
        private final String maskedPhone;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<PreLogin> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreLogin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PreLogin(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreLogin[] newArray(int i) {
                return new PreLogin[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PreLogin copy$default(PreLogin preLogin, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preLogin.maskedEmail;
            }
            if ((i & 2) != 0) {
                str2 = preLogin.maskedPhone;
            }
            return preLogin.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.maskedEmail;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.maskedPhone;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PreLogin copy(String str, String str2) {
            return new PreLogin(str, str2);
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
            if (!(obj instanceof PreLogin)) {
                return false;
            }
            PreLogin preLogin = (PreLogin) obj;
            return Intrinsics.EZpvd((Object) this.maskedEmail, (Object) preLogin.maskedEmail) && Intrinsics.EZpvd((Object) this.maskedPhone, (Object) preLogin.maskedPhone);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaskedEmail() {
            return this.maskedEmail;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaskedPhone() {
            return this.maskedPhone;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.maskedEmail;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.maskedPhone;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PreLogin(maskedEmail=" + this.maskedEmail + ", maskedPhone=" + this.maskedPhone + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.maskedEmail);
            parcel.writeString(this.maskedPhone);
        }

        public PreLogin(String str, String str2) {
            super(null);
            this.maskedEmail = str;
            this.maskedPhone = str2;
        }
    }

    public static final class PostLogin extends RebindMfaEntryPoint {
        public static final int $stable = 0;
        public static final PostLogin INSTANCE = new PostLogin();
        public static final Parcelable.Creator<PostLogin> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<PostLogin> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PostLogin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return PostLogin.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PostLogin[] newArray(int i) {
                return new PostLogin[i];
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

        private PostLogin() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ForgetPassword extends RebindMfaEntryPoint {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ForgetPassword> CREATOR = new Creator();
        private final String areaCode;
        private final String email;
        private final String loginName;
        private final String phone;
        private final String token;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<ForgetPassword> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForgetPassword createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ForgetPassword(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForgetPassword[] newArray(int i) {
                return new ForgetPassword[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ForgetPassword copy$default(ForgetPassword forgetPassword, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = forgetPassword.email;
            }
            if ((i & 2) != 0) {
                str2 = forgetPassword.phone;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = forgetPassword.areaCode;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = forgetPassword.loginName;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = forgetPassword.token;
            }
            return forgetPassword.copy(str, str6, str7, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.email;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.phone;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.areaCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.loginName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.token;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ForgetPassword copy(String str, String str2, String str3, String str4, String str5) {
            return new ForgetPassword(str, str2, str3, str4, str5);
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
            if (!(obj instanceof ForgetPassword)) {
                return false;
            }
            ForgetPassword forgetPassword = (ForgetPassword) obj;
            return Intrinsics.EZpvd((Object) this.email, (Object) forgetPassword.email) && Intrinsics.EZpvd((Object) this.phone, (Object) forgetPassword.phone) && Intrinsics.EZpvd((Object) this.areaCode, (Object) forgetPassword.areaCode) && Intrinsics.EZpvd((Object) this.loginName, (Object) forgetPassword.loginName) && Intrinsics.EZpvd((Object) this.token, (Object) forgetPassword.token);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAreaCode() {
            return this.areaCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEmail() {
            return this.email;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLoginName() {
            return this.loginName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPhone() {
            return this.phone;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getToken() {
            return this.token;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.email;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.phone;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.areaCode;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.loginName;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.token;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ForgetPassword(email=" + this.email + ", phone=" + this.phone + ", areaCode=" + this.areaCode + ", loginName=" + this.loginName + ", token=" + this.token + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.email);
            parcel.writeString(this.phone);
            parcel.writeString(this.areaCode);
            parcel.writeString(this.loginName);
            parcel.writeString(this.token);
        }

        public ForgetPassword(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.email = str;
            this.phone = str2;
            this.areaCode = str3;
            this.loginName = str4;
            this.token = str5;
        }
    }
}
