package o;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30794lhq {
    @yCM
    public C30794lhq() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[Catch: Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:5:0x001a, B:7:0x0020, B:11:0x002f), top: B:26:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<JsonObject, java.lang.String> EZpvd(@NotNull JsonObject jsonObject) {
        java.lang.Exception e;
        java.lang.String asString;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        JsonObject asJsonObject = null;
        try {
            asJsonObject = jsonObject.getAsJsonObject("walletTxData");
            asString = jsonObject.get("transactionHash").getAsString();
            if (asJsonObject != null) {
                try {
                    if (asString.length() == 0) {
                        C23310hvn c23310hvn = C23310hvn.copydefault;
                        java.lang.String strValueOf = C56524yIo.AEQbTJ(C30794lhq.class).valueOf();
                        C23310hvn.e$default(c23310hvn, strValueOf == null ? "" : strValueOf, "transaction data is empty", null, 4, null);
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    C23310hvn c23310hvn2 = C23310hvn.copydefault;
                    java.lang.String strValueOf2 = C56524yIo.AEQbTJ(C30794lhq.class).valueOf();
                    C23310hvn.e$default(c23310hvn2, strValueOf2 == null ? "" : strValueOf2, android.util.Log.getStackTraceString(e), null, 4, null);
                }
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            asString = "";
        }
        return C56390yDp.OLrzqt(asJsonObject, asString);
    }
}
