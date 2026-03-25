package o;

import androidx.camera.video.AudioStats;
import aws.smithy.kotlin.runtime.retries.policy.RetryErrorType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import kotlin.time.TimeMark;
import o.DV;
import o.InterfaceC59524zif;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5083Eb {
    public boolean AEQbTJ;
    public double AYXKKw;
    public TimeMark EZpvd;
    public final InterfaceC59524zif KWHzl;
    public double OLrzqt;
    public final DV.Application copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
    }

    public C5083Eb(@NotNull DV.Application application, @NotNull InterfaceC59524zif interfaceC59524zif, double d, @NotNull TimeMark timeMark) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(interfaceC59524zif, "");
        Intrinsics.checkNotNullParameter(timeMark, "");
        this.copydefault = application;
        this.KWHzl = interfaceC59524zif;
        this.OLrzqt = d;
        this.EZpvd = timeMark;
        this.AYXKKw = copydefault();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5083Eb(DV.Application application, InterfaceC59524zif interfaceC59524zif, double d, TimeMark timeMark, int i, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC59524zif interfaceC59524zif2 = (i & 2) != 0 ? InterfaceC59524zif.StateListAnimator.AEQbTJ : interfaceC59524zif;
        this(application, interfaceC59524zif2, (i & 4) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i & 8) != 0 ? interfaceC59524zif2.KWHzl() : timeMark);
    }

    public final double KWHzl(RetryErrorType retryErrorType, double d, double d2) {
        if (retryErrorType == RetryErrorType.Throttling) {
            if (this.AEQbTJ) {
                d = java.lang.Math.min(d, d2);
            }
            this.OLrzqt = d;
            this.AYXKKw = copydefault();
            this.EZpvd = this.KWHzl.KWHzl();
            this.AEQbTJ = true;
            return copydefault(this.OLrzqt);
        }
        return EZpvd();
    }

    public final double copydefault() {
        return java.lang.Math.cbrt((this.OLrzqt * (((double) 1) - this.copydefault.copydefault())) / this.copydefault.EZpvd());
    }

    public final double EZpvd() {
        return (this.copydefault.EZpvd() * java.lang.Math.pow(C59462zhW.EZpvd(this.EZpvd.copydefault(), DurationUnit.SECONDS) - this.AYXKKw, 3)) + this.OLrzqt;
    }

    public final double copydefault(double d) {
        return d * this.copydefault.copydefault();
    }
}
