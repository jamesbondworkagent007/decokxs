package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52505wNx extends AbstractC59533zio<TransDetailsData, C52507wNz> {
    public final wND OLrzqt;

    public C52505wNx(@NotNull wND wnd) {
        Intrinsics.checkNotNullParameter(wnd, "");
        this.OLrzqt = wnd;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C52507wNz onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.hNurIN, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new C52507wNz((uVS) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52507wNz c52507wNz, @NotNull TransDetailsData transDetailsData) {
        Intrinsics.checkNotNullParameter(c52507wNz, "");
        Intrinsics.checkNotNullParameter(transDetailsData, "");
        final uVS uvsCopydefault = c52507wNz.copydefault();
        uvsCopydefault.AEQbTJ.setText(transDetailsData.getTitle());
        C55251xgS c55251xgS = uvsCopydefault.djBIcL;
        c55251xgS.setText(transDetailsData.getTradeType());
        c55251xgS.setOKDSSize(-5);
        c55251xgS.setOKDSStyle(transDetailsData.getTradeTypeTagStyle());
        uvsCopydefault.KWHzl.setText(transDetailsData.getState());
        uvsCopydefault.copydefault.setText(transDetailsData.getTbMode());
        if (uvsCopydefault.EZpvd.getAdapter() == null) {
            uvsCopydefault.EZpvd.setLayoutManager(new GridLayoutManager(uvsCopydefault.getRoot().getContext(), 2));
            uvsCopydefault.EZpvd.addItemDecoration(new C57584ylF(2, 0, C55298xhM.dp2px$default(16.0f, null, 1, null)));
            C59534zip c59534zip = new C59534zip();
            android.content.Context context = uvsCopydefault.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c59534zip.register(TacticsInsideItemData.class, new C52518wOj(context, null, true, 0, false, null, null, new Function1() { // from class: o.wNC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52505wNx.OLrzqt(uvsCopydefault, (Triple) obj);
                }
            }, 122, null));
            uvsCopydefault.EZpvd.setAdapter(c59534zip);
        }
        RecyclerView.Adapter adapter = uvsCopydefault.EZpvd.getAdapter();
        Intrinsics.copydefault(adapter, "");
        C33064mpR.OLrzqt((C59534zip) adapter, transDetailsData.getList());
        C52794wYp c52794wYp = uvsCopydefault.OLrzqt;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this, transDetailsData));
    }

    public static final Unit OLrzqt(uVS uvs, Triple triple) {
        java.lang.String doubtMsg;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(triple, "");
        android.content.Context context = uvs.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        TacticsInsideItemData tacticsInsideItemData = (TacticsInsideItemData) triple.getThird();
        if (tacticsInsideItemData != null && (doubtMsg = tacticsInsideItemData.getDoubtMsg()) != null) {
            str = doubtMsg;
        }
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.wNy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52505wNx.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.wNx$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C52505wNx EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ TransDetailsData OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52505wNx c52505wNx, TransDetailsData transDetailsData) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c52505wNx;
            this.OLrzqt = transDetailsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.OLrzqt.copydefault(this.OLrzqt);
            }
        }
    }
}
