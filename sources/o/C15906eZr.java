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

/* JADX INFO: renamed from: o.eZr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15906eZr extends C43318rmy<AddressCoinHistoryDetail, AbstractC16865erw> {
    public final int AEQbTJ;
    public final C15836eXb KWHzl;
    public final Function1<AddressCoinHistoryDetail, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15906eZr(int i, @NotNull Function1<? super AddressCoinHistoryDetail, Unit> function1) {
        super(C13754dXa.TaskDescription.dbUqJD, 0);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = i;
        this.copydefault = function1;
        this.KWHzl = new C15836eXb();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16865erw> c43312rms, @NotNull AddressCoinHistoryDetail addressCoinHistoryDetail) {
        java.lang.Long txTime;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(addressCoinHistoryDetail, "");
        final AbstractC16865erw abstractC16865erw = (AbstractC16865erw) c43312rms.OLrzqt();
        this.KWHzl.copydefault(addressCoinHistoryDetail, new yHO() { // from class: o.eZs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C15906eZr.copydefault(abstractC16865erw, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
        switch (addressCoinHistoryDetail.getTxStatus()) {
            case 1:
                abstractC16865erw.AEQbTJ.setVisibility(0);
                abstractC16865erw.AEQbTJ.setStatus(1);
                break;
            case 2:
                abstractC16865erw.AEQbTJ.setVisibility(0);
                abstractC16865erw.AEQbTJ.setStatus(0);
                break;
            case 3:
                abstractC16865erw.AEQbTJ.setVisibility(0);
                abstractC16865erw.AEQbTJ.setStatus(4);
                break;
            case 4:
                abstractC16865erw.AEQbTJ.setVisibility(8);
                break;
            case 5:
                abstractC16865erw.AEQbTJ.setVisibility(0);
                abstractC16865erw.AEQbTJ.setStatus(6);
                break;
            case 6:
                abstractC16865erw.AEQbTJ.setVisibility(0);
                abstractC16865erw.AEQbTJ.setStatus(7);
                break;
            default:
                abstractC16865erw.AEQbTJ.setVisibility(8);
                break;
        }
        C15836eXb c15836eXb = this.KWHzl;
        C15503eKt c15503eKt = abstractC16865erw.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c15503eKt, "");
        c15836eXb.KWHzl(addressCoinHistoryDetail, c15503eKt, this.AEQbTJ);
        if (addressCoinHistoryDetail.getTxTime() == null || ((txTime = addressCoinHistoryDetail.getTxTime()) != null && C33129mqd.OLrzqt((java.lang.Object) txTime, (java.lang.Object) 0))) {
            abstractC16865erw.djBIcL.setText("--");
        } else {
            android.widget.TextView textView = abstractC16865erw.djBIcL;
            java.lang.Long txTime2 = addressCoinHistoryDetail.getTxTime();
            Intrinsics.copydefault(txTime2);
            textView.setText(pTA.formatSimpleTime$default(new Date(txTime2.longValue()), null, 1, null));
        }
        android.view.View root = abstractC16865erw.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, addressCoinHistoryDetail));
    }

    public static final Unit copydefault(AbstractC16865erw abstractC16865erw, int i, java.lang.String str, java.lang.String str2) {
        android.graphics.drawable.Drawable drawable;
        abstractC16865erw.KWHzl.setImageResource(i);
        android.graphics.drawable.Drawable drawable2 = abstractC16865erw.KWHzl.getDrawable();
        LayerDrawable layerDrawable = drawable2 instanceof LayerDrawable ? (LayerDrawable) drawable2 : null;
        if (layerDrawable != null && (drawable = layerDrawable.getDrawable(1)) != null) {
            drawable.setTint(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        abstractC16865erw.AhwBna.setFixAutoSizeText(str);
        if (str2 == null || str2.length() == 0) {
            abstractC16865erw.copydefault.setVisibility(8);
        } else {
            abstractC16865erw.copydefault.setVisibility(0);
            abstractC16865erw.copydefault.setText(str2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.eZr$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C15906eZr AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ AddressCoinHistoryDetail copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C15906eZr c15906eZr, AddressCoinHistoryDetail addressCoinHistoryDetail) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c15906eZr;
            this.copydefault = addressCoinHistoryDetail;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.copydefault.invoke(this.copydefault);
            }
        }
    }
}
