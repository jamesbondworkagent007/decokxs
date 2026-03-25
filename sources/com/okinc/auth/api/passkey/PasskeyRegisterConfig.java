package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class PasskeyRegisterConfig implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PasskeyRegisterConfig> CREATOR = new Creator();
    private final PasskeyPromotionAuthenticator authenticator;
    private final String easyRegToken;
    private final boolean enableExitBottomSheet;
    private final String mfaSessionId;
    private final PasskeyPromotionSource passkeyPromotionSource;
    private final boolean skipCheckPasskey;
    private final boolean supportFido1;

    public static final class Creator implements Parcelable.Creator<PasskeyRegisterConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyRegisterConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyRegisterConfig(parcel.readInt() != 0, parcel.readString(), parcel.readString(), (PasskeyPromotionAuthenticator) parcel.readParcelable(PasskeyRegisterConfig.class.getClassLoader()), PasskeyPromotionSource.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyRegisterConfig[] newArray(int i) {
            return new PasskeyRegisterConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PasskeyRegisterConfig() {
        this(false, null, null, null, null, false, false, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyRegisterConfig copy$default(PasskeyRegisterConfig passkeyRegisterConfig, boolean z, String str, String str2, PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, PasskeyPromotionSource passkeyPromotionSource, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = passkeyRegisterConfig.skipCheckPasskey;
        }
        if ((i & 2) != 0) {
            str = passkeyRegisterConfig.easyRegToken;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = passkeyRegisterConfig.mfaSessionId;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            passkeyPromotionAuthenticator = passkeyRegisterConfig.authenticator;
        }
        PasskeyPromotionAuthenticator passkeyPromotionAuthenticator2 = passkeyPromotionAuthenticator;
        if ((i & 16) != 0) {
            passkeyPromotionSource = passkeyRegisterConfig.passkeyPromotionSource;
        }
        PasskeyPromotionSource passkeyPromotionSource2 = passkeyPromotionSource;
        if ((i & 32) != 0) {
            z2 = passkeyRegisterConfig.enableExitBottomSheet;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            z3 = passkeyRegisterConfig.supportFido1;
        }
        return passkeyRegisterConfig.copy(z, str3, str4, passkeyPromotionAuthenticator2, passkeyPromotionSource2, z4, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.skipCheckPasskey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.easyRegToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mfaSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyPromotionAuthenticator component4() {
        return this.authenticator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyPromotionSource component5() {
        return this.passkeyPromotionSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.enableExitBottomSheet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.supportFido1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyRegisterConfig copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull PasskeyPromotionSource passkeyPromotionSource, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(passkeyPromotionAuthenticator, "");
        Intrinsics.checkNotNullParameter(passkeyPromotionSource, "");
        return new PasskeyRegisterConfig(z, str, str2, passkeyPromotionAuthenticator, passkeyPromotionSource, z2, z3);
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
        if (!(obj instanceof PasskeyRegisterConfig)) {
            return false;
        }
        PasskeyRegisterConfig passkeyRegisterConfig = (PasskeyRegisterConfig) obj;
        return this.skipCheckPasskey == passkeyRegisterConfig.skipCheckPasskey && Intrinsics.EZpvd((Object) this.easyRegToken, (Object) passkeyRegisterConfig.easyRegToken) && Intrinsics.EZpvd((Object) this.mfaSessionId, (Object) passkeyRegisterConfig.mfaSessionId) && Intrinsics.EZpvd(this.authenticator, passkeyRegisterConfig.authenticator) && this.passkeyPromotionSource == passkeyRegisterConfig.passkeyPromotionSource && this.enableExitBottomSheet == passkeyRegisterConfig.enableExitBottomSheet && this.supportFido1 == passkeyRegisterConfig.supportFido1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyPromotionAuthenticator getAuthenticator() {
        return this.authenticator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEasyRegToken() {
        return this.easyRegToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableExitBottomSheet() {
        return this.enableExitBottomSheet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMfaSessionId() {
        return this.mfaSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyPromotionSource getPasskeyPromotionSource() {
        return this.passkeyPromotionSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSkipCheckPasskey() {
        return this.skipCheckPasskey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportFido1() {
        return this.supportFido1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.skipCheckPasskey) * 31) + this.easyRegToken.hashCode()) * 31) + this.mfaSessionId.hashCode()) * 31) + this.authenticator.hashCode()) * 31) + this.passkeyPromotionSource.hashCode()) * 31) + Boolean.hashCode(this.enableExitBottomSheet)) * 31) + Boolean.hashCode(this.supportFido1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyRegisterConfig(skipCheckPasskey=" + this.skipCheckPasskey + ", easyRegToken=" + this.easyRegToken + ", mfaSessionId=" + this.mfaSessionId + ", authenticator=" + this.authenticator + ", passkeyPromotionSource=" + this.passkeyPromotionSource + ", enableExitBottomSheet=" + this.enableExitBottomSheet + ", supportFido1=" + this.supportFido1 + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.skipCheckPasskey ? 1 : 0);
        parcel.writeString(this.easyRegToken);
        parcel.writeString(this.mfaSessionId);
        parcel.writeParcelable(this.authenticator, i);
        parcel.writeString(this.passkeyPromotionSource.name());
        parcel.writeInt(this.enableExitBottomSheet ? 1 : 0);
        parcel.writeInt(this.supportFido1 ? 1 : 0);
    }

    public PasskeyRegisterConfig(boolean z, @NotNull String str, @NotNull String str2, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull PasskeyPromotionSource passkeyPromotionSource, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(passkeyPromotionAuthenticator, "");
        Intrinsics.checkNotNullParameter(passkeyPromotionSource, "");
        this.skipCheckPasskey = z;
        this.easyRegToken = str;
        this.mfaSessionId = str2;
        this.authenticator = passkeyPromotionAuthenticator;
        this.passkeyPromotionSource = passkeyPromotionSource;
        this.enableExitBottomSheet = z2;
        this.supportFido1 = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r14v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator:0x001d: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator:0x001b: SGET  A[WRAPPED] (LINE:20) com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator.All.KWHzl com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator$All) : (r10v0 com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator))
  (wrap:com.okinc.auth.api.passkey.PasskeyPromotionSource:0x0024: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.auth.api.passkey.PasskeyPromotionSource:0x0022: SGET  A[WRAPPED] (LINE:21) com.okinc.auth.api.passkey.PasskeyPromotionSource.SECURITY_CENTER com.okinc.auth.api.passkey.PasskeyPromotionSource) : (r11v0 com.okinc.auth.api.passkey.PasskeyPromotionSource))
  (wrap:boolean:0x002a: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(boolean, java.lang.String, java.lang.String, com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator, com.okinc.auth.api.passkey.PasskeyPromotionSource, boolean, boolean):void (m)] (LINE:16) call: com.okinc.auth.api.passkey.PasskeyRegisterConfig.<init>(boolean, java.lang.String, java.lang.String, com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator, com.okinc.auth.api.passkey.PasskeyPromotionSource, boolean, boolean):void type: THIS */
    public /* synthetic */ PasskeyRegisterConfig(boolean z, String str, String str2, PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, PasskeyPromotionSource passkeyPromotionSource, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? PasskeyPromotionAuthenticator.All.KWHzl : passkeyPromotionAuthenticator, (i & 16) != 0 ? PasskeyPromotionSource.SECURITY_CENTER : passkeyPromotionSource, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? false : z3);
    }
}
