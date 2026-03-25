package o;

import java.util.Collections;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tdq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46793tdq {
    public static final void copydefault(@NotNull java.util.List<C46797tdu<?>> list, @NotNull C46797tdu<?> c46797tdu, @NotNull C46797tdu<?> c46797tdu2, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c46797tdu, "");
        Intrinsics.checkNotNullParameter(c46797tdu2, "");
        Objects.toString(list);
        Objects.toString(c46797tdu);
        Objects.toString(c46797tdu2);
        if (c46797tdu.AEQbTJ() == c46797tdu2.AEQbTJ()) {
            return;
        }
        if (!z || c46797tdu.EZpvd().getValue().intValue() == c46797tdu2.EZpvd().getValue().intValue()) {
            byte b = c46797tdu.AEQbTJ() > c46797tdu2.AEQbTJ() ? (byte) -1 : (byte) 1;
            int iAEQbTJ = c46797tdu.AEQbTJ();
            int iAEQbTJ2 = c46797tdu2.AEQbTJ();
            if (b == -1) {
                if (iAEQbTJ2 <= iAEQbTJ) {
                    while (true) {
                        C46797tdu<?> c46797tdu3 = list.get(iAEQbTJ);
                        if ((!z || c46797tdu.EZpvd().getValue().intValue() == c46797tdu3.EZpvd().getValue().intValue()) && !Intrinsics.EZpvd(c46797tdu, c46797tdu3)) {
                            OLrzqt(list, c46797tdu, c46797tdu3);
                        }
                        if (iAEQbTJ == iAEQbTJ2) {
                            break;
                        } else {
                            iAEQbTJ--;
                        }
                    }
                }
            } else if (iAEQbTJ <= iAEQbTJ2) {
                while (true) {
                    C46797tdu<?> c46797tdu4 = list.get(iAEQbTJ);
                    if ((!z || c46797tdu.EZpvd().getValue().intValue() == c46797tdu4.EZpvd().getValue().intValue()) && !Intrinsics.EZpvd(c46797tdu, c46797tdu4)) {
                        OLrzqt(list, c46797tdu, c46797tdu4);
                    }
                    if (iAEQbTJ == iAEQbTJ2) {
                        break;
                    } else {
                        iAEQbTJ++;
                    }
                }
            }
            Objects.toString(list);
        }
    }

    public static final void OLrzqt(java.util.List<C46797tdu<?>> list, C46797tdu<?> c46797tdu, C46797tdu<?> c46797tdu2) {
        Objects.toString(list);
        Objects.toString(c46797tdu);
        Objects.toString(c46797tdu2);
        int iAEQbTJ = c46797tdu2.AEQbTJ();
        int iAEQbTJ2 = c46797tdu.AEQbTJ();
        Collections.swap(list, c46797tdu.AEQbTJ(), c46797tdu2.AEQbTJ());
        c46797tdu.copydefault(iAEQbTJ);
        c46797tdu2.copydefault(iAEQbTJ2);
        Objects.toString(list);
        Objects.toString(c46797tdu);
        Objects.toString(c46797tdu2);
    }
}
