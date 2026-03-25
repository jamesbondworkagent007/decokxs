package o;

import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.limit.PairRateParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gYS {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gYS.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ gYS(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private gYS() {
    }

    public static final class Activity extends gYS {
        public final V6QuoteRequest KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, V6QuoteRequest v6QuoteRequest, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                v6QuoteRequest = activity.KWHzl;
            }
            return activity.AEQbTJ(v6QuoteRequest);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull V6QuoteRequest v6QuoteRequest) {
            Intrinsics.checkNotNullParameter(v6QuoteRequest, "");
            return new Activity(v6QuoteRequest);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final V6QuoteRequest OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "QuoteParams(quoteRequest=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull V6QuoteRequest v6QuoteRequest) {
            super(null);
            Intrinsics.checkNotNullParameter(v6QuoteRequest, "");
            this.KWHzl = v6QuoteRequest;
        }
    }

    public static final class Application extends gYS {
        public final V6QuoteAndCalldataRequest EZpvd;
        public final java.util.Map<java.lang.String, java.lang.String> KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gYS$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.Map map, V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = application.KWHzl;
            }
            if ((i & 2) != 0) {
                v6QuoteAndCalldataRequest = application.EZpvd;
            }
            if ((i & 4) != 0) {
                z = application.OLrzqt;
            }
            return application.EZpvd(map, v6QuoteAndCalldataRequest, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest, boolean z) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(v6QuoteAndCalldataRequest, "");
            return new Application(map, v6QuoteAndCalldataRequest, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final V6QuoteAndCalldataRequest OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && this.OLrzqt == application.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "QuoteAndCalldataParams(header=" + this.KWHzl + ", request=" + this.EZpvd + ", enablePolling=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.Map)
  (r2v0 com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
 A[MD:(java.util.Map<java.lang.String, java.lang.String>, com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest, boolean):void (m)] (LINE:20) call: o.gYS.Application.<init>(java.util.Map, com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest, boolean):void type: THIS */
        public /* synthetic */ Application(java.util.Map map, V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, v6QuoteAndCalldataRequest, (i & 4) != 0 ? true : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(v6QuoteAndCalldataRequest, "");
            this.KWHzl = map;
            this.EZpvd = v6QuoteAndCalldataRequest;
            this.OLrzqt = z;
        }
    }

    public static final class ActionBar extends gYS {
        public final PairRateParams OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, PairRateParams pairRateParams, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pairRateParams = actionBar.OLrzqt;
            }
            return actionBar.OLrzqt(pairRateParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PairRateParams EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull PairRateParams pairRateParams) {
            Intrinsics.checkNotNullParameter(pairRateParams, "");
            return new ActionBar(pairRateParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.OLrzqt, ((ActionBar) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LimitQuoteParams(pairRateParams=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull PairRateParams pairRateParams) {
            super(null);
            Intrinsics.checkNotNullParameter(pairRateParams, "");
            this.OLrzqt = pairRateParams;
        }
    }
}
