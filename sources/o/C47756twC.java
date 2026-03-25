package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.planet.biz_content.share.OKPlanetSharePerformer$goPublisherPage$1;
import com.okinc.planet_api.PlanetShareConfig;
import com.okinc.planet_api.PlanetShareTypeEnum;
import com.okinc.planet_api.PluginShareToFeedConfig;
import com.okinc.planet_api.RichShareToFeedConfig;
import com.okinc.planet_api.RichShareToFeedImage;
import com.okinc.planet_api.WebRichShareToFeedConfig;
import com.okinc.rxutils.RxBus;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareType;
import com.okinc.share.platforms.SharePlatform;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.DeserializationStrategy;
import o.C47501trL;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.twC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47756twC implements InterfaceC49121uia {
    public java.util.List<java.lang.String> EZpvd;
    public final SharePlatform KWHzl = SharePlatform.SHARE_TO_PLANET;
    public java.lang.String copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.twC$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ShareType.values().length];
            try {
                iArr[ShareType.SHARE_WEBPAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ShareType.SHARE_IMAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public SharePlatform EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public void KWHzl(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public void OLrzqt(java.util.List<java.lang.String> list) {
        this.EZpvd = list;
    }

    @Override // o.InterfaceC49121uia
    public java.lang.CharSequence OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return context.getString(C47501trL.Fragment.DPHOMC);
    }

    @Override // o.InterfaceC49121uia
    public android.graphics.drawable.Drawable AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return context.getResources().getDrawable(C47501trL.ActionBar.AuCTel);
    }

    @Override // o.InterfaceC49121uia
    public java.util.Set<ShareType> AEQbTJ() {
        return yEE.AhwBna(ShareType.SHARE_IMAGE, ShareType.SHARE_WEBPAGE);
    }

    @Override // o.InterfaceC49121uia
    public boolean EZpvd(@NotNull ShareConfig shareConfig) {
        tWM twm;
        PluginShareToFeedConfig pluginShareToFeedConfigEZpvd;
        Intrinsics.checkNotNullParameter(shareConfig, "");
        IShareParams shareParams = shareConfig.getShareParams();
        android.os.Parcelable parcelable = shareParams.getExtras().getParcelable("planetShare");
        PlanetShareConfig planetShareConfig = parcelable instanceof PlanetShareConfig ? (PlanetShareConfig) parcelable : null;
        boolean z = planetShareConfig != null || C33129mqd.OLrzqt((java.lang.CharSequence) shareParams.getExtras().getString("planetShareParams"));
        if ((planetShareConfig != null ? planetShareConfig.OLrzqt() : null) == PlanetShareTypeEnum.PLUGIN_SHARE && (pluginShareToFeedConfigEZpvd = planetShareConfig.EZpvd()) != null) {
            boolean zOLrzqt = tPF.copydefault.aHXSQp().OLrzqt(pluginShareToFeedConfigEZpvd.getPluginType());
            pUU.EZpvd("OKPlanetSharePerformer", "Plugin share type: " + pluginShareToFeedConfigEZpvd.getPluginType().getValue() + ", supported: " + zOLrzqt);
            if (!zOLrzqt) {
                pUU.EZpvd("OKPlanetSharePerformer", "Plugin type " + pluginShareToFeedConfigEZpvd.getPluginType().getValue() + " does not support share to feed");
                return false;
            }
        }
        if (z && (twm = (tWM) C43251rlk.OLrzqt(tWM.class)) != null && twm.valueOf()) {
            return C46388tSm.Companion.KWHzl().AhwBna();
        }
        return false;
    }

    @Override // o.InterfaceC49121uia
    public void OLrzqt(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams, InterfaceC49121uia.Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        int i = Activity.AEQbTJ[iShareParams.getShareType().ordinal()];
        if (i == 1 || i == 2) {
            android.os.Parcelable parcelable = iShareParams.getExtras().getParcelable("planetShare");
            WebRichShareToFeedConfig webRichShareToFeedConfig = null;
            PlanetShareConfig planetShareConfig = parcelable instanceof PlanetShareConfig ? (PlanetShareConfig) parcelable : null;
            if (planetShareConfig == null) {
                java.lang.String string = iShareParams.getExtras().getString("planetShareParams");
                if (string != null) {
                    try {
                        webRichShareToFeedConfig = (WebRichShareToFeedConfig) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) WebRichShareToFeedConfig.Companion.serializer(), string);
                    } catch (java.lang.Exception unused) {
                    }
                }
                if (webRichShareToFeedConfig != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator<T> it = webRichShareToFeedConfig.getImageList().iterator();
                    while (it.hasNext()) {
                        arrayList.add(new RichShareToFeedImage((java.lang.String) null, (java.lang.String) it.next(), (java.lang.String) null, 5, (DefaultConstructorMarker) null));
                    }
                    planetShareConfig = new PlanetShareConfig(PlanetShareTypeEnum.RICH_SHARE, new RichShareToFeedConfig(webRichShareToFeedConfig.getContent(), webRichShareToFeedConfig.getTopics(), arrayList, webRichShareToFeedConfig.getActivityCard()), (PluginShareToFeedConfig) null, 4, (DefaultConstructorMarker) null);
                }
            }
            if (planetShareConfig != null && (activity instanceof FragmentActivity)) {
                OLrzqt((FragmentActivity) activity, iShareParams.getShareFrom(), planetShareConfig, activity2);
                return;
            }
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("invalid parameters for IM share");
            pUU.AEQbTJ("OKPlanetSharePerformer", "performShare", unsupportedOperationException);
            if (activity2 != null) {
                activity2.EZpvd(SharePlatform.SHARE_TO_PLANET, unsupportedOperationException);
            }
            RxBus.AEQbTJ(new C49286ulg("false", SharePlatform.SHARE_TO_PLANET.getPlatformName()));
            return;
        }
        java.lang.UnsupportedOperationException unsupportedOperationException2 = new java.lang.UnsupportedOperationException("unsupported share types");
        pUU.AEQbTJ("OKPlanetSharePerformer", "performShare", unsupportedOperationException2);
        if (activity2 != null) {
            activity2.EZpvd(SharePlatform.SHARE_TO_PLANET, unsupportedOperationException2);
        }
        RxBus.AEQbTJ(new C49286ulg("false", SharePlatform.SHARE_TO_PLANET.getPlatformName()));
    }

    public final void OLrzqt(FragmentActivity fragmentActivity, java.lang.String str, PlanetShareConfig planetShareConfig, InterfaceC49121uia.Activity activity) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new OKPlanetSharePerformer$goPublisherPage$1(fragmentActivity, str, planetShareConfig, null), 3, null);
        if (activity != null) {
            activity.KWHzl(SharePlatform.SHARE_TO_PLANET);
        }
        RxBus.AEQbTJ(new C49286ulg("true", SharePlatform.SHARE_TO_PLANET.getPlatformName()));
    }

    /* JADX INFO: renamed from: o.twC$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.twC.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
