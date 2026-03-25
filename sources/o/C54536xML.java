package o;

import androidx.camera.video.AudioStats;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xML, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54536xML {
    public boolean AYXKKw;
    public boolean fetchVPNInfo;
    public boolean gEmmrt;
    public boolean isConnected;
    public java.lang.String values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final RoundingMode AEQbTJ = RoundingMode.HALF_UP;
    public static final RoundingMode AhwBna = RoundingMode.UP;
    public static final RoundingMode copydefault = RoundingMode.DOWN;
    public static final RoundingMode EZpvd = RoundingMode.FLOOR;
    public static final RoundingMode OLrzqt = RoundingMode.HALF_DOWN;
    public RoundingMode DbNXlk = copydefault;
    public java.lang.String djBIcL = "";
    public java.lang.String valueOf = "";
    public java.lang.String AkhnZx = "";

    /* JADX INFO: renamed from: o.xML$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RoundingMode.values().length];
            try {
                iArr[RoundingMode.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RoundingMode.HALF_UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54536xML AEQbTJ(boolean z) {
        this.AYXKKw = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54536xML AkhnZx() {
        this.fetchVPNInfo = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54536xML AuCTel() {
        this.DbNXlk = AhwBna;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void DbNXlk() {
        this.DbNXlk = copydefault;
        this.AYXKKw = false;
        this.fetchVPNInfo = false;
        this.isConnected = false;
        this.gEmmrt = false;
        this.djBIcL = "";
        this.valueOf = "";
        this.AkhnZx = "";
        this.values = "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54536xML EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54536xML OLrzqt() {
        this.DbNXlk = EZpvd;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54536xML OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.djBIcL = str;
        this.valueOf = str2;
        this.AkhnZx = str3;
        this.values = str4;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54536xML copydefault() {
        this.DbNXlk = copydefault;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54536xML djBIcL() {
        this.gEmmrt = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54536xML fJNWhG() {
        this.gEmmrt = false;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54536xML fetchVPNInfo() {
        this.isConnected = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54536xML isConnected() {
        this.DbNXlk = AEQbTJ;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54536xML valueOf() {
        this.DbNXlk = OLrzqt;
        return this;
    }

    /* JADX INFO: renamed from: o.xML$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xML.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static /* synthetic */ C54536xML setNumber$default(C54536xML c54536xML, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        return c54536xML.OLrzqt(str, str2, str3, str4);
    }

    public final C54536xML values() {
        if (C33129mqd.AEQbTJ(this.djBIcL) != AudioStats.AUDIO_AMPLITUDE_NONE) {
            java.lang.String strValueOf = java.lang.String.valueOf(C56548yJl.KWHzl(C33129mqd.AEQbTJ(this.djBIcL), 1.0E-15d));
            this.djBIcL = strValueOf;
            this.valueOf = java.lang.String.valueOf(C54573xNj.copydefault.AEQbTJ(java.lang.Math.abs(C33129mqd.AEQbTJ(strValueOf))));
            AEQbTJ(true);
        }
        return this;
    }

    public static /* synthetic */ java.lang.String toSafeString$default(C54536xML c54536xML, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c54536xML.EZpvd(z);
    }

    public final java.lang.String EZpvd(boolean z) {
        java.lang.String strAEQbTJ = C33129mqd.AEQbTJ(this.djBIcL, java.lang.Integer.valueOf(C33129mqd.AhwBna(this.valueOf)), java.lang.Boolean.valueOf(!this.AYXKKw), this.DbNXlk);
        if (this.gEmmrt) {
            int i = Activity.copydefault[this.DbNXlk.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (this.AYXKKw) {
                            strAEQbTJ = pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
                        } else {
                            strAEQbTJ = pTB.formatDownToMax$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
                        }
                    } else if (this.AYXKKw) {
                        strAEQbTJ = pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
                    } else {
                        strAEQbTJ = pTB.formatDownToMax$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
                    }
                } else if (this.AYXKKw) {
                    strAEQbTJ = pTB.formatRoundToFixed$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
                } else {
                    strAEQbTJ = pTB.formatRoundToMax$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
                }
            } else if (this.AYXKKw) {
                strAEQbTJ = pTB.formatUpToFixed$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
            } else {
                strAEQbTJ = pTB.formatUpToMax$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
            }
        }
        if (this.fetchVPNInfo) {
            strAEQbTJ = EZpvd(strAEQbTJ, z);
        } else if (this.isConnected) {
            strAEQbTJ = strAEQbTJ + " " + this.AkhnZx;
        }
        DbNXlk();
        return strAEQbTJ;
    }

    public static /* synthetic */ java.lang.String toSafeNoSignString$default(C54536xML c54536xML, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c54536xML.copydefault(z);
    }

    public final java.lang.String copydefault(boolean z) {
        java.lang.String strAEQbTJ = C33129mqd.AEQbTJ(this.djBIcL, java.lang.Integer.valueOf(C33129mqd.AhwBna(this.valueOf)), java.lang.Boolean.valueOf(!this.AYXKKw), this.DbNXlk);
        if (this.gEmmrt) {
            int i = Activity.copydefault[this.DbNXlk.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (this.AYXKKw) {
                            strAEQbTJ = pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
                        } else {
                            strAEQbTJ = pTB.formatDownToMax$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
                        }
                    } else if (this.AYXKKw) {
                        strAEQbTJ = pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
                    } else {
                        strAEQbTJ = pTB.formatDownToMax$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
                    }
                } else if (this.AYXKKw) {
                    strAEQbTJ = pTB.formatRoundToFixed$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
                } else {
                    strAEQbTJ = pTB.formatRoundToMax$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
                }
            } else if (this.AYXKKw) {
                strAEQbTJ = pTB.formatUpToFixed$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
            } else {
                strAEQbTJ = pTB.formatUpToMax$default(xMR.copydefault.OLrzqt((java.lang.Object) strAEQbTJ), C33129mqd.AhwBna(this.valueOf), null, 2, null);
            }
        }
        if (this.fetchVPNInfo || this.isConnected) {
            strAEQbTJ = java.lang.String.valueOf(strAEQbTJ);
        }
        DbNXlk();
        return strAEQbTJ;
    }

    public final C54536xML KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C33129mqd.AEQbTJ(C33129mqd.subS$default(C33129mqd.EZpvd(this.djBIcL), java.lang.Integer.valueOf(C33129mqd.AhwBna(this.djBIcL)), null, null, null, 14, null)) > 0.01d) {
            EZpvd(str);
        } else {
            EZpvd(str2);
        }
        return this;
    }

    public final C54536xML EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C33129mqd.EZpvd(this.djBIcL).precision() > C33129mqd.AhwBna(str)) {
            EZpvd(str2);
        } else {
            EZpvd(str);
        }
        return this;
    }

    public final java.lang.String EZpvd(java.lang.String str, boolean z) {
        C33129mqd.formatD$default(this.djBIcL, java.lang.Integer.valueOf(C33129mqd.AhwBna(this.valueOf)), null, null, 6, null);
        java.lang.String str2 = this.values;
        if (str2 == null) {
            str2 = "";
        }
        return str2 + str;
    }

    public final C54536xML AEQbTJ() {
        java.lang.String strKWHzl;
        if (C33129mqd.gEmmrt(this.djBIcL, 1000)) {
            strKWHzl = this.valueOf;
        } else {
            strKWHzl = C33129mqd.copydefault((java.lang.Object) this.djBIcL, (java.lang.Object) 1000000) ? "0" : C33129mqd.KWHzl((java.lang.Object) this.valueOf, (java.lang.Object) 4);
        }
        this.valueOf = strKWHzl;
        return this;
    }

    public final java.lang.String EZpvd() {
        return this.values + KWHzl();
    }

    public final java.lang.String KWHzl() {
        this.DbNXlk = AhwBna;
        double dAEQbTJ = C33129mqd.AEQbTJ(this.djBIcL);
        xMP xmp = xMP.AEQbTJ;
        if (xmp.AEQbTJ() || xmp.copydefault()) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.r8lambdaSjF4PZlnE9fmKbolD64Sz5ghy6c);
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.ActivityResult1);
            if (dAEQbTJ < 10000.0d) {
                return pTB.formatLocalized$default(C33129mqd.AEQbTJ(java.lang.Double.valueOf(dAEQbTJ), 2, java.lang.Boolean.TRUE, this.DbNXlk), null, 1, null);
            }
            if (dAEQbTJ < 1.0E8d) {
                return pTB.formatLocalized$default(C33129mqd.OLrzqt(java.lang.Double.valueOf(dAEQbTJ), 10000, 2, java.lang.Boolean.TRUE, this.DbNXlk), null, 1, null) + strAYXKKw;
            }
            return pTB.formatLocalized$default(C33129mqd.OLrzqt(java.lang.Double.valueOf(dAEQbTJ), 100000000, 2, java.lang.Boolean.FALSE, this.DbNXlk), null, 1, null) + strAYXKKw2;
        }
        if (dAEQbTJ < 1000.0d) {
            return pTB.formatLocalized$default(C33129mqd.AEQbTJ(java.lang.Double.valueOf(dAEQbTJ), 2, java.lang.Boolean.TRUE, this.DbNXlk), null, 1, null);
        }
        if (dAEQbTJ < 1000000.0d) {
            return pTB.formatLocalized$default(C33129mqd.OLrzqt(java.lang.Double.valueOf(dAEQbTJ), 1000, 2, java.lang.Boolean.TRUE, this.DbNXlk), null, 1, null) + "K";
        }
        if (dAEQbTJ < 1.0E9d) {
            return pTB.formatLocalized$default(C33129mqd.OLrzqt(java.lang.Double.valueOf(dAEQbTJ), 1000000, 2, java.lang.Boolean.TRUE, this.DbNXlk), null, 1, null) + "M";
        }
        return pTB.formatLocalized$default(C33129mqd.OLrzqt(java.lang.Double.valueOf(dAEQbTJ), 1000000000, 2, java.lang.Boolean.TRUE, this.DbNXlk), null, 1, null) + "B";
    }

    public static /* synthetic */ java.lang.String fmtKMBnWithLanguageWithoutSign$default(C54536xML c54536xML, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = 16;
        }
        if ((i & 2) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return c54536xML.OLrzqt(num, bool, roundingMode);
    }

    public final java.lang.String OLrzqt(java.lang.Integer num, java.lang.Boolean bool, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        this.DbNXlk = AhwBna;
        return pTB.formatICUCompact$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(this.djBIcL)), roundingMode, C38307pTy.Companion.EZpvd(num != null ? num.intValue() : 2), null, null, 12, null);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        xMP xmp = xMP.AEQbTJ;
        if (xmp.AEQbTJ() || xmp.copydefault()) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.r8lambdaSjF4PZlnE9fmKbolD64Sz5ghy6c);
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.ActivityResult1);
            if (dAEQbTJ < 10000.0d) {
                return pTB.formatLocalized$default(C33129mqd.AEQbTJ(java.lang.Double.valueOf(dAEQbTJ), 2, java.lang.Boolean.TRUE, this.DbNXlk), null, 1, null);
            }
            if (dAEQbTJ < 1.0E8d) {
                return pTB.formatLocalized$default(C33129mqd.OLrzqt(java.lang.Double.valueOf(dAEQbTJ), 10000, 2, java.lang.Boolean.TRUE, this.DbNXlk), null, 1, null) + strAYXKKw;
            }
            return pTB.formatLocalized$default(C33129mqd.OLrzqt(java.lang.Double.valueOf(dAEQbTJ), 100000000, 2, java.lang.Boolean.FALSE, this.DbNXlk), null, 1, null) + strAYXKKw2;
        }
        if (dAEQbTJ < 1000.0d) {
            return pTB.formatLocalized$default(C33129mqd.AEQbTJ(java.lang.Double.valueOf(dAEQbTJ), 2, java.lang.Boolean.TRUE, this.DbNXlk), null, 1, null);
        }
        if (dAEQbTJ < 1000000.0d) {
            return pTB.formatLocalized$default(C33129mqd.OLrzqt(java.lang.Double.valueOf(dAEQbTJ), 1000, 2, java.lang.Boolean.TRUE, this.DbNXlk), null, 1, null) + "K";
        }
        if (dAEQbTJ < 1.0E9d) {
            return pTB.formatLocalized$default(C33129mqd.OLrzqt(java.lang.Double.valueOf(dAEQbTJ), 1000000, 2, java.lang.Boolean.TRUE, this.DbNXlk), null, 1, null) + "M";
        }
        return pTB.formatLocalized$default(C33129mqd.OLrzqt(java.lang.Double.valueOf(dAEQbTJ), 1000000000, 2, java.lang.Boolean.TRUE, this.DbNXlk), null, 1, null) + "B";
    }
}
