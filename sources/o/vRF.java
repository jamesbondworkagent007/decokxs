package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.biz.TacticsType;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradeapi.bean.BotGridOrderDialogData;
import com.okinc.tradingbot.impl.order.strategy.dialog.PriceOutOfRangeBottomSheet;
import com.okinc.tradingbot.impl.utils.PriceRangeUtil;
import com.okinc.unify_trade.biz.DigitInfoBean;
import com.okinc.unify_trade.biz.GridNumRangeBean;
import com.okinc.unify_trade.biz.GridProfitRateResp;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.grid.viewmodel.SpotGridPresenter;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vRF extends AbstractC49945uyC<AbstractC48321uNd, SpotGridPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public final Function2<C47988uAv, java.lang.String, Unit> AhwBna;
    public BotGridOrderDialogData copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final Function2<C47988uAv, java.lang.Boolean, Unit> valueOf;
    public final boolean KWHzl = true;
    public final int gEmmrt = C48033uCm.Activity.QKVWgx;

    public static final /* synthetic */ class Fragment implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PriceRangeUtil.ValidatedPriceRange.values().length];
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.ExtremeLowerOutOfRange.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.LowerOutOfRange.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.ExtremeUpperOutOfRange.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.UpperOutOfRange.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    public static final /* synthetic */ AbstractC48321uNd AEQbTJ(vRF vrf) {
        return vrf.values();
    }

    public vRF() {
        final Function0 function0 = new Function0() { // from class: o.vRK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vRF.djBIcL(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridRangeQuickOrderDialog$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(vPY.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridRangeQuickOrderDialog$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridRangeQuickOrderDialog$special$$inlined$viewModels$default$3
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridRangeQuickOrderDialog$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.valueOf = new Function2() { // from class: o.vRI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vRF.EZpvd(this.OLrzqt, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        };
        this.AhwBna = new Function2() { // from class: o.vRQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vRF.EZpvd(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.AEQbTJ = "";
    }

    private final vPY ejfBZ() {
        return (vPY) this.djBIcL.getValue();
    }

    public static final ViewModelStoreOwner djBIcL(vRF vrf) {
        androidx.fragment.app.Fragment parentFragment = vrf.getParentFragment();
        return parentFragment != null ? parentFragment : vrf;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vRF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final vRF AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            vRF vrf = new vRF();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("bot_inst_id", str);
            bundle.putString("bot_inst_type", str2);
            vrf.setArguments(bundle);
            return vrf;
        }
    }

    public static final Unit EZpvd(vRF vrf, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, vrf.values().fetchVPNInfo) || Intrinsics.EZpvd(c47988uAv, vrf.values().AkhnZx)) {
            if (!z) {
                android.text.Editable text = vrf.values().fetchVPNInfo.djBIcL().getText();
                if (text != null) {
                    java.lang.String string = text.toString();
                    if (C59449zhJ.endsWith$default(string, JwtUtilsKt.JWT_DELIMITER, false, 2, null) || C59449zhJ.endsWith$default(string, ",", false, 2, null)) {
                        vrf.values().fetchVPNInfo.djBIcL().setText(C59454zhO.DbNXlk(string, 1));
                    }
                }
                android.text.Editable text2 = vrf.values().AkhnZx.djBIcL().getText();
                if (text2 != null) {
                    java.lang.String string2 = text2.toString();
                    if (C59449zhJ.endsWith$default(string2, JwtUtilsKt.JWT_DELIMITER, false, 2, null) || C59449zhJ.endsWith$default(string2, ",", false, 2, null)) {
                        vrf.values().AkhnZx.djBIcL().setText(C59454zhO.DbNXlk(string2, 1));
                    }
                }
                if (Intrinsics.EZpvd(vrf.OLrzqt().QVAiDq(), java.lang.Boolean.FALSE)) {
                    C47988uAv.setInputErrorMsg$default(vrf.values().fetchVPNInfo, null, 1, null);
                    C47988uAv.setInputErrorMsg$default(vrf.values().AkhnZx, null, 1, null);
                    java.lang.String string3 = vrf.getString(C55688xof.Application.setLogo);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    vrf.copydefault(string3);
                }
            }
        } else if (Intrinsics.EZpvd(c47988uAv, vrf.values().gEmmrt) && !z) {
            java.lang.String strHDKMBd = vrf.hDKMBd();
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strHDKMBd)) {
                vrf.values().gEmmrt.setInputErrorMsg(strHDKMBd);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vRF vrf, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        AbstractC48321uNd abstractC48321uNdValues = vrf.values();
        if (Intrinsics.EZpvd(c47988uAv, abstractC48321uNdValues.fetchVPNInfo) || Intrinsics.EZpvd(c47988uAv, abstractC48321uNdValues.AkhnZx)) {
            vrf.OLrzqt().wlaJM().setMinPx(abstractC48321uNdValues.fetchVPNInfo.AkhnZx());
            vrf.OLrzqt().wlaJM().setMaxPx(abstractC48321uNdValues.AkhnZx.AkhnZx());
            if (c47988uAv.hasFocus()) {
                c47988uAv.setInputErrorMsg(xVK.EZpvd.EZpvd(c47988uAv.AkhnZx(), vrf.OLrzqt().fvQaOB().gEmmrt(), vrf.OLrzqt().fvQaOB().djBIcL()));
            }
            if (c47988uAv.getFieldNames()) {
                vrf.copydefault("");
            } else {
                if (!Intrinsics.EZpvd(vrf.OLrzqt().QVAiDq(), java.lang.Boolean.FALSE)) {
                    abstractC48321uNdValues.fetchVPNInfo.copydefault();
                    abstractC48321uNdValues.AkhnZx.copydefault();
                    vrf.copydefault("");
                }
                if (vrf.AYXKKw) {
                    BotGridOrderDialogData botGridOrderDialogData = vrf.copydefault;
                    pUU.copydefault("eddie", "refreshRangeData inputViewTextChange " + (botGridOrderDialogData != null ? java.lang.Boolean.valueOf(botGridOrderDialogData.isFinally()) : null));
                    BotGridOrderDialogData botGridOrderDialogData2 = vrf.copydefault;
                    if (botGridOrderDialogData2 != null && botGridOrderDialogData2.isFinally()) {
                        vrf.OLrzqt().fZBcTu();
                        vrf.OLrzqt().UeEOUB();
                        vrf.OLrzqt().getFieldNames();
                    }
                } else {
                    vrf.OLrzqt().fZBcTu();
                    vrf.OLrzqt().UeEOUB();
                    vrf.OLrzqt().getFieldNames();
                    vrf.copydefault();
                }
            }
            vrf.OLrzqt().gasjUx();
        } else if (Intrinsics.EZpvd(c47988uAv, abstractC48321uNdValues.gEmmrt)) {
            abstractC48321uNdValues.gEmmrt.copydefault();
            vrf.OLrzqt().wlaJM().setGridNum(abstractC48321uNdValues.gEmmrt.AkhnZx());
            vrf.OLrzqt().fZBcTu();
            vrf.OLrzqt().UeEOUB();
            SpotGridPresenter.getGridProfitRate$default(vrf.OLrzqt(), 0L, null, 3, null);
            vrf.OLrzqt().djSkpj();
            vrf.OLrzqt().gasjUx();
            if (!vrf.AYXKKw) {
                vrf.copydefault();
            }
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ vRF OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, vRF vrf) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = vrf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.ensureClassLoader);
                viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.RihMUf);
                java.lang.String string = this.OLrzqt.getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Dialog(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ vRF EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vRF vrf) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = vrf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.EZpvd.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.setQueueTitle);
                viewOnClickListenerC54939xaY.EZpvd(this.EZpvd.getString(C55688xof.Application.setSessionActivity));
                java.lang.String string = this.EZpvd.getString(C55688xof.Application.onCreate);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Activity(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ vRF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, vRF vrf) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = vrf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.fIwbmz();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ vRF OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, vRF vrf) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = vrf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C32866mlf.onEvent$default("KlineBotCreate_Kline_SetChart_Click", (TrackChannel[]) null, LoaderManager.KWHzl, 1, (java.lang.Object) null);
                vRF.AEQbTJ(this.OLrzqt).fetchVPNInfo.AuCTelauCTel();
                vRF.AEQbTJ(this.OLrzqt).AkhnZx.AuCTelauCTel();
                this.OLrzqt.getFieldNames();
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt().EZpvd(getArguments());
        SpotGridPresenter.getGridConfigInfo$default(OLrzqt(), null, 1, null);
        C54782xVc.AEQbTJ.AhwBna(OLrzqt().fvQaOB().AhwBna());
        OLrzqt().EZpvd();
        if (ejfBZ().copydefault().getValue() == null) {
            OLrzqt().dvKsVJ();
        } else {
            C56111xwe<java.util.List<SmartRecommendResp>> c56111xweDbNXlk = OLrzqt().DbNXlk();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            SmartRecommendResp value = ejfBZ().copydefault().getValue();
            Intrinsics.copydefault(value);
            arrayList.add(value);
            c56111xweDbNXlk.postValue(arrayList);
        }
        fARcdN();
        uzCIH();
        fJNWhG();
        AuCTelauCTel();
        values().values.setOnTouchListener(new View.OnTouchListener() { // from class: o.vRH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return vRF.KWHzl(view2, motionEvent);
            }
        });
        values().values.setNestedScrollingEnabled(true);
    }

    public static final boolean KWHzl(android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ("grid");
        if (tacticsTypeAEQbTJ != null && (strAYXKKw = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName())) != null) {
            wxq.setTitle(strAYXKKw);
        }
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new FragmentManager(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.RdAHlO));
        wyf.setOKDSSize(52);
        wyf.setOnClickListener(new PendingIntent(wyf, 1000L, this));
    }

    public static final class LoaderManager implements Function1<EventParamsList, Unit> {
        public static final LoaderManager KWHzl = new LoaderManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "button", "next", false, 4, null);
            EventParamsList.put$default(eventParamsList, "bot_type", "spot_grid", false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getFieldNames() {
        if (!getNewProxyInstance() || !iwGUEr()) {
            zsXlph();
            return;
        }
        if (!Intrinsics.EZpvd(OLrzqt().QVAiDq(), java.lang.Boolean.TRUE)) {
            C55326xho.toast$default(getString(C55688xof.Application.setLogo), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            values().AkhnZx.zsXlph();
            zsXlph();
            return;
        }
        if (!isGridCountValid$default(this, null, 1, null)) {
            zsXlph();
            return;
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) hDKMBd())) {
            C55326xho.toast$default(hDKMBd(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            values().fetchVPNInfo.zsXlph();
            zsXlph();
            return;
        }
        android.widget.TextView textView = values().EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        if (textView.getVisibility() == 0 && C33129mqd.OLrzqt(values().EZpvd.getText())) {
            C55326xho.toast$default(values().EZpvd.getText().toString(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            values().gEmmrt.zsXlph();
            zsXlph();
            return;
        }
        isConnected();
    }

    private final void zsXlph() {
        AbstractC48321uNd abstractC48321uNdValues = values();
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(abstractC48321uNdValues.fetchVPNInfo, abstractC48321uNdValues.AkhnZx, abstractC48321uNdValues.gEmmrt);
        C49967uyY c49967uyY = C49967uyY.EZpvd;
        C47988uAv c47988uAv = abstractC48321uNdValues.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c49967uyY.KWHzl(c47988uAv, C48033uCm.Application.fvQaOB, arrayListCopydefault);
    }

    private final boolean getNewProxyInstance() {
        if (values().fetchVPNInfo.AkhnZx().length() != 0) {
            return true;
        }
        values().fetchVPNInfo.zsXlph();
        C55326xho.toast$default(C33070mpX.AYXKKw(C55688xof.Application.TransitionRes), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return false;
    }

    private final boolean iwGUEr() {
        if (values().AkhnZx.AkhnZx().length() != 0) {
            return true;
        }
        values().AkhnZx.zsXlph();
        C55326xho.toast$default(C33070mpX.AYXKKw(C55688xof.Application.VisibleForTesting), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return false;
    }

    public static /* synthetic */ boolean isGridCountValid$default(vRF vrf, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return vrf.OLrzqt(num);
    }

    private final boolean OLrzqt(java.lang.Integer num) {
        java.lang.String strAkhnZx = values().gEmmrt.AkhnZx();
        if (strAkhnZx.length() == 0) {
            values().gEmmrt.zsXlph();
            C55326xho.toast$default(C33070mpX.AYXKKw(C55688xof.Application.otherwise), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return false;
        }
        if (num == null || C33129mqd.AhwBna(strAkhnZx) >= num.intValue()) {
            return true;
        }
        values().gEmmrt.zsXlph();
        C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(C48033uCm.Fragment.hfeTOA, C56423yEv.EZpvd(C56390yDp.OLrzqt("minGridNum", num.toString()))), 0, 1, (java.lang.Object) null);
        return false;
    }

    private final void isConnected() {
        PriceOutOfRangeBottomSheet.Application application = PriceOutOfRangeBottomSheet.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        application.EZpvd(childFragmentManager, new PriceOutOfRangeBottomSheet.PriceOutOfRangeBottomSheetInput(this.AEQbTJ, values().fetchVPNInfo.AkhnZx(), values().AkhnZx.AkhnZx(), OLrzqt().fvQaOB().isConnected().getSymbol()), new Function1() { // from class: o.vRU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vRF.AEQbTJ(this.copydefault, (PriceRangeUtil.ValidatedPriceRange) obj);
            }
        }, new Function0() { // from class: o.vRT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vRF.AhwBna(this.AEQbTJ);
            }
        }, new Function0() { // from class: o.vRS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vRF.gEmmrt(this.OLrzqt);
            }
        });
    }

    public static final Unit AEQbTJ(vRF vrf, PriceRangeUtil.ValidatedPriceRange validatedPriceRange) {
        Intrinsics.checkNotNullParameter(validatedPriceRange, "");
        int i = StateListAnimator.AEQbTJ[validatedPriceRange.ordinal()];
        if (i == 1 || i == 2) {
            vrf.values().fetchVPNInfo.zsXlph();
        } else if (i == 3 || i == 4) {
            vrf.values().AkhnZx.zsXlph();
        } else {
            vrf.values().fetchVPNInfo.zsXlph();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(vRF vrf) {
        vrf.AuCTel();
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(vRF vrf) {
        vrf.AuCTel();
        return Unit.INSTANCE;
    }

    private final void AuCTel() {
        StgyParam stgyParam;
        java.util.List<SmartRecommendResp> value = OLrzqt().DbNXlk().getValue();
        SmartRecommendResp smartRecommendResp = value != null ? (SmartRecommendResp) CollectionsKt___CollectionsKt.firstOrNull(value) : null;
        if (smartRecommendResp != null && (stgyParam = smartRecommendResp.getStgyParam()) != null) {
            stgyParam.setMinPx(OLrzqt().wlaJM().getMinPx());
            stgyParam.setMaxPx(OLrzqt().wlaJM().getMaxPx());
            stgyParam.setGridNum(OLrzqt().wlaJM().getGridNum());
        }
        ejfBZ().copydefault().setValue(smartRecommendResp);
        ejfBZ().djBIcL().setValue(vRY.Companion.copydefault());
    }

    private final void uzCIH() {
        DigitInfoBean digitInfoBeanIsConnected = OLrzqt().fvQaOB().isConnected();
        values().valueOf.setText(C33069mpW.copydefault(this, C55688xof.Application.getStateWithUpdatedPosition, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", digitInfoBeanIsConnected.getSymbol()))));
        values().fetchVPNInfo.setMaxDecimal(digitInfoBeanIsConnected.getDigit());
        values().AkhnZx.setMaxDecimal(digitInfoBeanIsConnected.getDigit());
        values().fetchVPNInfo.setOnFocusChangeCallback(this.valueOf);
        values().AkhnZx.setOnFocusChangeCallback(this.valueOf);
        values().fetchVPNInfo.setOnTextChangeCallback(this.AhwBna);
        values().AkhnZx.setOnTextChangeCallback(this.AhwBna);
    }

    private final void fARcdN() {
        values().gEmmrt.setMaxDecimal(0);
        values().gEmmrt.setOnFocusChangeCallback(this.valueOf);
        values().gEmmrt.setOnTextChangeCallback(this.AhwBna);
        C55258xgZ c55258xgZ = values().AhwBna;
        c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    private final void fJNWhG() {
        C55258xgZ c55258xgZ = values().ejfBZ;
        c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, this));
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C32866mlf.onEvent$default("KlineBotCreate_Kline_SetChart_View", (TrackChannel[]) null, new Function1() { // from class: o.vRL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vRF.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "spot_grid", false, 4, null);
        return Unit.INSTANCE;
    }

    private final void AuCTelauCTel() {
        TradeLiveData<StrategyConfigInfo> tradeLiveDataFetchVPNInfo = OLrzqt().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataFetchVPNInfo.observe(viewLifecycleOwner, new Fragment(new Function1() { // from class: o.vRE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vRF.OLrzqt(this.copydefault, (StrategyConfigInfo) obj);
            }
        }));
        getChildFragmentManager().setFragmentResultListener("bot_order", this, new FragmentResultListener() { // from class: o.vRJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                vRF.AEQbTJ(this.copydefault, str, bundle);
            }
        });
        C56111xwe<java.util.List<SmartRecommendResp>> c56111xweDbNXlk = OLrzqt().DbNXlk();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweDbNXlk.observe(viewLifecycleOwner2, new Fragment(new Function1() { // from class: o.vRO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vRF.copydefault(this.copydefault, (java.util.List) obj);
            }
        }));
        TradeLiveData<GridNumRangeBean> tradeLiveDataHDKMBd = OLrzqt().hDKMBd();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataHDKMBd.observe(viewLifecycleOwner3, new Fragment(new Function1() { // from class: o.vRP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vRF.KWHzl(this.copydefault, (GridNumRangeBean) obj);
            }
        }));
        TradeLiveData<GridProfitRateResp> tradeLiveDataZsXlph = OLrzqt().zsXlph();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataZsXlph.observe(viewLifecycleOwner4, new Fragment(new Function1() { // from class: o.vRM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vRF.EZpvd(this.EZpvd, (GridProfitRateResp) obj);
            }
        }));
        TradeLiveData<xMJ.Application> tradeLiveDataAhwBna = C54782xVc.AEQbTJ.AhwBna();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner5, new Fragment(new Function1() { // from class: o.vRN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vRF.copydefault(this.EZpvd, (xMJ.Application) obj);
            }
        }));
        C56111xwe<BotGridOrderDialogData> c56111xweEZpvd = ejfBZ().EZpvd();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        c56111xweEZpvd.observe(viewLifecycleOwner6, new Fragment(new Function1() { // from class: o.vRV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vRF.copydefault(this.copydefault, (BotGridOrderDialogData) obj);
            }
        }));
    }

    public static final Unit OLrzqt(vRF vrf, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        vrf.OLrzqt().OLrzqt(strategyConfigInfo);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(vRF vrf, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        pUU.KWHzl("Order", "BotGuideContractGridFragment Order");
        vrf.OLrzqt().RcXXUw();
    }

    public static final Unit copydefault(vRF vrf, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        SmartRecommendResp smartRecommendResp = (SmartRecommendResp) CollectionsKt___CollectionsKt.firstOrNull(list);
        vrf.copydefault(smartRecommendResp != null ? smartRecommendResp.getStgyParam() : null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vRF vrf, GridNumRangeBean gridNumRangeBean) {
        java.lang.String maxGridNum;
        java.lang.String minGridNum;
        java.lang.String str = "0";
        if (gridNumRangeBean == null || (maxGridNum = gridNumRangeBean.getMaxGridNum()) == null) {
            StrategyConfigInfo strategyConfigInfoDjBIcL = vrf.OLrzqt().djBIcL();
            maxGridNum = strategyConfigInfoDjBIcL != null ? strategyConfigInfoDjBIcL.getMaxGridNum() : "0";
        }
        StrategyConfigInfo strategyConfigInfoDjBIcL2 = vrf.OLrzqt().djBIcL();
        if (strategyConfigInfoDjBIcL2 != null && (minGridNum = strategyConfigInfoDjBIcL2.getMinGridNum()) != null) {
            str = minGridNum;
        }
        vrf.KWHzl(str, maxGridNum);
        java.lang.String strHDKMBd = vrf.hDKMBd();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strHDKMBd)) {
            vrf.values().gEmmrt.setInputErrorMsg(strHDKMBd);
        } else {
            vrf.values().gEmmrt.copydefault();
        }
        SpotGridPresenter.getGridProfitRate$default(vrf.OLrzqt(), 0L, null, 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vRF vrf, GridProfitRateResp gridProfitRateResp) {
        java.lang.String minGridNum;
        java.lang.String strCopydefault;
        java.lang.String str = "--";
        if (gridProfitRateResp == null) {
            vrf.values().djBIcL.setText("--");
            vrf.values().EZpvd.setVisibility(8);
            return Unit.INSTANCE;
        }
        xMR xmr = xMR.copydefault;
        java.lang.String perMinProfitRate = gridProfitRateResp.getPerMinProfitRate();
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String percent$default = xMR.formatPercent$default(xmr, perMinProfitRate, 0, roundingMode, 2, null);
        java.lang.String percent$default2 = xMR.formatPercent$default(xmr, gridProfitRateResp.getPerMaxProfitRate(), 0, roundingMode, 2, null);
        if (C33129mqd.valueOf(gridProfitRateResp.getPerMinProfitRate(), 0)) {
            if (C33129mqd.gEmmrt(gridProfitRateResp.getMaxGirdNum(), 2)) {
                vrf.values().EZpvd.setText(C33070mpX.AYXKKw(C55688xof.Application.fromRating));
            } else {
                StrategyConfigInfo strategyConfigInfoDjBIcL = vrf.OLrzqt().djBIcL();
                if (Intrinsics.EZpvd((java.lang.Object) (strategyConfigInfoDjBIcL != null ? strategyConfigInfoDjBIcL.getMinGridNum() : null), (java.lang.Object) gridProfitRateResp.getMaxGirdNum())) {
                    strCopydefault = xmr.copydefault(gridProfitRateResp.getMaxGirdNum());
                } else {
                    StrategyConfigInfo strategyConfigInfoDjBIcL2 = vrf.OLrzqt().djBIcL();
                    if (strategyConfigInfoDjBIcL2 == null || (minGridNum = strategyConfigInfoDjBIcL2.getMinGridNum()) == null) {
                        minGridNum = "";
                    }
                    strCopydefault = xmr.copydefault(minGridNum) + "-" + xmr.copydefault(gridProfitRateResp.getMaxGirdNum());
                }
                vrf.values().EZpvd.setText(C33069mpW.copydefault(vrf, C55688xof.Application.newHeartRating, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("range", strCopydefault))));
            }
            vrf.values().EZpvd.setVisibility(0);
            C47988uAv.setInputErrorMsg$default(vrf.values().gEmmrt, null, 1, null);
        } else {
            vrf.values().EZpvd.setVisibility(8);
        }
        if (Intrinsics.EZpvd((java.lang.Object) percent$default, (java.lang.Object) percent$default2)) {
            android.widget.TextView textView = vrf.values().djBIcL;
            if (percent$default != null && percent$default.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) percent$default)) {
                str = percent$default;
            }
            textView.setText(str);
        } else {
            vrf.values().djBIcL.setText(percent$default + " - " + percent$default2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vRF vrf, xMJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        java.lang.String strAYXKKw = application.AYXKKw();
        if (strAYXKKw == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAYXKKw)) {
            return Unit.INSTANCE;
        }
        vrf.AEQbTJ = application.AYXKKw();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vRF vrf, BotGridOrderDialogData botGridOrderDialogData) {
        Intrinsics.checkNotNullParameter(botGridOrderDialogData, "");
        pUU.copydefault("eddie", "refreshRangeData " + botGridOrderDialogData);
        vrf.AYXKKw = true;
        vrf.copydefault = botGridOrderDialogData;
        AbstractC48321uNd abstractC48321uNdValues = vrf.values();
        abstractC48321uNdValues.fetchVPNInfo.copydefault();
        abstractC48321uNdValues.AkhnZx.copydefault();
        abstractC48321uNdValues.gEmmrt.copydefault();
        vrf.copydefault("");
        C47988uAv.setInputContent$default(abstractC48321uNdValues.fetchVPNInfo, botGridOrderDialogData.getMinPx(), false, false, 6, null);
        C47988uAv.setInputContent$default(abstractC48321uNdValues.AkhnZx, botGridOrderDialogData.getMaxPx(), false, false, 6, null);
        C47988uAv.setInputContent$default(abstractC48321uNdValues.gEmmrt, botGridOrderDialogData.getGridCount(), false, false, 6, null);
        java.lang.String maxPx = vrf.OLrzqt().wlaJM().getMaxPx();
        java.lang.String str = maxPx == null ? "" : maxPx;
        java.lang.String minPx = vrf.OLrzqt().wlaJM().getMinPx();
        java.lang.String str2 = minPx == null ? "" : minPx;
        java.lang.String gridCount = botGridOrderDialogData.getGridCount();
        java.lang.String str3 = gridCount == null ? "" : gridCount;
        wPG wpg = wPG.KWHzl;
        GridReq gridReqWlaJM = vrf.OLrzqt().wlaJM();
        vrf.ejfBZ().gEmmrt().setValue(new BotGridOrderDialogData((java.lang.String) null, str, str2, str3, wpg.AEQbTJ(gridReqWlaJM.copy(((-1) & 1) != 0 ? gridReqWlaJM.maxPx : botGridOrderDialogData.getMaxPx(), ((-1) & 2) != 0 ? gridReqWlaJM.minPx : botGridOrderDialogData.getMinPx(), ((-1) & 4) != 0 ? gridReqWlaJM.gridNum : null, ((-1) & 8) != 0 ? gridReqWlaJM.runType : null, ((-1) & 16) != 0 ? gridReqWlaJM.quoteSz : null, ((-1) & 32) != 0 ? gridReqWlaJM.baseSz : null, ((-1) & 64) != 0 ? gridReqWlaJM.investType : null, ((-1) & 128) != 0 ? gridReqWlaJM.tpTriggerPx : null, ((-1) & 256) != 0 ? gridReqWlaJM.slTriggerPx : null, ((-1) & 512) != 0 ? gridReqWlaJM.tpslTriggerParamReq : null, ((-1) & 1024) != 0 ? gridReqWlaJM.tpOrdPx : null, ((-1) & 2048) != 0 ? gridReqWlaJM.slOrdPx : null, ((-1) & 4096) != 0 ? gridReqWlaJM.duration : null, ((-1) & 8192) != 0 ? gridReqWlaJM.signParams : null, ((-1) & 16384) != 0 ? gridReqWlaJM.reserveFunds : null, ((-1) & 32768) != 0 ? gridReqWlaJM.trailingUpConfig : null, ((-1) & 65536) != 0 ? gridReqWlaJM.trailingDownConfig : null, ((-1) & 131072) != 0 ? gridReqWlaJM.perGridProfitRatio : null, ((-1) & 262144) != 0 ? gridReqWlaJM.pxLimit : null, ((-1) & 524288) != 0 ? gridReqWlaJM.profitSharingRatio : null, ((-1) & 1048576) != 0 ? gridReqWlaJM.instId : null, ((-1) & 2097152) != 0 ? gridReqWlaJM.instType : null, ((-1) & 4194304) != 0 ? gridReqWlaJM.ordType : null, ((-1) & 8388608) != 0 ? gridReqWlaJM.annualizedRate : null, ((-1) & 16777216) != 0 ? gridReqWlaJM.sourceCcy : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? gridReqWlaJM.sourceCcySz : null, ((-1) & 67108864) != 0 ? gridReqWlaJM.investSymbol : null, ((-1) & 134217728) != 0 ? gridReqWlaJM.autoTransfer : null, ((-1) & 268435456) != 0 ? gridReqWlaJM.marketPx : null, ((-1) & 536870912) != 0 ? gridReqWlaJM.systemSource : null, ((-1) & 1073741824) != 0 ? gridReqWlaJM.nmpUnderlyingId : null, ((-1) & Integer.MIN_VALUE) != 0 ? gridReqWlaJM.earnParam : null, (12 & 1) != 0 ? gridReqWlaJM.batchNo : null, (12 & 2) != 0 ? gridReqWlaJM.voucherId : null, (12 & 4) != 0 ? gridReqWlaJM.tradeQuoteCcy : null, (12 & 8) != 0 ? gridReqWlaJM.profitAutoReinvestParam : null)), false, vrf.OLrzqt().fvQaOB().isConnected().getDigit(), true, 1, (DefaultConstructorMarker) null));
        pUU.copydefault("eddie", "shareRangeData " + vrf.ejfBZ().gEmmrt().getValue());
        vrf.AYXKKw = false;
        return Unit.INSTANCE;
    }

    private final void KWHzl(java.lang.String str, java.lang.String str2) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        if (C33129mqd.valueOf(str, str2)) {
            xMR xmr = xMR.copydefault;
            java.lang.String str3 = xmr.copydefault(str) + " - " + xmr.copydefault(str2);
            C55312xha c55312xhaValueOf = values().ejfBZ.valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl2.setText(C33070mpX.AYXKKw(C55688xof.Application.ensureClassLoader) + " (" + str3 + ")");
            }
            C47988uAv.setInputLabel$default(values().gEmmrt, str3, null, 2, null);
            return;
        }
        C55312xha c55312xhaValueOf2 = values().ejfBZ.valueOf();
        if (c55312xhaValueOf2 == null || (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.ensureClassLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fIwbmz() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    private final void copydefault(StgyParam stgyParam) {
        if (stgyParam != null) {
            AbstractC48321uNd abstractC48321uNdValues = values();
            abstractC48321uNdValues.fetchVPNInfo.copydefault();
            abstractC48321uNdValues.AkhnZx.copydefault();
            abstractC48321uNdValues.gEmmrt.copydefault();
            copydefault("");
            C47988uAv.setInputContent$default(abstractC48321uNdValues.fetchVPNInfo, stgyParam.getMinPx(), false, false, 6, null);
            C47988uAv.setInputContent$default(abstractC48321uNdValues.AkhnZx, stgyParam.getMaxPx(), false, false, 6, null);
            C47988uAv.setInputContent$default(abstractC48321uNdValues.gEmmrt, stgyParam.getGridNum(), false, false, 6, null);
            GridReq gridReqWlaJM = OLrzqt().wlaJM();
            java.lang.String minPx = stgyParam.getMinPx();
            if (minPx == null) {
                minPx = "";
            }
            gridReqWlaJM.setMinPx(minPx);
            GridReq gridReqWlaJM2 = OLrzqt().wlaJM();
            java.lang.String maxPx = stgyParam.getMaxPx();
            if (maxPx == null) {
                maxPx = "";
            }
            gridReqWlaJM2.setMaxPx(maxPx);
            GridReq gridReqWlaJM3 = OLrzqt().wlaJM();
            java.lang.String gridNum = stgyParam.getGridNum();
            if (gridNum == null) {
                gridNum = "";
            }
            gridReqWlaJM3.setGridNum(gridNum);
            java.lang.String maxPx2 = stgyParam.getMaxPx();
            java.lang.String str = maxPx2 == null ? "" : maxPx2;
            java.lang.String minPx2 = stgyParam.getMinPx();
            java.lang.String str2 = minPx2 == null ? "" : minPx2;
            java.lang.String gridNum2 = stgyParam.getGridNum();
            ejfBZ().gEmmrt().setValue(new BotGridOrderDialogData((java.lang.String) null, str, str2, gridNum2 == null ? "" : gridNum2, wPG.KWHzl.AEQbTJ(OLrzqt().wlaJM()), false, OLrzqt().fvQaOB().isConnected().getDigit(), false, 129, (DefaultConstructorMarker) null));
        }
    }

    public final void copydefault() {
        java.lang.String maxPx = OLrzqt().wlaJM().getMaxPx();
        java.lang.String str = maxPx == null ? "" : maxPx;
        java.lang.String minPx = OLrzqt().wlaJM().getMinPx();
        java.lang.String str2 = minPx == null ? "" : minPx;
        java.lang.String gridNum = OLrzqt().wlaJM().getGridNum();
        BotGridOrderDialogData botGridOrderDialogData = new BotGridOrderDialogData((java.lang.String) null, str, str2, gridNum == null ? "" : gridNum, wPG.KWHzl.AEQbTJ(OLrzqt().wlaJM()), false, OLrzqt().fvQaOB().isConnected().getDigit(), false, 129, (DefaultConstructorMarker) null);
        if (botGridOrderDialogData.getMinPx().length() <= 0 || botGridOrderDialogData.getMaxPx().length() <= 0 || botGridOrderDialogData.getGridCount().length() <= 0) {
            return;
        }
        ejfBZ().gEmmrt().setValue(botGridOrderDialogData);
    }

    private final void copydefault(java.lang.String str) {
        android.widget.TextView textView = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true ? 0 : 8);
        values().copydefault.setText(str);
    }

    private final java.lang.String hDKMBd() {
        java.lang.String maxGridNum;
        java.lang.String strAkhnZx = values().gEmmrt.AkhnZx();
        StrategyConfigInfo strategyConfigInfoDjBIcL = OLrzqt().djBIcL();
        java.lang.String maxGridNum2 = null;
        java.lang.String minGridNum = strategyConfigInfoDjBIcL != null ? strategyConfigInfoDjBIcL.getMinGridNum() : null;
        GridNumRangeBean value = OLrzqt().hDKMBd().getValue();
        if (value == null || (maxGridNum = value.getMaxGridNum()) == null) {
            StrategyConfigInfo strategyConfigInfoDjBIcL2 = OLrzqt().djBIcL();
            if (strategyConfigInfoDjBIcL2 != null) {
                maxGridNum2 = strategyConfigInfoDjBIcL2.getMaxGridNum();
            }
        } else {
            maxGridNum2 = maxGridNum;
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx) || minGridNum == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) minGridNum) || maxGridNum2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxGridNum2)) {
            return "";
        }
        return C33129mqd.gEmmrt(strAkhnZx, minGridNum) ? C33069mpW.copydefault(this, C55688xof.Application.onDrawerSlide, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, minGridNum))) : C33129mqd.AEQbTJ(strAkhnZx, maxGridNum2) ? C33069mpW.copydefault(this, C55688xof.Application.ActionBarLayoutParams, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, maxGridNum2))) : "";
    }
}
