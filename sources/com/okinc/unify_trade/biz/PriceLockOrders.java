package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class PriceLockOrders {
    private String buy;
    private String count;
    private String sell;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuy() {
        return this.buy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSell() {
        return this.sell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.buy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.count = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSell(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sell = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    public PriceLockOrders() {
        this.type = "";
        this.count = "";
        this.buy = "";
        this.sell = "";
    }

    public /* synthetic */ PriceLockOrders(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.count = "";
        } else {
            this.count = str2;
        }
        if ((i & 4) == 0) {
            this.buy = "";
        } else {
            this.buy = str3;
        }
        if ((i & 8) == 0) {
            this.sell = "";
        } else {
            this.sell = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PriceLockOrders priceLockOrders, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) priceLockOrders.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, priceLockOrders.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) priceLockOrders.count, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, priceLockOrders.count);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) priceLockOrders.buy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, priceLockOrders.buy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) priceLockOrders.sell, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, priceLockOrders.sell);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PriceLockOrders.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PriceLockOrders> serializer() {
            return PriceLockOrders$$serializer.INSTANCE;
        }
    }
}
