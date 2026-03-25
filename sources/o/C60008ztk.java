package o;

import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60008ztk {
    public static final CreationExtras OLrzqt(@NotNull android.os.Bundle bundle, @NotNull ViewModelStoreOwner viewModelStoreOwner) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "");
        if (bundle.keySet().isEmpty()) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, bundle);
            mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, viewModelStoreOwner);
            mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, (SavedStateRegistryOwner) viewModelStoreOwner);
            objM7377constructorimpl = Result.m7377constructorimpl(mutableCreationExtras);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (CreationExtras) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }
}
