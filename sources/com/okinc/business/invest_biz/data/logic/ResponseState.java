package com.okinc.business.invest_biz.data.logic;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ResponseState {
    public static final int $stable = 0;
    private final int errorCode;
    private final String errorMsg;
    private final ResponseStateType errorType;
    private final String lastInputValue;
    private final String lastTokenAddress;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.business.invest_biz.data.logic.ResponseStateType", ResponseStateType.values()), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ResponseState copy$default(ResponseState responseState, ResponseStateType responseStateType, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            responseStateType = responseState.errorType;
        }
        if ((i2 & 2) != 0) {
            str = responseState.lastTokenAddress;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = responseState.lastInputValue;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            i = responseState.errorCode;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = responseState.errorMsg;
        }
        return responseState.copy(responseStateType, str4, str5, i3, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseStateType component1() {
        return this.errorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.lastTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.lastInputValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseState copy(@NotNull ResponseStateType responseStateType, @NotNull String str, @NotNull String str2, int i, String str3) {
        Intrinsics.checkNotNullParameter(responseStateType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ResponseState(responseStateType, str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseState)) {
            return false;
        }
        ResponseState responseState = (ResponseState) obj;
        return this.errorType == responseState.errorType && Intrinsics.EZpvd((Object) this.lastTokenAddress, (Object) responseState.lastTokenAddress) && Intrinsics.EZpvd((Object) this.lastInputValue, (Object) responseState.lastInputValue) && this.errorCode == responseState.errorCode && Intrinsics.EZpvd((Object) this.errorMsg, (Object) responseState.errorMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseStateType getErrorType() {
        return this.errorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastInputValue() {
        return this.lastInputValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastTokenAddress() {
        return this.lastTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.errorType.hashCode();
        int iHashCode2 = this.lastTokenAddress.hashCode();
        int iHashCode3 = this.lastInputValue.hashCode();
        int iHashCode4 = Integer.hashCode(this.errorCode);
        String str = this.errorMsg;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResponseState(errorType=" + this.errorType + ", lastTokenAddress=" + this.lastTokenAddress + ", lastInputValue=" + this.lastInputValue + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.logic.ResponseState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ResponseState> serializer() {
            return ResponseState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ResponseState(int i, ResponseStateType responseStateType, String str, String str2, int i2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, ResponseState$$serializer.INSTANCE.getDescriptor());
        }
        this.errorType = responseStateType;
        this.lastTokenAddress = str;
        this.lastInputValue = str2;
        if ((i & 8) == 0) {
            this.errorCode = 0;
        } else {
            this.errorCode = i2;
        }
        if ((i & 16) == 0) {
            this.errorMsg = null;
        } else {
            this.errorMsg = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(ResponseState responseState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], responseState.errorType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, responseState.lastTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, responseState.lastInputValue);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || responseState.errorCode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, responseState.errorCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && responseState.errorMsg == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, responseState.errorMsg);
    }

    public ResponseState(@NotNull ResponseStateType responseStateType, @NotNull String str, @NotNull String str2, int i, String str3) {
        Intrinsics.checkNotNullParameter(responseStateType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.errorType = responseStateType;
        this.lastTokenAddress = str;
        this.lastInputValue = str2;
        this.errorCode = i;
        this.errorMsg = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r7v0 com.okinc.business.invest_biz.data.logic.ResponseStateType)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (wrap:int:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(com.okinc.business.invest_biz.data.logic.ResponseStateType, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:26) call: com.okinc.business.invest_biz.data.logic.ResponseState.<init>(com.okinc.business.invest_biz.data.logic.ResponseStateType, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ ResponseState(ResponseStateType responseStateType, String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(responseStateType, str, str2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str3);
    }
}
