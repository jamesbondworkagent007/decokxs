package com.tencent.matrix.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.C56390yDp;
import o.C56424yEw;
import o.C56529yIt;
import o.C58013ytK;
import o.C59405zgS;
import o.C59442zhC;
import o.C59467zhb;
import o.yFA;
import o.yFK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusInfo implements Parcelable {
    public final int AEQbTJ;
    public final long AYXKKw;
    public final long AhwBna;
    public final String EZpvd;
    public final long KWHzl;
    public final long OLrzqt;
    public final int copydefault;
    public final long djBIcL;
    public static final Activity Companion = new Activity(null);
    public static final Parcelable.Creator<StatusInfo> CREATOR = new Parcelable.Creator<StatusInfo>() { // from class: com.tencent.matrix.util.StatusInfo$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StatusInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StatusInfo(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StatusInfo[] newArray(int i) {
            return new StatusInfo[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StatusInfo() {
        this(null, 0L, 0L, 0L, 0L, 0L, 0, 0, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatusInfo EZpvd(@NotNull String str, long j, long j2, long j3, long j4, long j5, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new StatusInfo(str, j, j2, j3, j4, j5, i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusInfo)) {
            return false;
        }
        StatusInfo statusInfo = (StatusInfo) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) statusInfo.EZpvd) && this.KWHzl == statusInfo.KWHzl && this.AhwBna == statusInfo.AhwBna && this.djBIcL == statusInfo.djBIcL && this.AYXKKw == statusInfo.AYXKKw && this.OLrzqt == statusInfo.OLrzqt && this.copydefault == statusInfo.copydefault && this.AEQbTJ == statusInfo.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.EZpvd.hashCode() * 31) + Long.hashCode(this.KWHzl)) * 31) + Long.hashCode(this.AhwBna)) * 31) + Long.hashCode(this.djBIcL)) * 31) + Long.hashCode(this.AYXKKw)) * 31) + Long.hashCode(this.OLrzqt)) * 31) + Integer.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.AEQbTJ);
    }

    public StatusInfo(@NotNull String str, long j, long j2, long j3, long j4, long j5, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.KWHzl = j;
        this.AhwBna = j2;
        this.djBIcL = j3;
        this.AYXKKw = j4;
        this.OLrzqt = j5;
        this.copydefault = i;
        this.AEQbTJ = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("default") : (r15v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r16v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r18v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r20v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r22v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r24v0 long) : (-1 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r26v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r27v0 int) : (-1 int))
 A[MD:(java.lang.String, long, long, long, long, long, int, int):void (m)] (LINE:239) call: com.tencent.matrix.util.StatusInfo.<init>(java.lang.String, long, long, long, long, long, int, int):void type: THIS */
    public /* synthetic */ StatusInfo(String str, long j, long j2, long j3, long j4, long j5, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "default" : str, (i3 & 2) != 0 ? -1L : j, (i3 & 4) != 0 ? -1L : j2, (i3 & 8) != 0 ? -1L : j3, (i3 & 16) != 0 ? -1L : j4, (i3 & 32) == 0 ? j5 : -1L, (i3 & 64) != 0 ? -1 : i, (i3 & 128) == 0 ? i2 : -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StatusInfo(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        String string = parcel.readString();
        this(string == null ? "default" : string, parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt());
    }

    public String toString() {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        String str = String.format("%-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s", Arrays.copyOf(new Object[]{"State=" + this.EZpvd, "FDSize=" + this.KWHzl, "VmSize=" + this.AhwBna + " K", "VmRss=" + this.djBIcL + " K", "VmSwap=" + this.AYXKKw + " K", "Threads=" + this.OLrzqt, "oom_adj=" + this.copydefault, "oom_score_adj=" + this.AEQbTJ}, 8));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.tencent.matrix.util.StatusInfo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ StatusInfo get$default(Activity activity, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = Process.myPid();
            }
            return activity.AEQbTJ(i);
        }

        public final StatusInfo AEQbTJ(int i) {
            Map<String, String> mapKWHzl = KWHzl(i);
            StatusInfo statusInfo = new StatusInfo(null, 0L, 0L, 0L, 0L, 0L, 0, 0, 255, null);
            try {
                String strFJNWhG = C59442zhC.fJNWhG(OLrzqt(mapKWHzl, "State"));
                long jCopydefault = copydefault(mapKWHzl, "FDSize");
                long jCopydefault2 = copydefault(mapKWHzl, "VmSize");
                long jCopydefault3 = copydefault(mapKWHzl, "VmRSS");
                long jCopydefault4 = copydefault(mapKWHzl, "VmSwap");
                long jCopydefault5 = copydefault(mapKWHzl, "Threads");
                Activity activity = StatusInfo.Companion;
                return new StatusInfo(strFJNWhG, jCopydefault, jCopydefault2, jCopydefault3, jCopydefault4, jCopydefault5, activity.EZpvd(i), activity.copydefault(i));
            } catch (Throwable th) {
                C58013ytK.OLrzqt("Matrix.MemoryInfoFactory", th, "", new Object[0]);
                return statusInfo;
            }
        }

        public static final String OLrzqt(Map<String, String> map, String str) {
            String str2 = map.get(str);
            return str2 == null ? "unknown" : str2;
        }

        public static final long copydefault(Map<String, String> map, String str) {
            Matcher matcher = Pattern.compile("\\d+").matcher(OLrzqt(map, str));
            if (!matcher.find()) {
                return -2L;
            }
            String strGroup = matcher.group();
            Intrinsics.checkNotNullExpressionValue(strGroup, "");
            return Long.parseLong(strGroup);
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public final int EZpvd(int i) {
            try {
                Reader inputStreamReader = new InputStreamReader(new FileInputStream(new File("/proc/" + i + "/oom_adj")), Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    int i2 = Integer.parseInt((String) C59467zhb.AubY(yFK.KWHzl(bufferedReader)));
                    yFA.copydefault(bufferedReader, null);
                    return i2;
                } finally {
                }
            } catch (Throwable unused) {
                return Integer.MAX_VALUE;
            }
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public final int copydefault(int i) {
            try {
                Reader inputStreamReader = new InputStreamReader(new FileInputStream(new File("/proc/" + i + "/oom_score_adj")), Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    int i2 = Integer.parseInt((String) C59467zhb.AubY(yFK.KWHzl(bufferedReader)));
                    yFA.copydefault(bufferedReader, null);
                    return i2;
                } finally {
                }
            } catch (Throwable unused) {
                return Integer.MAX_VALUE;
            }
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public final Map<String, String> KWHzl(int i) {
            try {
                Reader inputStreamReader = new InputStreamReader(new FileInputStream(new File("/proc/" + i + "/status")), Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    Map<String, String> mapOLrzqt = C56424yEw.OLrzqt(C59467zhb.isConnected(yFK.KWHzl(bufferedReader), new Function1<String, Sequence<? extends Pair<? extends String, ? extends String>>>() { // from class: com.tencent.matrix.util.StatusInfo$Companion$convertProcStatus$1$1$1
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function1
                        public final Sequence<Pair<String, String>> invoke(@NotNull String str) {
                            Intrinsics.checkNotNullParameter(str, "");
                            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
                            if (listSplit$default.size() == 2) {
                                return C59405zgS.EZpvd((Object[]) new Pair[]{C56390yDp.OLrzqt(listSplit$default.get(0), listSplit$default.get(1))});
                            }
                            C58013ytK.OLrzqt("Matrix.MemoryInfoFactory", "ERROR : " + str, new Object[0]);
                            return C59405zgS.OLrzqt();
                        }
                    }));
                    yFA.copydefault(bufferedReader, null);
                    return mapOLrzqt;
                } finally {
                }
            } catch (Throwable th) {
                C58013ytK.OLrzqt("Matrix.MemoryInfoFactory", th, "", new Object[0]);
                return C56424yEw.KWHzl();
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeLong(this.KWHzl);
        parcel.writeLong(this.AhwBna);
        parcel.writeLong(this.djBIcL);
        parcel.writeLong(this.AYXKKw);
        parcel.writeLong(this.OLrzqt);
        parcel.writeInt(this.copydefault);
        parcel.writeInt(this.AEQbTJ);
    }
}
