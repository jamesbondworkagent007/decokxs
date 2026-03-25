package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import com.okinc.auth.impl.passkey.model.AuthenticatorSelectModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aPZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6449aPZ extends androidx.recyclerview.widget.ListAdapter<AuthenticatorSelectModel, TaskDescription> {
    public final Function1<AuthenticatorSelectModel, Unit> OLrzqt;
    public final C6118aJM copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AuthenticatorSelectModel, Unit> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.auth.impl.passkey.model.AuthenticatorSelectModel, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6449aPZ(@NotNull Function1<? super AuthenticatorSelectModel, Unit> function1) {
        super(new C6513aQk());
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
        this.copydefault = new C6118aJM();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C5637aAI c5637aAIAEQbTJ = C5637aAI.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c5637aAIAEQbTJ, "");
        android.widget.ImageView imageView = c5637aAIAEQbTJ.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        android.widget.ImageView imageView2 = c5637aAIAEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
        return new TaskDescription(this, c5637aAIAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AuthenticatorSelectModel item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        taskDescription.AEQbTJ(item, this.copydefault);
    }

    /* JADX INFO: renamed from: o.aPZ$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final /* synthetic */ C6449aPZ EZpvd;
        public final C5637aAI KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C6449aPZ c6449aPZ, C5637aAI c5637aAI) {
            super(c5637aAI.getRoot());
            Intrinsics.checkNotNullParameter(c5637aAI, "");
            this.EZpvd = c6449aPZ;
            this.KWHzl = c5637aAI;
        }

        public final void AEQbTJ(@NotNull AuthenticatorSelectModel authenticatorSelectModel, @NotNull C6118aJM c6118aJM) {
            Intrinsics.checkNotNullParameter(authenticatorSelectModel, "");
            Intrinsics.checkNotNullParameter(c6118aJM, "");
            C5637aAI c5637aAI = this.KWHzl;
            C6449aPZ c6449aPZ = this.EZpvd;
            ConstraintLayout constraintLayout = c5637aAI.AYXKKw;
            constraintLayout.setOnClickListener(new ActionBar(constraintLayout, 1000L, c6449aPZ, authenticatorSelectModel));
            android.widget.TextView textView = c5637aAI.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c6118aJM.AEQbTJ(textView, authenticatorSelectModel.OLrzqt());
            android.widget.TextView textView2 = c5637aAI.values;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            c6118aJM.OLrzqt(textView2, authenticatorSelectModel.OLrzqt());
            android.widget.ImageView imageView = c5637aAI.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            c6118aJM.copydefault(imageView, authenticatorSelectModel.OLrzqt());
            android.widget.LinearLayout linearLayout = c5637aAI.valueOf;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            android.widget.LinearLayout linearLayout2 = c5637aAI.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            android.widget.TextView textView3 = c5637aAI.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            AuthenticatorDisplayModel authenticatorDisplayModelOLrzqt = authenticatorSelectModel.OLrzqt();
            android.content.Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c6118aJM.OLrzqt(linearLayout, linearLayout2, textView3, authenticatorDisplayModelOLrzqt, context);
            android.widget.TextView textView4 = c5637aAI.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            c6118aJM.EZpvd(textView4, authenticatorSelectModel.OLrzqt());
            KWHzl(authenticatorSelectModel);
        }

        public final void KWHzl(AuthenticatorSelectModel authenticatorSelectModel) {
            this.KWHzl.AhwBna.setImageResource(authenticatorSelectModel.EZpvd() ? C8206ayP.Activity.OLrzqt : C8206ayP.Activity.AEQbTJ);
        }

        /* JADX INFO: renamed from: o.aPZ$TaskDescription$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C6449aPZ EZpvd;
            public final /* synthetic */ AuthenticatorSelectModel KWHzl;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C6449aPZ c6449aPZ, AuthenticatorSelectModel authenticatorSelectModel) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.EZpvd = c6449aPZ;
                this.KWHzl = authenticatorSelectModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.EZpvd.OLrzqt().invoke(this.KWHzl);
                }
            }
        }
    }
}
