package o;

import com.okinc.okex.deeplink.SupportRatingDeeplinkHandler$handleDeeplink$1;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.srd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45523srd implements InterfaceC43234rlT {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.srd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.srd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        AEQbTJ(context, map);
    }

    private final void AEQbTJ(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj = map.get("moduleType");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = map.get("ratingNotificationId");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.Object obj3 = map.get("businessId");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        java.util.Set<Map.Entry<java.lang.String, ? extends java.lang.Object>> setEntrySet = map.entrySet();
        java.util.ArrayList<Map.Entry> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj4 : setEntrySet) {
            if (!yDY.gEmmrt("moduleType", "ratingNotificationId", "businessId").contains((java.lang.String) ((Map.Entry) obj4).getKey())) {
                arrayList.add(obj4);
            }
        }
        for (Map.Entry entry : arrayList) {
            JsonElementBuildersKt.put(jsonObjectBuilder, (java.lang.String) entry.getKey(), entry.getValue().toString());
        }
        JsonObject jsonObjectBuild = jsonObjectBuilder.build();
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new SupportRatingDeeplinkHandler$handleDeeplink$1(str, str2, str3, jsonObjectBuild, context, null), 3, null);
        }
    }
}
