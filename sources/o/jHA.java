package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.data.model.alert.AlertDataUiItem;
import com.okinc.business.market.data.model.alert.AlertGroupUiItem;
import com.okinc.business.market.data.model.alert.AlertUiItem;
import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import com.okinc.business.market.features.alert.list.ui.Web3TokenAlertListFragment$setupViewsAndClicks$1$1;
import com.okinc.business.market.features.alert.list.ui.Web3TokenAlertListFragment$setupViewsAndClicks$1$2;
import com.okinc.business.market.features.alert.list.ui.Web3TokenAlertListFragment$setupViewsAndClicks$1$4;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C22366hdx;
import o.C23274hvD;
import o.C33625mzw;
import o.C52761wXj;
import o.InterfaceC25830jHy;
import o.jGI;
import o.jHA;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jHA extends androidx.fragment.app.Fragment {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public TokenInfoForAlert EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public C22324hdH copydefault;

    public jHA() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C25829jHx.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.alert.list.ui.Web3TokenAlertListFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.alert.list.ui.Web3TokenAlertListFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0() { // from class: o.jHG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jHA.djBIcL();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C25829jHx AEQbTJ() {
        return (C25829jHx) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory djBIcL() {
        return new C25808jHc();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C22324hdH c22324hdHAEQbTJ = C22324hdH.AEQbTJ(layoutInflater, viewGroup, false);
        this.copydefault = c22324hdHAEQbTJ;
        if (c22324hdHAEQbTJ != null) {
            return c22324hdHAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        this.EZpvd = arguments != null ? (TokenInfoForAlert) arguments.getParcelable("token_info_for_alert") : null;
        KWHzl();
        EZpvd();
        AYXKKw();
        C25829jHx c25829jHxAEQbTJ = AEQbTJ();
        TokenInfoForAlert tokenInfoForAlert = this.EZpvd;
        java.lang.String strValueOf = tokenInfoForAlert != null ? tokenInfoForAlert.valueOf() : null;
        if (strValueOf == null) {
            strValueOf = "";
        }
        TokenInfoForAlert tokenInfoForAlert2 = this.EZpvd;
        java.lang.String strCopydefault = tokenInfoForAlert2 != null ? tokenInfoForAlert2.copydefault() : null;
        c25829jHxAEQbTJ.AEQbTJ(strValueOf, strCopydefault != null ? strCopydefault : "");
    }

    private final void KWHzl() {
        C22324hdH c22324hdH = this.copydefault;
        if (c22324hdH != null) {
            c22324hdH.EZpvd.setAdapter(new C25811jHf(new Web3TokenAlertListFragment$setupViewsAndClicks$1$1(AEQbTJ()), new Web3TokenAlertListFragment$setupViewsAndClicks$1$2(AEQbTJ()), new Function1() { // from class: o.jHF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jHA.EZpvd(this.OLrzqt, (AlertDataUiItem) obj);
                }
            }, new Web3TokenAlertListFragment$setupViewsAndClicks$1$4(AEQbTJ()), new Function1() { // from class: o.jHC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jHA.OLrzqt(this.copydefault, (AlertDataUiItem) obj);
                }
            }));
            c22324hdH.EZpvd.setLayoutManager(new LinearLayoutManager(requireContext()));
            android.widget.TextView textView = c22324hdH.AhwBna;
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.QqiRNA);
            if (drawableKWHzl != null) {
                drawableKWHzl.setBounds(0, 0, C55298xhM.dp2px$default(22.0f, null, 1, null), C55298xhM.dp2px$default(22.0f, null, 1, null));
                drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            } else {
                drawableKWHzl = null;
            }
            textView.setCompoundDrawablesRelative(drawableKWHzl, null, null, null);
            android.widget.TextView textView2 = c22324hdH.AhwBna;
            textView2.setOnClickListener(new Fragment(textView2, 1000L, this));
            C52794wYp c52794wYp = c22324hdH.OLrzqt;
            c52794wYp.setOnClickListener(new FragmentManager(c52794wYp, 1000L, this));
            c22324hdH.KWHzl.setContentDescription("web3_dex_market_alert_add_button");
            C52794wYp c52794wYp2 = c22324hdH.KWHzl;
            c52794wYp2.setOnClickListener(new PendingIntent(c52794wYp2, 1000L, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(final jHA jha, AlertDataUiItem alertDataUiItem) {
        java.lang.Object next;
        java.lang.String str;
        Intrinsics.checkNotNullParameter(alertDataUiItem, "");
        if (jha.AEQbTJ().AEQbTJ().getValue() instanceof InterfaceC25830jHy.ActionBar) {
            InterfaceC25830jHy value = jha.AEQbTJ().AEQbTJ().getValue();
            Intrinsics.copydefault(value, "");
            java.util.List<AlertUiItem> listEZpvd = ((InterfaceC25830jHy.ActionBar) value).EZpvd();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listEZpvd) {
                if (obj instanceof AlertGroupUiItem) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (alertDataUiItem.OLrzqt((AlertGroupUiItem) next)) {
                    break;
                }
            }
            AlertGroupUiItem alertGroupUiItem = (AlertGroupUiItem) next;
            jGI.TaskDescription taskDescription = jGI.Companion;
            java.lang.String strKWHzl = alertDataUiItem.KWHzl();
            java.lang.String strAhwBna = alertDataUiItem.AhwBna();
            java.lang.String strGEmmrt = alertDataUiItem.gEmmrt();
            java.lang.String strValueOf = alertGroupUiItem != null ? alertGroupUiItem.valueOf() : null;
            java.lang.String str2 = strValueOf == null ? "" : strValueOf;
            java.lang.String strAEQbTJ = alertGroupUiItem != null ? alertGroupUiItem.AEQbTJ() : null;
            java.lang.String str3 = strAEQbTJ == null ? "" : strAEQbTJ;
            if (!alertDataUiItem.EZpvd(jha.EZpvd)) {
                str = "";
                jGI jgiEZpvd = taskDescription.EZpvd(new TokenInfoForAlert(strKWHzl, null, strGEmmrt, str2, str3, strAhwBna, str, null, alertDataUiItem.AEQbTJ(), true, 130, null), alertDataUiItem.AEQbTJ((1023 & 1) != 0 ? alertDataUiItem.AEQbTJ : null, (1023 & 2) != 0 ? alertDataUiItem.copydefault : null, (1023 & 4) != 0 ? alertDataUiItem.gEmmrt : null, (1023 & 8) != 0 ? alertDataUiItem.AkhnZx : null, (1023 & 16) != 0 ? alertDataUiItem.OLrzqt : null, (1023 & 32) != 0 ? alertDataUiItem.valueOf : null, (1023 & 64) != 0 ? alertDataUiItem.AhwBna : null, (1023 & 128) != 0 ? alertDataUiItem.djBIcL : jHS.EZpvd.copydefault(alertDataUiItem.djBIcL()), (1023 & 256) != 0 ? alertDataUiItem.EZpvd : false, (1023 & 512) != 0 ? alertDataUiItem.KWHzl : false, (1023 & 1024) != 0 ? alertDataUiItem.AYXKKw : false));
                jgiEZpvd.EZpvd(new Function1() { // from class: o.jHB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return jHA.EZpvd(this.OLrzqt, (AlertUiItem) obj2);
                    }
                });
                androidx.fragment.app.FragmentManager childFragmentManager = jha.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                jgiEZpvd.show(childFragmentManager);
            } else {
                TokenInfoForAlert tokenInfoForAlert = jha.EZpvd;
                java.lang.String strAhwBna2 = tokenInfoForAlert != null ? tokenInfoForAlert.AhwBna() : null;
                if (strAhwBna2 != null) {
                    str = strAhwBna2;
                }
                jGI jgiEZpvd2 = taskDescription.EZpvd(new TokenInfoForAlert(strKWHzl, null, strGEmmrt, str2, str3, strAhwBna, str, null, alertDataUiItem.AEQbTJ(), true, 130, null), alertDataUiItem.AEQbTJ((1023 & 1) != 0 ? alertDataUiItem.AEQbTJ : null, (1023 & 2) != 0 ? alertDataUiItem.copydefault : null, (1023 & 4) != 0 ? alertDataUiItem.gEmmrt : null, (1023 & 8) != 0 ? alertDataUiItem.AkhnZx : null, (1023 & 16) != 0 ? alertDataUiItem.OLrzqt : null, (1023 & 32) != 0 ? alertDataUiItem.valueOf : null, (1023 & 64) != 0 ? alertDataUiItem.AhwBna : null, (1023 & 128) != 0 ? alertDataUiItem.djBIcL : jHS.EZpvd.copydefault(alertDataUiItem.djBIcL()), (1023 & 256) != 0 ? alertDataUiItem.EZpvd : false, (1023 & 512) != 0 ? alertDataUiItem.KWHzl : false, (1023 & 1024) != 0 ? alertDataUiItem.AYXKKw : false));
                jgiEZpvd2.EZpvd(new Function1() { // from class: o.jHB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return jHA.EZpvd(this.OLrzqt, (AlertUiItem) obj2);
                    }
                });
                androidx.fragment.app.FragmentManager childFragmentManager2 = jha.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                jgiEZpvd2.show(childFragmentManager2);
            }
        } else {
            C43296rmc.KWHzl("Web3AlertListFragment", "Alerts not loaded yet.");
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(jHA jha, AlertUiItem alertUiItem) {
        Intrinsics.checkNotNullParameter(alertUiItem, "");
        if (alertUiItem instanceof AlertGroupUiItem) {
            C55326xho.toastWithSuccessfulIcon$default(C23274hvD.Fragment.FdcJU, 0, 1, (java.lang.Object) null);
            jha.AEQbTJ().KWHzl((AlertGroupUiItem) alertUiItem);
        } else if (alertUiItem instanceof AlertDataUiItem) {
            jha.AEQbTJ().AEQbTJ((AlertDataUiItem) alertUiItem);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(jHA jha, AlertDataUiItem alertDataUiItem) {
        Intrinsics.checkNotNullParameter(alertDataUiItem, "");
        jha.AEQbTJ().copydefault(C56402yEa.EZpvd(alertDataUiItem));
        return Unit.INSTANCE;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;
        public final /* synthetic */ kotlin.Pair<java.util.List<AlertDataUiItem>, java.lang.Boolean> OLrzqt;
        public final /* synthetic */ jHA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.Pair<? extends java.util.List<com.okinc.business.market.data.model.alert.AlertDataUiItem>, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, jHA jha, kotlin.Pair<? extends java.util.List<AlertDataUiItem>, java.lang.Boolean> pair) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
            this.copydefault = jha;
            this.OLrzqt = pair;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
            this.copydefault.AEQbTJ().copydefault(this.OLrzqt.getFirst());
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            TokenInfoForAlert tokenInfoForAlert = jHA.this.EZpvd;
            java.lang.String strValueOf = tokenInfoForAlert != null ? tokenInfoForAlert.valueOf() : null;
            EventParamsList.put$default(eventParamsList, "token_address", strValueOf == null ? "" : strValueOf, false, 4, null);
            TokenInfoForAlert tokenInfoForAlert2 = jHA.this.EZpvd;
            java.lang.String strDjBIcL = tokenInfoForAlert2 != null ? tokenInfoForAlert2.djBIcL() : null;
            EventParamsList.put$default(eventParamsList, "token_symbol", strDjBIcL == null ? "" : strDjBIcL, false, 4, null);
            EventParamsList.put$default(eventParamsList, "page", "detail", false, 4, null);
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ jHA EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, jHA jha) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = jha;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ(!r7.AEQbTJ);
                this.EZpvd.AEQbTJ().KWHzl(this.EZpvd.AEQbTJ);
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ jHA AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, jHA jha) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = jha;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String strCopydefault;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                kotlin.Pair<java.util.List<AlertDataUiItem>, java.lang.Boolean> pairCopydefault = this.AEQbTJ.AEQbTJ().copydefault();
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C22366hdx.StateListAnimator.fetchVPNInfo);
                if (pairCopydefault.getSecond().booleanValue()) {
                    strCopydefault = C33070mpX.AYXKKw(C22366hdx.StateListAnimator.DbNXlk);
                } else {
                    strCopydefault = C33069mpW.copydefault(C22366hdx.StateListAnimator.isConnected, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(pairCopydefault.getFirst().size()))));
                }
                viewOnClickListenerC54939xaY.EZpvd(strCopydefault);
                viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.MediaControllerCompatApi21CallbackProxy, new Activity(viewOnClickListenerC54939xaY, this.AEQbTJ, pairCopydefault));
                viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.ORxRYg, new ActionBar(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ jHA AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, jHA jha) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = jha;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("DEXMarket_Token_AlertAddButton_Click", (TrackChannel[]) null, this.AEQbTJ.new StateListAnimator(), 1, (java.lang.Object) null);
                jGI.TaskDescription taskDescription = jGI.Companion;
                TokenInfoForAlert tokenInfoForAlert = this.AEQbTJ.EZpvd;
                Intrinsics.copydefault(tokenInfoForAlert);
                jGI jgiNewInstance$default = jGI.TaskDescription.newInstance$default(taskDescription, tokenInfoForAlert, null, 2, null);
                jgiNewInstance$default.EZpvd(this.AEQbTJ.new Dialog());
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                jgiNewInstance$default.show(childFragmentManager);
            }
        }
    }

    public static final class Dialog implements Function1<AlertUiItem, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AlertUiItem alertUiItem) {
            EZpvd(alertUiItem);
            return Unit.INSTANCE;
        }

        public final void EZpvd(AlertUiItem alertUiItem) {
            Intrinsics.checkNotNullParameter(alertUiItem, "");
            if (alertUiItem instanceof AlertGroupUiItem) {
                jHA.this.AEQbTJ().KWHzl((AlertGroupUiItem) alertUiItem);
                C55326xho.toastWithSuccessfulIcon$default(C23274hvD.Fragment.WFXFk, 0, 1, (java.lang.Object) null);
            }
        }
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(final InterfaceC25830jHy interfaceC25830jHy, Continuation<? super Unit> continuation) {
            final C22324hdH c22324hdH = jHA.this.copydefault;
            if (c22324hdH != null) {
                final jHA jha = jHA.this;
                OKReminder oKReminder = c22324hdH.copydefault;
                Intrinsics.checkNotNullExpressionValue(oKReminder, "");
                oKReminder.setVisibility(8);
                android.widget.LinearLayout linearLayout = c22324hdH.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                if (interfaceC25830jHy instanceof InterfaceC25830jHy.StateListAnimator) {
                    jHA.updateViewsVisibility$default(jha, true, false, false, false, false, false, false, WebSocketProtocol.PAYLOAD_SHORT, null);
                } else if (interfaceC25830jHy instanceof InterfaceC25830jHy.ActionBar) {
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jha, true, (java.lang.String) null, 2, (java.lang.Object) null);
                    FragmentActivity activity = jha.getActivity();
                    Intrinsics.copydefault(activity, "");
                    ((AbstractActivityC33041mov) activity).dismissLoading();
                    InterfaceC25830jHy.ActionBar actionBar = (InterfaceC25830jHy.ActionBar) interfaceC25830jHy;
                    jHA.updateViewsVisibility$default(jha, false, true, false, true, actionBar.AEQbTJ(), actionBar.AEQbTJ(), !actionBar.AEQbTJ(), 5, null);
                    AlertUiItem alertUiItem = actionBar.EZpvd().get(0);
                    Intrinsics.copydefault(alertUiItem, "");
                    java.util.List<AlertDataUiItem> listEZpvd = ((AlertGroupUiItem) alertUiItem).EZpvd();
                    RecyclerView.Adapter adapter = c22324hdH.EZpvd.getAdapter();
                    Intrinsics.copydefault(adapter, "");
                    ((C25811jHf) adapter).submitList(listEZpvd, new java.lang.Runnable() { // from class: o.jHD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            jHA.Application.EZpvd(interfaceC25830jHy, c22324hdH);
                        }
                    });
                    java.util.List<AlertUiItem> listEZpvd2 = actionBar.EZpvd();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (T t : listEZpvd2) {
                        if (t instanceof AlertGroupUiItem) {
                            arrayList.add(t);
                        }
                    }
                    java.util.Iterator<T> it = arrayList.iterator();
                    int size = 0;
                    while (it.hasNext()) {
                        size += ((AlertGroupUiItem) it.next()).EZpvd().size();
                    }
                    c22324hdH.KWHzl.setEnabled(size < 50 && jha.EZpvd != null);
                    if (actionBar.AEQbTJ()) {
                        jha.gEmmrt();
                    } else {
                        jha.copydefault();
                        if (size >= 50) {
                            android.widget.LinearLayout linearLayout2 = c22324hdH.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                            linearLayout2.setVisibility(0);
                        }
                    }
                    if ((actionBar instanceof InterfaceC25830jHy.ActionBar.Dialog) || (actionBar instanceof InterfaceC25830jHy.ActionBar.Fragment)) {
                        FragmentActivity activity2 = jha.getActivity();
                        Intrinsics.copydefault(activity2, "");
                        ((AbstractActivityC33041mov) activity2).showLoading();
                    } else if (actionBar instanceof InterfaceC25830jHy.ActionBar.TaskDescription) {
                        C55326xho.toastWithSuccessfulIcon$default(C22366hdx.StateListAnimator.AubY, 0, 1, (java.lang.Object) null);
                    } else if (actionBar instanceof InterfaceC25830jHy.ActionBar.Application) {
                        C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.shErWi, 0, 1, (java.lang.Object) null);
                    } else if (actionBar instanceof InterfaceC25830jHy.ActionBar.StateListAnimator) {
                        C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.RbMRq, 0, 1, (java.lang.Object) null);
                    }
                } else if (interfaceC25830jHy instanceof InterfaceC25830jHy.Application) {
                    FragmentActivity activity3 = jha.getActivity();
                    Intrinsics.copydefault(activity3, "");
                    ((AbstractActivityC33041mov) activity3).dismissLoading();
                    InterfaceC25830jHy.Application application = (InterfaceC25830jHy.Application) interfaceC25830jHy;
                    if (application.copydefault()) {
                        RecyclerView.Adapter adapter2 = c22324hdH.EZpvd.getAdapter();
                        Intrinsics.copydefault(adapter2, "");
                        ((C25811jHf) adapter2).submitList(yDY.AhwBna());
                        C55326xho.toastWithSuccessfulIcon$default(C22366hdx.StateListAnimator.AubY, 0, 1, (java.lang.Object) null);
                    }
                    if (application.OLrzqt()) {
                        jGI.TaskDescription taskDescription = jGI.Companion;
                        TokenInfoForAlert tokenInfoForAlert = jha.EZpvd;
                        Intrinsics.copydefault(tokenInfoForAlert);
                        jGI jgiNewInstance$default = jGI.TaskDescription.newInstance$default(taskDescription, tokenInfoForAlert, null, 2, null);
                        jgiNewInstance$default.EZpvd(new Function1() { // from class: o.jHI
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return jHA.Application.AEQbTJ(jha, (AlertUiItem) obj);
                            }
                        });
                        androidx.fragment.app.FragmentManager childFragmentManager = jha.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        jgiNewInstance$default.show(childFragmentManager);
                    }
                    c22324hdH.KWHzl.setEnabled(jha.EZpvd != null);
                    jHA.updateViewsVisibility$default(jha, false, false, true, true, false, false, true, 51, null);
                    c22324hdH.AYXKKw.setTitle("");
                    c22324hdH.AYXKKw.setRetry("");
                    c22324hdH.AYXKKw.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C22366hdx.StateListAnimator.zuBGHE));
                    c22324hdH.AYXKKw.setEmptyTypeImage(6);
                } else {
                    if (!(interfaceC25830jHy instanceof InterfaceC25830jHy.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jHA.updateViewsVisibility$default(jha, false, false, true, false, false, false, false, 123, null);
                    c22324hdH.AYXKKw.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.zSsVtY));
                    c22324hdH.AYXKKw.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq));
                    c22324hdH.AYXKKw.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.hkDICb));
                    c22324hdH.AYXKKw.setRetryClickListener(new View.OnClickListener() { // from class: o.jHK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            jHA.Application.EZpvd(jha, view);
                        }
                    });
                    c22324hdH.AYXKKw.setEmptyTypeImage(8);
                }
                jha.AEQbTJ().OLrzqt();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void EZpvd(InterfaceC25830jHy interfaceC25830jHy, C22324hdH c22324hdH) {
            if (interfaceC25830jHy instanceof InterfaceC25830jHy.ActionBar.Activity) {
                c22324hdH.EZpvd.scrollToPosition(0);
            }
        }

        public static final Unit AEQbTJ(jHA jha, AlertUiItem alertUiItem) {
            Intrinsics.checkNotNullParameter(alertUiItem, "");
            if (alertUiItem instanceof AlertGroupUiItem) {
                jha.AEQbTJ().KWHzl((AlertGroupUiItem) alertUiItem);
                C55326xho.toastWithSuccessfulIcon$default(C23274hvD.Fragment.WFXFk, 0, 1, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }

        public static final void EZpvd(jHA jha, android.view.View view) {
            C25829jHx c25829jHxAEQbTJ = jha.AEQbTJ();
            TokenInfoForAlert tokenInfoForAlert = jha.EZpvd;
            java.lang.String strValueOf = tokenInfoForAlert != null ? tokenInfoForAlert.valueOf() : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            TokenInfoForAlert tokenInfoForAlert2 = jha.EZpvd;
            java.lang.String strCopydefault = tokenInfoForAlert2 != null ? tokenInfoForAlert2.copydefault() : null;
            c25829jHxAEQbTJ.AEQbTJ(strValueOf, strCopydefault != null ? strCopydefault : "");
        }
    }

    private final void EZpvd() {
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().AEQbTJ(), null, new Application(), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        InterfaceC25830jHy value = AEQbTJ().AEQbTJ().getValue();
        if (!(value instanceof InterfaceC25830jHy.ActionBar) || ((InterfaceC25830jHy.ActionBar) value).AEQbTJ()) {
            return;
        }
        copydefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(boolean z) {
        android.widget.TextView textView;
        this.AEQbTJ = z;
        C22324hdH c22324hdH = this.copydefault;
        if (c22324hdH == null || (textView = c22324hdH.AhwBna) == null) {
            return;
        }
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(z ? C52761wXj.TaskDescription.gqESXP : C52761wXj.TaskDescription.QqiRNA);
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(0, 0, C55298xhM.dp2px$default(22.0f, null, 1, null), C55298xhM.dp2px$default(22.0f, null, 1, null));
            drawableKWHzl.setTint(C25382ivf.KWHzl(z ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.QwvEab));
        } else {
            drawableKWHzl = null;
        }
        textView.setCompoundDrawablesRelative(drawableKWHzl, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gEmmrt() {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C52794wYp c52794wYp3;
        kotlin.Pair<java.util.List<AlertDataUiItem>, java.lang.Boolean> pairCopydefault = AEQbTJ().copydefault();
        int size = pairCopydefault.getFirst().size();
        AEQbTJ(size > 0 && pairCopydefault.getSecond().booleanValue());
        C22324hdH c22324hdH = this.copydefault;
        if (c22324hdH != null && (c52794wYp3 = c22324hdH.OLrzqt) != null) {
            c52794wYp3.setEnabled(size > 0);
        }
        if (size == 0) {
            C22324hdH c22324hdH2 = this.copydefault;
            if (c22324hdH2 == null || (c52794wYp2 = c22324hdH2.OLrzqt) == null) {
                return;
            }
            c52794wYp2.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatApi21CallbackProxy));
            return;
        }
        C22324hdH c22324hdH3 = this.copydefault;
        if (c22324hdH3 == null || (c52794wYp = c22324hdH3.OLrzqt) == null) {
            return;
        }
        c52794wYp.setText(C33069mpW.copydefault(this, C22366hdx.StateListAnimator.gHZMYf, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(size)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        C33625mzw.OLrzqt().AEQbTJ(requireContext(), new C33625mzw.StateListAnimator() { // from class: o.jHz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C33625mzw.StateListAnimator
            public final void KWHzl(boolean z) {
                jHA.KWHzl(this.KWHzl, z);
            }
        });
    }

    public static final void KWHzl(final jHA jha, boolean z) {
        OKReminder oKReminder;
        if (z) {
            C22324hdH c22324hdH = jha.copydefault;
            if (c22324hdH == null || (oKReminder = c22324hdH.copydefault) == null) {
                return;
            }
            oKReminder.setVisibility(8);
            return;
        }
        C22324hdH c22324hdH2 = jha.copydefault;
        if (c22324hdH2 != null) {
            OKReminder oKReminder2 = c22324hdH2.copydefault;
            Intrinsics.checkNotNullExpressionValue(oKReminder2, "");
            oKReminder2.setVisibility(0);
            c22324hdH2.copydefault.setMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.UnZVfqExternalSyntheticApiModelOutline0));
            c22324hdH2.copydefault.setLeadingIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.RZOtbZ));
            c22324hdH2.copydefault.setStyle(0);
            c22324hdH2.copydefault.setCloseIconVisibility(false);
            c22324hdH2.copydefault.setPrimaryAction(C33070mpX.AYXKKw(C23274hvD.Fragment.m), new Function0() { // from class: o.jHE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jHA.gEmmrt(this.AEQbTJ);
                }
            });
        }
    }

    public static final Unit gEmmrt(jHA jha) {
        C33625mzw.OLrzqt().EZpvd(jha.requireActivity());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void updateViewsVisibility$default(jHA jha, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z4 = false;
        }
        if ((i & 16) != 0) {
            z5 = false;
        }
        if ((i & 32) != 0) {
            z6 = false;
        }
        if ((i & 64) != 0) {
            z7 = false;
        }
        jha.OLrzqt(z, z2, z3, z4, z5, z6, z7);
    }

    private final void OLrzqt(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C22324hdH c22324hdH = this.copydefault;
        if (c22324hdH != null) {
            C55113xdn c55113xdn = c22324hdH.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(z ? 0 : 8);
            if (z) {
                C55113xdn.showLoading$default(c22324hdH.gEmmrt, 0L, 1, null);
            } else {
                c22324hdH.gEmmrt.copydefault();
            }
            RecyclerView recyclerView = c22324hdH.EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(z2 ? 0 : 8);
            C55173xeu c55173xeu = c22324hdH.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(z3 ? 0 : 8);
            android.view.View view = c22324hdH.valueOf;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(z4 ? 0 : 8);
            android.widget.TextView textView = c22324hdH.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(z5 ? 0 : 8);
            C52794wYp c52794wYp = c22324hdH.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(z6 ? 0 : 8);
            C52794wYp c52794wYp2 = c22324hdH.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(z7 ? 0 : 8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.copydefault = null;
    }

    private final void AYXKKw() {
        C32866mlf.onEvent$default("DEXMarket_Token_Alert_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jHA.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final jHA AEQbTJ(TokenInfoForAlert tokenInfoForAlert) {
            jHA jha = new jHA();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("token_info_for_alert", tokenInfoForAlert);
            jha.setArguments(bundle);
            return jha;
        }
    }
}
