package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.localization.util.format.DisplaySign;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C28658ket;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ket, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28658ket extends androidx.recyclerview.widget.ListAdapter<C28653keo, Activity> {
    public final Function1<java.lang.String, Unit> EZpvd;
    public final Function1<java.lang.String, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28658ket(@NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12) {
        super(new C28660kev());
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.KWHzl = function1;
        this.EZpvd = function12;
    }

    /* JADX INFO: renamed from: o.ket$Activity */
    public final class Activity extends kLN<C28653keo> {
        public final /* synthetic */ C28658ket KWHzl;
        public final C21531hCv OLrzqt;
        public final Function1<java.lang.String, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<java.lang.String, Unit> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull C28658ket c28658ket, @NotNull C21531hCv c21531hCv, Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(c21531hCv, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = c28658ket;
            ConstraintLayout constraintLayoutCopydefault = c21531hCv.getRoot();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutCopydefault, "");
            super(constraintLayoutCopydefault);
            this.OLrzqt = c21531hCv;
            this.copydefault = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)V */
        @Override // o.kLN
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(@NotNull final C28653keo c28653keo) {
            int iKWHzl;
            java.lang.String strAhwBna;
            Intrinsics.checkNotNullParameter(c28653keo, "");
            C21531hCv c21531hCv = this.OLrzqt;
            C28658ket c28658ket = this.KWHzl;
            ConstraintLayout constraintLayoutCopydefault = c21531hCv.getRoot();
            constraintLayoutCopydefault.setOnClickListener(new TaskDescription(constraintLayoutCopydefault, 1000L, this, c28653keo));
            java.lang.String strKWHzl = C31256lqb.KWHzl(c28653keo.AYXKKw(), (Function0<java.lang.String>) new Function0() { // from class: o.kes
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28658ket.Activity.AEQbTJ(c28653keo);
                }
            });
            android.widget.TextView textView = c21531hCv.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C31258lqd.copydefault(textView, strKWHzl, c28653keo.copydefault(), C52761wXj.Activity.fdOvFl);
            android.widget.ImageView imageView = c21531hCv.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25386ivj.loadWalletProfileImage$default(imageView, c28653keo.OLrzqt(), c28653keo.KWHzl(), c28653keo.AhwBna(), 0.0f, 8, null);
            android.widget.TextView textView2 = c21531hCv.AhwBna;
            java.lang.String strAEQbTJ = c28653keo.AEQbTJ();
            java.lang.String percentWithSymbol$default = "--";
            textView2.setText((strAEQbTJ == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) ? "--" : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c28653keo.AEQbTJ(), true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
            android.widget.TextView textView3 = c21531hCv.gEmmrt;
            java.lang.String strEZpvd = c28653keo.EZpvd();
            textView3.setText((strEZpvd == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)) ? "--" : C23311hvo.formatPercentWithoutSymbol$default(c28653keo.EZpvd(), false, 0, null, false, null, 31, null));
            android.widget.TextView textView4 = c21531hCv.AYXKKw;
            java.lang.String strDjBIcL = c28653keo.djBIcL();
            textView4.setText((strDjBIcL == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDjBIcL)) ? "--" : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c28653keo.djBIcL(), true, null, false, false, false, false, DisplaySign.EXCEPT_ZERO, false, false, 446, null));
            android.widget.TextView textView5 = c21531hCv.AYXKKw;
            if (C23313hvq.OLrzqt(c28653keo.djBIcL(), "0")) {
                iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI);
            } else if (C23313hvq.KWHzl(c28653keo.djBIcL(), "0")) {
                iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.OuxcSI);
            } else {
                iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
            }
            textView5.setTextColor(iKWHzl);
            android.widget.TextView textView6 = c21531hCv.djBIcL;
            java.lang.String strValueOf = c28653keo.valueOf();
            if (strValueOf != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValueOf)) {
                percentWithSymbol$default = C23311hvo.formatPercentWithSymbol$default(c28653keo.valueOf(), false, 0, 0, null, null, 30, null);
            }
            textView6.setText(percentWithSymbol$default);
            TagMeta tagMetaGEmmrt = c28653keo.gEmmrt();
            if (tagMetaGEmmrt != null) {
                c21531hCv.copydefault.setText(tagMetaGEmmrt.DbNXlk());
                android.content.Context context = this.OLrzqt.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                if (C33054mpH.AEQbTJ(context)) {
                    strAhwBna = tagMetaGEmmrt.KWHzl();
                } else {
                    strAhwBna = tagMetaGEmmrt.AhwBna();
                }
            }
            C55251xgS c55251xgS = c21531hCv.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(c28653keo.gEmmrt() != null ? 0 : 8);
            android.widget.ImageView imageView2 = c21531hCv.KWHzl;
            imageView2.setOnClickListener(new Application(imageView2, 1000L, c28658ket, c28653keo));
        }

        public static final java.lang.String AEQbTJ(C28653keo c28653keo) {
            return C25352ivB.formatAddress$default(c28653keo.AhwBna(), 4, 4, null, 4, null);
        }

        /* JADX INFO: renamed from: o.ket$Activity$Activity, reason: collision with other inner class name */
        public static final class C0868Activity extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
            public final /* synthetic */ C21531hCv copydefault;

            public C0868Activity(C21531hCv c21531hCv) {
                this.copydefault = c21531hCv;
            }

            @Override // o.InterfaceC5462Sq
            public /* bridge */ /* synthetic */ void copydefault(java.lang.Object obj, InterfaceC5460So interfaceC5460So) {
                copydefault((android.graphics.drawable.Drawable) obj, (InterfaceC5460So<? super android.graphics.drawable.Drawable>) interfaceC5460So);
            }

            public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
                Intrinsics.checkNotNullParameter(drawable, "");
                drawable.setBounds(0, 0, C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null));
                this.copydefault.copydefault.setCompoundDrawables(drawable, null, null, null);
            }

            @Override // o.InterfaceC5462Sq
            public void a_(android.graphics.drawable.Drawable drawable) {
                this.copydefault.copydefault.setCompoundDrawables(drawable, null, null, null);
            }
        }

        /* JADX INFO: renamed from: o.ket$Activity$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ C28653keo AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ C28658ket copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, C28658ket c28658ket, C28653keo c28653keo) {
                this.EZpvd = view;
                this.OLrzqt = j;
                this.copydefault = c28658ket;
                this.AEQbTJ = c28653keo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.copydefault.KWHzl().invoke(this.AEQbTJ.AhwBna());
                }
            }
        }

        /* JADX INFO: renamed from: o.ket$Activity$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ Activity OLrzqt;
            public final /* synthetic */ C28653keo copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, Activity activity, C28653keo c28653keo) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.OLrzqt = activity;
                this.copydefault = c28653keo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.OLrzqt.copydefault().invoke(this.copydefault.AhwBna());
                }
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21531hCv c21531hCvAEQbTJ = C21531hCv.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21531hCvAEQbTJ, "");
        return new Activity(this, c21531hCvAEQbTJ, this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        C28653keo item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        activity.EZpvd(item);
    }
}
