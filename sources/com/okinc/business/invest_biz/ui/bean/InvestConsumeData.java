package com.okinc.business.invest_biz.ui.bean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InvestConsumeData<T> {
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
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.bean.InvestConsumeData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestConsumeData copy$default(InvestConsumeData investConsumeData, Object obj, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = investConsumeData.data;
        }
        if ((i & 2) != 0) {
            z = investConsumeData.needConsume;
        }
        return investConsumeData.copy(obj, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestConsumeData<T> canNotConsume() {
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
    public final InvestConsumeData<T> copy(T t, boolean z) {
        return new InvestConsumeData<>(t, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestConsumeData)) {
            return false;
        }
        InvestConsumeData investConsumeData = (InvestConsumeData) obj;
        return Intrinsics.EZpvd(this.data, investConsumeData.data) && this.needConsume == investConsumeData.needConsume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hasConsume() {
        return this.needConsume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        T t = this.data;
        return ((t == null ? 0 : t.hashCode()) * 31) + Boolean.hashCode(this.needConsume);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestConsumeData<T> needConsume() {
        this.needConsume = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestConsumeData(data=" + this.data + ", needConsume=" + this.needConsume + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.bean.InvestConsumeData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> KSerializer<InvestConsumeData<T>> serializer(@NotNull KSerializer<T> kSerializer) {
            Intrinsics.checkNotNullParameter(kSerializer, "");
            return new InvestConsumeData$$serializer(kSerializer);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.ui.bean.InvestConsumeData", null, 2);
        pluginGeneratedSerialDescriptor.addElement("data", false);
        pluginGeneratedSerialDescriptor.addElement("needConsume", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ InvestConsumeData(int i, Object obj, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
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

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestConsumeData investConsumeData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializer, investConsumeData.data);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && investConsumeData.needConsume) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, investConsumeData.needConsume);
    }

    public InvestConsumeData(T t, boolean z) {
        this.data = t;
        this.needConsume = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Object)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(T, boolean):void (m)] (LINE:11) call: com.okinc.business.invest_biz.ui.bean.InvestConsumeData.<init>(java.lang.Object, boolean):void type: THIS */
    public /* synthetic */ InvestConsumeData(Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? true : z);
    }
}
