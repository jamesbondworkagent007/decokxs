package o;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.BY;
import o.C52643wT;
import o.WindowInsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class WindowId implements WindowInsets {
    public final AccessibilityNodeProvider AEQbTJ;
    public final BT AYXKKw;
    public final AccessibilityNodeInfo AhwBna;
    public final PipedReader EZpvd;
    public final zU KWHzl;
    public final java.util.Map<C52643wT, InterfaceC2861Ab> OLrzqt;
    public final WindowInsets.ActionBar copydefault;
    public final java.lang.String djBIcL;
    public final CZ gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WindowInsets
    public WindowInsets.ActionBar OLrzqt() {
        return this.copydefault;
    }

    public WindowId(@NotNull WindowInsets.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.copydefault = actionBar;
        this.gEmmrt = new CZ(null, 1, null);
        this.KWHzl = new zU(OLrzqt().djBIcL());
        this.AhwBna = new AccessibilityNodeInfo(OLrzqt());
        java.util.List<InterfaceC2861Ab> listCopydefault = OLrzqt().copydefault();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listCopydefault, 10)), 16));
        for (java.lang.Object obj : listCopydefault) {
            linkedHashMap.put(C52643wT.copydefault(((InterfaceC2861Ab) obj).copydefault()), obj);
        }
        java.util.Map mapIsConnected = C56424yEw.isConnected(linkedHashMap);
        C52643wT.StateListAnimator stateListAnimator = C52643wT.OLrzqt;
        C52643wT c52643wTCopydefault = C52643wT.copydefault(stateListAnimator.OLrzqt());
        if (mapIsConnected.get(c52643wTCopydefault) == null) {
            mapIsConnected.put(c52643wTCopydefault, new C2967Ad(C55815xr.copydefault(), "sts"));
        }
        C52643wT c52643wTCopydefault2 = C52643wT.copydefault(stateListAnimator.copydefault());
        if (mapIsConnected.get(c52643wTCopydefault2) == null) {
            mapIsConnected.put(c52643wTCopydefault2, zX.EZpvd);
        }
        this.OLrzqt = C56424yEw.values(mapIsConnected);
        this.AEQbTJ = new AccessibilityNodeProvider(OLrzqt());
        this.djBIcL = "aws.sdk.kotlin.runtime.auth.credentials.internal.sts";
        this.AYXKKw = new BT("aws.sdk.kotlin.runtime.auth.credentials.internal.sts", OLrzqt().values());
        C5061Df.OLrzqt(this.gEmmrt, OLrzqt().djBIcL());
        C5061Df.OLrzqt(this.gEmmrt, OLrzqt().OLrzqt());
        this.EZpvd = PipedReader.EZpvd.OLrzqt(new PrintStream("STS", "1.0.44"), OLrzqt().AEQbTJ());
    }

    @Override // o.WindowInsets
    public java.lang.Object AEQbTJ(@NotNull TextClassifier textClassifier, @NotNull Continuation<? super ExtractedText> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(TextClassifier.class), C56524yIo.AEQbTJ(ExtractedText.class));
        bv.EZpvd(new DexFile());
        bv.OLrzqt(new InMemoryDexClassLoader());
        bv.AEQbTJ("AssumeRole");
        bv.EZpvd("STS");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(OLrzqt().values());
        c5033CdEZpvd.EZpvd(this.djBIcL);
        c5033CdEZpvd.OLrzqt(this.AYXKKw);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.AEQbTJ, this.OLrzqt, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new AutofillId(OLrzqt()));
        bv.AEQbTJ().OLrzqt(OLrzqt().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(OLrzqt().isConnected());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        C4868Bu c4868Bu = new C4868Bu(null, null, null, 7, null);
        c4868Bu.OLrzqt("Content-Type", "application/x-www-form-urlencoded");
        byOLrzqt.AEQbTJ(c4868Bu);
        byOLrzqt.AEQbTJ(new SyncFailedException(this.EZpvd));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(OLrzqt().gEmmrt());
        return C5030Ca.EZpvd(byOLrzqt, this.KWHzl, textClassifier, continuation);
    }

    @Override // o.WindowInsets
    public java.lang.Object copydefault(@NotNull InputConnection inputConnection, @NotNull Continuation<? super ExtractedTextRequest> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(InputConnection.class), C56524yIo.AEQbTJ(ExtractedTextRequest.class));
        bv.EZpvd(new BufferedWriter());
        bv.OLrzqt(new DelegateLastClassLoader());
        bv.AEQbTJ("AssumeRoleWithWebIdentity");
        bv.EZpvd("STS");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(OLrzqt().values());
        c5033CdEZpvd.EZpvd(this.djBIcL);
        c5033CdEZpvd.OLrzqt(this.AYXKKw);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.AEQbTJ, this.OLrzqt, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new AutofillId(OLrzqt()));
        bv.AEQbTJ().OLrzqt(OLrzqt().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(OLrzqt().isConnected());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        C4868Bu c4868Bu = new C4868Bu(null, null, null, 7, null);
        c4868Bu.OLrzqt("Content-Type", "application/x-www-form-urlencoded");
        byOLrzqt.AEQbTJ(c4868Bu);
        byOLrzqt.AEQbTJ(new SyncFailedException(this.EZpvd));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(OLrzqt().gEmmrt());
        return C5030Ca.EZpvd(byOLrzqt, this.KWHzl, inputConnection, continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.gEmmrt.EZpvd();
    }

    private final void KWHzl(DT dt) {
        C57578yl c57578yl = C57578yl.EZpvd;
        C58108yv.KWHzl(dt, c57578yl.AEQbTJ(), OLrzqt().KWHzl());
        C58108yv.KWHzl(dt, c57578yl.EZpvd(), OLrzqt().valueOf());
        C58108yv.EZpvd(dt, FilterOutputStream.EZpvd.AEQbTJ(), OLrzqt().AkhnZx());
        C55232xg c55232xg = C55232xg.EZpvd;
        C58108yv.EZpvd(dt, c55232xg.gEmmrt(), OLrzqt().AkhnZx());
        C58108yv.KWHzl(dt, c55232xg.AYXKKw(), "sts");
        C58108yv.KWHzl(dt, c55232xg.copydefault(), OLrzqt().OLrzqt());
    }
}
