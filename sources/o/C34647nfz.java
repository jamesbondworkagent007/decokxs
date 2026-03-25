package o;

import android.view.View;
import com.okinc.dexkline.market.widget.selection.GridSelectionItemBinder$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34647nfz extends mUT<C34600nfE, C36072oOf> {
    public final Function1<java.lang.String, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34647nfz() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:24) call: o.nfB.<init>():void type: CONSTRUCTOR) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>):void (m)] (LINE:23) call: o.nfz.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C34647nfz(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1() { // from class: o.nfB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34647nfz.OLrzqt((java.lang.String) obj);
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C34647nfz(@NotNull Function1<? super java.lang.String, Unit> function1) {
        super(GridSelectionItemBinder$2.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull mUU<C36072oOf> muu, @NotNull C34600nfE c34600nfE) {
        Intrinsics.checkNotNullParameter(muu, "");
        Intrinsics.checkNotNullParameter(c34600nfE, "");
        C54984xbQ c54984xbQ = ((C36072oOf) muu.KWHzl()).KWHzl;
        java.lang.CharSequence charSequenceEZpvd = c34600nfE.EZpvd();
        if (charSequenceEZpvd == null) {
            charSequenceEZpvd = c34600nfE.copydefault();
        }
        c54984xbQ.setText(charSequenceEZpvd);
        c54984xbQ.setSelectedStyle(c34600nfE.KWHzl(), 3);
        c54984xbQ.setOnClickListener(new StateListAnimator(c54984xbQ, 1000L, this, c34600nfE));
    }

    /* JADX INFO: renamed from: o.nfz$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C34600nfE EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C34647nfz copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C34647nfz c34647nfz, C34600nfE c34600nfE) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c34647nfz;
            this.EZpvd = c34600nfE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.KWHzl.invoke(this.EZpvd.OLrzqt());
            }
        }
    }
}
