package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TriggerStrategyOrderReq implements Parcelable {
    private String orderPx;
    private String proposedPx;
    private String triggerPx;
    private String triggerPxType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TriggerStrategyOrderReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<TriggerStrategyOrderReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TriggerStrategyOrderReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TriggerStrategyOrderReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TriggerStrategyOrderReq[] newArray(int i) {
            return new TriggerStrategyOrderReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TriggerStrategyOrderReq copy$default(TriggerStrategyOrderReq triggerStrategyOrderReq, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = triggerStrategyOrderReq.triggerPx;
        }
        if ((i & 2) != 0) {
            str2 = triggerStrategyOrderReq.orderPx;
        }
        if ((i & 4) != 0) {
            str3 = triggerStrategyOrderReq.triggerPxType;
        }
        if ((i & 8) != 0) {
            str4 = triggerStrategyOrderReq.proposedPx;
        }
        return triggerStrategyOrderReq.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.orderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.proposedPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TriggerStrategyOrderReq copy(String str, String str2, String str3, String str4) {
        return new TriggerStrategyOrderReq(str, str2, str3, str4);
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
        if (!(obj instanceof TriggerStrategyOrderReq)) {
            return false;
        }
        TriggerStrategyOrderReq triggerStrategyOrderReq = (TriggerStrategyOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.triggerPx, (Object) triggerStrategyOrderReq.triggerPx) && Intrinsics.EZpvd((Object) this.orderPx, (Object) triggerStrategyOrderReq.orderPx) && Intrinsics.EZpvd((Object) this.triggerPxType, (Object) triggerStrategyOrderReq.triggerPxType) && Intrinsics.EZpvd((Object) this.proposedPx, (Object) triggerStrategyOrderReq.proposedPx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderPx() {
        return this.orderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProposedPx() {
        return this.proposedPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPx() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPxType() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.triggerPx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.orderPx;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.triggerPxType;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.proposedPx;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderPx(String str) {
        this.orderPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProposedPx(String str) {
        this.proposedPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPx(String str) {
        this.triggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPxType(String str) {
        this.triggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TriggerStrategyOrderReq(triggerPx=" + this.triggerPx + ", orderPx=" + this.orderPx + ", triggerPxType=" + this.triggerPxType + ", proposedPx=" + this.proposedPx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.triggerPx);
        parcel.writeString(this.orderPx);
        parcel.writeString(this.triggerPxType);
        parcel.writeString(this.proposedPx);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TriggerStrategyOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TriggerStrategyOrderReq> serializer() {
            return TriggerStrategyOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TriggerStrategyOrderReq(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TriggerStrategyOrderReq$$serializer.INSTANCE.getDescriptor());
        }
        this.triggerPx = str;
        this.orderPx = str2;
        this.triggerPxType = str3;
        if ((i & 8) == 0) {
            this.proposedPx = null;
        } else {
            this.proposedPx = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TriggerStrategyOrderReq triggerStrategyOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, triggerStrategyOrderReq.triggerPx);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, triggerStrategyOrderReq.orderPx);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, triggerStrategyOrderReq.triggerPxType);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && triggerStrategyOrderReq.proposedPx == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, triggerStrategyOrderReq.proposedPx);
    }

    public TriggerStrategyOrderReq(String str, String str2, String str3, String str4) {
        this.triggerPx = str;
        this.orderPx = str2;
        this.triggerPxType = str3;
        this.proposedPx = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:647) call: com.okinc.unify_trade.biz.TriggerStrategyOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TriggerStrategyOrderReq(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
