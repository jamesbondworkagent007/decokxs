package o;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.BY;
import o.C52643wT;
import o.MovementMethod;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Params implements MovementMethod {
    public final zU AEQbTJ;
    public final java.lang.String AhwBna;
    public final TextWatcher EZpvd;
    public final java.util.Map<C52643wT, InterfaceC2861Ab> KWHzl;
    public final PipedReader OLrzqt;
    public final MovementMethod.TaskDescription copydefault;
    public final CZ djBIcL;
    public final UpdateAppearance gEmmrt;
    public final BT valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MovementMethod.TaskDescription OLrzqt() {
        return this.copydefault;
    }

    public Params(@NotNull MovementMethod.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.copydefault = taskDescription;
        this.djBIcL = new CZ(null, 1, null);
        this.AEQbTJ = new zU(OLrzqt().djBIcL());
        this.gEmmrt = new UpdateAppearance(OLrzqt());
        java.util.List<InterfaceC2861Ab> listAEQbTJ = OLrzqt().AEQbTJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listAEQbTJ, 10)), 16));
        for (java.lang.Object obj : listAEQbTJ) {
            linkedHashMap.put(C52643wT.copydefault(((InterfaceC2861Ab) obj).copydefault()), obj);
        }
        java.util.Map mapIsConnected = C56424yEw.isConnected(linkedHashMap);
        C52643wT.StateListAnimator stateListAnimator = C52643wT.OLrzqt;
        C52643wT c52643wTCopydefault = C52643wT.copydefault(stateListAnimator.OLrzqt());
        if (mapIsConnected.get(c52643wTCopydefault) == null) {
            mapIsConnected.put(c52643wTCopydefault, new C2967Ad(C55815xr.copydefault(), "awsssoportal"));
        }
        C52643wT c52643wTCopydefault2 = C52643wT.copydefault(stateListAnimator.copydefault());
        if (mapIsConnected.get(c52643wTCopydefault2) == null) {
            mapIsConnected.put(c52643wTCopydefault2, zX.EZpvd);
        }
        this.KWHzl = C56424yEw.values(mapIsConnected);
        this.EZpvd = new TextWatcher(OLrzqt());
        this.AhwBna = "aws.sdk.kotlin.runtime.auth.credentials.internal.sso";
        this.valueOf = new BT("aws.sdk.kotlin.runtime.auth.credentials.internal.sso", OLrzqt().DbNXlk());
        C5061Df.OLrzqt(this.djBIcL, OLrzqt().djBIcL());
        C5061Df.OLrzqt(this.djBIcL, OLrzqt().copydefault());
        this.OLrzqt = PipedReader.EZpvd.OLrzqt(new PrintStream("SSO", "1.0.44"), OLrzqt().KWHzl());
    }

    @Override // o.MovementMethod
    public java.lang.Object copydefault(@NotNull SparseArray sparseArray, @NotNull Continuation<? super AttributeSet> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(SparseArray.class), C56524yIo.AEQbTJ(AttributeSet.class));
        bv.EZpvd(new ContextMenuInfo());
        bv.OLrzqt(new Display());
        bv.AEQbTJ("GetRoleCredentials");
        bv.EZpvd("SSO");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(OLrzqt().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AhwBna);
        c5033CdEZpvd.OLrzqt(this.valueOf);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.EZpvd, this.KWHzl, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new Scene(OLrzqt()));
        bv.AEQbTJ().OLrzqt(OLrzqt().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(OLrzqt().isConnected());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new SyncFailedException(this.OLrzqt));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(OLrzqt().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, sparseArray, continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.djBIcL.EZpvd();
    }

    public final void KWHzl(DT dt) {
        C57578yl c57578yl = C57578yl.EZpvd;
        C58108yv.KWHzl(dt, c57578yl.AEQbTJ(), OLrzqt().OLrzqt());
        C58108yv.KWHzl(dt, c57578yl.EZpvd(), OLrzqt().AYXKKw());
        C58108yv.EZpvd(dt, FilterOutputStream.EZpvd.AEQbTJ(), OLrzqt().AkhnZx());
        C55232xg c55232xg = C55232xg.EZpvd;
        C58108yv.EZpvd(dt, c55232xg.gEmmrt(), OLrzqt().AkhnZx());
        C58108yv.KWHzl(dt, c55232xg.AYXKKw(), "awsssoportal");
        C58108yv.KWHzl(dt, c55232xg.copydefault(), OLrzqt().copydefault());
    }
}
