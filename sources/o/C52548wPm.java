package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52548wPm extends AbstractC59533zio<DetailsData, C52550wPo> {
    public final Function1<DetailsData, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52548wPm() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.DetailsData, kotlin.Unit>):void (m)] (LINE:23) call: o.wPm.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C52548wPm(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.DetailsData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52548wPm(Function1<? super DetailsData, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C52550wPo onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.onProviderDisabled, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C52550wPo(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52550wPo c52550wPo, @NotNull final DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(c52550wPo, "");
        Intrinsics.checkNotNullParameter(detailsData, "");
        C8003auW.copydefault(c52550wPo.OLrzqt()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.wPq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C52548wPm.AEQbTJ(this.copydefault, detailsData, obj);
            }
        });
        c52550wPo.AEQbTJ().setText(detailsData.getTvTitle());
        c52550wPo.OLrzqt().setText(detailsData.getState());
        c52550wPo.KWHzl().setText(detailsData.getType());
        if (detailsData.getSideColor() != 0) {
            c52550wPo.KWHzl().setTextColor(detailsData.getSideColor());
        }
        if (detailsData.getSideBgColor() != 0) {
            c52550wPo.KWHzl().setBackgroundTintList(android.content.res.ColorStateList.valueOf(detailsData.getSideBgColor()));
        }
        c52550wPo.copydefault().setText(detailsData.getTime());
        c52550wPo.EZpvd().setLayoutManager(new LinearLayoutManager(c52550wPo.EZpvd().getContext()));
        c52550wPo.EZpvd().setNestedScrollingEnabled(false);
        RecyclerView recyclerViewEZpvd = c52550wPo.EZpvd();
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(TacticsInsideItemData.class, new C52556wPu());
        java.util.List<?> subData = detailsData.getSubData();
        if (subData == null) {
            subData = yDY.AhwBna();
        }
        c59534zip.setItems(subData);
        recyclerViewEZpvd.setAdapter(c59534zip);
    }

    public static final void AEQbTJ(C52548wPm c52548wPm, DetailsData detailsData, java.lang.Object obj) {
        Function1<DetailsData, Unit> function1 = c52548wPm.OLrzqt;
        if (function1 != null) {
            function1.invoke(detailsData);
        }
    }
}
