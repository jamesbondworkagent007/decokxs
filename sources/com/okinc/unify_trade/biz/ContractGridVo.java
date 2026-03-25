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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ContractGridVo implements Parcelable {
    private final ClosePositionVo closePosition;
    private final InitOrderingVo initOrdering;
    private final String ordVariant;
    private final String recommendedMarginTopup;
    private final SlippageVo slippage;
    private final UnitDisplayVo unitDisplayVO;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ContractGridVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ContractGridVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractGridVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ContractGridVo(parcel.readInt() == 0 ? null : ClosePositionVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InitOrderingVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SlippageVo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UnitDisplayVo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractGridVo[] newArray(int i) {
            return new ContractGridVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContractGridVo() {
        this((ClosePositionVo) null, (InitOrderingVo) null, (SlippageVo) null, (UnitDisplayVo) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContractGridVo copy$default(ContractGridVo contractGridVo, ClosePositionVo closePositionVo, InitOrderingVo initOrderingVo, SlippageVo slippageVo, UnitDisplayVo unitDisplayVo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            closePositionVo = contractGridVo.closePosition;
        }
        if ((i & 2) != 0) {
            initOrderingVo = contractGridVo.initOrdering;
        }
        InitOrderingVo initOrderingVo2 = initOrderingVo;
        if ((i & 4) != 0) {
            slippageVo = contractGridVo.slippage;
        }
        SlippageVo slippageVo2 = slippageVo;
        if ((i & 8) != 0) {
            unitDisplayVo = contractGridVo.unitDisplayVO;
        }
        UnitDisplayVo unitDisplayVo2 = unitDisplayVo;
        if ((i & 16) != 0) {
            str = contractGridVo.ordVariant;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            str2 = contractGridVo.recommendedMarginTopup;
        }
        return contractGridVo.copy(closePositionVo, initOrderingVo2, slippageVo2, unitDisplayVo2, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClosePositionVo component1() {
        return this.closePosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitOrderingVo component2() {
        return this.initOrdering;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageVo component3() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnitDisplayVo component4() {
        return this.unitDisplayVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ordVariant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.recommendedMarginTopup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractGridVo copy(ClosePositionVo closePositionVo, InitOrderingVo initOrderingVo, SlippageVo slippageVo, UnitDisplayVo unitDisplayVo, String str, String str2) {
        return new ContractGridVo(closePositionVo, initOrderingVo, slippageVo, unitDisplayVo, str, str2);
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
        if (!(obj instanceof ContractGridVo)) {
            return false;
        }
        ContractGridVo contractGridVo = (ContractGridVo) obj;
        return Intrinsics.EZpvd(this.closePosition, contractGridVo.closePosition) && Intrinsics.EZpvd(this.initOrdering, contractGridVo.initOrdering) && Intrinsics.EZpvd(this.slippage, contractGridVo.slippage) && Intrinsics.EZpvd(this.unitDisplayVO, contractGridVo.unitDisplayVO) && Intrinsics.EZpvd((Object) this.ordVariant, (Object) contractGridVo.ordVariant) && Intrinsics.EZpvd((Object) this.recommendedMarginTopup, (Object) contractGridVo.recommendedMarginTopup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClosePositionVo getClosePosition() {
        return this.closePosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitOrderingVo getInitOrdering() {
        return this.initOrdering;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdVariant() {
        return this.ordVariant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendedMarginTopup() {
        return this.recommendedMarginTopup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageVo getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnitDisplayVo getUnitDisplayVO() {
        return this.unitDisplayVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ClosePositionVo closePositionVo = this.closePosition;
        int iHashCode = closePositionVo == null ? 0 : closePositionVo.hashCode();
        InitOrderingVo initOrderingVo = this.initOrdering;
        int iHashCode2 = initOrderingVo == null ? 0 : initOrderingVo.hashCode();
        SlippageVo slippageVo = this.slippage;
        int iHashCode3 = slippageVo == null ? 0 : slippageVo.hashCode();
        UnitDisplayVo unitDisplayVo = this.unitDisplayVO;
        int iHashCode4 = unitDisplayVo == null ? 0 : unitDisplayVo.hashCode();
        String str = this.ordVariant;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.recommendedMarginTopup;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContractGridVo(closePosition=" + this.closePosition + ", initOrdering=" + this.initOrdering + ", slippage=" + this.slippage + ", unitDisplayVO=" + this.unitDisplayVO + ", ordVariant=" + this.ordVariant + ", recommendedMarginTopup=" + this.recommendedMarginTopup + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ClosePositionVo closePositionVo = this.closePosition;
        if (closePositionVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            closePositionVo.writeToParcel(parcel, i);
        }
        InitOrderingVo initOrderingVo = this.initOrdering;
        if (initOrderingVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            initOrderingVo.writeToParcel(parcel, i);
        }
        SlippageVo slippageVo = this.slippage;
        if (slippageVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            slippageVo.writeToParcel(parcel, i);
        }
        UnitDisplayVo unitDisplayVo = this.unitDisplayVO;
        if (unitDisplayVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            unitDisplayVo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.ordVariant);
        parcel.writeString(this.recommendedMarginTopup);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ContractGridVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractGridVo> serializer() {
            return ContractGridVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContractGridVo(int i, ClosePositionVo closePositionVo, InitOrderingVo initOrderingVo, SlippageVo slippageVo, UnitDisplayVo unitDisplayVo, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.closePosition = null;
        } else {
            this.closePosition = closePositionVo;
        }
        if ((i & 2) == 0) {
            this.initOrdering = null;
        } else {
            this.initOrdering = initOrderingVo;
        }
        if ((i & 4) == 0) {
            this.slippage = null;
        } else {
            this.slippage = slippageVo;
        }
        if ((i & 8) == 0) {
            this.unitDisplayVO = null;
        } else {
            this.unitDisplayVO = unitDisplayVo;
        }
        if ((i & 16) == 0) {
            this.ordVariant = "";
        } else {
            this.ordVariant = str;
        }
        if ((i & 32) == 0) {
            this.recommendedMarginTopup = null;
        } else {
            this.recommendedMarginTopup = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ContractGridVo contractGridVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || contractGridVo.closePosition != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ClosePositionVo$$serializer.INSTANCE, contractGridVo.closePosition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || contractGridVo.initOrdering != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InitOrderingVo$$serializer.INSTANCE, contractGridVo.initOrdering);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || contractGridVo.slippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, SlippageVo$$serializer.INSTANCE, contractGridVo.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || contractGridVo.unitDisplayVO != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, UnitDisplayVo$$serializer.INSTANCE, contractGridVo.unitDisplayVO);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) contractGridVo.ordVariant, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, contractGridVo.ordVariant);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && contractGridVo.recommendedMarginTopup == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, contractGridVo.recommendedMarginTopup);
    }

    public ContractGridVo(ClosePositionVo closePositionVo, InitOrderingVo initOrderingVo, SlippageVo slippageVo, UnitDisplayVo unitDisplayVo, String str, String str2) {
        this.closePosition = closePositionVo;
        this.initOrdering = initOrderingVo;
        this.slippage = slippageVo;
        this.unitDisplayVO = unitDisplayVo;
        this.ordVariant = str;
        this.recommendedMarginTopup = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.ClosePositionVo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ClosePositionVo) : (r6v0 com.okinc.unify_trade.biz.ClosePositionVo))
  (wrap:com.okinc.unify_trade.biz.InitOrderingVo:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.InitOrderingVo) : (r7v0 com.okinc.unify_trade.biz.InitOrderingVo))
  (wrap:com.okinc.unify_trade.biz.SlippageVo:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.SlippageVo) : (r8v0 com.okinc.unify_trade.biz.SlippageVo))
  (wrap:com.okinc.unify_trade.biz.UnitDisplayVo:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.UnitDisplayVo) : (r9v0 com.okinc.unify_trade.biz.UnitDisplayVo))
  (wrap:java.lang.String:0x0023: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.ClosePositionVo, com.okinc.unify_trade.biz.InitOrderingVo, com.okinc.unify_trade.biz.SlippageVo, com.okinc.unify_trade.biz.UnitDisplayVo, java.lang.String, java.lang.String):void (m)] (LINE:121) call: com.okinc.unify_trade.biz.ContractGridVo.<init>(com.okinc.unify_trade.biz.ClosePositionVo, com.okinc.unify_trade.biz.InitOrderingVo, com.okinc.unify_trade.biz.SlippageVo, com.okinc.unify_trade.biz.UnitDisplayVo, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ContractGridVo(ClosePositionVo closePositionVo, InitOrderingVo initOrderingVo, SlippageVo slippageVo, UnitDisplayVo unitDisplayVo, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : closePositionVo, (i & 2) != 0 ? null : initOrderingVo, (i & 4) != 0 ? null : slippageVo, (i & 8) != 0 ? null : unitDisplayVo, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : str2);
    }
}
