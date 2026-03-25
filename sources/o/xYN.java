package o;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes12.dex */
public interface xYN {
    public static final Application Companion = Application.KWHzl;

    @POST
    AbstractC58185ywX<JsonObject> AEQbTJ(@Url @NotNull java.lang.String str, @Body @NotNull JsonElement jsonElement);

    public static final class Application {
        public static final /* synthetic */ Application KWHzl = new Application();

        private Application() {
        }

        public final xYN EZpvd() {
            return (xYN) C43393roT.EZpvd(C56524yIo.AEQbTJ(xYN.class), xYK.AEQbTJ);
        }
    }
}
