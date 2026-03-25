package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.ViewKt;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.ranking.core.model.RankingNewSpotVo;
import com.okinc.unify_trade.biz.CountDownType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qvC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41666qvC extends AbstractC40510qYn<RankingNewSpotVo, C42854reK> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public Function0<Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C41666qvC() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:132) call: o.qvC.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C41666qvC(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    /* JADX INFO: renamed from: o.qvC$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qvC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public C41666qvC(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42854reK AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42854reK c42854reKAEQbTJ = C42854reK.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42854reKAEQbTJ, "");
        return c42854reKAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42854reK c42854reK, final int i, @NotNull final RankingNewSpotVo rankingNewSpotVo) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(c42854reK, "");
        Intrinsics.checkNotNullParameter(rankingNewSpotVo, "");
        C41431qqg.AEQbTJ(c42854reK.djBIcL, rankingNewSpotVo.getShowIndex(), (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qvD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41666qvC.KWHzl(rankingNewSpotVo, (android.widget.TextView) obj);
            }
        });
        java.lang.String strKWHzl = C55297xhL.KWHzl(rankingNewSpotVo.getIcon(), C55298xhM.dp2px$default(28.0f, null, 1, null), C55298xhM.dp2px$default(28.0f, null, 1, null));
        if (strKWHzl != null) {
            AppCompatImageView appCompatImageView = c42854reK.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C57659ymb.EZpvd(appCompatImageView, strKWHzl, qZH.Activity.AhwBna);
        }
        C41431qqg.AEQbTJ(c42854reK.copydefault, rankingNewSpotVo.isShowChangePercent(), (Function1<? super C55071xcy, Unit>) new Function1() { // from class: o.qvE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41666qvC.copydefault(rankingNewSpotVo, (C55071xcy) obj);
            }
        });
        c42854reK.OLrzqt.setData(new kotlin.Pair<>(rankingNewSpotVo.getCoinName(), rankingNewSpotVo.isShowGroupName() ? rankingNewSpotVo.getGroupName() : ""), rankingNewSpotVo.getIndicate(), rankingNewSpotVo.getLastPrice(), rankingNewSpotVo.getQuotePrice(), rankingNewSpotVo.getShowIndex());
        c42854reK.OLrzqt.setPriceLayoutVisible(rankingNewSpotVo.isShowLastPrice(), rankingNewSpotVo.isShowQuotePrice());
        if (rankingNewSpotVo.isShowComingString() && !rankingNewSpotVo.isShowCountDown()) {
            C40492qXw c40492qXw = c42854reK.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
            c40492qXw.setVisibility(0);
            C40492qXw.setDeadlineTime$default(c42854reK.KWHzl, CountDownType.SHOW_EXPECT, C33070mpX.AYXKKw(qZH.PendingIntent.RihMUf), 0L, null, 8, null);
        } else if (rankingNewSpotVo.isShowCountDown()) {
            C40492qXw c40492qXw2 = c42854reK.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c40492qXw2, "");
            c40492qXw2.setVisibility(0);
            c42854reK.KWHzl.setDeadlineTime(CountDownType.SHOW_COUNT_DOWN, C33070mpX.AYXKKw(qZH.PendingIntent.getSessionID), rankingNewSpotVo.getCountDownTimeDeadline(), new Function1() { // from class: o.qvI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C41666qvC.KWHzl(this.copydefault, ((java.lang.Long) obj).longValue());
                }
            });
        } else {
            C40492qXw c40492qXw3 = c42854reK.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c40492qXw3, "");
            c40492qXw3.setVisibility(8);
        }
        if (java.lang.Math.max(0L, rankingNewSpotVo.countDownTime()) <= 0 && rankingNewSpotVo.isShowCountDown() && (function0 = this.AEQbTJ) != null) {
            function0.invoke();
        }
        c42854reK.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.qvG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C41666qvC.KWHzl(c42854reK, rankingNewSpotVo, i, view);
            }
        });
        C40499qYc root = c42854reK.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, c42854reK, this, rankingNewSpotVo, i));
    }

    public static final Unit KWHzl(RankingNewSpotVo rankingNewSpotVo, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setTextColor(C33070mpX.copydefault(rankingNewSpotVo.getIndex() <= 3 ? C52761wXj.Activity.HJWChPQdUnVm : C32113mPz.ActionBar.iwGUEr));
        textView.setTextSize(2, rankingNewSpotVo.getIndex() <= 10 ? 14.0f : rankingNewSpotVo.getIndex() < 100 ? 12.0f : 10.0f);
        textView.setText(java.lang.String.valueOf(rankingNewSpotVo.getIndex()));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(RankingNewSpotVo rankingNewSpotVo, C55071xcy c55071xcy) {
        Intrinsics.checkNotNullParameter(c55071xcy, "");
        c55071xcy.setText(rankingNewSpotVo.getChangePercent());
        c55071xcy.setStyleWithTheme(rankingNewSpotVo.getChangePercentColor());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qvC$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ RankingNewSpotVo AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ C42854reK KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;
        public final /* synthetic */ C41666qvC valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C42854reK c42854reK, C41666qvC c41666qvC, RankingNewSpotVo rankingNewSpotVo, int i) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c42854reK;
            this.valueOf = c41666qvC;
            this.AEQbTJ = rankingNewSpotVo;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C40499qYc root = this.KWHzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(root));
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
                        interfaceC41636quZ.AEQbTJ(this.valueOf.copydefault(this.AEQbTJ), this.EZpvd);
                    }
                }
            }
        }
    }

    public static final Unit KWHzl(C41666qvC c41666qvC, long j) {
        Function0<Unit> function0 = c41666qvC.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final boolean KWHzl(C42854reK c42854reK, RankingNewSpotVo rankingNewSpotVo, int i, android.view.View view) {
        C40499qYc root = c42854reK.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC41695qvf interfaceC41695qvfOLrzqt = C41693qvd.OLrzqt(root);
        if (interfaceC41695qvfOLrzqt == null) {
            return true;
        }
        C40499qYc root2 = c42854reK.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        interfaceC41695qvfOLrzqt.OLrzqt(root2, rankingNewSpotVo, i);
        return true;
    }

    public final RankingHotCryptoVo copydefault(RankingNewSpotVo rankingNewSpotVo) {
        return new RankingHotCryptoVo(rankingNewSpotVo.getIndex(), rankingNewSpotVo.getInstId(), rankingNewSpotVo.getInstType(), rankingNewSpotVo.getIcon(), rankingNewSpotVo.getCoinName(), null, null, false, null, false, null, 0, false, false, false, false, null, null, false, null, false, null, false, null, rankingNewSpotVo.getAlias(), null, rankingNewSpotVo.isWatch(), rankingNewSpotVo.getTimeStamp(), null, rankingNewSpotVo.getPeriod(), null, null, null, null, null, -754974752, 7, null);
    }
}
