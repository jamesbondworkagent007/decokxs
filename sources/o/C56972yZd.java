package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56972yZd extends AbstractC56986yZr<java.lang.Byte> {
    public C56972yZd(byte b) {
        super(java.lang.Byte.valueOf(b));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yNP;)Lo/zdF; */
    @Override // o.AbstractC56975yZg
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public AbstractC59242zdO OLrzqt(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        AbstractC59242zdO abstractC59242zdOIsConnected = ynp.AEQbTJ().isConnected();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOIsConnected, "");
        return abstractC59242zdOIsConnected;
    }

    @Override // o.AbstractC56975yZg
    public java.lang.String toString() {
        return KWHzl().intValue() + ".toByte()";
    }
}
