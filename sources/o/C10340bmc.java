package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C10340bmc;
import o.C13754dXa;
import o.C52761wXj;
import o.xWD;

/* JADX INFO: renamed from: o.bmc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10340bmc extends C43316rmw {
    public C10340bmc() {
        register(C10344bmg.class, new AnonymousClass2(C13754dXa.TaskDescription.clearRegistrations));
    }

    /* JADX INFO: renamed from: o.bmc$2, reason: invalid class name */
    public static final class AnonymousClass2 extends C43318rmy<C10344bmg, AbstractC16768eqE> {
        public AnonymousClass2(int i) {
            super(i, 0);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16768eqE> c43312rms, final C10344bmg c10344bmg) {
            java.lang.String string;
            java.lang.String string2;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c10344bmg, "");
            super.onBindViewHolder((C43312rms) c43312rms, c10344bmg);
            final AbstractC16768eqE abstractC16768eqE = (AbstractC16768eqE) c43312rms.OLrzqt();
            C10353bmp c10353bmp = C10353bmp.OLrzqt;
            java.lang.String strAEQbTJ = c10353bmp.AEQbTJ(c10344bmg.OLrzqt());
            C5448Sc c5448ScKWHzl = strAEQbTJ != null ? c10353bmp.KWHzl(strAEQbTJ) : null;
            android.widget.ImageView imageView = abstractC16768eqE.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            c10353bmp.KWHzl(imageView, strAEQbTJ, xWD.Activity.AEQbTJ, (16 & 8) != 0 ? null : c5448ScKWHzl, (16 & 16) != 0 ? null : null);
            if (c10344bmg.gEmmrt()) {
                abstractC16768eqE.EZpvd.setBackgroundResource(C13754dXa.Activity.AYXKKw);
                abstractC16768eqE.OLrzqt.setBackgroundResource(C13754dXa.Activity.AYXKKw);
                abstractC16768eqE.OLrzqt.setClipToOutline(true);
            }
            android.widget.TextView textView = abstractC16768eqE.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c10344bmg.AEQbTJ()) ? 0 : 8);
            android.widget.TextView textView2 = abstractC16768eqE.DbNXlk;
            android.content.Context context = abstractC16768eqE.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView2.setText(C33069mpW.KWHzl(context, C13754dXa.FragmentManager.UrRBLY, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("asset", c10344bmg.AEQbTJ()))));
            abstractC16768eqE.djBIcL.setText(c10344bmg.EZpvd() + " " + c10344bmg.valueOf());
            abstractC16768eqE.valueOf.setText(C10346bmi.formatCurrencyData$default(C10346bmi.KWHzl, c10344bmg.copydefault(), null, null, null, 14, null));
            abstractC16768eqE.djBIcL.post(new java.lang.Runnable() { // from class: o.bmd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C10340bmc.AnonymousClass2.copydefault(abstractC16768eqE, c10344bmg);
                }
            });
            android.widget.TextView textView3 = abstractC16768eqE.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = c10344bmg.KWHzl().isEmpty() ^ true ? C55298xhM.dp2px$default(4.0f, null, 1, null) : 0;
                textView3.setLayoutParams(marginLayoutParams);
                if (!c10344bmg.KWHzl().isEmpty()) {
                    for (C10345bmh c10345bmh : CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) c10344bmg.KWHzl(), 3)) {
                        AbstractC16772eqI abstractC16772eqIAEQbTJ = AbstractC16772eqI.AEQbTJ(android.view.LayoutInflater.from(abstractC16768eqE.getRoot().getContext()));
                        Intrinsics.checkNotNullExpressionValue(abstractC16772eqIAEQbTJ, "");
                        abstractC16772eqIAEQbTJ.OLrzqt.setText(c10345bmh.OLrzqt() + " " + c10345bmh.copydefault());
                        android.widget.TextView textView4 = abstractC16772eqIAEQbTJ.EZpvd;
                        if (C33129mqd.AEQbTJ(c10345bmh.KWHzl(), 0)) {
                            string2 = C10346bmi.formatCurrencyData$default(C10346bmi.KWHzl, c10345bmh.KWHzl(), null, null, null, 14, null);
                        } else {
                            string2 = abstractC16772eqIAEQbTJ.getRoot().getContext().getString(C13754dXa.FragmentManager.fHqPtx);
                            Intrinsics.copydefault((java.lang.Object) string2);
                        }
                        textView4.setText(string2);
                        abstractC16768eqE.AYXKKw.addView(abstractC16772eqIAEQbTJ.getRoot());
                    }
                    if (c10344bmg.KWHzl().size() > 3) {
                        for (C10345bmh c10345bmh2 : c10344bmg.KWHzl().subList(3, c10344bmg.KWHzl().size())) {
                            AbstractC16772eqI abstractC16772eqIAEQbTJ2 = AbstractC16772eqI.AEQbTJ(android.view.LayoutInflater.from(abstractC16768eqE.getRoot().getContext()));
                            Intrinsics.checkNotNullExpressionValue(abstractC16772eqIAEQbTJ2, "");
                            abstractC16772eqIAEQbTJ2.OLrzqt.setText(c10345bmh2.OLrzqt() + " " + c10345bmh2.copydefault());
                            android.widget.TextView textView5 = abstractC16772eqIAEQbTJ2.EZpvd;
                            if (C33129mqd.AEQbTJ(c10345bmh2.KWHzl(), 0)) {
                                string = C10346bmi.formatCurrencyData$default(C10346bmi.KWHzl, c10345bmh2.KWHzl(), null, null, null, 14, null);
                            } else {
                                string = abstractC16772eqIAEQbTJ2.getRoot().getContext().getString(C13754dXa.FragmentManager.fHqPtx);
                                Intrinsics.copydefault((java.lang.Object) string);
                            }
                            textView5.setText(string);
                            abstractC16768eqE.copydefault.addView(abstractC16772eqIAEQbTJ2.getRoot());
                        }
                    }
                    Intrinsics.copydefault(abstractC16768eqE);
                    OLrzqt(abstractC16768eqE, c10344bmg.djBIcL(), c10344bmg.KWHzl().size() > 3);
                }
                android.widget.TextView textView6 = abstractC16768eqE.AhwBna;
                textView6.setOnClickListener(new ActionBar(textView6, 1000L, c10344bmg, this, abstractC16768eqE));
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }

        public static final void copydefault(AbstractC16768eqE abstractC16768eqE, C10344bmg c10344bmg) {
            if (((int) abstractC16768eqE.djBIcL.getPaint().measureText(c10344bmg.valueOf())) > abstractC16768eqE.djBIcL.getMeasuredWidth()) {
                abstractC16768eqE.djBIcL.setText(c10344bmg.EZpvd() + "\n" + c10344bmg.valueOf());
                android.widget.TextView textView = abstractC16768eqE.djBIcL;
                textView.setMaxLines((((int) textView.getPaint().measureText(c10344bmg.EZpvd())) / abstractC16768eqE.djBIcL.getMeasuredWidth()) + 2);
            }
        }

        public final void OLrzqt(AbstractC16768eqE abstractC16768eqE, boolean z, boolean z2) {
            java.lang.String string;
            android.view.View view = abstractC16768eqE.KWHzl;
            Intrinsics.checkNotNullExpressionValue(view, "");
            int i = 8;
            view.setVisibility(z2 ? 0 : 8);
            android.widget.TextView textView = abstractC16768eqE.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(z2 ? 0 : 8);
            android.widget.LinearLayout linearLayout = abstractC16768eqE.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            if (z2 && z) {
                i = 0;
            }
            linearLayout.setVisibility(i);
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(abstractC16768eqE.getRoot().getContext(), z ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG);
            if (drawable != null) {
                drawable.setBounds(0, 0, C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null));
            }
            abstractC16768eqE.AhwBna.setCompoundDrawables(null, null, drawable, null);
            android.widget.TextView textView2 = abstractC16768eqE.AhwBna;
            android.content.Context context = abstractC16768eqE.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView2.setCompoundDrawablePadding(C55298xhM.copydefault(4.0f, context));
            android.widget.TextView textView3 = abstractC16768eqE.AhwBna;
            if (z) {
                string = abstractC16768eqE.getRoot().getContext().getString(C13754dXa.FragmentManager.hvKCwS);
            } else {
                string = abstractC16768eqE.getRoot().getContext().getString(C13754dXa.FragmentManager.sVXHln);
            }
            textView3.setText(string);
        }

        /* JADX INFO: renamed from: o.bmc$2$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ AbstractC16768eqE EZpvd;
            public final /* synthetic */ C10344bmg KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ AnonymousClass2 copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C10344bmg c10344bmg, AnonymousClass2 anonymousClass2, AbstractC16768eqE abstractC16768eqE) {
                this.OLrzqt = view;
                this.AEQbTJ = j;
                this.KWHzl = c10344bmg;
                this.copydefault = anonymousClass2;
                this.EZpvd = abstractC16768eqE;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.KWHzl.AEQbTJ(!r7.djBIcL());
                    AnonymousClass2 anonymousClass2 = this.copydefault;
                    Intrinsics.copydefault(this.EZpvd);
                    anonymousClass2.OLrzqt(this.EZpvd, this.KWHzl.djBIcL(), this.KWHzl.KWHzl().size() > 3);
                }
            }
        }
    }
}
