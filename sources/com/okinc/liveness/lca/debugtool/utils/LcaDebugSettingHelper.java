package com.okinc.liveness.lca.debugtool.utils;

import com.amplifyframework.ui.liveness.state.FreshnessState;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.liveness.lca.LcaColorChallengeElementConfig;
import com.okinc.liveness.lca.LcaColorChallengeSequenceConfig;
import com.okinc.liveness.lca.LcaRgbColorConfig;
import com.okinc.liveness.lca.LcaSdkConfiguration;
import com.okinc.network.okg.cor.SubdomainStrategy;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56390yDp;
import o.C56423yEv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaDebugSettingHelper {
    public static final int $stable;
    public static final int SUBDOMAIN_STRATEGY_AUTO = 1;
    public static final int SUBDOMAIN_STRATEGY_GLOBAL = 2;
    public static final int SUBDOMAIN_STRATEGY_NONE = 0;
    public static final int SUBDOMAIN_STRATEGY_SUBDOMAIN = 3;
    public static int apiMode;
    public static final LcaRgbColorConfig color1;
    public static final LcaRgbColorConfig color2;
    public static final LcaRgbColorConfig color3;
    public static final LcaRgbColorConfig color4;
    public static final LcaRgbColorConfig color5;
    public static final LcaRgbColorConfig color6;
    public static float colorDuration;
    public static final LcaRgbColorConfig[] colorPool;
    public static final LcaRgbColorConfig[] colorSequence;
    public static boolean dataObfuscation;
    public static boolean dataSign;
    public static boolean enableQC;
    public static int faceOvalGuideAnimation;
    public static int jwstEnv;
    public static boolean moveCloseShowOrNot;
    public static float prefixColorDuration;
    public static final LcaRgbColorConfig prefixTransparent;
    public static final LcaRgbColorConfig startBlackColor;
    public static float startBlackDuration;
    public static int subdomainStrategyType;
    public static float suffixColorDuration;
    public static final LcaRgbColorConfig suffixTransparent;
    public static final LcaDebugSettingHelper INSTANCE = new LcaDebugSettingHelper();
    public static String subdomainSiteValue = "";
    public static final String JWST_API_SWIMLANE_BASE_URL = "http://okcoin-jwst-rest.forked-test2-light-captcha.swim.env/inner/jwst/";
    public static final String JWST_WS_SWIMLANE_BASE_URL = "ws://okcoin-jwst-rest.forked-test2-light-captcha.swim.env/ws/v1/lightcaptcha/android";
    public static final String VIDEO_OUTPUT_FULL = "VIDEO_OUTPUT_FULL";
    public static final String VIDEO_OUTPUT_SEGMENT = "VIDEO_OUTPUT_SEGMENT";
    public static String videoOutputWay = "VIDEO_OUTPUT_FULL";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApiMode() {
        return apiMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getColorDuration() {
        return colorDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaRgbColorConfig[] getColorPool() {
        return colorPool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaRgbColorConfig[] getColorSequence() {
        return colorSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDataObfuscation() {
        return dataObfuscation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDataSign() {
        return dataSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableQC() {
        return enableQC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFaceOvalGuideAnimation() {
        return faceOvalGuideAnimation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJWST_API_SWIMLANE_BASE_URL() {
        return JWST_API_SWIMLANE_BASE_URL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJWST_WS_SWIMLANE_BASE_URL() {
        return JWST_WS_SWIMLANE_BASE_URL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getJwstEnv() {
        return jwstEnv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMoveCloseShowOrNot() {
        return moveCloseShowOrNot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getPrefixColorDuration() {
        return prefixColorDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaRgbColorConfig getPrefixTransparent() {
        return prefixTransparent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaRgbColorConfig getStartBlackColor() {
        return startBlackColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getStartBlackDuration() {
        return startBlackDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubdomainSiteValue() {
        return subdomainSiteValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubdomainStrategyType() {
        return subdomainStrategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getSuffixColorDuration() {
        return suffixColorDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaRgbColorConfig getSuffixTransparent() {
        return suffixTransparent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVIDEO_OUTPUT_FULL() {
        return VIDEO_OUTPUT_FULL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVIDEO_OUTPUT_SEGMENT() {
        return VIDEO_OUTPUT_SEGMENT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVideoOutputWay() {
        return videoOutputWay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApiMode(int i) {
        apiMode = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColorDuration(float f) {
        colorDuration = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDataObfuscation(boolean z) {
        dataObfuscation = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDataSign(boolean z) {
        dataSign = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableQC(boolean z) {
        enableQC = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceOvalGuideAnimation(int i) {
        faceOvalGuideAnimation = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJwstEnv(int i) {
        jwstEnv = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMoveCloseShowOrNot(boolean z) {
        moveCloseShowOrNot = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrefixColorDuration(float f) {
        prefixColorDuration = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartBlackDuration(float f) {
        startBlackDuration = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubdomainSiteValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        subdomainSiteValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubdomainStrategyType(int i) {
        subdomainStrategyType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuffixColorDuration(float f) {
        suffixColorDuration = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVideoOutputWay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        videoOutputWay = str;
    }

    private LcaDebugSettingHelper() {
    }

    static {
        LcaSdkConfiguration.Companion companion = LcaSdkConfiguration.Companion;
        jwstEnv = companion.getENV_SWIMLANE();
        faceOvalGuideAnimation = companion.getENV_SWIMLANE();
        moveCloseShowOrNot = true;
        apiMode = companion.getAPI_MODEL_PREDICTION();
        enableQC = true;
        LcaRgbColorConfig lcaRgbColorConfig = new LcaRgbColorConfig(255, 0, 0, 191);
        color1 = lcaRgbColorConfig;
        LcaRgbColorConfig lcaRgbColorConfig2 = new LcaRgbColorConfig(0, 255, 0, 191);
        color2 = lcaRgbColorConfig2;
        LcaRgbColorConfig lcaRgbColorConfig3 = new LcaRgbColorConfig(0, 0, 255, 191);
        color3 = lcaRgbColorConfig3;
        LcaRgbColorConfig lcaRgbColorConfig4 = new LcaRgbColorConfig(255, 255, 0, 191);
        color4 = lcaRgbColorConfig4;
        LcaRgbColorConfig lcaRgbColorConfig5 = new LcaRgbColorConfig(255, 0, 255, 191);
        color5 = lcaRgbColorConfig5;
        LcaRgbColorConfig lcaRgbColorConfig6 = new LcaRgbColorConfig(0, 255, 255, 191);
        color6 = lcaRgbColorConfig6;
        colorPool = new LcaRgbColorConfig[]{lcaRgbColorConfig, lcaRgbColorConfig2, lcaRgbColorConfig3, lcaRgbColorConfig4, lcaRgbColorConfig5, lcaRgbColorConfig6};
        colorSequence = new LcaRgbColorConfig[]{lcaRgbColorConfig, lcaRgbColorConfig2, lcaRgbColorConfig3, lcaRgbColorConfig4, lcaRgbColorConfig5, lcaRgbColorConfig6, lcaRgbColorConfig};
        prefixTransparent = new LcaRgbColorConfig(1, 1, 1, 0);
        startBlackColor = new LcaRgbColorConfig(0, 0, 0, FreshnessState.FIRST_SCENE_ALPHA);
        suffixTransparent = new LcaRgbColorConfig(1, 1, 1, 0);
        prefixColorDuration = 500.0f;
        startBlackDuration = 100.0f;
        colorDuration = 200.0f;
        suffixColorDuration = 500.0f;
        $stable = 8;
    }

    public final LcaColorChallengeSequenceConfig requestDebugChallengeData() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LcaColorChallengeElementConfig(prefixTransparent, prefixColorDuration));
        arrayList.add(new LcaColorChallengeElementConfig(startBlackColor, startBlackDuration));
        for (LcaRgbColorConfig lcaRgbColorConfig : colorSequence) {
            arrayList.add(new LcaColorChallengeElementConfig(lcaRgbColorConfig, colorDuration));
        }
        arrayList.add(new LcaColorChallengeElementConfig(suffixTransparent, suffixColorDuration));
        return new LcaColorChallengeSequenceConfig(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList));
    }

    public final String getJwstHttpBaseUrl() {
        int i = jwstEnv;
        LcaSdkConfiguration.Companion companion = LcaSdkConfiguration.Companion;
        if (i == companion.getENV_SWIMLANE()) {
            return JWST_API_SWIMLANE_BASE_URL;
        }
        companion.getENV_OKX();
        return null;
    }

    public final String getJwstWsBaseUrl() {
        int i = jwstEnv;
        LcaSdkConfiguration.Companion companion = LcaSdkConfiguration.Companion;
        if (i == companion.getENV_SWIMLANE()) {
            return JWST_WS_SWIMLANE_BASE_URL;
        }
        companion.getENV_OKX();
        return null;
    }

    public final FacialExtParams getExtParams() {
        Object subdomain;
        int i = subdomainStrategyType;
        if (i == 1) {
            subdomain = SubdomainStrategy.Auto.KWHzl;
        } else if (i == 2) {
            subdomain = SubdomainStrategy.Global.INSTANCE;
        } else {
            subdomain = (i == 3 && (StringsKt__StringsKt.fARcdN((CharSequence) subdomainSiteValue) ^ true)) ? new SubdomainStrategy.Subdomain(subdomainSiteValue) : null;
        }
        if (subdomain != null) {
            return new FacialExtParams(C56423yEv.EZpvd(C56390yDp.OLrzqt("Subdomain-Strategy", subdomain.toString())), (String) null, 2, (DefaultConstructorMarker) null);
        }
        return null;
    }
}
