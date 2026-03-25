package o;

import com.okinc.business.dex.trade.common.check.domain.usecase.PreCheckUseCase$preCheck$1;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gOd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19756gOd {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC19755gOc copydefault;

    @yCM
    public C19756gOd(@NotNull InterfaceC19755gOc interfaceC19755gOc, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC19755gOc, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC19755gOc;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<PreCheckBean>> continuation) {
        PreCheckUseCase$preCheck$1 preCheckUseCase$preCheck$1;
        if (continuation instanceof PreCheckUseCase$preCheck$1) {
            preCheckUseCase$preCheck$1 = (PreCheckUseCase$preCheck$1) continuation;
            int i = preCheckUseCase$preCheck$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preCheckUseCase$preCheck$1.label = i - Integer.MIN_VALUE;
            } else {
                preCheckUseCase$preCheck$1 = new PreCheckUseCase$preCheck$1(this, continuation);
            }
        }
        java.lang.Object obj = preCheckUseCase$preCheck$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = preCheckUseCase$preCheck$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        InterfaceC19755gOc interfaceC19755gOc = this.copydefault;
        preCheckUseCase$preCheck$1.label = 1;
        java.lang.Object objOLrzqt = interfaceC19755gOc.OLrzqt(str, str2, preCheckUseCase$preCheck$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }

    public final PreCheckBean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.KWHzl(str);
    }
}
