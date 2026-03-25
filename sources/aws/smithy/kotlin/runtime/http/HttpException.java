package aws.smithy.kotlin.runtime.http;

import aws.smithy.kotlin.runtime.SdkBaseException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52427wL;
import o.C57737yo;
import o.InterfaceC56293yA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpException extends SdkBaseException {
    private final HttpErrorCode errorCode;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HttpErrorCode.values().length];
            try {
                iArr[HttpErrorCode.CONNECT_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpErrorCode.TLS_NEGOTIATION_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HttpErrorCode.SDK_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HttpErrorCode getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:aws.smithy.kotlin.runtime.http.HttpErrorCode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:aws.smithy.kotlin.runtime.http.HttpErrorCode:0x0004: SGET  A[WRAPPED] (LINE:18) aws.smithy.kotlin.runtime.http.HttpErrorCode.SDK_UNKNOWN aws.smithy.kotlin.runtime.http.HttpErrorCode) : (r2v0 aws.smithy.kotlin.runtime.http.HttpErrorCode))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, aws.smithy.kotlin.runtime.http.HttpErrorCode, boolean):void (m)] (LINE:16) call: aws.smithy.kotlin.runtime.http.HttpException.<init>(java.lang.String, aws.smithy.kotlin.runtime.http.HttpErrorCode, boolean):void type: THIS */
    public /* synthetic */ HttpException(String str, HttpErrorCode httpErrorCode, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? HttpErrorCode.SDK_UNKNOWN : httpErrorCode, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(String str, @NotNull HttpErrorCode httpErrorCode, boolean z) {
        super(str);
        Intrinsics.checkNotNullParameter(httpErrorCode, "");
        this.errorCode = httpErrorCode;
        setRetryable(z);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.Throwable)
  (wrap:aws.smithy.kotlin.runtime.http.HttpErrorCode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:aws.smithy.kotlin.runtime.http.HttpErrorCode:0x0004: SGET  A[WRAPPED] (LINE:27) aws.smithy.kotlin.runtime.http.HttpErrorCode.SDK_UNKNOWN aws.smithy.kotlin.runtime.http.HttpErrorCode) : (r3v0 aws.smithy.kotlin.runtime.http.HttpErrorCode))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.Throwable, aws.smithy.kotlin.runtime.http.HttpErrorCode, boolean):void (m)] (LINE:24) call: aws.smithy.kotlin.runtime.http.HttpException.<init>(java.lang.String, java.lang.Throwable, aws.smithy.kotlin.runtime.http.HttpErrorCode, boolean):void type: THIS */
    public /* synthetic */ HttpException(String str, Throwable th, HttpErrorCode httpErrorCode, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th, (i & 4) != 0 ? HttpErrorCode.SDK_UNKNOWN : httpErrorCode, (i & 8) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(String str, Throwable th, @NotNull HttpErrorCode httpErrorCode, boolean z) {
        super(str, th);
        Intrinsics.checkNotNullParameter(httpErrorCode, "");
        this.errorCode = httpErrorCode;
        setRetryable(z);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.Throwable)
  (wrap:aws.smithy.kotlin.runtime.http.HttpErrorCode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:aws.smithy.kotlin.runtime.http.HttpErrorCode:0x0004: SGET  A[WRAPPED] (LINE:36) aws.smithy.kotlin.runtime.http.HttpErrorCode.SDK_UNKNOWN aws.smithy.kotlin.runtime.http.HttpErrorCode) : (r2v0 aws.smithy.kotlin.runtime.http.HttpErrorCode))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.Throwable, aws.smithy.kotlin.runtime.http.HttpErrorCode, boolean):void (m)] (LINE:34) call: aws.smithy.kotlin.runtime.http.HttpException.<init>(java.lang.Throwable, aws.smithy.kotlin.runtime.http.HttpErrorCode, boolean):void type: THIS */
    public /* synthetic */ HttpException(Throwable th, HttpErrorCode httpErrorCode, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? HttpErrorCode.SDK_UNKNOWN : httpErrorCode, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(Throwable th, @NotNull HttpErrorCode httpErrorCode, boolean z) {
        super(th);
        Intrinsics.checkNotNullParameter(httpErrorCode, "");
        this.errorCode = httpErrorCode;
        setRetryable(z);
    }

    private final void setRetryable(boolean z) {
        InterfaceC56293yA interfaceC56293yAOLrzqt = getSdkErrorMetadata().OLrzqt();
        C57737yo<Boolean> c57737yoOLrzqt = C52427wL.KWHzl.OLrzqt();
        boolean z2 = true;
        if (!z) {
            int i = Application.copydefault[this.errorCode.ordinal()];
            if (i != 1 && i != 2) {
                z2 = false;
            }
        }
        interfaceC56293yAOLrzqt.OLrzqt(c57737yoOLrzqt, Boolean.valueOf(z2));
    }

    @Override // java.lang.Throwable
    public String toString() {
        String string = super.toString();
        if (Application.copydefault[this.errorCode.ordinal()] == 3) {
            return string;
        }
        return string + "; HttpErrorCode(" + this.errorCode + ')';
    }
}
