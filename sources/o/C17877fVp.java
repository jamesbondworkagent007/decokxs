package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fVp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17877fVp {
    public static final Application Companion = new Application(null);
    public static final InterfaceC56387yDm<C17877fVp> AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fVm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C17877fVp.AEQbTJ();
        }
    });

    /* JADX INFO: renamed from: o.fVp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fVp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C17877fVp OLrzqt() {
            return (C17877fVp) C17877fVp.AEQbTJ.getValue();
        }
    }

    public static final C17877fVp AEQbTJ() {
        return new C17877fVp();
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QVMIlx));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.keyboardTargetTextChanged));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DCJXGO), new View.OnClickListener() { // from class: o.fVy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.valueOf(function0, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void valueOf(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Function1<? super ViewOnClickListenerC54939xaY, Unit> function1, @NotNull Function1<? super ViewOnClickListenerC54939xaY, Unit> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hdBMmm));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.clearCurrentKeyboardTarget));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DarRvM), new View.OnClickListener() { // from class: o.fVD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull final Function1<? super ViewOnClickListenerC54939xaY, Unit> function1, @NotNull final Function1<? super ViewOnClickListenerC54939xaY, Unit> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C13754dXa.FragmentManager.RcLksq, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", str))));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DjWNei), new View.OnClickListener() { // from class: o.fVB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.AuCTel(function1, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AxsJAYsNCnLh), new View.OnClickListener() { // from class: o.fVC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.fIwbmz(function12, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AuCTel(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void fIwbmz(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull final Function1<? super ViewOnClickListenerC54939xaY, Unit> function1, @NotNull final Function1<? super ViewOnClickListenerC54939xaY, Unit> function12, @NotNull final Function1<? super ViewOnClickListenerC54939xaY, Unit> function13) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C13754dXa.FragmentManager.OVMstZ, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", str))));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokeSuspendlambda0), new View.OnClickListener() { // from class: o.fVo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.DbNXlk(function1, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DjWNei), new View.OnClickListener() { // from class: o.fVn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.fetchVPNInfo(function12, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.AxsJAYsNCnLh), new View.OnClickListener() { // from class: o.fVz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.ejfBZ(function13, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void DbNXlk(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void fetchVPNInfo(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
    }

    public static final void ejfBZ(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final Function1<? super ViewOnClickListenerC54939xaY, Unit> function1, @NotNull final Function1<? super ViewOnClickListenerC54939xaY, Unit> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C13754dXa.FragmentManager.registerKeyboardTarget, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", str))));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DjWNei), new View.OnClickListener() { // from class: o.fVs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.fARcdN(function1, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AxsJAYsNCnLh), new View.OnClickListener() { // from class: o.fVt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.fJNWhG(function12, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void fARcdN(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void fJNWhG(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final Function1<? super ViewOnClickListenerC54939xaY, Unit> function1, @NotNull final Function1<? super ViewOnClickListenerC54939xaY, Unit> function12, @NotNull final Function1<? super ViewOnClickListenerC54939xaY, Unit> function13) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C13754dXa.FragmentManager.setCurrentKeyboardTarget, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", str))));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokeSuspendlambda0), new View.OnClickListener() { // from class: o.fVw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.isConnected(function1, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DjWNei), new View.OnClickListener() { // from class: o.fVv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.values(function12, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.AxsJAYsNCnLh), new View.OnClickListener() { // from class: o.fVA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.AkhnZx(function13, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void isConnected(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void values(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
    }

    public static final void AkhnZx(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.fVp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showTeeServiceNotAvailableDialog$default(C17877fVp c17877fVp, android.content.Context context, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        c17877fVp.AEQbTJ(context, (Function0<Unit>) function0, (Function0<Unit>) function02);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, final Function0<Unit> function0, final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DkGEDn));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QSbQqJ));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DCJXGO), new View.OnClickListener() { // from class: o.fVl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.EZpvd(function0, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV), new View.OnClickListener() { // from class: o.fVq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.copydefault(function02, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void copydefault(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.fVp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showServiceUnavailableDialog$default(C17877fVp c17877fVp, android.content.Context context, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        c17877fVp.OLrzqt(context, (Function0<Unit>) function0, (Function0<Unit>) function02);
    }

    public final void OLrzqt(@NotNull android.content.Context context, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        showDialog$default(this, context, C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeOnTrimMemoryListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setContentView), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DCJXGO), null, function0, function02, 16, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.fVp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewOnClickListenerC54939xaY showSwitchTeeDialog$default(C17877fVp c17877fVp, android.content.Context context, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        return c17877fVp.EZpvd(context, (Function0<Unit>) function0, (Function0<Unit>) function02);
    }

    public final ViewOnClickListenerC54939xaY EZpvd(@NotNull android.content.Context context, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        return AEQbTJ(context, C33070mpX.AYXKKw(C13754dXa.FragmentManager.fdazkH), C33070mpX.AYXKKw(C13754dXa.FragmentManager.QSusPL), C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTransportControlEnabled), C33070mpX.AYXKKw(C13754dXa.FragmentManager.AxsJAYsNCnLh), function0, function02);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onExtraCallback));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IPostMessageServiceStub));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DCJXGO), new View.OnClickListener() { // from class: o.fVx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17877fVp.EZpvd(function0, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fVp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showWalletIsNotExistDialog$default(C17877fVp c17877fVp, android.content.Context context, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c17877fVp.EZpvd(context, (Function0<Unit>) function0);
    }

    public final void EZpvd(@NotNull android.content.Context context, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.QVMIlxQVMIlx, 0, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.fVp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewOnClickListenerC54939xaY showDialog$default(C17877fVp c17877fVp, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        return c17877fVp.AEQbTJ(context, str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : function0, (i & 64) != 0 ? null : function02);
    }

    public final ViewOnClickListenerC54939xaY AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, final Function0<Unit> function0, final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        if (str3 != null) {
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) str3, new View.OnClickListener() { // from class: o.fVu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C17877fVp.gEmmrt(function0, viewOnClickListenerC54939xaY, view);
                }
            });
        }
        if (str4 != null) {
            viewOnClickListenerC54939xaY.AEQbTJ(str4, new View.OnClickListener() { // from class: o.fVr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C17877fVp.AhwBna(function02, viewOnClickListenerC54939xaY, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
        return viewOnClickListenerC54939xaY;
    }

    public static final void gEmmrt(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AhwBna(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
        viewOnClickListenerC54939xaY.dismiss();
    }
}
