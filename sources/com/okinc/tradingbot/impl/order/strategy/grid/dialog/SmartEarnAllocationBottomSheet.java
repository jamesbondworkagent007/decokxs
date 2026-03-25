package com.okinc.tradingbot.impl.order.strategy.grid.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.tradingbot.impl.order.strategy.data.BotModel;
import com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.bot.EarnType;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnProperties;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC52786wYh;
import o.AbstractC54531xLw;
import o.C33070mpX;
import o.C47988uAv;
import o.C48033uCm;
import o.C48323uNf;
import o.C48326uNi;
import o.C48338uNu;
import o.C50503vQv;
import o.C50544vSi;
import o.C50545vSj;
import o.C52761wXj;
import o.C52794wYp;
import o.C53418wlC;
import o.C53465wlx;
import o.C53513wms;
import o.C53573wnz;
import o.C54536xML;
import o.C54589xNz;
import o.C54782xVc;
import o.C55018xby;
import o.C55258xgZ;
import o.C55276xgr;
import o.C55296xhK;
import o.C55312xha;
import o.C55320xhi;
import o.C55688xof;
import o.C56390yDp;
import o.C56392yDr;
import o.C56524yIo;
import o.C58114yvF;
import o.InterfaceC50505vQx;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.ViewOnClickListenerC54939xaY;
import o.wXQ;
import o.wXX;
import o.wYF;
import o.xMS;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartEarnAllocationBottomSheet extends wXX {
    public final ViewTreeObserver.OnWindowFocusChangeListener EZpvd;
    public C52794wYp KWHzl;

    @yCM
    public CoroutineDispatcher dispatcher;

    @yCM
    public C50545vSj editSmartEarnUseCase;
    public final InterfaceC56387yDm fetchVPNInfo;

    @yCM
    public C50544vSi smartEarnComputationUseCase;
    public final InterfaceC56387yDm valueOf;
    public C48338uNu values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vPV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SmartEarnAllocationBottomSheet.ejfBZ(this.copydefault);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vQe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SmartEarnAllocationBottomSheet.fJNWhG(this.copydefault);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.vQg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SmartEarnAllocationBottomSheet.getNewProxyInstance(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.vQi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SmartEarnAllocationBottomSheet.uzCIH(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.vQm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SmartEarnAllocationBottomSheet.iwGUEr(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.vQl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SmartEarnAllocationBottomSheet.fARcdN(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.vQo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SmartEarnAllocationBottomSheet.hDKMBd(this.OLrzqt);
        }
    });

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EarnType.values().length];
            try {
                iArr[EarnType.Ratio.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EarnType.Absolute.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    public SmartEarnAllocationBottomSheet() {
        Function0 function0 = new Function0() { // from class: o.vQk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartEarnAllocationBottomSheet.zsXlph(this.EZpvd);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C50503vQv.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$special$$inlined$viewModels$default$4
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.vQn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartEarnAllocationBottomSheet.getFieldNames(this.OLrzqt);
            }
        });
        this.EZpvd = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: o.vQt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                SmartEarnAllocationBottomSheet.AEQbTJ(this.copydefault, z);
            }
        };
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ SmartEarnAllocationBottomSheet newInstance$default(StateListAnimator stateListAnimator, String str, String str2, String str3, SmartEarnConfig smartEarnConfig, SmartEarnProperties smartEarnProperties, BotModel botModel, int i, Object obj) {
            if ((i & 16) != 0) {
                smartEarnProperties = null;
            }
            return stateListAnimator.KWHzl(str, str2, str3, smartEarnConfig, smartEarnProperties, botModel);
        }

        public final SmartEarnAllocationBottomSheet KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull SmartEarnConfig smartEarnConfig, SmartEarnProperties smartEarnProperties, @NotNull BotModel botModel) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(smartEarnConfig, "");
            Intrinsics.checkNotNullParameter(botModel, "");
            SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet = new SmartEarnAllocationBottomSheet();
            smartEarnAllocationBottomSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("LastPriceKey", str), C56390yDp.OLrzqt("MinPriceKey", str2), C56390yDp.OLrzqt("MaxPriceKey", str3), C56390yDp.OLrzqt("SmartEarnConfig", smartEarnConfig), C56390yDp.OLrzqt("existing_smart_earn_param", smartEarnProperties), C56390yDp.OLrzqt("bot_model", botModel)));
            return smartEarnAllocationBottomSheet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BotModel djBIcL() {
        return (BotModel) this.OLrzqt.getValue();
    }

    public static final BotModel ejfBZ(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet) {
        BotModel botModel;
        Bundle arguments = smartEarnAllocationBottomSheet.getArguments();
        return (arguments == null || (botModel = (BotModel) arguments.getParcelable("bot_model")) == null) ? BotModel.Companion.KWHzl() : botModel;
    }

    public final SmartEarnProperties copydefault() {
        return (SmartEarnProperties) this.copydefault.getValue();
    }

    public static final SmartEarnProperties fJNWhG(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet) {
        Bundle arguments = smartEarnAllocationBottomSheet.getArguments();
        if (arguments != null) {
            return (SmartEarnProperties) arguments.getParcelable("existing_smart_earn_param");
        }
        return null;
    }

    public final String EZpvd() {
        return (String) this.gEmmrt.getValue();
    }

    public static final String getNewProxyInstance(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet) {
        Bundle arguments = smartEarnAllocationBottomSheet.getArguments();
        if (arguments != null) {
            return arguments.getString("LastPriceKey");
        }
        return null;
    }

    public final String gEmmrt() {
        return (String) this.AYXKKw.getValue();
    }

    public static final String uzCIH(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet) {
        Bundle arguments = smartEarnAllocationBottomSheet.getArguments();
        if (arguments != null) {
            return arguments.getString("MinPriceKey");
        }
        return null;
    }

    public final String KWHzl() {
        return (String) this.AhwBna.getValue();
    }

    public static final String iwGUEr(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet) {
        Bundle arguments = smartEarnAllocationBottomSheet.getArguments();
        if (arguments != null) {
            return arguments.getString("MaxPriceKey");
        }
        return null;
    }

    private final BizInstrument fetchVPNInfo() {
        return (BizInstrument) this.djBIcL.getValue();
    }

    public static final BizInstrument fARcdN(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, smartEarnAllocationBottomSheet.djBIcL().KWHzl(), smartEarnAllocationBottomSheet.djBIcL().OLrzqt(), null, null, 12, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String AkhnZx() {
        return (String) this.isConnected.getValue();
    }

    public static final String hDKMBd(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet) {
        BizInstrument bizInstrumentFetchVPNInfo = smartEarnAllocationBottomSheet.fetchVPNInfo();
        String quoteSymbol = bizInstrumentFetchVPNInfo != null ? bizInstrumentFetchVPNInfo.getQuoteSymbol() : null;
        return quoteSymbol == null ? "" : quoteSymbol;
    }

    public final C50544vSi valueOf() {
        C50544vSi c50544vSi = this.smartEarnComputationUseCase;
        if (c50544vSi != null) {
            return c50544vSi;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C50545vSj OLrzqt() {
        C50545vSj c50545vSj = this.editSmartEarnUseCase;
        if (c50545vSj != null) {
            return c50545vSj;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final CoroutineDispatcher AEQbTJ() {
        CoroutineDispatcher coroutineDispatcher = this.dispatcher;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C50503vQv AYXKKw() {
        return (C50503vQv) this.fetchVPNInfo.getValue();
    }

    public static final C50503vQv copydefault(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C50503vQv(SavedStateHandleSupport.createSavedStateHandle(creationExtras), smartEarnAllocationBottomSheet.valueOf(), smartEarnAllocationBottomSheet.OLrzqt(), smartEarnAllocationBottomSheet.AEQbTJ());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xMS DbNXlk() {
        return (xMS) this.valueOf.getValue();
    }

    public static final xMS getFieldNames(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentFetchVPNInfo = smartEarnAllocationBottomSheet.fetchVPNInfo();
        if (bizInstrumentFetchVPNInfo == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(bizInstrumentFetchVPNInfo.getInstType())) == null) {
            return null;
        }
        return abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentFetchVPNInfo.getInstFamily());
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C58114yvF c58114yvF = C58114yvF.EZpvd;
        ((InterfaceC50505vQx) C58114yvF.OLrzqt(context, InterfaceC50505vQx.class)).KWHzl(this);
        super.onAttach(context);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(8);
        if (AhwBna()) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.build);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.DzCpqu);
        }
        wxq.setTitle(strAYXKKw);
        wxq.setStyle(1);
        wxq.setCloseVisibility(true);
        ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new PendingIntent(imageViewKWHzl, 1000L, this));
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C48338uNu AEQbTJ;
        public final /* synthetic */ SmartEarnAllocationBottomSheet EZpvd;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, C48338uNu c48338uNu, SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c48338uNu;
            this.EZpvd = smartEarnAllocationBottomSheet;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.uAv.setInputContent$default(o.uAv, java.lang.String, boolean, boolean, int, java.lang.Object):void */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (!this.AEQbTJ.OLrzqt.EZpvd()) {
                    this.EZpvd.AYXKKw().copydefault(C50503vQv.Application.StateListAnimator.EZpvd);
                } else {
                    C47988uAv.setInputContent$default(this.AEQbTJ.AYXKKw, null, false, false, 6, null);
                    C47988uAv.setInputContent$default(this.AEQbTJ.EZpvd, null, false, false, 6, null);
                }
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j) {
            this.KWHzl = view;
            this.AEQbTJ = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Context context = ((C55320xhi) this.KWHzl).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                C48326uNi c48326uNiKWHzl = C48326uNi.KWHzl(LayoutInflater.from(viewOnClickListenerC54939xaY.getContext()));
                Intrinsics.checkNotNullExpressionValue(c48326uNiKWHzl, "");
                NestedScrollView nestedScrollViewEZpvd = c48326uNiKWHzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(nestedScrollViewEZpvd, "");
                ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, nestedScrollViewEZpvd, 0, 2, null);
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new Application(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ SmartEarnAllocationBottomSheet EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(View view, long j, SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = smartEarnAllocationBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.AYXKKw().copydefault(C50503vQv.Application.ActionBar.EZpvd);
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ SmartEarnAllocationBottomSheet EZpvd;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = smartEarnAllocationBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.dismiss();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j) {
            this.EZpvd = view;
            this.KWHzl = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Context context = ((C55320xhi) this.EZpvd).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.onProviderEnabled);
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new Activity(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    @Override // o.wXX
    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateFooter(constraintLayout);
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        wYF wyf = new wYF(context, null, 2, 0 == true ? 1 : 0);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(getString(C55688xof.Application.PipHintTrackerKt));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(!AhwBna());
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new LoaderManager(c52794wYpCopydefault2, 1000L, this));
        }
        this.KWHzl = wyf.copydefault();
        constraintLayout.addView(wyf, new ConstraintLayout.LayoutParams(-1, -2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d7  */
    @Override // o.wXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        String safeString$default;
        boolean z;
        C55320xhi c55320xhiKWHzl;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLDjBIcL2;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        final C48338uNu c48338uNuKWHzl = C48338uNu.KWHzl(LayoutInflater.from(constraintLayout.getContext()), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c48338uNuKWHzl, "");
        this.values = c48338uNuKWHzl;
        C47988uAv c47988uAv = c48338uNuKWHzl.AYXKKw;
        String safeString$default2 = null;
        C47988uAv.setInputLabel$default(c47988uAv, C33070mpX.AYXKKw(C48033uCm.Fragment.ilfrrN), null, 2, null);
        c47988uAv.setInputHint("%");
        c47988uAv.setFloatingHint(C33070mpX.AYXKKw(C48033uCm.Fragment.ilfrrN) + " (%)");
        C47988uAv c47988uAv2 = c48338uNuKWHzl.EZpvd;
        C47988uAv.setInputLabel$default(c47988uAv2, C33070mpX.AYXKKw(C48033uCm.Fragment.dpErvT), null, 2, null);
        c47988uAv2.setInputHint("%");
        c47988uAv2.setFloatingHint(C33070mpX.AYXKKw(C48033uCm.Fragment.dpErvT) + " (%)");
        c48338uNuKWHzl.valueOf.setTextAppearance(C52761wXj.LoaderManager.zuBGHE, C52761wXj.LoaderManager.gHZMYf);
        c48338uNuKWHzl.djBIcL.setTextAppearance(C52761wXj.LoaderManager.zuBGHE, C52761wXj.LoaderManager.gHZMYf);
        C55320xhi c55320xhi = c48338uNuKWHzl.gEmmrt;
        c55320xhi.setOnClickListener(new Fragment(c55320xhi, 1000L));
        int i = C52761wXj.Activity.QwvEab;
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C33070mpX.OLrzqt(i, context);
        c48338uNuKWHzl.valueOf.KWHzl().setTextColor(iOLrzqt);
        c48338uNuKWHzl.djBIcL.KWHzl().setTextColor(iOLrzqt);
        c48338uNuKWHzl.valueOf.setActiveContent(C53418wlC.copydefault(EZpvd()));
        C53573wnz c53573wnz = c48338uNuKWHzl.djBIcL;
        xMS xmsDbNXlk = DbNXlk();
        if (xmsDbNXlk == null) {
            safeString$default = null;
        } else {
            String strGEmmrt = gEmmrt();
            if (strGEmmrt == null) {
                strGEmmrt = "";
            }
            C54536xML c54536xMLAYXKKw = xmsDbNXlk.AYXKKw(strGEmmrt);
            if (c54536xMLAYXKKw != null && (c54536xMLDjBIcL2 = c54536xMLAYXKKw.djBIcL()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null);
            }
        }
        String strCopydefault = C53418wlC.copydefault(safeString$default);
        xMS xmsDbNXlk2 = DbNXlk();
        if (xmsDbNXlk2 != null) {
            String strKWHzl = KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            C54536xML c54536xMLAYXKKw2 = xmsDbNXlk2.AYXKKw(strKWHzl);
            if (c54536xMLAYXKKw2 != null && (c54536xMLDjBIcL = c54536xMLAYXKKw2.djBIcL()) != null) {
                safeString$default2 = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
            }
        }
        c53573wnz.setActiveContent(strCopydefault + "-" + C53418wlC.copydefault(safeString$default2) + " " + AkhnZx());
        KWHzl(c48338uNuKWHzl);
        C53513wms c53513wms = c48338uNuKWHzl.OLrzqt;
        List listGEmmrt = yDY.gEmmrt(c48338uNuKWHzl.EZpvd.AkhnZx(), c48338uNuKWHzl.AYXKKw.AkhnZx());
        if ((listGEmmrt instanceof Collection) && listGEmmrt.isEmpty()) {
            z = true;
        } else {
            Iterator it = listGEmmrt.iterator();
            while (it.hasNext()) {
                if (!StringsKt__StringsKt.fARcdN((CharSequence) it.next())) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        c53513wms.setClear(z);
        C53513wms c53513wms2 = c48338uNuKWHzl.OLrzqt;
        c53513wms2.setOnClickListener(new Dialog(c53513wms2, 1000L, c48338uNuKWHzl, this));
        copydefault(c48338uNuKWHzl);
        EZpvd(c48338uNuKWHzl);
        final C53573wnz c53573wnz2 = c48338uNuKWHzl.DbNXlk;
        c53573wnz2.setTitleClickListener(new View.OnClickListener() { // from class: o.vQb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SmartEarnAllocationBottomSheet.KWHzl(c53573wnz2, view);
            }
        });
        c53573wnz2.setOnSwitchChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vQh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z2) {
                SmartEarnAllocationBottomSheet.EZpvd(c48338uNuKWHzl, this, compoundButton, z2);
            }
        });
        SmartEarnProperties smartEarnPropertiesCopydefault = copydefault();
        c53573wnz2.setSwitchChecked(smartEarnPropertiesCopydefault != null && smartEarnPropertiesCopydefault.getEnabled());
        c53573wnz2.KWHzl().setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
        C55258xgZ c55258xgZKWHzl = c53573wnz2.KWHzl();
        int i2 = C52761wXj.Activity.fdOvFl;
        Context context2 = c53573wnz2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c55258xgZKWHzl.setTextColor(C33070mpX.OLrzqt(i2, context2));
        C55312xha c55312xhaValueOf = c53573wnz2.KWHzl().valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            int i3 = C52761wXj.Activity.DCUTEIddSDPG;
            Context context3 = c53573wnz2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c55320xhiKWHzl.setUnderlineColor(C33070mpX.OLrzqt(i3, context3));
        }
        C55320xhi c55320xhi2 = c48338uNuKWHzl.KWHzl;
        c55320xhi2.setOnClickListener(new TaskDescription(c55320xhi2, 1000L));
        AYXKKw().copydefault(new C50503vQv.Application.C0982Application(copydefault()));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.AEQbTJ.dismiss();
        }
    }

    public static final void KWHzl(C53573wnz c53573wnz, View view) {
        Context context = c53573wnz.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        C48323uNf c48323uNfAEQbTJ = C48323uNf.AEQbTJ(LayoutInflater.from(viewOnClickListenerC54939xaY.getContext()));
        LinearLayout linearLayout = c48323uNfAEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setPadding(0, 0, 0, 0);
        for (Object obj : yDY.gEmmrt(c48323uNfAEQbTJ.OLrzqt, c48323uNfAEQbTJ.AEQbTJ)) {
            Intrinsics.checkNotNullExpressionValue(obj, "");
            ((AppCompatTextView) obj).setTextAppearance(C52761wXj.LoaderManager.zLjUOn);
        }
        Intrinsics.checkNotNullExpressionValue(c48323uNfAEQbTJ, "");
        NestedScrollView nestedScrollViewCopydefault = c48323uNfAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(nestedScrollViewCopydefault, "");
        ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, nestedScrollViewCopydefault, 0, 2, null);
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.vQf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                SmartEarnAllocationBottomSheet.KWHzl(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(C48338uNu c48338uNu, SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, CompoundButton compoundButton, boolean z) {
        ConstraintLayout constraintLayout = c48338uNu.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(z ? 0 : 8);
        smartEarnAllocationBottomSheet.AYXKKw().copydefault(new C50503vQv.Application.Activity(z));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.OLrzqt.dismiss();
        }
    }

    public final void KWHzl(final C48338uNu c48338uNu) {
        C55018xby c55018xby = c48338uNu.AhwBna;
        EarnType[] earnTypeArrValues = EarnType.values();
        ArrayList arrayList = new ArrayList(earnTypeArrValues.length);
        int length = earnTypeArrValues.length;
        for (int i = 0; i < length; i++) {
            EarnType earnType = earnTypeArrValues[i];
            arrayList.add(new C55276xgr(C33070mpX.AYXKKw(C53465wlx.copydefault(earnType)), earnType, null, earnType == EarnType.Ratio, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        c55018xby.setItems(CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList));
        AbstractC52786wYh abstractC52786wYhOLrzqt = c48338uNu.AhwBna.OLrzqt();
        Intrinsics.copydefault(abstractC52786wYhOLrzqt, "");
        ((C55018xby.Activity) abstractC52786wYhOLrzqt).EZpvd(new Function1() { // from class: o.vQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SmartEarnAllocationBottomSheet.OLrzqt(c48338uNu, this, (java.lang.CharSequence) obj);
            }
        });
        c48338uNu.AhwBna.getViewTreeObserver().addOnWindowFocusChangeListener(this.EZpvd);
    }

    public static final Unit OLrzqt(C48338uNu c48338uNu, SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, CharSequence charSequence) {
        AbstractC52786wYh abstractC52786wYhOLrzqt = c48338uNu.AhwBna.OLrzqt();
        if (abstractC52786wYhOLrzqt != null) {
            abstractC52786wYhOLrzqt.dismiss();
        }
        C50503vQv c50503vQvAYXKKw = smartEarnAllocationBottomSheet.AYXKKw();
        for (C55276xgr c55276xgr : c48338uNu.AhwBna.copydefault()) {
            if (Intrinsics.EZpvd(c55276xgr.AhwBna(), charSequence)) {
                Object objOLrzqt = c55276xgr.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                c50503vQvAYXKKw.copydefault(new C50503vQv.Application.TaskDescription((EarnType) objOLrzqt));
                return Unit.INSTANCE;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C55018xby c55018xby;
        ViewTreeObserver viewTreeObserver;
        C48338uNu c48338uNu = this.values;
        if (c48338uNu != null && (c55018xby = c48338uNu.AhwBna) != null && (viewTreeObserver = c55018xby.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this.EZpvd);
        }
        this.values = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C54782xVc.AEQbTJ.AhwBna(fetchVPNInfo());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C54782xVc.AEQbTJ.AYXKKw();
    }

    public static final void AEQbTJ(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, boolean z) {
        C47988uAv c47988uAv;
        C47988uAv c47988uAv2;
        if (z) {
            C48338uNu c48338uNu = smartEarnAllocationBottomSheet.values;
            if (c48338uNu != null && (c47988uAv2 = c48338uNu.EZpvd) != null) {
                c47988uAv2.ejfBZ();
            }
            C48338uNu c48338uNu2 = smartEarnAllocationBottomSheet.values;
            if (c48338uNu2 == null || (c47988uAv = c48338uNu2.AYXKKw) == null) {
                return;
            }
            c47988uAv.ejfBZ();
        }
    }

    public final void copydefault(C48338uNu c48338uNu, String str, String str2) {
        if (Intrinsics.EZpvd((Object) str, (Object) c48338uNu.AYXKKw.AkhnZx()) && Intrinsics.EZpvd((Object) str2, (Object) c48338uNu.EZpvd.AkhnZx())) {
            return;
        }
        c48338uNu.AYXKKw.setOnTextChangeCallback(null);
        c48338uNu.AYXKKw.setOnTextChangeCallback(null);
        C47988uAv.setInputContent$default(c48338uNu.AYXKKw, str, false, false, 6, null);
        C47988uAv.setInputContent$default(c48338uNu.EZpvd, str2, false, false, 6, null);
        copydefault(c48338uNu);
    }

    public final void copydefault(C48338uNu c48338uNu) {
        c48338uNu.AYXKKw.setOnTextChangeCallback(new Function2() { // from class: o.vQd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SmartEarnAllocationBottomSheet.EZpvd(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c48338uNu.EZpvd.setOnTextChangeCallback(new Function2() { // from class: o.vQc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SmartEarnAllocationBottomSheet.AEQbTJ(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final Unit EZpvd(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, C47988uAv c47988uAv, String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        C50503vQv c50503vQvAYXKKw = smartEarnAllocationBottomSheet.AYXKKw();
        if (str == null) {
            str = "";
        }
        c50503vQvAYXKKw.copydefault(new C50503vQv.Application.Fragment(str));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, C47988uAv c47988uAv, String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        C50503vQv c50503vQvAYXKKw = smartEarnAllocationBottomSheet.AYXKKw();
        if (str == null) {
            str = "";
        }
        c50503vQvAYXKKw.copydefault(new C50503vQv.Application.Dialog(str));
        return Unit.INSTANCE;
    }

    public final void EZpvd(C48338uNu c48338uNu) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SmartEarnAllocationBottomSheet$startCollection$1(this, c48338uNu, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new SmartEarnAllocationBottomSheet$startCollection$2(this, null), 3, null);
    }

    public final boolean AhwBna() {
        SmartEarnProperties smartEarnPropertiesCopydefault;
        return djBIcL().copydefault() && (smartEarnPropertiesCopydefault = copydefault()) != null && smartEarnPropertiesCopydefault.getHasParametersSet();
    }

    public final void EZpvd(C48338uNu c48338uNu, EarnType earnType) {
        String str;
        int i = ActionBar.AEQbTJ[earnType.ordinal()];
        if (i == 1) {
            str = "(%)";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "";
        }
        C47988uAv c47988uAv = c48338uNu.AYXKKw;
        C47988uAv.setInputLabel$default(c47988uAv, C33070mpX.AYXKKw(C48033uCm.Fragment.ilfrrN), null, 2, null);
        c47988uAv.setInputHint(str);
        c47988uAv.setFloatingHint(C33070mpX.AYXKKw(C48033uCm.Fragment.ilfrrN) + " " + str);
        C47988uAv c47988uAv2 = c48338uNu.EZpvd;
        C47988uAv.setInputLabel$default(c47988uAv2, C33070mpX.AYXKKw(C48033uCm.Fragment.dpErvT), null, 2, null);
        c47988uAv2.setInputHint(str);
        c47988uAv2.setFloatingHint(C33070mpX.AYXKKw(C48033uCm.Fragment.dpErvT) + " " + str);
    }

    public static final ViewModelProvider.Factory zsXlph(final SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C50503vQv.class), new Function1() { // from class: o.vQj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SmartEarnAllocationBottomSheet.copydefault(this.copydefault, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
