package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.market.common.constants.ExperienceRouteConst;
import com.okinc.planet.biz_search.adapter.ContentFeedItemViewBinder$onBindView$1$1;
import com.okinc.planet.utils.IMUtils;
import com.okinc.search.bean.SearchResultContentPo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tGO extends tGG<C46086tHh, C46247tNg> {
    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C46247tNg copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C46247tNg c46247tNgKWHzl = C46247tNg.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c46247tNgKWHzl, "");
        return c46247tNgKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/txV;)V */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C46247tNg c46247tNg, int i, @NotNull final C46086tHh c46086tHh) {
        SearchResultContentPo.SearchResultContentItemPo.ContentAuthorPo author;
        SearchResultContentPo.SearchResultContentItemPo.ContentAuthorPo author2;
        Intrinsics.checkNotNullParameter(c46247tNg, "");
        Intrinsics.checkNotNullParameter(c46086tHh, "");
        SearchResultContentPo.SearchResultContentItemPo searchResultContentItemPoDjBIcL = c46086tHh.djBIcL();
        java.lang.String strOLrzqt = null;
        if (Intrinsics.EZpvd((java.lang.Object) ((searchResultContentItemPoDjBIcL == null || (author2 = searchResultContentItemPoDjBIcL.getAuthor()) == null) ? null : author2.KWHzl()), (java.lang.Object) "1")) {
            c46247tNg.KWHzl.setVisibility(0);
        } else {
            c46247tNg.KWHzl.setVisibility(8);
        }
        SearchResultContentPo.SearchResultContentItemPo searchResultContentItemPoDjBIcL2 = c46086tHh.djBIcL();
        if (searchResultContentItemPoDjBIcL2 != null && (author = searchResultContentItemPoDjBIcL2.getAuthor()) != null) {
            strOLrzqt = author.OLrzqt();
        }
        if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "1") && IMUtils.KWHzl.KWHzl()) {
            c46247tNg.AEQbTJ.setLiveState(true);
            c46247tNg.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.tGQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    tGO.copydefault(c46247tNg, c46086tHh, view);
                }
            });
        } else {
            c46247tNg.AEQbTJ.setLiveState(false);
        }
        tUQ tuq = c46247tNg.AEQbTJ;
        java.lang.String strEZpvd = c46086tHh.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        tuq.KWHzl(strEZpvd);
        AppCompatTextView appCompatTextView = c46247tNg.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        EZpvd(appCompatTextView, c46086tHh.OLrzqt());
        c46247tNg.copydefault.setText(c46086tHh.AEQbTJ());
        android.widget.TextView textView = c46247tNg.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(c46086tHh.AhwBna() ? 0 : 8);
        c46247tNg.djBIcL.setText(c46086tHh.copydefault());
        ConstraintLayout root = c46247tNg.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, c46247tNg, c46086tHh));
    }

    public static final void copydefault(C46247tNg c46247tNg, C46086tHh c46086tHh, android.view.View view) {
        LifecycleCoroutineScope lifecycleScope;
        ConstraintLayout root = c46247tNg.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(root);
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        C46374tRz.safeLaunch$default(lifecycleScope, null, null, new ContentFeedItemViewBinder$onBindView$1$1(c46247tNg, c46086tHh, null), 3, null);
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C46247tNg AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C46086tHh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C46247tNg c46247tNg, C46086tHh c46086tHh) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c46247tNg;
            this.copydefault = c46086tHh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C43056riA c43056riA = C43056riA.AEQbTJ;
                android.content.Context context = this.AEQbTJ.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ExperienceRouteConst.MiniAppRoute miniAppRoute = ExperienceRouteConst.MiniAppRoute.COMMUNITY_DETAIL;
                c43056riA.copydefault(context, "market", miniAppRoute.getUrl(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("contentId", this.copydefault.KWHzl()), C56390yDp.OLrzqt("fromPage", "search"), C56390yDp.OLrzqt("feedType", ""), C56390yDp.OLrzqt("minversion", miniAppRoute.getMinAppVersion())));
            }
        }
    }
}
