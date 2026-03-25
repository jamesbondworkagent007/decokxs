package com.okinc.business.web3pay.api.model;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OffshoreActivatePayFlowParams implements Parcelable {
    public static final int $stable = 0;
    public final String customTitle;
    public final boolean ignoreKycCheck;
    public final boolean needShowAddFundsPage;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OffshoreActivatePayFlowParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OffshoreActivatePayFlowParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OffshoreActivatePayFlowParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OffshoreActivatePayFlowParams(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OffshoreActivatePayFlowParams[] newArray(int i) {
            return new OffshoreActivatePayFlowParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OffshoreActivatePayFlowParams copy$default(OffshoreActivatePayFlowParams offshoreActivatePayFlowParams, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = offshoreActivatePayFlowParams.needShowAddFundsPage;
        }
        if ((i & 2) != 0) {
            z2 = offshoreActivatePayFlowParams.ignoreKycCheck;
        }
        if ((i & 4) != 0) {
            str = offshoreActivatePayFlowParams.customTitle;
        }
        return offshoreActivatePayFlowParams.OLrzqt(z, z2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OffshoreActivatePayFlowParams OLrzqt(boolean z, boolean z2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OffshoreActivatePayFlowParams(z, z2, str);
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
        if (!(obj instanceof OffshoreActivatePayFlowParams)) {
            return false;
        }
        OffshoreActivatePayFlowParams offshoreActivatePayFlowParams = (OffshoreActivatePayFlowParams) obj;
        return this.needShowAddFundsPage == offshoreActivatePayFlowParams.needShowAddFundsPage && this.ignoreKycCheck == offshoreActivatePayFlowParams.ignoreKycCheck && Intrinsics.EZpvd((Object) this.customTitle, (Object) offshoreActivatePayFlowParams.customTitle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.needShowAddFundsPage) * 31) + Boolean.hashCode(this.ignoreKycCheck)) * 31) + this.customTitle.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OffshoreActivatePayFlowParams(needShowAddFundsPage=" + this.needShowAddFundsPage + ", ignoreKycCheck=" + this.ignoreKycCheck + ", customTitle=" + this.customTitle + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.needShowAddFundsPage ? 1 : 0);
        parcel.writeInt(this.ignoreKycCheck ? 1 : 0);
        parcel.writeString(this.customTitle);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.OffshoreActivatePayFlowParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OffshoreActivatePayFlowParams> serializer() {
            return OffshoreActivatePayFlowParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OffshoreActivatePayFlowParams(int i, boolean z, boolean z2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, OffshoreActivatePayFlowParams$$serializer.INSTANCE.getDescriptor());
        }
        this.needShowAddFundsPage = z;
        this.ignoreKycCheck = z2;
        this.customTitle = str;
    }

    public static final /* synthetic */ void EZpvd(OffshoreActivatePayFlowParams offshoreActivatePayFlowParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, offshoreActivatePayFlowParams.needShowAddFundsPage);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, offshoreActivatePayFlowParams.ignoreKycCheck);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, offshoreActivatePayFlowParams.customTitle);
    }

    public OffshoreActivatePayFlowParams(boolean z, boolean z2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.needShowAddFundsPage = z;
        this.ignoreKycCheck = z2;
        this.customTitle = str;
    }
}
