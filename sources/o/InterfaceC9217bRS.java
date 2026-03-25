package o;

import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.model.ChainAddress;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bRS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC9217bRS {
    OKWBaseTransaction<?> fetchVPNInfo();

    /* JADX INFO: renamed from: o.bRS$TaskDescription */
    public static final class TaskDescription {
        public static ChainAddress KWHzl(@NotNull InterfaceC9217bRS interfaceC9217bRS, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str) {
            ChainAddress chainAddressOLrzqt;
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                chainAddressOLrzqt = abstractC12782ctV.copydefault(str);
            } else {
                chainAddressOLrzqt = abstractC12782ctV.OLrzqt(java.lang.Long.valueOf(interfaceC9217bRS.fetchVPNInfo().dHguZz().AEQbTJ()));
            }
            Intrinsics.copydefault(chainAddressOLrzqt);
            return chainAddressOLrzqt;
        }
    }
}
