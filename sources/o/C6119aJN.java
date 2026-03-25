package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aJN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6119aJN extends androidx.recyclerview.widget.ListAdapter<AuthenticatorDisplayModel, TaskDescription> {
    public final C6118aJM AEQbTJ;
    public final Function1<AuthenticatorDisplayModel, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C6119aJN() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AuthenticatorDisplayModel, Unit> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel, kotlin.Unit>):void (m)] (LINE:13) call: o.aJN.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C6119aJN(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6119aJN(Function1<? super AuthenticatorDisplayModel, Unit> function1) {
        super(new C6120aJO());
        this.copydefault = function1;
        this.AEQbTJ = new C6118aJM();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C5637aAI c5637aAIAEQbTJ = C5637aAI.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c5637aAIAEQbTJ, "");
        android.widget.ImageView imageView = c5637aAIAEQbTJ.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = c5637aAIAEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(0);
        return new TaskDescription(this, c5637aAIAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AuthenticatorDisplayModel item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        taskDescription.KWHzl(item, this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.aJN$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final C5637aAI OLrzqt;
        public final /* synthetic */ C6119aJN copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C6119aJN c6119aJN, C5637aAI c5637aAI) {
            super(c5637aAI.getRoot());
            Intrinsics.checkNotNullParameter(c5637aAI, "");
            this.copydefault = c6119aJN;
            this.OLrzqt = c5637aAI;
        }

        public final void KWHzl(@NotNull AuthenticatorDisplayModel authenticatorDisplayModel, @NotNull C6118aJM c6118aJM) {
            Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
            Intrinsics.checkNotNullParameter(c6118aJM, "");
            C5637aAI c5637aAI = this.OLrzqt;
            C6119aJN c6119aJN = this.copydefault;
            ConstraintLayout constraintLayout = c5637aAI.AYXKKw;
            constraintLayout.setOnClickListener(new Application(constraintLayout, 1000L, c6119aJN, authenticatorDisplayModel));
            android.widget.TextView textView = c5637aAI.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c6118aJM.AEQbTJ(textView, authenticatorDisplayModel);
            android.widget.TextView textView2 = c5637aAI.values;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            c6118aJM.OLrzqt(textView2, authenticatorDisplayModel);
            android.widget.ImageView imageView = c5637aAI.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            c6118aJM.copydefault(imageView, authenticatorDisplayModel);
            android.widget.LinearLayout linearLayout = c5637aAI.valueOf;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            android.widget.LinearLayout linearLayout2 = c5637aAI.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            android.widget.TextView textView3 = c5637aAI.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            android.content.Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c6118aJM.OLrzqt(linearLayout, linearLayout2, textView3, authenticatorDisplayModel, context);
            android.widget.TextView textView4 = c5637aAI.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            c6118aJM.EZpvd(textView4, authenticatorDisplayModel);
        }

        /* JADX INFO: renamed from: o.aJN$TaskDescription$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ C6119aJN AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ AuthenticatorDisplayModel KWHzl;
            public final /* synthetic */ long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, C6119aJN c6119aJN, AuthenticatorDisplayModel authenticatorDisplayModel) {
                this.EZpvd = view;
                this.OLrzqt = j;
                this.AEQbTJ = c6119aJN;
                this.KWHzl = authenticatorDisplayModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    Function1<AuthenticatorDisplayModel, Unit> function1EZpvd = this.AEQbTJ.EZpvd();
                    if (function1EZpvd != null) {
                        function1EZpvd.invoke(this.KWHzl);
                    }
                }
            }
        }
    }
}
