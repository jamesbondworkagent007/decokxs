package o;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class xKH extends AndroidViewModel {
    public final SavedStateHandle finit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SavedStateHandle getSavedStateHandle() {
        return this.finit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xKH(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.finit = savedStateHandle;
    }

    public MutableLiveData<java.lang.Integer> getInt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.finit.getLiveData(str, 0);
    }

    public MutableLiveData<java.lang.Long> getLong(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.finit.getLiveData(str, 0L);
    }

    public MutableLiveData<java.lang.String> getString(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.finit.getLiveData(str);
    }

    public MutableLiveData<android.os.Parcelable> getParcelable(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.finit.getLiveData(str);
    }

    public MutableLiveData<java.io.Serializable> getSerializable(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.finit.getLiveData(str);
    }

    public <K> MutableLiveData<K> getField(@NotNull java.lang.String str, @android.annotation.SuppressLint({"UnknownNullness"}) K k) {
        Intrinsics.checkNotNullParameter(str, "");
        if (k == null) {
            return this.finit.getLiveData(str);
        }
        return this.finit.getLiveData(str, k);
    }
}
