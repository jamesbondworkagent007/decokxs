package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam;
import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TradeOrderGroupData implements Parcelable {
    private ArrayList<TradeOrderStopParam> attachSp;
    private final BaseTradeOrderReq base;
    private OptionalTradeOrderReq optional;
    private TradeOrderSpReq sp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeOrderGroupData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(TradeOrderStopParam$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<TradeOrderGroupData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeOrderGroupData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            BaseTradeOrderReq baseTradeOrderReqCreateFromParcel = BaseTradeOrderReq.CREATOR.createFromParcel(parcel);
            ArrayList arrayList = null;
            OptionalTradeOrderReq optionalTradeOrderReqCreateFromParcel = parcel.readInt() == 0 ? null : OptionalTradeOrderReq.CREATOR.createFromParcel(parcel);
            TradeOrderSpReq tradeOrderSpReqCreateFromParcel = parcel.readInt() == 0 ? null : TradeOrderSpReq.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(TradeOrderStopParam.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new TradeOrderGroupData(baseTradeOrderReqCreateFromParcel, optionalTradeOrderReqCreateFromParcel, tradeOrderSpReqCreateFromParcel, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeOrderGroupData[] newArray(int i) {
            return new TradeOrderGroupData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.TradeOrderGroupData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradeOrderGroupData copy$default(TradeOrderGroupData tradeOrderGroupData, BaseTradeOrderReq baseTradeOrderReq, OptionalTradeOrderReq optionalTradeOrderReq, TradeOrderSpReq tradeOrderSpReq, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            baseTradeOrderReq = tradeOrderGroupData.base;
        }
        if ((i & 2) != 0) {
            optionalTradeOrderReq = tradeOrderGroupData.optional;
        }
        if ((i & 4) != 0) {
            tradeOrderSpReq = tradeOrderGroupData.sp;
        }
        if ((i & 8) != 0) {
            arrayList = tradeOrderGroupData.attachSp;
        }
        return tradeOrderGroupData.copy(baseTradeOrderReq, optionalTradeOrderReq, tradeOrderSpReq, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseTradeOrderReq component1() {
        return this.base;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionalTradeOrderReq component2() {
        return this.optional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeOrderSpReq component3() {
        return this.sp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TradeOrderStopParam> component4() {
        return this.attachSp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeOrderGroupData copy(@NotNull BaseTradeOrderReq baseTradeOrderReq, OptionalTradeOrderReq optionalTradeOrderReq, TradeOrderSpReq tradeOrderSpReq, ArrayList<TradeOrderStopParam> arrayList) {
        Intrinsics.checkNotNullParameter(baseTradeOrderReq, "");
        return new TradeOrderGroupData(baseTradeOrderReq, optionalTradeOrderReq, tradeOrderSpReq, arrayList);
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
        if (!(obj instanceof TradeOrderGroupData)) {
            return false;
        }
        TradeOrderGroupData tradeOrderGroupData = (TradeOrderGroupData) obj;
        return Intrinsics.EZpvd(this.base, tradeOrderGroupData.base) && Intrinsics.EZpvd(this.optional, tradeOrderGroupData.optional) && Intrinsics.EZpvd(this.sp, tradeOrderGroupData.sp) && Intrinsics.EZpvd(this.attachSp, tradeOrderGroupData.attachSp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TradeOrderStopParam> getAttachSp() {
        return this.attachSp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseTradeOrderReq getBase() {
        return this.base;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionalTradeOrderReq getOptional() {
        return this.optional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeOrderSpReq getSp() {
        return this.sp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.base.hashCode();
        OptionalTradeOrderReq optionalTradeOrderReq = this.optional;
        int iHashCode2 = optionalTradeOrderReq == null ? 0 : optionalTradeOrderReq.hashCode();
        TradeOrderSpReq tradeOrderSpReq = this.sp;
        int iHashCode3 = tradeOrderSpReq == null ? 0 : tradeOrderSpReq.hashCode();
        ArrayList<TradeOrderStopParam> arrayList = this.attachSp;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachSp(ArrayList<TradeOrderStopParam> arrayList) {
        this.attachSp = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOptional(OptionalTradeOrderReq optionalTradeOrderReq) {
        this.optional = optionalTradeOrderReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSp(TradeOrderSpReq tradeOrderSpReq) {
        this.sp = tradeOrderSpReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeOrderGroupData(base=" + this.base + ", optional=" + this.optional + ", sp=" + this.sp + ", attachSp=" + this.attachSp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.base.writeToParcel(parcel, i);
        OptionalTradeOrderReq optionalTradeOrderReq = this.optional;
        if (optionalTradeOrderReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            optionalTradeOrderReq.writeToParcel(parcel, i);
        }
        TradeOrderSpReq tradeOrderSpReq = this.sp;
        if (tradeOrderSpReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradeOrderSpReq.writeToParcel(parcel, i);
        }
        ArrayList<TradeOrderStopParam> arrayList = this.attachSp;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<TradeOrderStopParam> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeOrderGroupData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeOrderGroupData> serializer() {
            return TradeOrderGroupData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeOrderGroupData(int i, BaseTradeOrderReq baseTradeOrderReq, OptionalTradeOrderReq optionalTradeOrderReq, TradeOrderSpReq tradeOrderSpReq, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, TradeOrderGroupData$$serializer.INSTANCE.getDescriptor());
        }
        this.base = baseTradeOrderReq;
        if ((i & 2) == 0) {
            this.optional = null;
        } else {
            this.optional = optionalTradeOrderReq;
        }
        if ((i & 4) == 0) {
            this.sp = null;
        } else {
            this.sp = tradeOrderSpReq;
        }
        if ((i & 8) == 0) {
            this.attachSp = null;
        } else {
            this.attachSp = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeOrderGroupData tradeOrderGroupData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, BaseTradeOrderReq$$serializer.INSTANCE, tradeOrderGroupData.base);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradeOrderGroupData.optional != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, OptionalTradeOrderReq$$serializer.INSTANCE, tradeOrderGroupData.optional);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tradeOrderGroupData.sp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, TradeOrderSpReq$$serializer.INSTANCE, tradeOrderGroupData.sp);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && tradeOrderGroupData.attachSp == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], tradeOrderGroupData.attachSp);
    }

    public TradeOrderGroupData(@NotNull BaseTradeOrderReq baseTradeOrderReq, OptionalTradeOrderReq optionalTradeOrderReq, TradeOrderSpReq tradeOrderSpReq, ArrayList<TradeOrderStopParam> arrayList) {
        Intrinsics.checkNotNullParameter(baseTradeOrderReq, "");
        this.base = baseTradeOrderReq;
        this.optional = optionalTradeOrderReq;
        this.sp = tradeOrderSpReq;
        this.attachSp = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 com.okinc.unify_trade.biz.BaseTradeOrderReq)
  (wrap:com.okinc.unify_trade.biz.OptionalTradeOrderReq:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.OptionalTradeOrderReq) : (r3v0 com.okinc.unify_trade.biz.OptionalTradeOrderReq))
  (wrap:com.okinc.unify_trade.biz.TradeOrderSpReq:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TradeOrderSpReq) : (r4v0 com.okinc.unify_trade.biz.TradeOrderSpReq))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r5v0 java.util.ArrayList))
 A[MD:(com.okinc.unify_trade.biz.BaseTradeOrderReq, com.okinc.unify_trade.biz.OptionalTradeOrderReq, com.okinc.unify_trade.biz.TradeOrderSpReq, java.util.ArrayList<com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam>):void (m)] (LINE:76) call: com.okinc.unify_trade.biz.TradeOrderGroupData.<init>(com.okinc.unify_trade.biz.BaseTradeOrderReq, com.okinc.unify_trade.biz.OptionalTradeOrderReq, com.okinc.unify_trade.biz.TradeOrderSpReq, java.util.ArrayList):void type: THIS */
    public /* synthetic */ TradeOrderGroupData(BaseTradeOrderReq baseTradeOrderReq, OptionalTradeOrderReq optionalTradeOrderReq, TradeOrderSpReq tradeOrderSpReq, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseTradeOrderReq, (i & 2) != 0 ? null : optionalTradeOrderReq, (i & 4) != 0 ? null : tradeOrderSpReq, (i & 8) != 0 ? null : arrayList);
    }
}
