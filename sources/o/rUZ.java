package o;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.rUZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rUZ extends wXX {
    public C34740niE OLrzqt;
    public final C43316rmw copydefault = new C43316rmw();

    @Override // o.wXX
    public float getHeightScale() {
        return 0.95f;
    }

    public final C34740niE AEQbTJ() {
        C34740niE c34740niE = this.OLrzqt;
        Intrinsics.copydefault(c34740niE);
        return c34740niE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        android.view.Window window;
        android.view.View decorView;
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(decorView, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.rUY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return rUZ.EZpvd(this.AEQbTJ, view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat EZpvd(rUZ ruz, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        ruz.AEQbTJ().KWHzl.setPaddingRelative(0, 0, 0, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom);
        return windowInsetsCompat;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        android.view.Window window;
        android.view.View decorView;
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setOnApplyWindowInsetsListener(null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setType(9);
        c52781wYc.setTitle("Feature restriction mock tool");
        android.widget.ImageView imageViewOLrzqt = c52781wYc.OLrzqt();
        if (imageViewOLrzqt != null) {
            imageViewOLrzqt.setOnClickListener(new ActionBar(imageViewOLrzqt, 1000L, this));
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.OLrzqt = C34740niE.KWHzl(getLayoutInflater(), constraintLayout, false);
        constraintLayout.addView(AEQbTJ().getRoot());
        AEQbTJ().KWHzl.setLayoutManager(C33047mpA.KWHzl(getContext()));
        AEQbTJ().KWHzl.setAdapter(this.copydefault);
        this.copydefault.register(rUM.class, new Activity(new Function2() { // from class: o.rUW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return rUZ.copydefault(this.AEQbTJ, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }));
        this.copydefault.AhwBna(rUO.OLrzqt.djBIcL());
    }

    public static final Unit copydefault(final rUZ ruz, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ instanceof AppCompatActivity) {
            C42497rVa c42497rVaEZpvd = C42497rVa.Companion.EZpvd(str, str2, new Function0() { // from class: o.rUX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return rUZ.EZpvd(this.KWHzl);
                }
            });
            androidx.fragment.app.FragmentManager supportFragmentManager = ((AppCompatActivity) activityAEQbTJ).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c42497rVaEZpvd.show(supportFragmentManager);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(rUZ ruz) {
        ruz.copydefault.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity extends AbstractC59533zio<rUM, StateListAnimator> {
        public final Function2<java.lang.String, java.lang.String, Unit> AEQbTJ;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "");
            this.AEQbTJ = function2;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C34738niC c34738niCAEQbTJ = C34738niC.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c34738niCAEQbTJ, "");
            return new StateListAnimator(c34738niCAEQbTJ, this.AEQbTJ);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull rUM rum) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(rum, "");
            stateListAnimator.KWHzl(rum);
        }

        public static final class StateListAnimator extends RecyclerView.ViewHolder {
            public final C34738niC EZpvd;
            public final Function2<java.lang.String, java.lang.String, Unit> OLrzqt;

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public StateListAnimator(@NotNull C34738niC c34738niC, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
                super(c34738niC.getRoot());
                Intrinsics.checkNotNullParameter(c34738niC, "");
                Intrinsics.checkNotNullParameter(function2, "");
                this.EZpvd = c34738niC;
                this.OLrzqt = function2;
            }

            public final void KWHzl(@NotNull final rUM rum) {
                Intrinsics.checkNotNullParameter(rum, "");
                final boolean zOLrzqt = rUO.OLrzqt.OLrzqt(rum.OLrzqt());
                this.EZpvd.copydefault.setText(rum.OLrzqt());
                this.EZpvd.AEQbTJ.setChecked(zOLrzqt);
                this.EZpvd.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.rVb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        rUZ.Activity.StateListAnimator.EZpvd(zOLrzqt, this, rum, view);
                    }
                });
                android.widget.LinearLayout linearLayout = this.EZpvd.KWHzl;
                linearLayout.setOnClickListener(new Application(linearLayout, 1000L, this, rum));
            }

            public static final void EZpvd(boolean z, StateListAnimator stateListAnimator, rUM rum, android.view.View view) {
                if (!z) {
                    stateListAnimator.EZpvd.AEQbTJ.setChecked(true);
                    rUO.OLrzqt.AEQbTJ(rum.OLrzqt(), true);
                } else {
                    stateListAnimator.EZpvd.AEQbTJ.setChecked(false);
                    rUO.OLrzqt.AEQbTJ(rum.OLrzqt(), false);
                }
            }

            public static final class Application implements View.OnClickListener {
                public final /* synthetic */ android.view.View AEQbTJ;
                public final /* synthetic */ StateListAnimator EZpvd;
                public final /* synthetic */ long KWHzl;
                public final /* synthetic */ rUM copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public Application(android.view.View view, long j, StateListAnimator stateListAnimator, rUM rum) {
                    this.AEQbTJ = view;
                    this.KWHzl = j;
                    this.EZpvd = stateListAnimator;
                    this.copydefault = rum;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                        C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                        this.EZpvd.OLrzqt.invoke(this.copydefault.OLrzqt(), this.copydefault.OLrzqt());
                    }
                }
            }
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ rUZ AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, rUZ ruz) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = ruz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
