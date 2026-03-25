package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.tag.ui.TagExplanationBottomSheetParams;
import com.okinc.business.market.widget.tag.TagEventSource;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C28948kkR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kkR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C28948kkR extends androidx.recyclerview.widget.ListAdapter<C28902kjY, Activity> {
    public boolean AEQbTJ;
    public final androidx.fragment.app.FragmentManager KWHzl;
    public final Function1<C28902kjY, Unit> copydefault;
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<C28902kjY, Unit> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.kjY, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28948kkR(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super C28902kjY, Unit> function1) {
        super(OLrzqt);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = fragmentManager;
        this.copydefault = function1;
    }

    /* JADX INFO: renamed from: o.kkR$StateListAnimator */
    public static final class StateListAnimator extends DiffUtil.ItemCallback<C28902kjY> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kkR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull C28902kjY c28902kjY, @NotNull C28902kjY c28902kjY2) {
            Intrinsics.checkNotNullParameter(c28902kjY, "");
            Intrinsics.checkNotNullParameter(c28902kjY2, "");
            return Intrinsics.EZpvd((java.lang.Object) c28902kjY.djBIcL(), (java.lang.Object) c28902kjY2.djBIcL());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull C28902kjY c28902kjY, @NotNull C28902kjY c28902kjY2) {
            Intrinsics.checkNotNullParameter(c28902kjY, "");
            Intrinsics.checkNotNullParameter(c28902kjY2, "");
            return Intrinsics.EZpvd(c28902kjY, c28902kjY2);
        }
    }

    /* JADX INFO: renamed from: o.kkR$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ C28948kkR AEQbTJ;
        public final C21483hBa KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C28948kkR c28948kkR, C21483hBa c21483hBa) {
            super(c21483hBa.getRoot());
            Intrinsics.checkNotNullParameter(c21483hBa, "");
            this.AEQbTJ = c28948kkR;
            this.KWHzl = c21483hBa;
        }

        public final void KWHzl(@NotNull final C28902kjY c28902kjY) {
            Intrinsics.checkNotNullParameter(c28902kjY, "");
            C21483hBa c21483hBa = this.KWHzl;
            final C28948kkR c28948kkR = this.AEQbTJ;
            c21483hBa.DbNXlk.EZpvd(c28902kjY.AYXKKw(), c28902kjY.AEQbTJ());
            c21483hBa.values.setText(c28902kjY.AhwBna());
            android.widget.TextView textView = c21483hBa.AYXKKw;
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            java.lang.String strGEmmrt = c28902kjY.gEmmrt();
            RoundingMode roundingMode = RoundingMode.DOWN;
            textView.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, strGEmmrt, true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
            c21483hBa.isConnected.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, c28902kjY.AkhnZx(), true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
            c21483hBa.valueOf.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, c28902kjY.copydefault(), true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
            android.widget.TextView textView2 = c21483hBa.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            kLY.formatPercentage$default(textView2, c28902kjY.EZpvd(), DisplaySign.EXCEPT_ZERO, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 16, null);
            C28067kNr.setTags$default(c21483hBa.EZpvd, c28902kjY.OLrzqt(), false, false, new Function1() { // from class: o.kkT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28948kkR.Activity.EZpvd(c28902kjY, c28948kkR, (java.util.List) obj);
                }
            }, null, 22, null);
            OLrzqt(c28902kjY);
            C25352ivB.setOnDoubleCheckClickListener$default(c21483hBa.getRoot(), 0L, new Function1() { // from class: o.kkV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28948kkR.Activity.AEQbTJ(c28948kkR, c28902kjY, (android.view.View) obj);
                }
            }, 1, null);
        }

        public static final Unit EZpvd(C28902kjY c28902kjY, C28948kkR c28948kkR, java.util.List list) {
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(list, "");
            java.util.List<TagWrapper> listOLrzqt = c28902kjY.OLrzqt();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                arrayList.add(C29694kyV.AEQbTJ.OLrzqt(((TagWrapper) it.next()).OLrzqt()));
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((java.lang.String) next).length() > 0) {
                    break;
                }
            }
            C29717kys.Companion.EZpvd(new TagExplanationBottomSheetParams(c28902kjY.KWHzl(), c28902kjY.djBIcL(), false, null, TagEventSource.MODULE, false, 44, null)).show(c28948kkR.KWHzl);
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(C28948kkR c28948kkR, C28902kjY c28902kjY, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            c28948kkR.copydefault().invoke(c28902kjY);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(C28902kjY c28902kjY) {
            C21483hBa c21483hBa = this.KWHzl;
            C28948kkR c28948kkR = this.AEQbTJ;
            android.widget.FrameLayout frameLayout = c21483hBa.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(c28948kkR.KWHzl() ? 0 : 8);
            if (c28948kkR.KWHzl()) {
                int iAhwBna = C33129mqd.AhwBna(c28902kjY.valueOf());
                if (iAhwBna == 1) {
                    android.widget.ImageView imageView = c21483hBa.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    imageView.setVisibility(0);
                    android.widget.TextView textView = c21483hBa.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setVisibility(8);
                    android.widget.ImageView imageView2 = c21483hBa.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    C33054mpH.AEQbTJ(imageView2, java.lang.Integer.valueOf(C23274hvD.ActionBar.RcXXUw));
                    return;
                }
                if (iAhwBna == 2) {
                    android.widget.ImageView imageView3 = c21483hBa.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "");
                    imageView3.setVisibility(0);
                    android.widget.TextView textView2 = c21483hBa.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(8);
                    android.widget.ImageView imageView4 = c21483hBa.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "");
                    C33054mpH.AEQbTJ(imageView4, java.lang.Integer.valueOf(C23274hvD.ActionBar.djSkpj));
                    return;
                }
                if (iAhwBna == 3) {
                    android.widget.ImageView imageView5 = c21483hBa.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView5, "");
                    imageView5.setVisibility(0);
                    android.widget.TextView textView3 = c21483hBa.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(textView3, "");
                    textView3.setVisibility(8);
                    android.widget.ImageView imageView6 = c21483hBa.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView6, "");
                    C33054mpH.AEQbTJ(imageView6, java.lang.Integer.valueOf(C23274hvD.ActionBar.dvKsVJ));
                    return;
                }
                android.widget.ImageView imageView7 = c21483hBa.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView7, "");
                imageView7.setVisibility(8);
                android.widget.TextView textView4 = c21483hBa.djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(0);
                c21483hBa.djBIcL.setText(c28902kjY.valueOf());
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21483hBa c21483hBaOLrzqt = C21483hBa.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21483hBaOLrzqt, "");
        return new Activity(this, c21483hBaOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        C28902kjY item = getItem(i);
        Intrinsics.copydefault(item);
        activity.KWHzl(item);
    }
}
