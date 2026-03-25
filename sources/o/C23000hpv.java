package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.wallet.api.WalletDexService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hpv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23000hpv extends AbstractC22977hpY {
    public final MutableLiveData<java.lang.Boolean> AEQbTJ;
    public final java.util.List<WalletDexService.SupportedMevNodeBean> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<WalletDexService.SupportedMevNodeBean> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23000hpv(@NotNull java.lang.String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = new MutableLiveData<>();
        this.OLrzqt = new java.util.ArrayList();
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull final Function1<? super java.util.List<WalletDexService.SupportedMevNodeBean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX<java.util.ArrayList<WalletDexService.SupportedMevNodeBean>> abstractC58185ywXEZpvd = C22380heK.OLrzqt.copydefault(str).fARcdN().EZpvd();
        final Function1 function12 = new Function1() { // from class: o.hps
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23000hpv.EZpvd(this.AEQbTJ, function1, str2, (java.util.ArrayList) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.ArrayList<WalletDexService.SupportedMevNodeBean>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hpA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23000hpv.OLrzqt(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hpy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23000hpv.EZpvd(function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hpx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23000hpv.AEQbTJ(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, djBIcL());
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C23000hpv c23000hpv, Function1 function1, java.lang.String str, java.util.ArrayList arrayList) {
        c23000hpv.OLrzqt.clear();
        java.util.List<WalletDexService.SupportedMevNodeBean> list = c23000hpv.OLrzqt;
        Intrinsics.copydefault(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            java.util.List<java.lang.Integer> chainIds = ((WalletDexService.SupportedMevNodeBean) obj).getChainIds();
            if (chainIds != null && chainIds.contains(java.lang.Integer.valueOf(C33129mqd.AhwBna(str)))) {
                arrayList2.add(obj);
            }
        }
        list.addAll(arrayList2);
        if (!c23000hpv.OLrzqt.isEmpty()) {
            function1.invoke(c23000hpv.OLrzqt);
        } else {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, java.lang.Throwable th) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC22977hpY
    public AbstractC22974hpV copydefault() {
        return new C23097hrm(fetchVPNInfo(), this);
    }
}
