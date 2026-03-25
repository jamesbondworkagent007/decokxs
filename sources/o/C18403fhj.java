package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.net.bean.AccountStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18403fhj extends AbstractC33073mpa {
    public eSA EZpvd = new eSA();
    public final MutableLiveData<java.lang.Boolean> copydefault = new MutableLiveData<>();
    public int OLrzqt = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> OLrzqt() {
        return this.copydefault;
    }

    public final void OLrzqt(@NotNull java.lang.String str, int i, @NotNull final AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.OLrzqt = i;
        abstractActivityC33041mov.showLoadingAtOnce();
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.fhi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18403fhj.AEQbTJ(this.KWHzl, abstractActivityC33041mov, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.fhh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C18403fhj.djBIcL(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.fhk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18403fhj.AEQbTJ(abstractActivityC33041mov, this, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fhg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18403fhj.AhwBna(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.fhp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18403fhj.KWHzl((java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fhl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18403fhj.valueOf(function13, obj);
            }
        }));
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C18403fhj c18403fhj, AbstractActivityC33041mov abstractActivityC33041mov, final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.Integer>> abstractC58185ywXAEQbTJ = c18403fhj.EZpvd.AEQbTJ(abstractC12782ctV, abstractActivityC33041mov);
        final Function1 function1 = new Function1() { // from class: o.fhn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18403fhj.OLrzqt(abstractC12782ctV, (kotlin.Pair) obj);
            }
        };
        return abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fhm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C18403fhj.copydefault(function1, obj);
            }
        });
    }

    public static final kotlin.Pair copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(AbstractC12782ctV abstractC12782ctV, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return C56390yDp.OLrzqt(abstractC12782ctV, pair);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, C18403fhj c18403fhj, kotlin.Pair pair) {
        abstractActivityC33041mov.dismissLoading();
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        kotlin.Pair pair2 = (kotlin.Pair) second;
        if (((java.lang.Number) pair2.getFirst()).intValue() == 1 && ((java.lang.Number) pair2.getSecond()).intValue() == AccountStatus.Normal.getValue()) {
            c18403fhj.copydefault.setValue(java.lang.Boolean.TRUE);
        } else {
            eSA esa = c18403fhj.EZpvd;
            int iIntValue = ((java.lang.Number) pair2.getFirst()).intValue();
            int iIntValue2 = ((java.lang.Number) pair2.getSecond()).intValue();
            java.lang.Object first = pair.getFirst();
            Intrinsics.checkNotNullExpressionValue(first, "");
            eSA.judgyDialog$default(esa, iIntValue, iIntValue2, (AbstractC12782ctV) first, abstractActivityC33041mov, 0, null, 48, null);
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        th.printStackTrace();
        java.lang.String message = th.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}
