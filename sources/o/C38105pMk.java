package o;

import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.pLW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pMk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38105pMk implements InterfaceC38106pMl {
    public final pLW copydefault;

    @yCM
    public C38105pMk(@NotNull pLW plw) {
        Intrinsics.checkNotNullParameter(plw, "");
        this.copydefault = plw;
    }

    @Override // o.InterfaceC38106pMl
    public java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>> continuation) {
        return pLW.ActionBar.getH5DeeplinkMapping$default(this.copydefault, null, 0, continuation, 3, null);
    }

    @Override // o.InterfaceC38106pMl
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<C38108pMn>> continuation) {
        return this.copydefault.copydefault(str, continuation);
    }

    @Override // o.InterfaceC38106pMl
    public java.lang.Object OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<C38108pMn>> continuation) {
        return this.copydefault.KWHzl(map, continuation);
    }
}
