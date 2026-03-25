package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotSwitchItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51273vjs extends AbstractC59533zio<BotSwitchItemData, C51274vjt> {
    public final Function1<java.lang.Boolean, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51273vjs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>):void (m)] (LINE:18) call: o.vjs.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C51273vjs(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51273vjs(Function1<? super java.lang.Boolean, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C51274vjt onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.apAOXX, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new C51274vjt((AbstractC48569uWg) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51274vjt c51274vjt, @NotNull BotSwitchItemData botSwitchItemData) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        Intrinsics.checkNotNullParameter(c51274vjt, "");
        Intrinsics.checkNotNullParameter(botSwitchItemData, "");
        AbstractC48569uWg abstractC48569uWgCopydefault = c51274vjt.copydefault();
        C55312xha c55312xhaValueOf = abstractC48569uWgCopydefault.OLrzqt.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl2.setText(botSwitchItemData.EZpvd());
        }
        C55312xha c55312xhaValueOf2 = abstractC48569uWgCopydefault.OLrzqt.valueOf();
        if (c55312xhaValueOf2 != null && (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl.setTypeface(C55051xce.OLrzqt.valueOf());
        }
        if (botSwitchItemData.KWHzl().length() > 0) {
            abstractC48569uWgCopydefault.OLrzqt.setAttachmentViewVisibility(true);
            C55258xgZ c55258xgZ = abstractC48569uWgCopydefault.OLrzqt;
            c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, c51274vjt, botSwitchItemData));
        } else {
            abstractC48569uWgCopydefault.OLrzqt.setAttachmentViewVisibility(false);
        }
        abstractC48569uWgCopydefault.copydefault.setChecked(botSwitchItemData.copydefault());
        abstractC48569uWgCopydefault.copydefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C51273vjs.KWHzl(this.OLrzqt, compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: o.vjs$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    public static final void KWHzl(C51273vjs c51273vjs, android.widget.CompoundButton compoundButton, boolean z) {
        Function1<java.lang.Boolean, Unit> function1 = c51273vjs.OLrzqt;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: o.vjs$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ BotSwitchItemData OLrzqt;
        public final /* synthetic */ C51274vjt copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51274vjt c51274vjt, BotSwitchItemData botSwitchItemData) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c51274vjt;
            this.OLrzqt = botSwitchItemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.copydefault.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(this.OLrzqt.KWHzl());
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new Activity(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
