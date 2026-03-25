package com.okinc.business.defi.wallet.passkey.cedefi.update.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.OrderStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C17654fNi;
import o.C56391yDq;
import o.C56442yFn;
import o.C9767bbm;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ScanResultViewModel extends ViewModel {
    public final Flow<OrderStatus> OLrzqt;
    public final String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<OrderStatus> AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public ScanResultViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C17654fNi c17654fNi) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c17654fNi, "");
        String str = (String) savedStateHandle.get("extra_uop_hash");
        this.copydefault = str != null ? str : "";
        this.OLrzqt = new StateListAnimator(new ActionBar(c17654fNi.OLrzqt(), this));
    }

    public static final class ActionBar implements Flow<C9767bbm> {
        public final /* synthetic */ ScanResultViewModel EZpvd;
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.update.viewmodel.ScanResultViewModel$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ ScanResultViewModel OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, ScanResultViewModel scanResultViewModel) {
                this.KWHzl = flowCollector;
                this.OLrzqt = scanResultViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                ScanResultViewModel$special$$inlined$filter$1$2$1 scanResultViewModel$special$$inlined$filter$1$2$1;
                if (continuation instanceof ScanResultViewModel$special$$inlined$filter$1$2$1) {
                    scanResultViewModel$special$$inlined$filter$1$2$1 = (ScanResultViewModel$special$$inlined$filter$1$2$1) continuation;
                    int i = scanResultViewModel$special$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        scanResultViewModel$special$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        scanResultViewModel$special$$inlined$filter$1$2$1 = new ScanResultViewModel$special$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = scanResultViewModel$special$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = scanResultViewModel$special$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    if (Intrinsics.EZpvd((Object) ((C9767bbm) obj).copydefault(), (Object) this.OLrzqt.copydefault)) {
                        scanResultViewModel$special$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, scanResultViewModel$special$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
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

        public ActionBar(Flow flow, ScanResultViewModel scanResultViewModel) {
            this.KWHzl = flow;
            this.EZpvd = scanResultViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super C9767bbm> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator implements Flow<OrderStatus> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.update.viewmodel.ScanResultViewModel$StateListAnimator$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                ScanResultViewModel$special$$inlined$map$1$2$1 scanResultViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof ScanResultViewModel$special$$inlined$map$1$2$1) {
                    scanResultViewModel$special$$inlined$map$1$2$1 = (ScanResultViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = scanResultViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        scanResultViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        scanResultViewModel$special$$inlined$map$1$2$1 = new ScanResultViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = scanResultViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = scanResultViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    OrderStatus orderStatusOLrzqt = ((C9767bbm) obj).OLrzqt();
                    scanResultViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(orderStatusOLrzqt, scanResultViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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
        public Object collect(FlowCollector<? super OrderStatus> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
