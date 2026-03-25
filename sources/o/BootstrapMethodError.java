package o;

import com.donkingliang.groupedadapter.BuildConfig;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.BY;
import o.C52643wT;
import o.Character;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BootstrapMethodError implements Character {
    public final Character.Activity AEQbTJ;
    public final CZ AYXKKw;
    public final java.lang.String AhwBna;
    public final PipedReader EZpvd;
    public final zU KWHzl;
    public final Byte copydefault;
    public final BT djBIcL;
    public final java.util.Map<C52643wT, InterfaceC2861Ab> gEmmrt;
    public final ClassCircularityError valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Character.Activity OLrzqt() {
        return this.AEQbTJ;
    }

    public BootstrapMethodError(@NotNull Character.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AEQbTJ = activity;
        this.AYXKKw = new CZ(null, 1, null);
        this.KWHzl = new zU(OLrzqt().djBIcL());
        this.valueOf = new ClassCircularityError(OLrzqt());
        java.util.List<InterfaceC2861Ab> listEZpvd = OLrzqt().EZpvd();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listEZpvd, 10)), 16));
        for (java.lang.Object obj : listEZpvd) {
            linkedHashMap.put(C52643wT.copydefault(((InterfaceC2861Ab) obj).copydefault()), obj);
        }
        java.util.Map mapIsConnected = C56424yEw.isConnected(linkedHashMap);
        C52643wT.StateListAnimator stateListAnimator = C52643wT.OLrzqt;
        C52643wT c52643wTCopydefault = C52643wT.copydefault(stateListAnimator.OLrzqt());
        if (mapIsConnected.get(c52643wTCopydefault) == null) {
            mapIsConnected.put(c52643wTCopydefault, new C2967Ad(C55815xr.copydefault(), "cognito-identity"));
        }
        C52643wT c52643wTCopydefault2 = C52643wT.copydefault(stateListAnimator.copydefault());
        if (mapIsConnected.get(c52643wTCopydefault2) == null) {
            mapIsConnected.put(c52643wTCopydefault2, zX.EZpvd);
        }
        this.gEmmrt = C56424yEw.values(mapIsConnected);
        this.copydefault = new Byte(OLrzqt());
        this.AhwBna = "aws.sdk.kotlin.services.cognitoidentity";
        this.djBIcL = new BT("aws.sdk.kotlin.services.cognitoidentity", OLrzqt().AkhnZx());
        C5061Df.OLrzqt(this.AYXKKw, OLrzqt().djBIcL());
        C5061Df.OLrzqt(this.AYXKKw, OLrzqt().AEQbTJ());
        this.EZpvd = PipedReader.EZpvd.OLrzqt(new PrintStream("Cognito Identity", "1.0.44"), OLrzqt().OLrzqt());
    }

    @Override // o.Character
    public java.lang.Object EZpvd(@NotNull IllegalMonitorStateException illegalMonitorStateException, @NotNull Continuation<? super IllegalArgumentException> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(IllegalMonitorStateException.class), C56524yIo.AEQbTJ(IllegalArgumentException.class));
        bv.EZpvd(new GenericDeclaration());
        bv.OLrzqt(new Member());
        bv.AEQbTJ("GetCredentialsForIdentity");
        bv.EZpvd("Cognito Identity");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(OLrzqt().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AhwBna);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.gEmmrt, this.valueOf));
        bv.AEQbTJ().OLrzqt(new Cloneable(OLrzqt()));
        bv.AEQbTJ().OLrzqt(OLrzqt().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(OLrzqt().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        OLrzqt(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.EZpvd));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(OLrzqt().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.KWHzl, illegalMonitorStateException, continuation);
    }

    @Override // o.Character
    public java.lang.Object AEQbTJ(@NotNull IllegalAccessError illegalAccessError, @NotNull Continuation<? super IllegalThreadStateException> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(IllegalAccessError.class), C56524yIo.AEQbTJ(IllegalThreadStateException.class));
        bv.EZpvd(new TypeVariable());
        bv.OLrzqt(new URL());
        bv.AEQbTJ("GetId");
        bv.EZpvd("Cognito Identity");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(OLrzqt().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AhwBna);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.gEmmrt, this.valueOf));
        bv.AEQbTJ().OLrzqt(new Cloneable(OLrzqt()));
        bv.AEQbTJ().OLrzqt(OLrzqt().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(OLrzqt().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        OLrzqt(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.EZpvd));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(OLrzqt().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.KWHzl, illegalAccessError, continuation);
    }

    @Override // o.Character
    public java.lang.Object KWHzl(@NotNull LinkageError linkageError, @NotNull Continuation<? super Long> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(LinkageError.class), C56524yIo.AEQbTJ(Long.class));
        bv.EZpvd(new DSAParameterSpec());
        bv.OLrzqt(new SecureRandomSpi());
        bv.AEQbTJ("ListIdentityPools");
        bv.EZpvd("Cognito Identity");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(OLrzqt().AkhnZx());
        c5033CdEZpvd.EZpvd(this.AhwBna);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.copydefault, this.gEmmrt, this.valueOf));
        bv.AEQbTJ().OLrzqt(new Cloneable(OLrzqt()));
        bv.AEQbTJ().OLrzqt(OLrzqt().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(OLrzqt().DbNXlk());
        BY byOLrzqt = bv.OLrzqt();
        OLrzqt(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.EZpvd));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, 0 == true ? 1 : 0));
        byOLrzqt.EZpvd().addAll(OLrzqt().AhwBna());
        return C5030Ca.EZpvd(byOLrzqt, this.KWHzl, linkageError, continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.AYXKKw.EZpvd();
    }

    private final void OLrzqt(DT dt) {
        C57578yl c57578yl = C57578yl.EZpvd;
        C58108yv.KWHzl(dt, c57578yl.AEQbTJ(), OLrzqt().KWHzl());
        C58108yv.KWHzl(dt, c57578yl.EZpvd(), OLrzqt().AYXKKw());
        C58108yv.EZpvd(dt, FilterOutputStream.EZpvd.AEQbTJ(), OLrzqt().values());
        C55232xg c55232xg = C55232xg.EZpvd;
        C58108yv.EZpvd(dt, c55232xg.gEmmrt(), OLrzqt().values());
        C58108yv.KWHzl(dt, c55232xg.AYXKKw(), "cognito-identity");
        C58108yv.KWHzl(dt, c55232xg.copydefault(), OLrzqt().AEQbTJ());
    }
}
