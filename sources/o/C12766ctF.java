package o;

import com.okinc.business.defi.biz.constant.WalletSyncOperation;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C10407bnq;
import o.C12827cuN;
import o.C13062cyk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ctF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12766ctF {
    public static final C12766ctF copydefault = new C12766ctF();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Integer EZpvd(java.lang.Integer num, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return num;
    }

    private C12766ctF() {
    }

    public final AbstractC58260yxt<java.lang.Boolean> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna().AEQbTJ(str, str2);
    }

    public final AbstractC58185ywX<java.lang.Integer> copydefault(@NotNull final java.lang.String str, @NotNull ChainAddress chainAddress, @NotNull ChainAddress chainAddress2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(chainAddress2, "");
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).valueOf().KWHzl(str, chainAddress, chainAddress2);
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtKWHzl2 = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl().KWHzl(str, chainAddress.getAddress(), chainAddress2.getAddress());
        final Function2 function2 = new Function2() { // from class: o.ctE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12766ctF.AEQbTJ((java.util.List) obj, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtKWHzl, abstractC58260yxtKWHzl2, new InterfaceC58223yxI() { // from class: o.ctC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C12766ctF.OLrzqt(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.ctI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12766ctF.copydefault(str, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.ctH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12766ctF.gEmmrt(function1, obj);
            }
        }).EZpvd();
        final Function1 function12 = new Function1() { // from class: o.ctK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12766ctF.KWHzl(str, (WalletEntity) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.ctO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12766ctF.AhwBna(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.ctP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12766ctF.KWHzl((java.lang.Integer) obj);
            }
        };
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.ctL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12766ctF.valueOf(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final Unit OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (Unit) function2.invoke(obj, obj2);
    }

    public static final Unit AEQbTJ(java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(java.lang.String str, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna().AkhnZx(str);
    }

    public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(final java.lang.String str, WalletEntity walletEntity) {
        Intrinsics.checkNotNullParameter(walletEntity, "");
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna().OLrzqt(str, WalletSyncOperation.UpdateDefaultAddress).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.ctN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12766ctF.KWHzl(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.ctM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12766ctF.djBIcL(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return C13062cyk.Application.getInstance$default(C13062cyk.Companion, null, 1, null).OLrzqt(true, true, "updateDefaultAddress", new C13062cyk.LoaderManager.Application(C56402yEa.EZpvd(str)));
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final java.lang.Integer AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.ctJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12766ctF.EZpvd(num, (java.util.List) obj);
            }
        };
        return abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ctG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12766ctF.AYXKKw(function1, obj);
            }
        });
    }
}
