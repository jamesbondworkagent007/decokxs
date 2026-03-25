package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rvC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C43747rvC {
    public static final java.util.List<UIComponentAppModel> copydefault(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Json jsonCopydefault = C43776rvf.EZpvd.copydefault();
        jsonCopydefault.getSerializersModule();
        java.lang.Iterable iterable = (java.lang.Iterable) jsonCopydefault.decodeFromJsonElement(new ArrayListSerializer(UIComponent.Companion.serializer()), jsonElement);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((UIComponent) it.next()).toAppModel());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (obj instanceof UIComponentAppModel) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final UIComponentAppModel KWHzl(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        return uIComponentAppModel.clone();
    }

    public static final java.util.List<PopUpComponentAppModel> AEQbTJ(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Json jsonCopydefault = C43776rvf.EZpvd.copydefault();
        jsonCopydefault.getSerializersModule();
        java.lang.Iterable iterable = (java.lang.Iterable) jsonCopydefault.decodeFromJsonElement(new ArrayListSerializer(UIComponent.Companion.serializer()), jsonElement);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((UIComponent) it.next()).toAppModel());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (obj instanceof PopUpComponentAppModel) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
