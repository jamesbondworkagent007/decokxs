package o;

import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import o.InterfaceC38164pOp;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.pOp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC38164pOp {
    public static final ActionBar Companion = ActionBar.EZpvd;

    @POST("https://office-mobilecicdapi.okg.com/online-mobile/portal/save_deeplink_config")
    java.lang.Object AEQbTJ(@Body @NotNull pLX plx, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    /* JADX INFO: renamed from: o.pOp$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar EZpvd = new ActionBar();
        public static final InterfaceC56387yDm<InterfaceC38164pOp> copydefault = C56392yDr.copydefault(new Function0() { // from class: o.pOo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InterfaceC38164pOp.ActionBar.copydefault();
            }
        });

        private ActionBar() {
        }

        public static final InterfaceC38164pOp copydefault() {
            return (InterfaceC38164pOp) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC38164pOp.class));
        }

        public final InterfaceC38164pOp KWHzl() {
            return copydefault.getValue();
        }

        public final InterfaceC38164pOp AEQbTJ() {
            return KWHzl();
        }
    }
}
