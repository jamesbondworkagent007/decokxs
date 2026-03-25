package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.market.home.favorites.MarketFavQuoteFragment;
import com.okinc.business.market.home.favorites.RecommendCoinFragment$initView$4$4;
import com.okinc.business.market.home.favorites.RecommendCoinFragment$initView$5$setupContent$1;
import com.okinc.business.market.home.favorites.RecommendCoinFragment$onVisible$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.market.common.bean.FavoriteRecommendListData;
import com.okinc.market.watch.database.MarketFavDataBase;
import com.okinc.multitype.selection.Selectable;
import com.okinc.unify_trade.biz.subscribe.SettingWatchList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C27831kEy;
import o.C32113mPz;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kEy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27831kEy extends AbstractC27793kDo {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final java.util.ArrayList<FavoriteRecommendListData> AEQbTJ;
    public final C59534zip AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public qZJ EZpvd;
    public boolean OLrzqt;
    public final C43317rmx<RecyclerView.ViewHolder> valueOf;
    public final int KWHzl = qZH.ActionBar.AkhnZx;
    public final kEN isConnected = new kEN();

    /* JADX INFO: renamed from: o.kEy$Application */
    public interface Application {
        java.lang.String fJNWhG();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public C27831kEy() {
        java.util.ArrayList<FavoriteRecommendListData> arrayList = new java.util.ArrayList<>();
        this.AEQbTJ = arrayList;
        C59534zip c59534zip = new C59534zip(arrayList);
        this.AhwBna = c59534zip;
        this.valueOf = new C43317rmx<>(c59534zip, Selectable.Mode.Multiple);
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.kEz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27831kEy.copydefault();
            }
        });
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new RecommendCoinFragment$onVisible$1(this, null), 3, null);
    }

    public final int fetchVPNInfo() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("key_recommend_count", 8);
        }
        return 8;
    }

    public final boolean AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("key_hide_title", false);
        }
        return false;
    }

    public final boolean isConnected() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("key_use_card_style", false);
        }
        return false;
    }

    public final qWN AkhnZx() {
        return (qWN) this.AkhnZx.getValue();
    }

    public static final qWN copydefault() {
        return new qWN(qWO.Companion.copydefault(MarketFavDataBase.Companion.copydefault()));
    }

    /* JADX INFO: renamed from: o.kEy$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kEy.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AbstractC27793kDo, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        this.EZpvd = qZJ.AEQbTJ(view);
        qZJ qzj = null;
        if (AEQbTJ()) {
            qZJ qzj2 = this.EZpvd;
            if (qzj2 == null) {
                Intrinsics.gEmmrt("");
                qzj2 = null;
            }
            AppCompatTextView appCompatTextView = qzj2.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(8);
        }
        if (isConnected()) {
            qZJ qzj3 = this.EZpvd;
            if (qzj3 == null) {
                Intrinsics.gEmmrt("");
                qzj3 = null;
            }
            C52794wYp c52794wYp = qzj3.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            ViewGroup.LayoutParams layoutParams = c52794wYp.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = 0;
                marginLayoutParams.topMargin = C55298xhM.dp2px$default(16.0f, null, 1, null);
                c52794wYp.setLayoutParams(marginLayoutParams);
                qZJ qzj4 = this.EZpvd;
                if (qzj4 == null) {
                    Intrinsics.gEmmrt("");
                    qzj4 = null;
                }
                qzj4.AEQbTJ.setMinimumHeight(C55298xhM.dp2px$default(152.0f, null, 1, null));
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        qZJ qzj5 = this.EZpvd;
        if (qzj5 == null) {
            Intrinsics.gEmmrt("");
            qzj5 = null;
        }
        qzj5.AEQbTJ.setLayoutManager(C33047mpA.copydefault(getContext(), 2));
        android.content.Context context = getContext();
        if (context != null) {
            C48911uec c48911uec = new C48911uec(C55296xhK.OLrzqt(context));
            qZJ qzj6 = this.EZpvd;
            if (qzj6 == null) {
                Intrinsics.gEmmrt("");
                qzj6 = null;
            }
            qzj6.AEQbTJ.addItemDecoration(c48911uec);
        }
        qZJ qzj7 = this.EZpvd;
        if (qzj7 == null) {
            Intrinsics.gEmmrt("");
            qzj7 = null;
        }
        qzj7.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.kEx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C27831kEy.copydefault(this.EZpvd, view2);
            }
        });
        this.isConnected.observe(this, new FragmentManager());
        if (this.OLrzqt) {
            qZJ qzj8 = this.EZpvd;
            if (qzj8 == null) {
                Intrinsics.gEmmrt("");
                qzj8 = null;
            }
            qzj8.gEmmrt.setVisibility(0);
        }
        android.os.Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("isNestedScrollingEnabled") : true;
        qZJ qzj9 = this.EZpvd;
        if (qzj9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            qzj = qzj9;
        }
        qzj.getRoot().setNestedScrollingEnabled(z);
        java.lang.String tag = getTAG();
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("from_page")) != null) {
            str = string;
        }
        pUU.KWHzl(tag, "isNestedScrollingEnabled is " + z + ", fromPage is " + str);
    }

    public static final void copydefault(final C27831kEy c27831kEy, android.view.View view) {
        C56131xwy c56131xwyFetchVPNInfo;
        c27831kEy.showLoading();
        ActivityResultCaller parentFragment = c27831kEy.getParentFragment();
        Application application = parentFragment instanceof Application ? (Application) parentFragment : null;
        final java.lang.String strFJNWhG = application != null ? application.fJNWhG() : null;
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("app_favorites_add_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.kEu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27831kEy.AEQbTJ(strFJNWhG, (EventParamsList) obj);
            }
        });
        if (Intrinsics.EZpvd((java.lang.Object) strFJNWhG, (java.lang.Object) "markets")) {
            C32866mlf.onEvent$default("DiscoverPage_Favorites_AddToFavorites_Click", (TrackChannel[]) null, new Function1() { // from class: o.kEv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27831kEy.OLrzqt(this.OLrzqt, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else {
            C32866mlf.onEvent$default("HomePage_Favorites_AddToFavorites_Click", (TrackChannel[]) null, new Function1() { // from class: o.kEw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27831kEy.copydefault(this.copydefault, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        if (qVD.AEQbTJ.AEQbTJ()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c27831kEy), null, null, new RecommendCoinFragment$initView$4$4(c27831kEy, null), 3, null);
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        if (interfaceC54581xNrCopydefault == null || (c56131xwyFetchVPNInfo = interfaceC54581xNrCopydefault.fetchVPNInfo()) == null) {
            return;
        }
        c56131xwyFetchVPNInfo.EZpvd(c27831kEy.DbNXlk(), c27831kEy.new StateListAnimator());
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str == null) {
            str = "";
        }
        eventParamsList.put("from", str, true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C27831kEy c27831kEy, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "count", java.lang.String.valueOf(c27831kEy.DbNXlk().size()), false, 4, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = c27831kEy.DbNXlk().iterator();
        while (it.hasNext()) {
            arrayList.add(((SettingWatchList) it.next()).getInstId());
        }
        java.lang.String string = arrayList.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        EventParamsList.put$default(eventParamsList, "list", string, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C27831kEy c27831kEy, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "count", java.lang.String.valueOf(c27831kEy.DbNXlk().size()), false, 4, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = c27831kEy.DbNXlk().iterator();
        while (it.hasNext()) {
            arrayList.add(((SettingWatchList) it.next()).getInstId());
        }
        java.lang.String string = arrayList.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        EventParamsList.put$default(eventParamsList, "list", string, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kEy$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC55701xos<Unit> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: androidx.fragment.app.Fragment */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, Unit unit, java.lang.Exception exc) {
            C27831kEy.this.dismissLoading();
            if (z) {
                C33134mqi.AEQbTJ(C33070mpX.AYXKKw(qZH.PendingIntent.DTwDnp));
                androidx.fragment.app.Fragment parentFragment = C27831kEy.this.getParentFragment();
                pWK pwk = parentFragment instanceof pWK ? (pWK) parentFragment : null;
                if (pwk != null) {
                    pwk.getFieldNames();
                    return;
                }
                return;
            }
            C33134mqi.AEQbTJ(exc != null ? exc.getMessage() : null);
        }
    }

    /* JADX INFO: renamed from: o.kEy$FragmentManager */
    public static final class FragmentManager extends AbstractC32943mnC<FavoriteRecommendListData> {
        public FragmentManager() {
            super(null, null, 0, 7, null);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(java.util.List<FavoriteRecommendListData> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(list, "");
            super.AEQbTJ(list, view);
            C27831kEy.this.values();
            C27831kEy c27831kEy = C27831kEy.this;
            c27831kEy.copydefault((java.util.List<FavoriteRecommendListData>) CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, c27831kEy.fetchVPNInfo()));
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C27831kEy.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C27831kEy.this), null, null, new RecommendCoinFragment$initView$5$setupContent$1(C27831kEy.this, null), 3, null);
            androidx.fragment.app.Fragment parentFragment = C27831kEy.this.getParentFragment();
            kIY kiy = parentFragment instanceof kIY ? (kIY) parentFragment : null;
            if (kiy != null) {
                kiy.iwGUEr();
            }
            androidx.fragment.app.Fragment parentFragment2 = C27831kEy.this.getParentFragment();
            kKI kki = parentFragment2 instanceof kKI ? (kKI) parentFragment2 : null;
            if (kki != null) {
                kki.values();
            }
            androidx.fragment.app.Fragment parentFragment3 = C27831kEy.this.getParentFragment();
            C40139qKu c40139qKu = parentFragment3 instanceof C40139qKu ? (C40139qKu) parentFragment3 : null;
            if (c40139qKu != null) {
                c40139qKu.valueOf();
            }
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Throwable;Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        public void KWHzl(java.lang.Throwable th, java.util.List<FavoriteRecommendListData> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(th, "");
            super.KWHzl(th, list, view);
            C27831kEy.this.AuCTel();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C27831kEy.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            androidx.fragment.app.Fragment parentFragment = C27831kEy.this.getParentFragment();
            MarketFavQuoteFragment marketFavQuoteFragment = parentFragment instanceof MarketFavQuoteFragment ? (MarketFavQuoteFragment) parentFragment : null;
            if (marketFavQuoteFragment != null) {
                marketFavQuoteFragment.uzCIH();
            }
            androidx.fragment.app.Fragment parentFragment2 = C27831kEy.this.getParentFragment();
            kIY kiy = parentFragment2 instanceof kIY ? (kIY) parentFragment2 : null;
            if (kiy != null) {
                kiy.iwGUEr();
            }
            androidx.fragment.app.Fragment parentFragment3 = C27831kEy.this.getParentFragment();
            kKI kki = parentFragment3 instanceof kKI ? (kKI) parentFragment3 : null;
            if (kki != null) {
                kki.values();
            }
            androidx.fragment.app.Fragment parentFragment4 = C27831kEy.this.getParentFragment();
            C40139qKu c40139qKu = parentFragment4 instanceof C40139qKu ? (C40139qKu) parentFragment4 : null;
            if (c40139qKu != null) {
                c40139qKu.valueOf();
            }
        }
    }

    public final java.util.ArrayList<SettingWatchList> DbNXlk() {
        int size = this.AEQbTJ.size();
        java.util.ArrayList<SettingWatchList> arrayList = new java.util.ArrayList<>(this.valueOf.copydefault());
        java.util.Set<java.lang.Integer> setKWHzl = this.valueOf.KWHzl();
        Intrinsics.checkNotNullExpressionValue(setKWHzl, "");
        for (java.lang.Integer num : setKWHzl) {
            Intrinsics.copydefault(num);
            int iIntValue = num.intValue();
            if (iIntValue >= 0 && iIntValue < size) {
                FavoriteRecommendListData favoriteRecommendListData = this.AEQbTJ.get(num.intValue());
                Intrinsics.checkNotNullExpressionValue(favoriteRecommendListData, "");
                FavoriteRecommendListData favoriteRecommendListData2 = favoriteRecommendListData;
                arrayList.add(new SettingWatchList("0", favoriteRecommendListData2.getInstId(), favoriteRecommendListData2.getInstType(), null, null, null, null));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AuCTel() {
        qZJ qzj = this.EZpvd;
        qZJ qzj2 = null;
        if (qzj == null) {
            Intrinsics.gEmmrt("");
            qzj = null;
        }
        qzj.AEQbTJ.setVisibility(8);
        qZJ qzj3 = this.EZpvd;
        if (qzj3 == null) {
            Intrinsics.gEmmrt("");
            qzj3 = null;
        }
        qzj3.EZpvd.setVisibility(8);
        qZJ qzj4 = this.EZpvd;
        if (qzj4 == null) {
            Intrinsics.gEmmrt("");
            qzj4 = null;
        }
        qzj4.KWHzl.setVisibility(8);
        qZJ qzj5 = this.EZpvd;
        if (qzj5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            qzj2 = qzj5;
        }
        qzj2.copydefault.setVisibility(0);
    }

    public final void values() {
        qZJ qzj = this.EZpvd;
        qZJ qzj2 = null;
        if (qzj == null) {
            Intrinsics.gEmmrt("");
            qzj = null;
        }
        qzj.AEQbTJ.setVisibility(0);
        qZJ qzj3 = this.EZpvd;
        if (qzj3 == null) {
            Intrinsics.gEmmrt("");
            qzj3 = null;
        }
        qzj3.EZpvd.setVisibility(0);
        qZJ qzj4 = this.EZpvd;
        if (qzj4 == null) {
            Intrinsics.gEmmrt("");
            qzj4 = null;
        }
        qzj4.KWHzl.setVisibility(0);
        qZJ qzj5 = this.EZpvd;
        if (qzj5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            qzj2 = qzj5;
        }
        qzj2.copydefault.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.util.List<FavoriteRecommendListData> list) {
        this.AEQbTJ.clear();
        this.AEQbTJ.addAll(list);
        this.AhwBna.setItems(this.AEQbTJ);
        this.AhwBna.notifyDataSetChanged();
        qZJ qzj = this.EZpvd;
        qZJ qzj2 = null;
        if (qzj == null) {
            Intrinsics.gEmmrt("");
            qzj = null;
        }
        if (qzj.AEQbTJ.getAdapter() == null) {
            if (isConnected()) {
                this.AhwBna.register(FavoriteRecommendListData.class, new Activity());
            } else {
                this.AhwBna.register(FavoriteRecommendListData.class, new TaskDescription());
            }
            qZJ qzj3 = this.EZpvd;
            if (qzj3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                qzj2 = qzj3;
            }
            qzj2.AEQbTJ.setAdapter(this.valueOf);
            this.valueOf.EZpvd();
            this.AhwBna.notifyDataSetChanged();
            this.valueOf.notifyDataSetChanged();
            return;
        }
        this.AhwBna.notifyDataSetChanged();
        this.valueOf.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.kEy$TaskDescription */
    public final class TaskDescription extends AbstractC42977rgb<FavoriteRecommendListData, C42671ran> {
        @Override // o.AbstractC42977rgb, o.kLX
        /* JADX INFO: renamed from: EZpvd */
        public /* synthetic */ void onBindViewHolder(kLV klv, java.lang.Object obj) {
            onBindViewHolder((kLV<C42671ran>) klv, (FavoriteRecommendListData) obj);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
        @Override // o.kLX
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public C42671ran copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C42671ran c42671ranAEQbTJ = C42671ran.AEQbTJ(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c42671ranAEQbTJ, "");
            return c42671ranAEQbTJ;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: java.lang.String[] */
        /* JADX DEBUG: Multi-variable search result rejected for r15v1, resolved type: java.lang.String[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC42977rgb, o.kLX, o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull final kLV<C42671ran> klv, @NotNull FavoriteRecommendListData favoriteRecommendListData) {
            Intrinsics.checkNotNullParameter(klv, "");
            Intrinsics.checkNotNullParameter(favoriteRecommendListData, "");
            super.onBindViewHolder(klv, favoriteRecommendListData);
            final android.content.Context context = klv.itemView.getContext();
            ViewBinding viewBindingEZpvd = klv.EZpvd();
            C27831kEy c27831kEy = C27831kEy.this;
            C42671ran c42671ran = (C42671ran) viewBindingEZpvd;
            java.util.List listSplit$default = favoriteRecommendListData.getDisplayId().length() == 0 ? StringsKt__StringsKt.split$default((java.lang.CharSequence) favoriteRecommendListData.getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : StringsKt__StringsKt.split$default((java.lang.CharSequence) favoriteRecommendListData.getDisplayId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() < 2) {
                return;
            }
            Intrinsics.copydefault(context);
            if (C55296xhK.OLrzqt(context)) {
                c42671ran.copydefault.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(listSplit$default.get(1) + "/" + listSplit$default.get(0), new java.lang.String[]{listSplit$default.get(0)}, 0, null, false, new Function1() { // from class: o.kEF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C27831kEy.TaskDescription.copydefault(context, (java.util.List) obj);
                    }
                }, 14, null), new java.lang.String[]{listSplit$default.get(1) + "/"}, 0, null, false, new Function1() { // from class: o.kEI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C27831kEy.TaskDescription.gEmmrt(context, (java.util.List) obj);
                    }
                }, 14, null));
            } else {
                c42671ran.copydefault.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(listSplit$default.get(0) + "/" + listSplit$default.get(1), new java.lang.String[]{listSplit$default.get(0)}, 0, null, false, new Function1() { // from class: o.kEG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C27831kEy.TaskDescription.AYXKKw(context, (java.util.List) obj);
                    }
                }, 14, null), new java.lang.String[]{"/" + listSplit$default.get(1)}, 0, null, false, new Function1() { // from class: o.kEH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C27831kEy.TaskDescription.valueOf(context, (java.util.List) obj);
                    }
                }, 14, null));
            }
            c42671ran.KWHzl.setText(favoriteRecommendListData.getFullName());
            c42671ran.EZpvd.setChecked(c27831kEy.valueOf.OLrzqt(klv.getAdapterPosition()));
            android.view.View view = klv.itemView;
            final C27831kEy c27831kEy2 = C27831kEy.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.kEM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C27831kEy.TaskDescription.KWHzl(klv, c27831kEy2, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit copydefault(android.content.Context context, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.sSMYrx));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit gEmmrt(android.content.Context context, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.DbNXlk));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit AYXKKw(android.content.Context context, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.sSMYrx));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit valueOf(android.content.Context context, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.DbNXlk));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void KWHzl(kLV klv, C27831kEy c27831kEy, android.view.View view) {
            ((C42671ran) klv.EZpvd()).EZpvd.setChecked(!((C42671ran) klv.EZpvd()).EZpvd.isChecked());
            c27831kEy.valueOf.AEQbTJ(klv.getAdapterPosition());
            qZJ qzj = c27831kEy.EZpvd;
            if (qzj == null) {
                Intrinsics.gEmmrt("");
                qzj = null;
            }
            qzj.EZpvd.setEnabled(c27831kEy.valueOf.copydefault() != 0);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILjava/lang/Object;)V */
        @Override // o.InterfaceC33543myT
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void copydefault(@NotNull android.view.View view, int i, @NotNull FavoriteRecommendListData favoriteRecommendListData) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(favoriteRecommendListData, "");
            C27831kEy.this.valueOf.AEQbTJ(i);
        }
    }

    /* JADX INFO: renamed from: o.kEy$Activity */
    public final class Activity extends AbstractC42977rgb<FavoriteRecommendListData, C42635raD> {
        @Override // o.AbstractC42977rgb, o.kLX
        /* JADX INFO: renamed from: EZpvd */
        public /* bridge */ /* synthetic */ void onBindViewHolder(kLV klv, java.lang.Object obj) {
            onBindViewHolder((kLV<C42635raD>) klv, (FavoriteRecommendListData) obj);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
        @Override // o.kLX
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public C42635raD copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C42635raD c42635raDAEQbTJ = C42635raD.AEQbTJ(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c42635raDAEQbTJ, "");
            return c42635raDAEQbTJ;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: java.lang.String[] */
        /* JADX DEBUG: Multi-variable search result rejected for r15v1, resolved type: java.lang.String[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC42977rgb, o.kLX, o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull final kLV<C42635raD> klv, @NotNull FavoriteRecommendListData favoriteRecommendListData) {
            Intrinsics.checkNotNullParameter(klv, "");
            Intrinsics.checkNotNullParameter(favoriteRecommendListData, "");
            super.onBindViewHolder((kLV) klv, favoriteRecommendListData);
            final android.content.Context context = klv.itemView.getContext();
            ViewBinding viewBindingEZpvd = klv.EZpvd();
            C27831kEy c27831kEy = C27831kEy.this;
            C42635raD c42635raD = (C42635raD) viewBindingEZpvd;
            java.util.List listSplit$default = favoriteRecommendListData.getDisplayId().length() == 0 ? StringsKt__StringsKt.split$default((java.lang.CharSequence) favoriteRecommendListData.getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : StringsKt__StringsKt.split$default((java.lang.CharSequence) favoriteRecommendListData.getDisplayId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() < 2) {
                return;
            }
            Intrinsics.copydefault(context);
            if (C55296xhK.OLrzqt(context)) {
                c42635raD.KWHzl.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(listSplit$default.get(1) + "/" + listSplit$default.get(0), new java.lang.String[]{listSplit$default.get(0)}, 0, null, false, new Function1() { // from class: o.kEB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C27831kEy.Activity.KWHzl(context, (java.util.List) obj);
                    }
                }, 14, null), new java.lang.String[]{listSplit$default.get(1) + "/"}, 0, null, false, new Function1() { // from class: o.kEA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C27831kEy.Activity.djBIcL(context, (java.util.List) obj);
                    }
                }, 14, null));
            } else {
                c42635raD.KWHzl.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(listSplit$default.get(0) + "/" + listSplit$default.get(1), new java.lang.String[]{listSplit$default.get(0)}, 0, null, false, new Function1() { // from class: o.kEC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C27831kEy.Activity.AhwBna(context, (java.util.List) obj);
                    }
                }, 14, null), new java.lang.String[]{"/" + listSplit$default.get(1)}, 0, null, false, new Function1() { // from class: o.kED
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C27831kEy.Activity.gEmmrt(context, (java.util.List) obj);
                    }
                }, 14, null));
            }
            c42635raD.AEQbTJ.setText(favoriteRecommendListData.getFullName());
            c42635raD.OLrzqt.setChecked(c27831kEy.valueOf.OLrzqt(klv.getAdapterPosition()));
            android.view.View view = klv.itemView;
            final C27831kEy c27831kEy2 = C27831kEy.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.kEE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C27831kEy.Activity.EZpvd(klv, c27831kEy2, view2);
                }
            });
        }

        public static final Unit KWHzl(android.content.Context context, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.AwvSrB));
            return Unit.INSTANCE;
        }

        public static final Unit djBIcL(android.content.Context context, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.TextAppearanceSpan(context, qZH.FragmentManager.KWHzl));
            return Unit.INSTANCE;
        }

        public static final Unit AhwBna(android.content.Context context, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.AwvSrB));
            return Unit.INSTANCE;
        }

        public static final Unit gEmmrt(android.content.Context context, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.TextAppearanceSpan(context, qZH.FragmentManager.KWHzl));
            return Unit.INSTANCE;
        }

        public static final void EZpvd(kLV klv, C27831kEy c27831kEy, android.view.View view) {
            ((C42635raD) klv.EZpvd()).OLrzqt.setChecked(!((C42635raD) klv.EZpvd()).OLrzqt.isChecked());
            c27831kEy.valueOf.AEQbTJ(klv.getAdapterPosition());
            qZJ qzj = c27831kEy.EZpvd;
            if (qzj == null) {
                Intrinsics.gEmmrt("");
                qzj = null;
            }
            qzj.EZpvd.setEnabled(c27831kEy.valueOf.copydefault() != 0);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILjava/lang/Object;)V */
        @Override // o.InterfaceC33543myT
        public void copydefault(@NotNull android.view.View view, int i, @NotNull FavoriteRecommendListData favoriteRecommendListData) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(favoriteRecommendListData, "");
            C27831kEy.this.valueOf.AEQbTJ(i);
        }
    }
}
