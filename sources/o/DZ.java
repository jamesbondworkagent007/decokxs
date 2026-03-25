package o;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import kotlin.time.TimeMark;
import o.DV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DZ {
    public int AEQbTJ;
    public final double EZpvd;
    public double KWHzl;
    public TimeMark OLrzqt;
    public final DV.Application copydefault;
    public final InterfaceC59524zif djBIcL;

    public DZ(@NotNull DV.Application application, @NotNull InterfaceC59524zif interfaceC59524zif, @NotNull TimeMark timeMark, double d, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(interfaceC59524zif, "");
        Intrinsics.checkNotNullParameter(timeMark, "");
        this.copydefault = application;
        this.djBIcL = interfaceC59524zif;
        this.OLrzqt = timeMark;
        this.KWHzl = d;
        this.AEQbTJ = i;
        this.EZpvd = ((double) 1) / C59462zhW.EZpvd(application.OLrzqt(), DurationUnit.SECONDS);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 o.DV$Application)
  (r9v0 o.zif)
  (wrap:kotlin.time.TimeMark:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.time.TimeMark:0x0004: INVOKE (r9v0 o.zif) INTERFACE call: o.zif.KWHzl():kotlin.time.TimeMark A[MD:():kotlin.time.TimeMark (m), WRAPPED] (LINE:240)) : (r10v0 kotlin.time.TimeMark))
  (wrap:double:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:double:0x000d: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r11v0 double))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
 A[MD:(o.DV$Application, o.zif, kotlin.time.TimeMark, double, int):void (m)] (LINE:237) call: o.DZ.<init>(o.DV$Application, o.zif, kotlin.time.TimeMark, double, int):void type: THIS */
    public /* synthetic */ DZ(DV.Application application, InterfaceC59524zif interfaceC59524zif, TimeMark timeMark, double d, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, interfaceC59524zif, (i2 & 4) != 0 ? interfaceC59524zif.KWHzl() : timeMark, (i2 & 8) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i2 & 16) != 0 ? 0 : i);
    }

    public final double copydefault() {
        this.AEQbTJ++;
        double dFloor = java.lang.Math.floor(C59462zhW.AEQbTJ(this.OLrzqt.copydefault(), this.copydefault.OLrzqt()));
        if (dFloor >= 1.0d) {
            this.KWHzl = ((((double) this.AEQbTJ) / dFloor) * this.EZpvd * this.copydefault.djBIcL()) + (this.KWHzl * (((double) 1) - this.copydefault.djBIcL()));
            this.OLrzqt = this.OLrzqt.KWHzl(C59462zhW.OLrzqt(this.copydefault.OLrzqt(), dFloor));
            this.AEQbTJ = 0;
        }
        return this.KWHzl;
    }
}
