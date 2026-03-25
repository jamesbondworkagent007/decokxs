package o;

import androidx.core.os.BundleKt;
import com.okinc.okex.common.model.SupportServiceData;
import com.okinc.web.WebActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C47315tni;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45342snw implements InterfaceC45302snI {
    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonTicketFormHandler: invoke > data type: " + (obj != null ? C56524yIo.AEQbTJ(obj.getClass()).gEmmrt() : AbstractJsonLexerKt.NULL), null, 2, null);
        if ((obj instanceof SupportServiceData.FormData ? (SupportServiceData.FormData) obj : null) != null) {
            SupportServiceData.FormData formData = (SupportServiceData.FormData) obj;
            java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("formId", formData.getFormId()), C56390yDp.OLrzqt("contextId", formData.getContextId()));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapGEmmrt.entrySet()) {
                if (((java.lang.String) entry.getValue()) != null && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) r1))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            HttpUrl.Builder builderNewBuilder = HttpUrl.Companion.get(C6813aWU.AEQbTJ(C33070mpX.AYXKKw(C47315tni.PendingIntent.DQzvGN))).newBuilder();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                builderNewBuilder.addEncodedQueryParameter((java.lang.String) entry2.getKey(), (java.lang.String) entry2.getValue());
            }
            java.lang.String string = builderNewBuilder.build().url().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", string)), null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
