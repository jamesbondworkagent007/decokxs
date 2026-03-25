package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class MPBotEventResult {
    private List<MPBotEventData> operation;
    private String timeInterval;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(MPBotEventData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MPBotEventResult() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.MPBotEventResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MPBotEventResult copy$default(MPBotEventResult mPBotEventResult, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mPBotEventResult.timeInterval;
        }
        if ((i & 2) != 0) {
            list = mPBotEventResult.operation;
        }
        return mPBotEventResult.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MPBotEventData> component2() {
        return this.operation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPBotEventResult copy(String str, List<MPBotEventData> list) {
        return new MPBotEventResult(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MPBotEventResult)) {
            return false;
        }
        MPBotEventResult mPBotEventResult = (MPBotEventResult) obj;
        return Intrinsics.EZpvd((Object) this.timeInterval, (Object) mPBotEventResult.timeInterval) && Intrinsics.EZpvd(this.operation, mPBotEventResult.operation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MPBotEventData> getOperation() {
        return this.operation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeInterval() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.timeInterval;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<MPBotEventData> list = this.operation;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOperation(List<MPBotEventData> list) {
        this.operation = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeInterval(String str) {
        this.timeInterval = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MPBotEventResult(timeInterval=" + this.timeInterval + ", operation=" + this.operation + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MPBotEventResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MPBotEventResult> serializer() {
            return MPBotEventResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MPBotEventResult(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.timeInterval = null;
        } else {
            this.timeInterval = str;
        }
        if ((i & 2) == 0) {
            this.operation = null;
        } else {
            this.operation = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MPBotEventResult mPBotEventResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || mPBotEventResult.timeInterval != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, mPBotEventResult.timeInterval);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && mPBotEventResult.operation == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], mPBotEventResult.operation);
    }

    public MPBotEventResult(String str, List<MPBotEventData> list) {
        this.timeInterval = str;
        this.operation = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.biz.MPBotEventData>):void (m)] (LINE:2844) call: com.okinc.unify_trade.biz.MPBotEventResult.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ MPBotEventResult(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
