package o;

import aws.smithy.kotlin.runtime.auth.awscredentials.CachedCredentialsProvider$resolve$3;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C59462zhW;
import o.InterfaceC5168Hi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C52751wX implements InterfaceC52778wY {
    public static final /* synthetic */ AtomicIntegerFieldUpdater OLrzqt = AtomicIntegerFieldUpdater.newUpdater(C52751wX.class, "EZpvd");
    public final InterfaceC5168Hi AEQbTJ;
    public final InterfaceC52805wZ AhwBna;
    public volatile /* synthetic */ int EZpvd;
    public final long KWHzl;
    public final C5182Hw<InterfaceC52697wV> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.wZ), (r2v0 long), (r4v0 long), (r6v0 o.Hi) A[MD:(o.wZ, long, long, o.Hi):void (m)] call: o.wX.<init>(o.wZ, long, long, o.Hi):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C52751wX(InterfaceC52805wZ interfaceC52805wZ, long j, long j2, InterfaceC5168Hi interfaceC5168Hi, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC52805wZ, j, j2, interfaceC5168Hi);
    }

    public C52751wX(InterfaceC52805wZ interfaceC52805wZ, long j, long j2, InterfaceC5168Hi interfaceC5168Hi) {
        Intrinsics.checkNotNullParameter(interfaceC52805wZ, "");
        Intrinsics.checkNotNullParameter(interfaceC5168Hi, "");
        this.AhwBna = interfaceC52805wZ;
        this.KWHzl = j;
        this.AEQbTJ = interfaceC5168Hi;
        this.copydefault = new C5182Hw<>(null, j2, interfaceC5168Hi, null);
        this.EZpvd = 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C52751wX(InterfaceC52805wZ interfaceC52805wZ, long j, long j2, InterfaceC5168Hi interfaceC5168Hi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jEZpvd;
        long jEZpvd2;
        if ((i & 2) != 0) {
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            jEZpvd = C59519zia.EZpvd(900, DurationUnit.SECONDS);
        } else {
            jEZpvd = j;
        }
        if ((i & 4) != 0) {
            C59462zhW.Activity activity2 = C59462zhW.OLrzqt;
            jEZpvd2 = C59519zia.EZpvd(10, DurationUnit.SECONDS);
        } else {
            jEZpvd2 = j2;
        }
        this(interfaceC52805wZ, jEZpvd, jEZpvd2, (i & 8) != 0 ? InterfaceC5168Hi.Activity.AEQbTJ : interfaceC5168Hi, null);
    }

    @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) {
        if (this.EZpvd != 0) {
            throw new java.lang.IllegalStateException("Credentials provider is closed".toString());
        }
        return this.copydefault.copydefault(new CachedCredentialsProvider$resolve$3(this, interfaceC57843yq, null), continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (OLrzqt.compareAndSet(this, 0, 1)) {
            this.copydefault.close();
            CB.copydefault(this.AhwBna);
        }
    }
}
