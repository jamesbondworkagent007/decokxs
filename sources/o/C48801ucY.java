package o;

import com.google.gson.JsonObject;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ucY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48801ucY {
    public static final C48801ucY AEQbTJ = new C48801ucY();

    private C48801ucY() {
    }

    public final void copydefault(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        C48787ucK.AEQbTJ.KWHzl(application);
    }

    public final void AEQbTJ(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        C48787ucK.loadStrategy$default(C48787ucK.AEQbTJ, application, null, 2, null);
    }

    public final void AEQbTJ() {
        C48787ucK c48787ucK = C48787ucK.AEQbTJ;
        c48787ucK.AEQbTJ("amplitudeConfig", new Application());
        c48787ucK.AEQbTJ("dataTesterConfig", new ActionBar());
        C32864mld c32864mld = C32864mld.OLrzqt;
        c32864mld.AEQbTJ(new Function0() { // from class: o.udd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48801ucY.KWHzl();
            }
        });
        c32864mld.KWHzl(new Function0() { // from class: o.udf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48801ucY.OLrzqt();
            }
        });
    }

    /* JADX INFO: renamed from: o.ucY$Application */
    public static final class Application implements InterfaceC48788ucL {
        @Override // o.InterfaceC48788ucL
        public void onStrategyUpdated() {
            C32872mll.OLrzqt.OLrzqt();
        }
    }

    /* JADX INFO: renamed from: o.ucY$ActionBar */
    public static final class ActionBar implements InterfaceC48788ucL {
        @Override // o.InterfaceC48788ucL
        public void onStrategyUpdated() {
            C32859mlY.KWHzl.KWHzl(C48787ucK.AEQbTJ.OLrzqt("dataTesterConfig.pullConfigThrottleMills", 1000L));
        }
    }

    public static final JsonObject KWHzl() {
        return C48787ucK.AEQbTJ.AEQbTJ("amplitudeConfig");
    }

    public static final JsonObject OLrzqt() {
        return C48787ucK.AEQbTJ.AEQbTJ("repeatedEventConfig");
    }
}
