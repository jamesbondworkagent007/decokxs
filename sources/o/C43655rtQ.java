package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.okuser.data.User;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rtQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43655rtQ {
    public static final C43655rtQ OLrzqt = new C43655rtQ();
    public static final MutableLiveData<java.lang.String> copydefault = new MutableLiveData<>();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rtR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43655rtQ.KWHzl();
        }
    });
    public static final int AEQbTJ = 8;

    private C43655rtQ() {
    }

    public final InterfaceC47278tmy djBIcL() {
        return (InterfaceC47278tmy) KWHzl.getValue();
    }

    public static final InterfaceC47278tmy KWHzl() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB();
    }

    public final java.lang.String AhwBna() {
        return AEQbTJ().OLrzqt();
    }

    public final boolean valueOf() {
        User userOLrzqt = djBIcL().OLrzqt();
        java.lang.String siteCode = userOLrzqt != null ? userOLrzqt.getSiteCode() : null;
        return siteCode == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) siteCode) || Intrinsics.EZpvd((java.lang.Object) siteCode, (java.lang.Object) "OKX_GLOBAL");
    }

    public final Flow<java.lang.String> gEmmrt() {
        return djBIcL().ejfBZ();
    }

    public final java.lang.String OLrzqt() {
        return AEQbTJ().EZpvd();
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().OLrzqt(str);
    }

    public final java.lang.String EZpvd() {
        return AEQbTJ().copydefault();
    }

    public final void KWHzl(java.lang.Integer num) {
        synchronized (this) {
            AEQbTJ().KWHzl(num);
        }
    }

    public static /* synthetic */ java.lang.String getOKXSiteInfo$default(C43655rtQ c43655rtQ, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c43655rtQ.AEQbTJ(str);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return AEQbTJ().copydefault(str);
    }

    public final InterfaceC4907Bvl AEQbTJ() {
        return BzK.getSharedCoreEntityManager();
    }
}
