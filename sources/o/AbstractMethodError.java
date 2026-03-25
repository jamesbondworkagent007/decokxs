package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import aws.smithy.kotlin.runtime.ServiceException;
import aws.smithy.kotlin.runtime.http.HttpStatusCode;
import aws.smithy.kotlin.runtime.retries.policy.RetryErrorType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5091Ej;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class AbstractMethodError extends C5092Ek {
    public static final java.util.Map<java.lang.String, RetryErrorType> EZpvd;
    public static final java.util.Map<java.lang.Integer, RetryErrorType> OLrzqt;
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public static final AbstractMethodError copydefault = new AbstractMethodError();

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AbstractMethodError.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final AbstractMethodError OLrzqt() {
            return AbstractMethodError.copydefault;
        }
    }

    static {
        RetryErrorType retryErrorType = RetryErrorType.Throttling;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("BandwidthLimitExceeded", retryErrorType);
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt("EC2ThrottledException", retryErrorType);
        RetryErrorType retryErrorType2 = RetryErrorType.Transient;
        EZpvd = C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, C56390yDp.OLrzqt("IDPCommunicationError", retryErrorType2), C56390yDp.OLrzqt("LimitExceededException", retryErrorType), C56390yDp.OLrzqt("PriorRequestNotComplete", retryErrorType), C56390yDp.OLrzqt("ProvisionedThroughputExceededException", retryErrorType), C56390yDp.OLrzqt("RequestLimitExceeded", retryErrorType), C56390yDp.OLrzqt("RequestThrottled", retryErrorType), C56390yDp.OLrzqt("RequestThrottledException", retryErrorType), C56390yDp.OLrzqt("RequestTimeout", retryErrorType2), C56390yDp.OLrzqt("RequestTimeoutException", retryErrorType2), C56390yDp.OLrzqt("SlowDown", retryErrorType), C56390yDp.OLrzqt("ThrottledException", retryErrorType), C56390yDp.OLrzqt("Throttling", retryErrorType), C56390yDp.OLrzqt("ThrottlingException", retryErrorType), C56390yDp.OLrzqt("TooManyRequestsException", retryErrorType), C56390yDp.OLrzqt("TransactionInProgressException", retryErrorType));
        OLrzqt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(500, retryErrorType2), C56390yDp.OLrzqt(502, retryErrorType2), C56390yDp.OLrzqt(503, retryErrorType2), C56390yDp.OLrzqt(java.lang.Integer.valueOf(TypedValues.PositionType.TYPE_PERCENT_HEIGHT), retryErrorType2));
    }

    @Override // o.C5092Ek
    public AbstractC5091Ej OLrzqt(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof ServiceException) {
            return KWHzl((ServiceException) th);
        }
        return null;
    }

    public final AbstractC5091Ej KWHzl(ServiceException serviceException) {
        C52562wQ sdkErrorMetadata = serviceException.getSdkErrorMetadata();
        RetryErrorType retryErrorType = EZpvd.get(sdkErrorMetadata.DbNXlk());
        if (retryErrorType == null) {
            retryErrorType = OLrzqt.get(copydefault(sdkErrorMetadata));
        }
        if (retryErrorType != null) {
            return new AbstractC5091Ej.StateListAnimator(retryErrorType);
        }
        return null;
    }

    public final java.lang.Integer copydefault(C52562wQ c52562wQ) {
        HttpStatusCode httpStatusCodeOLrzqt;
        InterfaceC52400wK interfaceC52400wKFetchVPNInfo = c52562wQ.fetchVPNInfo();
        InterfaceC5039Cj interfaceC5039Cj = interfaceC52400wKFetchVPNInfo instanceof InterfaceC5039Cj ? (InterfaceC5039Cj) interfaceC52400wKFetchVPNInfo : null;
        if (interfaceC5039Cj == null || (httpStatusCodeOLrzqt = interfaceC5039Cj.OLrzqt()) == null) {
            return null;
        }
        return java.lang.Integer.valueOf(httpStatusCodeOLrzqt.flVtFt());
    }
}
