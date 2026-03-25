package o;

import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.trade.features.home.advanced.usecase.AdvancedKLineInfoUseCase$getKLineInfo$$inlined$dexRunCatching$1;
import com.okinc.dexkline.trade.features.home.advanced.usecase.AdvancedKLineInfoUseCase$getKLineInfo$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ngf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34680ngf {
    public final C34677ngc KWHzl;
    public final InterfaceC34676ngb OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C34680ngf(@NotNull InterfaceC34676ngb interfaceC34676ngb, @NotNull C34677ngc c34677ngc, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC34676ngb, "");
        Intrinsics.checkNotNullParameter(c34677ngc, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC34676ngb;
        this.KWHzl = c34677ngc;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<LatestMarketInfoBean, OKServerException>> continuation) throws java.lang.Throwable {
        AdvancedKLineInfoUseCase$getKLineInfo$1 advancedKLineInfoUseCase$getKLineInfo$1;
        if (continuation instanceof AdvancedKLineInfoUseCase$getKLineInfo$1) {
            advancedKLineInfoUseCase$getKLineInfo$1 = (AdvancedKLineInfoUseCase$getKLineInfo$1) continuation;
            int i = advancedKLineInfoUseCase$getKLineInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedKLineInfoUseCase$getKLineInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedKLineInfoUseCase$getKLineInfo$1 = new AdvancedKLineInfoUseCase$getKLineInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedKLineInfoUseCase$getKLineInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedKLineInfoUseCase$getKLineInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            AdvancedKLineInfoUseCase$getKLineInfo$$inlined$dexRunCatching$1 advancedKLineInfoUseCase$getKLineInfo$$inlined$dexRunCatching$1 = new AdvancedKLineInfoUseCase$getKLineInfo$$inlined$dexRunCatching$1(null, this, str, str2);
            advancedKLineInfoUseCase$getKLineInfo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedKLineInfoUseCase$getKLineInfo$$inlined$dexRunCatching$1, advancedKLineInfoUseCase$getKLineInfo$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
        C56391yDq.AEQbTJ(objM7386unboximpl);
        return objM7386unboximpl;
    }
}
