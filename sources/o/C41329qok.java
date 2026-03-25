package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41329qok extends AbstractC49400uno<C41600qtq, C41600qtq> {
    public final InterfaceC54577xNn KWHzl;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C41329qok(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = interfaceC54577xNn;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(C41600qtq c41600qtq, @NotNull Continuation<? super C41600qtq> continuation) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt = null;
        if (c41600qtq == null) {
            return null;
        }
        InterfaceC54577xNn interfaceC54577xNn = this.KWHzl;
        if (interfaceC54577xNn != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("SPOT");
        }
        if (!(abstractC54531xLwOLrzqt instanceof xLL)) {
            return c41600qtq;
        }
        java.util.List<InterfaceC41641que> listAhwBna = c41600qtq.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAhwBna) {
            if (((xLL) abstractC54531xLwOLrzqt).values(((InterfaceC41641que) obj).values().getInstId()) == null) {
                arrayList.add(obj);
            }
        }
        return C41600qtq.copy$default(c41600qtq, null, null, arrayList, null, 0L, 27, null);
    }
}
