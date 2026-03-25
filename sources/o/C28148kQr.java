package o;

import com.okinc.business.trade.features.home.advanced.repository.AdvancedAutoSellRepositoryImpl$getTpslRemoteConfig$$inlined$getApiResult$1;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedAutoSellRepositoryImpl$getTpslRemoteConfig$1;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.autosell.data.TPSLRemoteConfigResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class C28148kQr implements InterfaceC28149kQs {
    public final CoroutineDispatcher KWHzl;
    public final kPM OLrzqt;
    public final InterfaceC23234huQ copydefault;

    @yCM
    public C28148kQr(@NotNull kPM kpm, @NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kpm, "");
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = kpm;
        this.copydefault = interfaceC23234huQ;
        this.KWHzl = coroutineDispatcher;
    }

    @Override // o.InterfaceC28149kQs
    public java.lang.Object OLrzqt(@NotNull Continuation<? super java.util.List<? extends AdvancedAutoSellStrategy>> continuation) {
        return this.OLrzqt.EZpvd(continuation);
    }

    @Override // o.InterfaceC28149kQs
    public java.lang.Object copydefault(@NotNull java.util.List<? extends AdvancedAutoSellStrategy> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCopydefault = this.OLrzqt.copydefault(list, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    @Override // o.InterfaceC28149kQs
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.OLrzqt.KWHzl(continuation);
    }

    @Override // o.InterfaceC28149kQs
    public java.lang.Object AEQbTJ(boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEZpvd = this.OLrzqt.EZpvd(z, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    @Override // o.InterfaceC28149kQs
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.OLrzqt.AEQbTJ(continuation);
    }

    @Override // o.InterfaceC28149kQs
    public java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objOLrzqt = this.OLrzqt.OLrzqt(z, continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28149kQs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<TPSLRemoteConfigResponse, OKServerException>> continuation) throws java.lang.Throwable {
        AdvancedAutoSellRepositoryImpl$getTpslRemoteConfig$1 advancedAutoSellRepositoryImpl$getTpslRemoteConfig$1;
        if (continuation instanceof AdvancedAutoSellRepositoryImpl$getTpslRemoteConfig$1) {
            advancedAutoSellRepositoryImpl$getTpslRemoteConfig$1 = (AdvancedAutoSellRepositoryImpl$getTpslRemoteConfig$1) continuation;
            int i = advancedAutoSellRepositoryImpl$getTpslRemoteConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedAutoSellRepositoryImpl$getTpslRemoteConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedAutoSellRepositoryImpl$getTpslRemoteConfig$1 = new AdvancedAutoSellRepositoryImpl$getTpslRemoteConfig$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedAutoSellRepositoryImpl$getTpslRemoteConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedAutoSellRepositoryImpl$getTpslRemoteConfig$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                AdvancedAutoSellRepositoryImpl$getTpslRemoteConfig$$inlined$getApiResult$1 advancedAutoSellRepositoryImpl$getTpslRemoteConfig$$inlined$getApiResult$1 = new AdvancedAutoSellRepositoryImpl$getTpslRemoteConfig$$inlined$getApiResult$1(null, this);
                advancedAutoSellRepositoryImpl$getTpslRemoteConfig$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedAutoSellRepositoryImpl$getTpslRemoteConfig$$inlined$getApiResult$1, advancedAutoSellRepositoryImpl$getTpslRemoteConfig$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }
}
