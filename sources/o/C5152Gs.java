package o;

import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import aws.smithy.kotlin.runtime.telemetry.logging.slf4j.Slf4j1xLogRecordBuilderAdapter$emit$logMethod$1;
import aws.smithy.kotlin.runtime.telemetry.logging.slf4j.Slf4j1xLogRecordBuilderAdapter$emit$logMethod$2;
import aws.smithy.kotlin.runtime.telemetry.logging.slf4j.Slf4j1xLogRecordBuilderAdapter$emit$logMethod$3;
import aws.smithy.kotlin.runtime.telemetry.logging.slf4j.Slf4j1xLogRecordBuilderAdapter$emit$logMethod$4;
import aws.smithy.kotlin.runtime.telemetry.logging.slf4j.Slf4j1xLogRecordBuilderAdapter$emit$logMethod$5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5152Gs implements InterfaceC5147Gn {
    public final InterfaceC56387yDm AEQbTJ;
    public final C5155Gv EZpvd;
    public java.lang.Throwable KWHzl;
    public final LogLevel OLrzqt;
    public Function0<java.lang.String> copydefault;

    /* JADX INFO: renamed from: o.Gs$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.Error.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.Warning.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.Info.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.Debug.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.Trace.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5147Gn
    public void KWHzl(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        this.KWHzl = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5147Gn
    public void KWHzl(@NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    public C5152Gs(@NotNull C5155Gv c5155Gv, @NotNull LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(c5155Gv, "");
        Intrinsics.checkNotNullParameter(logLevel, "");
        this.EZpvd = c5155Gv;
        this.OLrzqt = logLevel;
        this.AEQbTJ = C56392yDr.copydefault(new Function0<java.util.Map<java.lang.String, java.lang.Object>>() { // from class: aws.smithy.kotlin.runtime.telemetry.logging.slf4j.Slf4j1xLogRecordBuilderAdapter$kvp$2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final Map<String, Object> invoke() {
                return new LinkedHashMap();
            }
        });
    }

    public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ() {
        return (java.util.Map) this.AEQbTJ.getValue();
    }

    @Override // o.InterfaceC5147Gn
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        AEQbTJ().put(str, obj);
    }

    @Override // o.InterfaceC5147Gn
    public void OLrzqt() {
        Function2 slf4j1xLogRecordBuilderAdapter$emit$logMethod$1;
        Function0<java.lang.String> function0 = this.copydefault;
        if (function0 == null) {
            throw new java.lang.IllegalArgumentException("no message provided to LogRecordBuilder".toString());
        }
        int i = StateListAnimator.copydefault[this.OLrzqt.ordinal()];
        if (i == 1) {
            slf4j1xLogRecordBuilderAdapter$emit$logMethod$1 = new Slf4j1xLogRecordBuilderAdapter$emit$logMethod$1(this.EZpvd);
        } else if (i == 2) {
            slf4j1xLogRecordBuilderAdapter$emit$logMethod$1 = new Slf4j1xLogRecordBuilderAdapter$emit$logMethod$2(this.EZpvd);
        } else if (i == 3) {
            slf4j1xLogRecordBuilderAdapter$emit$logMethod$1 = new Slf4j1xLogRecordBuilderAdapter$emit$logMethod$3(this.EZpvd);
        } else if (i == 4) {
            slf4j1xLogRecordBuilderAdapter$emit$logMethod$1 = new Slf4j1xLogRecordBuilderAdapter$emit$logMethod$4(this.EZpvd);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            slf4j1xLogRecordBuilderAdapter$emit$logMethod$1 = new Slf4j1xLogRecordBuilderAdapter$emit$logMethod$5(this.EZpvd);
        }
        if (true ^ AEQbTJ().isEmpty()) {
            java.util.Map<java.lang.String, java.lang.String> mapCopydefault = C60101zvi.copydefault();
            try {
                for (Map.Entry<java.lang.String, java.lang.Object> entry : AEQbTJ().entrySet()) {
                    C60101zvi.EZpvd(entry.getKey(), entry.getValue().toString());
                }
                slf4j1xLogRecordBuilderAdapter$emit$logMethod$1.invoke(this.KWHzl, function0);
                return;
            } finally {
                C60101zvi.KWHzl(mapCopydefault);
            }
        }
        slf4j1xLogRecordBuilderAdapter$emit$logMethod$1.invoke(this.KWHzl, function0);
    }
}
