package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.planet.deeplink.handler.PlanetPostPublisherDeeplinkHandler$executeDeeplink$1;
import com.okinc.planet_api.ActivityCard;
import com.okinc.planet_api.RichShareToFeedConfig;
import com.okinc.planet_api.RichShareToFeedImage;
import com.okinc.planet_api.ShareTopic;
import com.okinc.planet_api.WebRichShareToFeedConfig;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tPC implements InterfaceC43234rlT {
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        RichShareToFeedConfig richShareToFeedConfig;
        java.lang.String str;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("data");
        try {
            str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("PlanetPostPublisherDeeplinkHandler", "Failed to decode data to RichShareToFeedConfig", e);
        }
        if (str != null) {
            WebRichShareToFeedConfig webRichShareToFeedConfig = (WebRichShareToFeedConfig) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) WebRichShareToFeedConfig.Companion.serializer(), str);
            java.lang.String content = webRichShareToFeedConfig.getContent();
            java.util.ArrayList<ShareTopic> topics = webRichShareToFeedConfig.getTopics();
            java.util.ArrayList<java.lang.String> imageList = webRichShareToFeedConfig.getImageList();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(imageList, 10));
            java.util.Iterator<T> it = imageList.iterator();
            while (it.hasNext()) {
                arrayList.add(new RichShareToFeedImage((java.lang.String) null, (java.lang.String) it.next(), (java.lang.String) null, 5, (DefaultConstructorMarker) null));
            }
            richShareToFeedConfig = new RichShareToFeedConfig(content, topics, (java.util.ArrayList) CollectionsKt___CollectionsKt.OLrzqt(arrayList, new java.util.ArrayList()), (ActivityCard) null, 8, (DefaultConstructorMarker) null);
        } else {
            richShareToFeedConfig = null;
        }
        if (context instanceof LifecycleOwner) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) context), null, null, new PlanetPostPublisherDeeplinkHandler$executeDeeplink$1(context, richShareToFeedConfig, null), 3, null);
        }
    }
}
