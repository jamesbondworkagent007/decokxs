package o;

import com.okinc.im.usecase.group.members.GetMaxMemberCountUseCase$execute$2;
import com.okinc.im.usecase.group.members.GetMaxMemberCountUseCase$invoke$1;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC44399sOj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDW {
    public final CoroutineDispatcher EZpvd;
    public final sIR copydefault;

    @yCM
    public oDW(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = sir;
        this.EZpvd = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(@NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, @NotNull Continuation<? super AbstractC44399sOj> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GetMaxMemberCountUseCase$execute$2(this, groupServiceType, groupScenarioType, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        GetMaxMemberCountUseCase$invoke$1 getMaxMemberCountUseCase$invoke$1;
        java.lang.Long lKWHzl;
        if (continuation instanceof GetMaxMemberCountUseCase$invoke$1) {
            getMaxMemberCountUseCase$invoke$1 = (GetMaxMemberCountUseCase$invoke$1) continuation;
            int i = getMaxMemberCountUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMaxMemberCountUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getMaxMemberCountUseCase$invoke$1 = new GetMaxMemberCountUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getMaxMemberCountUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMaxMemberCountUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            getMaxMemberCountUseCase$invoke$1.label = 1;
            objOLrzqt = OLrzqt(groupServiceType, groupScenarioType, getMaxMemberCountUseCase$invoke$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        AbstractC44399sOj abstractC44399sOj = (AbstractC44399sOj) objOLrzqt;
        AbstractC44399sOj.ActionBar actionBar = abstractC44399sOj instanceof AbstractC44399sOj.ActionBar ? (AbstractC44399sOj.ActionBar) abstractC44399sOj : null;
        return C56443yFo.AEQbTJ((actionBar == null || (lKWHzl = actionBar.KWHzl()) == null) ? 3000 : (int) lKWHzl.longValue());
    }
}
