package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$changeMainWallet$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$fetchEIP7702WalletStatus$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$fetchInitialWalletData$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$fetchInitialWalletData$data$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$fetchWalletList$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$filterWalletsCache$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$filterWalletsCache$2;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$getAllSupportedRootWallets$2;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$getFilteredWallets$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$onWalletBackup$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$refreshAllData$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$refreshMpcWalletCache$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$refreshMpcWalletCache$2;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$refreshWalletAssetData$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$selectWalletOnMainSet$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$special$$inlined$map$1$2$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$special$$inlined$map$2$2$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$special$$inlined$map$3$2$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$special$$inlined$map$4$2$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$special$$inlined$map$5$2$1;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$suspendCatchingLaunch$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.CurrentWalletSelectMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.wallet.api.bean.FunctionConfig;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C17424fEv;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.fSa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17781fSa extends ViewModel {
    public final MutableStateFlow<java.lang.Boolean> AEQbTJ;
    public final java.util.Set<java.lang.String> AYXKKw;
    public final CurrentWalletSwitchConfig AhwBna;
    public final StateFlow<java.lang.Boolean> AkhnZx;
    public final Function2<InterfaceC9738bbJ, java.lang.Long, java.lang.Boolean> AuCTel;
    public final java.util.List<UnsupportedWalletType> AuCTelauCTel;
    public InterfaceC9738bbJ AubY;
    public final InterfaceC17773fRt AwvSrB;
    public final StateFlow<CurrentWalletSelectMode> DbNXlk;
    public final MutableStateFlow<CurrentWalletSwitchNetworkMode> EZpvd;
    public final MutableSharedFlow<InterfaceC9738bbJ> KWHzl;
    public final MutableStateFlow<java.util.List<fDL<? extends java.lang.Object>>> OLrzqt;
    public final MutableStateFlow<CurrentWalletSelectMode> copydefault;
    public final StateFlow<InterfaceC9731bbC> djBIcL;
    public boolean ejfBZ;
    public final C15274eCg fARcdN;
    public final C17776fRw<java.util.List<AbstractC12784ctX>> fIwbmz;
    public final long fJNWhG;
    public int fetchVPNInfo;
    public final MutableStateFlow<java.lang.Integer> gEmmrt;
    public final StateFlow<java.lang.Boolean> getFieldNames;
    public final StateFlow<java.lang.Boolean> getNewProxyInstance;
    public final SharedFlow<InterfaceC9738bbJ> hDKMBd;
    public java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> isConnected;
    public final C17776fRw<java.lang.Object> iwGUEr;
    public final StateFlow<CurrentWalletSwitchNetworkMode> uzCIH;
    public final StateFlow<java.lang.Long> valueOf;
    public InterfaceC9738bbJ values;
    public java.lang.Long wlaJM;
    public final C17775fRv zLjUOn;
    public final StateFlow<java.lang.Boolean> zsXlph;
    public final StateFlow<java.util.List<fDL<? extends java.lang.Object>>> zuBGHE;

    /* JADX INFO: renamed from: o.fSa$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MpcWalletService.MpcWalletAbleStatus.values().length];
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoBackUp.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Long> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> AYXKKw() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<fDL<? extends java.lang.Object>>> AkhnZx() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> DbNXlk() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC9731bbC> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrentWalletSwitchConfig KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.ejfBZ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<CurrentWalletSelectMode> copydefault() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<CurrentWalletSwitchNetworkMode> djBIcL() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> fetchVPNInfo() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<InterfaceC9738bbJ> values() {
        return this.hDKMBd;
    }

    /* JADX INFO: renamed from: o.fSa$ActionBar */
    public static final class ActionBar implements Flow<java.lang.Long> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.fSa$ActionBar$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WalletSwitchViewModel$special$$inlined$map$2$2$1 walletSwitchViewModel$special$$inlined$map$2$2$1;
                if (continuation instanceof WalletSwitchViewModel$special$$inlined$map$2$2$1) {
                    walletSwitchViewModel$special$$inlined$map$2$2$1 = (WalletSwitchViewModel$special$$inlined$map$2$2$1) continuation;
                    int i = walletSwitchViewModel$special$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        walletSwitchViewModel$special$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        walletSwitchViewModel$special$$inlined$map$2$2$1 = new WalletSwitchViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = walletSwitchViewModel$special$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = walletSwitchViewModel$special$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.lang.Long lKWHzl = C56443yFo.KWHzl(fRA.OLrzqt.OLrzqt((CurrentWalletSwitchNetworkMode) obj));
                    walletSwitchViewModel$special$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(lKWHzl, walletSwitchViewModel$special$$inlined$map$2$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Long> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.fSa$Application */
    public static final class Application implements Flow<InterfaceC9731bbC> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ C17781fSa OLrzqt;

        /* JADX INFO: renamed from: o.fSa$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C17781fSa KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, C17781fSa c17781fSa) {
                this.AEQbTJ = flowCollector;
                this.KWHzl = c17781fSa;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WalletSwitchViewModel$special$$inlined$map$3$2$1 walletSwitchViewModel$special$$inlined$map$3$2$1;
                if (continuation instanceof WalletSwitchViewModel$special$$inlined$map$3$2$1) {
                    walletSwitchViewModel$special$$inlined$map$3$2$1 = (WalletSwitchViewModel$special$$inlined$map$3$2$1) continuation;
                    int i = walletSwitchViewModel$special$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        walletSwitchViewModel$special$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        walletSwitchViewModel$special$$inlined$map$3$2$1 = new WalletSwitchViewModel$special$$inlined$map$3$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = walletSwitchViewModel$special$$inlined$map$3$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = walletSwitchViewModel$special$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    long jLongValue = ((java.lang.Number) obj).longValue();
                    InterfaceC9731bbC interfaceC9731bbCCopydefault = jLongValue != Long.MIN_VALUE ? this.KWHzl.AwvSrB.copydefault(jLongValue) : null;
                    walletSwitchViewModel$special$$inlined$map$3$2$1.label = 1;
                    if (flowCollector.emit(interfaceC9731bbCCopydefault, walletSwitchViewModel$special$$inlined$map$3$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow, C17781fSa c17781fSa) {
            this.KWHzl = flow;
            this.OLrzqt = c17781fSa;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super InterfaceC9731bbC> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.fSa$Fragment */
    public static final class Fragment implements Flow<java.lang.Boolean> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.fSa$Fragment$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WalletSwitchViewModel$special$$inlined$map$5$2$1 walletSwitchViewModel$special$$inlined$map$5$2$1;
                java.lang.Boolean boolKWHzl;
                if (continuation instanceof WalletSwitchViewModel$special$$inlined$map$5$2$1) {
                    walletSwitchViewModel$special$$inlined$map$5$2$1 = (WalletSwitchViewModel$special$$inlined$map$5$2$1) continuation;
                    int i = walletSwitchViewModel$special$$inlined$map$5$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        walletSwitchViewModel$special$$inlined$map$5$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        walletSwitchViewModel$special$$inlined$map$5$2$1 = new WalletSwitchViewModel$special$$inlined$map$5$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = walletSwitchViewModel$special$$inlined$map$5$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = walletSwitchViewModel$special$$inlined$map$5$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode = (CurrentWalletSwitchNetworkMode) obj;
                    if (Intrinsics.EZpvd(currentWalletSwitchNetworkMode, CurrentWalletSwitchNetworkMode.Ignored.OLrzqt) || (currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.SingleNetwork)) {
                        boolKWHzl = C56443yFo.KWHzl(false);
                    } else {
                        boolKWHzl = currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.MultipleNetworks ? C56443yFo.KWHzl(true) : null;
                    }
                    walletSwitchViewModel$special$$inlined$map$5$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, walletSwitchViewModel$special$$inlined$map$5$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Fragment(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Boolean> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.fSa$FragmentManager */
    public static final class FragmentManager implements Flow<java.lang.Boolean> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.fSa$FragmentManager$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WalletSwitchViewModel$special$$inlined$map$4$2$1 walletSwitchViewModel$special$$inlined$map$4$2$1;
                java.lang.Boolean boolKWHzl;
                if (continuation instanceof WalletSwitchViewModel$special$$inlined$map$4$2$1) {
                    walletSwitchViewModel$special$$inlined$map$4$2$1 = (WalletSwitchViewModel$special$$inlined$map$4$2$1) continuation;
                    int i = walletSwitchViewModel$special$$inlined$map$4$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        walletSwitchViewModel$special$$inlined$map$4$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        walletSwitchViewModel$special$$inlined$map$4$2$1 = new WalletSwitchViewModel$special$$inlined$map$4$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = walletSwitchViewModel$special$$inlined$map$4$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = walletSwitchViewModel$special$$inlined$map$4$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode = (CurrentWalletSwitchNetworkMode) obj;
                    if (Intrinsics.EZpvd(currentWalletSwitchNetworkMode, CurrentWalletSwitchNetworkMode.Ignored.OLrzqt)) {
                        boolKWHzl = C56443yFo.KWHzl(false);
                    } else {
                        boolKWHzl = ((currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.SingleNetwork) || (currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.MultipleNetworks)) ? C56443yFo.KWHzl(true) : null;
                    }
                    walletSwitchViewModel$special$$inlined$map$4$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, walletSwitchViewModel$special$$inlined$map$4$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public FragmentManager(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Boolean> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.fSa$TaskDescription */
    public static final class TaskDescription implements Flow<java.lang.Boolean> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.fSa$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WalletSwitchViewModel$special$$inlined$map$1$2$1 walletSwitchViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof WalletSwitchViewModel$special$$inlined$map$1$2$1) {
                    walletSwitchViewModel$special$$inlined$map$1$2$1 = (WalletSwitchViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = walletSwitchViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        walletSwitchViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        walletSwitchViewModel$special$$inlined$map$1$2$1 = new WalletSwitchViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = walletSwitchViewModel$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = walletSwitchViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(((java.lang.Number) obj).intValue() > 10);
                    walletSwitchViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, walletSwitchViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Boolean> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r8v0 androidx.lifecycle.SavedStateHandle)
  (r9v0 o.fRt)
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r10v0 kotlin.jvm.functions.Function2))
  (wrap:o.fRv:0x0011: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fRv:0x000e: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:73) call: o.fRv.<init>():void type: CONSTRUCTOR) : (r11v0 o.fRv))
  (wrap:o.eCg:?: TERNARY null = ((wrap:int:0x0012: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.eCg:0x0019: CONSTRUCTOR (null o.eCh), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(o.eCh, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:74) call: o.eCg.<init>(o.eCh, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r12v0 o.eCg))
 A[MD:(androidx.lifecycle.SavedStateHandle, o.fRt, kotlin.jvm.functions.Function2<? super o.bbJ, ? super java.lang.Long, java.lang.Boolean>, o.fRv, o.eCg):void (m)] (LINE:69) call: o.fSa.<init>(androidx.lifecycle.SavedStateHandle, o.fRt, kotlin.jvm.functions.Function2, o.fRv, o.eCg):void type: THIS */
    public /* synthetic */ C17781fSa(SavedStateHandle savedStateHandle, InterfaceC17773fRt interfaceC17773fRt, Function2 function2, C17775fRv c17775fRv, C15274eCg c15274eCg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateHandle, interfaceC17773fRt, (i & 4) != 0 ? null : function2, (i & 8) != 0 ? new C17775fRv() : c17775fRv, (i & 16) != 0 ? new C15274eCg(null, 1, null) : c15274eCg);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function2<? super o.bbJ, ? super java.lang.Long, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17781fSa(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC17773fRt interfaceC17773fRt, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> function2, @NotNull C17775fRv c17775fRv, @NotNull C15274eCg c15274eCg) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC17773fRt, "");
        Intrinsics.checkNotNullParameter(c17775fRv, "");
        Intrinsics.checkNotNullParameter(c15274eCg, "");
        this.AwvSrB = interfaceC17773fRt;
        this.AuCTel = function2;
        this.zLjUOn = c17775fRv;
        this.fARcdN = c15274eCg;
        CurrentWalletSwitchConfig currentWalletSwitchConfig = (CurrentWalletSwitchConfig) savedStateHandle.get("CURRENT_WALLET_SWITCH_CONFIG");
        this.AhwBna = currentWalletSwitchConfig;
        java.util.List<UnsupportedWalletType> list = (java.util.List) savedStateHandle.get("UNSUPPORTED_WALLET_TYPES");
        this.AuCTelauCTel = list == null ? yDY.AhwBna() : list;
        this.fJNWhG = fRA.OLrzqt.OLrzqt(currentWalletSwitchConfig != null ? currentWalletSwitchConfig.copydefault() : null);
        this.AYXKKw = new LinkedHashSet();
        MutableStateFlow<java.lang.Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.gEmmrt = MutableStateFlow;
        MutableStateFlow<java.util.List<fDL<? extends java.lang.Object>>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow2;
        this.zuBGHE = FlowKt.asStateFlow(MutableStateFlow2);
        TaskDescription taskDescription = new TaskDescription(MutableStateFlow);
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        C14691dqI c14691dqI = C14691dqI.EZpvd;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.zsXlph = FlowKt.stateIn(taskDescription, viewModelScope, c14691dqI, bool);
        MutableStateFlow<CurrentWalletSwitchNetworkMode> MutableStateFlow3 = StateFlowKt.MutableStateFlow(currentWalletSwitchConfig != null ? currentWalletSwitchConfig.copydefault() : null);
        this.EZpvd = MutableStateFlow3;
        this.uzCIH = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<CurrentWalletSelectMode> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow4;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow4);
        StateFlow<java.lang.Long> stateFlowStateIn = FlowKt.stateIn(new ActionBar(MutableStateFlow3), ViewModelKt.getViewModelScope(this), c14691dqI, Long.MIN_VALUE);
        this.valueOf = stateFlowStateIn;
        this.djBIcL = FlowKt.stateIn(new Application(stateFlowStateIn, this), ViewModelKt.getViewModelScope(this), c14691dqI, null);
        this.getFieldNames = FlowKt.stateIn(new FragmentManager(MutableStateFlow3), ViewModelKt.getViewModelScope(this), c14691dqI, null);
        this.getNewProxyInstance = FlowKt.stateIn(new Fragment(MutableStateFlow3), ViewModelKt.getViewModelScope(this), c14691dqI, null);
        this.fIwbmz = new C17776fRw<>(new WalletSwitchViewModel$filterWalletsCache$1(null), new WalletSwitchViewModel$filterWalletsCache$2(this, null));
        this.iwGUEr = new C17776fRw<>(new WalletSwitchViewModel$refreshMpcWalletCache$1(null), new WalletSwitchViewModel$refreshMpcWalletCache$2(this, null));
        MutableStateFlow<java.lang.Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(bool);
        this.AEQbTJ = MutableStateFlow5;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow5);
        MutableSharedFlow<InterfaceC9738bbJ> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.hDKMBd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        copydefault((Function1<? super Continuation<? super Unit>, ? extends java.lang.Object>) new WalletSwitchViewModel$1(this, null));
    }

    public final StateListAnimator fIwbmz() {
        InterfaceC9738bbJ interfaceC9738bbJ = this.values;
        InterfaceC9738bbJ interfaceC9738bbJ2 = this.AubY;
        java.lang.Long l = this.wlaJM;
        if (interfaceC9738bbJ == null && interfaceC9738bbJ2 == null && l != null) {
            return new StateListAnimator.Application(l.longValue());
        }
        if (interfaceC9738bbJ2 == null && interfaceC9738bbJ != null && l != null && interfaceC9738bbJ.EZpvd(l)) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) interfaceC9738bbJ;
            CurrentWalletSwitchNetworkMode value = this.EZpvd.getValue();
            if (value == null) {
                value = CurrentWalletSwitchNetworkMode.Ignored.OLrzqt;
            }
            if (copydefault(abstractC12782ctV, value)) {
                return new StateListAnimator.Application(l.longValue());
            }
        }
        if (l == null && interfaceC9738bbJ2 != null) {
            return new StateListAnimator.Activity(interfaceC9738bbJ2);
        }
        if (l != null && interfaceC9738bbJ2 != null) {
            return new StateListAnimator.TaskDescription(interfaceC9738bbJ2, l.longValue());
        }
        return StateListAnimator.C0845StateListAnimator.EZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletSwitchViewModel$fetchInitialWalletData$1 walletSwitchViewModel$fetchInitialWalletData$1;
        C17781fSa c17781fSa;
        if (continuation instanceof WalletSwitchViewModel$fetchInitialWalletData$1) {
            walletSwitchViewModel$fetchInitialWalletData$1 = (WalletSwitchViewModel$fetchInitialWalletData$1) continuation;
            int i = walletSwitchViewModel$fetchInitialWalletData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSwitchViewModel$fetchInitialWalletData$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSwitchViewModel$fetchInitialWalletData$1 = new WalletSwitchViewModel$fetchInitialWalletData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletSwitchViewModel$fetchInitialWalletData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSwitchViewModel$fetchInitialWalletData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            WalletSwitchViewModel$fetchInitialWalletData$data$1 walletSwitchViewModel$fetchInitialWalletData$data$1 = new WalletSwitchViewModel$fetchInitialWalletData$data$1(this, null);
            walletSwitchViewModel$fetchInitialWalletData$1.L$0 = this;
            walletSwitchViewModel$fetchInitialWalletData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, walletSwitchViewModel$fetchInitialWalletData$data$1, walletSwitchViewModel$fetchInitialWalletData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c17781fSa = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                return Unit.INSTANCE;
            }
            c17781fSa = (C17781fSa) walletSwitchViewModel$fetchInitialWalletData$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        c17781fSa.OLrzqt.setValue((java.util.List) objWithContext);
        C17776fRw<java.lang.Object> c17776fRw = c17781fSa.iwGUEr;
        walletSwitchViewModel$fetchInitialWalletData$1.L$0 = null;
        walletSwitchViewModel$fetchInitialWalletData$1.label = 2;
        if (c17776fRw.copydefault(walletSwitchViewModel$fetchInitialWalletData$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3ChangeWallet_Sheet_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.fRX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17781fSa.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("available_wallets", str, true);
        return Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(Continuation<? super java.util.List<? extends AbstractC12784ctX>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletSwitchViewModel$getAllSupportedRootWallets$2(this, null), continuation);
    }

    public final void fJNWhG() {
        copydefault((Function1<? super Continuation<? super Unit>, ? extends java.lang.Object>) new WalletSwitchViewModel$refreshAllData$1(this, null));
    }

    public final void getNewProxyInstance() {
        copydefault((Function1<? super Continuation<? super Unit>, ? extends java.lang.Object>) new WalletSwitchViewModel$refreshWalletAssetData$1(this, null));
    }

    public final void iwGUEr() {
        this.fIwbmz.OLrzqt();
        OLrzqt();
    }

    public final void ejfBZ() {
        this.iwGUEr.OLrzqt();
        OLrzqt();
    }

    public final void KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        copydefault((Function1<? super Continuation<? super Unit>, ? extends java.lang.Object>) new WalletSwitchViewModel$changeMainWallet$1(abstractC12782ctV, this, null));
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault((Function1<? super Continuation<? super Unit>, ? extends java.lang.Object>) new WalletSwitchViewModel$selectWalletOnMainSet$1(this, str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<? extends AbstractC12784ctX> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletSwitchViewModel$fetchEIP7702WalletStatus$1 walletSwitchViewModel$fetchEIP7702WalletStatus$1;
        java.lang.Object objKWHzl;
        C17781fSa c17781fSa;
        if (continuation instanceof WalletSwitchViewModel$fetchEIP7702WalletStatus$1) {
            walletSwitchViewModel$fetchEIP7702WalletStatus$1 = (WalletSwitchViewModel$fetchEIP7702WalletStatus$1) continuation;
            int i = walletSwitchViewModel$fetchEIP7702WalletStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSwitchViewModel$fetchEIP7702WalletStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSwitchViewModel$fetchEIP7702WalletStatus$1 = new WalletSwitchViewModel$fetchEIP7702WalletStatus$1(this, continuation);
            }
        }
        java.lang.Object obj = walletSwitchViewModel$fetchEIP7702WalletStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSwitchViewModel$fetchEIP7702WalletStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C15274eCg c15274eCg = this.fARcdN;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.util.List<AbstractC12782ctV> listKWHzl = ((AbstractC12784ctX) it.next()).KWHzl();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                java.util.Iterator<T> it2 = listKWHzl.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((AbstractC12782ctV) it2.next()).DbNXlk());
                }
                arrayList.addAll(arrayList2);
            }
            walletSwitchViewModel$fetchEIP7702WalletStatus$1.L$0 = this;
            walletSwitchViewModel$fetchEIP7702WalletStatus$1.label = 1;
            objKWHzl = c15274eCg.KWHzl(arrayList, false, walletSwitchViewModel$fetchEIP7702WalletStatus$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c17781fSa = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c17781fSa = (C17781fSa) walletSwitchViewModel$fetchEIP7702WalletStatus$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            c17781fSa.isConnected = (java.util.Map) objKWHzl;
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletSwitchViewModel", "refreshWalletStatus", thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(AbstractC12782ctV abstractC12782ctV) {
        this.AwvSrB.OLrzqt(abstractC12782ctV);
        this.AubY = abstractC12782ctV;
        CurrentWalletSelectMode value = this.copydefault.getValue();
        if (value instanceof CurrentWalletSelectMode.WalletSelectedById) {
            this.copydefault.setValue(((CurrentWalletSelectMode.WalletSelectedById) value).EZpvd(abstractC12782ctV.DbNXlk()));
        } else {
            this.copydefault.setValue(new CurrentWalletSelectMode.WalletSelectedById(abstractC12782ctV.DbNXlk()));
        }
        this.AEQbTJ.setValue(java.lang.Boolean.TRUE);
    }

    public final void OLrzqt() {
        copydefault((Function1<? super Continuation<? super Unit>, ? extends java.lang.Object>) new WalletSwitchViewModel$fetchWalletList$1(this, null));
    }

    public final java.lang.String AhwBna() {
        java.lang.String strDjBIcL;
        if (this.djBIcL.getValue() == null) {
            return this.zLjUOn.AEQbTJ();
        }
        C17775fRv c17775fRv = this.zLjUOn;
        InterfaceC9731bbC value = this.djBIcL.getValue();
        if (value == null || (strDjBIcL = value.djBIcL()) == null) {
            strDjBIcL = "";
        }
        return c17775fRv.AEQbTJ(strDjBIcL);
    }

    public final java.util.List<fDL<? extends java.lang.Object>> KWHzl(java.util.List<? extends fDL<? extends java.lang.Object>> list, int i, int i2) {
        CurrentWalletSwitchConfig currentWalletSwitchConfig;
        FunctionConfig functionConfigEZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = i - i2;
        int size = list.size();
        pUU.copydefault("WalletSwitchViewModel " + list.size() + " " + i + " " + i2 + " hideNum " + i3);
        int i4 = 0;
        if (i3 > 0 && (currentWalletSwitchConfig = this.AhwBna) != null && (functionConfigEZpvd = currentWalletSwitchConfig.EZpvd()) != null && !functionConfigEZpvd.copydefault()) {
            if (Intrinsics.EZpvd(this.getFieldNames.getValue(), java.lang.Boolean.TRUE)) {
                copydefault(arrayList);
            }
            arrayList.add(new C17741fQo(this.zLjUOn.AEQbTJ(i3)));
            AEQbTJ(arrayList);
            for (java.lang.Object obj : list) {
                if (i4 < 0) {
                    yDY.AYXKKw();
                }
                arrayList.add((fDL) obj);
                if (i4 < size - 1) {
                    copydefault(arrayList);
                }
                i4++;
            }
        } else if (Intrinsics.EZpvd(this.getFieldNames.getValue(), java.lang.Boolean.TRUE)) {
            for (fDL<? extends java.lang.Object> fdl : list) {
                copydefault(arrayList);
                arrayList.add(fdl);
            }
        } else {
            for (java.lang.Object obj2 : list) {
                if (i4 < 0) {
                    yDY.AYXKKw();
                }
                fDL<? extends java.lang.Object> fdl2 = (fDL) obj2;
                if (i4 != 0) {
                    copydefault(arrayList);
                }
                arrayList.add(fdl2);
                i4++;
            }
        }
        return arrayList;
    }

    public final void AEQbTJ(java.util.List<fDL<? extends java.lang.Object>> list) {
        list.add(C17739fQm.AEQbTJ);
    }

    public final void copydefault(java.util.List<fDL<? extends java.lang.Object>> list) {
        C17739fQm c17739fQm = C17739fQm.AEQbTJ;
        list.add(c17739fQm);
        list.add(new fED());
        list.add(c17739fQm);
    }

    public final java.util.List<fDL<? extends java.lang.Object>> OLrzqt(int i, int i2, java.lang.String str) {
        CurrentWalletSwitchConfig currentWalletSwitchConfig;
        FunctionConfig functionConfigEZpvd;
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (Intrinsics.EZpvd(this.getFieldNames.getValue(), java.lang.Boolean.TRUE)) {
            listOLrzqt.add(C17739fQm.AEQbTJ);
            listOLrzqt.add(new fED());
        }
        int i3 = i - i2;
        if (i3 > 0 && (currentWalletSwitchConfig = this.AhwBna) != null && (functionConfigEZpvd = currentWalletSwitchConfig.EZpvd()) != null && !functionConfigEZpvd.copydefault()) {
            listOLrzqt.add(C17742fQp.AEQbTJ);
            listOLrzqt.add(new C17741fQo(this.zLjUOn.AEQbTJ(i3)));
        }
        listOLrzqt.add(C17739fQm.AEQbTJ);
        listOLrzqt.add(new C17736fQj(str));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final java.lang.Object copydefault(java.util.List<? extends AbstractC12782ctV> list, Continuation<? super Unit> continuation) {
        java.lang.Object objCopydefault = this.AwvSrB.copydefault(list, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.List<? extends AbstractC12784ctX> list, Continuation<? super java.util.List<C17740fQn>> continuation) throws java.lang.Throwable {
        WalletSwitchViewModel$getFilteredWallets$1 walletSwitchViewModel$getFilteredWallets$1;
        final C17781fSa c17781fSa;
        FunctionConfig functionConfigEZpvd;
        FunctionConfig functionConfigEZpvd2;
        CurrentWalletSwitchConfig currentWalletSwitchConfig;
        FunctionConfig functionConfigEZpvd3;
        AbstractC12782ctV abstractC12782ctV;
        MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatusEZpvd;
        if (continuation instanceof WalletSwitchViewModel$getFilteredWallets$1) {
            walletSwitchViewModel$getFilteredWallets$1 = (WalletSwitchViewModel$getFilteredWallets$1) continuation;
            int i = walletSwitchViewModel$getFilteredWallets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSwitchViewModel$getFilteredWallets$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSwitchViewModel$getFilteredWallets$1 = new WalletSwitchViewModel$getFilteredWallets$1(this, continuation);
            }
        }
        java.lang.Object obj = walletSwitchViewModel$getFilteredWallets$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSwitchViewModel$getFilteredWallets$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C17776fRw<java.lang.Object> c17776fRw = this.iwGUEr;
            walletSwitchViewModel$getFilteredWallets$1.L$0 = this;
            walletSwitchViewModel$getFilteredWallets$1.L$1 = list;
            walletSwitchViewModel$getFilteredWallets$1.label = 1;
            if (c17776fRw.copydefault(walletSwitchViewModel$getFilteredWallets$1) == objCopydefault) {
                return objCopydefault;
            }
            c17781fSa = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) walletSwitchViewModel$getFilteredWallets$1.L$1;
            c17781fSa = (C17781fSa) walletSwitchViewModel$getFilteredWallets$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (AbstractC12784ctX abstractC12784ctX : list) {
            java.util.List<AbstractC12782ctV> listZuBGHE = C59467zhb.zuBGHE(C59467zhb.DbNXlk(C59467zhb.DbNXlk(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(abstractC12784ctX.KWHzl()), new Function1() { // from class: o.fRZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C17781fSa.OLrzqt(this.copydefault, (AbstractC12782ctV) obj2));
                }
            }), new Function1() { // from class: o.fSe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C17781fSa.AhwBna(this.copydefault, (AbstractC12782ctV) obj2));
                }
            }), new Function1() { // from class: o.fSg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C17781fSa.valueOf(this.EZpvd, (AbstractC12782ctV) obj2));
                }
            }));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (AbstractC12782ctV abstractC12782ctV2 : listZuBGHE) {
                CurrentWalletSwitchNetworkMode value = c17781fSa.EZpvd.getValue();
                if (value == null) {
                    value = CurrentWalletSwitchNetworkMode.Ignored.OLrzqt;
                }
                CurrentWalletSelectMode value2 = c17781fSa.copydefault.getValue();
                if (value2 == null) {
                    value2 = CurrentWalletSelectMode.MainWalletSelected.KWHzl;
                }
                C56406yEe.KWHzl(arrayList2, c17781fSa.AEQbTJ(abstractC12782ctV2, abstractC12784ctX, value, value2));
            }
            if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
                boolean z = false;
                if (abstractC12784ctX.zLjUOn() && (mpcWalletAbleStatusEZpvd = c17781fSa.AwvSrB.EZpvd((abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(abstractC12784ctX.KWHzl())))) != MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault && mpcWalletAbleStatusEZpvd != MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal && mpcWalletAbleStatusEZpvd != MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoBackUp) {
                    arrayList2.add(0, new C17734fQh(c17781fSa.AEQbTJ(mpcWalletAbleStatusEZpvd, abstractC12782ctV), mpcWalletAbleStatusEZpvd, abstractC12782ctV));
                }
                if (abstractC12784ctX.fJNWhG() == WalletType.HDWallet && abstractC12784ctX.AEQbTJ() && (currentWalletSwitchConfig = c17781fSa.AhwBna) != null && (functionConfigEZpvd3 = currentWalletSwitchConfig.EZpvd()) != null && functionConfigEZpvd3.KWHzl()) {
                    arrayList2.add(new C17424fEv.Activity(abstractC12784ctX));
                }
                CurrentWalletSwitchNetworkMode value3 = c17781fSa.EZpvd.getValue();
                if (value3 == null) {
                    value3 = CurrentWalletSwitchNetworkMode.Ignored.OLrzqt;
                }
                CurrentWalletSwitchConfig currentWalletSwitchConfig2 = c17781fSa.AhwBna;
                java.lang.String strCopydefault = (currentWalletSwitchConfig2 == null || (functionConfigEZpvd2 = currentWalletSwitchConfig2.EZpvd()) == null || !functionConfigEZpvd2.AEQbTJ()) ? null : c17781fSa.copydefault(arrayList2, value3);
                CurrentWalletSwitchConfig currentWalletSwitchConfig3 = c17781fSa.AhwBna;
                if (currentWalletSwitchConfig3 != null && (functionConfigEZpvd = currentWalletSwitchConfig3.EZpvd()) != null && functionConfigEZpvd.OLrzqt()) {
                    z = true;
                }
                C17740fQn c17740fQn = new C17740fQn(arrayList2, abstractC12784ctX, z, strCopydefault);
                c17740fQn.OLrzqt(c17781fSa.AEQbTJ(abstractC12784ctX.EZpvd()));
                arrayList.add(c17740fQn);
            }
        }
        return arrayList;
    }

    public static final boolean OLrzqt(C17781fSa c17781fSa, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return fRA.OLrzqt.EZpvd(abstractC12782ctV, c17781fSa.AuCTelauCTel);
    }

    public static final boolean AhwBna(C17781fSa c17781fSa, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return fRA.OLrzqt.AEQbTJ(abstractC12782ctV, c17781fSa.AwvSrB, c17781fSa.AuCTel, c17781fSa.valueOf.getValue().longValue());
    }

    public static final boolean valueOf(C17781fSa c17781fSa, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return fRA.OLrzqt.OLrzqt(abstractC12782ctV, c17781fSa.valueOf.getValue().longValue());
    }

    public final java.lang.Iterable<java.lang.Object> AEQbTJ(AbstractC12782ctV abstractC12782ctV, AbstractC12784ctX abstractC12784ctX, CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode, CurrentWalletSelectMode currentWalletSelectMode) {
        C17745fQs c17745fQsKWHzl = KWHzl(abstractC12782ctV, currentWalletSwitchNetworkMode, currentWalletSelectMode);
        if (c17745fQsKWHzl.isConnected()) {
            return C56402yEa.EZpvd(c17745fQsKWHzl);
        }
        kotlin.Pair<java.lang.Object, java.lang.Object> pairOLrzqt = OLrzqt(c17745fQsKWHzl, abstractC12784ctX);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (pairOLrzqt.getFirst() != null) {
            java.lang.Object first = pairOLrzqt.getFirst();
            Intrinsics.copydefault(first);
            arrayList.add(first);
        }
        arrayList.add(c17745fQsKWHzl);
        if (pairOLrzqt.getSecond() != null) {
            java.lang.Object second = pairOLrzqt.getSecond();
            Intrinsics.copydefault(second);
            arrayList.add(second);
        }
        return arrayList;
    }

    public final kotlin.Pair<java.lang.Object, java.lang.Object> OLrzqt(C17745fQs c17745fQs, AbstractC12784ctX abstractC12784ctX) {
        AbstractC12782ctV abstractC12782ctVDbNXlk = c17745fQs.DbNXlk();
        if (abstractC12782ctVDbNXlk.AubY()) {
            if (!abstractC12782ctVDbNXlk.zLjUOn()) {
                return C56390yDp.OLrzqt(null, new C17737fQk(abstractC12784ctX));
            }
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(abstractC12784ctX.KWHzl());
            if (Intrinsics.EZpvd((java.lang.Object) (abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null), (java.lang.Object) abstractC12782ctVDbNXlk.DbNXlk())) {
                return C56390yDp.OLrzqt(new C17738fQl(this.zLjUOn.OLrzqt(), c17745fQs.AYXKKw(), abstractC12782ctVDbNXlk), null);
            }
            return C56390yDp.OLrzqt(null, null);
        }
        if (abstractC12782ctVDbNXlk.ORxRYg()) {
            MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatusEZpvd = this.AwvSrB.EZpvd(abstractC12782ctVDbNXlk);
            if (mpcWalletAbleStatusEZpvd == MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoBackUp) {
                return C56390yDp.OLrzqt(null, new C17734fQh(AEQbTJ(mpcWalletAbleStatusEZpvd, abstractC12782ctVDbNXlk), mpcWalletAbleStatusEZpvd, abstractC12782ctVDbNXlk));
            }
            return C56390yDp.OLrzqt(null, null);
        }
        return C56390yDp.OLrzqt(null, null);
    }

    public final java.lang.String AEQbTJ(MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, InterfaceC9738bbJ interfaceC9738bbJ) {
        switch (Activity.EZpvd[mpcWalletAbleStatus.ordinal()]) {
            case 1:
            case 2:
                return "";
            case 3:
                return this.zLjUOn.KWHzl();
            case 4:
                return this.zLjUOn.copydefault();
            case 5:
                return this.zLjUOn.EZpvd();
            case 6:
                return this.zLjUOn.OLrzqt(interfaceC9738bbJ.AkhnZx());
            default:
                return this.AwvSrB.KWHzl(mpcWalletAbleStatus, interfaceC9738bbJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C17745fQs KWHzl(AbstractC12782ctV abstractC12782ctV, CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode, CurrentWalletSelectMode currentWalletSelectMode) {
        boolean z;
        EIP7702WalletStatus eIP7702WalletStatus;
        java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> map;
        fRA fra = fRA.OLrzqt;
        long jOLrzqt = fra.OLrzqt(currentWalletSwitchNetworkMode);
        InterfaceC9731bbC interfaceC9731bbCCopydefault = this.AwvSrB.copydefault(jOLrzqt);
        java.lang.String strAEQbTJ = AEQbTJ(abstractC12782ctV, currentWalletSwitchNetworkMode);
        CurrentWalletSwitchConfig currentWalletSwitchConfig = this.AhwBna;
        if (currentWalletSwitchConfig != null) {
            z = currentWalletSwitchConfig.gEmmrt() == 1;
        }
        boolean zCopydefault = copydefault(abstractC12782ctV, currentWalletSwitchNetworkMode);
        boolean zCopydefault2 = fra.copydefault(abstractC12782ctV, currentWalletSelectMode, this.values);
        long jAhwBna = interfaceC9731bbCCopydefault != null ? interfaceC9731bbCCopydefault.AhwBna() : -1L;
        long jAEQbTJ = interfaceC9731bbCCopydefault != null ? interfaceC9731bbCCopydefault.AEQbTJ() : -1L;
        if (!z || (map = this.isConnected) == null || (eIP7702WalletStatus = map.get(abstractC12782ctV.DbNXlk())) == null) {
            eIP7702WalletStatus = EIP7702WalletStatus.Unknown;
        }
        EIP7702WalletStatus eIP7702WalletStatus2 = eIP7702WalletStatus;
        dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
        return new C17745fQs(abstractC12782ctV, jOLrzqt, strAEQbTJ, zCopydefault, null, null, zCopydefault2, false, jAhwBna, jAEQbTJ, eIP7702WalletStatus2, dtq != null ? dtq.copydefault() : false, CipherSuite.TLS_PSK_WITH_NULL_SHA256, null);
    }

    public final boolean copydefault(AbstractC12782ctV abstractC12782ctV, CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode) {
        fRA fra = fRA.OLrzqt;
        return fra.AEQbTJ(abstractC12782ctV, this.AwvSrB) && !fra.KWHzl(abstractC12782ctV, currentWalletSwitchNetworkMode);
    }

    public final java.lang.String AEQbTJ(AbstractC12782ctV abstractC12782ctV, CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode) {
        if (currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.Ignored) {
            return C54880xYt.formatValuationFromAsset$default(abstractC12782ctV.OLrzqt("opened"), null, false, 0, false, 15, null);
        }
        if (currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.SingleNetwork) {
            return AEQbTJ(abstractC12782ctV, ((CurrentWalletSwitchNetworkMode.SingleNetwork) currentWalletSwitchNetworkMode).AEQbTJ());
        }
        if (!(currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.MultipleNetworks)) {
            throw new NoWhenBranchMatchedException();
        }
        return AEQbTJ(abstractC12782ctV, ((CurrentWalletSwitchNetworkMode.MultipleNetworks) currentWalletSwitchNetworkMode).EZpvd());
    }

    public final java.lang.String AEQbTJ(AbstractC12782ctV abstractC12782ctV, long j) {
        java.lang.String strAYXKKw;
        InterfaceC9731bbC interfaceC9731bbCCopydefault = this.AwvSrB.copydefault(j);
        java.lang.String str = "0";
        if (interfaceC9731bbCCopydefault == null) {
            return "0";
        }
        C17775fRv c17775fRv = this.zLjUOn;
        java.lang.String strFJNWhG = interfaceC9731bbCCopydefault.fJNWhG();
        InterfaceC9742bbN interfaceC9742bbNCopydefault = abstractC12782ctV.copydefault(interfaceC9731bbCCopydefault.AhwBna(), (java.lang.Integer) null, true);
        if (interfaceC9742bbNCopydefault != null && (strAYXKKw = interfaceC9742bbNCopydefault.AYXKKw()) != null) {
            str = strAYXKKw;
        }
        return c17775fRv.copydefault(strFJNWhG, str);
    }

    public final java.lang.String copydefault(java.util.List<? extends java.lang.Object> list, CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode) {
        if (currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.Ignored) {
            BigDecimal bigDecimalAdd = BigDecimal.ZERO;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (obj instanceof C17745fQs) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                BigDecimal bigDecimalFARcdN = C59443zhD.fARcdN(((C17745fQs) it.next()).DbNXlk().OLrzqt("opened"));
                if (bigDecimalFARcdN == null) {
                    bigDecimalFARcdN = BigDecimal.ZERO;
                }
                bigDecimalAdd = bigDecimalAdd.add(bigDecimalFARcdN);
            }
            java.lang.String plainString = bigDecimalAdd.toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "");
            return C54880xYt.formatValuationFromAsset$default(plainString, null, false, 0, false, 15, null);
        }
        if (currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.SingleNetwork) {
            return EZpvd(list, ((CurrentWalletSwitchNetworkMode.SingleNetwork) currentWalletSwitchNetworkMode).AEQbTJ());
        }
        if (!(currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.MultipleNetworks)) {
            throw new NoWhenBranchMatchedException();
        }
        return EZpvd(list, ((CurrentWalletSwitchNetworkMode.MultipleNetworks) currentWalletSwitchNetworkMode).EZpvd());
    }

    public final java.lang.String EZpvd(java.util.List<? extends java.lang.Object> list, long j) {
        BigDecimal bigDecimalFARcdN;
        java.lang.String strAYXKKw;
        InterfaceC9731bbC interfaceC9731bbCCopydefault = this.AwvSrB.copydefault(j);
        if (interfaceC9731bbCCopydefault == null) {
            return "0";
        }
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof C17745fQs) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC9742bbN interfaceC9742bbNCopydefault = ((C17745fQs) it.next()).DbNXlk().copydefault(interfaceC9731bbCCopydefault.AhwBna(), (java.lang.Integer) null, true);
            if (interfaceC9742bbNCopydefault == null || (strAYXKKw = interfaceC9742bbNCopydefault.AYXKKw()) == null || (bigDecimalFARcdN = C59443zhD.fARcdN(strAYXKKw)) == null) {
                bigDecimalFARcdN = BigDecimal.ZERO;
            }
            bigDecimalAdd = bigDecimalAdd.add(bigDecimalFARcdN);
        }
        C17775fRv c17775fRv = this.zLjUOn;
        java.lang.String strFJNWhG = interfaceC9731bbCCopydefault.fJNWhG();
        java.lang.String plainString = bigDecimalAdd.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return c17775fRv.copydefault(strFJNWhG, plainString);
    }

    public final void copydefault(Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletSwitchViewModel$suspendCatchingLaunch$1(function1, null), 3, null);
    }

    public final void AuCTel() {
        this.AEQbTJ.setValue(java.lang.Boolean.FALSE);
    }

    public final java.util.List<UnsupportedWalletType> isConnected() {
        if (!fARcdN()) {
            java.util.List<UnsupportedWalletType> list = this.AuCTelauCTel;
            UnsupportedWalletType unsupportedWalletType = UnsupportedWalletType.MPCWallet;
            if (!list.contains(unsupportedWalletType)) {
                java.util.List<UnsupportedWalletType> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) this.AuCTelauCTel);
                listFJNWhG.add(unsupportedWalletType);
                return listFJNWhG;
            }
        }
        return this.AuCTelauCTel;
    }

    public final boolean fARcdN() {
        InterfaceC9731bbC value = this.djBIcL.getValue();
        if (value == null) {
            return true;
        }
        if (value instanceof C10854bwM) {
            return ((C10854bwM) value).hrNTAI();
        }
        return false;
    }

    public final void EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        copydefault(abstractC12782ctV);
    }

    public final void OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        copydefault((Function1<? super Continuation<? super Unit>, ? extends java.lang.Object>) new WalletSwitchViewModel$onWalletBackup$1(this, abstractC12782ctV, null));
    }

    public final void EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AYXKKw.remove(str);
        } else {
            this.AYXKKw.add(str);
        }
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !this.AYXKKw.contains(str);
    }

    /* JADX INFO: renamed from: o.fSa$StateListAnimator */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fSa.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.fSa$StateListAnimator$Application */
        public static final class Application extends StateListAnimator {
            public final long AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, long j, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = application.AEQbTJ;
                }
                return application.OLrzqt(j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(long j) {
                return new Application(j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && this.AEQbTJ == ((Application) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Long.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "NetworkSelected(generalChainId=" + this.AEQbTJ + ")";
            }

            public Application(long j) {
                super(null);
                this.AEQbTJ = j;
            }
        }

        private StateListAnimator() {
        }

        /* JADX INFO: renamed from: o.fSa$StateListAnimator$Activity */
        public static final class Activity extends StateListAnimator {
            public final InterfaceC9738bbJ AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, InterfaceC9738bbJ interfaceC9738bbJ, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    interfaceC9738bbJ = activity.AEQbTJ;
                }
                return activity.copydefault(interfaceC9738bbJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InterfaceC9738bbJ KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
                Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
                return new Activity(interfaceC9738bbJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.AEQbTJ, ((Activity) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "WalletSelected(wallet=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
                super(null);
                Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
                this.AEQbTJ = interfaceC9738bbJ;
            }
        }

        /* JADX INFO: renamed from: o.fSa$StateListAnimator$TaskDescription */
        public static final class TaskDescription extends StateListAnimator {
            public final InterfaceC9738bbJ KWHzl;
            public final long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, InterfaceC9738bbJ interfaceC9738bbJ, long j, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    interfaceC9738bbJ = taskDescription.KWHzl;
                }
                if ((i & 2) != 0) {
                    j = taskDescription.copydefault;
                }
                return taskDescription.copydefault(interfaceC9738bbJ, j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InterfaceC9738bbJ KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, long j) {
                Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
                return new TaskDescription(interfaceC9738bbJ, j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && this.copydefault == taskDescription.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + java.lang.Long.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "WalletAndNetworkSelected(wallet=" + this.KWHzl + ", generalChainId=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, long j) {
                super(null);
                Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
                this.KWHzl = interfaceC9738bbJ;
                this.copydefault = j;
            }
        }

        /* JADX INFO: renamed from: o.fSa$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0845StateListAnimator extends StateListAnimator {
            public static final C0845StateListAnimator EZpvd = new C0845StateListAnimator();

            private C0845StateListAnimator() {
                super(null);
            }
        }
    }

    public final java.lang.Object AEQbTJ(java.util.List<? extends AbstractC12784ctX> list, Continuation<? super Unit> continuation) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((AbstractC12784ctX) obj).fJNWhG() == WalletType.MPCWallet) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(((AbstractC12784ctX) it.next()).KWHzl()));
        }
        java.lang.Object objCopydefault = copydefault(arrayList2, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    public final void AEQbTJ(long j) {
        CurrentWalletSwitchNetworkMode value;
        CurrentWalletSwitchNetworkMode.MultipleNetworks multipleNetworks;
        MutableStateFlow<CurrentWalletSwitchNetworkMode> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode = value;
            multipleNetworks = currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.MultipleNetworks ? (CurrentWalletSwitchNetworkMode.MultipleNetworks) currentWalletSwitchNetworkMode : null;
        } while (!mutableStateFlow.compareAndSet(value, multipleNetworks != null ? CurrentWalletSwitchNetworkMode.MultipleNetworks.copy$default(multipleNetworks, j, null, null, 6, null) : null));
        this.wlaJM = this.fJNWhG != j ? java.lang.Long.valueOf(j) : null;
        OLrzqt();
    }

    public final int OLrzqt(java.util.List<? extends AbstractC12784ctX> list) {
        java.util.Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((AbstractC12784ctX) it.next()).KWHzl().size();
        }
        return size;
    }

    public final int EZpvd(java.util.List<? extends fDL<? extends java.lang.Object>> list) {
        java.util.Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            fDL fdl = (fDL) it.next();
            if (fdl instanceof C17740fQn) {
                java.util.List<java.lang.Object> listCopydefault = ((C17740fQn) fdl).copydefault();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listCopydefault) {
                    if (obj instanceof C17745fQs) {
                        arrayList.add(obj);
                    }
                }
                size += arrayList.size();
            }
        }
        return size;
    }
}
