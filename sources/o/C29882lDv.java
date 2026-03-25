package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lDv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C29882lDv extends lEG {
    public final InterfaceC56387yDm AEQbTJ;
    public Function1<? super CurrencyToken, Unit> OLrzqt;
    public AbstractC31449luI copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super CurrencyToken, Unit> function1) {
        this.OLrzqt = function1;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    public C29882lDv() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(lDB.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListBottomSheet$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListBottomSheet$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListBottomSheet$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.lEG.EZpvd()V */
    public final lDB EZpvd() {
        return (lDB) this.AEQbTJ.getValue();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = AbstractC31449luI.AEQbTJ(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        BuySellCryptoListFragment.Companion.ListType listType;
        BuySellCryptoListFragment buySellCryptoListFragmentEZpvd;
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (listType = (BuySellCryptoListFragment.Companion.ListType) arguments.getParcelable("list_type")) == null) {
            listType = BuySellCryptoListFragment.Companion.ListType.BUY;
        }
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string = arguments2 != null ? arguments2.getString("selected_token") : null;
        if (string == null) {
            string = "";
        }
        android.os.Bundle arguments3 = getArguments();
        java.lang.String string2 = arguments3 != null ? arguments3.getString("selected_currency") : null;
        if (string2 == null) {
            string2 = "";
        }
        android.os.Bundle arguments4 = getArguments();
        boolean z = arguments4 != null ? arguments4.getBoolean("has_verification_status") : false;
        BuySellCryptoListFragment.Companion.ListType listType2 = BuySellCryptoListFragment.Companion.ListType.BUY;
        if (listType == listType2) {
            buySellCryptoListFragmentEZpvd = BuySellCryptoListFragment.Companion.AEQbTJ(string, string2, true);
            buySellCryptoListFragmentEZpvd.EZpvd(this.OLrzqt);
        } else {
            buySellCryptoListFragmentEZpvd = BuySellCryptoListFragment.Companion.EZpvd(string, string2, z, true);
            buySellCryptoListFragmentEZpvd.EZpvd(this.OLrzqt);
        }
        getChildFragmentManager().beginTransaction().replace(C31351lsQ.Application.KDccX, buySellCryptoListFragmentEZpvd).commitAllowingStateLoss();
        wxq.setStyle(2);
        if (listType == listType2) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.Dmq);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.zblBkD);
        }
        wxq.setTitle(strAYXKKw);
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<Unit>> liveDataEZpvd = EZpvd().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataEZpvd, viewLifecycleOwner, new Function1() { // from class: o.lDA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29882lDv.OLrzqt(this.KWHzl, (Unit) obj);
            }
        });
    }

    public static final Unit OLrzqt(C29882lDv c29882lDv, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        c29882lDv.dismiss();
        return Unit.INSTANCE;
    }
}
