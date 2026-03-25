package o;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.camera.OKIMCaptureMode;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35399nuc;
import o.C60123zwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oaW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36413oaW extends AbstractC35291nsZ {
    public static final ActionBar Companion = new ActionBar(null);
    public final Function2<android.content.Context, OKIMCaptureMode, android.content.Intent> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C36413oaW() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function2:0x0004: INVOKE  STATIC call: o.obb.KWHzl():kotlin.jvm.functions.Function2 A[MD:():kotlin.jvm.functions.Function2<android.content.Context, com.okinc.im.camera.OKIMCaptureMode, android.content.Intent> (m), WRAPPED] (LINE:50)) : (r1v0 kotlin.jvm.functions.Function2))
 A[MD:(kotlin.jvm.functions.Function2<? super android.content.Context, ? super com.okinc.im.camera.OKIMCaptureMode, ? extends android.content.Intent>):void (m)] (LINE:49) call: o.oaW.<init>(kotlin.jvm.functions.Function2):void type: THIS */
    public /* synthetic */ C36413oaW(Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C36471obb.KWHzl() : function2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super android.content.Context, ? super com.okinc.im.camera.OKIMCaptureMode, ? extends android.content.Intent> */
    /* JADX WARN: Multi-variable type inference failed */
    public C36413oaW(@NotNull Function2<? super android.content.Context, ? super OKIMCaptureMode, ? extends android.content.Intent> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.copydefault = function2;
    }

    @Override // o.InterfaceC35288nsW
    public android.graphics.drawable.Drawable EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C35399nuc.ActionBar.AxsJAY);
        Intrinsics.copydefault(drawable);
        return drawable;
    }

    @Override // o.InterfaceC35288nsW
    public java.lang.String KWHzl() {
        java.lang.String string = C32979mnm.EZpvd.OLrzqt().getApplicationContext().getString(C35399nuc.LoaderManager.hrnhsO);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.InterfaceC35288nsW
    public void copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_Btm_Send_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.obe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36413oaW.EZpvd((EventParamsList) obj);
            }
        });
        if (C37719ozD.KWHzl.copydefault(fragment.getActivity())) {
            java.lang.String[] strArrAEQbTJ = C37724ozI.EZpvd.AEQbTJ();
            if (C60121zwJ.KWHzl(fragment.requireContext(), (java.lang.String[]) java.util.Arrays.copyOf(strArrAEQbTJ, strArrAEQbTJ.length))) {
                pUU.KWHzl("CameraPlugin", "Camera permissions granted, starting sight record");
                OLrzqt(fragment);
                return;
            } else {
                C60123zwM c60123zwMAEQbTJ = new C60123zwM.ActionBar(fragment, 104, (java.lang.String[]) java.util.Arrays.copyOf(strArrAEQbTJ, strArrAEQbTJ.length)).AEQbTJ();
                Intrinsics.checkNotNullExpressionValue(c60123zwMAEQbTJ, "");
                C60121zwJ.copydefault(c60123zwMAEQbTJ);
                pUU.KWHzl("CameraPlugin", "Camera permissions requested");
                return;
            }
        }
        C55326xho.toast$default(C33070mpX.AYXKKw(C35399nuc.LoaderManager.UkvvWh), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        pUU.valueOf("CameraPlugin", "Media operation not permitted: call ongoing");
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "camera", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            pUU.copydefault("CameraPlugin", "Fragment activity is null, cannot start sight record");
            return;
        }
        java.io.File externalFilesDir = C43246rlf.OLrzqt.valueOf().getExternalFilesDir(android.os.Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir == null || !externalFilesDir.mkdirs()) {
            pUU.KWHzl("CameraPlugin", "Failed to create directory for saving media");
        } else {
            pUU.KWHzl("CameraPlugin", "Media directory created successfully: " + (externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null));
        }
        OKIMCaptureMode oKIMCaptureMode = OKIMCaptureMode.BOTH;
        Function2<android.content.Context, OKIMCaptureMode, android.content.Intent> function2 = this.copydefault;
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        android.content.Intent intentInvoke = function2.invoke(fragmentActivityRequireActivity, oKIMCaptureMode);
        if (externalFilesDir != null) {
            intentInvoke.putExtra("recordSightDir", externalFilesDir.getAbsolutePath());
        }
        fragment.startActivityForResult(intentInvoke, 104);
        pUU.KWHzl("CameraPlugin", "Started SightRecordActivity for capturing media");
    }

    @Override // o.InterfaceC35288nsW
    public void OLrzqt(int i, int i2, android.content.Intent intent, @NotNull android.content.Context context) {
        SendMessageRequestParam video;
        Intrinsics.checkNotNullParameter(context, "");
        if (i2 == -1 && i == 104 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("capture_picture_uri");
            java.lang.String stringExtra2 = intent.getStringExtra("capture_video_src");
            if (stringExtra != null && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stringExtra))) {
                video = new SendMessageRequestParam.ImageOrGif(stringExtra, "", true);
            } else {
                video = (stringExtra2 == null || !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stringExtra2) ^ true)) ? null : new SendMessageRequestParam.Video(stringExtra2, C33129mqd.AhwBna(java.lang.Long.valueOf(intent.getLongExtra("capture_video_time", 0L))));
            }
            if (video != null) {
                pUU.KWHzl("CameraPlugin", "Sending: " + video);
                InterfaceC35289nsX interfaceC35289nsXEZpvd = EZpvd();
                if (interfaceC35289nsXEZpvd != null) {
                    interfaceC35289nsXEZpvd.KWHzl(new GeneralAction.SendMessages(yDY.copydefault(video)));
                    return;
                }
                return;
            }
            pUU.valueOf("CameraPlugin", "No valid media captured, nothing to send");
        }
    }

    @Override // o.AbstractC35291nsZ, o.InterfaceC35288nsW
    public java.lang.Integer AEQbTJ() {
        return 104;
    }

    @Override // o.InterfaceC35288nsW
    public void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, int i, @NotNull java.lang.String[] strArr, @NotNull int[] iArr) {
        java.lang.String string = "";
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (i == 104) {
            if (C60121zwJ.KWHzl(fragment.requireContext(), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length))) {
                pUU.KWHzl("CameraPlugin", "Camera permissions granted after request, starting sight record");
                OLrzqt(fragment);
                return;
            }
            if (C60121zwJ.copydefault(fragment.requireActivity(), yDY.gEmmrt(java.util.Arrays.copyOf(strArr, strArr.length)))) {
                FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                if (!C60121zwJ.KWHzl(fragmentActivityRequireActivity, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE")) {
                    string = fragmentActivityRequireActivity.getString(C35399nuc.LoaderManager.GVpNrsfQMcgE);
                } else if (!C60121zwJ.KWHzl(fragmentActivityRequireActivity, "android.permission.CAMERA")) {
                    string = fragmentActivityRequireActivity.getString(C35399nuc.LoaderManager.isDevMode);
                } else if (!C60121zwJ.KWHzl(fragmentActivityRequireActivity, "android.permission.RECORD_AUDIO")) {
                    string = fragmentActivityRequireActivity.getString(C35399nuc.LoaderManager.glXhWM);
                }
                java.lang.String str = string;
                pUU.valueOf("CameraPlugin", "Some permissions were permanently denied: " + str);
                C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.oaW$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oaW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
