package o;

import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5144Gk implements InterfaceC5148Go {
    public final CoroutineContext AEQbTJ;
    public final InterfaceC5148Go OLrzqt;
    public final java.lang.String copydefault;

    public C5144Gk(@NotNull CoroutineContext coroutineContext, @NotNull InterfaceC5148Go interfaceC5148Go, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(interfaceC5148Go, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = coroutineContext;
        this.OLrzqt = interfaceC5148Go;
        this.copydefault = str;
    }

    @Override // o.InterfaceC5148Go
    public void AEQbTJ(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C5141Gh.KWHzl(this.AEQbTJ, this.copydefault, th, function0);
    }

    @Override // o.InterfaceC5148Go
    public void KWHzl(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C5141Gh.copydefault(this.AEQbTJ, this.copydefault, th, function0);
    }

    @Override // o.InterfaceC5148Go
    public void copydefault(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C5141Gh.AEQbTJ(this.AEQbTJ, this.copydefault, th, function0);
    }

    @Override // o.InterfaceC5148Go
    public void OLrzqt(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C5141Gh.OLrzqt(this.AEQbTJ, this.copydefault, th, function0);
    }

    @Override // o.InterfaceC5148Go
    public void EZpvd(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C5141Gh.EZpvd(this.AEQbTJ, this.copydefault, th, function0);
    }

    @Override // o.InterfaceC5148Go
    public boolean OLrzqt(@NotNull LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "");
        return this.OLrzqt.OLrzqt(logLevel);
    }

    @Override // o.InterfaceC5148Go
    public InterfaceC5147Gn KWHzl(@NotNull LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "");
        return this.OLrzqt.KWHzl(logLevel);
    }
}
