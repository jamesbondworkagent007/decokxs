package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.features.position.domain.GetTokenBalanceUseCase$invoke$1;
import com.okinc.business.market.features.position.domain.GetTokenBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.position.domain.GetTokenBalanceUseCase$isBalancePrivate$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.position.domain.GetTokenBalanceUseCase$isBalancePrivate$1;
import com.okinc.business.market.features.position.domain.GetTokenBalanceUseCase$setPrivateBalance$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.position.domain.GetTokenBalanceUseCase$setPrivateBalance$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29129knn {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC29132knq OLrzqt;
    public final kKG copydefault;

    @yCM
    public C29129knn(@NotNull InterfaceC29132knq interfaceC29132knq, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29132knq, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC29132knq;
        this.copydefault = kkg;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<DexMultiTokenInfoBean>> continuation) {
        GetTokenBalanceUseCase$invoke$1 getTokenBalanceUseCase$invoke$1;
        if (continuation instanceof GetTokenBalanceUseCase$invoke$1) {
            getTokenBalanceUseCase$invoke$1 = (GetTokenBalanceUseCase$invoke$1) continuation;
            int i = getTokenBalanceUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTokenBalanceUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getTokenBalanceUseCase$invoke$1 = new GetTokenBalanceUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getTokenBalanceUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTokenBalanceUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetTokenBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 getTokenBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new GetTokenBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            getTokenBalanceUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTokenBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, getTokenBalanceUseCase$invoke$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GetTokenBalanceUseCase$setPrivateBalance$1 getTokenBalanceUseCase$setPrivateBalance$1;
        if (continuation instanceof GetTokenBalanceUseCase$setPrivateBalance$1) {
            getTokenBalanceUseCase$setPrivateBalance$1 = (GetTokenBalanceUseCase$setPrivateBalance$1) continuation;
            int i = getTokenBalanceUseCase$setPrivateBalance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTokenBalanceUseCase$setPrivateBalance$1.label = i - Integer.MIN_VALUE;
            } else {
                getTokenBalanceUseCase$setPrivateBalance$1 = new GetTokenBalanceUseCase$setPrivateBalance$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getTokenBalanceUseCase$setPrivateBalance$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTokenBalanceUseCase$setPrivateBalance$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetTokenBalanceUseCase$setPrivateBalance$$inlined$dexRunCatching$1 getTokenBalanceUseCase$setPrivateBalance$$inlined$dexRunCatching$1 = new GetTokenBalanceUseCase$setPrivateBalance$$inlined$dexRunCatching$1(null, this, z);
            getTokenBalanceUseCase$setPrivateBalance$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTokenBalanceUseCase$setPrivateBalance$$inlined$dexRunCatching$1, getTokenBalanceUseCase$setPrivateBalance$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        ((Result) objWithContext).m7386unboximpl();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        GetTokenBalanceUseCase$isBalancePrivate$1 getTokenBalanceUseCase$isBalancePrivate$1;
        if (continuation instanceof GetTokenBalanceUseCase$isBalancePrivate$1) {
            getTokenBalanceUseCase$isBalancePrivate$1 = (GetTokenBalanceUseCase$isBalancePrivate$1) continuation;
            int i = getTokenBalanceUseCase$isBalancePrivate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTokenBalanceUseCase$isBalancePrivate$1.label = i - Integer.MIN_VALUE;
            } else {
                getTokenBalanceUseCase$isBalancePrivate$1 = new GetTokenBalanceUseCase$isBalancePrivate$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getTokenBalanceUseCase$isBalancePrivate$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTokenBalanceUseCase$isBalancePrivate$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetTokenBalanceUseCase$isBalancePrivate$$inlined$dexRunCatching$1 getTokenBalanceUseCase$isBalancePrivate$$inlined$dexRunCatching$1 = new GetTokenBalanceUseCase$isBalancePrivate$$inlined$dexRunCatching$1(null, this);
            getTokenBalanceUseCase$isBalancePrivate$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTokenBalanceUseCase$isBalancePrivate$$inlined$dexRunCatching$1, getTokenBalanceUseCase$isBalancePrivate$1);
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
        java.lang.Boolean bool = (java.lang.Boolean) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
        return C56443yFo.KWHzl(bool != null ? bool.booleanValue() : false);
    }
}
