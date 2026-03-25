package o;

import com.okinc.business.dex.trade.common.check.repository.PreCheckRepositoryImpl$preCheck$1;
import com.okinc.business.dex.trade.common.check.repository.PreCheckRepositoryImpl$preCheck$apiResult$1;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gOj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19762gOj implements InterfaceC19755gOc {
    public final java.util.HashMap<java.lang.String, PreCheckBean> EZpvd;
    public final InterfaceC23234huQ KWHzl;

    public C19762gOj(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        this.KWHzl = interfaceC23234huQ;
        this.EZpvd = new java.util.HashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC19755gOc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<PreCheckBean>> continuation) throws java.lang.Throwable {
        PreCheckRepositoryImpl$preCheck$1 preCheckRepositoryImpl$preCheck$1;
        if (continuation instanceof PreCheckRepositoryImpl$preCheck$1) {
            preCheckRepositoryImpl$preCheck$1 = (PreCheckRepositoryImpl$preCheck$1) continuation;
            int i = preCheckRepositoryImpl$preCheck$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preCheckRepositoryImpl$preCheck$1.label = i - Integer.MIN_VALUE;
            } else {
                preCheckRepositoryImpl$preCheck$1 = new PreCheckRepositoryImpl$preCheck$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = preCheckRepositoryImpl$preCheck$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = preCheckRepositoryImpl$preCheck$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            PreCheckRepositoryImpl$preCheck$apiResult$1 preCheckRepositoryImpl$preCheck$apiResult$1 = new PreCheckRepositoryImpl$preCheck$apiResult$1(this, str, str2, null);
            preCheckRepositoryImpl$preCheck$1.L$0 = str;
            preCheckRepositoryImpl$preCheck$1.label = 1;
            objEZpvd = kAB.EZpvd(preCheckRepositoryImpl$preCheck$apiResult$1, preCheckRepositoryImpl$preCheck$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) preCheckRepositoryImpl$preCheck$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objEZpvd;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
        }
        if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar = (AbstractC43419rot.ActionBar) abstractC43419rot;
        pUU.AEQbTJ("PreCheckRepository", "Failed to get config for " + str, (java.lang.Throwable) actionBar.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar.KWHzl()));
    }

    @Override // o.InterfaceC19755gOc
    public PreCheckBean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.get(str);
    }
}
