package o;

import com.okinc.business.defi.api.model.tx.signdata.MessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.SolanaMessageSignData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19744gNs extends AbstractC19751gNz {
    public final C19734gNi AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C19735gNj KWHzl;
    public final C19700gMb OLrzqt;
    public final C19747gNv copydefault;
    public final C23212htv gEmmrt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C19744gNs(@NotNull C19734gNi c19734gNi, @NotNull C19747gNv c19747gNv, @NotNull C19700gMb c19700gMb, @NotNull C19735gNj c19735gNj, @NotNull C23212htv c23212htv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(c19734gNi, c19700gMb, c19735gNj, c19747gNv, c23212htv, coroutineDispatcher);
        Intrinsics.checkNotNullParameter(c19734gNi, "");
        Intrinsics.checkNotNullParameter(c19747gNv, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19735gNj, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c19734gNi;
        this.copydefault = c19747gNv;
        this.OLrzqt = c19700gMb;
        this.KWHzl = c19735gNj;
        this.gEmmrt = c23212htv;
        this.EZpvd = coroutineDispatcher;
    }

    @Override // o.AbstractC19751gNz
    public MessageSignData OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SolanaMessageSignData(str, false, null, 6, null);
    }
}
