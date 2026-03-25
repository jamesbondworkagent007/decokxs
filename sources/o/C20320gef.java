package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.Advance;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.SignJsonRouter;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.Tabs;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20320gef {
    public final java.lang.String OLrzqt(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            Json jsonJson$default = JsonKt.Json$default(null, new Function1() { // from class: o.geh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20320gef.KWHzl((JsonBuilder) obj);
                }
            }, 1, null);
            JsonElement.Companion companion = JsonElement.Companion;
            JsonElement jsonElement = (JsonElement) jsonJson$default.decodeFromString(companion.serializer(), str);
            objM7377constructorimpl = Result.m7377constructorimpl(((jsonElement instanceof JsonObject) || (jsonElement instanceof JsonArray)) ? jsonJson$default.encodeToString(companion.serializer(), jsonElement) : str);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Object obj = str;
        if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
            obj = objM7377constructorimpl;
        }
        return (java.lang.String) obj;
    }

    public static final Unit KWHzl(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setPrettyPrint(true);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull java.util.List<Advance> list) {
        java.util.List<Tabs.Children> children;
        java.lang.String data;
        SignJsonRouter signJsonRouter;
        SignJsonRouter.SignJsonRouterItem data2;
        java.lang.String data3;
        java.util.List<BaseModel<?>> listAhwBna;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<BaseModel> arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Advance.AdvanceItem data4 = ((Advance) it.next()).getData();
            if (data4 == null || (listAhwBna = data4.getChildren()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            C56406yEe.KWHzl(arrayList, listAhwBna);
        }
        for (BaseModel baseModel : arrayList) {
            if (baseModel instanceof Tabs) {
                Tabs.TabItem data5 = ((Tabs) baseModel).getData();
                if (data5 != null && (children = data5.getChildren()) != null) {
                    java.util.ArrayList<Tabs.Children> arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : children) {
                        Tabs.Children children2 = (Tabs.Children) obj;
                        if (Intrinsics.EZpvd((java.lang.Object) children2.getType(), (java.lang.Object) MTPushConstants.Analysis.KEY_JSON) && (data = children2.getData()) != null && data.length() > 0) {
                            arrayList2.add(obj);
                        }
                    }
                    for (Tabs.Children children3 : arrayList2) {
                        java.lang.String data6 = children3.getData();
                        Intrinsics.copydefault((java.lang.Object) data6);
                        children3.setData(OLrzqt(data6));
                    }
                }
            } else if ((baseModel instanceof SignJsonRouter) && (data2 = (signJsonRouter = (SignJsonRouter) baseModel).getData()) != null && (data3 = data2.getData()) != null && data3.length() > 0) {
                SignJsonRouter.SignJsonRouterItem data7 = signJsonRouter.getData();
                Intrinsics.copydefault(data7);
                SignJsonRouter.SignJsonRouterItem data8 = signJsonRouter.getData();
                Intrinsics.copydefault(data8);
                java.lang.String data9 = data8.getData();
                Intrinsics.copydefault((java.lang.Object) data9);
                data7.setData(OLrzqt(data9));
            }
        }
    }
}
