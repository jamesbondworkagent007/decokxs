package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.ViewKt;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
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

/* JADX INFO: renamed from: o.qvw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41712qvw extends AbstractC40510qYn<RankingHotCryptoVo, C42853reJ> {
    public final java.lang.String KWHzl;
    public Function0<Unit> copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public C41712qvw(@NotNull java.lang.String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.copydefault = function0;
    }

    /* JADX INFO: renamed from: o.qvw$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qvw.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42853reJ AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42853reJ c42853reJAEQbTJ = C42853reJ.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42853reJAEQbTJ, "");
        return c42853reJAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42853reJ c42853reJ, final int i, @NotNull final RankingHotCryptoVo rankingHotCryptoVo) {
        java.util.List list;
        Function0<Unit> function0;
        java.util.List listEZpvd;
        Intrinsics.checkNotNullParameter(c42853reJ, "");
        Intrinsics.checkNotNullParameter(rankingHotCryptoVo, "");
        C41431qqg.AEQbTJ(c42853reJ.valueOf, rankingHotCryptoVo.getShowIndex(), (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qvz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41712qvw.OLrzqt(rankingHotCryptoVo, (android.widget.TextView) obj);
            }
        });
        java.lang.String strKWHzl = C55297xhL.KWHzl(rankingHotCryptoVo.getIcon(), C55298xhM.dp2px$default(28.0f, null, 1, null), C55298xhM.dp2px$default(28.0f, null, 1, null));
        if (strKWHzl != null) {
            AppCompatImageView appCompatImageView = c42853reJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C57659ymb.EZpvd(appCompatImageView, strKWHzl, qZH.Activity.AhwBna);
        }
        C41431qqg.AEQbTJ(c42853reJ.EZpvd, rankingHotCryptoVo.isShowChangePercent(), (Function1<? super C55071xcy, Unit>) new Function1() { // from class: o.qvy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41712qvw.EZpvd(rankingHotCryptoVo, (C55071xcy) obj);
            }
        });
        boolean z = Intrinsics.EZpvd((java.lang.Object) rankingHotCryptoVo.getInstType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) rankingHotCryptoVo.getInstType(), (java.lang.Object) "PERPETUAL");
        java.lang.String ruleType = rankingHotCryptoVo.getRuleType();
        boolean zGEmmrt = ruleType != null ? C59449zhJ.gEmmrt(ruleType, "pre_market", true) : false;
        java.lang.String ruleType2 = rankingHotCryptoVo.getRuleType();
        boolean zGEmmrt2 = ruleType2 != null ? C59449zhJ.gEmmrt(ruleType2, "rebase_contract", true) : false;
        C42989rgn c42989rgn = c42853reJ.copydefault;
        kotlin.Pair pair = new kotlin.Pair(rankingHotCryptoVo.getCoinName(), rankingHotCryptoVo.isShowGroupName() ? rankingHotCryptoVo.getGroupName() : "");
        if (z) {
            if (zGEmmrt) {
                listEZpvd = yDY.gEmmrt(this.KWHzl, C33070mpX.AYXKKw(qZH.PendingIntent.hbZCHz));
            } else if (zGEmmrt2) {
                listEZpvd = yDY.gEmmrt(this.KWHzl, C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPRGtXKCDKRTZD));
            } else {
                listEZpvd = C56402yEa.EZpvd(this.KWHzl);
            }
            list = listEZpvd;
        } else {
            list = null;
        }
        c42989rgn.setData(pair, list, rankingHotCryptoVo.getIndicate(), rankingHotCryptoVo.getLastPrice(), rankingHotCryptoVo.getQuotePrice(), (1920 & 32) != 0 ? null : Intrinsics.EZpvd((java.lang.Object) rankingHotCryptoVo.getInstType(), (java.lang.Object) "SWAP") ? java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD) : null, (1920 & 64) != 0 ? null : Intrinsics.EZpvd((java.lang.Object) rankingHotCryptoVo.getInstType(), (java.lang.Object) "SWAP") ? java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ) : null, (1920 & 128) != 0 ? false : false, (1920 & 256) != 0 ? java.lang.Boolean.FALSE : null, (1920 & 512) != 0 ? "" : null, (1920 & 1024) != 0 ? null : null);
        c42853reJ.copydefault.setPriceLayoutVisible(rankingHotCryptoVo.isShowLastPrice(), rankingHotCryptoVo.isShowQuotePrice());
        if (rankingHotCryptoVo.isShowComingString() && !rankingHotCryptoVo.isShowCountDown()) {
            C40492qXw c40492qXw = c42853reJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
            c40492qXw.setVisibility(0);
            C40492qXw.setDeadlineTime$default(c42853reJ.AEQbTJ, CountDownType.SHOW_EXPECT, C33070mpX.AYXKKw(qZH.PendingIntent.RihMUf), 0L, null, 8, null);
        } else if (rankingHotCryptoVo.isShowCountDown()) {
            C40492qXw c40492qXw2 = c42853reJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c40492qXw2, "");
            c40492qXw2.setVisibility(0);
            c42853reJ.AEQbTJ.setDeadlineTime(CountDownType.SHOW_COUNT_DOWN, C33070mpX.AYXKKw(qZH.PendingIntent.getSessionID), rankingHotCryptoVo.getCountDownTimeDeadline(), new Function1() { // from class: o.qvB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C41712qvw.EZpvd(this.OLrzqt, ((java.lang.Long) obj).longValue());
                }
            });
        } else {
            C40492qXw c40492qXw3 = c42853reJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c40492qXw3, "");
            c40492qXw3.setVisibility(8);
        }
        if (java.lang.Math.max(0L, rankingHotCryptoVo.countDownTime()) <= 0 && rankingHotCryptoVo.isShowCountDown() && (function0 = this.copydefault) != null) {
            function0.invoke();
        }
        c42853reJ.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.qvF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C41712qvw.copydefault(c42853reJ, rankingHotCryptoVo, i, view);
            }
        });
        C40499qYc root = c42853reJ.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, c42853reJ, rankingHotCryptoVo, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(RankingHotCryptoVo rankingHotCryptoVo, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setTextColor(C33070mpX.copydefault(rankingHotCryptoVo.getIndex() <= 3 ? C52761wXj.Activity.HJWChPQdUnVm : C32113mPz.ActionBar.iwGUEr));
        textView.setTextSize(2, rankingHotCryptoVo.getIndex() <= 10 ? 14.0f : rankingHotCryptoVo.getIndex() < 100 ? 12.0f : 10.0f);
        textView.setText(java.lang.String.valueOf(rankingHotCryptoVo.getIndex()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(RankingHotCryptoVo rankingHotCryptoVo, C55071xcy c55071xcy) {
        Intrinsics.checkNotNullParameter(c55071xcy, "");
        c55071xcy.setText(rankingHotCryptoVo.getChangePercent());
        c55071xcy.setStyleWithTheme(rankingHotCryptoVo.getChangePercentColor());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C41712qvw c41712qvw, long j) {
        Function0<Unit> function0 = c41712qvw.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final boolean copydefault(C42853reJ c42853reJ, RankingHotCryptoVo rankingHotCryptoVo, int i, android.view.View view) {
        C40499qYc root = c42853reJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC41695qvf interfaceC41695qvfOLrzqt = C41693qvd.OLrzqt(root);
        if (interfaceC41695qvfOLrzqt == null) {
            return true;
        }
        C40499qYc root2 = c42853reJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        interfaceC41695qvfOLrzqt.EZpvd(root2, rankingHotCryptoVo, i);
        return true;
    }

    /* JADX INFO: renamed from: o.qvw$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ RankingHotCryptoVo AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ C42853reJ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C42853reJ c42853reJ, RankingHotCryptoVo rankingHotCryptoVo, int i) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c42853reJ;
            this.AEQbTJ = rankingHotCryptoVo;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C40499qYc root = this.copydefault.getRoot();
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
                        interfaceC41636quZ.AEQbTJ(this.AEQbTJ, this.OLrzqt);
                    }
                }
            }
        }
    }
}
