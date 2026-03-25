package o;

import com.okinc.dexkline.market.features.coindetail.domain.SniperDetailUseCase$getSniperDetails$1;
import com.okinc.dexkline.market.features.coindetail.domain.SniperDetailUseCase$subscribeSniperDetails$job$1;
import com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyers;
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

/* JADX INFO: loaded from: classes8.dex */
public final class mWD {
    public final java.util.List<Job> AEQbTJ;
    public final StateFlow<C32316mXm> AYXKKw;
    public final MutableStateFlow<C32316mXm> EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final mWB OLrzqt;
    public final CoroutineScope copydefault;
    public final mWI valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C32316mXm> EZpvd() {
        return this.AYXKKw;
    }

    @yCM
    public mWD(@NotNull mWB mwb, @NotNull mWI mwi, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(mwb, "");
        Intrinsics.checkNotNullParameter(mwi, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = mwb;
        this.valueOf = mwi;
        this.KWHzl = coroutineDispatcher;
        MutableStateFlow<C32316mXm> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
        this.copydefault = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.AEQbTJ = new java.util.ArrayList();
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ.add(mUR.safeLaunch$default(this.copydefault, null, null, new SniperDetailUseCase$subscribeSniperDetails$job$1(this, str, str2, null), 3, null));
    }

    public final void copydefault() {
        this.valueOf.copydefault();
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
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
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super C32316mXm> continuation) throws java.lang.Throwable {
        SniperDetailUseCase$getSniperDetails$1 sniperDetailUseCase$getSniperDetails$1;
        java.lang.Object objKWHzl;
        mWD mwd;
        java.lang.Object objOLrzqt;
        C32316mXm c32316mXm;
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
            mWI mwi = this.valueOf;
            sniperDetailUseCase$getSniperDetails$1.L$0 = this;
            sniperDetailUseCase$getSniperDetails$1.label = 1;
            objKWHzl = mwi.KWHzl(str, str2, sniperDetailUseCase$getSniperDetails$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            mwd = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32316mXm c32316mXm2 = (C32316mXm) sniperDetailUseCase$getSniperDetails$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    return c32316mXm2;
                }
                mwd = (mWD) sniperDetailUseCase$getSniperDetails$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objOLrzqt)) {
                    objOLrzqt = null;
                }
                c32316mXm = (C32316mXm) objOLrzqt;
                if (c32316mXm != null) {
                    return null;
                }
                MutableStateFlow<C32316mXm> mutableStateFlow = mwd.EZpvd;
                sniperDetailUseCase$getSniperDetails$1.L$0 = c32316mXm;
                sniperDetailUseCase$getSniperDetails$1.label = 3;
                return mutableStateFlow.emit(c32316mXm, sniperDetailUseCase$getSniperDetails$1) == objCopydefault ? objCopydefault : c32316mXm;
            }
            mwd = (mWD) sniperDetailUseCase$getSniperDetails$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            return null;
        }
        mWB mwb = mwd.OLrzqt;
        sniperDetailUseCase$getSniperDetails$1.L$0 = mwd;
        sniperDetailUseCase$getSniperDetails$1.label = 2;
        objOLrzqt = mwb.OLrzqt((EarlyBuyers) objKWHzl, sniperDetailUseCase$getSniperDetails$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
        }
        c32316mXm = (C32316mXm) objOLrzqt;
        if (c32316mXm != null) {
        }
    }
}
