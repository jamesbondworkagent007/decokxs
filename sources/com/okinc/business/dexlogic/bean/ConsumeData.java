package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class ConsumeData<T> {
    private static final SerialDescriptor $cachedDescriptor;
    private final T data;
    private boolean needConsume;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final T component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final boolean component2() {
        return this.needConsume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.bean.ConsumeData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsumeData copy$default(ConsumeData consumeData, Object obj, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = consumeData.data;
        }
        if ((i & 2) != 0) {
            z = consumeData.needConsume;
        }
        return consumeData.copy(obj, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<T> canNotConsume() {
        this.needConsume = false;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T consumeData() {
        T t = this.needConsume ? this.data : null;
        this.needConsume = false;
        return t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<T> copy(T t, boolean z) {
        return new ConsumeData<>(t, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumeData)) {
            return false;
        }
        ConsumeData consumeData = (ConsumeData) obj;
        return Intrinsics.EZpvd(this.data, consumeData.data) && this.needConsume == consumeData.needConsume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hasConsume() {
        return !this.needConsume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        T t = this.data;
        return ((t == null ? 0 : t.hashCode()) * 31) + Boolean.hashCode(this.needConsume);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<T> needConsume() {
        this.needConsume = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConsumeData(data=" + this.data + ", needConsume=" + this.needConsume + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.ConsumeData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> KSerializer<ConsumeData<T>> serializer(@NotNull KSerializer<T> kSerializer) {
            Intrinsics.checkNotNullParameter(kSerializer, "");
            return new ConsumeData$$serializer(kSerializer);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.ConsumeData", null, 2);
        pluginGeneratedSerialDescriptor.addElement("data", false);
        pluginGeneratedSerialDescriptor.addElement("needConsume", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ConsumeData(int i, Object obj, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, $cachedDescriptor);
        }
        this.data = obj;
        if ((i & 2) == 0) {
            this.needConsume = true;
        } else {
            this.needConsume = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ConsumeData consumeData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializer, consumeData.data);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && consumeData.needConsume) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, consumeData.needConsume);
    }

    public ConsumeData(T t, boolean z) {
        this.data = t;
        this.needConsume = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Object)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(T, boolean):void (m)] (LINE:11) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean):void type: THIS */
    public /* synthetic */ ConsumeData(Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? true : z);
    }
}
