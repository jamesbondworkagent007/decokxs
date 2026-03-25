package o;

import com.donkingliang.groupedadapter.BuildConfig;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.BY;
import o.InterfaceC31925mJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C31844mG implements InterfaceC31925mJ {
    public final InterfaceC31925mJ.StateListAnimator AEQbTJ;
    public final java.lang.String AYXKKw;
    public final C31979mL AhwBna;
    public final java.util.Map<C52643wT, InterfaceC2861Ab> EZpvd;
    public final C32033mN KWHzl;
    public final zU OLrzqt;
    public final PipedReader copydefault;
    public final BT djBIcL;
    public final CZ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC31925mJ.StateListAnimator EZpvd() {
        return this.AEQbTJ;
    }

    public C31844mG(@NotNull InterfaceC31925mJ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.AEQbTJ = stateListAnimator;
        this.valueOf = new CZ(null, 1, null);
        this.OLrzqt = new zU(EZpvd().djBIcL());
        this.AhwBna = new C31979mL(EZpvd());
        java.util.List<InterfaceC2861Ab> listCopydefault = EZpvd().copydefault();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listCopydefault, 10)), 16));
        for (java.lang.Object obj : listCopydefault) {
            linkedHashMap.put(C52643wT.copydefault(((InterfaceC2861Ab) obj).copydefault()), obj);
        }
        java.util.Map mapIsConnected = C56424yEw.isConnected(linkedHashMap);
        C52643wT c52643wTCopydefault = C52643wT.copydefault(C52643wT.OLrzqt.OLrzqt());
        if (mapIsConnected.get(c52643wTCopydefault) == null) {
            mapIsConnected.put(c52643wTCopydefault, new C2967Ad(C55815xr.copydefault(), "textract"));
        }
        this.EZpvd = C56424yEw.values(mapIsConnected);
        this.KWHzl = new C32033mN(EZpvd());
        this.AYXKKw = "aws.sdk.kotlin.services.textract";
        this.djBIcL = new BT("aws.sdk.kotlin.services.textract", EZpvd().isConnected());
        C5061Df.OLrzqt(this.valueOf, EZpvd().djBIcL());
        C5061Df.OLrzqt(this.valueOf, EZpvd().KWHzl());
        this.copydefault = PipedReader.EZpvd.OLrzqt(new PrintStream("Textract", "1.0.44"), EZpvd().AEQbTJ());
    }

    @Override // o.InterfaceC31925mJ
    public java.lang.Object OLrzqt(@NotNull C34437nc c34437nc, @NotNull Continuation<? super C34384nb> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(C34437nc.class), C56524yIo.AEQbTJ(C34384nb.class));
        bv.EZpvd(new C39160pn());
        bv.OLrzqt(new C38736pf());
        bv.AEQbTJ("AnalyzeDocument");
        bv.EZpvd("Textract");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(EZpvd().isConnected());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.EZpvd, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new C32087mP(EZpvd()));
        bv.AEQbTJ().OLrzqt(EZpvd().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(EZpvd().values());
        BY byOLrzqt = bv.OLrzqt();
        EZpvd(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("Textract", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.copydefault));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(EZpvd().AYXKKw());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, c34437nc, continuation);
    }

    @Override // o.InterfaceC31925mJ
    public java.lang.Object KWHzl(@NotNull C37132oo c37132oo, @NotNull Continuation<? super C37026om> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(C37132oo.class), C56524yIo.AEQbTJ(C37026om.class));
        bv.EZpvd(new C43638rt());
        bv.OLrzqt(new C43691ru());
        bv.AEQbTJ("ListAdapterVersions");
        bv.EZpvd("Textract");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(EZpvd().isConnected());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.EZpvd, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new C32087mP(EZpvd()));
        bv.AEQbTJ().OLrzqt(EZpvd().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(EZpvd().values());
        BY byOLrzqt = bv.OLrzqt();
        EZpvd(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("Textract", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.copydefault));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(EZpvd().AYXKKw());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, c37132oo, continuation);
    }

    @Override // o.InterfaceC31925mJ
    public java.lang.Object EZpvd(@NotNull C37079on c37079on, @NotNull Continuation<? super C37185op> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(C37079on.class), C56524yIo.AEQbTJ(C37185op.class));
        bv.EZpvd(new C43956rz());
        bv.OLrzqt(new C43585rs());
        bv.AEQbTJ("ListAdapters");
        bv.EZpvd("Textract");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(EZpvd().isConnected());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.KWHzl, this.EZpvd, this.AhwBna));
        bv.AEQbTJ().OLrzqt(new C32087mP(EZpvd()));
        bv.AEQbTJ().OLrzqt(EZpvd().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(EZpvd().values());
        BY byOLrzqt = bv.OLrzqt();
        EZpvd(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("Textract", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.copydefault));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(EZpvd().AYXKKw());
        return C5030Ca.EZpvd(byOLrzqt, this.OLrzqt, c37079on, continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.valueOf.EZpvd();
    }

    private final void EZpvd(DT dt) {
        C57578yl c57578yl = C57578yl.EZpvd;
        C58108yv.KWHzl(dt, c57578yl.AEQbTJ(), EZpvd().OLrzqt());
        C58108yv.KWHzl(dt, c57578yl.EZpvd(), EZpvd().DbNXlk());
        C58108yv.EZpvd(dt, c57578yl.KWHzl(), EZpvd().AhwBna());
        C58108yv.EZpvd(dt, FilterOutputStream.EZpvd.AEQbTJ(), EZpvd().AkhnZx());
        C55232xg c55232xg = C55232xg.EZpvd;
        C58108yv.EZpvd(dt, c55232xg.gEmmrt(), EZpvd().AkhnZx());
        C58108yv.KWHzl(dt, c55232xg.AYXKKw(), "textract");
        C58108yv.KWHzl(dt, c55232xg.copydefault(), EZpvd().KWHzl());
    }
}
