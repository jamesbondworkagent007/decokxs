package o;

import android.view.View;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C46139tJg;
import o.C46140tJh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tJh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46140tJh extends AbstractC59533zio<C46139tJg, Activity> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        tNH tnhAEQbTJ = tNH.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(tnhAEQbTJ, "");
        return new Activity(this, tnhAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull C46139tJg c46139tJg, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c46139tJg, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(list);
        C46139tJg.TaskDescription taskDescription = objFirstOrNull instanceof C46139tJg.TaskDescription ? (C46139tJg.TaskDescription) objFirstOrNull : null;
        if (taskDescription == null) {
            onBindViewHolder(activity, c46139tJg);
            return;
        }
        if (taskDescription.AEQbTJ()) {
            activity.EZpvd(c46139tJg.EZpvd());
        }
        if (taskDescription.copydefault()) {
            activity.EZpvd(c46139tJg);
        }
        activity.KWHzl(c46139tJg);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull C46139tJg c46139tJg) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c46139tJg, "");
        activity.EZpvd(c46139tJg.EZpvd());
        activity.EZpvd(c46139tJg);
        activity.KWHzl(c46139tJg);
    }

    /* JADX INFO: renamed from: o.tJh$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ C46140tJh EZpvd;
        public final tNH copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C46140tJh c46140tJh, tNH tnh) {
            super(tnh.getRoot());
            Intrinsics.checkNotNullParameter(tnh, "");
            this.EZpvd = c46140tJh;
            this.copydefault = tnh;
        }

        public final void EZpvd(@NotNull PlanetAvatarInfo planetAvatarInfo) {
            Intrinsics.checkNotNullParameter(planetAvatarInfo, "");
            android.widget.ImageView imageView = this.copydefault.hDKMBd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            tRE.loadAvatar$default(imageView, planetAvatarInfo, 0, 2, (java.lang.Object) null);
        }

        public final void EZpvd(@NotNull C46139tJg c46139tJg) {
            Intrinsics.checkNotNullParameter(c46139tJg, "");
            android.widget.ImageView imageView = this.copydefault.EZpvd;
            if (c46139tJg.KWHzl() != 0) {
                imageView.setImageResource(c46139tJg.KWHzl());
            } else if (c46139tJg.AEQbTJ().length() > 0) {
                Intrinsics.copydefault(imageView);
                tRE.loadAvatar$default(imageView, new PlanetAvatarInfo(c46139tJg.AEQbTJ(), c46139tJg.AEQbTJ(), c46139tJg.copydefault(), c46139tJg.iwGUEr()), 0, 2, (java.lang.Object) null);
            }
        }

        public final void KWHzl(@NotNull final C46139tJg c46139tJg) {
            java.lang.CharSequence charSequenceValues;
            java.lang.CharSequence charSequenceZLjUOn;
            Intrinsics.checkNotNullParameter(c46139tJg, "");
            final tNH tnh = this.copydefault;
            android.view.View root = tnh.getRoot();
            root.setOnClickListener(new TaskDescription(root, 300L, root, this, c46139tJg));
            android.widget.TextView textView = tnh.iwGUEr;
            textView.setOnClickListener(new ViewOnClickListenerC0960Activity(textView, 300L, textView, this, c46139tJg));
            tnh.iwGUEr.setText(c46139tJg.gHZMYf());
            tnh.uzCIH.setText(c46139tJg.AuCTelauCTel());
            tnh.getNewProxyInstance.setText(c46139tJg.AYXKKw());
            tnh.KWHzl.setText(c46139tJg.copydefault());
            android.widget.LinearLayout linearLayout = tnh.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            int i = 8;
            linearLayout.setVisibility(c46139tJg.AuCTel() ? 0 : 8);
            android.widget.TextView textView2 = tnh.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            KWHzl(textView2, c46139tJg.fetchVPNInfo());
            android.widget.TextView textView3 = tnh.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            KWHzl(textView3, c46139tJg.fARcdN());
            tnh.fIwbmz.setTextColor(C46369tRu.EZpvd(c46139tJg.ejfBZ()));
            android.view.View view = tnh.isConnected;
            Intrinsics.checkNotNullExpressionValue(view, "");
            if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c46139tJg.fARcdN())) && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c46139tJg.fetchVPNInfo()))) {
                i = 0;
            }
            view.setVisibility(i);
            tnh.gEmmrt.setText(c46139tJg.fJNWhG());
            android.widget.TextView textView4 = tnh.AYXKKw;
            if (c46139tJg.isConnected() == 0) {
                charSequenceValues = C33061mpO.setupSpanStyles$default(c46139tJg.values(), new java.lang.String[]{c46139tJg.values()}, 0, null, false, new Function1() { // from class: o.tJj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C46140tJh.Activity.KWHzl(tnh, c46139tJg, (java.util.List) obj);
                    }
                }, 14, null);
            } else {
                java.lang.Integer numAkhnZx = c46139tJg.AkhnZx();
                if (numAkhnZx != null) {
                    tnh.AYXKKw.setTextColor(numAkhnZx.intValue());
                }
                charSequenceValues = c46139tJg.values();
            }
            textView4.setText(charSequenceValues);
            if (C33129mqd.AEQbTJ(java.lang.Float.valueOf(c46139tJg.DbNXlk()), 0)) {
                android.widget.TextView textView5 = tnh.AYXKKw;
                float fDbNXlk = c46139tJg.DbNXlk();
                android.content.Context context = tnh.AYXKKw.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                textView5.setPaddingRelative(0, C55298xhM.copydefault(fDbNXlk, context), 0, 0);
            }
            tnh.AuCTel.setText(c46139tJg.wlaJM());
            android.widget.TextView textView6 = tnh.DbNXlk;
            if (c46139tJg.AubY() != 0) {
                charSequenceZLjUOn = C33061mpO.setupSpanStyles$default(c46139tJg.zLjUOn(), new java.lang.String[]{c46139tJg.zLjUOn()}, 0, null, false, new Function1() { // from class: o.tJm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C46140tJh.Activity.copydefault(tnh, c46139tJg, (java.util.List) obj);
                    }
                }, 14, null);
            } else {
                charSequenceZLjUOn = c46139tJg.zLjUOn();
            }
            textView6.setText(charSequenceZLjUOn);
            if (c46139tJg.zLjUOn().length() > 13) {
                TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(tnh.DbNXlk, 12, 16, 1, 2);
                tnh.DbNXlk.setMaxLines(2);
            } else {
                tnh.DbNXlk.setMaxLines(1);
            }
            android.widget.TextView textView7 = tnh.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            KWHzl(textView7, c46139tJg.hDKMBd());
            android.widget.TextView textView8 = tnh.values;
            Intrinsics.checkNotNullExpressionValue(textView8, "");
            KWHzl(textView8, c46139tJg.getFieldNames());
            android.widget.TextView textView9 = tnh.fARcdN;
            Intrinsics.checkNotNullExpressionValue(textView9, "");
            KWHzl(textView9, c46139tJg.gEmmrt());
            android.widget.TextView textView10 = tnh.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(textView10, "");
            KWHzl(textView10, c46139tJg.djBIcL());
            android.widget.TextView textView11 = tnh.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView11, "");
            KWHzl(textView11, c46139tJg.AhwBna());
            android.widget.TextView textView12 = tnh.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView12, "");
            KWHzl(textView12, c46139tJg.valueOf());
            android.widget.TextView textView13 = tnh.fJNWhG;
            Intrinsics.checkNotNullExpressionValue(textView13, "");
            KWHzl(textView13, c46139tJg.uzCIH());
            android.widget.TextView textView14 = tnh.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(textView14, "");
            KWHzl(textView14, c46139tJg.getNewProxyInstance());
        }

        public static final Unit KWHzl(tNH tnh, C46139tJg c46139tJg, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.TextAppearanceSpan(tnh.AYXKKw.getContext(), c46139tJg.isConnected()));
            java.lang.Integer numAkhnZx = c46139tJg.AkhnZx();
            if (numAkhnZx != null) {
                list.add(new android.text.style.ForegroundColorSpan(numAkhnZx.intValue()));
            }
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(tNH tnh, C46139tJg c46139tJg, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.TextAppearanceSpan(tnh.DbNXlk.getContext(), c46139tJg.AubY()));
            java.lang.Boolean boolZsXlph = c46139tJg.zsXlph();
            if (boolZsXlph != null) {
                list.add(new android.text.style.ForegroundColorSpan(C46369tRu.EZpvd(boolZsXlph.booleanValue())));
            }
            return Unit.INSTANCE;
        }

        public final void KWHzl(android.widget.TextView textView, java.lang.String str) {
            textView.setText(str);
            textView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true ? 0 : 8);
        }

        public final void KWHzl(android.content.Context context, java.lang.String str) {
            C46447tUr.openPlanetUserProfilePage$default(C46447tUr.KWHzl, context, "", "", str, "feed", "portfolio", C56423yEv.EZpvd(C56390yDp.OLrzqt("isOrbiter", "1")), null, 128, null);
        }

        /* JADX INFO: renamed from: o.tJh$Activity$Activity, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0960Activity implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C46139tJg EZpvd;
            public final /* synthetic */ Activity KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0960Activity(android.view.View view, long j, android.view.View view2, Activity activity, C46139tJg c46139tJg) {
                this.copydefault = view;
                this.OLrzqt = j;
                this.AEQbTJ = view2;
                this.KWHzl = activity;
                this.EZpvd = c46139tJg;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    android.widget.TextView textView = (android.widget.TextView) this.AEQbTJ;
                    Activity activity = this.KWHzl;
                    android.content.Context context = textView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    activity.KWHzl(context, this.EZpvd.sSMYrx());
                }
            }
        }

        /* JADX INFO: renamed from: o.tJh$Activity$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C46139tJg EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ Activity OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, android.view.View view2, Activity activity, C46139tJg c46139tJg) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.copydefault = view2;
                this.OLrzqt = activity;
                this.EZpvd = c46139tJg;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    android.view.View view2 = this.copydefault;
                    Activity activity = this.OLrzqt;
                    android.content.Context context = view2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    activity.KWHzl(context, this.EZpvd.sSMYrx());
                }
            }
        }
    }
}
