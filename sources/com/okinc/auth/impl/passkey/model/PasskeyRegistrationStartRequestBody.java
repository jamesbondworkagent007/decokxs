package com.okinc.auth.impl.passkey.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class PasskeyRegistrationStartRequestBody implements Parcelable {
    public static final int $stable = 0;
    public final String mfaSessionId;
    public final String passkeyEasyRegToken;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PasskeyRegistrationStartRequestBody> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<PasskeyRegistrationStartRequestBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyRegistrationStartRequestBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyRegistrationStartRequestBody(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyRegistrationStartRequestBody[] newArray(int i) {
            return new PasskeyRegistrationStartRequestBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PasskeyRegistrationStartRequestBody() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyRegistrationStartRequestBody copy$default(PasskeyRegistrationStartRequestBody passkeyRegistrationStartRequestBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyRegistrationStartRequestBody.passkeyEasyRegToken;
        }
        if ((i & 2) != 0) {
            str2 = passkeyRegistrationStartRequestBody.mfaSessionId;
        }
        return passkeyRegistrationStartRequestBody.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyRegistrationStartRequestBody OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PasskeyRegistrationStartRequestBody(str, str2);
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
        if (!(obj instanceof PasskeyRegistrationStartRequestBody)) {
            return false;
        }
        PasskeyRegistrationStartRequestBody passkeyRegistrationStartRequestBody = (PasskeyRegistrationStartRequestBody) obj;
        return Intrinsics.EZpvd((Object) this.passkeyEasyRegToken, (Object) passkeyRegistrationStartRequestBody.passkeyEasyRegToken) && Intrinsics.EZpvd((Object) this.mfaSessionId, (Object) passkeyRegistrationStartRequestBody.mfaSessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.passkeyEasyRegToken.hashCode() * 31) + this.mfaSessionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyRegistrationStartRequestBody(passkeyEasyRegToken=" + this.passkeyEasyRegToken + ", mfaSessionId=" + this.mfaSessionId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.passkeyEasyRegToken);
        parcel.writeString(this.mfaSessionId);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.PasskeyRegistrationStartRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyRegistrationStartRequestBody> serializer() {
            return PasskeyRegistrationStartRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyRegistrationStartRequestBody(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.passkeyEasyRegToken = "";
        } else {
            this.passkeyEasyRegToken = str;
        }
        if ((i & 2) == 0) {
            this.mfaSessionId = "";
        } else {
            this.mfaSessionId = str2;
        }
    }

    public static final /* synthetic */ void KWHzl(PasskeyRegistrationStartRequestBody passkeyRegistrationStartRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) passkeyRegistrationStartRequestBody.passkeyEasyRegToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, passkeyRegistrationStartRequestBody.passkeyEasyRegToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) passkeyRegistrationStartRequestBody.mfaSessionId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, passkeyRegistrationStartRequestBody.mfaSessionId);
    }

    public PasskeyRegistrationStartRequestBody(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.passkeyEasyRegToken = str;
        this.mfaSessionId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:32) call: com.okinc.auth.impl.passkey.model.PasskeyRegistrationStartRequestBody.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PasskeyRegistrationStartRequestBody(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
