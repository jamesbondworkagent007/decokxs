package o;

import com.okinc.okimcore.model.im.OKMessage;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sKD implements InterfaceC44293sKl {
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final java.util.Set<InterfaceC44287sKf> OLrzqt = new LinkedHashSet();
    public final CopyOnWriteArrayList<InterfaceC44291sKj> EZpvd = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC44286sKe> KWHzl = new CopyOnWriteArrayList<>();

    @yCM
    public sKD() {
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sKD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public void EZpvd(@NotNull Function1<? super InterfaceC44287sKf, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            try {
                function1.invoke((InterfaceC44287sKf) it.next());
            } catch (java.lang.Exception e) {
                pUU.KWHzl("MessageEventBridge", "notifyConnectionStatusEvent error:" + e);
            }
        }
    }

    public void AEQbTJ(@NotNull InterfaceC44287sKf interfaceC44287sKf) {
        Intrinsics.checkNotNullParameter(interfaceC44287sKf, "");
        this.OLrzqt.add(interfaceC44287sKf);
    }

    public void OLrzqt(@NotNull InterfaceC44287sKf interfaceC44287sKf) {
        Intrinsics.checkNotNullParameter(interfaceC44287sKf, "");
        this.OLrzqt.remove(interfaceC44287sKf);
    }

    @Override // o.InterfaceC44293sKl
    public void OLrzqt(@NotNull InterfaceC44291sKj interfaceC44291sKj) {
        Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
        this.EZpvd.add(interfaceC44291sKj);
    }

    @Override // o.InterfaceC44293sKl
    public void AEQbTJ(@NotNull InterfaceC44291sKj interfaceC44291sKj) {
        Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
        this.EZpvd.remove(interfaceC44291sKj);
    }

    @Override // o.InterfaceC44293sKl
    public void copydefault(@NotNull Function1<? super InterfaceC44291sKj, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        for (InterfaceC44291sKj interfaceC44291sKj : this.EZpvd) {
            try {
                Intrinsics.copydefault(interfaceC44291sKj);
                function1.invoke(interfaceC44291sKj);
            } catch (java.lang.Exception e) {
                pUU.KWHzl("MessageEventBridge", "notifyMessageEvent error:" + e);
            }
        }
    }

    public final void copydefault(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.util.Iterator<T> it = this.KWHzl.iterator();
        while (it.hasNext()) {
            ((InterfaceC44286sKe) it.next()).AEQbTJ(oKMessage);
        }
    }
}
