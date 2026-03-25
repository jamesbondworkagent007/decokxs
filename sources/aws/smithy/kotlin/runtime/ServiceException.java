package aws.smithy.kotlin.runtime;

import com.google.common.net.HttpHeaders;
import o.C52562wQ;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceException extends SdkBaseException {
    private final C52562wQ sdkErrorMetadata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getSdkErrorMetadata()Lo/wL; */
    @Override // aws.smithy.kotlin.runtime.SdkBaseException
    public C52562wQ getSdkErrorMetadata() {
        return this.sdkErrorMetadata;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ErrorType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType Client = new ErrorType("Client", 0);
        public static final ErrorType Server = new ErrorType(HttpHeaders.SERVER, 1);
        public static final ErrorType Unknown = new ErrorType("Unknown", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{Client, Server, Unknown};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ErrorType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }

        private ErrorType(String str, int i) {
        }

        static {
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(errorTypeArr$values);
        }
    }

    public ServiceException() {
        this.sdkErrorMetadata = new C52562wQ();
    }

    public ServiceException(String str) {
        super(str);
        this.sdkErrorMetadata = new C52562wQ();
    }

    public ServiceException(String str, Throwable th) {
        super(str, th);
        this.sdkErrorMetadata = new C52562wQ();
    }

    public ServiceException(Throwable th) {
        super(th);
        this.sdkErrorMetadata = new C52562wQ();
    }
}
