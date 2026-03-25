package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.lite.hero.data.model.HeroResponseRootModel;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;

/* JADX INFO: renamed from: o.suX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC45675suX {
    public static final TaskDescription Companion = TaskDescription.AEQbTJ;

    @GET("/v2/support/simple/hero_tab")
    java.lang.Object KWHzl(@Header("Cache-Strategy") @NotNull java.lang.String str, @Header("Cache-Expire") int i, @NotNull Continuation<? super ResponseData<HeroResponseRootModel>> continuation);

    /* JADX INFO: renamed from: o.suX$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }

        public final InterfaceC45675suX AEQbTJ() {
            return (InterfaceC45675suX) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC45675suX.class), null, 1, null);
        }
    }
}
