package com.okinc.account.api.model.register;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class SignupResult implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SignupResult> CREATOR = new Creator();
    private final String accountName;
    private final String easyRegToken;
    private final Integer preferredMode;
    private final int resultCode;
    private final String resultMessage;
    private final int thirdPartyType;
    private final String tk;

    public static final class Creator implements Parcelable.Creator<SignupResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignupResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignupResult(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignupResult[] newArray(int i) {
            return new SignupResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignupResult copy$default(SignupResult signupResult, int i, String str, int i2, String str2, String str3, String str4, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = signupResult.resultCode;
        }
        if ((i3 & 2) != 0) {
            str = signupResult.resultMessage;
        }
        String str5 = str;
        if ((i3 & 4) != 0) {
            i2 = signupResult.thirdPartyType;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str2 = signupResult.easyRegToken;
        }
        String str6 = str2;
        if ((i3 & 16) != 0) {
            str3 = signupResult.accountName;
        }
        String str7 = str3;
        if ((i3 & 32) != 0) {
            str4 = signupResult.tk;
        }
        String str8 = str4;
        if ((i3 & 64) != 0) {
            num = signupResult.preferredMode;
        }
        return signupResult.copy(i, str5, i4, str6, str7, str8, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.resultCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.resultMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.thirdPartyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.easyRegToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.preferredMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignupResult copy(int i, @NotNull String str, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SignupResult(i, str, i2, str2, str3, str4, num);
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
        if (!(obj instanceof SignupResult)) {
            return false;
        }
        SignupResult signupResult = (SignupResult) obj;
        return this.resultCode == signupResult.resultCode && Intrinsics.EZpvd((Object) this.resultMessage, (Object) signupResult.resultMessage) && this.thirdPartyType == signupResult.thirdPartyType && Intrinsics.EZpvd((Object) this.easyRegToken, (Object) signupResult.easyRegToken) && Intrinsics.EZpvd((Object) this.accountName, (Object) signupResult.accountName) && Intrinsics.EZpvd((Object) this.tk, (Object) signupResult.tk) && Intrinsics.EZpvd(this.preferredMode, signupResult.preferredMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEasyRegToken() {
        return this.easyRegToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPreferredMode() {
        return this.preferredMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getResultCode() {
        return this.resultCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResultMessage() {
        return this.resultMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getThirdPartyType() {
        return this.thirdPartyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTk() {
        return this.tk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.resultCode);
        int iHashCode2 = this.resultMessage.hashCode();
        int iHashCode3 = Integer.hashCode(this.thirdPartyType);
        int iHashCode4 = this.easyRegToken.hashCode();
        int iHashCode5 = this.accountName.hashCode();
        int iHashCode6 = this.tk.hashCode();
        Integer num = this.preferredMode;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignupResult(resultCode=" + this.resultCode + ", resultMessage=" + this.resultMessage + ", thirdPartyType=" + this.thirdPartyType + ", easyRegToken=" + this.easyRegToken + ", accountName=" + this.accountName + ", tk=" + this.tk + ", preferredMode=" + this.preferredMode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.resultCode);
        parcel.writeString(this.resultMessage);
        parcel.writeInt(this.thirdPartyType);
        parcel.writeString(this.easyRegToken);
        parcel.writeString(this.accountName);
        parcel.writeString(this.tk);
        Integer num = this.preferredMode;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public SignupResult(int i, @NotNull String str, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.resultCode = i;
        this.resultMessage = str;
        this.thirdPartyType = i2;
        this.easyRegToken = str2;
        this.accountName = str3;
        this.tk = str4;
        this.preferredMode = num;
    }
}
