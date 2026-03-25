package com.okinc.business.invest_biz.ui.screens.validator_selection.view_model;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorSelectionParams;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C27088job;
import o.C27090jod;
import o.C27493jwI;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23916iOb;
import o.iDH;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ValidatorSelectionViewModel extends ViewModel {
    public final Flow<List<C27090jod>> AEQbTJ;
    public final MutableStateFlow<C27088job> EZpvd;
    public final Flow<List<C27090jod>> KWHzl;
    public final InterfaceC23916iOb OLrzqt;
    public final iDH copydefault;
    public final Flow<C27088job> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<C27088job> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<List<C27090jod>> OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public ValidatorSelectionViewModel(@NotNull iDH idh, @NotNull InterfaceC23916iOb interfaceC23916iOb) {
        Intrinsics.checkNotNullParameter(idh, "");
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        this.copydefault = idh;
        this.OLrzqt = interfaceC23916iOb;
        MutableStateFlow<C27088job> MutableStateFlow = StateFlowKt.MutableStateFlow(new C27088job(null, true, null, 5, null));
        this.EZpvd = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        Activity activity = new Activity(MutableStateFlow);
        this.KWHzl = activity;
        this.AEQbTJ = activity;
    }

    public static final class Activity implements Flow<List<? extends C27090jod>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.validator_selection.view_model.ValidatorSelectionViewModel$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                ValidatorSelectionViewModel$special$$inlined$map$1$2$1 validatorSelectionViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof ValidatorSelectionViewModel$special$$inlined$map$1$2$1) {
                    validatorSelectionViewModel$special$$inlined$map$1$2$1 = (ValidatorSelectionViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = validatorSelectionViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        validatorSelectionViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        validatorSelectionViewModel$special$$inlined$map$1$2$1 = new ValidatorSelectionViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = validatorSelectionViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = validatorSelectionViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    List<C27090jod> listOLrzqt = ((C27088job) obj).OLrzqt();
                    validatorSelectionViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listOLrzqt, validatorSelectionViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends C27090jod>> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final void copydefault(@NotNull ValidatorSelectionParams validatorSelectionParams) {
        Intrinsics.checkNotNullParameter(validatorSelectionParams, "");
        MutableStateFlow<C27088job> mutableStateFlow = this.EZpvd;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new C27088job(null, true, null, 5, null))) {
        }
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ValidatorSelectionViewModel$loadValidators$2(this, validatorSelectionParams, null), 3, null);
    }
}
