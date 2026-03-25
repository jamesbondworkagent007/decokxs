package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fXM<T extends OKWBaseTransaction<?>> extends AbstractC33073mpa {
    public boolean EZpvd = true;
    public final MutableLiveData<kotlin.Pair<T, java.lang.String>> AEQbTJ = new MutableLiveData<>();
    public MutableLiveData<java.lang.Boolean> KWHzl = new MutableLiveData<>(java.lang.Boolean.FALSE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<T, java.lang.String>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> copydefault() {
        return this.KWHzl;
    }

    public static /* synthetic */ void initTransaction$default(fXM fxm, SignDataArgs signDataArgs, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        fxm.copydefault((SignDataArgs<?>) signDataArgs, z, z2);
    }

    public final void copydefault(@NotNull SignDataArgs<?> signDataArgs, boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        signDataArgs.setUseDefaultUI(true);
        this.EZpvd = z;
        AbstractC58260yxt abstractC58260yxtBuildOKWTransaction$default = C8396bBt.buildOKWTransaction$default(C8396bBt.AEQbTJ, signDataArgs, null, false, 6, null);
        final Function1 function1 = new Function1() { // from class: o.fXP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fXM.AEQbTJ(this.KWHzl, z2, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fXU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fXM.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fXQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fXM.KWHzl(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtBuildOKWTransaction$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fXR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fXM.OLrzqt(function12, obj);
            }
        }));
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(fXM fxm, boolean z, kotlin.Pair pair) {
        java.lang.String str;
        OKWBaseTransaction oKWBaseTransaction = (OKWBaseTransaction) pair.getFirst();
        if (oKWBaseTransaction == null) {
            fxm.AEQbTJ.setValue(C56390yDp.OLrzqt(null, pair.getSecond()));
            if (z && (str = (java.lang.String) pair.getSecond()) != null) {
                C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
            }
        } else if (oKWBaseTransaction instanceof AbstractC8664bGw) {
            try {
                ((AbstractC8664bGw) oKWBaseTransaction).fHqPtx();
                fxm.AEQbTJ.setValue(C56390yDp.OLrzqt(oKWBaseTransaction, null));
            } catch (java.lang.Exception e) {
                C6777aVl.Companion.EZpvd(e);
                fxm.AEQbTJ.setValue(C56390yDp.OLrzqt(null, null));
                C10857bwP.copydefault("BaseTransactionActivity", e);
            }
        } else {
            fxm.AEQbTJ.setValue(C56390yDp.OLrzqt(oKWBaseTransaction, null));
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(fXM fxm, java.lang.Throwable th) {
        fxm.AEQbTJ.setValue(C56390yDp.OLrzqt(null, null));
        Intrinsics.copydefault(th);
        C10857bwP.copydefault("BaseTransactionActivity", th);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        this.EZpvd = false;
        this.AEQbTJ.setValue(C56390yDp.OLrzqt(t, null));
    }

    public final T AEQbTJ() {
        kotlin.Pair<T, java.lang.String> value = this.AEQbTJ.getValue();
        if (value != null) {
            return value.getFirst();
        }
        return null;
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        T first;
        T first2;
        super.onCleared();
        if (this.EZpvd) {
            kotlin.Pair<T, java.lang.String> value = this.AEQbTJ.getValue();
            if (value == null || (first2 = value.getFirst()) == null) {
                return;
            }
            first2.fFgQHt();
            return;
        }
        kotlin.Pair<T, java.lang.String> value2 = this.AEQbTJ.getValue();
        if (value2 == null || (first = value2.getFirst()) == null || !first.OJuSTm().getNeedReleaseTransfer() || !first.OJuSTm().isChangedCustomRpc()) {
            return;
        }
        first.fFgQHt();
    }
}
