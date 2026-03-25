package com.okinc.business.dexui.main.dappredirect;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.SwapBridgeDAppInfo;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.main.market.bean.DAppInfo;
import com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment;
import com.okinc.business.dexui.main.dappredirect.DexDappRedirectTxDetailsFragment;
import com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC21695hIx;
import o.AbstractC22406hek;
import o.C21697hIz;
import o.C22380heK;
import o.C23274hvD;
import o.C23534hzz;
import o.C25390ivn;
import o.C25448iws;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C52794wYp;
import o.C55173xeu;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56524yIo;
import o.InterfaceC23194htd;
import o.InterfaceC54828xWv;
import o.InterfaceC56387yDm;
import o.InterfaceC9738bbJ;
import o.ViewOnClickListenerC54939xaY;
import o.hHS;
import o.hHT;
import o.hHV;
import o.rVN;
import o.wXQ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexDappRedirectListFragment extends AbstractC21695hIx {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public C21697hIz AEQbTJ;
    public int AYXKKw;
    public hHS AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public Function0<Unit> EZpvd;
    public List<DAppInfo> KWHzl;
    public DAppRedirectFrom OLrzqt;
    public C21697hIz fetchVPNInfo;
    public Function0<Unit> gEmmrt;

    @yCM
    public C25448iws handleEventTrackUtils;
    public int isConnected;
    public C23534hzz values;
    public String djBIcL = "";
    public String valueOf = "";

    public DexDappRedirectListFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexDappRedirectViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment$special$$inlined$viewModels$default$5
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
    }

    public final DexDappRedirectViewModel OLrzqt() {
        return (DexDappRedirectViewModel) this.AkhnZx.getValue();
    }

    /* JADX DEBUG: Possible override for method o.hIx.KWHzl()V */
    public final C25448iws KWHzl() {
        C25448iws c25448iws = this.handleEventTrackUtils;
        if (c25448iws != null) {
            return c25448iws;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DexDappRedirectListFragment newInstance$default(Activity activity, List list, C21697hIz c21697hIz, C21697hIz c21697hIz2, DAppRedirectFrom dAppRedirectFrom, hHS hhs, Function0 function0, Function0 function02, String str, String str2, int i, int i2, int i3, Object obj) {
            return activity.KWHzl(list, c21697hIz, c21697hIz2, dAppRedirectFrom, (i3 & 16) != 0 ? null : hhs, (i3 & 32) != 0 ? null : function0, (i3 & 64) != 0 ? null : function02, str, (i3 & 256) != 0 ? "" : str2, (i3 & 512) != 0 ? 0 : i, (i3 & 1024) != 0 ? 0 : i2);
        }

        public final DexDappRedirectListFragment KWHzl(List<DAppInfo> list, C21697hIz c21697hIz, C21697hIz c21697hIz2, @NotNull DAppRedirectFrom dAppRedirectFrom, hHS hhs, Function0<Unit> function0, Function0<Unit> function02, @NotNull String str, @NotNull String str2, int i, int i2) {
            Intrinsics.checkNotNullParameter(dAppRedirectFrom, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            DexDappRedirectListFragment dexDappRedirectListFragment = new DexDappRedirectListFragment();
            dexDappRedirectListFragment.KWHzl = list;
            dexDappRedirectListFragment.AEQbTJ = c21697hIz;
            dexDappRedirectListFragment.fetchVPNInfo = c21697hIz2;
            dexDappRedirectListFragment.OLrzqt = dAppRedirectFrom;
            dexDappRedirectListFragment.AhwBna = hhs;
            dexDappRedirectListFragment.gEmmrt = function0;
            dexDappRedirectListFragment.EZpvd = function02;
            dexDappRedirectListFragment.djBIcL = str;
            dexDappRedirectListFragment.valueOf = str2;
            dexDappRedirectListFragment.AYXKKw = i;
            dexDappRedirectListFragment.isConnected = i2;
            return dexDappRedirectListFragment;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(2);
        wxq.KWHzl().setVisibility(8);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaMetadataCompat));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C55173xeu c55173xeu;
        C52794wYp c52794wYpAEQbTJ;
        C55173xeu c55173xeu2;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23534hzz c23534hzzKWHzl = C23534hzz.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        this.values = c23534hzzKWHzl;
        if (this.OLrzqt == DAppRedirectFrom.MARKET) {
            List<DAppInfo> list = this.KWHzl;
            if (list != null) {
                if (c23534hzzKWHzl != null && (recyclerView = c23534hzzKWHzl.EZpvd) != null) {
                    recyclerView.setVisibility(0);
                }
                copydefault(list);
                constraintLayout.post(new Runnable() { // from class: o.hHU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        DexDappRedirectListFragment.djBIcL(this.OLrzqt);
                    }
                });
            } else {
                if (c23534hzzKWHzl != null && (c55173xeu2 = c23534hzzKWHzl.OLrzqt) != null) {
                    c55173xeu2.setVisibility(0);
                }
                C23534hzz c23534hzz = this.values;
                if (c23534hzz != null && (c55173xeu = c23534hzz.OLrzqt) != null && (c52794wYpAEQbTJ = c55173xeu.AEQbTJ()) != null) {
                    c52794wYpAEQbTJ.setVisibility(8);
                }
                constraintLayout.post(new Runnable() { // from class: o.hHZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        DexDappRedirectListFragment.gEmmrt(this.KWHzl);
                    }
                });
            }
        } else {
            AhwBna();
            if (this.AhwBna == null) {
                OLrzqt(this.OLrzqt == DAppRedirectFrom.SWAP);
            } else {
                DexDappRedirectViewModel dexDappRedirectViewModelOLrzqt = OLrzqt();
                hHS hhs = this.AhwBna;
                Intrinsics.copydefault(hhs);
                dexDappRedirectViewModelOLrzqt.EZpvd(hhs);
            }
        }
        OLrzqt(AYXKKw());
    }

    public static final void djBIcL(DexDappRedirectListFragment dexDappRedirectListFragment) {
        rVN.reportFullyDrawn$default((Fragment) dexDappRedirectListFragment, true, (String) null, 2, (Object) null);
    }

    public static final void gEmmrt(DexDappRedirectListFragment dexDappRedirectListFragment) {
        rVN.reportFullyDrawn$default((Fragment) dexDappRedirectListFragment, false, (String) null, 2, (Object) null);
    }

    public final void AhwBna() {
        C25390ivn.collectOnLifecycle$default(this, OLrzqt().AEQbTJ(), null, new Application(), 2, null);
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(hHS hhs, Continuation<? super Unit> continuation) {
            C55173xeu c55173xeu;
            C55173xeu c55173xeu2;
            RecyclerView recyclerView;
            LinearLayout linearLayout;
            C55173xeu c55173xeu3;
            RecyclerView recyclerView2;
            LinearLayout linearLayout2;
            C55173xeu c55173xeu4;
            RecyclerView recyclerView3;
            LinearLayout linearLayout3;
            if (Intrinsics.EZpvd(hhs, hHS.Application.EZpvd)) {
                C23534hzz c23534hzz = DexDappRedirectListFragment.this.values;
                if (c23534hzz != null && (linearLayout3 = c23534hzz.AEQbTJ) != null) {
                    linearLayout3.setVisibility(0);
                }
                C23534hzz c23534hzz2 = DexDappRedirectListFragment.this.values;
                if (c23534hzz2 != null && (recyclerView3 = c23534hzz2.EZpvd) != null) {
                    recyclerView3.setVisibility(8);
                }
                C23534hzz c23534hzz3 = DexDappRedirectListFragment.this.values;
                if (c23534hzz3 != null && (c55173xeu4 = c23534hzz3.OLrzqt) != null) {
                    c55173xeu4.setVisibility(8);
                }
            } else if (hhs instanceof hHS.Activity) {
                C23534hzz c23534hzz4 = DexDappRedirectListFragment.this.values;
                if (c23534hzz4 != null && (linearLayout2 = c23534hzz4.AEQbTJ) != null) {
                    linearLayout2.setVisibility(8);
                }
                C23534hzz c23534hzz5 = DexDappRedirectListFragment.this.values;
                if (c23534hzz5 != null && (recyclerView2 = c23534hzz5.EZpvd) != null) {
                    recyclerView2.setVisibility(0);
                }
                C23534hzz c23534hzz6 = DexDappRedirectListFragment.this.values;
                if (c23534hzz6 != null && (c55173xeu3 = c23534hzz6.OLrzqt) != null) {
                    c55173xeu3.setVisibility(8);
                }
                DexDappRedirectListFragment dexDappRedirectListFragment = DexDappRedirectListFragment.this;
                List<SwapBridgeDAppInfo> listCopydefault = ((hHS.Activity) hhs).copydefault();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                for (SwapBridgeDAppInfo swapBridgeDAppInfo : listCopydefault) {
                    arrayList.add(new DAppInfo(swapBridgeDAppInfo.getName(), swapBridgeDAppInfo.getLogo(), swapBridgeDAppInfo.getUrl(), swapBridgeDAppInfo.getId(), (String) null, 16, (DefaultConstructorMarker) null));
                }
                dexDappRedirectListFragment.copydefault(arrayList);
                rVN.reportFullyDrawn$default((Fragment) DexDappRedirectListFragment.this, true, (String) null, 2, (Object) null);
            } else if (Intrinsics.EZpvd(hhs, hHS.TaskDescription.OLrzqt)) {
                DexDappRedirectListFragment.this.dismissAllowingStateLoss();
                Context contextRequireContext = DexDappRedirectListFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                final DexDappRedirectListFragment dexDappRedirectListFragment2 = DexDappRedirectListFragment.this;
                viewOnClickListenerC54939xaY.setCancelable(true);
                viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplApi217);
                viewOnClickListenerC54939xaY.copydefault(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplApi214);
                viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.QDqgQU, new View.OnClickListener() { // from class: o.hIb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        DexDappRedirectListFragment.Application.AEQbTJ(dexDappRedirectListFragment2, viewOnClickListenerC54939xaY, view);
                    }
                });
                viewOnClickListenerC54939xaY.show();
            } else if (Intrinsics.EZpvd(hhs, hHS.ActionBar.OLrzqt)) {
                DexDappRedirectListFragment.this.dismissAllowingStateLoss();
                Context contextRequireContext2 = DexDappRedirectListFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(contextRequireContext2);
                final DexDappRedirectListFragment dexDappRedirectListFragment3 = DexDappRedirectListFragment.this;
                viewOnClickListenerC54939xaY2.setCancelable(true);
                viewOnClickListenerC54939xaY2.setCanceledOnTouchOutside(true);
                viewOnClickListenerC54939xaY2.setTitle(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplApi216);
                viewOnClickListenerC54939xaY2.copydefault(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplApi212);
                viewOnClickListenerC54939xaY2.EZpvd(C23274hvD.Fragment.QDqgQU, new View.OnClickListener() { // from class: o.hId
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        DexDappRedirectListFragment.Application.EZpvd(dexDappRedirectListFragment3, viewOnClickListenerC54939xaY2, view);
                    }
                });
                viewOnClickListenerC54939xaY2.show();
            } else if (Intrinsics.EZpvd(hhs, hHS.StateListAnimator.KWHzl)) {
                C23534hzz c23534hzz7 = DexDappRedirectListFragment.this.values;
                if (c23534hzz7 != null && (linearLayout = c23534hzz7.AEQbTJ) != null) {
                    linearLayout.setVisibility(8);
                }
                C23534hzz c23534hzz8 = DexDappRedirectListFragment.this.values;
                if (c23534hzz8 != null && (recyclerView = c23534hzz8.EZpvd) != null) {
                    recyclerView.setVisibility(8);
                }
                C23534hzz c23534hzz9 = DexDappRedirectListFragment.this.values;
                if (c23534hzz9 != null && (c55173xeu2 = c23534hzz9.OLrzqt) != null) {
                    c55173xeu2.setVisibility(0);
                }
                C23534hzz c23534hzz10 = DexDappRedirectListFragment.this.values;
                if (c23534hzz10 != null && (c55173xeu = c23534hzz10.OLrzqt) != null) {
                    final DexDappRedirectListFragment dexDappRedirectListFragment4 = DexDappRedirectListFragment.this;
                    c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.hIf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            DexDappRedirectListFragment.Application.OLrzqt(dexDappRedirectListFragment4, view);
                        }
                    });
                }
                rVN.reportFullyDrawn$default((Fragment) DexDappRedirectListFragment.this, false, (String) null, 2, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }

        public static final void AEQbTJ(DexDappRedirectListFragment dexDappRedirectListFragment, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
            Function0 function0 = dexDappRedirectListFragment.gEmmrt;
            if (function0 != null) {
                function0.invoke();
            }
            viewOnClickListenerC54939xaY.dismiss();
        }

        public static final void EZpvd(DexDappRedirectListFragment dexDappRedirectListFragment, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
            Function0 function0 = dexDappRedirectListFragment.EZpvd;
            if (function0 != null) {
                function0.invoke();
            }
            viewOnClickListenerC54939xaY.dismiss();
        }

        public static final void OLrzqt(DexDappRedirectListFragment dexDappRedirectListFragment, View view) {
            dexDappRedirectListFragment.OLrzqt(dexDappRedirectListFragment.OLrzqt == DAppRedirectFrom.SWAP);
        }
    }

    public final void OLrzqt(boolean z) {
        String strKWHzl;
        if (z) {
            DexDappRedirectViewModel dexDappRedirectViewModelOLrzqt = OLrzqt();
            String str = this.djBIcL;
            C21697hIz c21697hIz = this.AEQbTJ;
            String strAEQbTJ = c21697hIz != null ? c21697hIz.AEQbTJ() : null;
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            C21697hIz c21697hIz2 = this.fetchVPNInfo;
            String strAEQbTJ2 = c21697hIz2 != null ? c21697hIz2.AEQbTJ() : null;
            if (strAEQbTJ2 == null) {
                strAEQbTJ2 = "";
            }
            C21697hIz c21697hIz3 = this.AEQbTJ;
            String strKWHzl2 = c21697hIz3 != null ? c21697hIz3.KWHzl() : null;
            if (strKWHzl2 == null) {
                strKWHzl2 = "";
            }
            C21697hIz c21697hIz4 = this.fetchVPNInfo;
            strKWHzl = c21697hIz4 != null ? c21697hIz4.KWHzl() : null;
            String str2 = strKWHzl == null ? "" : strKWHzl;
            C21697hIz c21697hIz5 = this.AEQbTJ;
            dexDappRedirectViewModelOLrzqt.copydefault(str, strAEQbTJ, strAEQbTJ2, strKWHzl2, str2, c21697hIz5 != null && c21697hIz5.copydefault());
            return;
        }
        DexDappRedirectViewModel dexDappRedirectViewModelOLrzqt2 = OLrzqt();
        String str3 = this.djBIcL;
        C21697hIz c21697hIz6 = this.AEQbTJ;
        String strAEQbTJ3 = c21697hIz6 != null ? c21697hIz6.AEQbTJ() : null;
        String str4 = strAEQbTJ3 == null ? "" : strAEQbTJ3;
        C21697hIz c21697hIz7 = this.AEQbTJ;
        String strKWHzl3 = c21697hIz7 != null ? c21697hIz7.KWHzl() : null;
        String str5 = strKWHzl3 == null ? "" : strKWHzl3;
        C21697hIz c21697hIz8 = this.fetchVPNInfo;
        String strAEQbTJ4 = c21697hIz8 != null ? c21697hIz8.AEQbTJ() : null;
        String str6 = strAEQbTJ4 == null ? "" : strAEQbTJ4;
        C21697hIz c21697hIz9 = this.fetchVPNInfo;
        strKWHzl = c21697hIz9 != null ? c21697hIz9.KWHzl() : null;
        dexDappRedirectViewModelOLrzqt2.EZpvd(str3, str4, str5, str6, strKWHzl == null ? "" : strKWHzl);
    }

    public final void copydefault(final List<DAppInfo> list) {
        RecyclerView recyclerView;
        C23534hzz c23534hzz = this.values;
        if (c23534hzz == null || (recyclerView = c23534hzz.EZpvd) == null) {
            return;
        }
        hHV hhv = new hHV(list, new Function1() { // from class: o.hIa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexDappRedirectListFragment.OLrzqt(this.OLrzqt, list, (DAppInfo) obj);
            }
        });
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), list.size() > 2 ? 3 : list.size()));
        recyclerView.setAdapter(hhv);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dexui.main.dappredirect.DexDappRedirectTxDetailsFragment.Activity.newInstance$default(com.okinc.business.dexui.main.dappredirect.DexDappRedirectTxDetailsFragment$Activity, java.util.List, o.hIz, o.hIz, com.okinc.business.dexui.main.dappredirect.DAppRedirectFrom, com.okinc.business.dexlogic.main.market.bean.DAppInfo, java.lang.String, int, int, java.lang.Object):com.okinc.business.dexui.main.dappredirect.DexDappRedirectTxDetailsFragment */
    public static final Unit OLrzqt(DexDappRedirectListFragment dexDappRedirectListFragment, List list, DAppInfo dAppInfo) {
        DAppRedirectFrom dAppRedirectFrom;
        C21697hIz c21697hIz;
        C21697hIz c21697hIz2;
        Intrinsics.checkNotNullParameter(dAppInfo, "");
        dexDappRedirectListFragment.KWHzl(TrackButtonName.DAPP_SELECT.getButtonName());
        DAppRedirectFrom dAppRedirectFrom2 = dexDappRedirectListFragment.OLrzqt;
        DAppRedirectFrom dAppRedirectFrom3 = DAppRedirectFrom.MARKET;
        if (dAppRedirectFrom2 == dAppRedirectFrom3) {
            hHT hht = hHT.KWHzl;
            String dappName = dAppInfo.getDappName();
            String projectId = dAppInfo.getProjectId();
            C21697hIz c21697hIz3 = dexDappRedirectListFragment.AEQbTJ;
            String strKWHzl = c21697hIz3 != null ? c21697hIz3.KWHzl() : null;
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            C21697hIz c21697hIz4 = dexDappRedirectListFragment.AEQbTJ;
            String strAYXKKw = c21697hIz4 != null ? c21697hIz4.AYXKKw() : null;
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            C21697hIz c21697hIz5 = dexDappRedirectListFragment.AEQbTJ;
            String strAEQbTJ = c21697hIz5 != null ? c21697hIz5.AEQbTJ() : null;
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            C21697hIz c21697hIz6 = dexDappRedirectListFragment.AEQbTJ;
            String strEZpvd = c21697hIz6 != null ? c21697hIz6.EZpvd() : null;
            hht.KWHzl(dappName, projectId, strKWHzl, strAYXKKw, strAEQbTJ, strEZpvd == null ? "" : strEZpvd);
            dexDappRedirectListFragment.dismissAllowingStateLoss();
        }
        if ((dexDappRedirectListFragment.OLrzqt == dAppRedirectFrom3 && (c21697hIz2 = dexDappRedirectListFragment.AEQbTJ) != null && c21697hIz2.djBIcL()) || (dAppRedirectFrom = dexDappRedirectListFragment.OLrzqt) == DAppRedirectFrom.BRIDGE || (dAppRedirectFrom == DAppRedirectFrom.SWAP && (c21697hIz = dexDappRedirectListFragment.AEQbTJ) != null && !c21697hIz.AhwBna())) {
            dexDappRedirectListFragment.EZpvd(dAppInfo);
            return Unit.INSTANCE;
        }
        DexDappRedirectTxDetailsFragment.Activity activity = DexDappRedirectTxDetailsFragment.Companion;
        C21697hIz c21697hIz7 = dexDappRedirectListFragment.AEQbTJ;
        C21697hIz c21697hIz8 = dexDappRedirectListFragment.fetchVPNInfo;
        DAppRedirectFrom dAppRedirectFrom4 = dexDappRedirectListFragment.OLrzqt;
        activity.EZpvd(list, c21697hIz7, c21697hIz8, dAppRedirectFrom4 == null ? dAppRedirectFrom3 : dAppRedirectFrom4, dAppInfo, dexDappRedirectListFragment.djBIcL, (64 & 64) != 0 ? 0 : 0).show(dexDappRedirectListFragment.getParentFragmentManager(), "javaClass");
        return Unit.INSTANCE;
    }

    public final void EZpvd(DAppInfo dAppInfo) {
        String strDbNXlk;
        InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(this.djBIcL).fARcdN().valueOf();
        InterfaceC54828xWv interfaceC54828xWv = (InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        String dappSwapUrl = dAppInfo.getDappSwapUrl();
        String str = (interfaceC9738bbJValueOf == null || (strDbNXlk = interfaceC9738bbJValueOf.DbNXlk()) == null) ? "" : strDbNXlk;
        C21697hIz c21697hIz = this.AEQbTJ;
        InterfaceC54828xWv.ActionBar.enterDAppWebView$default(interfaceC54828xWv, fragmentActivityRequireActivity, dappSwapUrl, str, Long.valueOf(C33129mqd.valueOf(c21697hIz != null ? c21697hIz.AEQbTJ() : null)), new Function0() { // from class: o.hIc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DexDappRedirectListFragment.AEQbTJ();
            }
        }, null, null, "dex", 96, null);
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public final void KWHzl(String str) {
        C25448iws c25448iwsKWHzl = KWHzl();
        String strAYXKKw = AYXKKw();
        C21697hIz c21697hIz = this.AEQbTJ;
        String strAEQbTJ = c21697hIz != null ? c21697hIz.AEQbTJ() : null;
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        String str2 = strAEQbTJ;
        hHT hht = hHT.KWHzl;
        c25448iwsKWHzl.AEQbTJ(new AbstractC22406hek.TaskDescription(str2, strAYXKKw, hht.AEQbTJ(this.OLrzqt), hht.AEQbTJ(this.OLrzqt, this.isConnected), TrackOrderType.SWAP.getType(), hht.EZpvd(this.AEQbTJ, this.fetchVPNInfo), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, str), C56390yDp.OLrzqt("button_type", ButtonType.OTHERS.getType()), C56390yDp.OLrzqt("popup_source", MemeQuickPopUpSource.Companion.EZpvd().getSource()))));
    }

    public final void OLrzqt(String str) {
        C25448iws c25448iwsKWHzl = KWHzl();
        C21697hIz c21697hIz = this.AEQbTJ;
        String strAEQbTJ = c21697hIz != null ? c21697hIz.AEQbTJ() : null;
        String str2 = strAEQbTJ == null ? "" : strAEQbTJ;
        hHT hht = hHT.KWHzl;
        String strAEQbTJ2 = hht.AEQbTJ(this.OLrzqt);
        String strAEQbTJ3 = hht.AEQbTJ(this.OLrzqt, this.isConnected);
        String type = TrackOrderType.SWAP.getType();
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(this.djBIcL).fARcdN();
        C21697hIz c21697hIz2 = this.AEQbTJ;
        String strAEQbTJ4 = c21697hIz2 != null ? c21697hIz2.AEQbTJ() : null;
        c25448iwsKWHzl.AEQbTJ(new AbstractC22406hek.Application(str2, str, strAEQbTJ2, strAEQbTJ3, type, interfaceC23194htdFARcdN.KWHzl(strAEQbTJ4 != null ? strAEQbTJ4 : ""), hht.EZpvd(this.AEQbTJ, this.fetchVPNInfo), C56423yEv.EZpvd(C56390yDp.OLrzqt("popup_source", MemeQuickPopUpSource.Companion.EZpvd().getSource()))));
    }

    private final String AYXKKw() {
        return this.OLrzqt == DAppRedirectFrom.QUICK ? EventPageNameType.QUICK.getPageName() : EventPageNameType.SELECT_DAPP.getPageName();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.values = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.gEmmrt = null;
        this.EZpvd = null;
        this.KWHzl = null;
        this.AEQbTJ = null;
        this.fetchVPNInfo = null;
        this.AhwBna = null;
    }
}
