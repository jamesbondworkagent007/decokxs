package com.okinc.tradingbot.impl.order.strategy.ordercomfirm;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.Distribution;
import com.okinc.unify_trade.biz.GridProfitRateResp;
import com.okinc.unify_trade.biz.OrderCategory;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.bot.data.BotRemindData;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsClickableInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsCoinsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC48381uPj;
import o.AbstractC49945uyC;
import o.C31703mAu;
import o.C32866mlf;
import o.C33064mpR;
import o.C33070mpX;
import o.C33129mqd;
import o.C33484mxN;
import o.C48033uCm;
import o.C51278vjx;
import o.C52484wNc;
import o.C52487wNf;
import o.C52491wNj;
import o.C52512wOd;
import o.C52671wUa;
import o.C52692wUv;
import o.C52761wXj;
import o.C53490wmV;
import o.C54145wyo;
import o.C54589xNz;
import o.C55296xhK;
import o.C55297xhL;
import o.C55298xhM;
import o.C55688xof;
import o.C56028xvA;
import o.C56033xvF;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56424yEw;
import o.C56524yIo;
import o.C58114yvF;
import o.C59534zip;
import o.ComponentCallbacks2C5333Nr;
import o.InterfaceC50563vTa;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.NN;
import o.pUU;
import o.rVN;
import o.vTA;
import o.vTC;
import o.vTI;
import o.wMY;
import o.wUX;
import o.wXQ;
import o.wYF;
import o.xOR;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotOrderConfirmFragment extends AbstractC49945uyC<AbstractC48381uPj, BotOrderConfirmPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final C59534zip AEQbTJ;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vSZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(BotOrderConfirmFragment.djBIcL(this.EZpvd));
        }
    });
    public Function1<? super String, Unit> OLrzqt;

    @yCM
    public CoroutineDispatcher dispatcherIo;

    @yCM
    public C52671wUa getGridMarginUsageUseCase;
    public final InterfaceC56387yDm valueOf;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.DCUTEIddSDPG;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public BotOrderConfirmFragment() {
        Function0 function0 = new Function0() { // from class: o.vTb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotOrderConfirmFragment.gEmmrt(this.AEQbTJ);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(vTC.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.AEQbTJ = new C59534zip();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final BotOrderConfirmFragment copydefault(@NotNull String str, @NotNull String str2, @NotNull StrategyReqGroup strategyReqGroup, boolean z, BotOrderConfirmPresenter.VoucherTagDisplayInfo voucherTagDisplayInfo, @NotNull String str3, GridProfitRateResp gridProfitRateResp, Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(strategyReqGroup, "");
            Intrinsics.checkNotNullParameter(str3, "");
            BotOrderConfirmFragment botOrderConfirmFragment = new BotOrderConfirmFragment();
            botOrderConfirmFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_inst_id", str), C56390yDp.OLrzqt("bot_inst_type", str2), C56390yDp.OLrzqt("data", strategyReqGroup), C56390yDp.OLrzqt("is_from_bot_guide", Boolean.valueOf(z)), C56390yDp.OLrzqt("voucher_display_info", voucherTagDisplayInfo), C56390yDp.OLrzqt("AI_MODEL_URL", str3), C56390yDp.OLrzqt("key_grid_profit_rate_resp", gridProfitRateResp)));
            botOrderConfirmFragment.OLrzqt = function1;
            return botOrderConfirmFragment;
        }
    }

    public final boolean AuCTel() {
        return ((Boolean) this.KWHzl.getValue()).booleanValue();
    }

    public static final boolean djBIcL(BotOrderConfirmFragment botOrderConfirmFragment) {
        Bundle arguments = botOrderConfirmFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("is_from_bot_guide");
        }
        return false;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return AuCTel() ? 0.7f : 0.95f;
    }

    public final CoroutineDispatcher copydefault() {
        CoroutineDispatcher coroutineDispatcher = this.dispatcherIo;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final C52671wUa isConnected() {
        C52671wUa c52671wUa = this.getGridMarginUsageUseCase;
        if (c52671wUa != null) {
            return c52671wUa;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final vTC fJNWhG() {
        return (vTC) this.valueOf.getValue();
    }

    public static final vTC AEQbTJ(BotOrderConfirmFragment botOrderConfirmFragment, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new vTC(botOrderConfirmFragment.copydefault(), botOrderConfirmFragment.isConnected());
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C58114yvF c58114yvF = C58114yvF.EZpvd;
        ((InterfaceC50563vTa) C58114yvF.OLrzqt(context, InterfaceC50563vTa.class)).copydefault(this);
        super.onAttach(context);
    }

    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hDKMBd();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        pUU.KWHzl("BotOrder", "二次确认页 BotOrderConfirmFragment " + OLrzqt().AYXKKw() + " Order onDetach");
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ BotOrderConfirmFragment KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, BotOrderConfirmFragment botOrderConfirmFragment) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = botOrderConfirmFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                pUU.KWHzl("BotOrder", "二次确认页 BotOrderConfirmFragment " + this.KWHzl.OLrzqt().AYXKKw() + " Start Order");
                this.KWHzl.getNewProxyInstance();
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ BotOrderConfirmFragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, BotOrderConfirmFragment botOrderConfirmFragment) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = botOrderConfirmFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.fARcdN();
                pUU.KWHzl("BotOrder", "二次确认页 BotOrderConfirmFragment " + this.OLrzqt.OLrzqt().AYXKKw() + " Order Close");
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.itxZVF));
        wyf.setOKDSSize(52);
        wyf.setOnClickListener(new ActionBar(wyf, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fIwbmz();
        uzCIH();
        iwGUEr();
        getFieldNames();
        ejfBZ();
        rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
    }

    public static /* synthetic */ String getSingleGridAmt$default(BotOrderConfirmFragment botOrderConfirmFragment, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        return botOrderConfirmFragment.AEQbTJ(str, str2, str3, str4);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xvF.getBotAmount$default(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.Object):java.lang.String */
    public final String AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (StringsKt__StringsKt.fARcdN((CharSequence) str3)) {
            return "--";
        }
        return C56033xvF.getBotAmount$default(str, str2, str3, str4, false, null, 48, null) + " " + C56033xvF.getBotAmountUnit$default(str, str2, str4, null, 8, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wUv.flowAndCollect$default(kotlinx.coroutines.flow.Flow, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.Lifecycle$State, kotlin.jvm.functions.Function2, int, java.lang.Object):kotlinx.coroutines.Job */
    private final void iwGUEr() {
        C52692wUv.flowAndCollect$default(fJNWhG().AEQbTJ(), this, null, new BotOrderConfirmFragment$observeGridHoldingDistribution$1(this, null), 2, null);
        OLrzqt().OLrzqt(fJNWhG());
        LiveData<List<Distribution>> liveDataCopydefault = OLrzqt().copydefault();
        if (liveDataCopydefault == null) {
            return;
        }
        liveDataCopydefault.observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.vTc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotOrderConfirmFragment.EZpvd(this.copydefault, (java.util.List) obj);
            }
        }));
    }

    public static final Unit EZpvd(BotOrderConfirmFragment botOrderConfirmFragment, List list) {
        updateDistributionBar$default(botOrderConfirmFragment, list, false, 2, null);
        return Unit.INSTANCE;
    }

    public final void fIwbmz() {
        values().fetchVPNInfo.setText(C33070mpX.AYXKKw(C55688xof.Application.getAudioAttributes));
    }

    public final void ejfBZ() {
        String strValueOf;
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrEZpvd = Glide.EZpvd(this);
        String str = "";
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrEZpvd, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (strValueOf = interfaceC54581xNrOLrzqt.valueOf(OLrzqt().AhwBna())) != null) {
            str = strValueOf;
        }
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrEZpvd, str, "lfit", 26, 26).EZpvd((NN<Bitmap>) new C33484mxN(getContext())).djBIcL().KWHzl(C52761wXj.TaskDescription.aHXSQp).EZpvd(values().EZpvd);
        values().values.setText(OLrzqt().valueOf());
    }

    private final void uzCIH() {
        RecyclerView recyclerView = values().AkhnZx;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        C59534zip c59534zip = this.AEQbTJ;
        c59534zip.register(TacticsInsideItemData.class, new C52487wNf());
        c59534zip.register(AutoVipProfitInfo.class, new C54145wyo(0, true, true ? 1 : 0, null));
        c59534zip.register(LabelData.class, new C51278vjx());
        c59534zip.register(TacticsInsideLineItemData.class, new C52512wOd());
        c59534zip.register(BotRemindData.class, new C52491wNj());
        c59534zip.register(TacticsClickableInsideItemData.class, new wMY(this.OLrzqt));
        c59534zip.register(TacticsCoinsInsideItemData.class, new C52484wNc(this.OLrzqt));
        c59534zip.register(vTA.class, new vTI(this.OLrzqt));
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(24.0f, null, 1, null), 0));
        recyclerView.setAdapter(this.AEQbTJ);
    }

    private final void hDKMBd() {
        String string;
        String string2;
        BotOrderConfirmPresenter botOrderConfirmPresenterOLrzqt = OLrzqt();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("bot_inst_id")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("bot_inst_type")) != null) {
            str = string2;
        }
        Bundle arguments3 = getArguments();
        StrategyReqGroup strategyReqGroup = arguments3 != null ? (StrategyReqGroup) arguments3.getParcelable("data") : null;
        if (!(strategyReqGroup instanceof StrategyReqGroup)) {
            strategyReqGroup = null;
        }
        botOrderConfirmPresenterOLrzqt.OLrzqt(string, str, strategyReqGroup);
        OLrzqt().gEmmrt();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = C56390yDp.OLrzqt("botType", C33129mqd.gEmmrt(OLrzqt().AYXKKw()));
        Bundle arguments4 = getArguments();
        pairArr[1] = C56390yDp.OLrzqt("instId", C33129mqd.gEmmrt(arguments4 != null ? arguments4.getString("bot_inst_id") : null));
        Bundle arguments5 = getArguments();
        pairArr[2] = C56390yDp.OLrzqt("instType", C33129mqd.gEmmrt(arguments5 != null ? arguments5.getString("bot_inst_type") : null));
        Bundle arguments6 = getArguments();
        StrategyReqGroup strategyReqGroup2 = arguments6 != null ? (StrategyReqGroup) arguments6.getParcelable("data") : null;
        pairArr[3] = C56390yDp.OLrzqt(HiAnalyticsConstant.Direction.REQUEST, C33129mqd.gEmmrt(strategyReqGroup2 instanceof StrategyReqGroup ? strategyReqGroup2 : null));
        C56028xvA.OLrzqt("make_order", C56424yEw.gEmmrt(pairArr));
    }

    private final void getFieldNames() {
        Bundle arguments = getArguments();
        GridProfitRateResp gridProfitRateResp = arguments != null ? (GridProfitRateResp) arguments.getParcelable("key_grid_profit_rate_resp") : null;
        if (gridProfitRateResp != null) {
            OLrzqt().copydefault(gridProfitRateResp);
        }
        C33064mpR.OLrzqt(this.AEQbTJ, (List<? extends Object>) OLrzqt().OLrzqt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getNewProxyInstance() {
        dismissAllowingStateLoss();
        getParentFragmentManager().setFragmentResult("bot_order", new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fARcdN() {
        xOR xorCopydefault;
        List<OrderCategory> listAEQbTJ;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null || (listAEQbTJ = xorCopydefault.AEQbTJ()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(((OrderCategory) it.next()).getStrategyType());
        }
        if (arrayList.contains(OLrzqt().AYXKKw())) {
            C32866mlf.onEvent$default("BotPlaceOrder_Sheet_ConfirmOrder_Click", (TrackChannel[]) null, new Function1() { // from class: o.vTd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOrderConfirmFragment.copydefault(this.copydefault, (EventParamsList) obj);
                }
            }, 1, (Object) null);
            C56028xvA.OLrzqt("BotPlaceOrder_Sheet_ConfirmOrder_Click", C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", C33129mqd.gEmmrt(OLrzqt().AYXKKw())), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, C33129mqd.gEmmrt(OtpEventTracker.OTP_EVENT_VALUE_CANCEL))));
        }
    }

    public static final Unit copydefault(BotOrderConfirmFragment botOrderConfirmFragment, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", botOrderConfirmFragment.OLrzqt().AYXKKw(), true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, OtpEventTracker.OTP_EVENT_VALUE_CANCEL, true);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.OLrzqt = null;
    }

    public static /* synthetic */ void updateDistributionBar$default(BotOrderConfirmFragment botOrderConfirmFragment, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        botOrderConfirmFragment.EZpvd((List<Distribution>) list, z);
    }

    public final void EZpvd(List<Distribution> list, boolean z) {
        C53490wmV c53490wmV = C53490wmV.KWHzl;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        wUX wux = values().KWHzl;
        Intrinsics.checkNotNullExpressionValue(wux, "");
        TextView textView = values().DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        LinearLayout linearLayout = values().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        ConstraintLayout constraintLayout = values().AEQbTJ;
        List<? extends View> listGEmmrt = yDY.gEmmrt(values().valueOf, values().AhwBna, values().AYXKKw);
        if (!z) {
            listGEmmrt = null;
        }
        c53490wmV.copydefault(contextRequireContext, list, wux, textView, linearLayout, constraintLayout, listGEmmrt, z);
    }

    public static final ViewModelProvider.Factory gEmmrt(final BotOrderConfirmFragment botOrderConfirmFragment) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(vTC.class), new Function1() { // from class: o.vTi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotOrderConfirmFragment.AEQbTJ(this.AEQbTJ, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
