package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sZO implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("type_key");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = map.get("ranking_id");
        java.lang.Integer numValueOf = obj2 != null ? java.lang.Integer.valueOf(C33129mqd.AhwBna(obj2)) : null;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC34993nmt.class);
        if (str != null) {
            intent.putExtra("type_key", str);
        }
        if (numValueOf != null) {
            intent.putExtra("ranking_id", numValueOf.intValue());
        }
        context.startActivity(intent);
    }
}
