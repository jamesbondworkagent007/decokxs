package o;

import com.okinc.business.invest_biz.data.usecase.InvestSearchTrackUseCaseImpl$trackSearchResult$2;
import com.okinc.business.invest_biz.data.usecase.InvestSearchTrackUseCaseImpl$trackTabClick$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iGr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23716iGr implements InterfaceC23717iGs {
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C23716iGr(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
    }

    @Override // o.InterfaceC23717iGs
    public java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.KWHzl, new InvestSearchTrackUseCaseImpl$trackSearchResult$2(str3, str4, str2, str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC23717iGs
    public java.lang.Object AEQbTJ(int i, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.KWHzl, new InvestSearchTrackUseCaseImpl$trackTabClick$2(i, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
