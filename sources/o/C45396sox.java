package o;

import com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel;
import com.okinc.okex.common.usecase.SupportAllSelfToolsUseCase$getAllSelfToolsData$1;
import com.okinc.okex.common.usecase.SupportAllSelfToolsUseCase$getAllSelfToolsData$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sox, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45396sox {
    public final InterfaceC44921sfz copydefault;

    @yCM
    public C45396sox(@NotNull InterfaceC44921sfz interfaceC44921sfz) {
        Intrinsics.checkNotNullParameter(interfaceC44921sfz, "");
        this.copydefault = interfaceC44921sfz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<? extends java.util.List<SelfServiceDisplayModel>>> continuation) throws java.lang.Throwable {
        SupportAllSelfToolsUseCase$getAllSelfToolsData$1 supportAllSelfToolsUseCase$getAllSelfToolsData$1;
        if (continuation instanceof SupportAllSelfToolsUseCase$getAllSelfToolsData$1) {
            supportAllSelfToolsUseCase$getAllSelfToolsData$1 = (SupportAllSelfToolsUseCase$getAllSelfToolsData$1) continuation;
            int i = supportAllSelfToolsUseCase$getAllSelfToolsData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                supportAllSelfToolsUseCase$getAllSelfToolsData$1.label = i - Integer.MIN_VALUE;
            } else {
                supportAllSelfToolsUseCase$getAllSelfToolsData$1 = new SupportAllSelfToolsUseCase$getAllSelfToolsData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = supportAllSelfToolsUseCase$getAllSelfToolsData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = supportAllSelfToolsUseCase$getAllSelfToolsData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcherOLrzqt = C44711scA.EZpvd.OLrzqt();
            SupportAllSelfToolsUseCase$getAllSelfToolsData$2 supportAllSelfToolsUseCase$getAllSelfToolsData$2 = new SupportAllSelfToolsUseCase$getAllSelfToolsData$2(this, null);
            supportAllSelfToolsUseCase$getAllSelfToolsData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, supportAllSelfToolsUseCase$getAllSelfToolsData$2, supportAllSelfToolsUseCase$getAllSelfToolsData$1);
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
