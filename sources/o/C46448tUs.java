package o;

import com.amplifyframework.core.model.ModelIdentifier;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tUs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46448tUs {
    public static final C46448tUs KWHzl = new C46448tUs();

    private C46448tUs() {
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "$" + str + " ";
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + str + " ";
    }
}
