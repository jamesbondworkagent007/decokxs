package com.okinc.business.trade.features.home.ui.autosell.data;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TPSLRemoteConfigResponse {
    private final List<TPSLConfigItem> result;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TPSLConfigItem$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TPSLRemoteConfigResponse() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.trade.features.home.ui.autosell.data.TPSLRemoteConfigResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TPSLRemoteConfigResponse copy$default(TPSLRemoteConfigResponse tPSLRemoteConfigResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tPSLRemoteConfigResponse.result;
        }
        return tPSLRemoteConfigResponse.copy(list);
    }

    @SerialName("result")
    public static /* synthetic */ void getResult$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TPSLConfigItem> component1() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TPSLRemoteConfigResponse copy(@NotNull List<TPSLConfigItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TPSLRemoteConfigResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TPSLRemoteConfigResponse) && Intrinsics.EZpvd(this.result, ((TPSLRemoteConfigResponse) obj).result);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TPSLConfigItem> getResult() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.result.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TPSLRemoteConfigResponse(result=" + this.result + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.autosell.data.TPSLRemoteConfigResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TPSLRemoteConfigResponse> serializer() {
            return TPSLRemoteConfigResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TPSLRemoteConfigResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.result = yDY.AhwBna();
        } else {
            this.result = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TPSLRemoteConfigResponse tPSLRemoteConfigResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(tPSLRemoteConfigResponse.result, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], tPSLRemoteConfigResponse.result);
    }

    public TPSLRemoteConfigResponse(@NotNull List<TPSLConfigItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.result = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.trade.features.home.ui.autosell.data.TPSLConfigItem>):void (m)] (LINE:13) call: com.okinc.business.trade.features.home.ui.autosell.data.TPSLRemoteConfigResponse.<init>(java.util.List):void type: THIS */
    public /* synthetic */ TPSLRemoteConfigResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
