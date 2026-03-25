package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40901qgg extends AbstractC49400uno<Application, java.lang.String> {
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.qgg$Application */
    public static final class Application {
        public final java.lang.Long AEQbTJ;
        public final java.lang.Long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.Long l, java.lang.Long l2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = application.AEQbTJ;
            }
            if ((i & 2) != 0) {
                l2 = application.KWHzl;
            }
            return application.KWHzl(l, l2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(java.lang.Long l, java.lang.Long l2) {
            return new Application(l, l2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Long l = this.AEQbTJ;
            int iHashCode = l == null ? 0 : l.hashCode();
            java.lang.Long l2 = this.KWHzl;
            return (iHashCode * 31) + (l2 != null ? l2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Params(publishTimestamp=" + this.AEQbTJ + ", currentTimestamp=" + this.KWHzl + ")";
        }

        public Application(java.lang.Long l, java.lang.Long l2) {
            this.AEQbTJ = l;
            this.KWHzl = l2;
        }
    }

    @yCM
    public C40901qgg(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull Application application, @NotNull Continuation<? super java.lang.String> continuation) {
        return OLrzqt(application);
    }

    public final java.lang.String OLrzqt(Application application) {
        if (application.copydefault() == null || application.AEQbTJ() == null) {
            return "";
        }
        int iLongValue = (int) ((application.AEQbTJ().longValue() - application.copydefault().longValue()) / ((long) 1000));
        if (iLongValue < 0) {
            iLongValue = 0;
        }
        if (iLongValue < 60) {
            android.content.res.Resources resources = C43246rlf.OLrzqt.valueOf().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            return pTD.copydefault(resources, qZH.Dialog.gEmmrt, iLongValue, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iLongValue))));
        }
        if (iLongValue < 3600) {
            int i = iLongValue / 60;
            android.content.res.Resources resources2 = C43246rlf.OLrzqt.valueOf().getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            return pTD.copydefault(resources2, qZH.Dialog.AhwBna, i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i))));
        }
        if (iLongValue < 86400) {
            int i2 = iLongValue / IMarketApiService.SIXTY_MINUTES;
            android.content.res.Resources resources3 = C43246rlf.OLrzqt.valueOf().getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "");
            return pTD.copydefault(resources3, qZH.Dialog.valueOf, i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i2))));
        }
        if (iLongValue < 604800) {
            int i3 = iLongValue / RemoteMessageConst.DEFAULT_TTL;
            android.content.res.Resources resources4 = C43246rlf.OLrzqt.valueOf().getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "");
            return pTD.copydefault(resources4, qZH.Dialog.AYXKKw, i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i3))));
        }
        return pTA.formatSimpleDateTime$default(new Date(application.copydefault().longValue()), null, 1, null);
    }
}
