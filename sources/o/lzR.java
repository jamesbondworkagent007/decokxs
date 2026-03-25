package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.buysell.ui.bsc.BaseBuySellConvertFragment$clickVerifyBtn$1;
import com.okinc.buysell.ui.bsc.BaseBuySellConvertFragment$setupTokenSelectionFlow$1;
import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterViewModel;
import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.buysell.util.PaymentFeatureFlag;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.uv.AccountFrozenStatus;
import com.okinc.okx.paymentapi.uv.UnifiedTradeType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class lzR<T extends ViewDataBinding> extends lzN<T> {
    public final ActivityResultLauncher<android.content.Context> djBIcL;
    public boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzN
    public boolean AhwBna() {
        return this.gEmmrt;
    }

    public abstract BSCMasterViewModel isConnected();

    @Override // o.lzN
    public boolean values() {
        return false;
    }

    /* JADX DEBUG: Type inference failed for r2v4. Raw type applied. Possible types: androidx.activity.result.contract.ActivityResultContract<android.content.Context, java.lang.Boolean>, androidx.activity.result.contract.ActivityResultContract<I, O> */
    /* JADX DEBUG: Type inference failed for r2v5. Raw type applied. Possible types: androidx.activity.result.ActivityResultLauncher<I>, java.lang.Object, androidx.activity.result.ActivityResultLauncher<android.content.Context> */
    public lzR(@androidx.annotation.LayoutRes int i) {
        super(i);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8106awV) C43251rlk.copydefault(InterfaceC8106awV.class)).OLrzqt(true), new ActivityResultCallback() { // from class: o.lzW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                lzR.copydefault(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.djBIcL = activityResultLauncherRegisterForActivityResult;
    }

    public static final void copydefault(lzR lzr, boolean z) {
        if (z) {
            lzr.isConnected().fetchVPNInfo();
        }
    }

    public final void fetchVPNInfo() {
        C31354lsT.trackButtonClick$default(C31354lsT.KWHzl, "Lite_Trade_FullButton_Click", "verify_to_trade", false, 4, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseBuySellConvertFragment$clickVerifyBtn$1(this, null), 3, null);
    }

    public final void AkhnZx() {
        C31354lsT.trackButtonClick$default(C31354lsT.KWHzl, "Lite_Trade_FullButton_Click", "login_to_trade", false, 4, null);
        this.djBIcL.launch(requireContext());
    }

    public final boolean fIwbmz() {
        return C30327lUg.AEQbTJ(ABTestFeatureFlag.BSC_TRADING_ACCOUNT);
    }

    public final void OLrzqt(@NotNull TradeType tradeType, boolean z, @NotNull final Function1<? super AccountFrozenStatus, Unit> function1) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        interfaceC47251tmX.OLrzqt(fragmentActivityRequireActivity, viewLifecycleOwner, UnifiedTradeType.Companion.OLrzqt(tradeType), z, new Function1() { // from class: o.lzY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lzR.KWHzl(function1, (AccountFrozenStatus) obj);
            }
        });
    }

    public static final Unit KWHzl(Function1 function1, AccountFrozenStatus accountFrozenStatus) {
        Intrinsics.checkNotNullParameter(accountFrozenStatus, "");
        function1.invoke(accountFrozenStatus);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull Function1<? super CurrencyToken, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        BuySellConvertParameters fieldNames = isConnected().getFieldNames();
        boolean z = (fieldNames != null ? fieldNames.AEQbTJ() : null) != null;
        if (C30327lUg.OLrzqt(PaymentFeatureFlag.SIMPLE_TRADE_L2_TOKEN_CARRYOVER) && isConnected().AEQbTJ(BSCLevel.LEVEL2) && !z) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseBuySellConvertFragment$setupTokenSelectionFlow$1(this, function1, null), 3, null);
        }
    }
}
