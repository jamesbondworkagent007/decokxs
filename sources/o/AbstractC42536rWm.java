package o;

import com.okinc.okapm.okqpl.QPLFlavour;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.okapm.okqpl.reporter.OkQPLReporter;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rWm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC42536rWm {
    public static final Application Companion = new Application(null);
    public final java.lang.String copydefault;

    public abstract void AEQbTJ(@NotNull java.lang.String str, long j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    public abstract void EZpvd(@NotNull java.lang.String str, long j);

    public abstract void OLrzqt(@NotNull QPLType qPLType, @NotNull QPLMarker qPLMarker, @NotNull java.lang.String str, long j, java.util.Map<java.lang.String, java.lang.String> map);

    public abstract void copydefault(@NotNull QPLType qPLType, @NotNull QPLMarker qPLMarker, @NotNull java.lang.String str, long j);

    public AbstractC42536rWm() {
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.copydefault = string;
    }

    public static /* synthetic */ void markBegin$default(AbstractC42536rWm abstractC42536rWm, java.lang.String str, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markBegin");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        abstractC42536rWm.AEQbTJ(str, j);
    }

    public static /* synthetic */ void addMarker$default(AbstractC42536rWm abstractC42536rWm, QPLType qPLType, QPLMarker qPLMarker, java.lang.String str, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMarker");
        }
        if ((i & 4) != 0) {
            str = "";
        }
        java.lang.String str2 = str;
        if ((i & 8) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        abstractC42536rWm.copydefault(qPLType, qPLMarker, str2, j);
    }

    public static /* synthetic */ void addMarker$default(AbstractC42536rWm abstractC42536rWm, QPLType qPLType, QPLMarker qPLMarker, java.lang.String str, long j, java.util.Map map, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMarker");
        }
        if ((i & 4) != 0) {
            str = "";
        }
        java.lang.String str2 = str;
        if ((i & 8) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        abstractC42536rWm.OLrzqt(qPLType, qPLMarker, str2, j, map);
    }

    public static /* synthetic */ void markEnd$default(AbstractC42536rWm abstractC42536rWm, java.lang.String str, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markEnd");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        abstractC42536rWm.EZpvd(str, j);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.StackTraceElement[] stackTraceElementArr) {
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "");
        if (stackTraceElementArr.length == 0) {
            return "";
        }
        int i = 0;
        while (i < stackTraceElementArr.length) {
            if (C6798aWF.EZpvd(stackTraceElementArr[i].getFileName())) {
                java.lang.String className = stackTraceElementArr[i].getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "");
                java.lang.String name = getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) className, (java.lang.CharSequence) name, true)) {
                    break;
                }
            }
            i++;
        }
        int length = stackTraceElementArr.length;
        for (int i2 = i; i2 < length; i2++) {
            if (C6798aWF.EZpvd(stackTraceElementArr[i].getFileName())) {
                java.lang.String className2 = stackTraceElementArr[i2].getClassName();
                Intrinsics.checkNotNullExpressionValue(className2, "");
                java.lang.String name2 = getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name2, "");
                if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) className2, (java.lang.CharSequence) name2, true)) {
                    return stackTraceElementArr[i2].getClassName();
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: o.rWm$Application */
    public static final class Application {

        /* JADX INFO: renamed from: o.rWm$Application$Application, reason: collision with other inner class name */
        public final /* synthetic */ class C0933Application {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[QPLFlavour.values().length];
                try {
                    iArr[QPLFlavour.FRAGMENT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rWm.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ AbstractC42536rWm getInstance$default(Application application, QPLFlavour qPLFlavour, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qPLFlavour = QPLFlavour.DEFAULT;
            }
            return application.copydefault(qPLFlavour);
        }

        public final AbstractC42536rWm copydefault(@NotNull QPLFlavour qPLFlavour) {
            Intrinsics.checkNotNullParameter(qPLFlavour, "");
            if (C0933Application.EZpvd[qPLFlavour.ordinal()] == 1) {
                return new C42529rWf(OkQPLReporter.Companion.copydefault());
            }
            return new C42531rWh(OkQPLReporter.Companion.copydefault());
        }
    }
}
