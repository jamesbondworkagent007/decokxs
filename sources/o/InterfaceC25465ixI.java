package o;

import com.okinc.business.invest_biz.base.UseCase$runOnIo$1;
import com.okinc.business.invest_biz.base.UseCase$runOnIo$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25465ixI {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    default <T> java.lang.Object EZpvd(@NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, @NotNull Continuation<? super Result<? extends T>> continuation) {
        return KWHzl(this, function1, continuation);
    }

    CoroutineDispatcher OLrzqt();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <T> java.lang.Object KWHzl(InterfaceC25465ixI interfaceC25465ixI, Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, Continuation<? super Result<? extends T>> continuation) throws java.lang.Throwable {
        UseCase$runOnIo$1 useCase$runOnIo$1;
        if (continuation instanceof UseCase$runOnIo$1) {
            useCase$runOnIo$1 = (UseCase$runOnIo$1) continuation;
            int i = useCase$runOnIo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                useCase$runOnIo$1.label = i - Integer.MIN_VALUE;
            } else {
                useCase$runOnIo$1 = new UseCase$runOnIo$1(interfaceC25465ixI, continuation);
            }
        }
        java.lang.Object objWithContext = useCase$runOnIo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = useCase$runOnIo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcherOLrzqt = interfaceC25465ixI.OLrzqt();
            UseCase$runOnIo$2 useCase$runOnIo$2 = new UseCase$runOnIo$2(function1, null);
            useCase$runOnIo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, useCase$runOnIo$2, useCase$runOnIo$1);
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
