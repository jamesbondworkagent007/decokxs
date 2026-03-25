package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.core.content.ContextCompat;
import com.google.android.material.tabs.TabLayout;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import o.C52812wZg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iYu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24205iYu implements InterfaceC25427iwX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final android.content.Context AEQbTJ;
    public TabLayout.Tab AhwBna;
    public boolean EZpvd;
    public InterfaceC58217yxC KWHzl;
    public C25428iwY OLrzqt;
    public androidx.fragment.app.Fragment valueOf;

    public C24205iYu(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
    }

    /* JADX INFO: renamed from: o.iYu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iYu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.InterfaceC25427iwX
    public void AEQbTJ(@NotNull TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "");
        this.AhwBna = tab;
        KWHzl();
        valueOf();
        C24200iYp.OLrzqt.EZpvd();
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C25514iyE.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.iYy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24205iYu.EZpvd(this.KWHzl, (C25514iyE) obj);
            }
        };
        this.KWHzl = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.iYx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24205iYu.copydefault(function1, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final C24205iYu c24205iYu, C25514iyE c25514iyE) {
        android.view.View customView;
        TabLayout.Tab tab = c24205iYu.AhwBna;
        if (tab != null && (customView = tab.getCustomView()) != null) {
            customView.postDelayed(new java.lang.Runnable() { // from class: o.iYz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C24205iYu.AEQbTJ(this.OLrzqt);
                }
            }, 100L);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C24205iYu c24205iYu) {
        c24205iYu.djBIcL();
    }

    @Override // o.InterfaceC25427iwX
    public void AEQbTJ() {
        this.EZpvd = true;
        gEmmrt();
    }

    @Override // o.InterfaceC25427iwX
    public void EZpvd() {
        this.EZpvd = false;
        KWHzl();
    }

    @Override // o.InterfaceC25427iwX
    public void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (fragment instanceof InterfaceC25484ixb) {
            this.valueOf = fragment;
            valueOf();
        }
    }

    public final void valueOf() {
        ActivityResultCaller activityResultCaller = this.valueOf;
        InterfaceC25484ixb interfaceC25484ixb = activityResultCaller instanceof InterfaceC25484ixb ? (InterfaceC25484ixb) activityResultCaller : null;
        if (interfaceC25484ixb == null) {
            return;
        }
        interfaceC25484ixb.OLrzqt(new Function1() { // from class: o.iYB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24205iYu.AEQbTJ(this.KWHzl, (C25428iwY) obj);
            }
        });
        this.OLrzqt = interfaceC25484ixb.copydefault();
        if (this.EZpvd) {
            gEmmrt();
        } else {
            KWHzl();
        }
    }

    public static final Unit AEQbTJ(C24205iYu c24205iYu, C25428iwY c25428iwY) {
        Intrinsics.checkNotNullParameter(c25428iwY, "");
        c24205iYu.OLrzqt = c25428iwY;
        if (c24205iYu.EZpvd) {
            c24205iYu.gEmmrt();
        }
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        TabLayout.Tab tab = this.AhwBna;
        if (tab == null) {
            return;
        }
        C25428iwY c25428iwY = this.OLrzqt;
        android.widget.ImageView imageViewEZpvd = C55243xgK.EZpvd(tab);
        if (imageViewEZpvd == null) {
            return;
        }
        if (c25428iwY == null || !c25428iwY.EZpvd()) {
            imageViewEZpvd.setVisibility(8);
            return;
        }
        djBIcL();
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(this.AEQbTJ, c25428iwY.AEQbTJ() ? C52761wXj.TaskDescription.dUDNAs : C52761wXj.TaskDescription.QSLkRj);
        if (drawable != null) {
            imageViewEZpvd.setImageDrawable(drawable);
            imageViewEZpvd.setVisibility(0);
        } else {
            pUU.valueOf("TabSelectIconManager", "Arrow drawable is null, hiding selectIcon");
            imageViewEZpvd.setVisibility(8);
        }
    }

    public final void KWHzl() {
        android.widget.ImageView imageViewEZpvd;
        TabLayout.Tab tab = this.AhwBna;
        if (tab == null || (imageViewEZpvd = C55243xgK.EZpvd(tab)) == null) {
            return;
        }
        imageViewEZpvd.setVisibility(8);
    }

    @Override // o.InterfaceC25427iwX
    public boolean copydefault() {
        TabLayout.Tab tab = this.AhwBna;
        if (tab == null) {
            return false;
        }
        C25428iwY c25428iwY = this.OLrzqt;
        android.widget.ImageView imageViewEZpvd = C55243xgK.EZpvd(tab);
        if (c25428iwY == null || !c25428iwY.EZpvd() || imageViewEZpvd == null || imageViewEZpvd.getVisibility() != 0) {
            return false;
        }
        Function0<Unit> function0Copydefault = c25428iwY.copydefault();
        if (function0Copydefault != null) {
            function0Copydefault.invoke();
        }
        return true;
    }

    @Override // o.InterfaceC25427iwX
    public void OLrzqt() {
        this.AhwBna = null;
        this.OLrzqt = null;
        this.valueOf = null;
        this.EZpvd = false;
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final void djBIcL() {
        if (this.EZpvd && this.AhwBna != null) {
            C24200iYp c24200iYp = C24200iYp.OLrzqt;
            if (c24200iYp.AEQbTJ()) {
                final C52812wZg c52812wZg = new C52812wZg(this.AEQbTJ);
                C52794wYp c52794wYpIsConnected = c52812wZg.isConnected();
                if (c52794wYpIsConnected != null) {
                    c52794wYpIsConnected.setText(this.AEQbTJ.getResources().getString(C25493ixk.FragmentManager.AYXKKw));
                }
                C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
                if (c52794wYpAkhnZx != null) {
                    c52794wYpAkhnZx.setVisibility(8);
                }
                c52812wZg.OLrzqt(2);
                android.widget.RelativeLayout relativeLayoutAhwBna = c52812wZg.AhwBna();
                if (relativeLayoutAhwBna != null) {
                    relativeLayoutAhwBna.setVisibility(0);
                }
                TabLayout.Tab tab = this.AhwBna;
                Intrinsics.copydefault(tab);
                TabLayout.TabView tabView = tab.view;
                Intrinsics.checkNotNullExpressionValue(tabView, "");
                int[] iArr = new int[2];
                tabView.getLocationOnScreen(iArr);
                int i = iArr[1];
                C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(tabView);
                stateListAnimator.EZpvd(i >= C55298xhM.dp2px$default(180.0f, null, 1, null) ? 3 : 1);
                stateListAnimator.AEQbTJ(this.AEQbTJ.getResources().getString(C25493ixk.FragmentManager.TarCU));
                stateListAnimator.OLrzqt(this.AEQbTJ.getResources().getString(C25493ixk.FragmentManager.RXzakW));
                stateListAnimator.copydefault(new Function0() { // from class: o.iYA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(C24205iYu.KWHzl(c52812wZg));
                    }
                });
                stateListAnimator.OLrzqt(2);
                stateListAnimator.KWHzl(8);
                stateListAnimator.copydefault(8);
                stateListAnimator.AEQbTJ(2);
                stateListAnimator.AEQbTJ(100.0f);
                c52812wZg.AEQbTJ(stateListAnimator);
                c52812wZg.fARcdN();
                c24200iYp.OLrzqt(true);
            }
        }
    }

    public static final boolean KWHzl(C52812wZg c52812wZg) {
        c52812wZg.KWHzl();
        return false;
    }
}
