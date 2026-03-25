package o;

import android.view.View;
import com.okinc.business.market.features.home_token_list.ui.binder.HomeEmptyListItemBinder$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kcR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28524kcR extends AbstractC25436iwg<C28526kcT, hCH> {
    public final Function0<Unit> EZpvd;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28524kcR() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function0:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:15) call: o.kcP.<init>():void type: CONSTRUCTOR) : (r2v0 kotlin.jvm.functions.Function0))
 A[MD:(boolean, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:13) call: o.kcR.<init>(boolean, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C28524kcR(boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new Function0() { // from class: o.kcP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28524kcR.EZpvd();
            }
        } : function0);
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28524kcR(boolean z, @NotNull Function0<Unit> function0) {
        super(HomeEmptyListItemBinder$2.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = z;
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hCH> c25435iwf, @NotNull C28526kcT c28526kcT) {
        kotlin.Pair pair;
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c28526kcT, "");
        if (c28526kcT.KWHzl()) {
            pair = new kotlin.Pair(7, java.lang.Integer.valueOf(C23274hvD.Fragment.MediaControllerCompatApi21PlaybackInfo));
        } else {
            pair = new kotlin.Pair(6, java.lang.Integer.valueOf(C23274hvD.Fragment.dump));
        }
        int iIntValue = ((java.lang.Number) pair.component1()).intValue();
        int iIntValue2 = ((java.lang.Number) pair.component2()).intValue();
        java.lang.String string = c28526kcT.KWHzl() ? ((hCH) c25435iwf.EZpvd()).getRoot().getContext().getString(C23274hvD.Fragment.hDKMBd) : "";
        Intrinsics.copydefault((java.lang.Object) string);
        C55173xeu root = ((hCH) c25435iwf.EZpvd()).getRoot();
        root.setEmptyTypeImage(iIntValue);
        java.lang.String string2 = root.getContext().getString(iIntValue2);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        root.setTitle(string2);
        root.setRetry(string);
        if (this.OLrzqt) {
            android.content.Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            root.setPadding(root.getPaddingLeft(), C55298xhM.KWHzl(36.0f, context), root.getPaddingRight(), root.getPaddingBottom());
        }
        if (c28526kcT.KWHzl()) {
            ((hCH) c25435iwf.EZpvd()).getRoot().setRetryClickListener(new View.OnClickListener() { // from class: o.kcS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C28524kcR.copydefault(this.copydefault, view);
                }
            });
        }
    }

    public static final void copydefault(C28524kcR c28524kcR, android.view.View view) {
        c28524kcR.EZpvd.invoke();
    }
}
