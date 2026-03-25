package o;

import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.domain.remote.dto.PublishPermissionResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tSl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC46387tSl {
    public static final Application Companion = Application.OLrzqt;

    boolean AEQbTJ();

    boolean AYXKKw();

    boolean AhwBna();

    Flow<AbstractC47263tmj> AkhnZx();

    OrbitBeanResp EZpvd();

    java.lang.Object EZpvd(java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super OrbitBeanResp> continuation);

    PublishPermissionResp KWHzl();

    java.lang.Object KWHzl(@NotNull Continuation<? super kotlin.Pair<PublishPermissionResp, java.lang.String>> continuation);

    void KWHzl(PlanetBasicUserInfoResp planetBasicUserInfoResp);

    PlanetBasicUserInfoResp OLrzqt();

    java.lang.Object copydefault(@NotNull Continuation<? super kotlin.Pair<C46189tLc, ? extends java.lang.Throwable>> continuation);

    java.lang.String copydefault();

    boolean copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3);

    java.lang.String djBIcL();

    boolean gEmmrt();

    boolean valueOf();

    /* JADX INFO: renamed from: o.tSl$Application */
    public static final class Application {
        public static final /* synthetic */ Application OLrzqt = new Application();

        private Application() {
        }

        public final InterfaceC46387tSl KWHzl() {
            return tPF.copydefault.alsFma();
        }
    }
}
