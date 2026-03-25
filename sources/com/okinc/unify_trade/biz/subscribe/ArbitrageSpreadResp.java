package com.okinc.unify_trade.biz.subscribe;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ArbitrageSpreadResp implements Parcelable {
    private ArbitrageSpreadInverseResp USD;
    private ArbitrageSpreadLinearResp USDC;
    private ArbitrageSpreadLinearResp USDT;
    private ArbitrageSpreadInverseResp inverse;
    private ArbitrageSpreadLinearResp linear;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ArbitrageSpreadResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ArbitrageSpreadResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageSpreadResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ArbitrageSpreadResp(parcel.readInt() == 0 ? null : ArbitrageSpreadInverseResp.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ArbitrageSpreadLinearResp.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ArbitrageSpreadLinearResp.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ArbitrageSpreadLinearResp.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ArbitrageSpreadInverseResp.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageSpreadResp[] newArray(int i) {
            return new ArbitrageSpreadResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArbitrageSpreadResp() {
        this((ArbitrageSpreadInverseResp) null, (ArbitrageSpreadLinearResp) null, (ArbitrageSpreadLinearResp) null, (ArbitrageSpreadLinearResp) null, (ArbitrageSpreadInverseResp) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ArbitrageSpreadResp copy$default(ArbitrageSpreadResp arbitrageSpreadResp, ArbitrageSpreadInverseResp arbitrageSpreadInverseResp, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp2, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp3, ArbitrageSpreadInverseResp arbitrageSpreadInverseResp2, int i, Object obj) {
        if ((i & 1) != 0) {
            arbitrageSpreadInverseResp = arbitrageSpreadResp.inverse;
        }
        if ((i & 2) != 0) {
            arbitrageSpreadLinearResp = arbitrageSpreadResp.linear;
        }
        ArbitrageSpreadLinearResp arbitrageSpreadLinearResp4 = arbitrageSpreadLinearResp;
        if ((i & 4) != 0) {
            arbitrageSpreadLinearResp2 = arbitrageSpreadResp.USDT;
        }
        ArbitrageSpreadLinearResp arbitrageSpreadLinearResp5 = arbitrageSpreadLinearResp2;
        if ((i & 8) != 0) {
            arbitrageSpreadLinearResp3 = arbitrageSpreadResp.USDC;
        }
        ArbitrageSpreadLinearResp arbitrageSpreadLinearResp6 = arbitrageSpreadLinearResp3;
        if ((i & 16) != 0) {
            arbitrageSpreadInverseResp2 = arbitrageSpreadResp.USD;
        }
        return arbitrageSpreadResp.copy(arbitrageSpreadInverseResp, arbitrageSpreadLinearResp4, arbitrageSpreadLinearResp5, arbitrageSpreadLinearResp6, arbitrageSpreadInverseResp2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageSpreadInverseResp component1() {
        return this.inverse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageSpreadLinearResp component2() {
        return this.linear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageSpreadLinearResp component3() {
        return this.USDT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageSpreadLinearResp component4() {
        return this.USDC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageSpreadInverseResp component5() {
        return this.USD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageSpreadResp copy(ArbitrageSpreadInverseResp arbitrageSpreadInverseResp, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp2, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp3, ArbitrageSpreadInverseResp arbitrageSpreadInverseResp2) {
        return new ArbitrageSpreadResp(arbitrageSpreadInverseResp, arbitrageSpreadLinearResp, arbitrageSpreadLinearResp2, arbitrageSpreadLinearResp3, arbitrageSpreadInverseResp2);
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
        if (!(obj instanceof ArbitrageSpreadResp)) {
            return false;
        }
        ArbitrageSpreadResp arbitrageSpreadResp = (ArbitrageSpreadResp) obj;
        return Intrinsics.EZpvd(this.inverse, arbitrageSpreadResp.inverse) && Intrinsics.EZpvd(this.linear, arbitrageSpreadResp.linear) && Intrinsics.EZpvd(this.USDT, arbitrageSpreadResp.USDT) && Intrinsics.EZpvd(this.USDC, arbitrageSpreadResp.USDC) && Intrinsics.EZpvd(this.USD, arbitrageSpreadResp.USD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageSpreadInverseResp getInverse() {
        return this.inverse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageSpreadLinearResp getLinear() {
        return this.linear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageSpreadInverseResp getUSD() {
        return this.USD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageSpreadLinearResp getUSDC() {
        return this.USDC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageSpreadLinearResp getUSDT() {
        return this.USDT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArbitrageSpreadInverseResp arbitrageSpreadInverseResp = this.inverse;
        int iHashCode = arbitrageSpreadInverseResp == null ? 0 : arbitrageSpreadInverseResp.hashCode();
        ArbitrageSpreadLinearResp arbitrageSpreadLinearResp = this.linear;
        int iHashCode2 = arbitrageSpreadLinearResp == null ? 0 : arbitrageSpreadLinearResp.hashCode();
        ArbitrageSpreadLinearResp arbitrageSpreadLinearResp2 = this.USDT;
        int iHashCode3 = arbitrageSpreadLinearResp2 == null ? 0 : arbitrageSpreadLinearResp2.hashCode();
        ArbitrageSpreadLinearResp arbitrageSpreadLinearResp3 = this.USDC;
        int iHashCode4 = arbitrageSpreadLinearResp3 == null ? 0 : arbitrageSpreadLinearResp3.hashCode();
        ArbitrageSpreadInverseResp arbitrageSpreadInverseResp2 = this.USD;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (arbitrageSpreadInverseResp2 != null ? arbitrageSpreadInverseResp2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInverse(ArbitrageSpreadInverseResp arbitrageSpreadInverseResp) {
        this.inverse = arbitrageSpreadInverseResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinear(ArbitrageSpreadLinearResp arbitrageSpreadLinearResp) {
        this.linear = arbitrageSpreadLinearResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUSD(ArbitrageSpreadInverseResp arbitrageSpreadInverseResp) {
        this.USD = arbitrageSpreadInverseResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUSDC(ArbitrageSpreadLinearResp arbitrageSpreadLinearResp) {
        this.USDC = arbitrageSpreadLinearResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUSDT(ArbitrageSpreadLinearResp arbitrageSpreadLinearResp) {
        this.USDT = arbitrageSpreadLinearResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbitrageSpreadResp(inverse=" + this.inverse + ", linear=" + this.linear + ", USDT=" + this.USDT + ", USDC=" + this.USDC + ", USD=" + this.USD + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArbitrageSpreadInverseResp arbitrageSpreadInverseResp = this.inverse;
        if (arbitrageSpreadInverseResp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbitrageSpreadInverseResp.writeToParcel(parcel, i);
        }
        ArbitrageSpreadLinearResp arbitrageSpreadLinearResp = this.linear;
        if (arbitrageSpreadLinearResp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbitrageSpreadLinearResp.writeToParcel(parcel, i);
        }
        ArbitrageSpreadLinearResp arbitrageSpreadLinearResp2 = this.USDT;
        if (arbitrageSpreadLinearResp2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbitrageSpreadLinearResp2.writeToParcel(parcel, i);
        }
        ArbitrageSpreadLinearResp arbitrageSpreadLinearResp3 = this.USDC;
        if (arbitrageSpreadLinearResp3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbitrageSpreadLinearResp3.writeToParcel(parcel, i);
        }
        ArbitrageSpreadInverseResp arbitrageSpreadInverseResp2 = this.USD;
        if (arbitrageSpreadInverseResp2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbitrageSpreadInverseResp2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitrageSpreadResp> serializer() {
            return ArbitrageSpreadResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArbitrageSpreadResp(int i, ArbitrageSpreadInverseResp arbitrageSpreadInverseResp, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp2, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp3, ArbitrageSpreadInverseResp arbitrageSpreadInverseResp2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.inverse = null;
        } else {
            this.inverse = arbitrageSpreadInverseResp;
        }
        if ((i & 2) == 0) {
            this.linear = null;
        } else {
            this.linear = arbitrageSpreadLinearResp;
        }
        if ((i & 4) == 0) {
            this.USDT = null;
        } else {
            this.USDT = arbitrageSpreadLinearResp2;
        }
        if ((i & 8) == 0) {
            this.USDC = null;
        } else {
            this.USDC = arbitrageSpreadLinearResp3;
        }
        if ((i & 16) == 0) {
            this.USD = null;
        } else {
            this.USD = arbitrageSpreadInverseResp2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbitrageSpreadResp arbitrageSpreadResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbitrageSpreadResp.inverse != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ArbitrageSpreadInverseResp$$serializer.INSTANCE, arbitrageSpreadResp.inverse);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || arbitrageSpreadResp.linear != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ArbitrageSpreadLinearResp$$serializer.INSTANCE, arbitrageSpreadResp.linear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || arbitrageSpreadResp.USDT != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, ArbitrageSpreadLinearResp$$serializer.INSTANCE, arbitrageSpreadResp.USDT);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || arbitrageSpreadResp.USDC != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ArbitrageSpreadLinearResp$$serializer.INSTANCE, arbitrageSpreadResp.USDC);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && arbitrageSpreadResp.USD == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, ArbitrageSpreadInverseResp$$serializer.INSTANCE, arbitrageSpreadResp.USD);
    }

    public ArbitrageSpreadResp(ArbitrageSpreadInverseResp arbitrageSpreadInverseResp, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp2, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp3, ArbitrageSpreadInverseResp arbitrageSpreadInverseResp2) {
        this.inverse = arbitrageSpreadInverseResp;
        this.linear = arbitrageSpreadLinearResp;
        this.USDT = arbitrageSpreadLinearResp2;
        this.USDC = arbitrageSpreadLinearResp3;
        this.USD = arbitrageSpreadInverseResp2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp) : (r5v0 com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp))
  (wrap:com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp) : (r6v0 com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp))
  (wrap:com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp) : (r7v0 com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp))
  (wrap:com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp) : (r8v0 com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp))
  (wrap:com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp) : (r9v0 com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp))
 A[MD:(com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp, com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp, com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp, com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp, com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp):void (m)] (LINE:255) call: com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadResp.<init>(com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp, com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp, com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp, com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp, com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp):void type: THIS */
    public /* synthetic */ ArbitrageSpreadResp(ArbitrageSpreadInverseResp arbitrageSpreadInverseResp, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp2, ArbitrageSpreadLinearResp arbitrageSpreadLinearResp3, ArbitrageSpreadInverseResp arbitrageSpreadInverseResp2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arbitrageSpreadInverseResp, (i & 2) != 0 ? null : arbitrageSpreadLinearResp, (i & 4) != 0 ? null : arbitrageSpreadLinearResp2, (i & 8) != 0 ? null : arbitrageSpreadLinearResp3, (i & 16) != 0 ? null : arbitrageSpreadInverseResp2);
    }
}
