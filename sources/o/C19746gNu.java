package o;

import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.MessageSignData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19746gNu extends AbstractC19751gNz {
    public final C19747gNv AEQbTJ;
    public final C19734gNi EZpvd;
    public final C19735gNj KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C19700gMb copydefault;
    public final C23212htv valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C19746gNu(@NotNull C19734gNi c19734gNi, @NotNull C19747gNv c19747gNv, @NotNull C19700gMb c19700gMb, @NotNull C19735gNj c19735gNj, @NotNull C23212htv c23212htv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(c19734gNi, c19700gMb, c19735gNj, c19747gNv, c23212htv, coroutineDispatcher);
        Intrinsics.checkNotNullParameter(c19734gNi, "");
        Intrinsics.checkNotNullParameter(c19747gNv, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19735gNj, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c19734gNi;
        this.AEQbTJ = c19747gNv;
        this.copydefault = c19700gMb;
        this.KWHzl = c19735gNj;
        this.valueOf = c23212htv;
        this.OLrzqt = coroutineDispatcher;
    }

    @Override // o.AbstractC19751gNz
    public MessageSignData OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EVMMessageSignData(str, false, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }
}
