package o;

import com.okinc.business.invest_biz.data.bean.HomeLearnEarnVO;
import com.okinc.business.invest_biz.data.usecase.LearnEarnSectionUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.LearnEarnSectionUseCaseImpl$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iGv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23720iGv implements InterfaceC23721iGw {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC23589iBz KWHzl;

    @yCM
    public C23720iGv(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC23589iBz;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23721iGw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Result<HomeLearnEarnVO>> continuation) {
        LearnEarnSectionUseCaseImpl$invoke$1 learnEarnSectionUseCaseImpl$invoke$1;
        if (continuation instanceof LearnEarnSectionUseCaseImpl$invoke$1) {
            learnEarnSectionUseCaseImpl$invoke$1 = (LearnEarnSectionUseCaseImpl$invoke$1) continuation;
            int i = learnEarnSectionUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                learnEarnSectionUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                learnEarnSectionUseCaseImpl$invoke$1 = new LearnEarnSectionUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = learnEarnSectionUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = learnEarnSectionUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            LearnEarnSectionUseCaseImpl$invoke$2 learnEarnSectionUseCaseImpl$invoke$2 = new LearnEarnSectionUseCaseImpl$invoke$2(this, null);
            learnEarnSectionUseCaseImpl$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, learnEarnSectionUseCaseImpl$invoke$2, learnEarnSectionUseCaseImpl$invoke$1);
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
