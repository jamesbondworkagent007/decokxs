package com.okinc.business.market.data.model.smart_money;

import com.okinc.business.market.data.model.common.DexTokenMeta;
import com.okinc.business.market.data.model.common.DexTokenMeta$$serializer;
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
public final class SignalAlertResponse {
    public final String deviceId;
    public final boolean isGeneralAlertSet;
    public final List<DexTokenMeta> tokens;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(DexTokenMeta$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalAlertResponse() {
        this((String) null, false, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.smart_money.SignalAlertResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalAlertResponse copy$default(SignalAlertResponse signalAlertResponse, String str, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signalAlertResponse.deviceId;
        }
        if ((i & 2) != 0) {
            z = signalAlertResponse.isGeneralAlertSet;
        }
        if ((i & 4) != 0) {
            list = signalAlertResponse.tokens;
        }
        return signalAlertResponse.copydefault(str, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.isGeneralAlertSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexTokenMeta> OLrzqt() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalAlertResponse copydefault(@NotNull String str, boolean z, @NotNull List<DexTokenMeta> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SignalAlertResponse(str, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalAlertResponse)) {
            return false;
        }
        SignalAlertResponse signalAlertResponse = (SignalAlertResponse) obj;
        return Intrinsics.EZpvd((Object) this.deviceId, (Object) signalAlertResponse.deviceId) && this.isGeneralAlertSet == signalAlertResponse.isGeneralAlertSet && Intrinsics.EZpvd(this.tokens, signalAlertResponse.tokens);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.deviceId.hashCode() * 31) + Boolean.hashCode(this.isGeneralAlertSet)) * 31) + this.tokens.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalAlertResponse(deviceId=" + this.deviceId + ", isGeneralAlertSet=" + this.isGeneralAlertSet + ", tokens=" + this.tokens + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalAlertResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalAlertResponse> serializer() {
            return SignalAlertResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalAlertResponse(int i, String str, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.deviceId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.isGeneralAlertSet = false;
        } else {
            this.isGeneralAlertSet = z;
        }
        if ((i & 4) == 0) {
            this.tokens = yDY.AhwBna();
        } else {
            this.tokens = list;
        }
    }

    public static final /* synthetic */ void KWHzl(SignalAlertResponse signalAlertResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) signalAlertResponse.deviceId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, signalAlertResponse.deviceId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalAlertResponse.isGeneralAlertSet) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, signalAlertResponse.isGeneralAlertSet);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(signalAlertResponse.tokens, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], signalAlertResponse.tokens);
    }

    public SignalAlertResponse(@NotNull String str, boolean z, @NotNull List<DexTokenMeta> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.deviceId = str;
        this.isGeneralAlertSet = z;
        this.tokens = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r3v0 java.util.List))
 A[MD:(java.lang.String, boolean, java.util.List<com.okinc.business.market.data.model.common.DexTokenMeta>):void (m)] (LINE:8) call: com.okinc.business.market.data.model.smart_money.SignalAlertResponse.<init>(java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ SignalAlertResponse(String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
