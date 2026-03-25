package o;

import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: renamed from: o.xLh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54516xLh {
    public static final C54516xLh EZpvd = new C54516xLh();
    public static final java.util.Set<java.lang.String> AEQbTJ = new LinkedHashSet();
    public static final java.util.Set<java.lang.String> gEmmrt = new LinkedHashSet();
    public static final java.util.Set<java.lang.String> OLrzqt = new LinkedHashSet();
    public static final java.util.Set<java.lang.String> copydefault = new LinkedHashSet();
    public static final int KWHzl = 8;

    private C54516xLh() {
    }

    public static /* synthetic */ void addTrace$default(C54516xLh c54516xLh, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        c54516xLh.AEQbTJ(z, z2);
    }

    public final void AEQbTJ(boolean z, boolean z2) {
        C54515xLg.OLrzqt.AEQbTJ(z, CollectionsKt___CollectionsKt.joinToString$default(AEQbTJ, null, null, null, 0, null, null, 63, null), CollectionsKt___CollectionsKt.joinToString$default(gEmmrt, null, null, null, 0, null, null, 63, null), CollectionsKt___CollectionsKt.joinToString$default(OLrzqt, null, null, null, 0, null, null, 63, null), CollectionsKt___CollectionsKt.joinToString$default(copydefault, null, null, null, 0, null, null, 63, null));
        if (z2) {
            OLrzqt();
        }
    }

    public final void OLrzqt() {
        AEQbTJ.clear();
        gEmmrt.clear();
        OLrzqt.clear();
        copydefault.clear();
    }
}
