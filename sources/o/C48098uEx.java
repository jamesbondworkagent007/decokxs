package o;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uEx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48098uEx extends AbstractC49393unh {
    public C48467uSm AYXKKw;
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public static final java.lang.String AEQbTJ = C48098uEx.class.getSimpleName();
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.uEy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C48098uEx.KWHzl(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.uED
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C48098uEx.AEQbTJ(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.uEF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C48098uEx.AEQbTJ();
        }
    });

    /* JADX INFO: renamed from: o.uEx$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uEx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C48098uEx c48098uEx = new C48098uEx();
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("bot_inst_type", str));
            bundleBundleOf.putStringArrayList("bot_inst_id", new java.util.ArrayList<>(list));
            c48098uEx.setArguments(bundleBundleOf);
            java.lang.String str2 = C48098uEx.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            C49662usl.EZpvd(c48098uEx, fragmentManager, str2);
        }
    }

    public static final java.util.List KWHzl(C48098uEx c48098uEx) {
        android.os.Bundle arguments = c48098uEx.getArguments();
        java.util.ArrayList<java.lang.String> stringArrayList = arguments != null ? arguments.getStringArrayList("bot_inst_id") : null;
        return stringArrayList == null ? yDY.AhwBna() : stringArrayList;
    }

    public final java.util.List<java.lang.String> copydefault() {
        return (java.util.List) this.copydefault.getValue();
    }

    public static final java.lang.String AEQbTJ(C48098uEx c48098uEx) {
        android.os.Bundle arguments = c48098uEx.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("bot_inst_type") : null;
        return string == null ? "" : string;
    }

    private final java.lang.String EZpvd() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final uEA AEQbTJ() {
        return new uEA(null, 1, 0 == true ? 1 : 0);
    }

    private final uEA valueOf() {
        return (uEA) this.OLrzqt.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.iZzfmt));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C48467uSm c48467uSmCopydefault = C48467uSm.copydefault(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        Intrinsics.copydefault(c48467uSmCopydefault);
        copydefault(c48467uSmCopydefault);
        this.AYXKKw = c48467uSmCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(C48467uSm c48467uSm) {
        uCB ucb;
        RecyclerView recyclerView = c48467uSm.KWHzl;
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        recyclerView.setAdapter(valueOf());
        recyclerView.addItemDecoration(new C57584ylF(2, C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null)));
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.OLrzqt(EZpvd()) : null;
        java.util.List<java.lang.String> listCopydefault = copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : listCopydefault) {
            if (abstractC54531xLwOLrzqt != null) {
                Intrinsics.copydefault((java.lang.Object) str);
                BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str);
                if (bizInstrumentValueOf != null) {
                    java.lang.String instId = bizInstrumentValueOf.getInstId();
                    java.lang.String strValueOf = interfaceC54581xNrCopydefault.valueOf(bizInstrumentValueOf.getTradeSymbol());
                    C54799xVt c54799xVt = C54799xVt.AEQbTJ;
                    ucb = new uCB(instId, strValueOf, C54799xVt.getTitleByIdAndType$default(c54799xVt, bizInstrumentValueOf.getInstId(), bizInstrumentValueOf.getInstType(), false, false, 12, null), c54799xVt.copydefault(bizInstrumentValueOf.getInstId(), bizInstrumentValueOf.getInstType(), (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? "normal" : null, (124 & 32) != 0, (124 & 64) != 0 ? null : null, (124 & 128) != 0 ? false : true), false, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 496, null);
                } else {
                    ucb = null;
                }
            }
            if (ucb != null) {
                arrayList.add(ucb);
            }
        }
        valueOf().EZpvd(arrayList);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
    }
}
