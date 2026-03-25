package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class UnFreezeDateResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final Long fiatDepositCryptoHold;
    private final Long fiatDepositFiatHold;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UnFreezeDateResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UnFreezeDateResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnFreezeDateResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UnFreezeDateResponseBean(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnFreezeDateResponseBean[] newArray(int i) {
            return new UnFreezeDateResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnFreezeDateResponseBean() {
        this((Long) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnFreezeDateResponseBean copy$default(UnFreezeDateResponseBean unFreezeDateResponseBean, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = unFreezeDateResponseBean.fiatDepositCryptoHold;
        }
        if ((i & 2) != 0) {
            l2 = unFreezeDateResponseBean.fiatDepositFiatHold;
        }
        return unFreezeDateResponseBean.copy(l, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.fiatDepositCryptoHold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.fiatDepositFiatHold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnFreezeDateResponseBean copy(Long l, Long l2) {
        return new UnFreezeDateResponseBean(l, l2);
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
        if (!(obj instanceof UnFreezeDateResponseBean)) {
            return false;
        }
        UnFreezeDateResponseBean unFreezeDateResponseBean = (UnFreezeDateResponseBean) obj;
        return Intrinsics.EZpvd(this.fiatDepositCryptoHold, unFreezeDateResponseBean.fiatDepositCryptoHold) && Intrinsics.EZpvd(this.fiatDepositFiatHold, unFreezeDateResponseBean.fiatDepositFiatHold);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFiatDepositCryptoHold() {
        return this.fiatDepositCryptoHold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFiatDepositFiatHold() {
        return this.fiatDepositFiatHold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.fiatDepositCryptoHold;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.fiatDepositFiatHold;
        return (iHashCode * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnFreezeDateResponseBean(fiatDepositCryptoHold=" + this.fiatDepositCryptoHold + ", fiatDepositFiatHold=" + this.fiatDepositFiatHold + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.fiatDepositCryptoHold;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.fiatDepositFiatHold;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.UnFreezeDateResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnFreezeDateResponseBean> serializer() {
            return UnFreezeDateResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnFreezeDateResponseBean(int i, Long l, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fiatDepositCryptoHold = null;
        } else {
            this.fiatDepositCryptoHold = l;
        }
        if ((i & 2) == 0) {
            this.fiatDepositFiatHold = null;
        } else {
            this.fiatDepositFiatHold = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(UnFreezeDateResponseBean unFreezeDateResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || unFreezeDateResponseBean.fiatDepositCryptoHold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, unFreezeDateResponseBean.fiatDepositCryptoHold);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && unFreezeDateResponseBean.fiatDepositFiatHold == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, unFreezeDateResponseBean.fiatDepositFiatHold);
    }

    public UnFreezeDateResponseBean(Long l, Long l2) {
        this.fiatDepositCryptoHold = l;
        this.fiatDepositFiatHold = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
 A[MD:(java.lang.Long, java.lang.Long):void (m)] (LINE:137) call: com.okinc.crcore.coreapi.net.responsebean.bsc.UnFreezeDateResponseBean.<init>(java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ UnFreezeDateResponseBean(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }
}
