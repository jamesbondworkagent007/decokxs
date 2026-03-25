package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.bean.OKWSConnDataParseResult;
import com.okinc.websocket.connection.OKWsDoh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC57564ykm {

    /* JADX INFO: renamed from: o.ykm$TaskDescription */
    public static final class TaskDescription {
        public static long KWHzl(@NotNull InterfaceC57564ykm interfaceC57564ykm) {
            return 5L;
        }
    }

    java.util.List<java.lang.Object> AEQbTJ();

    void AEQbTJ(OKIncomingData oKIncomingData, @NotNull java.util.Map<java.lang.String, ? extends AbstractC57561ykj> map);

    boolean AhwBna();

    java.lang.String EZpvd();

    long KWHzl();

    AbstractC57561ykj KWHzl(@NotNull java.lang.String str);

    OKWsDoh OLrzqt();

    OKWSConnDataParseResult copydefault(@NotNull java.lang.String str);

    java.lang.String copydefault();

    boolean gEmmrt();
}
