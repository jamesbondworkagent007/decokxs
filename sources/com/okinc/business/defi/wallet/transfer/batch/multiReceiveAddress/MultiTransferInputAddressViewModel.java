package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import android.text.Editable;
import android.text.Selection;
import android.view.View;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressWithMemo;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ErrorMessage;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ReceiveAddressSavedInstanceData;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.wallet.widget.input.address.WalletAddressInput;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractActivityC33041mov;
import o.C10854bwM;
import o.C10948byA;
import o.C10954byG;
import o.C13754dXa;
import o.C14722dqn;
import o.C18382fhO;
import o.C33070mpX;
import o.C33129mqd;
import o.C43296rmc;
import o.C52761wXj;
import o.C54862xYb;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56406yEe;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.C56524yIo;
import o.C56548yJl;
import o.C57225yeR;
import o.C57227yeT;
import o.C57287yfa;
import o.C59454zhO;
import o.C59467zhb;
import o.InterfaceC56388yDn;
import o.InterfaceC56445yFq;
import o.InterfaceC56514yIe;
import o.InterfaceC57302yfp;
import o.pUU;
import o.xYW;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class MultiTransferInputAddressViewModel extends ViewModel {
    public ExchangeAddressData AYXKKw;
    public final StateFlow<WalletAddressInput> AhwBna;
    public boolean AkhnZx;
    public final StateFlow<Boolean> AuCTel;
    public Pair<Boolean, Integer> DbNXlk;
    public final StateFlow<ErrorMessage> EZpvd;
    public final Application KWHzl;
    public final C10948byA OLrzqt;
    public final StateFlow<Integer> copydefault;
    public boolean djBIcL;
    public final MutableStateFlow<Boolean> ejfBZ;
    public final Channel<ActionBar> fARcdN;
    public final SavedStateHandle fIwbmz;
    public final StateFlow<Pair<Integer, Boolean>> fJNWhG;
    public final Channel<Companion.LoadingStatus> fetchVPNInfo;
    public final StateFlow<Boolean> gEmmrt;
    public final Channel<Pair<ArrayList<AddressWithMemo>, List<String>>> getNewProxyInstance;
    public final StateFlow<Boolean> isConnected;
    public final Activity uzCIH;
    public final StateFlow<InterfaceC57302yfp> valueOf;
    public MultiTransferSignData values;
    public static final Companion Companion = new Companion(null);
    public static final int AEQbTJ = 8;

    public interface Activity {
        long copydefault();
    }

    public interface Application {
        int EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(MultiTransferSignData multiTransferSignData) {
        this.values = multiTransferSignData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(ExchangeAddressData exchangeAddressData) {
        if (exchangeAddressData != null) {
            this.AYXKKw = exchangeAddressData;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC57302yfp> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AuCTel() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeAddressData EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AkhnZx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ErrorMessage> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(ExchangeAddressData exchangeAddressData) {
        this.AYXKKw = exchangeAddressData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> ejfBZ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> fARcdN() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiTransferSignData fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Pair<Integer, Boolean>> isConnected() {
        return this.fJNWhG;
    }

    public static final class FragmentManager implements Flow<Boolean> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel$FragmentManager$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MultiTransferInputAddressViewModel$special$$inlined$map$3$2$1 multiTransferInputAddressViewModel$special$$inlined$map$3$2$1;
                if (continuation instanceof MultiTransferInputAddressViewModel$special$$inlined$map$3$2$1) {
                    multiTransferInputAddressViewModel$special$$inlined$map$3$2$1 = (MultiTransferInputAddressViewModel$special$$inlined$map$3$2$1) continuation;
                    int i = multiTransferInputAddressViewModel$special$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        multiTransferInputAddressViewModel$special$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        multiTransferInputAddressViewModel$special$$inlined$map$3$2$1 = new MultiTransferInputAddressViewModel$special$$inlined$map$3$2$1(this, continuation);
                    }
                }
                Object obj2 = multiTransferInputAddressViewModel$special$$inlined$map$3$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = multiTransferInputAddressViewModel$special$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    Boolean boolKWHzl = C56443yFo.KWHzl(MultiTransferInputAddressViewModel.Companion.copydefault((WalletAddressInput) obj));
                    multiTransferInputAddressViewModel$special$$inlined$map$3$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, multiTransferInputAddressViewModel$special$$inlined$map$3$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public FragmentManager(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class PendingIntent implements Flow<Boolean> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel$PendingIntent$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MultiTransferInputAddressViewModel$special$$inlined$map$4$2$1 multiTransferInputAddressViewModel$special$$inlined$map$4$2$1;
                if (continuation instanceof MultiTransferInputAddressViewModel$special$$inlined$map$4$2$1) {
                    multiTransferInputAddressViewModel$special$$inlined$map$4$2$1 = (MultiTransferInputAddressViewModel$special$$inlined$map$4$2$1) continuation;
                    int i = multiTransferInputAddressViewModel$special$$inlined$map$4$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        multiTransferInputAddressViewModel$special$$inlined$map$4$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        multiTransferInputAddressViewModel$special$$inlined$map$4$2$1 = new MultiTransferInputAddressViewModel$special$$inlined$map$4$2$1(this, continuation);
                    }
                }
                Object obj2 = multiTransferInputAddressViewModel$special$$inlined$map$4$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = multiTransferInputAddressViewModel$special$$inlined$map$4$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    Boolean boolKWHzl = C56443yFo.KWHzl(MultiTransferInputAddressViewModel.Companion.EZpvd((WalletAddressInput) obj));
                    multiTransferInputAddressViewModel$special$$inlined$map$4$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, multiTransferInputAddressViewModel$special$$inlined$map$4$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public PendingIntent(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator implements Flow<Boolean> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MultiTransferInputAddressViewModel$special$$inlined$map$1$2$1 multiTransferInputAddressViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof MultiTransferInputAddressViewModel$special$$inlined$map$1$2$1) {
                    multiTransferInputAddressViewModel$special$$inlined$map$1$2$1 = (MultiTransferInputAddressViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = multiTransferInputAddressViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        multiTransferInputAddressViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        multiTransferInputAddressViewModel$special$$inlined$map$1$2$1 = new MultiTransferInputAddressViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = multiTransferInputAddressViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = multiTransferInputAddressViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((Boolean) obj).booleanValue());
                    multiTransferInputAddressViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, multiTransferInputAddressViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements Flow<InterfaceC57302yfp> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ MultiTransferInputAddressViewModel EZpvd;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel$TaskDescription$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ MultiTransferInputAddressViewModel OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, MultiTransferInputAddressViewModel multiTransferInputAddressViewModel) {
                this.AEQbTJ = flowCollector;
                this.OLrzqt = multiTransferInputAddressViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MultiTransferInputAddressViewModel$special$$inlined$map$2$2$1 multiTransferInputAddressViewModel$special$$inlined$map$2$2$1;
                if (continuation instanceof MultiTransferInputAddressViewModel$special$$inlined$map$2$2$1) {
                    multiTransferInputAddressViewModel$special$$inlined$map$2$2$1 = (MultiTransferInputAddressViewModel$special$$inlined$map$2$2$1) continuation;
                    int i = multiTransferInputAddressViewModel$special$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        multiTransferInputAddressViewModel$special$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        multiTransferInputAddressViewModel$special$$inlined$map$2$2$1 = new MultiTransferInputAddressViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = multiTransferInputAddressViewModel$special$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = multiTransferInputAddressViewModel$special$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    InterfaceC57302yfp interfaceC57302yfpAEQbTJ = this.OLrzqt.AEQbTJ((WalletAddressInput) obj);
                    multiTransferInputAddressViewModel$special$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(interfaceC57302yfpAEQbTJ, multiTransferInputAddressViewModel$special$$inlined$map$2$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow, MultiTransferInputAddressViewModel multiTransferInputAddressViewModel) {
            this.AEQbTJ = flow;
            this.EZpvd = multiTransferInputAddressViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super InterfaceC57302yfp> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return C52761wXj.Activity.fdOvFl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl(boolean z, boolean z2, boolean z3) {
            return (z2 || z3) ? z ? C13754dXa.Activity.KWHzl : C13754dXa.Activity.OLrzqt : C13754dXa.Activity.EZpvd;
        }

        private Companion() {
        }

        public final /* synthetic */ class ActionBar implements Application, InterfaceC56514yIe {
            public static final ActionBar EZpvd = new ActionBar();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean equals(Object obj) {
                if ((obj instanceof Application) && (obj instanceof InterfaceC56514yIe)) {
                    return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
                }
                return false;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC56514yIe
            public final InterfaceC56388yDn<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(0, View.class, "generateViewId", "generateViewId()I", 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel.Application
            public final int EZpvd() {
                return View.generateViewId();
            }
        }

        public final /* synthetic */ class Application implements Activity, InterfaceC56514yIe {
            public static final Application AEQbTJ = new Application();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean equals(Object obj) {
                if ((obj instanceof Activity) && (obj instanceof InterfaceC56514yIe)) {
                    return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
                }
                return false;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC56514yIe
            public final InterfaceC56388yDn<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel.Activity
            public final long copydefault() {
                return System.currentTimeMillis();
            }
        }

        public static final MultiTransferInputAddressViewModel AEQbTJ(CreationExtras creationExtras) {
            Intrinsics.checkNotNullParameter(creationExtras, "");
            return new MultiTransferInputAddressViewModel(ActionBar.EZpvd, Application.AEQbTJ, C10954byG.EZpvd.valueOf(), SavedStateHandleSupport.createSavedStateHandle(creationExtras));
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: classes15.dex */
        public static final class LoadingStatus {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ LoadingStatus[] $VALUES;
            public static final LoadingStatus FAILED = new LoadingStatus(CardSyncResponse.FAILED, 0);
            public static final LoadingStatus SUCCESS = new LoadingStatus("SUCCESS", 1);
            public static final LoadingStatus LOADING = new LoadingStatus("LOADING", 2);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ LoadingStatus[] $values() {
                return new LoadingStatus[]{FAILED, SUCCESS, LOADING};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<LoadingStatus> getEntries() {
                return $ENTRIES;
            }

            private LoadingStatus(String str, int i) {
            }

            static {
                LoadingStatus[] loadingStatusArr$values = $values();
                $VALUES = loadingStatusArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(loadingStatusArr$values);
            }

            public static LoadingStatus valueOf(String str) {
                return (LoadingStatus) Enum.valueOf(LoadingStatus.class, str);
            }

            public static LoadingStatus[] values() {
                return (LoadingStatus[]) $VALUES.clone();
            }
        }

        public final Pair<String, Integer> copydefault(boolean z, boolean z2, boolean z3) {
            if (!z && !z3) {
                return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ReportDrawnKt), Integer.valueOf(C52761wXj.Activity.DQzvGN));
            }
            if (z2) {
                return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.LocalFullyDrawnReporterOwner), Integer.valueOf(C52761wXj.Activity.gdmIOq));
            }
            return C56390yDp.OLrzqt("", Integer.valueOf(C52761wXj.Activity.fdOvFl));
        }

        public final boolean copydefault(WalletAddressInput walletAddressInput) {
            if (walletAddressInput instanceof WalletAddressInput.OnlyOneAddress) {
                WalletAddressInput.OnlyOneAddress onlyOneAddress = (WalletAddressInput.OnlyOneAddress) walletAddressInput;
                return onlyOneAddress.copydefault().length() > 0 && onlyOneAddress.OLrzqt();
            }
            if (!(walletAddressInput instanceof WalletAddressInput.MultiAddress)) {
                throw new NoWhenBranchMatchedException();
            }
            List<WalletAddressInput.Address> listAEQbTJ = ((WalletAddressInput.MultiAddress) walletAddressInput).AEQbTJ();
            if (!(listAEQbTJ instanceof Collection) || !listAEQbTJ.isEmpty()) {
                for (WalletAddressInput.Address address : listAEQbTJ) {
                    if (!address.OLrzqt() || address.AEQbTJ().length() == 0) {
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[ORIG_RETURN, RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean EZpvd(WalletAddressInput walletAddressInput) {
            if (walletAddressInput instanceof WalletAddressInput.OnlyOneAddress) {
                return ((WalletAddressInput.OnlyOneAddress) walletAddressInput).copydefault().length() > 0;
            }
            if (!(walletAddressInput instanceof WalletAddressInput.MultiAddress)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!((WalletAddressInput.MultiAddress) walletAddressInput).AEQbTJ().isEmpty()) {
            }
        }

        public final ViewModelProvider.Factory EZpvd() {
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(MultiTransferInputAddressViewModel.class), new Function1() { // from class: o.gqt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MultiTransferInputAddressViewModel.Companion.AEQbTJ((CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }

    public MultiTransferInputAddressViewModel(@NotNull Application application, @NotNull Activity activity, @NotNull C10948byA c10948byA, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = application;
        this.uzCIH = activity;
        this.OLrzqt = c10948byA;
        this.fIwbmz = savedStateHandle;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.ejfBZ = MutableStateFlow;
        StateListAnimator stateListAnimator = new StateListAnimator(MutableStateFlow);
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.AuCTel = FlowKt.stateIn(stateListAnimator, viewModelScope, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), bool);
        StateFlow<WalletAddressInput> stateFlow = savedStateHandle.getStateFlow(Web3SecurityTrackEvent.VALUE_INPUT, new WalletAddressInput.OnlyOneAddress("", 0, activity.copydefault(), false, "", false));
        this.AhwBna = stateFlow;
        this.valueOf = FlowKt.stateIn(new TaskDescription(stateFlow, this), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 2, null), AEQbTJ(AYXKKw()));
        FragmentManager fragmentManager = new FragmentManager(stateFlow);
        CoroutineScope viewModelScope2 = ViewModelKt.getViewModelScope(this);
        SharingStarted sharingStartedWhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null);
        Companion companion2 = Companion;
        this.gEmmrt = FlowKt.stateIn(fragmentManager, viewModelScope2, sharingStartedWhileSubscribed$default, Boolean.valueOf(companion2.copydefault(AYXKKw())));
        this.isConnected = FlowKt.stateIn(new PendingIntent(stateFlow), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), Boolean.valueOf(companion2.EZpvd(AYXKKw())));
        this.EZpvd = savedStateHandle.getStateFlow("errorMessage", null);
        this.fJNWhG = savedStateHandle.getStateFlow("pasteOverMaxValue", C56390yDp.OLrzqt(-1, bool));
        this.DbNXlk = C56390yDp.OLrzqt(bool, -1);
        this.copydefault = savedStateHandle.getStateFlow("checkNextAddress", -1);
        this.fARcdN = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.getNewProxyInstance = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.fetchVPNInfo = ChannelKt.Channel$default(0, null, null, 7, null);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public interface ActionBar {

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0325ActionBar implements ActionBar {
            public final List<String> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel$ActionBar$ActionBar */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ C0325ActionBar copy$default(C0325ActionBar c0325ActionBar, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = c0325ActionBar.copydefault;
                }
                return c0325ActionBar.AEQbTJ(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0325ActionBar AEQbTJ(@NotNull List<String> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new C0325ActionBar(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0325ActionBar) && Intrinsics.EZpvd(this.copydefault, ((C0325ActionBar) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ValidMultiAddress(multiAddresses=" + this.copydefault + ")";
            }

            public C0325ActionBar(@NotNull List<String> list) {
                Intrinsics.checkNotNullParameter(list, "");
                this.copydefault = list;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class StateListAnimator implements ActionBar {
            public final String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.EZpvd;
                }
                return stateListAnimator.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((StateListAnimator) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ValidSingleAddress(singleAddress=" + this.EZpvd + ")";
            }

            public StateListAnimator(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Activity implements ActionBar {
            public final int KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = activity.KWHzl;
                }
                return activity.AEQbTJ(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(int i) {
                return new Activity(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && this.KWHzl == ((Activity) obj).KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Integer.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AddressCountInsufficient(fromAddressesSize=" + this.KWHzl + ")";
            }

            public Activity(int i) {
                this.KWHzl = i;
            }
        }
    }

    public final void copydefault(boolean z) {
        this.ejfBZ.setValue(Boolean.valueOf(z));
    }

    public final WalletAddressInput AYXKKw() {
        return this.AhwBna.getValue();
    }

    public final void copydefault(WalletAddressInput walletAddressInput) {
        this.fIwbmz.set(Web3SecurityTrackEvent.VALUE_INPUT, walletAddressInput);
    }

    public final ErrorMessage copydefault() {
        return this.EZpvd.getValue();
    }

    public final void EZpvd(ErrorMessage errorMessage) {
        this.fIwbmz.set("errorMessage", errorMessage);
    }

    public final void KWHzl(Pair<Integer, Boolean> pair) {
        this.fIwbmz.set("pasteOverMaxValue", pair);
    }

    public final void OLrzqt(@NotNull Pair<Integer, Boolean> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        KWHzl(pair);
    }

    public final Integer KWHzl() {
        return this.copydefault.getValue();
    }

    public final void EZpvd(Integer num) {
        this.fIwbmz.set("checkNextAddress", num);
    }

    public final Flow<ActionBar> values() {
        return FlowKt.receiveAsFlow(this.fARcdN);
    }

    public final Flow<Pair<ArrayList<AddressWithMemo>, List<String>>> fIwbmz() {
        return FlowKt.receiveAsFlow(this.getNewProxyInstance);
    }

    public final Flow<Companion.LoadingStatus> gEmmrt() {
        return FlowKt.receiveAsFlow(this.fetchVPNInfo);
    }

    public final InterfaceC57302yfp AEQbTJ(WalletAddressInput walletAddressInput) {
        boolean z = false;
        if (walletAddressInput instanceof WalletAddressInput.OnlyOneAddress) {
            WalletAddressInput.OnlyOneAddress onlyOneAddress = (WalletAddressInput.OnlyOneAddress) walletAddressInput;
            String strCopydefault = onlyOneAddress.copydefault();
            int iEZpvd = onlyOneAddress.EZpvd();
            long jAEQbTJ = onlyOneAddress.AEQbTJ();
            boolean zDjBIcL = onlyOneAddress.djBIcL();
            Companion companion = Companion;
            return new C57287yfa(strCopydefault, iEZpvd, jAEQbTJ, zDjBIcL, companion.copydefault(onlyOneAddress.OLrzqt(), onlyOneAddress.djBIcL(), false).getSecond().intValue(), companion.copydefault(onlyOneAddress.OLrzqt(), onlyOneAddress.djBIcL(), false).getFirst(), (!onlyOneAddress.OLrzqt() || onlyOneAddress.djBIcL()) && onlyOneAddress.copydefault().length() > 0);
        }
        if (!(walletAddressInput instanceof WalletAddressInput.MultiAddress)) {
            throw new NoWhenBranchMatchedException();
        }
        WalletAddressInput.MultiAddress multiAddress = (WalletAddressInput.MultiAddress) walletAddressInput;
        List<WalletAddressInput.Address> listAEQbTJ = multiAddress.AEQbTJ();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        Iterator it = listAEQbTJ.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            WalletAddressInput.Address address = (WalletAddressInput.Address) next;
            boolean z2 = i == multiAddress.OLrzqt() ? true : z;
            int iCopydefault = address.copydefault();
            String strAEQbTJ = address.AEQbTJ();
            int iKWHzl = address.KWHzl();
            int iOLrzqt = multiAddress.OLrzqt();
            Companion companion2 = Companion;
            int iAEQbTJ = companion2.AEQbTJ();
            int iKWHzl2 = companion2.KWHzl(z2, address.OLrzqt(), address.AEQbTJ().length() == 0 ? true : z);
            boolean z3 = ((address.OLrzqt() || address.AEQbTJ().length() <= 0) && !address.djBIcL()) ? z : true;
            boolean zOLrzqt = address.OLrzqt();
            boolean zDjBIcL2 = address.djBIcL();
            if (address.AEQbTJ().length() == 0) {
                z = true;
            }
            arrayList.add(new C57227yeT.TaskDescription(iCopydefault, strAEQbTJ, iKWHzl, i, iOLrzqt, iAEQbTJ, iKWHzl2, companion2.copydefault(address.OLrzqt(), address.djBIcL(), address.AEQbTJ().length() == 0).getSecond().intValue(), companion2.copydefault(zOLrzqt, zDjBIcL2, z).getFirst(), z3, !address.OLrzqt(), address.djBIcL()));
            i++;
            it = it;
            z = false;
        }
        return new C57227yeT(arrayList, multiAddress.copydefault());
    }

    public final void KWHzl(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        AEQbTJ(charSequence);
    }

    public final void EZpvd(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        AEQbTJ(charSequence);
    }

    public final void copydefault(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        AEQbTJ(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01cd A[LOOP:1: B:40:0x01c7->B:42:0x01cd, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(CharSequence charSequence) {
        MultiTransferSignData multiTransferSignData;
        MultiTransferSignData multiTransferSignData2;
        Pair pairOLrzqt;
        WalletAddressInput walletAddressInputAYXKKw;
        ArrayList arrayList;
        Iterator it;
        this.djBIcL = false;
        if (Companion.EZpvd(AYXKKw()) || charSequence.length() <= 0) {
            multiTransferSignData = this.values;
            if (multiTransferSignData != null || multiTransferSignData.getTransferType() != 2) {
                multiTransferSignData2 = this.values;
                if (multiTransferSignData2 == null && multiTransferSignData2.getTransferType() == 3 && C33129mqd.gEmmrt(Integer.valueOf(valueOf().size()), 100)) {
                    pairOLrzqt = C56390yDp.OLrzqt(1, Integer.valueOf(C33129mqd.AhwBna(C54862xYb.AEQbTJ(Integer.valueOf(valueOf().size()), Integer.valueOf(djBIcL().size())))));
                } else {
                    pairOLrzqt = C56390yDp.OLrzqt(0, Integer.valueOf(C33129mqd.AhwBna(C54862xYb.AEQbTJ(100, Integer.valueOf(djBIcL().size())))));
                }
                List listZuBGHE = C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C18382fhO.OLrzqt(charSequence, ((Number) pairOLrzqt.getSecond()).intValue()), new Function1() { // from class: o.gqv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return MultiTransferInputAddressViewModel.EZpvd(this.EZpvd, (java.lang.String) obj);
                    }
                }));
                walletAddressInputAYXKKw = AYXKKw();
                if (!(walletAddressInputAYXKKw instanceof WalletAddressInput.OnlyOneAddress)) {
                    arrayList = new ArrayList();
                    WalletAddressInput walletAddressInputAYXKKw2 = AYXKKw();
                    Intrinsics.copydefault(walletAddressInputAYXKKw2, "");
                    if (((WalletAddressInput.OnlyOneAddress) walletAddressInputAYXKKw2).copydefault().length() > 0) {
                        int iEZpvd = this.KWHzl.EZpvd();
                        WalletAddressInput walletAddressInputAYXKKw3 = AYXKKw();
                        Intrinsics.copydefault(walletAddressInputAYXKKw3, "");
                        String strCopydefault = ((WalletAddressInput.OnlyOneAddress) walletAddressInputAYXKKw3).copydefault();
                        WalletAddressInput walletAddressInputAYXKKw4 = AYXKKw();
                        Intrinsics.copydefault(walletAddressInputAYXKKw4, "");
                        int iEZpvd2 = ((WalletAddressInput.OnlyOneAddress) walletAddressInputAYXKKw4).EZpvd();
                        WalletAddressInput walletAddressInputAYXKKw5 = AYXKKw();
                        Intrinsics.copydefault(walletAddressInputAYXKKw5, "");
                        boolean zOLrzqt = OLrzqt(((WalletAddressInput.OnlyOneAddress) walletAddressInputAYXKKw5).copydefault());
                        WalletAddressInput walletAddressInputAYXKKw6 = AYXKKw();
                        Intrinsics.copydefault(walletAddressInputAYXKKw6, "");
                        arrayList.add(new WalletAddressInput.Address(iEZpvd, strCopydefault, iEZpvd2, zOLrzqt, "", ((WalletAddressInput.OnlyOneAddress) walletAddressInputAYXKKw6).djBIcL()));
                    }
                } else {
                    if (!(walletAddressInputAYXKKw instanceof WalletAddressInput.MultiAddress)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    WalletAddressInput walletAddressInputAYXKKw7 = AYXKKw();
                    Intrinsics.copydefault(walletAddressInputAYXKKw7, "");
                    arrayList2.addAll(((WalletAddressInput.MultiAddress) walletAddressInputAYXKKw7).AEQbTJ());
                    if (C33129mqd.AEQbTJ(Integer.valueOf(arrayList2.size()), 0) && ((WalletAddressInput.Address) CollectionsKt___CollectionsKt.AubY(arrayList2)).AEQbTJ().length() == 0) {
                        C56406yEe.getFieldNames(arrayList2);
                    }
                    arrayList = arrayList2;
                }
                arrayList.addAll(listZuBGHE);
                List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
                it = listAxsJAYsNCnLh.iterator();
                while (it.hasNext()) {
                    ((WalletAddressInput.Address) it.next()).EZpvd("");
                }
                copydefault(new WalletAddressInput.MultiAddress(listAxsJAYsNCnLh, -1, this.uzCIH.copydefault()));
                this.AkhnZx = true;
                KWHzl(C56390yDp.OLrzqt(pairOLrzqt.getFirst(), Boolean.valueOf(C33129mqd.AEQbTJ(Integer.valueOf(C59467zhb.zuBGHE(C18382fhO.OLrzqt(charSequence)).size()), pairOLrzqt.getSecond()))));
                C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onReceiveContent2：input-" + AYXKKw());
                return;
            }
        } else {
            for (int i = 0; i < charSequence.length(); i++) {
                if (CharsKt__CharJVMKt.EZpvd(charSequence.charAt(i))) {
                    multiTransferSignData = this.values;
                    if (multiTransferSignData != null) {
                    }
                    multiTransferSignData2 = this.values;
                    if (multiTransferSignData2 == null) {
                        pairOLrzqt = C56390yDp.OLrzqt(0, Integer.valueOf(C33129mqd.AhwBna(C54862xYb.AEQbTJ(100, Integer.valueOf(djBIcL().size())))));
                    }
                    List listZuBGHE2 = C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C18382fhO.OLrzqt(charSequence, ((Number) pairOLrzqt.getSecond()).intValue()), new Function1() { // from class: o.gqv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return MultiTransferInputAddressViewModel.EZpvd(this.EZpvd, (java.lang.String) obj);
                        }
                    }));
                    walletAddressInputAYXKKw = AYXKKw();
                    if (!(walletAddressInputAYXKKw instanceof WalletAddressInput.OnlyOneAddress)) {
                    }
                    arrayList.addAll(listZuBGHE2);
                    List listAxsJAYsNCnLh2 = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
                    it = listAxsJAYsNCnLh2.iterator();
                    while (it.hasNext()) {
                    }
                    copydefault(new WalletAddressInput.MultiAddress(listAxsJAYsNCnLh2, -1, this.uzCIH.copydefault()));
                    this.AkhnZx = true;
                    KWHzl(C56390yDp.OLrzqt(pairOLrzqt.getFirst(), Boolean.valueOf(C33129mqd.AEQbTJ(Integer.valueOf(C59467zhb.zuBGHE(C18382fhO.OLrzqt(charSequence)).size()), pairOLrzqt.getSecond()))));
                    C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onReceiveContent2：input-" + AYXKKw());
                    return;
                }
            }
        }
        EZpvd((ErrorMessage) null);
        String string = StringsKt__StringsKt.hDKMBd((CharSequence) C14722dqn.OLrzqt.EZpvd().replace(charSequence, " ")).toString();
        copydefault(new WalletAddressInput.OnlyOneAddress(string, string.length(), this.uzCIH.copydefault(), OLrzqt(string), "", false));
        C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onReceiveContent1：input-" + AYXKKw());
    }

    public static final WalletAddressInput.Address EZpvd(MultiTransferInputAddressViewModel multiTransferInputAddressViewModel, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletAddressInput.Address(multiTransferInputAddressViewModel.KWHzl.EZpvd(), str, str.length(), multiTransferInputAddressViewModel.OLrzqt(str), "", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        boolean z;
        MultiTransferSignData multiTransferSignData;
        MultiTransferSignData multiTransferSignData2;
        Character chGHZMYf;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        boolean z2 = false;
        this.djBIcL = false;
        Character chValueOf = null;
        EZpvd((ErrorMessage) null);
        int selectionEnd = Selection.getSelectionEnd(charSequence2);
        boolean z3 = selectionEnd == -1 || selectionEnd == charSequence2.length();
        boolean z4 = charSequence2.length() <= charSequence.length();
        if (!z3 || z4) {
            Editable editableEZpvd = C57225yeR.EZpvd(charSequence2);
            C57225yeR.copydefault(editableEZpvd);
            C14722dqn c14722dqn = C14722dqn.OLrzqt;
            copydefault(new WalletAddressInput.OnlyOneAddress(c14722dqn.EZpvd().replace(editableEZpvd, " "), Selection.getSelectionEnd(editableEZpvd), this.uzCIH.copydefault(), OLrzqt(c14722dqn.EZpvd().replace(editableEZpvd, " ")), "", false));
            C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onSingleAddressChanged1：input-" + AYXKKw());
            return;
        }
        if (charSequence.length() > 0) {
            int i = 0;
            while (true) {
                if (i >= charSequence.length()) {
                    break;
                }
                char cCharAt = charSequence.charAt(i);
                if (!CharsKt__CharJVMKt.EZpvd(cCharAt)) {
                    chValueOf = Character.valueOf(cCharAt);
                    break;
                }
                i++;
            }
            z = chValueOf != null;
        }
        boolean z5 = C33129mqd.OLrzqt((Object) Integer.valueOf(charSequence2.length() - charSequence.length()), (Object) 1) && (chGHZMYf = C59454zhO.gHZMYf(charSequence2)) != null && CharsKt__CharJVMKt.EZpvd(chGHZMYf.charValue()) && z;
        if (C33129mqd.OLrzqt((Object) Integer.valueOf(valueOf().size()), (Object) 1) && (multiTransferSignData2 = this.values) != null && multiTransferSignData2.getTransferType() == 3) {
            z2 = true;
        }
        MultiTransferSignData multiTransferSignData3 = this.values;
        if ((multiTransferSignData3 != null && multiTransferSignData3.getTransferType() == 2) || !z5 || z2) {
            Editable editableEZpvd2 = C57225yeR.EZpvd(charSequence2);
            C57225yeR.copydefault(editableEZpvd2);
            C14722dqn c14722dqn2 = C14722dqn.OLrzqt;
            copydefault(new WalletAddressInput.OnlyOneAddress(c14722dqn2.EZpvd().replace(editableEZpvd2, " "), Selection.getSelectionEnd(editableEZpvd2), this.uzCIH.copydefault(), OLrzqt(c14722dqn2.EZpvd().replace(editableEZpvd2, " ")), "", false));
            if (C33129mqd.OLrzqt((Object) Integer.valueOf(valueOf().size()), (Object) 1) && (multiTransferSignData = this.values) != null && multiTransferSignData.getTransferType() == 3 && z5) {
                KWHzl(C56390yDp.OLrzqt(1, Boolean.TRUE));
            }
            C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onSingleAddressChanged2：input-" + AYXKKw());
            return;
        }
        List<String> listEZpvd = C56402yEa.EZpvd(StringsKt__StringsKt.hDKMBd(charSequence2).toString());
        ArrayList arrayList = new ArrayList();
        for (String str : listEZpvd) {
            arrayList.add(new WalletAddressInput.Address(this.KWHzl.EZpvd(), str, str.length(), OLrzqt(str), "", false));
        }
        Character chGHZMYf2 = C59454zhO.gHZMYf(charSequence2);
        if (chGHZMYf2 != null && CharsKt__CharJVMKt.EZpvd(chGHZMYf2.charValue()) && arrayList.size() < 100) {
            arrayList.add(new WalletAddressInput.Address(this.KWHzl.EZpvd(), "", 0, false, "", false));
        }
        copydefault(new WalletAddressInput.MultiAddress(arrayList, yDY.AuCTel(arrayList), this.uzCIH.copydefault()));
        C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onSingleAddressChanged3：input-" + AYXKKw());
    }

    public final void hDKMBd() {
        this.djBIcL = false;
        EZpvd((ErrorMessage) null);
        EZpvd((Integer) (-1));
        copydefault(new WalletAddressInput.OnlyOneAddress("", 0, this.uzCIH.copydefault(), true, "", false));
        C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onClearContent：input-" + AYXKKw());
    }

    public final void EZpvd(int i, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        EZpvd((ErrorMessage) null);
        this.djBIcL = false;
        WalletAddressInput walletAddressInputAYXKKw = AYXKKw();
        WalletAddressInput.MultiAddress multiAddress = walletAddressInputAYXKKw instanceof WalletAddressInput.MultiAddress ? (WalletAddressInput.MultiAddress) walletAddressInputAYXKKw : null;
        if (multiAddress == null) {
            return;
        }
        if (i < 0 || i >= multiAddress.AEQbTJ().size()) {
            pUU.copydefault("MultiTransferInputAddressViewModel", "onMultiAddressChanged: index " + i + " is out of bounds");
            return;
        }
        int selectionEnd = Selection.getSelectionEnd(charSequence2);
        boolean z = selectionEnd == -1 || selectionEnd == charSequence2.length();
        boolean z2 = charSequence2.length() <= charSequence.length();
        List<WalletAddressInput.Address> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) multiAddress.AEQbTJ());
        if (i == yDY.AuCTel(multiAddress.AEQbTJ())) {
            if (!z || z2) {
                Editable editableEZpvd = C57225yeR.EZpvd(charSequence2);
                for (int iFIwbmz = StringsKt__StringsKt.fIwbmz(editableEZpvd); -1 < iFIwbmz; iFIwbmz--) {
                    if (CharsKt__CharJVMKt.EZpvd(editableEZpvd.charAt(iFIwbmz))) {
                        editableEZpvd.delete(iFIwbmz, iFIwbmz + 1);
                    }
                }
                listFJNWhG.set(i, WalletAddressInput.Address.copy$default(listFJNWhG.get(i), 0, editableEZpvd.toString(), Selection.getSelectionEnd(editableEZpvd), OLrzqt(editableEZpvd.toString()), "", false, 1, null));
                Iterator<T> it = listFJNWhG.iterator();
                while (it.hasNext()) {
                    ((WalletAddressInput.Address) it.next()).EZpvd("");
                }
                copydefault(WalletAddressInput.MultiAddress.copy$default(multiAddress, listFJNWhG, 0, this.uzCIH.copydefault(), 2, null));
                WalletAddressInput walletAddressInputAYXKKw2 = AYXKKw();
                WalletAddressInput walletAddressInputAYXKKw3 = AYXKKw();
                Intrinsics.copydefault(walletAddressInputAYXKKw3, "");
                C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onMultiAddressChanged6：input-" + walletAddressInputAYXKKw2 + ", selectedIndex-" + ((WalletAddressInput.MultiAddress) walletAddressInputAYXKKw3).OLrzqt());
                return;
            }
            String strReplace = C14722dqn.OLrzqt.EZpvd().replace(charSequence2, "");
            listFJNWhG.set(i, WalletAddressInput.Address.copy$default(listFJNWhG.get(i), 0, strReplace, strReplace.length(), OLrzqt(strReplace), "", false, 1, null));
            Iterator<T> it2 = listFJNWhG.iterator();
            while (it2.hasNext()) {
                ((WalletAddressInput.Address) it2.next()).EZpvd("");
            }
            copydefault(WalletAddressInput.MultiAddress.copy$default(multiAddress, listFJNWhG, 0, this.uzCIH.copydefault(), 2, null));
            WalletAddressInput walletAddressInputAYXKKw4 = AYXKKw();
            WalletAddressInput walletAddressInputAYXKKw5 = AYXKKw();
            Intrinsics.copydefault(walletAddressInputAYXKKw5, "");
            C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onMultiAddressChanged7：input-" + walletAddressInputAYXKKw4 + ", selectedIndex-" + ((WalletAddressInput.MultiAddress) walletAddressInputAYXKKw5).OLrzqt());
            return;
        }
        if (!z || z2) {
            Editable editableEZpvd2 = C57225yeR.EZpvd(charSequence2);
            for (int iFIwbmz2 = StringsKt__StringsKt.fIwbmz(editableEZpvd2); -1 < iFIwbmz2; iFIwbmz2--) {
                if (CharsKt__CharJVMKt.EZpvd(editableEZpvd2.charAt(iFIwbmz2))) {
                    editableEZpvd2.delete(iFIwbmz2, iFIwbmz2 + 1);
                }
            }
            listFJNWhG.set(i, WalletAddressInput.Address.copy$default(listFJNWhG.get(i), 0, editableEZpvd2.toString(), Selection.getSelectionEnd(editableEZpvd2), OLrzqt(editableEZpvd2.toString()), "", false, 1, null));
            Iterator<T> it3 = listFJNWhG.iterator();
            while (it3.hasNext()) {
                ((WalletAddressInput.Address) it3.next()).EZpvd("");
            }
            copydefault(WalletAddressInput.MultiAddress.copy$default(multiAddress, listFJNWhG, 0, this.uzCIH.copydefault(), 2, null));
            C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onMultiAddressChanged1：input-" + AYXKKw());
            return;
        }
        String strReplace2 = C14722dqn.OLrzqt.EZpvd().replace(charSequence2, "");
        listFJNWhG.set(i, WalletAddressInput.Address.copy$default(listFJNWhG.get(i), 0, strReplace2, strReplace2.length(), OLrzqt(strReplace2), "", false, 1, null));
        Character chGHZMYf = C59454zhO.gHZMYf(charSequence2);
        if (chGHZMYf != null && CharsKt__CharJVMKt.EZpvd(chGHZMYf.charValue())) {
            int i2 = i + 1;
            WalletAddressInput.Address address = (WalletAddressInput.Address) CollectionsKt___CollectionsKt.AkhnZx(listFJNWhG, i2);
            if (address == null || !StringsKt__StringsKt.fARcdN((CharSequence) address.AEQbTJ())) {
                if (listFJNWhG.size() < 100) {
                    listFJNWhG.add(i2, new WalletAddressInput.Address(this.KWHzl.EZpvd(), "", 0, false, "", false));
                    Iterator<T> it4 = listFJNWhG.iterator();
                    while (it4.hasNext()) {
                        ((WalletAddressInput.Address) it4.next()).EZpvd("");
                    }
                    copydefault(multiAddress.OLrzqt(listFJNWhG, i2, this.uzCIH.copydefault()));
                    C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onMultiAddressChanged3：input-" + AYXKKw() + ", selectedIndex-" + i2);
                    return;
                }
                Iterator<T> it5 = listFJNWhG.iterator();
                while (it5.hasNext()) {
                    ((WalletAddressInput.Address) it5.next()).EZpvd("");
                }
                copydefault(WalletAddressInput.MultiAddress.copy$default(multiAddress, listFJNWhG, 0, this.uzCIH.copydefault(), 2, null));
                WalletAddressInput walletAddressInputAYXKKw6 = AYXKKw();
                WalletAddressInput walletAddressInputAYXKKw7 = AYXKKw();
                Intrinsics.copydefault(walletAddressInputAYXKKw7, "");
                C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onMultiAddressChanged4：input-" + walletAddressInputAYXKKw6 + ", selectedIndex-" + ((WalletAddressInput.MultiAddress) walletAddressInputAYXKKw7).OLrzqt());
                return;
            }
            Iterator<T> it6 = listFJNWhG.iterator();
            while (it6.hasNext()) {
                ((WalletAddressInput.Address) it6.next()).EZpvd("");
            }
            copydefault(multiAddress.OLrzqt(listFJNWhG, i2, this.uzCIH.copydefault()));
            C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onMultiAddressChanged2：input-" + AYXKKw() + ", selectedIndex-" + i2);
            return;
        }
        Iterator<T> it7 = listFJNWhG.iterator();
        while (it7.hasNext()) {
            ((WalletAddressInput.Address) it7.next()).EZpvd("");
        }
        copydefault(WalletAddressInput.MultiAddress.copy$default(multiAddress, listFJNWhG, 0, this.uzCIH.copydefault(), 2, null));
        WalletAddressInput walletAddressInputAYXKKw8 = AYXKKw();
        WalletAddressInput walletAddressInputAYXKKw9 = AYXKKw();
        Intrinsics.copydefault(walletAddressInputAYXKKw9, "");
        C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onMultiAddressChanged5：input-" + walletAddressInputAYXKKw8 + ", selectedIndex-" + ((WalletAddressInput.MultiAddress) walletAddressInputAYXKKw9).OLrzqt());
    }

    public final void KWHzl(int i) {
        WalletAddressInput walletAddressInputAYXKKw = AYXKKw();
        WalletAddressInput.MultiAddress multiAddress = walletAddressInputAYXKKw instanceof WalletAddressInput.MultiAddress ? (WalletAddressInput.MultiAddress) walletAddressInputAYXKKw : null;
        if (multiAddress == null) {
            return;
        }
        if (i < 0 || i >= multiAddress.AEQbTJ().size() || this.AkhnZx) {
            pUU.copydefault("MultiTransferInputAddressViewModel", "onMultiAddressFocusGained: index " + i + " is out of bounds");
            return;
        }
        this.DbNXlk = C56390yDp.OLrzqt(Boolean.valueOf(!multiAddress.AEQbTJ().get(i).OLrzqt()), Integer.valueOf(i));
        List<WalletAddressInput.Address> listAEQbTJ = multiAddress.AEQbTJ();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        int i2 = 0;
        for (Object obj : listAEQbTJ) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            WalletAddressInput.Address addressCopy$default = (WalletAddressInput.Address) obj;
            if (i2 == i) {
                addressCopy$default = WalletAddressInput.Address.copy$default(addressCopy$default, 0, null, -1, false, null, false, 59, null);
            }
            arrayList.add(addressCopy$default);
            i2++;
        }
        copydefault(multiAddress.OLrzqt(arrayList, i, this.uzCIH.copydefault()));
        WalletAddressInput walletAddressInputAYXKKw2 = AYXKKw();
        WalletAddressInput walletAddressInputAYXKKw3 = AYXKKw();
        Intrinsics.copydefault(walletAddressInputAYXKKw3, "");
        C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onMultiAddressFocusGained：input-" + walletAddressInputAYXKKw2 + ", selectedIndex-" + ((WalletAddressInput.MultiAddress) walletAddressInputAYXKKw3).OLrzqt());
    }

    public final void copydefault(@NotNull List<Integer> list, boolean z) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(list, "");
        this.djBIcL = false;
        EZpvd((ErrorMessage) null);
        WalletAddressInput walletAddressInputAYXKKw = AYXKKw();
        WalletAddressInput.MultiAddress multiAddress = walletAddressInputAYXKKw instanceof WalletAddressInput.MultiAddress ? (WalletAddressInput.MultiAddress) walletAddressInputAYXKKw : null;
        if (multiAddress == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int iIntValue = ((Number) obj).intValue();
            if (true ^ (iIntValue >= 0 && iIntValue < multiAddress.AEQbTJ().size())) {
                arrayList.add(obj);
            }
        }
        if (C33129mqd.AEQbTJ(Integer.valueOf(arrayList.size()), 0)) {
            pUU.copydefault("MultiTransferInputAddressViewModel", "onMultiAddressDeleted: index is out of bounds");
            return;
        }
        List<WalletAddressInput.Address> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) multiAddress.AEQbTJ());
        if (listFJNWhG.size() == 1) {
            copydefault(new WalletAddressInput.OnlyOneAddress("", 0, this.uzCIH.copydefault(), false, "", false));
            C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onMultiAddressDeleted1：input-" + AYXKKw());
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        if (!z) {
            int iIntValue2 = ((Number) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).intValue();
            listFJNWhG.remove(iIntValue2);
            iCopydefault = C56548yJl.copydefault(iIntValue2 - 1, 0);
        } else {
            Iterator<T> it = list.iterator();
            iCopydefault = 0;
            while (it.hasNext()) {
                int iIntValue3 = ((Number) it.next()).intValue();
                listFJNWhG.remove(iIntValue3);
                iCopydefault = C56548yJl.copydefault(iIntValue3 - 1, 0);
            }
        }
        listFJNWhG.set(iCopydefault, WalletAddressInput.Address.copy$default(listFJNWhG.get(iCopydefault), 0, null, listFJNWhG.get(iCopydefault).AEQbTJ().length(), false, "", false, 43, null));
        Iterator<T> it2 = listFJNWhG.iterator();
        while (it2.hasNext()) {
            ((WalletAddressInput.Address) it2.next()).EZpvd("");
        }
        copydefault(multiAddress.OLrzqt(listFJNWhG, iCopydefault, this.uzCIH.copydefault()));
        WalletAddressInput walletAddressInputAYXKKw2 = AYXKKw();
        WalletAddressInput walletAddressInputAYXKKw3 = AYXKKw();
        Intrinsics.copydefault(walletAddressInputAYXKKw3, "");
        C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "onMultiAddressDeleted2：input-" + walletAddressInputAYXKKw2 + ", selectedIndex-" + ((WalletAddressInput.MultiAddress) walletAddressInputAYXKKw3).OLrzqt());
    }

    public final ArrayList<String> valueOf() {
        ArrayList<String> fromAddress;
        MultiTransferSignData multiTransferSignData = this.values;
        return (multiTransferSignData == null || (fromAddress = multiTransferSignData.getFromAddress()) == null) ? new ArrayList<>() : fromAddress;
    }

    public final ArrayList<String> djBIcL() {
        ArrayList<String> arrayList = new ArrayList<>();
        WalletAddressInput walletAddressInputAYXKKw = AYXKKw();
        if (walletAddressInputAYXKKw instanceof WalletAddressInput.OnlyOneAddress) {
            WalletAddressInput.OnlyOneAddress onlyOneAddress = (WalletAddressInput.OnlyOneAddress) walletAddressInputAYXKKw;
            if (StringsKt__StringsKt.hDKMBd((CharSequence) onlyOneAddress.copydefault()).toString().length() > 0) {
                arrayList.add(StringsKt__StringsKt.hDKMBd((CharSequence) onlyOneAddress.copydefault()).toString());
            }
        } else {
            if (!(walletAddressInputAYXKKw instanceof WalletAddressInput.MultiAddress)) {
                throw new NoWhenBranchMatchedException();
            }
            List<WalletAddressInput.Address> listAEQbTJ = ((WalletAddressInput.MultiAddress) walletAddressInputAYXKKw).AEQbTJ();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList2.add(((WalletAddressInput.Address) it.next()).AEQbTJ());
            }
            arrayList.addAll(arrayList2);
            if (C33129mqd.AEQbTJ(Integer.valueOf(arrayList.size()), 0) && ((CharSequence) CollectionsKt___CollectionsKt.AubY(arrayList)).length() == 0) {
                C56406yEe.getFieldNames(arrayList);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onStartForExchangeRequest$default(MultiTransferInputAddressViewModel multiTransferInputAddressViewModel, AbstractActivityC33041mov abstractActivityC33041mov, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        multiTransferInputAddressViewModel.EZpvd(abstractActivityC33041mov, (Function1<? super ExchangeAddressData, Unit>) function1);
    }

    public final void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, Function1<? super ExchangeAddressData, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MultiTransferInputAddressViewModel$onStartForExchangeRequest$1(this, abstractActivityC33041mov, function1, null), 3, null);
    }

    public final void getFieldNames() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MultiTransferInputAddressViewModel$onConfirmClicked$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(int i) {
        EZpvd((ErrorMessage) null);
        WalletAddressInput walletAddressInputAYXKKw = AYXKKw();
        WalletAddressInput.MultiAddress multiAddress = walletAddressInputAYXKKw instanceof WalletAddressInput.MultiAddress ? (WalletAddressInput.MultiAddress) walletAddressInputAYXKKw : null;
        if (multiAddress == null) {
            return;
        }
        if (i < 0 || i >= multiAddress.AEQbTJ().size()) {
            pUU.copydefault("MultiTransferInputAddressViewModel", "moveToNextWord: index " + i + " is out of bounds");
            return;
        }
        List<WalletAddressInput.Address> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) multiAddress.AEQbTJ());
        int i2 = i + 1;
        WalletAddressInput.Address address = (WalletAddressInput.Address) CollectionsKt___CollectionsKt.AkhnZx(listFJNWhG, i2);
        if (address == null || address.AEQbTJ().length() != 0) {
            MultiTransferSignData multiTransferSignData = this.values;
            if (multiTransferSignData == null || multiTransferSignData.getTransferType() != 3 || valueOf().size() != djBIcL().size()) {
                if (listFJNWhG.size() < 100) {
                    listFJNWhG.add(i2, new WalletAddressInput.Address(this.KWHzl.EZpvd(), "", 0, false, null, false, 48, null));
                    i = i2;
                } else if (listFJNWhG.size() == 100) {
                    i = -1;
                }
            }
        } else {
            i = i2;
        }
        copydefault(multiAddress.OLrzqt(listFJNWhG, i, this.uzCIH.copydefault()));
        WalletAddressInput walletAddressInputAYXKKw2 = AYXKKw();
        WalletAddressInput walletAddressInputAYXKKw3 = AYXKKw();
        Intrinsics.copydefault(walletAddressInputAYXKKw3, "");
        C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "moveToNextWord：input-" + walletAddressInputAYXKKw2 + ", selectedIndex-" + ((WalletAddressInput.MultiAddress) walletAddressInputAYXKKw3).OLrzqt());
    }

    public final void EZpvd(int i) {
        EZpvd((ErrorMessage) null);
        WalletAddressInput walletAddressInputAYXKKw = AYXKKw();
        WalletAddressInput.MultiAddress multiAddress = walletAddressInputAYXKKw instanceof WalletAddressInput.MultiAddress ? (WalletAddressInput.MultiAddress) walletAddressInputAYXKKw : null;
        if (multiAddress == null) {
            return;
        }
        if (i < 0 || i >= multiAddress.AEQbTJ().size()) {
            pUU.copydefault("MultiTransferInputAddressViewModel", "moveToNextWord: index " + i + " is out of bounds");
            return;
        }
        copydefault(WalletAddressInput.MultiAddress.copy$default(multiAddress, null, i, this.uzCIH.copydefault(), 1, null));
        WalletAddressInput walletAddressInputAYXKKw2 = AYXKKw();
        WalletAddressInput walletAddressInputAYXKKw3 = AYXKKw();
        Intrinsics.copydefault(walletAddressInputAYXKKw3, "");
        C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "moveToOneWord：input-" + walletAddressInputAYXKKw2 + ", selectedIndex-" + ((WalletAddressInput.MultiAddress) walletAddressInputAYXKKw3).OLrzqt());
    }

    public final boolean OLrzqt(String str) {
        C10854bwM c10854bwMKWHzl;
        if (str.length() == 0) {
            return false;
        }
        C10948byA c10948byA = this.OLrzqt;
        MultiTransferSignData multiTransferSignData = this.values;
        if (multiTransferSignData == null || (c10854bwMKWHzl = c10948byA.KWHzl(multiTransferSignData.getCoinId())) == null) {
            return false;
        }
        return xYW.AEQbTJ.AEQbTJ(c10854bwMKWHzl.QKVWgx(), str, c10854bwMKWHzl.iwGUEr());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull ArrayList<Integer> arrayList) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(arrayList, "");
        Integer numKWHzl = KWHzl();
        if ((numKWHzl != null && numKWHzl.intValue() == -1) || Intrinsics.EZpvd(numKWHzl, arrayList.get(arrayList.size() - 1))) {
            iIntValue = arrayList.get(0).intValue();
        } else {
            int iCopydefault = CollectionsKt___CollectionsKt.copydefault((List<? extends Integer>) ((List<? extends Object>) arrayList), KWHzl());
            if (iCopydefault != -1) {
                int i = iCopydefault + 1;
                if (C33129mqd.AEQbTJ(Integer.valueOf(i), Integer.valueOf(arrayList.size() - 1))) {
                    Integer num = arrayList.get(0);
                    Intrinsics.copydefault(num);
                    iIntValue = num.intValue();
                } else {
                    Integer num2 = arrayList.get(i);
                    Intrinsics.copydefault(num2);
                    iIntValue = num2.intValue();
                }
            }
        }
        EZpvd(iIntValue);
        EZpvd(Integer.valueOf(iIntValue));
        C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "moveToNextCheckAddress：input-" + AYXKKw() + ", checkNextAddressIndex-" + KWHzl());
    }

    public final void EZpvd(List<String> list, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MultiTransferInputAddressViewModel$batchCheckTonExchangeAddress$1(this, list, z, null), 3, null);
    }

    public final void AEQbTJ(@NotNull List<AddressWithMemo> list) {
        String memo;
        Intrinsics.checkNotNullParameter(list, "");
        if (AYXKKw() instanceof WalletAddressInput.OnlyOneAddress) {
            WalletAddressInput walletAddressInputAYXKKw = AYXKKw();
            Intrinsics.copydefault(walletAddressInputAYXKKw, "");
            WalletAddressInput.OnlyOneAddress onlyOneAddress = (WalletAddressInput.OnlyOneAddress) walletAddressInputAYXKKw;
            AddressWithMemo addressWithMemo = (AddressWithMemo) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
            copydefault(WalletAddressInput.OnlyOneAddress.copy$default(onlyOneAddress, null, 0, 0L, false, (addressWithMemo == null || (memo = addressWithMemo.getMemo()) == null) ? "" : memo, false, 47, null));
        } else {
            WalletAddressInput walletAddressInputAYXKKw2 = AYXKKw();
            Intrinsics.copydefault(walletAddressInputAYXKKw2, "");
            WalletAddressInput.MultiAddress multiAddressCopy$default = WalletAddressInput.MultiAddress.copy$default((WalletAddressInput.MultiAddress) walletAddressInputAYXKKw2, null, 0, 0L, 7, null);
            for (AddressWithMemo addressWithMemo2 : list) {
                WalletAddressInput.Address address = (WalletAddressInput.Address) CollectionsKt___CollectionsKt.AkhnZx(multiAddressCopy$default.AEQbTJ(), addressWithMemo2.getIndex());
                if (address != null) {
                    address.EZpvd(addressWithMemo2.getMemo());
                }
            }
            copydefault(WalletAddressInput.MultiAddress.copy$default(multiAddressCopy$default, null, 0, 0L, 7, null));
        }
        C43296rmc.KWHzl("MultiTransferInputAddressViewModel", "updateInputListMemo：input-" + AYXKKw());
    }

    public final List<WalletAddressInput.Address> AkhnZx() {
        List<WalletAddressInput.Address> listAEQbTJ;
        WalletAddressInput walletAddressInputAYXKKw = AYXKKw();
        WalletAddressInput.MultiAddress multiAddress = walletAddressInputAYXKKw instanceof WalletAddressInput.MultiAddress ? (WalletAddressInput.MultiAddress) walletAddressInputAYXKKw : null;
        return (multiAddress == null || (listAEQbTJ = multiAddress.AEQbTJ()) == null) ? yDY.AhwBna() : listAEQbTJ;
    }

    public final ReceiveAddressSavedInstanceData fJNWhG() {
        WalletAddressInput walletAddressInputAYXKKw = AYXKKw();
        ErrorMessage errorMessageCopydefault = copydefault();
        boolean z = this.djBIcL;
        Integer numKWHzl = KWHzl();
        return new ReceiveAddressSavedInstanceData(walletAddressInputAYXKKw, errorMessageCopydefault, z, numKWHzl != null ? numKWHzl.intValue() : -1, this.AYXKKw);
    }

    public final void KWHzl(ReceiveAddressSavedInstanceData receiveAddressSavedInstanceData) {
        if (receiveAddressSavedInstanceData != null) {
            copydefault(receiveAddressSavedInstanceData.getInputData());
            EZpvd(Integer.valueOf(receiveAddressSavedInstanceData.getCheckNextAddressIndexData()));
            EZpvd(receiveAddressSavedInstanceData.getErrorMessageData());
            this.djBIcL = receiveAddressSavedInstanceData.getHasTonExchangeAddressData();
            this.AYXKKw = receiveAddressSavedInstanceData.getExchangeAddressData();
        }
    }

    public final String EZpvd(@NotNull String str) {
        ExchangeAddressData exchangeAddressData;
        List<ExchangeAddressData.AddressBean> exChangeAddressList;
        ExchangeAddressData exchangeAddressData2;
        String depositLimit;
        Intrinsics.checkNotNullParameter(str, "");
        ExchangeAddressData exchangeAddressData3 = this.AYXKKw;
        if (exchangeAddressData3 != null && ((exchangeAddressData3 == null || !Intrinsics.EZpvd(exchangeAddressData3.isExchangeSupport(), Boolean.FALSE)) && (exchangeAddressData = this.AYXKKw) != null && (exChangeAddressList = exchangeAddressData.getExChangeAddressList()) != null)) {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(exChangeAddressList, 10));
            Iterator<T> it = exChangeAddressList.iterator();
            while (it.hasNext()) {
                String address = ((ExchangeAddressData.AddressBean) it.next()).getAddress();
                arrayList.add(address != null ? StringsKt__StringsKt.hDKMBd((CharSequence) address).toString() : null);
            }
            if (arrayList.contains(str) && (exchangeAddressData2 = this.AYXKKw) != null && (depositLimit = exchangeAddressData2.getDepositLimit()) != null) {
                return depositLimit;
            }
        }
        return "0";
    }
}
