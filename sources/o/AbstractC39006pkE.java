package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.pkE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC39006pkE extends ViewModel {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.pkF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC39006pkE.EZpvd();
        }
    });
    public final java.util.HashMap<java.lang.String, InterfaceC58217yxC> KWHzl = new java.util.HashMap<>();
    public final MutableLiveData<java.lang.Boolean> valueOf = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Throwable> copydefault = new MutableLiveData<>();
    public final MutableLiveData<java.lang.String> OLrzqt = new MutableLiveData<>();

    public static final C58216yxB EZpvd() {
        return new C58216yxB();
    }

    public final C58216yxB AEQbTJ() {
        return (C58216yxB) this.EZpvd.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        AEQbTJ().dispose();
        java.util.Iterator<Map.Entry<java.lang.String, InterfaceC58217yxC>> it = this.KWHzl.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().dispose();
        }
        this.KWHzl.clear();
    }
}
