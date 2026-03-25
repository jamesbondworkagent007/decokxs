package o;

import com.okinc.remote.config.IntervalType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ucI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48785ucI {

    /* JADX INFO: renamed from: o.ucI$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[IntervalType.values().length];
            try {
                iArr[IntervalType.LEFT_OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[IntervalType.LEFT_CLOSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[IntervalType.RIGHT_OPEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[IntervalType.RIGHT_CLOSED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    public static /* synthetic */ boolean isInterval$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return copydefault(str, str2, z);
    }

    public static final boolean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return true;
        }
        java.util.List<C48789ucM> listAEQbTJ = AEQbTJ(str2);
        if (listAEQbTJ.isEmpty()) {
            return false;
        }
        for (C48789ucM c48789ucM : listAEQbTJ) {
            try {
                int i = TaskDescription.AEQbTJ[c48789ucM.KWHzl().ordinal()];
                if (i == 1) {
                    if (AEQbTJ(str, c48789ucM.EZpvd(), z) <= 0) {
                        return false;
                    }
                } else if (i == 2) {
                    if (AEQbTJ(str, c48789ucM.EZpvd(), z) < 0) {
                        return false;
                    }
                } else if (i == 3) {
                    if (AEQbTJ(c48789ucM.EZpvd(), str, z) <= 0) {
                        return false;
                    }
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (AEQbTJ(c48789ucM.EZpvd(), str, z) < 0) {
                        return false;
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("IntervalUtil", "Error in interval " + c48789ucM + ": " + e.getMessage());
                return false;
            }
        }
        return true;
    }

    public static final java.util.List<C48789ucM> AEQbTJ(java.lang.String str) {
        java.util.List<java.lang.String> listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) C59449zhJ.replace$default(str, " ", "", false, 4, (java.lang.Object) null), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : listSplit$default) {
            C48789ucM c48789ucM = null;
            if (C59449zhJ.startsWith$default(str2, "(", false, 2, null) && str2.length() > 1) {
                IntervalType intervalType = IntervalType.LEFT_OPEN;
                java.lang.String strSubstring = str2.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                c48789ucM = new C48789ucM(intervalType, strSubstring);
            } else if (C59449zhJ.startsWith$default(str2, "[", false, 2, null) && str2.length() > 1) {
                IntervalType intervalType2 = IntervalType.LEFT_CLOSED;
                java.lang.String strSubstring2 = str2.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                c48789ucM = new C48789ucM(intervalType2, strSubstring2);
            } else if (C59449zhJ.endsWith$default(str2, ")", false, 2, null) && str2.length() > 1) {
                IntervalType intervalType3 = IntervalType.RIGHT_OPEN;
                java.lang.String strSubstring3 = str2.substring(0, str2.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                c48789ucM = new C48789ucM(intervalType3, strSubstring3);
            } else if (C59449zhJ.endsWith$default(str2, "]", false, 2, null) && str2.length() > 1) {
                IntervalType intervalType4 = IntervalType.RIGHT_CLOSED;
                java.lang.String strSubstring4 = str2.substring(0, str2.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
                c48789ucM = new C48789ucM(intervalType4, strSubstring4);
            }
            if (c48789ucM != null) {
                arrayList.add(c48789ucM);
            }
        }
        return arrayList;
    }

    public static final int AEQbTJ(java.lang.String str, java.lang.String str2, boolean z) {
        if (z) {
            return Intrinsics.copydefault(C33129mqd.valueOf(str), C33129mqd.valueOf(str2));
        }
        return C33573myx.copydefault(str, str2);
    }
}
