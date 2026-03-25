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

/* JADX INFO: renamed from: o.qvs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41708qvs extends AbstractC40510qYn<RankingHotCryptoVo, C42852reI> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C41708qvs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: o.qvs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qvs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public C41708qvs(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:46) call: o.qvs.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C41708qvs(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42852reI AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42852reI c42852reIEZpvd = C42852reI.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42852reIEZpvd, "");
        return c42852reIEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42852reI c42852reI, final int i, @NotNull final RankingHotCryptoVo rankingHotCryptoVo) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(c42852reI, "");
        Intrinsics.checkNotNullParameter(rankingHotCryptoVo, "");
        C41431qqg.AEQbTJ(c42852reI.AhwBna, rankingHotCryptoVo.getShowIndex(), (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qvr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41708qvs.KWHzl(rankingHotCryptoVo, (android.widget.TextView) obj);
            }
        });
        java.lang.String strKWHzl = C55297xhL.KWHzl(rankingHotCryptoVo.getIcon(), C55298xhM.dp2px$default(28.0f, null, 1, null), C55298xhM.dp2px$default(28.0f, null, 1, null));
        if (strKWHzl != null) {
            AppCompatImageView appCompatImageView = c42852reI.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C57659ymb.EZpvd(appCompatImageView, strKWHzl, qZH.Activity.AhwBna);
        }
        C41431qqg.AEQbTJ(c42852reI.AEQbTJ, rankingHotCryptoVo.isShowChangePercent(), (Function1<? super C55071xcy, Unit>) new Function1() { // from class: o.qvu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41708qvs.copydefault(rankingHotCryptoVo, (C55071xcy) obj);
            }
        });
        boolean zContains = yDY.gEmmrt("CALL_AUCTION", "PRE_QUOTE").contains(rankingHotCryptoVo.getState());
        c42852reI.copydefault.setData(new kotlin.Pair<>(rankingHotCryptoVo.getCoinName(), rankingHotCryptoVo.isShowGroupName() ? rankingHotCryptoVo.getGroupName() : ""), rankingHotCryptoVo.getIndicate(), rankingHotCryptoVo.getLastPrice(), rankingHotCryptoVo.getQuotePrice(), rankingHotCryptoVo.getShowIndex());
        c42852reI.copydefault.setPriceLayoutVisible(rankingHotCryptoVo.isShowLastPrice() && !zContains, rankingHotCryptoVo.isShowQuotePrice() && !zContains);
        if (rankingHotCryptoVo.isShowComingString() && !rankingHotCryptoVo.isShowCountDown()) {
            C40492qXw c40492qXw = c42852reI.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
            c40492qXw.setVisibility(0);
            C40492qXw.setDeadlineTime$default(c42852reI.EZpvd, CountDownType.SHOW_EXPECT, C33070mpX.AYXKKw(qZH.PendingIntent.RihMUf), 0L, null, 8, null);
        } else if (rankingHotCryptoVo.isShowCountDown()) {
            C40492qXw c40492qXw2 = c42852reI.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c40492qXw2, "");
            c40492qXw2.setVisibility(0);
            c42852reI.EZpvd.setDeadlineTime(CountDownType.SHOW_COUNT_DOWN, C33070mpX.AYXKKw(qZH.PendingIntent.getSessionID), rankingHotCryptoVo.getCountDownTimeDeadline(), new Function1() { // from class: o.qvv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C41708qvs.copydefault(this.KWHzl, ((java.lang.Long) obj).longValue());
                }
            });
        } else if (zContains) {
            C40492qXw c40492qXw3 = c42852reI.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c40492qXw3, "");
            c40492qXw3.setVisibility(0);
            C40492qXw.setDeadlineTime$default(c42852reI.EZpvd, CountDownType.SHOW_EXPECT, C55527xld.OLrzqt(rankingHotCryptoVo.getState()), 0L, null, 8, null);
        } else {
            C40492qXw c40492qXw4 = c42852reI.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c40492qXw4, "");
            c40492qXw4.setVisibility(8);
        }
        if (java.lang.Math.max(0L, rankingHotCryptoVo.countDownTime()) <= 0 && rankingHotCryptoVo.isShowCountDown() && (function0 = this.copydefault) != null) {
            function0.invoke();
        }
        c42852reI.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.qvA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C41708qvs.AEQbTJ(c42852reI, rankingHotCryptoVo, i, view);
            }
        });
        C40499qYc root = c42852reI.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, c42852reI, rankingHotCryptoVo, i));
    }

    public static final Unit KWHzl(RankingHotCryptoVo rankingHotCryptoVo, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setTextColor(C33070mpX.copydefault(rankingHotCryptoVo.getIndex() <= 3 ? C52761wXj.Activity.HJWChPQdUnVm : C32113mPz.ActionBar.iwGUEr));
        textView.setTextSize(2, rankingHotCryptoVo.getIndex() <= 10 ? 14.0f : rankingHotCryptoVo.getIndex() < 100 ? 12.0f : 10.0f);
        textView.setText(java.lang.String.valueOf(rankingHotCryptoVo.getIndex()));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(RankingHotCryptoVo rankingHotCryptoVo, C55071xcy c55071xcy) {
        Intrinsics.checkNotNullParameter(c55071xcy, "");
        c55071xcy.setText(rankingHotCryptoVo.getChangePercent());
        c55071xcy.setStyleWithTheme(rankingHotCryptoVo.getChangePercentColor());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C41708qvs c41708qvs, long j) {
        Function0<Unit> function0 = c41708qvs.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final boolean AEQbTJ(C42852reI c42852reI, RankingHotCryptoVo rankingHotCryptoVo, int i, android.view.View view) {
        C40499qYc root = c42852reI.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC41695qvf interfaceC41695qvfOLrzqt = C41693qvd.OLrzqt(root);
        if (interfaceC41695qvfOLrzqt == null) {
            return true;
        }
        C40499qYc root2 = c42852reI.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        interfaceC41695qvfOLrzqt.EZpvd(root2, rankingHotCryptoVo, i);
        return true;
    }

    /* JADX INFO: renamed from: o.qvs$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ C42852reI OLrzqt;
        public final /* synthetic */ RankingHotCryptoVo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C42852reI c42852reI, RankingHotCryptoVo rankingHotCryptoVo, int i) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c42852reI;
            this.copydefault = rankingHotCryptoVo;
            this.KWHzl = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C40499qYc root = this.OLrzqt.getRoot();
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
                        interfaceC41636quZ.AEQbTJ(this.copydefault, this.KWHzl);
                    }
                }
            }
        }
    }
}
