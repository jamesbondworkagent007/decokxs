package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.dto.ContractDcaExtendInfo;
import com.okinc.web.WebActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC53802wsP;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53803wsQ extends androidx.recyclerview.widget.ListAdapter<AbstractC53802wsP, RecyclerView.ViewHolder> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final Activity KWHzl = new Activity();
    public final Function1<java.lang.String, Unit> EZpvd;
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C53803wsQ(@NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12) {
        super(KWHzl);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.copydefault = function1;
        this.EZpvd = function12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        AbstractC53802wsP item = getItem(i);
        if (item instanceof AbstractC53802wsP.Application) {
            return 0;
        }
        if (item instanceof AbstractC53802wsP.Activity) {
            return 1;
        }
        if (item instanceof AbstractC53802wsP.StateListAnimator) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            uNW unwEZpvd = uNW.EZpvd(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(unwEZpvd, "");
            return new StateListAnimator(this, unwEZpvd);
        }
        if (i == 1) {
            uNU unuOLrzqt = uNU.OLrzqt(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(unuOLrzqt, "");
            return new Application(this, unuOLrzqt);
        }
        if (i == 2) {
            android.content.Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return new TaskDescription(this, new C55173xeu(context, null, 0, 6, null));
        }
        throw new java.lang.IllegalArgumentException("Unknown view type: " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        AbstractC53802wsP item = getItem(i);
        if (item instanceof AbstractC53802wsP.Application) {
            ((StateListAnimator) viewHolder).EZpvd((AbstractC53802wsP.Application) item);
        } else if (item instanceof AbstractC53802wsP.Activity) {
            ((Application) viewHolder).copydefault((AbstractC53802wsP.Activity) item);
        } else {
            if (!(item instanceof AbstractC53802wsP.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            ((TaskDescription) viewHolder).OLrzqt((AbstractC53802wsP.StateListAnimator) item);
        }
    }

    /* JADX INFO: renamed from: o.wsQ$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final uNW KWHzl;
        public final /* synthetic */ C53803wsQ copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C53803wsQ c53803wsQ, uNW unw) {
            super(unw.getRoot());
            Intrinsics.checkNotNullParameter(unw, "");
            this.copydefault = c53803wsQ;
            this.KWHzl = unw;
        }

        public final void EZpvd(@NotNull AbstractC53802wsP.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            uNW unw = this.KWHzl;
            C53803wsQ c53803wsQ = this.copydefault;
            android.widget.TextView textView = unw.AhwBna;
            textView.setText(application.isConnected());
            textView.setTextColor(application.valueOf());
            textView.setOnClickListener(new Activity(textView, 1000L, application, textView));
            android.widget.TextView textView2 = unw.valueOf;
            Intrinsics.copydefault(textView2);
            textView2.setVisibility((application.copydefault() || !C33129mqd.OLrzqt((java.lang.CharSequence) application.AhwBna())) ? 8 : 0);
            textView2.setText(application.AhwBna());
            C52794wYp c52794wYp = unw.KWHzl;
            Intrinsics.copydefault(c52794wYp);
            c52794wYp.setVisibility(application.copydefault() ? 0 : 8);
            c52794wYp.setOnClickListener(new ViewOnClickListenerC0992StateListAnimator(c52794wYp, 1000L, c53803wsQ, application));
            android.widget.TextView textView3 = unw.values;
            textView3.setText(application.DbNXlk());
            textView3.setTextColor(application.valueOf());
            ContractDcaExtendInfo contractDcaExtendInfoEZpvd = application.EZpvd();
            boolean z = contractDcaExtendInfoEZpvd != null;
            LinearLayoutCompat linearLayoutCompat = unw.isConnected;
            linearLayoutCompat.setOnClickListener(new Application(linearLayoutCompat, 1000L, z, c53803wsQ, application));
            android.widget.ImageView imageView = unw.copydefault;
            Intrinsics.copydefault(imageView);
            imageView.setVisibility(contractDcaExtendInfoEZpvd != null ? 0 : 8);
            imageView.setRotation(application.AkhnZx() ? 180.0f : 0.0f);
            LinearLayoutCompat linearLayoutCompat2 = unw.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            linearLayoutCompat2.setVisibility((z && application.AkhnZx()) ? 0 : 8);
            unw.djBIcL.setText(contractDcaExtendInfoEZpvd != null ? contractDcaExtendInfoEZpvd.OLrzqt() : null);
            unw.gEmmrt.setText(contractDcaExtendInfoEZpvd != null ? contractDcaExtendInfoEZpvd.AEQbTJ() : null);
            unw.EZpvd.setText(contractDcaExtendInfoEZpvd != null ? contractDcaExtendInfoEZpvd.EZpvd() : null);
            unw.AEQbTJ.setText(contractDcaExtendInfoEZpvd != null ? contractDcaExtendInfoEZpvd.copydefault() : null);
        }

        /* JADX INFO: renamed from: o.wsQ$StateListAnimator$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
                this.AEQbTJ = viewOnClickListenerC54939xaY;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.AEQbTJ.dismiss();
            }
        }

        /* JADX INFO: renamed from: o.wsQ$StateListAnimator$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.widget.TextView EZpvd;
            public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.widget.TextView textView, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
                this.EZpvd = textView;
                this.OLrzqt = viewOnClickListenerC54939xaY;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                android.widget.TextView textView = this.EZpvd;
                Intrinsics.copydefault(textView);
                WebActivity.TaskDescription.openPage$default(taskDescription, C35334ntP.KWHzl(textView), BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C48033uCm.Fragment.WS))), null, 4, null);
                this.OLrzqt.dismiss();
            }
        }

        /* JADX INFO: renamed from: o.wsQ$StateListAnimator$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ android.widget.TextView OLrzqt;
            public final /* synthetic */ AbstractC53802wsP.Application copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, AbstractC53802wsP.Application application, android.widget.TextView textView) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.copydefault = application;
                this.OLrzqt = textView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    java.lang.String strGEmmrt = this.copydefault.gEmmrt();
                    if (Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "orderRetry")) {
                        android.content.Context context = this.OLrzqt.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                        viewOnClickListenerC54939xaY.AEQbTJ(C55688xof.Application.RdAHlO, C55688xof.Application.hBpjJd);
                    } else if (Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "orderFail")) {
                        android.content.Context context2 = this.OLrzqt.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context2);
                        viewOnClickListenerC54939xaY.AEQbTJ(C55688xof.Application.QkdxfA, C55688xof.Application.dHguZz);
                    } else {
                        viewOnClickListenerC54939xaY = null;
                    }
                    if (viewOnClickListenerC54939xaY != null) {
                        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new TaskDescription(viewOnClickListenerC54939xaY));
                        viewOnClickListenerC54939xaY.OLrzqt(C55688xof.Application.onScrollChanged, new ActionBar(this.OLrzqt, viewOnClickListenerC54939xaY));
                        viewOnClickListenerC54939xaY.show();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.wsQ$StateListAnimator$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C53803wsQ EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ AbstractC53802wsP.Application OLrzqt;
            public final /* synthetic */ boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, boolean z, C53803wsQ c53803wsQ, AbstractC53802wsP.Application application) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.copydefault = z;
                this.EZpvd = c53803wsQ;
                this.OLrzqt = application;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    if (this.copydefault) {
                        this.EZpvd.copydefault.invoke(this.OLrzqt.isConnected());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.wsQ$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0992StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C53803wsQ KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ AbstractC53802wsP.Application copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0992StateListAnimator(android.view.View view, long j, C53803wsQ c53803wsQ, AbstractC53802wsP.Application application) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.KWHzl = c53803wsQ;
                this.copydefault = application;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.KWHzl.EZpvd.invoke(this.copydefault.AYXKKw());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wsQ$Application */
    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ C53803wsQ AEQbTJ;
        public final uNU EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C53803wsQ c53803wsQ, uNU unu) {
            super(unu.getRoot());
            Intrinsics.checkNotNullParameter(unu, "");
            this.AEQbTJ = c53803wsQ;
            this.EZpvd = unu;
        }

        public final void copydefault(@NotNull AbstractC53802wsP.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            uNU unu = this.EZpvd;
            unu.EZpvd.setBackgroundTintList(android.content.res.ColorStateList.valueOf(activity.AEQbTJ()));
            android.widget.TextView textView = unu.KWHzl;
            textView.setText(activity.copydefault());
            textView.setTextColor(activity.EZpvd());
            android.widget.TextView textView2 = unu.AEQbTJ;
            textView2.setText(activity.AYXKKw());
            textView2.setTextColor(activity.EZpvd());
        }
    }

    /* JADX INFO: renamed from: o.wsQ$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final C55173xeu AEQbTJ;
        public final /* synthetic */ C53803wsQ EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C53803wsQ c53803wsQ, C55173xeu c55173xeu) {
            super(c55173xeu);
            Intrinsics.checkNotNullParameter(c55173xeu, "");
            this.EZpvd = c53803wsQ;
            this.AEQbTJ = c55173xeu;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void OLrzqt(@NotNull AbstractC53802wsP.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            C55173xeu c55173xeu = this.AEQbTJ;
            c55173xeu.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, stateListAnimator.gEmmrt() ? -1 : -2));
            c55173xeu.setTitle(stateListAnimator.AhwBna());
            c55173xeu.setSubTitle((java.lang.CharSequence) stateListAnimator.AYXKKw());
            c55173xeu.setRetry(stateListAnimator.copydefault());
            if (stateListAnimator.AEQbTJ() != 0) {
                c55173xeu.setEmptyTypeImage(stateListAnimator.AEQbTJ());
            } else {
                c55173xeu.setImage(stateListAnimator.KWHzl());
            }
            if (stateListAnimator.djBIcL()) {
                c55173xeu.setGravity(17);
                return;
            }
            c55173xeu.setGravity(49);
            android.widget.ImageView imageViewCopydefault = c55173xeu.copydefault();
            if (stateListAnimator.valueOf() > 0) {
                ViewGroup.LayoutParams layoutParams = imageViewCopydefault.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = C55298xhM.dpInt$default(stateListAnimator.valueOf(), (android.content.Context) null, 1, (java.lang.Object) null);
                imageViewCopydefault.setLayoutParams(marginLayoutParams);
            }
            if (stateListAnimator.EZpvd() > 0) {
                ViewGroup.LayoutParams layoutParams2 = c55173xeu.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.bottomMargin = C55298xhM.dpInt$default(stateListAnimator.EZpvd(), (android.content.Context) null, 1, (java.lang.Object) null);
                    c55173xeu.setLayoutParams(marginLayoutParams2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wsQ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wsQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.wsQ$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<AbstractC53802wsP> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(AbstractC53802wsP abstractC53802wsP, AbstractC53802wsP abstractC53802wsP2) {
            Intrinsics.checkNotNullParameter(abstractC53802wsP, "");
            Intrinsics.checkNotNullParameter(abstractC53802wsP2, "");
            return Intrinsics.EZpvd((java.lang.Object) abstractC53802wsP.OLrzqt(), (java.lang.Object) abstractC53802wsP2.OLrzqt());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(AbstractC53802wsP abstractC53802wsP, AbstractC53802wsP abstractC53802wsP2) {
            Intrinsics.checkNotNullParameter(abstractC53802wsP, "");
            Intrinsics.checkNotNullParameter(abstractC53802wsP2, "");
            return Intrinsics.EZpvd(abstractC53802wsP, abstractC53802wsP2);
        }
    }
}
