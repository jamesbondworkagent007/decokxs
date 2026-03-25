package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.lang.ref.SoftReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xSB {
    public static volatile SoftReference<java.util.List<TickersData>> EZpvd;
    public static final xSB OLrzqt = new xSB();
    public static final int copydefault = 8;

    private xSB() {
    }

    public final void AEQbTJ(@NotNull yHO<? super java.lang.Boolean, ? super java.util.List<TickersData>, ? super java.lang.Exception, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        SoftReference<java.util.List<TickersData>> softReference = EZpvd;
        java.util.List<TickersData> list = softReference != null ? softReference.get() : null;
        if (list != null) {
            yho.invoke(java.lang.Boolean.TRUE, list, null);
        }
        C55692xoj.getMarkPriceTicker$default(C55692xoj.KWHzl, "OPTION", null, null, null, null, new ActionBar(yho), 28, null);
    }

    public static final class ActionBar implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ yHO<java.lang.Boolean, java.util.List<TickersData>, java.lang.Exception, Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHO<? super java.lang.Boolean, ? super java.util.List<com.okinc.unify_trade.biz.subscribe.TickersData>, ? super java.lang.Exception, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(yHO<? super java.lang.Boolean, ? super java.util.List<TickersData>, ? super java.lang.Exception, Unit> yho) {
            this.OLrzqt = yho;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            if (z) {
                xSB xsb = xSB.OLrzqt;
                xSB.EZpvd = new SoftReference(list);
            }
            this.OLrzqt.invoke(java.lang.Boolean.valueOf(z), list, exc);
        }
    }
}
