package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.account.api.model.mpcwallet.LoginType;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.AccountMpcResponse;
import com.okinc.business.defi.biz.net.bean.AccountStatus;
import com.okinc.business.defi.biz.net.bean.CheckMpcStatusResponse;
import com.okinc.business.defi.wallet.home.MpcAccountStatusUtils$changeAccount$1;
import com.okinc.okuser.data.User;
import io.reactivex.BackpressureStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eRs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15691eRs {
    public static final C15691eRs AEQbTJ = new C15691eRs();
    public static final eSA copydefault = new eSA();
    public static final java.util.HashMap<java.lang.String, CheckMpcStatusResponse> KWHzl = new java.util.HashMap<>();
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, CheckMpcStatusResponse> KWHzl() {
        return KWHzl;
    }

    private C15691eRs() {
    }

    public final AbstractC58185ywX<java.lang.Boolean> copydefault(@NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final FragmentActivity fragmentActivity, @NotNull final LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
            AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(copydefault.AEQbTJ(abstractC12782ctV, fragmentActivity), lifecycleOwner, Lifecycle.Event.ON_DESTROY);
            final Function1 function1 = new Function1() { // from class: o.eRB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15691eRs.OLrzqt(abstractC12782ctV, fragmentActivity, lifecycleOwner, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.eRC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C15691eRs.KWHzl(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(final AbstractC12782ctV abstractC12782ctV, final FragmentActivity fragmentActivity, LifecycleOwner lifecycleOwner, kotlin.Pair pair) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(pair, "");
        eSA.judgyDialog$default(copydefault, ((java.lang.Number) pair.getFirst()).intValue(), ((java.lang.Number) pair.getSecond()).intValue(), abstractC12782ctV, fragmentActivity, 0, null, 48, null);
        if (((java.lang.Number) pair.getFirst()).intValue() == 1 && ((java.lang.Number) pair.getSecond()).intValue() == AccountStatus.Normal.getValue()) {
            if (abstractC12782ctV.zLjUOn()) {
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
                java.lang.String uid = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getUid() : null;
                dZP dzp = dZP.OLrzqt;
                if (Intrinsics.EZpvd((java.lang.Object) uid, (java.lang.Object) dzp.EZpvd())) {
                    return AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
                }
                java.util.Iterator<T> it = dzp.copydefault().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    User user = (User) next;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
                    if (Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getUid() : null), (java.lang.Object) user.getUid())) {
                        break;
                    }
                }
                final User user2 = (User) next;
                java.util.List<User> listCopydefault = dZP.OLrzqt.copydefault();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listCopydefault) {
                    User user3 = (User) obj;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
                    if (Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoQSBOWP3 != null ? mpcWalletEncodeInfoQSBOWP3.getUid() : null), (java.lang.Object) user3.getUid())) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                if (user2 != null && dZP.OLrzqt.copydefault().size() - size > 0) {
                    return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.eRu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58187ywZ
                        public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                            C15691eRs.copydefault(fragmentActivity, user2, abstractC12782ctV, interfaceC58184ywW);
                        }
                    }, BackpressureStrategy.BUFFER);
                }
                if (abstractC12782ctV.QSBOWP() != null) {
                    eRI eri = eRI.OLrzqt;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP4 = abstractC12782ctV.QSBOWP();
                    Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP4);
                    eri.AEQbTJ(fragmentActivity, lifecycleOwner, abstractC12782ctV, mpcWalletEncodeInfoQSBOWP4.getUid(), new yHO() { // from class: o.eRx
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.yHO
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                            return C15691eRs.KWHzl(((java.lang.Integer) obj2).intValue(), (android.view.View) obj3, (ViewOnClickListenerC54939xaY) obj4);
                        }
                    });
                }
                return AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
            }
            eRI.OLrzqt.EZpvd(fragmentActivity, new Function2() { // from class: o.eRz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C15691eRs.OLrzqt((android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
                }
            });
            return AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
        }
        return AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
    }

    public static final void copydefault(FragmentActivity fragmentActivity, User user, AbstractC12782ctV abstractC12782ctV, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        eRI.OLrzqt.AEQbTJ(fragmentActivity, user, abstractC12782ctV, new yHT() { // from class: o.eRG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHT
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return C15691eRs.copydefault(interfaceC58184ywW, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3, ((java.lang.Boolean) obj4).booleanValue());
            }
        });
    }

    public static final Unit copydefault(InterfaceC58184ywW interfaceC58184ywW, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        if (z) {
            interfaceC58184ywW.onNext(java.lang.Boolean.FALSE);
        } else {
            interfaceC58184ywW.onNext(java.lang.Boolean.TRUE);
        }
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<java.lang.Boolean> EZpvd(@NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final android.content.Context context) {
        java.lang.Object next;
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl;
        java.lang.String uid;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(context, "");
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        java.lang.String uid2 = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getUid() : null;
        dZP dzp = dZP.OLrzqt;
        if (Intrinsics.EZpvd((java.lang.Object) uid2, (java.lang.Object) dzp.EZpvd())) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
            return abstractC58185ywXKWHzl2;
        }
        java.util.Iterator<T> it = dzp.copydefault().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.lang.String uid3 = ((User) next).getUid();
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
            if (Intrinsics.EZpvd((java.lang.Object) uid3, (java.lang.Object) (mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getUid() : null))) {
                break;
            }
        }
        final User user = (User) next;
        if (user == null) {
            C13934dbu c13934dbuCopydefault = eRI.OLrzqt.copydefault();
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
            if (mpcWalletEncodeInfoQSBOWP3 != null && (uid = mpcWalletEncodeInfoQSBOWP3.getUid()) != null) {
                str = uid;
            }
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(c13934dbuCopydefault.AEQbTJ(abstractC12782ctV, str), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function1 = new Function1() { // from class: o.eRE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15691eRs.copydefault(context, abstractC12782ctV, (AccountMpcResponse) obj);
                }
            };
            abstractC58185ywXKWHzl = abstractC58185ywXUnwrapResponseData$default.KWHzl(new InterfaceC58229yxO() { // from class: o.eRD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C15691eRs.OLrzqt(function1, obj);
                }
            });
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.eRF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    C15691eRs.OLrzqt(user, abstractC12782ctV, context, interfaceC58184ywW);
                }
            }, BackpressureStrategy.BUFFER);
        }
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(android.content.Context context, AbstractC12782ctV abstractC12782ctV, AccountMpcResponse accountMpcResponse) {
        Intrinsics.checkNotNullParameter(accountMpcResponse, "");
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
        if (interfaceC8104awT != null) {
            java.lang.String email = accountMpcResponse.getEmail();
            java.lang.String areaCode = accountMpcResponse.getAreaCode();
            java.lang.String phone = accountMpcResponse.getPhone();
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
            InterfaceC8104awT.StateListAnimator.routeLoginFromMpcWallet$default(interfaceC8104awT, context, email, areaCode, phone, Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getAccountName() : null), (java.lang.Object) accountMpcResponse.getEmail()) ? LoginType.EMAIL : LoginType.PHONE, null, 32, null);
        }
        return AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
    }

    public static final void OLrzqt(final User user, final AbstractC12782ctV abstractC12782ctV, final android.content.Context context, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AEQbTJ.KWHzl(user.getUid(), new Function0() { // from class: o.eRt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15691eRs.OLrzqt(interfaceC58184ywW);
            }
        }, new Function0() { // from class: o.eRw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15691eRs.KWHzl(abstractC12782ctV, interfaceC58184ywW, context, user);
            }
        });
    }

    public static final Unit OLrzqt(InterfaceC58184ywW interfaceC58184ywW) {
        interfaceC58184ywW.onNext(java.lang.Boolean.TRUE);
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC12782ctV abstractC12782ctV, InterfaceC58184ywW interfaceC58184ywW, final android.content.Context context, final User user) {
        java.lang.String uid;
        C13934dbu c13934dbuCopydefault = eRI.OLrzqt.copydefault();
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        if (mpcWalletEncodeInfoQSBOWP == null || (uid = mpcWalletEncodeInfoQSBOWP.getUid()) == null) {
            uid = "";
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(c13934dbuCopydefault.AEQbTJ(abstractC12782ctV, uid), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.eRy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15691eRs.copydefault(context, user, (AccountMpcResponse) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15691eRs.gEmmrt(function1, obj);
            }
        });
        interfaceC58184ywW.onNext(java.lang.Boolean.FALSE);
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(android.content.Context context, User user, AccountMpcResponse accountMpcResponse) {
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
        if (interfaceC8104awT != null) {
            InterfaceC8104awT.StateListAnimator.routeLoginFromMpcWallet$default(interfaceC8104awT, context, accountMpcResponse.getEmail(), accountMpcResponse.getAreaCode(), accountMpcResponse.getPhone(), Intrinsics.EZpvd((java.lang.Object) accountMpcResponse.getEmail(), (java.lang.Object) user.getLoginName()) ? LoginType.EMAIL : LoginType.PHONE, null, 32, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.eRs */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changeAccount$default(C15691eRs c15691eRs, java.lang.String str, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        c15691eRs.KWHzl(str, (Function0<Unit>) function0, (Function0<Unit>) function02);
    }

    public final void KWHzl(@NotNull java.lang.String str, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new MpcAccountStatusUtils$changeAccount$1(str, function0, function02, null), 3, null);
    }
}
