package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lDU extends mHT<CryptoListItem> {
    public final BuySellCryptoListFragment.Companion.ListType KWHzl;
    public final Function1<CurrencyToken, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lDU(@NotNull final BuySellCryptoListFragment.Companion.ListType listType, @NotNull BuySellCryptoListViewModel.TaskDescription taskDescription, @NotNull BuySellCryptoListViewModel.Activity activity, @NotNull Function1<? super CurrencyToken, Unit> function1) {
        super(new DiffUtil.ItemCallback<CryptoListItem>() { // from class: o.lDU.5

            /* JADX INFO: renamed from: o.lDU$5$Application */
            public final /* synthetic */ class Application {
                public static final /* synthetic */ int[] EZpvd;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[BuySellCryptoListFragment.Companion.ListType.values().length];
                    try {
                        iArr[BuySellCryptoListFragment.Companion.ListType.BUY.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BuySellCryptoListFragment.Companion.ListType.SELL.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    EZpvd = iArr;
                }
            }

            /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(CryptoListItem cryptoListItem, CryptoListItem cryptoListItem2) {
                Intrinsics.checkNotNullParameter(cryptoListItem, "");
                Intrinsics.checkNotNullParameter(cryptoListItem2, "");
                return Intrinsics.EZpvd((java.lang.Object) cryptoListItem.getCryptoId(), (java.lang.Object) cryptoListItem2.getCryptoId());
            }

            /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(CryptoListItem cryptoListItem, CryptoListItem cryptoListItem2) {
                Intrinsics.checkNotNullParameter(cryptoListItem, "");
                Intrinsics.checkNotNullParameter(cryptoListItem2, "");
                int i = Application.EZpvd[listType.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if ((cryptoListItem instanceof CryptoListItem.ActionBar) && (cryptoListItem2 instanceof CryptoListItem.ActionBar)) {
                        CryptoListItem.ActionBar actionBar = (CryptoListItem.ActionBar) cryptoListItem;
                        CryptoListItem.ActionBar actionBar2 = (CryptoListItem.ActionBar) cryptoListItem2;
                        if (Intrinsics.EZpvd((java.lang.Object) actionBar.KWHzl(), (java.lang.Object) actionBar2.KWHzl()) && Intrinsics.EZpvd((java.lang.Object) actionBar.AEQbTJ(), (java.lang.Object) actionBar2.AEQbTJ())) {
                            return true;
                        }
                    } else {
                        if (!(cryptoListItem instanceof CryptoListItem.Application) || !(cryptoListItem2 instanceof CryptoListItem.Application)) {
                            return true;
                        }
                        CryptoListItem.Application application = (CryptoListItem.Application) cryptoListItem;
                        CryptoListItem.Application application2 = (CryptoListItem.Application) cryptoListItem2;
                        if (Intrinsics.EZpvd((java.lang.Object) application.copydefault(), (java.lang.Object) application2.copydefault()) && Intrinsics.EZpvd((java.lang.Object) application.KWHzl(), (java.lang.Object) application2.KWHzl())) {
                            return true;
                        }
                    }
                } else if ((cryptoListItem instanceof CryptoListItem.BuyCryptoListItem) && (cryptoListItem2 instanceof CryptoListItem.BuyCryptoListItem)) {
                    CryptoListItem.BuyCryptoListItem buyCryptoListItem = (CryptoListItem.BuyCryptoListItem) cryptoListItem;
                    CryptoListItem.BuyCryptoListItem buyCryptoListItem2 = (CryptoListItem.BuyCryptoListItem) cryptoListItem2;
                    if (Intrinsics.EZpvd((java.lang.Object) buyCryptoListItem.gEmmrt(), (java.lang.Object) buyCryptoListItem2.gEmmrt()) && Intrinsics.EZpvd((java.lang.Object) buyCryptoListItem.OLrzqt(), (java.lang.Object) buyCryptoListItem2.OLrzqt()) && buyCryptoListItem.AhwBna() == buyCryptoListItem2.AhwBna()) {
                        return true;
                    }
                } else {
                    if (!(cryptoListItem instanceof CryptoListItem.BuyDexListItem) || !(cryptoListItem2 instanceof CryptoListItem.BuyDexListItem)) {
                        return true;
                    }
                    CryptoListItem.BuyDexListItem buyDexListItem = (CryptoListItem.BuyDexListItem) cryptoListItem;
                    CryptoListItem.BuyDexListItem buyDexListItem2 = (CryptoListItem.BuyDexListItem) cryptoListItem2;
                    if (Intrinsics.EZpvd((java.lang.Object) buyDexListItem.EZpvd(), (java.lang.Object) buyDexListItem2.EZpvd()) && Intrinsics.EZpvd((java.lang.Object) buyDexListItem.KWHzl(), (java.lang.Object) buyDexListItem2.KWHzl())) {
                        return true;
                    }
                }
                return false;
            }

            /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public java.lang.Object getChangePayload(CryptoListItem cryptoListItem, CryptoListItem cryptoListItem2) {
                Intrinsics.checkNotNullParameter(cryptoListItem, "");
                Intrinsics.checkNotNullParameter(cryptoListItem2, "");
                android.os.Bundle bundle = new android.os.Bundle();
                int i = Application.EZpvd[listType.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if ((cryptoListItem instanceof CryptoListItem.ActionBar) && (cryptoListItem2 instanceof CryptoListItem.ActionBar)) {
                        CryptoListItem.ActionBar actionBar = (CryptoListItem.ActionBar) cryptoListItem;
                        CryptoListItem.ActionBar actionBar2 = (CryptoListItem.ActionBar) cryptoListItem2;
                        if (!Intrinsics.EZpvd((java.lang.Object) actionBar.KWHzl(), (java.lang.Object) actionBar2.KWHzl())) {
                            bundle.putString("total_diff", actionBar2.KWHzl());
                        }
                        if (!Intrinsics.EZpvd((java.lang.Object) actionBar.AEQbTJ(), (java.lang.Object) actionBar2.AEQbTJ())) {
                            bundle.putString("total_crypto_diff", actionBar2.AEQbTJ());
                        }
                    } else if ((cryptoListItem instanceof CryptoListItem.Application) && (cryptoListItem2 instanceof CryptoListItem.Application)) {
                        CryptoListItem.Application application = (CryptoListItem.Application) cryptoListItem;
                        CryptoListItem.Application application2 = (CryptoListItem.Application) cryptoListItem2;
                        if (!Intrinsics.EZpvd((java.lang.Object) application.copydefault(), (java.lang.Object) application2.copydefault())) {
                            bundle.putString("total_diff", application2.copydefault());
                        }
                        if (!Intrinsics.EZpvd((java.lang.Object) application.KWHzl(), (java.lang.Object) application2.KWHzl())) {
                            bundle.putString("total_crypto_diff", application2.KWHzl());
                        }
                    }
                } else if ((cryptoListItem instanceof CryptoListItem.BuyCryptoListItem) && (cryptoListItem2 instanceof CryptoListItem.BuyCryptoListItem)) {
                    CryptoListItem.BuyCryptoListItem buyCryptoListItem = (CryptoListItem.BuyCryptoListItem) cryptoListItem;
                    CryptoListItem.BuyCryptoListItem buyCryptoListItem2 = (CryptoListItem.BuyCryptoListItem) cryptoListItem2;
                    if (!Intrinsics.EZpvd((java.lang.Object) buyCryptoListItem.gEmmrt(), (java.lang.Object) buyCryptoListItem2.gEmmrt())) {
                        bundle.putString("price_diff", buyCryptoListItem2.gEmmrt());
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) buyCryptoListItem.OLrzqt(), (java.lang.Object) buyCryptoListItem2.OLrzqt())) {
                        bundle.putString("percentage_diff", buyCryptoListItem2.OLrzqt());
                    }
                    if (buyCryptoListItem.copydefault() != buyCryptoListItem2.copydefault()) {
                        bundle.putString("percentage_change_diff", buyCryptoListItem2.copydefault().name());
                    }
                    if (buyCryptoListItem.AhwBna() != buyCryptoListItem2.AhwBna()) {
                        bundle.putBoolean("is_stablecoin_diff", buyCryptoListItem2.AhwBna());
                    }
                } else if ((cryptoListItem instanceof CryptoListItem.BuyDexListItem) && (cryptoListItem2 instanceof CryptoListItem.BuyDexListItem)) {
                    CryptoListItem.BuyDexListItem buyDexListItem = (CryptoListItem.BuyDexListItem) cryptoListItem;
                    CryptoListItem.BuyDexListItem buyDexListItem2 = (CryptoListItem.BuyDexListItem) cryptoListItem2;
                    if (!Intrinsics.EZpvd((java.lang.Object) buyDexListItem.EZpvd(), (java.lang.Object) buyDexListItem2.EZpvd())) {
                        bundle.putString("price_diff", buyDexListItem2.EZpvd());
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) buyDexListItem.KWHzl(), (java.lang.Object) buyDexListItem2.KWHzl())) {
                        bundle.putString("percentage_diff", buyDexListItem2.KWHzl());
                    }
                    if (buyDexListItem.OLrzqt() != buyDexListItem2.OLrzqt()) {
                        bundle.putString("percentage_change_diff", buyDexListItem2.OLrzqt().name());
                    }
                }
                return bundle.isEmpty() ? super.getChangePayload(cryptoListItem, cryptoListItem2) : bundle;
            }
        });
        Intrinsics.checkNotNullParameter(listType, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = listType;
        this.copydefault = function1;
        boolean z = !((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).OLrzqt(OKComplianceRestrictionService.Feature.NEW_ONSHORE_IA);
        register(CryptoListItem.BuyCryptoListItem.class, new lUR(z, new Function1() { // from class: o.lDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lDU.AEQbTJ(this.KWHzl, (CryptoListItem.BuyCryptoListItem) obj);
            }
        }, taskDescription.KWHzl()));
        register(CryptoListItem.BuyDexListItem.class, new lUP(new Function1() { // from class: o.lDV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lDU.KWHzl(this.copydefault, (CryptoListItem.BuyDexListItem) obj);
            }
        }, taskDescription.KWHzl(), taskDescription.AEQbTJ(), taskDescription.EZpvd()));
        register(CryptoListItem.ActionBar.class, new C30356lVi(z, new Function1() { // from class: o.lEa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lDU.copydefault(this.KWHzl, (CryptoListItem.ActionBar) obj);
            }
        }, activity.EZpvd()));
        register(CryptoListItem.Application.class, new C30357lVj(new Function1() { // from class: o.lDZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lDU.KWHzl(this.copydefault, (CryptoListItem.Application) obj);
            }
        }, activity.EZpvd()));
        register(CryptoListItem.StateListAnimator.class, new C30354lVg());
    }

    public static final Unit AEQbTJ(lDU ldu, CryptoListItem.BuyCryptoListItem buyCryptoListItem) {
        Intrinsics.checkNotNullParameter(buyCryptoListItem, "");
        ldu.copydefault.invoke(buyCryptoListItem.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(lDU ldu, CryptoListItem.BuyDexListItem buyDexListItem) {
        Intrinsics.checkNotNullParameter(buyDexListItem, "");
        ldu.copydefault.invoke(buyDexListItem.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(lDU ldu, CryptoListItem.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        ldu.copydefault.invoke(actionBar.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(lDU ldu, CryptoListItem.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        ldu.copydefault.invoke(application.OLrzqt());
        return Unit.INSTANCE;
    }
}
