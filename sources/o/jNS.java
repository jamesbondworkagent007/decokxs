package o;

import com.okinc.business.market.features.coindetail.domain.SniperDetailUseCase$getSniperDetails$1;
import com.okinc.business.market.features.coindetail.domain.SniperDetailUseCase$subscribeSniperDetails$job$1;
import com.okinc.business.market.features.coindetail.domain.models.EarlyBuyers;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jNS {
    public final MutableStateFlow<C26029jPh> AEQbTJ;
    public final java.util.List<Job> EZpvd;
    public final CoroutineScope KWHzl;
    public final jNP OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final InterfaceC25998jOd gEmmrt;
    public final StateFlow<C26029jPh> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C26029jPh> copydefault() {
        return this.valueOf;
    }

    @yCM
    public jNS(@NotNull jNP jnp, @NotNull InterfaceC25998jOd interfaceC25998jOd, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(jnp, "");
        Intrinsics.checkNotNullParameter(interfaceC25998jOd, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = jnp;
        this.gEmmrt = interfaceC25998jOd;
        this.copydefault = coroutineDispatcher;
        MutableStateFlow<C26029jPh> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        this.KWHzl = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.EZpvd = new java.util.ArrayList();
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C22416heu.ejfBZ()) {
            return;
        }
        this.EZpvd.add(C25389ivm.safeLaunch$default(this.KWHzl, null, null, new SniperDetailUseCase$subscribeSniperDetails$job$1(this, str, str2, null), 3, null));
    }

    public final void KWHzl() {
        this.gEmmrt.KWHzl();
        java.util.Iterator<T> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super C26029jPh> continuation) throws java.lang.Throwable {
        SniperDetailUseCase$getSniperDetails$1 sniperDetailUseCase$getSniperDetails$1;
        java.lang.Object objEZpvd;
        jNS jns;
        java.lang.Object objAEQbTJ;
        C26029jPh c26029jPh;
        if (continuation instanceof SniperDetailUseCase$getSniperDetails$1) {
            sniperDetailUseCase$getSniperDetails$1 = (SniperDetailUseCase$getSniperDetails$1) continuation;
            int i = sniperDetailUseCase$getSniperDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sniperDetailUseCase$getSniperDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                sniperDetailUseCase$getSniperDetails$1 = new SniperDetailUseCase$getSniperDetails$1(this, continuation);
            }
        }
        java.lang.Object obj = sniperDetailUseCase$getSniperDetails$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sniperDetailUseCase$getSniperDetails$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25998jOd interfaceC25998jOd = this.gEmmrt;
            sniperDetailUseCase$getSniperDetails$1.L$0 = this;
            sniperDetailUseCase$getSniperDetails$1.label = 1;
            objEZpvd = interfaceC25998jOd.EZpvd(str, str2, sniperDetailUseCase$getSniperDetails$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            jns = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C26029jPh c26029jPh2 = (C26029jPh) sniperDetailUseCase$getSniperDetails$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    return c26029jPh2;
                }
                jns = (jNS) sniperDetailUseCase$getSniperDetails$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                    objAEQbTJ = null;
                }
                c26029jPh = (C26029jPh) objAEQbTJ;
                if (c26029jPh != null) {
                    return null;
                }
                MutableStateFlow<C26029jPh> mutableStateFlow = jns.AEQbTJ;
                sniperDetailUseCase$getSniperDetails$1.L$0 = c26029jPh;
                sniperDetailUseCase$getSniperDetails$1.label = 3;
                return mutableStateFlow.emit(c26029jPh, sniperDetailUseCase$getSniperDetails$1) == objCopydefault ? objCopydefault : c26029jPh;
            }
            jns = (jNS) sniperDetailUseCase$getSniperDetails$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            return null;
        }
        jNP jnp = jns.OLrzqt;
        sniperDetailUseCase$getSniperDetails$1.L$0 = jns;
        sniperDetailUseCase$getSniperDetails$1.label = 2;
        objAEQbTJ = jnp.AEQbTJ((EarlyBuyers) objEZpvd, sniperDetailUseCase$getSniperDetails$1);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
        }
        c26029jPh = (C26029jPh) objAEQbTJ;
        if (c26029jPh != null) {
        }
    }
}
