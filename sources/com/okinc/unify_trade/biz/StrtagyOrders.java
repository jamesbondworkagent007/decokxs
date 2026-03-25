package com.okinc.unify_trade.biz;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrtagyOrders {
    private static final KSerializer<Object>[] $childSerializers;
    private final Map<String, String> baseCoins;
    private String ordType;
    private String orderAmt;
    private final String pinCnt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getBaseCoins() {
        return this.baseCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderAmt() {
        return this.orderAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPinCnt() {
        return this.pinCnt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderAmt = str;
    }

    public StrtagyOrders() {
        this.ordType = "";
        this.orderAmt = "";
        this.pinCnt = "0";
        this.baseCoins = C56424yEw.KWHzl();
    }

    public /* synthetic */ StrtagyOrders(int i, String str, String str2, String str3, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str;
        }
        if ((i & 2) == 0) {
            this.orderAmt = "";
        } else {
            this.orderAmt = str2;
        }
        if ((i & 4) == 0) {
            this.pinCnt = "0";
        } else {
            this.pinCnt = str3;
        }
        if ((i & 8) == 0) {
            this.baseCoins = C56424yEw.KWHzl();
        } else {
            this.baseCoins = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrtagyOrders strtagyOrders, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strtagyOrders.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strtagyOrders.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strtagyOrders.orderAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strtagyOrders.orderAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strtagyOrders.pinCnt, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strtagyOrders.pinCnt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(strtagyOrders.baseCoins, C56424yEw.KWHzl())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], strtagyOrders.baseCoins);
    }

    public String toString() {
        return "StrtagyOrders(ordType='" + this.ordType + "', orderAmt='" + this.orderAmt + "')";
    }

    public static final class Companion {

        public static final class ActionBar extends TypeToken<List<? extends StrtagyOrders>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrtagyOrders.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StrtagyOrders> serializer() {
            return StrtagyOrders$$serializer.INSTANCE;
        }

        public final List<StrtagyOrders> EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List<StrtagyOrders> list = (List) new Gson().fromJson(str, new ActionBar().getType());
                if (list == null) {
                    return list;
                }
                list.isEmpty();
                return list;
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "OrderPositions-jsonConvert" + e.getMessage());
                return null;
            }
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }
}
