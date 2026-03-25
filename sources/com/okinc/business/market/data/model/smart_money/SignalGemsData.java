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
public final class SignalGemsData {
    public final List<SignalGemItemData> signalGemsList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SignalGemItemData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalGemsData() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.smart_money.SignalGemsData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalGemsData copy$default(SignalGemsData signalGemsData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signalGemsData.signalGemsList;
        }
        return signalGemsData.EZpvd(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalGemsData EZpvd(@NotNull List<SignalGemItemData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SignalGemsData(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalGemItemData> copydefault() {
        return this.signalGemsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SignalGemsData) && Intrinsics.EZpvd(this.signalGemsList, ((SignalGemsData) obj).signalGemsList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.signalGemsList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalGemsData(signalGemsList=" + this.signalGemsList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalGemsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalGemsData> serializer() {
            return SignalGemsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalGemsData(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.signalGemsList = yDY.AhwBna();
        } else {
            this.signalGemsList = list;
        }
    }

    public static final /* synthetic */ void OLrzqt(SignalGemsData signalGemsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(signalGemsData.signalGemsList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], signalGemsData.signalGemsList);
    }

    public SignalGemsData(@NotNull List<SignalGemItemData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.signalGemsList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.data.model.smart_money.SignalGemItemData>):void (m)] (LINE:12) call: com.okinc.business.market.data.model.smart_money.SignalGemsData.<init>(java.util.List):void type: THIS */
    public /* synthetic */ SignalGemsData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
