package o;

import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fXi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17924fXi {
    public final fVN KWHzl;

    public C17924fXi(@NotNull fVN fvn) {
        Intrinsics.checkNotNullParameter(fvn, "");
        this.KWHzl = fvn;
    }

    public java.lang.Object EZpvd(@NotNull Continuation<? super TeeMetadata> continuation) {
        return this.KWHzl.EZpvd(continuation);
    }
}
