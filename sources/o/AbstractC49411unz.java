package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.trade.arch.ui.BaseViewModel$retrieveLatest$1;
import com.okinc.trade.arch.ui.BaseViewModel$updateInner$1;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.InterfaceC49362unC;
import o.InterfaceC49367unH;
import o.InterfaceC49369unJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49411unz<T extends InterfaceC49369unJ<T>> extends ViewModel implements InterfaceC49367unH, InterfaceC49362unC {
    public final Flow<T> ejfBZ;
    public final MutableSharedFlow<T> hDKMBd;
    public volatile T iwGUEr;
    public final InterfaceC56387yDm uzCIH;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<T> DbNXlk() {
        return this.ejfBZ;
    }

    public AbstractC49411unz(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        this.iwGUEr = t;
        MutableSharedFlow<T> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(1, 63, BufferOverflow.SUSPEND);
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(MutableSharedFlow.tryEmit(this.iwGUEr));
        boolValueOf = boolValueOf.booleanValue() ? boolValueOf : null;
        if (boolValueOf != null) {
            boolValueOf.booleanValue();
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(this.iwGUEr);
            }
        } else if (C49372unM.AEQbTJ.copydefault()) {
            Objects.toString(this.iwGUEr);
        }
        this.hDKMBd = MutableSharedFlow;
        this.ejfBZ = FlowKt.asSharedFlow(MutableSharedFlow);
        this.uzCIH = C56392yDr.copydefault(new Function0() { // from class: o.unx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC49411unz.fetchVPNInfo();
            }
        });
    }

    public <T extends InterfaceC49369unJ<T>> java.lang.Object OLrzqt(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Continuation<? super T> continuation) {
        return InterfaceC49367unH.TaskDescription.AEQbTJ(this, abstractC49411unz, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A> java.lang.Object OLrzqt(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Continuation<? super A> continuation) {
        return InterfaceC49367unH.TaskDescription.copydefault(this, abstractC49411unz, interfaceC56560yJx, continuation);
    }

    public <T extends InterfaceC49369unJ<T>> java.lang.Object copydefault(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49367unH.TaskDescription.copydefault(this, abstractC49411unz, function2, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, V> java.lang.Object copydefault(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends InterfaceC49371unL<? extends V>> interfaceC56560yJx, @NotNull Continuation<? super V> continuation) {
        return InterfaceC49367unH.TaskDescription.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, continuation);
    }

    @Override // o.InterfaceC49362unC
    public <T extends InterfaceC49369unJ<T>> Flow<T> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz) {
        return InterfaceC49362unC.Application.OLrzqt(this, abstractC49411unz);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object djBIcL(@NotNull Continuation<? super T> continuation) throws java.lang.Throwable {
        BaseViewModel$retrieveLatest$1 baseViewModel$retrieveLatest$1;
        if (continuation instanceof BaseViewModel$retrieveLatest$1) {
            baseViewModel$retrieveLatest$1 = (BaseViewModel$retrieveLatest$1) continuation;
            int i = baseViewModel$retrieveLatest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseViewModel$retrieveLatest$1.label = i - Integer.MIN_VALUE;
            } else {
                baseViewModel$retrieveLatest$1 = new BaseViewModel$retrieveLatest$1(this, continuation);
            }
        }
        java.lang.Object objStateIn = baseViewModel$retrieveLatest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = baseViewModel$retrieveLatest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objStateIn);
            Flow<T> flow = this.ejfBZ;
            CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
            baseViewModel$retrieveLatest$1.label = 1;
            objStateIn = FlowKt.stateIn(flow, viewModelScope, baseViewModel$retrieveLatest$1);
            if (objStateIn == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objStateIn);
        }
        java.lang.Object value = ((StateFlow) objStateIn).getValue();
        InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) value;
        if (C49372unM.AEQbTJ.copydefault()) {
            Objects.toString(interfaceC49369unJ);
        }
        return value;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Function1<? super T, ? extends T> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        BaseViewModel$updateInner$1 baseViewModel$updateInner$1;
        AbstractC49411unz<T> abstractC49411unz;
        if (continuation instanceof BaseViewModel$updateInner$1) {
            baseViewModel$updateInner$1 = (BaseViewModel$updateInner$1) continuation;
            int i = baseViewModel$updateInner$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseViewModel$updateInner$1.label = i - Integer.MIN_VALUE;
            } else {
                baseViewModel$updateInner$1 = new BaseViewModel$updateInner$1(this, continuation);
            }
        }
        java.lang.Object obj = baseViewModel$updateInner$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = baseViewModel$updateInner$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            int version = this.iwGUEr.getVersion();
            this.iwGUEr = function1.invoke(this.iwGUEr);
            this.iwGUEr.updateVersion(version + 1);
            MutableSharedFlow<T> mutableSharedFlow = this.hDKMBd;
            T t = this.iwGUEr;
            baseViewModel$updateInner$1.L$0 = this;
            baseViewModel$updateInner$1.label = 1;
            if (mutableSharedFlow.emit(t, baseViewModel$updateInner$1) == objCopydefault) {
                return objCopydefault;
            }
            abstractC49411unz = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC49411unz = (AbstractC49411unz) baseViewModel$updateInner$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (C49372unM.AEQbTJ.copydefault()) {
            abstractC49411unz.iwGUEr.getVersion();
            Objects.toString(abstractC49411unz.iwGUEr);
        }
        return Unit.INSTANCE;
    }

    public final <V> java.lang.Object KWHzl(@NotNull InterfaceC56554yJr<T, V> interfaceC56554yJr, V v, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objAEQbTJ = C49366unG.AEQbTJ(this, interfaceC56554yJr, v, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    public static final ConcurrentHashMap fetchVPNInfo() {
        return new ConcurrentHashMap();
    }

    public final ConcurrentHashMap<java.lang.String, Job> AkhnZx() {
        return (ConcurrentHashMap) this.uzCIH.getValue();
    }

    public final void EZpvd(@NotNull Job job, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(job, "");
        Intrinsics.checkNotNullParameter(str, "");
        Job job2 = AkhnZx().get(str);
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
        AkhnZx().put(str, job);
        job.invokeOnCompletion(new Function1() { // from class: o.uny
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC49411unz.copydefault(this.OLrzqt, str, (java.lang.Throwable) obj);
            }
        });
        if (C49372unM.AEQbTJ.copydefault()) {
            Objects.toString(job);
        }
    }

    public static final Unit copydefault(AbstractC49411unz abstractC49411unz, java.lang.String str, java.lang.Throwable th) {
        abstractC49411unz.AkhnZx().remove(str);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull Job job, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(job, "");
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(job, str);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        AkhnZx().clear();
        if (C49372unM.AEQbTJ.copydefault()) {
            Objects.toString(AkhnZx());
        }
    }
}
