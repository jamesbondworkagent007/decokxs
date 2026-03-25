package o;

import com.okinc.im.usecase.group.affiliate.CheckAffiliateUserUseCase$invoke$1;
import com.okinc.im.usecase.group.affiliate.CheckAffiliateUserUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35780oDk {
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35780oDk(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        CheckAffiliateUserUseCase$invoke$1 checkAffiliateUserUseCase$invoke$1;
        if (continuation instanceof CheckAffiliateUserUseCase$invoke$1) {
            checkAffiliateUserUseCase$invoke$1 = (CheckAffiliateUserUseCase$invoke$1) continuation;
            int i = checkAffiliateUserUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkAffiliateUserUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkAffiliateUserUseCase$invoke$1 = new CheckAffiliateUserUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = checkAffiliateUserUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkAffiliateUserUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            InterfaceC8171axh interfaceC8171axh = (InterfaceC8171axh) C43251rlk.OLrzqt(InterfaceC8171axh.class);
            if (interfaceC8171axh == null) {
                return C56443yFo.KWHzl(false);
            }
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            CheckAffiliateUserUseCase$invoke$2 checkAffiliateUserUseCase$invoke$2 = new CheckAffiliateUserUseCase$invoke$2(interfaceC8171axh, null);
            checkAffiliateUserUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, checkAffiliateUserUseCase$invoke$2, checkAffiliateUserUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "");
        return objWithContext;
    }
}
