package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lku, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30957lku extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public java.util.List<DexMultiTokenInfoBean> KWHzl;
    public Function1<? super DexMultiTokenInfoBean, Unit> OLrzqt;
    public C21583hEt copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function1<? super DexMultiTokenInfoBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 40.0f;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    /* JADX INFO: renamed from: o.lku$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lku.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C30957lku copydefault(java.util.List<DexMultiTokenInfoBean> list) {
            C30957lku c30957lku = new C30957lku();
            c30957lku.KWHzl = list;
            return c30957lku;
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.Swccd));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = C21583hEt.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        AEQbTJ();
    }

    public static final Unit EZpvd(C30957lku c30957lku, C30956lkt c30956lkt) {
        Function1<? super DexMultiTokenInfoBean, Unit> function1;
        Intrinsics.checkNotNullParameter(c30956lkt, "");
        java.util.List<DexMultiTokenInfoBean> list = c30957lku.KWHzl;
        java.lang.Object obj = null;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DexMultiTokenInfoBean) next).getChainId(), (java.lang.Object) c30956lkt.OLrzqt())) {
                    obj = next;
                    break;
                }
            }
            obj = (DexMultiTokenInfoBean) obj;
        }
        if (obj != null && (function1 = c30957lku.OLrzqt) != null) {
            function1.invoke(obj);
        }
        c30957lku.dismiss();
        return Unit.INSTANCE;
    }

    private final void AEQbTJ() {
        java.util.List listAhwBna;
        RecyclerView recyclerView;
        java.util.List<DexMultiTokenInfoBean> list = this.KWHzl;
        if (list != null) {
            listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (DexMultiTokenInfoBean dexMultiTokenInfoBean : list) {
                listAhwBna.add(new C30956lkt(dexMultiTokenInfoBean.getTokenSymbol(), dexMultiTokenInfoBean.getTokenLogoUrl(), C25352ivB.formatAddress$default(dexMultiTokenInfoBean.getTokenContractAddress(), 4, 4, null, 4, null), dexMultiTokenInfoBean.getChainLogoUrl(), dexMultiTokenInfoBean.getChainName(), dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenName()));
            }
        } else {
            listAhwBna = null;
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        C30954lkr c30954lkr = new C30954lkr(listAhwBna, new Function1() { // from class: o.lks
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30957lku.EZpvd(this.OLrzqt, (C30956lkt) obj);
            }
        });
        C21583hEt c21583hEt = this.copydefault;
        if (c21583hEt == null || (recyclerView = c21583hEt.EZpvd) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(c30954lkr);
    }
}
