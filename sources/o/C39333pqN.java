package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pqN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39333pqN extends C57662yme {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public AbstractC36031oMs KWHzl;

    /* JADX INFO: renamed from: o.pqN$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pqN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC36031oMs abstractC36031oMs = (AbstractC36031oMs) DataBindingUtil.inflate(layoutInflater, C35964oKf.Application.uzCIH, viewGroup, false);
        this.KWHzl = abstractC36031oMs;
        if (abstractC36031oMs != null) {
            return abstractC36031oMs.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        OKRegularCell oKRegularCell;
        OKRegularCell oKRegularCell2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC36031oMs abstractC36031oMs = this.KWHzl;
        if (abstractC36031oMs != null && (oKRegularCell2 = abstractC36031oMs.KWHzl) != null) {
            oKRegularCell2.setOnClickListener(new View.OnClickListener() { // from class: o.pqO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C39333pqN.copydefault(this.OLrzqt, view2);
                }
            });
        }
        AbstractC36031oMs abstractC36031oMs2 = this.KWHzl;
        if (abstractC36031oMs2 != null && (oKRegularCell = abstractC36031oMs2.copydefault) != null) {
            oKRegularCell.setOnClickListener(new View.OnClickListener() { // from class: o.pqS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C39333pqN.KWHzl(this.copydefault, view2);
                }
            });
        }
        view.post(new java.lang.Runnable() { // from class: o.pqQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C39333pqN.OLrzqt(this.copydefault);
            }
        });
    }

    public static final void copydefault(C39333pqN c39333pqN, android.view.View view) {
        C39598pvP c39598pvPOLrzqt = C39598pvP.Companion.OLrzqt();
        androidx.fragment.app.FragmentManager parentFragmentManager = c39333pqN.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c39598pvPOLrzqt.show(parentFragmentManager);
        c39333pqN.dismiss();
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_Sheet_ChartGuideIcon_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pqM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39333pqN.copydefault((EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "guide_type", "basics", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C39333pqN c39333pqN, android.view.View view) {
        C39608pvZ c39608pvZAEQbTJ = C39608pvZ.Companion.AEQbTJ();
        androidx.fragment.app.FragmentManager parentFragmentManager = c39333pqN.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c39608pvZAEQbTJ.show(parentFragmentManager);
        c39333pqN.dismiss();
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_Sheet_ChartGuideIcon_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pqP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39333pqN.EZpvd((EventParamsList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "guide_type", "order_position_line", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C39333pqN c39333pqN) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c39333pqN, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KWHzl(true);
    }
}
