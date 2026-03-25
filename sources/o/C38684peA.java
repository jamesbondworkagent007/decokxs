package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.peA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38684peA extends AbstractC32998moE {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public androidx.fragment.app.Fragment EZpvd;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.DTwDnp;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX INFO: renamed from: o.peA$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.peA.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C38684peA OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C38684peA c38684peA = new C38684peA();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(oLT.gEmmrt(), str);
            bundle.putString(oLT.valueOf(), str2);
            c38684peA.setArguments(bundle);
            return c38684peA;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pXB.registerTradeFragmentTrack$default(pXB.EZpvd, this, "KlineCopyTradingFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        this.AEQbTJ = arguments != null ? arguments.getString(oLT.gEmmrt()) : null;
        android.os.Bundle arguments2 = getArguments();
        this.copydefault = arguments2 != null ? arguments2.getString(oLT.valueOf()) : null;
        InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class);
        androidx.fragment.app.Fragment fragmentKWHzl = interfaceC49317umK != null ? interfaceC49317umK.KWHzl(this.copydefault) : null;
        this.EZpvd = fragmentKWHzl;
        if (fragmentKWHzl != null) {
            getChildFragmentManager().beginTransaction().replace(C35964oKf.StateListAnimator.DVmcag, fragmentKWHzl, fragmentKWHzl.getClass().getName()).commitAllowingStateLoss();
        }
        view.post(new java.lang.Runnable() { // from class: o.peC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C38684peA.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(C38684peA c38684peA) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c38684peA, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }
}
