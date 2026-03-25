package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.planet.biz_search.adapter.ContentKolItemViewBinder$onBindView$1$1;
import com.okinc.planet.utils.IMUtils;
import com.okinc.search.bean.SearchResultContentPo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tGP extends tGG<C46089tHk, C46245tNe> {
    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C46245tNe copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C46245tNe c46245tNeEZpvd = C46245tNe.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c46245tNeEZpvd, "");
        return c46245tNeEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/txV;)V */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C46245tNe c46245tNe, int i, @NotNull final C46089tHk c46089tHk) {
        java.lang.Integer followerCount;
        Intrinsics.checkNotNullParameter(c46245tNe, "");
        Intrinsics.checkNotNullParameter(c46089tHk, "");
        SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPoAYXKKw = c46089tHk.AYXKKw();
        java.lang.String strEZpvd = null;
        int iIntValue = 0;
        if (Intrinsics.EZpvd((java.lang.Object) (searchResultContentKolPoAYXKKw != null ? searchResultContentKolPoAYXKKw.getOfficialStatus() : null), (java.lang.Object) "1")) {
            c46245tNe.copydefault.setVisibility(0);
        } else {
            c46245tNe.copydefault.setVisibility(8);
        }
        SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPoAYXKKw2 = c46089tHk.AYXKKw();
        if (Intrinsics.EZpvd((java.lang.Object) (searchResultContentKolPoAYXKKw2 != null ? searchResultContentKolPoAYXKKw2.getLiveStatus() : null), (java.lang.Object) "1") && IMUtils.KWHzl.KWHzl()) {
            c46245tNe.AEQbTJ.setLiveState(true);
            c46245tNe.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.tGN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    tGP.copydefault(c46245tNe, c46089tHk, view);
                }
            });
        } else {
            c46245tNe.AEQbTJ.setLiveState(false);
        }
        tUQ tuq = c46245tNe.AEQbTJ;
        java.lang.String strCopydefault = c46089tHk.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        tuq.KWHzl(strCopydefault);
        AppCompatTextView appCompatTextView = c46245tNe.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        java.lang.String strEZpvd2 = c46089tHk.EZpvd();
        EZpvd(appCompatTextView, strEZpvd2 != null ? strEZpvd2 : "");
        android.widget.TextView textView = c46245tNe.OLrzqt;
        android.content.Context context = c46245tNe.getRoot().getContext();
        if (context != null) {
            int i2 = C47501trL.LoaderManager.copydefault;
            SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPoAYXKKw3 = c46089tHk.AYXKKw();
            if (searchResultContentKolPoAYXKKw3 != null && (followerCount = searchResultContentKolPoAYXKKw3.getFollowerCount()) != null) {
                iIntValue = followerCount.intValue();
            }
            strEZpvd = pTD.EZpvd(context, i2, iIntValue, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", c46089tHk.OLrzqt())));
        }
        textView.setText(strEZpvd);
        c46245tNe.EZpvd.setText(c46089tHk.KWHzl());
        ConstraintLayout root = c46245tNe.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, c46245tNe, c46089tHk));
    }

    public static final void copydefault(C46245tNe c46245tNe, C46089tHk c46089tHk, android.view.View view) {
        LifecycleCoroutineScope lifecycleScope;
        ConstraintLayout root = c46245tNe.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(root);
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        C46374tRz.safeLaunch$default(lifecycleScope, null, null, new ContentKolItemViewBinder$onBindView$1$1(c46245tNe, c46089tHk, null), 3, null);
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C46089tHk EZpvd;
        public final /* synthetic */ C46245tNe KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C46245tNe c46245tNe, C46089tHk c46089tHk) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c46245tNe;
            this.EZpvd = c46089tHk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (((tWL) C43251rlk.copydefault(tWL.class)).AhwBna()) {
                    C46447tUr c46447tUr = C46447tUr.KWHzl;
                    android.content.Context context = this.KWHzl.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    C46447tUr.openPlanetUserProfilePage$default(c46447tUr, context, "", this.EZpvd.AEQbTJ(), "", "", "", C56423yEv.EZpvd(C56390yDp.OLrzqt("isOrbiter", "1")), null, 128, null);
                    return;
                }
                C43056riA c43056riA = C43056riA.AEQbTJ;
                android.content.Context context2 = this.KWHzl.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c43056riA.copydefault(context2, "market", "/feed/profile", C56424yEw.gEmmrt(C56390yDp.OLrzqt("authorId", this.EZpvd.AEQbTJ()), C56390yDp.OLrzqt("nickName", C33129mqd.gEmmrt(this.EZpvd.EZpvd())), C56390yDp.OLrzqt("portrait", C33129mqd.gEmmrt(this.EZpvd.copydefault())), C56390yDp.OLrzqt("extraParams", new LinkedHashMap())));
            }
        }
    }
}
