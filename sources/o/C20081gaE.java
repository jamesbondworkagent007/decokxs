package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gaE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20081gaE extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public java.lang.String gEmmrt = "";
    public java.lang.String AhwBna = "";
    public boolean copydefault = true;
    public java.util.List<CustomChainMeta> AEQbTJ = yDY.AhwBna();
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.gaB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20081gaE.AEQbTJ();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super java.lang.String, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<java.lang.String, Unit> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.gaE$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gaE.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C20081gaE EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.util.List<CustomChainMeta> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            C20081gaE c20081gaE = new C20081gaE();
            c20081gaE.gEmmrt = str;
            c20081gaE.AhwBna = str2;
            c20081gaE.copydefault = z;
            c20081gaE.AEQbTJ = list;
            return c20081gaE;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(4);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.UiContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AEQbTJ() {
        return new C43316rmw();
    }

    private final C43316rmw copydefault() {
        return (C43316rmw) this.OLrzqt.getValue();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        AbstractC16533eli abstractC16533eliAEQbTJ = AbstractC16533eli.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(abstractC16533eliAEQbTJ, "");
        abstractC16533eliAEQbTJ.copydefault.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.ReturnThis, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", this.gEmmrt))));
        C52794wYp c52794wYp = abstractC16533eliAEQbTJ.EZpvd;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.copydefault) {
            arrayList.add("");
        }
        java.util.List<CustomChainMeta> list = this.AEQbTJ;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CustomChainMeta) it.next()).isConnected());
            }
        }
        abstractC16533eliAEQbTJ.OLrzqt.setAdapter(copydefault());
        copydefault().register(java.lang.String.class, new C20136gbG(this.AhwBna, new Function1() { // from class: o.gaA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20081gaE.copydefault(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        C33064mpR.OLrzqt(copydefault(), (java.util.List<? extends java.lang.Object>) arrayList);
        constraintLayout.post(new java.lang.Runnable() { // from class: o.gaC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C20081gaE.copydefault(this.copydefault);
            }
        });
    }

    public static final Unit copydefault(C20081gaE c20081gaE, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c20081gaE.AhwBna = str;
        c20081gaE.copydefault().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    public static final void copydefault(C20081gaE c20081gaE) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c20081gaE, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.gaE$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C20081gaE KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C20081gaE c20081gaE) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c20081gaE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1<java.lang.String, Unit> function1OLrzqt = this.KWHzl.OLrzqt();
                if (function1OLrzqt != null) {
                    function1OLrzqt.invoke(this.KWHzl.AhwBna);
                }
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }
}
