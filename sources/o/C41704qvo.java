package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.ViewKt;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qvo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41704qvo extends AbstractC40510qYn<RankingHotCryptoVo, C42853reJ> {
    public final Function1<java.lang.String, java.lang.String> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41704qvo(@NotNull Function1<? super java.lang.String, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42853reJ AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42853reJ c42853reJAEQbTJ = C42853reJ.AEQbTJ(layoutInflater, viewGroup, false);
        c42853reJAEQbTJ.copydefault.setExtraWidth$OKMarket_market_impl(C55298xhM.dpInt$default(28, (android.content.Context) null, 1, (java.lang.Object) null));
        Intrinsics.checkNotNullExpressionValue(c42853reJAEQbTJ, "");
        return c42853reJAEQbTJ;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rgn.setData$default(o.rgn, kotlin.Pair, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, java.lang.Boolean, java.lang.String, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42853reJ c42853reJ, final int i, @NotNull final RankingHotCryptoVo rankingHotCryptoVo) {
        Intrinsics.checkNotNullParameter(c42853reJ, "");
        Intrinsics.checkNotNullParameter(rankingHotCryptoVo, "");
        android.widget.TextView textView = c42853reJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        EZpvd(textView, rankingHotCryptoVo);
        AppCompatImageView appCompatImageView = c42853reJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C46742tcs.AEQbTJ(appCompatImageView, this.KWHzl.invoke(rankingHotCryptoVo.getIcon()));
        C41431qqg.AEQbTJ(c42853reJ.EZpvd, rankingHotCryptoVo.isShowChangePercent(), (Function1<? super C55071xcy, Unit>) new Function1() { // from class: o.qvn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41704qvo.OLrzqt(rankingHotCryptoVo, (C55071xcy) obj);
            }
        });
        c42853reJ.copydefault.setData(new kotlin.Pair(rankingHotCryptoVo.getCoinName() + rankingHotCryptoVo.getGroupName(), ""), C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ)), rankingHotCryptoVo.getIndicate(), rankingHotCryptoVo.getLastPrice(), rankingHotCryptoVo.getQuotePrice(), (1920 & 32) != 0 ? null : java.lang.Integer.valueOf(C52761wXj.Activity.gdmIOq), (1920 & 64) != 0 ? null : java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ), (1920 & 128) != 0 ? false : false, (1920 & 256) != 0 ? java.lang.Boolean.FALSE : null, (1920 & 512) != 0 ? "" : null, (1920 & 1024) != 0 ? null : null);
        c42853reJ.copydefault.setPriceLayoutVisible(rankingHotCryptoVo.isShowLastPrice(), rankingHotCryptoVo.isShowQuotePrice());
        c42853reJ.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.qvp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C41704qvo.EZpvd(c42853reJ, rankingHotCryptoVo, i, view);
            }
        });
        C40499qYc c40499qYcEZpvd = c42853reJ.getRoot();
        c40499qYcEZpvd.setOnClickListener(new StateListAnimator(c40499qYcEZpvd, 1000L, c42853reJ, rankingHotCryptoVo, i));
    }

    public static final Unit OLrzqt(RankingHotCryptoVo rankingHotCryptoVo, C55071xcy c55071xcy) {
        Intrinsics.checkNotNullParameter(c55071xcy, "");
        c55071xcy.setText(rankingHotCryptoVo.getChangePercent());
        c55071xcy.setStyleWithTheme(rankingHotCryptoVo.getChangePercentColor());
        return Unit.INSTANCE;
    }

    public static final boolean EZpvd(C42853reJ c42853reJ, RankingHotCryptoVo rankingHotCryptoVo, int i, android.view.View view) {
        C40499qYc c40499qYcEZpvd = c42853reJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(c40499qYcEZpvd, "");
        InterfaceC41695qvf interfaceC41695qvfOLrzqt = C41693qvd.OLrzqt(c40499qYcEZpvd);
        if (interfaceC41695qvfOLrzqt == null) {
            return true;
        }
        C40499qYc c40499qYcEZpvd2 = c42853reJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(c40499qYcEZpvd2, "");
        interfaceC41695qvfOLrzqt.EZpvd(c40499qYcEZpvd2, rankingHotCryptoVo, i);
        return true;
    }

    public final void EZpvd(android.widget.TextView textView, RankingHotCryptoVo rankingHotCryptoVo) {
        float f;
        textView.setVisibility(0);
        textView.setTextColor(C33070mpX.copydefault(rankingHotCryptoVo.getIndex() <= 3 ? C52761wXj.Activity.HJWChPQdUnVm : C32113mPz.ActionBar.iwGUEr));
        if (rankingHotCryptoVo.getIndex() <= 10) {
            f = 14.0f;
        } else {
            f = rankingHotCryptoVo.getIndex() < 100 ? 12.0f : 10.0f;
        }
        textView.setTextSize(2, f);
        textView.setText(java.lang.String.valueOf(rankingHotCryptoVo.getIndex()));
    }

    /* JADX INFO: renamed from: o.qvo$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ C42853reJ EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ RankingHotCryptoVo OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42853reJ c42853reJ, RankingHotCryptoVo rankingHotCryptoVo, int i) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c42853reJ;
            this.OLrzqt = rankingHotCryptoVo;
            this.AEQbTJ = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C40499qYc c40499qYcEZpvd = this.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(c40499qYcEZpvd, "");
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(c40499qYcEZpvd));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
                if (fragment != null) {
                    boolean z = fragment instanceof InterfaceC41636quZ;
                    java.lang.Object obj = fragment;
                    if (!z) {
                        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                        while (parentFragment != null && !(parentFragment instanceof InterfaceC41636quZ)) {
                            parentFragment = parentFragment.getParentFragment();
                        }
                        obj = (InterfaceC41636quZ) (parentFragment instanceof InterfaceC41636quZ ? parentFragment : null);
                    }
                    InterfaceC41636quZ interfaceC41636quZ = (InterfaceC41636quZ) obj;
                    if (interfaceC41636quZ != null) {
                        interfaceC41636quZ.AEQbTJ(this.OLrzqt, this.AEQbTJ);
                    }
                }
            }
        }
    }
}
