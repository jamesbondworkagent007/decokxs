package o;

import android.view.View;
import com.okinc.business.market.widget.selection.GridSelectionItemBinder$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kNg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C28056kNg extends AbstractC25436iwg<C28060kNk, hCC> {
    public final Function1<java.lang.String, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28056kNg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:26) call: o.kNc.<init>():void type: CONSTRUCTOR) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>):void (m)] (LINE:25) call: o.kNg.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C28056kNg(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1() { // from class: o.kNc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28056kNg.AEQbTJ((java.lang.String) obj);
            }
        } : function1);
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28056kNg(@NotNull Function1<? super java.lang.String, Unit> function1) {
        super(GridSelectionItemBinder$2.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hCC> c25435iwf, @NotNull C28060kNk c28060kNk) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c28060kNk, "");
        C54984xbQ c54984xbQ = ((hCC) c25435iwf.EZpvd()).AEQbTJ;
        java.lang.CharSequence charSequenceAEQbTJ = c28060kNk.AEQbTJ();
        if (charSequenceAEQbTJ == null) {
            charSequenceAEQbTJ = c28060kNk.OLrzqt();
        }
        c54984xbQ.setText(charSequenceAEQbTJ);
        android.content.Context context = c54984xbQ.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(2, context);
        android.content.Context context2 = c54984xbQ.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c54984xbQ.setPadding(0, 0, iOLrzqt, C55298xhM.OLrzqt(2, context2));
        c54984xbQ.setSelectedStyle(c28060kNk.copydefault(), 3);
        c54984xbQ.setOnClickListener(new TaskDescription(c54984xbQ, 1000L, this, c28060kNk));
    }

    /* JADX INFO: renamed from: o.kNg$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C28056kNg EZpvd;
        public final /* synthetic */ C28060kNk KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C28056kNg c28056kNg, C28060kNk c28060kNk) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c28056kNg;
            this.KWHzl = c28060kNk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ.invoke(this.KWHzl.EZpvd());
            }
        }
    }
}
