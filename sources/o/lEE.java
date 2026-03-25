package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet;
import com.okinc.buysell.view.cryptolist.ConvertListItem;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lEE extends mHT<CryptoListItem> {
    public final Function1<CurrencyToken, Unit> AEQbTJ;
    public final CryptoListBottomSheet.ListType copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lEE(@NotNull final CryptoListBottomSheet.ListType listType, @NotNull java.lang.String str, @NotNull Function1<? super CurrencyToken, Unit> function1) {
        super(new DiffUtil.ItemCallback<CryptoListItem>() { // from class: o.lEE.5

            /* JADX INFO: renamed from: o.lEE$5$ActionBar */
            public final /* synthetic */ class ActionBar {
                public static final /* synthetic */ int[] AEQbTJ;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[CryptoListBottomSheet.ListType.values().length];
                    try {
                        iArr[CryptoListBottomSheet.ListType.BUY.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CryptoListBottomSheet.ListType.CONVERT_TO.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    AEQbTJ = iArr;
                }
            }

            /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(CryptoListItem cryptoListItem, CryptoListItem cryptoListItem2) {
                Intrinsics.checkNotNullParameter(cryptoListItem, "");
                Intrinsics.checkNotNullParameter(cryptoListItem2, "");
                return Intrinsics.EZpvd((java.lang.Object) cryptoListItem.getCryptoId(), (java.lang.Object) cryptoListItem2.getCryptoId());
            }

            /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(CryptoListItem cryptoListItem, CryptoListItem cryptoListItem2) {
                Intrinsics.checkNotNullParameter(cryptoListItem, "");
                Intrinsics.checkNotNullParameter(cryptoListItem2, "");
                int i = ActionBar.AEQbTJ[listType.ordinal()];
                if (i == 1) {
                    if (!(cryptoListItem instanceof CryptoListItem.BuyCryptoListItem) || !(cryptoListItem2 instanceof CryptoListItem.BuyCryptoListItem)) {
                        return true;
                    }
                    CryptoListItem.BuyCryptoListItem buyCryptoListItem = (CryptoListItem.BuyCryptoListItem) cryptoListItem;
                    CryptoListItem.BuyCryptoListItem buyCryptoListItem2 = (CryptoListItem.BuyCryptoListItem) cryptoListItem2;
                    if (Intrinsics.EZpvd((java.lang.Object) buyCryptoListItem.gEmmrt(), (java.lang.Object) buyCryptoListItem2.gEmmrt()) && Intrinsics.EZpvd((java.lang.Object) buyCryptoListItem.OLrzqt(), (java.lang.Object) buyCryptoListItem2.OLrzqt()) && buyCryptoListItem.AhwBna() == buyCryptoListItem2.AhwBna()) {
                        return true;
                    }
                } else {
                    if (i != 2 || !(cryptoListItem instanceof ConvertListItem.ConvertToCryptoListItem) || !(cryptoListItem2 instanceof ConvertListItem.ConvertToCryptoListItem)) {
                        return true;
                    }
                    ConvertListItem.ConvertToCryptoListItem convertToCryptoListItem = (ConvertListItem.ConvertToCryptoListItem) cryptoListItem;
                    ConvertListItem.ConvertToCryptoListItem convertToCryptoListItem2 = (ConvertListItem.ConvertToCryptoListItem) cryptoListItem2;
                    if (Intrinsics.EZpvd((java.lang.Object) convertToCryptoListItem.EZpvd(), (java.lang.Object) convertToCryptoListItem2.EZpvd()) && Intrinsics.EZpvd((java.lang.Object) convertToCryptoListItem.KWHzl(), (java.lang.Object) convertToCryptoListItem2.KWHzl()) && convertToCryptoListItem.valueOf() == convertToCryptoListItem2.valueOf()) {
                        return true;
                    }
                }
                return false;
            }

            /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public java.lang.Object getChangePayload(CryptoListItem cryptoListItem, CryptoListItem cryptoListItem2) {
                Intrinsics.checkNotNullParameter(cryptoListItem, "");
                Intrinsics.checkNotNullParameter(cryptoListItem2, "");
                android.os.Bundle bundle = new android.os.Bundle();
                int i = ActionBar.AEQbTJ[listType.ordinal()];
                if (i == 1) {
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
                } else if (i == 2) {
                    ConvertListItem.ConvertToCryptoListItem convertToCryptoListItem = (ConvertListItem.ConvertToCryptoListItem) cryptoListItem;
                    ConvertListItem.ConvertToCryptoListItem convertToCryptoListItem2 = (ConvertListItem.ConvertToCryptoListItem) cryptoListItem2;
                    if (!Intrinsics.EZpvd((java.lang.Object) convertToCryptoListItem.EZpvd(), (java.lang.Object) convertToCryptoListItem2.EZpvd())) {
                        bundle.putString("price_diff", convertToCryptoListItem2.EZpvd());
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) convertToCryptoListItem.KWHzl(), (java.lang.Object) convertToCryptoListItem2.KWHzl())) {
                        bundle.putString("percentage_diff", convertToCryptoListItem2.KWHzl());
                    }
                    if (convertToCryptoListItem.copydefault() != convertToCryptoListItem2.copydefault()) {
                        bundle.putString("percentage_change_diff", convertToCryptoListItem2.copydefault().name());
                    }
                }
                return bundle.isEmpty() ? super.getChangePayload(cryptoListItem, cryptoListItem2) : bundle;
            }
        });
        Intrinsics.checkNotNullParameter(listType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = listType;
        this.AEQbTJ = function1;
        boolean z = !((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).OLrzqt(OKComplianceRestrictionService.Feature.NEW_ONSHORE_IA);
        register(CryptoListItem.BuyCryptoListItem.class, new lUR(z, new Function1() { // from class: o.lED
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEE.AEQbTJ(this.OLrzqt, (CryptoListItem.BuyCryptoListItem) obj);
            }
        }, str));
        register(CryptoListItem.ActionBar.class, new C30356lVi(z, new Function1() { // from class: o.lEC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEE.EZpvd(this.copydefault, (CryptoListItem.ActionBar) obj);
            }
        }, str));
        register(CryptoListItem.Activity.class, new C30351lVd());
        register(ConvertListItem.ConvertToCryptoListItem.class, new C30349lVb(z, new Function1() { // from class: o.lEA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEE.OLrzqt(this.AEQbTJ, (ConvertListItem.ConvertToCryptoListItem) obj);
            }
        }, str));
        register(ConvertListItem.Application.class, new lUS(z, new Function1() { // from class: o.lEB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEE.EZpvd(this.EZpvd, (ConvertListItem.Application) obj);
            }
        }, str));
        register(ConvertListItem.TaskDescription.class, new lUX(z, new Function1() { // from class: o.lEF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEE.OLrzqt(this.AEQbTJ, (ConvertListItem.TaskDescription) obj);
            }
        }, str));
        register(ConvertListItem.ActionBar.class, new lUV(z, new Function1() { // from class: o.lEH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEE.copydefault(this.copydefault, (ConvertListItem.ActionBar) obj);
            }
        }, str));
    }

    public static final Unit AEQbTJ(lEE lee, CryptoListItem.BuyCryptoListItem buyCryptoListItem) {
        Intrinsics.checkNotNullParameter(buyCryptoListItem, "");
        lee.AEQbTJ.invoke(buyCryptoListItem.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(lEE lee, CryptoListItem.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        lee.AEQbTJ.invoke(actionBar.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(lEE lee, ConvertListItem.ConvertToCryptoListItem convertToCryptoListItem) {
        Intrinsics.checkNotNullParameter(convertToCryptoListItem, "");
        lee.AEQbTJ.invoke(convertToCryptoListItem.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(lEE lee, ConvertListItem.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        lee.AEQbTJ.invoke(application.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(lEE lee, ConvertListItem.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        lee.AEQbTJ.invoke(taskDescription.KWHzl());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(lEE lee, ConvertListItem.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        lee.AEQbTJ.invoke(actionBar.copydefault());
        return Unit.INSTANCE;
    }
}
