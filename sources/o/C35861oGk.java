package o;

import com.okinc.im.usecase.relationinfo.UpdateRelationAliasUseCase$execute$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35861oGk {
    public final sFU AEQbTJ;
    public final InterfaceC44177sGd KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35861oGk(@NotNull InterfaceC44177sGd interfaceC44177sGd, @NotNull sFU sfu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        Intrinsics.checkNotNullParameter(sfu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC44177sGd;
        this.AEQbTJ = sfu;
        this.copydefault = coroutineDispatcher;
    }

    public static /* synthetic */ java.lang.Object execute$default(C35861oGk c35861oGk, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c35861oGk.copydefault(str, str2, str3, continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new UpdateRelationAliasUseCase$execute$2(str3, this, str, str2, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
