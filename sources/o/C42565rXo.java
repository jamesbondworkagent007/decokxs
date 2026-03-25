package o;

import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rXo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42565rXo {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final JsonObject EZpvd;
    public final Gson KWHzl;

    /* JADX INFO: renamed from: o.rXo$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rXo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public C42565rXo() {
        GsonBuilder gsonBuilderNewBuilder = new Gson().newBuilder();
        gsonBuilderNewBuilder.serializeNulls();
        this.KWHzl = gsonBuilderNewBuilder.create();
        this.EZpvd = new JsonObject();
    }

    public final C42565rXo copydefault(@NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        this.EZpvd.add("tags", this.KWHzl.toJsonTree(strArr));
        return this;
    }

    public final C42565rXo OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.addProperty("thread", str);
        return this;
    }

    public final C42565rXo copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.addProperty("msg", str);
        return this;
    }

    public final C42565rXo OLrzqt(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.EZpvd.add(Constants.IPC_BUNDLE_KEY_SEND_ERROR, jsonObject);
        return this;
    }

    public final C42565rXo AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.addProperty("event", str);
        return this;
    }

    public final C42565rXo copydefault(long j) {
        this.EZpvd.addProperty("created_at", java.lang.Long.valueOf(j));
        return this;
    }

    public final C42565rXo OLrzqt(@NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.addProperty(str, num);
        return this;
    }

    public final C42565rXo EZpvd(@NotNull java.lang.String str, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.addProperty(str, obj != null ? obj.toString() : null);
        return this;
    }

    public final boolean KWHzl() {
        return this.EZpvd.has(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String json = this.KWHzl.toJson((JsonElement) this.EZpvd);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }
}
