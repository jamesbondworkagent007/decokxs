package com.okinc.wallet.hardware.api.keystone;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ParseKeystoneSignResp implements Parcelable {
    public static final int $stable = 0;
    private final int progress;
    private final KeystoneSignResult signResult;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ParseKeystoneSignResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ParseKeystoneSignResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ParseKeystoneSignResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ParseKeystoneSignResp(parcel.readInt(), parcel.readInt() == 0 ? null : KeystoneSignResult.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ParseKeystoneSignResp[] newArray(int i) {
            return new ParseKeystoneSignResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ParseKeystoneSignResp copy$default(ParseKeystoneSignResp parseKeystoneSignResp, int i, KeystoneSignResult keystoneSignResult, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = parseKeystoneSignResp.progress;
        }
        if ((i2 & 2) != 0) {
            keystoneSignResult = parseKeystoneSignResp.signResult;
        }
        return parseKeystoneSignResp.copy(i, keystoneSignResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneSignResult component2() {
        return this.signResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ParseKeystoneSignResp copy(int i, KeystoneSignResult keystoneSignResult) {
        return new ParseKeystoneSignResp(i, keystoneSignResult);
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
        if (!(obj instanceof ParseKeystoneSignResp)) {
            return false;
        }
        ParseKeystoneSignResp parseKeystoneSignResp = (ParseKeystoneSignResp) obj;
        return this.progress == parseKeystoneSignResp.progress && Intrinsics.EZpvd(this.signResult, parseKeystoneSignResp.signResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneSignResult getSignResult() {
        return this.signResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.progress);
        KeystoneSignResult keystoneSignResult = this.signResult;
        return (iHashCode * 31) + (keystoneSignResult == null ? 0 : keystoneSignResult.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ParseKeystoneSignResp(progress=" + this.progress + ", signResult=" + this.signResult + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.progress);
        KeystoneSignResult keystoneSignResult = this.signResult;
        if (keystoneSignResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            keystoneSignResult.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.keystone.ParseKeystoneSignResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ParseKeystoneSignResp> serializer() {
            return ParseKeystoneSignResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ParseKeystoneSignResp(int i, int i2, KeystoneSignResult keystoneSignResult, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ParseKeystoneSignResp$$serializer.INSTANCE.getDescriptor());
        }
        this.progress = i2;
        this.signResult = keystoneSignResult;
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(ParseKeystoneSignResp parseKeystoneSignResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, parseKeystoneSignResp.progress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, KeystoneSignResult$$serializer.INSTANCE, parseKeystoneSignResp.signResult);
    }

    public ParseKeystoneSignResp(int i, KeystoneSignResult keystoneSignResult) {
        this.progress = i;
        this.signResult = keystoneSignResult;
    }
}
