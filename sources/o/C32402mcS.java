package o;

import com.okinc.localization.report.SupportType;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mcS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32402mcS {
    public static final C32402mcS copydefault = new C32402mcS();
    public static final java.util.Set<java.lang.String> KWHzl = new LinkedHashSet();
    public static final int AEQbTJ = 8;

    private C32402mcS() {
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Set<java.lang.String> set = KWHzl;
        if (set.contains(str)) {
            return;
        }
        pUU.EZpvd("AppPageAppearManager", " pageAppearReport: " + str);
        set.add(str);
        pSQ.reportUsedSource$default(pSQ.copydefault, str, SupportType.CLASS, null, 4, null);
    }
}
