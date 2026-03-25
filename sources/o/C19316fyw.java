package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fyw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19316fyw extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public Function1<? super java.lang.String, Unit> copydefault;

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    /* JADX INFO: renamed from: o.fyw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fyw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C19316fyw EZpvd(@NotNull Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            C19316fyw c19316fyw = new C19316fyw();
            c19316fyw.copydefault = function1;
            return c19316fyw;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
        wxq.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.zLjUOn));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC16478ekg abstractC16478ekgOLrzqt = AbstractC16478ekg.OLrzqt(getLayoutInflater(), constraintLayout, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16478ekgOLrzqt, "");
        constraintLayout.addView(abstractC16478ekgOLrzqt.getRoot());
        for (java.lang.String str : C17304fAj.EZpvd.DbNXlk()) {
            android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C13754dXa.TaskDescription.gAnGwV, (android.view.ViewGroup) abstractC16478ekgOLrzqt.OLrzqt, false);
            abstractC16478ekgOLrzqt.OLrzqt.addView(viewInflate, new LinearLayout.LayoutParams(-1, C55298xhM.dpInt$default(72, (android.content.Context) null, 1, (java.lang.Object) null)));
            viewInflate.setOnClickListener(new Activity(viewInflate, 1000L, this, str));
            android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.PlaybackStateCompatBuilder);
            ShapeableImageView shapeableImageView = (ShapeableImageView) viewInflate.findViewById(C13754dXa.ActionBar.RemoteActionCompatParcelizer);
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getNewProxyInstance);
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getFieldNames);
            int iHashCode = str.hashCode();
            if (iHashCode != -1313360888) {
                if (iHashCode != 817899663) {
                    if (iHashCode == 1104586909 && str.equals("com.okx.tr")) {
                        textView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.iwGUEr));
                    }
                } else if (str.equals("com.okinc.okex.gp")) {
                    if (C17304fAj.EZpvd.AEQbTJ("com.okinc.okex")) {
                        textView.setText(strAYXKKw2);
                    } else {
                        textView.setText(strAYXKKw);
                    }
                    shapeableImageView.setBackgroundDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.iqeXgQ));
                }
            } else if (str.equals("com.okinc.okex")) {
                textView.setText(strAYXKKw);
                shapeableImageView.setBackgroundDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.iqeXgQ));
            }
        }
    }

    /* JADX INFO: renamed from: o.fyw$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ C19316fyw EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C19316fyw c19316fyw, java.lang.String str) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c19316fyw;
            this.AEQbTJ = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismiss();
                Function1 function1 = this.EZpvd.copydefault;
                if (function1 != null) {
                    function1.invoke(this.AEQbTJ);
                }
            }
        }
    }
}
