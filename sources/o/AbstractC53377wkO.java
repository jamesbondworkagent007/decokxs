package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.tradingbot.impl.order.strategy.twap.dialog.TwapModifyOrderPresenter;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsListLabelUiData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wkO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC53377wkO extends AbstractC49945uyC<AbstractC48610uXu, TwapModifyOrderPresenter> {
    public static final Application Companion = new Application(null);
    public final int OLrzqt = C48033uCm.Activity.dbUqJD;

    /* JADX INFO: renamed from: o.wkO$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    public abstract void EZpvd(@NotNull java.lang.String str, @NotNull TwapReq twapReq, @NotNull Function1<? super TwapReq, Unit> function1);

    /* JADX INFO: renamed from: o.wkO$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wkO.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ void show$default(Application application, TacticsData tacticsData, androidx.fragment.app.FragmentManager fragmentManager, boolean z, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            application.EZpvd(tacticsData, fragmentManager, z);
        }

        public final void EZpvd(@NotNull TacticsData tacticsData, @NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
            androidx.fragment.app.DialogFragment c53443wlb;
            Intrinsics.checkNotNullParameter(tacticsData, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            java.lang.String instType = tacticsData.getInstType();
            if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "SPOT")) {
                c53443wlb = new C53449wlh();
            } else {
                c53443wlb = Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "MARGIN") ? new C53443wlb() : new C53444wlc();
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("tacticsData", tacticsData);
            bundle.putBoolean("bot_is_home", z);
            c53443wlb.setArguments(bundle);
            c53443wlb.show(fragmentManager, "javaClass");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fJNWhG();
        copydefault();
        fARcdN();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.fObYrO));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    private final void fJNWhG() {
        TwapModifyOrderPresenter twapModifyOrderPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        twapModifyOrderPresenterOLrzqt.AEQbTJ(arguments != null ? (TacticsData) arguments.getParcelable("tacticsData") : null);
        TwapModifyOrderPresenter twapModifyOrderPresenterOLrzqt2 = OLrzqt();
        android.os.Bundle arguments2 = getArguments();
        twapModifyOrderPresenterOLrzqt2.AEQbTJ(arguments2 != null ? arguments2.getBoolean("bot_is_home") : false);
    }

    public void copydefault() {
        java.lang.String instType;
        java.lang.String tradeQuoteCcy;
        java.lang.String instId;
        java.util.ArrayList<TacticsListLabelUiData> labelList;
        final AbstractC48610uXu abstractC48610uXuValues = values();
        TacticsData tacticsDataValueOf = OLrzqt().valueOf();
        if (tacticsDataValueOf != null && (labelList = tacticsDataValueOf.getLabelList()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : labelList) {
                if (!((TacticsListLabelUiData) obj).KWHzl()) {
                    arrayList.add(obj);
                }
            }
            android.content.Context context = getContext();
            if (context != null && C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList.size()), 0)) {
                abstractC48610uXuValues.EZpvd.setVisibility(0);
                abstractC48610uXuValues.EZpvd.setExpand(true);
                abstractC48610uXuValues.EZpvd.removeAllViews();
                C55372xih c55372xih = abstractC48610uXuValues.EZpvd;
                android.widget.TextView textView = new android.widget.TextView(getContext());
                textView.setTextAppearance(C32113mPz.Dialog.getNewProxyInstance);
                textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                textView.setText(OLrzqt().AEQbTJ());
                c55372xih.addView(textView);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayList) {
                    if (!((TacticsListLabelUiData) obj2).KWHzl()) {
                        arrayList2.add(obj2);
                    }
                }
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    abstractC48610uXuValues.EZpvd.addView(C52534wOz.KWHzl.copydefault(context, (TacticsListLabelUiData) it.next()));
                }
            }
        }
        final C53448wlg c53448wlg = abstractC48610uXuValues.AEQbTJ;
        TacticsData tacticsDataValueOf2 = OLrzqt().valueOf();
        java.lang.String str = "";
        if (tacticsDataValueOf2 == null || (instType = tacticsDataValueOf2.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsDataValueOf3 = OLrzqt().valueOf();
        if (tacticsDataValueOf3 != null && (instId = tacticsDataValueOf3.getInstId()) != null) {
            str = instId;
        }
        C55887xsS c55887xsS = new C55887xsS(instType, str);
        TacticsData tacticsDataValueOf4 = OLrzqt().valueOf();
        if (tacticsDataValueOf4 == null || (tradeQuoteCcy = tacticsDataValueOf4.getTradeQuoteCcy()) == null || !java.lang.Boolean.valueOf(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy)).booleanValue()) {
            tradeQuoteCcy = null;
        }
        c55887xsS.gEmmrt(tradeQuoteCcy);
        c53448wlg.setInstManager(c55887xsS);
        c53448wlg.setLoadConfigCallback(new Function1() { // from class: o.wkW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return AbstractC53377wkO.copydefault(c53448wlg, this, (StrategyConfigInfo) obj3);
            }
        });
        C53448wlg.updateUi$default(c53448wlg, false, 1, null);
        C53448wlg.setCurrentType$default(c53448wlg, OLrzqt().copydefault(), false, 2, null);
        c53448wlg.gEmmrt(false);
        c53448wlg.setInputCallback(new Function1() { // from class: o.wkT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return AbstractC53377wkO.AEQbTJ(abstractC48610uXuValues, this, c53448wlg, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        C47988uAv.setInputContent$default(c53448wlg.AYXKKw(), OLrzqt().OLrzqt(), false, false, 6, null);
        C47988uAv.setInputContent$default(c53448wlg.AkhnZx(), OLrzqt().isConnected(), false, false, 6, null);
        C47988uAv.setInputContent$default(c53448wlg.isConnected(), OLrzqt().djBIcL(), false, false, 6, null);
        C47988uAv.setInputContent$default(c53448wlg.DbNXlk(), OLrzqt().gEmmrt(), false, false, 6, null);
        OLrzqt().AEQbTJ(c53448wlg.AEQbTJ());
        ViewOnClickListenerC53458wlq viewOnClickListenerC53458wlq = abstractC48610uXuValues.KWHzl;
        viewOnClickListenerC53458wlq.setInputPanelView(values().AEQbTJ);
        viewOnClickListenerC53458wlq.AEQbTJ(OLrzqt().valueOf(), OLrzqt().DbNXlk());
        viewOnClickListenerC53458wlq.valueOf();
        viewOnClickListenerC53458wlq.djBIcL();
        abstractC48610uXuValues.KWHzl.EZpvd(false);
        viewOnClickListenerC53458wlq.setPlaceOrderClickCallback(new Function2() { // from class: o.wkV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                return AbstractC53377wkO.copydefault(this.AEQbTJ, (java.lang.String) obj3, (java.lang.String) obj4);
            }
        });
    }

    public static final Unit copydefault(C53448wlg c53448wlg, AbstractC53377wkO abstractC53377wkO, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        C47988uAv.setInputContent$default(c53448wlg.values(), abstractC53377wkO.OLrzqt().AhwBna(), false, false, 6, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC48610uXu abstractC48610uXu, AbstractC53377wkO abstractC53377wkO, C53448wlg c53448wlg, boolean z) {
        if (!z) {
            abstractC48610uXu.KWHzl.EZpvd(false);
        } else {
            abstractC48610uXu.KWHzl.EZpvd(abstractC53377wkO.OLrzqt().EZpvd(c53448wlg.AEQbTJ()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final AbstractC53377wkO abstractC53377wkO, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.Pair<TwapReq, java.lang.Boolean> pairCopydefault = abstractC53377wkO.values().AEQbTJ.copydefault();
        if (pairCopydefault.getSecond().booleanValue()) {
            C49967uyY c49967uyY = C49967uyY.EZpvd;
            ViewOnClickListenerC53458wlq viewOnClickListenerC53458wlq = abstractC53377wkO.values().KWHzl;
            Intrinsics.checkNotNullExpressionValue(viewOnClickListenerC53458wlq, "");
            c49967uyY.KWHzl(viewOnClickListenerC53458wlq, C48033uCm.Application.fvQaOB, abstractC53377wkO.values().AEQbTJ.gEmmrt());
            C33054mpH.EZpvd(abstractC53377wkO);
        }
        TwapReq first = pairCopydefault.getFirst();
        if (first != null) {
            AbstractC49945uyC.showLoading$default(abstractC53377wkO, 0L, 1, null);
            abstractC53377wkO.EZpvd(str, first, new Function1() { // from class: o.wkX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC53377wkO.EZpvd(this.KWHzl, (TwapReq) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC53377wkO abstractC53377wkO, TwapReq twapReq) {
        if (twapReq == null) {
            abstractC53377wkO.EZpvd();
            return Unit.INSTANCE;
        }
        abstractC53377wkO.OLrzqt().EZpvd(twapReq);
        return Unit.INSTANCE;
    }

    private final void fARcdN() {
        TradeLiveData<java.util.List<StrategyResponse>> tradeLiveDataEZpvd = OLrzqt().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wkU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53377wkO.copydefault(this.copydefault, (java.util.List) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().AYXKKw().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.wkY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53377wkO.KWHzl(this.KWHzl, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit copydefault(AbstractC53377wkO abstractC53377wkO, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.addReporter, 0, 1, (java.lang.Object) null);
        abstractC53377wkO.EZpvd();
        abstractC53377wkO.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wkO$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ AbstractC53377wkO KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, AbstractC53377wkO abstractC53377wkO) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = abstractC53377wkO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.isConnected();
            }
        }
    }

    public static final Unit KWHzl(AbstractC53377wkO abstractC53377wkO, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        C55326xho.toast$default(exc.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        abstractC53377wkO.EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }
}
