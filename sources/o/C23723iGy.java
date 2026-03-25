package o;

import com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse;
import com.okinc.business.invest_biz.data.usecase.SearchHeaderUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.SearchHeaderUseCaseImpl$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iGy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23723iGy implements iGB {
    public final C23580iBq AEQbTJ;
    public final InterfaceC23589iBz EZpvd;
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC23589iBz AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23580iBq OLrzqt() {
        return this.AEQbTJ;
    }

    public C23723iGy(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C23580iBq c23580iBq) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c23580iBq, "");
        this.EZpvd = interfaceC23589iBz;
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = c23580iBq;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yCM
    public C23723iGy(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this(interfaceC23589iBz, coroutineDispatcher, C23580iBq.AEQbTJ);
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iGB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<SearchHeaderInfoResponse>> continuation) {
        SearchHeaderUseCaseImpl$invoke$1 searchHeaderUseCaseImpl$invoke$1;
        if (continuation instanceof SearchHeaderUseCaseImpl$invoke$1) {
            searchHeaderUseCaseImpl$invoke$1 = (SearchHeaderUseCaseImpl$invoke$1) continuation;
            int i = searchHeaderUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchHeaderUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                searchHeaderUseCaseImpl$invoke$1 = new SearchHeaderUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = searchHeaderUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchHeaderUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            SearchHeaderUseCaseImpl$invoke$2 searchHeaderUseCaseImpl$invoke$2 = new SearchHeaderUseCaseImpl$invoke$2(this, str, null);
            searchHeaderUseCaseImpl$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, searchHeaderUseCaseImpl$invoke$2, searchHeaderUseCaseImpl$invoke$1);
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
