package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.contacts.viewmodel.RemoveContactViewModel$removeContact$2;
import com.okinc.im.imui.contacts.viewmodel.RemoveContactViewModel$removeContactOps$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nAG extends ViewModel {
    public final MutableLiveData<java.lang.Boolean> AEQbTJ;
    public final MutableLiveData<C32989mnw<java.lang.Throwable>> EZpvd;
    public final InterfaceC44177sGd KWHzl;
    public final MutableLiveData<C32989mnw<Unit>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<java.lang.Throwable>> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> OLrzqt() {
        return this.AEQbTJ;
    }

    public nAG(@NotNull InterfaceC44177sGd interfaceC44177sGd) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        this.KWHzl = interfaceC44177sGd;
        this.AEQbTJ = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RemoveContactViewModel$removeContactOps$1(this, str, null), 3, null);
    }

    public final java.lang.Object KWHzl(java.lang.String str, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new RemoveContactViewModel$removeContact$2(this, str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
