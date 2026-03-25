package o;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sGh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44181sGh implements sKO {
    public final C44507sSj KWHzl;
    public final C44510sSm OLrzqt;
    public final C44509sSl copydefault;

    @yCM
    public C44181sGh(@NotNull C44510sSm c44510sSm, @NotNull C44509sSl c44509sSl, @NotNull C44507sSj c44507sSj) {
        Intrinsics.checkNotNullParameter(c44510sSm, "");
        Intrinsics.checkNotNullParameter(c44509sSl, "");
        Intrinsics.checkNotNullParameter(c44507sSj, "");
        this.OLrzqt = c44510sSm;
        this.copydefault = c44509sSl;
        this.KWHzl = c44507sSj;
    }

    @Override // o.sKO
    public java.lang.Object KWHzl(@NotNull sKT skt, @NotNull Continuation<? super java.util.List<sQY>> continuation) {
        return this.OLrzqt.OLrzqt(skt, continuation);
    }

    @Override // o.sKO
    public java.lang.Object OLrzqt(@NotNull sKR skr, boolean z, @NotNull Continuation<? super java.util.List<sQU>> continuation) {
        return this.copydefault.OLrzqt(skr, z, continuation);
    }

    @Override // o.sKO
    public java.lang.Object KWHzl(@NotNull sKR skr, @NotNull Continuation<? super java.util.List<InHouseIMConversationEntity>> continuation) {
        return this.KWHzl.AEQbTJ(skr, continuation);
    }
}
