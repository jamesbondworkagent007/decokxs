package o;

import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.MessageSignData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19740gNo extends AbstractC19748gNw {
    public final CoroutineDispatcher AEQbTJ;
    public final C19700gMb EZpvd;
    public final C19734gNi KWHzl;
    public final C19739gNn OLrzqt;
    public final C19737gNl copydefault;
    public final C23212htv valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C19740gNo(@NotNull C19734gNi c19734gNi, @NotNull C19739gNn c19739gNn, @NotNull C19700gMb c19700gMb, @NotNull C19737gNl c19737gNl, @NotNull C23212htv c23212htv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(c19734gNi, c19700gMb, c19737gNl, c19739gNn, c23212htv, coroutineDispatcher);
        Intrinsics.checkNotNullParameter(c19734gNi, "");
        Intrinsics.checkNotNullParameter(c19739gNn, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19737gNl, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c19734gNi;
        this.OLrzqt = c19739gNn;
        this.EZpvd = c19700gMb;
        this.copydefault = c19737gNl;
        this.valueOf = c23212htv;
        this.AEQbTJ = coroutineDispatcher;
    }

    @Override // o.AbstractC19748gNw
    public MessageSignData KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EVMMessageSignData(str, false, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }
}
