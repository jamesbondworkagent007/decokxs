package o;

import com.amplitude.common.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MO implements MR {
    public final java.io.File AEQbTJ;
    public java.util.Properties KWHzl;
    public final Logger OLrzqt;
    public final java.lang.String copydefault;

    public MO(@NotNull java.io.File file, @NotNull java.lang.String str, Logger logger) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = logger;
        this.KWHzl = new java.util.Properties();
        java.lang.String str2 = str + ".properties";
        this.copydefault = str2;
        this.AEQbTJ = new java.io.File(file, str2);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void copydefault() throws java.io.IOException {
        if (this.AEQbTJ.exists()) {
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.AEQbTJ);
                try {
                    this.KWHzl.load(fileInputStream);
                    Unit unit = Unit.INSTANCE;
                    yFA.copydefault(fileInputStream, null);
                    return;
                } finally {
                }
            } catch (java.lang.Throwable th) {
                this.AEQbTJ.delete();
                Logger logger = this.OLrzqt;
                if (logger != null) {
                    logger.EZpvd("Failed to load property file with path " + this.AEQbTJ.getAbsolutePath() + ", error stacktrace: " + C56379yDe.AEQbTJ(th));
                }
            }
        }
        OLrzqt();
    }

    public final void OLrzqt() throws java.io.IOException {
        this.AEQbTJ.getParentFile().mkdirs();
        this.AEQbTJ.createNewFile();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void AEQbTJ() {
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.AEQbTJ);
            try {
                this.KWHzl.store(fileOutputStream, (java.lang.String) null);
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(fileOutputStream, null);
            } finally {
            }
        } catch (java.lang.Throwable th) {
            Logger logger = this.OLrzqt;
            if (logger != null) {
                logger.EZpvd("Failed to save property file with path " + this.AEQbTJ.getAbsolutePath() + ", error stacktrace: " + C56379yDe.AEQbTJ(th));
            }
        }
    }

    @Override // o.MR
    public long AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String property = this.KWHzl.getProperty(str, "");
        Intrinsics.checkNotNullExpressionValue(property, "");
        java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(property);
        return fieldNames != null ? fieldNames.longValue() : j;
    }

    @Override // o.MR
    public boolean KWHzl(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.setProperty(str, java.lang.String.valueOf(j));
        AEQbTJ();
        return true;
    }

    @Override // o.MR
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.remove(str);
        AEQbTJ();
    }

    public final boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl.setProperty(str, str2);
        AEQbTJ();
        return true;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.getProperty(str, str2);
    }

    public final boolean EZpvd(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.KWHzl.remove((java.lang.String) it.next());
        }
        AEQbTJ();
        return true;
    }
}
