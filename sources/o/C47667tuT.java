package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_content.leaderboard.bean.NewsFlashArticle;
import com.okinc.planet.biz_content.leaderboard.viewmodel.PlanetLatestNewsViewModel$loadData$1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: renamed from: o.tuT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47667tuT extends ViewModel {
    public final SharedFlow<java.util.List<NewsFlashArticle>> KWHzl;
    public final MutableSharedFlow<java.util.List<NewsFlashArticle>> OLrzqt;
    public final C47659tuL copydefault = tPF.copydefault.DNMMPQ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.util.List<NewsFlashArticle>> EZpvd() {
        return this.KWHzl;
    }

    public C47667tuT() {
        MutableSharedFlow<java.util.List<NewsFlashArticle>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.KWHzl = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static /* synthetic */ void loadData$default(C47667tuT c47667tuT, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        c47667tuT.AEQbTJ(num);
    }

    public final void AEQbTJ(java.lang.Integer num) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetLatestNewsViewModel$loadData$1(this, num, null), 3, null);
    }
}
