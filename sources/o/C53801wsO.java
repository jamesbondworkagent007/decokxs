package o;

import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53801wsO extends androidx.recyclerview.widget.ListAdapter<C53804wsR, Application> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final Activity copydefault = new Activity();
    public final Function0<Unit> KWHzl;
    public final Function0<Unit> OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53801wsO(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        super(copydefault);
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.KWHzl = function0;
        this.OLrzqt = function02;
    }

    public final void EZpvd(@NotNull C53804wsR c53804wsR) {
        Intrinsics.checkNotNullParameter(c53804wsR, "");
        submitList(C56402yEa.EZpvd(c53804wsR));
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uNX unxOLrzqt = uNX.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C49946uyD c49946uyD = unxOLrzqt.EZpvd;
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = c49946uyD.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c49946uyD.setLowLevelColor(C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null));
        android.content.Context context2 = c49946uyD.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c49946uyD.setHighLevelColor(C33512mxp.tradeFallGraph$default(c33512mxp, context2, 0.0f, 2, null));
        Intrinsics.checkNotNullExpressionValue(unxOLrzqt, "");
        return new Application(this, unxOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        C53804wsR item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        application.AEQbTJ(item);
    }

    /* JADX INFO: renamed from: o.wsO$Application */
    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ C53801wsO EZpvd;
        public final uNX OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C53801wsO c53801wsO, uNX unx) {
            super(unx.getRoot());
            Intrinsics.checkNotNullParameter(unx, "");
            this.EZpvd = c53801wsO;
            this.OLrzqt = unx;
        }

        public final void AEQbTJ(@NotNull C53804wsR c53804wsR) {
            Intrinsics.checkNotNullParameter(c53804wsR, "");
            uNX unx = this.OLrzqt;
            C53801wsO c53801wsO = this.EZpvd;
            unx.KWHzl.setText(c53804wsR.KWHzl());
            if (c53804wsR.isConnected()) {
                C55251xgS c55251xgS = unx.OLrzqt;
                c55251xgS.setText(c53804wsR.AEQbTJ());
                if (c53804wsR.EZpvd() != 0) {
                    c55251xgS.setOKDSStyle(c53804wsR.EZpvd());
                }
                Intrinsics.copydefault(c55251xgS);
                c55251xgS.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c53804wsR.AEQbTJ()) ^ true ? 0 : 8);
                C55251xgS c55251xgS2 = unx.copydefault;
                c55251xgS2.setText(c53804wsR.AhwBna());
                if (c53804wsR.EZpvd() != 0) {
                    c55251xgS2.setOKDSStyle(c53804wsR.EZpvd());
                }
                Intrinsics.copydefault(c55251xgS2);
                c55251xgS2.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c53804wsR.AhwBna()) ^ true ? 0 : 8);
                Intrinsics.copydefault(c55251xgS2);
            } else {
                C55251xgS c55251xgS3 = unx.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
                c55251xgS3.setVisibility(8);
                C55251xgS c55251xgS4 = unx.copydefault;
                Intrinsics.checkNotNullExpressionValue(c55251xgS4, "");
                c55251xgS4.setVisibility(8);
            }
            unx.AEQbTJ.setText(c53804wsR.copydefault());
            C49946uyD c49946uyD = unx.EZpvd;
            c49946uyD.setCurrentLevel(c53804wsR.OLrzqt());
            Intrinsics.copydefault(c49946uyD);
            c49946uyD.setVisibility(c53804wsR.AkhnZx() ? 0 : 8);
            C55258xgZ c55258xgZ = unx.gEmmrt;
            c55258xgZ.setTextValue(c53804wsR.DbNXlk());
            c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, c53801wsO));
            android.widget.TextView textView = unx.valueOf;
            textView.setText(c53804wsR.valueOf());
            if (c53804wsR.djBIcL() != 0) {
                textView.setTextColor(c53804wsR.djBIcL());
            }
            C55258xgZ c55258xgZ2 = unx.AYXKKw;
            c55258xgZ2.setOnClickListener(new Activity(c55258xgZ2, 1000L, c53801wsO));
            android.widget.TextView textView2 = unx.AhwBna;
            textView2.setText(c53804wsR.AYXKKw());
            if (c53804wsR.gEmmrt() != 0) {
                textView2.setTextColor(c53804wsR.gEmmrt());
            }
        }

        /* JADX INFO: renamed from: o.wsO$Application$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ C53801wsO OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C53801wsO c53801wsO) {
                this.KWHzl = view;
                this.copydefault = j;
                this.OLrzqt = c53801wsO;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.OLrzqt.OLrzqt.invoke();
                }
            }
        }

        /* JADX INFO: renamed from: o.wsO$Application$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ C53801wsO AEQbTJ;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, C53801wsO c53801wsO) {
                this.copydefault = view;
                this.KWHzl = j;
                this.AEQbTJ = c53801wsO;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.AEQbTJ.KWHzl.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wsO$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wsO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.wsO$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<C53804wsR> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C53804wsR c53804wsR, C53804wsR c53804wsR2) {
            Intrinsics.checkNotNullParameter(c53804wsR, "");
            Intrinsics.checkNotNullParameter(c53804wsR2, "");
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C53804wsR c53804wsR, C53804wsR c53804wsR2) {
            Intrinsics.checkNotNullParameter(c53804wsR, "");
            Intrinsics.checkNotNullParameter(c53804wsR2, "");
            return Intrinsics.EZpvd(c53804wsR, c53804wsR2);
        }
    }
}
