package o;

import androidx.camera.video.AudioStats;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47225tly {
    public static final C47225tly copydefault = new C47225tly();

    private C47225tly() {
    }

    /* JADX INFO: renamed from: o.tly$ActionBar */
    public static final class ActionBar {
        public static boolean OLrzqt;
        public static final ActionBar KWHzl = new ActionBar();
        public static double AEQbTJ = 0.5d;
        public static double EZpvd = 0.5d;
        public static final int copydefault = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double AEQbTJ() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(double d) {
            EZpvd = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(double d) {
            AEQbTJ = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return OLrzqt;
        }

        private ActionBar() {
        }
    }

    public final <T extends InterfaceC47221tlu> java.util.List<T> OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return searchAndSortItemsWithThresholdsV2$default(this, str, list, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, false, 28, null);
    }

    public final <T extends InterfaceC47221tlu> java.util.List<T> KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return searchAndSortItemsWithThresholdsV2ExactMatch$default(this, str, list, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, false, 28, null);
    }

    public static /* synthetic */ java.util.List searchAndSortItemsWithLetterSort$default(C47225tly c47225tly, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c47225tly.EZpvd(str, (java.util.List<? extends InterfaceC47221tlu>) list, z);
    }

    public final java.util.List<InterfaceC47221tlu> EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<? extends InterfaceC47221tlu> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return searchAndSortItemsWithThresholdsV2$default(this, str, list, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, z, 12, null);
    }

    public static /* synthetic */ java.util.List searchAndSortItemsWithThresholdsV2$default(C47225tly c47225tly, java.lang.String str, java.util.List list, double d, double d2, boolean z, int i, java.lang.Object obj) {
        return c47225tly.KWHzl(str, list, (i & 4) != 0 ? 0.5d : d, (i & 8) != 0 ? 0.5d : d2, (i & 16) != 0 ? false : z);
    }

    public final <T extends InterfaceC47221tlu> java.util.List<T> KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<? extends T> list, double d, double d2, boolean z) {
        java.lang.String lowerCase;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        ActionBar actionBar = ActionBar.KWHzl;
        actionBar.KWHzl(d);
        actionBar.EZpvd(d2);
        actionBar.OLrzqt(z);
        final java.lang.String lowerCase2 = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        java.util.ArrayList<InterfaceC47221tlu> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (KWHzl(lowerCase2, (InterfaceC47221tlu) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<InterfaceC47221tlu> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (!KWHzl(lowerCase2, (InterfaceC47221tlu) obj2)) {
                arrayList2.add(obj2);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (InterfaceC47221tlu interfaceC47221tlu : arrayList) {
            kotlin.Pair<java.lang.Boolean, java.lang.Boolean> pairAEQbTJ = AEQbTJ(lowerCase2, interfaceC47221tlu);
            if (pairAEQbTJ.getFirst().booleanValue()) {
                interfaceC47221tlu.setPrimarySimilarity(1.0d);
            }
            if (pairAEQbTJ.getSecond().booleanValue()) {
                interfaceC47221tlu.setSecondarySimilarity(1.0d);
            }
            arrayList3.add(interfaceC47221tlu);
        }
        final Function2 function2 = new Function2() { // from class: o.tlw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                return java.lang.Integer.valueOf(C47225tly.OLrzqt(lowerCase2, (InterfaceC47221tlu) obj3, (InterfaceC47221tlu) obj4));
            }
        };
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList3, new java.util.Comparator() { // from class: o.tlx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj3, java.lang.Object obj4) {
                return C47225tly.copydefault(function2, obj3, obj4);
            }
        });
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        for (InterfaceC47221tlu interfaceC47221tlu2 : arrayList2) {
            java.lang.String primary = interfaceC47221tlu2.getPrimary();
            java.lang.String lowerCase3 = null;
            if (primary != null) {
                lowerCase = primary.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            } else {
                lowerCase = null;
            }
            java.lang.String secondary = interfaceC47221tlu2.getSecondary();
            if (secondary != null) {
                lowerCase3 = secondary.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            }
            C47225tly c47225tly = copydefault;
            interfaceC47221tlu2.setPrimarySimilarity(c47225tly.copydefault(lowerCase2, lowerCase));
            interfaceC47221tlu2.setSecondarySimilarity(c47225tly.copydefault(lowerCase2, lowerCase3));
            arrayList4.add(interfaceC47221tlu2);
        }
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listEZpvd, (java.lang.Iterable) C47198tlX.Companion.EZpvd(arrayList4));
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> AEQbTJ(java.lang.String str, InterfaceC47221tlu interfaceC47221tlu) {
        java.lang.String lowerCase;
        java.lang.String lowerCase2;
        java.lang.String primary = interfaceC47221tlu.getPrimary();
        if (primary != null) {
            lowerCase = primary.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            lowerCase = null;
        }
        java.lang.String secondary = interfaceC47221tlu.getSecondary();
        if (secondary != null) {
            lowerCase2 = secondary.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        } else {
            lowerCase2 = null;
        }
        boolean z = false;
        boolean z2 = Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) str) || (lowerCase != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) || (lowerCase != null && C59449zhJ.startsWith$default(lowerCase, str, false, 2, null));
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase2, (java.lang.Object) str) || ((lowerCase2 != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) || (lowerCase2 != null && C59449zhJ.startsWith$default(lowerCase2, str, false, 2, null)))) {
            z = true;
        }
        return new kotlin.Pair<>(java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(z));
    }

    public static final boolean KWHzl(java.lang.String str, InterfaceC47221tlu interfaceC47221tlu) {
        kotlin.Pair<java.lang.Boolean, java.lang.Boolean> pairAEQbTJ = AEQbTJ(str, interfaceC47221tlu);
        return pairAEQbTJ.getFirst().booleanValue() || pairAEQbTJ.getSecond().booleanValue();
    }

    public static final int copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final int OLrzqt(java.lang.String str, java.lang.String str2) {
        if (str != null) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) lowerCase, str2, 0, false, 6, (java.lang.Object) null));
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static final int OLrzqt(java.lang.String str, InterfaceC47221tlu interfaceC47221tlu, InterfaceC47221tlu interfaceC47221tlu2) {
        int iOLrzqt = OLrzqt(interfaceC47221tlu.getPrimary(), str);
        int iOLrzqt2 = OLrzqt(interfaceC47221tlu.getSecondary(), str);
        int iOLrzqt3 = OLrzqt(interfaceC47221tlu2.getPrimary(), str);
        int iOLrzqt4 = OLrzqt(interfaceC47221tlu2.getSecondary(), str);
        if (iOLrzqt != iOLrzqt3) {
            return Intrinsics.copydefault(iOLrzqt, iOLrzqt3);
        }
        return Intrinsics.copydefault(iOLrzqt2, iOLrzqt4);
    }

    public static /* synthetic */ java.util.List searchAndSortItemsWithThresholdsV2ExactMatch$default(C47225tly c47225tly, java.lang.String str, java.util.List list, double d, double d2, boolean z, int i, java.lang.Object obj) {
        return c47225tly.AEQbTJ(str, list, (i & 4) != 0 ? 0.5d : d, (i & 8) != 0 ? 0.5d : d2, (i & 16) != 0 ? false : z);
    }

    public final <T extends InterfaceC47221tlu> java.util.List<T> AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<? extends T> list, double d, double d2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        ActionBar actionBar = ActionBar.KWHzl;
        actionBar.KWHzl(d);
        actionBar.EZpvd(d2);
        actionBar.OLrzqt(z);
        final java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.util.ArrayList<InterfaceC47221tlu> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (OLrzqt(lowerCase, (InterfaceC47221tlu) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (InterfaceC47221tlu interfaceC47221tlu : arrayList) {
            kotlin.Pair<java.lang.Boolean, java.lang.Boolean> pairCopydefault = copydefault(lowerCase, interfaceC47221tlu);
            if (pairCopydefault.getFirst().booleanValue()) {
                interfaceC47221tlu.setPrimarySimilarity(1.0d);
            }
            if (pairCopydefault.getSecond().booleanValue()) {
                interfaceC47221tlu.setSecondarySimilarity(1.0d);
            }
            arrayList2.add(interfaceC47221tlu);
        }
        final Function2 function2 = new Function2() { // from class: o.tlC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return java.lang.Integer.valueOf(C47225tly.KWHzl(lowerCase, (InterfaceC47221tlu) obj2, (InterfaceC47221tlu) obj3));
            }
        };
        return CollectionsKt___CollectionsKt.EZpvd(arrayList2, new java.util.Comparator() { // from class: o.tlA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                return C47225tly.AEQbTJ(function2, obj2, obj3);
            }
        });
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> copydefault(java.lang.String str, InterfaceC47221tlu interfaceC47221tlu) {
        java.lang.String lowerCase;
        java.lang.String lowerCase2;
        java.lang.String primary = interfaceC47221tlu.getPrimary();
        if (primary != null) {
            lowerCase = primary.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            lowerCase = null;
        }
        java.lang.String secondary = interfaceC47221tlu.getSecondary();
        if (secondary != null) {
            lowerCase2 = secondary.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        } else {
            lowerCase2 = null;
        }
        boolean z = false;
        boolean z2 = Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) str) || (lowerCase != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) || (lowerCase != null && C59449zhJ.startsWith$default(lowerCase, str, false, 2, null));
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase2, (java.lang.Object) str) || ((lowerCase2 != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) || (lowerCase2 != null && C59449zhJ.startsWith$default(lowerCase2, str, false, 2, null)))) {
            z = true;
        }
        return new kotlin.Pair<>(java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(z));
    }

    public static final boolean OLrzqt(java.lang.String str, InterfaceC47221tlu interfaceC47221tlu) {
        kotlin.Pair<java.lang.Boolean, java.lang.Boolean> pairCopydefault = copydefault(str, interfaceC47221tlu);
        return pairCopydefault.getFirst().booleanValue() || pairCopydefault.getSecond().booleanValue();
    }

    public static final int AEQbTJ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final int AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (str != null) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) lowerCase, str2, 0, false, 6, (java.lang.Object) null));
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static final int KWHzl(java.lang.String str, InterfaceC47221tlu interfaceC47221tlu, InterfaceC47221tlu interfaceC47221tlu2) {
        int iAEQbTJ = AEQbTJ(interfaceC47221tlu.getPrimary(), str);
        int iAEQbTJ2 = AEQbTJ(interfaceC47221tlu.getSecondary(), str);
        int iAEQbTJ3 = AEQbTJ(interfaceC47221tlu2.getPrimary(), str);
        int iAEQbTJ4 = AEQbTJ(interfaceC47221tlu2.getSecondary(), str);
        if (iAEQbTJ != iAEQbTJ3) {
            return Intrinsics.copydefault(iAEQbTJ, iAEQbTJ3);
        }
        return Intrinsics.copydefault(iAEQbTJ2, iAEQbTJ4);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0119 A[LOOP:2: B:15:0x007c->B:28:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126 A[EDGE_INSN: B:40:0x0126->B:29:0x0126 BREAK  A[LOOP:2: B:15:0x007c->B:28:0x0119], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double EZpvd(java.lang.String str, java.lang.String str2) {
        int i;
        double[] dArr;
        double d;
        double[] dArr2;
        double d2;
        boolean z;
        int i2;
        int i3;
        int length = str.length();
        int length2 = str2.length();
        int iMin = java.lang.Math.min(length, length2 * 2);
        int iMin2 = java.lang.Math.min(length2, length * 2);
        double dMax = java.lang.Math.max(0, java.lang.Math.max(length - iMin, length2 - iMin2));
        java.util.List<java.lang.Double> listAEQbTJ = C47198tlX.Companion.AEQbTJ(iMin2);
        int i4 = iMin2 + 1;
        double[] dArr3 = new double[i4];
        double[] dArr4 = new double[i4];
        double[] dArr5 = new double[i4];
        double d3 = 1.0d;
        if (iMin2 >= 0) {
            int i5 = 0;
            i = iMin;
            while (true) {
                dArr = dArr4;
                dArr3[i5] = ((double) i5) * 1.0d * listAEQbTJ.get(java.lang.Math.min(i5, iMin2 - 1)).doubleValue();
                if (i5 == iMin2) {
                    break;
                }
                i5++;
                dArr4 = dArr;
            }
        } else {
            i = iMin;
            dArr = dArr4;
        }
        int i6 = i;
        if (1 <= i6) {
            int i7 = 1;
            char c = 0;
            while (true) {
                dArr[c] = dArr3[c] + (listAEQbTJ.get(java.lang.Math.min(i7, iMin2 - 1)).doubleValue() * d3);
                if (1 <= iMin2) {
                    int i8 = 1;
                    while (true) {
                        int i9 = i7 - 1;
                        int i10 = i8 - 1;
                        if (str.charAt(i9) == str2.charAt(i10)) {
                            dArr[i8] = dArr3[i10];
                            d = dMax;
                            i3 = i4;
                            dArr2 = dArr3;
                            z = true;
                        } else {
                            d = dMax;
                            i3 = i4;
                            dArr2 = dArr3;
                            dArr[i8] = java.lang.Math.min(dArr3[i8] + (listAEQbTJ.get(i10).doubleValue() * 1.0d), java.lang.Math.min(dArr[i10] + (listAEQbTJ.get(i10).doubleValue() * 1.0d), dArr3[i10] + (listAEQbTJ.get(i10).doubleValue() * 1.3d)));
                            z = true;
                            if (i7 > 1 && i8 > 1) {
                                int i11 = i8 - 2;
                                if (str.charAt(i9) == str2.charAt(i11) && str.charAt(i7 - 2) == str2.charAt(i10)) {
                                    d2 = 1.0d;
                                    dArr[i8] = java.lang.Math.min(dArr[i8], dArr5[i11] + (listAEQbTJ.get(i10).doubleValue() * 1.0d));
                                }
                                if (i8 != iMin2) {
                                    break;
                                }
                                i8++;
                                dMax = d;
                                i4 = i3;
                                dArr3 = dArr2;
                            }
                        }
                        d2 = 1.0d;
                        if (i8 != iMin2) {
                        }
                    }
                    i2 = i3;
                } else {
                    d = dMax;
                    dArr2 = dArr3;
                    d2 = d3;
                    z = true;
                    i2 = i4;
                }
                double[] dArr6 = new double[i2];
                if (i7 == i6) {
                    break;
                }
                i7++;
                i4 = i2;
                dArr3 = dArr;
                d3 = d2;
                dArr5 = dArr2;
                c = 0;
                dArr = dArr6;
                dMax = d;
            }
            dArr3 = dArr;
        } else {
            d = dMax;
        }
        return dArr3[iMin2] + d;
    }

    public final double KWHzl(java.lang.String str, java.lang.String str2) {
        return java.lang.Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, ((double) 1) - (EZpvd(str, str2) / C47198tlX.Companion.OLrzqt(java.lang.Math.max(str.length(), str2.length()))));
    }

    public final double copydefault(java.lang.String str, java.lang.String str2) {
        double d = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (str == null || str2 == null || str.length() == 0 || str2.length() == 0 || str.length() > str2.length() * 2) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        int length = str.length();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            linkedHashMap3.put(java.lang.Character.valueOf(cCharAt), java.lang.Integer.valueOf(((java.lang.Number) linkedHashMap3.getOrDefault(java.lang.Character.valueOf(cCharAt), 0)).intValue() + 1));
            java.lang.Character chValueOf = java.lang.Character.valueOf(cCharAt);
            final Function1 function1 = new Function1() { // from class: o.tlB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47225tly.copydefault((java.lang.Character) obj);
                }
            };
            ((java.util.List) linkedHashMap.computeIfAbsent(chValueOf, new java.util.function.Function() { // from class: o.tlD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C47225tly.copydefault(function1, obj);
                }
            })).add(java.lang.Integer.valueOf(i2));
            i++;
            i2++;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < str2.length()) {
            java.lang.Character chValueOf2 = java.lang.Character.valueOf(str2.charAt(i3));
            final Function1 function12 = new Function1() { // from class: o.tlz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47225tly.OLrzqt((java.lang.Character) obj);
                }
            };
            ((java.util.List) linkedHashMap2.computeIfAbsent(chValueOf2, new java.util.function.Function() { // from class: o.tlH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C47225tly.AEQbTJ(function12, obj);
                }
            })).add(java.lang.Integer.valueOf(i4));
            i3++;
            i4++;
        }
        java.util.List<C47193tlS> listEZpvd = new C47189tlO(linkedHashMap3, linkedHashMap, length, linkedHashMap2, str2).EZpvd(str.length());
        if (listEZpvd.isEmpty()) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        C47193tlS c47193tlS = listEZpvd.get(0);
        for (C47193tlS c47193tlS2 : listEZpvd) {
            java.lang.String strSubstring = str2.substring(c47193tlS2.copydefault().KWHzl(), c47193tlS2.copydefault().copydefault() + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            double dKWHzl = KWHzl(str, strSubstring);
            if (dKWHzl > d) {
                c47193tlS = c47193tlS2;
                d = dKWHzl;
            }
        }
        return java.lang.Math.max(d * C47198tlX.Companion.copydefault(c47193tlS.copydefault().KWHzl()), KWHzl(str, str2));
    }

    public static final java.util.List copydefault(java.lang.Character ch) {
        Intrinsics.checkNotNullParameter(ch, "");
        return new java.util.ArrayList();
    }

    public static final java.util.List copydefault(Function1 function1, java.lang.Object obj) {
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List AEQbTJ(Function1 function1, java.lang.Object obj) {
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List OLrzqt(java.lang.Character ch) {
        Intrinsics.checkNotNullParameter(ch, "");
        return new java.util.ArrayList();
    }
}
