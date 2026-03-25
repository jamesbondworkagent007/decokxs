package o;

import com.okinc.market.ranking.features.main.ui.RankingSubPage;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.qxm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41808qxm extends AbstractC41798qxc {
    public static final ActionBar Companion = new ActionBar(null);
    public final RankingSubPage DbNXlk = RankingSubPage.RANKING_TOP_LOSERS;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC41738qwV
    public RankingSubPage AEQbTJ() {
        return this.DbNXlk;
    }

    /* JADX INFO: renamed from: o.qxm$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qxm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final androidx.fragment.app.Fragment KWHzl() {
            return new C41808qxm();
        }
    }

    @Override // o.AbstractC41738qwV
    public androidx.fragment.app.Fragment gEmmrt() {
        return new C41724qwH();
    }

    @Override // o.AbstractC41738qwV
    public androidx.fragment.app.Fragment EZpvd() {
        return new C41745qwc();
    }
}
