package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.Gson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okuser.data.User;
import com.okinc.planet.biz_onboarding.OrbitEditProfileScenario;
import com.okinc.planet.impl.OKPlanetPublisherServiceImpl$openPublishPage$3$1;
import com.okinc.planet.impl.OKPlanetPublisherServiceImpl$openPublishPage$4$1;
import com.okinc.planet.impl.OKPlanetPublisherServiceImpl$openPublishPage$5$1;
import com.okinc.planet.impl.OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1;
import com.okinc.planet.impl.OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$3$1;
import com.okinc.planet.utils.PublishPreCheck;
import com.okinc.planet_api.ActivityCard;
import com.okinc.planet_api.PlanetShareConfig;
import com.okinc.planet_api.PlanetShareTypeEnum;
import com.okinc.planet_api.PluginShareToFeedConfig;
import com.okinc.planet_api.RichShareToFeedConfig;
import com.okinc.planet_api.RichShareToFeedImage;
import com.okinc.planet_api.ShareTopic;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.InterfaceC8104awT;
import o.tWL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tSb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46377tSb extends AbstractC43215rlA implements tWM {
    public final Gson KWHzl = new Gson();
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tSe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46377tSb.AEQbTJ();
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tSi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46377tSb.EZpvd();
        }
    });

    /* JADX INFO: renamed from: o.tSb$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PlanetPublisherChannelId.values().length];
            try {
                iArr[PlanetPublisherChannelId.FEED_FOR_YOU.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PlanetPublisherChannelId.FEED_FOLLOWING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PlanetPublisherChannelId.FEED_NEWS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PlanetPublisherChannelId.PERSONAL_HOMEPAGE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[PublishPreCheck.values().length];
            try {
                iArr2[PublishPreCheck.CHECK_SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[PublishPreCheck.NOT_DO_KYC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[PublishPreCheck.NEED_MODIFY_PROFILE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[PublishPreCheck.USER_MUTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[PublishPreCheck.CHECK_NET_ERROR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[PublishPreCheck.CHECK_SHOW_AGREE_TNC.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            AEQbTJ = iArr2;
        }
    }

    public final C47732tvf AYXKKw() {
        return (C47732tvf) this.AEQbTJ.getValue();
    }

    public static final C47732tvf AEQbTJ() {
        return tPF.copydefault.aHXSQp();
    }

    public final C47736tvj KWHzl() {
        return (C47736tvj) this.copydefault.getValue();
    }

    public static final C47736tvj EZpvd() {
        return tPF.copydefault.akftKQ();
    }

    @Override // o.tWM
    public java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.List<ShareTopic> list, @NotNull java.util.List<RichShareToFeedImage> list2, PlanetPublisherChannelId planetPublisherChannelId, android.view.View view, android.os.Bundle bundle, boolean z, @NotNull Continuation<? super Unit> continuation) {
        pUU.EZpvd("OKPlanetPublisherServiceImpl", "Opening publish page with rich text content: " + str + ", topics: " + list.size() + ", images: " + list2.size() + ", testMode: " + z);
        PlanetShareConfig planetShareConfigOLrzqt = OLrzqt(str, list, list2, null);
        android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : bundle;
        bundle2.putParcelable("planetShare", planetShareConfigOLrzqt);
        java.lang.Object objEZpvd = EZpvd(context, planetPublisherChannelId, null, view, bundle2, z, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(final PlanetPublisherChannelId planetPublisherChannelId, android.view.View view, android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map, android.os.Bundle bundle, boolean z, InterfaceC47278tmy interfaceC47278tmy, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1 oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1;
        if (continuation instanceof OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1) {
            oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1 = (OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1) continuation;
            int i = oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.label = i - Integer.MIN_VALUE;
            } else {
                oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1 = new OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1(continuation);
            }
        }
        java.lang.Object objAEQbTJ = oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (planetPublisherChannelId != null && planetPublisherChannelId != PlanetPublisherChannelId.SHARE_TRADING_COMPETITION && planetPublisherChannelId != PlanetPublisherChannelId.KLINE_INSIGHT && planetPublisherChannelId != PlanetPublisherChannelId.KLINE_NEWS && planetPublisherChannelId != PlanetPublisherChannelId.KLINE_DISCUSSION) {
                C32866mlf.onEvent$default("Feeds_Mid_Create_Click", (TrackChannel[]) null, new Function1() { // from class: o.tRZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C46377tSb.EZpvd(planetPublisherChannelId, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            }
            tTM ttm = tTM.EZpvd;
            oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$0 = planetPublisherChannelId;
            oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$1 = view;
            oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$2 = context;
            oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$3 = map;
            oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$4 = bundle;
            oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$5 = interfaceC47278tmy;
            oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$6 = str;
            oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.Z$0 = z;
            oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.label = 1;
            objAEQbTJ = ttm.AEQbTJ(oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.Z$0;
            str = (java.lang.String) oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$6;
            interfaceC47278tmy = (InterfaceC47278tmy) oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$5;
            bundle = (android.os.Bundle) oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$4;
            map = (java.util.Map) oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$3;
            context = (android.content.Context) oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$2;
            view = (android.view.View) oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$1;
            planetPublisherChannelId = (PlanetPublisherChannelId) oKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        final java.util.Map<java.lang.String, ? extends java.lang.Object> map2 = map;
        final PlanetPublisherChannelId planetPublisherChannelId2 = planetPublisherChannelId;
        final InterfaceC47278tmy interfaceC47278tmy2 = interfaceC47278tmy;
        final boolean z2 = z;
        final android.os.Bundle bundle2 = bundle;
        final java.lang.String str2 = str;
        final android.content.Context context2 = context;
        PublishPreCheck publishPreCheck = (PublishPreCheck) objAEQbTJ;
        if (view == null) {
            view = tUB.copydefault.EZpvd();
        }
        android.view.View view2 = view;
        switch (StateListAnimator.AEQbTJ[publishPreCheck.ordinal()]) {
            case 1:
                ActivityC47702tvB.Companion.EZpvd(context2, planetPublisherChannelId2, map2, bundle2, z2, str2);
                break;
            case 2:
                C32866mlf.onEvent$default("Feeds_Btm_KycError_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                tTY.EZpvd.OLrzqt(view2, publishPreCheck.getDescription());
                break;
            case 3:
                FragmentActivity fragmentActivity = context2 instanceof FragmentActivity ? (FragmentActivity) context2 : null;
                final android.app.Activity activityAEQbTJ = fragmentActivity != null ? fragmentActivity : C54819xWm.KWHzl().AEQbTJ();
                if (activityAEQbTJ != null && (activityAEQbTJ instanceof FragmentActivity)) {
                    tKX.Companion.OLrzqt().AEQbTJ((FragmentActivity) activityAEQbTJ, OrbitEditProfileScenario.CompleteOrbiterProfile.KWHzl, true, new Function2() { // from class: o.tSg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C46377tSb.KWHzl(activityAEQbTJ, context2, planetPublisherChannelId2, map2, bundle2, z2, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                        }
                    });
                }
                break;
            case 4:
                C32866mlf.onEvent$default("Feeds_Btm_DelistedError_View", (TrackChannel[]) null, new Function1() { // from class: o.tSh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C46377tSb.copydefault(interfaceC47278tmy2, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                tTY.EZpvd.KWHzl(view2, publishPreCheck.getDescription());
                break;
            case 5:
                tTY.EZpvd.copydefault(view2, publishPreCheck.getDescription());
                break;
            case 6:
                C32866mlf.onEvent$default("Feeds_Mid_TnC_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                tTY.EZpvd.OLrzqt(context2, view2, publishPreCheck.getDescription(), new Function0() { // from class: o.tSf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C46377tSb.OLrzqt(context2, planetPublisherChannelId2, map2, bundle2, z2, str2);
                    }
                });
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(PlanetPublisherChannelId planetPublisherChannelId, EventParamsList eventParamsList) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        int i = planetPublisherChannelId == null ? -1 : StateListAnimator.EZpvd[planetPublisherChannelId.ordinal()];
        java.lang.String str2 = "profilepage";
        EventParamsList.put$default(eventParamsList, "page", (i == 1 || i == 2 || i == 3 || i != 4) ? "planet" : "profilepage", false, 4, null);
        int i2 = planetPublisherChannelId != null ? StateListAnimator.EZpvd[planetPublisherChannelId.ordinal()] : -1;
        if (i2 == 1) {
            str2 = "for_you";
        } else {
            if (i2 == 2) {
                str = "following";
            } else if (i2 == 3) {
                str = "news";
            } else if (i2 != 4) {
            }
            str2 = str;
        }
        EventParamsList.put$default(eventParamsList, "tab", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(android.app.Activity activity, android.content.Context context, PlanetPublisherChannelId planetPublisherChannelId, java.util.Map map, android.os.Bundle bundle, boolean z, boolean z2, java.lang.String str) {
        if (z2) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity), null, null, new OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$3$1(context, planetPublisherChannelId, map, bundle, z, str, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InterfaceC47278tmy interfaceC47278tmy, EventParamsList eventParamsList) {
        java.lang.String nickname;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        User userOLrzqt = interfaceC47278tmy.OLrzqt();
        EventParamsList.put$default(eventParamsList, "user_profile_name", (userOLrzqt == null || (nickname = userOLrzqt.getNickname()) == null) ? "" : nickname, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.content.Context context, PlanetPublisherChannelId planetPublisherChannelId, java.util.Map map, android.os.Bundle bundle, boolean z, java.lang.String str) {
        ActivityC47702tvB.Companion.EZpvd(context, planetPublisherChannelId, map, bundle, z, str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(android.app.Activity activity, PlanetPublisherChannelId planetPublisherChannelId, android.view.View view, android.content.Context context, java.util.Map map, android.os.Bundle bundle, boolean z, InterfaceC47278tmy interfaceC47278tmy) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity), null, null, new OKPlanetPublisherServiceImpl$openPublishPage$3$1(planetPublisherChannelId, view, context, map, bundle, z, interfaceC47278tmy, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(android.app.Activity activity, PlanetPublisherChannelId planetPublisherChannelId, android.view.View view, android.content.Context context, java.util.Map map, android.os.Bundle bundle, boolean z, InterfaceC47278tmy interfaceC47278tmy, boolean z2, java.lang.String str) {
        if (z2) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity), null, null, new OKPlanetPublisherServiceImpl$openPublishPage$4$1(str, planetPublisherChannelId, view, context, map, bundle, z, interfaceC47278tmy, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(android.app.Activity activity, PlanetPublisherChannelId planetPublisherChannelId, android.view.View view, android.content.Context context, java.util.Map map, android.os.Bundle bundle, boolean z, InterfaceC47278tmy interfaceC47278tmy, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        boolean zBooleanValue = ((java.lang.Boolean) pair.component1()).booleanValue();
        java.lang.String str = (java.lang.String) pair.component2();
        if (zBooleanValue) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity), null, null, new OKPlanetPublisherServiceImpl$openPublishPage$5$1(str, planetPublisherChannelId, view, context, map, bundle, z, interfaceC47278tmy, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.tWM
    public void KWHzl(@NotNull tWX twx) {
        Intrinsics.checkNotNullParameter(twx, "");
        AYXKKw().copydefault(twx);
    }

    @Override // o.tWM
    public PlanetShareConfig KWHzl(@NotNull PlanetPublisherPluginType planetPublisherPluginType, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.EZpvd("OKPlanetPublisherServiceImpl", "Composing share config for plugin type: " + planetPublisherPluginType.getValue() + ", metaData: " + str2);
        if (AYXKKw().copydefault(planetPublisherPluginType) == null) {
            pUU.copydefault("OKPlanetPublisherServiceImpl", "Plugin not found for type: " + planetPublisherPluginType.getValue());
            return null;
        }
        PlanetShareConfig planetShareConfig = new PlanetShareConfig(PlanetShareTypeEnum.PLUGIN_SHARE, (RichShareToFeedConfig) null, new PluginShareToFeedConfig(planetPublisherPluginType, str, str2), 2, (DefaultConstructorMarker) null);
        pUU.KWHzl("OKPlanetPublisherServiceImpl", "Plugin card data created successfully: " + planetShareConfig.OLrzqt());
        return planetShareConfig;
    }

    @Override // o.tWM
    public PlanetShareConfig OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<ShareTopic> list, @NotNull java.util.List<RichShareToFeedImage> list2, ActivityCard activityCard) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        pUU.EZpvd("OKPlanetPublisherServiceImpl", "Composing rich text share config with content: " + str + ", topics: " + list.size() + ", images: " + list2.size());
        PlanetShareConfig planetShareConfig = new PlanetShareConfig(PlanetShareTypeEnum.RICH_SHARE, new RichShareToFeedConfig(str, new java.util.ArrayList(list), new java.util.ArrayList(list2), activityCard), (PluginShareToFeedConfig) null, 4, (DefaultConstructorMarker) null);
        PlanetShareTypeEnum planetShareTypeEnumOLrzqt = planetShareConfig.OLrzqt();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Rich text share config created successfully: ");
        sb.append(planetShareTypeEnumOLrzqt);
        pUU.KWHzl("OKPlanetPublisherServiceImpl", sb.toString());
        return planetShareConfig;
    }

    @Override // o.tWM
    public android.view.View AEQbTJ(@NotNull android.content.Context context, @NotNull PlanetPublisherPluginType planetPublisherPluginType, @NotNull java.lang.String str, @NotNull PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        java.lang.Object objKWHzl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginPreviewType, "");
        pUU.EZpvd("OKPlanetPublisherServiceImpl", "Generating plugin view from JSON string with pluginType: " + planetPublisherPluginType + ", previewType: " + planetPublisherPluginPreviewType + ", metaDataJson: " + str);
        try {
            objKWHzl = KWHzl().KWHzl(context, planetPublisherPluginType, str, planetPublisherPluginPreviewType);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKPlanetPublisherServiceImpl", "Error generating plugin view: " + e.getMessage(), e);
        }
        if (thM7380exceptionOrNullimpl == null) {
            pUU.KWHzl("OKPlanetPublisherServiceImpl", "Plugin view generated successfully");
            return ((tWV) objKWHzl).EZpvd();
        }
        pUU.valueOf("OKPlanetPublisherServiceImpl", "Failed to generate plugin view: " + thM7380exceptionOrNullimpl.getMessage());
        return null;
    }

    @Override // o.tWM
    public boolean valueOf() {
        InterfaceC47278tmy interfaceC47278tmy = (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
        User userOLrzqt = interfaceC47278tmy.OLrzqt();
        return ((userOLrzqt != null && userOLrzqt.isMainAccount()) || !interfaceC47278tmy.values()) && C46437tUh.OLrzqt.KWHzl() && ((tWL) C43251rlk.copydefault(tWL.class)).AhwBna();
    }

    @Override // o.tWM
    public java.lang.Object EZpvd(@NotNull final android.content.Context context, final PlanetPublisherChannelId planetPublisherChannelId, final java.util.Map<java.lang.String, ? extends java.lang.Object> map, final android.view.View view, final android.os.Bundle bundle, final boolean z, @NotNull Continuation<? super Unit> continuation) {
        final InterfaceC47278tmy interfaceC47278tmy = (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
        if (!interfaceC47278tmy.values()) {
            InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), context, null, 2, null);
            return Unit.INSTANCE;
        }
        boolean zEZpvd = ((tWL) C43251rlk.copydefault(tWL.class)).EZpvd();
        android.app.Activity activityAEQbTJ = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (activityAEQbTJ == null) {
            activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        }
        final android.app.Activity activity = activityAEQbTJ;
        if (activity instanceof FragmentActivity) {
            if (zEZpvd) {
                tKX.Companion.OLrzqt().KWHzl((FragmentActivity) activity, OrbitEditProfileScenario.CompleteOrbiterProfile.KWHzl, false, new Function0() { // from class: o.tSa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C46377tSb.KWHzl(activity, planetPublisherChannelId, view, context, map, bundle, z, interfaceC47278tmy);
                    }
                }, new Function2() { // from class: o.tSd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C46377tSb.copydefault(activity, planetPublisherChannelId, view, context, map, bundle, z, interfaceC47278tmy, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                    }
                });
            } else {
                tWL.Application.openOrbiterUpgradeFlow$default((tWL) C43251rlk.copydefault(tWL.class), (FragmentActivity) activity, null, false, new Function1() { // from class: o.tSc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C46377tSb.EZpvd(activity, planetPublisherChannelId, view, context, map, bundle, z, interfaceC47278tmy, (kotlin.Pair) obj);
                    }
                }, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
