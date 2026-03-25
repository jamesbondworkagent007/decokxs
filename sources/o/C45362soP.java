package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45362soP {
    public static final C45362soP copydefault = new C45362soP();

    private C45362soP() {
    }

    public final EventData copydefault() {
        EventData eventData = new EventData();
        eventData.setAct("event_support");
        return eventData;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Json.Default r0 = Json.Default;
        r0.getSerializersModule();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        JsonElement jsonElementEncodeToJsonElement = r0.encodeToJsonElement(new LinkedHashMapSerializer(stringSerializer, stringSerializer), map);
        r0.getSerializersModule();
        java.lang.String strEncodeToString = r0.encodeToString(JsonElement.Companion.serializer(), jsonElementEncodeToJsonElement);
        EventData eventDataCopydefault = copydefault();
        eventDataCopydefault.setMsg(str);
        eventDataCopydefault.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("isRunningInEmulator", strEncodeToString)));
        try {
            Result.Application application = Result.Companion;
            ReportManager.AEQbTJ.EZpvd(eventDataCopydefault);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
