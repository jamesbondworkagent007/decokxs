package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData$$serializer;
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
public final class OrdersPendingQueryVO implements Parcelable {
    private final String algoOrdersExist;
    private final ArrayList<TradeOrderData> tradeOrders;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrdersPendingQueryVO> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TradeOrderData$$serializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<OrdersPendingQueryVO> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrdersPendingQueryVO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TradeOrderData.CREATOR.createFromParcel(parcel));
            }
            return new OrdersPendingQueryVO(arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrdersPendingQueryVO[] newArray(int i) {
            return new OrdersPendingQueryVO[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.OrdersPendingQueryVO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrdersPendingQueryVO copy$default(OrdersPendingQueryVO ordersPendingQueryVO, ArrayList arrayList, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = ordersPendingQueryVO.tradeOrders;
        }
        if ((i & 2) != 0) {
            str = ordersPendingQueryVO.algoOrdersExist;
        }
        return ordersPendingQueryVO.copy(arrayList, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TradeOrderData> component1() {
        return this.tradeOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.algoOrdersExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrdersPendingQueryVO copy(@NotNull ArrayList<TradeOrderData> arrayList, @NotNull String str) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new OrdersPendingQueryVO(arrayList, str);
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
        if (!(obj instanceof OrdersPendingQueryVO)) {
            return false;
        }
        OrdersPendingQueryVO ordersPendingQueryVO = (OrdersPendingQueryVO) obj;
        return Intrinsics.EZpvd(this.tradeOrders, ordersPendingQueryVO.tradeOrders) && Intrinsics.EZpvd((Object) this.algoOrdersExist, (Object) ordersPendingQueryVO.algoOrdersExist);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoOrdersExist() {
        return this.algoOrdersExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TradeOrderData> getTradeOrders() {
        return this.tradeOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.tradeOrders.hashCode() * 31) + this.algoOrdersExist.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrdersPendingQueryVO(tradeOrders=" + this.tradeOrders + ", algoOrdersExist=" + this.algoOrdersExist + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<TradeOrderData> arrayList = this.tradeOrders;
        parcel.writeInt(arrayList.size());
        Iterator<TradeOrderData> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.algoOrdersExist);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OrdersPendingQueryVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrdersPendingQueryVO> serializer() {
            return OrdersPendingQueryVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrdersPendingQueryVO(int i, ArrayList arrayList, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, OrdersPendingQueryVO$$serializer.INSTANCE.getDescriptor());
        }
        this.tradeOrders = arrayList;
        if ((i & 2) == 0) {
            this.algoOrdersExist = "";
        } else {
            this.algoOrdersExist = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OrdersPendingQueryVO ordersPendingQueryVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], ordersPendingQueryVO.tradeOrders);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) ordersPendingQueryVO.algoOrdersExist, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, ordersPendingQueryVO.algoOrdersExist);
    }

    public OrdersPendingQueryVO(@NotNull ArrayList<TradeOrderData> arrayList, @NotNull String str) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeOrders = arrayList;
        this.algoOrdersExist = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.util.ArrayList)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(java.util.ArrayList<com.okinc.unify_trade.biz.subscribe.TradeOrderData>, java.lang.String):void (m)] (LINE:36) call: com.okinc.unify_trade.biz.OrdersPendingQueryVO.<init>(java.util.ArrayList, java.lang.String):void type: THIS */
    public /* synthetic */ OrdersPendingQueryVO(ArrayList arrayList, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, (i & 2) != 0 ? "" : str);
    }
}
