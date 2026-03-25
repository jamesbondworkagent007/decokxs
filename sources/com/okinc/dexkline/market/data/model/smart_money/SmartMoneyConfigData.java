package com.okinc.dexkline.market.data.model.smart_money;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SmartMoneyConfigData {
    public final List<Chain> chains;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(Chain$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartMoneyConfigData() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.dexkline.market.data.model.smart_money.SmartMoneyConfigData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartMoneyConfigData copy$default(SmartMoneyConfigData smartMoneyConfigData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = smartMoneyConfigData.chains;
        }
        return smartMoneyConfigData.KWHzl(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartMoneyConfigData KWHzl(@NotNull List<Chain> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SmartMoneyConfigData(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SmartMoneyConfigData) && Intrinsics.EZpvd(this.chains, ((SmartMoneyConfigData) obj).chains);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.chains.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartMoneyConfigData(chains=" + this.chains + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.smart_money.SmartMoneyConfigData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartMoneyConfigData> serializer() {
            return SmartMoneyConfigData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartMoneyConfigData(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chains = yDY.AhwBna();
        } else {
            this.chains = list;
        }
    }

    public static final /* synthetic */ void OLrzqt(SmartMoneyConfigData smartMoneyConfigData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(smartMoneyConfigData.chains, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], smartMoneyConfigData.chains);
    }

    public SmartMoneyConfigData(@NotNull List<Chain> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chains = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.dexkline.market.data.model.smart_money.Chain>):void (m)] (LINE:8) call: com.okinc.dexkline.market.data.model.smart_money.SmartMoneyConfigData.<init>(java.util.List):void type: THIS */
    public /* synthetic */ SmartMoneyConfigData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
