package o;

import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedKLineInfoUseCase$getKLineInfo$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedKLineInfoUseCase$getKLineInfo$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kRa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28158kRa {
    public final C28196kSl AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC28152kQv copydefault;

    @yCM
    public C28158kRa(@NotNull InterfaceC28152kQv interfaceC28152kQv, @NotNull C28196kSl c28196kSl, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28152kQv, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC28152kQv;
        this.AEQbTJ = c28196kSl;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<LatestMarketInfoBean, OKServerException>> continuation) throws java.lang.Throwable {
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
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
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
