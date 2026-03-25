package o;

import com.okinc.market.ranking.features.main.ui.RankingSubPage;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.qxn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41809qxn extends AbstractC41801qxf {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final RankingSubPage values = RankingSubPage.RANKING_LARGEST_TURNOVER;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC41738qwV
    public RankingSubPage AEQbTJ() {
        return this.values;
    }

    /* JADX INFO: renamed from: o.qxn$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qxn.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final androidx.fragment.app.Fragment AEQbTJ() {
            return new C41809qxn();
        }
    }

    @Override // o.AbstractC41738qwV
    public androidx.fragment.app.Fragment gEmmrt() {
        return new C41735qwS();
    }

    @Override // o.AbstractC41738qwV
    public androidx.fragment.app.Fragment EZpvd() {
        return new C41752qwj();
    }
}
