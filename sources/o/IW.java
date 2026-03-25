package o;

import java.util.concurrent.ArrayBlockingQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IW implements IZ {
    public Function1<? super IV, Unit> AEQbTJ;
    public final java.lang.Object copydefault = new java.lang.Object();
    public final ArrayBlockingQueue<IV> EZpvd = new ArrayBlockingQueue<>(512);

    @Override // o.IZ
    public void OLrzqt(@NotNull IV iv) {
        Function1<? super IV, Unit> function1;
        Intrinsics.checkNotNullParameter(iv, "");
        synchronized (this.copydefault) {
            if (this.AEQbTJ == null) {
                this.EZpvd.offer(iv);
            }
            function1 = this.AEQbTJ;
        }
        if (function1 == null) {
            return;
        }
        function1.invoke(iv);
    }

    @Override // o.IZ
    public void KWHzl(Function1<? super IV, Unit> function1) {
        java.util.ArrayList<IV> arrayList;
        synchronized (this.copydefault) {
            this.AEQbTJ = function1;
            arrayList = new java.util.ArrayList();
            this.EZpvd.drainTo(arrayList);
        }
        for (IV iv : arrayList) {
            if (function1 != null) {
                function1.invoke(iv);
            }
        }
    }
}
