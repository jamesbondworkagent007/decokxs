package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.remote.config.SwapSwitchRequest;
import com.okinc.remote.config.SwapSwitchResponse;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.ucZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC48802ucZ {
    public static final ActionBar Companion = ActionBar.EZpvd;
    public static final java.lang.String STRATEGY_API = "/v2/support/mobile/strategic";

    @POST(STRATEGY_API)
    AbstractC58185ywX<ResponseData<SwapSwitchResponse>> OLrzqt(@Body SwapSwitchRequest swapSwitchRequest);

    /* JADX INFO: renamed from: o.ucZ$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar EZpvd = new ActionBar();

        private ActionBar() {
        }

        public final InterfaceC48802ucZ copydefault() {
            return (InterfaceC48802ucZ) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC48802ucZ.class));
        }
    }
}
