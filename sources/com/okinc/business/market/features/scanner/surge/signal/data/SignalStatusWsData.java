package com.okinc.business.market.features.scanner.surge.signal.data;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class SignalStatusWsData {
    public final JsonObject content;
    public final Type type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.features.scanner.surge.signal.data.SignalStatusWsData.Type", Type.values(), new String[]{"signalGems"}, new Annotation[][]{null}, null), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalStatusWsData() {
        this((Type) null, (JsonObject) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalStatusWsData copy$default(SignalStatusWsData signalStatusWsData, Type type, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            type = signalStatusWsData.type;
        }
        if ((i & 2) != 0) {
            jsonObject = signalStatusWsData.content;
        }
        return signalStatusWsData.OLrzqt(type, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject EZpvd() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Type KWHzl() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalStatusWsData OLrzqt(Type type, JsonObject jsonObject) {
        return new SignalStatusWsData(type, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalStatusWsData)) {
            return false;
        }
        SignalStatusWsData signalStatusWsData = (SignalStatusWsData) obj;
        return this.type == signalStatusWsData.type && Intrinsics.EZpvd(this.content, signalStatusWsData.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Type type = this.type;
        int iHashCode = type == null ? 0 : type.hashCode();
        JsonObject jsonObject = this.content;
        return (iHashCode * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalStatusWsData(type=" + this.type + ", content=" + this.content + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.scanner.surge.signal.data.SignalStatusWsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalStatusWsData> serializer() {
            return SignalStatusWsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalStatusWsData(int i, Type type, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = type;
        }
        if ((i & 2) == 0) {
            this.content = null;
        } else {
            this.content = jsonObject;
        }
    }

    public static final /* synthetic */ void KWHzl(SignalStatusWsData signalStatusWsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signalStatusWsData.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], signalStatusWsData.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && signalStatusWsData.content == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, JsonObjectSerializer.INSTANCE, signalStatusWsData.content);
    }

    public SignalStatusWsData(Type type, JsonObject jsonObject) {
        this.type = type;
        this.content = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.scanner.surge.signal.data.SignalStatusWsData$Type:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.scanner.surge.signal.data.SignalStatusWsData$Type) : (r2v0 com.okinc.business.market.features.scanner.surge.signal.data.SignalStatusWsData$Type))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r3v0 kotlinx.serialization.json.JsonObject))
 A[MD:(com.okinc.business.market.features.scanner.surge.signal.data.SignalStatusWsData$Type, kotlinx.serialization.json.JsonObject):void (m)] (LINE:51) call: com.okinc.business.market.features.scanner.surge.signal.data.SignalStatusWsData.<init>(com.okinc.business.market.features.scanner.surge.signal.data.SignalStatusWsData$Type, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ SignalStatusWsData(Type type, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : jsonObject);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @SerialName("signalGems")
        public static final Type SIGNAL_GEMS = new Type("SIGNAL_GEMS", 0);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Type[] $values() {
            return new Type[]{SIGNAL_GEMS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i) {
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}
