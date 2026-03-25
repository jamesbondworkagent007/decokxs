package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC29579kwM;
import o.gKO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kwL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29578kwL implements InterfaceC29581kwO {
    public final androidx.fragment.app.Fragment KWHzl;

    public C29578kwL(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.KWHzl = fragment;
    }

    @Override // o.InterfaceC29581kwO
    public void AEQbTJ(@NotNull InterfaceC29579kwM interfaceC29579kwM) {
        Intrinsics.checkNotNullParameter(interfaceC29579kwM, "");
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.LoaderManager) {
            KWHzl(((InterfaceC29579kwM.LoaderManager) interfaceC29579kwM).KWHzl());
            return;
        }
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.Activity) {
            FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            InterfaceC29579kwM.Activity activity = (InterfaceC29579kwM.Activity) interfaceC29579kwM;
            EZpvd(fragmentActivityRequireActivity, activity.AEQbTJ(), activity.copydefault());
            return;
        }
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.Application) {
            FragmentActivity activity2 = this.KWHzl.getActivity();
            if (activity2 != null) {
                InterfaceC29579kwM.Application application = (InterfaceC29579kwM.Application) interfaceC29579kwM;
                SignalUiModel signalUiModelKWHzl = application.KWHzl();
                if (signalUiModelKWHzl != null) {
                    C29408ktA.KWHzl.AEQbTJ(signalUiModelKWHzl.ejfBZ(), signalUiModelKWHzl.fIwbmz(), signalUiModelKWHzl.djBIcL(), C33129mqd.gEmmrt(java.lang.Integer.valueOf(application.OLrzqt() + 1)), signalUiModelKWHzl.EZpvd());
                }
                EZpvd(activity2, application.AEQbTJ(), application.EZpvd());
                return;
            }
            return;
        }
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.Fragment) {
            if (!C22416heu.iwGUEr()) {
                if (this.KWHzl.getActivity() != null) {
                    InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                    FragmentActivity fragmentActivityRequireActivity2 = this.KWHzl.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                    InterfaceC29579kwM.Fragment fragment = (InterfaceC29579kwM.Fragment) interfaceC29579kwM;
                    interfaceC43294rma.KWHzl(fragmentActivityRequireActivity2, gKZ.EZpvd.AEQbTJ("dex/swap"), C56424yEw.gEmmrt(C56390yDp.OLrzqt("toChainId", fragment.KWHzl().EZpvd()), C56390yDp.OLrzqt("toTokenContractAddress", fragment.KWHzl().isConnected()), C56390yDp.OLrzqt("isToNative", ""), C56390yDp.OLrzqt("isOldTradingDialog", java.lang.Boolean.TRUE), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "0"), C56390yDp.OLrzqt("tradeMode", java.lang.Integer.valueOf(TradeMode.SwapMode.getType())), C56390yDp.OLrzqt("sourceType", "default_trade"), C56390yDp.OLrzqt("sourcePageName", "signal")), new Function1() { // from class: o.kwK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C29578kwL.copydefault((AbstractC43238rlX) obj);
                        }
                    });
                    return;
                }
                return;
            }
            InterfaceC29579kwM.Fragment fragment2 = (InterfaceC29579kwM.Fragment) interfaceC29579kwM;
            SignalUiModel signalUiModelKWHzl2 = fragment2.KWHzl();
            MemeQuickPopUpSource memeQuickPopUpSourceAEQbTJ = fragment2.AEQbTJ();
            TokenBase tokenBase = new TokenBase(signalUiModelKWHzl2.EZpvd(), signalUiModelKWHzl2.isConnected(), signalUiModelKWHzl2.AuCTel(), signalUiModelKWHzl2.copydefault(), null, signalUiModelKWHzl2.fIwbmz(), signalUiModelKWHzl2.fJNWhG(), 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -112, null);
            gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
            androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            gKO.StateListAnimator.openMemeQuickTransaction$default(gko, childFragmentManager, "default_trade", tokenBase, TransactionType.Buy.getType(), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            MemeQuickPopUpSource.Companion.copydefault(memeQuickPopUpSourceAEQbTJ);
            if (memeQuickPopUpSourceAEQbTJ == MemeQuickPopUpSource.MarketSignalActivity) {
                C29408ktA.KWHzl.OLrzqt(signalUiModelKWHzl2.fIwbmz(), "signal");
            }
        }
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void KWHzl(SignalUiModel signalUiModel) {
        C29623kxD.Companion.AEQbTJ(signalUiModel, this).show(this.KWHzl.getParentFragmentManager(), "javaClass");
    }

    public final void EZpvd(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        if ((activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null) != null) {
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.KWHzl.getParentFragmentManager().findFragmentByTag("javaClass");
            if (fragmentFindFragmentByTag instanceof C29623kxD) {
                ((C29623kxD) fragmentFindFragmentByTag).dismissAllowingStateLoss();
            }
            C27723kAz.OLrzqt(this.KWHzl, str, new java.util.ArrayList(), str2);
        }
    }

    public final void EZpvd(android.app.Activity activity, TokenBase tokenBase, java.lang.String str) {
        C25352ivB.openMarketDetailPage$default(activity, "default_trade", tokenBase, str, null, new int[0], 8, null);
    }
}
