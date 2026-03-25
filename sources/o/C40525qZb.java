package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qZb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C40525qZb extends AbstractC52792wYn {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public java.util.ArrayList<C55276xgr> KWHzl = new java.util.ArrayList<>();
    public int AEQbTJ = -1;

    /* JADX INFO: renamed from: o.qZb$ActionBar */
    /* JADX INFO: loaded from: classes9.dex */
    public interface ActionBar {
        java.lang.CharSequence onGetTitle(@NotNull android.content.Context context);
    }

    /* JADX INFO: renamed from: o.qZb$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qZb.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final <T extends ActionBar> C40525qZb EZpvd(@NotNull java.lang.String str, @NotNull android.content.Context context, @NotNull java.util.List<? extends T> list, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            C40525qZb c40525qZb = new C40525qZb();
            int i2 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                ActionBar actionBar = (ActionBar) obj;
                c40525qZb.KWHzl.add(new C55276xgr(actionBar.onGetTitle(context), actionBar, null, i == i2, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
                i2++;
            }
            c40525qZb.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("key.request_key", str)));
            return c40525qZb;
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        C55118xds c55118xdsAEQbTJ;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setVisibility(8);
        android.view.View viewFindViewById = wxq.findViewById(C52761wXj.FragmentManager.DNMMPQ);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        C54946xaf binding = getBinding();
        if (binding == null || (c55118xdsAEQbTJ = binding.getRoot()) == null) {
            return;
        }
        c55118xdsAEQbTJ.setBackgroundColor(0);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iOLrzqt = C55298xhM.OLrzqt(12, contextRequireContext);
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        constraintLayout.setPaddingRelative(0, iOLrzqt, 0, C55298xhM.OLrzqt(24, contextRequireContext2));
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.setType(0);
        c55198xfS.setSingleOneColumnData(this.KWHzl, new yHO() { // from class: o.qZd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C40525qZb.AEQbTJ(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit AEQbTJ(C40525qZb c40525qZb, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        c40525qZb.AEQbTJ = CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends C55276xgr>) ((java.util.List<? extends java.lang.Object>) c40525qZb.KWHzl), c55276xgr);
        c40525qZb.dismiss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("key.request_key")) != null) {
            FragmentKt.setFragmentResult(this, string, BundleKt.bundleOf(C56390yDp.OLrzqt("key.select_index", java.lang.Integer.valueOf(this.AEQbTJ))));
        }
        super.onDismiss(dialogInterface);
    }
}
