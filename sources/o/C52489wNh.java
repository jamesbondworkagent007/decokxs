package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.ItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C52489wNh extends AbstractC59533zio<ItemData, Activity> {
    public final Function0<Unit> EZpvd;
    public final Function1<java.lang.String, Unit> KWHzl;
    public final Function1<java.lang.String, Unit> OLrzqt;
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52489wNh() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r3v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r4v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r5v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:22) call: o.wNh.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C52489wNh(Function1 function1, Function1 function12, Function1 function13, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52489wNh(Function1<? super java.lang.String, Unit> function1, Function1<? super java.lang.String, Unit> function12, Function1<? super java.lang.String, Unit> function13, Function0<Unit> function0) {
        this.OLrzqt = function1;
        this.copydefault = function12;
        this.KWHzl = function13;
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.getUserContextRegisteredStatus, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new Activity(this, (AbstractC48491uTj) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull ItemData itemData) {
        C55318xhg c55318xhgEZpvd;
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(itemData, "");
        AbstractC48491uTj abstractC48491uTjAEQbTJ = activity.AEQbTJ();
        if (itemData.fJNWhG()) {
            C55258xgZ c55258xgZ = abstractC48491uTjAEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
            c55258xgZ.setVisibility(8);
            C55258xgZ c55258xgZ2 = abstractC48491uTjAEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ2, "");
            c55258xgZ2.setVisibility(8);
            abstractC48491uTjAEQbTJ.copydefault.setVisibility(0);
            return;
        }
        C55258xgZ c55258xgZ3 = abstractC48491uTjAEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ3, "");
        c55258xgZ3.setVisibility(0);
        C55258xgZ c55258xgZ4 = abstractC48491uTjAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ4, "");
        boolean z = true;
        c55258xgZ4.setVisibility(itemData.getFieldNames() ^ true ? 0 : 8);
        AppCompatTextView appCompatTextView = abstractC48491uTjAEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(itemData.getFieldNames() ? 0 : 8);
        abstractC48491uTjAEQbTJ.copydefault.setVisibility(8);
        C55312xha c55312xhaValueOf2 = abstractC48491uTjAEQbTJ.KWHzl.valueOf();
        if (c55312xhaValueOf2 != null) {
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) itemData.AuCTel())) {
                c55312xhaValueOf2.OLrzqt();
            } else {
                c55312xhaValueOf2.copydefault();
            }
            C55320xhi c55320xhiKWHzl3 = c55312xhaValueOf2.KWHzl();
            if (c55320xhiKWHzl3 != null) {
                c55320xhiKWHzl3.setText(itemData.fIwbmz());
            }
            c55312xhaValueOf2.setOnClickListener(new ActionBar(c55312xhaValueOf2, 1000L, itemData, this));
        }
        if (itemData.ejfBZ()) {
            abstractC48491uTjAEQbTJ.AEQbTJ.setTextWeight(500);
        }
        if (itemData.isConnected() != 0 && (c55312xhaValueOf = abstractC48491uTjAEQbTJ.AEQbTJ.valueOf()) != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl2.setTextColor(itemData.isConnected());
        }
        C55312xha c55312xhaValueOf3 = abstractC48491uTjAEQbTJ.AEQbTJ.valueOf();
        if (c55312xhaValueOf3 != null && (c55320xhiKWHzl = c55312xhaValueOf3.KWHzl()) != null) {
            java.lang.String strDbNXlk = itemData.DbNXlk();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk)) {
                strDbNXlk = "--";
            }
            c55320xhiKWHzl.setText(strDbNXlk);
        }
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) itemData.iwGUEr())) && !itemData.hDKMBd()) {
            z = false;
        }
        C55312xha c55312xhaValueOf4 = abstractC48491uTjAEQbTJ.AEQbTJ.valueOf();
        if (c55312xhaValueOf4 != null && (c55318xhgEZpvd = c55312xhaValueOf4.EZpvd()) != null) {
            c55318xhgEZpvd.setVisibility(z ? 0 : 8);
        }
        if (itemData.hDKMBd()) {
            abstractC48491uTjAEQbTJ.AEQbTJ.setAttachmentView(C48033uCm.Activity.DzOuPm);
        }
        C55312xha c55312xhaValueOf5 = abstractC48491uTjAEQbTJ.AEQbTJ.valueOf();
        if (c55312xhaValueOf5 != null) {
            c55312xhaValueOf5.setOnClickListener(new TaskDescription(c55312xhaValueOf5, 1000L, itemData, this));
        }
        AppCompatTextView appCompatTextView2 = abstractC48491uTjAEQbTJ.EZpvd;
        appCompatTextView2.setOnClickListener(new Application(appCompatTextView2, 1000L, this));
        activity.AEQbTJ().getRoot().setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.aBDePw));
    }

    /* JADX INFO: renamed from: o.wNh$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ C52489wNh AEQbTJ;
        public final AbstractC48491uTj OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC48491uTj AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C52489wNh c52489wNh, AbstractC48491uTj abstractC48491uTj) {
            super(abstractC48491uTj.getRoot());
            Intrinsics.checkNotNullParameter(abstractC48491uTj, "");
            this.AEQbTJ = c52489wNh;
            this.OLrzqt = abstractC48491uTj;
        }
    }

    /* JADX INFO: renamed from: o.wNh$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C52489wNh EZpvd;
        public final /* synthetic */ ItemData OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ItemData itemData, C52489wNh c52489wNh) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = itemData;
            this.EZpvd = c52489wNh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function1 function1;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) this.OLrzqt.AuCTel()) || (function1 = this.EZpvd.OLrzqt) == null) {
                    return;
                }
                function1.invoke(this.OLrzqt.AuCTel());
            }
        }
    }

    /* JADX INFO: renamed from: o.wNh$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C52489wNh OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52489wNh c52489wNh) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c52489wNh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt.copydefault;
                if (function1 != null) {
                    function1.invoke("");
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wNh$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C52489wNh AEQbTJ;
        public final /* synthetic */ ItemData EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ItemData itemData, C52489wNh c52489wNh) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = itemData;
            this.AEQbTJ = c52489wNh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function0 function0;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) this.EZpvd.iwGUEr())) {
                    Function1 function1 = this.AEQbTJ.KWHzl;
                    if (function1 != null) {
                        function1.invoke(this.EZpvd.iwGUEr());
                        return;
                    }
                    return;
                }
                if (this.EZpvd.fARcdN()) {
                    Function1 function12 = this.AEQbTJ.copydefault;
                    if (function12 != null) {
                        function12.invoke(this.EZpvd.AYXKKw());
                        return;
                    }
                    return;
                }
                if (!this.EZpvd.hDKMBd() || (function0 = this.AEQbTJ.EZpvd) == null) {
                    return;
                }
                function0.invoke();
            }
        }
    }
}
