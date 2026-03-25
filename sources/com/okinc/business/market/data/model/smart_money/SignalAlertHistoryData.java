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
public final class SignalAlertHistoryData {
    public final String maxIncreasePercentage;
    public final List<SignalAlertItemData> signals;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SignalAlertItemData$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalAlertHistoryData() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.smart_money.SignalAlertHistoryData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalAlertHistoryData copy$default(SignalAlertHistoryData signalAlertHistoryData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signalAlertHistoryData.signals;
        }
        if ((i & 2) != 0) {
            str = signalAlertHistoryData.maxIncreasePercentage;
        }
        return signalAlertHistoryData.EZpvd(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalAlertHistoryData EZpvd(@NotNull List<SignalAlertItemData> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new SignalAlertHistoryData(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.maxIncreasePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalAlertItemData> copydefault() {
        return this.signals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalAlertHistoryData)) {
            return false;
        }
        SignalAlertHistoryData signalAlertHistoryData = (SignalAlertHistoryData) obj;
        return Intrinsics.EZpvd(this.signals, signalAlertHistoryData.signals) && Intrinsics.EZpvd((Object) this.maxIncreasePercentage, (Object) signalAlertHistoryData.maxIncreasePercentage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.signals.hashCode() * 31) + this.maxIncreasePercentage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalAlertHistoryData(signals=" + this.signals + ", maxIncreasePercentage=" + this.maxIncreasePercentage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalAlertHistoryData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalAlertHistoryData> serializer() {
            return SignalAlertHistoryData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalAlertHistoryData(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.signals = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.maxIncreasePercentage = "0";
        } else {
            this.maxIncreasePercentage = str;
        }
    }

    public static final /* synthetic */ void EZpvd(SignalAlertHistoryData signalAlertHistoryData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(signalAlertHistoryData.signals, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], signalAlertHistoryData.signals);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) signalAlertHistoryData.maxIncreasePercentage, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, signalAlertHistoryData.maxIncreasePercentage);
    }

    public SignalAlertHistoryData(@NotNull List<SignalAlertItemData> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.signals = list;
        this.maxIncreasePercentage = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r1v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r2v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.market.data.model.smart_money.SignalAlertItemData>, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.data.model.smart_money.SignalAlertHistoryData.<init>(java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ SignalAlertHistoryData(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "0" : str);
    }
}
