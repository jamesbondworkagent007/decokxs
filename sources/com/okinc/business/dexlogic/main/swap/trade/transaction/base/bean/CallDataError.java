package com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CallDataError {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String code;
    private final String message;
    private final boolean resStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CallDataError() {
        this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CallDataError copy$default(CallDataError callDataError, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callDataError.code;
        }
        if ((i & 2) != 0) {
            str2 = callDataError.message;
        }
        if ((i & 4) != 0) {
            z = callDataError.resStatus;
        }
        return callDataError.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.resStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallDataError copy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CallDataError(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallDataError)) {
            return false;
        }
        CallDataError callDataError = (CallDataError) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) callDataError.code) && Intrinsics.EZpvd((Object) this.message, (Object) callDataError.message) && this.resStatus == callDataError.resStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getResStatus() {
        return this.resStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.message.hashCode()) * 31) + Boolean.hashCode(this.resStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CallDataError(code=" + this.code + ", message=" + this.message + ", resStatus=" + this.resStatus + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CallDataError.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CallDataError> serializer() {
            return CallDataError$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CallDataError(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.code = "";
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.message = "";
        } else {
            this.message = str2;
        }
        if ((i & 4) == 0) {
            this.resStatus = false;
        } else {
            this.resStatus = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CallDataError callDataError, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) callDataError.code, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, callDataError.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) callDataError.message, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, callDataError.message);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || callDataError.resStatus) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, callDataError.resStatus);
        }
    }

    public CallDataError(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.code = str;
        this.message = str2;
        this.resStatus = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:35) call: com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CallDataError.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ CallDataError(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}
