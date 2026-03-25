package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedAmountValueType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lfQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30662lfQ extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public java.lang.String AEQbTJ = "";
    public AdvancedAmountValueType EZpvd = AdvancedAmountValueType.AMOUNT;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.lfV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C30662lfQ.OLrzqt(this.OLrzqt);
        }
    });
    public Function1<? super C55276xgr, Unit> copydefault;

    /* JADX INFO: renamed from: o.lfQ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lfQ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C30662lfQ EZpvd(@NotNull java.lang.String str, @NotNull AdvancedAmountValueType advancedAmountValueType, @NotNull Function1<? super C55276xgr, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(advancedAmountValueType, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C30662lfQ c30662lfQ = new C30662lfQ();
            c30662lfQ.AEQbTJ = str;
            c30662lfQ.EZpvd = advancedAmountValueType;
            c30662lfQ.copydefault = function1;
            return c30662lfQ;
        }
    }

    private final java.util.List<C55276xgr> EZpvd() {
        C55276xgr[] c55276xgrArr = new C55276xgr[2];
        java.lang.String strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.size, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", this.AEQbTJ)));
        AdvancedAmountValueType advancedAmountValueType = AdvancedAmountValueType.AMOUNT;
        c55276xgrArr[0] = new C55276xgr(strCopydefault, advancedAmountValueType, null, this.EZpvd == advancedAmountValueType, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        java.lang.String strCopydefault2 = C33069mpW.copydefault(C23274hvD.Fragment.scaleBitmap, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", C23272hvB.KWHzl.OLrzqt().getSymbol())));
        AdvancedAmountValueType advancedAmountValueType2 = AdvancedAmountValueType.VALUE;
        c55276xgrArr[1] = new C55276xgr(strCopydefault2, advancedAmountValueType2, null, this.EZpvd == advancedAmountValueType2, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        return yDY.gEmmrt(c55276xgrArr);
    }

    public final C30661lfP AEQbTJ() {
        return (C30661lfP) this.OLrzqt.getValue();
    }

    public static final C30661lfP OLrzqt(final C30662lfQ c30662lfQ) {
        return new C30661lfP(new Function1() { // from class: o.lfW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30662lfQ.KWHzl(this.EZpvd, (C55276xgr) obj);
            }
        });
    }

    public static final Unit KWHzl(C30662lfQ c30662lfQ, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        Function1<? super C55276xgr, Unit> function1 = c30662lfQ.copydefault;
        if (function1 != null) {
            function1.invoke(c55276xgr);
        }
        c30662lfQ.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23414hxl.OLrzqt(getCustomLayoutInflater(), constraintLayout, true).OLrzqt.setAdapter(AEQbTJ());
        AEQbTJ().setItems(EZpvd());
    }
}
