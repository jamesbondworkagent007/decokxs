package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.planet_api.PlanetFutureTypeEnum;
import com.okinc.planet_api.PluginChartTimeframeConfig;
import com.okinc.planet_api.model.DefiFeedParams;
import com.okinc.planet_api.model.PlanetNotificationCategory;
import com.okinc.planet_api.model.PlanetProfileSettingsActions;
import com.okinc.planet_api.model.SimpleResp;
import com.okinc.planet_api.model.WSMessageData;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface tWL extends InterfaceC43217rlC {
    java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull PlanetFutureTypeEnum planetFutureTypeEnum, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list, @NotNull java.util.List<? extends java.lang.Object> list2);

    AbstractC32996moC AEQbTJ(@NotNull java.lang.Object obj, java.lang.String str);

    void AEQbTJ(@NotNull android.content.Context context);

    boolean AhwBna();

    androidx.fragment.app.Fragment EZpvd(@NotNull java.lang.String str, @NotNull android.content.Context context);

    PluginChartTimeframeConfig EZpvd(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.Object EZpvd(boolean z, java.lang.String str, java.lang.String str2, PlanetPublisherChannelId planetPublisherChannelId, @NotNull Continuation<? super SimpleResp> continuation);

    void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    boolean EZpvd();

    java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super java.lang.Boolean> continuation);

    void KWHzl(@NotNull android.content.Context context, PlanetNotificationCategory planetNotificationCategory);

    void KWHzl(@NotNull android.content.Context context, @NotNull PlanetProfileSettingsActions planetProfileSettingsActions);

    void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5);

    void KWHzl(@NotNull FragmentActivity fragmentActivity, Function1<? super java.lang.Boolean, Unit> function1);

    PluginChartTimeframeConfig OLrzqt(long j, @NotNull java.lang.String str);

    java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list);

    void OLrzqt(@NotNull FragmentActivity fragmentActivity, android.view.View view, boolean z, Function1<? super kotlin.Pair<java.lang.Boolean, java.lang.String>, Unit> function1);

    java.lang.Object copydefault(int i, java.lang.Long l, @NotNull Continuation<? super SimpleResp> continuation);

    AbstractC32996moC copydefault(@NotNull DefiFeedParams defiFeedParams);

    void copydefault(@NotNull android.content.Context context);

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.util.Map<java.lang.String, java.lang.String> djBIcL();

    Flow<WSMessageData> gEmmrt();

    boolean values();

    public static final class Application {
        public static /* synthetic */ void openUGCDetail$default(tWL twl, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openUGCDetail");
            }
            twl.KWHzl(context, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
        }

        public static /* synthetic */ void openPlanetNotificationCenter$default(tWL twl, android.content.Context context, PlanetNotificationCategory planetNotificationCategory, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPlanetNotificationCenter");
            }
            if ((i & 2) != 0) {
                planetNotificationCategory = PlanetNotificationCategory.All;
            }
            twl.KWHzl(context, planetNotificationCategory);
        }

        public static /* synthetic */ java.lang.Object markOrbitNotificationMsgAsRead$default(tWL twl, int i, java.lang.Long l, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markOrbitNotificationMsgAsRead");
            }
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                l = null;
            }
            return twl.copydefault(i, l, (Continuation<? super SimpleResp>) continuation);
        }

        public static /* synthetic */ PluginChartTimeframeConfig getPlanetFuturesPluginChatConfig$default(tWL twl, long j, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlanetFuturesPluginChatConfig");
            }
            if ((i & 4) != 0) {
                str2 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            }
            return twl.EZpvd(j, str, str2);
        }

        public static /* synthetic */ PluginChartTimeframeConfig getPlanetSpotPluginChatConfig$default(tWL twl, long j, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlanetSpotPluginChatConfig");
            }
            if ((i & 2) != 0) {
                str = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            }
            return twl.OLrzqt(j, str);
        }

        public static /* synthetic */ java.lang.String getPlanetSpotPluginMetaData$default(tWL twl, java.lang.String str, java.lang.Object obj, java.util.List list, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlanetSpotPluginMetaData");
            }
            if ((i & 1) != 0) {
                str = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            }
            return twl.OLrzqt(str, obj, list);
        }

        public static /* synthetic */ java.lang.String getPlanetFuturesPluginMetaData$default(tWL twl, java.lang.String str, PlanetFutureTypeEnum planetFutureTypeEnum, java.lang.Object obj, java.util.List list, java.util.List list2, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlanetFuturesPluginMetaData");
            }
            if ((i & 1) != 0) {
                str = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            }
            return twl.AEQbTJ(str, planetFutureTypeEnum, obj, list, list2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: o.tWL */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showUserCenterPage$default(tWL twl, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, ActivityResultLauncher activityResultLauncher, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showUserCenterPage");
            }
            twl.EZpvd(context, str, str2, str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : activityResultLauncher);
        }

        public static /* synthetic */ java.lang.Object checkOtherUserOrbiterRole$default(tWL twl, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return twl.KWHzl((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (Continuation<? super java.lang.Boolean>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkOtherUserOrbiterRole");
        }

        public static /* synthetic */ void openOrbiterUpgradeFlow$default(tWL twl, FragmentActivity fragmentActivity, android.view.View view, boolean z, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openOrbiterUpgradeFlow");
            }
            if ((i & 2) != 0) {
                view = null;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            twl.OLrzqt(fragmentActivity, view, z, function1);
        }

        public static /* synthetic */ java.lang.Object followUser$default(tWL twl, boolean z, java.lang.String str, java.lang.String str2, PlanetPublisherChannelId planetPublisherChannelId, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: followUser");
            }
            java.lang.String str3 = (i & 2) != 0 ? "" : str;
            java.lang.String str4 = (i & 4) != 0 ? "" : str2;
            if ((i & 8) != 0) {
                planetPublisherChannelId = PlanetPublisherChannelId.FOLLOW_FROM_INNER;
            }
            return twl.EZpvd(z, str3, str4, planetPublisherChannelId, continuation);
        }

        public static /* synthetic */ AbstractC32996moC getOrbitSearchResultFragment$default(tWL twl, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrbitSearchResultFragment");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return twl.AEQbTJ(obj, str);
        }
    }
}
