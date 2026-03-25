package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pHe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37963pHe extends ViewModel {
    public final MutableLiveData<java.lang.String> AEQbTJ = new MutableLiveData<>();

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.postValue(str);
    }
}
