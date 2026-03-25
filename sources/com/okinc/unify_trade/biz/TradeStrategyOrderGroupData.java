package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam;
import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
public final class TradeStrategyOrderGroupData implements Parcelable {
    private List<TradeOrderStopParam> attachSp;
    private final BaseTradeStrategyOrderReq req;
    private TradeOrderSpReq sp;
    private final TriggerStrategyOrderReq trigger;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeStrategyOrderGroupData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(TradeOrderStopParam$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<TradeStrategyOrderGroupData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeStrategyOrderGroupData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            BaseTradeStrategyOrderReq baseTradeStrategyOrderReqCreateFromParcel = BaseTradeStrategyOrderReq.CREATOR.createFromParcel(parcel);
            ArrayList arrayList = null;
            TriggerStrategyOrderReq triggerStrategyOrderReqCreateFromParcel = parcel.readInt() == 0 ? null : TriggerStrategyOrderReq.CREATOR.createFromParcel(parcel);
            TradeOrderSpReq tradeOrderSpReqCreateFromParcel = parcel.readInt() == 0 ? null : TradeOrderSpReq.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(TradeOrderStopParam.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new TradeStrategyOrderGroupData(baseTradeStrategyOrderReqCreateFromParcel, triggerStrategyOrderReqCreateFromParcel, tradeOrderSpReqCreateFromParcel, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeStrategyOrderGroupData[] newArray(int i) {
            return new TradeStrategyOrderGroupData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.TradeStrategyOrderGroupData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradeStrategyOrderGroupData copy$default(TradeStrategyOrderGroupData tradeStrategyOrderGroupData, BaseTradeStrategyOrderReq baseTradeStrategyOrderReq, TriggerStrategyOrderReq triggerStrategyOrderReq, TradeOrderSpReq tradeOrderSpReq, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            baseTradeStrategyOrderReq = tradeStrategyOrderGroupData.req;
        }
        if ((i & 2) != 0) {
            triggerStrategyOrderReq = tradeStrategyOrderGroupData.trigger;
        }
        if ((i & 4) != 0) {
            tradeOrderSpReq = tradeStrategyOrderGroupData.sp;
        }
        if ((i & 8) != 0) {
            list = tradeStrategyOrderGroupData.attachSp;
        }
        return tradeStrategyOrderGroupData.copy(baseTradeStrategyOrderReq, triggerStrategyOrderReq, tradeOrderSpReq, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseTradeStrategyOrderReq component1() {
        return this.req;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TriggerStrategyOrderReq component2() {
        return this.trigger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeOrderSpReq component3() {
        return this.sp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeOrderStopParam> component4() {
        return this.attachSp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStrategyOrderGroupData copy(@NotNull BaseTradeStrategyOrderReq baseTradeStrategyOrderReq, TriggerStrategyOrderReq triggerStrategyOrderReq, TradeOrderSpReq tradeOrderSpReq, List<TradeOrderStopParam> list) {
        Intrinsics.checkNotNullParameter(baseTradeStrategyOrderReq, "");
        return new TradeStrategyOrderGroupData(baseTradeStrategyOrderReq, triggerStrategyOrderReq, tradeOrderSpReq, list);
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
        if (!(obj instanceof TradeStrategyOrderGroupData)) {
            return false;
        }
        TradeStrategyOrderGroupData tradeStrategyOrderGroupData = (TradeStrategyOrderGroupData) obj;
        return Intrinsics.EZpvd(this.req, tradeStrategyOrderGroupData.req) && Intrinsics.EZpvd(this.trigger, tradeStrategyOrderGroupData.trigger) && Intrinsics.EZpvd(this.sp, tradeStrategyOrderGroupData.sp) && Intrinsics.EZpvd(this.attachSp, tradeStrategyOrderGroupData.attachSp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeOrderStopParam> getAttachSp() {
        return this.attachSp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseTradeStrategyOrderReq getReq() {
        return this.req;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeOrderSpReq getSp() {
        return this.sp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TriggerStrategyOrderReq getTrigger() {
        return this.trigger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.req.hashCode();
        TriggerStrategyOrderReq triggerStrategyOrderReq = this.trigger;
        int iHashCode2 = triggerStrategyOrderReq == null ? 0 : triggerStrategyOrderReq.hashCode();
        TradeOrderSpReq tradeOrderSpReq = this.sp;
        int iHashCode3 = tradeOrderSpReq == null ? 0 : tradeOrderSpReq.hashCode();
        List<TradeOrderStopParam> list = this.attachSp;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachSp(List<TradeOrderStopParam> list) {
        this.attachSp = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSp(TradeOrderSpReq tradeOrderSpReq) {
        this.sp = tradeOrderSpReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeStrategyOrderGroupData(req=" + this.req + ", trigger=" + this.trigger + ", sp=" + this.sp + ", attachSp=" + this.attachSp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.req.writeToParcel(parcel, i);
        TriggerStrategyOrderReq triggerStrategyOrderReq = this.trigger;
        if (triggerStrategyOrderReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            triggerStrategyOrderReq.writeToParcel(parcel, i);
        }
        TradeOrderSpReq tradeOrderSpReq = this.sp;
        if (tradeOrderSpReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradeOrderSpReq.writeToParcel(parcel, i);
        }
        List<TradeOrderStopParam> list = this.attachSp;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<TradeOrderStopParam> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeStrategyOrderGroupData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeStrategyOrderGroupData> serializer() {
            return TradeStrategyOrderGroupData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeStrategyOrderGroupData(int i, BaseTradeStrategyOrderReq baseTradeStrategyOrderReq, TriggerStrategyOrderReq triggerStrategyOrderReq, TradeOrderSpReq tradeOrderSpReq, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, TradeStrategyOrderGroupData$$serializer.INSTANCE.getDescriptor());
        }
        this.req = baseTradeStrategyOrderReq;
        if ((i & 2) == 0) {
            this.trigger = null;
        } else {
            this.trigger = triggerStrategyOrderReq;
        }
        if ((i & 4) == 0) {
            this.sp = null;
        } else {
            this.sp = tradeOrderSpReq;
        }
        if ((i & 8) == 0) {
            this.attachSp = null;
        } else {
            this.attachSp = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeStrategyOrderGroupData tradeStrategyOrderGroupData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, BaseTradeStrategyOrderReq$$serializer.INSTANCE, tradeStrategyOrderGroupData.req);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradeStrategyOrderGroupData.trigger != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, TriggerStrategyOrderReq$$serializer.INSTANCE, tradeStrategyOrderGroupData.trigger);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tradeStrategyOrderGroupData.sp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, TradeOrderSpReq$$serializer.INSTANCE, tradeStrategyOrderGroupData.sp);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && tradeStrategyOrderGroupData.attachSp == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], tradeStrategyOrderGroupData.attachSp);
    }

    public TradeStrategyOrderGroupData(@NotNull BaseTradeStrategyOrderReq baseTradeStrategyOrderReq, TriggerStrategyOrderReq triggerStrategyOrderReq, TradeOrderSpReq tradeOrderSpReq, List<TradeOrderStopParam> list) {
        Intrinsics.checkNotNullParameter(baseTradeStrategyOrderReq, "");
        this.req = baseTradeStrategyOrderReq;
        this.trigger = triggerStrategyOrderReq;
        this.sp = tradeOrderSpReq;
        this.attachSp = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 com.okinc.unify_trade.biz.BaseTradeStrategyOrderReq)
  (wrap:com.okinc.unify_trade.biz.TriggerStrategyOrderReq:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TriggerStrategyOrderReq) : (r3v0 com.okinc.unify_trade.biz.TriggerStrategyOrderReq))
  (wrap:com.okinc.unify_trade.biz.TradeOrderSpReq:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TradeOrderSpReq) : (r4v0 com.okinc.unify_trade.biz.TradeOrderSpReq))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(com.okinc.unify_trade.biz.BaseTradeStrategyOrderReq, com.okinc.unify_trade.biz.TriggerStrategyOrderReq, com.okinc.unify_trade.biz.TradeOrderSpReq, java.util.List<com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam>):void (m)] (LINE:86) call: com.okinc.unify_trade.biz.TradeStrategyOrderGroupData.<init>(com.okinc.unify_trade.biz.BaseTradeStrategyOrderReq, com.okinc.unify_trade.biz.TriggerStrategyOrderReq, com.okinc.unify_trade.biz.TradeOrderSpReq, java.util.List):void type: THIS */
    public /* synthetic */ TradeStrategyOrderGroupData(BaseTradeStrategyOrderReq baseTradeStrategyOrderReq, TriggerStrategyOrderReq triggerStrategyOrderReq, TradeOrderSpReq tradeOrderSpReq, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseTradeStrategyOrderReq, (i & 2) != 0 ? null : triggerStrategyOrderReq, (i & 4) != 0 ? null : tradeOrderSpReq, (i & 8) != 0 ? null : list);
    }
}
