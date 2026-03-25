package o;

import com.okinc.okimcore.model.other.IMUserExtraInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sRe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44475sRe {
    public static final IMUserExtraInfo AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            try {
                return (IMUserExtraInfo) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) IMUserExtraInfo.Companion.serializer(), str);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }
}
