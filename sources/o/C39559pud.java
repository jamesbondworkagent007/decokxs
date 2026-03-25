package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.pud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39559pud extends ViewModel {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.puc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39559pud.EZpvd();
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pub
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39559pud.copydefault();
        }
    });

    public final MutableLiveData<java.lang.String> KWHzl() {
        return (MutableLiveData) this.AEQbTJ.getValue();
    }

    public static final MutableLiveData EZpvd() {
        return new MutableLiveData();
    }

    public final MutableLiveData<java.lang.String> gEmmrt() {
        return (MutableLiveData) this.OLrzqt.getValue();
    }

    public static final MutableLiveData copydefault() {
        return new MutableLiveData();
    }
}
