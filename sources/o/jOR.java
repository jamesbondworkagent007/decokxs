package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.features.coindetail.domain.models.TokenRugType;
import com.okinc.business.market.features.tag.domain.CompactTag;
import com.okinc.business.market.features.tag.domain.TagExtra;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import o.jOR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jOR extends androidx.recyclerview.widget.ListAdapter<jNX, RecyclerView.ViewHolder> {
    public final int AEQbTJ;
    public java.util.List<C26047jPz> EZpvd;
    public TagWrapper copydefault;
    public final Function1<TokenBase, Unit> gEmmrt;
    public boolean valueOf;
    public static final ActionBar OLrzqt = new ActionBar(null);
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C26047jPz> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagWrapper KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(TagWrapper tagWrapper) {
        this.copydefault = tagWrapper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dex.api.bean.TokenBase, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jOR(@NotNull Function1<? super TokenBase, Unit> function1) {
        super(OLrzqt);
        Intrinsics.checkNotNullParameter(function1, "");
        this.gEmmrt = function1;
        this.AEQbTJ = 86400000;
        this.EZpvd = yDY.AhwBna();
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ jOR EZpvd;
        public final Activity OLrzqt;
        public final C23456hya copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull jOR jor, C23456hya c23456hya) {
            super(c23456hya.getRoot());
            Intrinsics.checkNotNullParameter(c23456hya, "");
            this.EZpvd = jor;
            this.copydefault = c23456hya;
            Activity activity = new Activity();
            this.OLrzqt = activity;
            RecyclerView recyclerView = c23456hya.copydefault;
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
            recyclerView.addItemDecoration(new TaskDescription());
            recyclerView.setItemAnimator(null);
            recyclerView.setAdapter(activity);
        }

        public final void OLrzqt() {
            int iKWHzl;
            CompactTag compactTagCopydefault;
            TagExtra tagExtraOLrzqt;
            CompactTag compactTagCopydefault2;
            TagExtra tagExtraOLrzqt2;
            this.OLrzqt.EZpvd(this.EZpvd.EZpvd());
            final C23456hya c23456hya = this.copydefault;
            jOR jor = this.EZpvd;
            if (jor.KWHzl() != null) {
                TagWrapper tagWrapperKWHzl = jor.KWHzl();
                java.lang.Integer numDjBIcL = (tagWrapperKWHzl == null || (compactTagCopydefault2 = tagWrapperKWHzl.copydefault()) == null || (tagExtraOLrzqt2 = compactTagCopydefault2.OLrzqt()) == null) ? null : tagExtraOLrzqt2.djBIcL();
                TagWrapper tagWrapperKWHzl2 = jor.KWHzl();
                java.lang.Integer numAEQbTJ = (tagWrapperKWHzl2 == null || (compactTagCopydefault = tagWrapperKWHzl2.copydefault()) == null || (tagExtraOLrzqt = compactTagCopydefault.OLrzqt()) == null) ? null : tagExtraOLrzqt.AEQbTJ();
                boolean z = numDjBIcL == null || numAEQbTJ == null;
                final java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.DcMfJKDSqxTE);
                final java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.sZqaRl);
                if (!z && C33129mqd.AhwBna(numDjBIcL) > 0) {
                    iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.gdmIOq);
                } else {
                    iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
                }
                c23456hya.AEQbTJ.getDrawable().setTint(iKWHzl);
                C29694kyV c29694kyV = C29694kyV.AEQbTJ;
                android.content.Context context = c23456hya.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c29694kyV.OLrzqt(context, numDjBIcL, numAEQbTJ);
                android.content.Context context2 = c23456hya.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c23456hya.KWHzl.setText(c29694kyV.OLrzqt(context2, numDjBIcL, numAEQbTJ));
                C25352ivB.setOnDoubleCheckClickListener$default(c23456hya.EZpvd, 0L, new Function1() { // from class: o.jOP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return jOR.Application.copydefault(c23456hya, strAYXKKw, strAYXKKw2, (android.view.View) obj);
                    }
                }, 1, null);
            } else {
                AppCompatImageView appCompatImageView = c23456hya.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                appCompatImageView.setVisibility(8);
                AppCompatTextView appCompatTextView = c23456hya.KWHzl;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                appCompatTextView.setVisibility(8);
                C55258xgZ c55258xgZ = c23456hya.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
                c55258xgZ.setVisibility(8);
            }
            android.widget.TextView textView = c23456hya.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(jor.AEQbTJ() ? 0 : 8);
            c23456hya.getRoot().setPadding(0, 0, 0, jor.AEQbTJ() ? 0 : C55298xhM.dp2px$default(16.0f, null, 1, null));
        }

        public static final Unit copydefault(C23456hya c23456hya, java.lang.String str, java.lang.String str2, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            android.content.Context context = c23456hya.getRoot().getContext();
            if (context != null) {
                C25352ivB.OLrzqt(context, str, str2, C23274hvD.Fragment.QVAiDq);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Activity extends RecyclerView.Adapter<C0858Activity> {
        public java.util.List<C26047jPz> EZpvd = yDY.AhwBna();

        public final void EZpvd(@NotNull java.util.List<C26047jPz> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
            notifyDataSetChanged();
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public C0858Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.content.Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            jPB jpb = new jPB(context, null, 0, 6, null);
            jpb.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new C0858Activity(jpb);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C0858Activity c0858Activity, int i) {
            Intrinsics.checkNotNullParameter(c0858Activity, "");
            c0858Activity.AEQbTJ(this.EZpvd.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.EZpvd.size();
        }

        /* JADX INFO: renamed from: o.jOR$Activity$Activity, reason: collision with other inner class name */
        public static final class C0858Activity extends RecyclerView.ViewHolder {
            public final jPB copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0858Activity(@NotNull jPB jpb) {
                super(jpb);
                Intrinsics.checkNotNullParameter(jpb, "");
                this.copydefault = jpb;
            }

            public final void AEQbTJ(@NotNull C26047jPz c26047jPz) {
                Intrinsics.checkNotNullParameter(c26047jPz, "");
                this.copydefault.setData(c26047jPz);
            }
        }
    }

    public static final class TaskDescription extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            if (childAdapterPosition >= 2) {
                rect.top = C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
            }
            if (childAdapterPosition % 2 == 0) {
                rect.right = C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null);
            } else {
                rect.left = C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null);
            }
        }
    }

    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C23462hyg AEQbTJ;
        public final /* synthetic */ jOR EZpvd;

        /* JADX INFO: renamed from: o.jOR$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public final /* synthetic */ class C0859StateListAnimator {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TokenRugType.values().length];
                try {
                    iArr[TokenRugType.NONE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[TokenRugType.DUMPING.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[TokenRugType.REMOVE_LIQUIDITY.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                AEQbTJ = iArr;
            }
        }

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ jNX EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ jOR copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, jOR jor, jNX jnx) {
                this.KWHzl = view;
                this.AEQbTJ = j;
                this.copydefault = jor;
                this.EZpvd = jnx;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.copydefault.gEmmrt.invoke(new TokenBase(this.EZpvd.OLrzqt(), this.EZpvd.AhwBna(), this.EZpvd.djBIcL(), null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -8, null));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull jOR jor, C23462hyg c23462hyg) {
            super(c23462hyg.getRoot());
            Intrinsics.checkNotNullParameter(c23462hyg, "");
            this.EZpvd = jor;
            this.AEQbTJ = c23462hyg;
        }

        public final void copydefault(@NotNull final jNX jnx) {
            java.lang.String str;
            java.lang.String percentWithoutSymbol$default;
            int iKWHzl;
            int iKWHzl2;
            TagWrapper tagWrapperKWHzl;
            TagMeta tagMetaAEQbTJ;
            java.lang.String strAYXKKw;
            Intrinsics.checkNotNullParameter(jnx, "");
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            final C23462hyg c23462hyg = this.AEQbTJ;
            jOR jor = this.EZpvd;
            c23462hyg.AEQbTJ.OLrzqt(jnx.djBIcL());
            c23462hyg.AEQbTJ.EZpvd(jnx.KWHzl());
            c23462hyg.AEQbTJ.setProgress((!jnx.DbNXlk() || jnx.AuCTel()) ? 0 : C33129mqd.AhwBna(jnx.gEmmrt()));
            c23462hyg.AEQbTJ.setProgressBarRotation(135.0f);
            c23462hyg.AkhnZx.setText(jnx.fetchVPNInfo());
            c23462hyg.isConnected.setText(StringsKt__StringNumberConversionsKt.getFieldNames(jnx.AYXKKw()) == null ? "--" : C25322iuY.OLrzqt.EZpvd(jnx.AYXKKw()));
            if (jCurrentTimeMillis - ((long) jor.copydefault()) < C33129mqd.valueOf(jnx.AYXKKw())) {
                c23462hyg.isConnected.setTextColor(C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI));
            } else {
                c23462hyg.isConnected.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            }
            android.widget.ImageView imageView = c23462hyg.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(jnx.DbNXlk() ? 0 : 8);
            android.widget.ImageView imageView2 = c23462hyg.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(jnx.isConnected() ? 0 : 8);
            c23462hyg.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.jOV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jOR.StateListAnimator.EZpvd(c23462hyg, jnx, view);
                }
            });
            C26023jPb c26023jPb = c23462hyg.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c26023jPb, "");
            c26023jPb.setVisibility(jnx.AEQbTJ() != TokenRugType.NONE ? 0 : 8);
            C26023jPb c26023jPb2 = c23462hyg.gEmmrt;
            int i = C52761wXj.TaskDescription.gvFztT;
            int i2 = C0859StateListAnimator.AEQbTJ[jnx.AEQbTJ().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.HJWChPOKBmQN);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.HJWChPQPAeHI);
                }
                str = strAYXKKw;
            } else {
                str = "";
            }
            c26023jPb2.setData(new C26022jPa(null, i, str, C25382ivf.KWHzl(C52761wXj.ActionBar.OuxcSI), null, null));
            c23462hyg.copydefault.setData(new C26022jPa((jnx.values() || (tagWrapperKWHzl = jor.KWHzl()) == null || (tagMetaAEQbTJ = tagWrapperKWHzl.AEQbTJ()) == null) ? null : tagMetaAEQbTJ.EZpvd(), C57406yhn.Activity.AuCTel, jor.AEQbTJ(jnx.values(), jnx.EZpvd()), C25382ivf.KWHzl(jnx.values() ? C52761wXj.Activity.gdmIOq : C52761wXj.ActionBar.DCUTEI), null, (jnx.values() || !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) jnx.EZpvd())) ? null : java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.DCUTEIddSDPG))));
            c23462hyg.AhwBna.setData(new C26022jPa(null, C57406yhn.Activity.gHZMYf, jor.AEQbTJ(jnx.valueOf()), jor.copydefault(jnx.valueOf()), null, StringsKt__StringsKt.fARcdN((java.lang.CharSequence) jnx.valueOf()) ? java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.DCUTEIddSDPG)) : null));
            android.widget.TextView textView = c23462hyg.values;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(jnx.DbNXlk() ? 0 : 8);
            android.widget.TextView textView2 = c23462hyg.values;
            if (jnx.AuCTel()) {
                percentWithoutSymbol$default = C33070mpX.AYXKKw(C23274hvD.Fragment.stopBehavioSecDataCollection);
            } else {
                percentWithoutSymbol$default = C23311hvo.formatPercentWithoutSymbol$default(jnx.gEmmrt(), false, 0, new BigDecimal(0.01d), true, null, 19, null);
            }
            textView2.setText(percentWithoutSymbol$default);
            c23462hyg.DbNXlk.setText(C59443zhD.AuCTel(jnx.copydefault()) == null ? "--" : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, jnx.copydefault(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
            android.widget.TextView textView3 = c23462hyg.DbNXlk;
            if (C59443zhD.AuCTel(jnx.copydefault()) == null) {
                iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.DCUTEIddSDPG);
            } else {
                double dAEQbTJ = C33129mqd.AEQbTJ(jnx.copydefault());
                if (dAEQbTJ > 1000000.0d) {
                    iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI);
                } else if (dAEQbTJ > 100000.0d) {
                    iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.RAQtXZ);
                } else {
                    iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.DCUTEIddSDPG);
                }
            }
            textView3.setTextColor(iKWHzl);
            c23462hyg.fJNWhG.setText(C59443zhD.AuCTel(jnx.AkhnZx()) != null ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, jnx.AkhnZx(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null) : "--");
            android.widget.TextView textView4 = c23462hyg.fJNWhG;
            if (C59443zhD.AuCTel(jnx.AkhnZx()) == null) {
                iKWHzl2 = C25382ivf.KWHzl(C52761wXj.Activity.DCUTEIddSDPG);
            } else {
                double dAEQbTJ2 = C33129mqd.AEQbTJ(jnx.AkhnZx());
                if (dAEQbTJ2 > 1000000.0d) {
                    iKWHzl2 = C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI);
                } else if (dAEQbTJ2 > 100000.0d) {
                    iKWHzl2 = C25382ivf.KWHzl(C52761wXj.Activity.RAQtXZ);
                } else {
                    iKWHzl2 = C25382ivf.KWHzl(C52761wXj.Activity.DCUTEIddSDPG);
                }
            }
            textView4.setTextColor(iKWHzl2);
            ConstraintLayout root = c23462hyg.getRoot();
            root.setOnClickListener(new TaskDescription(root, 1000L, jor, jnx));
        }

        public static final void EZpvd(C23462hyg c23462hyg, jNX jnx, android.view.View view) {
            int i = C23274hvD.Fragment.ComponentActivity22;
            android.content.Context context = c23462hyg.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            hSW.copyAddress$default(i, context, jnx.AhwBna(), null, null, 24, null);
        }
    }

    @Override // androidx.recyclerview.widget.ListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return super.getItemCount() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == 0) {
            C23456hya c23456hyaAEQbTJ = C23456hya.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c23456hyaAEQbTJ, "");
            return new Application(this, c23456hyaAEQbTJ);
        }
        if (i == 1) {
            C23462hyg c23462hygEZpvd = C23462hyg.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c23462hygEZpvd, "");
            return new StateListAnimator(this, c23462hygEZpvd);
        }
        throw new java.lang.IllegalArgumentException("Unknown view type: " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof Application) {
            ((Application) viewHolder).OLrzqt();
        } else if (viewHolder instanceof StateListAnimator) {
            jNX item = getItem(i - 1);
            Intrinsics.copydefault(item);
            ((StateListAnimator) viewHolder).copydefault(item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(list, "");
        super.onBindViewHolder(viewHolder, i, list);
    }

    public static /* synthetic */ void setHeader$default(jOR jor, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        jor.KWHzl((java.util.List<C26047jPz>) list, z);
    }

    public final void KWHzl(@NotNull java.util.List<C26047jPz> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        this.valueOf = z;
        notifyItemChanged(0);
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return java.lang.String.valueOf(C33129mqd.AEQbTJ(str) * ((double) 100));
    }

    public final java.lang.String AEQbTJ(boolean z, java.lang.String str) {
        java.lang.String strKWHzl = KWHzl(str);
        if (z) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultRegistryCallbackAndContract);
        }
        return C59443zhD.AuCTel(str) == null ? "--" : C23311hvo.formatPercentWithoutSymbol$default(strKWHzl, false, 0, new BigDecimal(0.01d), true, null, 19, null);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return C59443zhD.AuCTel(str) == null ? "--" : C23311hvo.formatPercentWithoutSymbol$default(KWHzl(str), false, 0, new BigDecimal(0.01d), true, null, 19, null);
    }

    public final int copydefault(java.lang.String str) {
        double dAEQbTJ = C33129mqd.AEQbTJ(KWHzl(str));
        if (dAEQbTJ >= 10.0d) {
            return C25382ivf.KWHzl(C52761wXj.ActionBar.OuxcSI);
        }
        if (dAEQbTJ > 1.0d) {
            return C25382ivf.KWHzl(C52761wXj.Activity.gdmIOq);
        }
        return C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI);
    }

    public static final class ActionBar extends DiffUtil.ItemCallback<jNX> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jOR.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.Object getChangePayload(@NotNull jNX jnx, @NotNull jNX jnx2) {
            Intrinsics.checkNotNullParameter(jnx, "");
            Intrinsics.checkNotNullParameter(jnx2, "");
            return null;
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull jNX jnx, @NotNull jNX jnx2) {
            Intrinsics.checkNotNullParameter(jnx, "");
            Intrinsics.checkNotNullParameter(jnx2, "");
            return Intrinsics.EZpvd((java.lang.Object) jnx.AhwBna(), (java.lang.Object) jnx2.AhwBna());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull jNX jnx, @NotNull jNX jnx2) {
            Intrinsics.checkNotNullParameter(jnx, "");
            Intrinsics.checkNotNullParameter(jnx2, "");
            return Intrinsics.EZpvd(jnx, jnx2);
        }
    }
}
