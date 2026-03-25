package o;

import androidx.camera.video.AudioStats;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tlO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47189tlO {
    public final java.util.Map<java.lang.Character, java.util.List<java.lang.Integer>> AEQbTJ;
    public final java.util.Map<java.lang.Character, java.util.List<java.lang.Integer>> EZpvd;
    public final java.util.Map<java.lang.Character, java.lang.Integer> KWHzl;
    public final java.lang.String OLrzqt;
    public final int copydefault;

    public static final int KWHzl(int i, int i2) {
        return i2 <= i ? -1 : 1;
    }

    public static final int OLrzqt(int i, int i2) {
        return i2 < i ? -1 : 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.Character, ? extends java.util.List<java.lang.Integer>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<java.lang.Character, ? extends java.util.List<java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C47189tlO(@NotNull java.util.Map<java.lang.Character, java.lang.Integer> map, @NotNull java.util.Map<java.lang.Character, ? extends java.util.List<java.lang.Integer>> map2, int i, @NotNull java.util.Map<java.lang.Character, ? extends java.util.List<java.lang.Integer>> map3, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(map3, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = map;
        this.EZpvd = map2;
        this.copydefault = i;
        this.AEQbTJ = map3;
        this.OLrzqt = str;
    }

    public final double EZpvd(final int i, final int i2) {
        int i3;
        double dAbs = AudioStats.AUDIO_AMPLITUDE_NONE;
        for (Map.Entry<java.lang.Character, java.util.List<java.lang.Integer>> entry : this.EZpvd.entrySet()) {
            char cCharValue = entry.getKey().charValue();
            java.util.List<java.lang.Integer> value = entry.getValue();
            java.util.List<java.lang.Integer> listAhwBna = this.AEQbTJ.get(java.lang.Character.valueOf(cCharValue));
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            int i4 = 0;
            int iCopydefault = C56548yJl.copydefault(yDY.binarySearch$default(listAhwBna, 0, 0, new Function1() { // from class: o.tlR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(C47189tlO.OLrzqt(i, ((java.lang.Integer) obj).intValue()));
                }
            }, 3, (java.lang.Object) null), 0);
            int iMax = java.lang.Math.max(value.size(), C56548yJl.valueOf(yDY.binarySearch$default(listAhwBna, 0, 0, new Function1() { // from class: o.tlQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(C47189tlO.KWHzl(i2, ((java.lang.Integer) obj).intValue()));
                }
            }, 3, (java.lang.Object) null), listAhwBna.size()) - iCopydefault);
            while (i4 < iMax) {
                dAbs += (double) ((i4 >= value.size() || (i3 = iCopydefault + i4) >= listAhwBna.size()) ? (i2 - i) + 1 : java.lang.Math.abs((listAhwBna.get(i3).intValue() - i) - value.get(i4).intValue()));
                i4++;
            }
        }
        return 1.0d - (dAbs / (((double) this.copydefault) * ((double) ((i2 - i) + 1))));
    }

    public final java.util.List<C47193tlS> EZpvd(int i) {
        int i2 = 0;
        C47186tlL c47186tlL = new C47186tlL(0, 1, null);
        int length = this.OLrzqt.length();
        int i3 = -1;
        int i4 = 0;
        while (i4 < length) {
            int i5 = length - 1;
            int iMin = java.lang.Math.min(i3 + 1, i5);
            char cCharAt = this.OLrzqt.charAt(iMin);
            if (this.KWHzl.containsKey(java.lang.Character.valueOf(cCharAt))) {
                java.lang.Integer num = this.KWHzl.get(java.lang.Character.valueOf(cCharAt));
                Intrinsics.copydefault(num);
                if (num.intValue() > 0) {
                    i2++;
                }
                java.util.Map<java.lang.Character, java.lang.Integer> map = this.KWHzl;
                java.lang.Integer num2 = map.get(java.lang.Character.valueOf(cCharAt));
                Intrinsics.copydefault(num2);
                map.put(java.lang.Character.valueOf(cCharAt), java.lang.Integer.valueOf(num2.intValue() - 1));
            }
            int i6 = i2;
            int i7 = (iMin - i4) + 1;
            double d = ((double) (i6 * 2)) / ((double) (this.copydefault + i7));
            if (d >= 0.5d) {
                c47186tlL.EZpvd(new C47190tlP(i4, iMin), d, EZpvd(i4, iMin));
            }
            if (i7 == i || iMin == i5) {
                char cCharAt2 = this.OLrzqt.charAt(i4);
                if (this.KWHzl.containsKey(java.lang.Character.valueOf(cCharAt2))) {
                    java.util.Map<java.lang.Character, java.lang.Integer> map2 = this.KWHzl;
                    java.lang.Integer num3 = map2.get(java.lang.Character.valueOf(cCharAt2));
                    Intrinsics.copydefault(num3);
                    map2.put(java.lang.Character.valueOf(cCharAt2), java.lang.Integer.valueOf(num3.intValue() + 1));
                    java.lang.Integer num4 = this.KWHzl.get(java.lang.Character.valueOf(cCharAt2));
                    Intrinsics.copydefault(num4);
                    if (num4.intValue() > 0) {
                        i6--;
                    }
                }
                i2 = i6;
                i4++;
                i3 = iMin;
            } else {
                i3 = iMin;
                i2 = i6;
            }
        }
        return c47186tlL.OLrzqt();
    }
}
