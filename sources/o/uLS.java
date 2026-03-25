package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.kyc.api.biz.bean.KycInfoListBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC37981pHw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uLS {
    public static final uLS AEQbTJ = new uLS();
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.uLT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return uLS.EZpvd();
        }
    });
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.uLV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return uLS.copydefault();
        }
    });
    public static java.lang.String KWHzl = "";
    public static final int EZpvd = 8;

    private uLS() {
    }

    public final java.util.List<java.lang.String> AhwBna() {
        return (java.util.List) OLrzqt.getValue();
    }

    public static final java.util.List EZpvd() {
        return yDY.gEmmrt("CN", "TW", "MO", "HK");
    }

    public final java.util.List<java.lang.String> KWHzl() {
        return (java.util.List) copydefault.getValue();
    }

    public static final java.util.List copydefault() {
        return yDY.gEmmrt("CN", "TW", "HK");
    }

    public final void copydefault(@NotNull final LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final InterfaceC37981pHw interfaceC37981pHw = (InterfaceC37981pHw) C43251rlk.copydefault(InterfaceC37981pHw.class);
        interfaceC37981pHw.EZpvd(lifecycleOwner, new Function1() { // from class: o.uMb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uLS.EZpvd((KycInfoListBean) obj);
            }
        }, new Function1() { // from class: o.uLZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uLS.EZpvd(interfaceC37981pHw, lifecycleOwner, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(KycInfoListBean kycInfoListBean) {
        java.lang.String countryId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(kycInfoListBean, "");
        KycInfoListBean.PersonalBean personal = kycInfoListBean.getPersonal();
        if (personal != null && (countryId = personal.getCountryId()) != null) {
            java.lang.String upperCase = countryId.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (upperCase != null) {
                str = upperCase;
            }
        }
        KWHzl = str;
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InterfaceC37981pHw interfaceC37981pHw, LifecycleOwner lifecycleOwner, java.lang.String str) {
        InterfaceC37981pHw.Application.getKycInfo$default(interfaceC37981pHw, lifecycleOwner, new Function1() { // from class: o.uLW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uLS.OLrzqt((KycInfoListBean) obj);
            }
        }, null, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(KycInfoListBean kycInfoListBean) {
        java.lang.String countryId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(kycInfoListBean, "");
        KycInfoListBean.PersonalBean personal = kycInfoListBean.getPersonal();
        if (personal != null && (countryId = personal.getCountryId()) != null) {
            java.lang.String upperCase = countryId.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (upperCase != null) {
                str = upperCase;
            }
        }
        KWHzl = str;
        return Unit.INSTANCE;
    }

    public final boolean valueOf() {
        return AhwBna().contains(KWHzl);
    }

    public final boolean AYXKKw() {
        return KWHzl().contains(KWHzl);
    }
}
