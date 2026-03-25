package o;

import com.okinc.market.ranking.features.main.ui.RankingSubPage;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.qxt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41815qxt extends AbstractC41803qxh {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final RankingSubPage isConnected = RankingSubPage.RANKING_TOP_GAINERS;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC41738qwV
    public RankingSubPage AEQbTJ() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: o.qxt$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qxt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final androidx.fragment.app.Fragment KWHzl() {
            return new C41815qxt();
        }
    }

    @Override // o.AbstractC41738qwV
    public androidx.fragment.app.Fragment gEmmrt() {
        return new C41736qwT();
    }

    @Override // o.AbstractC41738qwV
    public androidx.fragment.app.Fragment EZpvd() {
        return new C41753qwk();
    }
}
