package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.metricsmonitor.WalletOrAccountType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC17259ezS;
import o.C12827cuN;
import o.InterfaceC18445fiY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ezu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17287ezu {
    public final InterfaceC18445fiY AEQbTJ;
    public final C12827cuN EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C17287ezu() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public C17287ezu(@NotNull C12827cuN c12827cuN, @NotNull InterfaceC18445fiY interfaceC18445fiY) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(interfaceC18445fiY, "");
        this.EZpvd = c12827cuN;
        this.AEQbTJ = interfaceC18445fiY;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0008: INVOKE 
  (wrap:o.cuN$Application:0x0006: SGET  A[WRAPPED] (LINE:15) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:15)) : (r3v0 o.cuN))
  (wrap:o.fiY:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fiY:0x0012: INVOKE 
  (wrap:o.fiY$StateListAnimator:0x0010: SGET  A[WRAPPED] (LINE:16) o.fiY.Companion o.fiY$StateListAnimator)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.fiY.StateListAnimator.getInstance$default(o.fiY$StateListAnimator, android.content.Context, int, java.lang.Object):o.fiY A[MD:(o.fiY$StateListAnimator, android.content.Context, int, java.lang.Object):o.fiY (m), WRAPPED] (LINE:16)) : (r4v0 o.fiY))
 A[MD:(o.cuN, o.fiY):void (m)] (LINE:14) call: o.ezu.<init>(o.cuN, o.fiY):void type: THIS */
    public /* synthetic */ C17287ezu(C12827cuN c12827cuN, InterfaceC18445fiY interfaceC18445fiY, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN, (i & 2) != 0 ? InterfaceC18445fiY.StateListAnimator.getInstance$default(InterfaceC18445fiY.Companion, null, 1, null) : interfaceC18445fiY);
    }

    public final void copydefault(@NotNull C17260ezT c17260ezT) {
        Intrinsics.checkNotNullParameter(c17260ezT, "");
        InterfaceC18445fiY interfaceC18445fiY = this.AEQbTJ;
        java.lang.String strCopydefault = c17260ezT.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "WalletDeleteMetricsMonitor";
        }
        interfaceC18445fiY.copydefault(strCopydefault, c17260ezT.AEQbTJ());
    }

    public static final void OLrzqt(AbstractC17259ezS abstractC17259ezS, C17287ezu c17287ezu, C17263ezW c17263ezW, WalletType walletType) {
        java.lang.String strEZpvd;
        boolean zAYXKKw;
        WalletOrAccountType walletOrAccountType;
        if (abstractC17259ezS instanceof AbstractC17259ezS.Application) {
            AbstractC17259ezS.Application application = (AbstractC17259ezS.Application) abstractC17259ezS;
            strEZpvd = application.AhwBna().DbNXlk();
            zAYXKKw = application.AhwBna().gasjUx();
            walletOrAccountType = WalletOrAccountType.ACCOUNT;
        } else {
            if (!(abstractC17259ezS instanceof AbstractC17259ezS.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC17259ezS.StateListAnimator stateListAnimator = (AbstractC17259ezS.StateListAnimator) abstractC17259ezS;
            strEZpvd = stateListAnimator.copydefault().EZpvd();
            zAYXKKw = stateListAnimator.copydefault().AYXKKw();
            walletOrAccountType = WalletOrAccountType.WALLET;
        }
        boolean z = zAYXKKw;
        java.lang.String str = strEZpvd;
        WalletOrAccountType walletOrAccountType2 = walletOrAccountType;
        InterfaceC18445fiY interfaceC18445fiY = c17287ezu.AEQbTJ;
        java.lang.String strKWHzl = c17263ezW.KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "WalletDeleteMetricsMonitor";
        }
        interfaceC18445fiY.AEQbTJ(strKWHzl, walletType, str, z, walletOrAccountType2);
    }

    public final void AEQbTJ(@NotNull final C17263ezW c17263ezW, @NotNull final AbstractC17259ezS abstractC17259ezS) {
        Intrinsics.checkNotNullParameter(c17263ezW, "");
        Intrinsics.checkNotNullParameter(abstractC17259ezS, "");
        C11607cUn.OLrzqt(this.EZpvd.copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.ezx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17287ezu.OLrzqt(abstractC17259ezS, this, c17263ezW, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.ezt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17287ezu.AEQbTJ(abstractC17259ezS, this, c17263ezW, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit OLrzqt(AbstractC17259ezS abstractC17259ezS, C17287ezu c17287ezu, C17263ezW c17263ezW, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        OLrzqt(abstractC17259ezS, c17287ezu, c17263ezW, (WalletType) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC17259ezS abstractC17259ezS, C17287ezu c17287ezu, C17263ezW c17263ezW, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        OLrzqt(abstractC17259ezS, c17287ezu, c17263ezW, abstractC12782ctV.QwvEab());
        return Unit.INSTANCE;
    }
}
