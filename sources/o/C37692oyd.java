package o;

import android.view.View;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.DeeplinkType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oyd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37692oyd {
    public static final C37692oyd copydefault = new C37692oyd();

    /* JADX INFO: renamed from: o.oyd$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DeeplinkType.values().length];
            try {
                iArr[DeeplinkType.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DeeplinkType.EXCHANGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DeeplinkType.WEB3.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    private C37692oyd() {
    }

    public final void EZpvd(@NotNull final android.app.Activity activity, @NotNull DeeplinkType deeplinkType, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(deeplinkType, "");
        Intrinsics.checkNotNullParameter(function0, "");
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
        int i = StateListAnimator.EZpvd[deeplinkType.ordinal()];
        if (i == 1) {
            function0.invoke();
            return;
        }
        if (i == 2) {
            if (interfaceC33171mrS.fIwbmz()) {
                OLrzqt(activity, C33070mpX.AYXKKw(C35399nuc.LoaderManager.getAdvertisingId), C33070mpX.AYXKKw(C35399nuc.LoaderManager.frkDMe), C33070mpX.AYXKKw(C35399nuc.LoaderManager.AubY), new Function0() { // from class: o.oyc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C37692oyd.copydefault(activity, function0);
                    }
                });
                return;
            } else {
                function0.invoke();
                return;
            }
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!interfaceC33171mrS.fIwbmz()) {
            OLrzqt(activity, C33070mpX.AYXKKw(C35399nuc.LoaderManager.DcMfJKsuEgdN), C33070mpX.AYXKKw(C35399nuc.LoaderManager.DcMfJKgMxgjU), C33070mpX.AYXKKw(C35399nuc.LoaderManager.DcMfJKsfEqpH), new Function0() { // from class: o.oyh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C37692oyd.EZpvd(function0);
                }
            });
        } else {
            function0.invoke();
        }
    }

    public static final Unit copydefault(android.app.Activity activity, Function0 function0) {
        C35169nqJ.AEQbTJ.KWHzl(activity);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final ViewOnClickListenerC54939xaY OLrzqt(android.app.Activity activity, java.lang.CharSequence charSequence, java.lang.String str, java.lang.String str2, final Function0<Unit> function0) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.EZpvd(charSequence);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) str, new View.OnClickListener() { // from class: o.oye
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C37692oyd.OLrzqt(function0, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(str2, new View.OnClickListener() { // from class: o.oya
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C37692oyd.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
        return viewOnClickListenerC54939xaY;
    }

    public static final void OLrzqt(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
