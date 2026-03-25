package o;

import com.okinc.im.usecase.group.UpgradeGroupSizeUseCase$invoke$1;
import com.okinc.im.usecase.group.UpgradeGroupSizeUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35783oDn {
    public final CoroutineDispatcher KWHzl;
    public final sIR OLrzqt;

    @yCM
    public C35783oDn(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = sir;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        UpgradeGroupSizeUseCase$invoke$1 upgradeGroupSizeUseCase$invoke$1;
        if (continuation instanceof UpgradeGroupSizeUseCase$invoke$1) {
            upgradeGroupSizeUseCase$invoke$1 = (UpgradeGroupSizeUseCase$invoke$1) continuation;
            int i = upgradeGroupSizeUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                upgradeGroupSizeUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                upgradeGroupSizeUseCase$invoke$1 = new UpgradeGroupSizeUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = upgradeGroupSizeUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = upgradeGroupSizeUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            UpgradeGroupSizeUseCase$invoke$2 upgradeGroupSizeUseCase$invoke$2 = new UpgradeGroupSizeUseCase$invoke$2(this, str, null);
            upgradeGroupSizeUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, upgradeGroupSizeUseCase$invoke$2, upgradeGroupSizeUseCase$invoke$1);
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
