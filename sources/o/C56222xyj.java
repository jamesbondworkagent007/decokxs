package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestPreCheckRequest;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestPreCheckResponse;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56222xyj extends xKQ<java.util.List<? extends GridProfitAutoReinvestPreCheckResponse>> {
    public GridProfitAutoReinvestPreCheckRequest EZpvd;

    public final void AEQbTJ(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.EZpvd = new GridProfitAutoReinvestPreCheckRequest(application.KWHzl(), application.copydefault(), application.AEQbTJ(), application.EZpvd());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.coroutines.Continuation<? super com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.GridProfitAutoReinvestPreCheckResponse>>>] */
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<? extends GridProfitAutoReinvestPreCheckResponse>>> continuation) {
        GridProfitAutoReinvestPreCheckRequest gridProfitAutoReinvestPreCheckRequest = this.EZpvd;
        if (gridProfitAutoReinvestPreCheckRequest != null) {
            return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getGridProfitAutoReinvestPreCheck(gridProfitAutoReinvestPreCheckRequest, continuation);
        }
        throw new java.lang.IllegalArgumentException("Input is null");
    }

    /* JADX INFO: renamed from: o.xyj$Application */
    public static final class Application {
        public final java.lang.Boolean AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final TrailingConfig copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, TrailingConfig trailingConfig, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = application.KWHzl;
            }
            if ((i & 4) != 0) {
                trailingConfig = application.copydefault;
            }
            if ((i & 8) != 0) {
                bool = application.AEQbTJ;
            }
            return application.AEQbTJ(str, str2, trailingConfig, bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TrailingConfig AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, TrailingConfig trailingConfig, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, str2, trailingConfig, bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            java.lang.String str = this.KWHzl;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            TrailingConfig trailingConfig = this.copydefault;
            int iHashCode3 = trailingConfig == null ? 0 : trailingConfig.hashCode();
            java.lang.Boolean bool = this.AEQbTJ;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(ordType=" + this.EZpvd + ", sourceCcy=" + this.KWHzl + ", trailingDownConfig=" + this.copydefault + ", reserveFunds=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull java.lang.String str, java.lang.String str2, TrailingConfig trailingConfig, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.KWHzl = str2;
            this.copydefault = trailingConfig;
            this.AEQbTJ = bool;
        }
    }
}
