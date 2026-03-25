package com.okinc.business.invest_api.bean;

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
public final class DeFiRedeemParam implements Parcelable {
    public static final int $stable = 0;
    public final long chainId;
    public final long investmentId;
    public final boolean useMultiCoinExecutor;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DeFiRedeemParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DeFiRedeemParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeFiRedeemParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DeFiRedeemParam(parcel.readLong(), parcel.readLong(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeFiRedeemParam[] newArray(int i) {
            return new DeFiRedeemParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeFiRedeemParam copy$default(DeFiRedeemParam deFiRedeemParam, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = deFiRedeemParam.investmentId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = deFiRedeemParam.chainId;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            z = deFiRedeemParam.useMultiCoinExecutor;
        }
        return deFiRedeemParam.EZpvd(j3, j4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeFiRedeemParam EZpvd(long j, long j2, boolean z) {
        return new DeFiRedeemParam(j, j2, z);
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
        if (!(obj instanceof DeFiRedeemParam)) {
            return false;
        }
        DeFiRedeemParam deFiRedeemParam = (DeFiRedeemParam) obj;
        return this.investmentId == deFiRedeemParam.investmentId && this.chainId == deFiRedeemParam.chainId && this.useMultiCoinExecutor == deFiRedeemParam.useMultiCoinExecutor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.investmentId) * 31) + Long.hashCode(this.chainId)) * 31) + Boolean.hashCode(this.useMultiCoinExecutor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeFiRedeemParam(investmentId=" + this.investmentId + ", chainId=" + this.chainId + ", useMultiCoinExecutor=" + this.useMultiCoinExecutor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.investmentId);
        parcel.writeLong(this.chainId);
        parcel.writeInt(this.useMultiCoinExecutor ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_api.bean.DeFiRedeemParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeFiRedeemParam> serializer() {
            return DeFiRedeemParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeFiRedeemParam(int i, long j, long j2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DeFiRedeemParam$$serializer.INSTANCE.getDescriptor());
        }
        this.investmentId = j;
        this.chainId = j2;
        if ((i & 4) == 0) {
            this.useMultiCoinExecutor = true;
        } else {
            this.useMultiCoinExecutor = z;
        }
    }

    public static final /* synthetic */ void AEQbTJ(DeFiRedeemParam deFiRedeemParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, deFiRedeemParam.investmentId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, deFiRedeemParam.chainId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && deFiRedeemParam.useMultiCoinExecutor) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, deFiRedeemParam.useMultiCoinExecutor);
    }

    public DeFiRedeemParam(long j, long j2, boolean z) {
        this.investmentId = j;
        this.chainId = j2;
        this.useMultiCoinExecutor = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r7v0 long)
  (r9v0 long)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
 A[MD:(long, long, boolean):void (m)] (LINE:9) call: com.okinc.business.invest_api.bean.DeFiRedeemParam.<init>(long, long, boolean):void type: THIS */
    public /* synthetic */ DeFiRedeemParam(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? true : z);
    }
}
