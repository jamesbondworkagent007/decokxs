package o;

import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC32874mln;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC32806mkY implements InterfaceC32874mln {
    public final C6922aYX fARcdN;
    public boolean fJNWhG;

    public abstract void KWHzl(@NotNull android.content.Context context);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32874mln
    public boolean hDKMBd() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6922aYX uzCIH() {
        return this.fARcdN;
    }

    public AbstractC32806mkY() {
        AbstractC58253yxm abstractC58253yxmKWHzl = yBP.KWHzl(Executors.newSingleThreadExecutor());
        Intrinsics.checkNotNullExpressionValue(abstractC58253yxmKWHzl, "");
        this.fARcdN = new C6922aYX(abstractC58253yxmKWHzl);
    }

    @Override // o.InterfaceC32874mln
    public void AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        InterfaceC32874mln.TaskDescription.copydefault(this, map);
    }

    public static final Unit AEQbTJ(AbstractC32806mkY abstractC32806mkY, android.content.Context context) {
        abstractC32806mkY.EZpvd(context);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.fARcdN.OLrzqt("init", new Function0() { // from class: o.mlb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC32806mkY.AEQbTJ(this.EZpvd, context);
            }
        });
    }

    @Override // o.InterfaceC32874mln
    public final void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
        this.fJNWhG = true;
    }
}
