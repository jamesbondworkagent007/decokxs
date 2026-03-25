package o;

import com.okinc.market.quotation.ui.model.OptionsDirection;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41645qui;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC41642quf extends InterfaceC41645qui<InterfaceC41642quf>, qWP<InterfaceC41642quf> {
    InterfaceC41642quf AEQbTJ(java.lang.Double d, java.lang.Double d2, java.lang.Object obj);

    InterfaceC41642quf AEQbTJ(boolean z);

    java.lang.Object AYXKKw();

    OptionsDirection EZpvd();

    InterfaceC41642quf EZpvd(java.lang.String str);

    java.lang.Double KWHzl();

    InterfaceC41642quf KWHzl(boolean z);

    OptionInstrument OLrzqt();

    java.lang.Double copydefault();

    /* JADX INFO: renamed from: o.quf$TaskDescription */
    public static final class TaskDescription {
        public static InterfaceC55797xqi OLrzqt(@NotNull InterfaceC41642quf interfaceC41642quf) {
            return InterfaceC41645qui.TaskDescription.AEQbTJ(interfaceC41642quf);
        }

        public static BizInstrument AEQbTJ(@NotNull InterfaceC41642quf interfaceC41642quf) {
            return interfaceC41642quf.OLrzqt();
        }

        public static /* synthetic */ InterfaceC41642quf onCopy$default(InterfaceC41642quf interfaceC41642quf, java.lang.Double d, java.lang.Double d2, java.lang.Object obj, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCopy");
            }
            if ((i & 1) != 0) {
                d = interfaceC41642quf.KWHzl();
            }
            if ((i & 2) != 0) {
                d2 = interfaceC41642quf.copydefault();
            }
            if ((i & 4) != 0) {
                obj = interfaceC41642quf.AYXKKw();
            }
            return interfaceC41642quf.AEQbTJ(d, d2, obj);
        }

        public static boolean AEQbTJ(@NotNull InterfaceC41642quf interfaceC41642quf, @NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            if (interfaceC40516qYt instanceof InterfaceC41642quf) {
                InterfaceC41642quf interfaceC41642quf2 = (InterfaceC41642quf) interfaceC40516qYt;
                if (Intrinsics.EZpvd((java.lang.Object) interfaceC41642quf.OLrzqt().getInstId(), (java.lang.Object) interfaceC41642quf2.OLrzqt().getInstId()) && Intrinsics.EZpvd(interfaceC41642quf.AYXKKw(), interfaceC41642quf2.AYXKKw())) {
                    return true;
                }
            }
            return false;
        }

        public static boolean KWHzl(@NotNull InterfaceC41642quf interfaceC41642quf, @NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof InterfaceC41642quf) && Intrinsics.EZpvd(interfaceC41642quf, interfaceC40516qYt);
        }

        public static InterfaceC41642quf KWHzl(@NotNull InterfaceC41642quf interfaceC41642quf, boolean z) {
            return interfaceC41642quf.DbNXlk() != z ? interfaceC41642quf.AEQbTJ(z) : interfaceC41642quf;
        }

        public static InterfaceC41642quf AEQbTJ(@NotNull InterfaceC41642quf interfaceC41642quf, java.lang.String str) {
            return !Intrinsics.EZpvd((java.lang.Object) interfaceC41642quf.gEmmrt(), (java.lang.Object) str) ? interfaceC41642quf.EZpvd(str) : interfaceC41642quf;
        }
    }
}
