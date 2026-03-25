package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradeuilib.positions.history_positions.utils.LinearLayoutManagerWrapper;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.data.ItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.C55770xqH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wRm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52602wRm {
    public static final C52602wRm OLrzqt = new C52602wRm();

    private C52602wRm() {
    }

    public static /* synthetic */ void showCustomTips$default(C52602wRm c52602wRm, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 8) != 0) {
            obj = null;
        }
        c52602wRm.AEQbTJ(context, str, str2, obj);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C48033uCm.Activity.fzHEvu, (android.view.ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C48033uCm.Application.MediaBrowserCompatMediaItem1);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(viewInflate.getContext()));
        C59534zip c59534zip = new C59534zip();
        recyclerView.setAdapter(c59534zip);
        c59534zip.register(ItemData.class, new C52489wNh(null, null, null, null, 15, null));
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(12.0f, null, 1, null), 0));
        viewInflate.getRootView().setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.aBDePw));
        C33064mpR.OLrzqt(c59534zip, copydefault(str, str2, obj));
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        Intrinsics.copydefault(viewInflate);
        viewOnClickListenerC54939xaY.OLrzqt(viewInflate, 0);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.trackPipAnimationHintView), new View.OnClickListener() { // from class: o.wRl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52602wRm.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static /* synthetic */ java.util.ArrayList getTips$default(C52602wRm c52602wRm, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return c52602wRm.copydefault(str, str2, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [84=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<ItemData> copydefault(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        java.util.ArrayList<ItemData> arrayList = new java.util.ArrayList<>();
        switch (str2.hashCode()) {
            case -1831183611:
                if (str2.equals("spot_dca")) {
                    DcaTriggerParam dcaTriggerParam = obj instanceof DcaTriggerParam ? (DcaTriggerParam) obj : null;
                    if (Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null), (java.lang.Object) ContractDcaTriggerType.RSI.getMode())) {
                        arrayList.addAll(C56033xvF.EZpvd(dcaTriggerParam.getTimePeriod(), dcaTriggerParam.getTimeframe(), dcaTriggerParam.getTriggerCond(), dcaTriggerParam.getThold()));
                    }
                }
                return arrayList;
            case -1402017003:
                if (str2.equals("contract_dca")) {
                    DcaTriggerParam dcaTriggerParam2 = obj instanceof DcaTriggerParam ? (DcaTriggerParam) obj : null;
                    if (Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam2 != null ? dcaTriggerParam2.getTriggerStrategy() : null), (java.lang.Object) ContractDcaTriggerType.RSI.getMode())) {
                        arrayList.addAll(C56033xvF.EZpvd(dcaTriggerParam2.getTimePeriod(), dcaTriggerParam2.getTimeframe(), dcaTriggerParam2.getTriggerCond(), dcaTriggerParam2.getThold()));
                    }
                }
                return arrayList;
            case -1148661171:
                if (str2.equals("smart_iceberg")) {
                    DcaTriggerParam dcaTriggerParam3 = obj instanceof DcaTriggerParam ? (DcaTriggerParam) obj : null;
                    if (Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam3 != null ? dcaTriggerParam3.getTriggerStrategy() : null), (java.lang.Object) GridStartTriggerType.RSI_14.getMode())) {
                        arrayList.addAll(C56033xvF.EZpvd(dcaTriggerParam3.getTimePeriod(), dcaTriggerParam3.getTimeframe(), dcaTriggerParam3.getTriggerCond(), dcaTriggerParam3.getThold()));
                    }
                }
                return arrayList;
            case -512749997:
                if (str2.equals("contract_grid")) {
                    SignParamItem signParamItem = obj instanceof SignParamItem ? (SignParamItem) obj : null;
                    if (Intrinsics.EZpvd((java.lang.Object) (signParamItem != null ? signParamItem.getIndicator() : null), (java.lang.Object) GridStartTriggerType.RSI_14.getMode())) {
                        arrayList.addAll(C56033xvF.OLrzqt(str, signParamItem.getTimePeriod(), signParamItem.getTimeframe(), signParamItem.getTriggerCond(), signParamItem.getThold(), signParamItem.getDelaySeconds()));
                    }
                }
                return arrayList;
            case 3181382:
                if (str2.equals("grid")) {
                }
                return arrayList;
            default:
                return arrayList;
        }
    }

    public final wYK AEQbTJ(@NotNull android.content.Context context, @androidx.annotation.StringRes int i, @NotNull TextView.BufferType bufferType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bufferType, "");
        wYK wyk = new wYK(context, null, 0, 6, null);
        wyk.setText(i, bufferType);
        return wyk;
    }

    /* JADX INFO: renamed from: o.wRm$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, boolean z, Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = z;
            this.copydefault = function0;
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.EZpvd) {
                    C55326xho.toast$default(C48033uCm.Fragment.DlmWDR, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                } else {
                    this.copydefault.invoke();
                    this.KWHzl.dismiss();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wRm$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = function0;
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
                this.OLrzqt.dismiss();
            }
        }
    }

    public final void KWHzl(@NotNull android.content.Context context, java.lang.String str, java.lang.CharSequence charSequence, kotlin.Pair<? extends android.view.View, java.lang.Integer> pair, java.lang.String str2, @androidx.annotation.ColorInt java.lang.Integer num, java.lang.String str3, @androidx.annotation.ColorInt java.lang.Integer num2, final Function2<? super ViewOnClickListenerC54939xaY, ? super android.view.View, Unit> function2, final Function2<? super ViewOnClickListenerC54939xaY, ? super android.view.View, Unit> function22, java.lang.String str4) {
        android.widget.TextView textViewKWHzl;
        Intrinsics.checkNotNullParameter(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(charSequence);
        if (str2 != null) {
            final Function1 function1 = function2 != null ? new Function1() { // from class: o.wRn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52602wRm.EZpvd(function2, viewOnClickListenerC54939xaY, (android.view.View) obj);
                }
            } : null;
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) str2, function1 != null ? new View.OnClickListener() { // from class: o.wRq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52602wRm.AEQbTJ(function1, view);
                }
            } : null);
        }
        if (pair != null) {
            viewOnClickListenerC54939xaY.OLrzqt(pair.getFirst(), pair.getSecond().intValue());
        }
        if (num != null) {
            viewOnClickListenerC54939xaY.OLrzqt(num.intValue());
        }
        if (str3 != null) {
            final Function1 function12 = function22 != null ? new Function1() { // from class: o.wRo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52602wRm.copydefault(function22, viewOnClickListenerC54939xaY, (android.view.View) obj);
                }
            } : null;
            viewOnClickListenerC54939xaY.EZpvd(str3, function12 != null ? new View.OnClickListener() { // from class: o.wRr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52602wRm.OLrzqt(function12, view);
                }
            } : null);
            if (str4 != null && (textViewKWHzl = viewOnClickListenerC54939xaY.KWHzl()) != null) {
                textViewKWHzl.setContentDescription(str4);
            }
        }
        if (num2 != null) {
            viewOnClickListenerC54939xaY.AEQbTJ(num2.intValue());
        }
        viewOnClickListenerC54939xaY.show();
    }

    public static final Unit EZpvd(Function2 function2, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        function2.invoke(viewOnClickListenerC54939xaY, view);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, android.view.View view) {
        function1.invoke(view);
    }

    public static final Unit copydefault(Function2 function2, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        function2.invoke(viewOnClickListenerC54939xaY, view);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, android.view.View view) {
        function1.invoke(view);
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        java.lang.String strCopydefault = o.TaskDescription.AEQbTJ(str).copydefault();
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strCopydefault.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        int i = C48033uCm.Fragment.DFbvW;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = C56390yDp.OLrzqt("cryptoPair", str);
        pairArr[1] = C56390yDp.OLrzqt("stakeCrypto1", upperCase);
        java.lang.String strKWHzl = C55770xqH.ActionBar.OLrzqt.KWHzl(str);
        if (strKWHzl == null) {
            strKWHzl = "--";
        }
        pairArr[2] = C56390yDp.OLrzqt("stakeCrypto2", strKWHzl);
        java.lang.String strCopydefault2 = C33069mpW.copydefault(i, C56424yEw.AYXKKw(pairArr));
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(C55688xof.Application.Rlayout);
        textView.setTextAppearance(C52761wXj.LoaderManager.zLjUOn);
        textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        C52602wRm c52602wRm = OLrzqt;
        textView.setLayoutParams(c52602wRm.KWHzl());
        C55296xhK.OLrzqt(textView, java.lang.Float.valueOf(24.0f), null, java.lang.Float.valueOf(24.0f), java.lang.Float.valueOf(8.0f));
        ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, textView, 0, 2, null);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setText(strCopydefault2);
        textView2.setTextAppearance(C52761wXj.LoaderManager.valueOf);
        textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
        textView2.setLayoutParams(c52602wRm.KWHzl());
        C55296xhK.OLrzqt(textView2, java.lang.Float.valueOf(24.0f), null, java.lang.Float.valueOf(24.0f), java.lang.Float.valueOf(28.0f));
        ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, textView2, 0, 2, null);
        ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, c52602wRm.OLrzqt(context), 0, 2, null);
        C52794wYp c52794wYpAEQbTJ = c52602wRm.AEQbTJ(context);
        c52794wYpAEQbTJ.setText(C48033uCm.Fragment.apAOXX);
        c52794wYpAEQbTJ.setTextAppearance(C52761wXj.LoaderManager.sSMYrx);
        c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, function02, viewOnClickListenerC54939xaY));
        c52794wYpAEQbTJ.setContentDescription("primaryButton");
        ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, c52794wYpAEQbTJ, 0, 2, null);
        ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, c52602wRm.OLrzqt(context), 0, 2, null);
        C52794wYp c52794wYpAEQbTJ2 = c52602wRm.AEQbTJ(context);
        c52794wYpAEQbTJ2.setText(C48033uCm.Fragment.OEgNct);
        c52794wYpAEQbTJ2.setTextAppearance(C52761wXj.LoaderManager.zuBGHE);
        if (z) {
            c52794wYpAEQbTJ2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        }
        c52794wYpAEQbTJ2.setOnClickListener(new StateListAnimator(c52794wYpAEQbTJ2, 1000L, z, function0, viewOnClickListenerC54939xaY));
        ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, c52794wYpAEQbTJ2, 0, 2, null);
        ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, c52602wRm.OLrzqt(context), 0, 2, null);
        viewOnClickListenerC54939xaY.OLrzqt(C55688xof.Application.OnBackPressedDispatcherKt, new View.OnClickListener() { // from class: o.wRs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52602wRm.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        ViewOnClickListenerC54939xaY.updatePadding$default(viewOnClickListenerC54939xaY, 0, C55298xhM.dpInt$default(28, (android.content.Context) null, 1, (java.lang.Object) null), 0, 0, 13, null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final C52794wYp AEQbTJ(android.content.Context context) {
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        c52794wYp.setOKDSType(49);
        c52794wYp.setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
        C52794wYp.setButtonCornerRadius$default(c52794wYp, 0.0f, 1, null);
        return c52794wYp;
    }

    public final android.view.View OLrzqt(android.content.Context context) {
        android.view.View view = new android.view.View(context);
        view.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.zuBGHE));
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, C55298xhM.dpInt$default(0.5f, (android.content.Context) null, 1, (java.lang.Object) null)));
        return view;
    }

    public final ViewGroup.MarginLayoutParams KWHzl() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }
}
