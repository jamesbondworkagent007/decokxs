package o;

import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.tencent.matrix.util.MergedSmapsInfo$Companion$mergeSmaps$2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.C58015ytM;
import o.C58023ytU;
import o.C59449zhJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ytM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C58015ytM {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final java.util.List<C58023ytU> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C58015ytM() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ytM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C58015ytM copy$default(C58015ytM c58015ytM, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c58015ytM.AEQbTJ;
        }
        return c58015ytM.EZpvd(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58015ytM EZpvd(java.util.List<C58023ytU> list) {
        return new C58015ytM(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C58015ytM) && Intrinsics.EZpvd(this.AEQbTJ, ((C58015ytM) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<C58023ytU> list = this.AEQbTJ;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public C58015ytM(java.util.List<C58023ytU> list) {
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<o.ytU>):void (m)] (LINE:788) call: o.ytM.<init>(java.util.List):void type: THIS */
    public /* synthetic */ C58015ytM(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\n");
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str = java.lang.String.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s", java.util.Arrays.copyOf(new java.lang.Object[]{"PSS", "RSS", "SIZE", "SWAP_PSS", "SH_C", "SH_D", "PRI_C", "PRI_D", "COUNT", "PERM", "NAME"}, 11));
        Intrinsics.checkNotNullExpressionValue(str, "");
        sb.append(str);
        sb.append("\n");
        java.lang.String str2 = java.lang.String.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s", java.util.Arrays.copyOf(new java.lang.Object[]{InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID}, 11));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        sb.append(str2);
        sb.append("\n");
        java.util.List<C58023ytU> list = this.AEQbTJ;
        Intrinsics.copydefault(list);
        for (C58023ytU c58023ytU : list) {
            java.lang.String strKWHzl = c58023ytU.KWHzl();
            java.lang.String strOLrzqt = c58023ytU.OLrzqt();
            long jEZpvd = c58023ytU.EZpvd();
            long jAhwBna = c58023ytU.AhwBna();
            long jAYXKKw = c58023ytU.AYXKKw();
            long jValueOf = c58023ytU.valueOf();
            long jGEmmrt = c58023ytU.gEmmrt();
            long jDjBIcL = c58023ytU.djBIcL();
            long jDbNXlk = c58023ytU.DbNXlk();
            long jCopydefault = c58023ytU.copydefault();
            long jAEQbTJ = c58023ytU.AEQbTJ();
            C56529yIt c56529yIt2 = C56529yIt.KWHzl;
            java.lang.String str3 = java.lang.String.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(jValueOf), java.lang.Long.valueOf(jAYXKKw), java.lang.Long.valueOf(jAhwBna), java.lang.Long.valueOf(jAEQbTJ), java.lang.Long.valueOf(jGEmmrt), java.lang.Long.valueOf(jDjBIcL), java.lang.Long.valueOf(jDbNXlk), java.lang.Long.valueOf(jCopydefault), java.lang.Long.valueOf(jEZpvd), strOLrzqt, strKWHzl}, 11));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            sb.append(str3);
            sb.append("\n");
        }
        C56529yIt c56529yIt3 = C56529yIt.KWHzl;
        java.lang.String str4 = java.lang.String.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s", java.util.Arrays.copyOf(new java.lang.Object[]{InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID, InternalFrame.ID}, 11));
        Intrinsics.checkNotNullExpressionValue(str4, "");
        sb.append(str4);
        sb.append("\n");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX INFO: renamed from: o.ytM$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ytM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C58015ytM get$default(TaskDescription taskDescription, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = android.os.Process.myPid();
            }
            return taskDescription.copydefault(i);
        }

        public final C58015ytM copydefault(int i) {
            return new C58015ytM(EZpvd(i));
        }

        public final java.util.ArrayList<C58023ytU> EZpvd(int i) {
            final Pattern patternCompile = Pattern.compile("^[0-9a-f]+-[0-9a-f]+\\s+([rwxps-]{4})\\s+[0-9a-f]+\\s+[0-9a-f]+:[0-9a-f]+\\s+\\d+\\s*(.*)$");
            final java.util.HashMap map = new java.util.HashMap();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            try {
                yFK.AEQbTJ(new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File("/proc/" + i + "/smaps")), Charsets.UTF_8), new Function1<java.lang.String, Unit>() { // from class: com.tencent.matrix.util.MergedSmapsInfo$Companion$mergeSmaps$1$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v6, types: [T, o.ytU] */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String str) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Ref.ObjectRef<C58023ytU> objectRef2 = objectRef;
                        if (objectRef2.element != null) {
                            if (C59449zhJ.startsWith$default(str, "Size:", false, 2, null)) {
                                String strSubstring = str.substring(5);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                int length = strSubstring.length() - 1;
                                int i2 = 0;
                                boolean z = false;
                                while (i2 <= length) {
                                    boolean z2 = Intrinsics.copydefault((int) strSubstring.charAt(!z ? i2 : length), 32) <= 0;
                                    if (z) {
                                        if (!z2) {
                                            break;
                                        } else {
                                            length--;
                                        }
                                    } else if (z2) {
                                        i2++;
                                    } else {
                                        z = true;
                                    }
                                }
                                String[] strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) strSubstring.subSequence(i2, length + 1).toString(), new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
                                C58023ytU c58023ytU = objectRef2.element;
                                Intrinsics.copydefault(c58023ytU);
                                C58023ytU c58023ytU2 = c58023ytU;
                                c58023ytU2.djBIcL(c58023ytU2.ejfBZ() + Long.parseLong(strArr[0]));
                                return;
                            }
                            if (C59449zhJ.startsWith$default(str, "Rss:", false, 2, null)) {
                                String strSubstring2 = str.substring(4);
                                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                                int length2 = strSubstring2.length() - 1;
                                int i3 = 0;
                                boolean z3 = false;
                                while (i3 <= length2) {
                                    boolean z4 = Intrinsics.copydefault((int) strSubstring2.charAt(!z3 ? i3 : length2), 32) <= 0;
                                    if (z3) {
                                        if (!z4) {
                                            break;
                                        } else {
                                            length2--;
                                        }
                                    } else if (z4) {
                                        i3++;
                                    } else {
                                        z3 = true;
                                    }
                                }
                                String[] strArr2 = (String[]) StringsKt__StringsKt.split$default((CharSequence) strSubstring2.subSequence(i3, length2 + 1).toString(), new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
                                C58023ytU c58023ytU3 = objectRef2.element;
                                Intrinsics.copydefault(c58023ytU3);
                                C58023ytU c58023ytU4 = c58023ytU3;
                                c58023ytU4.AEQbTJ(c58023ytU4.fARcdN() + Long.parseLong(strArr2[0]));
                                return;
                            }
                            if (C59449zhJ.startsWith$default(str, "Pss:", false, 2, null)) {
                                String strSubstring3 = str.substring(4);
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                                int length3 = strSubstring3.length() - 1;
                                int i4 = 0;
                                boolean z5 = false;
                                while (i4 <= length3) {
                                    boolean z6 = Intrinsics.copydefault((int) strSubstring3.charAt(!z5 ? i4 : length3), 32) <= 0;
                                    if (z5) {
                                        if (!z6) {
                                            break;
                                        } else {
                                            length3--;
                                        }
                                    } else if (z6) {
                                        i4++;
                                    } else {
                                        z5 = true;
                                    }
                                }
                                String[] strArr3 = (String[]) StringsKt__StringsKt.split$default((CharSequence) strSubstring3.subSequence(i4, length3 + 1).toString(), new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
                                C58023ytU c58023ytU5 = objectRef2.element;
                                Intrinsics.copydefault(c58023ytU5);
                                C58023ytU c58023ytU6 = c58023ytU5;
                                c58023ytU6.KWHzl(c58023ytU6.isConnected() + Long.parseLong(strArr3[0]));
                                return;
                            }
                            if (C59449zhJ.startsWith$default(str, "Shared_Clean:", false, 2, null)) {
                                String strSubstring4 = str.substring(13);
                                Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
                                int length4 = strSubstring4.length() - 1;
                                int i5 = 0;
                                boolean z7 = false;
                                while (i5 <= length4) {
                                    boolean z8 = Intrinsics.copydefault((int) strSubstring4.charAt(!z7 ? i5 : length4), 32) <= 0;
                                    if (z7) {
                                        if (!z8) {
                                            break;
                                        } else {
                                            length4--;
                                        }
                                    } else if (z8) {
                                        i5++;
                                    } else {
                                        z7 = true;
                                    }
                                }
                                String[] strArr4 = (String[]) StringsKt__StringsKt.split$default((CharSequence) strSubstring4.subSequence(i5, length4 + 1).toString(), new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
                                C58023ytU c58023ytU7 = objectRef2.element;
                                Intrinsics.copydefault(c58023ytU7);
                                C58023ytU c58023ytU8 = c58023ytU7;
                                c58023ytU8.AYXKKw(c58023ytU8.fJNWhG() + Long.parseLong(strArr4[0]));
                                return;
                            }
                            if (C59449zhJ.startsWith$default(str, "Shared_Dirty:", false, 2, null)) {
                                String strSubstring5 = str.substring(13);
                                Intrinsics.checkNotNullExpressionValue(strSubstring5, "");
                                int length5 = strSubstring5.length() - 1;
                                int i6 = 0;
                                boolean z9 = false;
                                while (i6 <= length5) {
                                    boolean z10 = Intrinsics.copydefault((int) strSubstring5.charAt(!z9 ? i6 : length5), 32) <= 0;
                                    if (z9) {
                                        if (!z10) {
                                            break;
                                        } else {
                                            length5--;
                                        }
                                    } else if (z10) {
                                        i6++;
                                    } else {
                                        z9 = true;
                                    }
                                }
                                String[] strArr5 = (String[]) StringsKt__StringsKt.split$default((CharSequence) strSubstring5.subSequence(i6, length5 + 1).toString(), new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
                                C58023ytU c58023ytU9 = objectRef2.element;
                                Intrinsics.copydefault(c58023ytU9);
                                C58023ytU c58023ytU10 = c58023ytU9;
                                c58023ytU10.valueOf(c58023ytU10.AuCTel() + Long.parseLong(strArr5[0]));
                                return;
                            }
                            if (C59449zhJ.startsWith$default(str, "Private_Clean:", false, 2, null)) {
                                String strSubstring6 = str.substring(14);
                                Intrinsics.checkNotNullExpressionValue(strSubstring6, "");
                                int length6 = strSubstring6.length() - 1;
                                int i7 = 0;
                                boolean z11 = false;
                                while (i7 <= length6) {
                                    boolean z12 = Intrinsics.copydefault((int) strSubstring6.charAt(!z11 ? i7 : length6), 32) <= 0;
                                    if (z11) {
                                        if (!z12) {
                                            break;
                                        } else {
                                            length6--;
                                        }
                                    } else if (z12) {
                                        i7++;
                                    } else {
                                        z11 = true;
                                    }
                                }
                                String[] strArr6 = (String[]) StringsKt__StringsKt.split$default((CharSequence) strSubstring6.subSequence(i7, length6 + 1).toString(), new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
                                C58023ytU c58023ytU11 = objectRef2.element;
                                Intrinsics.copydefault(c58023ytU11);
                                C58023ytU c58023ytU12 = c58023ytU11;
                                c58023ytU12.copydefault(c58023ytU12.AkhnZx() + Long.parseLong(strArr6[0]));
                                return;
                            }
                            if (C59449zhJ.startsWith$default(str, "Private_Dirty:", false, 2, null)) {
                                String strSubstring7 = str.substring(14);
                                Intrinsics.checkNotNullExpressionValue(strSubstring7, "");
                                int length7 = strSubstring7.length() - 1;
                                int i8 = 0;
                                boolean z13 = false;
                                while (i8 <= length7) {
                                    boolean z14 = Intrinsics.copydefault((int) strSubstring7.charAt(!z13 ? i8 : length7), 32) <= 0;
                                    if (z13) {
                                        if (!z14) {
                                            break;
                                        } else {
                                            length7--;
                                        }
                                    } else if (z14) {
                                        i8++;
                                    } else {
                                        z13 = true;
                                    }
                                }
                                String[] strArr7 = (String[]) StringsKt__StringsKt.split$default((CharSequence) strSubstring7.subSequence(i8, length7 + 1).toString(), new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
                                C58023ytU c58023ytU13 = objectRef2.element;
                                Intrinsics.copydefault(c58023ytU13);
                                C58023ytU c58023ytU14 = c58023ytU13;
                                c58023ytU14.EZpvd(c58023ytU14.fetchVPNInfo() + Long.parseLong(strArr7[0]));
                                return;
                            }
                            if (C59449zhJ.startsWith$default(str, "SwapPss:", false, 2, null)) {
                                String strSubstring8 = str.substring(8);
                                Intrinsics.checkNotNullExpressionValue(strSubstring8, "");
                                int length8 = strSubstring8.length() - 1;
                                int i9 = 0;
                                boolean z15 = false;
                                while (i9 <= length8) {
                                    boolean z16 = Intrinsics.copydefault((int) strSubstring8.charAt(!z15 ? i9 : length8), 32) <= 0;
                                    if (z15) {
                                        if (!z16) {
                                            break;
                                        } else {
                                            length8--;
                                        }
                                    } else if (z16) {
                                        i9++;
                                    } else {
                                        z15 = true;
                                    }
                                }
                                String[] strArr8 = (String[]) StringsKt__StringsKt.split$default((CharSequence) strSubstring8.subSequence(i9, length8 + 1).toString(), new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
                                C58023ytU c58023ytU15 = objectRef2.element;
                                Intrinsics.copydefault(c58023ytU15);
                                C58023ytU c58023ytU16 = c58023ytU15;
                                c58023ytU16.AhwBna(c58023ytU16.fIwbmz() + Long.parseLong(strArr8[0]));
                                return;
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                        Matcher matcher = patternCompile.matcher(str);
                        Intrinsics.checkNotNullExpressionValue(matcher, "");
                        if (matcher.find()) {
                            String strGroup = matcher.group(1);
                            String strGroup2 = matcher.group(2);
                            if (strGroup2 == null || StringsKt__StringsKt.fARcdN((CharSequence) strGroup2)) {
                                strGroup2 = "[no-name]";
                            }
                            objectRef.element = map.get(strGroup + '|' + strGroup2);
                            Ref.ObjectRef<C58023ytU> objectRef3 = objectRef;
                            if (objectRef3.element == null) {
                                objectRef3.element = new C58023ytU(null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 2047, null);
                                C58023ytU c58023ytU17 = objectRef.element;
                                Intrinsics.copydefault(c58023ytU17);
                                C58023ytU c58023ytU18 = c58023ytU17;
                                map.put(strGroup + '|' + strGroup2, c58023ytU18);
                                c58023ytU18.copydefault(strGroup);
                                c58023ytU18.EZpvd(strGroup2);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            C58023ytU c58023ytU19 = objectRef.element;
                            Intrinsics.copydefault(c58023ytU19);
                            C58023ytU c58023ytU20 = c58023ytU19;
                            c58023ytU20.OLrzqt(c58023ytU20.values() + 1);
                        }
                    }
                });
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.MemoryInfoFactory", th, "", new java.lang.Object[0]);
            }
            java.util.ArrayList<C58023ytU> arrayList = new java.util.ArrayList<>((java.util.Collection<? extends C58023ytU>) map.values());
            final MergedSmapsInfo$Companion$mergeSmaps$2 mergedSmapsInfo$Companion$mergeSmaps$2 = new Function2<C58023ytU, C58023ytU, java.lang.Integer>() { // from class: com.tencent.matrix.util.MergedSmapsInfo$Companion$mergeSmaps$2
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(C58023ytU c58023ytU, C58023ytU c58023ytU2) {
                    return Integer.valueOf((int) (c58023ytU2.isConnected() - c58023ytU.isConnected()));
                }
            };
            C56407yEf.copydefault(arrayList, new java.util.Comparator() { // from class: o.ytN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return C58015ytM.TaskDescription.OLrzqt(mergedSmapsInfo$Companion$mergeSmaps$2, obj, obj2);
                }
            });
            return arrayList;
        }

        public static final int OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
            Intrinsics.checkNotNullParameter(function2, "");
            return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
        }
    }
}
