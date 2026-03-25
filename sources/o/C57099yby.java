package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yby, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57099yby {
    public static final TaskDescription Companion = new TaskDescription(null);

    public final java.util.List<C57093ybs> KWHzl(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int length = bArr.length;
        int i2 = 0;
        if (length + 5 <= i) {
            return yDY.AhwBna(new C57093ybs(0, length, bArr));
        }
        java.lang.String strCopydefault = C57137ycj.copydefault.copydefault(bArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length2 = 0;
        while (length2 < strCopydefault.length()) {
            int i3 = ((i * 2) - ((length2 == 0 ? 5 : 3) * 2)) + length2;
            if (strCopydefault.length() < i3) {
                java.lang.String strSubstring = strCopydefault.substring(length2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                arrayList.add(strSubstring);
                length2 = strCopydefault.length();
            } else {
                java.lang.String strSubstring2 = strCopydefault.substring(length2, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                arrayList.add(strSubstring2);
                length2 = i3;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (java.lang.Object obj : arrayList) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            arrayList2.add(new C57093ybs(i2, bArr.length, C57137ycj.copydefault.EZpvd((java.lang.String) obj)));
            i2++;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: o.yby$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yby.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
