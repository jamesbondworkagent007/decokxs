package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_userprofile.common.PlanetUserProfileShareUtils$share$2;
import com.okinc.planet.biz_userprofile.common.PlanetUserProfileShareUtils$share$3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.InterfaceC46198tLl;
import o.tKS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tKT {
    public static final tKT OLrzqt = new tKT();

    private tKT() {
    }

    public final void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull C46189tLc c46189tLc, java.lang.String str, @NotNull final java.lang.String str2, @NotNull java.lang.String str3, @NotNull final java.lang.String str4, InterfaceC46198tLl interfaceC46198tLl) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(c46189tLc, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC46198tLl.Activity activity = InterfaceC46198tLl.Activity.OLrzqt;
        final java.lang.String str5 = Intrinsics.EZpvd(interfaceC46198tLl, activity) ? "feeds" : "pnl";
        C32866mlf.onEvent$default("CopyTrading_Full_Share_Click", (TrackChannel[]) null, new Function1() { // from class: o.tKW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tKT.OLrzqt(str2, str4, str5, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (Intrinsics.EZpvd(interfaceC46198tLl, activity)) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new PlanetUserProfileShareUtils$share$2(abstractActivityC33041mov, str3, str2, c46189tLc, str, interfaceC46198tLl, null), 3, null);
        } else if (interfaceC46198tLl instanceof InterfaceC46198tLl.Application) {
            tTP.OLrzqt(new tKS.TaskStackBuilder(str3, str4, null));
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new PlanetUserProfileShareUtils$share$3(abstractActivityC33041mov, str3, str2, c46189tLc, interfaceC46198tLl, null), 3, null);
        }
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(AppsFlyerProperties.CHANNEL, "homepage", true);
        eventParamsList.put("type", C46188tLb.KWHzl(str), true);
        eventParamsList.put("page", str2, true);
        eventParamsList.put("sharetype", str3, true);
        return Unit.INSTANCE;
    }
}
