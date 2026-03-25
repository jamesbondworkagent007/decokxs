package o;

import androidx.databinding.Observable;
import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uBP extends ViewModel {
    public ObservableField<java.lang.String> AEQbTJ = new ObservableField<>();

    public final java.lang.String EZpvd() {
        return this.AEQbTJ.get();
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.set(str);
    }

    public final void EZpvd(@NotNull Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        Intrinsics.checkNotNullParameter(onPropertyChangedCallback, "");
        this.AEQbTJ.addOnPropertyChangedCallback(onPropertyChangedCallback);
    }

    public final void copydefault(@NotNull Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        Intrinsics.checkNotNullParameter(onPropertyChangedCallback, "");
        this.AEQbTJ.removeOnPropertyChangedCallback(onPropertyChangedCallback);
    }
}
