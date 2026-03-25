package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41629quS implements InterfaceC41636quZ {
    public androidx.fragment.app.Fragment AEQbTJ;
    public android.content.Context KWHzl;
    public C41778qxI OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt() {
        this.AEQbTJ = null;
        this.KWHzl = null;
        this.OLrzqt = null;
    }

    public void KWHzl(@NotNull final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AEQbTJ = fragment;
        this.KWHzl = fragment.getContext();
        final Function0 function0 = null;
        this.OLrzqt = (C41778qxI) FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(C41778qxI.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.ranking.features.main.ui.DefaultNavToDetail$attachNavContext$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = fragment.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.ranking.features.main.ui.DefaultNavToDetail$attachNavContext$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = fragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.ranking.features.main.ui.DefaultNavToDetail$attachNavContext$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }).getValue();
    }

    @Override // o.InterfaceC41636quZ
    public void AEQbTJ(@NotNull RankingHotCryptoVo rankingHotCryptoVo, int i) {
        InterfaceC41634quX interfaceC41634quXEZpvd;
        java.lang.String strAEQbTJ;
        C41778qxI c41778qxI;
        java.lang.String strEZpvd;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(rankingHotCryptoVo, "");
        navToKlinePage$default(this, new MarketCoinInfo(rankingHotCryptoVo.getInstId(), rankingHotCryptoVo.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null), null, null, 6, null);
        androidx.fragment.app.Fragment fragment = this.AEQbTJ;
        if (fragment == null || (interfaceC41634quXEZpvd = C41701qvl.EZpvd(fragment)) == null) {
            return;
        }
        C41778qxI c41778qxI2 = this.OLrzqt;
        if (c41778qxI2 == null || (strAEQbTJ = c41778qxI2.AEQbTJ()) == null) {
            strAEQbTJ = "";
        }
        C41778qxI c41778qxI3 = this.OLrzqt;
        if (Intrinsics.EZpvd((java.lang.Object) (c41778qxI3 != null ? c41778qxI3.AEQbTJ() : null), (java.lang.Object) OtpEventTracker.OTP_EVENT_VALUE_NEW) && (c41778qxI = this.OLrzqt) != null && (strEZpvd = c41778qxI.EZpvd()) != null) {
            str = strEZpvd;
        }
        interfaceC41634quXEZpvd.AEQbTJ(rankingHotCryptoVo, i, strAEQbTJ, str);
    }

    public static /* synthetic */ void navToKlinePage$default(C41629quS c41629quS, MarketCoinInfo marketCoinInfo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "page_search";
        }
        if ((i & 4) != 0) {
            str2 = c41629quS.AEQbTJ();
        }
        c41629quS.OLrzqt(marketCoinInfo, str, str2);
    }

    public final void OLrzqt(MarketCoinInfo marketCoinInfo, java.lang.String str, java.lang.String str2) {
        oKA oka;
        android.content.Context context = this.KWHzl;
        if (context == null || (oka = (oKA) C43251rlk.OLrzqt(oKA.class)) == null) {
            return;
        }
        oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, str, null, null, null, str2, null, null, 1772, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String AEQbTJ() {
        C41778qxI c41778qxI = this.OLrzqt;
        java.lang.String strAEQbTJ = c41778qxI != null ? c41778qxI.AEQbTJ() : null;
        if (strAEQbTJ != null) {
            switch (strAEQbTJ.hashCode()) {
                case -1096981482:
                    if (strAEQbTJ.equals("losers")) {
                        return "Rankings_Down";
                    }
                    break;
                case -933776874:
                    if (strAEQbTJ.equals("marketcap")) {
                        return "Rankings_Mcap";
                    }
                    break;
                case -199026297:
                    if (strAEQbTJ.equals("gainers")) {
                        return "Rankings_Rise";
                    }
                    break;
                case 103501:
                    if (strAEQbTJ.equals("hot")) {
                        return "Rankings_Hot";
                    }
                    break;
                case 108960:
                    if (strAEQbTJ.equals(OtpEventTracker.OTP_EVENT_VALUE_NEW)) {
                        return "Rankings_New";
                    }
                    break;
                case 135018193:
                    if (strAEQbTJ.equals("turnover")) {
                        return "Rankings_Turnover";
                    }
                    break;
            }
        }
        return "";
    }
}
