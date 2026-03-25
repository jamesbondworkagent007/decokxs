package com.okinc.business.market.data.model.smart_money;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SignalOverviewAddressResponse {
    public final List<SignalOverviewAddressData> items;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SignalOverviewAddressData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalOverviewAddressResponse() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.smart_money.SignalOverviewAddressResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalOverviewAddressResponse copy$default(SignalOverviewAddressResponse signalOverviewAddressResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signalOverviewAddressResponse.items;
        }
        return signalOverviewAddressResponse.OLrzqt(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalOverviewAddressData> AEQbTJ() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalOverviewAddressResponse OLrzqt(@NotNull List<SignalOverviewAddressData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SignalOverviewAddressResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SignalOverviewAddressResponse) && Intrinsics.EZpvd(this.items, ((SignalOverviewAddressResponse) obj).items);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.items.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalOverviewAddressResponse(items=" + this.items + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalOverviewAddressResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalOverviewAddressResponse> serializer() {
            return SignalOverviewAddressResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalOverviewAddressResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.items = yDY.AhwBna();
        } else {
            this.items = list;
        }
    }

    public static final /* synthetic */ void KWHzl(SignalOverviewAddressResponse signalOverviewAddressResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(signalOverviewAddressResponse.items, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], signalOverviewAddressResponse.items);
    }

    public SignalOverviewAddressResponse(@NotNull List<SignalOverviewAddressData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:23)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.data.model.smart_money.SignalOverviewAddressData>):void (m)] (LINE:21) call: com.okinc.business.market.data.model.smart_money.SignalOverviewAddressResponse.<init>(java.util.List):void type: THIS */
    public /* synthetic */ SignalOverviewAddressResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
