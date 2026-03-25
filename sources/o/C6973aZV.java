package o;

import com.okinc.business.dex.trade.component.orderandposition.ordertab.domain.model.OrderAndPositionTab;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22421hez;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6973aZV {
    public final kYC AEQbTJ;

    /* JADX INFO: renamed from: o.aZV$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

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
            copydefault = iArr;
        }
    }

    @yCM
    public C6973aZV(@NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(kyc, "");
        this.AEQbTJ = kyc;
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull OrderAndPositionTab orderAndPositionTab, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<java.lang.String> list) {
        java.lang.String str5;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(orderAndPositionTab, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        int i = Activity.copydefault[orderAndPositionTab.ordinal()];
        if (i == 1) {
            str5 = "DEXTrade_Openorder_Page_View";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str5 = "DEXTrade_Myposition_Page_View";
        }
        java.lang.String strOLrzqt = this.AEQbTJ.OLrzqt(C33129mqd.valueOf(str));
        AbstractC22421hez.Application application = AbstractC22421hez.Companion;
        java.lang.String strEZpvd = application.EZpvd();
        java.lang.String strKWHzl = application.KWHzl();
        InterfaceC9738bbJ interfaceC9738bbJCopydefault = this.AEQbTJ.copydefault();
        C25437iwh.EZpvd(str5, new C22402heg(strOLrzqt, strEZpvd, strKWHzl, str2, str4, str3, "", (interfaceC9738bbJCopydefault == null || !interfaceC9738bbJCopydefault.RJOkX()) ? "no" : "yes"), map, list);
    }
}
