package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import com.okinc.okex.center.bean.enums.TopCategory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.scR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44728scR extends AbstractC52792wYn {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.scT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C44728scR.AEQbTJ(this.EZpvd);
        }
    });
    public final boolean KWHzl;
    public final java.util.List<C55276xgr> copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.scR$Activity */
    public interface Activity {
        void AEQbTJ(@NotNull TopCategory topCategory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    public C44728scR() {
        TopCategory[] topCategoryArrValues = TopCategory.values();
        java.util.ArrayList<TopCategory> arrayList = new java.util.ArrayList();
        for (TopCategory topCategory : topCategoryArrValues) {
            if (topCategory != TopCategory.Unknown) {
                arrayList.add(topCategory);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (TopCategory topCategory2 : arrayList) {
            java.lang.Integer displayStringId = topCategory2.getDisplayStringId();
            java.lang.String strAYXKKw = displayStringId != null ? C33070mpX.AYXKKw(displayStringId.intValue()) : null;
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            arrayList2.add(new C55276xgr(strAYXKKw, topCategory2, null, false, false, null, null, 124, null));
        }
        this.copydefault = arrayList2;
    }

    public final Activity OLrzqt() {
        return (Activity) this.EZpvd.getValue();
    }

    public static final Activity AEQbTJ(C44728scR c44728scR) {
        KeyEventDispatcher.Component activity = c44728scR.getActivity();
        if (activity instanceof Activity) {
            return (Activity) activity;
        }
        return null;
    }

    /* JADX INFO: renamed from: o.scR$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.scR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C44728scR EZpvd() {
            return new C44728scR();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((C55276xgr) CollectionsKt___CollectionsKt.AuCTelauCTel(this.copydefault)).copydefault(true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setTitle(C33070mpX.AYXKKw(C47315tni.PendingIntent.fsSxsn));
        wxq.setStyle(1);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(0, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT), 0, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.AxsJAYaxsJAY));
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.setSingleOneColumnData(this.copydefault, new yHO() { // from class: o.scS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C44728scR.AEQbTJ(this.OLrzqt, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit AEQbTJ(C44728scR c44728scR, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        TopCategory topCategory = objOLrzqt instanceof TopCategory ? (TopCategory) objOLrzqt : null;
        if (topCategory != null) {
            Activity activityOLrzqt = c44728scR.OLrzqt();
            if (activityOLrzqt != null) {
                activityOLrzqt.AEQbTJ(topCategory);
            }
            c44728scR.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }
}
