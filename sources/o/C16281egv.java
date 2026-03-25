package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.biz.net.bean.CoinProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.egv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16281egv extends AbstractC52786wYh {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public Function1<? super CoinProtocol, Unit> KWHzl;

    /* JADX INFO: renamed from: o.egv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.egv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C16281egv copydefault(@NotNull java.util.ArrayList<CoinProtocol> arrayList, @NotNull Function1<? super CoinProtocol, Unit> function1) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C16281egv c16281egv = new C16281egv();
            c16281egv.KWHzl = function1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("PROTOCOL_LIST", arrayList);
            c16281egv.setArguments(bundle);
            return c16281egv;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.KWHzl().setVisibility(4);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
        wxq.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DGOPHZDGOPHZ));
        wxq.setPaddingRelative(6, 0, 8, 0);
    }

    @Override // o.AbstractC52786wYh, o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(12, 0, 8, 24);
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        java.util.ArrayList<CoinProtocol> arrayList;
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.setType(0);
        getArguments();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (arrayList = arguments.getParcelableArrayList("PROTOCOL_LIST")) == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (CoinProtocol coinProtocol : arrayList) {
            arrayList2.add(new C55276xgr(coinProtocol.getProtocolName(), coinProtocol, null, false, false, coinProtocol.getLogo(), null, 92, null));
        }
        c55198xfS.setSingleOneColumnData(arrayList2, new yHO() { // from class: o.egu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C16281egv.AEQbTJ(this.AEQbTJ, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit AEQbTJ(C16281egv c16281egv, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        Function1<? super CoinProtocol, Unit> function1 = c16281egv.KWHzl;
        if (function1 != null) {
            java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
            Intrinsics.copydefault(objOLrzqt, "");
            function1.invoke((CoinProtocol) objOLrzqt);
        }
        c16281egv.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.egv$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C16281egv copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C16281egv c16281egv) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c16281egv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
