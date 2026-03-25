package o;

import androidx.databinding.Observable;
import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49992uyx extends ViewModel {
    public ObservableField<java.lang.Boolean> AEQbTJ = new ObservableField<>();

    public final void OLrzqt() {
        this.AEQbTJ.set(null);
    }

    public final boolean AEQbTJ() {
        return Intrinsics.EZpvd(this.AEQbTJ.get(), java.lang.Boolean.TRUE);
    }

    public final void KWHzl(boolean z) {
        this.AEQbTJ.set(java.lang.Boolean.valueOf(z));
    }

    public final void EZpvd(@NotNull Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        Intrinsics.checkNotNullParameter(onPropertyChangedCallback, "");
        this.AEQbTJ.addOnPropertyChangedCallback(onPropertyChangedCallback);
    }

    public final void OLrzqt(@NotNull Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        Intrinsics.checkNotNullParameter(onPropertyChangedCallback, "");
        this.AEQbTJ.removeOnPropertyChangedCallback(onPropertyChangedCallback);
    }
}
