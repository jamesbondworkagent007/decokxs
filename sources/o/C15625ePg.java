package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.defi.biz.constant.EOSState;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.tx.check.ChainCheckType;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.home.CoinToolDialog;
import com.okinc.business.defi.wallet.home.DefiHomeWalletBaseFragment$filterCoinWithChainId$1;
import com.okinc.business.defi.wallet.home.DefiHomeWalletBaseFragment$listener$2$1$click$1;
import com.okinc.business.defi.wallet.home.DefiHomeWalletBaseFragment$observe$4;
import com.okinc.business.defi.wallet.home.DefiHomeWalletBaseFragment$onVisible$1;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import com.okinc.business.dex.api.bean.OKDCoinDetailConfig;
import com.okinc.business.dex.api.bean.OKDSourceType;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC7007abF;
import o.ActivityC21325gxd;
import o.C10407bnq;
import o.C10614brl;
import o.C12827cuN;
import o.C13754dXa;
import o.C15625ePg;
import o.C52761wXj;
import o.C9694baS;
import o.InterfaceC18271ffJ;
import o.InterfaceC54854xXu;
import o.InterfaceC9742bbN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ePg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15625ePg extends AbstractC32998moE implements InterfaceC54847xXn, InterfaceC54854xXu {
    public android.view.View AkhnZx;
    public C18285ffX AuCTel;
    public C16597emt fARcdN;
    public final InterfaceC56387yDm getFieldNames;
    public final InterfaceC56387yDm values;
    public final int DbNXlk = C13754dXa.TaskDescription.hrjNmC;
    public final InterfaceC56387yDm uzCIH = C56392yDr.copydefault(new Function0() { // from class: o.ePm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15625ePg.fJNWhG(this.copydefault);
        }
    });
    public final InterfaceC56387yDm getNewProxyInstance = C56392yDr.copydefault(new Function0() { // from class: o.ePr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15625ePg.fIwbmz(this.EZpvd);
        }
    });
    public final int ejfBZ = 16;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ePs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15625ePg.AkhnZx(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ePv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15625ePg.ejfBZ(this.copydefault);
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.ePt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15625ePg.fARcdN(this.copydefault);
        }
    });
    public final ActionBar fIwbmz = new ActionBar();
    public final android.os.Handler AYXKKw = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.lang.Runnable KWHzl = new java.lang.Runnable() { // from class: o.ePu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            C15625ePg.AuCTel(this.AEQbTJ);
        }
    };
    public boolean gEmmrt = true;
    public final InterfaceC56387yDm hDKMBd = C56392yDr.copydefault(new Function0() { // from class: o.ePd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15625ePg.isConnected();
        }
    });
    public final InterfaceC56387yDm wlaJM = C56392yDr.copydefault(new Function0() { // from class: o.ePc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15625ePg.fetchVPNInfo();
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ePi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15625ePg.djBIcL();
        }
    });
    public final StateListAnimator fJNWhG = new StateListAnimator();
    public long copydefault = Long.MIN_VALUE;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ePj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Float.valueOf(C15625ePg.AYXKKw());
        }
    });
    public final InterfaceC56387yDm iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.ePo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C15625ePg.gEmmrt());
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ePn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C15625ePg.AhwBna());
        }
    });
    public final int EZpvd = C55298xhM.dp2px$default(92.0f, null, 1, null);
    public final int[] isConnected = new int[2];

    /* JADX INFO: renamed from: o.ePg$Fragment */
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

    public static final float AYXKKw() {
        return 2.5f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long values() {
        return this.copydefault;
    }

    public C15625ePg() {
        final Function0 function0 = null;
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18275ffN.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletBaseFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletBaseFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletBaseFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.getFieldNames = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18272ffK.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletBaseFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletBaseFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletBaseFragment$special$$inlined$activityViewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final eUI AuCTelauCTel() {
        return (eUI) this.uzCIH.getValue();
    }

    public static final eUI fJNWhG(C15625ePg c15625ePg) {
        FragmentActivity fragmentActivityRequireActivity = c15625ePg.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (eUI) new ViewModelProvider(fragmentActivityRequireActivity).get(eUI.class);
    }

    private final C18275ffN uzCIH() {
        return (C18275ffN) this.values.getValue();
    }

    private final C18270ffI iwGUEr() {
        return (C18270ffI) this.getNewProxyInstance.getValue();
    }

    public static final C18270ffI fIwbmz(C15625ePg c15625ePg) {
        FragmentActivity fragmentActivityRequireActivity = c15625ePg.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (C18270ffI) new ViewModelProvider(fragmentActivityRequireActivity).get(C18270ffI.class);
    }

    public final C18272ffK ejfBZ() {
        return (C18272ffK) this.getFieldNames.getValue();
    }

    public final C15674eRb DbNXlk() {
        return (C15674eRb) this.AEQbTJ.getValue();
    }

    public static final C15674eRb AkhnZx(final C15625ePg c15625ePg) {
        FragmentActivity fragmentActivityRequireActivity = c15625ePg.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        androidx.fragment.app.FragmentManager childFragmentManager = c15625ePg.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C15674eRb c15674eRb = new C15674eRb(fragmentActivityRequireActivity, childFragmentManager, new java.util.ArrayList(), c15625ePg.ejfBZ, false, c15625ePg.AuCTelauCTel(), c15625ePg.uzCIH(), c15625ePg, new Function0() { // from class: o.ePp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15625ePg.DbNXlk(this.OLrzqt);
            }
        }, 16, null);
        c15674eRb.OLrzqt(c15625ePg.fJNWhG());
        return c15674eRb;
    }

    public static final Unit DbNXlk(final C15625ePg c15625ePg) {
        FragmentActivity activity = c15625ePg.getActivity();
        if (activity != null) {
            C9694baS.Companion.KWHzl(c15625ePg, ActivityC9955bfO.Companion.AEQbTJ(activity, c15625ePg.copydefault), new Function2() { // from class: o.ePf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C15625ePg.EZpvd(this.copydefault, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C15625ePg c15625ePg, int i, android.content.Intent intent) {
        c15625ePg.AYXKKw.removeCallbacks(c15625ePg.KWHzl);
        c15625ePg.AYXKKw.postDelayed(c15625ePg.KWHzl, 5000L);
        return Unit.INSTANCE;
    }

    public final C18044fav fIwbmz() {
        return (C18044fav) this.djBIcL.getValue();
    }

    public static final C18044fav ejfBZ(C15625ePg c15625ePg) {
        return new C18044fav(c15625ePg.DbNXlk());
    }

    /* JADX INFO: renamed from: o.ePg$Application */
    public static final class Application implements AbstractC7007abF.Application<eUG, eUG> {

        /* JADX INFO: renamed from: o.ePg$Application$StateListAnimator */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ChainStatus.values().length];
                try {
                    iArr[ChainStatus.REGISTERED.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ChainStatus.REGISTERING.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChainStatus.UNREGISTERED.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/abF$StateListAnimator;)Z */
        @Override // o.AbstractC7007abF.Application
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(eUG eug) {
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/abF$StateListAnimator;)V */
        @Override // o.AbstractC7007abF.Application
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(eUG eug) {
        }

        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/abF$StateListAnimator;Z)Z */
        @Override // o.AbstractC7007abF.Application
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean AEQbTJ(final eUG eug, boolean z) {
            eUG eug2;
            java.lang.String strDjBIcL;
            eUG eug3;
            if (eug == null || eug.ejfBZ() == 5) {
                return false;
            }
            java.lang.String str = "";
            if (!eug.zsXlph()) {
                final long jEZpvd = C10953byF.KWHzl.EZpvd(eug.djBIcL());
                final C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(jEZpvd));
                if (c10854bwMKWHzl != null && c10854bwMKWHzl.OuxcSI() && eug.fJNWhG()) {
                    return true;
                }
                if (c10854bwMKWHzl != null && c10854bwMKWHzl.DBxZfM()) {
                    C15625ePg.this.showLoadingAtOnce();
                    java.util.ArrayList<eUG> arrayListAYXKKw = eug.AYXKKw();
                    java.lang.String strDjBIcL2 = (arrayListAYXKKw == null || (eug3 = (eUG) CollectionsKt___CollectionsKt.firstOrNull(arrayListAYXKKw)) == null) ? null : eug3.djBIcL();
                    final java.lang.String str2 = strDjBIcL2 == null ? "" : strDjBIcL2;
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str2, true);
                    final Function1 function1 = new Function1() { // from class: o.ePy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C15625ePg.Application.OLrzqt(c10854bwMKWHzl, (AbstractC12782ctV) obj);
                        }
                    };
                    AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.ePz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return C15625ePg.Application.EZpvd(function1, obj);
                        }
                    });
                    final Function1 function12 = new Function1() { // from class: o.ePD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C15625ePg.Application.AEQbTJ(c10854bwMKWHzl, (kotlin.Pair) obj);
                        }
                    };
                    AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtCopydefault.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.ePC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return C15625ePg.Application.djBIcL(function12, obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
                    AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXKWHzl, C15625ePg.this, Lifecycle.Event.ON_DESTROY);
                    final C15625ePg c15625ePg = C15625ePg.this;
                    final Function1 function13 = new Function1() { // from class: o.ePB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C15625ePg.Application.copydefault(c15625ePg, this, eug, str2, jEZpvd, (ChainStatus) obj);
                        }
                    };
                    InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ePE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C15625ePg.Application.gEmmrt(function13, obj);
                        }
                    };
                    final C15625ePg c15625ePg2 = C15625ePg.this;
                    final Function1 function14 = new Function1() { // from class: o.ePF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C15625ePg.Application.AEQbTJ(c15625ePg2, (java.lang.Throwable) obj);
                        }
                    };
                    abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ePK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C15625ePg.Application.AhwBna(function14, obj);
                        }
                    });
                    return true;
                }
            }
            java.util.ArrayList<eUG> arrayListAYXKKw2 = eug.AYXKKw();
            if (arrayListAYXKKw2 != null && (eug2 = (eUG) CollectionsKt___CollectionsKt.firstOrNull(arrayListAYXKKw2)) != null && (strDjBIcL = eug2.djBIcL()) != null) {
                str = strDjBIcL;
            }
            EZpvd(eug, str);
            return true;
        }

        public static final kotlin.Pair EZpvd(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (kotlin.Pair) function1.invoke(obj);
        }

        public static final kotlin.Pair OLrzqt(C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV) {
            java.lang.String address;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AEQbTJ(), null, 2, null);
            if (chainAddressAddressFromChainId$default != null && (address = chainAddressAddressFromChainId$default.getAddress()) != null) {
                str = address;
            }
            return C56390yDp.OLrzqt(abstractC12782ctV, str);
        }

        public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static final InterfaceC60096zvd AEQbTJ(C10854bwM c10854bwM, kotlin.Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            if (((AbstractC12782ctV) pair.getFirst()).djSkpj()) {
                return ChainStatusChecker.OLrzqt.OLrzqt(c10854bwM.AhwBna(), (java.lang.String) pair.getSecond(), c10854bwM.OLrzqt(), C56402yEa.EZpvd(ChainCheckType.CHECK_REGISTER));
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(ChainStatus.REGISTERED);
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }

        public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.dek.handleUnregisteredStatus$default(o.dek, android.content.Context, androidx.fragment.app.FragmentManager, java.lang.String, long, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
        public static final Unit copydefault(C15625ePg c15625ePg, Application application, eUG eug, java.lang.String str, long j, ChainStatus chainStatus) {
            c15625ePg.dismissLoading();
            int i = chainStatus == null ? -1 : StateListAnimator.AEQbTJ[chainStatus.ordinal()];
            if (i == 1) {
                application.EZpvd(eug, str);
            } else if (i == 2) {
                C14083dek.OLrzqt.KWHzl();
            } else if (i == 3) {
                C14083dek c14083dek = C14083dek.OLrzqt;
                android.content.Context context = c15625ePg.getContext();
                if (context == null) {
                    return Unit.INSTANCE;
                }
                androidx.fragment.app.FragmentManager childFragmentManager = c15625ePg.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                C14083dek.handleUnregisteredStatus$default(c14083dek, context, childFragmentManager, str, j, null, 16, null);
            }
            return Unit.INSTANCE;
        }

        public static final void AhwBna(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit AEQbTJ(C15625ePg c15625ePg, java.lang.Throwable th) {
            c15625ePg.dismissLoading();
            pUU.AEQbTJ(c15625ePg.getTAG(), "check token status error", th);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/abF$StateListAnimator;Ljava/lang/Object;)V */
        @Override // o.AbstractC7007abF.Application
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void OLrzqt(eUG eug, eUG eug2) {
            java.util.ArrayList<eUG> arrayListAYXKKw;
            eUG eug3;
            java.lang.String strDjBIcL = (eug2 == null || (arrayListAYXKKw = eug2.AYXKKw()) == null || (eug3 = (eUG) CollectionsKt___CollectionsKt.firstOrNull(arrayListAYXKKw)) == null) ? null : eug3.djBIcL();
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            EZpvd(eug2, strDjBIcL);
        }

        public final void EZpvd(eUG eug, java.lang.String str) {
            if (eug == null) {
                return;
            }
            if (eug.djBIcL().length() == 0) {
                C10856bwO.EZpvd(C15625ePg.this.getTAG(), new OKWException("groupItem.id is invalid", null));
            }
            AbstractC12782ctV value = C15625ePg.this.AuCTelauCTel().fARcdN().getValue();
            if (value == null) {
                return;
            }
            if (C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl(value)) {
                if (!eug.iwGUEr() && !eug.zsXlph()) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C15625ePg.this), null, null, new DefiHomeWalletBaseFragment$listener$2$1$click$1(eug, C15625ePg.this, str, null), 3, null);
                    return;
                } else {
                    AEQbTJ(C15625ePg.this, eug, str);
                    return;
                }
            }
            AEQbTJ(C15625ePg.this, eug, str);
        }

        public static final void AEQbTJ(C15625ePg c15625ePg, eUG eug, java.lang.String str) {
            ActivityC21325gxd.Application application = ActivityC21325gxd.Companion;
            FragmentActivity activity = c15625ePg.getActivity();
            if (activity == null) {
                return;
            }
            application.copydefault(activity, eug.djBIcL(), str, c15625ePg.values());
        }

        public static final void OLrzqt(C15625ePg c15625ePg, C10854bwM c10854bwM) {
            OKDSourceType oKDSourceType = OKDSourceType.WALLET_SOURCE;
            long jFetchVPNInfo = c10854bwM.fetchVPNInfo();
            OKDCoinDetailConfig oKDCoinDetailConfig = new OKDCoinDetailConfig(oKDSourceType, java.lang.String.valueOf(jFetchVPNInfo), c10854bwM.OLrzqt(), c10854bwM.fJNWhG(), null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
            gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
            FragmentActivity fragmentActivityRequireActivity = c15625ePg.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            gko.OLrzqt(fragmentActivityRequireActivity, oKDCoinDetailConfig);
        }
    }

    public final Application fJNWhG() {
        return (Application) this.fetchVPNInfo.getValue();
    }

    public static final Application fARcdN(C15625ePg c15625ePg) {
        return c15625ePg.new Application();
    }

    /* JADX INFO: renamed from: o.ePg$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C15625ePg KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C15625ePg c15625ePg) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c15625ePg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                FragmentActivity activity = this.KWHzl.getActivity();
                if (activity != null) {
                    C9694baS.Application application = C9694baS.Companion;
                    C15625ePg c15625ePg = this.KWHzl;
                    application.KWHzl(c15625ePg, ActivityC9955bfO.Companion.AEQbTJ(activity, c15625ePg.values()), this.KWHzl.new TaskDescription());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ePg$ActionBar */
    public static final class ActionBar extends RecyclerView.OnScrollListener {
        public ActionBar() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            C15625ePg.this.getFieldNames();
        }
    }

    public static final void AuCTel(C15625ePg c15625ePg) {
        C18275ffN.fetchKLineState$default(c15625ePg.uzCIH(), InterfaceC18271ffJ.Application.EZpvd, null, 2, null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C16597emt c16597emtKWHzl = C16597emt.KWHzl(getLayoutInflater(), viewGroup, false);
        this.fARcdN = c16597emtKWHzl;
        if (c16597emtKWHzl != null) {
            return c16597emtKWHzl.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C17109ewb c17109ewb;
        C17090ewI c17090ewI;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        Intrinsics.checkNotNullParameter(view, "");
        SafeLinearLayoutManager safeLinearLayoutManager = new SafeLinearLayoutManager(view.getContext());
        C16597emt c16597emt = this.fARcdN;
        if (c16597emt != null && (recyclerView4 = c16597emt.copydefault) != null) {
            recyclerView4.setLayoutManager(safeLinearLayoutManager);
        }
        C16597emt c16597emt2 = this.fARcdN;
        if (c16597emt2 != null && (recyclerView3 = c16597emt2.copydefault) != null) {
            recyclerView3.setAdapter(DbNXlk());
        }
        C16597emt c16597emt3 = this.fARcdN;
        if (c16597emt3 != null && (recyclerView2 = c16597emt3.copydefault) != null) {
            recyclerView2.addItemDecoration(fIwbmz());
        }
        C16597emt c16597emt4 = this.fARcdN;
        if (c16597emt4 != null && (recyclerView = c16597emt4.copydefault) != null) {
            recyclerView.addOnScrollListener(this.fIwbmz);
        }
        C16597emt c16597emt5 = this.fARcdN;
        if (c16597emt5 != null && (c17109ewb = c16597emt5.OLrzqt) != null && (c17090ewI = c17109ewb.KWHzl) != null) {
            AppCompatTextView appCompatTextView = c17090ewI.EZpvd;
            appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this));
        }
        getNewProxyInstance();
        iwGUEr().KWHzl().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ePe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15625ePg.OLrzqt(this.OLrzqt, (java.lang.Integer) obj);
            }
        }));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        this.AuCTel = (C18285ffX) new ViewModelProvider(fragmentActivityRequireActivity).get(C18285ffX.class);
    }

    /* JADX INFO: renamed from: o.ePg$TaskDescription */
    public static final class TaskDescription implements Function2<java.lang.Integer, android.content.Intent, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.Integer num, android.content.Intent intent) {
            OLrzqt(num.intValue(), intent);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(int i, android.content.Intent intent) {
            C15625ePg.this.AYXKKw.removeCallbacks(C15625ePg.this.KWHzl);
            C15625ePg.this.AYXKKw.postDelayed(C15625ePg.this.KWHzl, 5000L);
        }
    }

    public static final Unit OLrzqt(C15625ePg c15625ePg, java.lang.Integer num) {
        RecyclerView recyclerView;
        C16597emt c16597emt = c15625ePg.fARcdN;
        if (c16597emt != null && (recyclerView = c16597emt.copydefault) != null) {
            if (num != null && num.intValue() == 0) {
                int iDp2px$default = C55298xhM.dp2px$default(106.0f, null, 1, null);
                if (recyclerView.getPaddingBottom() != iDp2px$default) {
                    recyclerView.setTag(java.lang.Integer.valueOf(iDp2px$default));
                }
            } else {
                int iDp2px$default2 = C55298xhM.dp2px$default(76.0f, null, 1, null);
                if (recyclerView.getTag() != null && (recyclerView.getTag() instanceof java.lang.Number)) {
                    recyclerView.setTag(java.lang.Integer.valueOf(iDp2px$default2));
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        AuCTelauCTel().KWHzl(true);
        if (this.gEmmrt) {
            this.gEmmrt = false;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeWalletBaseFragment$onVisible$1(this, null), 3, null);
        }
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        AuCTelauCTel().KWHzl(false);
    }

    public final void getNewProxyInstance() {
        AuCTelauCTel().zsXlph().observe(this, new Observer() { // from class: o.ePl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C15625ePg.copydefault(this.KWHzl, (java.util.ArrayList) obj);
            }
        });
        AuCTelauCTel().fARcdN().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ePh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15625ePg.EZpvd(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        }));
        AuCTelauCTel().values().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ePk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15625ePg.OLrzqt(this.copydefault, (kotlin.Pair) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeWalletBaseFragment$observe$4(this, null), 3, null);
        AuCTelauCTel().getNewProxyInstance().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ePq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15625ePg.OLrzqt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r9v15, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(C15625ePg c15625ePg, java.util.ArrayList arrayList) {
        java.lang.Object objPrevious;
        byte b;
        java.lang.Object next;
        java.util.ArrayList<eUG> arrayListAYXKKw;
        java.lang.Object next2;
        int size;
        java.util.ArrayList<eUG> arrayListAYXKKw2;
        if (arrayList == null) {
            return;
        }
        boolean z = true;
        java.lang.Object obj = null;
        java.lang.Object obj2 = null;
        eug = null;
        eUG eug = null;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c15625ePg, true, (java.lang.String) null, 2, (java.lang.Object) null);
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((eUG) objPrevious).ejfBZ() == 2) {
                    break;
                }
            }
        }
        eUG eug2 = (eUG) objPrevious;
        AbstractC12782ctV value = c15625ePg.AuCTelauCTel().fARcdN().getValue();
        if (value == null || value.zLjUOn()) {
            C56532yIw.EZpvd(arrayList).remove(eug2);
        } else if (eug2 == null) {
            arrayList.add(new eUG("", "", "", "", "", false, "", "", false, null, "", 2, null, null, null, null, false, null, false, false, false, 0, false, false, 0, null, null, false, false, false, false, null, null, false, false, null, null, -4096, 31, null));
        }
        kotlin.Pair<java.lang.Integer, java.lang.String> value2 = c15625ePg.AuCTelauCTel().values().getValue();
        java.lang.String second = value2 != null ? value2.getSecond() : null;
        kotlin.Pair<java.lang.Integer, java.lang.String> value3 = c15625ePg.AuCTelauCTel().values().getValue();
        java.lang.Integer first = value3 != null ? value3.getFirst() : null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) second)) {
            java.util.Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd((java.lang.Object) ((eUG) it.next()).djBIcL(), (java.lang.Object) second)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                java.util.Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it2.next();
                        if (((eUG) next2).ejfBZ() == 5) {
                            break;
                        }
                    }
                }
                eUG eug3 = (eUG) next2;
                if (eug3 == null || (arrayListAYXKKw2 = eug3.AYXKKw()) == null) {
                    size = -1;
                    if (size != -1) {
                        size += arrayList.size();
                    }
                    i = size;
                    b = true;
                } else {
                    java.util.Iterator<eUG> it3 = arrayListAYXKKw2.iterator();
                    size = 0;
                    while (it3.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) it3.next().djBIcL(), (java.lang.Object) second)) {
                            break;
                        } else {
                            size++;
                        }
                    }
                    size = -1;
                    if (size != -1) {
                    }
                    i = size;
                    b = true;
                }
            } else {
                b = false;
            }
            if (b != false) {
                java.util.Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it4.next();
                        if (((eUG) next).ejfBZ() == 5) {
                            break;
                        }
                    }
                }
                eUG eug4 = (eUG) next;
                if (eug4 != null && (arrayListAYXKKw = eug4.AYXKKw()) != null) {
                    java.util.Iterator<T> it5 = arrayListAYXKKw.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        java.lang.Object next3 = it5.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((eUG) next3).djBIcL(), (java.lang.Object) second)) {
                            obj2 = next3;
                            break;
                        }
                    }
                    eug = (eUG) obj2;
                }
            } else {
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next4 = it6.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((eUG) next4).djBIcL(), (java.lang.Object) second)) {
                        obj = next4;
                        break;
                    }
                }
                eug = (eUG) obj;
            }
            if (eug != null) {
                if (first == null || i != first.intValue()) {
                    if (second != null) {
                        androidx.fragment.app.FragmentManager childFragmentManager = c15625ePg.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        androidx.fragment.app.Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(C15674eRb.class.getName());
                        if (fragmentFindFragmentByTag != null && fragmentFindFragmentByTag.isAdded() && (fragmentFindFragmentByTag instanceof CoinToolDialog)) {
                            ((CoinToolDialog) fragmentFindFragmentByTag).dismissAllowingStateLoss();
                            c15625ePg.AuCTelauCTel().values().setValue(C56390yDp.OLrzqt(-1, ""));
                        } else {
                            c15625ePg.AuCTelauCTel().values().setValue(C56390yDp.OLrzqt(-1, second));
                        }
                    }
                    z = false;
                }
                eug.OLrzqt(z);
            }
        }
        c15625ePg.OLrzqt((java.util.ArrayList<eUG>) arrayList, c15625ePg.copydefault);
    }

    public static final Unit EZpvd(C15625ePg c15625ePg, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV == null) {
            return Unit.INSTANCE;
        }
        c15625ePg.copydefault = C33129mqd.valueOf(C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(abstractC12782ctV.DbNXlk()).getChainId());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C15625ePg c15625ePg, kotlin.Pair pair) {
        java.lang.Object next;
        int iIntValue = ((java.lang.Number) pair.getFirst()).intValue();
        java.lang.String str = (java.lang.String) pair.getSecond();
        if (str == null || str.length() == 0) {
            java.util.ArrayList<eUG> value = c15625ePg.AuCTelauCTel().zsXlph().getValue();
            if (value != null) {
                java.util.Iterator<T> it = value.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((eUG) next).AuCTelauCTel()) {
                        break;
                    }
                }
                eUG eug = (eUG) next;
                if (eug != null) {
                    eug.OLrzqt(false);
                }
            }
            c15625ePg.AuCTelauCTel().zsXlph().setValue(value);
        } else if (iIntValue == -1) {
            c15625ePg.AuCTelauCTel().AhwBna().setValue(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C15625ePg c15625ePg, java.lang.Boolean bool) {
        c15625ePg.zLjUOn();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFieldNames() {
        AbstractC12782ctV value = AuCTelauCTel().fARcdN().getValue();
        return (value == null || value.zsXlph() || !value.zLjUOn()) ? false : true;
    }

    public final eUG fARcdN() {
        return (eUG) this.hDKMBd.getValue();
    }

    public static final eUG isConnected() {
        return new eUG("", "", "", "", "", false, "", "", false, null, "", 3, null, null, null, null, false, null, false, false, false, 0, false, false, 0, null, null, false, false, false, false, null, null, false, false, null, null, -4096, 31, null);
    }

    public final eUG AuCTel() {
        return (eUG) this.wlaJM.getValue();
    }

    public static final eUG fetchVPNInfo() {
        return new eUG("", "", "", "", "", false, "", "", false, null, "", 6, null, null, null, null, false, null, false, false, false, 0, false, false, 0, null, null, false, false, false, false, null, null, false, false, null, null, -4096, 31, null);
    }

    public final eUG AkhnZx() {
        return (eUG) this.valueOf.getValue();
    }

    public static final eUG djBIcL() {
        return new eUG("", "", C33070mpX.AYXKKw(C13754dXa.FragmentManager.onDraw), "", "", false, "", "", false, new java.util.ArrayList(), "", 7, null, null, null, null, false, null, false, false, false, 0, false, false, 0, null, null, false, false, false, false, null, null, false, false, null, null, -4096, 31, null);
    }

    public final void EZpvd(java.util.ArrayList<eUG> arrayList) {
        boolean z;
        C17109ewb c17109ewb;
        ConstraintLayout constraintLayoutKWHzl;
        eUG eug;
        AbstractC12782ctV value = AuCTelauCTel().fARcdN().getValue();
        int i = 0;
        if (value != null && C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl(value) && (!arrayList.isEmpty()) && ((eug = (eUG) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null || eug.ejfBZ() != 6)) {
            arrayList.add(0, AuCTel());
        }
        if (value != null && value.zsXlph() && !arrayList.contains(fARcdN()) && (!arrayList.isEmpty())) {
            arrayList.add(fARcdN());
        }
        if (Intrinsics.EZpvd(AuCTelauCTel().iwGUEr().getValue(), java.lang.Boolean.TRUE)) {
            C32866mlf.onEvent$default("Web3_HomePage_WalletRelease_Entry_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            arrayList.add(0, AkhnZx());
        }
        C18044fav c18044favFIwbmz = fIwbmz();
        if ((arrayList instanceof java.util.Collection) && arrayList.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (((eUG) it.next()).ejfBZ() == 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        c18044favFIwbmz.OLrzqt(z);
        java.util.ArrayList<eUG> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            java.util.ArrayList<eUG> arrayListAYXKKw = ((eUG) obj).AYXKKw();
            if (C11600cUg.copydefault(arrayListAYXKKw != null ? java.lang.Integer.valueOf(arrayListAYXKKw.size()) : null) >= 1) {
                arrayList2.add(obj);
            }
        }
        for (eUG eug2 : arrayList2) {
            if (eug2.ejfBZ() == 5 && C13912dbY.copydefault.AYXKKw()) {
                DbNXlk().KWHzl(eug2);
            } else {
                DbNXlk().AEQbTJ(eug2);
            }
        }
        DbNXlk().EZpvd(arrayList);
        zLjUOn();
        C16597emt c16597emt = this.fARcdN;
        if (c16597emt == null || (c17109ewb = c16597emt.OLrzqt) == null || (constraintLayoutKWHzl = c17109ewb.getRoot()) == null) {
            return;
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            i = 8;
        } else {
            hDKMBd();
        }
        constraintLayoutKWHzl.setVisibility(i);
        constraintLayoutKWHzl.requestLayout();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gIn.setCompoundDrawablesRelativeWithSize$default(android.widget.TextView, int, int, int, int, int, int, java.lang.Object):void */
    public final void hDKMBd() {
        C17109ewb c17109ewb;
        C17090ewI c17090ewI;
        C16597emt c16597emt = this.fARcdN;
        if (c16597emt == null || (c17109ewb = c16597emt.OLrzqt) == null || (c17090ewI = c17109ewb.KWHzl) == null) {
            return;
        }
        AppCompatTextView appCompatTextView = c17090ewI.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C19604gIn.KWHzl(appCompatTextView, 16, (28 & 2) != 0 ? 0 : C52761wXj.TaskDescription.sCB, (28 & 4) != 0 ? 0 : 0, (28 & 8) != 0 ? 0 : 0, (28 & 16) != 0 ? 0 : 0);
        ConstraintLayout constraintLayoutAEQbTJ = c17090ewI.getRoot();
        AbstractC12782ctV value = AuCTelauCTel().fARcdN().getValue();
        constraintLayoutAEQbTJ.setVisibility((value == null || !value.zsXlph()) ? 0 : 4);
    }

    /* JADX INFO: renamed from: o.ePg$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.OnScrollListener {
        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C15625ePg.this.zLjUOn();
                recyclerView.removeOnScrollListener(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zLjUOn() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        C16597emt c16597emt = this.fARcdN;
        if (c16597emt != null && (recyclerView3 = c16597emt.copydefault) != null && recyclerView3.getScrollState() == 0) {
            DbNXlk().notifyDataSetChanged();
            return;
        }
        DbNXlk().notifyDataSetChanged();
        C16597emt c16597emt2 = this.fARcdN;
        if (c16597emt2 != null && (recyclerView2 = c16597emt2.copydefault) != null) {
            recyclerView2.removeOnScrollListener(this.fJNWhG);
        }
        C16597emt c16597emt3 = this.fARcdN;
        if (c16597emt3 == null || (recyclerView = c16597emt3.copydefault) == null) {
            return;
        }
        recyclerView.addOnScrollListener(this.fJNWhG);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        super.onDestroyView();
        this.AYXKKw.removeCallbacksAndMessages(null);
        DbNXlk().gEmmrt();
        DbNXlk().OLrzqt((AbstractC7007abF.Application) null);
        C16597emt c16597emt = this.fARcdN;
        if (c16597emt != null && (recyclerView3 = c16597emt.copydefault) != null) {
            recyclerView3.removeOnScrollListener(this.fIwbmz);
        }
        C16597emt c16597emt2 = this.fARcdN;
        if (c16597emt2 != null && (recyclerView2 = c16597emt2.copydefault) != null) {
            recyclerView2.removeOnScrollListener(this.fJNWhG);
        }
        C16597emt c16597emt3 = this.fARcdN;
        if (c16597emt3 != null && (recyclerView = c16597emt3.copydefault) != null) {
            recyclerView.removeItemDecoration(fIwbmz());
        }
        this.AkhnZx = null;
        this.fARcdN = null;
    }

    public static final int gEmmrt() {
        return C55298xhM.dp2px$default(12.0f, null, 1, null);
    }

    public static final int AhwBna() {
        return C55298xhM.dp2px$default(8.0f, null, 1, null);
    }

    @Override // o.InterfaceC54847xXn
    public void KWHzl(long j, long j2, boolean z) {
        java.util.ArrayList<eUG> arrayList;
        if (z) {
            this.copydefault = j;
            return;
        }
        MutableLiveData<java.util.ArrayList<eUG>> mutableLiveDataZsXlph = AuCTelauCTel().zsXlph();
        if (mutableLiveDataZsXlph == null || (arrayList = mutableLiveDataZsXlph.getValue()) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        OLrzqt(arrayList, j);
        this.copydefault = j;
    }

    public final void OLrzqt(java.util.ArrayList<eUG> arrayList, long j) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeWalletBaseFragment$filterCoinWithChainId$1(j, arrayList, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final eUG OLrzqt(C10525bqB c10525bqB) {
        boolean z;
        boolean z2;
        java.lang.String strWlaJM = c10525bqB.wlaJM();
        java.lang.String strDbNXlk = c10525bqB.KWHzl().DbNXlk();
        java.lang.String strFJNWhG = c10525bqB.KWHzl().fJNWhG();
        java.lang.String strGEmmrt = c10525bqB.KWHzl().gEmmrt();
        java.lang.String displayAmount$default = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB, false, true, 1, null);
        java.lang.String strAhwBna = c10525bqB.AhwBna();
        if (c10525bqB.KWHzl().OuxcSI()) {
            C13852daR c13852daRODWQjV = c10525bqB.values().ODWQjV();
            if ((c13852daRODWQjV != null ? c13852daRODWQjV.valueOf() : null) != EOSState.Opened) {
                z = true;
            }
        } else {
            z = false;
        }
        eUG[] eugArr = new eUG[1];
        java.lang.String strDbNXlk2 = c10525bqB.values().DbNXlk();
        java.lang.CharSequence charSequenceKWHzl = C14733dqy.copydefault.KWHzl(c10525bqB.values());
        java.lang.String addressStr$default = C14079deg.getAddressStr$default(C14079deg.EZpvd, c10525bqB.zuBGHE(), false, 2, null);
        java.lang.String displayAmount$default2 = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB, false, true, 1, null);
        java.lang.String strAhwBna2 = c10525bqB.AhwBna();
        if (c10525bqB.KWHzl().OuxcSI()) {
            C13852daR c13852daRODWQjV2 = c10525bqB.values().ODWQjV();
            if ((c13852daRODWQjV2 != null ? c13852daRODWQjV2.valueOf() : null) != EOSState.Opened) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        eugArr[0] = new eUG(strDbNXlk2, "", charSequenceKWHzl, "", addressStr$default, true, displayAmount$default2, strAhwBna2, z2, null, "", 0, null, null, null, null, false, null, false, false, false, 0, false, false, 0, null, null, false, false, false, false, null, null, false, false, c10525bqB.AubY(), c10525bqB.OcIXYQ(), -2048, 7, null);
        return new eUG(strWlaJM, strDbNXlk, strFJNWhG, "", strGEmmrt, false, displayAmount$default, strAhwBna, z, yDY.copydefault(eugArr), "", 0, null, null, null, c10525bqB.fIwbmz(), false, java.lang.Integer.valueOf(c10525bqB.KWHzl().QfsBiF()), false, false, false, 0, false, c10525bqB.KWHzl().getNewProxyInstance(), c10525bqB.KWHzl().AkhnZx(), null, null, false, false, C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl(c10525bqB.values()), c10525bqB.ORxRYg() || c10525bqB.QKVWgx(), c10525bqB.sSMYrx(), c10525bqB.gHZMYf(), false, false, c10525bqB.AubY(), c10525bqB.OcIXYQ(), 511539200, 6, null);
    }

    @Override // o.InterfaceC54854xXu
    public void KWHzl(float f, int i) {
        InterfaceC54854xXu.StateListAnimator.AEQbTJ(this, f, i);
        EZpvd(f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(float f, int i) {
        boolean z;
        RecyclerView recyclerView;
        C17109ewb c17109ewb;
        ConstraintLayout constraintLayoutKWHzl;
        if (f < 0.0f || f > 1.0f) {
            return;
        }
        C16597emt c16597emt = this.fARcdN;
        if (c16597emt == null || (c17109ewb = c16597emt.OLrzqt) == null || (constraintLayoutKWHzl = c17109ewb.getRoot()) == null || constraintLayoutKWHzl.getVisibility() != 0) {
            z = true;
            if (f != 1.0f) {
                C16597emt c16597emt2 = this.fARcdN;
                RecyclerView.LayoutManager layoutManager = (c16597emt2 == null || (recyclerView = c16597emt2.copydefault) == null) ? null : recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null) {
                    return;
                }
                int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                if (iFindLastCompletelyVisibleItemPosition == linearLayoutManager.getItemCount() - 1) {
                    android.view.View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindLastCompletelyVisibleItemPosition);
                    this.AkhnZx = viewFindViewByPosition;
                    if (viewFindViewByPosition == null) {
                        return;
                    }
                    viewFindViewByPosition.getLocationOnScreen(this.isConnected);
                    int i2 = this.isConnected[1];
                    android.view.View view = this.AkhnZx;
                    Intrinsics.copydefault(view);
                    if (i2 + view.getHeight() + this.EZpvd > i) {
                        z = false;
                    }
                }
            }
        }
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment == null || !(parentFragment instanceof InterfaceC54851xXr)) {
            return;
        }
        ((InterfaceC54851xXr) parentFragment).EZpvd(z);
    }
}
