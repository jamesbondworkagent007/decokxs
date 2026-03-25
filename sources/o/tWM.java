package o;

import com.okinc.planet_api.ActivityCard;
import com.okinc.planet_api.PlanetShareConfig;
import com.okinc.planet_api.RichShareToFeedImage;
import com.okinc.planet_api.ShareTopic;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface tWM extends InterfaceC43217rlC {
    android.view.View AEQbTJ(@NotNull android.content.Context context, @NotNull PlanetPublisherPluginType planetPublisherPluginType, @NotNull java.lang.String str, @NotNull PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType);

    java.lang.Object EZpvd(@NotNull android.content.Context context, PlanetPublisherChannelId planetPublisherChannelId, java.util.Map<java.lang.String, ? extends java.lang.Object> map, android.view.View view, android.os.Bundle bundle, boolean z, @NotNull Continuation<? super Unit> continuation);

    PlanetShareConfig KWHzl(@NotNull PlanetPublisherPluginType planetPublisherPluginType, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    void KWHzl(@NotNull tWX twx);

    PlanetShareConfig OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<ShareTopic> list, @NotNull java.util.List<RichShareToFeedImage> list2, ActivityCard activityCard);

    java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.List<ShareTopic> list, @NotNull java.util.List<RichShareToFeedImage> list2, PlanetPublisherChannelId planetPublisherChannelId, android.view.View view, android.os.Bundle bundle, boolean z, @NotNull Continuation<? super Unit> continuation);

    boolean valueOf();

    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.tWM */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object openPublishPage$default(tWM twm, android.content.Context context, java.lang.String str, java.util.List list, java.util.List list2, PlanetPublisherChannelId planetPublisherChannelId, android.view.View view, android.os.Bundle bundle, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return twm.copydefault(context, str, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? yDY.AhwBna() : list2, (i & 16) != 0 ? null : planetPublisherChannelId, (i & 32) != 0 ? null : view, (i & 64) != 0 ? null : bundle, (i & 128) != 0 ? false : z, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPublishPage");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.tWM */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object openPublishPage$default(tWM twm, android.content.Context context, PlanetPublisherChannelId planetPublisherChannelId, java.util.Map map, android.view.View view, android.os.Bundle bundle, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return twm.EZpvd(context, (i & 2) != 0 ? null : planetPublisherChannelId, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : view, (i & 16) != 0 ? null : bundle, (i & 32) != 0 ? false : z, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPublishPage");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tWM */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PlanetShareConfig composeRichTextShareToFeedConfig$default(tWM twm, java.lang.String str, java.util.List list, java.util.List list2, ActivityCard activityCard, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: composeRichTextShareToFeedConfig");
            }
            if ((i & 2) != 0) {
                list = yDY.AhwBna();
            }
            if ((i & 4) != 0) {
                list2 = yDY.AhwBna();
            }
            if ((i & 8) != 0) {
                activityCard = null;
            }
            return twm.OLrzqt(str, list, list2, activityCard);
        }
    }
}
