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
public final class Contract {
    private Parameter parameter;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Contract() {
        this((Parameter) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Contract copy$default(Contract contract, Parameter parameter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            parameter = contract.parameter;
        }
        if ((i & 2) != 0) {
            str = contract.type;
        }
        return contract.copy(parameter, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Parameter component1() {
        return this.parameter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Contract copy(Parameter parameter, String str) {
        return new Contract(parameter, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contract)) {
            return false;
        }
        Contract contract = (Contract) obj;
        return Intrinsics.EZpvd(this.parameter, contract.parameter) && Intrinsics.EZpvd((Object) this.type, (Object) contract.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Parameter getParameter() {
        return this.parameter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Parameter parameter = this.parameter;
        int iHashCode = parameter == null ? 0 : parameter.hashCode();
        String str = this.type;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Contract(parameter=" + this.parameter + ", type=" + this.type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.Contract.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Contract> serializer() {
            return Contract$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Contract(int i, Parameter parameter, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.parameter = null;
        } else {
            this.parameter = parameter;
        }
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(Contract contract, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || contract.parameter != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, Parameter$$serializer.INSTANCE, contract.parameter);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && contract.type == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, contract.type);
    }

    public Contract(Parameter parameter, String str) {
        this.parameter = parameter;
        this.type = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.api.bean.Parameter:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.Parameter) : (r2v0 com.okinc.business.defi.api.bean.Parameter))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(com.okinc.business.defi.api.bean.Parameter, java.lang.String):void (m)] (LINE:412) call: com.okinc.business.defi.api.bean.Contract.<init>(com.okinc.business.defi.api.bean.Parameter, java.lang.String):void type: THIS */
    public /* synthetic */ Contract(Parameter parameter, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : parameter, (i & 2) != 0 ? null : str);
    }
}
