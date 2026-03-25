package o;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eZt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15908eZt extends C43318rmy<AddressCoinHistoryDetail, AbstractC16868erz> {
    public final int EZpvd;
    public final C15836eXb OLrzqt;
    public final Function1<AddressCoinHistoryDetail, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15908eZt(int i, @NotNull Function1<? super AddressCoinHistoryDetail, Unit> function1) {
        super(C13754dXa.TaskDescription.GLcwwN, 0);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = i;
        this.copydefault = function1;
        this.OLrzqt = new C15836eXb();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16868erz> c43312rms, @NotNull AddressCoinHistoryDetail addressCoinHistoryDetail) {
        java.lang.Long txTime;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(addressCoinHistoryDetail, "");
        final AbstractC16868erz abstractC16868erz = (AbstractC16868erz) c43312rms.OLrzqt();
        this.OLrzqt.copydefault(addressCoinHistoryDetail, new yHO() { // from class: o.eZv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C15908eZt.AEQbTJ(abstractC16868erz, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
        if (addressCoinHistoryDetail.isShowPending()) {
            abstractC16868erz.djBIcL.setVisibility(0);
            if (addressCoinHistoryDetail.getTxTime() == null || ((txTime = addressCoinHistoryDetail.getTxTime()) != null && C33129mqd.OLrzqt((java.lang.Object) txTime, (java.lang.Object) 0))) {
                abstractC16868erz.djBIcL.setText("--");
            } else {
                android.widget.TextView textView = abstractC16868erz.djBIcL;
                java.lang.Long txTime2 = addressCoinHistoryDetail.getTxTime();
                Intrinsics.copydefault(txTime2);
                textView.setText(pTA.formatSimpleDateTime$default(new Date(txTime2.longValue()), null, 1, null));
            }
            abstractC16868erz.KWHzl.setStatus(1);
            abstractC16868erz.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
        } else {
            abstractC16868erz.KWHzl.setStatus(0);
            abstractC16868erz.djBIcL.setVisibility(8);
            abstractC16868erz.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        C15836eXb c15836eXb = this.OLrzqt;
        C15503eKt c15503eKt = abstractC16868erz.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c15503eKt, "");
        c15836eXb.KWHzl(addressCoinHistoryDetail, c15503eKt, this.EZpvd);
        android.view.View root = abstractC16868erz.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, this, addressCoinHistoryDetail));
    }

    public static final Unit AEQbTJ(AbstractC16868erz abstractC16868erz, int i, java.lang.String str, java.lang.String str2) {
        android.graphics.drawable.Drawable drawable;
        abstractC16868erz.EZpvd.setImageResource(i);
        android.graphics.drawable.Drawable drawable2 = abstractC16868erz.EZpvd.getDrawable();
        LayerDrawable layerDrawable = drawable2 instanceof LayerDrawable ? (LayerDrawable) drawable2 : null;
        if (layerDrawable != null && (drawable = layerDrawable.getDrawable(1)) != null) {
            drawable.setTint(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        abstractC16868erz.gEmmrt.setFixAutoSizeText(str);
        if (str2 == null || str2.length() == 0) {
            abstractC16868erz.OLrzqt.setVisibility(8);
        } else {
            abstractC16868erz.OLrzqt.setVisibility(0);
            abstractC16868erz.OLrzqt.setText(str2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.eZt$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ AddressCoinHistoryDetail KWHzl;
        public final /* synthetic */ C15908eZt OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C15908eZt c15908eZt, AddressCoinHistoryDetail addressCoinHistoryDetail) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c15908eZt;
            this.KWHzl = addressCoinHistoryDetail;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.copydefault.invoke(this.KWHzl);
            }
        }
    }
}
