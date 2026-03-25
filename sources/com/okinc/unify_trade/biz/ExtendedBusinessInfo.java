package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ExtendedBusinessInfo implements Parcelable {
    private final LossInsurance lossInsuranceVoucherParam;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExtendedBusinessInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ExtendedBusinessInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExtendedBusinessInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ExtendedBusinessInfo(parcel.readInt() == 0 ? null : LossInsurance.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExtendedBusinessInfo[] newArray(int i) {
            return new ExtendedBusinessInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExtendedBusinessInfo() {
        this((LossInsurance) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExtendedBusinessInfo copy$default(ExtendedBusinessInfo extendedBusinessInfo, LossInsurance lossInsurance, int i, Object obj) {
        if ((i & 1) != 0) {
            lossInsurance = extendedBusinessInfo.lossInsuranceVoucherParam;
        }
        return extendedBusinessInfo.copy(lossInsurance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LossInsurance component1() {
        return this.lossInsuranceVoucherParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtendedBusinessInfo copy(LossInsurance lossInsurance) {
        return new ExtendedBusinessInfo(lossInsurance);
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
        return (obj instanceof ExtendedBusinessInfo) && Intrinsics.EZpvd(this.lossInsuranceVoucherParam, ((ExtendedBusinessInfo) obj).lossInsuranceVoucherParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LossInsurance getLossInsuranceVoucherParam() {
        return this.lossInsuranceVoucherParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        LossInsurance lossInsurance = this.lossInsuranceVoucherParam;
        if (lossInsurance == null) {
            return 0;
        }
        return lossInsurance.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExtendedBusinessInfo(lossInsuranceVoucherParam=" + this.lossInsuranceVoucherParam + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        LossInsurance lossInsurance = this.lossInsuranceVoucherParam;
        if (lossInsurance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lossInsurance.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ExtendedBusinessInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExtendedBusinessInfo> serializer() {
            return ExtendedBusinessInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExtendedBusinessInfo(int i, LossInsurance lossInsurance, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.lossInsuranceVoucherParam = null;
        } else {
            this.lossInsuranceVoucherParam = lossInsurance;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ExtendedBusinessInfo extendedBusinessInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && extendedBusinessInfo.lossInsuranceVoucherParam == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LossInsurance$$serializer.INSTANCE, extendedBusinessInfo.lossInsuranceVoucherParam);
    }

    public ExtendedBusinessInfo(LossInsurance lossInsurance) {
        this.lossInsuranceVoucherParam = lossInsurance;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.LossInsurance:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.LossInsurance) : (r1v0 com.okinc.unify_trade.biz.LossInsurance))
 A[MD:(com.okinc.unify_trade.biz.LossInsurance):void (m)] (LINE:1682) call: com.okinc.unify_trade.biz.ExtendedBusinessInfo.<init>(com.okinc.unify_trade.biz.LossInsurance):void type: THIS */
    public /* synthetic */ ExtendedBusinessInfo(LossInsurance lossInsurance, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lossInsurance);
    }
}
