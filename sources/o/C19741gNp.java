package o;

import com.okinc.business.defi.api.model.tx.signdata.MessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.SolanaMessageSignData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19741gNp extends AbstractC19748gNw {
    public final CoroutineDispatcher AEQbTJ;
    public final C23212htv AhwBna;
    public final C19737gNl EZpvd;
    public final C19700gMb KWHzl;
    public final C19739gNn OLrzqt;
    public final C19734gNi copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C19741gNp(@NotNull C19734gNi c19734gNi, @NotNull C19739gNn c19739gNn, @NotNull C19700gMb c19700gMb, @NotNull C19737gNl c19737gNl, @NotNull C23212htv c23212htv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(c19734gNi, c19700gMb, c19737gNl, c19739gNn, c23212htv, coroutineDispatcher);
        Intrinsics.checkNotNullParameter(c19734gNi, "");
        Intrinsics.checkNotNullParameter(c19739gNn, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19737gNl, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c19734gNi;
        this.OLrzqt = c19739gNn;
        this.KWHzl = c19700gMb;
        this.EZpvd = c19737gNl;
        this.AhwBna = c23212htv;
        this.AEQbTJ = coroutineDispatcher;
    }

    @Override // o.AbstractC19748gNw
    public MessageSignData KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SolanaMessageSignData(str, false, null, 6, null);
    }
}
