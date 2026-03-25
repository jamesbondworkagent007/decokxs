package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54763xUk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xUk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC54763xUk {
    public static final Activity Companion = Activity.EZpvd;

    void AEQbTJ(InterfaceC54763xUk interfaceC54763xUk);

    AbstractC54531xLw KWHzl(@NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.xUk$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity EZpvd = new Activity();
        public static final InterfaceC56387yDm<C54769xUq> AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.xUn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InterfaceC54763xUk.Activity.KWHzl();
            }
        });

        private Activity() {
        }

        public static final C54769xUq KWHzl() {
            return new C54769xUq();
        }

        public final InterfaceC54763xUk copydefault() {
            return AEQbTJ.getValue();
        }

        public final void copydefault(@NotNull InterfaceC54763xUk interfaceC54763xUk) {
            Intrinsics.checkNotNullParameter(interfaceC54763xUk, "");
            InterfaceC54763xUk interfaceC54763xUkCopydefault = copydefault();
            C54769xUq c54769xUq = interfaceC54763xUkCopydefault instanceof C54769xUq ? (C54769xUq) interfaceC54763xUkCopydefault : null;
            if (c54769xUq != null) {
                InterfaceC54763xUk interfaceC54763xUkCopydefault2 = c54769xUq.copydefault();
                if (interfaceC54763xUkCopydefault2 != null) {
                    interfaceC54763xUkCopydefault2.AEQbTJ(c54769xUq.copydefault());
                }
                c54769xUq.EZpvd(interfaceC54763xUk);
            }
        }
    }
}
