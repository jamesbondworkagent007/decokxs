package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5386Ps;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wXR implements InterfaceC5386Ps<wXL, wXL> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull wXL wxl) {
        Intrinsics.checkNotNullParameter(wxl, "");
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<wXL> AEQbTJ(@NotNull wXL wxl, int i, int i2, @NotNull NM nm) {
        Intrinsics.checkNotNullParameter(wxl, "");
        Intrinsics.checkNotNullParameter(nm, "");
        return new InterfaceC5386Ps.Application<>(new C5465St(wxl), new wXM(wxl));
    }

    public static final class TaskDescription implements InterfaceC5390Pw<wXL, wXL> {
        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<wXL, wXL> AEQbTJ(@NotNull PA pa) {
            Intrinsics.checkNotNullParameter(pa, "");
            return new wXR();
        }
    }
}
