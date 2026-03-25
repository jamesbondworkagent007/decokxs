package aws.smithy.kotlin.runtime.http;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.gms.wallet.WalletConstants;
import com.google.mlkit.common.MlKitException;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.InterfaceC56538yJb;
import o.zT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpStatusCode {
    public final String flVtFt;
    public final int iZzfmt;
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public static final HttpStatusCode AYXKKw = new HttpStatusCode(100, "Continue");
    public static final HttpStatusCode UeEOUB = new HttpStatusCode(101, "Switching Protocols");
    public static final HttpStatusCode ORxRYg = new HttpStatusCode(102, "Processing");
    public static final HttpStatusCode gHZMYf = new HttpStatusCode(200, "OK");
    public static final HttpStatusCode valueOf = new HttpStatusCode(201, "Created");
    public static final HttpStatusCode EZpvd = new HttpStatusCode(202, "Accepted");
    public static final HttpStatusCode iwGUEr = new HttpStatusCode(203, "Non-Authoritative Information");
    public static final HttpStatusCode getNewProxyInstance = new HttpStatusCode(204, "No Content");
    public static final HttpStatusCode QfsBiF = new HttpStatusCode(MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, "Reset Content");
    public static final HttpStatusCode zuBGHE = new HttpStatusCode(206, "Partial Content");
    public static final HttpStatusCode uzCIH = new HttpStatusCode(207, "Multi-Status");
    public static final HttpStatusCode getFieldNames = new HttpStatusCode(300, "Multiple Choices");
    public static final HttpStatusCode fIwbmz = new HttpStatusCode(301, "Moved Permanently");
    public static final HttpStatusCode AkhnZx = new HttpStatusCode(302, "Found");
    public static final HttpStatusCode RJOkX = new HttpStatusCode(303, "See Other");
    public static final HttpStatusCode zLjUOn = new HttpStatusCode(304, "Not Modified");
    public static final HttpStatusCode gGvvIC = new HttpStatusCode(305, "Use Proxy");
    public static final HttpStatusCode RcXXUw = new HttpStatusCode(307, "Temporary Redirect");
    public static final HttpStatusCode sSMYrx = new HttpStatusCode(308, "Permanent Redirect");
    public static final HttpStatusCode copydefault = new HttpStatusCode(400, "Bad Request");
    public static final HttpStatusCode finit = new HttpStatusCode(401, "Unauthorized");
    public static final HttpStatusCode AxsJAY = new HttpStatusCode(402, "Payment Required");
    public static final HttpStatusCode AhwBna = new HttpStatusCode(403, "Forbidden");
    public static final HttpStatusCode zsXlph = new HttpStatusCode(404, "Not Found");
    public static final HttpStatusCode fARcdN = new HttpStatusCode(405, "Method Not Allowed");
    public static final HttpStatusCode AubY = new HttpStatusCode(WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, "Not Acceptable");
    public static final HttpStatusCode OcIXYQ = new HttpStatusCode(407, "Proxy Authentication Required");
    public static final HttpStatusCode QbewEr = new HttpStatusCode(408, "Request Timeout");
    public static final HttpStatusCode AEQbTJ = new HttpStatusCode(409, "Conflict");
    public static final HttpStatusCode DbNXlk = new HttpStatusCode(WalletConstants.ERROR_CODE_INVALID_TRANSACTION, "Gone");
    public static final HttpStatusCode fJNWhG = new HttpStatusCode(WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE, "Length Required");
    public static final HttpStatusCode QKVWgx = new HttpStatusCode(412, "Precondition Failed");
    public static final HttpStatusCode AwvSrB = new HttpStatusCode(WalletConstants.ERROR_CODE_UNKNOWN, "Payload Too Large");
    public static final HttpStatusCode QUSxYX = new HttpStatusCode(WalletConstants.ERROR_CODE_ILLEGAL_CALLER, "Request-URI Too Long");
    public static final HttpStatusCode dvKsVJ = new HttpStatusCode(WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE, "Unsupported Media Type");
    public static final HttpStatusCode QVAiDq = new HttpStatusCode(416, "Requested Range Not Satisfiable");
    public static final HttpStatusCode gEmmrt = new HttpStatusCode(417, "Expectation Failed");
    public static final HttpStatusCode fFgQHt = new HttpStatusCode(422, "Unprocessable Entity");
    public static final HttpStatusCode AuCTel = new HttpStatusCode(TypedValues.CycleType.TYPE_WAVE_PERIOD, "Locked");
    public static final HttpStatusCode djBIcL = new HttpStatusCode(TypedValues.CycleType.TYPE_WAVE_OFFSET, "Failed Dependency");
    public static final HttpStatusCode dNCPSb = new HttpStatusCode(TypedValues.CycleType.TYPE_WAVE_PHASE, "Too Early");
    public static final HttpStatusCode fZBcTu = new HttpStatusCode(426, "Upgrade Required");
    public static final HttpStatusCode DTwDnp = new HttpStatusCode(428, "Precondition Required");
    public static final HttpStatusCode djSkpj = new HttpStatusCode(429, "Too Many Requests");
    public static final HttpStatusCode QOLQEE = new HttpStatusCode(431, "Request Header Fields Too Large");
    public static final HttpStatusCode dxcTrN = new HttpStatusCode(451, "Unavailable For Legal Reason");
    public static final HttpStatusCode fetchVPNInfo = new HttpStatusCode(500, "Internal Server Error");
    public static final HttpStatusCode wlaJM = new HttpStatusCode(501, "Not Implemented");
    public static final HttpStatusCode OLrzqt = new HttpStatusCode(502, "Bad Gateway");
    public static final HttpStatusCode aKErDB = new HttpStatusCode(503, "Service Unavailable");
    public static final HttpStatusCode isConnected = new HttpStatusCode(TypedValues.PositionType.TYPE_PERCENT_HEIGHT, "Gateway Timeout");
    public static final HttpStatusCode gasjUx = new HttpStatusCode(TypedValues.PositionType.TYPE_SIZE_PERCENT, "HTTP Version Not Supported");
    public static final HttpStatusCode giSNqX = new HttpStatusCode(TypedValues.PositionType.TYPE_PERCENT_X, "Variant Also Negotiates");
    public static final HttpStatusCode values = new HttpStatusCode(TypedValues.PositionType.TYPE_PERCENT_Y, "Insufficient Storage");
    public static final HttpStatusCode ejfBZ = new HttpStatusCode(TypedValues.PositionType.TYPE_CURVE_FIT, "Loop Detected");
    public static final HttpStatusCode AuCTelauCTel = new HttpStatusCode(TypedValues.PositionType.TYPE_POSITION_TYPE, "Not Extended");
    public static final HttpStatusCode hDKMBd = new HttpStatusCode(FrameMetricsAggregator.EVERY_DURATION, "Network Authentication Required");
    public static final Map<Integer, HttpStatusCode> fvQaOB = zT.AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HttpStatusCode copy$default(HttpStatusCode httpStatusCode, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = httpStatusCode.iZzfmt;
        }
        if ((i2 & 2) != 0) {
            str = httpStatusCode.flVtFt;
        }
        return httpStatusCode.EZpvd(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HttpStatusCode EZpvd(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new HttpStatusCode(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int flVtFt() {
        return this.iZzfmt;
    }

    public HttpStatusCode(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.iZzfmt = i;
        this.flVtFt = str;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Category implements Comparable<Category>, InterfaceC56538yJb<Integer> {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Category[] $VALUES;
        public static final StateListAnimator Companion;
        private final IntRange range;
        public static final Category INFORMATION = new Category("INFORMATION", 0, new IntRange(100, 199));
        public static final Category SUCCESS = new Category("SUCCESS", 1, new IntRange(200, 299));
        public static final Category REDIRECT = new Category("REDIRECT", 2, new IntRange(300, 399));
        public static final Category CLIENT_ERROR = new Category("CLIENT_ERROR", 3, new IntRange(400, 499));
        public static final Category SERVER_ERROR = new Category("SERVER_ERROR", 4, new IntRange(500, 599));

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Category[] $values() {
            return new Category[]{INFORMATION, SUCCESS, REDIRECT, CLIENT_ERROR, SERVER_ERROR};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Category> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static Category valueOf(String str) {
            return (Category) Enum.valueOf(Category.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static Category[] values() {
            return (Category[]) $VALUES.clone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean contains(int i) {
            return this.range.AEQbTJ(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getEndInclusive()Ljava/lang/Comparable; */
        @Override // o.InterfaceC56538yJb
        public Integer getEndInclusive() {
            return this.range.getEndInclusive();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getStart()Ljava/lang/Comparable; */
        @Override // o.InterfaceC56538yJb
        public Integer getStart() {
            return this.range.getStart();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56538yJb
        public boolean isEmpty() {
            return this.range.isEmpty();
        }

        private Category(String str, int i, IntRange intRange) {
            this.range = intRange;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Comparable */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC56538yJb
        public /* synthetic */ boolean contains(Comparable comparable) {
            return contains(((Number) comparable).intValue());
        }

        static {
            Category[] categoryArr$values = $values();
            $VALUES = categoryArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(categoryArr$values);
            Companion = new StateListAnimator(null);
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.smithy.kotlin.runtime.http.HttpStatusCode.Category.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }

            public final Category copydefault(int i) {
                Category category;
                Category[] categoryArrValues = Category.values();
                int length = categoryArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        category = null;
                        break;
                    }
                    category = categoryArrValues[i2];
                    IntRange intRange = category.range;
                    int iKWHzl = intRange.KWHzl();
                    if (i <= intRange.copydefault() && iKWHzl <= i) {
                        break;
                    }
                    i2++;
                }
                if (category != null) {
                    return category;
                }
                throw new IllegalStateException(("Invalid HTTP code " + i).toString());
            }
        }
    }

    public String toString() {
        return this.iZzfmt + ": " + this.flVtFt;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpStatusCode) && ((HttpStatusCode) obj).iZzfmt == this.iZzfmt;
    }

    public int hashCode() {
        return Integer.hashCode(this.iZzfmt);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.smithy.kotlin.runtime.http.HttpStatusCode.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final HttpStatusCode copydefault() {
            return HttpStatusCode.AYXKKw;
        }

        public final HttpStatusCode aKErDB() {
            return HttpStatusCode.UeEOUB;
        }

        public final HttpStatusCode OcIXYQ() {
            return HttpStatusCode.ORxRYg;
        }

        public final HttpStatusCode zsXlph() {
            return HttpStatusCode.gHZMYf;
        }

        public final HttpStatusCode valueOf() {
            return HttpStatusCode.valueOf;
        }

        public final HttpStatusCode KWHzl() {
            return HttpStatusCode.EZpvd;
        }

        public final HttpStatusCode uzCIH() {
            return HttpStatusCode.iwGUEr;
        }

        public final HttpStatusCode iwGUEr() {
            return HttpStatusCode.getNewProxyInstance;
        }

        public final HttpStatusCode QVAiDq() {
            return HttpStatusCode.QfsBiF;
        }

        public final HttpStatusCode sSMYrx() {
            return HttpStatusCode.zuBGHE;
        }

        public final HttpStatusCode fJNWhG() {
            return HttpStatusCode.uzCIH;
        }

        public final HttpStatusCode getNewProxyInstance() {
            return HttpStatusCode.getFieldNames;
        }

        public final HttpStatusCode fIwbmz() {
            return HttpStatusCode.fIwbmz;
        }

        public final HttpStatusCode gEmmrt() {
            return HttpStatusCode.AkhnZx;
        }

        public final HttpStatusCode QfsBiF() {
            return HttpStatusCode.RJOkX;
        }

        public final HttpStatusCode zLjUOn() {
            return HttpStatusCode.zLjUOn;
        }

        public final HttpStatusCode finit() {
            return HttpStatusCode.gGvvIC;
        }

        public final HttpStatusCode djSkpj() {
            return HttpStatusCode.RcXXUw;
        }

        public final HttpStatusCode AxsJAY() {
            return HttpStatusCode.sSMYrx;
        }

        public final HttpStatusCode EZpvd() {
            return HttpStatusCode.copydefault;
        }

        public final HttpStatusCode dNCPSb() {
            return HttpStatusCode.finit;
        }

        public final HttpStatusCode AwvSrB() {
            return HttpStatusCode.AxsJAY;
        }

        public final HttpStatusCode djBIcL() {
            return HttpStatusCode.AhwBna;
        }

        public final HttpStatusCode AubY() {
            return HttpStatusCode.zsXlph;
        }

        public final HttpStatusCode AuCTel() {
            return HttpStatusCode.fARcdN;
        }

        public final HttpStatusCode getFieldNames() {
            return HttpStatusCode.AubY;
        }

        public final HttpStatusCode DTwDnp() {
            return HttpStatusCode.OcIXYQ;
        }

        public final HttpStatusCode ORxRYg() {
            return HttpStatusCode.QbewEr;
        }

        public final HttpStatusCode AEQbTJ() {
            return HttpStatusCode.AEQbTJ;
        }

        public final HttpStatusCode values() {
            return HttpStatusCode.DbNXlk;
        }

        public final HttpStatusCode isConnected() {
            return HttpStatusCode.fJNWhG;
        }

        public final HttpStatusCode zuBGHE() {
            return HttpStatusCode.QKVWgx;
        }

        public final HttpStatusCode gHZMYf() {
            return HttpStatusCode.AwvSrB;
        }

        public final HttpStatusCode QUSxYX() {
            return HttpStatusCode.QUSxYX;
        }

        public final HttpStatusCode fZBcTu() {
            return HttpStatusCode.dvKsVJ;
        }

        public final HttpStatusCode RJOkX() {
            return HttpStatusCode.QVAiDq;
        }

        public final HttpStatusCode AYXKKw() {
            return HttpStatusCode.gEmmrt;
        }

        public final HttpStatusCode dxcTrN() {
            return HttpStatusCode.fFgQHt;
        }

        public final HttpStatusCode ejfBZ() {
            return HttpStatusCode.AuCTel;
        }

        public final HttpStatusCode AhwBna() {
            return HttpStatusCode.djBIcL;
        }

        public final HttpStatusCode RcXXUw() {
            return HttpStatusCode.dNCPSb;
        }

        public final HttpStatusCode dvKsVJ() {
            return HttpStatusCode.fZBcTu;
        }

        public final HttpStatusCode QOLQEE() {
            return HttpStatusCode.DTwDnp;
        }

        public final HttpStatusCode UeEOUB() {
            return HttpStatusCode.djSkpj;
        }

        public final HttpStatusCode QKVWgx() {
            return HttpStatusCode.QOLQEE;
        }

        public final HttpStatusCode fFgQHt() {
            return HttpStatusCode.dxcTrN;
        }

        public final HttpStatusCode AkhnZx() {
            return HttpStatusCode.fetchVPNInfo;
        }

        public final HttpStatusCode AuCTelauCTel() {
            return HttpStatusCode.wlaJM;
        }

        public final HttpStatusCode OLrzqt() {
            return HttpStatusCode.OLrzqt;
        }

        public final HttpStatusCode QbewEr() {
            return HttpStatusCode.aKErDB;
        }

        public final HttpStatusCode DbNXlk() {
            return HttpStatusCode.isConnected;
        }

        public final HttpStatusCode flVtFt() {
            return HttpStatusCode.gasjUx;
        }

        public final HttpStatusCode gasjUx() {
            return HttpStatusCode.giSNqX;
        }

        public final HttpStatusCode fetchVPNInfo() {
            return HttpStatusCode.values;
        }

        public final HttpStatusCode fARcdN() {
            return HttpStatusCode.ejfBZ;
        }

        public final HttpStatusCode wlaJM() {
            return HttpStatusCode.AuCTelauCTel;
        }

        public final HttpStatusCode hDKMBd() {
            return HttpStatusCode.hDKMBd;
        }

        public final HttpStatusCode AEQbTJ(int i) {
            HttpStatusCode httpStatusCode = (HttpStatusCode) HttpStatusCode.fvQaOB.get(Integer.valueOf(i));
            return httpStatusCode == null ? new HttpStatusCode(i, "Unknown HttpStatusCode") : httpStatusCode;
        }
    }
}
