package o;

import com.okinc.account.api.model.subaccount.AccountInfo;
import com.okinc.okcomponents.feature.okwalletdefi.standalone.mock.external.impl.account.OKXWeb3DependencyException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44745sci extends AbstractC43215rlA implements InterfaceC8103awS {
    public final java.lang.String KWHzl = C44745sci.class.getSimpleName();

    @Override // o.InterfaceC8103awS
    public java.lang.Object EZpvd(@NotNull Continuation<? super Result<? extends java.util.List<AccountInfo>>> continuation) {
        java.lang.String str = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(yDY.AhwBna());
    }
}
