package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.transfer.receive.exchange.ShowExchangeEntryViewModel$isShowExchangeEntry$1;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gtd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21113gtd extends AbstractC33073mpa {
    public ExchangeAddressData copydefault;
    public final C13934dbu OLrzqt = new C13934dbu();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.gtf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C21113gtd.OLrzqt();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(ExchangeAddressData exchangeAddressData) {
        this.copydefault = exchangeAddressData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeAddressData copydefault() {
        return this.copydefault;
    }

    public final InterfaceC8224ayh EZpvd() {
        return (InterfaceC8224ayh) this.KWHzl.getValue();
    }

    public static final InterfaceC8224ayh OLrzqt() {
        return (InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class);
    }

    public final void AEQbTJ(boolean z, @NotNull LifecycleOwner lifecycleOwner, java.lang.Integer num, @NotNull C10854bwM c10854bwM, boolean z2, boolean z3, boolean z4, Function1<? super ExchangeAddressData, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        dZP dzp = dZP.OLrzqt;
        if (dzp.valueOf() && !dzp.gEmmrt() && z && !z3 && C21027grx.copydefault.AEQbTJ()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ShowExchangeEntryViewModel$isShowExchangeEntry$1(this, num, z2, c10854bwM, z4, function1, null), 3, null);
        } else if (function1 != null) {
            function1.invoke(null);
        }
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl() {
        AbstractC58185ywX<ResponseData<java.lang.Boolean>> abstractC58185ywXOLrzqt = this.OLrzqt.OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.gte
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21113gtd.AEQbTJ((ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<java.lang.Boolean>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gth
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21113gtd.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gtm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21113gtd.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gtl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21113gtd.OLrzqt(function12, obj);
            }
        });
    }

    public static final Unit AEQbTJ(ResponseData responseData) {
        boolean z = false;
        if (responseData.getCode() == 0) {
            OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
            boolean z2 = (oKComplianceRestrictionService == null || oKComplianceRestrictionService.AEQbTJ(OKComplianceRestrictionService.Feature.EASY_CONNECT)) ? false : true;
            C21027grx c21027grx = C21027grx.copydefault;
            if (Intrinsics.EZpvd(responseData.getData(), java.lang.Boolean.TRUE) && z2) {
                z = true;
            }
            c21027grx.KWHzl(z);
        } else {
            C21027grx.copydefault.KWHzl(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }
}
