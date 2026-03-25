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
public final class SmartArbitrageModificationReq implements Parcelable {
    private String algoId;
    private PlaceOrderCondition condition;
    private String conditionType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SmartArbitrageModificationReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SmartArbitrageModificationReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbitrageModificationReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SmartArbitrageModificationReq(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PlaceOrderCondition.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbitrageModificationReq[] newArray(int i) {
            return new SmartArbitrageModificationReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartArbitrageModificationReq() {
        this((String) null, (String) null, (PlaceOrderCondition) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SmartArbitrageModificationReq copy$default(SmartArbitrageModificationReq smartArbitrageModificationReq, String str, String str2, PlaceOrderCondition placeOrderCondition, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smartArbitrageModificationReq.algoId;
        }
        if ((i & 2) != 0) {
            str2 = smartArbitrageModificationReq.conditionType;
        }
        if ((i & 4) != 0) {
            placeOrderCondition = smartArbitrageModificationReq.condition;
        }
        return smartArbitrageModificationReq.copy(str, str2, placeOrderCondition);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.conditionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlaceOrderCondition component3() {
        return this.condition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbitrageModificationReq copy(String str, String str2, PlaceOrderCondition placeOrderCondition) {
        return new SmartArbitrageModificationReq(str, str2, placeOrderCondition);
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
        if (!(obj instanceof SmartArbitrageModificationReq)) {
            return false;
        }
        SmartArbitrageModificationReq smartArbitrageModificationReq = (SmartArbitrageModificationReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) smartArbitrageModificationReq.algoId) && Intrinsics.EZpvd((Object) this.conditionType, (Object) smartArbitrageModificationReq.conditionType) && Intrinsics.EZpvd(this.condition, smartArbitrageModificationReq.condition);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlaceOrderCondition getCondition() {
        return this.condition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConditionType() {
        return this.conditionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.algoId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.conditionType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        PlaceOrderCondition placeOrderCondition = this.condition;
        return (((iHashCode * 31) + iHashCode2) * 31) + (placeOrderCondition != null ? placeOrderCondition.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(String str) {
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCondition(PlaceOrderCondition placeOrderCondition) {
        this.condition = placeOrderCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConditionType(String str) {
        this.conditionType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartArbitrageModificationReq(algoId=" + this.algoId + ", conditionType=" + this.conditionType + ", condition=" + this.condition + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.conditionType);
        PlaceOrderCondition placeOrderCondition = this.condition;
        if (placeOrderCondition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            placeOrderCondition.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SmartArbitrageModificationReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartArbitrageModificationReq> serializer() {
            return SmartArbitrageModificationReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartArbitrageModificationReq(int i, String str, String str2, PlaceOrderCondition placeOrderCondition, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.conditionType = null;
        } else {
            this.conditionType = str2;
        }
        if ((i & 4) == 0) {
            this.condition = null;
        } else {
            this.condition = placeOrderCondition;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SmartArbitrageModificationReq smartArbitrageModificationReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || smartArbitrageModificationReq.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, smartArbitrageModificationReq.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || smartArbitrageModificationReq.conditionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, smartArbitrageModificationReq.conditionType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && smartArbitrageModificationReq.condition == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, PlaceOrderCondition$$serializer.INSTANCE, smartArbitrageModificationReq.condition);
    }

    public SmartArbitrageModificationReq(String str, String str2, PlaceOrderCondition placeOrderCondition) {
        this.algoId = str;
        this.conditionType = str2;
        this.condition = placeOrderCondition;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.PlaceOrderCondition:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.PlaceOrderCondition) : (r4v0 com.okinc.unify_trade.biz.PlaceOrderCondition))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.PlaceOrderCondition):void (m)] (LINE:556) call: com.okinc.unify_trade.biz.SmartArbitrageModificationReq.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.PlaceOrderCondition):void type: THIS */
    public /* synthetic */ SmartArbitrageModificationReq(String str, String str2, PlaceOrderCondition placeOrderCondition, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : placeOrderCondition);
    }
}
