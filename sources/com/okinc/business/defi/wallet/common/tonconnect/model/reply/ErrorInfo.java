package com.okinc.business.defi.wallet.common.tonconnect.model.reply;

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
public final class ErrorInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int code;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.ErrorInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ErrorInfo> serializer() {
            return ErrorInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ErrorInfo(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ErrorInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.code = i2;
        this.message = str;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ErrorInfo errorInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, errorInfo.code);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, errorInfo.message);
    }

    private ErrorInfo(int i, String str) {
        this.code = i;
        this.message = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.business.defi.wallet.common.tonconnect.model.reply.ErrorInfo$ErrorType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(com.okinc.business.defi.wallet.common.tonconnect.model.reply.ErrorInfo$ErrorType, java.lang.String):void (m)] (LINE:32) call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.ErrorInfo.<init>(com.okinc.business.defi.wallet.common.tonconnect.model.reply.ErrorInfo$ErrorType, java.lang.String):void type: THIS */
    public /* synthetic */ ErrorInfo(ErrorType errorType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorType, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorInfo(@NotNull ErrorType errorType, String str) {
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
        public static final ErrorType UNKNOWN = new ErrorType("UNKNOWN", 0, 0, "User wallet is not compatible");
        public static final ErrorType USER_REJECTED = new ErrorType("USER_REJECTED", 1, 300, "User rejected");
        public static final ErrorType METHOD_NOT_SUPPORTED = new ErrorType("METHOD_NOT_SUPPORTED", 2, 400, "Method not supported");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{UNKNOWN, USER_REJECTED, METHOD_NOT_SUPPORTED};
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
