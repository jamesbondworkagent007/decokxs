package o;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kJm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27954kJm extends AbstractC33073mpa {
    public final MutableLiveData<java.lang.String> OLrzqt = new MutableLiveData<>("");
    public final MutableLiveData<java.lang.String> EZpvd = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.setValue(str);
    }
}
