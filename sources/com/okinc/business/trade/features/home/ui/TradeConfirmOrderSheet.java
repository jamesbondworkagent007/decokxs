package com.okinc.business.trade.features.home.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dexlogic.bean.ReferralParamInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.ReferralSwapMode;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.trade.features.home.ui.TradeConfirmOrderSheet;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedConfirmEvents;
import com.okinc.business.trade.features.home.ui.viewmodel.TradeConfirmOrderViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.uilab.reminder.OKReminder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC22403heh;
import o.AbstractC22407hel;
import o.AbstractC30453lbT;
import o.C23274hvD;
import o.C23311hvo;
import o.C23313hvq;
import o.C23418hxp;
import o.C25332iui;
import o.C25382ivf;
import o.C25385ivi;
import o.C25386ivj;
import o.C25390ivn;
import o.C25404iwA;
import o.C25447iwr;
import o.C25452iww;
import o.C30383laC;
import o.C30387laG;
import o.C30454lbU;
import o.C30457lbX;
import o.C30501lcO;
import o.C30509lcW;
import o.C30516lcd;
import o.C31131loI;
import o.C33070mpX;
import o.C33129mqd;
import o.C33512mxp;
import o.C52761wXj;
import o.C52794wYp;
import o.C55251xgS;
import o.C55258xgZ;
import o.C55296xhK;
import o.C55298xhM;
import o.C56392yDr;
import o.C56423yEv;
import o.C56524yIo;
import o.C57406yhn;
import o.C57659ymb;
import o.InterfaceC30390laJ;
import o.InterfaceC30395laO;
import o.InterfaceC30619lea;
import o.InterfaceC56387yDm;
import o.hHH;
import o.wXQ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TradeConfirmOrderSheet extends AbstractC30453lbT {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = 8;
    public String AYXKKw;
    public StateFlow<C30457lbX> AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public boolean djBIcL;
    public Function0<Unit> fetchVPNInfo;

    @yCM
    public C25447iwr handleLimitEventTrackUtils;

    @yCM
    public C25452iww handleSwapEventTrackUtils;
    public Function1<? super String, Unit> valueOf;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeMode.values().length];
            try {
                iArr[TradeMode.SwapLimit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeMode.Advanced.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeMode.SwapMarket.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public TradeConfirmOrderSheet() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.trade.features.home.ui.TradeConfirmOrderSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.TradeConfirmOrderSheet$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TradeConfirmOrderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.TradeConfirmOrderSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.TradeConfirmOrderSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.TradeConfirmOrderSheet$special$$inlined$viewModels$default$5
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
        this.AYXKKw = "115792089237316195423570985008687907853269984665640564039457584007913129639935";
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.TradeConfirmOrderSheet.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.trade.features.home.ui.TradeConfirmOrderSheet$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TradeConfirmOrderSheet newInstance$default(Activity activity, StateFlow stateFlow, Function1 function1, Function0 function0, int i, Object obj) {
            if ((i & 4) != 0) {
                function0 = null;
            }
            return activity.copydefault(stateFlow, function1, function0);
        }

        public final TradeConfirmOrderSheet copydefault(@NotNull StateFlow<C30457lbX> stateFlow, Function1<? super String, Unit> function1, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(stateFlow, "");
            TradeConfirmOrderSheet tradeConfirmOrderSheet = new TradeConfirmOrderSheet();
            tradeConfirmOrderSheet.AhwBna = stateFlow;
            tradeConfirmOrderSheet.valueOf = function1;
            tradeConfirmOrderSheet.fetchVPNInfo = function0;
            return tradeConfirmOrderSheet;
        }
    }

    public final C25452iww gEmmrt() {
        C25452iww c25452iww = this.handleSwapEventTrackUtils;
        if (c25452iww != null) {
            return c25452iww;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C25447iwr valueOf() {
        C25447iwr c25447iwr = this.handleLimitEventTrackUtils;
        if (c25447iwr != null) {
            return c25447iwr;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final TradeConfirmOrderViewModel djBIcL() {
        return (TradeConfirmOrderViewModel) this.DbNXlk.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setCloseVisibility(true);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.invokeSuspendlambda0));
        wxq.setContentDescription("web3_dex_advance_order_confirmation_title");
        ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ TradeConfirmOrderSheet KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, TradeConfirmOrderSheet tradeConfirmOrderSheet) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = tradeConfirmOrderSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.dismiss();
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C30516lcd AEQbTJ;
        public final /* synthetic */ TradeConfirmOrderSheet EZpvd;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(View view, long j, TradeConfirmOrderSheet tradeConfirmOrderSheet, C30516lcd c30516lcd) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = tradeConfirmOrderSheet;
            this.AEQbTJ = c30516lcd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.KWHzl(this.AEQbTJ.EZpvd());
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ C30516lcd EZpvd;
        public final /* synthetic */ TradeConfirmOrderSheet KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, TradeConfirmOrderSheet tradeConfirmOrderSheet, C30516lcd c30516lcd) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = tradeConfirmOrderSheet;
            this.EZpvd = c30516lcd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.KWHzl(this.EZpvd.djBIcL());
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ TradeConfirmOrderSheet EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, TradeConfirmOrderSheet tradeConfirmOrderSheet) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = tradeConfirmOrderSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.OLrzqt(AdvancedConfirmEvents.Confirm);
                Function0 function0 = this.EZpvd.fetchVPNInfo;
                if (function0 != null) {
                    function0.invoke();
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AhwBna();
        C23418hxp c23418hxpOLrzqt = C23418hxp.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c23418hxpOLrzqt, "");
        StateFlow<C30457lbX> stateFlow = this.AhwBna;
        if (stateFlow != null) {
            C25390ivn.collectOnViewLifecycle$default(this, stateFlow, null, new TaskDescription(c23418hxpOLrzqt), 2, null);
        }
    }

    public static final class TaskDescription<T> implements FlowCollector {
        public final /* synthetic */ C23418hxp OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(C23418hxp c23418hxp) {
            this.OLrzqt = c23418hxp;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(C30457lbX c30457lbX, Continuation<? super Unit> continuation) {
            TradeConfirmOrderSheet.this.OLrzqt(this.OLrzqt, c30457lbX);
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        OLrzqt(AdvancedConfirmEvents.Back);
        super.onDismiss(dialogInterface);
    }

    public final void OLrzqt(InterfaceC30619lea interfaceC30619lea) {
        C30457lbX value;
        C30457lbX value2;
        String strOLrzqt = null;
        if (AkhnZx()) {
            C25447iwr c25447iwrValueOf = valueOf();
            String strDbNXlk = DbNXlk();
            String strOLrzqt2 = OLrzqt();
            String strIsConnected = isConnected();
            String strFetchVPNInfo = fetchVPNInfo();
            Map<String, String> mapEZpvd = EZpvd(interfaceC30619lea);
            StateFlow<C30457lbX> stateFlow = this.AhwBna;
            if (stateFlow != null && (value2 = stateFlow.getValue()) != null) {
                strOLrzqt = value2.OLrzqt();
            }
            c25447iwrValueOf.AEQbTJ(new AbstractC22403heh.ActionBar(strOLrzqt == null ? "" : strOLrzqt, strDbNXlk, strOLrzqt2, strFetchVPNInfo, strIsConnected, mapEZpvd));
            return;
        }
        C25452iww c25452iwwGEmmrt = gEmmrt();
        String strDbNXlk2 = DbNXlk();
        String strOLrzqt3 = OLrzqt();
        String strIsConnected2 = isConnected();
        String strFetchVPNInfo2 = fetchVPNInfo();
        Map<String, String> mapEZpvd2 = EZpvd(interfaceC30619lea);
        StateFlow<C30457lbX> stateFlow2 = this.AhwBna;
        if (stateFlow2 != null && (value = stateFlow2.getValue()) != null) {
            strOLrzqt = value.OLrzqt();
        }
        c25452iwwGEmmrt.OLrzqt(new AbstractC22407hel.Activity(strOLrzqt == null ? "" : strOLrzqt, strDbNXlk2, strOLrzqt3, strIsConnected2, strFetchVPNInfo2, mapEZpvd2));
    }

    public final void AhwBna() {
        C30457lbX value;
        C30457lbX value2;
        String strOLrzqt = null;
        if (AkhnZx()) {
            C25447iwr c25447iwrValueOf = valueOf();
            String strDbNXlk = DbNXlk();
            String strOLrzqt2 = OLrzqt();
            String strFetchVPNInfo = fetchVPNInfo();
            String strIsConnected = isConnected();
            Map eventParams$default = getEventParams$default(this, null, 1, null);
            StateFlow<C30457lbX> stateFlow = this.AhwBna;
            if (stateFlow != null && (value2 = stateFlow.getValue()) != null) {
                strOLrzqt = value2.OLrzqt();
            }
            c25447iwrValueOf.AEQbTJ(new AbstractC22403heh.TaskDescription(strOLrzqt == null ? "" : strOLrzqt, strDbNXlk, strOLrzqt2, strFetchVPNInfo, strIsConnected, eventParams$default));
            return;
        }
        C25452iww c25452iwwGEmmrt = gEmmrt();
        String strDbNXlk2 = DbNXlk();
        String strOLrzqt3 = OLrzqt();
        String strFetchVPNInfo2 = fetchVPNInfo();
        String strIsConnected2 = isConnected();
        Map eventParams$default2 = getEventParams$default(this, null, 1, null);
        StateFlow<C30457lbX> stateFlow2 = this.AhwBna;
        if (stateFlow2 != null && (value = stateFlow2.getValue()) != null) {
            strOLrzqt = value.OLrzqt();
        }
        c25452iwwGEmmrt.OLrzqt(new AbstractC22407hel.StateListAnimator(strOLrzqt == null ? "" : strOLrzqt, strDbNXlk2, strOLrzqt3, strIsConnected2, strFetchVPNInfo2, eventParams$default2));
    }

    public final void OLrzqt(C23418hxp c23418hxp, C30457lbX c30457lbX) {
        if (c30457lbX.gEmmrt().length() == 0) {
            return;
        }
        boolean z = !c30457lbX.EZpvd().isEmpty();
        KWHzl(c23418hxp, z);
        if (z) {
            c23418hxp.copydefault.fIwbmz();
            c23418hxp.copydefault.setContentDescription("web3_dex_advance_order_confirmation_confirm_button");
            C55251xgS c55251xgS = c23418hxp.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(copydefault(c30457lbX) ? 0 : 8);
            C55251xgS c55251xgS2 = c23418hxp.djBIcL;
            TransactionType transactionTypeIsConnected = c30457lbX.isConnected();
            TransactionType transactionType = TransactionType.Buy;
            c55251xgS2.setText(C33070mpX.AYXKKw(transactionTypeIsConnected == transactionType ? C23274hvD.Fragment.getRatingType : C23274hvD.Fragment.getPlaybackState));
            c23418hxp.djBIcL.setOKDSStyle(c30457lbX.isConnected() == transactionType ? 14 : 13);
            c23418hxp.isConnected.setText(c30457lbX.gEmmrt());
            LinearLayoutCompat linearLayoutCompat = c23418hxp.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(c30457lbX.AkhnZx() == TradeMode.Advanced ? 0 : 8);
            c23418hxp.AhwBna.setText(c30457lbX.AYXKKw());
            AppCompatTextView appCompatTextView = c23418hxp.AhwBna;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(c30457lbX.AYXKKw().length() > 0 ? 0 : 8);
            AppCompatImageView appCompatImageView = c23418hxp.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C57659ymb.EZpvd(appCompatImageView, c30457lbX.KWHzl(), C57406yhn.Activity.QKVWgx);
            c23418hxp.valueOf.removeAllViews();
            if (this.valueOf == null) {
                C30383laC c30383laC = c23418hxp.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c30383laC, "");
                c30383laC.setVisibility(8);
            } else {
                C30383laC c30383laC2 = c23418hxp.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c30383laC2, "");
                c30383laC2.setVisibility(0);
                c23418hxp.AEQbTJ.setActionHandler(new Dialog(c23418hxp, this));
                if (!this.djBIcL) {
                    c23418hxp.AEQbTJ.OLrzqt(new C30387laG(c30457lbX.AEQbTJ(), c30457lbX.valueOf(), c30457lbX.values(), this.AYXKKw));
                }
            }
            List<C30516lcd> listEZpvd = c30457lbX.EZpvd();
            ArrayList<C30516lcd> arrayList = new ArrayList();
            for (Object obj : listEZpvd) {
                C30516lcd c30516lcd = (C30516lcd) obj;
                if (c30516lcd.KWHzl().length() > 0 && c30516lcd.valueOf().length() > 0) {
                    arrayList.add(obj);
                }
            }
            for (C30516lcd c30516lcd2 : arrayList) {
                if (c30516lcd2.OLrzqt() == ConfirmOrderTag.SERVICE_FEE && c30457lbX.AkhnZx() == TradeMode.Advanced) {
                    LinearLayoutCompat linearLayoutCompat2 = c23418hxp.valueOf;
                    Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    C25332iui c25332iui = new C25332iui(contextRequireContext, null);
                    c25332iui.setValueSize(C52761wXj.LoaderManager.gHZMYf);
                    Context contextRequireContext2 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    int iKWHzl = C55298xhM.KWHzl(8.0f, contextRequireContext2);
                    Context contextRequireContext3 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                    c25332iui.setPadding(0, iKWHzl, 0, C55298xhM.KWHzl(8.0f, contextRequireContext3));
                    EZpvd(c25332iui, c30516lcd2);
                    linearLayoutCompat2.addView(c25332iui);
                } else {
                    LinearLayoutCompat linearLayoutCompat3 = c23418hxp.valueOf;
                    hHH hhhEZpvd = hHH.EZpvd(getCustomLayoutInflater());
                    Intrinsics.copydefault(hhhEZpvd);
                    KWHzl(hhhEZpvd, c30516lcd2, c30457lbX);
                    linearLayoutCompat3.addView(hhhEZpvd.getRoot());
                }
            }
            OLrzqt(c23418hxp, c30457lbX.copydefault());
            C52794wYp c52794wYp = c23418hxp.copydefault;
            c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        }
    }

    public static final class Dialog implements InterfaceC30390laJ {
        public final /* synthetic */ C23418hxp AEQbTJ;
        public final /* synthetic */ TradeConfirmOrderSheet copydefault;

        public Dialog(C23418hxp c23418hxp, TradeConfirmOrderSheet tradeConfirmOrderSheet) {
            this.AEQbTJ = c23418hxp;
            this.copydefault = tradeConfirmOrderSheet;
        }

        @Override // o.InterfaceC30390laJ
        public void KWHzl() {
            LinearLayoutCompat linearLayoutCompat = this.AEQbTJ.valueOf;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(8);
            C52794wYp c52794wYp = this.AEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
            this.copydefault.djBIcL = true;
            C23418hxp c23418hxp = this.AEQbTJ;
            C30383laC c30383laC = c23418hxp.AEQbTJ;
            int measuredHeight = c23418hxp.valueOf.getMeasuredHeight();
            LinearLayoutCompat linearLayoutCompat2 = this.AEQbTJ.valueOf;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            ViewGroup.LayoutParams layoutParams = linearLayoutCompat2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            c30383laC.copydefault((measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0)) - 1);
        }

        @Override // o.InterfaceC30390laJ
        public void OLrzqt(String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            LinearLayoutCompat linearLayoutCompat = this.AEQbTJ.valueOf;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(0);
            C52794wYp c52794wYp = this.AEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(0);
            this.copydefault.djBIcL = false;
            if (z) {
                this.copydefault.AYXKKw = str;
                Function1 function1 = this.copydefault.valueOf;
                if (function1 != null) {
                    String str2 = this.copydefault.AYXKKw;
                    if (Intrinsics.EZpvd((Object) str2, (Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
                        str2 = null;
                    }
                    function1.invoke(str2 != null ? str2 : "");
                }
                C52794wYp.startLoading$default(this.AEQbTJ.copydefault, 0L, 1, null);
            }
        }
    }

    public final void OLrzqt(C23418hxp c23418hxp, List<? extends AdvancedAutoSellStrategy> list) {
        if (list != null && !list.isEmpty()) {
            C30509lcW c30509lcW = c23418hxp.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c30509lcW, "");
            c30509lcW.setVisibility(0);
            c23418hxp.EZpvd.setStrategies(list);
            return;
        }
        C30509lcW c30509lcW2 = c23418hxp.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c30509lcW2, "");
        c30509lcW2.setVisibility(8);
    }

    public final void KWHzl(hHH hhh, C30516lcd c30516lcd, C30457lbX c30457lbX) {
        int iKWHzl;
        hhh.AEQbTJ.setTextValue(c30516lcd.KWHzl());
        hhh.AEQbTJ.setHelperLabelType(c30516lcd.djBIcL() != null ? 1 : 2);
        if (c30516lcd.djBIcL() != null) {
            C55258xgZ c55258xgZ = hhh.AEQbTJ;
            c55258xgZ.setOnClickListener(new PendingIntent(c55258xgZ, 1000L, this, c30516lcd));
        }
        if (c30516lcd.copydefault() != null) {
            ImageView imageView = hhh.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            ImageView imageView2 = hhh.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C25386ivj.KWHzl(imageView2, c30516lcd.copydefault(), new C25385ivi(C33070mpX.KWHzl(C52761wXj.TaskDescription.gasjUx), null, 0.0f, 0, 14, null));
        } else {
            ImageView imageView3 = hhh.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
        }
        hhh.djBIcL.setText(c30516lcd.valueOf());
        if (c30516lcd.OLrzqt() == ConfirmOrderTag.VALUE_DIFF) {
            if (ActionBar.EZpvd[c30457lbX.AkhnZx().ordinal()] == 1) {
                iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
            } else if (C23313hvq.EZpvd(c30516lcd.valueOf(), Double.valueOf(0.001d))) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                iKWHzl = C33512mxp.tradeRiseDefault$default(c33512mxp, contextRequireContext, 0.0f, 2, null);
            } else if (C23313hvq.valueOf(c30516lcd.valueOf(), Double.valueOf(-0.1d))) {
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                iKWHzl = C33512mxp.tradeFallDefault$default(c33512mxp2, contextRequireContext2, 0.0f, 2, null);
            } else {
                iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
            }
            hhh.djBIcL.setText(C23311hvo.formatPercentWithSymbol$default(c30516lcd.valueOf().toString(), false, 0, 0, null, null, 31, null));
            hhh.djBIcL.setTextColor(iKWHzl);
        }
        if (c30516lcd.OLrzqt() == ConfirmOrderTag.NETWORK_FEE) {
            if (c30516lcd.gEmmrt()) {
                TextView textView = hhh.djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(C33129mqd.OLrzqt(c30516lcd.valueOf()) ? 0 : 8);
                TextView textView2 = hhh.EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(0);
                TextView textView3 = hhh.djBIcL;
                textView3.setPaintFlags(textView3.getPaintFlags() | 16);
                hhh.djBIcL.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            } else {
                TextView textView4 = hhh.djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(0);
                TextView textView5 = hhh.EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView5, "");
                textView5.setVisibility(8);
                TextView textView6 = hhh.djBIcL;
                textView6.setPaintFlags(textView6.getPaintFlags() & (-17));
                hhh.djBIcL.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            }
        }
        if (c30516lcd.OLrzqt() == ConfirmOrderTag.BOOST) {
            String strAEQbTJ = c30516lcd.AEQbTJ();
            boolean z = !(strAEQbTJ == null || strAEQbTJ.length() == 0);
            C55251xgS c55251xgS = hhh.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(z ? 0 : 8);
            if (z) {
                hhh.copydefault.setText(c30516lcd.AEQbTJ());
                if (c30516lcd.EZpvd() != null) {
                    C55251xgS c55251xgS2 = hhh.copydefault;
                    c55251xgS2.setOnClickListener(new LoaderManager(c55251xgS2, 1000L, this, c30516lcd));
                }
            }
        }
        if (c30516lcd.OLrzqt() == ConfirmOrderTag.MARKET_PRICE) {
            hhh.djBIcL.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            hhh.djBIcL.setMaxLines(1);
            ViewGroup.LayoutParams layoutParams = hhh.djBIcL.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.constrainedWidth = true;
                layoutParams2.startToEnd = hhh.AEQbTJ.getId();
                Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                layoutParams2.setMarginStart(C55298xhM.KWHzl(8.0f, contextRequireContext3));
                layoutParams2.horizontalBias = 1.0f;
            }
        }
        ConstraintLayout root = hhh.getRoot();
        ConfirmOrderTag confirmOrderTagOLrzqt = c30516lcd.OLrzqt();
        String contentDescription = confirmOrderTagOLrzqt != null ? confirmOrderTagOLrzqt.getContentDescription() : null;
        root.setContentDescription(contentDescription != null ? contentDescription : "");
    }

    public final void EZpvd(final C25332iui c25332iui, final C30516lcd c30516lcd) {
        C30457lbX value;
        c25332iui.setupServiceFee(c30516lcd.valueOf(), new Function0() { // from class: o.lbW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradeConfirmOrderSheet.AEQbTJ(c30516lcd, this);
            }
        });
        c25332iui.getRootView().setContentDescription("web3_dex_advance_order_confirmation_est_service_fee_row");
        StateFlow<C30457lbX> stateFlow = this.AhwBna;
        final String strOLrzqt = (stateFlow == null || (value = stateFlow.getValue()) == null) ? null : value.OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        c25332iui.setIsShowReferralView(djBIcL().EZpvd(strOLrzqt), new Function0() { // from class: o.lbY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradeConfirmOrderSheet.EZpvd(this.OLrzqt, c25332iui, strOLrzqt);
            }
        });
    }

    public static final Unit AEQbTJ(C30516lcd c30516lcd, TradeConfirmOrderSheet tradeConfirmOrderSheet) {
        if (c30516lcd.djBIcL() != null) {
            tradeConfirmOrderSheet.KWHzl(c30516lcd.djBIcL());
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final TradeConfirmOrderSheet tradeConfirmOrderSheet, final C25332iui c25332iui, final String str) {
        C30457lbX value;
        StateFlow<C30457lbX> stateFlow = tradeConfirmOrderSheet.AhwBna;
        if (stateFlow == null || (value = stateFlow.getValue()) == null) {
            return Unit.INSTANCE;
        }
        TradeConfirmOrderViewModel tradeConfirmOrderViewModelDjBIcL = tradeConfirmOrderSheet.djBIcL();
        Context contextRequireContext = tradeConfirmOrderSheet.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        tradeConfirmOrderViewModelDjBIcL.KWHzl(contextRequireContext, value.OLrzqt(), new ReferralParamInfo(ReferralSwapMode.ADVANCED_MODE.getMode(), value.gEmmrt(), value.AhwBna(), value.djBIcL(), "").referralToMap(), new Function1() { // from class: o.lca
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradeConfirmOrderSheet.KWHzl(c25332iui, tradeConfirmOrderSheet, str, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C25332iui c25332iui, TradeConfirmOrderSheet tradeConfirmOrderSheet, String str, boolean z) {
        if (z) {
            c25332iui.setIsShowReferralView(tradeConfirmOrderSheet.djBIcL().EZpvd(str));
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(InterfaceC30395laO interfaceC30395laO) {
        if (interfaceC30395laO instanceof InterfaceC30395laO.TaskDescription) {
            ServiceFeeInfo serviceFeeInfoOLrzqt = ((InterfaceC30395laO.TaskDescription) interfaceC30395laO).OLrzqt();
            if (serviceFeeInfoOLrzqt != null) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C25404iwA.copydefault(serviceFeeInfoOLrzqt, contextRequireContext);
                return;
            }
            return;
        }
        if (interfaceC30395laO instanceof InterfaceC30395laO.ActionBar) {
            C30454lbU c30454lbUCopydefault = ((InterfaceC30395laO.ActionBar) interfaceC30395laO).copydefault();
            if (c30454lbUCopydefault != null) {
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                C25404iwA.AEQbTJ(c30454lbUCopydefault, contextRequireContext2);
                return;
            }
            return;
        }
        if (interfaceC30395laO instanceof InterfaceC30395laO.Activity) {
            C30454lbU c30454lbUEZpvd = ((InterfaceC30395laO.Activity) interfaceC30395laO).EZpvd();
            if (c30454lbUEZpvd != null) {
                Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                C25404iwA.AEQbTJ(c30454lbUEZpvd, contextRequireContext3);
                return;
            }
            return;
        }
        if (interfaceC30395laO instanceof InterfaceC30395laO.StateListAnimator) {
            C31131loI c31131loI = C31131loI.OLrzqt;
            Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
            c31131loI.OLrzqt(contextRequireContext4, true, new Function0() { // from class: o.lbS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return TradeConfirmOrderSheet.KWHzl(this.copydefault);
                }
            });
            return;
        }
        if (!(interfaceC30395laO instanceof InterfaceC30395laO.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        AYXKKw();
    }

    public static final Unit KWHzl(TradeConfirmOrderSheet tradeConfirmOrderSheet) {
        tradeConfirmOrderSheet.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        C31131loI.OLrzqt.EZpvd(true);
    }

    public final void KWHzl(C23418hxp c23418hxp, boolean z) {
        c23418hxp.copydefault.setEnabled(z);
        String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.heceqZ);
        OKReminder oKReminder = c23418hxp.OLrzqt;
        Intrinsics.copydefault(oKReminder);
        oKReminder.setVisibility(z ^ true ? 0 : 8);
        oKReminder.setTitle((CharSequence) null);
        oKReminder.setMessage((CharSequence) strAYXKKw);
        oKReminder.setStyle(3);
        oKReminder.setCloseIconVisibility(false);
    }

    public final boolean copydefault(C30457lbX c30457lbX) {
        return c30457lbX.AkhnZx() == TradeMode.Advanced;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r0 != 3) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String DbNXlk() {
        C30457lbX value;
        StateFlow<C30457lbX> stateFlow = this.AhwBna;
        if (stateFlow != null && (value = stateFlow.getValue()) != null) {
            int i = ActionBar.EZpvd[value.AkhnZx().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "advanced_confirm";
                }
            }
            return EventPageNameType.SWAP.getPageName();
        }
        return "";
    }

    /* JADX DEBUG: Possible override for method o.lbT.OLrzqt()V */
    public final String OLrzqt() {
        C30457lbX value;
        StateFlow<C30457lbX> stateFlow = this.AhwBna;
        if (stateFlow != null && (value = stateFlow.getValue()) != null) {
            int i = ActionBar.EZpvd[value.AkhnZx().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "advanced";
                }
                if (i != 3) {
                }
            }
            return "swap";
        }
        return "";
    }

    private final String fetchVPNInfo() {
        C30457lbX value;
        StateFlow<C30457lbX> stateFlow = this.AhwBna;
        if (stateFlow != null && (value = stateFlow.getValue()) != null) {
            int i = ActionBar.EZpvd[value.AkhnZx().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    List<C30516lcd> listEZpvd = value.EZpvd();
                    if (!(listEZpvd instanceof Collection) || !listEZpvd.isEmpty()) {
                        Iterator<T> it = listEZpvd.iterator();
                        while (it.hasNext()) {
                            if (((C30516lcd) it.next()).OLrzqt() == ConfirmOrderTag.ROUTER) {
                            }
                        }
                    }
                } else if (i != 3) {
                }
                return "swap";
            }
            return "limit";
        }
        return "";
    }

    private final boolean AkhnZx() {
        C30457lbX value;
        StateFlow<C30457lbX> stateFlow = this.AhwBna;
        if (stateFlow != null && (value = stateFlow.getValue()) != null) {
            if (value.AkhnZx() == TradeMode.Advanced) {
                List<C30516lcd> listEZpvd = value.EZpvd();
                if (!(listEZpvd instanceof Collection) || !listEZpvd.isEmpty()) {
                    Iterator<T> it = listEZpvd.iterator();
                    while (it.hasNext()) {
                        if (((C30516lcd) it.next()).OLrzqt() == ConfirmOrderTag.TRIGGER_PRICE) {
                            break;
                        }
                    }
                }
            }
            if (value.AkhnZx() == TradeMode.SwapLimit) {
                return true;
            }
        }
        return false;
    }

    private final String isConnected() {
        C30457lbX value;
        StateFlow<C30457lbX> stateFlow = this.AhwBna;
        if (stateFlow != null && (value = stateFlow.getValue()) != null) {
            if (ActionBar.EZpvd[value.AkhnZx().ordinal()] == 2) {
                return value.isConnected() == TransactionType.Buy ? "buy" : "sell";
            }
        }
        return "";
    }

    public static /* synthetic */ Map getEventParams$default(TradeConfirmOrderSheet tradeConfirmOrderSheet, InterfaceC30619lea interfaceC30619lea, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC30619lea = null;
        }
        return tradeConfirmOrderSheet.EZpvd(interfaceC30619lea);
    }

    public final Map<String, String> EZpvd(InterfaceC30619lea interfaceC30619lea) {
        C30457lbX value;
        StateFlow<C30457lbX> stateFlow = this.AhwBna;
        List<AdvancedAutoSellStrategy> listCopydefault = (stateFlow == null || (value = stateFlow.getValue()) == null) ? null : value.copydefault();
        Map mapOLrzqt = C56423yEv.OLrzqt();
        mapOLrzqt.put("is_tpsl", (listCopydefault == null || listCopydefault.isEmpty()) ? "no" : "yes");
        if (interfaceC30619lea != null) {
            mapOLrzqt.put(EopTrackEvent.KEY_BUTTON_NAME, interfaceC30619lea.getValue());
        }
        if (listCopydefault != null && !listCopydefault.isEmpty()) {
            mapOLrzqt.put("tp", C30501lcO.copydefault(listCopydefault));
            mapOLrzqt.put("sl", C30501lcO.AEQbTJ(listCopydefault));
        }
        return C56423yEv.AYXKKw(mapOLrzqt);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.fetchVPNInfo = null;
        this.AhwBna = null;
        Function1<? super String, Unit> function1 = this.valueOf;
        if (function1 != null) {
            if (function1 != null) {
                function1.invoke("");
            }
            this.valueOf = null;
        }
        super.onDestroyView();
    }
}
