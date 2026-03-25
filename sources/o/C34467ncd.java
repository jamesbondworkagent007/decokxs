package o;

import com.okinc.dexkline.market.features.position.domain.GetLatestPnLUseCase$dismissAlert$1;
import com.okinc.dexkline.market.features.position.domain.GetLatestPnLUseCase$invoke$1;
import com.okinc.dexkline.market.features.position.domain.GetLatestPnLUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.position.domain.GetLatestPnLUseCase$shouldShowBanner$1;
import com.okinc.dexkline.market.features.position.ui.PositionDetailsParam;
import com.okinc.dexkline.market.features.position.ui.widget.PnLDetailsUiModel;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.xHC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ncd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34467ncd {
    public final StateFlow<PnLDetailsUiModel> AEQbTJ;
    public final CoroutineScope AYXKKw;
    public final CoroutineDispatcher EZpvd;
    public final MutableStateFlow<PnLDetailsUiModel> KWHzl;
    public final C32272mVw OLrzqt;
    public final C34477ncn copydefault;
    public final C34587ner djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<PnLDetailsUiModel> OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public C34467ncd(@NotNull C34587ner c34587ner, @NotNull C34477ncn c34477ncn, @NotNull C32272mVw c32272mVw, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c34587ner, "");
        Intrinsics.checkNotNullParameter(c34477ncn, "");
        Intrinsics.checkNotNullParameter(c32272mVw, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.djBIcL = c34587ner;
        this.copydefault = c34477ncn;
        this.OLrzqt = c32272mVw;
        this.EZpvd = coroutineDispatcher;
        MutableStateFlow<PnLDetailsUiModel> MutableStateFlow = StateFlowKt.MutableStateFlow(new PnLDetailsUiModel(false, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null));
        this.KWHzl = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        this.AYXKKw = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
    }

    /* JADX INFO: renamed from: invoke-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8696invoke0E7RQCE$default(C34467ncd c34467ncd, xHC.ActionBar actionBar, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return c34467ncd.AEQbTJ(actionBar, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull xHC.ActionBar actionBar, @NotNull java.lang.String str, @NotNull Continuation<? super Result<PnLDetailsUiModel>> continuation) throws java.lang.Throwable {
        GetLatestPnLUseCase$invoke$1 getLatestPnLUseCase$invoke$1;
        if (continuation instanceof GetLatestPnLUseCase$invoke$1) {
            getLatestPnLUseCase$invoke$1 = (GetLatestPnLUseCase$invoke$1) continuation;
            int i = getLatestPnLUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLatestPnLUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getLatestPnLUseCase$invoke$1 = new GetLatestPnLUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getLatestPnLUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getLatestPnLUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetLatestPnLUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 getLatestPnLUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new GetLatestPnLUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, actionBar, this);
            getLatestPnLUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getLatestPnLUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, getLatestPnLUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull PositionDetailsParam positionDetailsParam, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        GetLatestPnLUseCase$shouldShowBanner$1 getLatestPnLUseCase$shouldShowBanner$1;
        java.lang.Object objCopydefault;
        C34467ncd c34467ncd;
        if (continuation instanceof GetLatestPnLUseCase$shouldShowBanner$1) {
            getLatestPnLUseCase$shouldShowBanner$1 = (GetLatestPnLUseCase$shouldShowBanner$1) continuation;
            int i = getLatestPnLUseCase$shouldShowBanner$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLatestPnLUseCase$shouldShowBanner$1.label = i - Integer.MIN_VALUE;
            } else {
                getLatestPnLUseCase$shouldShowBanner$1 = new GetLatestPnLUseCase$shouldShowBanner$1(this, continuation);
            }
        }
        java.lang.Object obj = getLatestPnLUseCase$shouldShowBanner$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getLatestPnLUseCase$shouldShowBanner$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String str = AEQbTJ(positionDetailsParam.getChainId()) + "-" + positionDetailsParam.getTokenAddress();
            C32272mVw c32272mVw = this.OLrzqt;
            KSerializer<java.lang.Boolean> kSerializerSerializer = BuiltinSerializersKt.serializer(yHW.OLrzqt);
            getLatestPnLUseCase$shouldShowBanner$1.L$0 = this;
            getLatestPnLUseCase$shouldShowBanner$1.label = 1;
            objCopydefault = c32272mVw.copydefault(str, kSerializerSerializer, getLatestPnLUseCase$shouldShowBanner$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c34467ncd = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c34467ncd = (C34467ncd) getLatestPnLUseCase$shouldShowBanner$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = boolKWHzl;
        }
        return C56443yFo.KWHzl((c34467ncd.KWHzl.getValue().AEQbTJ() || ((java.lang.Boolean) objCopydefault).booleanValue()) ? false : true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull PositionDetailsParam positionDetailsParam, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GetLatestPnLUseCase$dismissAlert$1 getLatestPnLUseCase$dismissAlert$1;
        if (continuation instanceof GetLatestPnLUseCase$dismissAlert$1) {
            getLatestPnLUseCase$dismissAlert$1 = (GetLatestPnLUseCase$dismissAlert$1) continuation;
            int i = getLatestPnLUseCase$dismissAlert$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLatestPnLUseCase$dismissAlert$1.label = i - Integer.MIN_VALUE;
            } else {
                getLatestPnLUseCase$dismissAlert$1 = new GetLatestPnLUseCase$dismissAlert$1(this, continuation);
            }
        }
        java.lang.Object obj = getLatestPnLUseCase$dismissAlert$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getLatestPnLUseCase$dismissAlert$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String str = AEQbTJ(positionDetailsParam.getChainId()) + "-" + positionDetailsParam.getTokenAddress();
            C32272mVw c32272mVw = this.OLrzqt;
            KSerializer<java.lang.Boolean> kSerializerSerializer = BuiltinSerializersKt.serializer(yHW.OLrzqt);
            java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(true);
            getLatestPnLUseCase$dismissAlert$1.label = 1;
            if (c32272mVw.EZpvd(str, kSerializerSerializer, boolKWHzl, getLatestPnLUseCase$dismissAlert$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void subscribeWs$default(C34467ncd c34467ncd, PositionDetailsParam positionDetailsParam, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c34467ncd.OLrzqt(positionDetailsParam, str);
    }

    public final void OLrzqt(@NotNull PositionDetailsParam positionDetailsParam, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(positionDetailsParam, "");
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ();
    }

    public final void AEQbTJ() {
        JobKt__JobKt.cancelChildren$default(this.AYXKKw.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return this.djBIcL.KWHzl(str);
    }
}
