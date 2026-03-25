package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.account.api.model.mpcwallet.LoginType;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.AccountMpcResponse;
import com.okinc.business.defi.biz.net.bean.AccountStatus;
import com.okinc.business.defi.biz.net.bean.CheckDappResonse;
import com.okinc.business.defi.biz.net.bean.CheckMpcStatusRequestBody;
import com.okinc.business.defi.biz.net.bean.CheckMpcStatusResponse;
import com.okinc.business.defi.biz.net.bean.MpcStatus;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okuser.data.User;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.DappSupportCheck;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC17523fIm;
import o.C13754dXa;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cVd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11624cVd extends AbstractC43215rlA implements MpcWalletService {
    public final eSA KWHzl = new eSA();
    public final C13934dbu copydefault = new C13934dbu();
    public Function1<? super java.lang.Boolean, Unit> OLrzqt = new Function1() { // from class: o.cVW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C11624cVd.KWHzl(((java.lang.Boolean) obj).booleanValue());
        }
    };
    public Function1<? super java.lang.Boolean, Unit> EZpvd = new Function1() { // from class: o.cVX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C11624cVd.valueOf(((java.lang.Boolean) obj).booleanValue());
        }
    };
    public Function1<? super java.lang.Boolean, Unit> AEQbTJ = new Function1() { // from class: o.cWb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C11624cVd.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: o.cVd$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MpcWalletService.MpcWalletAbleStatus.values().length];
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoBackUp.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public void AEQbTJ(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public void KWHzl(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> */
    @Override // com.okinc.wallet.api.MpcWalletService
    public Function1<java.lang.Boolean, Unit> aQ_() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> */
    @Override // com.okinc.wallet.api.MpcWalletService
    public Function1<java.lang.Boolean, Unit> aR_() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> */
    @Override // com.okinc.wallet.api.MpcWalletService
    public Function1<java.lang.Boolean, Unit> aS_() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public void copydefault(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    public static final Unit KWHzl(boolean z) {
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(boolean z) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z) {
        return Unit.INSTANCE;
    }

    @Override // com.okinc.wallet.api.MpcWalletService
    public MpcWalletService.MpcWalletAbleStatus copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String uid;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) interfaceC9738bbJ;
        if (!abstractC12782ctV.ORxRYg() && !abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
            return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault;
        }
        java.util.HashMap<java.lang.String, CheckMpcStatusResponse> mapKWHzl = C15691eRs.AEQbTJ.KWHzl();
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        java.lang.Object obj = null;
        CheckMpcStatusResponse checkMpcStatusResponse = mapKWHzl.get(abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.EZpvd() : null);
        if (checkMpcStatusResponse != null) {
            int mpcStatus = checkMpcStatusResponse.getMpcStatus();
            if (mpcStatus == MpcStatus.Escape.getValue()) {
                return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape;
            }
            if (mpcStatus == MpcStatus.Refreshed.getValue()) {
                return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed;
            }
            if (mpcStatus == MpcStatus.BackupedFail.getValue()) {
                return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed;
            }
            int accountStatus = checkMpcStatusResponse.getAccountStatus();
            if (accountStatus == AccountStatus.Normal.getValue()) {
                if (abstractC12782ctV.AxsJAYaxsJAY() || abstractC12782ctV.ffGIBT()) {
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
                    java.lang.String uid2 = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getUid() : null;
                    dZP dzp = dZP.OLrzqt;
                    if (Intrinsics.EZpvd((java.lang.Object) uid2, (java.lang.Object) dzp.EZpvd())) {
                        return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal;
                    }
                    java.util.Iterator<T> it = dzp.copydefault().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        User user = (User) next;
                        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
                        if (Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getUid() : null), (java.lang.Object) user.getUid())) {
                            obj = next;
                            break;
                        }
                    }
                    User user2 = (User) obj;
                    if (user2 != null) {
                        MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus = MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch;
                        mpcWalletAbleStatus.setData(user2);
                        return mpcWalletAbleStatus;
                    }
                    MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus2 = MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
                    if (mpcWalletEncodeInfoQSBOWP3 != null && (uid = mpcWalletEncodeInfoQSBOWP3.getUid()) != null) {
                        str = uid;
                    }
                    mpcWalletAbleStatus2.setData(str);
                    return mpcWalletAbleStatus2;
                }
                return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoBackUp;
            }
            if (accountStatus == AccountStatus.Delete.getValue()) {
                return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete;
            }
            if (accountStatus == AccountStatus.Frozen.getValue()) {
                return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen;
            }
            return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault;
        }
        return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault;
    }

    @Override // com.okinc.wallet.api.MpcWalletService
    public void copydefault(@NotNull final InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull final Function1<? super MpcWalletService.MpcWalletAbleStatus, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) interfaceC9738bbJ;
        if (!abstractC12782ctV.ORxRYg() && !abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
            function1.invoke(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault);
            return;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.Integer>> abstractC58185ywXAEQbTJ = this.KWHzl.AEQbTJ(abstractC12782ctV, fragmentActivity);
        final Function1 function12 = new Function1() { // from class: o.cVQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11624cVd.OLrzqt(function1, abstractC12782ctV, interfaceC9738bbJ, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cVO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11624cVd.DbNXlk(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.cVP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11624cVd.AEQbTJ(abstractC12782ctV, function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cVR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11624cVd.values(function13, obj);
            }
        });
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, AbstractC12782ctV abstractC12782ctV, InterfaceC9738bbJ interfaceC9738bbJ, kotlin.Pair pair) {
        java.lang.String uid;
        if (((java.lang.Number) pair.getFirst()).intValue() == 0) {
            int iIntValue = ((java.lang.Number) pair.getSecond()).intValue();
            if (iIntValue == MpcStatus.Escape.getValue()) {
                function1.invoke(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape);
            } else if (iIntValue == MpcStatus.Refreshed.getValue() || iIntValue == MpcStatus.BackupedFail.getValue()) {
                function1.invoke(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed);
            }
        } else {
            int iIntValue2 = ((java.lang.Number) pair.getSecond()).intValue();
            if (iIntValue2 == AccountStatus.Normal.getValue()) {
                if (abstractC12782ctV.AxsJAYaxsJAY() || abstractC12782ctV.ffGIBT()) {
                    AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) interfaceC9738bbJ;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV2.QSBOWP();
                    java.lang.Object obj = null;
                    java.lang.String uid2 = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getUid() : null;
                    dZP dzp = dZP.OLrzqt;
                    if (Intrinsics.EZpvd((java.lang.Object) uid2, (java.lang.Object) dzp.EZpvd())) {
                        function1.invoke(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal);
                    } else {
                        java.util.Iterator<T> it = dzp.copydefault().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            User user = (User) next;
                            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV2.QSBOWP();
                            if (Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getUid() : null), (java.lang.Object) user.getUid())) {
                                obj = next;
                                break;
                            }
                        }
                        User user2 = (User) obj;
                        if (user2 != null) {
                            MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus = MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch;
                            mpcWalletAbleStatus.setData(user2);
                            function1.invoke(mpcWalletAbleStatus);
                        } else {
                            MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus2 = MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin;
                            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV2.QSBOWP();
                            if (mpcWalletEncodeInfoQSBOWP3 == null || (uid = mpcWalletEncodeInfoQSBOWP3.getUid()) == null) {
                                uid = "";
                            }
                            mpcWalletAbleStatus2.setData(uid);
                            function1.invoke(mpcWalletAbleStatus2);
                        }
                    }
                } else {
                    function1.invoke(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoBackUp);
                }
            } else if (iIntValue2 == AccountStatus.Delete.getValue()) {
                function1.invoke(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete);
            } else if (iIntValue2 == AccountStatus.Frozen.getValue()) {
                function1.invoke(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractC12782ctV abstractC12782ctV, Function1 function1, java.lang.Throwable th) {
        if (abstractC12782ctV.DCUTEIdCUTEI()) {
            function1.invoke(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape);
        } else if (abstractC12782ctV.Dmq()) {
            if (abstractC12782ctV.AxsJAYaxsJAY() || abstractC12782ctV.ffGIBT()) {
                function1.invoke(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed);
            } else {
                function1.invoke(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoBackUp);
            }
        }
        return Unit.INSTANCE;
    }

    public void copydefault(@NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull final FragmentActivity fragmentActivity, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) interfaceC9738bbJ;
        switch (Activity.AEQbTJ[mpcWalletAbleStatus.ordinal()]) {
            case 1:
            case 2:
                function1.invoke(java.lang.Boolean.TRUE);
                return;
            case 3:
                eRI eri = eRI.OLrzqt;
                java.lang.Object data = mpcWalletAbleStatus.getData();
                java.lang.String str = data instanceof java.lang.String ? (java.lang.String) data : null;
                eri.AEQbTJ(fragmentActivity, fragmentActivity, abstractC12782ctV, str == null ? "" : str, new yHO() { // from class: o.cVl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHO
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return C11624cVd.KWHzl(this.OLrzqt, function1, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
                    }
                });
                return;
            case 4:
                if (mpcWalletAbleStatus.getData() != null) {
                    eRI eri2 = eRI.OLrzqt;
                    java.lang.Object data2 = mpcWalletAbleStatus.getData();
                    Intrinsics.copydefault(data2, "");
                    eri2.AEQbTJ(fragmentActivity, (User) data2, abstractC12782ctV, new yHT() { // from class: o.cVj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.yHT
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                            return C11624cVd.AEQbTJ(this.KWHzl, function1, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3, ((java.lang.Boolean) obj4).booleanValue());
                        }
                    });
                    return;
                }
                return;
            case 5:
                this.KWHzl.KWHzl(0, MpcStatus.Refreshed.getValue(), abstractC12782ctV, fragmentActivity, 2, new yHO() { // from class: o.cVr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHO
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return C11624cVd.KWHzl(((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
                    }
                });
                KWHzl(new Function1() { // from class: o.cVn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C11624cVd.OLrzqt(fragmentActivity, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
                AEQbTJ(new Function1() { // from class: o.cVq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C11624cVd.fetchVPNInfo(function1, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
                return;
            case 6:
                eRI.OLrzqt.EZpvd(fragmentActivity, new Function2() { // from class: o.cVo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C11624cVd.EZpvd((android.view.View) obj, (ViewOnClickListenerC54939xaY) obj2);
                    }
                });
                function1.invoke(java.lang.Boolean.FALSE);
                return;
            case 7:
                eSA.judgyDialog$default(this.KWHzl, 0, MpcStatus.Escape.getValue(), abstractC12782ctV, fragmentActivity, 2, null, 32, null);
                function1.invoke(java.lang.Boolean.FALSE);
                return;
            case 8:
                eSA.judgyDialog$default(this.KWHzl, 1, AccountStatus.Delete.getValue(), abstractC12782ctV, fragmentActivity, 2, null, 32, null);
                function1.invoke(java.lang.Boolean.FALSE);
                return;
            case 9:
                eSA.judgyDialog$default(this.KWHzl, 1, AccountStatus.Frozen.getValue(), abstractC12782ctV, fragmentActivity, 2, null, 32, null);
                function1.invoke(java.lang.Boolean.FALSE);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Unit KWHzl(C11624cVd c11624cVd, final Function1 function1, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        if (i == 1) {
            c11624cVd.KWHzl(new Function1() { // from class: o.cVy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11624cVd.values(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit values(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C11624cVd c11624cVd, final Function1 function1, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        if (i == 1 && !z) {
            c11624cVd.KWHzl(new Function1() { // from class: o.cVE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11624cVd.DbNXlk(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else if (z) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        if (i == 1) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(FragmentActivity fragmentActivity, boolean z) {
        if (z) {
            ActivityC17523fIm.ActionBar.start$default(ActivityC17523fIm.Companion, fragmentActivity, null, 2, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        return Unit.INSTANCE;
    }

    @Override // com.okinc.wallet.api.MpcWalletService
    public void KWHzl(@NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull final InterfaceC9738bbJ interfaceC9738bbJ, @NotNull final FragmentActivity fragmentActivity, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (interfaceC9738bbJ instanceof AbstractC12782ctV) {
            switch (Activity.AEQbTJ[mpcWalletAbleStatus.ordinal()]) {
                case 1:
                case 2:
                    function1.invoke(java.lang.Boolean.TRUE);
                    return;
                case 3:
                    java.lang.Object data = mpcWalletAbleStatus.getData();
                    java.lang.String str = data instanceof java.lang.String ? (java.lang.String) data : null;
                    AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C58156yvv.EZpvd(eRI.OLrzqt.copydefault().AEQbTJ((AbstractC12782ctV) interfaceC9738bbJ, str != null ? str : ""), fragmentActivity), (Function1) null, 1, (java.lang.Object) null);
                    final Function1 function12 = new Function1() { // from class: o.cVB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C11624cVd.copydefault(this.KWHzl, fragmentActivity, interfaceC9738bbJ, function1, (AccountMpcResponse) obj);
                        }
                    };
                    InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cVz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C11624cVd.fIwbmz(function12, obj);
                        }
                    };
                    final Function1 function13 = new Function1() { // from class: o.cVx
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C11624cVd.valueOf(function1, (java.lang.Throwable) obj);
                        }
                    };
                    abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cVG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C11624cVd.getFieldNames(function13, obj);
                        }
                    });
                    return;
                case 4:
                    if (mpcWalletAbleStatus.getData() != null) {
                        java.lang.Object data2 = mpcWalletAbleStatus.getData();
                        Intrinsics.copydefault(data2, "");
                        final User user = (User) data2;
                        C15691eRs.AEQbTJ.KWHzl(user.getUid(), new Function0() { // from class: o.cVD
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C11624cVd.EZpvd(function1);
                            }
                        }, new Function0() { // from class: o.cVF
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C11624cVd.AEQbTJ(interfaceC9738bbJ, user, this, fragmentActivity, function1);
                            }
                        });
                        return;
                    }
                    return;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    function1.invoke(java.lang.Boolean.FALSE);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C11624cVd c11624cVd, FragmentActivity fragmentActivity, InterfaceC9738bbJ interfaceC9738bbJ, final Function1 function1, AccountMpcResponse accountMpcResponse) {
        c11624cVd.KWHzl(new Function1() { // from class: o.cVt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11624cVd.valueOf(function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
        if (interfaceC8104awT != null) {
            java.lang.String email = accountMpcResponse.getEmail();
            java.lang.String areaCode = accountMpcResponse.getAreaCode();
            java.lang.String phone = accountMpcResponse.getPhone();
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = ((AbstractC12782ctV) interfaceC9738bbJ).QSBOWP();
            InterfaceC8104awT.StateListAnimator.routeLoginFromMpcWallet$default(interfaceC8104awT, fragmentActivity, email, areaCode, phone, Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getAccountName() : null), (java.lang.Object) accountMpcResponse.getEmail()) ? LoginType.EMAIL : LoginType.PHONE, null, 32, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(Function1 function1, java.lang.Throwable th) {
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1) {
        function1.invoke(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ, final User user, final C11624cVd c11624cVd, final FragmentActivity fragmentActivity, final Function1 function1) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(eRI.OLrzqt.copydefault().AEQbTJ((AbstractC12782ctV) interfaceC9738bbJ, user.getUid()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function12 = new Function1() { // from class: o.cVU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11624cVd.AEQbTJ(this.OLrzqt, fragmentActivity, user, function1, (AccountMpcResponse) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58227yxM() { // from class: o.cVS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11624cVd.getNewProxyInstance(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C11624cVd c11624cVd, FragmentActivity fragmentActivity, User user, final Function1 function1, AccountMpcResponse accountMpcResponse) {
        c11624cVd.KWHzl(new Function1() { // from class: o.cVp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11624cVd.isConnected(function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
        if (interfaceC8104awT != null) {
            InterfaceC8104awT.StateListAnimator.routeLoginFromMpcWallet$default(interfaceC8104awT, fragmentActivity, accountMpcResponse.getEmail(), accountMpcResponse.getAreaCode(), accountMpcResponse.getPhone(), Intrinsics.EZpvd((java.lang.Object) accountMpcResponse.getEmail(), (java.lang.Object) user.getLoginName()) ? LoginType.EMAIL : LoginType.PHONE, null, 32, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    @Override // com.okinc.wallet.api.MpcWalletService
    public void KWHzl(@NotNull final InterfaceC9738bbJ interfaceC9738bbJ, @NotNull final FragmentActivity fragmentActivity, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        copydefault(interfaceC9738bbJ, fragmentActivity, new Function1() { // from class: o.cVM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11624cVd.KWHzl(this.copydefault, interfaceC9738bbJ, fragmentActivity, function1, (MpcWalletService.MpcWalletAbleStatus) obj);
            }
        });
    }

    public static final Unit KWHzl(C11624cVd c11624cVd, InterfaceC9738bbJ interfaceC9738bbJ, FragmentActivity fragmentActivity, Function1 function1, MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        c11624cVd.copydefault(mpcWalletAbleStatus, interfaceC9738bbJ, fragmentActivity, (Function1<? super java.lang.Boolean, Unit>) function1);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.wallet.api.MpcWalletService
    public void AEQbTJ(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXEZpvd = C15691eRs.AEQbTJ.EZpvd((AbstractC12782ctV) interfaceC9738bbJ, fragmentActivity);
        final Function1 function12 = new Function1() { // from class: o.cVu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11624cVd.EZpvd(function1, this, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cVw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11624cVd.hDKMBd(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.cVv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11624cVd.gEmmrt(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cVA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11624cVd.iwGUEr(function13, obj);
            }
        });
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final Function1 function1, C11624cVd c11624cVd, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            function1.invoke(java.lang.Boolean.TRUE);
        } else {
            c11624cVd.KWHzl(new Function1() { // from class: o.cVm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11624cVd.AkhnZx(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(Function1 function1, java.lang.Throwable th) {
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.wallet.api.MpcWalletService
    public void EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull final FragmentActivity fragmentActivity, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(C15691eRs.AEQbTJ.EZpvd((AbstractC12782ctV) interfaceC9738bbJ, fragmentActivity), fragmentActivity);
        final Function1 function12 = new Function1() { // from class: o.cVT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11624cVd.KWHzl(fragmentActivity, this, function1, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cVV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11624cVd.uzCIH(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.cWa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11624cVd.AhwBna(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cVZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11624cVd.zsXlph(function13, obj);
            }
        });
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(final FragmentActivity fragmentActivity, C11624cVd c11624cVd, final Function1 function1, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            ActivityC17523fIm.ActionBar.start$default(ActivityC17523fIm.Companion, fragmentActivity, null, 2, 2, null);
        } else {
            c11624cVd.KWHzl(new Function1() { // from class: o.cWe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11624cVd.copydefault(fragmentActivity, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        c11624cVd.AEQbTJ(new Function1() { // from class: o.cVi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11624cVd.fARcdN(function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(FragmentActivity fragmentActivity, boolean z) {
        if (z) {
            ActivityC17523fIm.ActionBar.start$default(ActivityC17523fIm.Companion, fragmentActivity, null, 2, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(Function1 function1, java.lang.Throwable th) {
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.wallet.api.MpcWalletService
    public void OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ActivityC18321fgG.Companion.KWHzl(fragmentActivity, interfaceC9738bbJ.DbNXlk(), z);
        copydefault(new Function1() { // from class: o.cVk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11624cVd.AYXKKw(function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AYXKKw(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final java.util.Map fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.Map) function1.invoke(obj);
    }

    public static final java.util.Map KWHzl(C11624cVd c11624cVd, java.util.HashMap map, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            CheckMpcStatusResponse checkMpcStatusResponse = (CheckMpcStatusResponse) it.next();
            map2.put(checkMpcStatusResponse.getMpcId(), c11624cVd.EZpvd(checkMpcStatusResponse.getMpcStatus(), checkMpcStatusResponse.getAccountStatus(), (AbstractC12784ctX) map.get(checkMpcStatusResponse.getMpcId())));
            try {
                AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) map.get(checkMpcStatusResponse.getMpcId());
                if (abstractC12784ctX != null) {
                    C15691eRs.AEQbTJ.KWHzl().put(abstractC12784ctX.EZpvd(), checkMpcStatusResponse);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        return map2;
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function1 function1, C11624cVd c11624cVd, java.util.HashMap map, java.util.List list) {
        java.util.HashMap map2 = new java.util.HashMap();
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            CheckMpcStatusResponse checkMpcStatusResponse = (CheckMpcStatusResponse) it.next();
            map2.put(checkMpcStatusResponse.getMpcId(), c11624cVd.EZpvd(checkMpcStatusResponse.getMpcStatus(), checkMpcStatusResponse.getAccountStatus(), (AbstractC12784ctX) map.get(checkMpcStatusResponse.getMpcId())));
            try {
                AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) map.get(checkMpcStatusResponse.getMpcId());
                if (abstractC12784ctX != null) {
                    C15691eRs.AEQbTJ.KWHzl().put(abstractC12784ctX.EZpvd(), checkMpcStatusResponse);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        function1.invoke(map2);
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Throwable th) {
        function1.invoke(C56424yEw.KWHzl());
        return Unit.INSTANCE;
    }

    public final MpcWalletService.MpcWalletAbleStatus EZpvd(int i, int i2, AbstractC12784ctX abstractC12784ctX) {
        if (i == MpcStatus.WalletCreated.getValue()) {
            return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoBackUp;
        }
        if (i == MpcStatus.Backuped.getValue()) {
            if (i2 == AccountStatus.Normal.getValue()) {
                return OLrzqt(abstractC12784ctX);
            }
            if (i2 == AccountStatus.Delete.getValue()) {
                return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete;
            }
            if (i2 == AccountStatus.Frozen.getValue()) {
                return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen;
            }
            return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal;
        }
        if (i == MpcStatus.Escape.getValue()) {
            return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape;
        }
        if (i == MpcStatus.Refreshed.getValue()) {
            return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed;
        }
        if (i == MpcStatus.BackupedFail.getValue()) {
            return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed;
        }
        return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal;
    }

    public final MpcWalletService.MpcWalletAbleStatus OLrzqt(AbstractC12784ctX abstractC12784ctX) {
        if (abstractC12784ctX == null) {
            return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal;
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = abstractC12784ctX.isConnected();
        java.lang.Object obj = null;
        java.lang.String uid = mpcWalletEncodeInfoIsConnected != null ? mpcWalletEncodeInfoIsConnected.getUid() : null;
        dZP dzp = dZP.OLrzqt;
        if (Intrinsics.EZpvd((java.lang.Object) uid, (java.lang.Object) dzp.EZpvd())) {
            return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal;
        }
        java.util.Iterator<T> it = dzp.copydefault().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.lang.String uid2 = ((User) next).getUid();
            MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected2 = abstractC12784ctX.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) uid2, (java.lang.Object) (mpcWalletEncodeInfoIsConnected2 != null ? mpcWalletEncodeInfoIsConnected2.getUid() : null))) {
                obj = next;
                break;
            }
        }
        if (((User) obj) == null) {
            return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin;
        }
        return MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch;
    }

    @Override // com.okinc.wallet.api.MpcWalletService
    public AbstractC58185ywX<DappSupportCheck> j_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C43423rox.OLrzqt(this.copydefault.AEQbTJ(str), new Function1() { // from class: o.cVC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C11624cVd.AYXKKw((ResponseData) obj));
            }
        });
        AbstractC58185ywX abstractC58185ywXOLrzqt2 = C43423rox.OLrzqt(this.copydefault.copydefault(str), new Function1() { // from class: o.cVN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C11624cVd.AhwBna((ResponseData) obj));
            }
        });
        final Function2 function2 = new Function2() { // from class: o.cVY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C11624cVd.EZpvd((CheckDappResonse) obj, (CheckDappResonse) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXOLrzqt, abstractC58185ywXOLrzqt2, new InterfaceC58223yxI() { // from class: o.cWc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C11624cVd.KWHzl(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cWf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11624cVd.OLrzqt((kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<DappSupportCheck> abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cWd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11624cVd.fARcdN(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair EZpvd(CheckDappResonse checkDappResonse, CheckDappResonse checkDappResonse2) {
        Intrinsics.checkNotNullParameter(checkDappResonse, "");
        Intrinsics.checkNotNullParameter(checkDappResonse2, "");
        return C56390yDp.OLrzqt(checkDappResonse, checkDappResonse2);
    }

    public static final DappSupportCheck fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (DappSupportCheck) function1.invoke(obj);
    }

    public static final DappSupportCheck OLrzqt(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return new DappSupportCheck(((CheckDappResonse) pair.getFirst()).getResult(), ((CheckDappResonse) pair.getSecond()).getResult());
    }

    @Override // com.okinc.wallet.api.MpcWalletService
    public java.lang.String EZpvd(@NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String strAkhnZx;
        java.lang.String displayAccountName;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        switch (Activity.AEQbTJ[mpcWalletAbleStatus.ordinal()]) {
            case 1:
            case 2:
                return "";
            case 3:
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.next);
            case 4:
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.playFromSearch);
            case 5:
                if (interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.wlaJM()) {
                    if (!(interfaceC9738bbJ instanceof AbstractC12782ctV)) {
                        return interfaceC9738bbJ.AkhnZx();
                    }
                    AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) interfaceC9738bbJ;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
                    if (mpcWalletEncodeInfoQSBOWP != null && (displayAccountName = mpcWalletEncodeInfoQSBOWP.getDisplayAccountName()) != null) {
                        str = displayAccountName;
                    }
                    if (str.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) abstractC12782ctV.AkhnZx())) {
                        strAkhnZx = abstractC12782ctV.AkhnZx() + "(" + str + ")";
                    } else {
                        strAkhnZx = abstractC12782ctV.AkhnZx();
                    }
                } else {
                    strAkhnZx = interfaceC9738bbJ.AkhnZx();
                }
                return C33069mpW.copydefault(C13754dXa.FragmentManager.ComponentActivity1, C56423yEv.EZpvd(C56390yDp.OLrzqt("acctname", strAkhnZx)));
            case 6:
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.setNegativeButtonIcon);
            case 7:
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.setInverseBackgroundForced);
            case 8:
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.resolveDialogTheme);
            case 9:
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getContext);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.okinc.wallet.api.MpcWalletService
    public AbstractC58185ywX<java.util.Map<java.lang.String, MpcWalletService.MpcWalletAbleStatus>> AEQbTJ(@NotNull java.util.List<? extends InterfaceC9738bbJ> list) {
        java.lang.String mpcId;
        java.lang.String mpcId2;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<InterfaceC9738bbJ> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
            if (interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.wlaJM()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        final java.util.HashMap map = new java.util.HashMap();
        for (InterfaceC9738bbJ interfaceC9738bbJ2 : arrayList) {
            Intrinsics.copydefault(interfaceC9738bbJ2, "");
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) interfaceC9738bbJ2;
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
            if (mpcWalletEncodeInfoQSBOWP == null || (mpcId = mpcWalletEncodeInfoQSBOWP.getMpcId()) == null) {
                mpcId = "";
            }
            arrayList2.add(new CheckMpcStatusRequestBody(mpcId));
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
            if (mpcWalletEncodeInfoQSBOWP2 == null || (mpcId2 = mpcWalletEncodeInfoQSBOWP2.getMpcId()) == null) {
                mpcId2 = "";
            }
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            if (abstractC12784ctXGwTjWJ != null) {
                map.put(mpcId2, abstractC12784ctXGwTjWJ);
            }
        }
        C13934dbu c13934dbu = new C13934dbu();
        java.lang.Object objAubY = CollectionsKt___CollectionsKt.AubY(list);
        Intrinsics.copydefault(objAubY, "");
        java.lang.String strUSBtdM = ((AbstractC12782ctV) objAubY).USBtdM();
        java.lang.String strDbNXlk = ((InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AubY(list)).DbNXlk();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            if (hashSet.add(((CheckMpcStatusRequestBody) obj2).getMpcId())) {
                arrayList3.add(obj2);
            }
        }
        AbstractC58185ywX abstractC58185ywXOLrzqt = C43423rox.OLrzqt(c13934dbu.EZpvd(strUSBtdM, strDbNXlk, arrayList3), new Function1() { // from class: o.cVf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return java.lang.Boolean.valueOf(C11624cVd.AEQbTJ((ResponseData) obj3));
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cVe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C11624cVd.KWHzl(this.KWHzl, map, (java.util.List) obj3);
            }
        };
        AbstractC58185ywX<java.util.Map<java.lang.String, MpcWalletService.MpcWalletAbleStatus>> abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cVs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj3) {
                return C11624cVd.fJNWhG(function1, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    @Override // com.okinc.wallet.api.MpcWalletService
    public void KWHzl(@NotNull java.util.List<? extends InterfaceC9738bbJ> list, @NotNull FragmentActivity fragmentActivity, @NotNull final Function1<? super java.util.Map<java.lang.String, ? extends MpcWalletService.MpcWalletAbleStatus>, Unit> function1) {
        java.lang.String mpcId;
        java.lang.String mpcId2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.ArrayList<InterfaceC9738bbJ> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
            if (interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.wlaJM()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        final java.util.HashMap map = new java.util.HashMap();
        for (InterfaceC9738bbJ interfaceC9738bbJ2 : arrayList) {
            Intrinsics.copydefault(interfaceC9738bbJ2, "");
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) interfaceC9738bbJ2;
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
            if (mpcWalletEncodeInfoQSBOWP == null || (mpcId = mpcWalletEncodeInfoQSBOWP.getMpcId()) == null) {
                mpcId = "";
            }
            arrayList2.add(new CheckMpcStatusRequestBody(mpcId));
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
            if (mpcWalletEncodeInfoQSBOWP2 == null || (mpcId2 = mpcWalletEncodeInfoQSBOWP2.getMpcId()) == null) {
                mpcId2 = "";
            }
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            if (abstractC12784ctXGwTjWJ != null) {
                map.put(mpcId2, abstractC12784ctXGwTjWJ);
            }
        }
        C13934dbu c13934dbu = new C13934dbu();
        java.lang.Object objAubY = CollectionsKt___CollectionsKt.AubY(list);
        Intrinsics.copydefault(objAubY, "");
        java.lang.String strUSBtdM = ((AbstractC12782ctV) objAubY).USBtdM();
        java.lang.String strDbNXlk = ((InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AubY(list)).DbNXlk();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            if (hashSet.add(((CheckMpcStatusRequestBody) obj2).getMpcId())) {
                arrayList3.add(obj2);
            }
        }
        AbstractC58185ywX abstractC58185ywXOLrzqt = C43423rox.OLrzqt(C58156yvv.EZpvd(c13934dbu.EZpvd(strUSBtdM, strDbNXlk, arrayList3), fragmentActivity), new Function1() { // from class: o.cVH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return java.lang.Boolean.valueOf(C11624cVd.gEmmrt((ResponseData) obj3));
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cVL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C11624cVd.KWHzl(function1, this, map, (java.util.List) obj3);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cVK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj3) {
                C11624cVd.ejfBZ(function12, obj3);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.cVI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C11624cVd.OLrzqt(function1, (java.lang.Throwable) obj3);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cVJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj3) {
                C11624cVd.AuCTel(function13, obj3);
            }
        });
    }

    public static final boolean AEQbTJ(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null;
    }

    public static final boolean gEmmrt(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null;
    }

    public static final boolean AYXKKw(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null;
    }

    public static final boolean AhwBna(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null;
    }
}
