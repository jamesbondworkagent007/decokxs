package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57095ybu {
    public java.util.List<C57093ybs> AEQbTJ = new java.util.ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (((o.C57093ybs) kotlin.collections.CollectionsKt___CollectionsKt.AuCTelauCTel(r10.AEQbTJ)).gEmmrt() == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r11 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r10.AEQbTJ, "", null, null, 0, null, new o.C57097ybw(), 30, null);
        r10.AEQbTJ.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r11.gEmmrt() == r11.EZpvd().length) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        C57093ybs c57093ybsAEQbTJ = C57093ybs.Companion.AEQbTJ(C57137ycj.copydefault.copydefault(bArr));
        this.AEQbTJ.add(c57093ybsAEQbTJ);
        if (c57093ybsAEQbTJ.AEQbTJ() != 0) {
            java.util.Iterator<T> it = this.AEQbTJ.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += ((C57093ybs) it.next()).EZpvd().length;
            }
        }
    }

    public static final java.lang.CharSequence copydefault(C57093ybs c57093ybs) {
        Intrinsics.checkNotNullParameter(c57093ybs, "");
        return C57137ycj.copydefault.copydefault(c57093ybs.EZpvd());
    }
}
