package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.wallet.WalletConstants;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: renamed from: o.zkX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59622zkX implements InterfaceC59586zjo {
    public static final C59622zkX OLrzqt = new C59622zkX();
    public static final java.lang.String[][] KWHzl = {null, new java.lang.String[3], new java.lang.String[8], new java.lang.String[8], new java.lang.String[25], new java.lang.String[8]};

    static {
        KWHzl(200, "OK");
        KWHzl(201, "Created");
        KWHzl(202, "Accepted");
        KWHzl(204, "No Content");
        KWHzl(301, "Moved Permanently");
        KWHzl(302, "Moved Temporarily");
        KWHzl(304, "Not Modified");
        KWHzl(400, "Bad Request");
        KWHzl(401, "Unauthorized");
        KWHzl(403, "Forbidden");
        KWHzl(404, "Not Found");
        KWHzl(500, "Internal Server Error");
        KWHzl(501, "Not Implemented");
        KWHzl(502, "Bad Gateway");
        KWHzl(503, "Service Unavailable");
        KWHzl(100, "Continue");
        KWHzl(307, "Temporary Redirect");
        KWHzl(405, "Method Not Allowed");
        KWHzl(409, "Conflict");
        KWHzl(412, "Precondition Failed");
        KWHzl(WalletConstants.ERROR_CODE_UNKNOWN, "Request Too Long");
        KWHzl(WalletConstants.ERROR_CODE_ILLEGAL_CALLER, "Request-URI Too Long");
        KWHzl(WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE, "Unsupported Media Type");
        KWHzl(300, "Multiple Choices");
        KWHzl(303, "See Other");
        KWHzl(305, "Use Proxy");
        KWHzl(402, "Payment Required");
        KWHzl(WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, "Not Acceptable");
        KWHzl(407, "Proxy Authentication Required");
        KWHzl(408, "Request Timeout");
        KWHzl(101, "Switching Protocols");
        KWHzl(203, "Non Authoritative Information");
        KWHzl(MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, "Reset Content");
        KWHzl(206, "Partial Content");
        KWHzl(TypedValues.PositionType.TYPE_PERCENT_HEIGHT, "Gateway Timeout");
        KWHzl(TypedValues.PositionType.TYPE_SIZE_PERCENT, "Http Version Not Supported");
        KWHzl(WalletConstants.ERROR_CODE_INVALID_TRANSACTION, "Gone");
        KWHzl(WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE, "Length Required");
        KWHzl(416, "Requested Range Not Satisfiable");
        KWHzl(417, "Expectation Failed");
        KWHzl(102, "Processing");
        KWHzl(207, "Multi-Status");
        KWHzl(422, "Unprocessable Entity");
        KWHzl(419, "Insufficient Space On Resource");
        KWHzl(TypedValues.CycleType.TYPE_EASING, "Method Failure");
        KWHzl(TypedValues.CycleType.TYPE_WAVE_PERIOD, "Locked");
        KWHzl(TypedValues.PositionType.TYPE_PERCENT_Y, "Insufficient Storage");
        KWHzl(TypedValues.CycleType.TYPE_WAVE_OFFSET, "Failed Dependency");
    }

    @Override // o.InterfaceC59586zjo
    public java.lang.String EZpvd(int i, java.util.Locale locale) {
        C59851zoo.copydefault(i >= 100 && i < 600, "Unknown category for status code " + i);
        int i2 = i / 100;
        int i3 = i - (i2 * 100);
        java.lang.String[] strArr = KWHzl[i2];
        if (strArr.length > i3) {
            return strArr[i3];
        }
        return null;
    }

    public static void KWHzl(int i, java.lang.String str) {
        int i2 = i / 100;
        KWHzl[i2][i - (i2 * 100)] = str;
    }
}
