package o;

import com.okinc.business.market.data.model.smart_money.SignalGemType;
import com.okinc.business.market.data.model.smart_money.SignalGemsSortType;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalGemsListUseCase$invoke$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalGemsListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsCardsUiModel;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kus, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29505kus {
    public final CoroutineDispatcher AEQbTJ;
    public final C29472kuL EZpvd;
    public final InterfaceC29466kuF OLrzqt;

    @yCM
    public C29505kus(@NotNull InterfaceC29466kuF interfaceC29466kuF, @NotNull C29472kuL c29472kuL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29466kuF, "");
        Intrinsics.checkNotNullParameter(c29472kuL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC29466kuF;
        this.EZpvd = c29472kuL;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull C29481kuU c29481kuU, @NotNull SignalGemsSortType signalGemsSortType, boolean z, @NotNull SignalGemType signalGemType, @NotNull Continuation<? super Result<? extends java.util.List<SignalGemsCardsUiModel>>> continuation) throws java.lang.Throwable {
        GetSignalGemsListUseCase$invoke$1 getSignalGemsListUseCase$invoke$1;
        if (continuation instanceof GetSignalGemsListUseCase$invoke$1) {
            getSignalGemsListUseCase$invoke$1 = (GetSignalGemsListUseCase$invoke$1) continuation;
            int i = getSignalGemsListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalGemsListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalGemsListUseCase$invoke$1 = new GetSignalGemsListUseCase$invoke$1(this, continuation);
            }
        }
        GetSignalGemsListUseCase$invoke$1 getSignalGemsListUseCase$invoke$12 = getSignalGemsListUseCase$invoke$1;
        java.lang.Object objWithContext = getSignalGemsListUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalGemsListUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GetSignalGemsListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 getSignalGemsListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 = new GetSignalGemsListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(null, c29481kuU, this, signalGemsSortType, z, signalGemType);
            getSignalGemsListUseCase$invoke$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getSignalGemsListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1, getSignalGemsListUseCase$invoke$12);
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

    /* JADX INFO: renamed from: invoke-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8674invokeyxL6bBk$default(C29505kus c29505kus, C29481kuU c29481kuU, SignalGemsSortType signalGemsSortType, boolean z, SignalGemType signalGemType, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            signalGemsSortType = SignalGemsSortType.MAX_PRICE_INCREASE;
        }
        SignalGemsSortType signalGemsSortType2 = signalGemsSortType;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            signalGemType = SignalGemType.ALL;
        }
        return c29505kus.OLrzqt(c29481kuU, signalGemsSortType2, z2, signalGemType, continuation);
    }
}
