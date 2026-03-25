package o;

import com.google.common.primitives.UnsignedBytes;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56548yJl;
import o.C59460zhU;
import o.DG;
import o.DH;
import o.yDA;
import o.yDB;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DG extends DJ {
    public static final DG EZpvd;
    public static final DG OLrzqt;
    public final java.lang.String AYXKKw;
    public final byte[] djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public static final byte[] AEQbTJ = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1};

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 short)
  (r2v0 short)
  (r3v0 short)
  (r4v0 short)
  (r5v0 short)
  (r6v0 short)
  (r7v0 short)
  (r8v0 short)
  (r9v0 java.lang.String)
 A[MD:(short, short, short, short, short, short, short, short, java.lang.String):void (m)] call: o.DG.<init>(short, short, short, short, short, short, short, short, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DG(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8, java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(s, s2, s3, s4, s5, s6, s7, s8, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DG copy$default(DG dg, byte[] bArr, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr = dg.djBIcL;
        }
        if ((i & 2) != 0) {
            str = dg.AYXKKw;
        }
        return dg.KWHzl(bArr, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DG KWHzl(@NotNull byte[] bArr, java.lang.String str) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new DG(bArr, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.DJ
    public byte[] OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 byte[])
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(byte[], java.lang.String):void (m)] (LINE:57) call: o.DG.<init>(byte[], java.lang.String):void type: THIS */
    public /* synthetic */ DG(byte[] bArr, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DG(@NotNull byte[] bArr, java.lang.String str) {
        super(null);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.djBIcL = bArr;
        this.AYXKKw = str;
        if (OLrzqt().length != 16) {
            throw new java.lang.IllegalArgumentException(("Invalid IPv6 repr: " + OLrzqt() + "; expected 16 bytes").toString());
        }
        this.valueOf = C56392yDr.copydefault(new Function0<yDA>() { // from class: aws.smithy.kotlin.runtime.net.IpV6Addr$segments$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ yDA invoke() {
                return yDA.EZpvd(m5819invokeamswpOA());
            }

            /* JADX INFO: renamed from: invoke-amswpOA, reason: not valid java name */
            public final short[] m5819invokeamswpOA() {
                int length = this.this$0.OLrzqt().length / 2;
                DG dg = this.this$0;
                short[] sArr = new short[length];
                for (int i = 0; i < length; i++) {
                    byte[] bArrOLrzqt = dg.OLrzqt();
                    int i2 = i * 2;
                    if (i2 > bArrOLrzqt.length - 2) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    sArr[i] = yDB.AEQbTJ((short) ((bArrOLrzqt[i2 + 1] & UnsignedBytes.MAX_VALUE) | ((bArrOLrzqt[i2] & UnsignedBytes.MAX_VALUE) << 8)));
                }
                return yDA.KWHzl(sArr);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.net.IpV6Addr$address$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String string;
                DH dhGEmmrt = this.this$0.gEmmrt();
                if (this.this$0.AhwBna()) {
                    string = "::1";
                } else if (this.this$0.djBIcL()) {
                    string = "::";
                } else if (dhGEmmrt != null) {
                    string = "::ffff:" + dhGEmmrt;
                } else {
                    DG dg = this.this$0;
                    StringBuilder sb = new StringBuilder();
                    int i = 0;
                    int i2 = 3;
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    TaskDescription taskDescription = new TaskDescription(i, i, i2, defaultConstructorMarker);
                    TaskDescription taskDescription2 = new TaskDescription(i, i, i2, defaultConstructorMarker);
                    short[] sArrKWHzl = dg.KWHzl();
                    int iOLrzqt = yDA.OLrzqt(sArrKWHzl);
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < iOLrzqt) {
                        if (yDA.OLrzqt(sArrKWHzl, i3) == yDB.AEQbTJ((short) 0)) {
                            if (taskDescription.KWHzl() == 0) {
                                taskDescription.copydefault(i4);
                            }
                            taskDescription.AEQbTJ(taskDescription.KWHzl() + 1);
                            if (taskDescription.KWHzl() > taskDescription2.KWHzl()) {
                                taskDescription2 = taskDescription;
                            }
                        } else {
                            taskDescription = new TaskDescription(i, i, i2, defaultConstructorMarker);
                        }
                        i3++;
                        i4++;
                    }
                    if (taskDescription2.KWHzl() > 1) {
                        dg.copydefault(sb, C56548yJl.AhwBna(0, taskDescription2.EZpvd()));
                        sb.append("::");
                        dg.copydefault(sb, C56548yJl.AhwBna(taskDescription2.EZpvd() + taskDescription2.KWHzl(), yDA.OLrzqt(dg.KWHzl())));
                    } else {
                        dg.copydefault(sb, yDV.KWHzl(dg.KWHzl()));
                    }
                    string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                }
                if (this.this$0.AEQbTJ() == null) {
                    return string;
                }
                return string + '%' + this.this$0.AEQbTJ();
            }

            public static final class TaskDescription {
                public int EZpvd;
                public int copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        i = taskDescription.EZpvd;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = taskDescription.copydefault;
                    }
                    return taskDescription.OLrzqt(i, i2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final void AEQbTJ(int i) {
                    this.copydefault = i;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int EZpvd() {
                    return this.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int KWHzl() {
                    return this.copydefault;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final TaskDescription OLrzqt(int i, int i2) {
                    return new TaskDescription(i, i2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final void copydefault(int i) {
                    this.EZpvd = i;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof TaskDescription)) {
                        return false;
                    }
                    TaskDescription taskDescription = (TaskDescription) obj;
                    return this.EZpvd == taskDescription.EZpvd && this.copydefault == taskDescription.copydefault;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (Integer.hashCode(this.EZpvd) * 31) + Integer.hashCode(this.copydefault);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Span(start=" + this.EZpvd + ", len=" + this.copydefault + ')';
                }

                public TaskDescription(int i, int i2) {
                    this.EZpvd = i;
                    this.copydefault = i2;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(int, int):void (m)] (LINE:125) call: aws.smithy.kotlin.runtime.net.IpV6Addr$address$2.TaskDescription.<init>(int, int):void type: THIS */
                public /* synthetic */ TaskDescription(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
                }
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r13v0 short)
  (r14v0 short)
  (r15v0 short)
  (r16v0 short)
  (r17v0 short)
  (r18v0 short)
  (r19v0 short)
  (r20v0 short)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(short, short, short, short, short, short, short, short, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:70) call: o.DG.<init>(short, short, short, short, short, short, short, short, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ DG(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(s, s2, s3, s4, s5, s6, s7, s8, (i & 256) != 0 ? null : str, null);
    }

    public DG(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8, java.lang.String str) {
        this(DK.AEQbTJ(s, s2, s3, s4, s5, s6, s7, s8), str);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DG.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final DG copydefault() {
            return DG.EZpvd;
        }
    }

    static {
        int i = 2;
        EZpvd = new DG(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        OLrzqt = new DG(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }

    public final short[] KWHzl() {
        return ((yDA) this.valueOf.getValue()).EZpvd();
    }

    public java.lang.String copydefault() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public final java.lang.StringBuilder copydefault(java.lang.StringBuilder sb, kotlin.ranges.IntRange intRange) {
        return (java.lang.StringBuilder) CollectionsKt___CollectionsKt.joinTo$default(intRange, sb, ":", null, null, 0, null, new Function1<java.lang.Integer, java.lang.CharSequence>() { // from class: aws.smithy.kotlin.runtime.net.IpV6Addr$formatSegments$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            public final CharSequence invoke(int i) {
                return C59460zhU.copydefault(yDA.OLrzqt(this.this$0.KWHzl(), i), 16);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ CharSequence invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, 60, null);
    }

    public boolean AhwBna() {
        return Intrinsics.EZpvd(this, EZpvd);
    }

    public boolean djBIcL() {
        return Intrinsics.EZpvd(this, OLrzqt);
    }

    public java.lang.String toString() {
        return copydefault();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && DG.class == obj.getClass() && java.util.Arrays.equals(OLrzqt(), ((DG) obj).OLrzqt());
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(OLrzqt());
    }

    public final DH gEmmrt() {
        byte[] bArr = AEQbTJ;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (OLrzqt()[i2] != bArr[i]) {
                return null;
            }
            i++;
            i2++;
        }
        return new DH(yDV.EZpvd(OLrzqt(), C56548yJl.AhwBna(AEQbTJ.length, OLrzqt().length)));
    }
}
