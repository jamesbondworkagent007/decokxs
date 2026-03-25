package o;

import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23252hui;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.htP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23180htP implements InterfaceC23182htR {
    public InterfaceC58217yxC AhwBna;
    public volatile boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58217yxC valueOf() {
        return this.AhwBna;
    }

    public final AbstractC57556yke copydefault(java.lang.String str, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList) {
        C23252hui.TaskDescription taskDescription = C23252hui.Companion;
        C57567ykp c57567ykpKWHzl = KWHzl();
        Unit unit = Unit.INSTANCE;
        return taskDescription.copydefault(str, arrayList, c57567ykpKWHzl, this);
    }

    public final AbstractC57556yke EZpvd(@NotNull java.lang.String str, @NotNull WsArgV5ForWeb3 wsArgV5ForWeb3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(wsArgV5ForWeb3, "");
        return copydefault(str, yDY.copydefault(wsArgV5ForWeb3));
    }

    public C57567ykp KWHzl() {
        return C22380heK.OLrzqt.copydefault("default_trade").fARcdN().DbNXlk();
    }

    @Override // o.InterfaceC23182htR
    public void AEQbTJ(long j) {
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, j, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.htQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23180htP.copydefault(this.KWHzl, (java.lang.Long) obj);
            }
        };
        this.AhwBna = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.htW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23180htP.OLrzqt(function1, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractC23180htP abstractC23180htP, java.lang.Long l) {
        if (abstractC23180htP.gEmmrt) {
            abstractC23180htP.copydefault();
            abstractC23180htP.gEmmrt = false;
        }
        return Unit.INSTANCE;
    }
}
