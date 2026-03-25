package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerAddressGroupUIModel;
import com.okinc.business.market.features.watch_list_groups.GroupEditParams;
import com.okinc.business.market.features.watch_list_groups.GroupType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jEN extends ConstraintLayout {
    public long AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final java.util.List<TrackerAddressGroupUIModel> KWHzl;
    public Function1<? super android.content.Intent, Unit> OLrzqt;
    public Function1<? super TrackerAddressGroupUIModel, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jEN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jEN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function1<? super TrackerAddressGroupUIModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function1<? super android.content.Intent, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.jEN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ jEN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jEN(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jES
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jEN.EZpvd(context, this);
            }
        });
        this.KWHzl = new java.util.ArrayList();
        this.AEQbTJ = -1L;
        android.widget.ImageView imageView = EZpvd().OLrzqt;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
    }

    private final C21660hHp EZpvd() {
        return (C21660hHp) this.EZpvd.getValue();
    }

    public static final C21660hHp EZpvd(android.content.Context context, jEN jen) {
        return C21660hHp.copydefault(android.view.LayoutInflater.from(context), jen, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jEN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setQuickPickOptions$default(jEN jen, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = yDY.AhwBna();
        }
        jen.setQuickPickOptions(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setQuickPickOptions(@NotNull java.util.List<TrackerAddressGroupUIModel> list) {
        TrackerAddressGroupUIModel trackerAddressGroupUIModel;
        java.lang.Object next;
        int iEZpvd;
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TrackerAddressGroupUIModel trackerAddressGroupUIModel2 : list) {
            arrayList.add(trackerAddressGroupUIModel2.KWHzl((255 & 1) != 0 ? trackerAddressGroupUIModel2.EZpvd : 0, (255 & 2) != 0 ? trackerAddressGroupUIModel2.KWHzl : null, (255 & 4) != 0 ? trackerAddressGroupUIModel2.gEmmrt : 0, (255 & 8) != 0 ? trackerAddressGroupUIModel2.AYXKKw : 0, (255 & 16) != 0 ? trackerAddressGroupUIModel2.AhwBna : 0, (255 & 32) != 0 ? trackerAddressGroupUIModel2.copydefault : 0, (255 & 64) != 0 ? trackerAddressGroupUIModel2.AEQbTJ : false, (255 & 128) != 0 ? trackerAddressGroupUIModel2.OLrzqt : false));
        }
        if (arrayList.isEmpty()) {
            trackerAddressGroupUIModel = (TrackerAddressGroupUIModel) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            if (trackerAddressGroupUIModel != null) {
                trackerAddressGroupUIModel.OLrzqt(true);
            }
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((TrackerAddressGroupUIModel) it.next()).djBIcL()) {
                    break;
                }
            }
            trackerAddressGroupUIModel = (TrackerAddressGroupUIModel) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            if (trackerAddressGroupUIModel != null) {
            }
        }
        this.KWHzl.addAll(arrayList);
        java.util.Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((TrackerAddressGroupUIModel) next).djBIcL()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TrackerAddressGroupUIModel trackerAddressGroupUIModel3 = (TrackerAddressGroupUIModel) next;
        if (trackerAddressGroupUIModel3 != null) {
            iEZpvd = trackerAddressGroupUIModel3.EZpvd();
        } else {
            TrackerAddressGroupUIModel trackerAddressGroupUIModel4 = (TrackerAddressGroupUIModel) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            iEZpvd = trackerAddressGroupUIModel4 != null ? trackerAddressGroupUIModel4.EZpvd() : -1;
        }
        this.AEQbTJ = iEZpvd;
        OLrzqt();
    }

    public final void setSelection(@NotNull TrackerAddressGroupUIModel trackerAddressGroupUIModel) {
        Intrinsics.checkNotNullParameter(trackerAddressGroupUIModel, "");
        this.AEQbTJ = C33129mqd.valueOf(java.lang.Integer.valueOf(trackerAddressGroupUIModel.EZpvd()));
        OLrzqt();
    }

    public final void OLrzqt() {
        EZpvd().EZpvd.removeAllViews();
        int i = 0;
        for (java.lang.Object obj : this.KWHzl) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            TrackerAddressGroupUIModel trackerAddressGroupUIModel = (TrackerAddressGroupUIModel) obj;
            boolean z = trackerAddressGroupUIModel.EZpvd() == C33129mqd.AhwBna(java.lang.Long.valueOf(this.AEQbTJ));
            final C54989xbV c54989xbVAEQbTJ = AEQbTJ(trackerAddressGroupUIModel, z);
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
            if (i != 0) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                layoutParams.setMarginStart(C55298xhM.copydefault(8.0f, context));
            }
            EZpvd().EZpvd.addView(c54989xbVAEQbTJ, layoutParams);
            c54989xbVAEQbTJ.setOnClickListener(new Application(c54989xbVAEQbTJ, 1000L, this, trackerAddressGroupUIModel));
            if (z) {
                post(new java.lang.Runnable() { // from class: o.jEO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        jEN.OLrzqt(this.OLrzqt, c54989xbVAEQbTJ);
                    }
                });
            }
            i++;
        }
    }

    public static final void OLrzqt(jEN jen, C54989xbV c54989xbV) {
        jen.EZpvd().AhwBna.smoothScrollTo(c54989xbV.getLeft() - C55298xhM.dp2px$default(8.0f, null, 1, null), 0);
    }

    public final C54989xbV AEQbTJ(TrackerAddressGroupUIModel trackerAddressGroupUIModel, boolean z) {
        android.content.Context context = EZpvd().EZpvd.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C54989xbV c54989xbV = new C54989xbV(context, null, 0, 6, null);
        c54989xbV.setStyle(2);
        c54989xbV.setOKDSSize(-20);
        c54989xbV.setSelected(z);
        android.widget.TextView textViewEZpvd = c54989xbV.EZpvd();
        android.content.Context context2 = c54989xbV.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textViewEZpvd.setText(jFN.OLrzqt(trackerAddressGroupUIModel, context2));
        return c54989xbV;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ TrackerAddressGroupUIModel KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ jEN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, jEN jen, TrackerAddressGroupUIModel trackerAddressGroupUIModel) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = jen;
            this.KWHzl = trackerAddressGroupUIModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.setSelection(this.KWHzl);
                Function1 function1 = this.copydefault.copydefault;
                if (function1 != null) {
                    function1.invoke(this.KWHzl);
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ jEN EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, jEN jen) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = jen;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Intent intent = new android.content.Intent(((android.widget.ImageView) this.copydefault).getContext(), (java.lang.Class<?>) kBV.class);
                intent.putExtra("group_params", new GroupEditParams(GroupType.TRACKER, false, 2, null));
                Function1 function1 = this.EZpvd.OLrzqt;
                if (function1 != null) {
                    function1.invoke(intent);
                }
            }
        }
    }
}
