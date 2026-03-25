package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.dapp.bean.DappSearchResultBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dxJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C15063dxJ extends AbstractC33073mpa {
    public C15059dxF OLrzqt = new C15059dxF();
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.dxR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15063dxJ.KWHzl();
        }
    });

    public static final MutableLiveData KWHzl() {
        return new MutableLiveData();
    }

    public final MutableLiveData<java.util.List<DappSearchResultBean>> OLrzqt() {
        return (MutableLiveData) this.copydefault.getValue();
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void EZpvd() {
        AbstractC58260yxt<java.util.List<DappSearchResultBean>> abstractC58260yxtGHZMYf = C14923duc.EZpvd.gHZMYf();
        final Function1 function1 = new Function1() { // from class: o.dxX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15063dxJ.copydefault(this.KWHzl, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<DappSearchResultBean>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dxM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15063dxJ.AkhnZx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dxO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15063dxJ.AEQbTJ(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtGHZMYf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dxN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15063dxJ.DbNXlk(function12, obj);
            }
        });
    }

    public static final Unit copydefault(C15063dxJ c15063dxJ, java.util.List list) {
        MutableLiveData<java.util.List<DappSearchResultBean>> mutableLiveDataOLrzqt = c15063dxJ.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Intrinsics.copydefault(list);
        arrayList.addAll(C56405yEd.hDKMBd(list));
        mutableLiveDataOLrzqt.postValue(arrayList);
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C15063dxJ c15063dxJ, java.lang.Throwable th) {
        c15063dxJ.OLrzqt().postValue(new java.util.ArrayList());
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C15063dxJ c15063dxJ, java.lang.Integer num) {
        c15063dxJ.EZpvd();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtEZpvd = ((xWH) C43248rlh.KWHzl.AEQbTJ(xWH.class)).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.dxU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15063dxJ.copydefault(this.copydefault, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dxT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15063dxJ.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dxS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15063dxJ.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dxY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15063dxJ.AYXKKw(function12, obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Integer num) {
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void OLrzqt(@NotNull DappSearchResultBean dappSearchResultBean) {
        Intrinsics.checkNotNullParameter(dappSearchResultBean, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = ((xWH) C43248rlh.KWHzl.AEQbTJ(xWH.class)).copydefault(dappSearchResultBean);
        final Function1 function1 = new Function1() { // from class: o.dxK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15063dxJ.copydefault((java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dxP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15063dxJ.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dxL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15063dxJ.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dxQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15063dxJ.gEmmrt(function12, obj);
            }
        });
    }
}
