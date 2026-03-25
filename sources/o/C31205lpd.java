package o;

import android.view.View;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC23194htd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31205lpd {
    public static final void AEQbTJ(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final java.lang.String str, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        C32866mlf.onEvent$default("Onboarding_BackupNotice_Popup_View", (TrackChannel[]) null, new Function1() { // from class: o.lph
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31205lpd.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(abstractActivityC33041mov);
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.generateRandomNumber);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.doDispatch));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultRegistryLifecycleContainer), new View.OnClickListener() { // from class: o.lpg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C31205lpd.EZpvd(str, abstractActivityC33041mov, fragmentManager, interfaceC9738bbJ, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.registerKey, new View.OnClickListener() { // from class: o.lpi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C31205lpd.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final void EZpvd(java.lang.String str, AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC9738bbJ interfaceC9738bbJ, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C32866mlf.onEvent$default("Onboarding_BackupNotice_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.lpj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31205lpd.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        InterfaceC23194htd.Application.routeBackupWallet$default(C22380heK.OLrzqt.copydefault(str).fARcdN(), abstractActivityC33041mov, fragmentManager, interfaceC9738bbJ, null, 8, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, DexTrackEventParameter.ButtonName.BACK_UP.getValue(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C32866mlf.onEvent$default("Onboarding_BackupNotice_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.lpb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31205lpd.valueOf((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, DexTrackEventParameter.ButtonName.CANCEL.getValue(), false, 4, null);
        return Unit.INSTANCE;
    }
}
