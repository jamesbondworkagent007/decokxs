package o;

import com.okinc.market.ranking.features.main.ui.RankingSubPage;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.qxj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41805qxj extends AbstractC41800qxe {
    public static final Activity Companion = new Activity(null);
    public final RankingSubPage isConnected = RankingSubPage.RANKING_HOT_CRYPTO;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC41738qwV
    public RankingSubPage AEQbTJ() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: o.qxj$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qxj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final androidx.fragment.app.Fragment AEQbTJ() {
            return new C41805qxj();
        }
    }

    @Override // o.AbstractC41738qwV
    public androidx.fragment.app.Fragment gEmmrt() {
        return new C41721qwE();
    }

    @Override // o.AbstractC41738qwV
    public androidx.fragment.app.Fragment EZpvd() {
        return new C41751qwi();
    }
}
