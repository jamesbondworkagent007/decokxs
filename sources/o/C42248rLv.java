package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaListAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaListItem;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C42248rLv;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rLv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42248rLv extends android.widget.FrameLayout {
    public final AbstractC43891rxo AEQbTJ;
    public ViewStatus EZpvd;
    public final C42519rVw KWHzl;
    public final C43316rmw copydefault;

    /* JADX INFO: renamed from: o.rLv$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42248rLv(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42248rLv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.EZpvd = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:38) call: o.rLv.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42248rLv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42248rLv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = ViewStatus.Form;
        this.copydefault = new C43316rmw();
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.flVtFt, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC43891rxo) viewDataBindingInflate;
        this.KWHzl = new C42519rVw(context, attributeSet, i);
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final CtaListAppModel ctaListAppModel = uIComponentAppModel instanceof CtaListAppModel ? (CtaListAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                final rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (ctaListAppModel != null ? ctaListAppModel.getId() : null))) {
                    java.lang.String value = ctaListAppModel != null ? ctaListAppModel.getValue() : null;
                    if (!java.lang.Boolean.valueOf(true ^ (value == null || value.length() == 0)).booleanValue()) {
                        value = null;
                    }
                    rax.setValue(value);
                    rgl.gasjUx().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.rLA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42248rLv.AEQbTJ(ctaListAppModel, this, rax, (C42156rIk) obj);
                        }
                    }));
                    this.copydefault.register(CtaListItem.class, new Activity(this, abstractC42074rFj, lifecycleOwner));
                }
            }
            return;
        }
        if (!(abstractC42074rFj instanceof C42179rJg)) {
            if (abstractC42074rFj instanceof rIM) {
                java.util.Iterator<T> it2 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) (ctaListAppModel != null ? ctaListAppModel.getId() : null))) {
                        rax2.setValue(null);
                    }
                }
                return;
            }
            return;
        }
        java.util.Iterator<T> it3 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
        while (it3.hasNext()) {
            rAX rax3 = (rAX) it3.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) (ctaListAppModel != null ? ctaListAppModel.getId() : null))) {
                rax3.setValue(null);
            }
        }
    }

    public static final Unit AEQbTJ(CtaListAppModel ctaListAppModel, C42248rLv c42248rLv, rAX rax, C42156rIk c42156rIk) {
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), ctaListAppModel != null ? ctaListAppModel.getId() : null) && c42248rLv.getVisibility() != 0) {
                c42248rLv.setVisibility(0);
                rax.EZpvd((ctaListAppModel == null || (required = ctaListAppModel.getRequired()) == null) ? false : required.booleanValue());
                if (ctaListAppModel != null) {
                    ctaListAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), ctaListAppModel != null ? ctaListAppModel.getId() : null) && c42248rLv.getVisibility() == 0) {
                c42248rLv.setVisibility(8);
                rax.EZpvd(false);
                if (ctaListAppModel != null) {
                    ctaListAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        c42248rLv.setVisibility((ctaListAppModel != null ? Intrinsics.EZpvd(ctaListAppModel.isHidden(), java.lang.Boolean.TRUE) : false) ^ true ? 0 : 8);
        return Unit.INSTANCE;
    }

    public void copydefault(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.EZpvd, uIComponentAppModel.getBottomMargin()));
        CtaListAppModel ctaListAppModel = uIComponentAppModel instanceof CtaListAppModel ? (CtaListAppModel) uIComponentAppModel : null;
        if (ctaListAppModel != null) {
            C31695mAm c31695mAm = this.AEQbTJ.KWHzl;
            c31695mAm.setLayoutManager(C33047mpA.KWHzl(c31695mAm.getContext()));
            android.content.Context context3 = c31695mAm.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c31695mAm.addItemDecoration(new C42517rVu(context3));
            c31695mAm.setAdapter(this.copydefault);
            OLrzqt(ctaListAppModel.getItems());
        }
    }

    public final void OLrzqt(java.util.ArrayList<CtaListItem> arrayList) {
        this.copydefault.setItems(arrayList);
        this.copydefault.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.rLv$Activity */
    public final class Activity extends AbstractC43310rmq<CtaListItem, AbstractC43894rxr> {
        public boolean EZpvd;
        public final AbstractC42074rFj KWHzl;
        public final LifecycleOwner OLrzqt;
        public final /* synthetic */ C42248rLv copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC42074rFj EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.gGvvIC;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        public Activity(@NotNull C42248rLv c42248rLv, AbstractC42074rFj abstractC42074rFj, LifecycleOwner lifecycleOwner) {
            Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
            this.copydefault = c42248rLv;
            this.KWHzl = abstractC42074rFj;
            this.OLrzqt = lifecycleOwner;
            this.EZpvd = true;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43894rxr> c43312rms, @NotNull CtaListItem ctaListItem) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(ctaListItem, "");
            super.onBindViewHolder((C43312rms) c43312rms, ctaListItem);
            AbstractC43894rxr abstractC43894rxr = (AbstractC43894rxr) c43312rms.OLrzqt();
            abstractC43894rxr.OLrzqt.setContentDescription("cta_list_view_" + c43312rms.getLayoutPosition());
            android.widget.TextView textView = abstractC43894rxr.AhwBna;
            java.lang.String title = ctaListItem.getTitle();
            textView.setText(title != null ? title : "");
            if (ctaListItem.isConfidential()) {
                Intrinsics.copydefault(abstractC43894rxr);
                OLrzqt(abstractC43894rxr, ctaListItem);
            } else {
                Intrinsics.copydefault(abstractC43894rxr);
                copydefault(abstractC43894rxr, ctaListItem);
            }
        }

        public static /* synthetic */ java.lang.String maskString$default(Activity activity, java.lang.String str, char c, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                c = '*';
            }
            return activity.EZpvd(str, c);
        }

        public final java.lang.String EZpvd(java.lang.String str, char c) {
            return C59449zhJ.copydefault(java.lang.String.valueOf(c), str.length());
        }

        public final void OLrzqt(final AbstractC43894rxr abstractC43894rxr, final CtaListItem ctaListItem) {
            android.widget.ImageView imageView = abstractC43894rxr.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            android.widget.TextView textView = abstractC43894rxr.KWHzl;
            java.lang.String content = ctaListItem.getContent();
            if (content == null) {
                content = "";
            }
            textView.setText(maskString$default(this, content, (char) 0, 2, null));
            abstractC43894rxr.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.rLB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C42248rLv.Activity.OLrzqt(this.copydefault, abstractC43894rxr, ctaListItem, view);
                }
            });
            if (ctaListItem.getCta() != null) {
                android.widget.ImageView imageView2 = abstractC43894rxr.copydefault;
                Intrinsics.copydefault(imageView2);
                imageView2.setVisibility(0);
                imageView2.setOnClickListener(new TaskDescription(imageView2, 1000L, this, ctaListItem));
                android.widget.LinearLayout linearLayout = abstractC43894rxr.AEQbTJ;
                linearLayout.setOnClickListener(new Application(linearLayout, 1000L, this, ctaListItem));
                return;
            }
            android.widget.ImageView imageView3 = abstractC43894rxr.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
        }

        public static final void OLrzqt(Activity activity, AbstractC43894rxr abstractC43894rxr, CtaListItem ctaListItem, android.view.View view) {
            activity.AEQbTJ(abstractC43894rxr, ctaListItem);
        }

        /* JADX INFO: renamed from: o.rLv$Activity$StateListAnimator */
        public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ CtaListItem EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(CtaListItem ctaListItem) {
                this.EZpvd = ctaListItem;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                AEQbTJ(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                java.lang.String eventTrackingName = this.EZpvd.getEventTrackingName();
                EventParamsList.put$default(eventParamsList, "field_name", eventTrackingName == null ? "" : eventTrackingName, false, 4, null);
            }
        }

        /* JADX INFO: renamed from: o.rLv$Activity$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ Activity AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ CtaListItem copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, Activity activity, CtaListItem ctaListItem) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.AEQbTJ = activity;
                this.copydefault = ctaListItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.AEQbTJ.EZpvd().AYXKKw().setValue(new C43734ruq<>(new kotlin.Pair(this.copydefault.getCta(), new DialogInformation(null, false, null, 7, null))));
                    C32866mlf.onEvent$default("KycEditPersonalInfo_Field_Edit_Click", (TrackChannel[]) null, new FragmentManager(this.copydefault), 1, (java.lang.Object) null);
                }
            }
        }

        /* JADX INFO: renamed from: o.rLv$Activity$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ Activity AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ CtaListItem copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, Activity activity, CtaListItem ctaListItem) {
                this.EZpvd = view;
                this.OLrzqt = j;
                this.AEQbTJ = activity;
                this.copydefault = ctaListItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.AEQbTJ.EZpvd().AYXKKw().setValue(new C43734ruq<>(new kotlin.Pair(this.copydefault.getCta(), new DialogInformation(null, false, null, 7, null))));
                    C32866mlf.onEvent$default("KycEditPersonalInfo_Field_Edit_Click", (TrackChannel[]) null, new C0929Activity(this.copydefault), 1, (java.lang.Object) null);
                }
            }
        }

        /* JADX INFO: renamed from: o.rLv$Activity$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ CtaListItem EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ Activity OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, Activity activity, CtaListItem ctaListItem) {
                this.copydefault = view;
                this.KWHzl = j;
                this.OLrzqt = activity;
                this.EZpvd = ctaListItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.OLrzqt.EZpvd().AYXKKw().setValue(new C43734ruq<>(new kotlin.Pair(this.EZpvd.getCta(), new DialogInformation(null, false, null, 7, null))));
                    C32866mlf.onEvent$default("KycEditPersonalInfo_Field_Edit_Click", (TrackChannel[]) null, new StateListAnimator(this.EZpvd), 1, (java.lang.Object) null);
                }
            }
        }

        /* JADX INFO: renamed from: o.rLv$Activity$Activity, reason: collision with other inner class name */
        public static final class C0929Activity implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ CtaListItem AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C0929Activity(CtaListItem ctaListItem) {
                this.AEQbTJ = ctaListItem;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                OLrzqt(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void OLrzqt(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                java.lang.String eventTrackingName = this.AEQbTJ.getEventTrackingName();
                EventParamsList.put$default(eventParamsList, "field_name", eventTrackingName == null ? "" : eventTrackingName, false, 4, null);
            }
        }

        public final void AEQbTJ(AbstractC43894rxr abstractC43894rxr, CtaListItem ctaListItem) {
            abstractC43894rxr.EZpvd.setImageDrawable(ContextCompat.getDrawable(this.copydefault.getContext(), this.EZpvd ? C52761wXj.TaskDescription.ODCBUN : C52761wXj.TaskDescription.invokespecialgBtXYZ));
            android.widget.TextView textView = abstractC43894rxr.KWHzl;
            boolean z = this.EZpvd;
            java.lang.String content = ctaListItem.getContent();
            if (!z) {
                if (content == null) {
                    content = "";
                }
                content = maskString$default(this, content, (char) 0, 2, null);
            } else if (content == null) {
                content = "";
            }
            textView.setText(content);
            this.EZpvd = !this.EZpvd;
        }

        public final void copydefault(AbstractC43894rxr abstractC43894rxr, CtaListItem ctaListItem) {
            android.widget.ImageView imageView = abstractC43894rxr.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            android.widget.TextView textView = abstractC43894rxr.KWHzl;
            textView.setTextColor(rQR.AEQbTJ.AEQbTJ(ctaListItem.getContentColor(), this.copydefault.KWHzl));
            java.lang.String content = ctaListItem.getContent();
            if (content == null) {
                content = "";
            }
            textView.setText(content);
            if (ctaListItem.getCta() != null) {
                android.widget.ImageView imageView2 = abstractC43894rxr.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(0);
                LinearLayoutCompat linearLayoutCompat = abstractC43894rxr.OLrzqt;
                linearLayoutCompat.setOnClickListener(new ActionBar(linearLayoutCompat, 1000L, this, ctaListItem));
                return;
            }
            android.widget.ImageView imageView3 = abstractC43894rxr.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
        }

        /* JADX INFO: renamed from: o.rLv$Activity$FragmentManager */
        public static final class FragmentManager implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ CtaListItem EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public FragmentManager(CtaListItem ctaListItem) {
                this.EZpvd = ctaListItem;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                EZpvd(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void EZpvd(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                java.lang.String eventTrackingName = this.EZpvd.getEventTrackingName();
                EventParamsList.put$default(eventParamsList, "field_name", eventTrackingName == null ? "" : eventTrackingName, false, 4, null);
            }
        }
    }
}
