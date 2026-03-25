package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.ViewKt;
import com.okinc.market.search.features.main.result.ui.SubPage;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qEl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39968qEl extends AbstractC39964qEh<C39994qFk, C42881rel> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = (int) C55298xhM.dp$default(62, (android.content.Context) null, 1, (java.lang.Object) null);
    public final SubPage EZpvd;

    public C39968qEl(SubPage subPage) {
        this.EZpvd = subPage;
    }

    /* JADX INFO: renamed from: o.qEl$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qEl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final int EZpvd() {
            return C39968qEl.copydefault;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42881rel AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42881rel c42881relKWHzl = C42881rel.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42881relKWHzl, "");
        return c42881relKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42881rel c42881rel, final int i, @NotNull final C39994qFk c39994qFk) {
        Intrinsics.checkNotNullParameter(c42881rel, "");
        Intrinsics.checkNotNullParameter(c39994qFk, "");
        c42881rel.getRoot().setContentDescription("globalSearchBizItem" + i);
        C41431qqg.AEQbTJ(c42881rel.djBIcL, c39994qFk.AuCTel(), (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qEk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39968qEl.AhwBna(c39994qFk, (android.widget.TextView) obj);
            }
        });
        C41431qqg.AEQbTJ(c42881rel.AEQbTJ, c39994qFk.values(), (Function1<? super AppCompatImageView, Unit>) new Function1() { // from class: o.qEs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39968qEl.EZpvd(c39994qFk, (AppCompatImageView) obj);
            }
        });
        C41431qqg.AEQbTJ(c42881rel.AYXKKw, c39994qFk.fetchVPNInfo(), (Function1<? super AppCompatTextView, Unit>) new Function1() { // from class: o.qEo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39968qEl.OLrzqt(this.KWHzl, c39994qFk, (AppCompatTextView) obj);
            }
        });
        C41431qqg.AEQbTJ(c42881rel.DbNXlk, c39994qFk.getFieldNames(), (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qEp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39968qEl.OLrzqt(this.EZpvd, c39994qFk, (android.widget.TextView) obj);
            }
        });
        C41431qqg.AEQbTJ(c42881rel.values, c39994qFk.fIwbmz(), (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qEq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39968qEl.copydefault(c39994qFk, (android.widget.TextView) obj);
            }
        });
        android.widget.LinearLayout linearLayout = c42881rel.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(c39994qFk.fJNWhG() ? 0 : 8);
        android.widget.TextView textView = c42881rel.fARcdN;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((c39994qFk.KWHzl().isPreMarketPair() && Intrinsics.EZpvd((java.lang.Object) c39994qFk.KWHzl().getInstType(), (java.lang.Object) "SWAP")) ? 0 : 8);
        if (c39994qFk.KWHzl().isPreMarketPair() && Intrinsics.EZpvd((java.lang.Object) c39994qFk.KWHzl().getInstType(), (java.lang.Object) "SWAP")) {
            android.widget.TextView textView2 = c42881rel.fARcdN;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            c42881rel.fARcdN.setText(C33070mpX.AYXKKw(qZH.PendingIntent.hbZCHz));
        } else if (c39994qFk.KWHzl().isRebasePair() && Intrinsics.EZpvd((java.lang.Object) c39994qFk.KWHzl().getInstType(), (java.lang.Object) "SWAP")) {
            android.widget.TextView textView3 = c42881rel.fARcdN;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
            c42881rel.fARcdN.setText(C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPRGtXKCDKRTZD));
        } else {
            android.widget.TextView textView4 = c42881rel.fARcdN;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(8);
        }
        C55251xgS c55251xgS = c42881rel.isConnected;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(c39994qFk.fARcdN() ? 0 : 8);
        AppCompatImageView appCompatImageView = c42881rel.AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(c39994qFk.ejfBZ() ? 0 : 8);
        CountDownInfo countDownInfo = c39994qFk.KWHzl().getCountDownInfo();
        if (countDownInfo == null || (countDownInfo.countDownTimeExpire() && countDownInfo.getShowType() != CountDownType.SHOW_EXPECT)) {
            countDownInfo = null;
        }
        C40492qXw c40492qXw = c42881rel.copydefault;
        Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
        if (!C41310qoR.AEQbTJ(c40492qXw, countDownInfo, c39994qFk.KWHzl().getInstId(), c39994qFk.KWHzl().getInstType())) {
            C41431qqg.AEQbTJ(c42881rel.fetchVPNInfo, c39994qFk.iwGUEr(), (Function1<? super AppCompatTextView, Unit>) new Function1() { // from class: o.qEr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39968qEl.KWHzl(c39994qFk, (AppCompatTextView) obj);
                }
            });
            C41431qqg.AEQbTJ(c42881rel.AkhnZx, c39994qFk.hDKMBd(), (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qEu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39968qEl.OLrzqt(c39994qFk, (android.widget.TextView) obj);
                }
            });
        } else {
            AppCompatTextView appCompatTextView = c42881rel.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(8);
            android.widget.TextView textView5 = c42881rel.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(8);
        }
        C41431qqg.AEQbTJ(c42881rel.gEmmrt, c39994qFk.getNewProxyInstance(), (Function1<? super AppCompatImageView, Unit>) new Function1() { // from class: o.qEx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39968qEl.OLrzqt(c39994qFk, c42881rel, i, (AppCompatImageView) obj);
            }
        });
        C40499qYc c40499qYcAEQbTJ = c42881rel.getRoot();
        c40499qYcAEQbTJ.setOnClickListener(new TaskDescription(c40499qYcAEQbTJ, 1000L, this, c42881rel, c39994qFk, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AhwBna(C39994qFk c39994qFk, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setTextColor(C33070mpX.copydefault(c39994qFk.OLrzqt() <= 3 ? C52761wXj.Activity.HJWChPQdUnVm : C32113mPz.ActionBar.iwGUEr));
        textView.setText(java.lang.String.valueOf(c39994qFk.OLrzqt()));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C39994qFk c39994qFk, AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "");
        if (c39994qFk.AEQbTJ() != null) {
            C46742tcs.AEQbTJ(appCompatImageView, c39994qFk.AEQbTJ());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C39968qEl c39968qEl, C39994qFk c39994qFk, AppCompatTextView appCompatTextView) {
        Intrinsics.checkNotNullParameter(appCompatTextView, "");
        c39968qEl.AEQbTJ(appCompatTextView, c39994qFk.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C39968qEl c39968qEl, C39994qFk c39994qFk, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        c39968qEl.AEQbTJ(textView, c39994qFk.AhwBna());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C39994qFk c39994qFk, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setText(c39994qFk.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C39994qFk c39994qFk, AppCompatTextView appCompatTextView) {
        Intrinsics.checkNotNullParameter(appCompatTextView, "");
        appCompatTextView.setText(c39994qFk.AYXKKw());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C39994qFk c39994qFk, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        C41426qqb.setText$default(textView, c39994qFk.djBIcL(), (java.lang.CharSequence) c39994qFk.gEmmrt(), 0, 0, 0, false, 60, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C39994qFk c39994qFk, C42881rel c42881rel, int i, AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "");
        appCompatImageView.setSelected(c39994qFk.AubY());
        appCompatImageView.setOnClickListener(new StateListAnimator(appCompatImageView, 1000L, c42881rel, i, c39994qFk));
        C55296xhK.EZpvd((android.view.View) appCompatImageView, copydefault);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qEl$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ C39994qFk OLrzqt;
        public final /* synthetic */ C42881rel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42881rel c42881rel, int i, C39994qFk c39994qFk) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c42881rel;
            this.KWHzl = i;
            this.OLrzqt = c39994qFk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C40499qYc c40499qYcAEQbTJ = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(c40499qYcAEQbTJ, "");
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(c40499qYcAEQbTJ));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
                if (fragment != null) {
                    boolean z = fragment instanceof qHR;
                    java.lang.Object obj = fragment;
                    if (!z) {
                        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                        while (parentFragment != null && !(parentFragment instanceof qHR)) {
                            parentFragment = parentFragment.getParentFragment();
                        }
                        obj = (qHR) (parentFragment instanceof qHR ? parentFragment : null);
                    }
                    qHR qhr = (qHR) obj;
                    if (qhr != null) {
                        qhr.EZpvd(this.KWHzl, this.OLrzqt.KWHzl(), !this.OLrzqt.AubY());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.qEl$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C39968qEl AYXKKw;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ C39994qFk OLrzqt;
        public final /* synthetic */ C42881rel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C39968qEl c39968qEl, C42881rel c42881rel, C39994qFk c39994qFk, int i) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.AYXKKw = c39968qEl;
            this.copydefault = c42881rel;
            this.OLrzqt = c39994qFk;
            this.KWHzl = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.AYXKKw.EZpvd != null) {
                    C40499qYc c40499qYcAEQbTJ = this.copydefault.getRoot();
                    Intrinsics.checkNotNullExpressionValue(c40499qYcAEQbTJ, "");
                    qHN qhnOLrzqt = qHO.OLrzqt(c40499qYcAEQbTJ);
                    if (qhnOLrzqt != null) {
                        qhnOLrzqt.OLrzqt(this.OLrzqt.KWHzl(), this.AYXKKw.EZpvd, this.KWHzl);
                    }
                } else {
                    C40499qYc c40499qYcAEQbTJ2 = this.copydefault.getRoot();
                    Intrinsics.checkNotNullExpressionValue(c40499qYcAEQbTJ2, "");
                    qHN qhnOLrzqt2 = qHO.OLrzqt(c40499qYcAEQbTJ2);
                    if (qhnOLrzqt2 != null) {
                        qhnOLrzqt2.EZpvd(this.OLrzqt.KWHzl(), this.KWHzl);
                    }
                }
                C40499qYc c40499qYcAEQbTJ3 = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(c40499qYcAEQbTJ3, "");
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(c40499qYcAEQbTJ3));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
                if (fragment != null) {
                    boolean z = fragment instanceof qHM;
                    java.lang.Object obj = fragment;
                    if (!z) {
                        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                        while (parentFragment != null && !(parentFragment instanceof qHM)) {
                            parentFragment = parentFragment.getParentFragment();
                        }
                        obj = (qHM) (parentFragment instanceof qHM ? parentFragment : null);
                    }
                    qHM qhm = (qHM) obj;
                    if (qhm != null) {
                        qhm.OLrzqt(this.OLrzqt.KWHzl(), this.KWHzl, this.AYXKKw.EZpvd, this.AYXKKw.AEQbTJ(), this.AYXKKw.EZpvd != null, this.AYXKKw.EZpvd != null);
                    }
                }
            }
        }
    }
}
