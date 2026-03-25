package o;

import com.okinc.core.util.SPUtils;
import com.okinc.okuser.data.User;
import com.okinc.planet.biz_home.root.PlanetSubPage;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47904tys {
    public static final InterfaceC56387yDm AEQbTJ;
    public static final C47904tys EZpvd;
    public static final java.lang.String KWHzl;
    public static final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return KWHzl;
    }

    private C47904tys() {
    }

    static {
        C47904tys c47904tys = new C47904tys();
        EZpvd = c47904tys;
        AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tyt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47904tys.AEQbTJ();
            }
        });
        User userOLrzqt = c47904tys.OLrzqt().OLrzqt();
        KWHzl = "notification_top_unread_message_" + C33129mqd.gEmmrt(userOLrzqt != null ? userOLrzqt.getUid() : null);
        OLrzqt = 8;
    }

    public final InterfaceC47278tmy OLrzqt() {
        return (InterfaceC47278tmy) AEQbTJ.getValue();
    }

    public static final InterfaceC47278tmy AEQbTJ() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    public final void OLrzqt(PlanetSubPage planetSubPage) {
        if (planetSubPage == null) {
            SPUtils.remove("planet.planet_root_tab_last_page");
        } else {
            SPUtils.put("planet.planet_root_tab_last_page", planetSubPage.name());
        }
    }

    public final PlanetSubPage EZpvd() {
        java.lang.Object objM7377constructorimpl;
        java.lang.String string = SPUtils.getString("planet.planet_root_tab_last_page", null);
        if (string == null) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(PlanetSubPage.valueOf(string));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (PlanetSubPage) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final void copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put(str, java.lang.Integer.valueOf(i));
    }
}
