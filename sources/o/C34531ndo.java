package o;

import com.okinc.dexkline.market.data.model.CeDeFiCoinRiskData;
import com.okinc.dexkline.market.data.model.CoinRiskData;
import com.okinc.dexkline.market.features.risk_control.data.RiskControlRepo$getCeDeFiRiskInfo$1;
import com.okinc.dexkline.market.features.risk_control.data.RiskControlRepo$getCeDeFiRiskInfoBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.risk_control.data.RiskControlRepo$getRiskInfo$1;
import com.okinc.dexkline.market.features.risk_control.data.RiskControlRepo$getRiskInfo0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ndo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34531ndo {
    public final InterfaceC32162mRu KWHzl;
    public final CoroutineDispatcher OLrzqt;

    public C34531ndo(@NotNull InterfaceC32162mRu interfaceC32162mRu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC32162mRu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC32162mRu;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<CoinRiskData>> continuation) throws java.lang.Throwable {
        RiskControlRepo$getRiskInfo$1 riskControlRepo$getRiskInfo$1;
        if (continuation instanceof RiskControlRepo$getRiskInfo$1) {
            riskControlRepo$getRiskInfo$1 = (RiskControlRepo$getRiskInfo$1) continuation;
            int i = riskControlRepo$getRiskInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                riskControlRepo$getRiskInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                riskControlRepo$getRiskInfo$1 = new RiskControlRepo$getRiskInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = riskControlRepo$getRiskInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = riskControlRepo$getRiskInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            RiskControlRepo$getRiskInfo0E7RQCE$$inlined$dexRunCatching$1 riskControlRepo$getRiskInfo0E7RQCE$$inlined$dexRunCatching$1 = new RiskControlRepo$getRiskInfo0E7RQCE$$inlined$dexRunCatching$1(null, this, str2, str);
            riskControlRepo$getRiskInfo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, riskControlRepo$getRiskInfo0E7RQCE$$inlined$dexRunCatching$1, riskControlRepo$getRiskInfo$1);
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
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<CeDeFiCoinRiskData>> continuation) throws java.lang.Throwable {
        RiskControlRepo$getCeDeFiRiskInfo$1 riskControlRepo$getCeDeFiRiskInfo$1;
        if (continuation instanceof RiskControlRepo$getCeDeFiRiskInfo$1) {
            riskControlRepo$getCeDeFiRiskInfo$1 = (RiskControlRepo$getCeDeFiRiskInfo$1) continuation;
            int i = riskControlRepo$getCeDeFiRiskInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                riskControlRepo$getCeDeFiRiskInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                riskControlRepo$getCeDeFiRiskInfo$1 = new RiskControlRepo$getCeDeFiRiskInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = riskControlRepo$getCeDeFiRiskInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = riskControlRepo$getCeDeFiRiskInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            RiskControlRepo$getCeDeFiRiskInfoBWLJW6A$$inlined$dexRunCatching$1 riskControlRepo$getCeDeFiRiskInfoBWLJW6A$$inlined$dexRunCatching$1 = new RiskControlRepo$getCeDeFiRiskInfoBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, str3);
            riskControlRepo$getCeDeFiRiskInfo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, riskControlRepo$getCeDeFiRiskInfoBWLJW6A$$inlined$dexRunCatching$1, riskControlRepo$getCeDeFiRiskInfo$1);
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
}
