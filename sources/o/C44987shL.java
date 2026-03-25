package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C44987shL;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.shL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44987shL extends AbstractC45384sol<Activity> {
    public Function0<Unit> OLrzqt;
    public int EZpvd = 6;
    public java.lang.String copydefault = "";
    public java.lang.String KWHzl = C33070mpX.AYXKKw(C47315tni.PendingIntent.RKDWNf);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i, @NotNull java.lang.String str, java.lang.String str2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = i;
        this.copydefault = str;
        if (str2 != null) {
            this.KWHzl = str2;
        }
        if (function0 != null) {
            this.OLrzqt = function0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.shL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateEmptyProperties$default(C44987shL c44987shL, int i, java.lang.String str, java.lang.String str2, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        c44987shL.copydefault(i, str, str2, function0);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC47446tqG abstractC47446tqGKWHzl = AbstractC47446tqG.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47446tqGKWHzl, "");
        return new Activity(this, abstractC47446tqGKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.KWHzl();
    }

    /* JADX INFO: renamed from: o.shL$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ C44987shL AEQbTJ;
        public final AbstractC47446tqG copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C44987shL c44987shL, AbstractC47446tqG abstractC47446tqG) {
            super(abstractC47446tqG.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47446tqG, "");
            this.AEQbTJ = c44987shL;
            this.copydefault = abstractC47446tqG;
        }

        public final void KWHzl() {
            C55173xeu c55173xeu = this.copydefault.OLrzqt;
            final C44987shL c44987shL = this.AEQbTJ;
            c55173xeu.setEmptyTypeImage(c44987shL.EZpvd);
            c55173xeu.setSubTitle((java.lang.CharSequence) c44987shL.copydefault);
            C52794wYp c52794wYpAEQbTJ = c55173xeu.AEQbTJ();
            if (c44987shL.OLrzqt != null) {
                c52794wYpAEQbTJ.setVisibility(0);
                c52794wYpAEQbTJ.setText(c44987shL.KWHzl);
                c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.shO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C44987shL.Activity.KWHzl(c44987shL, view);
                    }
                });
                return;
            }
            c52794wYpAEQbTJ.setVisibility(8);
        }

        public static final void KWHzl(C44987shL c44987shL, android.view.View view) {
            Function0 function0 = c44987shL.OLrzqt;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }
}
