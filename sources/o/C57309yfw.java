package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import com.okinc.web.WebActivity;
import com.okinc.web.WebStringEnum;
import com.okinc.web.bean.WebShareInfo;
import com.okinc.web.web.IWebActivityAPI;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43233rlS;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yfw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57309yfw {
    public static Function2<? super IWebActivityAPI, ? super WebShareInfo, Unit> AYXKKw;
    public static yHO<? super AbstractActivityC33041mov, ? super IWebActivityAPI, ? super WebShareInfo, Unit> AhwBna;
    public static Function0<java.lang.Boolean> EZpvd;
    public static java.lang.String KWHzl;
    public static java.lang.String djBIcL;
    public static Function1<? super WebStringEnum, java.lang.String> fetchVPNInfo;
    public static Function0<? extends android.view.View> gEmmrt;
    public static final C57309yfw AEQbTJ = new C57309yfw();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.yfy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57309yfw.AEQbTJ();
        }
    });
    public static final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.yfz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57309yfw.AhwBna();
        }
    });
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function2<? super IWebActivityAPI, ? super WebShareInfo, Unit> function2) {
        AYXKKw = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super com.okinc.web.web.IWebActivityAPI, ? super com.okinc.web.bean.WebShareInfo, kotlin.Unit>, kotlin.jvm.functions.Function2<com.okinc.web.web.IWebActivityAPI, com.okinc.web.bean.WebShareInfo, kotlin.Unit> */
    public final Function2<IWebActivityAPI, WebShareInfo, Unit> AkhnZx() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super WebStringEnum, java.lang.String> function1) {
        fetchVPNInfo = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<? extends android.view.View> function0) {
        gEmmrt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<java.lang.Boolean> function0) {
        EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function0<? extends android.view.View>, kotlin.jvm.functions.Function0<android.view.View> */
    public final Function0<android.view.View> isConnected() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.Boolean> valueOf() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.web.WebStringEnum, java.lang.String>, kotlin.jvm.functions.Function1<com.okinc.web.WebStringEnum, java.lang.String> */
    public final Function1<WebStringEnum, java.lang.String> values() {
        return fetchVPNInfo;
    }

    private C57309yfw() {
    }

    public final void AEQbTJ(yHO<? super AbstractActivityC33041mov, ? super IWebActivityAPI, ? super WebShareInfo, Unit> yho) {
        if (yho != null) {
            AEQbTJ.KWHzl(yho);
        } else {
            yho = null;
        }
        AhwBna = yho;
    }

    public final java.lang.String DbNXlk() {
        java.lang.String str = djBIcL;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final java.lang.String AYXKKw() {
        java.lang.String str = KWHzl;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final java.util.ArrayList<Function1<OkHttpClient, OkHttpClient>> djBIcL() {
        return (java.util.ArrayList) copydefault.getValue();
    }

    public static final java.util.ArrayList AEQbTJ() {
        return new java.util.ArrayList();
    }

    public final void OLrzqt(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (C43308rmo.KWHzl(application)) {
            C57339ygZ.OLrzqt();
            C43239rlY.AEQbTJ.copydefault(new Activity(), C56392yDr.copydefault(new Function0() { // from class: o.yfF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C57309yfw.copydefault();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o.yfw$Activity */
    public static final class Activity implements InterfaceC43233rlS {
        public final DeeplinkMode OLrzqt = DeeplinkMode.APP;
        public final java.lang.String copydefault = "web";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public DeeplinkMode KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return this.copydefault;
        }

        @Override // o.InterfaceC43233rlS
        public boolean copydefault() {
            return false;
        }

        @Override // o.InterfaceC43233rlS
        public java.util.List<C43240rlZ> AEQbTJ() {
            return InterfaceC43233rlS.Application.copydefault(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean AYXKKw() {
            return InterfaceC43233rlS.Application.AEQbTJ(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean EZpvd() {
            return InterfaceC43233rlS.Application.OLrzqt(this);
        }
    }

    public static final StateListAnimator copydefault() {
        return new StateListAnimator();
    }

    public static final void AEQbTJ(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.lang.String string = bundle.getString("url");
        if (string != null) {
            if (C57354ygo.OLrzqt(C33129mqd.gEmmrt(string)) || C57354ygo.OLrzqt.KWHzl(C33129mqd.gEmmrt(string), C43292rmY.OLrzqt.sSMYrx().getExternal_whitelist())) {
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, bundle, null, 4, null);
            }
        }
    }

    public final void gEmmrt() {
        try {
            pUU.KWHzl("OKWebViewConfig", "clear cookie");
            android.webkit.CookieManager.getInstance().removeAllCookies(null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKWebViewConfig", "clear cookie error", e);
        }
    }

    public final java.util.List<yHO<AbstractActivityC33041mov, IWebActivityAPI, WebShareInfo, Unit>> fetchVPNInfo() {
        return (java.util.List) valueOf.getValue();
    }

    public static final java.util.ArrayList AhwBna() {
        return new java.util.ArrayList();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super o.mov, ? super com.okinc.web.web.IWebActivityAPI, ? super com.okinc.web.bean.WebShareInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(@NotNull yHO<? super AbstractActivityC33041mov, ? super IWebActivityAPI, ? super WebShareInfo, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        fetchVPNInfo().add(yho);
    }

    public final void EZpvd(@NotNull yHO<? super AbstractActivityC33041mov, ? super IWebActivityAPI, ? super WebShareInfo, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        fetchVPNInfo().remove(yho);
    }

    public final void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, IWebActivityAPI iWebActivityAPI, WebShareInfo webShareInfo) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        java.util.List<yHO<AbstractActivityC33041mov, IWebActivityAPI, WebShareInfo, Unit>> listFetchVPNInfo = fetchVPNInfo();
        int size = listFetchVPNInfo.size();
        for (int i = 0; i < size; i++) {
            listFetchVPNInfo.get(i).invoke(abstractActivityC33041mov, iWebActivityAPI, webShareInfo);
        }
    }

    public final void copydefault(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        C57354ygo.OLrzqt.KWHzl(application);
    }

    /* JADX INFO: renamed from: o.yfw$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC43234rlT {
        @Override // o.InterfaceC43234rlT
        public void OLrzqt(android.content.Context context, InterfaceC43233rlS interfaceC43233rlS, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
            Intrinsics.checkNotNullParameter(map, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                arrayList.add(C56390yDp.OLrzqt(entry.getKey(), entry.getValue()));
            }
            C57309yfw.AEQbTJ(context, C33048mpB.EZpvd((kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0])));
        }
    }
}
