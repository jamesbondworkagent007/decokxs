package aws.smithy.kotlin.runtime.io.middleware;

import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C5074Ds;
import o.C5077Dv;
import o.C5080Dy;
import o.C56444yFp;
import o.CG;
import o.DA;
import o.InterfaceC5075Dt;
import o.InterfaceC5076Du;
import o.InterfaceC5078Dw;
import o.InterfaceC56445yFq;
import o.yDQ;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Phase<Request, Response> implements InterfaceC5075Dt<Request, Response> {
    public final yDQ<InterfaceC5075Dt<Request, Response>> OLrzqt = new yDQ<>();

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Order.values().length];
            try {
                iArr[Order.Before.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Order.After.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Order {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Order[] $VALUES;
        public static final Order Before = new Order("Before", 0);
        public static final Order After = new Order("After", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Order[] $values() {
            return new Order[]{Before, After};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Order> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static Order[] values() {
            return (Order[]) $VALUES.clone();
        }

        private Order(String str, int i) {
        }

        static {
            Order[] orderArr$values = $values();
            $VALUES = orderArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(orderArr$values);
        }
    }

    public static /* synthetic */ void intercept$default(Phase phase, Order order, yHO yho, int i, Object obj) {
        if ((i & 1) != 0) {
            order = Order.After;
        }
        phase.OLrzqt(order, yho);
    }

    public final void OLrzqt(@NotNull Order order, @NotNull yHO<? super Request, ? super CG<? super Request, ? extends Response>, ? super Continuation<? super Response>, ? extends Object> yho) {
        Intrinsics.checkNotNullParameter(order, "");
        Intrinsics.checkNotNullParameter(yho, "");
        copydefault(new C5074Ds(yho), order);
    }

    public static /* synthetic */ void register$default(Phase phase, InterfaceC5076Du interfaceC5076Du, Order order, int i, Object obj) {
        if ((i & 2) != 0) {
            order = Order.After;
        }
        phase.AEQbTJ(interfaceC5076Du, order);
    }

    public final void AEQbTJ(@NotNull InterfaceC5076Du<Request> interfaceC5076Du, @NotNull Order order) {
        Intrinsics.checkNotNullParameter(interfaceC5076Du, "");
        Intrinsics.checkNotNullParameter(order, "");
        copydefault(new C5080Dy(interfaceC5076Du), order);
    }

    public static /* synthetic */ void register$default(Phase phase, InterfaceC5078Dw interfaceC5078Dw, Order order, int i, Object obj) {
        if ((i & 2) != 0) {
            order = Order.After;
        }
        phase.AEQbTJ(interfaceC5078Dw, order);
    }

    public final void AEQbTJ(@NotNull InterfaceC5078Dw<Response> interfaceC5078Dw, @NotNull Order order) {
        Intrinsics.checkNotNullParameter(interfaceC5078Dw, "");
        Intrinsics.checkNotNullParameter(order, "");
        copydefault(new DA(interfaceC5078Dw), order);
    }

    public static /* synthetic */ void register$default(Phase phase, InterfaceC5075Dt interfaceC5075Dt, Order order, int i, Object obj) {
        if ((i & 2) != 0) {
            order = Order.After;
        }
        phase.copydefault(interfaceC5075Dt, order);
    }

    public final void copydefault(@NotNull InterfaceC5075Dt<Request, Response> interfaceC5075Dt, @NotNull Order order) {
        Intrinsics.checkNotNullParameter(interfaceC5075Dt, "");
        Intrinsics.checkNotNullParameter(order, "");
        int i = Activity.OLrzqt[order.ordinal()];
        if (i == 1) {
            this.OLrzqt.addFirst(interfaceC5075Dt);
        } else {
            if (i != 2) {
                return;
            }
            this.OLrzqt.addLast(interfaceC5075Dt);
        }
    }

    @Override // o.InterfaceC5075Dt
    public <H extends CG<? super Request, ? extends Response>> Object EZpvd(Request request, @NotNull H h, @NotNull Continuation<? super Response> continuation) {
        if (this.OLrzqt.isEmpty()) {
            return h.OLrzqt(request, continuation);
        }
        InterfaceC5075Dt[] interfaceC5075DtArr = (InterfaceC5075Dt[]) this.OLrzqt.toArray(new InterfaceC5075Dt[0]);
        return C5077Dv.OLrzqt(h, (InterfaceC5075Dt[]) Arrays.copyOf(interfaceC5075DtArr, interfaceC5075DtArr.length)).OLrzqt(request, continuation);
    }
}
