package o;

import com.okinc.business.dex.trade.component.orderandposition.ordertab.domain.model.OrderAndPositionTab;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22421hez;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6971aZT {
    public final kYC AEQbTJ;

    /* JADX INFO: renamed from: o.aZT$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderAndPositionTab.values().length];
            try {
                iArr[OrderAndPositionTab.Order.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderAndPositionTab.Position.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    @yCM
    public C6971aZT(@NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(kyc, "");
        this.AEQbTJ = kyc;
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull OrderAndPositionTab orderAndPositionTab, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<java.lang.String> list) {
        java.lang.String str6;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(orderAndPositionTab, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        int i = TaskDescription.AEQbTJ[orderAndPositionTab.ordinal()];
        if (i == 1) {
            str6 = "DEXTrade_Openorder_Page_Click";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str6 = "DEXTrade_Myposition_Page_Click";
        }
        java.lang.String strOLrzqt = this.AEQbTJ.OLrzqt(C33129mqd.valueOf(str));
        AbstractC22421hez.Application application = AbstractC22421hez.Companion;
        java.lang.String strEZpvd = application.EZpvd();
        java.lang.String strKWHzl = application.KWHzl();
        InterfaceC9738bbJ interfaceC9738bbJCopydefault = this.AEQbTJ.copydefault();
        C22402heg c22402heg = new C22402heg(strOLrzqt, strEZpvd, strKWHzl, str3, str5, str4, "", (interfaceC9738bbJCopydefault == null || !interfaceC9738bbJCopydefault.RJOkX()) ? "no" : "yes");
        java.util.Map mapOLrzqt = C56423yEv.OLrzqt();
        mapOLrzqt.put(EopTrackEvent.KEY_BUTTON_NAME, str2);
        mapOLrzqt.putAll(map == null ? C56424yEw.KWHzl() : map);
        Unit unit = Unit.INSTANCE;
        C25437iwh.EZpvd(str6, c22402heg, (java.util.Map<java.lang.String, java.lang.String>) C56423yEv.AYXKKw(mapOLrzqt), list);
    }
}
