package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.jRS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class jRS extends androidx.recyclerview.widget.ListAdapter<jRP, Application> {
    public final java.lang.String AEQbTJ;
    public final java.util.Map<java.lang.Integer, android.os.CountDownTimer> EZpvd;
    public final Function1<jRP, Unit> OLrzqt;
    public final android.content.Context copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.jRP, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jRS(@NotNull android.content.Context context, @NotNull Function1<? super jRP, Unit> function1) {
        super(new jRV());
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = context;
        this.OLrzqt = function1;
        this.EZpvd = new LinkedHashMap();
        this.AEQbTJ = "00";
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ jRS EZpvd;
        public jRP OLrzqt;
        public final hCD copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull jRS jrs, hCD hcd) {
            super(hcd.getRoot());
            Intrinsics.checkNotNullParameter(hcd, "");
            this.EZpvd = jrs;
            this.copydefault = hcd;
        }

        public final void EZpvd(@NotNull final jRP jrp, @NotNull final Function1<? super jRP, Unit> function1) {
            Intrinsics.checkNotNullParameter(jrp, "");
            Intrinsics.checkNotNullParameter(function1, "");
            hCD hcd = this.copydefault;
            jRS jrs = this.EZpvd;
            this.OLrzqt = jrp;
            hcd.OLrzqt.setText(jrp.valueOf());
            hcd.KWHzl.setText(jrp.KWHzl());
            android.widget.ImageView imageView = hcd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25386ivj.EZpvd(imageView, C7911ask.AEQbTJ(jrs.KWHzl()) ? jrp.AEQbTJ() : jrp.copydefault());
            hcd.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.jRR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jRS.Application.copydefault(function1, jrp, view);
                }
            });
            if (jrs.getCurrentList().size() > 1) {
                CardView root = hcd.getRoot();
                ViewGroup.LayoutParams layoutParams = hcd.getRoot().getLayoutParams();
                layoutParams.height = C55298xhM.dp2px$default(118.0f, null, 1, null);
                root.setLayoutParams(layoutParams);
            }
            copydefault(jrp);
        }

        public static final void copydefault(Function1 function1, jRP jrp, android.view.View view) {
            function1.invoke(jrp);
        }

        public final void copydefault(@NotNull jRP jrp) {
            Intrinsics.checkNotNullParameter(jrp, "");
            long jValueOf = C33129mqd.valueOf(jrp.OLrzqt()) - (java.lang.System.currentTimeMillis() / ((long) 1000));
            if (jValueOf <= 0) {
                this.copydefault.gEmmrt.setText(this.EZpvd.AEQbTJ);
                this.copydefault.valueOf.setText(this.EZpvd.AEQbTJ);
                this.copydefault.djBIcL.setText(this.EZpvd.AEQbTJ);
                this.copydefault.AYXKKw.setText(this.EZpvd.AEQbTJ);
                return;
            }
            long j = RemoteMessageConst.DEFAULT_TTL;
            long j2 = IMarketApiService.SIXTY_MINUTES;
            long j3 = 60;
            android.widget.TextView textView = this.copydefault.gEmmrt;
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str = java.lang.String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(jValueOf / j)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            textView.setText(str);
            android.widget.TextView textView2 = this.copydefault.valueOf;
            java.lang.String str2 = java.lang.String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf((jValueOf % j) / j2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            textView2.setText(str2);
            android.widget.TextView textView3 = this.copydefault.djBIcL;
            java.lang.String str3 = java.lang.String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf((jValueOf % j2) / j3)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            textView3.setText(str3);
            android.widget.TextView textView4 = this.copydefault.AYXKKw;
            java.lang.String str4 = java.lang.String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(jValueOf % j3)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            textView4.setText(str4);
        }

        public final void KWHzl() {
            jRP jrp = this.OLrzqt;
            if (jrp != null) {
                jRS jrs = this.EZpvd;
                EZpvd();
                long j = 1000;
                long jValueOf = C33129mqd.valueOf(jrp.OLrzqt()) - (java.lang.System.currentTimeMillis() / j);
                if (jValueOf <= 0) {
                    copydefault(jrp);
                    return;
                }
                TaskDescription taskDescription = new TaskDescription(jrp, jrs, jValueOf * j);
                jrs.EZpvd.put(java.lang.Integer.valueOf(hashCode()), taskDescription);
                taskDescription.start();
            }
        }

        public static final class TaskDescription extends android.os.CountDownTimer {
            public final /* synthetic */ jRP AEQbTJ;
            public final /* synthetic */ jRS OLrzqt;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(jRP jrp, jRS jrs, long j) {
                super(j, 1000L);
                this.AEQbTJ = jrp;
                this.OLrzqt = jrs;
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                Application.this.copydefault(this.AEQbTJ);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                Application.this.copydefault(this.AEQbTJ);
                this.OLrzqt.EZpvd.remove(java.lang.Integer.valueOf(Application.this.hashCode()));
            }
        }

        public final void EZpvd() {
            android.os.CountDownTimer countDownTimer = (android.os.CountDownTimer) this.EZpvd.EZpvd.get(java.lang.Integer.valueOf(hashCode()));
            if (countDownTimer != null) {
                jRS jrs = this.EZpvd;
                countDownTimer.cancel();
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCD hcdKWHzl = hCD.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hcdKWHzl, "");
        return new Application(this, hcdKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        jRP item = getItem(i);
        Intrinsics.copydefault(item);
        application.EZpvd(item, this.OLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        super.onViewAttachedToWindow(application);
        application.KWHzl();
    }

    /* JADX DEBUG: Method merged with bridge method: onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        super.onViewDetachedFromWindow(application);
        application.EZpvd();
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        super.onViewRecycled(application);
        application.EZpvd();
    }

    public final void copydefault() {
        java.util.Iterator<T> it = this.EZpvd.values().iterator();
        while (it.hasNext()) {
            ((android.os.CountDownTimer) it.next()).cancel();
        }
        this.EZpvd.clear();
    }
}
