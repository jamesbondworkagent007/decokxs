package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.teJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46813teJ extends AbstractC52792wYn {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public java.lang.String AEQbTJ;
    public Function1<? super java.lang.String, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super java.lang.String, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX INFO: renamed from: o.teJ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.teJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C46813teJ newInstance$default(TaskDescription taskDescription, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return taskDescription.AEQbTJ(str, function1);
        }

        public final C46813teJ AEQbTJ(java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            C46813teJ c46813teJ = new C46813teJ();
            c46813teJ.KWHzl(function1);
            c46813teJ.AEQbTJ = str;
            return c46813teJ;
        }
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        int paddingTop = constraintLayout.getPaddingTop();
        int paddingLeft = constraintLayout.getPaddingLeft();
        int paddingRight = constraintLayout.getPaddingRight();
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        constraintLayout.setPadding(paddingLeft, paddingTop, paddingRight, C55298xhM.copydefault(20.0f, context));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.setSingleOneColumnData(yDY.gEmmrt(new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.OGitdB), 0, null, Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "0"), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.zdxASf), 1, null, Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "1"), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.zzJhsT), 2, null, Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "2"), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.geLlBI), 3, null, Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "3"), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null)), new yHO() { // from class: o.teK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C46813teJ.OLrzqt(this.copydefault, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit OLrzqt(C46813teJ c46813teJ, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        Function1<? super java.lang.String, Unit> function1;
        java.lang.String string;
        java.lang.Object objOLrzqt;
        C54946xaf binding = c46813teJ.getBinding();
        if (binding != null && binding.EZpvd != null && (function1 = c46813teJ.KWHzl) != null) {
            if (c55276xgr == null || (objOLrzqt = c55276xgr.OLrzqt()) == null || (string = objOLrzqt.toString()) == null) {
                string = "";
            }
            function1.invoke(string);
        }
        c46813teJ.dismiss();
        return Unit.INSTANCE;
    }
}
