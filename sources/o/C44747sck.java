package o;

import com.okinc.okcomponents.feature.okwalletdefi.standalone.mock.external.impl.account.OKXWeb3DependencyException;
import com.okinc.okuser.data.Token;
import com.okinc.okuser.data.TokenType;
import com.okinc.okuser.data.UserProfile;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44747sck extends AbstractC43215rlA implements InterfaceC8108awX {
    public final java.lang.String AEQbTJ = C44747sck.class.getSimpleName();

    @Override // o.InterfaceC8108awX
    public void AEQbTJ(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String str = this.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
    }

    @Override // o.InterfaceC8108awX
    public java.lang.Object AEQbTJ(boolean z, @NotNull Continuation<? super com.okinc.okuser.data.UserInfo> continuation) {
        java.lang.String str = this.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return null;
    }

    @Override // o.InterfaceC8108awX
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super com.okinc.okuser.data.UserInfo> continuation) {
        java.lang.String str = this.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return null;
    }

    @Override // o.InterfaceC8108awX
    public java.lang.Object copydefault(boolean z, @NotNull Continuation<? super UserProfile> continuation) {
        java.lang.String str = this.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return null;
    }

    @Override // o.InterfaceC8108awX
    public java.lang.Object EZpvd(Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
        java.lang.String str = this.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC8108awX
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, Function0<Unit> function0, Function0<Unit> function02, @NotNull Continuation<? super Unit> continuation) {
        java.lang.String str2 = this.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str2));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC8108awX
    public java.lang.Object KWHzl(boolean z, @NotNull java.lang.String str, @NotNull Continuation<? super Token> continuation) {
        java.lang.String str2 = this.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str2));
        return new Token("", TokenType.TEMP);
    }

    @Override // o.InterfaceC8108awX
    public StateFlow<java.lang.Boolean> OLrzqt() {
        java.lang.String str = this.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
    }

    @Override // o.InterfaceC8108awX
    public boolean EZpvd() {
        java.lang.String str = this.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return false;
    }

    @Override // o.InterfaceC8108awX
    public boolean copydefault() {
        java.lang.String str = this.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return false;
    }
}
