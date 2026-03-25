package o;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xUh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54760xUh implements xTK {
    public final MutableLiveData<?> KWHzl;

    public C54760xUh(@NotNull MutableLiveData<?> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.KWHzl = mutableLiveData;
    }

    @Override // o.xTK
    public boolean KWHzl() {
        return this.KWHzl.hasActiveObservers();
    }
}
