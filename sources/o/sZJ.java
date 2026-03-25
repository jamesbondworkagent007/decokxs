package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sZJ implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("itemId");
        if (obj == null || (string = obj.toString()) == null) {
            java.lang.Object obj2 = map.get(FirebaseAnalytics.Param.ITEM_ID);
            string = obj2 != null ? obj2.toString() : null;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC38399pXi.class);
        if (string != null) {
            intent.putExtra(FirebaseAnalytics.Param.ITEM_ID, string);
        }
        context.startActivity(intent);
    }
}
