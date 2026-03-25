package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.account.api.model.wallet.UnbindWalletResult;
import com.okinc.account.api.model.wallet.WalletAccount;
import com.okinc.business.defi.wallet.mine.data.BoundWallet;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBoundManageFragment$initAdapter$1$2$2$2;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBoundManageFragment$observeUIState$1;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBoundManageFragment$observeUIState$2;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBoundManageFragment$observeUIState$3;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBoundManageFragment$observeUIState$4;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBoundManageFragment$observeUIState$5;
import com.okinc.business.defi.wallet.mine.walletbind.viewmodel.WalletBindViewModel;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19365fzs extends AbstractC19313fyt implements InterfaceC33040mou {
    public C16625enU djBIcL;
    public final ActivityResultLauncher<WalletAccount> gEmmrt;
    public Application values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.invokespecialdPnHjp;
    }

    public C19365fzs() {
        InterfaceC8107awW interfaceC8107awW = (InterfaceC8107awW) C43251rlk.OLrzqt(InterfaceC8107awW.class);
        this.gEmmrt = interfaceC8107awW != null ? registerForActivityResult(interfaceC8107awW.AEQbTJ(), new ActivityResultCallback() { // from class: o.fzt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C19365fzs.EZpvd(this.copydefault, (UnbindWalletResult) obj);
            }
        }) : null;
    }

    public static final void EZpvd(C19365fzs c19365fzs, UnbindWalletResult unbindWalletResult) {
        if (unbindWalletResult instanceof UnbindWalletResult.Success) {
            c19365fzs.values().getFieldNames();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C16625enU c16625enUAEQbTJ = C16625enU.AEQbTJ(view);
        this.djBIcL = c16625enUAEQbTJ;
        if (c16625enUAEQbTJ != null) {
            copydefault(c16625enUAEQbTJ);
        }
        fARcdN();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        values().OLrzqt(true);
        values().uzCIH();
    }

    public final void copydefault(C16625enU c16625enU) {
        android.widget.TextView textView;
        c16625enU.OLrzqt.setLayoutManager(new SafeLinearLayoutManager(getContext()));
        java.lang.String upToMax$default = pTB.formatUpToMax$default(pTB.OLrzqt(java.lang.Integer.valueOf(values().fJNWhG())), 0, null, 3, null);
        C16625enU c16625enU2 = this.djBIcL;
        if (c16625enU2 != null && (textView = c16625enU2.copydefault) != null) {
            textView.setText(C33069mpW.copydefault(this, C13754dXa.FragmentManager.fJNWhG, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", upToMax$default))));
        }
        C52794wYp c52794wYp = c16625enU.EZpvd;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.fzs$TaskDescription */
    public static final class TaskDescription implements Function1<EventParamsList, Unit> {
        public static final TaskDescription EZpvd = new TaskDescription();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "link_wallet", true);
        }
    }

    @Override // o.AbstractC19318fyy
    public void fARcdN() {
        super.fARcdN();
        copydefault(new WalletBoundManageFragment$observeUIState$1(this, null));
        copydefault(new WalletBoundManageFragment$observeUIState$2(this, null));
        copydefault(new WalletBoundManageFragment$observeUIState$3(this, null));
        copydefault(new WalletBoundManageFragment$observeUIState$4(this, null));
        copydefault(new WalletBoundManageFragment$observeUIState$5(this, null));
    }

    public final void AEQbTJ(java.util.List<? extends fDL<java.lang.Object>> list) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        KWHzl();
        Application application = this.values;
        if (application != null) {
            application.EZpvd(list);
        }
        for (fDL<java.lang.Object> fdl : list) {
            boolean z = fdl instanceof C19323fzC;
            if (z && ((C19323fzC) fdl).EZpvd()) {
                Application application2 = this.values;
                if (application2 != null) {
                    application2.KWHzl(fdl);
                }
            } else if (z) {
                ((C19323fzC) fdl).OLrzqt(false);
            }
        }
        C16625enU c16625enU = this.djBIcL;
        if (((c16625enU == null || (recyclerView2 = c16625enU.OLrzqt) == null) ? null : recyclerView2.getAdapter()) != null) {
            Application application3 = this.values;
            if (application3 != null) {
                application3.notifyDataSetChanged();
                return;
            }
            return;
        }
        C16625enU c16625enU2 = this.djBIcL;
        if (c16625enU2 == null || (recyclerView = c16625enU2.OLrzqt) == null) {
            return;
        }
        recyclerView.setAdapter(this.values);
    }

    private final void KWHzl() {
        if (this.values == null) {
            final Application application = new Application();
            application.AEQbTJ(C19323fzC.class, (fDP) new fAA(new Function2() { // from class: o.fzp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C19365fzs.OLrzqt(application, (C19323fzC) obj, ((java.lang.Integer) obj2).intValue());
                }
            }));
            application.AEQbTJ(BoundWallet.class, (fDP) new fAF(new Function1() { // from class: o.fzr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19365fzs.AEQbTJ(this.EZpvd, (BoundWallet) obj);
                }
            }));
            this.values = application;
        }
    }

    public static final Unit OLrzqt(Application application, C19323fzC c19323fzC, int i) {
        Intrinsics.checkNotNullParameter(c19323fzC, "");
        if (application.OLrzqt(c19323fzC)) {
            c19323fzC.OLrzqt(false);
            application.AEQbTJ(c19323fzC);
        } else {
            c19323fzC.OLrzqt(true);
            application.KWHzl(c19323fzC);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fzs$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C19365fzs KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C19365fzs c19365fzs) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c19365fzs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("LinkedAccount_Management_Button_Click", (TrackChannel[]) null, TaskDescription.EZpvd, 1, (java.lang.Object) null);
                this.KWHzl.values().getNewProxyInstance();
            }
        }
    }

    public static final Unit AEQbTJ(final C19365fzs c19365fzs, final BoundWallet boundWallet) {
        Intrinsics.checkNotNullParameter(boundWallet, "");
        C32866mlf.onEvent$default("LinkedAccount_Management_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fzy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19365fzs.isConnected((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C19324fzD c19324fzDCopydefault = C19324fzD.Companion.copydefault();
        androidx.fragment.app.FragmentManager childFragmentManager = c19365fzs.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c19324fzDCopydefault.KWHzl(childFragmentManager, new Function1() { // from class: o.fzz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19365fzs.OLrzqt(this.copydefault, boundWallet, (java.lang.Integer) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "operations", true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C19365fzs c19365fzs, final BoundWallet boundWallet, java.lang.Integer num) {
        if (num != null && num.intValue() == 1) {
            C32866mlf.onEvent$default("LinkedAccount_Operations_SelectBar_Click", (TrackChannel[]) null, new Function1() { // from class: o.fzv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19365fzs.KWHzl(boundWallet, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c19365fzs), null, null, new WalletBoundManageFragment$initAdapter$1$2$2$2(boundWallet, c19365fzs, null), 3, null);
        } else if (num != null && num.intValue() == 2) {
            C32866mlf.onEvent$default("LinkedAccount_Operations_SelectBar_Click", (TrackChannel[]) null, new Function1() { // from class: o.fzw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19365fzs.copydefault(boundWallet, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            if (C34703nhO.copydefault()) {
                WalletBindViewModel walletBindViewModelValues = c19365fzs.values();
                java.lang.String strKWHzl = boundWallet.KWHzl();
                java.lang.String strOLrzqt = boundWallet.OLrzqt();
                androidx.fragment.app.FragmentManager childFragmentManager = c19365fzs.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                walletBindViewModelValues.KWHzl(strKWHzl, strOLrzqt, childFragmentManager);
            } else {
                ActivityResultLauncher<WalletAccount> activityResultLauncher = c19365fzs.gEmmrt;
                if (activityResultLauncher != null) {
                    activityResultLauncher.launch(new WalletAccount(boundWallet.KWHzl(), boundWallet.copydefault(), boundWallet.OLrzqt(), null, null, null, null, null, false, false, null, 2040, null));
                }
            }
        } else {
            C32866mlf.onEvent$default("LinkedAccount_Operations_SelectBar_Click", (TrackChannel[]) null, new Function1() { // from class: o.fzu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19365fzs.AhwBna(boundWallet, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(BoundWallet boundWallet, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("select_account_id", boundWallet.KWHzl(), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "view_details", true);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(BoundWallet boundWallet, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("select_account_id", boundWallet.KWHzl(), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "unlink_from_account", true);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(BoundWallet boundWallet, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("select_account_id", boundWallet.KWHzl(), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "exit_bottomsheet", true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fzs$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application extends fDJ {
        public java.util.List<? extends fDL<java.lang.Object>> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull java.util.List<? extends fDL<java.lang.Object>> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
        }

        @Override // o.fDJ
        public int AEQbTJ() {
            java.util.List<? extends fDL<java.lang.Object>> list = this.AEQbTJ;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x000f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // o.fDJ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public fDL<java.lang.Object> AEQbTJ(int i) {
            if (i >= 0) {
                java.util.List<? extends fDL<java.lang.Object>> list = this.AEQbTJ;
                if (i >= (list != null ? list.size() : 0)) {
                }
            } else {
                try {
                    throw new java.lang.RuntimeException("getGroupItem with error index " + i);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
            java.util.List<? extends fDL<java.lang.Object>> list2 = this.AEQbTJ;
            fDL<java.lang.Object> fdl = list2 != null ? list2.get(i) : null;
            Intrinsics.copydefault(fdl);
            return fdl;
        }
    }

    @Override // o.InterfaceC33040mou
    public boolean AhwBna() {
        C32866mlf.onEvent$default("LinkedAccount_Management_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fzx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19365fzs.fJNWhG((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return false;
    }

    public static final Unit fJNWhG(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "back", true);
        return Unit.INSTANCE;
    }
}
