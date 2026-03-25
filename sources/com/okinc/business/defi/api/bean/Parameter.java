package com.okinc.business.defi.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class Parameter {
    private String type_url;
    private Value value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Parameter() {
        this((String) null, (Value) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Parameter copy$default(Parameter parameter, String str, Value value, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parameter.type_url;
        }
        if ((i & 2) != 0) {
            value = parameter.value;
        }
        return parameter.copy(str, value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type_url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Value component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Parameter copy(String str, Value value) {
        return new Parameter(str, value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Parameter)) {
            return false;
        }
        Parameter parameter = (Parameter) obj;
        return Intrinsics.EZpvd((Object) this.type_url, (Object) parameter.type_url) && Intrinsics.EZpvd(this.value, parameter.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType_url() {
        return this.type_url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Value getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.type_url;
        int iHashCode = str == null ? 0 : str.hashCode();
        Value value = this.value;
        return (iHashCode * 31) + (value != null ? value.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType_url(String str) {
        this.type_url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(Value value) {
        this.value = value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Parameter(type_url=" + this.type_url + ", value=" + this.value + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.Parameter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Parameter> serializer() {
            return Parameter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Parameter(int i, String str, Value value, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type_url = null;
        } else {
            this.type_url = str;
        }
        if ((i & 2) == 0) {
            this.value = null;
        } else {
            this.value = value;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(Parameter parameter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || parameter.type_url != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, parameter.type_url);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && parameter.value == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, Value$$serializer.INSTANCE, parameter.value);
    }

    public Parameter(String str, Value value) {
        this.type_url = str;
        this.value = value;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.Value:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.Value) : (r3v0 com.okinc.business.defi.api.bean.Value))
 A[MD:(java.lang.String, com.okinc.business.defi.api.bean.Value):void (m)] (LINE:419) call: com.okinc.business.defi.api.bean.Parameter.<init>(java.lang.String, com.okinc.business.defi.api.bean.Value):void type: THIS */
    public /* synthetic */ Parameter(String str, Value value, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : value);
    }
}
