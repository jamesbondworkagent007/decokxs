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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyDcaEditResp implements Parcelable {
    private final String effectiveCycleId;
    private final EditParams parameters;
    private final String submitTimestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StrategyDcaEditResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StrategyDcaEditResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyDcaEditResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StrategyDcaEditResp(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EditParams.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyDcaEditResp[] newArray(int i) {
            return new StrategyDcaEditResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyDcaEditResp() {
        this((String) null, (String) null, (EditParams) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrategyDcaEditResp copy$default(StrategyDcaEditResp strategyDcaEditResp, String str, String str2, EditParams editParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategyDcaEditResp.submitTimestamp;
        }
        if ((i & 2) != 0) {
            str2 = strategyDcaEditResp.effectiveCycleId;
        }
        if ((i & 4) != 0) {
            editParams = strategyDcaEditResp.parameters;
        }
        return strategyDcaEditResp.copy(str, str2, editParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.submitTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.effectiveCycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditParams component3() {
        return this.parameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDcaEditResp copy(String str, String str2, EditParams editParams) {
        return new StrategyDcaEditResp(str, str2, editParams);
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
        if (!(obj instanceof StrategyDcaEditResp)) {
            return false;
        }
        StrategyDcaEditResp strategyDcaEditResp = (StrategyDcaEditResp) obj;
        return Intrinsics.EZpvd((Object) this.submitTimestamp, (Object) strategyDcaEditResp.submitTimestamp) && Intrinsics.EZpvd((Object) this.effectiveCycleId, (Object) strategyDcaEditResp.effectiveCycleId) && Intrinsics.EZpvd(this.parameters, strategyDcaEditResp.parameters);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEffectiveCycleId() {
        return this.effectiveCycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditParams getParameters() {
        return this.parameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubmitTimestamp() {
        return this.submitTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.submitTimestamp;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.effectiveCycleId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        EditParams editParams = this.parameters;
        return (((iHashCode * 31) + iHashCode2) * 31) + (editParams != null ? editParams.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyDcaEditResp(submitTimestamp=" + this.submitTimestamp + ", effectiveCycleId=" + this.effectiveCycleId + ", parameters=" + this.parameters + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.submitTimestamp);
        parcel.writeString(this.effectiveCycleId);
        EditParams editParams = this.parameters;
        if (editParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            editParams.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyDcaEditResp> serializer() {
            return StrategyDcaEditResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyDcaEditResp(int i, String str, String str2, EditParams editParams, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.submitTimestamp = "";
        } else {
            this.submitTimestamp = str;
        }
        if ((i & 2) == 0) {
            this.effectiveCycleId = "";
        } else {
            this.effectiveCycleId = str2;
        }
        if ((i & 4) == 0) {
            this.parameters = null;
        } else {
            this.parameters = editParams;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyDcaEditResp strategyDcaEditResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyDcaEditResp.submitTimestamp, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, strategyDcaEditResp.submitTimestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyDcaEditResp.effectiveCycleId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, strategyDcaEditResp.effectiveCycleId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && strategyDcaEditResp.parameters == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, EditParams$$serializer.INSTANCE, strategyDcaEditResp.parameters);
    }

    public StrategyDcaEditResp(String str, String str2, EditParams editParams) {
        this.submitTimestamp = str;
        this.effectiveCycleId = str2;
        this.parameters = editParams;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.subscribe.EditParams:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.subscribe.EditParams) : (r4v0 com.okinc.unify_trade.biz.subscribe.EditParams))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.subscribe.EditParams):void (m)] (LINE:12) call: com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.subscribe.EditParams):void type: THIS */
    public /* synthetic */ StrategyDcaEditResp(String str, String str2, EditParams editParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : editParams);
    }
}
