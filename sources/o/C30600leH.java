package o;

import android.view.View;
import com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC30595leC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.leH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30600leH implements InterfaceC30601leI {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final androidx.fragment.app.Fragment AEQbTJ;
    public final OrderRetryHelper AhwBna;
    public final C21667hHw EZpvd;
    public final InterfaceC30641lew KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.OLrzqt = z;
    }

    public C30600leH(@NotNull androidx.fragment.app.Fragment fragment, @NotNull C21667hHw c21667hHw, @NotNull InterfaceC30641lew interfaceC30641lew, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(c21667hHw, "");
        Intrinsics.checkNotNullParameter(interfaceC30641lew, "");
        this.AEQbTJ = fragment;
        this.EZpvd = c21667hHw;
        this.KWHzl = interfaceC30641lew;
        this.OLrzqt = z;
        this.AhwBna = new OrderRetryHelper("AdvancedModeErrorHandlerImpl");
        c21667hHw.KWHzl.AYXKKw().setContentDescription("web3_dex_reminder_action");
    }

    /* JADX INFO: renamed from: o.leH$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.leH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC30601leI
    public void KWHzl(InterfaceC30595leC interfaceC30595leC) {
        if (interfaceC30595leC instanceof InterfaceC30595leC.ClipData) {
            copydefault(((InterfaceC30595leC.ClipData) interfaceC30595leC).OLrzqt());
            return;
        }
        if (interfaceC30595leC instanceof InterfaceC30595leC.ComponentCallbacks2) {
            InterfaceC30595leC.ComponentCallbacks2 componentCallbacks2 = (InterfaceC30595leC.ComponentCallbacks2) interfaceC30595leC;
            EZpvd(componentCallbacks2.EZpvd(), componentCallbacks2.copydefault(), componentCallbacks2.AEQbTJ(), componentCallbacks2.KWHzl());
            return;
        }
        if (interfaceC30595leC instanceof InterfaceC30595leC.Dialog) {
            InterfaceC30595leC.Dialog dialog = (InterfaceC30595leC.Dialog) interfaceC30595leC;
            EZpvd(dialog.KWHzl(), dialog.OLrzqt(), dialog.EZpvd(), dialog.copydefault(), dialog.AEQbTJ());
            return;
        }
        if (interfaceC30595leC instanceof InterfaceC30595leC.Intent) {
            EZpvd(((InterfaceC30595leC.Intent) interfaceC30595leC).OLrzqt());
            return;
        }
        if (interfaceC30595leC instanceof InterfaceC30595leC.AssistContent) {
            if (OLrzqt()) {
                C55326xho.toast$default(C23274hvD.Fragment.IResultReceiver2_Parcel, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return;
            }
            return;
        }
        if (interfaceC30595leC instanceof InterfaceC30595leC.BroadcastReceiver) {
            if (OLrzqt()) {
                C55326xho.toast$default(C23274hvD.Fragment.ResultReceiver, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        } else {
            if (interfaceC30595leC instanceof InterfaceC30595leC.VoiceInteractor) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.IResultReceiver2StubProxy);
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.RKcVTr);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.htlTjW));
                } else {
                    drawableKWHzl = null;
                }
                C55326xho.toast$default(strAYXKKw, drawableKWHzl, 0, (java.lang.Integer) null, 0, 0, 30, (java.lang.Object) null);
                return;
            }
            C55173xeu c55173xeu = this.EZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
        }
    }

    public final boolean OLrzqt() {
        return (!this.AEQbTJ.isVisible() || !this.AEQbTJ.isAdded() || this.AEQbTJ.isRemoving() || this.AEQbTJ.isDetached() || this.AEQbTJ.isHidden()) ? false : true;
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, Function0<Unit> function0) {
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "10052")) {
            if (str == null) {
                str = "";
            }
            AEQbTJ(str, z, str3, function0);
        } else {
            C55173xeu c55173xeu = this.EZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
        }
    }

    public final void copydefault(java.lang.String str) {
        this.EZpvd.DbNXlk.AEQbTJ();
    }

    public final void EZpvd(java.lang.Throwable th, final java.lang.String str, final java.lang.String str2, final Function1<? super java.lang.Boolean, Unit> function1) {
        if (th == null) {
            EZpvd(str, str2);
            this.AhwBna.EZpvd();
        } else {
            pUU.KWHzl("AdvancedModeErrorHandlerImpl", "handleOrderError failure, entering retry handler");
            this.AhwBna.AEQbTJ(th, new Function1() { // from class: o.leL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C30600leH.EZpvd(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            }, new Function1() { // from class: o.leK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C30600leH.OLrzqt(this.copydefault, str, str2, (java.lang.Throwable) obj);
                }
            }, "RETRY -> handleOrderError: JWT error, start auth", "RETRY -> handleOrderError: Quota exceeded, retry with manual sign");
        }
    }

    public static final Unit EZpvd(Function1 function1, boolean z) {
        pUU.KWHzl("AdvancedModeErrorHandlerImpl", "handleOrderError retryAction invoked, forceManualSign=" + z);
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C30600leH c30600leH, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c30600leH.EZpvd(str, str2);
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "10052")) {
            return;
        }
        pUU.copydefault("AdvancedModeErrorHandlerImpl", "handleOrderError: Non - JWT, show order error toast: " + str);
        C55328xhq.show$default(C55328xhq.OLrzqt, (str2 == null || str2.length() == 0) ? C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating) : str2, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
    }

    public final void EZpvd(final Function0<Unit> function0) {
        OLrzqt(true, 8, C33070mpX.AYXKKw(C23274hvD.Fragment.ikIEnW), C33070mpX.AYXKKw(C23274hvD.Fragment.heceqZ), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplApi213), new Function0() { // from class: o.leJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30600leH.copydefault(this.AEQbTJ, function0);
            }
        });
    }

    public static final Unit copydefault(C30600leH c30600leH, Function0 function0) {
        c30600leH.EZpvd.gEmmrt.KWHzl(0L);
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str, boolean z, java.lang.String str2, final Function0<Unit> function0) {
        android.content.Context context = this.EZpvd.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.String strKWHzl = C33069mpW.KWHzl(context, C23274hvD.Fragment.IMediaControllerCallbackStubProxy, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("nativeToken", str)));
        if (str2 == null || str2.length() == 0) {
            str2 = strKWHzl;
        }
        android.content.Context context2 = this.EZpvd.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context2);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        if (z) {
            viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.adjustVolume, new View.OnClickListener() { // from class: o.leM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30600leH.EZpvd(viewOnClickListenerC54939xaY, function0, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.DDxOgT, new View.OnClickListener() { // from class: o.leN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30600leH.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(boolean z, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, final Function0<Unit> function0) {
        final C55173xeu c55173xeu = this.EZpvd.AEQbTJ;
        Intrinsics.copydefault(c55173xeu);
        c55173xeu.setVisibility(z ? 0 : 8);
        c55173xeu.setEmptyTypeImage(i);
        c55173xeu.setTitle(str);
        c55173xeu.setSubTitle((java.lang.CharSequence) str2);
        c55173xeu.setRetry(str3);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.leQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30600leH.KWHzl(c55173xeu, function0, view);
            }
        });
        C22281hcR c22281hcR = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c22281hcR, "");
        c22281hcR.setVisibility(8);
        C55113xdn c55113xdn = this.EZpvd.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(8);
    }

    public static final void KWHzl(C55173xeu c55173xeu, Function0 function0, android.view.View view) {
        Intrinsics.copydefault(c55173xeu);
        c55173xeu.setVisibility(8);
        if (function0 != null) {
            function0.invoke();
        }
    }
}
