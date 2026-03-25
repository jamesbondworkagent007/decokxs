package o;

import com.okinc.core.ok_app.api.configuration.Scenario;
import com.okinc.lifecycle.impl.deeplink.usecase.DeeplinkAuthUseCaseImpl$performAuth$1;
import com.okinc.lifecycle.impl.deeplink.usecase.DeeplinkAuthUseCaseImpl$performAuth$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.pMK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pMr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38112pMr implements InterfaceC38113pMs {
    public final InterfaceC47278tmy AEQbTJ;
    public final pMK EZpvd;
    public final InterfaceC33253msv KWHzl;

    @yCM
    public C38112pMr(@NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull pMK pmk, @NotNull InterfaceC33253msv interfaceC33253msv) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(pmk, "");
        Intrinsics.checkNotNullParameter(interfaceC33253msv, "");
        this.AEQbTJ = interfaceC47278tmy;
        this.EZpvd = pmk;
        this.KWHzl = interfaceC33253msv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC38113pMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull android.content.Context context, boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        DeeplinkAuthUseCaseImpl$performAuth$1 deeplinkAuthUseCaseImpl$performAuth$1;
        C38112pMr c38112pMr;
        if (continuation instanceof DeeplinkAuthUseCaseImpl$performAuth$1) {
            deeplinkAuthUseCaseImpl$performAuth$1 = (DeeplinkAuthUseCaseImpl$performAuth$1) continuation;
            int i = deeplinkAuthUseCaseImpl$performAuth$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deeplinkAuthUseCaseImpl$performAuth$1.label = i - Integer.MIN_VALUE;
            } else {
                deeplinkAuthUseCaseImpl$performAuth$1 = new DeeplinkAuthUseCaseImpl$performAuth$1(this, continuation);
            }
        }
        java.lang.Object obj = deeplinkAuthUseCaseImpl$performAuth$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deeplinkAuthUseCaseImpl$performAuth$1.label;
        boolean zValues = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.AEQbTJ.values()) {
                if (z) {
                    pMK.Application.signUp$default(this.EZpvd, context, false, 2, null);
                } else {
                    pMK.Application.login$default(this.EZpvd, context, false, 2, null);
                }
                SharedFlow<Scenario> sharedFlowKWHzl = this.KWHzl.KWHzl();
                DeeplinkAuthUseCaseImpl$performAuth$2 deeplinkAuthUseCaseImpl$performAuth$2 = new DeeplinkAuthUseCaseImpl$performAuth$2(null);
                deeplinkAuthUseCaseImpl$performAuth$1.L$0 = this;
                deeplinkAuthUseCaseImpl$performAuth$1.label = 1;
                if (FlowKt.first(sharedFlowKWHzl, deeplinkAuthUseCaseImpl$performAuth$2, deeplinkAuthUseCaseImpl$performAuth$1) == objCopydefault) {
                    return objCopydefault;
                }
                c38112pMr = this;
            }
            return C56443yFo.KWHzl(zValues);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c38112pMr = (C38112pMr) deeplinkAuthUseCaseImpl$performAuth$1.L$0;
        C56391yDq.AEQbTJ(obj);
        zValues = c38112pMr.AEQbTJ.values();
        return C56443yFo.KWHzl(zValues);
    }

    @Override // o.InterfaceC38113pMs
    public boolean KWHzl() {
        return this.AEQbTJ.values();
    }
}
