package o;

import com.okinc.business.defi.biz.core.password.CredentialState;
import com.okinc.business.defi.biz.core.password.PasswordCheckResult;
import com.okinc.business.defi.biz.core.password.PasswordErrorInfo;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bzJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11010bzJ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final cPU AEQbTJ;
    public final long EZpvd;
    public final int OLrzqt;
    public final long copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final PasswordCheckResult copydefault(PasswordCheckResult passwordCheckResult, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return passwordCheckResult;
    }

    public C11010bzJ(@NotNull cPU cpu) {
        Intrinsics.checkNotNullParameter(cpu, "");
        this.AEQbTJ = cpu;
        this.gEmmrt = "PasswordManager";
        this.copydefault = 7200000L;
        this.EZpvd = 3600000L;
        this.OLrzqt = 5;
    }

    /* JADX INFO: renamed from: o.bzJ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bzJ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C11010bzJ getInstance$default(ActionBar actionBar, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return actionBar.KWHzl(context);
        }

        public final C11010bzJ KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).fARcdN();
        }
    }

    public final AbstractC58260yxt<Unit> AEQbTJ(@NotNull final java.lang.String str, boolean z, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C10856bwO.copydefault(this.gEmmrt, 0, "savePassword from=" + str2);
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = this.AEQbTJ.copydefault(str, z);
        final Function1 function1 = new Function1() { // from class: o.bzG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.KWHzl(str2, str, (Unit) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bzK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11010bzJ.zLjUOn(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bzZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.gEmmrt(str2, (java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault2.OLrzqt(new InterfaceC58227yxM() { // from class: o.bAi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11010bzJ.AxsJAY(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final Unit zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        C14558dni.trackPasswordEvent$default(true, "savePassword[" + str + "]", null, 4, null);
        C8342bAs.Companion.EZpvd().OLrzqt(str2);
        return Unit.INSTANCE;
    }

    public static final void AxsJAY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(java.lang.String str, java.lang.Throwable th) {
        C14558dni.OLrzqt(false, "savePassword[" + str + "]", th);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<java.lang.Boolean> KWHzl(@NotNull java.lang.String str, @NotNull final java.lang.String str2, boolean z, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C10856bwO.copydefault(this.gEmmrt, 0, "changePassword from=" + str3);
        AbstractC58260yxt<Unit> abstractC58260yxtAEQbTJ = this.AEQbTJ.AEQbTJ(str, str2, z);
        final Function1 function1 = new Function1() { // from class: o.bAa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.EZpvd(str3, str2, (Unit) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.bAf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11010bzJ.fIwbmz(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.KWHzl(str3, (java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58227yxM() { // from class: o.bAj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11010bzJ.getNewProxyInstance(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dni.trackPasswordEvent$default(boolean, java.lang.String, java.lang.Throwable, int, java.lang.Object):void */
    public static final InterfaceC58261yxu EZpvd(java.lang.String str, final java.lang.String str2, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        C14558dni.trackPasswordEvent$default(true, "changePassword[" + str + "]", null, 4, null);
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.bAk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.copydefault(str2, (java.util.List) obj);
            }
        };
        return abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.bAn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11010bzJ.fJNWhG(function1, obj);
            }
        });
    }

    public static final java.lang.Boolean fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean copydefault(java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C8342bAs.Companion.EZpvd().OLrzqt(str);
        C8392bBp.copydefault.copydefault();
        return java.lang.Boolean.TRUE;
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.Throwable th) {
        C14558dni.OLrzqt(false, "changePassword[" + str + "]", th);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> EZpvd(@NotNull java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C10856bwO.copydefault(this.gEmmrt, 0, "savePasswordRaw from=" + str2);
        AbstractC58260yxt<Unit> abstractC58260yxtAEQbTJ = this.AEQbTJ.AEQbTJ(str);
        final Function1 function1 = new Function1() { // from class: o.bzM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.KWHzl(str2, (Unit) obj);
            }
        };
        AbstractC58260yxt<Unit> abstractC58260yxtKWHzl = abstractC58260yxtAEQbTJ.KWHzl(new InterfaceC58227yxM() { // from class: o.bzS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11010bzJ.zuBGHE(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bzU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.AYXKKw(str2, (java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58227yxM() { // from class: o.bzT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11010bzJ.OcIXYQ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void zuBGHE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.String str, Unit unit) {
        C14558dni.trackPasswordEvent$default(true, "savePasswordRaw[" + str + "]", null, 4, null);
        return Unit.INSTANCE;
    }

    public static final void OcIXYQ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(java.lang.String str, java.lang.Throwable th) {
        C14558dni.OLrzqt(false, "savePasswordRaw[" + str + "]", th);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C10856bwO.copydefault(this.gEmmrt, 0, "deletePasswordRaw");
        return this.AEQbTJ.copydefault(str);
    }

    public final AbstractC58260yxt<java.lang.String> AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.KWHzl(str);
    }

    public final AbstractC58260yxt<java.lang.Boolean> EZpvd() {
        return this.AEQbTJ.KWHzl();
    }

    public final AbstractC58260yxt<java.lang.Boolean> AEQbTJ() {
        return this.AEQbTJ.copydefault();
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.lang.String> AYXKKw(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt = this.AEQbTJ.OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.bAl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.KWHzl(str, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtKWHzl = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58227yxM() { // from class: o.bAm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11010bzJ.AubY(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bAq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.djBIcL(str, (java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58227yxM() { // from class: o.bAp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11010bzJ.wlaJM(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2) {
        C14558dni.trackPasswordEvent$default(true, "getPassword[" + str + "]", null, 4, null);
        return Unit.INSTANCE;
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(java.lang.String str, java.lang.Throwable th) {
        C14558dni.OLrzqt(false, "getPassword[" + str + "]", th);
        return Unit.INSTANCE;
    }

    public final java.lang.String OLrzqt() {
        return xXX.EZpvd.copydefault();
    }

    public static final InterfaceC58261yxu uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public final AbstractC58260yxt<PasswordCheckResult> OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<PasswordCheckResult> abstractC58260yxtKWHzl = KWHzl();
        final Function1 function1 = new Function1() { // from class: o.bzL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.AEQbTJ(this.EZpvd, str, (PasswordCheckResult) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.bzP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11010bzJ.uzCIH(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bzN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.KWHzl(this.EZpvd, (PasswordCheckResult) obj);
            }
        };
        AbstractC58260yxt<PasswordCheckResult> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bzO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11010bzJ.iwGUEr(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu AEQbTJ(C11010bzJ c11010bzJ, java.lang.String str, PasswordCheckResult passwordCheckResult) {
        Intrinsics.checkNotNullParameter(passwordCheckResult, "");
        if (passwordCheckResult.isPassed()) {
            return c11010bzJ.copydefault(str);
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(passwordCheckResult);
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C11010bzJ c11010bzJ, final PasswordCheckResult passwordCheckResult) {
        Intrinsics.checkNotNullParameter(passwordCheckResult, "");
        if (passwordCheckResult.isPassed()) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtAYXKKw = c11010bzJ.AEQbTJ.AYXKKw();
            final Function1 function1 = new Function1() { // from class: o.bzR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11010bzJ.copydefault(passwordCheckResult, (java.lang.Integer) obj);
                }
            };
            InterfaceC58261yxu interfaceC58261yxuCopydefault = abstractC58260yxtAYXKKw.copydefault(new InterfaceC58229yxO() { // from class: o.bzQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C11010bzJ.hDKMBd(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58261yxuCopydefault, "");
            return interfaceC58261yxuCopydefault;
        }
        if (!passwordCheckResult.isLocked()) {
            return c11010bzJ.AYXKKw();
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(passwordCheckResult);
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final PasswordCheckResult hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PasswordCheckResult) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<com.okinc.business.defi.biz.core.password.PasswordCheckResult> */
    public final AbstractC58260yxt<PasswordCheckResult> KWHzl() {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtEZpvd = this.AEQbTJ.EZpvd();
        final Function1 function1 = new Function1() { // from class: o.bzX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtEZpvd.OLrzqt(new InterfaceC58229yxO() { // from class: o.bzV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11010bzJ.AuCTelauCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu AEQbTJ(C11010bzJ c11010bzJ, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return AbstractC58260yxt.copydefault(PasswordCheckResult.Companion.OLrzqt());
        }
        PasswordErrorInfo passwordErrorInfo = (PasswordErrorInfo) C33490mxT.EZpvd(C59449zhJ.replace$default(str, "\\", "", false, 4, (java.lang.Object) null), PasswordErrorInfo.class);
        if ((passwordErrorInfo != null ? passwordErrorInfo.getLockTime() : null) != null) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Long lockTime = passwordErrorInfo.getLockTime();
            long jLongValue = lockTime != null ? lockTime.longValue() : 0L;
            long j = c11010bzJ.copydefault;
            if (jCurrentTimeMillis - jLongValue > j) {
                AbstractC58260yxt<java.lang.Integer> abstractC58260yxtAYXKKw = c11010bzJ.AEQbTJ.AYXKKw();
                final Function1 function1 = new Function1() { // from class: o.bAc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C11010bzJ.KWHzl((java.lang.Integer) obj);
                    }
                };
                return abstractC58260yxtAYXKKw.copydefault(new InterfaceC58229yxO() { // from class: o.bAe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C11010bzJ.zsXlph(function1, obj);
                    }
                });
            }
            PasswordCheckResult.StateListAnimator stateListAnimator = PasswordCheckResult.Companion;
            java.lang.Long lockTime2 = passwordErrorInfo.getLockTime();
            return AbstractC58260yxt.copydefault(stateListAnimator.copydefault(j - (jCurrentTimeMillis - (lockTime2 != null ? lockTime2.longValue() : 0L))));
        }
        return AbstractC58260yxt.copydefault(PasswordCheckResult.Companion.OLrzqt());
    }

    public static final PasswordCheckResult zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PasswordCheckResult) function1.invoke(obj);
    }

    public static final PasswordCheckResult KWHzl(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return PasswordCheckResult.Companion.OLrzqt();
    }

    public static final PasswordCheckResult getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PasswordCheckResult) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<com.okinc.business.defi.biz.core.password.PasswordCheckResult> */
    public final AbstractC58260yxt<PasswordCheckResult> copydefault(java.lang.String str) {
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtOLrzqt = this.AEQbTJ.OLrzqt(str);
        final Function1 function1 = new Function1() { // from class: o.bAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.KWHzl((java.lang.Boolean) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bAr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11010bzJ.getFieldNames(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final PasswordCheckResult KWHzl(java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            return PasswordCheckResult.Companion.OLrzqt();
        }
        return PasswordCheckResult.Companion.EZpvd(1);
    }

    public static final PasswordErrorInfo gHZMYf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PasswordErrorInfo) function1.invoke(obj);
    }

    public final AbstractC58260yxt<PasswordCheckResult> AYXKKw() {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtEZpvd = this.AEQbTJ.EZpvd();
        final Function1 function1 = new Function1() { // from class: o.bzY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.KWHzl((java.lang.String) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.bzW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11010bzJ.gHZMYf(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bAd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11010bzJ.copydefault(this.KWHzl, (PasswordErrorInfo) obj);
            }
        };
        AbstractC58260yxt<PasswordCheckResult> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bAb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11010bzJ.sSMYrx(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final PasswordErrorInfo KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return new PasswordErrorInfo();
        }
        return (PasswordErrorInfo) C33490mxT.EZpvd(C59449zhJ.replace$default(str, "\\", "", false, 4, (java.lang.Object) null), PasswordErrorInfo.class);
    }

    public static final InterfaceC58261yxu sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(final C11010bzJ c11010bzJ, PasswordErrorInfo passwordErrorInfo) {
        Intrinsics.checkNotNullParameter(passwordErrorInfo, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        passwordErrorInfo.getErrorTimes().add(java.lang.Long.valueOf(jCurrentTimeMillis));
        java.util.ArrayList<java.lang.Long> errorTimes = passwordErrorInfo.getErrorTimes();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : errorTimes) {
            if (jCurrentTimeMillis - ((java.lang.Number) obj).longValue() < c11010bzJ.EZpvd) {
                arrayList.add(obj);
            }
        }
        final int size = arrayList.size();
        if (size >= c11010bzJ.OLrzqt) {
            passwordErrorInfo.setLockTime(java.lang.Long.valueOf(jCurrentTimeMillis));
        }
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtEZpvd = c11010bzJ.AEQbTJ.EZpvd(passwordErrorInfo.toJson());
        final Function1 function1 = new Function1() { // from class: o.bAg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C11010bzJ.OLrzqt(size, c11010bzJ, (java.lang.Long) obj2);
            }
        };
        return abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.bAo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C11010bzJ.AwvSrB(function1, obj2);
            }
        });
    }

    public static final PasswordCheckResult AwvSrB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PasswordCheckResult) function1.invoke(obj);
    }

    public static final PasswordCheckResult OLrzqt(int i, C11010bzJ c11010bzJ, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        int i2 = c11010bzJ.OLrzqt;
        if (i >= i2) {
            return PasswordCheckResult.Companion.copydefault(c11010bzJ.copydefault);
        }
        return PasswordCheckResult.Companion.EZpvd(i2 - i);
    }

    public final CredentialState copydefault() {
        java.lang.Object objM7377constructorimpl;
        CredentialState credentialState;
        try {
            Result.Application application = Result.Companion;
            if (!C14471dmA.EZpvd.copydefault()) {
                credentialState = CredentialState.MANUAL_PASSWORD;
            } else {
                credentialState = this.AEQbTJ.AEQbTJ() ? CredentialState.SECRET_KEY_EXISTS : CredentialState.SECRET_KEY_NOT_EXISTS;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(credentialState);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C10856bwO.copydefault(this.gEmmrt, -1, "CredentialState error: " + thM7380exceptionOrNullimpl.getMessage());
            objM7377constructorimpl = CredentialState.NONE;
        }
        return (CredentialState) objM7377constructorimpl;
    }
}
