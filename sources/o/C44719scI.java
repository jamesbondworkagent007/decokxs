package o;

import android.app.Application;
import com.okinc.okpush.sdk.config.OKPushConfig;
import com.okinc.okpush.sdk.net.bean.PushChannelInfo;
import com.okinc.web.WebStringEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31699mAq;
import o.C32549mfg;
import o.C45698suu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.scI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44719scI implements InterfaceC32485meV {
    public final java.lang.String AEQbTJ;
    public AbstractC32486meW AYXKKw;
    public boolean KWHzl;
    public final android.app.Application copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public static final C44766sdC EZpvd = C44766sdC.OLrzqt;

    @Override // o.InterfaceC32485meV
    public void AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32485meV
    public void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.InterfaceC32485meV
    public void AhwBna() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32485meV
    public AbstractC32486meW EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32485meV
    public java.lang.Boolean KWHzl() {
        return java.lang.Boolean.FALSE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32485meV
    public java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC32485meV
    public void gEmmrt() {
    }

    public C44719scI(@NotNull android.app.Application application, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = application;
        this.AEQbTJ = str;
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.scP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44719scI.DbNXlk();
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.scM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44719scI.AhwBna(this.copydefault);
            }
        });
        this.AYXKKw = new C44815sdz();
    }

    public final Application.ActivityLifecycleCallbacks isConnected() {
        return (Application.ActivityLifecycleCallbacks) this.gEmmrt.getValue();
    }

    public static final C32397mcN DbNXlk() {
        return new C32397mcN(new C32399mcP());
    }

    public static final InterfaceC47278tmy AhwBna(C44719scI c44719scI) {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(c44719scI.copydefault, InterfaceC47230tmC.class)).fmB();
    }

    /* JADX INFO: renamed from: o.scI$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.scI.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC32485meV
    public void KWHzl(boolean z) {
        this.KWHzl = z;
        AuCTel();
        ejfBZ();
    }

    @Override // o.InterfaceC32485meV
    public void copydefault(@NotNull C32482meS c32482meS) {
        Intrinsics.checkNotNullParameter(c32482meS, "");
        C32482meS.registerUIProcessTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerTask$default(c32482meS, "Push", false, false, 0, yDY.gEmmrt("GlobalDispatchCreate", "installAurora", "installHms"), new Function0() { // from class: o.scN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44719scI.OLrzqt(this.EZpvd);
            }
        }, 14, null), "ActivityLifecycle", false, false, 0, null, new Function0() { // from class: o.scU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44719scI.AYXKKw(this.OLrzqt);
            }
        }, 30, null), "MLN", false, false, 0, C56402yEa.EZpvd("InitIMC"), new Function0() { // from class: o.scQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44719scI.djBIcL(this.EZpvd);
            }
        }, 14, null);
    }

    public static final Unit OLrzqt(C44719scI c44719scI) {
        c44719scI.fIwbmz();
        if (c44719scI.fARcdN()) {
            c44719scI.uzCIH();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C44719scI c44719scI) {
        c44719scI.copydefault.registerActivityLifecycleCallbacks(c44719scI.isConnected());
        c44719scI.fJNWhG();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C44719scI c44719scI) {
        C43028rhZ.copydefault.EZpvd(c44719scI.copydefault);
        C45210slW.KWHzl.EZpvd(c44719scI.copydefault);
        return Unit.INSTANCE;
    }

    public final void uzCIH() {
        mMY mmy = mMY.EZpvd;
        mmy.KWHzl(new Function0() { // from class: o.scL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44719scI.fetchVPNInfo();
            }
        });
        mmy.copydefault(new Function0() { // from class: o.scO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44719scI.AkhnZx();
            }
        });
    }

    public static final java.lang.String fetchVPNInfo() {
        PushChannelInfo pushChannelInfoAEQbTJ = C46945tgj.AEQbTJ.AhwBna().AEQbTJ();
        return pushChannelInfoAEQbTJ.getChannelName() + "(" + pushChannelInfoAEQbTJ.getChannelReason() + ")";
    }

    public static final java.lang.String AkhnZx() {
        return C46945tgj.AEQbTJ.AhwBna().AEQbTJ().getDeviceToken();
    }

    public final void fJNWhG() {
        C31699mAq.Application application = C31699mAq.Companion;
        application.EZpvd(true);
        application.KWHzl(C45698suu.TaskDescription.valueOf);
    }

    @Override // o.InterfaceC32485meV
    public int OLrzqt() {
        return C33492mxV.EZpvd();
    }

    @Override // o.InterfaceC32485meV
    public void djBIcL() {
        this.copydefault.unregisterActivityLifecycleCallbacks(isConnected());
    }

    public final void fIwbmz() {
        OKPushConfig.copydefault.OLrzqt(this.copydefault);
        C46945tgj.AEQbTJ.AEQbTJ(this.copydefault);
    }

    public final boolean fARcdN() {
        return C33551myb.EZpvd(this.copydefault);
    }

    @Override // o.InterfaceC32485meV
    public java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return context.getResources().getString(C45698suu.TaskDescription.OLrzqt, C34703nhO.OLrzqt(context));
    }

    @Override // o.InterfaceC32485meV
    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) WebStringEnum.EMPTY_TITLE_ERROR.getType())) {
            return this.copydefault.getResources().getString(C45698suu.TaskDescription.DbNXlk);
        }
        return null;
    }

    @Override // o.InterfaceC32485meV
    public void EZpvd(boolean z) {
        OKPushConfig oKPushConfig = OKPushConfig.copydefault;
        oKPushConfig.KWHzl(this.KWHzl && z);
        oKPushConfig.gEmmrt();
    }

    public final void AuCTel() {
        C33089mpq c33089mpq = C33089mpq.EZpvd;
        c33089mpq.EZpvd(C45698suu.TaskDescription.AEQbTJ);
        c33089mpq.gEmmrt(C45698suu.TaskDescription.fetchVPNInfo);
        c33089mpq.copydefault(C45698suu.TaskDescription.EZpvd);
        c33089mpq.AEQbTJ(C45698suu.TaskDescription.AYXKKw);
        c33089mpq.valueOf(C45698suu.TaskDescription.gEmmrt);
        c33089mpq.OLrzqt(C45698suu.TaskDescription.KWHzl);
        c33089mpq.KWHzl(C45698suu.TaskDescription.copydefault);
        c33089mpq.djBIcL(C45698suu.TaskDescription.AhwBna);
    }

    public final void ejfBZ() {
        C33087mpo c33087mpo = C33087mpo.KWHzl;
        c33087mpo.EZpvd(C45698suu.TaskDescription.djBIcL);
        c33087mpo.gEmmrt(C32549mfg.StateListAnimator.dxcTrN);
    }
}
