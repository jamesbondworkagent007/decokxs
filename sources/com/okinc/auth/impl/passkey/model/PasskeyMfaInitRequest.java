package com.okinc.auth.impl.passkey.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class PasskeyMfaInitRequest implements Parcelable {
    public static final int $stable = 0;
    public final String passkeyOperation;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PasskeyMfaInitRequest> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<PasskeyMfaInitRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyMfaInitRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyMfaInitRequest(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyMfaInitRequest[] newArray(int i) {
            return new PasskeyMfaInitRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyMfaInitRequest copy$default(PasskeyMfaInitRequest passkeyMfaInitRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyMfaInitRequest.passkeyOperation;
        }
        return passkeyMfaInitRequest.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyMfaInitRequest AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PasskeyMfaInitRequest(str);
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
        return (obj instanceof PasskeyMfaInitRequest) && Intrinsics.EZpvd((Object) this.passkeyOperation, (Object) ((PasskeyMfaInitRequest) obj).passkeyOperation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.passkeyOperation.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyMfaInitRequest(passkeyOperation=" + this.passkeyOperation + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.passkeyOperation);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.PasskeyMfaInitRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyMfaInitRequest> serializer() {
            return PasskeyMfaInitRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyMfaInitRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PasskeyMfaInitRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.passkeyOperation = str;
    }

    public PasskeyMfaInitRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.passkeyOperation = str;
    }
}
