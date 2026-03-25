package com.okinc.business.defi.wallet.common.okxconnect.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class OKXConnectException extends Exception {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int code;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKXConnectException> serializer() {
            return OKXConnectException$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKXConnectException(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, OKXConnectException$$serializer.INSTANCE.getDescriptor());
        }
        this.code = i2;
        this.message = str;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(OKXConnectException oKXConnectException, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, oKXConnectException.code);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, oKXConnectException.getMessage());
    }

    private OKXConnectException(int i, String str) {
        super(str);
        this.code = i;
        this.message = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$ErrorType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$ErrorType, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException.<init>(com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$ErrorType, java.lang.String):void type: THIS */
    public /* synthetic */ OKXConnectException(ErrorType errorType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorType, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKXConnectException(@NotNull ErrorType errorType, String str) {
        this(errorType.getCode(), str == null ? errorType.getMessage() : str);
        Intrinsics.checkNotNullParameter(errorType, "");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ErrorType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;
        private final int code;
        private final String message;
        public static final ErrorType UNKNOWN = new ErrorType("UNKNOWN", 0, 0, "Failed for unknown reasons");
        public static final ErrorType BAD_REQUEST = new ErrorType("BAD_REQUEST", 1, 1, "Bad request");
        public static final ErrorType NOT_IN_WALLET = new ErrorType("NOT_IN_WALLET", 2, 4, "Please go back to the Wallet homepage and re-initiate the transaction");
        public static final ErrorType USER_REJECTED = new ErrorType("USER_REJECTED", 3, 300, "User rejected");
        public static final ErrorType USER_ADDRESS_REGISTRATION = new ErrorType("USER_ADDRESS_REGISTRATION", 4, 301, "Your address registration is in progress. Try again later.");
        public static final ErrorType METHOD_NOT_SUPPORTED = new ErrorType("METHOD_NOT_SUPPORTED", 5, 400, "Method not supported");
        public static final ErrorType TIMEOUT = new ErrorType("TIMEOUT", 6, 408, "Timed out waiting");
        public static final ErrorType CHAIN_NOT_SUPPORTED = new ErrorType("CHAIN_NOT_SUPPORTED", 7, 500, "Chain not supported");
        public static final ErrorType WALLET_NOT_SUPPORTED = new ErrorType("WALLET_NOT_SUPPORTED", 8, 600, "Wallet does not support this method");
        public static final ErrorType RISKY_CONNECTION = new ErrorType("RISKY_CONNECTION", 9, TypedValues.TransitionType.TYPE_DURATION, "Risky connection");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{UNKNOWN, BAD_REQUEST, NOT_IN_WALLET, USER_REJECTED, USER_ADDRESS_REGISTRATION, METHOD_NOT_SUPPORTED, TIMEOUT, CHAIN_NOT_SUPPORTED, WALLET_NOT_SUPPORTED, RISKY_CONNECTION};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ErrorType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        private ErrorType(String str, int i, int i2, String str2) {
            this.code = i2;
            this.message = str2;
        }

        static {
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(errorTypeArr$values);
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }
}
