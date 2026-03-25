package o;

import aws.smithy.kotlin.runtime.serde.SerializationException;
import aws.smithy.kotlin.runtime.time.TimestampFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EW implements InterfaceC5106Ey, InterfaceC5094Em, InterfaceC5097Ep, EB {
    public final ET AEQbTJ = C5108Fa.jsonStreamWriter$default(false, 1, null);
    public static final Activity OLrzqt = new Activity(null);
    public static final java.util.Set<java.lang.Double> KWHzl = yEE.AhwBna(java.lang.Double.valueOf(Double.NEGATIVE_INFINITY), java.lang.Double.valueOf(Double.POSITIVE_INFINITY), java.lang.Double.valueOf(Double.NaN));
    public static final java.util.Set<java.lang.Float> EZpvd = yEE.AhwBna(java.lang.Float.valueOf(Float.NEGATIVE_INFINITY), java.lang.Float.valueOf(Float.POSITIVE_INFINITY), java.lang.Float.valueOf(Float.NaN));

    /* JADX INFO: loaded from: classes14.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TimestampFormat.values().length];
            try {
                iArr[TimestampFormat.EPOCH_SECONDS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TimestampFormat.ISO_8601.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TimestampFormat.ISO_8601_CONDENSED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TimestampFormat.ISO_8601_CONDENSED_DATE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[TimestampFormat.RFC_5322.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            copydefault = iArr;
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.EW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC5106Ey
    public byte[] copydefault() {
        byte[] bArrOLrzqt = this.AEQbTJ.OLrzqt();
        if (bArrOLrzqt != null) {
            return bArrOLrzqt;
        }
        throw new SerializationException("Serializer payload is empty");
    }

    @Override // o.InterfaceC5106Ey
    public EB EZpvd(@NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        this.AEQbTJ.KWHzl();
        return this;
    }

    @Override // o.InterfaceC5106Ey
    public InterfaceC5094Em AEQbTJ(@NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        this.AEQbTJ.AEQbTJ();
        return this;
    }

    @Override // o.InterfaceC5106Ey
    public InterfaceC5097Ep KWHzl(@NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        this.AEQbTJ.KWHzl();
        return this;
    }

    @Override // o.EB
    public void AEQbTJ() {
        this.AEQbTJ.EZpvd();
    }

    @Override // o.InterfaceC5094Em
    public void EZpvd() {
        this.AEQbTJ.copydefault();
    }

    @Override // o.InterfaceC5097Ep
    public void KWHzl() {
        this.AEQbTJ.EZpvd();
    }

    @Override // o.EB
    public void EZpvd(@NotNull C5101Et c5101Et, @NotNull InterfaceC5103Ev interfaceC5103Ev) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(interfaceC5103Ev, "");
        this.AEQbTJ.KWHzl(EQ.KWHzl(c5101Et));
        interfaceC5103Ev.EZpvd(this);
    }

    @Override // o.EB
    public void OLrzqt(@NotNull C5101Et c5101Et, int i) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        this.AEQbTJ.KWHzl(EQ.KWHzl(c5101Et));
        OLrzqt(i);
    }

    @Override // o.EB
    public void EZpvd(@NotNull C5101Et c5101Et, long j) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        this.AEQbTJ.KWHzl(EQ.KWHzl(c5101Et));
        EZpvd(j);
    }

    @Override // o.EB
    public void copydefault(@NotNull C5101Et c5101Et, float f) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        this.AEQbTJ.KWHzl(EQ.KWHzl(c5101Et));
        OLrzqt(f);
    }

    @Override // o.EB
    public void AEQbTJ(@NotNull C5101Et c5101Et, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.KWHzl(EQ.KWHzl(c5101Et));
        KWHzl(str);
    }

    @Override // o.EB
    public void OLrzqt(@NotNull C5101Et c5101Et, boolean z) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        this.AEQbTJ.KWHzl(EQ.KWHzl(c5101Et));
        OLrzqt(z);
    }

    @Override // o.EB
    public void KWHzl(@NotNull C5101Et c5101Et, @NotNull C5173Hn c5173Hn, @NotNull TimestampFormat timestampFormat) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        Intrinsics.checkNotNullParameter(timestampFormat, "");
        this.AEQbTJ.KWHzl(EQ.KWHzl(c5101Et));
        AEQbTJ(c5173Hn, timestampFormat);
    }

    @Override // o.EB
    public void EZpvd(@NotNull C5101Et c5101Et, @NotNull Function1<? super InterfaceC5094Em, Unit> function1) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.KWHzl(EQ.KWHzl(c5101Et));
        InterfaceC5094Em interfaceC5094EmAEQbTJ = AEQbTJ(c5101Et);
        function1.invoke(interfaceC5094EmAEQbTJ);
        interfaceC5094EmAEQbTJ.EZpvd();
    }

    @Override // o.EB
    public void OLrzqt(@NotNull C5101Et c5101Et, @NotNull Function1<? super InterfaceC5097Ep, Unit> function1) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.KWHzl(EQ.KWHzl(c5101Et));
        InterfaceC5097Ep interfaceC5097EpKWHzl = KWHzl(c5101Et);
        function1.invoke(interfaceC5097EpKWHzl);
        interfaceC5097EpKWHzl.KWHzl();
    }

    @Override // o.InterfaceC5097Ep
    public void KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.KWHzl(str);
        if (str2 != null) {
            KWHzl(str2);
        } else {
            this.AEQbTJ.valueOf();
        }
    }

    @Override // o.InterfaceC5097Ep
    public void copydefault(@NotNull java.lang.String str, InterfaceC5103Ev interfaceC5103Ev) {
        Unit unit;
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.KWHzl(str);
        if (interfaceC5103Ev != null) {
            interfaceC5103Ev.EZpvd(this);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.AEQbTJ.valueOf();
        }
    }

    public void OLrzqt(boolean z) {
        this.AEQbTJ.OLrzqt(z);
    }

    public void OLrzqt(int i) {
        this.AEQbTJ.KWHzl(i);
    }

    public void EZpvd(long j) {
        this.AEQbTJ.AEQbTJ(j);
    }

    public void OLrzqt(float f) {
        if (EZpvd.contains(java.lang.Float.valueOf(f))) {
            this.AEQbTJ.AEQbTJ(java.lang.String.valueOf(f));
        } else {
            this.AEQbTJ.AEQbTJ(f);
        }
    }

    @Override // o.InterfaceC5099Er
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.AEQbTJ(str);
    }

    @Override // o.InterfaceC5099Er
    public void EZpvd(@NotNull InterfaceC5103Ev interfaceC5103Ev) {
        Intrinsics.checkNotNullParameter(interfaceC5103Ev, "");
        interfaceC5103Ev.EZpvd(this);
    }

    public void AEQbTJ(@NotNull C5173Hn c5173Hn, @NotNull TimestampFormat timestampFormat) {
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        Intrinsics.checkNotNullParameter(timestampFormat, "");
        int i = TaskDescription.copydefault[timestampFormat.ordinal()];
        if (i == 1) {
            this.AEQbTJ.EZpvd(c5173Hn.OLrzqt(timestampFormat));
        } else if (i == 2 || i == 3 || i == 4 || i == 5) {
            this.AEQbTJ.AEQbTJ(c5173Hn.OLrzqt(timestampFormat));
        }
    }
}
