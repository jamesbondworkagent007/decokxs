package com.okinc.business.invest_biz.data.bean.request;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ValidatorRequestParam implements Parcelable {
    public static final int $stable = 0;
    private final long investmentId;
    private final int type;
    private final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ValidatorRequestParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ValidatorRequestParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidatorRequestParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ValidatorRequestParam(parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidatorRequestParam[] newArray(int i) {
            return new ValidatorRequestParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ValidatorRequestParam copy$default(ValidatorRequestParam validatorRequestParam, long j, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = validatorRequestParam.investmentId;
        }
        if ((i2 & 2) != 0) {
            i = validatorRequestParam.type;
        }
        if ((i2 & 4) != 0) {
            str = validatorRequestParam.walletAddress;
        }
        return validatorRequestParam.copy(j, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidatorRequestParam copy(long j, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ValidatorRequestParam(j, i, str);
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
        if (!(obj instanceof ValidatorRequestParam)) {
            return false;
        }
        ValidatorRequestParam validatorRequestParam = (ValidatorRequestParam) obj;
        return this.investmentId == validatorRequestParam.investmentId && this.type == validatorRequestParam.type && Intrinsics.EZpvd((Object) this.walletAddress, (Object) validatorRequestParam.walletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.investmentId) * 31) + Integer.hashCode(this.type)) * 31) + this.walletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ValidatorRequestParam(investmentId=" + this.investmentId + ", type=" + this.type + ", walletAddress=" + this.walletAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.investmentId);
        parcel.writeInt(this.type);
        parcel.writeString(this.walletAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.ValidatorRequestParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ValidatorRequestParam> serializer() {
            return ValidatorRequestParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ValidatorRequestParam(int i, long j, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, ValidatorRequestParam$$serializer.INSTANCE.getDescriptor());
        }
        this.investmentId = j;
        this.type = i2;
        this.walletAddress = str;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(ValidatorRequestParam validatorRequestParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, validatorRequestParam.investmentId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, validatorRequestParam.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, validatorRequestParam.walletAddress);
    }

    public ValidatorRequestParam(long j, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investmentId = j;
        this.type = i;
        this.walletAddress = str;
    }
}
