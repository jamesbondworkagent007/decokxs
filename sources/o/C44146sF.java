package o;

import com.donkingliang.groupedadapter.BuildConfig;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.BY;
import o.InterfaceC44254sJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C44146sF implements InterfaceC44254sJ {
    public final zU AEQbTJ;
    public final CZ AYXKKw;
    public final java.lang.String AhwBna;
    public final InterfaceC44254sJ.Application EZpvd;
    public final java.util.Map<C52643wT, InterfaceC2861Ab> KWHzl;
    public final PipedReader OLrzqt;
    public final C44308sL copydefault;
    public final C44470sR djBIcL;
    public final BT valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC44254sJ.Application OLrzqt() {
        return this.EZpvd;
    }

    public C44146sF(@NotNull InterfaceC44254sJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.EZpvd = application;
        this.AYXKKw = new CZ(null, 1, null);
        this.AEQbTJ = new zU(OLrzqt().djBIcL());
        this.djBIcL = new C44470sR(OLrzqt());
        java.util.List<InterfaceC2861Ab> listOLrzqt = OLrzqt().OLrzqt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listOLrzqt, 10)), 16));
        for (java.lang.Object obj : listOLrzqt) {
            linkedHashMap.put(C52643wT.copydefault(((InterfaceC2861Ab) obj).copydefault()), obj);
        }
        java.util.Map mapIsConnected = C56424yEw.isConnected(linkedHashMap);
        C52643wT c52643wTCopydefault = C52643wT.copydefault(C52643wT.OLrzqt.OLrzqt());
        if (mapIsConnected.get(c52643wTCopydefault) == null) {
            mapIsConnected.put(c52643wTCopydefault, new C2967Ad(C55815xr.copydefault(), "translate"));
        }
        this.KWHzl = C56424yEw.values(mapIsConnected);
        this.copydefault = new C44308sL(OLrzqt());
        this.AhwBna = "aws.sdk.kotlin.services.translate";
        this.valueOf = new BT("aws.sdk.kotlin.services.translate", OLrzqt().values());
        C5061Df.OLrzqt(this.AYXKKw, OLrzqt().djBIcL());
        C5061Df.OLrzqt(this.AYXKKw, OLrzqt().copydefault());
        this.OLrzqt = PipedReader.EZpvd.OLrzqt(new PrintStream("Translate", "1.0.44"), OLrzqt().AEQbTJ());
    }

    @Override // o.InterfaceC44254sJ
    public java.lang.Object copydefault(@NotNull C47647tu c47647tu, @NotNull Continuation<? super C47492tr> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(C47647tu.class), C56524yIo.AEQbTJ(C47492tr.class));
        bv.EZpvd(new C51334vl());
        bv.OLrzqt(new C51228vj());
        bv.AEQbTJ("ListLanguages");
        bv.EZpvd("Translate");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(OLrzqt().values());
        c5033CdEZpvd.EZpvd(this.AhwBna);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.KWHzl, this.djBIcL));
        bv.AEQbTJ().OLrzqt(new C44362sN(OLrzqt()));
        bv.AEQbTJ().OLrzqt(OLrzqt().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(OLrzqt().isConnected());
        BY byOLrzqt = bv.OLrzqt();
        copydefault(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSShineFrontendService_20170701", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.OLrzqt));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(OLrzqt().AYXKKw());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, c47647tu, continuation);
    }

    @Override // o.InterfaceC44254sJ
    public java.lang.Object OLrzqt(@NotNull C47541ts c47541ts, @NotNull Continuation<? super C47753tw> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(C47541ts.class), C56524yIo.AEQbTJ(C47753tw.class));
        bv.EZpvd(new C51493vo());
        bv.OLrzqt(new C51599vq());
        bv.AEQbTJ("ListParallelData");
        bv.EZpvd("Translate");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(OLrzqt().values());
        c5033CdEZpvd.EZpvd(this.AhwBna);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.KWHzl, this.djBIcL));
        bv.AEQbTJ().OLrzqt(new C44362sN(OLrzqt()));
        bv.AEQbTJ().OLrzqt(OLrzqt().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(OLrzqt().isConnected());
        BY byOLrzqt = bv.OLrzqt();
        copydefault(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSShineFrontendService_20170701", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.OLrzqt));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(OLrzqt().AYXKKw());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, c47541ts, continuation);
    }

    @Override // o.InterfaceC44254sJ
    public java.lang.Object copydefault(@NotNull C47859ty c47859ty, @NotNull Continuation<? super C45888tA> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(C47859ty.class), C56524yIo.AEQbTJ(C45888tA.class));
        bv.EZpvd(new C51970vx());
        bv.OLrzqt(new C51864vv());
        bv.AEQbTJ("ListTerminologies");
        bv.EZpvd("Translate");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(OLrzqt().values());
        c5033CdEZpvd.EZpvd(this.AhwBna);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.KWHzl, this.djBIcL));
        bv.AEQbTJ().OLrzqt(new C44362sN(OLrzqt()));
        bv.AEQbTJ().OLrzqt(OLrzqt().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(OLrzqt().isConnected());
        BY byOLrzqt = bv.OLrzqt();
        copydefault(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSShineFrontendService_20170701", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.OLrzqt));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(OLrzqt().AYXKKw());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, c47859ty, continuation);
    }

    @Override // o.InterfaceC44254sJ
    public java.lang.Object copydefault(@NotNull C46024tF c46024tF, @NotNull Continuation<? super C45970tD> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(C46024tF.class), C56524yIo.AEQbTJ(C45970tD.class));
        bv.EZpvd(new C50157vE());
        bv.OLrzqt(new C52023vy());
        bv.AEQbTJ("ListTextTranslationJobs");
        bv.EZpvd("Translate");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(OLrzqt().values());
        c5033CdEZpvd.EZpvd(this.AhwBna);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.KWHzl, this.djBIcL));
        bv.AEQbTJ().OLrzqt(new C44362sN(OLrzqt()));
        bv.AEQbTJ().OLrzqt(OLrzqt().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(OLrzqt().isConnected());
        BY byOLrzqt = bv.OLrzqt();
        copydefault(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSShineFrontendService_20170701", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.OLrzqt));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(OLrzqt().AYXKKw());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, c46024tF, continuation);
    }

    @Override // o.InterfaceC44254sJ
    public java.lang.Object copydefault(@NotNull C48723ub c48723ub, @NotNull Continuation<? super C48776uc> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(C48723ub.class), C56524yIo.AEQbTJ(C48776uc.class));
        bv.EZpvd(new C53839wt());
        bv.OLrzqt(new C53733wr());
        bv.AEQbTJ("TranslateText");
        bv.EZpvd("Translate");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(OLrzqt().values());
        c5033CdEZpvd.EZpvd(this.AhwBna);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.KWHzl, this.djBIcL));
        bv.AEQbTJ().OLrzqt(new C44362sN(OLrzqt()));
        bv.AEQbTJ().OLrzqt(OLrzqt().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(OLrzqt().isConnected());
        BY byOLrzqt = bv.OLrzqt();
        copydefault(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSShineFrontendService_20170701", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.OLrzqt));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(OLrzqt().AYXKKw());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, c48723ub, continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.AYXKKw.EZpvd();
    }

    private final void copydefault(DT dt) {
        C57578yl c57578yl = C57578yl.EZpvd;
        C58108yv.KWHzl(dt, c57578yl.AEQbTJ(), OLrzqt().EZpvd());
        C58108yv.KWHzl(dt, c57578yl.EZpvd(), OLrzqt().AkhnZx());
        C58108yv.EZpvd(dt, c57578yl.KWHzl(), OLrzqt().AhwBna());
        C58108yv.EZpvd(dt, FilterOutputStream.EZpvd.AEQbTJ(), OLrzqt().DbNXlk());
        C55232xg c55232xg = C55232xg.EZpvd;
        C58108yv.EZpvd(dt, c55232xg.gEmmrt(), OLrzqt().DbNXlk());
        C58108yv.KWHzl(dt, c55232xg.AYXKKw(), "translate");
        C58108yv.KWHzl(dt, c55232xg.copydefault(), OLrzqt().copydefault());
    }
}
