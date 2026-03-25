package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.business.trade.features.home.meme.usecase.MemeCurrencySupportUseCase$getMemeCurrencyTokenList$1;
import com.okinc.business.trade.features.home.meme.usecase.MemeCurrencySupportUseCase$getMemeCurrencyTokenListyxL6bBk$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVP {
    public final InterfaceC28281kVp AEQbTJ;
    public final CoroutineDispatcher copydefault;

    @yCM
    public kVP(@NotNull InterfaceC28281kVp interfaceC28281kVp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28281kVp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC28281kVp;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<? extends java.util.List<MemeCurrencyBean>>> continuation) throws java.lang.Throwable {
        MemeCurrencySupportUseCase$getMemeCurrencyTokenList$1 memeCurrencySupportUseCase$getMemeCurrencyTokenList$1;
        if (continuation instanceof MemeCurrencySupportUseCase$getMemeCurrencyTokenList$1) {
            memeCurrencySupportUseCase$getMemeCurrencyTokenList$1 = (MemeCurrencySupportUseCase$getMemeCurrencyTokenList$1) continuation;
            int i = memeCurrencySupportUseCase$getMemeCurrencyTokenList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeCurrencySupportUseCase$getMemeCurrencyTokenList$1.label = i - Integer.MIN_VALUE;
            } else {
                memeCurrencySupportUseCase$getMemeCurrencyTokenList$1 = new MemeCurrencySupportUseCase$getMemeCurrencyTokenList$1(this, continuation);
            }
        }
        MemeCurrencySupportUseCase$getMemeCurrencyTokenList$1 memeCurrencySupportUseCase$getMemeCurrencyTokenList$12 = memeCurrencySupportUseCase$getMemeCurrencyTokenList$1;
        java.lang.Object objWithContext = memeCurrencySupportUseCase$getMemeCurrencyTokenList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeCurrencySupportUseCase$getMemeCurrencyTokenList$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            MemeCurrencySupportUseCase$getMemeCurrencyTokenListyxL6bBk$$inlined$dexRunCatching$1 memeCurrencySupportUseCase$getMemeCurrencyTokenListyxL6bBk$$inlined$dexRunCatching$1 = new MemeCurrencySupportUseCase$getMemeCurrencyTokenListyxL6bBk$$inlined$dexRunCatching$1(null, this, str, str2, str3, str4);
            memeCurrencySupportUseCase$getMemeCurrencyTokenList$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, memeCurrencySupportUseCase$getMemeCurrencyTokenListyxL6bBk$$inlined$dexRunCatching$1, memeCurrencySupportUseCase$getMemeCurrencyTokenList$12);
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

    public final java.util.List<MemeCurrencyBean> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.AEQbTJ.AEQbTJ(str, str2);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<MemeCurrencyBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.AEQbTJ(str, list);
    }

    public final MemeCurrencyBean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.AEQbTJ.copydefault(str, str2);
    }

    public final DexMultiTokenInfoBean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.AEQbTJ.EZpvd(str, str2);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ.OLrzqt(str, str2, str3);
    }

    public final void EZpvd() {
        this.AEQbTJ.KWHzl();
    }

    public final DexMultiTokenInfoBean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.Iterator<T> it = this.AEQbTJ.KWHzl(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((MemeCurrencyBean) next).getCurrencyTokenInfo().getTokenContractAddress(), (java.lang.Object) str2)) {
                break;
            }
        }
        MemeCurrencyBean memeCurrencyBean = (MemeCurrencyBean) next;
        if (memeCurrencyBean != null) {
            return memeCurrencyBean.getCurrencyTokenInfo();
        }
        return null;
    }
}
