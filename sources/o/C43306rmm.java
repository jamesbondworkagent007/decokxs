package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rmm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43306rmm extends AbstractC43215rlA implements InterfaceC43309rmp, InterfaceC43305rml {
    public final java.util.Map<java.lang.Class<?>, java.lang.Object<java.lang.Object>> OLrzqt = new LinkedHashMap();
    public android.content.Context copydefault;

    @Override // o.AbstractC43215rlA
    public void onInit(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onInit(context);
        this.copydefault = context;
    }
}
