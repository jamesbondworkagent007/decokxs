package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class EmailStateInfo implements Parcelable {
    public static final int $stable = 0;
    private final boolean isValidEmail;
    private final boolean noEmail;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EmailStateInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<EmailStateInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmailStateInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EmailStateInfo(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmailStateInfo[] newArray(int i) {
            return new EmailStateInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EmailStateInfo copy$default(EmailStateInfo emailStateInfo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = emailStateInfo.isValidEmail;
        }
        if ((i & 2) != 0) {
            z2 = emailStateInfo.noEmail;
        }
        return emailStateInfo.copy(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isValidEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.noEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EmailStateInfo copy(boolean z, boolean z2) {
        return new EmailStateInfo(z, z2);
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
        if (!(obj instanceof EmailStateInfo)) {
            return false;
        }
        EmailStateInfo emailStateInfo = (EmailStateInfo) obj;
        return this.isValidEmail == emailStateInfo.isValidEmail && this.noEmail == emailStateInfo.noEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNoEmail() {
        return this.noEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.isValidEmail) * 31) + Boolean.hashCode(this.noEmail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isValidEmail() {
        return this.isValidEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EmailStateInfo(isValidEmail=" + this.isValidEmail + ", noEmail=" + this.noEmail + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isValidEmail ? 1 : 0);
        parcel.writeInt(this.noEmail ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailStateInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EmailStateInfo> serializer() {
            return EmailStateInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EmailStateInfo(int i, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EmailStateInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.isValidEmail = z;
        this.noEmail = z2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(EmailStateInfo emailStateInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, emailStateInfo.isValidEmail);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, emailStateInfo.noEmail);
    }

    public EmailStateInfo(boolean z, boolean z2) {
        this.isValidEmail = z;
        this.noEmail = z2;
    }
}
