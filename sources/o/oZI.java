package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.ui.view.model.ViceInfo;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C35966oKh;
import o.C38985pjk;
import o.C52761wXj;
import o.InterfaceC54581xNr;
import o.oZI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oZI extends RecyclerView.Adapter<Application> {
    public boolean AEQbTJ;
    public int AhwBna;
    public final LinearLayoutManager EZpvd;
    public final Function0<Unit> KWHzl;
    public java.util.List<pWP> OLrzqt;
    public final RecyclerView copydefault;
    public final LinkedHashMap<java.lang.Integer, C38985pjk> djBIcL;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    public static final class Application extends RecyclerView.ViewHolder {
        public final C36057oNr AEQbTJ;
        public final long OLrzqt;
        public final Function0<Unit> copydefault;

        public static final class StateListAnimator implements View.OnLayoutChangeListener {
            public StateListAnimator() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Intrinsics.checkNotNullParameter(view, "");
                view.removeOnLayoutChangeListener(this);
                if (Application.this.AEQbTJ.EZpvd.getPaint().measureText(Application.this.AEQbTJ.EZpvd.getText().toString()) > Application.this.AEQbTJ.EZpvd.getWidth()) {
                    Application.this.AEQbTJ.EZpvd.setTextSize(10.0f);
                    Application.this.AEQbTJ.EZpvd.setMaxLines(2);
                }
            }
        }

        public static final class ActionBar implements Animator.AnimatorListener {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull android.animation.Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull android.animation.Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
            }

            public ActionBar() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull android.animation.Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
                Application.this.AEQbTJ.AEQbTJ.setVisibility(0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C36057oNr c36057oNr, @NotNull Function0<Unit> function0) {
            super(c36057oNr.getRoot());
            Intrinsics.checkNotNullParameter(c36057oNr, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.AEQbTJ = c36057oNr;
            this.copydefault = function0;
            this.OLrzqt = 300L;
        }

        public final void EZpvd(pWP pwp) {
            if (pwp != null) {
                KWHzl(pwp);
            }
            android.view.View view = this.itemView;
            view.setOnClickListener(new ViewOnClickListenerC0905Application(view, 1000L, this));
        }

        public final void AEQbTJ(boolean z) {
            java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(0.0f);
            kotlin.Pair pairOLrzqt = z ? C56390yDp.OLrzqt(fValueOf2, fValueOf) : C56390yDp.OLrzqt(fValueOf, fValueOf2);
            float fFloatValue = ((java.lang.Number) pairOLrzqt.component1()).floatValue();
            float fFloatValue2 = ((java.lang.Number) pairOLrzqt.component2()).floatValue();
            if (!z) {
                this.AEQbTJ.AEQbTJ.setVisibility(8);
                return;
            }
            this.AEQbTJ.AEQbTJ.clearAnimation();
            android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
            valueAnimatorOfFloat.setDuration(this.OLrzqt);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.oZJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    oZI.Application.OLrzqt(this.copydefault, valueAnimator);
                }
            });
            Intrinsics.copydefault(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addListener(new ActionBar());
            valueAnimatorOfFloat.start();
        }

        /* JADX INFO: renamed from: o.oZI$Application$Application, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0905Application implements View.OnClickListener {
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ Application OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0905Application(android.view.View view, long j, Application application) {
                this.KWHzl = view;
                this.copydefault = j;
                this.OLrzqt = application;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    android.widget.ImageView imageView = this.OLrzqt.AEQbTJ.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    if (imageView.getVisibility() == 0) {
                        this.OLrzqt.copydefault.invoke();
                    }
                }
            }
        }

        public static final void OLrzqt(Application application, android.animation.ValueAnimator valueAnimator) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            android.widget.ImageView imageView = application.AEQbTJ.AEQbTJ;
            java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.copydefault(animatedValue, "");
            imageView.setAlpha(((java.lang.Float) animatedValue).floatValue());
        }

        public static /* synthetic */ void setInvisible$default(Application application, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z2 = false;
            }
            application.copydefault(z, z2);
        }

        public final void copydefault(boolean z, boolean z2) {
            if (!z2) {
                android.view.View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.setVisibility(z ? 4 : 0);
                this.itemView.setAlpha(z ? 0.0f : 1.0f);
                return;
            }
            if (z) {
                android.view.View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                AhwBna(view2);
            } else {
                android.view.View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "");
                copydefault(view3);
            }
        }

        public final void AEQbTJ(@NotNull ViceInfo viceInfo) {
            Intrinsics.checkNotNullParameter(viceInfo, "");
            this.AEQbTJ.djBIcL.setTextColor(viceInfo.getRangeColor());
            this.AEQbTJ.valueOf.setTextColor(viceInfo.getPriceColor());
            this.AEQbTJ.djBIcL.setText(viceInfo.getRange());
            this.AEQbTJ.valueOf.setText(viceInfo.getPrice());
        }

        public static /* synthetic */ void updateViceAlpha$default(Application application, float f, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            application.AEQbTJ(f, z);
        }

        public final void AEQbTJ(float f, boolean z) {
            android.view.ViewPropertyAnimator viewPropertyAnimatorAlpha;
            android.view.ViewPropertyAnimator duration;
            if (z) {
                android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = this.AEQbTJ.KWHzl.animate();
                if (viewPropertyAnimatorAnimate == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(this.OLrzqt)) == null) {
                    return;
                }
                duration.start();
                return;
            }
            this.AEQbTJ.KWHzl.setAlpha(f);
        }

        public final void OLrzqt() {
            android.widget.TextView textView = this.AEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            if (!ViewCompat.isLaidOut(textView) || textView.isLayoutRequested()) {
                textView.addOnLayoutChangeListener(new StateListAnimator());
            } else if (this.AEQbTJ.EZpvd.getPaint().measureText(this.AEQbTJ.EZpvd.getText().toString()) > this.AEQbTJ.EZpvd.getWidth()) {
                this.AEQbTJ.EZpvd.setTextSize(10.0f);
                this.AEQbTJ.EZpvd.setMaxLines(2);
            }
        }

        public final void copydefault(final android.view.View view) {
            view.clearAnimation();
            view.animate().alpha(1.0f).setDuration(this.OLrzqt).withStartAction(new java.lang.Runnable() { // from class: o.oZH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    oZI.Application.OLrzqt(view);
                }
            }).start();
            view.invalidate();
        }

        public static final void OLrzqt(android.view.View view) {
            view.setVisibility(0);
        }

        public final void AhwBna(final android.view.View view) {
            view.clearAnimation();
            view.animate().alpha(0.0f).setDuration(this.OLrzqt).withEndAction(new java.lang.Runnable() { // from class: o.oZF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    oZI.Application.EZpvd(view);
                }
            }).start();
            view.invalidate();
        }

        public static final void EZpvd(android.view.View view) {
            view.setVisibility(4);
        }

        public final void EZpvd(boolean z) {
            this.AEQbTJ.AEQbTJ.setSelected(z);
        }

        public final android.view.View EZpvd() {
            android.widget.LinearLayout linearLayout = this.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            return linearLayout;
        }

        public final void KWHzl(pWP pwp) {
            java.lang.String titleByIdAndType$default;
            if (Intrinsics.EZpvd((java.lang.Object) "INDEX", (java.lang.Object) pwp.KWHzl())) {
                titleByIdAndType$default = C48914uef.getTitleByIdAndType$default(C48914uef.EZpvd, pwp.AEQbTJ(), pwp.KWHzl(), false, false, null, false, false, 124, null);
            } else {
                BizInstrument bizInstrumentCopydefault = copydefault(pwp);
                if (bizInstrumentCopydefault != null && bizInstrumentCopydefault.isPreMarketPair()) {
                    titleByIdAndType$default = C48914uef.getPremarketTitle$default(C48914uef.EZpvd, pwp.AEQbTJ(), false, 2, null);
                    if (titleByIdAndType$default == null) {
                        titleByIdAndType$default = "";
                    }
                } else {
                    titleByIdAndType$default = C48914uef.getTitleByIdAndType$default(C48914uef.EZpvd, pwp.AEQbTJ(), pwp.KWHzl(), false, false, null, true, false, 92, null);
                }
            }
            this.AEQbTJ.EZpvd.setText(titleByIdAndType$default);
            this.AEQbTJ.EZpvd.setTextSize(pFS.KWHzl.EZpvd(titleByIdAndType$default.length()));
            EZpvd(copydefault(pwp));
        }

        public final void EZpvd(BizInstrument bizInstrument) {
            if (bizInstrument != null) {
                if (bizInstrument.isPreMarketPair() && Intrinsics.EZpvd((java.lang.Object) "FUTURES", (java.lang.Object) bizInstrument.getInstType())) {
                    this.AEQbTJ.copydefault.setVisibility(0);
                    this.AEQbTJ.copydefault.setText(C35964oKf.Fragment.onStatusChanged);
                } else if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "SWAP")) {
                    this.AEQbTJ.copydefault.setVisibility(0);
                    this.AEQbTJ.copydefault.setText(C33070mpX.AYXKKw(C35966oKh.TaskDescription.KWHzl));
                } else {
                    C48914uef c48914uef = C48914uef.EZpvd;
                    java.lang.String strKWHzl = c48914uef.KWHzl(bizInstrument.getInstId(), bizInstrument.getInstType());
                    if (strKWHzl == null || strKWHzl.length() == 0 || !C55608xnE.EZpvd()) {
                        this.AEQbTJ.copydefault.setVisibility(8);
                    } else {
                        this.AEQbTJ.copydefault.setVisibility(0);
                        this.AEQbTJ.copydefault.setText(c48914uef.KWHzl(bizInstrument.getInstId(), bizInstrument.getInstType()) + "x");
                    }
                }
            }
            int iCopydefault = Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SWAP") ? C33070mpX.copydefault(C52761wXj.Activity.invokespecialhOMIpD) : C33070mpX.copydefault(C52761wXj.Activity.Dmq);
            int iCopydefault2 = Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SWAP") ? C33070mpX.copydefault(C35964oKf.TaskDescription.AEQbTJ) : C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC);
            this.AEQbTJ.copydefault.setTextColor(iCopydefault);
            this.AEQbTJ.copydefault.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iCopydefault2));
            AppCompatTextView appCompatTextView = this.AEQbTJ.AhwBna;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SPOT") ? 0 : 8);
        }

        public final BizInstrument copydefault(pWP pwp) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
            if (interfaceC54581xNrCopydefault != null) {
                return InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, pwp.KWHzl(), pwp.AEQbTJ(), null, null, 12, null);
            }
            return null;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:40) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
  (r2v0 kotlin.jvm.functions.Function0)
  (r3v0 androidx.recyclerview.widget.LinearLayoutManager)
  (r4v0 androidx.recyclerview.widget.RecyclerView)
 A[MD:(java.util.List<o.pWP>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView):void (m)] (LINE:39) call: o.oZI.<init>(java.util.List, kotlin.jvm.functions.Function0, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView):void type: THIS */
    public /* synthetic */ oZI(java.util.List list, Function0 function0, LinearLayoutManager linearLayoutManager, RecyclerView recyclerView, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.ArrayList() : list, function0, linearLayoutManager, recyclerView);
    }

    public oZI(@NotNull java.util.List<pWP> list, @NotNull Function0<Unit> function0, @NotNull LinearLayoutManager linearLayoutManager, @NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(linearLayoutManager, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        this.OLrzqt = list;
        this.KWHzl = function0;
        this.EZpvd = linearLayoutManager;
        this.copydefault = recyclerView;
        this.djBIcL = new LinkedHashMap<java.lang.Integer, C38985pjk>() { // from class: com.okinc.kline.ui.CirculateListAdapter$viewCache$1
            public /* bridge */ boolean containsKey(Integer num) {
                return super.containsKey((Object) num);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (obj instanceof Integer) {
                    return containsKey((Integer) obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof C38985pjk) {
                    return containsValue((C38985pjk) obj);
                }
                return false;
            }

            public /* bridge */ boolean containsValue(C38985pjk c38985pjk) {
                return super.containsValue((Object) c38985pjk);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final Set<Map.Entry<Integer, C38985pjk>> entrySet() {
                return getEntries();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (obj instanceof Integer) {
                    return get((Integer) obj);
                }
                return null;
            }

            public /* bridge */ C38985pjk get(Integer num) {
                return (C38985pjk) super.get((Object) num);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ C38985pjk get(Object obj) {
                if (obj instanceof Integer) {
                    return get((Integer) obj);
                }
                return null;
            }

            public Set<Map.Entry<Integer, C38985pjk>> getEntries() {
                return super.entrySet();
            }

            public Set<Integer> getKeys() {
                return super.keySet();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                return !(obj instanceof Integer) ? obj2 : getOrDefault((Integer) obj, (C38985pjk) obj2);
            }

            public /* bridge */ C38985pjk getOrDefault(Integer num, C38985pjk c38985pjk) {
                return (C38985pjk) super.getOrDefault((Object) num, c38985pjk);
            }

            public final /* bridge */ C38985pjk getOrDefault(Object obj, C38985pjk c38985pjk) {
                return !(obj instanceof Integer) ? c38985pjk : getOrDefault((Integer) obj, c38985pjk);
            }

            public int getSize() {
                return super.size();
            }

            public Collection<C38985pjk> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final Set<Integer> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (obj instanceof Integer) {
                    return remove((Integer) obj);
                }
                return null;
            }

            public /* bridge */ C38985pjk remove(Integer num) {
                return (C38985pjk) super.remove((Object) num);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ C38985pjk remove(Object obj) {
                if (obj instanceof Integer) {
                    return remove((Integer) obj);
                }
                return null;
            }

            public /* bridge */ boolean remove(Integer num, C38985pjk c38985pjk) {
                return super.remove((Object) num, (Object) c38985pjk);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if ((obj instanceof Integer) && (obj2 instanceof C38985pjk)) {
                    return remove((Integer) obj, (C38985pjk) obj2);
                }
                return false;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final Collection<C38985pjk> values() {
                return getValues();
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Integer, C38985pjk> entry) {
                return size() > 8;
            }
        };
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36057oNr c36057oNrKWHzl = C36057oNr.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36057oNrKWHzl, "");
        return new Application(c36057oNrKWHzl, this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        if (this.OLrzqt.isEmpty()) {
            return;
        }
        LinkedHashMap<java.lang.Integer, C38985pjk> linkedHashMap = this.djBIcL;
        android.view.View view = application.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        linkedHashMap.put(java.lang.Integer.valueOf(i), new C38985pjk(view, application));
        application.EZpvd(this.OLrzqt.get(i % this.OLrzqt.size()));
    }

    public final android.view.View EZpvd(int i) {
        C38985pjk c38985pjk = this.djBIcL.get(java.lang.Integer.valueOf(i));
        if (c38985pjk != null) {
            return c38985pjk.copydefault();
        }
        return null;
    }

    public final Application copydefault(int i) {
        C38985pjk c38985pjk = this.djBIcL.get(java.lang.Integer.valueOf(i));
        if (c38985pjk != null) {
            return c38985pjk.KWHzl();
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        super.onViewAttachedToWindow(application);
        if (this.AEQbTJ) {
            Application.setInvisible$default(application, (application.getBindingAdapterPosition() == this.AhwBna || application.getBindingAdapterPosition() == this.AhwBna - 1 || application.getBindingAdapterPosition() == this.AhwBna + 1) ? false : true, false, 2, null);
        } else {
            Application.setInvisible$default(application, application.getAbsoluteAdapterPosition() != this.AhwBna, false, 2, null);
        }
    }

    public final void KWHzl() {
        this.AEQbTJ = true;
        int i = this.AhwBna;
        int i2 = i - 1;
        int i3 = i + 1;
        if (i2 <= i3) {
            while (true) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.copydefault.findViewHolderForAdapterPosition(i2);
                Application application = viewHolderFindViewHolderForAdapterPosition instanceof Application ? (Application) viewHolderFindViewHolderForAdapterPosition : null;
                if (application != null) {
                    application.copydefault(false, true);
                }
                if (application != null) {
                    application.AEQbTJ(false);
                }
                if (i2 == i3) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        int childCount = this.EZpvd.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            int i5 = this.AhwBna;
            if (i4 < i5 - 1 || i4 > i5 + 1) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = this.copydefault.findViewHolderForAdapterPosition(i4);
                Application application2 = viewHolderFindViewHolderForAdapterPosition2 instanceof Application ? (Application) viewHolderFindViewHolderForAdapterPosition2 : null;
                if (application2 != null) {
                    Application.setInvisible$default(application2, true, false, 2, null);
                }
                if (application2 != null) {
                    application2.AEQbTJ(false);
                }
            }
        }
    }

    public static /* synthetic */ void onDragEnd$default(oZI ozi, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        ozi.EZpvd(i, z);
    }

    public final void EZpvd(int i, boolean z) {
        this.AEQbTJ = false;
        this.AhwBna = i;
        RecyclerView.Adapter adapter = this.copydefault.getAdapter();
        Intrinsics.copydefault(adapter, "");
        Application applicationCopydefault = ((oZI) adapter).copydefault(i);
        if (applicationCopydefault != null) {
            Application.setInvisible$default(applicationCopydefault, false, false, 2, null);
            applicationCopydefault.AEQbTJ(true);
        }
        C43296rmc.EZpvd("onDragEnd", "visibleViewHolder: " + applicationCopydefault);
        int i2 = this.AhwBna;
        int childCount = this.EZpvd.getChildCount();
        for (int i3 = i2; i3 < childCount + i2; i3++) {
            if (i3 != i) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.copydefault.findViewHolderForAdapterPosition(i3);
                Application application = viewHolderFindViewHolderForAdapterPosition instanceof Application ? (Application) viewHolderFindViewHolderForAdapterPosition : null;
                if (application != null) {
                    application.copydefault(true, z);
                }
            }
        }
    }

    public final void KWHzl(@NotNull java.util.List<pWP> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            this.OLrzqt = list;
            notifyDataSetChanged();
        }
    }
}
