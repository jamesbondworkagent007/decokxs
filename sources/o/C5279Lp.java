package o;

import com.amplitude.eventbridge.EventChannel;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Lp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5279Lp {
    public static final Application Companion = new Application(null);
    public final ArrayBlockingQueue<C5276Lm> AEQbTJ;
    public final java.lang.Object EZpvd;
    public InterfaceC5281Lr KWHzl;
    public final EventChannel OLrzqt;

    /* JADX INFO: renamed from: o.Lp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Lp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public C5279Lp(@NotNull EventChannel eventChannel) {
        Intrinsics.checkNotNullParameter(eventChannel, "");
        this.OLrzqt = eventChannel;
        this.EZpvd = new java.lang.Object();
        this.AEQbTJ = new ArrayBlockingQueue<>(512);
    }

    public final void EZpvd(@NotNull C5276Lm c5276Lm) {
        InterfaceC5281Lr interfaceC5281Lr;
        Intrinsics.checkNotNullParameter(c5276Lm, "");
        synchronized (this.EZpvd) {
            if (this.KWHzl == null) {
                this.AEQbTJ.offer(c5276Lm);
            }
            interfaceC5281Lr = this.KWHzl;
        }
        if (interfaceC5281Lr != null) {
            interfaceC5281Lr.OLrzqt(this.OLrzqt, c5276Lm);
        }
    }

    public final void OLrzqt(InterfaceC5281Lr interfaceC5281Lr) {
        synchronized (this.EZpvd) {
            if (this.KWHzl != null) {
                return;
            }
            this.KWHzl = interfaceC5281Lr;
            java.util.ArrayList<C5276Lm> arrayList = new java.util.ArrayList();
            this.AEQbTJ.drainTo(arrayList);
            for (C5276Lm c5276Lm : arrayList) {
                if (interfaceC5281Lr != null) {
                    interfaceC5281Lr.OLrzqt(this.OLrzqt, c5276Lm);
                }
            }
        }
    }
}
