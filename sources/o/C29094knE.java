package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.dexlogic.txs.TxType;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C29094knE;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.knE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29094knE extends androidx.recyclerview.widget.ListAdapter<C29182kon, Activity> {
    public final Function1<java.lang.String, Unit> EZpvd;
    public boolean KWHzl;
    public final Function1<java.lang.String, Unit> OLrzqt;

    /* JADX INFO: renamed from: o.knE$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TxType.values().length];
            try {
                iArr[TxType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TxType.TRANSFER_IN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TxType.SELL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TxType.TRANSFER_OUT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C29094knE(@NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12, boolean z) {
        super(new C29099knJ());
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.OLrzqt = function1;
        this.EZpvd = function12;
        this.KWHzl = z;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C23431hyB c23431hyBKWHzl = C23431hyB.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23431hyBKWHzl, "");
        return new Activity(this, c23431hyBKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        C29182kon item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        activity.EZpvd(item);
    }

    /* JADX INFO: renamed from: o.knE$Activity */
    public final class Activity extends kLN<C29182kon> {
        public final /* synthetic */ C29094knE AEQbTJ;
        public final C23431hyB KWHzl;

        /* JADX WARN: Illegal instructions before constructor call */
        public Activity(@NotNull C29094knE c29094knE, C23431hyB c23431hyB) {
            Intrinsics.checkNotNullParameter(c23431hyB, "");
            this.AEQbTJ = c29094knE;
            LinearLayoutCompat root = c23431hyB.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.KWHzl = c23431hyB;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)V */
        @Override // o.kLN
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(@NotNull final C29182kon c29182kon) {
            java.lang.String strOLrzqt;
            java.lang.String scientificCurrency$default;
            Intrinsics.checkNotNullParameter(c29182kon, "");
            C23431hyB c23431hyB = this.KWHzl;
            final C29094knE c29094knE = this.AEQbTJ;
            final AppCompatTextView appCompatTextView = c23431hyB.copydefault;
            java.lang.String scientificCurrency$default2 = "***";
            appCompatTextView.setText(c29094knE.KWHzl ? "***" : C29137knv.Companion.OLrzqt(c29182kon.AhwBna()));
            if (c29182kon.copydefault()) {
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.GGlJim);
                if (drawableKWHzl != null) {
                    C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
                    drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                } else {
                    drawableKWHzl = null;
                }
                appCompatTextView.setCompoundDrawablesRelative(null, null, drawableKWHzl, null);
                appCompatTextView.setCompoundDrawablePadding(C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                C25352ivB.setOnDoubleCheckClickListener$default(appCompatTextView, 0L, new Function1() { // from class: o.knG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29094knE.Activity.EZpvd(c29094knE, appCompatTextView, (android.view.View) obj);
                    }
                }, 1, null);
            } else {
                appCompatTextView.setCompoundDrawablesRelative(null, null, null, null);
            }
            c23431hyB.AYXKKw.setText(c29094knE.KWHzl ? "*****" : C25322iuY.OLrzqt.copydefault(c29182kon.AEQbTJ()));
            AppCompatTextView appCompatTextView2 = c23431hyB.EZpvd;
            if (c29094knE.KWHzl) {
                strOLrzqt = "***";
            } else {
                strOLrzqt = c29182kon.OLrzqt().length() == 0 ? "--" : hSP.OLrzqt(c29182kon.OLrzqt(), c29094knE.AEQbTJ(c29182kon.AhwBna()));
            }
            appCompatTextView2.setText(strOLrzqt);
            android.content.Context context = c23431hyB.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            appCompatTextView2.setTextColor(c29094knE.EZpvd(context, c29182kon.AhwBna()));
            AppCompatTextView appCompatTextView3 = c23431hyB.valueOf;
            if (c29094knE.KWHzl) {
                scientificCurrency$default = "***";
            } else {
                scientificCurrency$default = c29182kon.djBIcL().length() == 0 ? "--" : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c29182kon.djBIcL(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, 496, null);
            }
            appCompatTextView3.setText(scientificCurrency$default);
            AppCompatTextView appCompatTextView4 = c23431hyB.djBIcL;
            if (c29182kon.EZpvd().length() == 0) {
                scientificCurrency$default2 = "--";
            } else if (!c29094knE.KWHzl) {
                scientificCurrency$default2 = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c29182kon.EZpvd(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, 496, null);
            }
            appCompatTextView4.setText(scientificCurrency$default2);
            C25352ivB.setOnDoubleCheckClickListener$default(c23431hyB.getRoot(), 0L, new Function1() { // from class: o.knI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C29094knE.Activity.KWHzl(c29094knE, c29182kon, (android.view.View) obj);
                }
            }, 1, null);
        }

        public static final Unit EZpvd(C29094knE c29094knE, AppCompatTextView appCompatTextView, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = c29094knE.OLrzqt;
            java.lang.String string = appCompatTextView.getContext().getString(C23274hvD.Fragment.GVpNrs);
            Intrinsics.checkNotNullExpressionValue(string, "");
            function1.invoke(string);
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(C29094knE c29094knE, C29182kon c29182kon, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            c29094knE.EZpvd.invoke(c29182kon.AYXKKw());
            return Unit.INSTANCE;
        }
    }

    public final java.lang.String AEQbTJ(TxType txType) {
        int i = Application.copydefault[txType.ordinal()];
        return (i == 1 || i == 2 || !(i == 3 || i == 4)) ? Marker.ANY_NON_NULL_MARKER : "-";
    }

    public final int EZpvd(android.content.Context context, TxType txType) {
        if (this.KWHzl) {
            return C25382ivf.KWHzl(C52761wXj.Activity.DCUTEIddSDPG);
        }
        android.content.Context contextCopydefault = C25382ivf.copydefault(context);
        int i = Application.copydefault[txType.ordinal()];
        if (i == 1 || i == 2) {
            return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, contextCopydefault, 0.0f, 2, null);
        }
        if (i == 3 || i == 4) {
            return C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, contextCopydefault, 0.0f, 2, null);
        }
        return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, contextCopydefault, 0.0f, 2, null);
    }
}
