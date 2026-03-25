package com.okinc.unify_trade.biz;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class OrderPositions {
    private String balAmt;
    private String orderAmt;
    private ArrayList<StrtagyOrders> orderTypeData;
    private String posAmt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StrtagyOrders$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalAmt() {
        return this.balAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderAmt() {
        return this.orderAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<StrtagyOrders> getOrderTypeData() {
        return this.orderTypeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosAmt() {
        return this.posAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderTypeData(ArrayList<StrtagyOrders> arrayList) {
        this.orderTypeData = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posAmt = str;
    }

    public OrderPositions() {
        this.posAmt = "";
        this.orderAmt = "";
        this.balAmt = "";
    }

    public /* synthetic */ OrderPositions(int i, String str, String str2, String str3, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.posAmt = "";
        } else {
            this.posAmt = str;
        }
        if ((i & 2) == 0) {
            this.orderAmt = "";
        } else {
            this.orderAmt = str2;
        }
        if ((i & 4) == 0) {
            this.balAmt = "";
        } else {
            this.balAmt = str3;
        }
        if ((i & 8) == 0) {
            this.orderTypeData = null;
        } else {
            this.orderTypeData = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OrderPositions orderPositions, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderPositions.posAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderPositions.posAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) orderPositions.orderAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, orderPositions.orderAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orderPositions.balAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, orderPositions.balAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && orderPositions.orderTypeData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], orderPositions.orderTypeData);
    }

    public String toString() {
        return "OrderPositions(posAmt='" + this.posAmt + "', orderAmt='" + this.orderAmt + "', balAmt='" + this.balAmt + "', orderTypeData=" + this.orderTypeData + ")";
    }

    public static final class Companion {

        public static final class TaskDescription extends TypeToken<List<? extends OrderPositions>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OrderPositions.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderPositions> serializer() {
            return OrderPositions$$serializer.INSTANCE;
        }

        public final OrderPositions KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List list = (List) new Gson().fromJson(str, new TaskDescription().getType());
                if (list != null && !list.isEmpty()) {
                    return (OrderPositions) list.get(0);
                }
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "OrderPositions-jsonConvert" + e.getMessage());
            }
            return null;
        }
    }
}
