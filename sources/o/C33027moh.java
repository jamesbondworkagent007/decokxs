package o;

import com.okinc.core.arch.reactivex.ResponseFailedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.moh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C33027moh implements InterfaceC58227yxM<java.lang.Throwable> {
    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
    @Override // o.InterfaceC58227yxM
    /* JADX INFO: renamed from: OLrzqt */
    public void accept(@NotNull java.lang.Throwable th) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof ResponseFailedException) {
            C33134mqi.AEQbTJ(th.getMessage());
        }
    }
}
