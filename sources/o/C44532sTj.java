package o;

import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.oklive.app.domain.model.OKLiveGeneralInsightsMessage;
import com.okinc.oklive.app.domain.model.OKLiveModerationMessage;
import com.okinc.oklive.app.domain.model.OKLivePinMessage;
import com.okinc.oklive.app.domain.model.OKLiveStreamUpdateMessage;
import com.okinc.oklive.app.domain.model.OKLiveTokenUpdateMessage;
import com.okinc.oklive.app.domain.model.OKLiveUnpinMessage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sTj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44532sTj extends C43265rly {
    public static final ActionBar Companion = new ActionBar(null);
    public static final yIP<java.lang.Object, android.app.Application> KWHzl = yIJ.OLrzqt.EZpvd();

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return false;
    }

    /* JADX INFO: renamed from: o.sTj$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ yJA<java.lang.Object>[] AEQbTJ = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(ActionBar.class, "mApp", "getMApp()Landroid/app/Application;", 0))};

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sTj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void KWHzl(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            C44532sTj.KWHzl.KWHzl(this, AEQbTJ[0], application);
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Companion.KWHzl(getApplication());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull final android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        pUU.EZpvd("OKLiveApplicationDelegate", "=== Registering OKLiveService (lazy initialization) ===");
        interfaceC43253rlm.EZpvd(InterfaceC44531sTi.class, C56392yDr.copydefault(new Function0() { // from class: o.sTg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44532sTj.EZpvd(context);
            }
        }));
        pUU.EZpvd("OKLiveApplicationDelegate", "=== OKLiveService registered (will be created on first access) ===");
    }

    public static final C44537sTp EZpvd(android.content.Context context) {
        pUU.EZpvd("OKLiveApplicationDelegate", "=== Creating OKLiveServiceImpl instance (first use) ===");
        C44537sTp c44537sTpInvokespecialsiEkQe = ((sTQ) C58113yvE.copydefault(context.getApplicationContext(), sTQ.class)).invokespecialsiEkQe();
        pUU.EZpvd("OKLiveApplicationDelegate", "=== OKLiveServiceImpl created successfully ===");
        return c44537sTpInvokespecialsiEkQe;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        sTL.AEQbTJ(interfaceC43237rlW);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() {
        super.onLaunchComplete();
        copydefault();
    }

    public final void copydefault() {
        sKH skhFARcdN = sDZ.AEQbTJ.fARcdN();
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_LIVE_STREAM, C56402yEa.EZpvd("GeneralInsights"), OKLiveGeneralInsightsMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_LIVE_STREAM, C56402yEa.EZpvd("TokenUpdate"), OKLiveTokenUpdateMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_LIVE_STREAM, C56402yEa.EZpvd("LiveStreamUpdate"), OKLiveStreamUpdateMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_LIVE_STREAM, yDY.gEmmrt("ModeratorAssign", "ModeratorRevoke"), OKLiveModerationMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_LIVE_STREAM, yDY.gEmmrt("MuteUser", "UnmuteUser"), OKLiveModerationMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_LIVE_STREAM, C56402yEa.EZpvd("RemoveViewer"), OKLiveModerationMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_LIVE_STREAM, C56402yEa.EZpvd("PinMessage"), OKLivePinMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_LIVE_STREAM, C56402yEa.EZpvd("UnpinMessage"), OKLiveUnpinMessage.class);
    }
}
