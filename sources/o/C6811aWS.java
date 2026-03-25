package o;

import com.okinc.biz.bean.ChatBotRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aWS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6811aWS {
    public final C6807aWO AEQbTJ;
    public final JsonObject EZpvd;
    public final java.lang.String KWHzl;
    public final ChatBotRequest OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C6811aWS copy$default(C6811aWS c6811aWS, java.lang.String str, ChatBotRequest chatBotRequest, C6807aWO c6807aWO, JsonObject jsonObject, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c6811aWS.KWHzl;
        }
        if ((i & 2) != 0) {
            chatBotRequest = c6811aWS.OLrzqt;
        }
        if ((i & 4) != 0) {
            c6807aWO = c6811aWS.AEQbTJ;
        }
        if ((i & 8) != 0) {
            jsonObject = c6811aWS.EZpvd;
        }
        return c6811aWS.AEQbTJ(str, chatBotRequest, c6807aWO, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6807aWO AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6811aWS AEQbTJ(@NotNull java.lang.String str, @NotNull ChatBotRequest chatBotRequest, C6807aWO c6807aWO, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        return new C6811aWS(str, chatBotRequest, c6807aWO, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatBotRequest copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6811aWS)) {
            return false;
        }
        C6811aWS c6811aWS = (C6811aWS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c6811aWS.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c6811aWS.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c6811aWS.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c6811aWS.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        C6807aWO c6807aWO = this.AEQbTJ;
        int iHashCode3 = c6807aWO == null ? 0 : c6807aWO.hashCode();
        JsonObject jsonObject = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SupportEntranceRequest(entranceId=" + this.KWHzl + ", chatbotRequest=" + this.OLrzqt + ", supportCenterRequest=" + this.AEQbTJ + ", context=" + this.EZpvd + ")";
    }

    public C6811aWS(@NotNull java.lang.String str, @NotNull ChatBotRequest chatBotRequest, C6807aWO c6807aWO, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        this.KWHzl = str;
        this.OLrzqt = chatBotRequest;
        this.AEQbTJ = c6807aWO;
        this.EZpvd = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:com.okinc.biz.bean.ChatBotRequest:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.biz.bean.ChatBotRequest:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:11) call: com.okinc.biz.bean.ChatBotRequest.<init>():void type: CONSTRUCTOR) : (r3v0 com.okinc.biz.bean.ChatBotRequest))
  (wrap:o.aWO:?: TERNARY null = ((wrap:int:0x0009: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.aWO) : (r4v0 o.aWO))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x000f: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r5v0 kotlinx.serialization.json.JsonObject))
 A[MD:(java.lang.String, com.okinc.biz.bean.ChatBotRequest, o.aWO, kotlinx.serialization.json.JsonObject):void (m)] (LINE:5) call: o.aWS.<init>(java.lang.String, com.okinc.biz.bean.ChatBotRequest, o.aWO, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ C6811aWS(java.lang.String str, ChatBotRequest chatBotRequest, C6807aWO c6807aWO, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new ChatBotRequest() : chatBotRequest, (i & 4) != 0 ? null : c6807aWO, (i & 8) != 0 ? null : jsonObject);
    }
}
