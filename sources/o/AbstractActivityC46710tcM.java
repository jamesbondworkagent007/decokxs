package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.multitype.selection.Selectable;
import com.okinc.okmarket.ui.market.edit.IEditFavoriteCoinPairsActivity$onCreate$2;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.Collections;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC46710tcM;
import o.C32113mPz;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tcM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractActivityC46710tcM extends AbstractActivityC33041mov {
    public final InterfaceC56387yDm AYXKKw;
    public boolean AhwBna;
    public ViewOnClickListenerC54939xaY AkhnZx;
    public ActionBar DbNXlk;
    public final Application EZpvd;
    public qZG OLrzqt;
    public final TaskDescription copydefault;
    public C46709tcL djBIcL;
    public ItemTouchHelper gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final C59534zip valueOf;
    public java.util.List<C46708tcK> values;

    /* JADX INFO: renamed from: o.tcM$FragmentManager */
    public static final class FragmentManager extends DefaultItemAnimator {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public long getAddDuration() {
            return 50L;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public long getMoveDuration() {
            return 120L;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public long getRemoveDuration() {
            return 50L;
        }
    }

    public abstract java.lang.String AEQbTJ();

    public abstract void EZpvd(@NotNull java.util.List<C46708tcK> list, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2);

    public abstract boolean EZpvd();

    public AbstractActivityC46710tcM() {
        Application application = new Application(this, new java.util.ArrayList(), new java.util.ArrayList());
        this.EZpvd = application;
        C59534zip c59534zip = new C59534zip(application.KWHzl());
        this.valueOf = c59534zip;
        this.values = new java.util.ArrayList(0);
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.tcP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractActivityC46710tcM.fetchVPNInfo(this.OLrzqt);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.tcT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(AbstractActivityC46710tcM.values(this.KWHzl));
            }
        });
        this.DbNXlk = new ActionBar(c59534zip, Selectable.Mode.Multiple);
        this.copydefault = new TaskDescription();
    }

    public final java.lang.String KWHzl() {
        java.lang.String stringExtra = getIntent().getStringExtra("exclude_ids");
        return stringExtra == null ? "" : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayoutManager valueOf() {
        return (LinearLayoutManager) this.isConnected.getValue();
    }

    public static final LinearLayoutManager fetchVPNInfo(AbstractActivityC46710tcM abstractActivityC46710tcM) {
        return new LinearLayoutManager(abstractActivityC46710tcM, 1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float OLrzqt() {
        return ((java.lang.Number) this.AYXKKw.getValue()).floatValue();
    }

    public static final float values(AbstractActivityC46710tcM abstractActivityC46710tcM) {
        return C33052mpF.copydefault(32, (android.content.Context) abstractActivityC46710tcM);
    }

    /* JADX INFO: renamed from: o.tcM$ActionBar */
    public static final class ActionBar extends C43317rmx<RecyclerView.ViewHolder> {
        @Override // o.C43317rmx, com.okinc.multitype.selection.Selectable
        public boolean KWHzl(int i) {
            return true;
        }

        public ActionBar(C59534zip c59534zip, Selectable.Mode mode) {
            super(c59534zip, mode);
        }
    }

    /* JADX INFO: renamed from: o.tcM$TaskDescription */
    public static final class TaskDescription extends RecyclerView.AdapterDataObserver {
        public TaskDescription() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            if (i == 0) {
                int iFindFirstVisibleItemPosition = AbstractActivityC46710tcM.this.valueOf().findFirstVisibleItemPosition();
                AbstractActivityC46710tcM.this.valueOf().findLastVisibleItemPosition();
                if (iFindFirstVisibleItemPosition == 0) {
                    AbstractActivityC46710tcM.this.valueOf().scrollToPosition(0);
                } else if (AbstractActivityC46710tcM.this.valueOf().findLastVisibleItemPosition() < AbstractActivityC46710tcM.this.valueOf().getItemCount() - 1) {
                    AbstractActivityC46710tcM.this.valueOf().scrollToPosition(java.lang.Math.max(iFindFirstVisibleItemPosition, 0));
                }
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        qZG qzgEZpvd = qZG.EZpvd(android.view.LayoutInflater.from(this));
        Intrinsics.checkNotNullExpressionValue(qzgEZpvd, "");
        setContentView(qzgEZpvd.getRoot());
        this.OLrzqt = qzgEZpvd;
        isConnected();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new IEditFavoriteCoinPairsActivity$onCreate$2(this, null), 3, null);
    }

    public static final boolean KWHzl(AbstractActivityC46710tcM abstractActivityC46710tcM, WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        return !abstractActivityC46710tcM.KWHzl().equals(watchListData.getInstType());
    }

    public final Function1<WatchListData, java.lang.Boolean> copydefault() {
        return new Function1() { // from class: o.tcS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(AbstractActivityC46710tcM.KWHzl(this.KWHzl, (WatchListData) obj));
            }
        };
    }

    private final void isConnected() {
        qZG qzg = this.OLrzqt;
        qZG qzg2 = null;
        if (qzg == null) {
            Intrinsics.gEmmrt("");
            qzg = null;
        }
        setSupportActionBar(qzg.AkhnZx);
        qZG qzg3 = this.OLrzqt;
        if (qzg3 == null) {
            Intrinsics.gEmmrt("");
            qzg3 = null;
        }
        androidx.appcompat.widget.Toolbar toolbar = qzg3.AkhnZx;
        toolbar.setPadding(0, C33570myu.AEQbTJ((android.content.Context) this), 0, 0);
        ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "");
        layoutParams.height = C33570myu.AEQbTJ(toolbar.getContext()) + C33570myu.valueOf(toolbar.getContext());
        toolbar.setLayoutParams(layoutParams);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        androidx.appcompat.app.ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setDisplayShowHomeEnabled(false);
        }
        androidx.appcompat.app.ActionBar supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.setTitle("");
        }
        qZG qzg4 = this.OLrzqt;
        if (qzg4 == null) {
            Intrinsics.gEmmrt("");
            qzg4 = null;
        }
        qzg4.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.tcX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractActivityC46710tcM.EZpvd(this.AEQbTJ, view);
            }
        });
        qZG qzg5 = this.OLrzqt;
        if (qzg5 == null) {
            Intrinsics.gEmmrt("");
            qzg5 = null;
        }
        qzg5.valueOf.setLayoutManager(valueOf());
        qZG qzg6 = this.OLrzqt;
        if (qzg6 == null) {
            Intrinsics.gEmmrt("");
            qzg6 = null;
        }
        qzg6.valueOf.setHasFixedSize(true);
        qZG qzg7 = this.OLrzqt;
        if (qzg7 == null) {
            Intrinsics.gEmmrt("");
            qzg7 = null;
        }
        qzg7.valueOf.setItemAnimator(new FragmentManager());
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new StateListAnimator());
        this.gEmmrt = itemTouchHelper;
        qZG qzg8 = this.OLrzqt;
        if (qzg8 == null) {
            Intrinsics.gEmmrt("");
            qzg8 = null;
        }
        itemTouchHelper.attachToRecyclerView(qzg8.valueOf);
        qZG qzg9 = this.OLrzqt;
        if (qzg9 == null) {
            Intrinsics.gEmmrt("");
            qzg9 = null;
        }
        qzg9.values.setText(getString(qZH.PendingIntent.QfsBiF));
        qZG qzg10 = this.OLrzqt;
        if (qzg10 == null) {
            Intrinsics.gEmmrt("");
            qzg10 = null;
        }
        qzg10.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.tcN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractActivityC46710tcM.OLrzqt(this.OLrzqt, view);
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o.tcV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractActivityC46710tcM.AYXKKw(this.copydefault, view);
            }
        };
        qZG qzg11 = this.OLrzqt;
        if (qzg11 == null) {
            Intrinsics.gEmmrt("");
            qzg11 = null;
        }
        qzg11.KWHzl.setOnClickListener(onClickListener);
        qZG qzg12 = this.OLrzqt;
        if (qzg12 == null) {
            Intrinsics.gEmmrt("");
            qzg12 = null;
        }
        qzg12.OLrzqt.setOnClickListener(onClickListener);
        qZG qzg13 = this.OLrzqt;
        if (qzg13 == null) {
            Intrinsics.gEmmrt("");
        } else {
            qzg2 = qzg13;
        }
        qzg2.EZpvd.setOnClickListener(onClickListener);
    }

    public static final void EZpvd(AbstractActivityC46710tcM abstractActivityC46710tcM, android.view.View view) {
        abstractActivityC46710tcM.AYXKKw();
    }

    public static final void OLrzqt(AbstractActivityC46710tcM abstractActivityC46710tcM, android.view.View view) {
        abstractActivityC46710tcM.gEmmrt();
    }

    public static final void AYXKKw(AbstractActivityC46710tcM abstractActivityC46710tcM, android.view.View view) {
        if (abstractActivityC46710tcM.DbNXlk.copydefault() == abstractActivityC46710tcM.DbNXlk.getItemCount()) {
            abstractActivityC46710tcM.DbNXlk.AEQbTJ();
        } else {
            abstractActivityC46710tcM.DbNXlk.EZpvd();
        }
        abstractActivityC46710tcM.OLrzqt(abstractActivityC46710tcM.DbNXlk.copydefault(), abstractActivityC46710tcM.DbNXlk.getItemCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(java.util.List<C46708tcK> list) {
        this.values.clear();
        this.values.addAll(list);
        this.EZpvd.OLrzqt(this.values);
        this.valueOf.notifyDataSetChanged();
        qZG qzg = this.OLrzqt;
        if (qzg == null) {
            Intrinsics.gEmmrt("");
            qzg = null;
        }
        if (qzg.valueOf.getAdapter() == null) {
            this.valueOf.register(C46708tcK.class, new Activity(new Function0() { // from class: o.tcU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(AbstractActivityC46710tcM.DbNXlk(this.copydefault));
                }
            }));
            qZG qzg2 = this.OLrzqt;
            if (qzg2 == null) {
                Intrinsics.gEmmrt("");
                qzg2 = null;
            }
            qzg2.valueOf.setAdapter(this.DbNXlk);
            this.valueOf.registerAdapterDataObserver(this.copydefault);
        }
        OLrzqt(this.DbNXlk.copydefault(), this.DbNXlk.getItemCount());
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final int DbNXlk(AbstractActivityC46710tcM abstractActivityC46710tcM) {
        android.view.View viewFindViewById = abstractActivityC46710tcM.findViewById(qZH.StateListAnimator.OeZisf);
        if (viewFindViewById != null) {
            return viewFindViewById.getWidth() - C33052mpF.EZpvd(24.0f, (android.content.Context) abstractActivityC46710tcM);
        }
        return C33052mpF.EZpvd(16.0f, (android.content.Context) abstractActivityC46710tcM);
    }

    public final void gEmmrt() {
        if (this.DbNXlk.copydefault() > 0) {
            final java.util.List<C46708tcK> listAEQbTJ = AEQbTJ(new java.util.HashSet(this.DbNXlk.KWHzl()));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(this.EZpvd.OLrzqt());
            arrayList.removeAll(listAEQbTJ);
            EZpvd(arrayList, new Function2() { // from class: o.tcR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return AbstractActivityC46710tcM.copydefault(this.EZpvd, listAEQbTJ, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                }
            });
        }
    }

    public static final Unit copydefault(AbstractActivityC46710tcM abstractActivityC46710tcM, java.util.List list, boolean z, java.lang.String str) {
        if (z) {
            abstractActivityC46710tcM.DbNXlk.AEQbTJ();
            abstractActivityC46710tcM.EZpvd.EZpvd(list);
            abstractActivityC46710tcM.valueOf.notifyDataSetChanged();
            abstractActivityC46710tcM.OLrzqt(abstractActivityC46710tcM.DbNXlk.copydefault(), abstractActivityC46710tcM.DbNXlk.getItemCount());
            if (abstractActivityC46710tcM.DbNXlk.getItemCount() == 0) {
                abstractActivityC46710tcM.finish();
            }
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            C33134mqi.AEQbTJ(str);
        } else {
            C33134mqi.copydefault(qZH.PendingIntent.dHguZz);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(int i, int i2) {
        qZG qzg = this.OLrzqt;
        qZG qzg2 = null;
        if (qzg == null) {
            Intrinsics.gEmmrt("");
            qzg = null;
        }
        qzg.AEQbTJ.setEnabled(i > 0);
        qZG qzg3 = this.OLrzqt;
        if (qzg3 == null) {
            Intrinsics.gEmmrt("");
            qzg3 = null;
        }
        qzg3.KWHzl.setChecked(i >= i2);
        qZG qzg4 = this.OLrzqt;
        if (qzg4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            qzg2 = qzg4;
        }
        qzg2.AEQbTJ.setText(C33069mpW.KWHzl(this, qZH.PendingIntent.QbewEr, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("count", java.lang.String.valueOf(i)))));
    }

    public final void copydefault(int i, int i2) {
        java.util.HashSet hashSet = new java.util.HashSet(this.DbNXlk.KWHzl());
        java.util.List<C46708tcK> listAEQbTJ = AEQbTJ(hashSet);
        int i3 = 0;
        if (hashSet.size() > 0) {
            this.DbNXlk.OLrzqt(false);
            this.DbNXlk.AEQbTJ();
        }
        this.EZpvd.EZpvd(i, i2);
        this.valueOf.notifyItemMoved(i, i2);
        for (java.lang.Object obj : listAEQbTJ) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            int iIndexOf = this.EZpvd.KWHzl().indexOf((C46708tcK) obj);
            if (iIndexOf >= 0) {
                this.DbNXlk.AEQbTJ(iIndexOf, true);
            }
            i3++;
        }
        if (hashSet.size() > 0) {
            this.DbNXlk.OLrzqt(true);
            this.DbNXlk.notifyDataSetChanged();
        }
    }

    public final void OLrzqt(int i) {
        int iFindFirstVisibleItemPosition = valueOf().findFirstVisibleItemPosition();
        java.util.HashSet hashSet = new java.util.HashSet(this.DbNXlk.KWHzl());
        java.util.List<C46708tcK> listAEQbTJ = AEQbTJ(hashSet);
        int i2 = 0;
        if (hashSet.size() > 0) {
            this.DbNXlk.OLrzqt(false);
            this.DbNXlk.AEQbTJ();
        }
        C46708tcK c46708tcKRemove = this.EZpvd.KWHzl().remove(i);
        this.valueOf.notifyItemRemoved(i);
        this.EZpvd.KWHzl().add(0, c46708tcKRemove);
        this.EZpvd.AEQbTJ();
        this.valueOf.notifyItemInserted(0);
        for (java.lang.Object obj : listAEQbTJ) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            int iIndexOf = this.EZpvd.KWHzl().indexOf((C46708tcK) obj);
            if (iIndexOf >= 0) {
                this.DbNXlk.AEQbTJ(iIndexOf, true);
            }
            i2++;
        }
        if (hashSet.size() > 0) {
            this.DbNXlk.OLrzqt(true);
            this.DbNXlk.notifyDataSetChanged();
        }
        C43296rmc.EZpvd("edit", "updateSetTopPosition() firstVisiblePosition:" + iFindFirstVisibleItemPosition);
    }

    public final java.util.List<C46708tcK> AEQbTJ(java.util.Set<java.lang.Integer> set) {
        java.util.ArrayList arrayList = new java.util.ArrayList(set.size());
        int i = 0;
        for (java.lang.Object obj : this.EZpvd.KWHzl()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C46708tcK c46708tcK = (C46708tcK) obj;
            if (set.contains(java.lang.Integer.valueOf(i))) {
                arrayList.add(c46708tcK);
            }
            i++;
        }
        return arrayList;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public boolean onOptionsItemSelected(@NotNull android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() == qZH.StateListAnimator.OxbLUn) {
            AYXKKw();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void AYXKKw() {
        values();
        C32866mlf.onEvent$default("EditFavorites_Top_Complete_Click", (TrackChannel[]) null, new Function1() { // from class: o.tcZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC46710tcM.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final boolean AhwBna() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.values);
        boolean zRetainAll = arrayList.retainAll(CollectionsKt___CollectionsKt.OqFWZa(this.EZpvd.OLrzqt()));
        boolean z = !Intrinsics.EZpvd(arrayList, this.EZpvd.OLrzqt());
        C43296rmc.EZpvd("market", "hadReorderList() hadRemoved:" + zRetainAll + "  hadReorder:" + z);
        return z;
    }

    private final void values() {
        if (this.EZpvd.OLrzqt().size() > 0 && AhwBna()) {
            EZpvd(this.EZpvd.OLrzqt(), new Function2() { // from class: o.tcQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return AbstractActivityC46710tcM.AEQbTJ(this.EZpvd, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                }
            });
        } else {
            C43296rmc.EZpvd("market", "performSaveAction() no items or same list not changed");
            finish();
        }
    }

    public static final Unit AEQbTJ(AbstractActivityC46710tcM abstractActivityC46710tcM, boolean z, java.lang.String str) {
        if (z) {
            abstractActivityC46710tcM.finish();
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            C33134mqi.AEQbTJ(str);
        } else {
            C33134mqi.copydefault(qZH.PendingIntent.dHguZz);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(boolean z, java.lang.String str) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tcM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void performUpdateActionWithServer$default(AbstractActivityC46710tcM abstractActivityC46710tcM, java.util.List list, Function2 function2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performUpdateActionWithServer");
        }
        if ((i & 2) != 0) {
            function2 = new Function2() { // from class: o.tcY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return AbstractActivityC46710tcM.KWHzl(((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3);
                }
            };
        }
        abstractActivityC46710tcM.EZpvd((java.util.List<C46708tcK>) list, (Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>) function2);
    }

    public final void djBIcL() {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.AkhnZx;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
            this.AkhnZx = null;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(this);
        this.AkhnZx = viewOnClickListenerC54939xaY2;
        viewOnClickListenerC54939xaY2.setTitle(getString(qZH.PendingIntent.aKErDB));
        java.lang.String string = getString(qZH.PendingIntent.QUSxYX);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY2.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.tda
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractActivityC46710tcM.EZpvd(viewOnClickListenerC54939xaY2, this, view);
            }
        });
        java.lang.String string2 = getString(qZH.PendingIntent.wlaJM);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY2.AEQbTJ(string2, new View.OnClickListener() { // from class: o.tcW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractActivityC46710tcM.KWHzl(viewOnClickListenerC54939xaY2, this, view);
            }
        });
        viewOnClickListenerC54939xaY2.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, AbstractActivityC46710tcM abstractActivityC46710tcM, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        abstractActivityC46710tcM.values();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, AbstractActivityC46710tcM abstractActivityC46710tcM, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        abstractActivityC46710tcM.finish();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.EZpvd.OLrzqt().size() > 0 && AhwBna()) {
            djBIcL();
        } else {
            super.onBackPressed();
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.valueOf.hasObservers()) {
            try {
                this.valueOf.unregisterAdapterDataObserver(this.copydefault);
            } catch (java.lang.Exception e) {
                android.util.Log.getStackTraceString(e);
            }
        }
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.AkhnZx;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
            this.AkhnZx = null;
        }
    }

    /* JADX INFO: renamed from: o.tcM$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final class StateListAnimator extends ItemTouchHelper.SimpleCallback {
        public int AEQbTJ;
        public C46708tcK KWHzl;
        public int OLrzqt;

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isItemViewSwipeEnabled() {
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
            super(3, 0);
            this.OLrzqt = -1;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(viewHolder2, "");
            AbstractActivityC46710tcM.this.copydefault(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onChildDraw(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            float fMax;
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
            android.view.View view = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            if (z) {
                ViewCompat.setElevation(view, AbstractActivityC46710tcM.this.OLrzqt());
            }
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            float top = viewHolder.itemView.getTop();
            float f3 = paddingTop;
            float height = recyclerView.getHeight();
            float f4 = paddingBottom;
            float bottom = viewHolder.itemView.getBottom();
            if (f2 >= 0.0f) {
                fMax = java.lang.Math.min((height - f4) - bottom, f2);
            } else {
                fMax = java.lang.Math.max(-(top - f3), f2);
            }
            view.setTranslationY(fMax);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            java.lang.Object objM7377constructorimpl;
            java.lang.Object objM7377constructorimpl2;
            if (i == 2 && this.AEQbTJ == 0) {
                AbstractActivityC46710tcM abstractActivityC46710tcM = AbstractActivityC46710tcM.this;
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Integer.valueOf(viewHolder != null ? abstractActivityC46710tcM.EZpvd.OLrzqt().indexOf(abstractActivityC46710tcM.EZpvd.KWHzl().get(viewHolder.getBindingAdapterPosition())) : -1));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = -1;
                }
                this.OLrzqt = ((java.lang.Number) objM7377constructorimpl).intValue();
                AbstractActivityC46710tcM abstractActivityC46710tcM2 = AbstractActivityC46710tcM.this;
                try {
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(viewHolder != null ? abstractActivityC46710tcM2.EZpvd.KWHzl().get(viewHolder.getBindingAdapterPosition()) : null);
                } catch (java.lang.Throwable th2) {
                    Result.Application application4 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
                this.KWHzl = (C46708tcK) (Result.m7383isFailureimpl(objM7377constructorimpl2) ? null : objM7377constructorimpl2);
            } else if (i == 0 && this.AEQbTJ == 2) {
                final int iCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends C46708tcK>) ((java.util.List<? extends java.lang.Object>) AbstractActivityC46710tcM.this.EZpvd.OLrzqt()), this.KWHzl);
                if (iCopydefault > -1 && (i2 = this.OLrzqt) > -1 && i2 != iCopydefault && this.KWHzl != null) {
                    C32866mlf.onEvent$default("EditFavorites_TokenList_Drag_Click", (TrackChannel[]) null, new Function1() { // from class: o.tdh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return AbstractActivityC46710tcM.StateListAnimator.KWHzl(this.copydefault, iCopydefault, (EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                }
            }
            this.AEQbTJ = i;
            super.onSelectedChanged(viewHolder, i);
        }

        public static final Unit KWHzl(StateListAnimator stateListAnimator, int i, EventParamsList eventParamsList) {
            java.lang.String instId;
            BizInstrument bizInstrumentEZpvd;
            java.lang.String instType;
            java.lang.String strAEQbTJ;
            BizInstrument bizInstrumentEZpvd2;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            C46708tcK c46708tcK = stateListAnimator.KWHzl;
            if (c46708tcK == null || (bizInstrumentEZpvd2 = c46708tcK.EZpvd()) == null || (instId = bizInstrumentEZpvd2.getInstId()) == null) {
                instId = "";
            }
            eventParamsList.put("token_pair", instId, false);
            C46708tcK c46708tcK2 = stateListAnimator.KWHzl;
            if (c46708tcK2 != null && (bizInstrumentEZpvd = c46708tcK2.EZpvd()) != null && (instType = bizInstrumentEZpvd.getInstType()) != null && (strAEQbTJ = qTA.AEQbTJ(instType)) != null) {
                str = strAEQbTJ;
            }
            eventParamsList.put("biz_type", str, true);
            eventParamsList.put("from_position", C33129mqd.gEmmrt(java.lang.Integer.valueOf(stateListAnimator.OLrzqt)), false);
            eventParamsList.put("to_position", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)), true);
            return Unit.INSTANCE;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            super.clearView(recyclerView, viewHolder);
            ViewCompat.setElevation(viewHolder.itemView, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(android.view.View view, boolean z) {
        if (view != null) {
            view.setElevation(z ? OLrzqt() : 0.0f);
        }
    }

    /* JADX INFO: renamed from: o.tcM$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public final class Activity extends kLX<C46708tcK, C42676ras> {
        public final InterfaceC56387yDm EZpvd;
        public final Function0<java.lang.Integer> copydefault;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.kLV, java.lang.Object] */
        @Override // o.kLX
        /* JADX INFO: renamed from: EZpvd */
        public /* synthetic */ void onBindViewHolder(kLV klv, C46708tcK c46708tcK) {
            onBindViewHolder((kLV<C42676ras>) klv, c46708tcK);
        }

        public Activity(Function0<java.lang.Integer> function0) {
            this.copydefault = function0;
            this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.tdd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractActivityC46710tcM.Activity.KWHzl(abstractActivityC46710tcM);
                }
            });
        }

        public final android.text.style.TextAppearanceSpan AEQbTJ() {
            return (android.text.style.TextAppearanceSpan) this.EZpvd.getValue();
        }

        public static final android.text.style.TextAppearanceSpan KWHzl(AbstractActivityC46710tcM abstractActivityC46710tcM) {
            return new android.text.style.TextAppearanceSpan(abstractActivityC46710tcM, C32113mPz.Dialog.QOLQEE);
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.kLX, o.AbstractC59533zio
        /* JADX INFO: renamed from: AhwBna */
        public kLV<C42676ras> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return super.onCreateViewHolder(layoutInflater, viewGroup);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
        @Override // o.kLX
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public C42676ras copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C42676ras c42676rasAEQbTJ = C42676ras.AEQbTJ(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c42676rasAEQbTJ, "");
            return c42676rasAEQbTJ;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.kLX, o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull final kLV<C42676ras> klv, @NotNull final C46708tcK c46708tcK) {
            Intrinsics.checkNotNullParameter(klv, "");
            Intrinsics.checkNotNullParameter(c46708tcK, "");
            AbstractActivityC46710tcM abstractActivityC46710tcM = AbstractActivityC46710tcM.this;
            abstractActivityC46710tcM.EZpvd(klv.itemView, abstractActivityC46710tcM.AhwBna);
            super.onBindViewHolder(klv, c46708tcK);
            ((C42676ras) klv.EZpvd()).EZpvd.setChecked(AbstractActivityC46710tcM.this.DbNXlk.OLrzqt(klv.getAdapterPosition()));
            android.view.View view = klv.itemView;
            final AbstractActivityC46710tcM abstractActivityC46710tcM2 = AbstractActivityC46710tcM.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.tde
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    AbstractActivityC46710tcM.Activity.EZpvd(klv, abstractActivityC46710tcM2, view2);
                }
            });
            android.widget.ImageView imageView = ((C42676ras) klv.EZpvd()).AEQbTJ;
            final AbstractActivityC46710tcM abstractActivityC46710tcM3 = AbstractActivityC46710tcM.this;
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: o.tdc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                    return AbstractActivityC46710tcM.Activity.EZpvd(abstractActivityC46710tcM3, klv, view2, motionEvent);
                }
            });
            android.widget.ImageView imageView2 = ((C42676ras) klv.EZpvd()).copydefault;
            final AbstractActivityC46710tcM abstractActivityC46710tcM4 = AbstractActivityC46710tcM.this;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.tdb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    AbstractActivityC46710tcM.Activity.OLrzqt(abstractActivityC46710tcM4, c46708tcK, klv, view2);
                }
            });
            ((C42676ras) klv.EZpvd()).valueOf.setText(c46708tcK.copydefault(AEQbTJ()));
        }

        public static final void EZpvd(kLV klv, AbstractActivityC46710tcM abstractActivityC46710tcM, android.view.View view) {
            int adapterPosition = klv.getAdapterPosition();
            if (adapterPosition >= 0) {
                abstractActivityC46710tcM.DbNXlk.AEQbTJ(adapterPosition);
                abstractActivityC46710tcM.OLrzqt(abstractActivityC46710tcM.DbNXlk.copydefault(), abstractActivityC46710tcM.valueOf.getItemCount());
            }
        }

        public static final boolean EZpvd(AbstractActivityC46710tcM abstractActivityC46710tcM, kLV klv, android.view.View view, android.view.MotionEvent motionEvent) {
            if (motionEvent == null || motionEvent.getAction() != 0) {
                return false;
            }
            ItemTouchHelper itemTouchHelper = abstractActivityC46710tcM.gEmmrt;
            if (itemTouchHelper == null) {
                Intrinsics.gEmmrt("");
                itemTouchHelper = null;
            }
            itemTouchHelper.startDrag(klv);
            return false;
        }

        public static final void OLrzqt(AbstractActivityC46710tcM abstractActivityC46710tcM, final C46708tcK c46708tcK, kLV klv, android.view.View view) {
            int iIndexOf = abstractActivityC46710tcM.EZpvd.OLrzqt().indexOf(c46708tcK);
            int adapterPosition = klv.getAdapterPosition();
            if (adapterPosition > 0) {
                abstractActivityC46710tcM.OLrzqt(adapterPosition);
            }
            final java.lang.String strValueOf = java.lang.String.valueOf(iIndexOf);
            C32866mlf.onEvent$default("EditFavorites_TokenList_Top_Click", (TrackChannel[]) null, new Function1() { // from class: o.tdf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractActivityC46710tcM.Activity.EZpvd(c46708tcK, strValueOf, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }

        public static final Unit EZpvd(C46708tcK c46708tcK, java.lang.String str, EventParamsList eventParamsList) {
            java.lang.String instId;
            java.lang.String instType;
            java.lang.String strAEQbTJ;
            BizInstrument bizInstrumentEZpvd;
            java.lang.String str2 = "";
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            if (c46708tcK == null || (bizInstrumentEZpvd = c46708tcK.EZpvd()) == null || (instId = bizInstrumentEZpvd.getInstId()) == null) {
                instId = "";
            }
            eventParamsList.put("token_pair", instId, false);
            BizInstrument bizInstrumentEZpvd2 = c46708tcK.EZpvd();
            if (bizInstrumentEZpvd2 != null && (instType = bizInstrumentEZpvd2.getInstType()) != null && (strAEQbTJ = qTA.AEQbTJ(instType)) != null) {
                str2 = strAEQbTJ;
            }
            eventParamsList.put("biz_type", str2, true);
            eventParamsList.put("from_position", str, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.tcM$Application */
    public final class Application {
        public final java.util.List<C46708tcK> AEQbTJ;
        public final java.util.List<C46708tcK> OLrzqt;
        public final /* synthetic */ AbstractActivityC46710tcM copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C46708tcK> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C46708tcK> OLrzqt() {
            return this.OLrzqt;
        }

        public Application(@NotNull AbstractActivityC46710tcM abstractActivityC46710tcM, @NotNull java.util.List<C46708tcK> list, java.util.List<C46708tcK> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.copydefault = abstractActivityC46710tcM;
            this.AEQbTJ = list;
            this.OLrzqt = list2;
        }

        public final void OLrzqt(@NotNull java.util.List<C46708tcK> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ.clear();
            this.OLrzqt.clear();
            if (this.copydefault.EZpvd()) {
                java.lang.String strAEQbTJ = this.copydefault.AEQbTJ();
                java.util.List<C46708tcK> list2 = this.AEQbTJ;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (Intrinsics.EZpvd((java.lang.Object) qWJ.AEQbTJ(((C46708tcK) obj).EZpvd()), (java.lang.Object) strAEQbTJ)) {
                        arrayList.add(obj);
                    }
                }
                list2.addAll(arrayList);
            } else {
                this.AEQbTJ.addAll(list);
            }
            this.OLrzqt.addAll(list);
        }

        public final void EZpvd(@NotNull java.util.List<C46708tcK> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ.removeAll(list);
            this.OLrzqt.removeAll(list);
        }

        public final void EZpvd(int i, int i2) {
            Collections.swap(this.AEQbTJ, i, i2);
            if (this.copydefault.EZpvd()) {
                AEQbTJ();
            } else {
                Collections.swap(this.OLrzqt, i, i2);
            }
        }

        public final void AEQbTJ() {
            if (this.OLrzqt.size() < this.AEQbTJ.size() || !this.copydefault.EZpvd()) {
                this.OLrzqt.clear();
                this.OLrzqt.addAll(this.AEQbTJ);
                return;
            }
            if (this.copydefault.EZpvd()) {
                java.lang.String strAEQbTJ = this.copydefault.AEQbTJ();
                java.util.List<C46708tcK> list = this.OLrzqt;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i = 0;
                int i2 = 0;
                for (java.lang.Object obj : list) {
                    if (i2 < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.Integer numValueOf = Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) qWJ.AEQbTJ(((C46708tcK) obj).EZpvd())) ? java.lang.Integer.valueOf(i2) : null;
                    if (numValueOf != null) {
                        arrayList.add(numValueOf);
                    }
                    i2++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                for (java.lang.Object obj2 : this.AEQbTJ) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    C46708tcK c46708tcK = (C46708tcK) obj2;
                    int iIntValue = (i < 0 || i >= this.OLrzqt.size()) ? -1 : ((java.lang.Number) arrayList.get(i)).intValue();
                    if (iIntValue >= 0) {
                        this.OLrzqt.set(iIntValue, c46708tcK);
                    }
                    i++;
                }
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
