package o;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.BY;
import o.ViewHierarchyEncoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ThreadedRenderer implements ViewHierarchyEncoder {
    public final ViewHierarchyEncoder.StateListAnimator AEQbTJ;
    public final WindowCallbackWrapper AYXKKw;
    public final CZ AhwBna;
    public final java.util.Map<C52643wT, InterfaceC2861Ab> EZpvd;
    public final PipedReader KWHzl;
    public final zU OLrzqt;
    public final ViewPropertyAnimatorRT copydefault;
    public final java.lang.String djBIcL;
    public final BT valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.ViewHierarchyEncoder
    /* JADX INFO: renamed from: getConfig */
    public ViewHierarchyEncoder.StateListAnimator m6027getConfig() {
        return this.AEQbTJ;
    }

    public ThreadedRenderer(@NotNull ViewHierarchyEncoder.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.AEQbTJ = stateListAnimator;
        this.AhwBna = new CZ(null, 1, null);
        this.OLrzqt = new zU(m6027getConfig().djBIcL());
        this.AYXKKw = new WindowCallbackWrapper(m6027getConfig());
        java.util.List<InterfaceC2861Ab> listAEQbTJ = m6027getConfig().AEQbTJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listAEQbTJ, 10)), 16));
        for (java.lang.Object obj : listAEQbTJ) {
            linkedHashMap.put(C52643wT.copydefault(((InterfaceC2861Ab) obj).copydefault()), obj);
        }
        java.util.Map mapIsConnected = C56424yEw.isConnected(linkedHashMap);
        C52643wT c52643wTCopydefault = C52643wT.copydefault(C52643wT.OLrzqt.OLrzqt());
        if (mapIsConnected.get(c52643wTCopydefault) == null) {
            mapIsConnected.put(c52643wTCopydefault, new C2967Ad(C55815xr.copydefault(), "polly"));
        }
        this.EZpvd = C56424yEw.values(mapIsConnected);
        this.copydefault = new ViewPropertyAnimatorRT(m6027getConfig());
        this.djBIcL = "aws.sdk.kotlin.services.polly";
        this.valueOf = new BT("aws.sdk.kotlin.services.polly", m6027getConfig().DbNXlk());
        C5061Df.OLrzqt(this.AhwBna, m6027getConfig().djBIcL());
        C5061Df.OLrzqt(this.AhwBna, m6027getConfig().EZpvd());
        this.KWHzl = PipedReader.EZpvd.OLrzqt(new PrintStream("Polly", "1.0.44"), m6027getConfig().copydefault());
    }

    @Override // o.ViewHierarchyEncoder
    public java.lang.Object deleteLexicon(@NotNull WindowManagerGlobal windowManagerGlobal, @NotNull Continuation<? super WindowInfo> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(WindowManagerGlobal.class), C56524yIo.AEQbTJ(WindowInfo.class));
        bv.EZpvd(new ParcelableMap());
        bv.OLrzqt(new Helper());
        bv.AEQbTJ("DeleteLexicon");
        bv.EZpvd("Polly");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(m6027getConfig().DbNXlk());
        c5033CdEZpvd.EZpvd(this.djBIcL);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.EZpvd, this.AYXKKw));
        bv.AEQbTJ().OLrzqt(new WindowAnimationFrameStats(m6027getConfig()));
        bv.AEQbTJ().OLrzqt(m6027getConfig().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(m6027getConfig().values());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(m6027getConfig().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, windowManagerGlobal, continuation);
    }

    @Override // o.ViewHierarchyEncoder
    public java.lang.Object describeVoices(@NotNull WindowManagerImpl windowManagerImpl, @NotNull Continuation<? super AccessibilityManager> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(WindowManagerImpl.class), C56524yIo.AEQbTJ(AccessibilityManager.class));
        bv.EZpvd(new InputContentInfo());
        bv.OLrzqt(new AutofillPopupWindow());
        bv.AEQbTJ("DescribeVoices");
        bv.EZpvd("Polly");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(m6027getConfig().DbNXlk());
        c5033CdEZpvd.EZpvd(this.djBIcL);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.EZpvd, this.AYXKKw));
        bv.AEQbTJ().OLrzqt(new WindowAnimationFrameStats(m6027getConfig()));
        bv.AEQbTJ().OLrzqt(m6027getConfig().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(m6027getConfig().values());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(m6027getConfig().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, windowManagerImpl, continuation);
    }

    @Override // o.ViewHierarchyEncoder
    public java.lang.Object getLexicon(@NotNull AccessibilityInteractionClient accessibilityInteractionClient, @NotNull Continuation<? super AccessibilityRequestPreparer> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(AccessibilityInteractionClient.class), C56524yIo.AEQbTJ(AccessibilityRequestPreparer.class));
        bv.EZpvd(new InputMethodManagerInternal());
        bv.OLrzqt(new InputBinding());
        bv.AEQbTJ("GetLexicon");
        bv.EZpvd("Polly");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(m6027getConfig().DbNXlk());
        c5033CdEZpvd.EZpvd(this.djBIcL);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.EZpvd, this.AYXKKw));
        bv.AEQbTJ().OLrzqt(new WindowAnimationFrameStats(m6027getConfig()));
        bv.AEQbTJ().OLrzqt(m6027getConfig().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(m6027getConfig().values());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(m6027getConfig().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, accessibilityInteractionClient, continuation);
    }

    @Override // o.ViewHierarchyEncoder
    public java.lang.Object getSpeechSynthesisTask(@NotNull AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, @NotNull Continuation<? super CaptioningManager> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(AccelerateDecelerateInterpolator.class), C56524yIo.AEQbTJ(CaptioningManager.class));
        bv.EZpvd(new InputMethod());
        bv.OLrzqt(new InputMethodSession());
        bv.AEQbTJ("GetSpeechSynthesisTask");
        bv.EZpvd("Polly");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(m6027getConfig().DbNXlk());
        c5033CdEZpvd.EZpvd(this.djBIcL);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.EZpvd, this.AYXKKw));
        bv.AEQbTJ().OLrzqt(new WindowAnimationFrameStats(m6027getConfig()));
        bv.AEQbTJ().OLrzqt(m6027getConfig().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(m6027getConfig().values());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(m6027getConfig().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, accelerateDecelerateInterpolator, continuation);
    }

    @Override // o.ViewHierarchyEncoder
    public java.lang.Object listLexicons(@NotNull AnimationUtils animationUtils, @NotNull Continuation<? super AnticipateInterpolator> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(AnimationUtils.class), C56524yIo.AEQbTJ(AnticipateInterpolator.class));
        bv.EZpvd(new ClientCertRequest());
        bv.OLrzqt(new SpellCheckerSubtype());
        bv.AEQbTJ("ListLexicons");
        bv.EZpvd("Polly");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(m6027getConfig().DbNXlk());
        c5033CdEZpvd.EZpvd(this.djBIcL);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.EZpvd, this.AYXKKw));
        bv.AEQbTJ().OLrzqt(new WindowAnimationFrameStats(m6027getConfig()));
        bv.AEQbTJ().OLrzqt(m6027getConfig().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(m6027getConfig().values());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(m6027getConfig().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, animationUtils, continuation);
    }

    @Override // o.ViewHierarchyEncoder
    public java.lang.Object listSpeechSynthesisTasks(@NotNull BounceInterpolator bounceInterpolator, @NotNull Continuation<? super AnticipateOvershootInterpolator> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(BounceInterpolator.class), C56524yIo.AEQbTJ(AnticipateOvershootInterpolator.class));
        bv.EZpvd(new TextInfo());
        bv.OLrzqt(new CacheManager());
        bv.AEQbTJ("ListSpeechSynthesisTasks");
        bv.EZpvd("Polly");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(m6027getConfig().DbNXlk());
        c5033CdEZpvd.EZpvd(this.djBIcL);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.EZpvd, this.AYXKKw));
        bv.AEQbTJ().OLrzqt(new WindowAnimationFrameStats(m6027getConfig()));
        bv.AEQbTJ().OLrzqt(m6027getConfig().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(m6027getConfig().values());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(m6027getConfig().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, bounceInterpolator, continuation);
    }

    @Override // o.ViewHierarchyEncoder
    public java.lang.Object putLexicon(@NotNull GridLayoutAnimationController gridLayoutAnimationController, @NotNull Continuation<? super Interpolator> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(GridLayoutAnimationController.class), C56524yIo.AEQbTJ(Interpolator.class));
        bv.EZpvd(new FindAddress());
        bv.OLrzqt(new JavascriptInterface());
        bv.AEQbTJ("PutLexicon");
        bv.EZpvd("Polly");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(m6027getConfig().DbNXlk());
        c5033CdEZpvd.EZpvd(this.djBIcL);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.EZpvd, this.AYXKKw));
        bv.AEQbTJ().OLrzqt(new WindowAnimationFrameStats(m6027getConfig()));
        bv.AEQbTJ().OLrzqt(m6027getConfig().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(m6027getConfig().values());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(m6027getConfig().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, gridLayoutAnimationController, continuation);
    }

    @Override // o.ViewHierarchyEncoder
    public java.lang.Object startSpeechSynthesisTask(@NotNull ClipRectAnimation clipRectAnimation, @NotNull Continuation<? super OvershootInterpolator> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(ClipRectAnimation.class), C56524yIo.AEQbTJ(OvershootInterpolator.class));
        bv.EZpvd(new PluginData());
        bv.OLrzqt(new LegacyErrorStrings());
        bv.AEQbTJ("StartSpeechSynthesisTask");
        bv.EZpvd("Polly");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(m6027getConfig().DbNXlk());
        c5033CdEZpvd.EZpvd(this.djBIcL);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.EZpvd, this.AYXKKw));
        bv.AEQbTJ().OLrzqt(new WindowAnimationFrameStats(m6027getConfig()));
        bv.AEQbTJ().OLrzqt(m6027getConfig().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(m6027getConfig().values());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(m6027getConfig().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, clipRectAnimation, continuation);
    }

    @Override // o.ViewHierarchyEncoder
    public <T> java.lang.Object synthesizeSpeech(@NotNull PathInterpolator pathInterpolator, @NotNull Function2<? super LinearInterpolator, ? super Continuation<? super T>, ? extends java.lang.Object> function2, @NotNull Continuation<? super T> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(PathInterpolator.class), C56524yIo.AEQbTJ(LinearInterpolator.class));
        bv.EZpvd(new ServiceWorkerController());
        bv.OLrzqt(new ServiceWorkerWebSettings());
        bv.AEQbTJ("SynthesizeSpeech");
        bv.EZpvd("Polly");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(m6027getConfig().DbNXlk());
        c5033CdEZpvd.EZpvd(this.djBIcL);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.EZpvd, this.AYXKKw));
        bv.AEQbTJ().OLrzqt(new WindowAnimationFrameStats(m6027getConfig()));
        bv.AEQbTJ().OLrzqt(m6027getConfig().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(m6027getConfig().values());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(m6027getConfig().AhwBna());
        return C5030Ca.AEQbTJ(byOLrzqt, this.OLrzqt, pathInterpolator, function2, continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.AhwBna.EZpvd();
    }

    private final void KWHzl(DT dt) {
        C57578yl c57578yl = C57578yl.EZpvd;
        C58108yv.KWHzl(dt, c57578yl.AEQbTJ(), m6027getConfig().OLrzqt());
        C58108yv.KWHzl(dt, c57578yl.EZpvd(), m6027getConfig().valueOf());
        C58108yv.EZpvd(dt, FilterOutputStream.EZpvd.AEQbTJ(), m6027getConfig().AkhnZx());
        C55232xg c55232xg = C55232xg.EZpvd;
        C58108yv.EZpvd(dt, c55232xg.gEmmrt(), m6027getConfig().AkhnZx());
        C58108yv.KWHzl(dt, c55232xg.AYXKKw(), "polly");
        C58108yv.KWHzl(dt, c55232xg.copydefault(), m6027getConfig().EZpvd());
    }
}
