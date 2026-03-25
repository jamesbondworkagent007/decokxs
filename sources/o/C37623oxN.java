package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.okinc.im.imui.sticker.model.ListItem;
import com.okinc.im.imui.sticker.model.SettingsAction;
import com.okinc.im.imui.sticker.model.StickerModel;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC37629oxT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C37623oxN extends androidx.recyclerview.widget.ListAdapter<ListItem, AbstractC37629oxT> implements InterfaceC37614oxE {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final Function1<StickerModel, Unit> AEQbTJ;
    public final Function0<Unit> EZpvd;
    public SettingsAction OLrzqt;
    public int copydefault;

    /* JADX INFO: renamed from: o.oxN$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SettingsAction.values().length];
            try {
                iArr[SettingsAction.RemoveStickers.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SettingsAction.Idle.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C37623oxN() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.im.imui.sticker.model.StickerModel, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:31) call: o.oxN.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C37623oxN(Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.im.imui.sticker.model.StickerModel, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37623oxN(Function1<? super StickerModel, Unit> function1, Function0<Unit> function0) {
        super(new C37617oxH());
        this.AEQbTJ = function1;
        this.EZpvd = function0;
        this.OLrzqt = SettingsAction.Idle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).copydefault().getLayoutId();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public AbstractC37629oxT onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
        if (i == ListItem.Type.AddButton.getLayoutId()) {
            C34025nOq c34025nOqOLrzqt = C34025nOq.OLrzqt(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c34025nOqOLrzqt, "");
            return new AbstractC37629oxT.Application(c34025nOqOLrzqt);
        }
        if (i == ListItem.Type.StickerItem.getLayoutId()) {
            C34034nOz c34034nOzCopydefault = C34034nOz.copydefault(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c34034nOzCopydefault, "");
            return new AbstractC37629oxT.ActionBar(c34034nOzCopydefault);
        }
        C34025nOq c34025nOqOLrzqt2 = C34025nOq.OLrzqt(layoutInflaterFrom, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c34025nOqOLrzqt2, "");
        return new AbstractC37629oxT.Application(c34025nOqOLrzqt2);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC37629oxT abstractC37629oxT, final int i) {
        Intrinsics.checkNotNullParameter(abstractC37629oxT, "");
        if (abstractC37629oxT instanceof AbstractC37629oxT.Application) {
            AbstractC37629oxT.Application application = (AbstractC37629oxT.Application) abstractC37629oxT;
            ConstraintLayout root = application.AEQbTJ().getRoot();
            ViewGroup.LayoutParams layoutParams = application.AEQbTJ().getRoot().getLayoutParams();
            Intrinsics.checkNotNullExpressionValue(layoutParams, "");
            root.setLayoutParams(EZpvd(layoutParams));
            root.setOnClickListener(new Application(root, 1000L, this));
            Intrinsics.copydefault(root);
            return;
        }
        if (!(abstractC37629oxT instanceof AbstractC37629oxT.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        ListItem item = getItem(i);
        Intrinsics.copydefault(item, "");
        final ListItem.StickerItem stickerItem = (ListItem.StickerItem) item;
        AbstractC37629oxT.ActionBar actionBar = (AbstractC37629oxT.ActionBar) abstractC37629oxT;
        C34034nOz c34034nOzEZpvd = actionBar.EZpvd();
        ConstraintLayout root2 = c34034nOzEZpvd.getRoot();
        ViewGroup.LayoutParams layoutParams2 = actionBar.EZpvd().getRoot().getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams2, "");
        root2.setLayoutParams(EZpvd(layoutParams2));
        LottieAnimationView lottieAnimationView = c34034nOzEZpvd.KWHzl;
        android.content.Context context = lottieAnimationView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        lottieAnimationView.setAnimationFromUrl(C7827arF.EZpvd("lottie/im/sticker_placeholder.lottie", context, true));
        c34034nOzEZpvd.KWHzl.setVisibility(0);
        Glide.AEQbTJ(c34034nOzEZpvd.AEQbTJ.getContext()).EZpvd(stickerItem.OLrzqt().OLrzqt()).OLrzqt((RY<android.graphics.drawable.Drawable>) new StateListAnimator(c34034nOzEZpvd)).EZpvd(actionBar.EZpvd().AEQbTJ);
        c34034nOzEZpvd.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.oxP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C37623oxN.KWHzl(this.OLrzqt, stickerItem, i, view);
            }
        });
        int i2 = TaskDescription.KWHzl[this.OLrzqt.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            android.widget.CheckBox checkBox = actionBar.EZpvd().copydefault;
            Intrinsics.checkNotNullExpressionValue(checkBox, "");
            checkBox.setVisibility(8);
            return;
        }
        android.widget.CheckBox checkBox2 = actionBar.EZpvd().copydefault;
        Intrinsics.copydefault(checkBox2);
        checkBox2.setVisibility(0);
        checkBox2.setClickable(false);
        checkBox2.setChecked(stickerItem.OLrzqt().copydefault());
        Intrinsics.copydefault(checkBox2);
    }

    /* JADX INFO: renamed from: o.oxN$StateListAnimator */
    public static final class StateListAnimator implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ C34034nOz copydefault;

        public StateListAnimator(C34034nOz c34034nOz) {
            this.copydefault = c34034nOz;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            this.copydefault.KWHzl.setVisibility(8);
            this.copydefault.AEQbTJ.setVisibility(0);
            return false;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            this.copydefault.KWHzl.setVisibility(0);
            this.copydefault.AEQbTJ.setVisibility(8);
            return false;
        }
    }

    public static final void KWHzl(C37623oxN c37623oxN, ListItem.StickerItem stickerItem, int i, android.view.View view) {
        if (c37623oxN.OLrzqt == SettingsAction.RemoveStickers) {
            boolean z = !stickerItem.OLrzqt().copydefault();
            c37623oxN.copydefault(i, StickerModel.copy$default(stickerItem.OLrzqt(), null, null, z, 3, null));
            c37623oxN.notifyItemChanged(i, new C37611oxB(z));
        }
        Function1<StickerModel, Unit> function1 = c37623oxN.AEQbTJ;
        if (function1 != null) {
            function1.invoke(stickerItem.OLrzqt());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC37629oxT abstractC37629oxT, int i, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(abstractC37629oxT, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(abstractC37629oxT, i, list);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof C37611oxB) {
                arrayList.add(obj);
            }
        }
        C37611oxB c37611oxB = (C37611oxB) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (!(abstractC37629oxT instanceof AbstractC37629oxT.ActionBar) || c37611oxB == null) {
            return;
        }
        ((AbstractC37629oxT.ActionBar) abstractC37629oxT).EZpvd().copydefault.setChecked(c37611oxB.KWHzl());
    }

    public final ViewGroup.LayoutParams EZpvd(ViewGroup.LayoutParams layoutParams) {
        int i = this.copydefault;
        layoutParams.width = i;
        layoutParams.height = i;
        return layoutParams;
    }

    public final void EZpvd(@NotNull SettingsAction settingsAction) {
        Intrinsics.checkNotNullParameter(settingsAction, "");
        this.OLrzqt = settingsAction;
        notifyDataSetChanged();
    }

    public final void copydefault(int i, StickerModel stickerModel) {
        java.util.List<ListItem> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        if (i < 0 || i >= currentList.size()) {
            return;
        }
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) currentList);
        listFJNWhG.set(i, new ListItem.StickerItem(stickerModel));
        submitList(listFJNWhG);
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        int iCopydefault = C55298xhM.copydefault(8.0f, context);
        int iCopydefault2 = C55298xhM.copydefault(75.0f, context);
        int i2 = i / iCopydefault2;
        int i3 = i2 - 1;
        int i4 = (i - (iCopydefault2 * i2)) / i3;
        if (i4 < iCopydefault) {
            i4 = (i - (iCopydefault2 * i3)) / (i2 - 2);
            i2 = i3;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(context, i2));
        while (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.removeItemDecorationAt(0);
        }
        recyclerView.addItemDecoration(C33047mpA.KWHzl(i2, i4, C55298xhM.copydefault(12.0f, context), false));
        this.copydefault = iCopydefault2;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.oxN$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C37623oxN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C37623oxN c37623oxN) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c37623oxN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.copydefault.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    @Override // o.InterfaceC37614oxE
    public boolean OLrzqt(int i, int i2) {
        if (i >= getCurrentList().size()) {
            return false;
        }
        Collections.swap(getCurrentList(), i, i2);
        notifyItemMoved(i, i2);
        return true;
    }

    /* JADX INFO: renamed from: o.oxN$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oxN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
