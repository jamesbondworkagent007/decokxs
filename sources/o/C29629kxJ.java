package o;

import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.okinc.business.market.data.model.smart_money.SignalGemType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.SignalTab;
import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsUiSortType;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalFilterChip;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29629kxJ extends android.widget.LinearLayout {
    public Function0<Unit> AEQbTJ;
    public Function0<Unit> EZpvd;
    public Function0<Unit> KWHzl;
    public Function0<Unit> OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public Function0<Unit> gEmmrt;

    /* JADX INFO: renamed from: o.kxJ$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignalFilterChip.values().length];
            try {
                iArr[SignalFilterChip.GEM_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SignalFilterChip.INFLUENCER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SignalFilterChip.CHAIN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SignalFilterChip.SORT_TYPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29629kxJ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29629kxJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt() {
        this.EZpvd = null;
        this.OLrzqt = null;
        this.AEQbTJ = null;
        this.gEmmrt = null;
        this.KWHzl = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterButtonClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterChainClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterInfluencerClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterTypeClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSortTypeClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.kxJ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C29629kxJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29629kxJ(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.kxM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29629kxJ.AEQbTJ(context, this);
            }
        });
        setupClickListeners();
    }

    private final hEZ EZpvd() {
        return (hEZ) this.copydefault.getValue();
    }

    public static final hEZ AEQbTJ(android.content.Context context, C29629kxJ c29629kxJ) {
        return hEZ.OLrzqt(android.view.LayoutInflater.from(context), c29629kxJ, true);
    }

    public final void setupClickListeners() {
        hEZ hezEZpvd = EZpvd();
        C54989xbV c54989xbV = hezEZpvd.copydefault;
        c54989xbV.setOnClickListener(new TaskDescription(c54989xbV, 1000L, this));
        C54989xbV c54989xbV2 = hezEZpvd.OLrzqt;
        c54989xbV2.setOnClickListener(new StateListAnimator(c54989xbV2, 1000L, this));
        C54989xbV c54989xbV3 = hezEZpvd.AEQbTJ;
        c54989xbV3.setOnClickListener(new ActionBar(c54989xbV3, 1000L, this));
        C54989xbV c54989xbV4 = hezEZpvd.valueOf;
        c54989xbV4.setOnClickListener(new Dialog(c54989xbV4, 1000L, this));
        android.widget.ImageView imageView = hezEZpvd.KWHzl;
        imageView.setOnClickListener(new PendingIntent(imageView, 1000L, this));
    }

    public final void copydefault(@NotNull SignalGemType signalGemType) {
        Intrinsics.checkNotNullParameter(signalGemType, "");
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        android.widget.TextView textViewEZpvd = EZpvd().copydefault.EZpvd();
        textViewEZpvd.setText(context.getString(signalGemType.getStringRes()));
        textViewEZpvd.setTextAppearance(C52761wXj.LoaderManager.QOLQEE);
    }

    public final void EZpvd(@NotNull java.util.List<SignalMultiSelectUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C54989xbV c54989xbV = EZpvd().OLrzqt;
        android.widget.ImageView imageViewAEQbTJ = c54989xbV.AEQbTJ();
        boolean z = !list.isEmpty();
        imageViewAEQbTJ.setVisibility(z ? 0 : 8);
        if (z) {
            imageViewAEQbTJ.setImageDrawable(OLrzqt(list));
            ViewGroup.LayoutParams layoutParams = imageViewAEQbTJ.getLayoutParams();
            if (layoutParams != null) {
                int size = list.size();
                android.content.Context context = imageViewAEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                layoutParams.width = C55298xhM.OLrzqt(size * 16, context);
                android.content.Context context2 = imageViewAEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                layoutParams.height = C55298xhM.OLrzqt(16, context2);
                imageViewAEQbTJ.setLayoutParams(layoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        android.widget.TextView textViewEZpvd = c54989xbV.EZpvd();
        boolean z2 = list.size() == 1;
        textViewEZpvd.setVisibility(z2 ? 0 : 8);
        if (z2) {
            textViewEZpvd.setText(((SignalMultiSelectUiModel) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).OLrzqt());
        }
        textViewEZpvd.setTextAppearance(C52761wXj.LoaderManager.QOLQEE);
        int i = C52761wXj.Activity.fdOvFl;
        android.content.Context context3 = textViewEZpvd.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        textViewEZpvd.setTextColor(C25382ivf.copydefault(i, context3));
        ViewGroup.LayoutParams layoutParams2 = textViewEZpvd.getLayoutParams();
        if (layoutParams2 != null) {
            C55296xhK.margin$default(textViewEZpvd, java.lang.Float.valueOf(4.0f), null, null, null, 14, null);
            textViewEZpvd.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void EZpvd(@NotNull C29635kxP c29635kxP) {
        Intrinsics.checkNotNullParameter(c29635kxP, "");
        C54989xbV c54989xbV = EZpvd().AEQbTJ;
        Intrinsics.copydefault(c54989xbV);
        c54989xbV.setVisibility(c29635kxP.AEQbTJ().length() > 0 ? 0 : 8);
        android.widget.TextView textViewEZpvd = c54989xbV.EZpvd();
        textViewEZpvd.setText(c29635kxP.AEQbTJ());
        textViewEZpvd.setTextAppearance(C52761wXj.LoaderManager.QOLQEE);
        textViewEZpvd.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        ViewGroup.LayoutParams layoutParams = textViewEZpvd.getLayoutParams();
        if (layoutParams != null) {
            C55296xhK.margin$default(textViewEZpvd, java.lang.Float.valueOf(4.0f), null, null, null, 14, null);
            textViewEZpvd.setLayoutParams(layoutParams);
            android.widget.ImageView imageViewAEQbTJ = c54989xbV.AEQbTJ();
            boolean z = C33129mqd.OLrzqt((java.lang.CharSequence) c29635kxP.EZpvd()) || c29635kxP.copydefault() != null;
            imageViewAEQbTJ.setVisibility(z ? 0 : 8);
            if (z) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) c29635kxP.EZpvd())) {
                    C33054mpH.AEQbTJ(imageViewAEQbTJ, c29635kxP.EZpvd());
                    return;
                } else {
                    if (c29635kxP.copydefault() != null) {
                        imageViewAEQbTJ.setImageDrawable(c29635kxP.copydefault());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void EZpvd(@NotNull SignalGemsUiSortType signalGemsUiSortType) {
        Intrinsics.checkNotNullParameter(signalGemsUiSortType, "");
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C54989xbV c54989xbV = EZpvd().valueOf;
        android.widget.TextView textViewEZpvd = c54989xbV.EZpvd();
        textViewEZpvd.setText(context.getString(signalGemsUiSortType.getDisplayKey()) + " ");
        textViewEZpvd.setTextAppearance(C52761wXj.LoaderManager.QOLQEE);
        android.widget.ImageView imageViewOLrzqt = c54989xbV.OLrzqt();
        imageViewOLrzqt.setImageResource(C52761wXj.TaskDescription.aPFruk);
        ViewGroup.LayoutParams layoutParams = imageViewOLrzqt.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C55298xhM.KWHzl(12.0f, context);
            layoutParams.height = C55298xhM.KWHzl(12.0f, context);
            imageViewOLrzqt.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void EZpvd(boolean z) {
        android.graphics.drawable.Drawable drawableEZpvd;
        if (z) {
            int i = C52761wXj.TaskDescription.fVBECu;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            drawableEZpvd = C33070mpX.EZpvd(i, context);
        } else {
            int i2 = C52761wXj.TaskDescription.GVpNrs;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawableEZpvd = C33070mpX.EZpvd(i2, context2);
        }
        EZpvd().KWHzl.setImageDrawable(drawableEZpvd);
    }

    public final void copydefault(@NotNull SignalFilterChip signalFilterChip, boolean z) {
        C54989xbV c54989xbV;
        Intrinsics.checkNotNullParameter(signalFilterChip, "");
        int i = Activity.copydefault[signalFilterChip.ordinal()];
        if (i == 1) {
            c54989xbV = EZpvd().copydefault;
        } else if (i == 2) {
            c54989xbV = EZpvd().OLrzqt;
        } else if (i == 3) {
            c54989xbV = EZpvd().AEQbTJ;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            c54989xbV = EZpvd().valueOf;
        }
        Intrinsics.copydefault(c54989xbV);
        android.widget.ImageView imageViewOLrzqt = c54989xbV.OLrzqt();
        if (z) {
            imageViewOLrzqt.setImageResource(C52761wXj.TaskDescription.dUDNAs);
        } else {
            imageViewOLrzqt.setImageResource(C52761wXj.TaskDescription.QSLkRj);
        }
    }

    /* JADX INFO: renamed from: o.kxJ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C29629kxJ EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C29629kxJ c29629kxJ) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c29629kxJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.AEQbTJ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kxJ$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C29629kxJ EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C29629kxJ c29629kxJ) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c29629kxJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.gEmmrt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kxJ$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C29629kxJ EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C29629kxJ c29629kxJ) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c29629kxJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.KWHzl;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kxJ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29629kxJ KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C29629kxJ c29629kxJ) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c29629kxJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.KWHzl.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kxJ$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29629kxJ KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C29629kxJ c29629kxJ) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c29629kxJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.KWHzl.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public final void copydefault(@NotNull SignalTab signalTab) {
        Intrinsics.checkNotNullParameter(signalTab, "");
        boolean z = signalTab == SignalTab.GEMS;
        hEZ hezEZpvd = EZpvd();
        C54989xbV c54989xbV = hezEZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c54989xbV, "");
        c54989xbV.setVisibility(z ? 0 : 8);
        C54989xbV c54989xbV2 = hezEZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c54989xbV2, "");
        boolean z2 = !z;
        c54989xbV2.setVisibility(z2 ? 0 : 8);
        C54989xbV c54989xbV3 = hezEZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c54989xbV3, "");
        c54989xbV3.setVisibility(0);
        C54989xbV c54989xbV4 = hezEZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(c54989xbV4, "");
        c54989xbV4.setVisibility(z ? 0 : 8);
        android.widget.ImageView imageView = hezEZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z2 ? 0 : 8);
    }

    /* JADX INFO: renamed from: o.kxJ$Application */
    public static final class Application extends android.graphics.drawable.Drawable {
        public final int AEQbTJ;
        public final int AhwBna;
        public final int EZpvd;
        public final /* synthetic */ java.util.List<SignalMultiSelectUiModel> KWHzl;
        public final android.graphics.Paint OLrzqt = new android.graphics.Paint(1);
        public final int copydefault;
        public final /* synthetic */ C29629kxJ djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.AhwBna;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public Application(java.util.List<SignalMultiSelectUiModel> list, C29629kxJ c29629kxJ) {
            this.KWHzl = list;
            this.djBIcL = c29629kxJ;
            int iDpInt$default = C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
            this.AEQbTJ = iDpInt$default;
            int iDpInt$default2 = C55298xhM.dpInt$default(2, (android.content.Context) null, 1, (java.lang.Object) null);
            this.EZpvd = iDpInt$default2;
            this.copydefault = C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
            this.AhwBna = (iDpInt$default * list.size()) + (iDpInt$default2 * (list.size() - 1));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "");
            android.graphics.Rect bounds = getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "");
            int iWidth = (bounds.width() - this.AhwBna) / 2;
            float fCenterY = bounds.centerY();
            java.util.List<SignalMultiSelectUiModel> list = this.KWHzl;
            C29629kxJ c29629kxJ = this.djBIcL;
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                int i2 = ((this.AEQbTJ + this.EZpvd) * i) + iWidth;
                float f = fCenterY - (this.copydefault / 2);
                java.lang.Integer numEZpvd = ((SignalMultiSelectUiModel) obj).EZpvd();
                if (numEZpvd != null) {
                    android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c29629kxJ.getContext(), numEZpvd.intValue());
                    if (drawable != null) {
                        drawable.setBounds(i2, (int) f, this.AEQbTJ + i2, (int) (f + this.copydefault));
                    }
                    if (drawable != null) {
                        int i3 = C52761wXj.Activity.fdOvFl;
                        android.content.Context context = c29629kxJ.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        drawable.setTint(C25382ivf.copydefault(i3, context));
                    }
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                }
                i++;
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.OLrzqt.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.OLrzqt.setColorFilter(colorFilter);
        }
    }

    public final android.graphics.drawable.Drawable OLrzqt(java.util.List<SignalMultiSelectUiModel> list) {
        return new Application(list, this);
    }
}
