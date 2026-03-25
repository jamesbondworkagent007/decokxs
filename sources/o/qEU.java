package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qEU extends AbstractC39961qEe {
    public qEU(@NotNull final C41607qtx c41607qtx) {
        Intrinsics.checkNotNullParameter(c41607qtx, "");
        register(C39999qFp.class).copydefault(new qEA(), new C39970qEn()).AEQbTJ(new InterfaceC59531zim() { // from class: o.qEV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i, java.lang.Object obj) {
                return qEU.copydefault(c41607qtx, i, (C39999qFp) obj);
            }
        });
    }

    public static final int copydefault(C41607qtx c41607qtx, int i, C39999qFp c39999qFp) {
        Intrinsics.checkNotNullParameter(c39999qFp, "");
        return c41607qtx.AEQbTJ(Unit.INSTANCE).booleanValue() ? 1 : 0;
    }
}
