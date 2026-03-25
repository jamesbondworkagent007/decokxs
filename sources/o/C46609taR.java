package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.okmarket.home.data.po.BannerType;
import com.okinc.unify_trade.biz.CountDownType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C41375qpd;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.taR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46609taR extends RecyclerView.Adapter<ActionBar> {
    public Application EZpvd;
    public StateListAnimator KWHzl;
    public boolean OLrzqt;
    public final java.util.ArrayList<C46684tbn> copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.taR$Application */
    public interface Application {
        void copydefault(@NotNull C46684tbn c46684tbn, int i);
    }

    /* JADX INFO: renamed from: o.taR$PendingIntent */
    public final /* synthetic */ class PendingIntent {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BannerType.values().length];
            try {
                iArr[BannerType.OKP_BANNER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BannerType.NEW_COIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX INFO: renamed from: o.taR$StateListAnimator */
    public interface StateListAnimator {
        void OLrzqt(@NotNull C46684tbn c46684tbn, int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.KWHzl = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.EZpvd = application;
    }

    public C46609taR(@NotNull java.util.ArrayList<C46684tbn> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.copydefault = arrayList;
    }

    /* JADX INFO: renamed from: o.taR$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.taR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final int copydefault(int i) {
        int iOLrzqt = OLrzqt();
        if (iOLrzqt <= 0 || i <= 0) {
            return 0;
        }
        return i % iOLrzqt;
    }

    public final int copydefault() {
        if (this.OLrzqt) {
            return (OLrzqt() * AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH) / 2;
        }
        return 0;
    }

    public final int EZpvd() {
        int iOLrzqt;
        if (this.OLrzqt) {
            iOLrzqt = copydefault();
        } else {
            iOLrzqt = OLrzqt();
        }
        int i = iOLrzqt - 1;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final int OLrzqt() {
        return this.copydefault.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.OLrzqt) {
            return OLrzqt() * AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
        }
        return OLrzqt();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(qZH.ActionBar.finit, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new ActionBar(false, viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        int iCopydefault = copydefault(i);
        if (iCopydefault < 0 || iCopydefault >= this.copydefault.size()) {
            pUU.valueOf("MarketNewListingBannerAdapter", "Invalid position: " + iCopydefault + ", size: " + this.copydefault.size());
            return;
        }
        try {
            C46684tbn c46684tbn = this.copydefault.get(iCopydefault);
            Intrinsics.checkNotNullExpressionValue(c46684tbn, "");
            KWHzl(actionBar, c46684tbn, i);
        } catch (java.lang.IndexOutOfBoundsException e) {
            pUU.AEQbTJ("MarketNewListingBannerAdapter", "onBindViewHolder crash", e);
        }
    }

    public final void KWHzl(ActionBar actionBar, C46684tbn c46684tbn, int i) {
        C42677rat c42677ratOLrzqt = actionBar.OLrzqt();
        c42677ratOLrzqt.gEmmrt.setText(c46684tbn.fetchVPNInfo());
        android.widget.ImageView imageView = c42677ratOLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C57659ymb.loadBorderImage$default(imageView, c46684tbn.gEmmrt(), qZH.Activity.AhwBna, 0.0f, 0, 8, (java.lang.Object) null);
        android.widget.ImageView imageView2 = c42677ratOLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C46742tcs.AEQbTJ(imageView2, c46684tbn.gEmmrt());
        android.widget.FrameLayout root = c42677ratOLrzqt.getRoot();
        root.setOnClickListener(new LoaderManager(root, 1000L, this, c46684tbn, i));
        int i2 = PendingIntent.EZpvd[c46684tbn.OLrzqt().ordinal()];
        if (i2 == 1) {
            KWHzl(c42677ratOLrzqt, c46684tbn);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (c46684tbn.values()) {
                EZpvd(c42677ratOLrzqt, c46684tbn);
            } else {
                OLrzqt(c42677ratOLrzqt, c46684tbn, i);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        super.onViewAttachedToWindow(actionBar);
        actionBar.OLrzqt(true);
    }

    /* JADX DEBUG: Method merged with bridge method: onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        super.onViewDetachedFromWindow(actionBar);
        actionBar.OLrzqt(false);
    }

    public final void KWHzl(C42677rat c42677rat, C46684tbn c46684tbn) {
        c42677rat.gEmmrt.setText(c46684tbn.fetchVPNInfo());
        c42677rat.AEQbTJ.setText(c46684tbn.AYXKKw());
        C40492qXw c40492qXw = c42677rat.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
        c40492qXw.setVisibility(8);
    }

    public final void EZpvd(C42677rat c42677rat, C46684tbn c46684tbn) {
        c42677rat.gEmmrt.setText(c46684tbn.isConnected());
        C40492qXw c40492qXw = c42677rat.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
        c40492qXw.setVisibility(8);
        AppCompatTextView appCompatTextView = c42677rat.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        KWHzl(c42677rat, c46684tbn, appCompatTextView, c46684tbn.fetchVPNInfo());
    }

    public final void OLrzqt(C42677rat c42677rat, final C46684tbn c46684tbn, final int i) {
        android.widget.TextView textView = c42677rat.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        KWHzl(c42677rat, c46684tbn, textView, c46684tbn.fetchVPNInfo());
        C40492qXw c40492qXw = c42677rat.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
        c40492qXw.setVisibility(0);
        c42677rat.AEQbTJ.setText(c46684tbn.AYXKKw());
        c42677rat.KWHzl.setDeadlineTime(CountDownType.SHOW_COUNT_DOWN, C33070mpX.AYXKKw(qZH.PendingIntent.getSessionID), c46684tbn.copydefault(), new Function1() { // from class: o.taY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46609taR.OLrzqt(this.KWHzl, c46684tbn, i, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit OLrzqt(C46609taR c46609taR, C46684tbn c46684tbn, int i, long j) {
        StateListAnimator stateListAnimator = c46609taR.KWHzl;
        if (stateListAnimator != null) {
            stateListAnimator.OLrzqt(c46684tbn, i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.taR$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C46609taR EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C46684tbn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C46609taR c46609taR, C46684tbn c46684tbn, int i) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c46609taR;
            this.copydefault = c46684tbn;
            this.KWHzl = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Application application = this.EZpvd.EZpvd;
                if (application != null) {
                    application.copydefault(this.copydefault, this.KWHzl);
                }
            }
        }
    }

    public final void KWHzl(C42677rat c42677rat, C46684tbn c46684tbn, android.widget.TextView textView, java.lang.String str) {
        C41375qpd.Activity activity = C41375qpd.Companion;
        boolean zOLrzqt = C33492mxV.OLrzqt();
        java.util.List<java.lang.String> listAkhnZx = c46684tbn.AkhnZx();
        android.content.Context context = c42677rat.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.widget.FrameLayout root = c42677rat.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        kotlin.Pair<android.text.style.ReplacementSpan, java.lang.Integer> pairOLrzqt = activity.OLrzqt(zOLrzqt, listAkhnZx, context, root, java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD), java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ));
        final android.text.style.ReplacementSpan first = pairOLrzqt != null ? pairOLrzqt.getFirst() : null;
        java.lang.String str2 = first != null ? "tag" : null;
        if (str2 != null) {
            textView.setText(StringsKt__StringsKt.hDKMBd(C33061mpO.setupSpanStyles$default(str + " " + str2, new java.lang.String[]{"tag"}, 0, MatchPattern.LAST_ONLY, false, new Function1() { // from class: o.taZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46609taR.copydefault(first, (java.util.List) obj);
                }
            }, 10, null)));
            return;
        }
        textView.setText(str);
    }

    public static final Unit copydefault(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(replacementSpan);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.taR$ActionBar */
    public static final class ActionBar extends Activity {
        public final C42677rat AEQbTJ;
        public boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C42677rat OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C46609taR.Activity
        public void OLrzqt(boolean z) {
            this.KWHzl = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(boolean z, @NotNull android.view.View view) {
            super(z, view);
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl = z;
            C42677rat c42677ratCopydefault = C42677rat.copydefault(view);
            Intrinsics.checkNotNullExpressionValue(c42677ratCopydefault, "");
            this.AEQbTJ = c42677ratCopydefault;
        }
    }

    /* JADX INFO: renamed from: o.taR$Activity */
    public static class Activity extends RecyclerView.ViewHolder {
        public boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(boolean z, @NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = z;
        }
    }
}
