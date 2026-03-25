package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C30360lVm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rjS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43127rjS implements C30360lVm.StateListAnimator {
    public final java.util.List<java.io.File> EZpvd() {
        C43192rke c43192rke = C43192rke.values;
        java.lang.String strAYXKKw = c43192rke.AYXKKw();
        java.util.Set<java.lang.String> setFetchVPNInfo = c43192rke.fetchVPNInfo();
        java.util.List<java.lang.String> listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strAYXKKw, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
        pUU.EZpvd("MLNUpdateDownloader", "getUnusedDir, localVersion: " + strAYXKKw + ", reservedVersions: " + setFetchVPNInfo);
        if (strAYXKKw.length() == 0) {
            return yDY.AhwBna();
        }
        java.io.File[] fileArrListFiles = new java.io.File(c43192rke.gEmmrt()).listFiles();
        if (fileArrListFiles == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : fileArrListFiles) {
            if (file.isDirectory() && !setFetchVPNInfo.contains(file.getName())) {
                java.lang.String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                java.util.List<java.lang.String> listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) name, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
                if (listSplit$default2.size() == 3 && listSplit$default.size() == 3 && C43192rke.values.EZpvd(listSplit$default2, listSplit$default)) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    @Override // o.C30360lVm.StateListAnimator
    public void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        for (java.io.File file : EZpvd()) {
            pUU.KWHzl("MLNUpdateDownloader", "Removing " + file);
            yFL.AkhnZx(file);
        }
    }

    @Override // o.C30360lVm.StateListAnimator
    public long OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.util.Iterator<T> it = EZpvd().iterator();
        long jAEQbTJ = 0;
        while (it.hasNext()) {
            jAEQbTJ += C30360lVm.KWHzl.AEQbTJ((java.io.File) it.next());
        }
        return jAEQbTJ;
    }
}
