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
public final class SolDataFunction {
    private String data;
    private String methodName;
    private String programId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SolDataFunction() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SolDataFunction copy$default(SolDataFunction solDataFunction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = solDataFunction.data;
        }
        if ((i & 2) != 0) {
            str2 = solDataFunction.methodName;
        }
        if ((i & 4) != 0) {
            str3 = solDataFunction.programId;
        }
        return solDataFunction.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.methodName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.programId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolDataFunction copy(String str, String str2, String str3) {
        return new SolDataFunction(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolDataFunction)) {
            return false;
        }
        SolDataFunction solDataFunction = (SolDataFunction) obj;
        return Intrinsics.EZpvd((Object) this.data, (Object) solDataFunction.data) && Intrinsics.EZpvd((Object) this.methodName, (Object) solDataFunction.methodName) && Intrinsics.EZpvd((Object) this.programId, (Object) solDataFunction.programId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethodName() {
        return this.methodName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProgramId() {
        return this.programId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.data;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.methodName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.programId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(String str) {
        this.data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMethodName(String str) {
        this.methodName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProgramId(String str) {
        this.programId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SolDataFunction(data=" + this.data + ", methodName=" + this.methodName + ", programId=" + this.programId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.SolDataFunction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SolDataFunction> serializer() {
            return SolDataFunction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SolDataFunction(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = str;
        }
        if ((i & 2) == 0) {
            this.methodName = null;
        } else {
            this.methodName = str2;
        }
        if ((i & 4) == 0) {
            this.programId = null;
        } else {
            this.programId = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(SolDataFunction solDataFunction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || solDataFunction.data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, solDataFunction.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || solDataFunction.methodName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, solDataFunction.methodName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && solDataFunction.programId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, solDataFunction.programId);
    }

    public SolDataFunction(String str, String str2, String str3) {
        this.data = str;
        this.methodName = str2;
        this.programId = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:437) call: com.okinc.business.defi.api.bean.SolDataFunction.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SolDataFunction(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
