package o;

import com.donkingliang.groupedadapter.BuildConfig;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.BY;
import o.UrlInterceptRegistry;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ValueCallback implements UrlInterceptRegistry {
    public final PipedReader AEQbTJ;
    public final java.lang.String AYXKKw;
    public final WebIconDatabase AhwBna;
    public final UrlInterceptRegistry.TaskDescription EZpvd;
    public final WebMessage KWHzl;
    public final zU OLrzqt;
    public final java.util.Map<C52643wT, InterfaceC2861Ab> copydefault;
    public final BT djBIcL;
    public final CZ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UrlInterceptRegistry.TaskDescription AEQbTJ() {
        return this.EZpvd;
    }

    public ValueCallback(@NotNull UrlInterceptRegistry.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.EZpvd = taskDescription;
        this.valueOf = new CZ(null, 1, null);
        this.OLrzqt = new zU(AEQbTJ().djBIcL());
        this.AhwBna = new WebIconDatabase(AEQbTJ());
        java.util.List<InterfaceC2861Ab> listAEQbTJ = AEQbTJ().AEQbTJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listAEQbTJ, 10)), 16));
        for (java.lang.Object obj : listAEQbTJ) {
            linkedHashMap.put(C52643wT.copydefault(((InterfaceC2861Ab) obj).copydefault()), obj);
        }
        java.util.Map mapIsConnected = C56424yEw.isConnected(linkedHashMap);
        C52643wT c52643wTCopydefault = C52643wT.copydefault(C52643wT.OLrzqt.OLrzqt());
        if (mapIsConnected.get(c52643wTCopydefault) == null) {
            mapIsConnected.put(c52643wTCopydefault, new C2967Ad(C55815xr.copydefault(), "rekognition"));
        }
        this.copydefault = C56424yEw.values(mapIsConnected);
        this.KWHzl = new WebMessage(AEQbTJ());
        this.AYXKKw = "aws.sdk.kotlin.services.rekognition";
        this.djBIcL = new BT("aws.sdk.kotlin.services.rekognition", AEQbTJ().AkhnZx());
        C5061Df.OLrzqt(this.valueOf, AEQbTJ().djBIcL());
        C5061Df.OLrzqt(this.valueOf, AEQbTJ().OLrzqt());
        this.AEQbTJ = PipedReader.EZpvd.OLrzqt(new PrintStream("Rekognition", "1.0.44"), AEQbTJ().KWHzl());
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object OLrzqt(@NotNull Checkable checkable, @NotNull Continuation<? super CalendarViewMaterialDelegate> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(Checkable.class), C56524yIo.AEQbTJ(CalendarViewMaterialDelegate.class));
        bv.EZpvd(new C13132dA());
        bv.OLrzqt(new C15159dz());
        bv.AEQbTJ("CreateFaceLivenessSession");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, checkable, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object EZpvd(@NotNull ListPopupWindow listPopupWindow, @NotNull Continuation<? super ListAdapter> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(ListPopupWindow.class), C56524yIo.AEQbTJ(ListAdapter.class));
        bv.EZpvd(new C15888eZ());
        bv.OLrzqt(new C15780eV());
        bv.AEQbTJ("DescribeProjectVersions");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, listPopupWindow, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object EZpvd(@NotNull LinearLayout linearLayout, @NotNull Continuation<? super Magnifier> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(LinearLayout.class), C56524yIo.AEQbTJ(Magnifier.class));
        bv.EZpvd(new C18208fe());
        bv.OLrzqt(new C15861eY());
        bv.AEQbTJ("DescribeProjects");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, linearLayout, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object KWHzl(@NotNull MediaControlView2 mediaControlView2, @NotNull Continuation<? super MenuItemHoverListener> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(MediaControlView2.class), C56524yIo.AEQbTJ(MenuItemHoverListener.class));
        bv.EZpvd(new C18579fl());
        bv.OLrzqt(new C18685fn());
        bv.AEQbTJ("DetectFaces");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, mediaControlView2, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object EZpvd(@NotNull RatingBar ratingBar, @NotNull Continuation<? super RadioGroup> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(RatingBar.class), C56524yIo.AEQbTJ(RadioGroup.class));
        bv.EZpvd(new C19161fw());
        bv.OLrzqt(new C19267fy());
        bv.AEQbTJ("DetectLabels");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, ratingBar, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object KWHzl(@NotNull QuickContactBadge quickContactBadge, @NotNull Continuation<? super RelativeLayout> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(QuickContactBadge.class), C56524yIo.AEQbTJ(RelativeLayout.class));
        bv.EZpvd(new C17321fB());
        bv.OLrzqt(new C17294fA());
        bv.AEQbTJ("DetectModerationLabels");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, quickContactBadge, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object copydefault(@NotNull RemoteViewsAdapter remoteViewsAdapter, @NotNull Continuation<? super ResourceCursorAdapter> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(RemoteViewsAdapter.class), C56524yIo.AEQbTJ(ResourceCursorAdapter.class));
        bv.EZpvd(new C17618fM());
        bv.OLrzqt(new C17456fG());
        bv.AEQbTJ("DetectText");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, remoteViewsAdapter, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object KWHzl(@NotNull TextSwitcher textSwitcher, @NotNull Continuation<? super TextViewMetrics> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(TextSwitcher.class), C56524yIo.AEQbTJ(TextViewMetrics.class));
        bv.EZpvd(new C21030gs());
        bv.OLrzqt(new C21136gu());
        bv.AEQbTJ("GetCelebrityRecognition");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, textSwitcher, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object OLrzqt(@NotNull ThemedSpinnerAdapter themedSpinnerAdapter, @NotNull Continuation<? super VideoView2> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(ThemedSpinnerAdapter.class), C56524yIo.AEQbTJ(VideoView2.class));
        bv.EZpvd(new C19401gB());
        bv.OLrzqt(new C19374gA());
        bv.AEQbTJ("GetContentModeration");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, themedSpinnerAdapter, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object copydefault(@NotNull ToggleButton toggleButton, @NotNull Continuation<? super VideoView> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(ToggleButton.class), C56524yIo.AEQbTJ(VideoView.class));
        bv.EZpvd(new C19536gG());
        bv.OLrzqt(new C19455gD());
        bv.AEQbTJ("GetFaceDetection");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, toggleButton, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object KWHzl(@NotNull YearPickerView yearPickerView, @NotNull Continuation<? super WrapperListAdapter> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(YearPickerView.class), C56524yIo.AEQbTJ(WrapperListAdapter.class));
        bv.EZpvd(new C19725gN());
        bv.OLrzqt(new C19590gI());
        bv.AEQbTJ("GetFaceSearch");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, yearPickerView, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object EZpvd(@NotNull ViewAnimator viewAnimator, @NotNull Continuation<? super ViewSwitcher> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(ViewAnimator.class), C56524yIo.AEQbTJ(ViewSwitcher.class));
        bv.EZpvd(new C19806gQ());
        bv.OLrzqt(new C19698gM());
        bv.AEQbTJ("GetLabelDetection");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, viewAnimator, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object AEQbTJ(@NotNull ZoomButton zoomButton, @NotNull Continuation<? super C8296b> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(ZoomButton.class), C56524yIo.AEQbTJ(C8296b.class));
        bv.EZpvd(new C22157ha());
        bv.OLrzqt(new C20022gY());
        bv.AEQbTJ("GetPersonTracking");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, zoomButton, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object EZpvd(@NotNull C5627a c5627a, @NotNull Continuation<? super C17293f> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(C5627a.class), C56524yIo.AEQbTJ(C17293f.class));
        bv.EZpvd(new C22369he());
        bv.OLrzqt(new C22422hf());
        bv.AEQbTJ("GetSegmentDetection");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, c5627a, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object EZpvd(@NotNull C15212e c15212e, @NotNull Continuation<? super C11053c> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(C15212e.class), C56524yIo.AEQbTJ(C11053c.class));
        bv.EZpvd(new C22687hk());
        bv.OLrzqt(new C22316hd());
        bv.AEQbTJ("GetTextDetection");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, c15212e, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object EZpvd(@NotNull D d, @NotNull Continuation<? super B> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(D.class), C56524yIo.AEQbTJ(B.class));
        bv.EZpvd(new C24609ih());
        bv.OLrzqt(new C22130hZ());
        bv.AEQbTJ("ListCollections");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, d, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object KWHzl(@NotNull F f, @NotNull Continuation<? super H> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(F.class), C56524yIo.AEQbTJ(H.class));
        bv.EZpvd(new C24927in());
        bv.OLrzqt(new C24503if());
        bv.AEQbTJ("ListDatasetEntries");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, f, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object copydefault(@NotNull J j, @NotNull Continuation<? super I> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(J.class), C56524yIo.AEQbTJ(I.class));
        bv.EZpvd(new C24768ik());
        bv.OLrzqt(new C24715ij());
        bv.AEQbTJ("ListDatasetLabels");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, j, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object OLrzqt(@NotNull G g, @NotNull Continuation<? super K> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(G.class), C56524yIo.AEQbTJ(K.class));
        bv.EZpvd(new C24979io());
        bv.OLrzqt(new C25085iq());
        bv.AEQbTJ("ListFaces");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, g, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object KWHzl(@NotNull O o2, @NotNull Continuation<? super L> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(O.class), C56524yIo.AEQbTJ(L.class));
        bv.EZpvd(new C25297iu());
        bv.OLrzqt(new C25456ix());
        bv.AEQbTJ("ListMediaAnalysisJobs");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, o2, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object OLrzqt(@NotNull M m, @NotNull Continuation<? super N> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(M.class), C56524yIo.AEQbTJ(N.class));
        bv.EZpvd(new C23590iC());
        bv.OLrzqt(new C25350iv());
        bv.AEQbTJ("ListProjectPolicies");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, m, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object KWHzl(@NotNull P p, @NotNull Continuation<? super U> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(P.class), C56524yIo.AEQbTJ(U.class));
        bv.EZpvd(new C23644iE());
        bv.OLrzqt(new C25562iz());
        bv.AEQbTJ("ListStreamProcessors");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, p, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object copydefault(@NotNull T t, @NotNull Continuation<? super Q> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(T.class), C56524yIo.AEQbTJ(Q.class));
        bv.EZpvd(new C23752iI());
        bv.OLrzqt(new C23833iL());
        bv.AEQbTJ("ListUsers");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, t, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object AEQbTJ(@NotNull C6317aN c6317aN, @NotNull Continuation<? super C6264aM> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(C6317aN.class), C56524yIo.AEQbTJ(C6264aM.class));
        bv.EZpvd(new C25805jH());
        bv.OLrzqt(new C25670jC());
        bv.AEQbTJ("RecognizeCelebrities");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, c6317aN, continuation);
    }

    @Override // o.UrlInterceptRegistry
    public java.lang.Object EZpvd(@NotNull C6423aP c6423aP, @NotNull Continuation<? super C6476aQ> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(C6423aP.class), C56524yIo.AEQbTJ(C6476aQ.class));
        bv.EZpvd(new C26264jY());
        bv.OLrzqt(new C26237jX());
        bv.AEQbTJ("SearchFacesByImage");
        bv.EZpvd("Rekognition");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.copydefault, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new WebStorage(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("RekognitionService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.AEQbTJ));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, c6423aP, continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.valueOf.EZpvd();
    }

    private final void KWHzl(DT dt) {
        C57578yl c57578yl = C57578yl.EZpvd;
        C58108yv.KWHzl(dt, c57578yl.AEQbTJ(), AEQbTJ().copydefault());
        C58108yv.KWHzl(dt, c57578yl.EZpvd(), AEQbTJ().values());
        C58108yv.EZpvd(dt, c57578yl.KWHzl(), AEQbTJ().gEmmrt());
        C58108yv.EZpvd(dt, FilterOutputStream.EZpvd.AEQbTJ(), AEQbTJ().isConnected());
        C55232xg c55232xg = C55232xg.EZpvd;
        C58108yv.EZpvd(dt, c55232xg.gEmmrt(), AEQbTJ().isConnected());
        C58108yv.KWHzl(dt, c55232xg.AYXKKw(), "rekognition");
        C58108yv.KWHzl(dt, c55232xg.copydefault(), AEQbTJ().OLrzqt());
    }
}
