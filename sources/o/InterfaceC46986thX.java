package o;

import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.thX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC46986thX {
    public static final TaskDescription Companion = TaskDescription.EZpvd;

    @POST("{path}")
    AbstractC58185ywX<ResponseData<JsonElement>> OLrzqt(@retrofit2.http.Path(encoded = true, value = "path") @NotNull java.lang.String str, @Body @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    /* JADX INFO: renamed from: o.thX$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }

        public final InterfaceC46986thX KWHzl() {
            return (InterfaceC46986thX) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC46986thX.class), C43285rmR.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.thX$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ AbstractC58185ywX postOkxCollection$default(InterfaceC46986thX interfaceC46986thX, java.lang.String str, java.util.Map map, SubdomainStrategy subdomainStrategy, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOkxCollection");
            }
            if ((i & 4) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return interfaceC46986thX.OLrzqt(str, map, subdomainStrategy);
        }
    }
}
