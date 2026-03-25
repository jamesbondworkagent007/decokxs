package o;

import com.okinc.business.invest_biz.data.bean.HomeTab;
import com.okinc.business.invest_biz.data.usecase.HomeV2TabsUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.HomeV2TabsUseCaseImpl$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iFT implements iFP {
    public final InterfaceC23589iBz KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public iFT(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC23589iBz;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iFP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Result<? extends java.util.List<HomeTab>>> continuation) {
        HomeV2TabsUseCaseImpl$invoke$1 homeV2TabsUseCaseImpl$invoke$1;
        if (continuation instanceof HomeV2TabsUseCaseImpl$invoke$1) {
            homeV2TabsUseCaseImpl$invoke$1 = (HomeV2TabsUseCaseImpl$invoke$1) continuation;
            int i = homeV2TabsUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeV2TabsUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                homeV2TabsUseCaseImpl$invoke$1 = new HomeV2TabsUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = homeV2TabsUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = homeV2TabsUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            HomeV2TabsUseCaseImpl$invoke$2 homeV2TabsUseCaseImpl$invoke$2 = new HomeV2TabsUseCaseImpl$invoke$2(this, null);
            homeV2TabsUseCaseImpl$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, homeV2TabsUseCaseImpl$invoke$2, homeV2TabsUseCaseImpl$invoke$1);
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
