package o;

import java.net.URLDecoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dJX implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        boolean zFIwbmz = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz();
        try {
            java.lang.Object obj = map.get("uri");
            strOLrzqt = URLDecoder.decode(obj != null ? C33129mqd.gEmmrt(obj) : null, com.google.android.exoplayer2.C.UTF8_NAME);
        } catch (java.lang.Exception unused) {
            strOLrzqt = interfaceC43233rlS.OLrzqt();
        }
        dJJ djj = dJJ.copydefault;
        Intrinsics.copydefault((java.lang.Object) strOLrzqt);
        djj.OLrzqt(context, strOLrzqt, map, zFIwbmz);
    }
}
