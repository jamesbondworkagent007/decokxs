package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC45063sii {
    public static final int $stable = 8;
    private final java.lang.Object sourceBean;
    private final java.lang.String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object getSourceBean() {
        return this.sourceBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String getTitle() {
        return this.title;
    }

    public AbstractC45063sii(@NotNull java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.sourceBean = obj;
        this.title = str;
    }
}
