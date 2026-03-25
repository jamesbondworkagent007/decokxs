package o;

import com.okinc.market.ranking.features.main.ui.RankingSubPage;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.qxi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41804qxi extends AbstractC41799qxd {
    public static final Application Companion = new Application(null);
    public final RankingSubPage fetchVPNInfo = RankingSubPage.RANKING_LARGEST_MKT_CAP;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC41738qwV
    public RankingSubPage AEQbTJ() {
        return this.fetchVPNInfo;
    }

    /* JADX INFO: renamed from: o.qxi$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qxi.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final androidx.fragment.app.Fragment AEQbTJ() {
            return new C41804qxi();
        }
    }

    @Override // o.AbstractC41738qwV
    public androidx.fragment.app.Fragment gEmmrt() {
        return new C41729qwM();
    }

    /* JADX DEBUG: Possible override for method o.qwY.EZpvd()V */
    @Override // o.AbstractC41738qwV
    public androidx.fragment.app.Fragment EZpvd() {
        return new C41749qwg();
    }
}
