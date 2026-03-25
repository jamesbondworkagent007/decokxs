package o;

import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.itembinder.SmartCoinsData;
import com.okinc.unify_trade.bot.data.DistributeItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wgj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53186wgj extends AbstractC59533zio<SmartCoinsData, C53192wgp> {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.wgj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wgj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C53192wgp onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.zvzmfz, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C53192wgp(viewInflate);
    }

    public static final void KWHzl(final C53192wgp c53192wgp, final SmartCoinsData smartCoinsData) {
        final android.content.Context context = c53192wgp.itemView.getContext();
        c53192wgp.OLrzqt().post(new java.lang.Runnable() { // from class: o.wgl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C53186wgj.EZpvd(c53192wgp, smartCoinsData, context);
            }
        });
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(C53192wgp c53192wgp, SmartCoinsData smartCoinsData, android.content.Context context) {
        int i;
        int iDpInt$default;
        C49774uur c49774uurOLrzqt = c53192wgp.OLrzqt();
        c49774uurOLrzqt.removeAllViews();
        int measuredWidth = c49774uurOLrzqt.getMeasuredWidth() / 2;
        ?? r3 = 0;
        int i2 = 0;
        for (java.lang.Object obj : smartCoinsData.AEQbTJ()) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            DistributeItem distributeItem = (DistributeItem) obj;
            ?? r6 = i2 % 2 == 0 ? 1 : r3;
            ?? r8 = (i2 == 0 || i2 == 1) ? 1 : r3;
            ?? r9 = (!C33129mqd.OLrzqt(java.lang.Integer.valueOf(smartCoinsData.AEQbTJ().size() % 2), java.lang.Integer.valueOf((int) r3)) ? i2 == smartCoinsData.AEQbTJ().size() - 1 : i2 == smartCoinsData.AEQbTJ().size() - 1 || i2 == smartCoinsData.AEQbTJ().size() + (-2)) ? r3 : 1;
            if (!c49774uurOLrzqt.copydefault() || r8 != 0) {
                android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C48033uCm.Activity.hfFNez, c49774uurOLrzqt, r3);
                android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(C48033uCm.Application.gVEiQJ);
                android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.gbIfDn);
                android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.sVvuFk);
                ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
                Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
                java.lang.String coinImgUrl = distributeItem.getCoinImgUrl();
                C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, coinImgUrl != null ? coinImgUrl : "", "lfit", 48, 48).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(context)).EZpvd(imageView);
                textView.setText(distributeItem.getCoinName());
                textView2.setText(distributeItem.getCoinPercent());
                ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
                layoutParams.width = measuredWidth;
                if (!smartCoinsData.OLrzqt()) {
                    i = 1;
                    iDpInt$default = r8 != 0 ? 0 : C55298xhM.dpInt$default(10, (android.content.Context) null, 1, (java.lang.Object) null);
                    viewInflate.setPaddingRelative(r6 != 0 ? 0 : C55298xhM.dpInt$default(5, (android.content.Context) null, i, (java.lang.Object) null), r8 != 0 ? C55298xhM.dpInt$default(12, (android.content.Context) null, i, (java.lang.Object) null) : 0, r6 != 0 ? C55298xhM.dpInt$default(5, (android.content.Context) null, i, (java.lang.Object) null) : 0, iDpInt$default);
                    viewInflate.setLayoutParams(layoutParams);
                    c49774uurOLrzqt.addView(viewInflate);
                } else if (r9 == 0) {
                    i = 1;
                    iDpInt$default = C55298xhM.dpInt$default(10, (android.content.Context) null, 1, (java.lang.Object) null);
                    viewInflate.setPaddingRelative(r6 != 0 ? 0 : C55298xhM.dpInt$default(5, (android.content.Context) null, i, (java.lang.Object) null), r8 != 0 ? C55298xhM.dpInt$default(12, (android.content.Context) null, i, (java.lang.Object) null) : 0, r6 != 0 ? C55298xhM.dpInt$default(5, (android.content.Context) null, i, (java.lang.Object) null) : 0, iDpInt$default);
                    viewInflate.setLayoutParams(layoutParams);
                    c49774uurOLrzqt.addView(viewInflate);
                } else {
                    i = 1;
                    viewInflate.setPaddingRelative(r6 != 0 ? 0 : C55298xhM.dpInt$default(5, (android.content.Context) null, i, (java.lang.Object) null), r8 != 0 ? C55298xhM.dpInt$default(12, (android.content.Context) null, i, (java.lang.Object) null) : 0, r6 != 0 ? C55298xhM.dpInt$default(5, (android.content.Context) null, i, (java.lang.Object) null) : 0, iDpInt$default);
                    viewInflate.setLayoutParams(layoutParams);
                    c49774uurOLrzqt.addView(viewInflate);
                }
            }
            i2++;
            r3 = 0;
        }
    }

    public static final void OLrzqt(SmartCoinsData smartCoinsData, C53192wgp c53192wgp) {
        android.graphics.drawable.Drawable drawableKWHzl;
        smartCoinsData.KWHzl(!smartCoinsData.OLrzqt());
        c53192wgp.OLrzqt().setSingleLine(!smartCoinsData.OLrzqt());
        KWHzl(c53192wgp, smartCoinsData);
        if (smartCoinsData.OLrzqt()) {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.ExKek);
        } else {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DfrfUJ);
        }
        if (drawableKWHzl != null) {
            C33057mpK.copydefault(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.Dff));
            c53192wgp.EZpvd().setImageDrawable(drawableKWHzl);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C53192wgp c53192wgp, @NotNull final SmartCoinsData smartCoinsData) {
        Intrinsics.checkNotNullParameter(c53192wgp, "");
        Intrinsics.checkNotNullParameter(smartCoinsData, "");
        c53192wgp.copydefault().setText(smartCoinsData.EZpvd());
        c53192wgp.OLrzqt().setSingleLine(!smartCoinsData.OLrzqt());
        KWHzl(c53192wgp, smartCoinsData);
        if (smartCoinsData.AEQbTJ().size() >= 3) {
            c53192wgp.EZpvd().setVisibility(0);
            c53192wgp.copydefault().setOnClickListener(new View.OnClickListener() { // from class: o.wgi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C53186wgj.copydefault(smartCoinsData, c53192wgp, view);
                }
            });
            c53192wgp.EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.wgm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C53186wgj.OLrzqt(smartCoinsData, c53192wgp, view);
                }
            });
        } else {
            c53192wgp.EZpvd().setVisibility(8);
        }
        android.view.View view = c53192wgp.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        C55296xhK.margin$default(view, null, java.lang.Float.valueOf(smartCoinsData.KWHzl()), null, null, 13, null);
    }

    public static final void copydefault(SmartCoinsData smartCoinsData, C53192wgp c53192wgp, android.view.View view) {
        OLrzqt(smartCoinsData, c53192wgp);
    }

    public static final void OLrzqt(SmartCoinsData smartCoinsData, C53192wgp c53192wgp, android.view.View view) {
        OLrzqt(smartCoinsData, c53192wgp);
    }
}
