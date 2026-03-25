package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yWN extends yWQ {
    public static final ActionBar KWHzl = new ActionBar(null);
    public static final yWN EZpvd = new yWN(1, 0, 7);
    public static final yWN copydefault = new yWN(new int[0]);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yWN(@NotNull int... iArr) {
        super(java.util.Arrays.copyOf(iArr, iArr.length));
        Intrinsics.checkNotNullParameter(iArr, "");
    }

    public boolean EZpvd() {
        return OLrzqt(EZpvd);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yWN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final yWN AEQbTJ(@NotNull java.io.InputStream inputStream) {
            Intrinsics.checkNotNullParameter(inputStream, "");
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
            kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(1, dataInputStream.readInt());
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(intRange, 10));
            java.util.Iterator<java.lang.Integer> it = intRange.iterator();
            while (it.hasNext()) {
                ((AbstractC56415yEn) it).nextInt();
                arrayList.add(java.lang.Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrFARcdN = CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList);
            return new yWN(java.util.Arrays.copyOf(iArrFARcdN, iArrFARcdN.length));
        }
    }
}
