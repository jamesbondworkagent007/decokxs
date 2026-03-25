package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.data.constant.AddressTrackerUserAction;
import com.okinc.business.market.features.address_tracker.domain.AddressTrackerNotification;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementBaseActivity$checkLoginStatus$2;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementBaseActivity$handleLoginFlow$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementBaseActivity$onFilterClick$1$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementBaseActivity$onFilterClick$1$2;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementBaseActivity$openNotification$1;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.filter.ui.FilterAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.jUZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jFo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractActivityC25766jFo extends AbstractActivityC33013moT implements jUZ, InterfaceC25770jFs {
    public abstract AbstractC25769jFr AYXKKw();

    @Override // o.jUZ
    public void KWHzl(@NotNull TokenFilter tokenFilter) {
        jUZ.TaskDescription.KWHzl(this, tokenFilter);
    }

    public final void EZpvd(@NotNull jFL jfl) {
        Intrinsics.checkNotNullParameter(jfl, "");
        AEQbTJ(jfl.OLrzqt(), jfl.EZpvd(), jfl.gEmmrt());
    }

    public final void EZpvd(@NotNull jEP jep) {
        Intrinsics.checkNotNullParameter(jep, "");
        AEQbTJ(jep.KWHzl(), jep.OLrzqt(), jep.gEmmrt());
    }

    @Override // o.jUZ
    public void AEQbTJ(@NotNull final FilterAction filterAction, @NotNull final TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(filterAction, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        EZpvd(new Function0() { // from class: o.jFt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractActivityC25766jFo.EZpvd(filterAction, this, tokenFilter);
            }
        });
    }

    public static final Unit EZpvd(FilterAction filterAction, AbstractActivityC25766jFo abstractActivityC25766jFo, TokenFilter tokenFilter) {
        if (filterAction instanceof FilterAction.Delete) {
            jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.DELETE_ALERT);
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC25766jFo), null, null, new TrackerAddressManagementBaseActivity$onFilterClick$1$1(abstractActivityC25766jFo, tokenFilter, filterAction, null), 3, null);
        } else {
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC25766jFo), null, null, new TrackerAddressManagementBaseActivity$onFilterClick$1$2(filterAction, abstractActivityC25766jFo, tokenFilter, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerAddressManagementBaseActivity$openNotification$1(z, this, str, str2, null), 3, null);
    }

    public final void copydefault(@NotNull AddressTrackerNotification addressTrackerNotification) {
        Intrinsics.checkNotNullParameter(addressTrackerNotification, "");
        new jEK(this, addressTrackerNotification).copydefault().show(getSupportFragmentManager(), jUM.class.getSimpleName());
    }

    public final java.util.List<AddressTrackerUserAction> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy") ? C56402yEa.EZpvd(AddressTrackerUserAction.BUY) : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "sell") ? C56402yEa.EZpvd(AddressTrackerUserAction.SELL) : yDY.AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jFo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkLoginStatus$default(AbstractActivityC25766jFo abstractActivityC25766jFo, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkLoginStatus");
        }
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: o.jFp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractActivityC25766jFo.fJNWhG();
                }
            };
        }
        abstractActivityC25766jFo.EZpvd((Function0<Unit>) function0);
    }

    public static final Unit fJNWhG() {
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerAddressManagementBaseActivity$checkLoginStatus$2(this, function0, null), 3, null);
    }

    public final void OLrzqt(Function0<Unit> function0) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerAddressManagementBaseActivity$handleLoginFlow$1(this, function0, null), 3, null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
