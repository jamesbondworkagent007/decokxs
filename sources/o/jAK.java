package o;

import com.okinc.business.market.features.address_tracker.domain.GetSelectedGroupsUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.GetSelectedGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAK {
    public final kKG EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC25651jBh OLrzqt;

    @yCM
    public jAK(@NotNull InterfaceC25651jBh interfaceC25651jBh, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC25651jBh, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC25651jBh;
        this.EZpvd = kkg;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<java.lang.Integer>>> continuation) throws java.lang.Throwable {
        GetSelectedGroupsUseCase$invoke$1 getSelectedGroupsUseCase$invoke$1;
        if (continuation instanceof GetSelectedGroupsUseCase$invoke$1) {
            getSelectedGroupsUseCase$invoke$1 = (GetSelectedGroupsUseCase$invoke$1) continuation;
            int i = getSelectedGroupsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSelectedGroupsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSelectedGroupsUseCase$invoke$1 = new GetSelectedGroupsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getSelectedGroupsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSelectedGroupsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            GetSelectedGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1 getSelectedGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new GetSelectedGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, str);
            getSelectedGroupsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getSelectedGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1, getSelectedGroupsUseCase$invoke$1);
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
