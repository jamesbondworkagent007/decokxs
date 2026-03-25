package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType;
import com.okinc.business.market.features.meme.ui.MemePumpAdapter$startTimeUpdates$1;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kje, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28908kje extends androidx.recyclerview.widget.ListAdapter<MemeUiModel, C28915kjl> {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static final DiffUtil.ItemCallback<MemeUiModel> copydefault = new ActionBar();
    public final Function1<MemeUiModel, Unit> AEQbTJ;
    public final Function1<MemeUiModel, Unit> AYXKKw;
    public final Function2<MemeUiModel, TokenDetailTabType, Unit> AhwBna;
    public java.lang.String AkhnZx;
    public final int DbNXlk;
    public final CoroutineScope KWHzl;
    public boolean OLrzqt;
    public final Function1<MemeUiModel, Unit> djBIcL;
    public final java.util.Set<C28915kjl> fARcdN;
    public Job fetchVPNInfo;
    public final Function2<java.lang.Integer, java.lang.String, Unit> gEmmrt;
    public boolean isConnected;
    public final yHO<kotlin.Pair<java.lang.Integer, java.lang.Integer>, MemeUiModel, java.lang.Integer, Unit> valueOf;
    public WeakReference<C28915kjl> values;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.meme.domain.model.MemeUiModel, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.meme.domain.model.MemeUiModel, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.business.market.features.meme.domain.model.MemeUiModel, ? super com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.meme.domain.model.MemeUiModel, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: o.yHO<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, ? super com.okinc.business.market.features.meme.domain.model.MemeUiModel, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28908kje(int i, @NotNull CoroutineScope coroutineScope, @NotNull Function1<? super MemeUiModel, Unit> function1, @NotNull Function1<? super MemeUiModel, Unit> function12, @NotNull Function2<? super MemeUiModel, ? super TokenDetailTabType, Unit> function2, @NotNull Function1<? super MemeUiModel, Unit> function13, @NotNull yHO<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, ? super MemeUiModel, ? super java.lang.Integer, Unit> yho, @NotNull Function2<? super java.lang.Integer, ? super java.lang.String, Unit> function22) {
        super(copydefault);
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function22, "");
        this.DbNXlk = i;
        this.KWHzl = coroutineScope;
        this.AEQbTJ = function1;
        this.AYXKKw = function12;
        this.AhwBna = function2;
        this.djBIcL = function13;
        this.valueOf = yho;
        this.gEmmrt = function22;
        setHasStableIds(true);
        this.fARcdN = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: o.kje$Activity */
    public static final class Activity {
        public static final Activity copydefault = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.kje$PendingIntent */
    public static final class PendingIntent {
        public static final PendingIntent KWHzl = new PendingIntent();

        private PendingIntent() {
        }
    }

    /* JADX INFO: renamed from: o.kje$TaskDescription */
    public static final class TaskDescription {
        public static final TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.kje$TaskStackBuilder */
    public static final class TaskStackBuilder {
        public static final TaskStackBuilder EZpvd = new TaskStackBuilder();

        private TaskStackBuilder() {
        }
    }

    /* JADX INFO: renamed from: o.kje$LoaderManager */
    public static final class LoaderManager {
        public static final LoaderManager AEQbTJ = new LoaderManager();

        private LoaderManager() {
        }
    }

    /* JADX INFO: renamed from: o.kje$StateListAnimator */
    public static final class StateListAnimator {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.kje$Dialog */
    public static final class Dialog {
        public static final Dialog KWHzl = new Dialog();

        private Dialog() {
        }
    }

    /* JADX INFO: renamed from: o.kje$FragmentManager */
    public static final class FragmentManager {
        public static final FragmentManager copydefault = new FragmentManager();

        private FragmentManager() {
        }
    }

    /* JADX INFO: renamed from: o.kje$Fragment */
    public static final class Fragment {
        public static final Fragment KWHzl = new Fragment();

        private Fragment() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C28915kjl onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCM hcmCopydefault = hCM.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hcmCopydefault, "");
        return new C28915kjl(hcmCopydefault, this.DbNXlk, this.KWHzl, this.AEQbTJ, this.AYXKKw, this.AhwBna, this.djBIcL, new yHO() { // from class: o.kjf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C28908kje.copydefault(this.AEQbTJ, (kotlin.Pair) obj, (MemeUiModel) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, new Function0() { // from class: o.kjj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28908kje.copydefault(this.KWHzl);
            }
        }, this.gEmmrt);
    }

    public static final Unit copydefault(C28908kje c28908kje, kotlin.Pair pair, MemeUiModel memeUiModel, int i) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        c28908kje.OLrzqt(pair, memeUiModel, i);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C28908kje c28908kje) {
        c28908kje.copydefault();
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        java.util.List<MemeUiModel> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        MemeUiModel memeUiModel = (MemeUiModel) CollectionsKt___CollectionsKt.AkhnZx(currentList, i);
        if (memeUiModel == null) {
            return -1L;
        }
        java.lang.String strKWHzl = memeUiModel.KWHzl();
        java.lang.String strAuCTel = memeUiModel.AuCTel();
        return (strKWHzl + "_" + strAuCTel).hashCode();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C28915kjl c28915kjl, int i) {
        Intrinsics.checkNotNullParameter(c28915kjl, "");
        java.util.List<MemeUiModel> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        MemeUiModel memeUiModel = (MemeUiModel) CollectionsKt___CollectionsKt.AkhnZx(currentList, i);
        if (memeUiModel == null) {
            return;
        }
        if (c28915kjl.KWHzl()) {
            c28915kjl.OLrzqt(memeUiModel);
            return;
        }
        c28915kjl.copydefault(memeUiModel, i);
        c28915kjl.copydefault(Intrinsics.EZpvd((java.lang.Object) (memeUiModel.KWHzl() + "_" + memeUiModel.AuCTel()), (java.lang.Object) this.AkhnZx));
    }

    /* JADX DEBUG: Method merged with bridge method: onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NotNull C28915kjl c28915kjl) {
        Intrinsics.checkNotNullParameter(c28915kjl, "");
        super.onViewAttachedToWindow(c28915kjl);
        if (this.OLrzqt) {
            return;
        }
        this.fARcdN.add(c28915kjl);
        if (this.isConnected) {
            return;
        }
        AEQbTJ();
    }

    /* JADX DEBUG: Method merged with bridge method: onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NotNull C28915kjl c28915kjl) {
        Intrinsics.checkNotNullParameter(c28915kjl, "");
        super.onViewDetachedFromWindow(c28915kjl);
        if (this.OLrzqt) {
            return;
        }
        this.fARcdN.remove(c28915kjl);
        c28915kjl.AEQbTJ();
        if (this.fARcdN.isEmpty()) {
            Job job = this.fetchVPNInfo;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.fetchVPNInfo = null;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull C28915kjl c28915kjl) {
        Intrinsics.checkNotNullParameter(c28915kjl, "");
        super.onViewRecycled(c28915kjl);
        c28915kjl.EZpvd();
        c28915kjl.copydefault();
        c28915kjl.AEQbTJ();
    }

    public final void AEQbTJ() {
        if (this.OLrzqt || this.isConnected) {
            return;
        }
        Job job = this.fetchVPNInfo;
        if ((job == null || !job.isActive()) && !C22416heu.ejfBZ()) {
            this.fetchVPNInfo = BuildersKt__Builders_commonKt.launch$default(this.KWHzl, Dispatchers.getDefault(), null, new MemePumpAdapter$startTimeUpdates$1(this, null), 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long OLrzqt() {
        java.lang.String strFJNWhG;
        long jLongValue;
        java.lang.Long fieldNames;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator<T> it = this.fARcdN.iterator();
        long jMin = 5000;
        while (it.hasNext()) {
            int adapterPosition = ((C28915kjl) it.next()).getAdapterPosition();
            if (adapterPosition != -1 && adapterPosition < getCurrentList().size()) {
                java.util.List<MemeUiModel> currentList = getCurrentList();
                Intrinsics.checkNotNullExpressionValue(currentList, "");
                MemeUiModel memeUiModel = (MemeUiModel) CollectionsKt___CollectionsKt.AkhnZx(currentList, adapterPosition);
                if (this.DbNXlk == 2) {
                    strFJNWhG = memeUiModel != null ? memeUiModel.fetchVPNInfo() : null;
                    jLongValue = jCurrentTimeMillis - ((strFJNWhG != null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(strFJNWhG)) == null) ? 0L : fieldNames.longValue());
                    long j = 60000;
                    if (jLongValue >= 60000) {
                        j = 1000;
                    } else if (jLongValue < 120000) {
                        j = 5000;
                    } else if (jLongValue >= 600000) {
                        j = jLongValue < 3600000 ? 300000L : 1800000L;
                    }
                    jMin = java.lang.Math.min(jMin, j);
                } else {
                    if (memeUiModel != null) {
                        strFJNWhG = memeUiModel.fJNWhG();
                    }
                    if (strFJNWhG != null) {
                        jLongValue = jCurrentTimeMillis - ((strFJNWhG != null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(strFJNWhG)) == null) ? 0L : fieldNames.longValue());
                        long j2 = 60000;
                        if (jLongValue >= 60000) {
                        }
                        jMin = java.lang.Math.min(jMin, j2);
                    }
                }
            }
        }
        return jMin;
    }

    public final void valueOf() {
        if (this.isConnected) {
            return;
        }
        this.isConnected = true;
        Job job = this.fetchVPNInfo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.fetchVPNInfo = null;
    }

    public final void EZpvd() {
        this.isConnected = false;
        if (this.OLrzqt || !(!this.fARcdN.isEmpty())) {
            return;
        }
        AEQbTJ();
    }

    public final void KWHzl() {
        this.OLrzqt = true;
        Job job = this.fetchVPNInfo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.fetchVPNInfo = null;
        this.fARcdN.clear();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C28915kjl c28915kjl, int i, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c28915kjl, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(c28915kjl, i);
            return;
        }
        java.util.List<MemeUiModel> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        MemeUiModel memeUiModel = (MemeUiModel) CollectionsKt___CollectionsKt.AkhnZx(currentList, i);
        if (memeUiModel == null) {
            return;
        }
        if (c28915kjl.KWHzl()) {
            c28915kjl.OLrzqt(memeUiModel);
        } else {
            KWHzl(c28915kjl, list, memeUiModel);
        }
    }

    public final void KWHzl(C28915kjl c28915kjl, java.lang.Object obj, MemeUiModel memeUiModel) {
        c28915kjl.copydefault(memeUiModel);
        if (obj instanceof Activity) {
            c28915kjl.AhwBna(memeUiModel);
            return;
        }
        if (obj instanceof PendingIntent) {
            c28915kjl.isConnected(memeUiModel);
            return;
        }
        if (obj instanceof TaskDescription) {
            c28915kjl.AYXKKw(memeUiModel);
            return;
        }
        if (obj instanceof TaskStackBuilder) {
            c28915kjl.DbNXlk(memeUiModel);
            return;
        }
        if (obj instanceof LoaderManager) {
            c28915kjl.gEmmrt(memeUiModel);
            return;
        }
        if (obj instanceof StateListAnimator) {
            c28915kjl.valueOf(memeUiModel);
            return;
        }
        if (obj instanceof Dialog) {
            c28915kjl.fetchVPNInfo(memeUiModel);
            return;
        }
        if (obj instanceof FragmentManager) {
            c28915kjl.AEQbTJ(this.DbNXlk == 2 ? memeUiModel.fetchVPNInfo() : memeUiModel.fJNWhG());
            return;
        }
        if (obj instanceof Fragment) {
            c28915kjl.copydefault(Intrinsics.EZpvd((java.lang.Object) (memeUiModel.KWHzl() + "_" + memeUiModel.AuCTel()), (java.lang.Object) this.AkhnZx));
            return;
        }
        if (obj instanceof java.util.List) {
            for (java.lang.Object obj2 : (java.lang.Iterable) obj) {
                if (obj2 != null) {
                    KWHzl(c28915kjl, obj2, memeUiModel);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kje$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kje.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.kje$ActionBar */
    public static final class ActionBar extends DiffUtil.ItemCallback<MemeUiModel> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(MemeUiModel memeUiModel, MemeUiModel memeUiModel2) {
            Intrinsics.checkNotNullParameter(memeUiModel, "");
            Intrinsics.checkNotNullParameter(memeUiModel2, "");
            return Intrinsics.EZpvd((java.lang.Object) memeUiModel.KWHzl(), (java.lang.Object) memeUiModel2.KWHzl()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel.AuCTel(), (java.lang.Object) memeUiModel2.AuCTel());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(MemeUiModel memeUiModel, MemeUiModel memeUiModel2) {
            Intrinsics.checkNotNullParameter(memeUiModel, "");
            Intrinsics.checkNotNullParameter(memeUiModel2, "");
            return Intrinsics.EZpvd((java.lang.Object) memeUiModel.KWHzl(), (java.lang.Object) memeUiModel2.KWHzl()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel.AuCTel(), (java.lang.Object) memeUiModel2.AuCTel()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel.getNewProxyInstance(), (java.lang.Object) memeUiModel2.getNewProxyInstance()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel.getFieldNames(), (java.lang.Object) memeUiModel2.getFieldNames()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel.iwGUEr(), (java.lang.Object) memeUiModel2.iwGUEr()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel.ejfBZ(), (java.lang.Object) memeUiModel2.ejfBZ()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel.fJNWhG(), (java.lang.Object) memeUiModel2.fJNWhG()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel.djBIcL(), (java.lang.Object) memeUiModel2.djBIcL()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel.sSMYrx(), (java.lang.Object) memeUiModel2.sSMYrx()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel.EZpvd(), (java.lang.Object) memeUiModel2.EZpvd()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel.AuCTelauCTel(), (java.lang.Object) memeUiModel2.AuCTelauCTel()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel.wlaJM(), (java.lang.Object) memeUiModel2.wlaJM()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel.zLjUOn(), (java.lang.Object) memeUiModel2.zLjUOn()) && Intrinsics.EZpvd(memeUiModel.fIwbmz(), memeUiModel2.fIwbmz()) && memeUiModel.uzCIH().size() == memeUiModel2.uzCIH().size() && Intrinsics.EZpvd(memeUiModel.AEQbTJ(), memeUiModel2.AEQbTJ()) && Intrinsics.EZpvd((java.lang.Object) C23311hvo.formatPercent$default(memeUiModel.values(), false, 0, 0, null, null, 28, null), (java.lang.Object) C23311hvo.formatPercent$default(memeUiModel2.values(), false, 0, 0, null, null, 28, null));
        }

        /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.Object getChangePayload(MemeUiModel memeUiModel, MemeUiModel memeUiModel2) {
            Intrinsics.checkNotNullParameter(memeUiModel, "");
            Intrinsics.checkNotNullParameter(memeUiModel2, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (!Intrinsics.EZpvd((java.lang.Object) memeUiModel.iwGUEr(), (java.lang.Object) memeUiModel2.iwGUEr()) || !Intrinsics.EZpvd((java.lang.Object) memeUiModel.ejfBZ(), (java.lang.Object) memeUiModel2.ejfBZ())) {
                arrayList.add(TaskStackBuilder.EZpvd);
            }
            if (!Intrinsics.EZpvd((java.lang.Object) C23311hvo.formatPercent$default(memeUiModel.values(), false, 0, 0, null, null, 28, null), (java.lang.Object) C23311hvo.formatPercent$default(memeUiModel2.values(), false, 0, 0, null, null, 28, null))) {
                arrayList.add(LoaderManager.AEQbTJ);
            }
            if (!Intrinsics.EZpvd((java.lang.Object) memeUiModel.djBIcL(), (java.lang.Object) memeUiModel2.djBIcL()) || !Intrinsics.EZpvd((java.lang.Object) memeUiModel.sSMYrx(), (java.lang.Object) memeUiModel2.sSMYrx()) || !Intrinsics.EZpvd((java.lang.Object) memeUiModel.EZpvd(), (java.lang.Object) memeUiModel2.EZpvd()) || !Intrinsics.EZpvd((java.lang.Object) memeUiModel.AuCTelauCTel(), (java.lang.Object) memeUiModel2.AuCTelauCTel()) || !Intrinsics.EZpvd((java.lang.Object) memeUiModel.wlaJM(), (java.lang.Object) memeUiModel2.wlaJM()) || !Intrinsics.EZpvd((java.lang.Object) memeUiModel.zLjUOn(), (java.lang.Object) memeUiModel2.zLjUOn())) {
                arrayList.add(Activity.copydefault);
            }
            if (!Intrinsics.EZpvd(memeUiModel.fIwbmz(), memeUiModel2.fIwbmz())) {
                arrayList.add(PendingIntent.KWHzl);
            }
            if (!Intrinsics.EZpvd(memeUiModel.AEQbTJ(), memeUiModel2.AEQbTJ())) {
                arrayList.add(TaskDescription.OLrzqt);
            }
            if (memeUiModel.gHZMYf() != memeUiModel2.gHZMYf() || !Intrinsics.EZpvd((java.lang.Object) memeUiModel.fetchVPNInfo(), (java.lang.Object) memeUiModel2.fetchVPNInfo())) {
                arrayList.add(StateListAnimator.copydefault);
            }
            if (!Intrinsics.EZpvd(memeUiModel.uzCIH(), memeUiModel2.uzCIH())) {
                arrayList.add(Dialog.KWHzl);
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            return null;
        }
    }

    public final void EZpvd(@NotNull MemeUiModel memeUiModel, int i) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        java.util.List<MemeUiModel> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) currentList);
        MemeUiModel memeUiModel2 = (MemeUiModel) CollectionsKt___CollectionsKt.AkhnZx(listFJNWhG, i);
        if (memeUiModel2 != null && Intrinsics.EZpvd((java.lang.Object) memeUiModel2.KWHzl(), (java.lang.Object) memeUiModel.KWHzl()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel2.AuCTel(), (java.lang.Object) memeUiModel.AuCTel())) {
            listFJNWhG.remove(i);
        } else {
            java.util.Iterator it = listFJNWhG.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                MemeUiModel memeUiModel3 = (MemeUiModel) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) memeUiModel3.KWHzl(), (java.lang.Object) memeUiModel.KWHzl()) && Intrinsics.EZpvd((java.lang.Object) memeUiModel3.AuCTel(), (java.lang.Object) memeUiModel.AuCTel())) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                listFJNWhG.remove(i2);
            }
        }
        submitList(listFJNWhG);
    }

    public final void OLrzqt(kotlin.Pair<java.lang.Integer, java.lang.Integer> pair, MemeUiModel memeUiModel, int i) {
        java.lang.Object next;
        copydefault();
        java.lang.String str = memeUiModel.KWHzl() + "_" + memeUiModel.AuCTel();
        this.AkhnZx = str;
        java.util.Iterator<T> it = this.fARcdN.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int adapterPosition = ((C28915kjl) next).getAdapterPosition();
            if (adapterPosition != -1) {
                java.util.List<MemeUiModel> currentList = getCurrentList();
                Intrinsics.checkNotNullExpressionValue(currentList, "");
                MemeUiModel memeUiModel2 = (MemeUiModel) CollectionsKt___CollectionsKt.AkhnZx(currentList, adapterPosition);
                if (memeUiModel2 != null) {
                    if (Intrinsics.EZpvd((java.lang.Object) (memeUiModel2.KWHzl() + "_" + memeUiModel2.AuCTel()), (java.lang.Object) str)) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        C28915kjl c28915kjl = (C28915kjl) next;
        this.values = c28915kjl != null ? new WeakReference<>(c28915kjl) : null;
        if (c28915kjl != null) {
            c28915kjl.copydefault(true);
        }
        java.util.List<MemeUiModel> currentList2 = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList2, "");
        java.util.Iterator<MemeUiModel> it2 = currentList2.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            MemeUiModel next2 = it2.next();
            if (Intrinsics.EZpvd((java.lang.Object) (next2.KWHzl() + "_" + next2.AuCTel()), (java.lang.Object) str)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            i = i2;
        }
        this.valueOf.invoke(pair, memeUiModel, java.lang.Integer.valueOf(i));
    }

    public final void copydefault() {
        C28915kjl c28915kjl;
        WeakReference<C28915kjl> weakReference = this.values;
        if (weakReference != null && (c28915kjl = weakReference.get()) != null) {
            c28915kjl.copydefault(false);
        }
        this.AkhnZx = null;
        this.values = null;
    }
}
