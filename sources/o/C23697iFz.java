package o;

import com.okinc.business.invest_biz.data.usecase.AggregateTrackUseCaseImpl$trackScreenView$2;
import com.okinc.business.invest_biz.data.usecase.AggregateTrackUseCaseImpl$trackTabClick$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23697iFz implements InterfaceC23688iFq {
    public final CoroutineDispatcher copydefault;

    @yCM
    public C23697iFz(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
    }

    @Override // o.InterfaceC23688iFq
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new AggregateTrackUseCaseImpl$trackTabClick$2(str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC23688iFq
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new AggregateTrackUseCaseImpl$trackScreenView$2(str, str2, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
