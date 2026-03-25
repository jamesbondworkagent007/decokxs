package o;

import com.google.android.play.core.splitinstall.SplitInstallRequest;

/* JADX INFO: renamed from: o.avo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C8072avo {
    public static SplitInstallRequest EZpvd(C8077avt c8077avt) {
        SplitInstallRequest.Builder builderNewBuilder = SplitInstallRequest.newBuilder();
        java.util.Iterator<java.util.Locale> it = c8077avt.copydefault().iterator();
        while (it.hasNext()) {
            builderNewBuilder.addLanguage(it.next());
        }
        java.util.Iterator<java.lang.String> it2 = c8077avt.EZpvd().iterator();
        while (it2.hasNext()) {
            builderNewBuilder.addModule(it2.next());
        }
        return builderNewBuilder.build();
    }
}
