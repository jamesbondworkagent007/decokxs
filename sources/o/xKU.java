package o;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class xKU<Resp> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public java.lang.reflect.Type EZpvd;

    public xKU(boolean z, @NotNull java.lang.reflect.Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        this.AEQbTJ = z;
        this.EZpvd = type;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xKU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.google.gson.JsonElement */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: com.google.gson.JsonElement */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.google.gson.JsonElement */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5 A[PHI: r3 r14
  0x00c5: PHI (r3v11 java.lang.String) = (r3v9 java.lang.String), (r3v12 java.lang.String) binds: [B:53:0x00c3, B:33:0x008a] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r14v11 java.lang.String) = (r14v9 java.lang.String), (r14v14 java.lang.String) binds: [B:53:0x00c3, B:33:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7 A[PHI: r3
  0x00c7: PHI (r3v7 java.lang.String) = 
  (r3v6 java.lang.String)
  (r3v6 java.lang.String)
  (r3v6 java.lang.String)
  (r3v9 java.lang.String)
  (r3v9 java.lang.String)
  (r3v9 java.lang.String)
  (r3v12 java.lang.String)
  (r3v12 java.lang.String)
  (r3v12 java.lang.String)
 binds: [B:18:0x005b, B:36:0x008f, B:40:0x009e, B:49:0x00b7, B:51:0x00bd, B:53:0x00c3, B:29:0x007e, B:31:0x0084, B:33:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ResponseData<Resp> KWHzl(@NotNull OKServerException oKServerException) {
        java.lang.Object objFromJson;
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String asString;
        java.lang.String asString2;
        java.lang.String asString3;
        Intrinsics.checkNotNullParameter(oKServerException, "");
        JsonObject response = oKServerException.getResponse();
        JsonElement jsonElement = response != null ? response.get("data") : 0;
        if (jsonElement != 0) {
            try {
                objFromJson = new Gson().fromJson(jsonElement, this.EZpvd);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                objFromJson = Unit.INSTANCE;
                pUU.copydefault("CoResponseHandler", "not support json " + jsonElement + " cause by " + objFromJson);
            }
            obj = objFromJson;
        } else {
            obj = null;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(oKServerException.getCode());
        java.lang.String message = oKServerException.getMessage();
        java.lang.String str2 = message != null ? message : "";
        if (!this.AEQbTJ) {
            str = str2;
        } else if (jsonElement instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElement;
            JsonElement jsonElement2 = jsonObject.get("sCode");
            if (jsonElement2 != null && (asString3 = jsonElement2.getAsString()) != null && asString3.length() > 0) {
                strValueOf = asString3;
            }
            JsonElement jsonElement3 = jsonObject.get("sMsg");
            if (jsonElement3 != null && (asString = jsonElement3.getAsString()) != null && asString.length() > 0) {
                str = asString;
            }
        } else {
            if (jsonElement instanceof JsonArray) {
                java.lang.Object objRcXXUw = CollectionsKt___CollectionsKt.RcXXUw((java.lang.Iterable) jsonElement);
                JsonObject jsonObject2 = objRcXXUw instanceof JsonObject ? (JsonObject) objRcXXUw : null;
                if (jsonObject2 != null) {
                    JsonElement jsonElement4 = jsonObject2.get("sCode");
                    if (jsonElement4 != null && (asString2 = jsonElement4.getAsString()) != null && asString2.length() > 0) {
                        strValueOf = asString2;
                    }
                    JsonElement jsonElement5 = jsonObject2.get("sMsg");
                    if (jsonElement5 == null || (asString = jsonElement5.getAsString()) == null || asString.length() <= 0) {
                    }
                }
            }
            str = str2;
        }
        return new ResponseData<>(C33129mqd.AhwBna(strValueOf), str, null, null, obj, null, 44, null);
    }
}
