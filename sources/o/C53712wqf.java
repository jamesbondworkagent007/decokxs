package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.tradingbot.impl.planet.model.BotDisplayType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wqf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53712wqf extends AbstractC52792wYn {
    public Function1<? super BotDisplayType, Unit> OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public BotDisplayType EZpvd = BotDisplayType.YieldRatioOnly;
    public final boolean KWHzl = true;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.wqh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53712wqf.AEQbTJ(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.wqf$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wqf.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C53712wqf OLrzqt(BotDisplayType botDisplayType, @NotNull Function1<? super BotDisplayType, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            C53712wqf c53712wqf = new C53712wqf();
            kotlin.Pair[] pairArr = new kotlin.Pair[1];
            if (botDisplayType == null) {
                botDisplayType = BotDisplayType.YieldRatioOnly;
            }
            pairArr[0] = C56390yDp.OLrzqt("displayType", botDisplayType);
            c53712wqf.setArguments(BundleKt.bundleOf(pairArr));
            c53712wqf.OLrzqt = function1;
            return c53712wqf;
        }
    }

    public final BotDisplayType KWHzl() {
        return (BotDisplayType) this.copydefault.getValue();
    }

    public static final BotDisplayType AEQbTJ(C53712wqf c53712wqf) {
        android.os.Bundle arguments = c53712wqf.getArguments();
        if (arguments == null) {
            arguments = BundleKt.bundleOf();
        }
        BotDisplayType botDisplayType = (BotDisplayType) BundleCompat.getParcelable(arguments, "displayType", BotDisplayType.class);
        return botDisplayType == null ? BotDisplayType.YieldRatioOnly : botDisplayType;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.iLWfRf));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C55688xof.Application.PipHintTrackerKt);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: o.wqg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C53712wqf.EZpvd(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void EZpvd(C53712wqf c53712wqf, android.view.View view) {
        Function1<? super BotDisplayType, Unit> function1 = c53712wqf.OLrzqt;
        if (function1 != null) {
            function1.invoke(c53712wqf.EZpvd);
        }
        c53712wqf.dismiss();
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        this.EZpvd = KWHzl();
        InterfaceC56445yFq<BotDisplayType> entries = BotDisplayType.getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
        java.util.Iterator<BotDisplayType> it = entries.iterator();
        while (it.hasNext()) {
            BotDisplayType next = it.next();
            arrayList.add(new C55276xgr(C33070mpX.AYXKKw(next.getDisplayKey()), next, null, KWHzl() == next, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        c55198xfS.setSingleOneColumnData(arrayList, new yHO() { // from class: o.wqd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C53712wqf.EZpvd(this.AEQbTJ, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit EZpvd(C53712wqf c53712wqf, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        Intrinsics.copydefault(objOLrzqt, "");
        c53712wqf.EZpvd = (BotDisplayType) objOLrzqt;
        return Unit.INSTANCE;
    }
}
