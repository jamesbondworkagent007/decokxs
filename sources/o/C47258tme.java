package o;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.okuser.core.CoreUserManagerImpl$logoutCurrentUser$1;
import com.okinc.okuser.data.Token;
import com.okinc.okuser.data.TokenType;
import com.okinc.okuser.data.User;
import com.okinc.rxutils.RxBus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC47263tmj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tme, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47258tme extends AbstractC43215rlA implements InterfaceC47278tmy {
    public final MutableSharedFlow<AbstractC47263tmj> AEQbTJ;
    public final MutableSharedFlow<Unit> EZpvd;
    public final InterfaceC4968Bxs OLrzqt;
    public final MutableSharedFlow<java.lang.String> copydefault;

    /* JADX INFO: renamed from: o.tme$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TokenType.values().length];
            try {
                iArr[TokenType.TEMP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TokenType.LIVE_TRADING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TokenType.DEMO_TRADING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[uniffi.user.TokenType.values().length];
            try {
                iArr2[uniffi.user.TokenType.DEMO_TRADING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[uniffi.user.TokenType.LIVE_TRADING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String KWHzl() {
        return "logged out current user";
    }

    @yCM
    public C47258tme(@NotNull InterfaceC4968Bxs interfaceC4968Bxs) {
        Intrinsics.checkNotNullParameter(interfaceC4968Bxs, "");
        this.OLrzqt = interfaceC4968Bxs;
        this.AEQbTJ = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.EZpvd = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.copydefault = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    @Override // o.InterfaceC47278tmy
    public Flow<AbstractC47263tmj> fIwbmz() {
        return FlowKt.asSharedFlow(this.AEQbTJ);
    }

    @Override // o.InterfaceC47278tmy
    public Flow<Unit> AuCTel() {
        return FlowKt.asSharedFlow(this.EZpvd);
    }

    @Override // o.InterfaceC47278tmy
    public boolean values() {
        return this.OLrzqt.fJNWhG();
    }

    @Override // o.InterfaceC47278tmy
    public boolean AkhnZx() {
        BvK bvKCopydefault;
        BvH bvHGEmmrt = this.OLrzqt.gEmmrt();
        return (bvHGEmmrt == null || (bvKCopydefault = bvHGEmmrt.copydefault()) == null || bvKCopydefault.QOLQEE()) ? false : true;
    }

    @Override // o.InterfaceC47278tmy
    public boolean DbNXlk() {
        BvK bvKCopydefault;
        BvH bvHGEmmrt = this.OLrzqt.gEmmrt();
        if (bvHGEmmrt == null || (bvKCopydefault = bvHGEmmrt.copydefault()) == null) {
            return false;
        }
        return bvKCopydefault.QOLQEE();
    }

    @Override // o.InterfaceC47278tmy
    public User OLrzqt() {
        BvH bvHGEmmrt = this.OLrzqt.gEmmrt();
        if (bvHGEmmrt != null) {
            return C47262tmi.copydefault(bvHGEmmrt);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        CoreUserManagerImpl$logoutCurrentUser$1 coreUserManagerImpl$logoutCurrentUser$1;
        if (continuation instanceof CoreUserManagerImpl$logoutCurrentUser$1) {
            coreUserManagerImpl$logoutCurrentUser$1 = (CoreUserManagerImpl$logoutCurrentUser$1) continuation;
            int i = coreUserManagerImpl$logoutCurrentUser$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coreUserManagerImpl$logoutCurrentUser$1.label = i - Integer.MIN_VALUE;
            } else {
                coreUserManagerImpl$logoutCurrentUser$1 = new CoreUserManagerImpl$logoutCurrentUser$1(this, continuation);
            }
        }
        java.lang.Object obj = coreUserManagerImpl$logoutCurrentUser$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = coreUserManagerImpl$logoutCurrentUser$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            this.OLrzqt.uzCIH();
            RxBus.KWHzl("ev_account_logout");
            MutableSharedFlow<AbstractC47263tmj> mutableSharedFlow = this.AEQbTJ;
            AbstractC47263tmj.Activity activity = AbstractC47263tmj.Activity.OLrzqt;
            coreUserManagerImpl$logoutCurrentUser$1.label = 1;
            if (mutableSharedFlow.emit(activity, coreUserManagerImpl$logoutCurrentUser$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C47243tmP.EZpvd.EZpvd(new Function0() { // from class: o.tmh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47258tme.KWHzl();
            }
        });
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC47278tmy
    public java.util.List<User> copydefault() {
        java.util.List<BvH> listKWHzl = this.OLrzqt.KWHzl();
        final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList.add(C47262tmi.copydefault((BvH) it.next()));
        }
        C47243tmP.EZpvd.EZpvd(new Function0() { // from class: o.tmf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47258tme.AEQbTJ(arrayList);
            }
        });
        return arrayList;
    }

    public static final java.lang.String AEQbTJ(java.util.List list) {
        return "getAllUsers: " + list;
    }

    @Override // o.InterfaceC47278tmy
    public java.util.List<User> AEQbTJ() {
        java.util.List<BvH> listDjBIcL = this.OLrzqt.djBIcL();
        final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
        java.util.Iterator<T> it = listDjBIcL.iterator();
        while (it.hasNext()) {
            arrayList.add(C47262tmi.copydefault((BvH) it.next()));
        }
        C47243tmP.EZpvd.EZpvd(new Function0() { // from class: o.tmm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47258tme.OLrzqt(arrayList);
            }
        });
        return arrayList;
    }

    public static final java.lang.String OLrzqt(java.util.List list) {
        return "getAllUsersOfSameSite: " + list;
    }

    @Override // o.InterfaceC47278tmy
    public void fARcdN() {
        this.OLrzqt.EZpvd(yDY.AhwBna());
    }

    @Override // o.InterfaceC47278tmy
    public java.lang.String AYXKKw() {
        BvH bvHGEmmrt = this.OLrzqt.gEmmrt();
        java.lang.String strCoreUserGetAccountName = bvHGEmmrt != null ? BzK.coreUserGetAccountName(bvHGEmmrt) : null;
        return strCoreUserGetAccountName == null ? "" : strCoreUserGetAccountName;
    }

    @Override // o.InterfaceC47278tmy
    public java.lang.String gEmmrt() {
        BvH bvHGEmmrt = this.OLrzqt.gEmmrt();
        java.lang.String strCoreUserGetNickname = bvHGEmmrt != null ? BzK.coreUserGetNickname(bvHGEmmrt) : null;
        return strCoreUserGetNickname == null ? "" : strCoreUserGetNickname;
    }

    @Override // o.InterfaceC47278tmy
    public Token AhwBna() {
        TokenType tokenType;
        BvH bvHGEmmrt = this.OLrzqt.gEmmrt();
        if (bvHGEmmrt == null) {
            return null;
        }
        int i = ActionBar.copydefault[bvHGEmmrt.AYXKKw().ordinal()];
        if (i == 1) {
            tokenType = TokenType.DEMO_TRADING;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            tokenType = TokenType.LIVE_TRADING;
        }
        return new Token(bvHGEmmrt.djBIcL(), tokenType);
    }

    @Override // o.InterfaceC47278tmy
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt.AEQbTJ(str, str2);
        this.EZpvd.tryEmit(Unit.INSTANCE);
    }

    @Override // o.InterfaceC47278tmy
    public boolean fJNWhG() {
        BvH bvHGEmmrt = this.OLrzqt.gEmmrt();
        return (bvHGEmmrt != null ? bvHGEmmrt.AYXKKw() : null) == uniffi.user.TokenType.DEMO_TRADING;
    }

    @Override // o.InterfaceC47278tmy
    public void EZpvd(@NotNull User user) {
        Intrinsics.checkNotNullParameter(user, "");
        this.OLrzqt.EZpvd(C47262tmi.EZpvd(user));
    }

    @Override // o.InterfaceC47278tmy
    public Token djBIcL() {
        java.lang.String strDbNXlk = this.OLrzqt.DbNXlk();
        if (strDbNXlk == null) {
            return null;
        }
        return new Token(strDbNXlk, TokenType.TEMP);
    }

    @Override // o.InterfaceC47278tmy
    public Flow<java.lang.String> ejfBZ() {
        return FlowKt.distinctUntilChanged(FlowKt.asSharedFlow(this.copydefault));
    }

    @Override // o.InterfaceC47278tmy
    public JsonObject valueOf() {
        BvK bvKCopydefault;
        BvH bvHGEmmrt = this.OLrzqt.gEmmrt();
        try {
            return JsonParser.parseString((bvHGEmmrt == null || (bvKCopydefault = bvHGEmmrt.copydefault()) == null) ? null : bvKCopydefault.EZpvd()).getAsJsonObject();
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("UserManager", e);
            return null;
        }
    }

    @Override // o.InterfaceC47278tmy
    public boolean fetchVPNInfo() {
        BvK bvKCopydefault;
        C5010Bzg c5010BzgUzCIH;
        BvH bvHGEmmrt = this.OLrzqt.gEmmrt();
        return (bvHGEmmrt == null || (bvKCopydefault = bvHGEmmrt.copydefault()) == null || (c5010BzgUzCIH = bvKCopydefault.uzCIH()) == null || !c5010BzgUzCIH.EZpvd()) ? false : true;
    }

    @Override // o.InterfaceC47278tmy
    public boolean isConnected() {
        return this.OLrzqt.fIwbmz();
    }
}
