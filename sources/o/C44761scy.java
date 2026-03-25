package o;

import com.google.firebase.messaging.Constants;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.scy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44761scy {
    public final java.util.Map<java.lang.String, JsonElement> copydefault = new LinkedHashMap();
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.scy$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.scy.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final C44761scy copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.put("thread", JsonElementKt.JsonPrimitive(str));
        return this;
    }

    public final C44761scy KWHzl(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        this.copydefault.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, JsonElementKt.JsonPrimitive(th.getMessage()));
        return this;
    }

    public final C44761scy AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.put("event", JsonElementKt.JsonPrimitive(str));
        return this;
    }

    public final C44761scy KWHzl(long j) {
        this.copydefault.put("created_at", JsonElementKt.JsonPrimitive(java.lang.Long.valueOf(j)));
        return this;
    }

    public final boolean KWHzl() {
        return this.copydefault.containsKey(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    }

    public final java.lang.String OLrzqt() {
        return new JsonObject(this.copydefault).toString();
    }
}
