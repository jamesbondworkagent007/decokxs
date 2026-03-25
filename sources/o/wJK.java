package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.itembinder.SmartCoinsData;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideOrderDialogPresenter;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import com.okinc.unify_trade.bot.data.TacticsCoinsInsideItemData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC52406wKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wJK extends AbstractC49945uyC<uOL, BotGuideOrderDialogPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public InterfaceC52406wKf AYXKKw;
    public AbstractC51292vkK copydefault;
    public boolean gEmmrt;
    public final int OLrzqt = C48033uCm.Activity.USBtdM;
    public final C43316rmw AEQbTJ = new C43316rmw();
    public final Function1<java.lang.String, Unit> AhwBna = new Function1() { // from class: o.wJX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return wJK.valueOf(this.KWHzl, (java.lang.String) obj);
        }
    };

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final Unit valueOf(wJK wjk, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "coins")) {
            InterfaceC52406wKf interfaceC52406wKf = wjk.AYXKKw;
            if (interfaceC52406wKf == null) {
                Intrinsics.gEmmrt("");
                interfaceC52406wKf = null;
            }
            interfaceC52406wKf.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wJK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ wJK newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, android.os.Parcelable parcelable, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return stateListAnimator.EZpvd(str, parcelable, str2);
        }

        public final wJK EZpvd(@NotNull java.lang.String str, android.os.Parcelable parcelable, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            wJK wjk = new wJK();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("type", str);
            bundle.putParcelable("data", parcelable);
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString("title", str2);
            wjk.setArguments(bundle);
            return wjk;
        }
    }

    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        BotGuideOrderDialogPresenter botGuideOrderDialogPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        botGuideOrderDialogPresenterOLrzqt.EZpvd(arguments != null ? arguments.getString("type") : null);
        OLrzqt().EZpvd(getArguments());
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(3);
        wxq.setTitle(OLrzqt().isConnected());
        wxq.KWHzl().setVisibility(8);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.fIwbmz));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
        getNewProxyInstance();
        uzCIH();
        fJNWhG();
        iwGUEr();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OLrzqt().fJNWhG();
        OLrzqt().fIwbmz();
    }

    public final void copydefault() {
        InterfaceC52406wKf taskDescription;
        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt().valueOf(), (java.lang.Object) "smart_portfolio")) {
            android.content.Context context = getContext();
            android.os.Bundle arguments = getArguments();
            taskDescription = new C52408wKh(context, arguments != null ? arguments.getParcelable("data") : null);
        } else {
            taskDescription = new TaskDescription();
        }
        this.AYXKKw = taskDescription;
    }

    public static final class TaskDescription implements InterfaceC52406wKf {
        @Override // o.InterfaceC52406wKf
        public void KWHzl() {
            InterfaceC52406wKf.ActionBar.OLrzqt(this);
        }
    }

    private final void getNewProxyInstance() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strValueOf = OLrzqt().valueOf();
        if (strValueOf == null) {
            strValueOf = "";
        }
        AbstractC51292vkK abstractC51292vkKAEQbTJ = new C52469wMo(contextRequireContext, strValueOf).AEQbTJ();
        this.copydefault = abstractC51292vkKAEQbTJ;
        if (abstractC51292vkKAEQbTJ != null) {
            abstractC51292vkKAEQbTJ.setQuotePercentListener(new Function1() { // from class: o.wJW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return wJK.AYXKKw(this.KWHzl, (java.lang.String) obj);
                }
            });
        }
        AbstractC51292vkK abstractC51292vkK = this.copydefault;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.setAmtChangeListener(new Function1() { // from class: o.wJV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return wJK.gEmmrt(this.AEQbTJ, (java.lang.String) obj);
                }
            });
        }
        AbstractC51292vkK abstractC51292vkK2 = this.copydefault;
        if (abstractC51292vkK2 != null) {
            abstractC51292vkK2.setQuoteContent("");
        }
        AbstractC51292vkK abstractC51292vkK3 = this.copydefault;
        if (abstractC51292vkK3 != null) {
            abstractC51292vkK3.setBalanceTitle(C33070mpX.AYXKKw(C55688xof.Application.ArrayRes), true, new Function0() { // from class: o.wJU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return wJK.OLrzqt(this.AEQbTJ);
                }
            });
        }
        getFieldNames();
        values().copydefault.addView(this.copydefault, new LinearLayout.LayoutParams(-1, -2));
    }

    public static final Unit AYXKKw(wJK wjk, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC51292vkK abstractC51292vkK = wjk.copydefault;
        if (abstractC51292vkK != null) {
            BotGuideOrderDialogPresenter botGuideOrderDialogPresenterOLrzqt = wjk.OLrzqt();
            java.lang.String value = wjk.OLrzqt().AkhnZx().getValue();
            abstractC51292vkK.setQuoteContent(botGuideOrderDialogPresenterOLrzqt.copydefault(value != null ? value : "", str));
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(wJK wjk, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC51292vkK abstractC51292vkK = wjk.copydefault;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.OLrzqt(wjk.OLrzqt().valueOf(), wjk.OLrzqt().AkhnZx().getValue());
        }
        wjk.ejfBZ();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(wJK wjk) {
        wjk.OLrzqt(wjk.OLrzqt().AEQbTJ());
        return Unit.INSTANCE;
    }

    private final void uzCIH() {
        EZpvd(false);
        android.widget.LinearLayout linearLayout = values().EZpvd;
        linearLayout.setOnClickListener(new Application(linearLayout, 1000L, this));
        values().AEQbTJ.setLayoutManager(new LinearLayoutManager(getContext()));
        values().AEQbTJ.setAdapter(this.AEQbTJ);
        values().AEQbTJ.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(12.0f, null, 1, null), 0));
        this.AEQbTJ.register(BotParamColorItemData.class, new C51261vjg());
        this.AEQbTJ.register(BotParamItemData.class, new C51263vji());
        this.AEQbTJ.register(SmartCoinsData.class, new C53186wgj());
        this.AEQbTJ.register(C55848xrg.class, new C51233vjE());
        this.AEQbTJ.register(TacticsCoinsInsideItemData.class, new C52484wNc(this.AhwBna));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ wJK OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, wJK wjk) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = wjk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.fARcdN();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ wJK OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, wJK wjk) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = wjk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.EZpvd(false);
            }
        }
    }

    public final void AuCTel() {
        CopyBotReqParam copyBotReqParamEZpvd;
        BotOrderConfirmFragment.TaskDescription taskDescription = BotOrderConfirmFragment.Companion;
        java.lang.String strCopydefault = OLrzqt().copydefault();
        BotGuideOrderDialogPresenter botGuideOrderDialogPresenterOLrzqt = OLrzqt();
        AbstractC51292vkK abstractC51292vkK = this.copydefault;
        if (abstractC51292vkK == null || (copyBotReqParamEZpvd = abstractC51292vkK.EZpvd()) == null) {
            return;
        }
        BotOrderConfirmFragment botOrderConfirmFragmentCopydefault = taskDescription.copydefault("", strCopydefault, botGuideOrderDialogPresenterOLrzqt.KWHzl(copyBotReqParamEZpvd), (248 & 8) != 0 ? false : false, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? "" : null, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : this.AhwBna);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        botOrderConfirmFragmentCopydefault.show(childFragmentManager);
    }

    private final void getFieldNames() {
        AbstractC51292vkK abstractC51292vkK = this.copydefault;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2), OLrzqt().AYXKKw(), OLrzqt().djBIcL(), OLrzqt().fetchVPNInfo());
        }
    }

    public final void fIwbmz() {
        AbstractC51292vkK abstractC51292vkK = this.copydefault;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.setMinInvest(OLrzqt().AhwBna());
        }
    }

    private final void copydefault(java.lang.String str) {
        AbstractC51292vkK abstractC51292vkK = this.copydefault;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.setBalance(OLrzqt().copydefault(str));
        }
        AbstractC51292vkK abstractC51292vkK2 = this.copydefault;
        if (abstractC51292vkK2 != null) {
            abstractC51292vkK2.OLrzqt(OLrzqt().valueOf(), str);
        }
    }

    private final void iwGUEr() {
        C33064mpR.OLrzqt(this.AEQbTJ, (java.util.List<? extends java.lang.Object>) OLrzqt().EZpvd());
    }

    private final void fJNWhG() {
        getChildFragmentManager().setFragmentResultListener("bot_order", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wJP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                wJK.OLrzqt(this.OLrzqt, str, bundle);
            }
        });
        C56111xwe<java.lang.String> c56111xweGEmmrt = OLrzqt().gEmmrt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweGEmmrt.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.wJR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wJK.djBIcL(this.copydefault, (java.lang.String) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweAkhnZx = OLrzqt().AkhnZx();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweAkhnZx.observe(viewLifecycleOwner2, new ActionBar(new Function1() { // from class: o.wJQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wJK.AhwBna(this.copydefault, (java.lang.String) obj);
            }
        }));
        C56111xwe<java.util.List<StrategyResponse>> c56111xweDbNXlk = OLrzqt().DbNXlk();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweDbNXlk.observe(viewLifecycleOwner3, new ActionBar(new Function1() { // from class: o.wJO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wJK.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.wJS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wJK.OLrzqt(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final void OLrzqt(wJK wjk, java.lang.String str, android.os.Bundle bundle) {
        CopyBotReqParam copyBotReqParamEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        AbstractC51292vkK abstractC51292vkK = wjk.copydefault;
        if (abstractC51292vkK == null || (copyBotReqParamEZpvd = abstractC51292vkK.EZpvd()) == null) {
            return;
        }
        pUU.KWHzl("Order", "BotGuideOrderDialogFragment Order");
        wjk.OLrzqt().copydefault(copyBotReqParamEZpvd);
    }

    public static final Unit djBIcL(wJK wjk, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        wjk.fIwbmz();
        wjk.isConnected();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(wJK wjk, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        wjk.copydefault(str);
        wjk.isConnected();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(wJK wjk, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        FragmentActivity activity = wjk.getActivity();
        if (activity != null) {
            ActivityC51150vhb.Companion.AEQbTJ(activity, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : wjk.OLrzqt().valueOf(), (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : ((StrategyResponse) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
        }
        wjk.hDKMBd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(wJK wjk, androidx.core.util.Pair pair) {
        java.lang.String message;
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) wjk.OLrzqt().values().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        AbstractC51292vkK abstractC51292vkK = this.copydefault;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.setQuoteContent(OLrzqt().KWHzl());
        }
    }

    private final void hDKMBd() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(BotOrderConfirmFragment.class.getSimpleName());
        wXX wxx = fragmentFindFragmentByTag instanceof wXX ? (wXX) fragmentFindFragmentByTag : null;
        if (wxx != null) {
            wxx.dismiss();
        }
        dismiss();
    }

    public final void EZpvd(boolean z) {
        android.graphics.drawable.Drawable drawable = null;
        if (z) {
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.OTwTPd);
            if (drawableKWHzl != null) {
                drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
                drawable = drawableKWHzl;
            }
            values().KWHzl.setImageDrawable(drawable);
            values().AEQbTJ.setVisibility(0);
            return;
        }
        android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.call);
        if (drawableKWHzl2 != null) {
            drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
            drawable = drawableKWHzl2;
        }
        values().KWHzl.setImageDrawable(drawable);
        values().AEQbTJ.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fARcdN() {
        AbstractC51292vkK abstractC51292vkK = this.copydefault;
        if ((abstractC51292vkK == null || abstractC51292vkK.AEQbTJ()) && ejfBZ()) {
            AuCTel();
        }
    }

    private final void OLrzqt(java.lang.String str) {
        android.content.Context context = getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(str);
            viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.wJT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wJK.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final boolean ejfBZ() {
        CopyBotReqParam copyBotReqParamEZpvd;
        AbstractC51292vkK abstractC51292vkK;
        AbstractC51292vkK abstractC51292vkK2 = this.copydefault;
        if (abstractC51292vkK2 == null || (copyBotReqParamEZpvd = abstractC51292vkK2.EZpvd()) == null) {
            return false;
        }
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairAEQbTJ = OLrzqt().AEQbTJ(copyBotReqParamEZpvd);
        if (!pairAEQbTJ.getFirst().booleanValue()) {
            AbstractC51292vkK abstractC51292vkK3 = this.copydefault;
            if (abstractC51292vkK3 != null) {
                abstractC51292vkK3.EZpvd(false, pairAEQbTJ.getSecond());
            }
        } else if (!this.gEmmrt && (abstractC51292vkK = this.copydefault) != null) {
            AbstractC51292vkK.refreshValidView$default(abstractC51292vkK, true, null, 2, null);
        }
        return pairAEQbTJ.getFirst().booleanValue();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.getBehavior().setDraggable(false);
            bottomSheetDialog.getBehavior().setSkipCollapsed(true);
        }
    }
}
