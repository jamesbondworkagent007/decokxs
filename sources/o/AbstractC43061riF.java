package o;

import androidx.fragment.app.FragmentActivity;
import com.immomo.mls.InitData;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC7340ahw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.riF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC43061riF extends AbstractC32998moE {
    public boolean AuCTel;
    public boolean ejfBZ;
    public final int fIwbmz;
    public C7328ahk fJNWhG;
    public java.lang.Integer iwGUEr;
    public boolean values;
    public java.lang.String DbNXlk = "";
    public final java.util.HashMap<java.lang.String, java.lang.Object> fARcdN = new java.util.HashMap<>();
    public java.lang.String fetchVPNInfo = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.HashMap<java.lang.String, java.lang.Object> AEQbTJ() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7328ahk AkhnZx() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int DbNXlk() {
        return this.fIwbmz;
    }

    public abstract android.view.ViewGroup EZpvd();

    public abstract java.lang.String copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(C7328ahk c7328ahk) {
        this.fJNWhG = c7328ahk;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        if (C7788aqT.AEQbTJ() != null) {
            java.util.HashMap map = OLrzqt().KWHzl;
            str = null;
            java.lang.Object obj = map != null ? map.get("appid") : null;
            if (obj instanceof java.lang.String) {
                str = (java.lang.String) obj;
            }
        } else {
            str = "";
        }
        this.fetchVPNInfo = str;
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C43128rjT.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.riI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return AbstractC43061riF.OLrzqt(this.OLrzqt, (C43128rjT) obj2);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.riL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                AbstractC43061riF.AEQbTJ(function1, obj2);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(C43016rhN.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXKWHzl2, this);
        final Function1 function12 = new Function1() { // from class: o.riK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return AbstractC43061riF.EZpvd(this.OLrzqt, (C43016rhN) obj2);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.riJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                AbstractC43061riF.EZpvd(function12, obj2);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl3 = RxBus.KWHzl(C43044rhp.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        AbstractC58185ywX abstractC58185ywXEZpvd3 = C58156yvv.EZpvd(abstractC58185ywXKWHzl3, this);
        final Function1 function13 = new Function1() { // from class: o.riM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return AbstractC43061riF.OLrzqt(this.EZpvd, (C43044rhp) obj2);
            }
        };
        abstractC58185ywXEZpvd3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.riQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                AbstractC43061riF.AhwBna(function13, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractC43061riF abstractC43061riF, C43128rjT c43128rjT) {
        abstractC43061riF.AuCTel = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AbstractC43061riF abstractC43061riF, C43016rhN c43016rhN) {
        if (Intrinsics.EZpvd((java.lang.Object) c43016rhN.AEQbTJ(), (java.lang.Object) abstractC43061riF.fetchVPNInfo)) {
            abstractC43061riF.values = true;
            abstractC43061riF.DbNXlk = c43016rhN.copydefault();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractC43061riF abstractC43061riF, C43044rhp c43044rhp) {
        abstractC43061riF.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        java.lang.Integer numKWHzl;
        java.lang.Object obj = AEQbTJ().get("appearance");
        if (obj == null) {
            obj = "";
        }
        android.util.SparseArray<C33510mxn> sparseArrayCopydefault = C43146rjl.copydefault((java.lang.String) obj);
        if (sparseArrayCopydefault == null || (numKWHzl = C33503mxg.KWHzl(sparseArrayCopydefault)) == null) {
            return;
        }
        int iIntValue = numKWHzl.intValue();
        if (getActivity() instanceof AbstractActivityC33041mov) {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            this.iwGUEr = java.lang.Integer.valueOf(((AbstractActivityC33041mov) activity).getThemeId());
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.setTheme(iIntValue);
        }
    }

    public final void AuCTel() {
        java.lang.Integer num = this.iwGUEr;
        if (num != null) {
            int iIntValue = num.intValue();
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setTheme(iIntValue);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    @Override // o.AbstractC32998moE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onVisible() {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        isConnected();
        if (!this.ejfBZ) {
            fetchVPNInfo();
            this.ejfBZ = true;
        }
        if (this.AuCTel || this.values) {
            FragmentActivity activity = getActivity();
            if (((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.findFragmentByTag("")) == null) {
                if (this.values) {
                    C7328ahk c7328ahk = this.fJNWhG;
                    if (Intrinsics.EZpvd((java.lang.Object) (c7328ahk != null ? c7328ahk.KWHzl() : null), (java.lang.Object) this.DbNXlk)) {
                    }
                } else {
                    if (this.AuCTel) {
                        fetchVPNInfo();
                    }
                    this.values = false;
                    this.DbNXlk = "";
                    this.AuCTel = false;
                }
            }
        }
        C7328ahk c7328ahk2 = this.fJNWhG;
        if (c7328ahk2 != null) {
            c7328ahk2.zLjUOn();
        }
    }

    public void copydefault(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
    }

    /* JADX INFO: renamed from: o.riF$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC7340ahw {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC7340ahw
        public void EZpvd(java.lang.Throwable th) {
            InterfaceC7340ahw.StateListAnimator.copydefault(this, th);
        }

        @Override // o.InterfaceC7340ahw
        public void OLrzqt() {
            C7328ahk c7328ahkAkhnZx;
            AbstractC43061riF.this.dismissLoading();
            if (!AbstractC43061riF.this.isAdded() || AbstractC43061riF.this.isDetached()) {
                return;
            }
            C7328ahk c7328ahkAkhnZx2 = AbstractC43061riF.this.AkhnZx();
            if (c7328ahkAkhnZx2 != null) {
                c7328ahkAkhnZx2.AubY();
            }
            AbstractC43061riF.this.copydefault((C7328ahk) null);
            android.view.ViewGroup viewGroupEZpvd = AbstractC43061riF.this.EZpvd();
            if (viewGroupEZpvd != null) {
                AbstractC43061riF abstractC43061riF = AbstractC43061riF.this;
                viewGroupEZpvd.removeAllViews();
                abstractC43061riF.copydefault(new C7328ahk(abstractC43061riF.requireActivity()));
                C7328ahk c7328ahkAkhnZx3 = abstractC43061riF.AkhnZx();
                if (c7328ahkAkhnZx3 != null) {
                    c7328ahkAkhnZx3.fIwbmz = false;
                }
                C7328ahk c7328ahkAkhnZx4 = abstractC43061riF.AkhnZx();
                if (c7328ahkAkhnZx4 != null) {
                    c7328ahkAkhnZx4.valueOf = abstractC43061riF.DbNXlk();
                }
                C7328ahk c7328ahkAkhnZx5 = abstractC43061riF.AkhnZx();
                if (c7328ahkAkhnZx5 != null) {
                    c7328ahkAkhnZx5.OLrzqt(abstractC43061riF.AEQbTJ());
                }
                C7328ahk c7328ahkAkhnZx6 = abstractC43061riF.AkhnZx();
                if (c7328ahkAkhnZx6 != null) {
                    c7328ahkAkhnZx6.EZpvd(viewGroupEZpvd);
                }
                C7328ahk c7328ahkAkhnZx7 = abstractC43061riF.AkhnZx();
                if (c7328ahkAkhnZx7 != null) {
                    c7328ahkAkhnZx7.EZpvd(abstractC43061riF.getOkQPL());
                }
                C7328ahk c7328ahkAkhnZx8 = abstractC43061riF.AkhnZx();
                if (c7328ahkAkhnZx8 != null) {
                    c7328ahkAkhnZx8.AEQbTJ(abstractC43061riF.OLrzqt());
                }
            }
            AbstractC43061riF abstractC43061riF2 = AbstractC43061riF.this;
            java.util.HashMap map = abstractC43061riF2.OLrzqt().KWHzl;
            java.lang.Object obj = map != null ? map.get("appid") : null;
            abstractC43061riF2.fetchVPNInfo = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (!AbstractC43061riF.this.isVisibled() || (c7328ahkAkhnZx = AbstractC43061riF.this.AkhnZx()) == null) {
                return;
            }
            c7328ahkAkhnZx.zLjUOn();
        }
    }

    public final void fetchVPNInfo() {
        copydefault(new Function0() { // from class: o.riN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC43061riF.OLrzqt(this.EZpvd);
            }
        });
    }

    public static final Unit OLrzqt(AbstractC43061riF abstractC43061riF) {
        android.content.Context applicationContext = abstractC43061riF.requireContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        C43082ria.copydefault(applicationContext, abstractC43061riF.new StateListAnimator());
        return Unit.INSTANCE;
    }

    public InitData OLrzqt() {
        InitData initDataAEQbTJ = C7327ahj.EZpvd(C7788aqT.AEQbTJ().AEQbTJ(requireContext(), copydefault()), false).AEQbTJ(false);
        Intrinsics.checkNotNullExpressionValue(initDataAEQbTJ, "");
        return initDataAEQbTJ;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        C7328ahk c7328ahk = this.fJNWhG;
        if (c7328ahk != null) {
            c7328ahk.zsXlph();
        }
        AuCTel();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C7328ahk c7328ahk = this.fJNWhG;
        if (c7328ahk != null) {
            c7328ahk.gHZMYf();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C7328ahk c7328ahk = this.fJNWhG;
        if (c7328ahk != null) {
            c7328ahk.AubY();
        }
        this.ejfBZ = false;
    }

    @Override // o.AbstractC32996moC
    public java.lang.String getQPLSourceName() {
        return copydefault();
    }
}
