package o;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.multitype.selection.Selectable;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C51614vqO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vqO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51614vqO extends RecyclerView {
    public final ActionBar AEQbTJ;
    public final int EZpvd;
    public Function1<? super C51610vqK, Unit> KWHzl;
    public final int OLrzqt;
    public final C59534zip copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.vqK, kotlin.Unit>, kotlin.jvm.functions.Function1<o.vqK, kotlin.Unit> */
    public final Function1<C51610vqK, Unit> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickCallback(Function1<? super C51610vqK, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51614vqO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C59534zip c59534zip = new C59534zip();
        this.copydefault = c59534zip;
        this.OLrzqt = 2;
        int iDp2px$default = C55298xhM.dp2px$default(8.0f, null, 1, null);
        this.EZpvd = iDp2px$default;
        ActionBar actionBar = new ActionBar(c59534zip, Selectable.Mode.Single);
        this.AEQbTJ = actionBar;
        c59534zip.register(C51610vqK.class, new StateListAnimator());
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        setLayoutManager(new GridLayoutManager(context, 2));
        setOverScrollMode(2);
        addItemDecoration(new C55370xif(iDp2px$default, iDp2px$default, 2));
        setAdapter(actionBar);
    }

    /* JADX INFO: renamed from: o.vqO$ActionBar */
    public static final class ActionBar extends C43317rmx<RecyclerView.ViewHolder> {
        @Override // o.C43317rmx, com.okinc.multitype.selection.Selectable
        public boolean KWHzl(int i) {
            return true;
        }

        public ActionBar(C59534zip c59534zip, Selectable.Mode mode) {
            super(c59534zip, mode);
        }
    }

    public final void AEQbTJ(java.util.List<C51610vqK> list) {
        C33064mpR.OLrzqt(this.copydefault, list == null ? yDY.AhwBna() : list);
        if (list != null) {
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                if (((C51610vqK) obj).OLrzqt()) {
                    this.AEQbTJ.AEQbTJ(i, true);
                }
                i++;
            }
        }
    }

    public final void EZpvd() {
        this.AEQbTJ.AEQbTJ(0, true);
    }

    public final C51610vqK OLrzqt() {
        if (!this.AEQbTJ.KWHzl().isEmpty() && !this.copydefault.getItems().isEmpty()) {
            java.util.List<?> items = this.copydefault.getItems();
            java.util.Set<java.lang.Integer> setKWHzl = this.AEQbTJ.KWHzl();
            Intrinsics.checkNotNullExpressionValue(setKWHzl, "");
            java.lang.Object objDNCPSb = CollectionsKt___CollectionsKt.dNCPSb(setKWHzl);
            Intrinsics.checkNotNullExpressionValue(objDNCPSb, "");
            java.lang.Object obj = items.get(((java.lang.Number) objDNCPSb).intValue());
            if (obj instanceof C51610vqK) {
                return (C51610vqK) obj;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o.vqO$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final class StateListAnimator extends AbstractC43310rmq<C51610vqK, AbstractC50762vaK> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C48033uCm.Activity.HJWChPRGtXKC;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull final C43312rms<AbstractC50762vaK> c43312rms, @NotNull final C51610vqK c51610vqK) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c51610vqK, "");
            super.onBindViewHolder((C43312rms) c43312rms, c51610vqK);
            wYS wys = ((AbstractC50762vaK) c43312rms.OLrzqt()).copydefault;
            final C51614vqO c51614vqO = C51614vqO.this;
            wys.setText(c51610vqK.EZpvd());
            wys.setSelected(c51614vqO.AEQbTJ.OLrzqt(c43312rms.getBindingAdapterPosition()));
            wys.setOnClickListener(new View.OnClickListener() { // from class: o.vqP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51614vqO.StateListAnimator.AEQbTJ(c51614vqO, c43312rms, c51610vqK, view);
                }
            });
        }

        public static final void AEQbTJ(C51614vqO c51614vqO, C43312rms c43312rms, C51610vqK c51610vqK, android.view.View view) {
            c51614vqO.AEQbTJ.AEQbTJ(c43312rms.getBindingAdapterPosition(), true);
            Function1<C51610vqK, Unit> function1KWHzl = c51614vqO.KWHzl();
            if (function1KWHzl != null) {
                function1KWHzl.invoke(c51610vqK);
            }
        }
    }
}
