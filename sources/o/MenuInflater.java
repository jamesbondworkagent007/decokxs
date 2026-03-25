package o;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.BY;
import o.C52643wT;
import o.Factory2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class MenuInflater implements Factory2 {
    public final zU AEQbTJ;
    public final PointerIcon AYXKKw;
    public final CZ AhwBna;
    public final Factory2.Application EZpvd;
    public final PipedReader KWHzl;
    public final MotionEvent OLrzqt;
    public final java.util.Map<C52643wT, InterfaceC2861Ab> copydefault;
    public final java.lang.String djBIcL;
    public final BT valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Factory2.Application OLrzqt() {
        return this.EZpvd;
    }

    public MenuInflater(@NotNull Factory2.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.EZpvd = application;
        this.AhwBna = new CZ(null, 1, null);
        this.AEQbTJ = new zU(OLrzqt().djBIcL());
        this.AYXKKw = new PointerIcon(OLrzqt());
        java.util.List<InterfaceC2861Ab> listKWHzl = OLrzqt().KWHzl();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listKWHzl, 10)), 16));
        for (java.lang.Object obj : listKWHzl) {
            linkedHashMap.put(C52643wT.copydefault(((InterfaceC2861Ab) obj).copydefault()), obj);
        }
        java.util.Map mapIsConnected = C56424yEw.isConnected(linkedHashMap);
        C52643wT.StateListAnimator stateListAnimator = C52643wT.OLrzqt;
        C52643wT c52643wTCopydefault = C52643wT.copydefault(stateListAnimator.OLrzqt());
        if (mapIsConnected.get(c52643wTCopydefault) == null) {
            mapIsConnected.put(c52643wTCopydefault, new C2967Ad(C55815xr.copydefault(), "sso-oauth"));
        }
        C52643wT c52643wTCopydefault2 = C52643wT.copydefault(stateListAnimator.copydefault());
        if (mapIsConnected.get(c52643wTCopydefault2) == null) {
            mapIsConnected.put(c52643wTCopydefault2, zX.EZpvd);
        }
        this.copydefault = C56424yEw.values(mapIsConnected);
        this.OLrzqt = new MotionEvent(OLrzqt());
        this.djBIcL = "aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc";
        this.valueOf = new BT("aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc", OLrzqt().AkhnZx());
        C5061Df.OLrzqt(this.AhwBna, OLrzqt().djBIcL());
        C5061Df.OLrzqt(this.AhwBna, OLrzqt().EZpvd());
        this.KWHzl = PipedReader.EZpvd.OLrzqt(new PrintStream("SSO OIDC", "1.0.44"), OLrzqt().copydefault());
    }

    @Override // o.Factory2
    public java.lang.Object EZpvd(@NotNull OnContextClickListener onContextClickListener, @NotNull Continuation<? super OnCapturedPointerListener> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(OnContextClickListener.class), C56524yIo.AEQbTJ(OnCapturedPointerListener.class));
        bv.EZpvd(new OnKeyListener());
        bv.OLrzqt(new OnFocusChangeListener());
        bv.AEQbTJ("CreateToken");
        bv.EZpvd("SSO OIDC");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(OLrzqt().AkhnZx());
        c5033CdEZpvd.EZpvd(this.djBIcL);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.copydefault, this.AYXKKw));
        bv.AEQbTJ().OLrzqt(new DragShadowBuilder(OLrzqt()));
        bv.AEQbTJ().OLrzqt(OLrzqt().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(OLrzqt().values());
        BY byOLrzqt = bv.OLrzqt();
        EZpvd(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(OLrzqt().AYXKKw());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, onContextClickListener, continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.AhwBna.EZpvd();
    }

    private final void EZpvd(DT dt) {
        C57578yl c57578yl = C57578yl.EZpvd;
        C58108yv.KWHzl(dt, c57578yl.AEQbTJ(), OLrzqt().AEQbTJ());
        C58108yv.KWHzl(dt, c57578yl.EZpvd(), OLrzqt().valueOf());
        C58108yv.EZpvd(dt, FilterOutputStream.EZpvd.AEQbTJ(), OLrzqt().isConnected());
        C55232xg c55232xg = C55232xg.EZpvd;
        C58108yv.EZpvd(dt, c55232xg.gEmmrt(), OLrzqt().isConnected());
        C58108yv.KWHzl(dt, c55232xg.AYXKKw(), "sso-oauth");
        C58108yv.KWHzl(dt, c55232xg.copydefault(), OLrzqt().EZpvd());
    }
}
