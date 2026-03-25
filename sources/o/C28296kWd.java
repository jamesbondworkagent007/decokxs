package o;

import com.okinc.business.dexlogic.bean.SellMemeConfigBean;
import com.okinc.business.trade.features.home.meme.usecase.preset.MemeSellConfigUseCase$getMemeSellConfig$1;
import com.okinc.business.trade.features.home.meme.usecase.preset.MemeSellConfigUseCase$getMemeSellConfigIoAF18A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28296kWd {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC28291kVz copydefault;

    @yCM
    public C28296kWd(@NotNull InterfaceC28291kVz interfaceC28291kVz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28291kVz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC28291kVz;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super Result<? extends java.util.List<SellMemeConfigBean>>> continuation) {
        MemeSellConfigUseCase$getMemeSellConfig$1 memeSellConfigUseCase$getMemeSellConfig$1;
        if (continuation instanceof MemeSellConfigUseCase$getMemeSellConfig$1) {
            memeSellConfigUseCase$getMemeSellConfig$1 = (MemeSellConfigUseCase$getMemeSellConfig$1) continuation;
            int i = memeSellConfigUseCase$getMemeSellConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeSellConfigUseCase$getMemeSellConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                memeSellConfigUseCase$getMemeSellConfig$1 = new MemeSellConfigUseCase$getMemeSellConfig$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = memeSellConfigUseCase$getMemeSellConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeSellConfigUseCase$getMemeSellConfig$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            MemeSellConfigUseCase$getMemeSellConfigIoAF18A$$inlined$dexRunCatching$1 memeSellConfigUseCase$getMemeSellConfigIoAF18A$$inlined$dexRunCatching$1 = new MemeSellConfigUseCase$getMemeSellConfigIoAF18A$$inlined$dexRunCatching$1(null, this);
            memeSellConfigUseCase$getMemeSellConfig$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, memeSellConfigUseCase$getMemeSellConfigIoAF18A$$inlined$dexRunCatching$1, memeSellConfigUseCase$getMemeSellConfig$1);
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

    public final java.util.List<java.lang.String> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.AEQbTJ(str).getDefaultSellPercentList();
    }
}
