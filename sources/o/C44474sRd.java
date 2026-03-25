package o;

import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sRd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44474sRd {
    public static final C44474sRd KWHzl = new C44474sRd();

    private C44474sRd() {
    }

    public final OfficialTagInfo copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            try {
                return (OfficialTagInfo) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) OfficialTagInfo.Companion.serializer(), str);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public final java.lang.String OLrzqt(OfficialTagInfo officialTagInfo) {
        if (officialTagInfo != null) {
            try {
                return C33489mxS.KWHzl.KWHzl(OfficialTagInfo.Companion.serializer(), officialTagInfo);
            } catch (java.lang.Exception unused) {
            }
        }
        return "";
    }
}
