package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbitrageListSorter;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbitrageSelectCoinPresenter;
import com.okinc.uilab.view.OKSortTextView;
import com.okinc.unify_trade.biz.FundingRateArbCoin;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52850waR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wbz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52937wbz extends AbstractC52855waW<uZH, SmartArbitrageSelectCoinPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int AhwBna = 8;
    public final float valueOf = 0.95f;
    public final C50027uzf<C52894wbI> gEmmrt = new C50027uzf<>(new StateListAnimator());
    public java.lang.String AYXKKw = "3d";
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.wbJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52937wbz.djBIcL(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.wbz$FragmentManager */
    public static final /* synthetic */ class FragmentManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.Qsauvs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.valueOf;
    }

    /* JADX INFO: renamed from: o.wbz$StateListAnimator */
    public static final class StateListAnimator extends DiffUtil.ItemCallback<C52894wbI> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C52894wbI c52894wbI, C52894wbI c52894wbI2) {
            Intrinsics.checkNotNullParameter(c52894wbI, "");
            Intrinsics.checkNotNullParameter(c52894wbI2, "");
            return Intrinsics.EZpvd((java.lang.Object) c52894wbI.EZpvd(), (java.lang.Object) c52894wbI2.EZpvd());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C52894wbI c52894wbI, C52894wbI c52894wbI2) {
            Intrinsics.checkNotNullParameter(c52894wbI, "");
            Intrinsics.checkNotNullParameter(c52894wbI2, "");
            return Intrinsics.EZpvd(c52894wbI, c52894wbI2);
        }
    }

    /* JADX INFO: renamed from: o.wbz$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wbz.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            new C52937wbz().show(fragmentManager, "smart_arbitrage_select_coin");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fARcdN();
        getNewProxyInstance();
        copydefault((uZH) values());
        OLrzqt((uZH) values());
        AbstractC49945uyC.showLoading$default(this, 0L, 1, null);
        ((SmartArbitrageSelectCoinPresenter) OLrzqt()).AEQbTJ();
    }

    /* JADX INFO: renamed from: o.wbz$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        public final /* synthetic */ uZH AEQbTJ;
        public final /* synthetic */ C52937wbz OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(uZH uzh, C52937wbz c52937wbz) {
            this.AEQbTJ = uzh;
            this.OLrzqt = c52937wbz;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            SmartArbitrageListSorter.SortingCriterion sortingCriterion;
            OKSortTextView.SortType sortTypeAEQbTJ;
            java.lang.String string = editable != null ? editable.toString() : null;
            if (string == null) {
                string = "";
            }
            if (this.AEQbTJ.KWHzl.AEQbTJ().AEQbTJ() == OKSortTextView.SortType.NONE) {
                sortingCriterion = SmartArbitrageListSorter.SortingCriterion.FilteredApy;
                sortTypeAEQbTJ = this.AEQbTJ.KWHzl.EZpvd().AEQbTJ();
            } else {
                sortingCriterion = SmartArbitrageListSorter.SortingCriterion.NextApy;
                sortTypeAEQbTJ = this.AEQbTJ.KWHzl.AEQbTJ().AEQbTJ();
            }
            ((SmartArbitrageSelectCoinPresenter) this.OLrzqt.OLrzqt()).copydefault(string, sortTypeAEQbTJ, this.OLrzqt.AYXKKw, sortingCriterion);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    /* JADX DEBUG: Possible override for method o.waW.ejfBZ()V */
    public final C52850waR ejfBZ() {
        return (C52850waR) this.DbNXlk.getValue();
    }

    public static final C52850waR djBIcL(C52937wbz c52937wbz) {
        android.content.Context contextRequireContext = c52937wbz.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C52850waR(contextRequireContext);
    }

    public final void copydefault(uZH uzh) {
        final C55100xda c55100xda = uzh.KWHzl;
        OKSortTextView oKSortTextViewCopydefault = c55100xda.copydefault();
        oKSortTextViewCopydefault.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.FhERFw));
        oKSortTextViewCopydefault.setDefaultIndicator(null);
        oKSortTextViewCopydefault.setUpIndicator(null);
        oKSortTextViewCopydefault.setDownIndicator(null);
        oKSortTextViewCopydefault.setDisableSort();
        OKSortTextView oKSortTextViewAEQbTJ = c55100xda.AEQbTJ();
        oKSortTextViewAEQbTJ.setSortType(OKSortTextView.SortType.UP, false);
        oKSortTextViewAEQbTJ.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.jNexW));
        oKSortTextViewAEQbTJ.setTextAlignment(6);
        oKSortTextViewAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.wbF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52937wbz.KWHzl(c55100xda, view);
            }
        });
        oKSortTextViewAEQbTJ.setOnSortTypeChangeListener(new Function2() { // from class: o.wbG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52937wbz.AEQbTJ(this.EZpvd, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
        OKSortTextView oKSortTextViewEZpvd = c55100xda.EZpvd();
        oKSortTextViewEZpvd.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.QKDJJA));
        oKSortTextViewEZpvd.setTextAlignment(6);
        oKSortTextViewEZpvd.setOnClickListener(new Application(oKSortTextViewEZpvd, 1000L, uzh, this, oKSortTextViewEZpvd, c55100xda));
    }

    public static final void KWHzl(C55100xda c55100xda, android.view.View view) {
        OKSortTextView.setNextSortType$default(c55100xda.AEQbTJ(), false, 1, null);
        c55100xda.EZpvd().setSortType(OKSortTextView.SortType.NONE, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52937wbz c52937wbz, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        ((SmartArbitrageSelectCoinPresenter) c52937wbz.OLrzqt()).AEQbTJ(sortType, c52937wbz.AYXKKw, SmartArbitrageListSorter.SortingCriterion.NextApy);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wbz$TaskDescription */
    public static final class TaskDescription implements C52850waR.Activity {
        public final /* synthetic */ OKSortTextView AEQbTJ;
        public final /* synthetic */ C55100xda EZpvd;

        public TaskDescription(OKSortTextView oKSortTextView, C55100xda c55100xda) {
            this.AEQbTJ = oKSortTextView;
            this.EZpvd = c55100xda;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
        @Override // o.C52850waR.Activity
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void copydefault(java.lang.String str, OKSortTextView.SortType sortType) {
            int i;
            OKSortTextView.SortType sortType2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(sortType, "");
            C52937wbz.this.AYXKKw = str;
            this.AEQbTJ.setSortType(sortType, false);
            int iHashCode = str.hashCode();
            if (iHashCode != 1681) {
                if (iHashCode != 50599) {
                    if (iHashCode == 56365 && str.equals("90d")) {
                        i = C48033uCm.Fragment.ExKek;
                    }
                } else if (str.equals("30d")) {
                    i = C48033uCm.Fragment.DGGHxk;
                }
                this.EZpvd.EZpvd().setText(C33070mpX.AYXKKw(i));
                sortType2 = OKSortTextView.SortType.NONE;
                if (sortType != sortType2) {
                    this.EZpvd.AEQbTJ().setSortType(sortType2, false);
                }
                ((SmartArbitrageSelectCoinPresenter) C52937wbz.this.OLrzqt()).AEQbTJ(sortType, str, SmartArbitrageListSorter.SortingCriterion.FilteredApy);
            }
            str.equals("3d");
            i = C48033uCm.Fragment.QKDJJA;
            this.EZpvd.EZpvd().setText(C33070mpX.AYXKKw(i));
            sortType2 = OKSortTextView.SortType.NONE;
            if (sortType != sortType2) {
            }
            ((SmartArbitrageSelectCoinPresenter) C52937wbz.this.OLrzqt()).AEQbTJ(sortType, str, SmartArbitrageListSorter.SortingCriterion.FilteredApy);
        }
    }

    /* JADX INFO: renamed from: o.wbz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C55100xda AEQbTJ;
        public final /* synthetic */ uZH EZpvd;
        public final /* synthetic */ OKSortTextView KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;
        public final /* synthetic */ C52937wbz valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, uZH uzh, C52937wbz c52937wbz, OKSortTextView oKSortTextView, C55100xda c55100xda) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = uzh;
            this.valueOf = c52937wbz;
            this.KWHzl = oKSortTextView;
            this.AEQbTJ = c55100xda;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.EZpvd.gEmmrt();
                this.EZpvd.EZpvd.clearFocus();
                this.valueOf.ejfBZ().copydefault(this.valueOf.AYXKKw, this.KWHzl.AEQbTJ(), this.KWHzl);
                this.valueOf.ejfBZ().copydefault(this.valueOf.new TaskDescription(this.KWHzl, this.AEQbTJ));
            }
        }
    }

    public final void OLrzqt(uZH uzh) {
        uzh.EZpvd.KWHzl().addTextChangedListener(new ActionBar(uzh, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fARcdN() {
        C50027uzf<C52894wbI> c50027uzf = this.gEmmrt;
        c50027uzf.register(C52894wbI.class, new C52956wcR(new Function0() { // from class: o.wbA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52937wbz.EZpvd(this.EZpvd);
            }
        }, new Function2() { // from class: o.wby
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52937wbz.OLrzqt(this.EZpvd, ((java.lang.Integer) obj).intValue(), (C52894wbI) obj2);
            }
        }));
        c50027uzf.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wbC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52937wbz.OLrzqt(this.AEQbTJ, (EmptyData) obj);
            }
        }));
        ((uZH) values()).copydefault.setLayoutManager(new LinearLayoutManager(getContext()));
        ((uZH) values()).copydefault.setAdapter(this.gEmmrt);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String EZpvd(C52937wbz c52937wbz) {
        return java.lang.String.valueOf(((uZH) c52937wbz.values()).EZpvd.AhwBna());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C52937wbz c52937wbz, int i, C52894wbI c52894wbI) {
        Intrinsics.checkNotNullParameter(c52894wbI, "");
        FundingRateArbCoin fundingRateArbCoinKWHzl = ((SmartArbitrageSelectCoinPresenter) c52937wbz.OLrzqt()).KWHzl(c52894wbI.EZpvd());
        if (fundingRateArbCoinKWHzl == null) {
            return Unit.INSTANCE;
        }
        FuzzySearchEventTracker.EZpvd.KWHzl(FuzzySearchEventSourceEnum.OKTRADECORE_COIN.getSource(), ((uZH) c52937wbz.values()).EZpvd.AhwBna(), C33129mqd.gEmmrt(fundingRateArbCoinKWHzl.getPrimary()), C33129mqd.gEmmrt(fundingRateArbCoinKWHzl.getSecondary()), C33129mqd.gEmmrt(java.lang.Double.valueOf(fundingRateArbCoinKWHzl.getPrimarySimilarity())), C33129mqd.gEmmrt(java.lang.Double.valueOf(fundingRateArbCoinKWHzl.getSecondarySimilarity())), java.lang.String.valueOf(i));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("data", fundingRateArbCoinKWHzl);
        Unit unit = Unit.INSTANCE;
        FragmentKt.setFragmentResult(c52937wbz, "smart_arbitrage_select_coin", bundle);
        c52937wbz.fJNWhG();
        return unit;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C52937wbz c52937wbz, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        ((SmartArbitrageSelectCoinPresenter) c52937wbz.OLrzqt()).AEQbTJ();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getNewProxyInstance() {
        TradeLiveData<java.util.List<C52894wbI>> tradeLiveDataOLrzqt = ((SmartArbitrageSelectCoinPresenter) OLrzqt()).OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataOLrzqt.observe(viewLifecycleOwner, new FragmentManager(new Function1() { // from class: o.wbE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52937wbz.copydefault(this.EZpvd, (java.util.List) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = ((SmartArbitrageSelectCoinPresenter) OLrzqt()).copydefault().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new FragmentManager(new Function1() { // from class: o.wbD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52937wbz.EZpvd(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit copydefault(C52937wbz c52937wbz, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c52937wbz.EZpvd();
        if (list.isEmpty()) {
            list = CommonEmptyData.ActionBar.buildNoResultData$default(CommonEmptyData.Companion, null, 60, 1, null);
        }
        C33064mpR.OLrzqt(c52937wbz.gEmmrt, (java.util.List<? extends java.lang.Object>) list);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C52937wbz c52937wbz, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c52937wbz.EZpvd();
        C33064mpR.OLrzqt(c52937wbz.gEmmrt, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, null, 60, false, null, null, false, 61, null));
        return Unit.INSTANCE;
    }

    private final void fJNWhG() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }
}
