package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.UserTradeConfigInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xVL {
    public static final xVL EZpvd = new xVL();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xVT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return xVL.AEQbTJ();
        }
    });
    public static final int AEQbTJ = 8;

    private xVL() {
    }

    public static final Gson AEQbTJ() {
        return new Gson();
    }

    public final Gson copydefault() {
        return (Gson) KWHzl.getValue();
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES");
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP");
    }

    public final java.lang.String OLrzqt() {
        if (C54589xNz.EZpvd.EZpvd()) {
            C55697xoo.OLrzqt.AYXKKw();
            return "switch";
        }
        C55697xoo.OLrzqt.AYXKKw();
        return "switch";
    }

    public final void OLrzqt(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        SPUtils.put("order_leader_switch", new Gson().toJson(list), OLrzqt());
    }

    public final java.util.ArrayList<java.lang.String> EZpvd() {
        java.util.ArrayList<java.lang.String> arrayList = SPUtils.getArrayList("order_leader_switch", java.lang.String.class, OLrzqt());
        return arrayList == null ? new java.util.ArrayList<>() : arrayList;
    }

    public final <T> T KWHzl(JsonObject jsonObject, @NotNull TypeToken<T> typeToken) {
        Intrinsics.checkNotNullParameter(typeToken, "");
        if (jsonObject == null) {
            return null;
        }
        try {
            return (T) copydefault().fromJson(jsonObject, typeToken.getType());
        } catch (java.lang.Exception e) {
            pUU.KWHzl("parseErrorMsg", "error: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public final boolean gEmmrt() {
        java.util.Map map;
        C56084xwD fieldNames;
        UserTradeConfigInfo userTradeConfigInfoAEQbTJ;
        try {
            Gson gson = new Gson();
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            map = (java.util.Map) gson.fromJson((interfaceC54581xNrOLrzqt == null || (fieldNames = interfaceC54581xNrOLrzqt.getFieldNames()) == null || (userTradeConfigInfoAEQbTJ = fieldNames.AEQbTJ()) == null) ? null : userTradeConfigInfoAEQbTJ.getFirstTradeTime(), java.util.Map.class);
            Intrinsics.copydefault(map);
        } catch (java.lang.Exception e) {
            pUU.KWHzl("JSON PARSE", "UserTradeConfig.firstTradeTime-jsonConvert" + e.getMessage());
        }
        return C33129mqd.valueOf(map.get("spot")) == 0 && C33129mqd.valueOf(map.get("margin")) == 0 && C33129mqd.valueOf(map.get("perpetual")) == 0 && C33129mqd.valueOf(map.get("futures")) == 0;
    }
}
