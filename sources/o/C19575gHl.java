package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gHl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19575gHl extends AbstractC59533zio<C19577gHn, Activity> {
    public final Function1<C19577gHn, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.gHn, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19575gHl(Function1<? super C19577gHn, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16996euU c16996euUOLrzqt = C16996euU.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16996euUOLrzqt, "");
        return new Activity(c16996euUOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull C19577gHn c19577gHn) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c19577gHn, "");
        java.lang.String addressStr$default = C14079deg.getAddressStr$default(C14079deg.EZpvd, c19577gHn.OLrzqt(), false, 2, null);
        java.lang.String strGEmmrt = c19577gHn.gEmmrt();
        if (strGEmmrt.length() != 0) {
            addressStr$default = strGEmmrt;
        }
        activity.OLrzqt().copydefault.setText(addressStr$default);
        activity.OLrzqt().KWHzl.setText(c19577gHn.OLrzqt());
        android.widget.TextView textView = activity.OLrzqt().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(c19577gHn.valueOf() ? 0 : 8);
        C55251xgS c55251xgS = activity.OLrzqt().valueOf;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        if (c19577gHn.KWHzl().length() > 0) {
            c55251xgS.setText(c19577gHn.KWHzl());
        }
        c55251xgS.setVisibility(c19577gHn.KWHzl().length() <= 0 ? 8 : 0);
        AppCompatImageView appCompatImageView = activity.OLrzqt().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C14725dqq.copydefault(appCompatImageView, c19577gHn.OLrzqt(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.gHm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19575gHl.AEQbTJ((C5335Nt) obj);
            }
        }, 32.0f);
        android.view.View view = activity.itemView;
        view.setOnClickListener(new StateListAnimator(view, 1000L, this, c19577gHn));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gHl$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final C16996euU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C16996euU OLrzqt() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C16996euU c16996euU) {
            super(c16996euU.getRoot());
            Intrinsics.checkNotNullParameter(c16996euU, "");
            this.copydefault = c16996euU;
        }
    }

    /* JADX INFO: renamed from: o.gHl$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C19575gHl EZpvd;
        public final /* synthetic */ C19577gHn KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C19575gHl c19575gHl, C19577gHn c19577gHn) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c19575gHl;
            this.KWHzl = c19577gHn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.EZpvd;
                if (function1 != null) {
                    function1.invoke(this.KWHzl);
                }
            }
        }
    }
}
