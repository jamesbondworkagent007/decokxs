package o;

import com.okinc.base.thread.TPM;
import com.okinc.feature.public_beta_impl.PublicBetaModule$markLaunchComplete$1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.C34765nid;
import org.jetbrains.annotations.NotNull;
import uniffi.experiment.FetchAllFeaturesException;

/* JADX INFO: renamed from: o.nhT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34708nhT extends C43265rly {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nib
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34708nhT.ejfBZ();
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.nhY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34708nhT.AkhnZx();
        }
    });
    public AtomicReference<InterfaceC2369AJc> AEQbTJ = new AtomicReference<>();
    public final ActionBar copydefault = new ActionBar();

    /* JADX INFO: renamed from: o.nhT$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nhT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2383AJq ejfBZ() {
        return new C2383AJq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2383AJq fIwbmz() {
        return (C2383AJq) this.EZpvd.getValue();
    }

    public static final InterfaceC47278tmy AkhnZx() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC47278tmy fARcdN() {
        return (InterfaceC47278tmy) this.OLrzqt.getValue();
    }

    /* JADX INFO: renamed from: o.nhT$ActionBar */
    public static final class ActionBar implements InterfaceC54816xWj {
        public ActionBar() {
        }

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
            pUU.KWHzl("PublicBetaModule", "fetch all features in background");
            C34708nhT.this.fJNWhG();
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            pUU.KWHzl("PublicBetaModule", "fetch all features in foreground");
            C34708nhT.this.fJNWhG();
        }
    }

    @Override // o.C43265rly
    public void onInit(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onInit(context);
        C54819xWm.KWHzl().AEQbTJ(this.copydefault);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(InterfaceC34710nhV.class, C56392yDr.copydefault(new Function0() { // from class: o.nif
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34708nhT.DbNXlk();
            }
        }));
    }

    public static final C34776nio DbNXlk() {
        return new C34776nio();
    }

    public final void fJNWhG() {
        TPM.StateListAnimator.KWHzl.AEQbTJ(new C34765nid.ActionBar()).scheduleDirect(new java.lang.Runnable() { // from class: o.nie
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() throws FetchAllFeaturesException {
                C34708nhT.djBIcL(this.KWHzl);
            }
        });
    }

    public static final void djBIcL(C34708nhT c34708nhT) throws FetchAllFeaturesException {
        InterfaceC2369AJc interfaceC2369AJc = c34708nhT.AEQbTJ.get();
        if (interfaceC2369AJc != null && !interfaceC2369AJc.EZpvd()) {
            InterfaceC2369AJc interfaceC2369AJc2 = c34708nhT.AEQbTJ.get();
            pUU.KWHzl("PublicBetaModule", "Has running fetch all task: " + (interfaceC2369AJc2 != null ? interfaceC2369AJc2.hashCode() : 0) + ", cancel it.");
            InterfaceC2369AJc interfaceC2369AJc3 = c34708nhT.AEQbTJ.get();
            if (interfaceC2369AJc3 != null) {
                interfaceC2369AJc3.AEQbTJ();
            }
        }
        AIP aipAEQbTJ = c34708nhT.fIwbmz().AEQbTJ(C56423yEv.EZpvd(C56390yDp.OLrzqt("bundleId", C32979mnm.EZpvd.OLrzqt().getPackageName())));
        c34708nhT.AEQbTJ.set(aipAEQbTJ);
        pUU.KWHzl("PublicBetaModule", "start fetch all feature, id: " + aipAEQbTJ.hashCode());
        aipAEQbTJ.AEQbTJ(new Activity(aipAEQbTJ, c34708nhT));
    }

    /* JADX INFO: renamed from: o.nhT$Activity */
    public static final class Activity implements InterfaceC4440Bed {
        public final /* synthetic */ AIP AEQbTJ;
        public final /* synthetic */ C34708nhT EZpvd;

        public Activity(AIP aip, C34708nhT c34708nhT) {
            this.AEQbTJ = aip;
            this.EZpvd = c34708nhT;
        }

        @Override // o.InterfaceC4440Bed
        public void OLrzqt() {
            pUU.KWHzl("PublicBetaModule", "fetch all features: " + this.AEQbTJ.hashCode() + ", " + this.AEQbTJ.copydefault() + "}");
            this.EZpvd.AEQbTJ.set(null);
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        try {
            Result.Application application = Result.Companion;
            interfaceC43237rlW.copydefault(new C34773nil(), C56392yDr.copydefault(new Function0() { // from class: o.nhW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34708nhT.AhwBna();
                }
            }));
            interfaceC43237rlW.copydefault(new C34771nij(), C56392yDr.copydefault(new Function0() { // from class: o.nhU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34708nhT.gEmmrt();
                }
            }));
            interfaceC43237rlW.copydefault(new C34777nip(), C56392yDr.copydefault(new Function0() { // from class: o.nia
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34708nhT.isConnected();
                }
            }));
            interfaceC43237rlW.copydefault(new C34778niq(), C56392yDr.copydefault(new Function0() { // from class: o.nhX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34708nhT.fetchVPNInfo();
                }
            }));
            interfaceC43237rlW.copydefault(new C34769nih(), C56392yDr.copydefault(new Function0() { // from class: o.nhZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34708nhT.values();
                }
            }));
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final C34770nii AhwBna() {
        return new C34770nii();
    }

    public static final C34770nii gEmmrt() {
        return new C34770nii();
    }

    public static final C34770nii isConnected() {
        return new C34770nii();
    }

    public static final C34770nii fetchVPNInfo() {
        return new C34770nii();
    }

    public static final C34770nii values() {
        return new C34770nii();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void markLaunchComplete() {
        super.markLaunchComplete();
        fJNWhG();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new PublicBetaModule$markLaunchComplete$1(this, null), 3, null);
    }
}
