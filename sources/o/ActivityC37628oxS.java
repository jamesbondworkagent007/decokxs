package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.sticker.model.ListItem;
import com.okinc.im.imui.sticker.model.SettingsAction;
import com.okinc.im.imui.sticker.model.StickerModel;
import com.okinc.im.imui.sticker.view.StickerSettingsActivity$observeData$1;
import com.okinc.im.imui.sticker.view.StickerSettingsActivity$observeData$2;
import com.okinc.im.imui.sticker.view.StickerSettingsActivity$observeData$3;
import com.okinc.im.imui.sticker.view.StickerSettingsActivity$observeData$4;
import com.okinc.im.imui.sticker.view.StickerSettingsActivity$observeData$5;
import com.okinc.im.imui.sticker.view.StickerSettingsActivity$observeData$6;
import com.okinc.im.imui.sticker.view.StickerSettingsActivity$observeData$7;
import com.okinc.im.imui.sticker.viewmodel.StickerSettingsViewModel;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import o.C32113mPz;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC37628oxS extends AbstractActivityC37613oxD<nIX> {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm values;
    public final int gEmmrt = C35399nuc.Dialog.ORxRYg;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.oxQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37628oxS.valueOf();
        }
    });
    public final ItemTouchHelper AhwBna = new ItemTouchHelper(new C37618oxI(isConnected()));
    public final PendingIntent AYXKKw = new PendingIntent();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
    }

    public static final void gEmmrt() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.gEmmrt;
    }

    public ActivityC37628oxS() {
        final Function0 function0 = null;
        this.values = new ViewModelLazy(C56524yIo.AEQbTJ(StickerSettingsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.sticker.view.StickerSettingsActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.sticker.view.StickerSettingsActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.sticker.view.StickerSettingsActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public final StickerSettingsViewModel fetchVPNInfo() {
        return (StickerSettingsViewModel) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C37623oxN isConnected() {
        return (C37623oxN) this.djBIcL.getValue();
    }

    public static final C37623oxN valueOf() {
        return new C37623oxN(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: o.oxS$PendingIntent */
    public static final class PendingIntent extends RecyclerView.OnScrollListener {
        public PendingIntent() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            if (((GridLayoutManager) layoutManager).findLastVisibleItemPosition() >= r2.getItemCount() - 26) {
                ActivityC37628oxS.this.fetchVPNInfo().copydefault();
            }
        }
    }

    @Override // o.AbstractActivityC37613oxD, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(C32113mPz.Activity.KWHzl, C52761wXj.Application.fetchVPNInfo);
        DbNXlk();
        AkhnZx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final RecyclerView DbNXlk() {
        nIX nix = (nIX) KWHzl();
        android.widget.ImageView imageView = nix.EZpvd;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
        isConnected().registerAdapterDataObserver(new Application());
        C52794wYp c52794wYp = nix.AEQbTJ;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        C33546myW c33546myW = nix.KWHzl;
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.oxU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC37628oxS.EZpvd(interfaceC57934yrl);
            }
        });
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.oxX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC37628oxS.KWHzl(this.EZpvd, interfaceC57934yrl);
            }
        });
        RecyclerView recyclerView = nix.copydefault;
        isConnected().EZpvd(SettingsAction.RemoveStickers);
        recyclerView.setAdapter(isConnected());
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ActionBar(nix, this));
        recyclerView.addOnScrollListener(this.AYXKKw);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        return recyclerView;
    }

    /* JADX INFO: renamed from: o.oxS$Application */
    public static final class Application extends RecyclerView.AdapterDataObserver {
        public Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            java.lang.Object obj;
            StickerModel stickerModelOLrzqt;
            java.util.List<ListItem> currentList = ActivityC37628oxS.this.isConnected().getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "");
            java.util.Iterator<T> it = currentList.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                ListItem listItem = (ListItem) next;
                ListItem.StickerItem stickerItem = listItem instanceof ListItem.StickerItem ? (ListItem.StickerItem) listItem : null;
                if (stickerItem != null && (stickerModelOLrzqt = stickerItem.OLrzqt()) != null && stickerModelOLrzqt.copydefault()) {
                    obj = next;
                    break;
                }
            }
            ((nIX) ActivityC37628oxS.this.KWHzl()).AEQbTJ.setEnabled(obj != null);
        }
    }

    public static final void KWHzl(ActivityC37628oxS activityC37628oxS, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        activityC37628oxS.fetchVPNInfo().copydefault();
    }

    /* JADX INFO: renamed from: o.oxS$ActionBar */
    public static final class ActionBar implements ViewTreeObserver.OnGlobalLayoutListener {
        public int KWHzl;
        public final /* synthetic */ ActivityC37628oxS OLrzqt;
        public final /* synthetic */ nIX copydefault;

        public ActionBar(nIX nix, ActivityC37628oxS activityC37628oxS) {
            this.copydefault = nix;
            this.OLrzqt = activityC37628oxS;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int width = this.copydefault.copydefault.getWidth();
            if (width != this.KWHzl) {
                this.KWHzl = width;
                C37623oxN c37623oxNIsConnected = this.OLrzqt.isConnected();
                ActivityC37628oxS activityC37628oxS = this.OLrzqt;
                RecyclerView recyclerView = this.copydefault.copydefault;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                c37623oxNIsConnected.KWHzl(activityC37628oxS, recyclerView, this.KWHzl);
            }
        }
    }

    private final void AkhnZx() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StickerSettingsActivity$observeData$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StickerSettingsActivity$observeData$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StickerSettingsActivity$observeData$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StickerSettingsActivity$observeData$4(this, null), 3, null);
        FlowKt.launchIn(FlowKt.onEach(fetchVPNInfo().KWHzl(), new StickerSettingsActivity$observeData$5(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(fetchVPNInfo().AEQbTJ(), new StickerSettingsActivity$observeData$6(null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(fetchVPNInfo().djBIcL(), new StickerSettingsActivity$observeData$7(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC37613oxD, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.AhwBna.attachToRecyclerView(null);
        ((nIX) KWHzl()).copydefault.getViewTreeObserver().removeOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.oxR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ActivityC37628oxS.gEmmrt();
            }
        });
        ((nIX) KWHzl()).copydefault.removeOnScrollListener(this.AYXKKw);
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(C52761wXj.Application.fetchVPNInfo, C32113mPz.Activity.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.oxS$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC37628oxS copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC37628oxS activityC37628oxS) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = activityC37628oxS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                java.util.List<ListItem> currentList = this.copydefault.isConnected().getCurrentList();
                Intrinsics.checkNotNullExpressionValue(currentList, "");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : currentList) {
                    if (obj instanceof ListItem.StickerItem) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayList) {
                    if (((ListItem.StickerItem) obj2).OLrzqt().copydefault()) {
                        arrayList2.add(obj2);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((ListItem.StickerItem) it.next()).OLrzqt().KWHzl());
                }
                this.copydefault.fetchVPNInfo().OLrzqt(CollectionsKt___CollectionsKt.OqFWZa(arrayList3));
            }
        }
    }

    /* JADX INFO: renamed from: o.oxS$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ActivityC37628oxS AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC37628oxS activityC37628oxS) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = activityC37628oxS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.oxS$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oxS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC37628oxS.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_STICKER_ID", str)));
            return intent;
        }
    }

    @Override // o.AbstractActivityC37613oxD, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37613oxD, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC37613oxD, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC37613oxD, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
