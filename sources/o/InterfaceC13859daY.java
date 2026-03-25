package o;

import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Url;

/* JADX INFO: renamed from: o.daY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13859daY {
    public static final Application Companion = Application.EZpvd;

    @GET
    AbstractC58185ywX<JsonObject> OLrzqt(@Url @NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.daY$Application */
    public static final class Application {
        public static final /* synthetic */ Application EZpvd = new Application();

        private Application() {
        }

        public final InterfaceC13859daY KWHzl() {
            return (InterfaceC13859daY) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC13859daY.class), C13920dbg.EZpvd);
        }
    }
}
